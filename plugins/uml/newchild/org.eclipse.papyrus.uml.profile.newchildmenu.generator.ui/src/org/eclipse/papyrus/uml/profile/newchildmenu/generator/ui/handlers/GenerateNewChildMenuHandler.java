/*****************************************************************************
 * Copyright (c) 2015 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Onder Gurcan (Onder.Gurcan@cea.fr) - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.profile.newchildmenu.generator.ui.handlers;

import java.net.URI;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.papyrus.uml.profile.newchildmenu.generator.NewChildMenuGenerator;
import org.eclipse.ui.handlers.HandlerUtil;


public class GenerateNewChildMenuHandler implements IHandler {

	@Override
	public void addHandlerListener(IHandlerListener handlerListener) {
	}

	@Override
	public void dispose() {
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection sselection = (IStructuredSelection) selection;
			if (!sselection.isEmpty()) {
				Object selectedElement = sselection.getFirstElement();
				if (selectedElement instanceof IFile) {
					IFile selectedFile = (IFile) selectedElement;
					String fileExtension = selectedFile.getFileExtension();
					if (fileExtension.equals("elementtypesconfigurations")) {
						URI uri = selectedFile.getLocationURI();
						String filePath = uri.toString();
						IContainer parentFolder = selectedFile.getParent();
						URI uri2 = parentFolder.getLocationURI();
						String folderPath = uri2.toString();
						new NewChildMenuGenerator().generate(folderPath, filePath);
					}
				}
			}
		}
		return null;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public boolean isHandled() {
		return true;
	}

	@Override
	public void removeHandlerListener(IHandlerListener handlerListener) {
	}

}