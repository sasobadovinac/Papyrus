/*****************************************************************************
 * Copyright (c) 2010 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Patrick Tessier (CEA LIST) Patrick.tessier@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.sysml.service.types.helper;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.ConfigureElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.papyrus.sysml.blocks.BlocksPackage;
import org.eclipse.papyrus.sysml.service.types.utils.NamedElementHelper;
import org.eclipse.papyrus.sysml.util.SysmlResource;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Stereotype;

/** SysML Block edit helper advice */
public class BlockEditHelperAdvice extends AbstractStereotypedElementEditHelperAdvice {

	/** Default constructor */
	public BlockEditHelperAdvice() {
		requiredProfileIDs.add(SysmlResource.BLOCKS_ID);
	}

	/** Complete creation process by applying the expected stereotype */
	@Override
	protected ICommand getAfterConfigureCommand(final ConfigureRequest request) {

		return new ConfigureElementCommand(request) {

			protected CommandResult doExecuteWithResult(IProgressMonitor progressMonitor, IAdaptable info) throws ExecutionException {
				NamedElement element = (NamedElement)request.getElementToConfigure();
				if(element != null) {
					Stereotype blockSt = element.getApplicableStereotype(SysmlResource.BLOCK_ID);
					if(blockSt != null) {
						element.applyStereotype(blockSt);
					}

					// Set default name
					// Initialize the element name based on the created IElementType
					String initializedName = NamedElementHelper.EINSTANCE.getNewUMLElementName(element.getOwner(), BlocksPackage.eINSTANCE.getBlock());
					element.setName(initializedName);
				}
				return CommandResult.newOKCommandResult();
			}
		};
	}
}
