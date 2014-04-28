/*
 * Copyright (c) 2014 CEA and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus (CEA) - Initial API and implementation
 *
 */
package org.eclipse.papyrus.infra.tools.util;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.eclipse.swt.widgets.Display;


/**
 * Miscellaneous general-purpose UI utilities.
 */
public class UIUtil {

	/**
	 * Not instantiable by clients.
	 */
	private UIUtil() {
		super();
	}

	/**
	 * Create an executor that runs tasks asynchronously on the UI thread. If you need synchronous execution, schedule {@link Future}s and
	 * {@linkplain Future#get() wait} for them.
	 * 
	 * @param display
	 *        the display on which thread to execute tasks
	 * 
	 * @return the executor
	 */
	public static ExecutorService createUIExecutor(Display display) {
		return new UIExecutorService(display);
	}

	//
	// Nested types
	//

	private static class UIExecutorService extends AbstractExecutorService {

		private final Lock lock = new ReentrantLock();

		private final Condition emptyCond = lock.newCondition();

		private final Queue<RunnableWrapper> pending = new LinkedList<RunnableWrapper>();

		private final Display display;

		private volatile boolean shutdown;

		UIExecutorService(Display display) {
			this.display = display;
		}

		public void execute(Runnable command) {
			if(isShutdown()) {
				throw new RejectedExecutionException("Executor service is shut down"); //$NON-NLS-1$
			}

			display.asyncExec(enqueue(command));
		}

		public List<Runnable> shutdownNow() {
			List<Runnable> result = new ArrayList<Runnable>();

			shutdown();

			for(Runnable dequeued = dequeue(); dequeued != null; dequeued = dequeue()) {
				result.add(dequeued);
			}

			return result;
		}

		private RunnableWrapper enqueue(Runnable task) {
			RunnableWrapper result = new RunnableWrapper(task);

			lock.lock();
			try {
				boolean wasEmpty = pending.isEmpty();
				pending.offer(result);
				if(wasEmpty) {
					// Now not empty
					emptyCond.signalAll();
				}
			} finally {
				lock.unlock();
			}

			return result;
		}

		private RunnableWrapper dequeue() {
			RunnableWrapper result = null;

			lock.lock();
			try {
				result = pending.poll();
				if(result == null) {
					// Now empty
					emptyCond.signalAll();
				}
			} finally {
				lock.unlock();
			}

			return result;
		}

		boolean dequeue(RunnableWrapper task) {
			boolean result = false;

			lock.lock();
			try {
				result = pending.remove(task);
				if(result && pending.isEmpty()) {
					// Now empty
					emptyCond.signalAll();
				}
			} finally {
				lock.unlock();
			}

			return result;
		}

		public void shutdown() {
			shutdown = true;
		}

		public boolean isTerminated() {
			lock.lock();
			try {
				return isShutdown() && pending.isEmpty();
			} finally {
				lock.unlock();
			}
		}

		public boolean isShutdown() {
			return shutdown;
		}

		public boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
			if(timeout < 0L) {
				throw new IllegalArgumentException("negative timeout"); //$NON-NLS-1$
			}

			final Date deadline = (timeout == 0L) ? null : new Date(System.currentTimeMillis() + unit.toMillis(timeout));
			boolean result = false;

			lock.lock();
			try {
				boolean stillWaiting = true;
				for(result = isTerminated(); !result && stillWaiting; result = isTerminated()) {
					if(deadline == null) {
						emptyCond.await();
					} else {
						stillWaiting = emptyCond.awaitUntil(deadline);
					}
				}
			} finally {
				lock.unlock();
			}

			return result;
		}

		//
		// Nested types
		//

		private class RunnableWrapper implements Runnable {

			private final Runnable delegate;

			RunnableWrapper(Runnable delegate) {
				this.delegate = delegate;
			}

			public void run() {
				// Don't run if I was cancelled by shutdown
				if(dequeue(this)) {
					delegate.run();
				}
			}
		}
	};
}
