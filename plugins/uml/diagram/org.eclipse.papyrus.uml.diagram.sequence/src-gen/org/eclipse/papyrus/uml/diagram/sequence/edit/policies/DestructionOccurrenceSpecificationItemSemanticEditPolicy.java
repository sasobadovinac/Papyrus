package org.eclipse.papyrus.uml.diagram.sequence.edit.policies;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.papyrus.infra.services.edit.service.ElementEditServiceUtils;
import org.eclipse.papyrus.infra.services.edit.service.IElementEditService;
import org.eclipse.papyrus.uml.diagram.sequence.edit.commands.CommentAnnotatedElementCreateCommand;
import org.eclipse.papyrus.uml.diagram.sequence.edit.commands.CommentAnnotatedElementReorientCommand;
import org.eclipse.papyrus.uml.diagram.sequence.edit.commands.ConstraintConstrainedElementCreateCommand;
import org.eclipse.papyrus.uml.diagram.sequence.edit.commands.ConstraintConstrainedElementReorientCommand;
import org.eclipse.papyrus.uml.diagram.sequence.edit.commands.GeneralOrderingCreateCommand;
import org.eclipse.papyrus.uml.diagram.sequence.edit.commands.GeneralOrderingReorientCommand;
import org.eclipse.papyrus.uml.diagram.sequence.edit.commands.Message2CreateCommand;
import org.eclipse.papyrus.uml.diagram.sequence.edit.commands.Message2ReorientCommand;
import org.eclipse.papyrus.uml.diagram.sequence.edit.commands.Message3CreateCommand;
import org.eclipse.papyrus.uml.diagram.sequence.edit.commands.Message3ReorientCommand;
import org.eclipse.papyrus.uml.diagram.sequence.edit.commands.Message4CreateCommand;
import org.eclipse.papyrus.uml.diagram.sequence.edit.commands.Message4ReorientCommand;
import org.eclipse.papyrus.uml.diagram.sequence.edit.commands.Message5CreateCommand;
import org.eclipse.papyrus.uml.diagram.sequence.edit.commands.Message5ReorientCommand;
import org.eclipse.papyrus.uml.diagram.sequence.edit.commands.Message6CreateCommand;
import org.eclipse.papyrus.uml.diagram.sequence.edit.commands.Message6ReorientCommand;
import org.eclipse.papyrus.uml.diagram.sequence.edit.commands.Message7CreateCommand;
import org.eclipse.papyrus.uml.diagram.sequence.edit.commands.Message7ReorientCommand;
import org.eclipse.papyrus.uml.diagram.sequence.edit.commands.MessageCreateCommand;
import org.eclipse.papyrus.uml.diagram.sequence.edit.commands.MessageReorientCommand;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.CommentAnnotatedElementEditPart;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.ConstraintConstrainedElementEditPart;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.GeneralOrderingEditPart;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.Message2EditPart;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.Message3EditPart;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.Message4EditPart;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.Message5EditPart;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.Message6EditPart;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.Message7EditPart;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.MessageEditPart;
import org.eclipse.papyrus.uml.diagram.sequence.providers.UMLElementTypes;

/**
 * @generated
 */
public class DestructionOccurrenceSpecificationItemSemanticEditPolicy extends UMLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public DestructionOccurrenceSpecificationItemSemanticEditPolicy() {
		super(UMLElementTypes.DestructionOccurrenceSpecification_Shape);
	}

	/**
	 * @generated
	 */
	@Override
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		EObject selectedEObject = req.getElementToDestroy();
		IElementEditService provider = ElementEditServiceUtils.getCommandProvider(selectedEObject);
		if (provider != null) {
			// Retrieve delete command from the Element Edit service
			ICommand deleteCommand = provider.getEditCommand(req);
			if (deleteCommand != null) {
				return new ICommandProxy(deleteCommand);
			}
		}
		return UnexecutableCommand.INSTANCE;
	}

	/**
	 * @generated
	 */
	@Override
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req) : getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(CreateRelationshipRequest req) {
		IElementType requestElementType = req.getElementType();
		if (requestElementType == null) {
			return null;
		}
		IElementType baseElementType = requestElementType;
		
		if (UMLElementTypes.Message_SynchEdge == baseElementType) {
			return getGEFWrapper(new MessageCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (UMLElementTypes.Message_AsynchEdge == baseElementType) {
			return getGEFWrapper(new Message2CreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (UMLElementTypes.Message_ReplyEdge == baseElementType) {
			return getGEFWrapper(new Message3CreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (UMLElementTypes.Message_CreateEdge == baseElementType) {
			return getGEFWrapper(new Message4CreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (UMLElementTypes.Message_DeleteEdge == baseElementType) {
			return getGEFWrapper(new Message5CreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (UMLElementTypes.Message_LostEdge == baseElementType) {
			return getGEFWrapper(new Message6CreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (UMLElementTypes.Message_FoundEdge == baseElementType) {
			return getGEFWrapper(new Message7CreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (UMLElementTypes.Comment_AnnotatedElementEdge == baseElementType) {
			return null;
		}
		if (UMLElementTypes.Constraint_ConstrainedElementEdge == baseElementType) {
			return null;
		}
		if (UMLElementTypes.GeneralOrdering_Edge == baseElementType) {
			return getGEFWrapper(new GeneralOrderingCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		IElementType requestElementType = req.getElementType();
		if (requestElementType == null) {
			return null;
		}
		IElementType baseElementType = requestElementType;
		
		if (UMLElementTypes.Message_SynchEdge == baseElementType) {
			return getGEFWrapper(new MessageCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (UMLElementTypes.Message_AsynchEdge == baseElementType) {
			return getGEFWrapper(new Message2CreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (UMLElementTypes.Message_ReplyEdge == baseElementType) {
			return getGEFWrapper(new Message3CreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (UMLElementTypes.Message_CreateEdge == baseElementType) {
			return getGEFWrapper(new Message4CreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (UMLElementTypes.Message_DeleteEdge == baseElementType) {
			return getGEFWrapper(new Message5CreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (UMLElementTypes.Message_LostEdge == baseElementType) {
			return getGEFWrapper(new Message6CreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (UMLElementTypes.Message_FoundEdge == baseElementType) {
			return getGEFWrapper(new Message7CreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (UMLElementTypes.Comment_AnnotatedElementEdge == baseElementType) {
			return getGEFWrapper(new CommentAnnotatedElementCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (UMLElementTypes.Constraint_ConstrainedElementEdge == baseElementType) {
			return getGEFWrapper(new ConstraintConstrainedElementCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (UMLElementTypes.GeneralOrdering_Edge == baseElementType) {
			return getGEFWrapper(new GeneralOrderingCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 *
	 * @generated
	 */
	@Override
	protected Command getReorientRelationshipCommand(ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case MessageEditPart.VISUAL_ID:
			return getGEFWrapper(new MessageReorientCommand(req));
		case Message2EditPart.VISUAL_ID:
			return getGEFWrapper(new Message2ReorientCommand(req));
		case Message3EditPart.VISUAL_ID:
			return getGEFWrapper(new Message3ReorientCommand(req));
		case Message4EditPart.VISUAL_ID:
			return getGEFWrapper(new Message4ReorientCommand(req));
		case Message5EditPart.VISUAL_ID:
			return getGEFWrapper(new Message5ReorientCommand(req));
		case Message6EditPart.VISUAL_ID:
			return getGEFWrapper(new Message6ReorientCommand(req));
		case Message7EditPart.VISUAL_ID:
			return getGEFWrapper(new Message7ReorientCommand(req));
		case GeneralOrderingEditPart.VISUAL_ID:
			return getGEFWrapper(new GeneralOrderingReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 *
	 * @generated
	 */
	@Override
	protected Command getReorientReferenceRelationshipCommand(ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case CommentAnnotatedElementEditPart.VISUAL_ID:
			return getGEFWrapper(new CommentAnnotatedElementReorientCommand(req));
		case ConstraintConstrainedElementEditPart.VISUAL_ID:
			return getGEFWrapper(new ConstraintConstrainedElementReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}
}
