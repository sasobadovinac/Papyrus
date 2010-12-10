/*****************************************************************************
 * Copyright (c) 2010 CEA LIST.
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.editors;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.LinkedList;

import org.eclipse.core.runtime.Assert;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.papyrus.editors.messages.Messages;
import org.eclipse.papyrus.editors.providers.CollectionContentProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.SelectionDialog;

/**
 * Object Chooser. Defines a standard popup for selecting
 * multiple values.
 * 
 * @author Camille Letavernier
 * 
 */
public class MultipleValueSelectorDialog extends SelectionDialog implements SelectionListener {

	/**
	 * The object selector
	 */
	protected IElementSelector selector;

	/**
	 * The SWT Composite in which the selector is drawn
	 */
	protected Composite selectorSection;

	/**
	 * The add/remove/addAll buttons section
	 */
	protected Composite buttonsSection;

	/**
	 * The up/down buttons section
	 */
	protected Composite rightButtonsSection;

	/**
	 * The listViewer for chosen elements
	 */
	protected ListViewer selectedElementsViewer;

	/**
	 * The list for chosen elements
	 */
	protected List selectedElements;

	/**
	 * The add action button
	 */
	protected Button add;

	/**
	 * The remove action button
	 */
	protected Button remove;

	/**
	 * The add all action button
	 */
	protected Button addAll;

	/**
	 * The remove all action button
	 */
	protected Button removeAll;

	/**
	 * the up action button
	 */
	protected Button up;

	/**
	 * the down action button
	 */
	protected Button down;

	/**
	 * The label provider for the listViewer of chosen elements
	 */
	protected ILabelProvider labelProvider;

	/**
	 * The currently chosen elements
	 */
	protected final Collection<Object> allElements;

	/**
	 * Indicates if the values should be unique (according to Object.equals())
	 */
	protected boolean unique;

	/**
	 * Constructor.
	 * 
	 * @param parentShell
	 *        The shell in which this dialog should be opened
	 * @param selector
	 *        The element selector used by this dialog
	 */
	public MultipleValueSelectorDialog(Shell parentShell, IElementSelector selector) {
		this(parentShell, selector, null, false);
	}

	/**
	 * Constructor.
	 * 
	 * @param parentShell
	 *        The shell in which this dialog should be opened
	 * @param selector
	 *        The element selector used by this dialog
	 * @param title
	 *        The title of this dialog
	 */
	public MultipleValueSelectorDialog(Shell parentShell, IElementSelector selector, String title) {
		this(parentShell, selector, title, false);
	}

	/**
	 * 
	 * Constructor.
	 * 
	 * @param parentShell
	 *        The shell in which this dialog should be opened
	 * @param selector
	 *        The element selector used by this dialog
	 * @param unique
	 *        True if the values returned by this dialog should be unique
	 */
	public MultipleValueSelectorDialog(Shell parentShell, IElementSelector selector, boolean unique) {
		this(parentShell, selector, null, unique);
	}

	/**
	 * 
	 * Constructor.
	 * 
	 * @param parentShell
	 *        The shell in which this dialog should be opened
	 * @param selector
	 *        The element selector used by this dialog
	 * @param title
	 *        The title of this dialog
	 * @param unique
	 *        True if the values returned by this dialog should be unique
	 */
	public MultipleValueSelectorDialog(Shell parentShell, IElementSelector selector, String title, boolean unique) {
		super(parentShell);
		Assert.isNotNull(selector, "The element selector should be defined"); //$NON-NLS-1$
		this.selector = selector;
		allElements = unique ? new LinkedHashSet<Object>() : new LinkedList<Object>();
		setHelpAvailable(false);
		setTitle(title);
		this.unique = unique;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void create() {
		super.create();

		Composite parent = getDialogArea();
		GridLayout layout = (GridLayout)parent.getLayout();
		layout.numColumns = 4;
		layout.makeColumnsEqualWidth = false;

		createSelectorSection(parent);
		createControlsSection(parent);
		createListSection(parent);
		createRightButtonsSection(parent);

		getShell().setSize(400, 300);
		getShell().layout();

		setResult(new LinkedList<Object>(allElements));

		super.getShell().setImage(Activator.getImage("/icons/papyrus.png"));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Composite getDialogArea() {
		return (Composite)super.getDialogArea();
	}

	/**
	 * Creates the selector section
	 * 
	 * @param parent
	 *        The composite in which the section is created
	 */
	private void createSelectorSection(Composite parent) {
		selectorSection = new Composite(parent, SWT.NONE);
		selectorSection.setLayout(new FillLayout());
		selectorSection.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		selector.createControls(selectorSection);
	}

	/**
	 * Creates the main controls section (Add, remove, Add all, remove all)
	 * 
	 * @param parent
	 *        The composite in which the section is created
	 */
	private void createControlsSection(Composite parent) {
		buttonsSection = new Composite(parent, SWT.NONE);
		buttonsSection.setLayout(new GridLayout(1, true));

		add = new Button(buttonsSection, SWT.PUSH);
		add.setImage(Activator.getImage("/icons/arrow_right.gif")); //$NON-NLS-1$
		add.addSelectionListener(this);
		add.setToolTipText(Messages.MultipleValueSelectorDialog_AddSelectedElements);

		remove = new Button(buttonsSection, SWT.PUSH);
		remove.setImage(Activator.getImage("/icons/arrow_left.gif")); //$NON-NLS-1$
		remove.addSelectionListener(this);
		remove.setToolTipText(Messages.MultipleValueEditor_RemoveSelectedElements);

		addAll = new Button(buttonsSection, SWT.PUSH);
		addAll.setImage(Activator.getImage("/icons/arrow_double.gif")); //$NON-NLS-1$
		addAll.addSelectionListener(this);
		addAll.setToolTipText(Messages.MultipleValueSelectorDialog_AddAllElements);

		removeAll = new Button(buttonsSection, SWT.PUSH);
		removeAll.setImage(Activator.getImage("/icons/arrow_left_double.gif")); //$NON-NLS-1$
		removeAll.addSelectionListener(this);
		removeAll.setToolTipText(Messages.MultipleValueSelectorDialog_RemoveAllElements);
	}

	/**
	 * Creates the list displaying the currently selected elements
	 * 
	 * @param parent
	 *        The composite in which the section is created
	 */
	private void createListSection(Composite parent) {

		selectedElements = new List(parent, SWT.MULTI | SWT.BORDER | SWT.V_SCROLL | SWT.H_SCROLL);
		GridData data = new GridData(SWT.FILL, SWT.FILL, true, true);
		selectedElements.setLayoutData(data);
		selectedElementsViewer = new ListViewer(selectedElements);

		selectedElementsViewer.setContentProvider(new CollectionContentProvider());

		if(labelProvider != null)
			selectedElementsViewer.setLabelProvider(labelProvider);

		selectedElementsViewer.setInput(allElements);
		selector.setSelectedElements(allElements.toArray());
	}

	/**
	 * Creates the up/down controls section
	 * 
	 * @param parent
	 *        The composite in which the section is created
	 */
	private void createRightButtonsSection(Composite parent) {
		rightButtonsSection = new Composite(parent, SWT.NONE);
		rightButtonsSection.setLayout(new GridLayout(1, true));

		up = new Button(rightButtonsSection, SWT.PUSH);
		up.setImage(Activator.getImage("/icons/Up_12x12.gif")); //$NON-NLS-1$
		up.addSelectionListener(this);
		up.setToolTipText(Messages.MultipleValueEditor_MoveSelectedElementsUp);

		down = new Button(rightButtonsSection, SWT.PUSH);
		down.setImage(Activator.getImage("/icons/Down_12x12.gif")); //$NON-NLS-1$
		down.addSelectionListener(this);
		down.setToolTipText(Messages.MultipleValueEditor_MoveSelectedElementsDown);
	}

	/**
	 * Sets the label provider used to display the selected elements
	 * 
	 * @param labelProvider
	 */
	public void setLabelProvider(ILabelProvider labelProvider) {
		this.labelProvider = labelProvider;
	}

	/**
	 * {@inheritDoc} Handles the events on one of the control buttons
	 * 
	 * @see org.eclipse.swt.events.SelectionListener#widgetSelected(org.eclipse.swt.events.SelectionEvent)
	 * 
	 * @param e
	 *        The event that occurred
	 */
	public void widgetSelected(SelectionEvent e) {
		if(e.widget == add) {
			addAction();
		} else if(e.widget == remove) {
			removeAction();
		} else if(e.widget == addAll) {
			addAllAction();
		} else if(e.widget == removeAll) {
			removeAllAction();
		} else if(e.widget == up) {
			upAction();
		} else if(e.widget == down) {
			downAction();
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@SuppressWarnings("unchecked")
	@Override
	public int open() {
		allElements.clear();
		allElements.addAll(getInitialElementSelections());
		return super.open();
	}

	/**
	 * Handles the "Add" action
	 */
	protected void addAction() {
		Object[] elements = selector.getSelectedElements();
		addElements(elements);
	}

	/**
	 * Handles the "Up" action
	 */
	protected void upAction() {
		IStructuredSelection selection = (IStructuredSelection)selectedElementsViewer.getSelection();

		//We need a list to move objects. LinkedHashSet can't do that
		java.util.List<Object> list = new LinkedList<Object>(allElements);
		for(Object o : selection.toArray()) {
			int oldIndex = list.indexOf(o);
			if(oldIndex > 0)
				move(list, oldIndex, oldIndex - 1);
		}

		allElements.clear();
		allElements.addAll(list);

		IStructuredSelection selectionCopy = new StructuredSelection(selection.toArray());
		selectedElementsViewer.setSelection(selectionCopy);
		selectedElementsViewer.refresh();
	}

	/**
	 * Handles the "Down" action
	 */
	protected void downAction() {
		IStructuredSelection selection = (IStructuredSelection)selectedElementsViewer.getSelection();

		//We need a list to move objects. LinkedHashSet can't do that
		java.util.List<Object> list = new LinkedList<Object>(allElements);

		int maxIndex = list.size() - 1;

		Object[] selectionArray = selection.toArray();
		for(int i = selectionArray.length - 1; i >= 0; i--) {
			Object o = selectionArray[i];
			int oldIndex = list.indexOf(o);
			if(oldIndex < maxIndex)
				move(list, oldIndex, oldIndex + 1);
		}

		allElements.clear();
		allElements.addAll(list);

		IStructuredSelection selectionCopy = new StructuredSelection(selection.toArray());
		selectedElementsViewer.setSelection(selectionCopy);
		selectedElementsViewer.refresh();
	}

	/**
	 * Moves an element from oldIndex to newIndex
	 * 
	 * @param list
	 *        The list in which to move the object
	 * @param oldIndex
	 * @param newIndex
	 */
	private void move(java.util.List<Object> list, int oldIndex, int newIndex) {
		int size = list.size();

		if(oldIndex < 0 || oldIndex >= size)
			throw new IndexOutOfBoundsException("oldIndex: " + oldIndex + ", size:" + size); //$NON-NLS-1$ //$NON-NLS-2$
		if(newIndex < 0 || newIndex >= size)
			throw new IndexOutOfBoundsException("newIndex: " + newIndex + ", size:" + size); //$NON-NLS-1$ //$NON-NLS-2$
		Object element = list.remove(oldIndex);
		list.add(newIndex, element);;
	}

	/**
	 * Handles the "Remove" action
	 */
	protected void removeAction() {
		IStructuredSelection selection = (IStructuredSelection)selectedElementsViewer.getSelection();
		if(selection.isEmpty())
			return;

		for(Object element : selection.toArray()) {
			allElements.remove(element);
		}

		selector.setSelectedElements(allElements.toArray());
		selectedElementsViewer.setSelection(null);
		selectedElementsViewer.refresh();

		setResult(new LinkedList<Object>(allElements));
	}

	/**
	 * Handles the "Remove all" action
	 */
	protected void removeAllAction() {
		allElements.clear();
		selector.setSelectedElements(new Object[0]);
		setResult(new LinkedList<Object>());
		selectedElementsViewer.setSelection(null);
		selectedElementsViewer.refresh();
	}

	/**
	 * Handles the "Add All" action
	 */
	protected void addAllAction() {
		Object[] elements = selector.getAllElements();
		addElements(elements);
	}

	/**
	 * Adds the specified elements to the currently selected elements (For
	 * "Add" and "Add all" actions)
	 * 
	 * @param elements
	 *        The elements to be added
	 */
	private void addElements(Object[] elements) {
		if(elements != null) {
			allElements.addAll(Arrays.asList(elements));
			selectedElementsViewer.refresh();

			setResult(new LinkedList<Object>(allElements));
		}
	}

	/**
	 * Ignored
	 */
	public void widgetDefaultSelected(SelectionEvent e) {
		//Nothing
	}

	/**
	 * Indicates if the selected values should be unique (According to Object.equals())
	 * 
	 * @param unique
	 */
	public void setUnique(boolean unique) {
		this.unique = unique;
	}

	/**
	 * Indicates if the selected elements should be ordered
	 * 
	 * @param ordered
	 */
	public void setOrdered(boolean ordered) {
		if(ordered && rightButtonsSection == null) {
			createRightButtonsSection(getDialogArea());
		}
	}
}
