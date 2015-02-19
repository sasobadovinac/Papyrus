/*****************************************************************************
 * Copyright (c) 2015 CEA LIST and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Patrik Nandorf (Ericsson AB) - Initial API and implementation
 *   
 *****************************************************************************/

package org.eclipse.papyrus.infra.newchild;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.AbstractCommand;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.core.command.UnexecutableCommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.jface.window.Window;
import org.eclipse.papyrus.commands.wrappers.GMFtoEMFCommandWrapper;
import org.eclipse.papyrus.infra.services.edit.service.IElementEditService;
import org.eclipse.papyrus.infra.widgets.editors.ITreeSelectorDialog;

public class SetTargetAndRelationshipCommand extends AbstractCommand {
	private IElementEditService provider;
	private EReference reference;
	private EObject source;
	private ITreeSelectorDialog dialog;
	private IElementType elementType;
	private TransactionalEditingDomain ted;
	private GMFtoEMFCommandWrapper emfCommand;

	/**
	 * Constructor.
	 *
	 * @param label
	 * @param creationMenuFactory 
	 */
	public SetTargetAndRelationshipCommand(TransactionalEditingDomain ted, String label, IElementEditService provider, EReference reference, EObject source, IElementType et,ITreeSelectorDialog dialog) { //CreationMenu creationMenu){
		super(label);
		this.provider = provider;
		this.reference = reference;
		this.source = source;
		this.elementType = et;
		this.ted = ted;
		this.dialog = dialog;
	}

	/**
	 * @see org.eclipse.emf.common.command.AbstractCommand#canExecute()
	 *
	 * @return
	 */
	@Override
	public boolean canExecute() {
		CreateElementRequest buildRequest = buildRequest(null); //this.creationMenuFactory.buildRequest(reference, container, creationMenu);		
		ICommand createGMFCommand = provider.getEditCommand(buildRequest);
		if (createGMFCommand == null) {
			return false;
		}
		boolean canExecute = createGMFCommand.canExecute();
		return canExecute;
	}

	/**
	 * @see org.eclipse.gmf.runtime.common.core.command.AbstractCommand#doExecuteWithResult(org.eclipse.core.runtime.IProgressMonitor, org.eclipse.core.runtime.IAdaptable)
	 *
	 * @param progressMonitor
	 * @param info
	 * @return
	 * @throws ExecutionException
	 */
	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor progressMonitor, IAdaptable info) throws ExecutionException {
		int returnCode = dialog.open();
		if (Window.OK == returnCode) {
			Object[] targetComponents = dialog.getResult();
			EObject element = (EObject) targetComponents[0];

			CreateElementRequest buildRequest = buildRequest(element);

			ICommand createGMFCommand = provider.getEditCommand(buildRequest);
			if (createGMFCommand == null || createGMFCommand instanceof UnexecutableCommand) {
				return CommandResult.newCancelledCommandResult();
			}

			emfCommand = new org.eclipse.papyrus.commands.wrappers.GMFtoEMFCommandWrapper(createGMFCommand);
			emfCommand.execute();
//			ted.getCommandStack().execute(emfCommand);
			CommandResult commandResult = createGMFCommand.getCommandResult();
			return commandResult;
		} 
		return CommandResult.newCancelledCommandResult();
	}

	/**
	 * @param element
	 * @return
	 */
	private CreateElementRequest buildRequest(EObject element) {
		//Build request
		CreateElementRequest buildRequest = null;
		if (reference == null) {
			buildRequest = new CreateRelationshipRequest(ted, null,source,element,elementType);
		} else {
			buildRequest = new CreateRelationshipRequest(ted, null,source,element,elementType,reference);
		}
		return buildRequest;
	}

	/**
	 * @see org.eclipse.gmf.runtime.common.core.command.AbstractCommand#doRedoWithResult(org.eclipse.core.runtime.IProgressMonitor, org.eclipse.core.runtime.IAdaptable)
	 *
	 * @param progressMonitor
	 * @param info
	 * @return
	 * @throws ExecutionException
	 */
	@Override
	protected CommandResult doRedoWithResult(IProgressMonitor progressMonitor, IAdaptable info) throws ExecutionException {
		emfCommand.redo();
		return null;
	}

	/**
	 * @see org.eclipse.gmf.runtime.common.core.command.AbstractCommand#doUndoWithResult(org.eclipse.core.runtime.IProgressMonitor, org.eclipse.core.runtime.IAdaptable)
	 *
	 * @param progressMonitor
	 * @param info
	 * @return
	 * @throws ExecutionException
	 */
	@Override
	protected CommandResult doUndoWithResult(IProgressMonitor progressMonitor, IAdaptable info) throws ExecutionException {
		emfCommand.undo();
		return null;		
	}
	
	/**
	 * @see org.eclipse.core.commands.operations.AbstractOperation#canUndo()
	 *
	 * @return
	 */
	@Override
	public boolean canUndo() {
		return emfCommand != null;
	}
	
	
	/**
	 * @see org.eclipse.core.commands.operations.AbstractOperation#canRedo()
	 *
	 * @return
	 */
	@Override
	public boolean canRedo() {
		return emfCommand != null;
	}
	
}