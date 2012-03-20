/*****************************************************************************
 * Copyright (c) 2012 Atos .
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Arthur daussy - arthur.daussy@atos.net - 374607: [model explorer] moving a model element in another model does not move associated diagrams
 *
 **/
package org.eclipse.papyrus.diagram.common.commands;

import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.papyrus.diagram.common.Activator;

/**
 * Command to move a diagram from a resource to another
 * @author arthur daussy
 *
 */
public class MoveDiagramCommand extends AbstractTransactionalCommand {
	/**
	 * Containing resource
	 */
	private Resource newContainingRessource;
	/**
	 * The diagram to move
	 */
	private Diagram diagram;

	public MoveDiagramCommand(TransactionalEditingDomain domain, String label, Diagram diagram, Resource newContainingRessource) {
		super(domain, label,null);
		this.diagram = diagram;
		this.newContainingRessource = newContainingRessource;
		/*
		 * set modified list file
		 */
		List<?> notations = getWorkspaceFiles(diagram);
		getAffectedFiles().addAll(notations);
		getAffectedFiles().add(WorkspaceSynchronizer.getFile(newContainingRessource));
	}

	private static IStatus errorStatus = new Status(IStatus.ERROR, Activator.ID, "Unable to add diagram to new ressource");////$NON-NLS-1$
	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		EList<EObject> contents = newContainingRessource.getContents();
		if (contents == null){
			return new CommandResult(errorStatus);
		}
		contents.add(diagram);
		return CommandResult.newOKCommandResult();
	}
}
