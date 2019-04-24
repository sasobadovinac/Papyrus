/*****************************************************************************
 * Copyright (c) 2019 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   Nicolas FAUVERGUE (CEA LIST) nicolas.fauvergue@cea.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.infra.core.sasheditor.internal.dnd;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.jface.util.Geometry;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Tracker;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.internal.DragCursors;

/**
 * This allows to manage the drag actions with drag targets.
 */
public class DragManager {

	/**
	 * The drag target ID.
	 */
	private static final String DROP_TARGET_ID = "org.eclipse.ui.internal.dnd.dropTarget"; //$NON-NLS-1$

	/**
	 * The singleton instance.
	 */
	private static DragManager instance;

	/**
	 * Private constructor to avoid instanciation.
	 */
	private DragManager() {
		// do nothing
	}

	/**
	 * Get the singleton instance.
	 *
	 * @return The singleton instance.
	 */
	public static DragManager getInstance() {
		if (null == instance) {
			instance = new DragManager();
		}
		return instance;
	}

	/**
	 * List of IDragOverListener
	 */
	private List<IDragOverListener> defaultTargets = new ArrayList<>();

	/**
	 * Sets the drop target for the given control. It is possible to add one or more targets for a "null" control. This becomes a default target that is used if no other targets are found (for example, when dragging objects off the application window).
	 *
	 * @param control
	 *            The control that should be treated as a drag target, or null to indicate the default target.
	 * @param target
	 *            The drag target to handle the given control.
	 */
	public void addDragTarget(final Control control, final IDragOverListener target) {
		if (control == null) {
			defaultTargets.add(target);
		} else {
			List<IDragOverListener> targetList = getTargetList(control);

			if (targetList == null) {
				targetList = new ArrayList<>(1);
			}
			targetList.add(target);
			control.setData(DROP_TARGET_ID, targetList);
		}
	}

	/**
	 * Return the list of 'IDragOverListener' elements associated with the given control. If there's a 'global' listener then always return it.
	 *
	 * @param control
	 *            The control that should be treated as a drag target, or null to indicate the default target.
	 * @return The list of 'IDragOverListener' elements associated with the given control.
	 */
	@SuppressWarnings("unchecked")
	private List<IDragOverListener> getTargetList(final Control control) {
		return (List<IDragOverListener>) control.getData(DROP_TARGET_ID);
	}

	/**
	 * Removes a drop target from the given control.
	 *
	 * @param control
	 *            The control that should be treated as a drag target, or null to indicate the default target.
	 * @param target
	 *            The drag target to handle the given control.
	 */
	public void removeDragTarget(final Control control, final IDragOverListener target) {
		if (control == null) {
			defaultTargets.remove(target);
		} else {
			final List<IDragOverListener> targetList = getTargetList(control);
			if (targetList != null) {
				targetList.remove(target);
				if (targetList.isEmpty()) {
					control.setData(DROP_TARGET_ID, null);
				}
			}
		}
	}

	/**
	 * This allows to perform the drag of the needed item.
	 *
	 * @param draggedItem
	 *            The object being dragged.
	 * @param sourceBounds
	 *            initial bounding rectangle for the dragged item.
	 * @param initialLocation
	 *            initial position of the mouse cursor.
	 * @param allowSnapping
	 *            <code>true</code> if the rectangle should snap to the drop location. This must be <code>false</code> if the user might be doing drag-and-drop using the keyboard.
	 * @return <code>true</code> if the drag was correctly done, <code>false</code> otherwise.
	 */
	public boolean performDrag(final Object draggedItem, final Rectangle sourceBounds, final Point initialLocation, final boolean allowSnapping) {

		final IDropTarget target = dragToTarget(draggedItem, sourceBounds, initialLocation, allowSnapping);
		if (target == null) {
			return false;
		}

		target.drop();

		return true;
	}

	/**
	 * Drags the given item, given an initial bounding rectangle in display coordinates.
	 * Due to a quirk in the Tracker class, changing the tracking rectangle when using the keyboard will also cause the mouse cursor to move. Since "snapping" causes the tracking rectangle to change based on the position of the mouse cursor, it is impossible
	 * to do drag-and-drop with the keyboard when snapping is enabled.
	 *
	 * @param draggedItem
	 *            The object being dragged.
	 * @param sourceBounds
	 *            initial bounding rectangle for the dragged item.
	 * @param initialLocation
	 *            initial position of the mouse cursor.
	 * @param allowSnapping
	 *            <code>true</code> if the rectangle should snap to the drop location. This must be <code>false</code> if the user might be doing drag-and-drop using the keyboard.
	 * @return <code>true</code> if the drag was correctly done, <code>false</code> otherwise.
	 */
	private IDropTarget dragToTarget(final Object draggedItem, final Rectangle sourceBounds, final Point initialLocation, final boolean allowSnapping) {
		final Display display = Display.getCurrent();

		// Create a tracker. This is just an XOR rect on the screen.
		// As it moves we notify the drag listeners.
		final Tracker tracker = new Tracker(display, SWT.NULL);
		tracker.setStippled(true);

		tracker.addListener(SWT.Move, event -> display.syncExec(() -> {
			// Get the curslor location as a point
			Point location = new Point(event.x, event.y);

			// Select a drop target; use the global one by default
			IDropTarget target = null;

			Control targetControl = display.getCursorControl();

			// Get the drop target for this location
			target = getDropTarget(targetControl, draggedItem, location, tracker.getRectangles()[0]);

			// Set up the tracker feedback based on the target
			Rectangle snapTarget = null;
			if (target != null) {
				snapTarget = target.getSnapRectangle();
				tracker.setCursor(target.getCursor());
			} else {
				tracker.setCursor(DragCursors.getCursor(DragCursors.INVALID));
			}

			// If snapping then reset the tracker's rectangle based on the current drop target
			if (allowSnapping) {
				if (snapTarget == null) {
					snapTarget = new Rectangle(sourceBounds.x + location.x - initialLocation.x, sourceBounds.y + location.y - initialLocation.y, sourceBounds.width, sourceBounds.height);
				}

				// Try to prevent flicker: don't change the rectangles if they're already in
				// the right location
				Rectangle[] currentRectangles = tracker.getRectangles();

				if (!(currentRectangles.length == 1 && currentRectangles[0].equals(snapTarget))) {
					tracker.setRectangles(new Rectangle[] { Geometry.copy(snapTarget) });
				}
			}
		}));

		// Setup...when the drag starts we might already be over a valid target, check this...
		// If there is a 'global' target then skip the check
		IDropTarget target = null;
		Control startControl = display.getCursorControl();

		if (startControl != null && allowSnapping) {
			target = getDropTarget(startControl, draggedItem, initialLocation, sourceBounds);
		}

		// Set up an initial tracker rectangle
		Rectangle startRect = sourceBounds;
		if (target != null) {
			Rectangle rect = target.getSnapRectangle();

			if (rect != null) {
				startRect = rect;
			}

			tracker.setCursor(target.getCursor());
		}

		if (startRect != null) {
			tracker.setRectangles(new Rectangle[] { Geometry.copy(startRect) });
		}

		// Tracking Loop...tracking is preformed on the 'SWT.Move' listener registered
		// against the tracker.

		// HACK:
		// Some control needs to capture the mouse during the drag or other
		// controls will interfere with the cursor
		Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		if (shell != null) {
			shell.setCapture(true);
		}

		// Run tracker until mouse up occurs or escape key pressed.
		boolean trackingOk = tracker.open();

		// HACK:
		// Release the mouse now
		if (shell != null) {
			shell.setCapture(false);
		}

		// Done tracking...

		// Get the current drop target
		IDropTarget dropTarget = null;
		Point finalLocation = display.getCursorLocation();
		Control targetControl = display.getCursorControl();
		dropTarget = getDropTarget(targetControl, draggedItem, finalLocation, tracker.getRectangles()[0]);

		// Cleanup...
		tracker.dispose();

		// if we're going to perform a 'drop' then delay the issuing of the 'finished'
		// callback until after it's done...
		if (trackingOk) {
			return dropTarget;
		}

		return null;
	}

	/**
	 * Given a list of IDragOverListeners and a description of what is being dragged, it returns
	 * a IDropTarget for the current drop.
	 *
	 * @param toSearch
	 *            The listener to search.
	 * @param mostSpecificControl
	 *            The control.
	 * @param draggedObject
	 *            The dragged object.
	 * @param position
	 *            The initial position of the object to drag.
	 * @param dragRectangle
	 *            The dimension of the drag action.
	 * @return The drop target corresponding to the position of the drop.
	 */
	private IDropTarget getDropTarget(final List<IDragOverListener> toSearch, final Control mostSpecificControl, final Object draggedObject, final Point position, final Rectangle dragRectangle) {
		if (toSearch == null) {
			return null;
		}

		final Iterator<IDragOverListener> iter = toSearch.iterator();
		while (iter.hasNext()) {
			final IDragOverListener next = iter.next();
			final IDropTarget dropTarget = next.drag(mostSpecificControl, draggedObject, position, dragRectangle);

			if (dropTarget != null) {
				return dropTarget;
			}
		}

		return null;
	}

	/**
	 * Returns the drag target for the given control or null if none.
	 *
	 * @param toSearch
	 *            The listener to search.
	 * @param draggedObject
	 *            The dragged object.
	 * @param position
	 *            The initial position of the object to drag.
	 * @param dragRectangle
	 *            The dimension of the drag action.
	 * @return The drop target corresponding to the position of the drop.
	 */
	public IDropTarget getDropTarget(final Control toSearch, final Object draggedObject, final Point position, final Rectangle dragRectangle) {
		// Search for a listener by walking the control's parent hierarchy
		for (Control current = toSearch; current != null; current = current.getParent()) {
			final IDropTarget dropTarget = getDropTarget(getTargetList(current), toSearch, draggedObject, position, dragRectangle);

			if (dropTarget != null) {
				return dropTarget;
			}

			// Don't look to parent shells for drop targets
			if (current instanceof Shell) {
				break;
			}
		}

		// No controls could handle this event -- check for default targets
		return getDropTarget(defaultTargets, toSearch, draggedObject, position, dragRectangle);
	}
}
