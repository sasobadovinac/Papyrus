/*****************************************************************************
 * Copyright (c) 2009 CEA LIST & LIFL 
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Cedric Dumoulin  Cedric.dumoulin@lifl.fr - Initial API and implementation
 *
  *****************************************************************************/
package org.eclipse.papyrus.sasheditor.editor;

import java.util.logging.Logger;

import org.eclipse.papyrus.sasheditor.contentprovider.ISashWindowsContentProvider;
import org.eclipse.papyrus.sasheditor.eclipsecopy.IMultiPageEditorPart;
import org.eclipse.papyrus.sasheditor.eclipsecopy.MultiPageSelectionProvider;
import org.eclipse.papyrus.sasheditor.internal.IMultiEditorManager;
import org.eclipse.papyrus.sasheditor.internal.SashWindowsContainer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.internal.util.Util;
import org.eclipse.ui.part.EditorPart;

/**
 * Base editor that can be subclassed to provide a multi page editor with sash windows.
 * 
 * @author dumoulin
 */
public abstract class AbstractMultiPageSashEditor extends EditorPart implements IMultiPageEditorPart, IMultiEditorManager {

	/** Log object */
	protected Logger log = Logger.getLogger(getClass().getName());

	/** The pageProvider */
	private ISashWindowsContentProvider pageProvider;

	/** The sash windows system :-) */
	private SashWindowsContainer sashContainer;

	/**
	 * get the contentProvider. Create it if necessary.
	 * 
	 * @return
	 */
	protected ISashWindowsContentProvider getContentProvider() {
		if (pageProvider == null)
			pageProvider = createPageProvider();

		return pageProvider;
	}

	/**
	 * Set the contentProvider if not set. If it is already set, this method do not change it.
	 * @param contentProvider
	 */
	protected void setContentProvider(ISashWindowsContentProvider contentProvider)
	{
		if (pageProvider == null)
			pageProvider = contentProvider;

	}
	
	/**
	 * Create the provider.
	 * Subclass must implements this method. It should return the provider used by the editor.
	 * 
	 */
	abstract protected ISashWindowsContentProvider createPageProvider();

	/**
	 * Handles a property change notification from a nested editor. The default implementation simply forwards the change to
	 * listeners on this multi-page editor by calling <code>firePropertyChange</code> with the same property id. For example, if
	 * the dirty state of a nested editor changes (property id <code>IEditorPart.PROP_DIRTY</code>), this method handles it
	 * by firing a property change event for <code>IEditorPart.PROP_DIRTY</code> to property listeners on this multi-page
	 * editor.
	 * <p>
	 * Subclasses may extend or reimplement this method.
	 * </p>
	 * 
	 * @copiedfrom org.eclipse.ui.part.MultiPageEditorPart.handlePropertyChange(int)
	 * 
	 * @param propertyId
	 *            the id of the property that changed
	 */
	protected void handlePropertyChange(int propertyId) {
		firePropertyChange(propertyId);
	}

	/**
	 * The <code>MultiPageEditorPart</code> implementation of this <code>IEditorPart</code> method sets its site to the given
	 * site, its input to the given input, and the site's selection provider to a <code>MultiPageSelectionProvider</code>.
	 * Subclasses may extend this method.
	 * 
	 * @copiedfrom org.eclipse.ui.part.MultiPageEditorPart
	 * @param site
	 *            The site for which this part is being created; must not be <code>null</code>.
	 * @param input
	 *            The input on which this editor should be created; must not be <code>null</code>.
	 * @throws PartInitException
	 *             If the initialization of the part fails -- currently never.
	 */
	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
		setSite(site);
		setInput(input);
		site.setSelectionProvider(new MultiPageSelectionProvider(this));
	}

	/**
	 * Create the part controls. {@inheritDoc}
	 */
	@Override
	public void createPartControl(Composite parent) {

		// Create and intialize sash windows
		sashContainer = new SashWindowsContainer(this);
		sashContainer.setContentProvider(getContentProvider());
		sashContainer.createPartControl(parent);
		activate();
	}

	/**
	 * Method to activate the editor. 
	 * Called immediately after createPartControl() is complete.
	 * To be implemented by subclasses. Default implementation do nothing.
	 */
	protected void activate() {
		
	}

	/**
	 * Method to deactivate the editor. 
	 * Called when dispose() is called.
	 * To be implemented by subclasses. Default implementation do nothing.
	 */
	protected void deactivate() {
		
	}

	/**
	 * Dispose the Editor. Also dispose the sashsystem.
	 * @see org.eclipse.ui.part.WorkbenchPart#dispose()
	 *
	 */
	@Override
	public void dispose() {
		deactivate();
		super.dispose();
//		sashContainer.dispose();
	}
	/**
	 * Refresh the sash windows system
	 */
	protected void refreshTabs() {
		if (sashContainer != null)
			sashContainer.refreshTabs();

	}

	/**
	 * If there is an adapter registered against the subclass of MultiPageEditorPart return that. Otherwise, delegate to the
	 * internal editor.
	 * 
	 * @copiedfrom org.eclipse.ui.part.MultiPageEditorPart
	 * 
	 * @see org.eclipse.ui.part.WorkbenchPart#getAdapter(java.lang.Class)
	 */
	public Object getAdapter(Class adapter) {

		// Get the content provider if requested.
		if (ISashWindowsContentProvider.class == adapter)
			return getContentProvider();

		// Look in hierarchy
		Object result = super.getAdapter(adapter);
		// restrict delegating to the UI thread for bug 144851
		if (result == null && Display.getCurrent() != null) {
			IEditorPart innerEditor = getActiveEditor();
			// see bug 138823 - prevent some subclasses from causing
			// an infinite loop
			if (innerEditor != null && innerEditor != this) {
				result = Util.getAdapter(innerEditor, adapter);
			}
		}
		return result;
	}

	/**
	 * Needed by MultiPageActionBarContributor and MultiPageSelectionProvider.
	 */
	public IEditorPart getActiveEditor() {
		return sashContainer.getActiveEditor();
	}

	/**
	 * 
	 * {@inheritDoc}
	 */
	@Override
	public void setFocus() {
		sashContainer.setFocus();

	}
}
