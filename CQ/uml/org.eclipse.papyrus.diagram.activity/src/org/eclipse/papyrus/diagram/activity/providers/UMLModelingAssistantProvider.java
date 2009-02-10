/*******************************************************************************
 * Copyright (c) 2008 
 * Conselleria de Infraestructuras y Transporte, Generalitat de la Comunitat Valenciana .
 * All rights reserved. This program
 * and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is
 * available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *	  Francisco Javier Cano Muñoz (Prodevelop) - initial API implementation
 ******************************************************************************/
package org.eclipse.papyrus.diagram.activity.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantProvider;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.papyrus.diagram.activity.edit.parts.AcceptEventAction2EditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.AcceptEventActionEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ActivityEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ActivityPartitionActivityPartitionCompartment2EditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ActivityPartitionActivityPartitionCompartmentEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ActivitySubverticesEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.CallBehaviorActionEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.CallOperationActionEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.CommentEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.CreateObjectActionEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.OpaqueAction2EditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.OpaqueActionEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.PackageEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.SendObjectActionEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.SendSignalActionEditPart;
import org.eclipse.papyrus.diagram.activity.part.Messages;
import org.eclipse.papyrus.diagram.activity.part.UMLDiagramEditorPlugin;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

/**
 * @generated
 */
public class UMLModelingAssistantProvider extends ModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof ActivityEditPart) {
			List types = new ArrayList();
			types.add(UMLElementTypes.ActivityParameterNode_2029);
			return types;
		}
		if (editPart instanceof SendObjectActionEditPart) {
			List types = new ArrayList();
			types.add(UMLElementTypes.InputPin_2002);
			types.add(UMLElementTypes.InputPin_2003);
			types.add(UMLElementTypes.ValuePin_2004);
			return types;
		}
		if (editPart instanceof SendSignalActionEditPart) {
			List types = new ArrayList();
			types.add(UMLElementTypes.InputPin_2006);
			return types;
		}
		if (editPart instanceof AcceptEventActionEditPart) {
			List types = new ArrayList();
			types.add(UMLElementTypes.OutputPin_2008);
			return types;
		}
		if (editPart instanceof OpaqueActionEditPart) {
			List types = new ArrayList();
			types.add(UMLElementTypes.OutputPin_2015);
			types.add(UMLElementTypes.InputPin_2016);
			types.add(UMLElementTypes.ValuePin_2017);
			return types;
		}
		if (editPart instanceof CreateObjectActionEditPart) {
			List types = new ArrayList();
			types.add(UMLElementTypes.OutputPin_2023);
			return types;
		}
		if (editPart instanceof CallBehaviorActionEditPart) {
			List types = new ArrayList();
			types.add(UMLElementTypes.OutputPin_2025);
			types.add(UMLElementTypes.InputPin_2026);
			return types;
		}
		if (editPart instanceof CallOperationActionEditPart) {
			List types = new ArrayList();
			types.add(UMLElementTypes.OutputPin_2025);
			types.add(UMLElementTypes.InputPin_2026);
			types.add(UMLElementTypes.InputPin_2028);
			return types;
		}
		if (editPart instanceof OpaqueAction2EditPart) {
			List types = new ArrayList();
			types.add(UMLElementTypes.OutputPin_2015);
			types.add(UMLElementTypes.InputPin_2016);
			types.add(UMLElementTypes.ValuePin_2017);
			return types;
		}
		if (editPart instanceof AcceptEventAction2EditPart) {
			List types = new ArrayList();
			types.add(UMLElementTypes.OutputPin_2008);
			return types;
		}
		if (editPart instanceof ActivitySubverticesEditPart) {
			List types = new ArrayList();
			types.add(UMLElementTypes.SendObjectAction_2001);
			types.add(UMLElementTypes.SendSignalAction_2005);
			types.add(UMLElementTypes.AcceptEventAction_2007);
			types.add(UMLElementTypes.ActivityFinalNode_2009);
			types.add(UMLElementTypes.DecisionNode_2010);
			types.add(UMLElementTypes.MergeNode_2011);
			types.add(UMLElementTypes.InitialNode_2012);
			types.add(UMLElementTypes.DataStoreNode_2013);
			types.add(UMLElementTypes.OpaqueAction_2014);
			types.add(UMLElementTypes.FlowFinalNode_2018);
			types.add(UMLElementTypes.ForkNode_2019);
			types.add(UMLElementTypes.JoinNode_2020);
			types.add(UMLElementTypes.Pin_2021);
			types.add(UMLElementTypes.CreateObjectAction_2022);
			types.add(UMLElementTypes.CallBehaviorAction_2024);
			types.add(UMLElementTypes.CallOperationAction_2027);
			types.add(UMLElementTypes.ActivityPartition_2030);
			return types;
		}
		if (editPart instanceof ActivityPartitionActivityPartitionCompartmentEditPart) {
			List types = new ArrayList();
			types.add(UMLElementTypes.ActivityPartition_2031);
			types.add(UMLElementTypes.OpaqueAction_2032);
			types.add(UMLElementTypes.SendObjectAction_2001);
			types.add(UMLElementTypes.SendSignalAction_2005);
			types.add(UMLElementTypes.AcceptEventAction_2033);
			types.add(UMLElementTypes.ActivityFinalNode_2009);
			types.add(UMLElementTypes.DecisionNode_2010);
			types.add(UMLElementTypes.MergeNode_2011);
			types.add(UMLElementTypes.InitialNode_2012);
			types.add(UMLElementTypes.DataStoreNode_2013);
			types.add(UMLElementTypes.FlowFinalNode_2018);
			types.add(UMLElementTypes.ForkNode_2019);
			types.add(UMLElementTypes.JoinNode_2020);
			types.add(UMLElementTypes.Pin_2021);
			types.add(UMLElementTypes.CreateObjectAction_2022);
			types.add(UMLElementTypes.CallBehaviorAction_2024);
			types.add(UMLElementTypes.CallOperationAction_2027);
			return types;
		}
		if (editPart instanceof ActivityPartitionActivityPartitionCompartment2EditPart) {
			List types = new ArrayList();
			types.add(UMLElementTypes.ActivityPartition_2031);
			types.add(UMLElementTypes.OpaqueAction_2032);
			types.add(UMLElementTypes.SendObjectAction_2001);
			types.add(UMLElementTypes.SendSignalAction_2005);
			types.add(UMLElementTypes.AcceptEventAction_2033);
			types.add(UMLElementTypes.ActivityFinalNode_2009);
			types.add(UMLElementTypes.DecisionNode_2010);
			types.add(UMLElementTypes.MergeNode_2011);
			types.add(UMLElementTypes.InitialNode_2012);
			types.add(UMLElementTypes.DataStoreNode_2013);
			types.add(UMLElementTypes.FlowFinalNode_2018);
			types.add(UMLElementTypes.ForkNode_2019);
			types.add(UMLElementTypes.JoinNode_2020);
			types.add(UMLElementTypes.Pin_2021);
			types.add(UMLElementTypes.CreateObjectAction_2022);
			types.add(UMLElementTypes.CallBehaviorAction_2024);
			types.add(UMLElementTypes.CallOperationAction_2027);
			return types;
		}
		if (editPart instanceof PackageEditPart) {
			List types = new ArrayList();
			types.add(UMLElementTypes.Activity_1001);
			types.add(UMLElementTypes.Comment_2034);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	@Override
	public List getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof CommentEditPart) {
			List types = new ArrayList();
			types.add(UMLElementTypes.CommentAnnotatedElement_3006);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	@Override
	public List getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof CommentEditPart) {
			List types = new ArrayList();
			types.add(UMLElementTypes.ElementOwnedComment_3005);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	@Override
	public List getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof CommentEditPart) {
			List types = new ArrayList();
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	@Override
	public List getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof CommentEditPart) {
			List types = new ArrayList();
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	@Override
	public List getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof CommentEditPart) {
			List types = new ArrayList();
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	@Override
	public EObject selectExistingElementForSource(IAdaptable target, IElementType relationshipType) {
		return selectExistingElement(target, getTypesForSource(target, relationshipType));
	}

	/**
	 * @generated
	 */
	@Override
	public EObject selectExistingElementForTarget(IAdaptable source, IElementType relationshipType) {
		return selectExistingElement(source, getTypesForTarget(source, relationshipType));
	}

	/**
	 * @generated
	 */
	protected EObject selectExistingElement(IAdaptable host, Collection types) {
		if (types.isEmpty()) {
			return null;
		}
		IGraphicalEditPart editPart = (IGraphicalEditPart) host.getAdapter(IGraphicalEditPart.class);
		if (editPart == null) {
			return null;
		}
		Diagram diagram = (Diagram) editPart.getRoot().getContents().getModel();
		Collection elements = new HashSet();
		for (Iterator it = diagram.getElement().eAllContents(); it.hasNext();) {
			EObject element = (EObject) it.next();
			if (isApplicableElement(element, types)) {
				elements.add(element);
			}
		}
		if (elements.isEmpty()) {
			return null;
		}
		return selectElement((EObject[]) elements.toArray(new EObject[elements.size()]));
	}

	/**
	 * @generated
	 */
	protected boolean isApplicableElement(EObject element, Collection types) {
		IElementType type = ElementTypeRegistry.getInstance().getElementType(element);
		return types.contains(type);
	}

	/**
	 * @generated
	 */
	protected EObject selectElement(EObject[] elements) {
		Shell shell = Display.getCurrent().getActiveShell();
		ILabelProvider labelProvider = new AdapterFactoryLabelProvider(UMLDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(shell, labelProvider);
		dialog.setMessage(Messages.UMLModelingAssistantProviderMessage);
		dialog.setTitle(Messages.UMLModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
