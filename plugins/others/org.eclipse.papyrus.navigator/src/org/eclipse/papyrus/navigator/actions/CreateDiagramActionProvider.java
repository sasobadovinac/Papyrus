/*******************************************************************************
 * Copyright (c) 2009 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *     Tristan Faure (Atos Origin) tristan.faure@atosorigin.com - add condition to the create command (task #296902)
 *******************************************************************************/
package org.eclipse.papyrus.navigator.actions;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.papyrus.infra.core.extension.commands.CreationCommandDescriptor;
import org.eclipse.papyrus.infra.core.extension.commands.CreationCommandRegistry;
import org.eclipse.papyrus.infra.core.extension.commands.ICreationCommandRegistry;

/**
 * Provider used to create a new diagram actions
 * 
 * @author <a href="mailto:jerome.benois@obeo.fr">Jerome Benois</a>
 */
public class CreateDiagramActionProvider extends AbstractSubmenuActionProvider {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void fillContextMenu(IMenuManager menu) {
		Object selectedElement = getFirstSelectedElement();
		if(selectedElement instanceof EObject) {
			EObject eObject = (EObject)selectedElement;
			MenuManager newDiagramMenu = new MenuManager("New Diagram");
			menu.add(newDiagramMenu);
			for(CreationCommandDescriptor desc : getCreationCommandRegistry().getCommandDescriptors()) {
				if(desc.getCondition() == null || desc.getCondition().create(eObject)) {
					CreateDiagramAction createDiagramAction = new CreateDiagramAction(eObject, desc);
					newDiagramMenu.add(createDiagramAction);
				}
			}
		}
	}

	private ICreationCommandRegistry getCreationCommandRegistry() {
		return CreationCommandRegistry.getInstance(org.eclipse.papyrus.infra.core.Activator.PLUGIN_ID);
	}

}
