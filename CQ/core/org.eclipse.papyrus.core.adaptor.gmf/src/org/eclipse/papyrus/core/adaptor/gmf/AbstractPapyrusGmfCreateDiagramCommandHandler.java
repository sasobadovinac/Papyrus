/*****************************************************************************
 * Copyright (c) 2008 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Cedric Dumoulin  Cedric.dumoulin@lifl.fr - Initial API and implementation
 *
  *****************************************************************************/
package org.eclipse.papyrus.core.adaptor.gmf;

import java.util.Collections;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.papyrus.core.editor.BackboneContext;
import org.eclipse.papyrus.core.editor.IMultiDiagramEditor;
import org.eclipse.papyrus.core.multidiagram.SashDiagramModelUtil;
import org.eclipse.papyrus.core.utils.DiResourceSet;
import org.eclipse.papyrus.di.CoreSemanticModelBridge;
import org.eclipse.papyrus.di.DiFactory;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.uml2.diagram.clazz.part.Messages;
import org.eclipse.uml2.diagram.clazz.part.UMLDiagramEditorPlugin;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.UMLFactory;

/**
 * Command creating a new GMF diagram in Papyrus. This command is intended to be used in eclipse extensions. This command is to be used with Editors using Context.
 * 
 * @author dumoulin
 * @author <a href="mailto:jerome.benois@obeo.fr">Jerome Benois</a>
 */
public abstract class AbstractPapyrusGmfCreateDiagramCommandHandler extends AbstractHandler implements IHandler {

	/**
	 * Method called when the command is invoked.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {

		BackboneContext context;
		try {
			context = getDefaultContext();
		} catch (ClassCastException ex) {
			// Bad current editor. Skip
			throw new ExecutionException("Current editor type not supported.", ex);
		}
		Element container = null;
		// if editor is open and active
		if (getMultiDiagramEditor() != null) {
			container = getSelectedUmlElement();
		}
		runAsTransaction(context, container);
		return null;
	}

	/**
	 * Create a new class diagram
	 */
	protected void runAsTransaction(BackboneContext sharedObjects, Element container) {
		DiResourceSet diResourceSet = sharedObjects.getResourceSet();
		runAsTransaction(diResourceSet, container);
	}

	/**
	 * Create a new class diagram
	 */
	protected void runAsTransaction(final DiResourceSet diResourceSet, final Element container) {
		final String diagramName = getDiagramName();
		if (diagramName != null) {
			final Resource modelResource = diResourceSet.getUMLModelResource();
			final Resource diagramResource = diResourceSet.getNotationResource();
			final Resource diResource = diResourceSet.getDiResource();
			// TODO: get the appropriate value from diResourceSet
			TransactionalEditingDomain editingDomain = diResourceSet.getTransactionalEditingDomain();

			AbstractTransactionalCommand command = new AbstractTransactionalCommand(editingDomain, Messages.UMLDiagramEditorUtil_CreateDiagramCommandLabel, Collections.EMPTY_LIST) {

				protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
					Element model = container;
					if (model == null) {
						model = getModel(modelResource);
						attachModelToResource(model, modelResource);
					}

					Diagram diagram = ViewService.createDiagram(model, getDiagramNotationID(), getPreferenceHint());
					if (diagram != null) {
						diagram.setName(diagramName);
						diagram.setElement(model);
						diagramResource.getContents().add(diagram);
					}

					// Add element to di2
					// org.eclipse.papyrus.di.Diagram diDiagram = createDi2GmfDiagram(diagram);
					// diResource.getContents().add(diDiagram);
					SashDiagramModelUtil.openDiagramInCurrentFolder(diResource, diagram);

					return CommandResult.newOKCommandResult();
				}
			};
			try {
				OperationHistoryFactory.getOperationHistory().execute(command, new NullProgressMonitor(), null);
			} catch (ExecutionException e) {
				e.printStackTrace();
				UMLDiagramEditorPlugin.getInstance().logError("Unable to create model and diagram", e); //$NON-NLS-1$
			}
		}
	}

	/**
	 * Create a di2 diagram referencing the notation diagram.
	 * 
	 * @param notationDiagram
	 * @return
	 */
	protected org.eclipse.papyrus.di.Diagram createDi2GmfDiagram(Diagram notationDiagram) {
		org.eclipse.papyrus.di.Diagram diDiagram = DiFactory.eINSTANCE.createDiagram();
		CoreSemanticModelBridge bridge = DiFactory.eINSTANCE.createCoreSemanticModelBridge();
		bridge.setElement(notationDiagram);

		diDiagram.setName(notationDiagram.getName());
		diDiagram.setSemanticModel(bridge);
		diDiagram.setType(GmfEditorFactory.GMF_DIAGRAM);
		diDiagram.setIsVisible(true);

		return diDiagram;
	}

	/**
	 * Get the instance of domain element associated with canvas.
	 */
	protected Element getModel(Resource modelResource) {
		if (modelResource != null && modelResource.getContents() != null) {
			if (modelResource.getContents().size() > 0) {
				Object root = modelResource.getContents().get(0);
				if (root instanceof Element) {
					return (Element) root;
				}
			}
		}
		return UMLFactory.eINSTANCE.createModel();
	}

	/**
	 * Store model element in the resource.
	 */
	protected void attachModelToResource(Element model, Resource resource) {
		resource.getContents().add(model);
	}

	/**
	 * @return
	 */
	abstract protected String getDiagramNotationID();

	/**
	 * @return
	 */
	abstract protected PreferencesHint getPreferenceHint();

	/**
	 * Get the name used for diagram.
	 * 
	 * @return
	 */
	abstract protected String getDiagramName();

	/**
	 * Get currently selected UML element.
	 * 
	 * @return The currently selected UML element, or null if any.
	 */
	protected NamedElement getSelectedUmlElement() {

		Object selected = getCurrentSelection();
		if (selected == null)
			return null;
		return (NamedElement) getDefaultContext().getModelResolver().getBussinessModel(selected);
	}

	/**
	 * Get current selection first element.
	 * 
	 * @return the selected element or null.
	 */
	private Object getCurrentSelection() {
		ISelection selection = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService().getSelection();
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			return structuredSelection.getFirstElement();
		}

		return null;
	}

	/**
	 * Create a diagram.
	 * 
	 * @param umlOwner
	 * @param name
	 * @param type
	 * @return
	 */
	protected Diagram createDiagram(Element umlOwner, String name, String type) {
		// create diagram
		Diagram diagram = null;

		return diagram;
	}

	/**
	 * Get the current MultiDiagramEditor.
	 * 
	 * @return
	 */
	protected IMultiDiagramEditor getMultiDiagramEditor() {
		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		IEditorPart editorPart = page.getActiveEditor();
		return (IMultiDiagramEditor) editorPart;
	}

	/**
	 * Get the shared object.
	 * 
	 * @return
	 */
	protected BackboneContext getDefaultContext() {
		IMultiDiagramEditor editor = getMultiDiagramEditor();
		return (BackboneContext) editor.getDefaultContext();
	}

	/**
	 * Open popup to enter the new diagram name
	 * 
	 * @param defaultValue
	 *            the default value
	 * @return the entered diagram name
	 */
	protected String openDiagramNameDialog(final String defaultValue) {
		InputDialog inputDialog = new InputDialog(Display.getCurrent().getActiveShell(), "Enter a new diagram name", "The new diagram name:", defaultValue, null);
		int ret = inputDialog.open();
		if (ret == Window.OK) {
			String name = inputDialog.getValue();
			if (name == null || name.length() == 0) {
				name = defaultValue;
			}
			return name;
		} else {
			return null;
		}
	}

}
