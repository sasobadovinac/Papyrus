/*****************************************************************************
 * Copyright (c) 2010 Atos Origin.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Atos Origin - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.activity.edit.policies;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.commands.wrappers.EMFtoGMFCommandWrapper;
import org.eclipse.papyrus.infra.extendedtypes.types.IExtendedHintedElementType;
import org.eclipse.papyrus.infra.extendedtypes.util.ElementTypeUtils;
import org.eclipse.papyrus.uml.diagram.activity.edit.commands.CommentLinkCreateCommand;
import org.eclipse.papyrus.uml.diagram.activity.edit.commands.CommentLinkReorientCommand;
import org.eclipse.papyrus.uml.diagram.activity.edit.commands.ControlFlowCreateCommand;
import org.eclipse.papyrus.uml.diagram.activity.edit.commands.ControlFlowReorientCommand;
import org.eclipse.papyrus.uml.diagram.activity.edit.commands.ExceptionHandlerCreateCommand;
import org.eclipse.papyrus.uml.diagram.activity.edit.commands.ExceptionHandlerReorientCommand;
import org.eclipse.papyrus.uml.diagram.activity.edit.commands.ObjectFlowCreateCommand;
import org.eclipse.papyrus.uml.diagram.activity.edit.commands.ObjectFlowReorientCommand;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.CommentLinkEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.ControlFlowEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.ExceptionHandlerEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.ObjectFlowEditPart;
import org.eclipse.papyrus.uml.diagram.activity.providers.UMLElementTypes;

/**
 * @generated
 */
public class ValuePinInSendObjActAsTargetItemSemanticEditPolicy extends UMLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ValuePinInSendObjActAsTargetItemSemanticEditPolicy() {
		super(UMLElementTypes.ValuePin_3049);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View)getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(true);
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if(annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			List<EObject> todestroy = new ArrayList<EObject>();
			todestroy.add(req.getElementToDestroy());
			//cmd.add(new org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand(req));
			cmd.add(new EMFtoGMFCommandWrapper(new org.eclipse.emf.edit.command.DeleteCommand(getEditingDomain(), todestroy)));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req) : getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(CreateRelationshipRequest req) {
		IElementType requestElementType = req.getElementType();
		if(requestElementType == null) {
			return null;
		}
		IElementType baseElementType = requestElementType;
		boolean isExtendedType = false;
		if(requestElementType instanceof IExtendedHintedElementType) {
			baseElementType = ElementTypeUtils.getClosestDiagramType(requestElementType);
			if(baseElementType != null) {
				isExtendedType = true;
			} else {
				// no reference element type ID. using the closest super element type to give more opportunities, but can lead to bugs.
				baseElementType = ElementTypeUtils.findClosestNonExtendedElementType((IExtendedHintedElementType)requestElementType);
				isExtendedType = true;
			}
		}
		if(UMLElementTypes.ObjectFlow_4003 == baseElementType) {
			if(isExtendedType) {
				return getExtendedStartCreateRelationshipCommand(req, (IExtendedHintedElementType)requestElementType);
			}
			return getGEFWrapper(new ObjectFlowCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if(UMLElementTypes.ControlFlow_4004 == baseElementType) {
			if(isExtendedType) {
				return getExtendedStartCreateRelationshipCommand(req, (IExtendedHintedElementType)requestElementType);
			}
			return getGEFWrapper(new ControlFlowCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if(UMLElementTypes.ExceptionHandler_4005 == baseElementType) {
			return null;
		}
		if(UMLElementTypes.CommentAnnotatedElement_4006 == baseElementType) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		IElementType requestElementType = req.getElementType();
		if(requestElementType == null) {
			return null;
		}
		IElementType baseElementType = requestElementType;
		boolean isExtendedType = false;
		if(requestElementType instanceof IExtendedHintedElementType) {
			baseElementType = ElementTypeUtils.getClosestDiagramType(requestElementType);
			if(baseElementType != null) {
				isExtendedType = true;
			} else {
				// no reference element type ID. using the closest super element type to give more opportunities, but can lead to bugs.
				baseElementType = ElementTypeUtils.findClosestNonExtendedElementType((IExtendedHintedElementType)requestElementType);
				isExtendedType = true;
			}
		}
		if(UMLElementTypes.ObjectFlow_4003 == baseElementType) {
			if(isExtendedType) {
				return getExtendedCompleteCreateRelationshipCommand(req, (IExtendedHintedElementType)requestElementType);
			}
			return getGEFWrapper(new ObjectFlowCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if(UMLElementTypes.ControlFlow_4004 == baseElementType) {
			if(isExtendedType) {
				return getExtendedCompleteCreateRelationshipCommand(req, (IExtendedHintedElementType)requestElementType);
			}
			return getGEFWrapper(new ControlFlowCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if(UMLElementTypes.ExceptionHandler_4005 == baseElementType) {
			if(isExtendedType) {
				return getExtendedCompleteCreateRelationshipCommand(req, (IExtendedHintedElementType)requestElementType);
			}
			return getGEFWrapper(new ExceptionHandlerCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if(UMLElementTypes.CommentAnnotatedElement_4006 == baseElementType) {
			if(isExtendedType) {
				return getExtendedCompleteCreateRelationshipCommand(req, (IExtendedHintedElementType)requestElementType);
			}
			return getGEFWrapper(new CommentLinkCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(ReorientRelationshipRequest req) {
		switch(getVisualID(req)) {
		case ObjectFlowEditPart.VISUAL_ID:
			return getGEFWrapper(new ObjectFlowReorientCommand(req));
		case ControlFlowEditPart.VISUAL_ID:
			return getGEFWrapper(new ControlFlowReorientCommand(req));
		case ExceptionHandlerEditPart.VISUAL_ID:
			return getGEFWrapper(new ExceptionHandlerReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(ReorientReferenceRelationshipRequest req) {
		switch(getVisualID(req)) {
		case CommentLinkEditPart.VISUAL_ID:
			return getGEFWrapper(new CommentLinkReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}
}
