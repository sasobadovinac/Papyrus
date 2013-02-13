package org.eclipse.papyrus.infra.emf.editor.part;

import java.util.EventObject;
import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.ecore.presentation.EcoreEditor;
import org.eclipse.emf.ecore.provider.EcoreItemProviderAdapterFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.celleditor.AdapterFactoryTreeEditor;
import org.eclipse.emf.edit.ui.dnd.LocalTransfer;
import org.eclipse.emf.edit.ui.dnd.ViewerDragAdapter;
import org.eclipse.emf.facet.infra.browser.uicore.CustomizationManager;
import org.eclipse.emf.transaction.TransactionalCommandStack;
import org.eclipse.emf.transaction.impl.TransactionalCommandStackImpl;
import org.eclipse.emf.transaction.impl.TransactionalEditingDomainImpl;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.core.services.ServicesRegistry;
import org.eclipse.papyrus.infra.emf.editor.Activator;
import org.eclipse.papyrus.infra.emf.editor.actions.MoDiscoDropAdapter;
import org.eclipse.papyrus.infra.emf.editor.providers.CustomizableContentProvider;
import org.eclipse.papyrus.infra.services.labelprovider.service.LabelProviderService;
import org.eclipse.papyrus.infra.services.labelprovider.service.impl.LabelProviderServiceImpl;
import org.eclipse.papyrus.infra.widgets.editors.AbstractEditor;
import org.eclipse.papyrus.infra.widgets.editors.ICommitListener;
import org.eclipse.papyrus.infra.widgets.editors.StringEditor;
import org.eclipse.papyrus.infra.widgets.providers.PatternViewerFilter;
import org.eclipse.papyrus.views.properties.widgets.layout.GridData;
import org.eclipse.papyrus.views.properties.widgets.layout.PropertiesLayout;
import org.eclipse.swt.SWT;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.events.ControlAdapter;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.PropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

/**
 * An extended EMF editor
 * 
 * This generic editor provides the following features :
 * 
 * - EMF Facet browser customization
 * - Papyrus customizable property view
 * - Papyrus customizable new child
 * 
 * @author Camille Letavernier
 * 
 */
public class PapyrusEditor extends EcoreEditor implements ITabbedPropertySheetPageContributor, CommandStackListener {

	public static final String PROPERTY_VIEW_ID = "CustomizablePropertyView"; //$NON-NLS-1$

	/**
	 * The Property sheet page for this editor
	 */
	protected IPropertySheetPage iPropertySheetPage;

	/**
	 * The services registry associated to this editor
	 */
	protected ServicesRegistry registry;

	@Override
	public void createPages() {
		// Creates the model from the editor input
		//
		createModel();

		getContainer().setBackground(new Color(getContainer().getDisplay(), 255, 255, 255));
		getContainer().setBackgroundMode(SWT.INHERIT_DEFAULT);

		Composite gParent = new Composite(getContainer(), SWT.NONE);
		gParent.setLayout(new FillLayout());

		//SashForm parent = new SashForm(gParent, SWT.VERTICAL | SWT.V_SCROLL | SWT.H_SCROLL);
		//parent.setLayout(new FillLayout());

		Composite parent = new Composite(gParent, SWT.NONE);
		parent.setLayout(new PropertiesLayout());

		//		try {
		//			registry = new ServicesRegistry();
		//			registry.add(LabelProviderService.class, 1, new LabelProviderServiceImpl());
		//			registry.add(ServiceUtilsForResourceInitializerService.class, 1, new ServiceUtilsForResourceInitializerService());
		//			//registry = new ExtensionServicesRegistry(org.eclipse.papyrus.infra.core.Activator.PLUGIN_ID);
		//			registry.startRegistry();
		//		} catch (ServiceException ex) {
		//			Activator.log.error(ex);
		//		}

		// Only creates the other pages if there is something that can be edited
		//
		if(!getEditingDomain().getResourceSet().getResources().isEmpty()) {
			// Create a page for the selection tree view.
			//

			final PatternViewerFilter filter = new PatternViewerFilter();
			filter.setShowIfHasVisibleParent(true);

			final StringEditor filterPattern = new StringEditor(parent, SWT.NONE, "Filter");
			filterPattern.addCommitListener(new ICommitListener() {

				public void commit(AbstractEditor editor) {
					filter.setPattern((String)filterPattern.getValue());
					selectionViewer.refresh();
				}

			});

			Tree tree = new Tree(parent, getTreeStyle() | SWT.MULTI);
			tree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

			selectionViewer = new TreeViewer(tree);
			selectionViewer.setFilters(new ViewerFilter[]{ filter });
			setCurrentViewer(selectionViewer);
			IStructuredContentProvider contentProvider = createContentProvider();
			getCustomizationManager().installCustomPainter(tree);

			ILabelProvider labelProvider = createLabelProvider();

			editingDomain.getCommandStack().addCommandStackListener(this);

			selectionViewer.setContentProvider(contentProvider);
			selectionViewer.setLabelProvider(labelProvider);

			selectionViewer.setInput(editingDomain.getResourceSet());
			selectionViewer.setSelection(new StructuredSelection(editingDomain.getResourceSet().getResources().get(0)), true);

			new AdapterFactoryTreeEditor(selectionViewer.getTree(), adapterFactory);

			createContextMenuFor(selectionViewer);
			int pageIndex = addPage(gParent);
			setPageText(pageIndex, "Model"); //$NON-NLS-1$

			setActivePage(0);

			//			Preview preview = new Preview(this);
			//			preview.createPartControl(parent);
			//			addPreview(preview);

			parent.layout();
		}

		// Ensures that this editor will only display the page's tab
		// area if there are more than one page
		//
		getContainer().addControlListener(new ControlAdapter() {

			boolean guard = false;

			@Override
			public void controlResized(ControlEvent event) {
				if(!guard) {
					guard = true;
					hideTabs();
					guard = false;
				}
			}
		});

		if(getActionBarContributor() instanceof ActionBarContributor) {
			((ActionBarContributor)getActionBarContributor()).setEditingDomain(getEditingDomain());
		}

		updateProblemIndication();
	}

	protected int getTreeStyle() {
		return SWT.BORDER;
	}


	@Override
	protected void initializeEditingDomain() {
		// Create an adapter factory that yields item providers.
		//
		adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

		adapterFactory.addAdapterFactory(new ResourceItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new EcoreItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());

		// Create the command stack that will notify this editor as commands are executed.
		//
		TransactionalCommandStack commandStack = new TransactionalCommandStackImpl();

		// Add a listener to set the most recent command's affected objects to be the selection of the viewer with focus.
		//
		commandStack.addCommandStackListener(new CommandStackListener() {

			public void commandStackChanged(final EventObject event) {
				getContainer().getDisplay().asyncExec(new Runnable() {

					public void run() {
						firePropertyChange(IEditorPart.PROP_DIRTY);

						// Try to select the affected objects.
						//
						Command mostRecentCommand = ((CommandStack)event.getSource()).getMostRecentCommand();
						if(mostRecentCommand != null) {
							setSelectionToViewer(mostRecentCommand.getAffectedObjects());
						}

						Iterator<PropertySheetPage> propertySheetPagesIterator = propertySheetPages.iterator();
						while(propertySheetPagesIterator.hasNext()) {
							PropertySheetPage propertySheetPage = propertySheetPagesIterator.next();
							if(propertySheetPage.getControl().isDisposed()) {
								propertySheetPagesIterator.remove();
							} else {
								propertySheetPage.refresh();
							}
						}
					}
				});
			}
		});

		// Create the editing domain with a special command stack.
		//
		editingDomain = new TransactionalEditingDomainImpl(adapterFactory, commandStack);
		editingDomain.setResourceToReadOnlyMap(new HashMap<Resource, Boolean>());
	}

	@Override
	protected void createContextMenuFor(StructuredViewer viewer) {
		MenuManager contextMenu = new MenuManager("#PopUp"); //$NON-NLS-1$
		contextMenu.add(new Separator("additions")); //$NON-NLS-1$
		contextMenu.setRemoveAllWhenShown(true);
		contextMenu.addMenuListener(this);
		Menu menu = contextMenu.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);

		int dndOperations = DND.DROP_COPY | DND.DROP_MOVE | DND.DROP_LINK;
		Transfer[] transfers = new Transfer[]{ LocalTransfer.getInstance() };
		viewer.addDragSupport(dndOperations, transfers, new ViewerDragAdapter(viewer));
		viewer.addDropSupport(dndOperations, transfers, new MoDiscoDropAdapter(editingDomain, viewer));
	}

	@Override
	public IPropertySheetPage getPropertySheetPage() {
		if(iPropertySheetPage == null) {
			iPropertySheetPage = new TabbedPropertySheetPage(this);
		}
		return iPropertySheetPage;
	}

	protected CustomizationManager getCustomizationManager() {
		return Activator.getDefault().getCustomizationManager();
	}

	protected IStructuredContentProvider createContentProvider() {
		return new CustomizableContentProvider(getCustomizationManager());
	}

	protected ILabelProvider createLabelProvider() {
		LabelProviderService service = new LabelProviderServiceImpl();
		try {
			service.startService();
		} catch (ServiceException ex) {
			Activator.log.error(ex);
			return new LabelProvider();
		}
		return service.getLabelProvider();
		//		try {
		//			return registry.getService(LabelProviderService.class).getLabelProvider();
		//		} catch (ServiceException ex) {
		//			Activator.log.error(ex);
		//			return new LabelProvider();
		//		}
	}

	public void commandStackChanged(EventObject event) {
		getViewer().refresh();
	}

	public String getContributorId() {
		return PROPERTY_VIEW_ID;
	}
}
