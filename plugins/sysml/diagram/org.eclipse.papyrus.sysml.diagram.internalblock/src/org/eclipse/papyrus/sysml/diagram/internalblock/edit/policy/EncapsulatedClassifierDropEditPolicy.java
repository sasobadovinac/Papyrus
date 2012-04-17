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
 *
 *****************************************************************************/
package org.eclipse.papyrus.sysml.diagram.internalblock.edit.policy;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.DropObjectsRequest;
import org.eclipse.papyrus.infra.gmfdiag.common.commands.SelectAndExecuteCommand;
import org.eclipse.papyrus.sysml.diagram.internalblock.utils.TypeDropHelper;
import org.eclipse.papyrus.sysml.service.types.element.SysMLElementTypes;
import org.eclipse.ui.PlatformUI;

/** 
 * <pre>
 * Customization of the DND edit policy for the EncapsulatedClassifier, that enables the direct
 * creation of typed Port or FlowPort by dragging types over diagram figure.
 * </pre> 
 */
public class EncapsulatedClassifierDropEditPolicy extends CustomDragDropEditPolicy {

	/** Default constructor */
	public EncapsulatedClassifierDropEditPolicy() {
		super();
	}

	/**
	 * {@inheritedDoc}.
	 */
	@Override
	public Command getDropObjectsCommand(DropObjectsRequest dropRequest) {

		TypeDropHelper helper = new TypeDropHelper(getEditingDomain());
		
		// Single drop management possible drop action list can be proposed
		if(dropRequest.getObjects().size() == 1) {
		
			// List of available drop commands
			List<Command> commandChoice = new ArrayList<Command>();
			
			// 1. Try to create a Port typed by the dropped object
			Command dropAsTypedPort = helper.getDropAsTypedPort(dropRequest, (GraphicalEditPart)getHost());
			if ((dropAsTypedPort != null) && (dropAsTypedPort.canExecute())) {
				commandChoice.add(dropAsTypedPort);
			}
			
			// 2. Try to create a FlowPort (In - Out - InOut) typed by the dropped object 
			Command dropAsTypedFlowPort_In = helper.getDropAsTypedFlowPort(dropRequest, (GraphicalEditPart)getHost(), SysMLElementTypes.FLOW_PORT);
			if ((dropAsTypedFlowPort_In != null) && (dropAsTypedFlowPort_In.canExecute())) {
				commandChoice.add(dropAsTypedFlowPort_In);
			}
			Command dropAsTypedFlowPort_Out = helper.getDropAsTypedFlowPort(dropRequest, (GraphicalEditPart)getHost(), SysMLElementTypes.FLOW_PORT_IN);
			if ((dropAsTypedFlowPort_Out != null) && (dropAsTypedFlowPort_Out.canExecute())) {
				commandChoice.add(dropAsTypedFlowPort_Out);
			}
			Command dropAsTypedFlowPort_InOut = helper.getDropAsTypedFlowPort(dropRequest, (GraphicalEditPart)getHost(), SysMLElementTypes.FLOW_PORT_OUT);
			if ((dropAsTypedFlowPort_InOut != null) && (dropAsTypedFlowPort_InOut.canExecute())) {
				commandChoice.add(dropAsTypedFlowPort_InOut);
			}
			
			// 3. Build default drop command (show view of the dropped object)
			Command defaultDropCommand = super.getDropObjectsCommand(dropRequest);
			defaultDropCommand.setLabel("Default drop (Show dropped object in diagram)");
			if ((defaultDropCommand != null) && (defaultDropCommand.canExecute())) {
				commandChoice.add(defaultDropCommand);
			}
			
			// Prepare the selection command (if several command are available) or return the drop command
			if (commandChoice.size() > 1) {
				SelectAndExecuteCommand selectCommand = new SelectAndExecuteCommand("Select drop action for ", PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), commandChoice);
				return new ICommandProxy(selectCommand);
			
			} else if (commandChoice.size() == 1) {
				return commandChoice.get(0);
			}
			
			// else (command choice is empty)
			return UnexecutableCommand.INSTANCE;

		}

		return super.getDropObjectsCommand(dropRequest);
	}
}
