/*****************************************************************************
 * Copyright (c) 2015 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Nicolas FAUVERGUE (ALL4TEC) nicolas.fauvergue@all4tec.net - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.properties.widgets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.editparts.AbstractEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.nebula.widgets.nattable.NatTable;
import org.eclipse.papyrus.infra.core.resource.EditingDomainServiceFactory;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.core.services.ServiceDescriptor;
import org.eclipse.papyrus.infra.core.services.ServiceDescriptor.ServiceTypeKind;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.core.services.ServiceMultiException;
import org.eclipse.papyrus.infra.core.services.ServiceStartKind;
import org.eclipse.papyrus.infra.core.services.ServicesRegistry;
import org.eclipse.papyrus.infra.emf.nattable.selection.EObjectSelectionExtractor;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.infra.nattable.manager.table.INattableModelManager;
import org.eclipse.papyrus.infra.nattable.manager.table.NattableModelManager;
import org.eclipse.papyrus.infra.nattable.manager.table.TreeNattableModelManager;
import org.eclipse.papyrus.infra.nattable.model.nattable.NattableFactory;
import org.eclipse.papyrus.infra.nattable.model.nattable.NattablePackage;
import org.eclipse.papyrus.infra.nattable.model.nattable.Table;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.IAxis;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.AxisManagerRepresentation;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.EStructuralFeatureValueFillingConfiguration;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.IAxisConfiguration;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.TableHeaderAxisConfiguration;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisprovider.AbstractAxisProvider;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisprovider.NattableaxisproviderFactory;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisprovider.NattableaxisproviderPackage;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableconfiguration.TableConfiguration;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.BooleanValueStyle;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.NattablestyleFactory;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.Style;
import org.eclipse.papyrus.infra.nattable.tree.ITreeItemAxisHelper;
import org.eclipse.papyrus.infra.nattable.utils.HeaderAxisConfigurationManagementUtils;
import org.eclipse.papyrus.infra.nattable.utils.NamedStyleConstants;
import org.eclipse.papyrus.infra.nattable.utils.NattableModelManagerFactory;
import org.eclipse.papyrus.infra.nattable.utils.TableHelper;
import org.eclipse.papyrus.infra.properties.contexts.Property;
import org.eclipse.papyrus.infra.properties.ui.modelelement.CompositeModelElement;
import org.eclipse.papyrus.infra.properties.ui.modelelement.DataSource;
import org.eclipse.papyrus.infra.properties.ui.modelelement.DataSourceChangedEvent;
import org.eclipse.papyrus.infra.properties.ui.modelelement.EMFModelElement;
import org.eclipse.papyrus.infra.properties.ui.modelelement.IDataSourceListener;
import org.eclipse.papyrus.infra.properties.ui.modelelement.ModelElement;
import org.eclipse.papyrus.infra.properties.ui.widgets.AbstractPropertyEditor;
import org.eclipse.papyrus.uml.properties.Activator;
import org.eclipse.papyrus.uml.properties.modelelement.UMLNotationModelElement;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.uml2.uml.Element;

/**
 * The property editor for the nattable widget.
 */
public class NattablePropertyEditor extends AbstractPropertyEditor {

	/**
	 * the save option to uses
	 */
	private static final Map<Object, Object> saveOptions = new HashMap<Object, Object>();

	static {
		saveOptions.put(Resource.OPTION_SAVE_ONLY_IF_CHANGED, Resource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER);
		saveOptions.put(Resource.OPTION_LINE_DELIMITER, Resource.OPTION_LINE_DELIMITER_UNSPECIFIED);
		saveOptions.put(XMLResource.OPTION_SAVE_TYPE_INFORMATION, true);
	}
	/**
	 * the folders in which we wil save the table configured by the user.
	 */
	private static final String TABLES_PREFERENCES_FOLDER_NAME = "tables";//$NON-NLS-1$

	/**
	 * The file in which the table will be saved
	 * 
	 * It doesn't work using .notation as extension file. In this case, the commands are not executed, because it is read-only, but why ?
	 */
	private static final String FILE_EXTENSION = "table";//$NON-NLS-1$

	/**
	 * The composite.
	 */
	protected Group self = null;;

	/**
	 * The table configuration URI.
	 */
	private URI tableConfigURI = null;

	/**
	 * The nattable widget.
	 */
	protected NatTable natTableWidget = null;

	/**
	 * The nattable manager.
	 */
	protected INattableModelManager nattableManager = null;

	/**
	 * The dispose listener.
	 */
	private DisposeListener nattableDisposeListener = null;

	/**
	 * The data source listener.
	 */
	private IDataSourceListener dataSourceListener;

	/**
	 * The service registry used to manipulate the table
	 */
	private ServicesRegistry serviceRegistry = null;

	/**
	 * the resource where the table will be saved
	 */
	private Resource resource = null;

	/**
	 * the edited Papyrus table
	 */
	private Table table = null;

	/**
	 * the table configuration
	 */
	private TableConfiguration tableConfiguration = null;

	/**
	 * if <code>true</code> we register table configuration by eClass and not only by table type
	 */
	private boolean registerTableConfigurationByEClass = false;

	/**
	 * Constructor.
	 *
	 * @param parent
	 *            The parent composite.
	 * @param style
	 *            The style of the composite.
	 */
	public NattablePropertyEditor(final Composite parent, final int style) {
		self = new Group(parent, SWT.NONE);
		FillLayout fillLayout = new FillLayout();
		fillLayout.marginHeight = 10;
		fillLayout.marginWidth = 10;
		self.setLayout(fillLayout);
	}

	/**
	 * 
	 * @param newValue
	 *            if <code>true</code> we register the table configuration by type AND by the ECLass of the selected element
	 */
	public final void setRegisterTableConfigurationByEClass(final boolean newValue) {
		this.registerTableConfigurationByEClass = newValue;
	}

	/**
	 * Set the table URI.
	 * 
	 * @param uri
	 *            The URI of the table (as String).
	 * @since 2.0
	 */
	public void setTableConfigurationURI(final String uri) {
		tableConfigURI = URI.createURI(uri);
		checkInput();
	}

	/**
	 * Get the table configuration URI.
	 * 
	 * @return The table configuration URI.
	 * @since 2.0
	 * 
	 */
	public String getTableConfigurationURI() {
		return tableConfigURI == null ? null : tableConfigURI.toString();
	}

	/**
	 * Set the table URI.
	 * 
	 * @param uri
	 *            The URI of the table (as String).
	 * 
	 * @deprecated since 2.0, use setTableConfigurationURI instead
	 */
	@Deprecated
	public void setTableURI(final String uri) {
		setTableConfigurationURI(uri);
	}

	/**
	 * Get the table configuration URI.
	 * 
	 * @return The table configuration URI.
	 * @deprecated since 2.0, use getTableConfigurationUri instead
	 */
	public String getTableURI() {
		return getTableConfigurationURI();
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.infra.properties.ui.widgets.AbstractPropertyEditor#checkInput()
	 */
	@Override
	protected void checkInput() {
		if (tableConfigURI != null) {
			super.checkInput();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.infra.properties.ui.widgets.AbstractPropertyEditor#doBinding()
	 */
	@Override
	protected void doBinding() {
		super.doBinding();

		final ModelElement modelElement = input.getModelElement(propertyPath);

		// The data neede to create the table
		final List<Object> rows = new ArrayList<Object>();
		EObject sourceElement = null;
		EStructuralFeature feature = null;

		// Manage the data needed for the table creation
		if (modelElement instanceof CompositeModelElement) {
			if (!((CompositeModelElement) modelElement).getSubElements().isEmpty()) {
				if (((CompositeModelElement) modelElement).getSubElements().get(0) instanceof UMLNotationModelElement) {
					final EModelElement eModelElement = ((UMLNotationModelElement) ((CompositeModelElement) modelElement).getSubElements().get(0)).getEModelElement();
					// Fill the list of views to determinate the axis to display (cannot be created without the table editing domain)
					for (ModelElement subModelElement : ((CompositeModelElement) modelElement).getSubElements()) {
						if (subModelElement instanceof UMLNotationModelElement) {
							rows.add(((UMLNotationModelElement) subModelElement).getEModelElement());
						}
					}
					sourceElement = eModelElement;
				} else if (((CompositeModelElement) modelElement).getSubElements().get(0) instanceof EMFModelElement) {
					final EMFModelElement emfModelElement = (EMFModelElement) ((CompositeModelElement) modelElement).getSubElements().get(0);
					sourceElement = emfModelElement.getSource();
					feature = emfModelElement.getFeature(getLocalPropertyPath());
				}
			}
		} else if (modelElement instanceof UMLNotationModelElement) {
			final EModelElement eModelElement = ((UMLNotationModelElement) modelElement).getEModelElement();
			// Fill the list of views to determinate the axis to display (cannot be created without the table editing domain)
			rows.add(eModelElement);
			sourceElement = eModelElement;
		} else if (modelElement instanceof EMFModelElement) {
			final EMFModelElement emfModelElement = (EMFModelElement) modelElement;
			sourceElement = emfModelElement.getSource();
			feature = emfModelElement.getFeature(getLocalPropertyPath());
		} else {
			displayError("Invalid table context"); //$NON-NLS-1$
			return;
		}

		createTableWidget(sourceElement, feature, rows);

	}

	/**
	 * This allow to create the table widget or to reuse a table previously used in the property view
	 * 
	 * @param sourceElement
	 *            The source Element.
	 * @param feature
	 *            The parent structural feature.
	 * @param rows
	 *            The rows of the table.
	 * 
	 * @since 2.0
	 */
	protected void createTableWidget(final EObject sourceElement, final EStructuralFeature feature, final Collection<?> rows) {
		// 1. we initialize a service registry
		if (this.serviceRegistry == null) {
			try {
				this.serviceRegistry = createServiceRegistry(sourceElement);
			} catch (Exception e) {
				Activator.log.error(e);
			}
		}

		if (this.serviceRegistry == null) {
			displayError("Cannot initialize the service registry"); //$NON-NLS-1$
			return;
		}

		// 2. get the editing domain
		TransactionalEditingDomain domain = getTableEditingDomain();
		if (domain == null) {
			displayError("Cannot found the editing domain"); //$NON-NLS-1$
			return;
		}

		// 3. Create the table or get an existing one
		this.table = getOrCreateTable(sourceElement, feature, rows);

		if (this.table == null) {
			displayError("Cannot initialize the table"); //$NON-NLS-1$
			return;
		}

		// 4. we configure the table
		final CompoundCommand cc = new CompoundCommand("Configure table command");//$NON-NLS-1$

		// 4.1 we register it into a resource if required
		if (this.table.eResource() == null) {
			cc.append(addTableToResource(domain, this.resource, this.table));
		}

		// 4.2 we configure the table
		configureTable(domain, this.table, sourceElement, feature, rows, cc);

		if (!cc.canExecute()) {
			displayError("The table can't be initialized");//$NON-NLS-1$
			return;
		}
		domain.getCommandStack().execute(cc);
		if (this.table.getContext() == null) {
			displayError("The context of the table hasn't be set");//$NON-NLS-1$
			return;
		}
		// 5. Create the widget
		this.nattableManager = NattableModelManagerFactory.INSTANCE.createNatTableModelManager(this.table, new EObjectSelectionExtractor());
		this.natTableWidget = createNatTableWidget(this.nattableManager, self, SWT.NONE, rows);

		self.addDisposeListener(getDisposeListener());
		// Configure the layout and the layout data
		configureLayout();

		((NattableModelManager) nattableManager).refreshNatTable();
	}

	/**
	 * 
	 * @param parent
	 *            the composite parent
	 * @param style
	 *            the style to use to create the nattable widget
	 * @param rows
	 *            the initial rows
	 * @return
	 * 		the created nattable widget
	 * @since 2.0
	 */
	protected NatTable createNatTableWidget(final INattableModelManager manager, final Composite parent, final int style, Collection<?> rows) {
		NatTable natTable = manager.createNattable(self, style, null);
		natTable.setBackground(self.getBackground());
		return natTable;
	}

	/**
	 * 
	 * @param sourceElement
	 *            the source element used to initiatiaze the table
	 * @return
	 * 		the service registry to use for the table displayed in property view
	 * @throws Exception
	 * 
	 *             Duplicated code from org.eclipse.papyrus.junit.utils.rules.ModelSetFixture
	 * @since 2.0
	 */
	protected ServicesRegistry createServiceRegistry(EObject sourceElement) throws Exception {
		ServicesRegistry result = new ServicesRegistry();

		result.add(ModelSet.class, 10, new ModelSet());

		ServiceDescriptor desc = new ServiceDescriptor(TransactionalEditingDomain.class, EditingDomainServiceFactory.class.getName(), ServiceStartKind.STARTUP, 10);// , Collections.singletonList(ResourceSet.class.getName()));
		desc.setServiceTypeKind(ServiceTypeKind.serviceFactory);
		desc.setClassBundleID(Activator.PLUGIN_ID);
		result.add(desc);

		result.startRegistry();
		return result;
	}

	/**
	 * 
	 * @param domain
	 *            the editing domain to use
	 * @param table
	 *            the edited table
	 * @param sourceElement
	 *            the source element (id the context of the table
	 * @param synchronizedFeature
	 *            the feature on which the table is synchronized
	 * @param rows
	 *            the initial rows for the table
	 * @param command
	 *            the compound command used to do additional stuff
	 * 
	 * @since 2.0
	 */
	protected void configureTable(final TransactionalEditingDomain domain, final Table table, final EObject sourceElement, final EStructuralFeature synchronizedFeature, Collection<?> rows, CompoundCommand command) {
		Assert.isNotNull(domain);
		// 1. we register the context of the table
		Command setContextCommand = SetCommand.create(domain, table, NattablePackage.eINSTANCE.getTable_Context(), sourceElement);
		command.append(setContextCommand);
	}

	/**
	 * This method initialize the context of the table, the feature to listen and the intial rows list element
	 * 
	 * @since 2.0
	 * 
	 * @deprecated since 2.0, use {@link #configureTable(TransactionalEditingDomain, Table, EObject, EStructuralFeature, Collection, Command)} instead
	 */
	@Deprecated
	protected void configureTable(Table table, EObject sourceElement, EStructuralFeature synchronizedFeature, Collection<?> rows) {
		final TransactionalEditingDomain domain = getTableEditingDomain();
		if (null != domain) {
			Command setContextCommand = SetCommand.create(domain, table, NattablePackage.eINSTANCE.getTable_Context(), sourceElement);
			getTableEditingDomain().getCommandStack().execute(setContextCommand);
			Assert.isNotNull(table.getContext());

			if (TableHelper.isTreeTable(table) && null != rows && !rows.isEmpty()) {// add test on TreeTable to fix bug 476623
				final AbstractAxisProvider axisProvider = table.getCurrentRowAxisProvider();
				TableHeaderAxisConfiguration conf = (TableHeaderAxisConfiguration) HeaderAxisConfigurationManagementUtils.getRowAbstractHeaderAxisInTableConfiguration(table);
				AxisManagerRepresentation rep = conf.getAxisManagers().get(0);
				for (Object context : rows) {
					addTreeItemAxis(axisProvider, rep, context);
				}
			}
		}
	}


	/**
	 * This allows to add some named style to the table.
	 * 
	 * @param table
	 *            The current table.
	 * @since 2.0
	 * 
	 * @deprecated since 2.0 done directly in the creation of the table
	 */
	@Deprecated
	protected void manageTableNamedStyle(final Table table) {
		final org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.BooleanValueStyle style = NattablestyleFactory.eINSTANCE.createBooleanValueStyle();
		style.setName(NamedStyleConstants.FILL_COLUMNS_SIZE);
		style.setBooleanValue(true);
		final TransactionalEditingDomain domain = getTableEditingDomain();
		RecordingCommand rc = new RecordingCommand(domain) {

			@Override
			protected void doExecute() {
				table.getStyles().add(style);

			}
		};
		domain.getCommandStack().execute(rc);
	}

	/**
	 * This allows to configure the tree table.
	 * 
	 * @param nattableManager
	 *            The nattable model manager.
	 * @param sourceElement
	 *            The source Element.
	 * @param feature
	 *            The feature.
	 * @param rows
	 *            The rows of the table.
	 * @deprecated since 2.0, moved into {@link TreeNattablePropertyEditor}
	 */
	@Deprecated
	protected void configureTreeTable(final TreeNattableModelManager nattableManager, final EObject sourceElement, final EStructuralFeature feature, final Collection<?> rows) {
		// Do nothing
	}

	/**
	 * This allows to configure the layout and the layout data.
	 */
	protected void configureLayout() {
		// Adapt the group to the table preferred size
		final GridData data = new GridData(SWT.FILL, SWT.FILL, true, true);

		// The preferred height of the nattable calculate it for each row (even if some are hidden)
		// So to calculate the correct height for the composite :
		// - Calculate the header height
		// - Calculate the body height
		// Add these values and add some extra to have correct displays
		final int headerHeight = natTableWidget.getPreferredHeight() - nattableManager.getBodyLayerStack().getRowHideShowLayer().getPreferredHeight();
		final int bodyHeight = nattableManager.getBodyLayerStack().getRowHideShowLayer().getHeight();
		// 16px must be added because of the left area slider
		final int extra = 20 + 16;
		data.minimumHeight = headerHeight + bodyHeight + extra;
		self.setLayoutData(data);

		self.layout();
		natTableWidget.layout();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.infra.properties.ui.widgets.AbstractPropertyEditor#updateDescription(java.lang.String)
	 */
	@Override
	protected void updateDescription(String description) {
		self.setToolTipText(description);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.infra.properties.ui.widgets.AbstractPropertyEditor#updateLabel(java.lang.String)
	 */
	@Override
	public void updateLabel(final String label) {
		if (showLabel) {
			((Group) self).setText(getLabel());
		}
	}

	/**
	 * This allow to display the error.
	 * 
	 * @param message
	 *            The error message to display.
	 */
	protected void displayError(final String message) {
		final CLabel label = new CLabel(self, SWT.NONE);
		label.setText(message);
		label.setImage(org.eclipse.papyrus.infra.widgets.Activator.getDefault().getImage("icons/error.gif")); //$NON-NLS-1$
	}

	/**
	 * 
	 * @param sourceElement
	 *            the source Element
	 * @param synchronizedFeature
	 *            the synchronized feature
	 * @param rows
	 * @return
	 * 		the existing table of the new created one
	 * @since 2.0
	 */
	protected Table getOrCreateTable(final EObject sourceElement, final EStructuralFeature synchronizedFeature, final Collection<?> rows) {
		Table returnedTable = null;
		final TableConfiguration tableConfiguration = getTableConfiguration();
		if (tableConfiguration == null) {
			return null;
		}

		if (this.serviceRegistry != null) {
			URI tableURI = createTableURI(sourceElement, tableConfiguration);
			final ResourceSet resourceSet = getResourceSet();
			((ModelSet) resourceSet).createModels(tableURI);
			boolean exists = resourceSet.getURIConverter().exists(tableURI, Collections.emptyMap());
			if (exists) {
				this.resource = resourceSet.getResource(tableURI, true);
			} else {
				this.resource = resourceSet.createResource(tableURI);
			}

			Iterator<EObject> iter = this.resource.getContents().iterator();
			while (iter.hasNext() && returnedTable == null) {// the resource should contains only 1 table and this one will get the good type
				EObject object = iter.next();
				if (object instanceof Table) {
					TableConfiguration configuration = ((Table) object).getTableConfiguration();
					if (configuration != null && configuration.getType().equals(getTableConfiguration().getType())) {
						returnedTable = (Table) object;
					}
				}
			}

			if (null == returnedTable) {
				returnedTable = createTable(sourceElement, synchronizedFeature);
			}

		}

		return returnedTable;
	}

	/**
	 * 
	 * @return
	 * 		the resource set to use to load/store emf files
	 * @since 2.0
	 */
	protected ResourceSet getResourceSet() {
		ResourceSet set = null;
		if (this.serviceRegistry != null) {
			try {
				set = this.serviceRegistry.getService(ModelSet.class);
			} catch (ServiceException e) {
				Activator.log.error(e);
			}
		}
		return set;
	}

	/**
	 * 
	 * @param sourceElement
	 *            the source Element
	 * @param tableConfiguration
	 *            the tableConfiguration
	 * @return
	 * 		the URI to use to save and load the table
	 * @since 2.0
	 */
	protected URI createTableURI(final EObject sourceElement, final TableConfiguration tableConfiguration) {
		IPath preferencePath = Activator.getDefault().getStateLocation();
		// we create a folder to save the tables used by the property view and we start to create the name of the model owning the table
		preferencePath = preferencePath.append(TABLES_PREFERENCES_FOLDER_NAME).append(tableConfiguration.getType());

		// we continue to build the path, adding the good suffix to the name of the model
		final StringBuilder b = new StringBuilder().append(preferencePath.toPortableString());
		if (this.registerTableConfigurationByEClass) {
			final ModelElement modelElement = input.getModelElement(propertyPath);
			EClass eClass = null;
			if (modelElement instanceof CompositeModelElement) {
				CompositeModelElement compoModelElement = (CompositeModelElement) modelElement;
				Iterator<ModelElement> iter = compoModelElement.getSubElements().iterator();
				while (eClass == null && iter.hasNext()) {
					ModelElement tmp = iter.next();
					if (tmp instanceof UMLNotationModelElement) {
						EditPart part = ((UMLNotationModelElement) tmp).getEditPart();
						eClass = EMFHelper.getEObject(part).eClass();
					} else if (tmp instanceof EMFModelElement) {
						eClass = ((EMFModelElement) tmp).getSource().eClass();
					}
				}
			}

			if (modelElement instanceof UMLNotationModelElement) {
				EditPart part = ((UMLNotationModelElement) modelElement).getEditPart();
				eClass = EMFHelper.getEObject(part).eClass();
			}
			b.append("_"); //$NON-NLS-1$
			b.append(eClass.getName());
		}
		URI newURI = URI.createFileURI(b.toString()).appendFileExtension(FILE_EXTENSION);
		return newURI;
	}


	/**
	 * This allow to create the nattable.
	 * 
	 * @param sourceElement
	 *            The context element.
	 * @param synchronizedFeature
	 *            The synchronized feature.
	 * @param rows
	 *            The rows of the table.
	 * @return The created table.
	 * 
	 * @since 2.0
	 */
	protected Table createTable(final EObject sourceElement, final EStructuralFeature synchronizedFeature) {
		final TableConfiguration tableConfiguration = getTableConfiguration();
		if (tableConfiguration == null) {
			return null;
		}
		final Table table = NattableFactory.eINSTANCE.createTable();
		table.setTableConfiguration(tableConfiguration);
		final Property property = getModelProperty();
		if (property != null) {
			String description = property.getDescription();
			if (description != null) {
				table.setDescription(description);
			}
		}

		table.setName(getLabel());

		AbstractAxisProvider rowProvider = tableConfiguration.getDefaultRowAxisProvider();
		if (rowProvider == null) {
			rowProvider = NattableaxisproviderFactory.eINSTANCE.createMasterObjectAxisProvider();
		} else {
			rowProvider = EcoreUtil.copy(rowProvider);
		}

		AbstractAxisProvider columnProvider = tableConfiguration.getDefaultColumnAxisProvider();
		if (columnProvider == null) {
			columnProvider = NattableaxisproviderFactory.eINSTANCE.createSlaveObjectAxisProvider();
		} else {
			columnProvider = EcoreUtil.copy(columnProvider);
		}

		if (null != synchronizedFeature) {
			TableHeaderAxisConfiguration rowHeaderAxisconfig = tableConfiguration.getRowHeaderAxisConfiguration();
			for (IAxisConfiguration axisConfig : rowHeaderAxisconfig.getOwnedAxisConfigurations()) {
				if (axisConfig instanceof EStructuralFeatureValueFillingConfiguration) {
					((EStructuralFeatureValueFillingConfiguration) axisConfig).setListenFeature(synchronizedFeature);
				}
			}
		}
		table.getColumnAxisProvidersHistory().add(columnProvider);
		table.setCurrentColumnAxisProvider(columnProvider);
		table.getRowAxisProvidersHistory().add(rowProvider);
		table.setCurrentRowAxisProvider(rowProvider);
		for (final Style style : tableConfiguration.getStyles()) {
			table.getStyles().add(EcoreUtil.copy(style));
		}

		// for the table displayed in property view, we want to use all the available place, so we add a specific named style each time
		final BooleanValueStyle fillStyle = NattablestyleFactory.eINSTANCE.createBooleanValueStyle();
		fillStyle.setName(NamedStyleConstants.FILL_COLUMNS_SIZE);
		fillStyle.setBooleanValue(true);
		table.getStyles().add(fillStyle);

		// for the table displayed in property view, we expand all directly
		final BooleanValueStyle expandStyle = NattablestyleFactory.eINSTANCE.createBooleanValueStyle();
		expandStyle.setName(NamedStyleConstants.EXPAND_ALL);
		expandStyle.setBooleanValue(true);
		table.getStyles().add(expandStyle);

		return table;
	}

	/**
	 * This allow to create the nattable.
	 * 
	 * @param sourceElement
	 *            The context element.
	 * @param synchronizedFeature
	 *            The synchronized feature.
	 * @param rows
	 *            The rows of the table.
	 * @return The created table.
	 * 
	 * @deprecated since 2.0, use the same method without the collections of rows as arguments. Rows are set later in the new implementation
	 */
	@Deprecated
	protected Table createTable(final EObject sourceElement, final EStructuralFeature synchronizedFeature, final Collection<?> rows) {
		final TableConfiguration tableConfiguration = getTableConfiguration();
		if (tableConfiguration == null) {
			return null;
		}
		final Table table = NattableFactory.eINSTANCE.createTable();
		table.setTableConfiguration(tableConfiguration);
		final Property property = getModelProperty();
		if (property != null) {
			String description = property.getDescription();
			if (description != null) {
				table.setDescription(description);
			}
		}

		table.setName(getLabel());

		AbstractAxisProvider rowProvider = tableConfiguration.getDefaultRowAxisProvider();
		if (rowProvider == null) {
			rowProvider = NattableaxisproviderFactory.eINSTANCE.createMasterObjectAxisProvider();
		} else {
			rowProvider = EcoreUtil.copy(rowProvider);
		}

		AbstractAxisProvider columnProvider = tableConfiguration.getDefaultColumnAxisProvider();
		if (columnProvider == null) {
			columnProvider = NattableaxisproviderFactory.eINSTANCE.createSlaveObjectAxisProvider();
		} else {
			columnProvider = EcoreUtil.copy(columnProvider);
		}

		if (null != synchronizedFeature) {
			TableHeaderAxisConfiguration rowHeaderAxisconfig = tableConfiguration.getRowHeaderAxisConfiguration();
			for (IAxisConfiguration axisConfig : rowHeaderAxisconfig.getOwnedAxisConfigurations()) {
				if (axisConfig instanceof EStructuralFeatureValueFillingConfiguration) {
					((EStructuralFeatureValueFillingConfiguration) axisConfig).setListenFeature(synchronizedFeature);
				}
			}
		}
		table.getColumnAxisProvidersHistory().add(columnProvider);
		table.setCurrentColumnAxisProvider(columnProvider);
		table.getRowAxisProvidersHistory().add(rowProvider);
		table.setCurrentRowAxisProvider(rowProvider);
		for (final Style style : tableConfiguration.getStyles()) {
			table.getStyles().add(EcoreUtil.copy(style));
		}

		return table;
	}


	/**
	 * This allow to add the tree item axis.
	 * 
	 * @param axisProvider
	 *            The axis provider.
	 * @param rep
	 *            The axis manager representation.
	 * @param object
	 *            The object to add.
	 * 
	 * @deprecated since 2.0, moved into {@link TreeNattablePropertyEditor} with command
	 */
	@Deprecated
	protected void addTreeItemAxis(final AbstractAxisProvider axisProvider, final AxisManagerRepresentation rep, final Object object) {
		if (object instanceof View && isStereotypedElement((View) object)) {
			TransactionalEditingDomain domain = getTableEditingDomain();
			final IAxis axis = ITreeItemAxisHelper.createITreeItemAxis(null, null, object, rep);
			Command addCommand = AddCommand.create(getTableEditingDomain(), axisProvider, NattableaxisproviderPackage.eINSTANCE.getAxisProvider_Axis(), Collections.singleton(axis));
			domain.getCommandStack().execute(addCommand);
		}
	}

	/**
	 * 
	 * @return
	 * 		the editing domain to use
	 * 
	 * @since 2.0
	 */
	protected TransactionalEditingDomain getTableEditingDomain() {
		try {
			return this.serviceRegistry.getService(TransactionalEditingDomain.class);
		} catch (ServiceException e) {
			Activator.log.error(e);
		}
		return null;
	}

	/**
	 * Check is the element of the view is stereotyped.
	 * 
	 * @param view
	 *            The view.
	 * @return <code>true</code> if the element of view is stereotyped, <code>false</code> otherwise.
	 */
	protected boolean isStereotypedElement(final View view) {
		boolean result = false;
		if (view.getElement() instanceof Element && !((Element) view.getElement()).getAppliedStereotypes().isEmpty()) {
			result = true;
		}
		return result;
	}

	/**
	 * Get the table configuration (from the table configuration URI).
	 * 
	 * @return The table configuration.
	 */
	protected TableConfiguration getTableConfiguration() {
		if (this.tableConfiguration == null) {
			ResourceSet resourceSet = getResourceSet();
			if (resourceSet != null) {
				try {
					this.tableConfiguration = (TableConfiguration) EMFHelper.loadEMFModel(resourceSet, this.tableConfigURI);
				} catch (Exception ex) {
					Activator.log.error("Invalid table configuration", ex); //$NON-NLS-1$
				}
			}
		}
		return this.tableConfiguration;
	}

	/**
	 * This allow to create the dispose listener for the nattable table manager.
	 * 
	 * @return The dispose nattable manager listener.
	 */
	protected DisposeListener getDisposeListener() {
		if (null == this.nattableDisposeListener) {
			this.nattableDisposeListener = new DisposeListener() {

				public void widgetDisposed(DisposeEvent e) {

					if (NattablePropertyEditor.this.serviceRegistry != null) {
						// we dispose it to avoid unecessary refresh
						NattablePropertyEditor.this.nattableManager.dispose();
						NattablePropertyEditor.this.natTableWidget.dispose();

						TransactionalEditingDomain domain = getTableEditingDomain();
						Command cmd = getDisposeCommand(domain, table);
						domain.getCommandStack().execute(cmd);

						if (NattablePropertyEditor.this.resource != null) {
							try {
								NattablePropertyEditor.this.resource.save(saveOptions);
							} catch (IOException e1) {
								Activator.log.error(e1);
							}
						}
						try {
							NattablePropertyEditor.this.serviceRegistry.disposeRegistry();
						} catch (ServiceMultiException e1) {
							Activator.log.error(e1);
						}
						NattablePropertyEditor.this.serviceRegistry = null;
						NattablePropertyEditor.this.table = null;

					}
				}
			};
		}
		return nattableDisposeListener;
	}

	/**
	 * 
	 * @param domain
	 *            the editing domain
	 * @param table
	 *            the table to clean before dispose
	 * @return
	 * 		the command to use to clean the table before disposing it
	 * @since 2.0
	 */
	protected CompoundCommand getDisposeCommand(final TransactionalEditingDomain domain, final Table table) {
		CompoundCommand disposeCommand = new CompoundCommand("Command used to clean the table before disposing it"); //$NON-NLS-1$
		disposeCommand.append(SetCommand.create(domain, table, NattablePackage.eINSTANCE.getTable_Context(), null));
		disposeCommand.append(SetCommand.create(domain, table, NattablePackage.eINSTANCE.getTable_Owner(), null));
		// assuming the table is synchronized and not inverted :
		disposeCommand.append(SetCommand.create(domain, table.getCurrentRowAxisProvider(), NattableaxisproviderPackage.eINSTANCE.getAxisProvider_Axis(), Collections.emptyList()));

		return disposeCommand;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.infra.properties.ui.widgets.AbstractPropertyEditor#unhookDataSourceListener(org.eclipse.papyrus.infra.properties.ui.modelelement.DataSource)
	 */
	@Override
	protected void unhookDataSourceListener(DataSource oldInput) {
		oldInput.removeDataSourceListener(getDataSourceListener());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.infra.properties.ui.widgets.AbstractPropertyEditor#hookDataSourceListener(org.eclipse.papyrus.infra.properties.ui.modelelement.DataSource)
	 */
	@Override
	protected void hookDataSourceListener(DataSource newInput) {
		newInput.addDataSourceListener(getDataSourceListener());
	}

	/**
	 * This allow to create the data source listener.
	 * 
	 * @return The created data source listener.
	 */
	private IDataSourceListener getDataSourceListener() {
		if (dataSourceListener == null) {
			dataSourceListener = new IDataSourceListener() {

				public void dataSourceChanged(final DataSourceChangedEvent event) {
					if (null != nattableManager) {
						nattableManager.dispose();
						nattableManager = null;
					}
					// Dispose the previous nattablewidget if necessary
					if (null != natTableWidget) {
						natTableWidget.dispose();
						natTableWidget = null;
						self.removeDisposeListener(getDisposeListener());
					}
					// Get the datasource
					final DataSource dataSource = event.getDataSource();
					final StructuredSelection selection = (StructuredSelection) dataSource.getSelection();

					// Manage the context selection
					final List<Object> contexts = new ArrayList<Object>(selection.size());
					final Iterator<?> selectionIterator = selection.iterator();
					while (selectionIterator.hasNext()) {
						Object selectedObject = selectionIterator.next();
						if (selectedObject instanceof AbstractEditPart) {
							contexts.add(((AbstractEditPart) selectedObject).getModel());
						} else {
							contexts.add(selectedObject);
						}
					}

					// Get the model element
					if (0 < contexts.size()) {
						final ModelElement modelElement = dataSource.getModelElement(propertyPath);
						EObject sourceElement = EMFHelper.getEObject(contexts.get(0));
						EStructuralFeature feature = null;
						if (modelElement instanceof CompositeModelElement) {
							if (!((CompositeModelElement) modelElement).getSubElements().isEmpty()) {
								if (((CompositeModelElement) modelElement).getSubElements().get(0) instanceof EMFModelElement) {
									final EMFModelElement emfModelElement = (EMFModelElement) ((CompositeModelElement) modelElement).getSubElements().get(0);
									feature = emfModelElement.getFeature(getLocalPropertyPath());
								}
							}
						} else if (modelElement instanceof EMFModelElement) {
							final EMFModelElement emfModelElement = (EMFModelElement) modelElement;
							feature = emfModelElement.getFeature(getLocalPropertyPath());
						}

						// Recreate the table widget
						createTableWidget(sourceElement, feature, contexts);
					}
				}
			};
		}

		return dataSourceListener;
	}

	/**
	 * 
	 * @param domain
	 *            the editing domain to use
	 * @param resource
	 *            the resource where the table must be saved
	 * @param table
	 *            the table to add to the resource
	 * @return
	 * 		the command to add the table to the resource
	 */
	private static final Command addTableToResource(final TransactionalEditingDomain domain, final Resource resource, final Table table) {
		return new RecordingCommand(domain) {

			@Override
			protected void doExecute() {
				resource.getContents().add(table);
			}
		};
	}
}
