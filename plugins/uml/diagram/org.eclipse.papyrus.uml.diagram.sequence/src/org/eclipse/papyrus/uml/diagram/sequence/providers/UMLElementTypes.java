/*****************************************************************************
 * Copyright (c) 2009 Atos Origin.
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
package org.eclipse.papyrus.uml.diagram.sequence.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.papyrus.infra.gmfdiag.common.providers.DiagramElementTypes;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.ActionExecutionSpecificationEditPart;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.BehaviorExecutionSpecificationEditPart;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.CombinedFragment2EditPart;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.CombinedFragmentEditPart;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.CommentAnnotatedElementEditPart;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.CommentEditPart;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.ConsiderIgnoreFragmentEditPart;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.ConstraintConstrainedElementEditPart;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.ConstraintEditPart;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.ContextLinkEditPart;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.ContinuationEditPart;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.DestructionOccurrenceSpecificationEditPart;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.DurationConstraintEditPart;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.DurationConstraintInMessageEditPart;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.DurationObservationEditPart;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.GeneralOrderingEditPart;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.InteractionEditPart;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.InteractionOperandEditPart;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.InteractionUseEditPart;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.LifelineEditPart;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.Message2EditPart;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.Message3EditPart;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.Message4EditPart;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.Message5EditPart;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.Message6EditPart;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.Message7EditPart;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.MessageEditPart;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.PackageEditPart;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.StateInvariantEditPart;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.TimeConstraintEditPart;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.TimeObservationEditPart;
import org.eclipse.papyrus.uml.diagram.sequence.part.UMLDiagramEditorPlugin;
import org.eclipse.swt.graphics.Image;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class UMLElementTypes {

	/**
	 * @generated
	 */
	private UMLElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(UMLDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Package_1000 = getElementTypeByUniqueId("org.eclipse.papyrus.uml.diagram.sequence.Package_1000"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Interaction_2001 = getElementTypeByUniqueId("org.eclipse.papyrus.uml.diagram.sequence.Interaction_2001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Lifeline_3001 = getElementTypeByUniqueId("org.eclipse.papyrus.uml.diagram.sequence.Lifeline_3001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType BehaviorExecutionSpecification_3003 = getElementTypeByUniqueId("org.eclipse.papyrus.uml.diagram.sequence.BehaviorExecutionSpecification_3003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType StateInvariant_3017 = getElementTypeByUniqueId("org.eclipse.papyrus.uml.diagram.sequence.StateInvariant_3017"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CombinedFragment_3018 = getElementTypeByUniqueId("org.eclipse.papyrus.uml.diagram.sequence.CombinedFragment_3018"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType TimeConstraint_3019 = getElementTypeByUniqueId("org.eclipse.papyrus.uml.diagram.sequence.TimeConstraint_3019"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType TimeObservation_3020 = getElementTypeByUniqueId("org.eclipse.papyrus.uml.diagram.sequence.TimeObservation_3020"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DurationConstraint_3021 = getElementTypeByUniqueId("org.eclipse.papyrus.uml.diagram.sequence.DurationConstraint_3021"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DestructionOccurrenceSpecification_3022 = getElementTypeByUniqueId("org.eclipse.papyrus.uml.diagram.sequence.DestructionOccurrenceSpecification_3022"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ActionExecutionSpecification_3006 = getElementTypeByUniqueId("org.eclipse.papyrus.uml.diagram.sequence.ActionExecutionSpecification_3006"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType InteractionUse_3002 = getElementTypeByUniqueId("org.eclipse.papyrus.uml.diagram.sequence.InteractionUse_3002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CombinedFragment_3004 = getElementTypeByUniqueId("org.eclipse.papyrus.uml.diagram.sequence.CombinedFragment_3004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType InteractionOperand_3005 = getElementTypeByUniqueId("org.eclipse.papyrus.uml.diagram.sequence.InteractionOperand_3005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Continuation_3016 = getElementTypeByUniqueId("org.eclipse.papyrus.uml.diagram.sequence.Continuation_3016"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Constraint_3008 = getElementTypeByUniqueId("org.eclipse.papyrus.uml.diagram.sequence.Constraint_3008"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Comment_3009 = getElementTypeByUniqueId("org.eclipse.papyrus.uml.diagram.sequence.Comment_3009"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DurationConstraint_3023 = getElementTypeByUniqueId("org.eclipse.papyrus.uml.diagram.sequence.DurationConstraint_3023"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DurationObservation_3024 = getElementTypeByUniqueId("org.eclipse.papyrus.uml.diagram.sequence.DurationObservation_3024"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ConsiderIgnoreFragment_3007 = getElementTypeByUniqueId("org.eclipse.papyrus.uml.diagram.sequence.ConsiderIgnoreFragment_3007"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Message_4003 = getElementTypeByUniqueId("org.eclipse.papyrus.uml.diagram.sequence.Message_4003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Message_4004 = getElementTypeByUniqueId("org.eclipse.papyrus.uml.diagram.sequence.Message_4004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Message_4005 = getElementTypeByUniqueId("org.eclipse.papyrus.uml.diagram.sequence.Message_4005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Message_4006 = getElementTypeByUniqueId("org.eclipse.papyrus.uml.diagram.sequence.Message_4006"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Message_4007 = getElementTypeByUniqueId("org.eclipse.papyrus.uml.diagram.sequence.Message_4007"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Message_4008 = getElementTypeByUniqueId("org.eclipse.papyrus.uml.diagram.sequence.Message_4008"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Message_4009 = getElementTypeByUniqueId("org.eclipse.papyrus.uml.diagram.sequence.Message_4009"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CommentAnnotatedElement_4010 = getElementTypeByUniqueId("org.eclipse.papyrus.uml.diagram.sequence.CommentAnnotatedElement_4010"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ConstraintConstrainedElement_4011 = getElementTypeByUniqueId("org.eclipse.papyrus.uml.diagram.sequence.ConstraintConstrainedElement_4011"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType GeneralOrdering_4012 = getElementTypeByUniqueId("org.eclipse.papyrus.uml.diagram.sequence.GeneralOrdering_4012"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ConstraintContext_8500 = getElementTypeByUniqueId("org.eclipse.papyrus.uml.diagram.sequence.ConstraintContext_8500"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 *
	 * @generated
	 */
	public static synchronized ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if(elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();
			elements.put(Package_1000, UMLPackage.eINSTANCE.getPackage());
			elements.put(Interaction_2001, UMLPackage.eINSTANCE.getInteraction());
			elements.put(ConsiderIgnoreFragment_3007, UMLPackage.eINSTANCE.getConsiderIgnoreFragment());
			elements.put(CombinedFragment_3004, UMLPackage.eINSTANCE.getCombinedFragment());
			elements.put(InteractionOperand_3005, UMLPackage.eINSTANCE.getInteractionOperand());
			elements.put(InteractionUse_3002, UMLPackage.eINSTANCE.getInteractionUse());
			elements.put(Continuation_3016, UMLPackage.eINSTANCE.getContinuation());
			elements.put(Lifeline_3001, UMLPackage.eINSTANCE.getLifeline());
			elements.put(ActionExecutionSpecification_3006, UMLPackage.eINSTANCE.getActionExecutionSpecification());
			elements.put(BehaviorExecutionSpecification_3003, UMLPackage.eINSTANCE.getBehaviorExecutionSpecification());
			elements.put(StateInvariant_3017, UMLPackage.eINSTANCE.getStateInvariant());
			elements.put(CombinedFragment_3018, UMLPackage.eINSTANCE.getCombinedFragment());
			elements.put(TimeConstraint_3019, UMLPackage.eINSTANCE.getTimeConstraint());
			elements.put(TimeObservation_3020, UMLPackage.eINSTANCE.getTimeObservation());
			elements.put(DurationConstraint_3021, UMLPackage.eINSTANCE.getDurationConstraint());
			elements.put(DestructionOccurrenceSpecification_3022, UMLPackage.eINSTANCE.getDestructionOccurrenceSpecification());
			elements.put(Constraint_3008, UMLPackage.eINSTANCE.getConstraint());
			elements.put(Comment_3009, UMLPackage.eINSTANCE.getComment());
			elements.put(DurationConstraint_3023, UMLPackage.eINSTANCE.getDurationConstraint());
			elements.put(DurationObservation_3024, UMLPackage.eINSTANCE.getDurationObservation());
			elements.put(Message_4003, UMLPackage.eINSTANCE.getMessage());
			elements.put(Message_4004, UMLPackage.eINSTANCE.getMessage());
			elements.put(Message_4005, UMLPackage.eINSTANCE.getMessage());
			elements.put(Message_4006, UMLPackage.eINSTANCE.getMessage());
			elements.put(Message_4007, UMLPackage.eINSTANCE.getMessage());
			elements.put(Message_4008, UMLPackage.eINSTANCE.getMessage());
			elements.put(Message_4009, UMLPackage.eINSTANCE.getMessage());
			elements.put(CommentAnnotatedElement_4010, UMLPackage.eINSTANCE.getComment_AnnotatedElement());
			elements.put(ConstraintConstrainedElement_4011, UMLPackage.eINSTANCE.getConstraint_ConstrainedElement());
			elements.put(GeneralOrdering_4012, UMLPackage.eINSTANCE.getGeneralOrdering());
			elements.put(ConstraintContext_8500, UMLPackage.eINSTANCE.getConstraint_Context());
		}
		return elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementTypeByUniqueId(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(String visualID) {
		if(visualID != null) {
			switch(visualID) {
			case PackageEditPart.VISUAL_ID:
				return Package_1000;
			case InteractionEditPart.VISUAL_ID:
				return Interaction_2001;
			case ConsiderIgnoreFragmentEditPart.VISUAL_ID:
				return ConsiderIgnoreFragment_3007;
			case CombinedFragmentEditPart.VISUAL_ID:
				return CombinedFragment_3004;
			case InteractionOperandEditPart.VISUAL_ID:
				return InteractionOperand_3005;
			case InteractionUseEditPart.VISUAL_ID:
				return InteractionUse_3002;
			case ContinuationEditPart.VISUAL_ID:
				return Continuation_3016;
			case LifelineEditPart.VISUAL_ID:
				return Lifeline_3001;
			case ActionExecutionSpecificationEditPart.VISUAL_ID:
				return ActionExecutionSpecification_3006;
			case BehaviorExecutionSpecificationEditPart.VISUAL_ID:
				return BehaviorExecutionSpecification_3003;
			case StateInvariantEditPart.VISUAL_ID:
				return StateInvariant_3017;
			case CombinedFragment2EditPart.VISUAL_ID:
				return CombinedFragment_3018;
			case TimeConstraintEditPart.VISUAL_ID:
				return TimeConstraint_3019;
			case TimeObservationEditPart.VISUAL_ID:
				return TimeObservation_3020;
			case DurationConstraintEditPart.VISUAL_ID:
				return DurationConstraint_3021;
			case DestructionOccurrenceSpecificationEditPart.VISUAL_ID:
				return DestructionOccurrenceSpecification_3022;
			case ConstraintEditPart.VISUAL_ID:
				return Constraint_3008;
			case CommentEditPart.VISUAL_ID:
				return Comment_3009;
			case DurationConstraintInMessageEditPart.VISUAL_ID:
				return DurationConstraint_3023;
			case DurationObservationEditPart.VISUAL_ID:
				return DurationObservation_3024;
			case MessageEditPart.VISUAL_ID:
				return Message_4003;
			case Message2EditPart.VISUAL_ID:
				return Message_4004;
			case Message3EditPart.VISUAL_ID:
				return Message_4005;
			case Message4EditPart.VISUAL_ID:
				return Message_4006;
			case Message5EditPart.VISUAL_ID:
				return Message_4007;
			case Message6EditPart.VISUAL_ID:
				return Message_4008;
			case Message7EditPart.VISUAL_ID:
				return Message_4009;
			case CommentAnnotatedElementEditPart.VISUAL_ID:
				return CommentAnnotatedElement_4010;
			case ConstraintConstrainedElementEditPart.VISUAL_ID:
				return ConstraintConstrainedElement_4011;
			case GeneralOrderingEditPart.VISUAL_ID:
				return GeneralOrdering_4012;
			case ContextLinkEditPart.VISUAL_ID:
				return ConstraintContext_8500;
			}
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static synchronized boolean isKnownElementType(IElementType elementType) {
		if(KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Package_1000);
			KNOWN_ELEMENT_TYPES.add(Interaction_2001);
			KNOWN_ELEMENT_TYPES.add(ConsiderIgnoreFragment_3007);
			KNOWN_ELEMENT_TYPES.add(CombinedFragment_3004);
			KNOWN_ELEMENT_TYPES.add(InteractionOperand_3005);
			KNOWN_ELEMENT_TYPES.add(InteractionUse_3002);
			KNOWN_ELEMENT_TYPES.add(Continuation_3016);
			KNOWN_ELEMENT_TYPES.add(Lifeline_3001);
			KNOWN_ELEMENT_TYPES.add(ActionExecutionSpecification_3006);
			KNOWN_ELEMENT_TYPES.add(BehaviorExecutionSpecification_3003);
			KNOWN_ELEMENT_TYPES.add(StateInvariant_3017);
			KNOWN_ELEMENT_TYPES.add(CombinedFragment_3018);
			KNOWN_ELEMENT_TYPES.add(TimeConstraint_3019);
			KNOWN_ELEMENT_TYPES.add(TimeObservation_3020);
			KNOWN_ELEMENT_TYPES.add(DurationConstraint_3021);
			KNOWN_ELEMENT_TYPES.add(DestructionOccurrenceSpecification_3022);
			KNOWN_ELEMENT_TYPES.add(Constraint_3008);
			KNOWN_ELEMENT_TYPES.add(Comment_3009);
			KNOWN_ELEMENT_TYPES.add(DurationConstraint_3023);
			KNOWN_ELEMENT_TYPES.add(DurationObservation_3024);
			KNOWN_ELEMENT_TYPES.add(Message_4003);
			KNOWN_ELEMENT_TYPES.add(Message_4004);
			KNOWN_ELEMENT_TYPES.add(Message_4005);
			KNOWN_ELEMENT_TYPES.add(Message_4006);
			KNOWN_ELEMENT_TYPES.add(Message_4007);
			KNOWN_ELEMENT_TYPES.add(Message_4008);
			KNOWN_ELEMENT_TYPES.add(Message_4009);
			KNOWN_ELEMENT_TYPES.add(CommentAnnotatedElement_4010);
			KNOWN_ELEMENT_TYPES.add(ConstraintConstrainedElement_4011);
			KNOWN_ELEMENT_TYPES.add(GeneralOrdering_4012);
			KNOWN_ELEMENT_TYPES.add(ConstraintContext_8500);
		}
		boolean result = KNOWN_ELEMENT_TYPES.contains(elementType);
		if(!result) {
			IElementType[] supertypes = elementType.getAllSuperTypes();
			for(int i = 0; !result && (i < supertypes.length); i++) {
				result = KNOWN_ELEMENT_TYPES.contains(supertypes[i]);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		 * @generated
		 */
		@Override
		public boolean isKnownElementType(IElementType elementType) {
			return org.eclipse.papyrus.uml.diagram.sequence.providers.UMLElementTypes.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(String visualID) {
			return org.eclipse.papyrus.uml.diagram.sequence.providers.UMLElementTypes.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return org.eclipse.papyrus.uml.diagram.sequence.providers.UMLElementTypes.getElement(elementTypeAdapter);
		}
	};

	/**
	 * @generated
	 */
	public static boolean isKindOf(IElementType subtype, IElementType supertype) {
		boolean result = subtype == supertype;
		if(!result) {
			IElementType[] supertypes = subtype.getAllSuperTypes();
			for(int i = 0; !result && (i < supertypes.length); i++) {
				result = supertype == supertypes[i];
			}
		}
		return result;
	}
}
