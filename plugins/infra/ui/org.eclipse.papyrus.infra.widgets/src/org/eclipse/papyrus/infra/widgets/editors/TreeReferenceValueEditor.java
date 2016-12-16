/*****************************************************************************
 * Copyright (c) 2016 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Fanch BONNABESSE (ALL4TEC) fanch.bonnabesse@all4tec.net - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.infra.widgets.editors;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.layout.TreeColumnLayout;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.infra.widgets.Activator;
import org.eclipse.papyrus.infra.widgets.creation.ReferenceValueFactory;
import org.eclipse.papyrus.infra.widgets.messages.Messages;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.Widget;

/**
 * This class allow to define a Tree Reference Value Editor.
 */
public abstract class TreeReferenceValueEditor extends AbstractValueEditor implements SelectionListener {

	/**
	 * The Button used to create a new instance
	 */
	protected Button createInstanceButton;

	/**
	 * The Button used to unset the current value
	 */
	protected Button unsetButton;

	/**
	 * The label provider used to display the values in both the label and the
	 * selection dialog
	 */
	protected ILabelProvider labelProvider;

	/**
	 * The current value for this editor
	 */
	protected Object value;

	/**
	 * The factory used to create or edit objects directly from this editor
	 */
	protected ReferenceValueFactory valueFactory;

	/**
	 * TreeViewer to show
	 */
	protected TreeViewer treeViewer;

	/**
	 * The tree of the TreeViewer.
	 */
	protected Tree tree;

	/**
	 * The parent composite of the tree viewer.
	 */
	protected Composite compositeTree;

	/**
	 * The adapter used to refresh the TreeViewer.
	 */
	protected Adapter adapterNotifyChanged = new AdapterImpl() {
		@Override
		public void notifyChanged(Notification msg) {
			if (null != treeViewer) {
				treeViewer.refresh();
			}
		};
	};

	/**
	 *
	 * Constructs a new ReferenceDialog in the given parent Composite. The style
	 * will be applied to the CLabel displaying the current value.
	 *
	 * @param parent
	 *            The parent composite.
	 * @param style
	 *            The style for the created widget.
	 */
	public TreeReferenceValueEditor(final Composite parent, final int style) {
		super(parent, style);

		((GridLayout) getLayout()).numColumns += 1;

		// Create a parent composite to set the margin
		final Composite gridComposite = factory.createComposite(this);
		gridComposite.setLayout(new GridLayout());
		gridComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		compositeTree = factory.createComposite(gridComposite);
		final TreeColumnLayout treeColumnLayout = new TreeColumnLayout();
		compositeTree.setLayout(treeColumnLayout);
		final GridData compositeTreeGridData = new GridData(SWT.FILL, SWT.FILL, true, true);
		compositeTreeGridData.minimumHeight = 150;
		compositeTree.setLayoutData(compositeTreeGridData);

		treeViewer = new TreeViewer(compositeTree, SWT.MULTI | SWT.NO_SCROLL | SWT.V_SCROLL | SWT.BORDER | SWT.FULL_SELECTION);
		tree = treeViewer.getTree();
		tree.setLinesVisible(true);
		tree.setHeaderVisible(true);

		final TreeViewerColumn columnProperty = new TreeViewerColumn(treeViewer, SWT.LEFT);
		columnProperty.getColumn().setAlignment(SWT.LEFT);
		columnProperty.getColumn().setText("Property"); //$NON-NLS-1$
		treeColumnLayout.setColumnData(columnProperty.getColumn(), new ColumnWeightData(100));
		final TreeViewerColumn columnValue = new TreeViewerColumn(treeViewer, SWT.RIGHT);
		columnValue.getColumn().setAlignment(SWT.LEFT);
		columnValue.getColumn().setText("Value"); //$NON-NLS-1$
		treeColumnLayout.setColumnData(columnValue.getColumn(), new ColumnWeightData(200));

		columnValue.setEditingSupport(createEditingSupport());

		treeViewer.setAutoExpandLevel(10);

		createButtons();
	}

	/**
	 * Create the buttons.
	 */
	protected void createButtons() {
		((GridLayout) getLayout()).numColumns += 2;

		createInstanceButton = factory.createButton(this, null, SWT.PUSH);
		createInstanceButton.setImage(Activator.getDefault().getImage("/icons/Add_12x12.gif")); //$NON-NLS-1$
		createInstanceButton.setToolTipText(Messages.ReferenceDialog_CreateANewObject);
		createInstanceButton.addSelectionListener(this);

		unsetButton = factory.createButton(this, null, SWT.PUSH);
		unsetButton.setImage(Activator.getDefault().getImage("/icons/Delete_12x12.gif")); //$NON-NLS-1$
		unsetButton.setToolTipText(Messages.ReferenceDialog_UnsetValue);
		unsetButton.addSelectionListener(this);
	}

	/**
	 * The action executed when the "create" button is selected Create a new
	 * instance and assign it to this reference.
	 */
	protected void createAction() {
		if (valueFactory != null && valueFactory.canCreateObject()) {
			final Object context = getContextElement();
			getOperationExecutor(context).execute(new Runnable() {

				@Override
				public void run() {
					Object value = valueFactory.createObject(createInstanceButton, context);
					if (null == value) {
						// Cancel the operation
						throw new OperationCanceledException();
					}

					Collection<Object> validatedObjects = valueFactory.validateObjects(Collections.singleton(value));
					if (!validatedObjects.isEmpty()) {
						setValue(validatedObjects.iterator().next());
					}
				}
			}, NLS.bind(Messages.ReferenceDialog_setOperation, labelText));
		}
	}

	/**
	 * The action executed when the "unset" button is selected Sets the current
	 * reference to null.
	 */
	protected void unsetAction() {
		setValue(null);
	}

	/**
	 * Sets the Label provider for this editor If the label provider is null, a
	 * default one will be used. The same label provider is used for both the
	 * editor's label and the selection dialog.
	 *
	 * @param provider
	 *            The label provider
	 */
	public void setLabelProvider(final ILabelProvider provider) {
		if (null == provider) {
			setLabelProvider(new LabelProvider());
			return;
		}
		this.labelProvider = provider;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.infra.widgets.editors.AbstractValueEditor#getValue()
	 */
	@Override
	public Object getValue() {
		if (null != modelProperty) {
			return modelProperty.getValue();
		}
		return value;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.infra.widgets.editors.AbstractEditor#getEditableType()
	 */
	@Override
	public Object getEditableType() {
		return Object.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.infra.widgets.editors.AbstractValueEditor#setModelObservable(org.eclipse.core.databinding.observable.value.IObservableValue)
	 */
	@SuppressWarnings("rawtypes")
	@Override
	public void setModelObservable(final IObservableValue modelProperty) {
		if (null != modelProperty) {
			this.value = modelProperty.getValue();
		}
		super.setModelObservable(modelProperty);
		addEAdapters();
		setWidgetObservable(createWidgetObservable(modelProperty));
	}

	/**
	 * This allows to set the Reference value factory.
	 * 
	 * @param factory
	 *            The reference value factory.
	 */
	public void setValueFactory(final ReferenceValueFactory factory) {
		this.valueFactory = factory;
	}

	/**
	 * Get the Reference value factory.
	 * 
	 * @return The Reference value factory.
	 */
	public ReferenceValueFactory getValueFactory() {
		return valueFactory;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.swt.events.SelectionListener#widgetSelected(org.eclipse.swt.events.SelectionEvent)
	 */
	@Override
	public void widgetSelected(final SelectionEvent e) {
		Widget widget = e.widget;
		if (widget == createInstanceButton) {
			createAction();
		} else if (widget == unsetButton) {
			unsetAction();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.swt.events.SelectionListener#widgetDefaultSelected(org.eclipse.swt.events.SelectionEvent)
	 */
	@Override
	public void widgetDefaultSelected(final SelectionEvent e) {
		// Do nothing
	}


	/**
	 * Set value of the modelProperty and create the widget observable.
	 *
	 * @param value
	 *            The new value.
	 */
	@SuppressWarnings("unchecked")
	public void setValue(final Object value) {
		removeEAdapters();
		this.value = value;
		if (null != modelProperty) {
			modelProperty.setValue(value);
			setWidgetObservable(createWidgetObservable(modelProperty));
			addEAdapters();
		}

		if (null != treeViewer) {
			IContentProvider treeViewerContentProvider = treeViewer.getContentProvider();
			if (null != treeViewerContentProvider) {
				setValueRootContentProvider();
				treeViewer.setInput(""); // $NON-NLS-1$
			}
		}

		commit();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.infra.widgets.editors.AbstractEditor#isReadOnly()
	 */
	@Override
	public boolean isReadOnly() {
		return false;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.infra.widgets.editors.AbstractEditor#setReadOnly(boolean)
	 */
	@Override
	public void setReadOnly(final boolean readOnly) {
		// Do Nothing
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.swt.widgets.Widget#dispose()
	 */
	@Override
	public void dispose() {
		removeEAdapters();
		super.dispose();
	}

	/**
	 * Add the eAdapters to the current value.
	 */
	private void addEAdapters() {
		if (value instanceof EObject) {
			((EObject) value).eAdapters().add(adapterNotifyChanged);
		}
	}

	/**
	 * Remove the eAdapters to the current value.
	 */
	private void removeEAdapters() {
		if (value instanceof EObject) {
			((EObject) value).eAdapters().remove(adapterNotifyChanged);
		}
	}

	/**
	 * Set the value root to the content provider of the tree viewer.
	 */
	public abstract void setValueRootContentProvider();

	/**
	 * Set the providers of the TreeViewer.
	 */
	public abstract void setProvidersTreeViewer();

	/**
	 * Create the Editing Support.
	 *
	 * @return The EditingSupport created.
	 */
	public abstract EditingSupport createEditingSupport();

	/**
	 * This allow to create the widget observable value.
	 *
	 * @param modelProperty
	 *            The current observable value.
	 * @return The created IObservableValue.
	 */
	@SuppressWarnings("rawtypes")
	public abstract IObservableValue createWidgetObservable(final IObservableValue modelProperty);

}
