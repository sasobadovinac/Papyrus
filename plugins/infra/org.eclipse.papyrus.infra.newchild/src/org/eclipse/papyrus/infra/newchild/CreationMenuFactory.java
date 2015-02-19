/*****************************************************************************
 * Copyright (c) 2011 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *
 *		CEA LIST - Initial API and implementation
 *		Patrik Nandorf (Ericsson AB) patrik.nandorf@ericsson.com - Bug 425565 
 *****************************************************************************/
package org.eclipse.papyrus.infra.newchild;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.emf.transaction.Transaction;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.impl.InternalTransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.GetEditContextRequest;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.infra.emf.utils.ServiceUtilsForEObject;
import org.eclipse.papyrus.infra.newchild.elementcreationmenumodel.CreateRelationshipMenu;
import org.eclipse.papyrus.infra.newchild.elementcreationmenumodel.CreationMenu;
import org.eclipse.papyrus.infra.newchild.elementcreationmenumodel.Folder;
import org.eclipse.papyrus.infra.services.edit.internal.context.TypeContext;
import org.eclipse.papyrus.infra.services.edit.service.ElementEditServiceUtils;
import org.eclipse.papyrus.infra.services.edit.service.IElementEditService;
import org.eclipse.papyrus.infra.services.edit.utils.IRequestCacheEntries;
import org.eclipse.papyrus.infra.services.edit.utils.RequestCacheEntries;
import org.eclipse.papyrus.infra.services.labelprovider.service.LabelProviderService;
import org.eclipse.papyrus.infra.widgets.editors.TreeSelectorDialog;
import org.eclipse.papyrus.uml.tools.providers.SemanticUMLContentProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;

/**
 * this class contains code to construct menu from a Menu and a selected object
 *
 */
public class CreationMenuFactory {

	private TransactionalEditingDomain editingDomain;

	/**
	 *
	 * Constructor.
	 *
	 * @param editingDomain
	 */
	public CreationMenuFactory(TransactionalEditingDomain editingDomain) {
		super();
		this.editingDomain = editingDomain;
	}

	/**
	 * construct a menu from a folder, this is a recursion
	 *
	 * @param menu
	 *            the current menu
	 * @param folder
	 *            the folder
	 * @param selectedObject
	 *            the current selection
	 * @param adviceCache
	 * @return true if sub-menu has been added
	 */
	public boolean populateMenu(Menu menu, Folder folder, EObject selectedObject, int index, Map<?, ?> adviceCache) {
		if (selectedObject != null && folder != null && folder.isVisible()) {
			org.eclipse.swt.widgets.MenuItem topMenuItem = new MenuItem(menu, SWT.CASCADE, index);
			topMenuItem.setText(folder.getLabel());
			if (folder.getIcon() != null && folder.getIcon().length() > 0) {
				URL url = null;
				try {
					url = new URL(folder.getIcon());
					ImageDescriptor imgDesc = ImageDescriptor.createFromURL(url);
					topMenuItem.setImage(org.eclipse.papyrus.infra.widgets.Activator.getDefault().getImage(imgDesc));
				} catch (MalformedURLException e) {
					// no exception thrown
					Activator.log.debug("Impossible to find icon with URL " + url);
				}
			}
			Menu topMenu = new Menu(menu);
			topMenuItem.setMenu(topMenu);
			boolean oneDisplayedMenu = false;

			for (org.eclipse.papyrus.infra.newchild.elementcreationmenumodel.Menu currentMenu : folder.getMenu()) {
				boolean result = false;
				if (currentMenu instanceof Folder) {
					result = populateMenu(topMenu, (Folder) currentMenu, selectedObject, topMenu.getItemCount(), adviceCache);
				}

				if (currentMenu instanceof CreationMenu && ((CreationMenu) currentMenu).isVisible()) {
					CreationMenu currentCreationMenu = (CreationMenu) currentMenu;
					EReference reference = null;
					String role = currentCreationMenu.getRole();
					// the role is precised
					if (role != null && !role.isEmpty()) {
						EStructuralFeature feature = selectedObject.eClass().getEStructuralFeature(role);
						if (feature instanceof EReference) {
							reference = (EReference) feature;
							result = constructMenu(selectedObject, topMenu, currentCreationMenu, reference, adviceCache);
						}
					} else {// no precisison
							// test if all roles must be displayed
						if (currentCreationMenu.isDisplayAllRoles()) {
							result = constructMenu(selectedObject, topMenu, currentCreationMenu, adviceCache);
						} else {

							result = constructMenu(selectedObject, topMenu, currentCreationMenu, reference, adviceCache);
						}
					}
				}
				if (result) {
					oneDisplayedMenu = true;
				}
			}
			if (!oneDisplayedMenu) {
				topMenuItem.dispose();
			}
			return oneDisplayedMenu;

		}
		return false;

	}

	/**
	 * create menu by displaying if possible different roles
	 *
	 * @param selectedObject
	 *            the current object
	 * @param menu
	 *            the current menu in creation
	 * @param currentCreationMenu
	 * @param adviceCache
	 * @return true if sub-menu has been created
	 */
	protected boolean constructMenu(EObject selectedObject, Menu menu, CreationMenu currentCreationMenu, Map<?, ?> adviceCache) {
		// find the destination owner
		GetEditContextRequest editContextRequest = new GetEditContextRequest(editingDomain, buildRequest(null, selectedObject, currentCreationMenu, adviceCache), selectedObject);

		editContextRequest.setParameter(IRequestCacheEntries.Cache_Maps, adviceCache);
		editContextRequest.setEditContext(selectedObject);
		try {
			editContextRequest.setClientContext(TypeContext.getContext());
		} catch (ServiceException e) {
			Activator.log.error(e);
			return false;
		}

		IElementEditService provider = ElementEditServiceUtils.getCommandProvider(selectedObject);
		if (provider == null) {
			return false;
		}

		EObject target = selectedObject;
		Object result = null;
		final ICommand getEditContextCommand = provider.getEditCommand(editContextRequest);
		if (getEditContextCommand != null) {
			IStatus status = null;
			try {
				// this command could run in an unprotected transaction, it is not supposed to modify the model
				InternalTransactionalEditingDomain domain = (InternalTransactionalEditingDomain) editingDomain;
				Map<String, Object> options = new HashMap<String, Object>();
				options.put(Transaction.OPTION_NO_NOTIFICATIONS, true);
				options.put(Transaction.OPTION_NO_VALIDATION, true);
				options.put(Transaction.OPTION_NO_TRIGGERS, true);
				Transaction transaction = domain.startTransaction(false, options);
				try {
					status = getEditContextCommand.execute(null, null);
				} finally {
					transaction.commit();
				}
			} catch (InterruptedException e) {
				Activator.log.error(e);
			} catch (ExecutionException e) {
				Activator.log.error(e);
			} catch (RollbackException e) {
				Activator.log.error(e);
			}
			if (!(status == null || !status.isOK())) {
				result = getEditContextCommand.getCommandResult().getReturnValue();
			}
			if (result instanceof EObject) {
				target = (EObject) result;
			}
		}

		// find the feature between children and owner
		ArrayList<EStructuralFeature> possibleEFeatures = getEreferences(target, currentCreationMenu);

		if (possibleEFeatures.size() == 1) {
			Command cmd = buildCommand(null, target, currentCreationMenu, adviceCache);
			if (cmd.canExecute()) {
				MenuItem item = new MenuItem(menu, SWT.NONE);
				fillIcon(currentCreationMenu, item);
				item.setEnabled(true);
				item.setText(currentCreationMenu.getLabel());
				item.addSelectionListener(new CreationMenuListener(cmd, editingDomain));
				return true;
			}
			return false;
		} else if (possibleEFeatures.size() > 1) {
			org.eclipse.swt.widgets.MenuItem topMenuItem = new MenuItem(menu, SWT.CASCADE);
			topMenuItem.setText(currentCreationMenu.getLabel());
			fillIcon(currentCreationMenu, topMenuItem);
			Menu topMenu = new Menu(menu);
			topMenuItem.setMenu(topMenu);
			for (EStructuralFeature eStructuralFeature : possibleEFeatures) {

				Command cmd = buildCommand((EReference) eStructuralFeature, target, currentCreationMenu, adviceCache);
				if (cmd.canExecute()) {
					MenuItem item = new MenuItem(topMenu, SWT.NONE);
					fillIcon(currentCreationMenu, item);
					item.setEnabled(true);
					item.setText("As " + eStructuralFeature.getName());
					item.addSelectionListener(new CreationMenuListener(cmd, editingDomain));
				}

			}
			if (topMenu.getItemCount() == 0) {
				topMenu.dispose();
				return false;
			} else {
				return true;
			}
		} else {
			return false;
		}
	}

	/**
	 * display an icon from a specified url or from Element type
	 *
	 * @param currentCreationMenu
	 * @param item
	 */
	protected void fillIcon(CreationMenu currentCreationMenu, MenuItem item) {
		if (currentCreationMenu.getIcon() != null && !"".equals(currentCreationMenu.getIcon())) {
			URL url;
			try {
				url = new URL(currentCreationMenu.getIcon());
				ImageDescriptor imgDesc = ImageDescriptor.createFromURL(url);
				item.setImage(org.eclipse.papyrus.infra.widgets.Activator.getDefault().getImage(imgDesc));
			} catch (MalformedURLException e) {
				// no icon found
				Activator.log.debug("Impossible to find icon" + e);
			}
		} else {
			createIconFromElementType(currentCreationMenu, item);
		}
	}

	/**
	 * it is used in order calculate all roles that can play an element to another
	 *
	 * @param selectedObject
	 * @param currentCreationMenu
	 * @return return the list of EReference that can be calculated
	 */
	protected ArrayList<EStructuralFeature> getEreferences(EObject selectedObject, CreationMenu currentCreationMenu) {
		ArrayList<EStructuralFeature> possibleEFeatures = new ArrayList<EStructuralFeature>();
		EList<EStructuralFeature> featureList = selectedObject.eClass().getEAllStructuralFeatures();
		Iterator<EStructuralFeature> iterator = featureList.iterator();
		while (iterator.hasNext()) {
			EStructuralFeature eStructuralFeature = iterator.next();
			if (eStructuralFeature instanceof EReference) {
				EReference ref = (EReference) eStructuralFeature;
				if (ref.isContainment()) {
					IElementType menuType = getElementType(currentCreationMenu.getElementTypeIdRef());
					if (menuType != null && isSubClass(ref.getEType(), menuType.getEClass())) {
						possibleEFeatures.add(eStructuralFeature);
					}
				}
			}
		}
		return possibleEFeatures;
	}

	/**
	 * Test if a possibleSub eclass is a sub eclass
	 *
	 * @param aclass
	 *            , cannot be null
	 * @param possibleSubClasse
	 *            , cannot be null
	 * @return true if possible eclass is a subtype of a eclass or false
	 */
	protected boolean isSubClass(EClassifier aclass, EClass possibleSubClasse) {
		if (aclass.equals(possibleSubClasse)) {
			return true;
		}
		EList<EClass> superTypeList = possibleSubClasse.getEAllSuperTypes();
		if (superTypeList.contains(aclass)) {
			return true;
		}
		return false;
	}


	/**
	 * associate the icon from the element type
	 *
	 * @param currentCreationMenu
	 * @param item
	 *            the current menu
	 */
	protected void createIconFromElementType(CreationMenu currentCreationMenu, MenuItem item) {
		URL iconURL = getElementType(currentCreationMenu.getElementTypeIdRef()).getIconURL();
		if (iconURL != null) {
			ImageDescriptor imgDesc = ImageDescriptor.createFromURL(iconURL);
			item.setImage(org.eclipse.papyrus.infra.widgets.Activator.getDefault().getImage(imgDesc));
		}
	}

	/**
	 * create a submenu
	 *
	 * @param selectedObject
	 *            the selected object
	 * @param topMenu
	 *            the menu when will add menus
	 * @param currentCreationMenu
	 * @param reference
	 *            the role of the new element
	 * @param adviceCache
	 * @return true if the menu can be created
	 */
	protected boolean constructMenu(EObject selectedObject, Menu topMenu, CreationMenu currentCreationMenu, EReference reference, Map<?, ?> adviceCache) {
		boolean oneDisplayedMenu = false;
		Command cmd = buildCommand(reference, selectedObject, currentCreationMenu, adviceCache);
		if (cmd.canExecute()) {
			oneDisplayedMenu = true;
			MenuItem item = new MenuItem(topMenu, SWT.NONE);
			fillIcon(currentCreationMenu, item);
			item.setEnabled(true);
			item.setText(currentCreationMenu.getLabel());
			item.addSelectionListener(new CreationMenuListener(cmd, editingDomain));
		}
		return oneDisplayedMenu;
	}

	/**
	 * get the IelementType from a string
	 *
	 * @param extendedType
	 *            the string that represents the element type
	 * @return the element type or null
	 */
	protected IElementType getElementType(String extendedType) {
		return ElementTypeRegistry.getInstance().getType(extendedType);
	}

	/**
	 * Construct a command of creation
	 *
	 * @param reference
	 *            the role of the element that will be created (maybe null)
	 * @param container
	 *            the container of the created elements
	 * @param extendedType
	 *            the extended type of the created element
	 * @return a command that can be executed by the domain
	 */
	protected Command buildCommand(EReference reference, EObject container, CreationMenu creationMenu, Map<?, ?> adviceCache) {
		IElementEditService provider = ElementEditServiceUtils.getCommandProvider(container);
		if (provider == null) {
			return UnexecutableCommand.INSTANCE;
		}

		ICommand createGMFCommand = null;
		if (creationMenu instanceof CreateRelationshipMenu) {
			IElementType elementType = getElementType(creationMenu.getElementTypeIdRef());
			if (elementType != null) {
				IElementEditService serviceProvider = ElementEditServiceUtils.getCommandProvider(elementType);
				TreeSelectorDialog dialog = getTargetTreeSelectorDialog(container, serviceProvider, editingDomain, reference, container, elementType);
				if (dialog != null) {
					createGMFCommand = new SetTargetAndRelationshipCommand(this.editingDomain, "Create " + elementType.getDisplayName(), serviceProvider, reference, container, elementType, dialog);
				}
			}
		} else {
			createGMFCommand = provider.getEditCommand(buildRequest(reference, container, creationMenu, adviceCache));
		}
		
		if (createGMFCommand != null) {
			Command emfCommand = org.eclipse.papyrus.commands.wrappers.GMFtoEMFCommandWrapper.wrap(createGMFCommand);
			return emfCommand;
		}
		return UnexecutableCommand.INSTANCE;
	}

	/**
	 *
	 * @param adviceCache
	 * @return
	 * 		the creation request to use in this handler
	 */
	protected CreateElementRequest buildRequest(EReference reference, EObject container, CreationMenu creationMenu, Map<?, ?> adviceCache) {
		String extendedType = creationMenu.getElementTypeIdRef();
		
		CreateElementRequest request = null;
		if (reference == null) {
			if (creationMenu instanceof CreateRelationshipMenu) {
				request = new CreateRelationshipRequest(editingDomain, null, container, null, getElementType(extendedType));
			} else {
				request = new CreateElementRequest(editingDomain, container, getElementType(extendedType));
			}
		} else {
			if (creationMenu instanceof CreateRelationshipMenu) {
				request = new CreateRelationshipRequest(editingDomain, null,container,null,getElementType(extendedType),reference);
			} else {
				request = new CreateElementRequest(editingDomain, container, getElementType(extendedType), reference);
			}
		}
		request.setParameter(RequestCacheEntries.Cache_Maps, adviceCache);
		return request;
	}

	/**
	 *
	 * @return
	 * 		the creation request to use in this handler
	 */
	protected CreateElementRequest buildRequest(EReference reference, EObject container, CreationMenu creationMenu) {
		String extendedType = creationMenu.getElementTypeIdRef();

		if (reference == null) {
			if (creationMenu instanceof CreateRelationshipMenu) {
				CreateRelationshipRequest createRelationshipRequest = new CreateRelationshipRequest(editingDomain, null, container, null, getElementType(extendedType));
				return createRelationshipRequest;
			} else {
				return new CreateElementRequest(editingDomain, container, getElementType(extendedType));
			}
		} else {
			if (creationMenu instanceof CreateRelationshipMenu) {
				CreateRelationshipRequest createRelationshipRequest = new CreateRelationshipRequest(editingDomain, null, container, null, getElementType(extendedType), reference);
				return createRelationshipRequest;
			} else {
				return new CreateElementRequest(editingDomain, container, getElementType(extendedType), reference);
			}
		}

	}

	/**
	 * Creates a dialog for selecting the target element
	 * 
	 * @param eobject
	 * @param reference
	 * @param extendedType
	 * @param provider
	 * @param container
	 * @param possibleTargets
	 * @param directedRelationship
	 * 
	 * @return the dialog
	 */
	protected TreeSelectorDialog getTargetTreeSelectorDialog(EObject eobject, final IElementEditService provider,
			final TransactionalEditingDomain ted,
			final EReference reference,
			final EObject container,
			final IElementType et) {
		ILabelProvider labelProvider = null;
		try {
			labelProvider = ServiceUtilsForEObject.getInstance().getService(LabelProviderService.class, eobject).getLabelProvider();
		} catch (Exception ex) {
			Activator.log.error("Impossible to get a label provider from object " + eobject, ex);
			return null;
		}

		SemanticUMLContentProvider contentProvider = new SemanticUMLContentProvider(eobject.eResource().getResourceSet()) {
			public boolean isValidValue(Object element) {
				if (element == null) {
					return false;
				}

				EObject eobject = EMFHelper.getEObject(element);

				CreateElementRequest buildRequest = null;
				if (reference == null) {
					buildRequest = new CreateRelationshipRequest(ted, null, container, eobject, et);
				} else {
					buildRequest = new CreateRelationshipRequest(ted, null, container, eobject, et);
				}

				ICommand createGMFCommand = provider.getEditCommand(buildRequest);
				if (createGMFCommand == null) {
					return false;
				}
				boolean canExecute = createGMFCommand.canExecute();
				return canExecute;
			}
		};

		TreeSelectorDialog dialog = new TreeSelectorDialog(Display.getDefault().getActiveShell());
		dialog.setContentProvider(contentProvider);
		dialog.setLabelProvider(labelProvider);
		dialog.setMessage("Choose the target element");
		dialog.setTitle("Target Element Selection");
		dialog.setInput(org.eclipse.emf.ecore.util.EcoreUtil.getRootContainer(eobject));
		return dialog;
	}
}
