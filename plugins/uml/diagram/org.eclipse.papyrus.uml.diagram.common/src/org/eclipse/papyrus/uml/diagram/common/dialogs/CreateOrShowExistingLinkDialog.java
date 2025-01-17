/*****************************************************************************
 * Copyright (c) 2013 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *  Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *  Fanch Bonnabesse (ALL4TEC) fanch.bonnabesse@alltec.net - Bug 419357
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.common.dialogs;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.CheckboxCellEditor;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.ViewerColumn;
import org.eclipse.papyrus.infra.gmfdiag.common.preferences.PreferencesConstantsHelper;
import org.eclipse.papyrus.infra.widgets.Activator;
import org.eclipse.papyrus.uml.diagram.common.messages.Messages;
import org.eclipse.papyrus.uml.diagram.common.util.LinkEndsMapper;
import org.eclipse.papyrus.uml.tools.providers.UMLLabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;



/**
 * This dialog is used to ask to the user if he wants create a new instance of a link, or show an existing link on the diagram
 *
 * @author Vincent Lorenzo
 *
 */
public class CreateOrShowExistingLinkDialog extends MessageDialog {

	/**
	 * indexes of the button
	 */
	public static final int CREATE = Dialog.OK;
	public static final int RESTORE_SELECTED_LINK = CREATE + 1;
	public static final int CANCEL = RESTORE_SELECTED_LINK + 1;

	/**
	 * title for the dialog
	 */
	public static final String DIALOG_TITLE = Messages.CreateOrShowExistingLinkDialog_ShowOrCreate;

	/**
	 * Message for the Buttons
	 */
	private static final String CREATE_STRING = Messages.CreateOrShowExistingLinkDialog_Create;
	private static final String RESTORE_SELECTION = Messages.CreateOrShowExistingLinkDialog_RestoreSelection;
	private static final String CANCEL_STRING = "Cancel"; //$NON-NLS-1$


	/**
	 * Titles for the columns
	 */
	private static final String NAME = Messages.CreateOrShowExistingLinkDialog_Name;
	private static final String ENDS = Messages.CreateOrShowExistingLinkDialog_Ends;
	private static final String SOURCES = Messages.CreateOrShowExistingLinkDialog_Sources;
	private static final String TARGETS = Messages.CreateOrShowExistingLinkDialog_Targets;
	private static final String CHECKBOX_LABEL = Messages.CreateOrShowExistingElementHelper_AlwaysCreateNewLink;

	/**
	 * Size for the columns
	 */
	private static final int COLUMN_NAME_SIZE = 150;
	private static final int COLUMN_SIZE = 200;

	/**
	 * the list of the elements to display in the Table
	 */
	private final List<LinkEndsMapper> existingLinks;

	final UMLLabelProvider labelProvider = new UMLLabelProvider();

	/**
	 * the string displayed when there is no value to display
	 */
	private static final String NOT_AVAILABLE = "N/A"; //$NON-NLS-1$

	/**
	 * the image to display when the link is selected
	 */
	private static final String CHECKED_ICON_PATH = "icons/checkedRadioButton.gif"; //$NON-NLS-1$

	/**
	 * the image to display when the link is not selected
	 */
	private static final String UNCHECKED_ICON_PATH = "icons/uncheckedRadioButton.gif"; //$NON-NLS-1$

	/**
	 * the index of the selected element
	 */
	private int selectedElementIndex = 0;

	/**
	 * the selected element
	 */
	private EObject result = null;

	/**
	 * The value of the toggle button of the dialog.
	 */
	private boolean toggleState = false;

	/**
	 *
	 * Constructor.
	 *
	 * @param dialogTitle
	 *            the title for the dialog
	 * @param dialogMessage
	 *            the message for the dialog
	 * @param elements
	 *            the list of the possible elements
	 */
	public CreateOrShowExistingLinkDialog(final String dialogTitle, final String dialogMessage, final List<LinkEndsMapper> elements) {
		super(Display.getDefault().getActiveShell(), dialogTitle, null, dialogMessage, MessageDialog.QUESTION, new String[] { CREATE_STRING, RESTORE_SELECTION, CANCEL_STRING }, RESTORE_SELECTED_LINK);
		this.existingLinks = elements;
	}

	/**
	 * Constructor.
	 *
	 * @param title
	 * @param bound
	 * @param viewer
	 * @return
	 */
	private TableViewerColumn createTableViewerColumn(final String title, final int bound, final TableViewer viewer) {
		final TableViewerColumn viewerColumn = new TableViewerColumn(viewer, SWT.NONE);
		final TableColumn column = viewerColumn.getColumn();
		column.setText(title);
		column.setWidth(bound);
		column.setResizable(false);
		column.setMoveable(false);
		return viewerColumn;
	}

	/**
	 *
	 * @see org.eclipse.jface.dialogs.MessageDialog#createCustomArea(org.eclipse.swt.widgets.Composite)
	 *
	 * @param parent
	 * @return
	 */
	@Override
	protected Control createCustomArea(final Composite parent) {
		final Composite composite = parent;
		final TableViewer viewer = new TableViewer(composite, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION | SWT.BORDER);
		viewer.setContentProvider(new ArrayContentProvider());
		final Table table = viewer.getTable();
		table.setHeaderVisible(true);

		ViewerColumn colCheckbox = createTableViewerColumn("", 20, viewer); //$NON-NLS-1$
		colCheckbox.setLabelProvider(new ColumnLabelProvider() {

			@Override
			public String getText(Object element) {
				return ""; //$NON-NLS-1$
			}

			@Override
			public Image getImage(Object element) {
				if (existingLinks.get(selectedElementIndex) == element) {
					return Activator.getDefault().getImage(org.eclipse.papyrus.uml.diagram.common.Activator.ID, CHECKED_ICON_PATH);
				}
				return Activator.getDefault().getImage(org.eclipse.papyrus.uml.diagram.common.Activator.ID, UNCHECKED_ICON_PATH);
			}

		});
		colCheckbox.setEditingSupport(new EditingSupport(viewer) {

			private CheckboxCellEditor checkboxCellEditor;

			@Override
			protected void setValue(Object element, Object value) {
				if (checkboxCellEditor.getValue() == Boolean.TRUE) {
					selectedElementIndex = existingLinks.indexOf(element);
				}
				for (final LinkEndsMapper current : existingLinks) {
					viewer.update(current, null);
				}
			}

			@Override
			protected Object getValue(Object element) {
				return existingLinks.get(selectedElementIndex) == element;
			}

			@Override
			protected CellEditor getCellEditor(Object element) {
				checkboxCellEditor = new CheckboxCellEditor(parent, SWT.CHECK | SWT.READ_ONLY);
				return checkboxCellEditor;
			}

			@Override
			protected boolean canEdit(Object element) {
				return true;
			}
		});
		TableViewerColumn columnName = createTableViewerColumn(NAME, COLUMN_NAME_SIZE, viewer);
		configureColumn(columnName);
		columnName.setLabelProvider(new ColumnLabelProvider() {

			@Override
			public String getText(Object element) {
				if (element instanceof LinkEndsMapper) {
					return labelProvider.getText(((LinkEndsMapper) element).getLink());
				}
				// not possible
				return NOT_AVAILABLE;
			}

			@Override
			public Image getImage(Object element) {
				return null;
			}


		});

		TableViewerColumn columnEnds = createTableViewerColumn(ENDS, COLUMN_SIZE, viewer);
		configureColumn(columnEnds);
		columnEnds.setLabelProvider(new ColumnLabelProvider() {

			@Override
			public String getText(Object element) {
				if (element instanceof LinkEndsMapper) {
					return getLabel(((LinkEndsMapper) element).getEnds());
				}
				return NOT_AVAILABLE;
			}
		});


		TableViewerColumn columnSources = createTableViewerColumn(SOURCES, COLUMN_SIZE, viewer);
		configureColumn(columnSources);
		columnSources.setLabelProvider(new ColumnLabelProvider() {

			@Override
			public String getText(Object element) {
				if (element instanceof LinkEndsMapper) {
					return getLabel(((LinkEndsMapper) element).getSources());
				}
				return NOT_AVAILABLE;
			}
		});

		TableViewerColumn columnTargets = createTableViewerColumn(TARGETS, COLUMN_SIZE, viewer);
		configureColumn(columnTargets);
		columnTargets.setLabelProvider(new ColumnLabelProvider() {

			@Override
			public String getText(Object element) {
				if (element instanceof LinkEndsMapper) {
					return getLabel(((LinkEndsMapper) element).getTargets());
				}
				return NOT_AVAILABLE;
			}
		});

		GridData gridData = new GridData();
		gridData.verticalAlignment = GridData.FILL;
		gridData.horizontalSpan = 2;
		gridData.grabExcessHorizontalSpace = true;
		gridData.grabExcessVerticalSpace = true;
		gridData.horizontalAlignment = GridData.FILL;
		viewer.getControl().setLayoutData(gridData);
		viewer.setInput(existingLinks);
		parent.pack();
		return parent;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void buttonPressed(final int buttonId) {
		if (buttonId == RESTORE_SELECTED_LINK && this.existingLinks.size() >= this.selectedElementIndex) {
			this.result = this.existingLinks.get(this.selectedElementIndex).getLink();
		}

		// If the user selects CREATE or RESTORE and check the toggle button, the preferences are modified
		if ((CREATE == buttonId || RESTORE_SELECTED_LINK == buttonId) && toggleState) {
			final IPreferenceStore store = org.eclipse.papyrus.infra.gmfdiag.preferences.Activator.getDefault().getPreferenceStore();
			final String alwaysCreateLinkPreferenceName = PreferencesConstantsHelper.getPapyrusEditorConstant(PreferencesConstantsHelper.RESTORE_LINK_ELEMENT);
			store.setValue(alwaysCreateLinkPreferenceName, true);
		}
		super.buttonPressed(buttonId);
	}

	/**
	 *
	 * @param viewerColumn
	 *            the viewerColumn to configure
	 */
	protected void configureColumn(final TableViewerColumn viewerColumn) {
		viewerColumn.getColumn().setMoveable(true);
		viewerColumn.getColumn().setResizable(true);
	}

	/**
	 *
	 * @param list
	 *            the list of the elements for which we want the label
	 * @return
	 * 		the string to display for this list
	 */
	private String getLabel(final Collection<?> list) {
		if (list != null) {
			final StringBuilder builder = new StringBuilder();
			final Iterator<?> iter = list.iterator();
			while (iter.hasNext()) {
				builder.append(labelProvider.getText(iter.next()));
				if (iter.hasNext()) {
					builder.append(","); //$NON-NLS-1$
				}
			}
			return builder.toString();
		}
		return NOT_AVAILABLE;
	}

	/**
	 *
	 * @return
	 * 		the selected link
	 */
	public EObject getResult() {
		return this.result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Control createDialogArea(final Composite parent) {
		final Control createDialogArea = super.createDialogArea(parent);

		if (createDialogArea instanceof Composite) {
			createToggleButton((Composite) createDialogArea);
		}

		return createDialogArea;
	}

	/**
	 * Creates a toggle button.
	 *
	 * @param parent
	 *            The composite in which the toggle button should be placed;
	 *            must not be <code>null</code>.
	 * @return The added toggle button; never <code>null</code>.
	 */
	protected Button createToggleButton(final Composite parent) {
		final Button button = new Button(parent, SWT.CHECK | SWT.LEFT);
		final GridData data = new GridData(SWT.NONE);
		data.horizontalSpan = 2;
		button.setLayoutData(data);
		button.setFont(parent.getFont());
		button.setText(CHECKBOX_LABEL);
		button.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				toggleState = button.getSelection();
			}

		});

		return button;
	}
}
