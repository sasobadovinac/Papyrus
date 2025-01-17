/**
 * Copyright (c) 2014 CEA LIST.
  *
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the Eclipse Public License 2.0
  * which accompanies this distribution, and is available at
  * https://www.eclipse.org/legal/epl-2.0/
  *
  * SPDX-License-Identifier: EPL-2.0
  *
  * Contributors:
  *  CEA LIST - Initial API and implementation
 */
package org.eclipse.papyrus.uml.diagram.composite.part;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.infra.gmfdiag.common.structure.DiagramStructure;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.*;
import org.eclipse.uml2.uml.Collaboration;
import org.eclipse.uml2.uml.CollaborationUse;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 *
 * @generated
 */
public class UMLVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "org.eclipse.papyrus.uml.diagram.composite/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static String getVisualID(View view) {
		if (view instanceof Diagram) {
			if (CompositeStructureDiagramEditPart.MODEL_ID.equals(view.getType())) {
				return CompositeStructureDiagramEditPart.VISUAL_ID;
			} else {
				return "";
			}
		}
		return org.eclipse.papyrus.uml.diagram.composite.part.UMLVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static String getVisualID(String type) {
		return type;
	}

	/**
	 * @generated
	 */
	public static String getType(String visualID) {
		return visualID;
	}

	/**
	 * @generated
	 */
	public static String getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return "";
		}
		return CompositeStructureDiagramEditPart.VISUAL_ID;
	}

	/**
	 * @generated
	 */
	public static String getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return "";
		}
		String containerModelID = org.eclipse.papyrus.uml.diagram.composite.part.UMLVisualIDRegistry.getModelID(containerView);
		if (!CompositeStructureDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			return "";
		}
		String containerVisualID;
		if (CompositeStructureDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.eclipse.papyrus.uml.diagram.composite.part.UMLVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = CompositeStructureDiagramEditPart.VISUAL_ID;
			} else {
				return "";
			}
		}
		if (containerVisualID != null) {
			switch (containerVisualID) {
			case CompositeStructureDiagramEditPart.VISUAL_ID:
				if (UMLPackage.eINSTANCE.getActivity().isSuperTypeOf(domainElement.eClass())) {
					return ActivityCompositeEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInteraction().isSuperTypeOf(domainElement.eClass())) {
					return InteractionCompositeEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getProtocolStateMachine().isSuperTypeOf(domainElement.eClass())) {
					return ProtocolStateMachineCompositeEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getStateMachine().isSuperTypeOf(domainElement.eClass())) {
					return StateMachineCompositeEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getFunctionBehavior().isSuperTypeOf(domainElement.eClass())) {
					return FunctionBehaviorCompositeEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getOpaqueBehavior().isSuperTypeOf(domainElement.eClass())) {
					return OpaqueBehaviorCompositeEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getComponent().isSuperTypeOf(domainElement.eClass())) {
					return ComponentCompositeEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDevice().isSuperTypeOf(domainElement.eClass())) {
					return DeviceCompositeEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getExecutionEnvironment().isSuperTypeOf(domainElement.eClass())) {
					return ExecutionEnvironmentCompositeEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getNode().isSuperTypeOf(domainElement.eClass())) {
					return NodeCompositeEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getClass_().isSuperTypeOf(domainElement.eClass())) {
					return ClassCompositeEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getCollaboration().isSuperTypeOf(domainElement.eClass())) {
					return CollaborationCompositeEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInterface().isSuperTypeOf(domainElement.eClass())) {
					return InterfaceEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getPrimitiveType().isSuperTypeOf(domainElement.eClass())) {
					return PrimitiveTypeEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getEnumeration().isSuperTypeOf(domainElement.eClass())) {
					return EnumerationEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDataType().isSuperTypeOf(domainElement.eClass())) {
					return DataTypeEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getActor().isSuperTypeOf(domainElement.eClass())) {
					return ActorEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDeploymentSpecification().isSuperTypeOf(domainElement.eClass())) {
					return DeploymentSpecificationEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getArtifact().isSuperTypeOf(domainElement.eClass())) {
					return ArtifactEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInformationItem().isSuperTypeOf(domainElement.eClass())) {
					return InformationItemEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getSignal().isSuperTypeOf(domainElement.eClass())) {
					return SignalEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getUseCase().isSuperTypeOf(domainElement.eClass())) {
					return UseCaseEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getSignalEvent().isSuperTypeOf(domainElement.eClass())) {
					return SignalEventEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getCallEvent().isSuperTypeOf(domainElement.eClass())) {
					return CallEventEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getAnyReceiveEvent().isSuperTypeOf(domainElement.eClass())) {
					return AnyReceiveEventEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getChangeEvent().isSuperTypeOf(domainElement.eClass())) {
					return ChangeEventEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getTimeEvent().isSuperTypeOf(domainElement.eClass())) {
					return TimeEventEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDurationObservation().isSuperTypeOf(domainElement.eClass())) {
					return DurationObservationEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getTimeObservation().isSuperTypeOf(domainElement.eClass())) {
					return TimeObservationEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getLiteralBoolean().isSuperTypeOf(domainElement.eClass())) {
					return LiteralBooleanEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getLiteralInteger().isSuperTypeOf(domainElement.eClass())) {
					return LiteralIntegerEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getLiteralNull().isSuperTypeOf(domainElement.eClass())) {
					return LiteralNullEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getLiteralString().isSuperTypeOf(domainElement.eClass())) {
					return LiteralStringEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getLiteralUnlimitedNatural().isSuperTypeOf(domainElement.eClass())) {
					return LiteralUnlimitedNaturalEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getStringExpression().isSuperTypeOf(domainElement.eClass())) {
					return StringExpressionEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getOpaqueExpression().isSuperTypeOf(domainElement.eClass())) {
					return OpaqueExpressionEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getTimeExpression().isSuperTypeOf(domainElement.eClass())) {
					return TimeExpressionEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getExpression().isSuperTypeOf(domainElement.eClass())) {
					return ExpressionEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDuration().isSuperTypeOf(domainElement.eClass())) {
					return DurationEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getTimeInterval().isSuperTypeOf(domainElement.eClass())) {
					return TimeIntervalEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDurationInterval().isSuperTypeOf(domainElement.eClass())) {
					return DurationIntervalEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInterval().isSuperTypeOf(domainElement.eClass())) {
					return IntervalEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInstanceValue().isSuperTypeOf(domainElement.eClass())) {
					return InstanceValueEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getComment().isSuperTypeOf(domainElement.eClass())) {
					return CommentEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDurationConstraint().isSuperTypeOf(domainElement.eClass())) {
					return DurationConstraintEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getTimeConstraint().isSuperTypeOf(domainElement.eClass())) {
					return TimeConstraintEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getIntervalConstraint().isSuperTypeOf(domainElement.eClass())) {
					return IntervalConstraintEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInteractionConstraint().isSuperTypeOf(domainElement.eClass())) {
					return InteractionConstraintEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getConstraint().isSuperTypeOf(domainElement.eClass())) {
					return ConstraintEditPart.VISUAL_ID;
				}
				break;
			case ActivityCompositeEditPart.VISUAL_ID:
				if (UMLPackage.eINSTANCE.getPort().isSuperTypeOf(domainElement.eClass())) {
					return PortEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getParameter().isSuperTypeOf(domainElement.eClass())) {
					return ParameterEditPart.VISUAL_ID;
				}
				break;
			case InteractionCompositeEditPart.VISUAL_ID:
				if (UMLPackage.eINSTANCE.getPort().isSuperTypeOf(domainElement.eClass())) {
					return PortEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getParameter().isSuperTypeOf(domainElement.eClass())) {
					return ParameterEditPart.VISUAL_ID;
				}
				break;
			case ProtocolStateMachineCompositeEditPart.VISUAL_ID:
				if (UMLPackage.eINSTANCE.getPort().isSuperTypeOf(domainElement.eClass())) {
					return PortEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getParameter().isSuperTypeOf(domainElement.eClass())) {
					return ParameterEditPart.VISUAL_ID;
				}
				break;
			case StateMachineCompositeEditPart.VISUAL_ID:
				if (UMLPackage.eINSTANCE.getPort().isSuperTypeOf(domainElement.eClass())) {
					return PortEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getParameter().isSuperTypeOf(domainElement.eClass())) {
					return ParameterEditPart.VISUAL_ID;
				}
				break;
			case FunctionBehaviorCompositeEditPart.VISUAL_ID:
				if (UMLPackage.eINSTANCE.getPort().isSuperTypeOf(domainElement.eClass())) {
					return PortEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getParameter().isSuperTypeOf(domainElement.eClass())) {
					return ParameterEditPart.VISUAL_ID;
				}
				break;
			case OpaqueBehaviorCompositeEditPart.VISUAL_ID:
				if (UMLPackage.eINSTANCE.getPort().isSuperTypeOf(domainElement.eClass())) {
					return PortEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getParameter().isSuperTypeOf(domainElement.eClass())) {
					return ParameterEditPart.VISUAL_ID;
				}
				break;
			case ComponentCompositeEditPart.VISUAL_ID:
				if (UMLPackage.eINSTANCE.getPort().isSuperTypeOf(domainElement.eClass())) {
					return PortEditPart.VISUAL_ID;
				}
				break;
			case DeviceCompositeEditPart.VISUAL_ID:
				if (UMLPackage.eINSTANCE.getPort().isSuperTypeOf(domainElement.eClass())) {
					return PortEditPart.VISUAL_ID;
				}
				break;
			case ExecutionEnvironmentCompositeEditPart.VISUAL_ID:
				if (UMLPackage.eINSTANCE.getPort().isSuperTypeOf(domainElement.eClass())) {
					return PortEditPart.VISUAL_ID;
				}
				break;
			case NodeCompositeEditPart.VISUAL_ID:
				if (UMLPackage.eINSTANCE.getPort().isSuperTypeOf(domainElement.eClass())) {
					return PortEditPart.VISUAL_ID;
				}
				break;
			case ClassCompositeEditPart.VISUAL_ID:
				if (UMLPackage.eINSTANCE.getPort().isSuperTypeOf(domainElement.eClass())) {
					return PortEditPart.VISUAL_ID;
				}
				break;
			case EnumerationEditPart.VISUAL_ID:
				if (UMLPackage.eINSTANCE.getEnumerationLiteral().isSuperTypeOf(domainElement.eClass())) {
					return EnumerationLiteralEditPartCLN.VISUAL_ID;
				}
				break;
			case PropertyPartEditPartCN.VISUAL_ID:
				if (UMLPackage.eINSTANCE.getPort().isSuperTypeOf(domainElement.eClass())) {
					return PortEditPart.VISUAL_ID;
				}
				break;
			case ActivityCompositeEditPartCN.VISUAL_ID:
				if (UMLPackage.eINSTANCE.getPort().isSuperTypeOf(domainElement.eClass())) {
					return PortEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getParameter().isSuperTypeOf(domainElement.eClass())) {
					return ParameterEditPart.VISUAL_ID;
				}
				break;
			case InteractionCompositeEditPartCN.VISUAL_ID:
				if (UMLPackage.eINSTANCE.getPort().isSuperTypeOf(domainElement.eClass())) {
					return PortEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getParameter().isSuperTypeOf(domainElement.eClass())) {
					return ParameterEditPart.VISUAL_ID;
				}
				break;
			case ProtocolStateMachineCompositeEditPartCN.VISUAL_ID:
				if (UMLPackage.eINSTANCE.getPort().isSuperTypeOf(domainElement.eClass())) {
					return PortEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getParameter().isSuperTypeOf(domainElement.eClass())) {
					return ParameterEditPart.VISUAL_ID;
				}
				break;
			case StateMachineCompositeEditPartCN.VISUAL_ID:
				if (UMLPackage.eINSTANCE.getPort().isSuperTypeOf(domainElement.eClass())) {
					return PortEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getParameter().isSuperTypeOf(domainElement.eClass())) {
					return ParameterEditPart.VISUAL_ID;
				}
				break;
			case FunctionBehaviorCompositeEditPartCN.VISUAL_ID:
				if (UMLPackage.eINSTANCE.getPort().isSuperTypeOf(domainElement.eClass())) {
					return PortEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getParameter().isSuperTypeOf(domainElement.eClass())) {
					return ParameterEditPart.VISUAL_ID;
				}
				break;
			case OpaqueBehaviorCompositeEditPartCN.VISUAL_ID:
				if (UMLPackage.eINSTANCE.getPort().isSuperTypeOf(domainElement.eClass())) {
					return PortEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getParameter().isSuperTypeOf(domainElement.eClass())) {
					return ParameterEditPart.VISUAL_ID;
				}
				break;
			case ComponentCompositeEditPartCN.VISUAL_ID:
				if (UMLPackage.eINSTANCE.getPort().isSuperTypeOf(domainElement.eClass())) {
					return PortEditPart.VISUAL_ID;
				}
				break;
			case DeviceCompositeEditPartCN.VISUAL_ID:
				if (UMLPackage.eINSTANCE.getPort().isSuperTypeOf(domainElement.eClass())) {
					return PortEditPart.VISUAL_ID;
				}
				break;
			case ExecutionEnvironmentCompositeEditPartCN.VISUAL_ID:
				if (UMLPackage.eINSTANCE.getPort().isSuperTypeOf(domainElement.eClass())) {
					return PortEditPart.VISUAL_ID;
				}
				break;
			case NodeCompositeEditPartCN.VISUAL_ID:
				if (UMLPackage.eINSTANCE.getPort().isSuperTypeOf(domainElement.eClass())) {
					return PortEditPart.VISUAL_ID;
				}
				break;
			case ClassCompositeEditPartCN.VISUAL_ID:
				if (UMLPackage.eINSTANCE.getPort().isSuperTypeOf(domainElement.eClass())) {
					return PortEditPart.VISUAL_ID;
				}
				break;
			case EnumerationEditPartCN.VISUAL_ID:
				if (UMLPackage.eINSTANCE.getEnumerationLiteral().isSuperTypeOf(domainElement.eClass())) {
					return EnumerationLiteralEditPartCLN.VISUAL_ID;
				}
				break;
			case DataTypeAttributeCompartmentEditPart.VISUAL_ID:
				if (UMLPackage.eINSTANCE.getProperty().isSuperTypeOf(domainElement.eClass())) {
					return PropertyEditPartCLN.VISUAL_ID;
				}
				break;
			case DataTypeOperationCompartmentEditPart.VISUAL_ID:
				if (UMLPackage.eINSTANCE.getOperation().isSuperTypeOf(domainElement.eClass())) {
					return OperationEditPartCLN.VISUAL_ID;
				}
				break;
			case DataTypeAttributeCompartmentEditPartCN.VISUAL_ID:
				if (UMLPackage.eINSTANCE.getProperty().isSuperTypeOf(domainElement.eClass())) {
					return PropertyEditPartCLN.VISUAL_ID;
				}
				break;
			case DataTypeOperationCompartmentEditPartCN.VISUAL_ID:
				if (UMLPackage.eINSTANCE.getOperation().isSuperTypeOf(domainElement.eClass())) {
					return OperationEditPartCLN.VISUAL_ID;
				}
				break;
			case EnumerationEnumerationLiteralCompartmentEditPart.VISUAL_ID:
				if (UMLPackage.eINSTANCE.getEnumerationLiteral().isSuperTypeOf(domainElement.eClass())) {
					return EnumerationLiteralEditPartCLN.VISUAL_ID;
				}
				break;
			case EnumerationEnumerationLiteralCompartmentEditPartCN.VISUAL_ID:
				if (UMLPackage.eINSTANCE.getEnumerationLiteral().isSuperTypeOf(domainElement.eClass())) {
					return EnumerationLiteralEditPartCLN.VISUAL_ID;
				}
				break;
			case ActivityCompositeCompartmentEditPartCN.VISUAL_ID:
				if (UMLPackage.eINSTANCE.getParameter().isSuperTypeOf(domainElement.eClass())) {
					return ParameterEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getProperty().isSuperTypeOf(domainElement.eClass()) && isProperty_Shape(containerView, (Property) domainElement)) {
					return PropertyPartEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getCollaborationUse().isSuperTypeOf(domainElement.eClass())) {
					return CollaborationUseEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getActivity().isSuperTypeOf(domainElement.eClass())) {
					return ActivityCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInteraction().isSuperTypeOf(domainElement.eClass())) {
					return InteractionCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getProtocolStateMachine().isSuperTypeOf(domainElement.eClass())) {
					return ProtocolStateMachineCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getStateMachine().isSuperTypeOf(domainElement.eClass())) {
					return StateMachineCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getFunctionBehavior().isSuperTypeOf(domainElement.eClass())) {
					return FunctionBehaviorCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getOpaqueBehavior().isSuperTypeOf(domainElement.eClass())) {
					return OpaqueBehaviorCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getComponent().isSuperTypeOf(domainElement.eClass())) {
					return ComponentCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDevice().isSuperTypeOf(domainElement.eClass())) {
					return DeviceCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getExecutionEnvironment().isSuperTypeOf(domainElement.eClass())) {
					return ExecutionEnvironmentCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getNode().isSuperTypeOf(domainElement.eClass())) {
					return NodeCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getClass_().isSuperTypeOf(domainElement.eClass())) {
					return ClassCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getCollaboration().isSuperTypeOf(domainElement.eClass())) {
					return CollaborationCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInterface().isSuperTypeOf(domainElement.eClass())) {
					return InterfaceEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getPrimitiveType().isSuperTypeOf(domainElement.eClass())) {
					return PrimitiveTypeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getEnumeration().isSuperTypeOf(domainElement.eClass())) {
					return EnumerationEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDataType().isSuperTypeOf(domainElement.eClass())) {
					return DataTypeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getActor().isSuperTypeOf(domainElement.eClass())) {
					return ActorEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDeploymentSpecification().isSuperTypeOf(domainElement.eClass())) {
					return DeploymentSpecificationEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getArtifact().isSuperTypeOf(domainElement.eClass())) {
					return ArtifactEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInformationItem().isSuperTypeOf(domainElement.eClass())) {
					return InformationItemEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getSignal().isSuperTypeOf(domainElement.eClass())) {
					return SignalEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getUseCase().isSuperTypeOf(domainElement.eClass())) {
					return UseCaseEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getComment().isSuperTypeOf(domainElement.eClass())) {
					return CommentEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDurationConstraint().isSuperTypeOf(domainElement.eClass())) {
					return DurationConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getTimeConstraint().isSuperTypeOf(domainElement.eClass())) {
					return TimeConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getIntervalConstraint().isSuperTypeOf(domainElement.eClass())) {
					return IntervalConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInteractionConstraint().isSuperTypeOf(domainElement.eClass())) {
					return InteractionConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getConstraint().isSuperTypeOf(domainElement.eClass())) {
					return ConstraintEditPartCN.VISUAL_ID;
				}
				break;
			case InteractionCompositeCompartmentEditPartCN.VISUAL_ID:
				if (UMLPackage.eINSTANCE.getParameter().isSuperTypeOf(domainElement.eClass())) {
					return ParameterEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getProperty().isSuperTypeOf(domainElement.eClass()) && isProperty_Shape(containerView, (Property) domainElement)) {
					return PropertyPartEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getCollaborationUse().isSuperTypeOf(domainElement.eClass())) {
					return CollaborationUseEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getActivity().isSuperTypeOf(domainElement.eClass())) {
					return ActivityCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInteraction().isSuperTypeOf(domainElement.eClass())) {
					return InteractionCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getProtocolStateMachine().isSuperTypeOf(domainElement.eClass())) {
					return ProtocolStateMachineCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getStateMachine().isSuperTypeOf(domainElement.eClass())) {
					return StateMachineCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getFunctionBehavior().isSuperTypeOf(domainElement.eClass())) {
					return FunctionBehaviorCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getOpaqueBehavior().isSuperTypeOf(domainElement.eClass())) {
					return OpaqueBehaviorCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getComponent().isSuperTypeOf(domainElement.eClass())) {
					return ComponentCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDevice().isSuperTypeOf(domainElement.eClass())) {
					return DeviceCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getExecutionEnvironment().isSuperTypeOf(domainElement.eClass())) {
					return ExecutionEnvironmentCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getNode().isSuperTypeOf(domainElement.eClass())) {
					return NodeCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getClass_().isSuperTypeOf(domainElement.eClass())) {
					return ClassCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getCollaboration().isSuperTypeOf(domainElement.eClass())) {
					return CollaborationCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInterface().isSuperTypeOf(domainElement.eClass())) {
					return InterfaceEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getPrimitiveType().isSuperTypeOf(domainElement.eClass())) {
					return PrimitiveTypeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getEnumeration().isSuperTypeOf(domainElement.eClass())) {
					return EnumerationEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDataType().isSuperTypeOf(domainElement.eClass())) {
					return DataTypeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getActor().isSuperTypeOf(domainElement.eClass())) {
					return ActorEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDeploymentSpecification().isSuperTypeOf(domainElement.eClass())) {
					return DeploymentSpecificationEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getArtifact().isSuperTypeOf(domainElement.eClass())) {
					return ArtifactEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInformationItem().isSuperTypeOf(domainElement.eClass())) {
					return InformationItemEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getSignal().isSuperTypeOf(domainElement.eClass())) {
					return SignalEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getUseCase().isSuperTypeOf(domainElement.eClass())) {
					return UseCaseEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getComment().isSuperTypeOf(domainElement.eClass())) {
					return CommentEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDurationConstraint().isSuperTypeOf(domainElement.eClass())) {
					return DurationConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getTimeConstraint().isSuperTypeOf(domainElement.eClass())) {
					return TimeConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getIntervalConstraint().isSuperTypeOf(domainElement.eClass())) {
					return IntervalConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInteractionConstraint().isSuperTypeOf(domainElement.eClass())) {
					return InteractionConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getConstraint().isSuperTypeOf(domainElement.eClass())) {
					return ConstraintEditPartCN.VISUAL_ID;
				}
				break;
			case ProtocolStateMachineCompositeCompartmentEditPartCN.VISUAL_ID:
				if (UMLPackage.eINSTANCE.getParameter().isSuperTypeOf(domainElement.eClass())) {
					return ParameterEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getProperty().isSuperTypeOf(domainElement.eClass()) && isProperty_Shape(containerView, (Property) domainElement)) {
					return PropertyPartEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getCollaborationUse().isSuperTypeOf(domainElement.eClass())) {
					return CollaborationUseEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getActivity().isSuperTypeOf(domainElement.eClass())) {
					return ActivityCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInteraction().isSuperTypeOf(domainElement.eClass())) {
					return InteractionCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getProtocolStateMachine().isSuperTypeOf(domainElement.eClass())) {
					return ProtocolStateMachineCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getStateMachine().isSuperTypeOf(domainElement.eClass())) {
					return StateMachineCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getFunctionBehavior().isSuperTypeOf(domainElement.eClass())) {
					return FunctionBehaviorCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getOpaqueBehavior().isSuperTypeOf(domainElement.eClass())) {
					return OpaqueBehaviorCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getComponent().isSuperTypeOf(domainElement.eClass())) {
					return ComponentCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDevice().isSuperTypeOf(domainElement.eClass())) {
					return DeviceCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getExecutionEnvironment().isSuperTypeOf(domainElement.eClass())) {
					return ExecutionEnvironmentCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getNode().isSuperTypeOf(domainElement.eClass())) {
					return NodeCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getClass_().isSuperTypeOf(domainElement.eClass())) {
					return ClassCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getCollaboration().isSuperTypeOf(domainElement.eClass())) {
					return CollaborationCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInterface().isSuperTypeOf(domainElement.eClass())) {
					return InterfaceEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getPrimitiveType().isSuperTypeOf(domainElement.eClass())) {
					return PrimitiveTypeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getEnumeration().isSuperTypeOf(domainElement.eClass())) {
					return EnumerationEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDataType().isSuperTypeOf(domainElement.eClass())) {
					return DataTypeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getActor().isSuperTypeOf(domainElement.eClass())) {
					return ActorEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDeploymentSpecification().isSuperTypeOf(domainElement.eClass())) {
					return DeploymentSpecificationEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getArtifact().isSuperTypeOf(domainElement.eClass())) {
					return ArtifactEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInformationItem().isSuperTypeOf(domainElement.eClass())) {
					return InformationItemEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getSignal().isSuperTypeOf(domainElement.eClass())) {
					return SignalEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getUseCase().isSuperTypeOf(domainElement.eClass())) {
					return UseCaseEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getComment().isSuperTypeOf(domainElement.eClass())) {
					return CommentEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDurationConstraint().isSuperTypeOf(domainElement.eClass())) {
					return DurationConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getTimeConstraint().isSuperTypeOf(domainElement.eClass())) {
					return TimeConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getIntervalConstraint().isSuperTypeOf(domainElement.eClass())) {
					return IntervalConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInteractionConstraint().isSuperTypeOf(domainElement.eClass())) {
					return InteractionConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getConstraint().isSuperTypeOf(domainElement.eClass())) {
					return ConstraintEditPartCN.VISUAL_ID;
				}
				break;
			case StateMachineCompositeCompartmentEditPartCN.VISUAL_ID:
				if (UMLPackage.eINSTANCE.getParameter().isSuperTypeOf(domainElement.eClass())) {
					return ParameterEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getProperty().isSuperTypeOf(domainElement.eClass()) && isProperty_Shape(containerView, (Property) domainElement)) {
					return PropertyPartEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getCollaborationUse().isSuperTypeOf(domainElement.eClass())) {
					return CollaborationUseEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getActivity().isSuperTypeOf(domainElement.eClass())) {
					return ActivityCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInteraction().isSuperTypeOf(domainElement.eClass())) {
					return InteractionCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getProtocolStateMachine().isSuperTypeOf(domainElement.eClass())) {
					return ProtocolStateMachineCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getStateMachine().isSuperTypeOf(domainElement.eClass())) {
					return StateMachineCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getFunctionBehavior().isSuperTypeOf(domainElement.eClass())) {
					return FunctionBehaviorCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getOpaqueBehavior().isSuperTypeOf(domainElement.eClass())) {
					return OpaqueBehaviorCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getComponent().isSuperTypeOf(domainElement.eClass())) {
					return ComponentCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDevice().isSuperTypeOf(domainElement.eClass())) {
					return DeviceCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getExecutionEnvironment().isSuperTypeOf(domainElement.eClass())) {
					return ExecutionEnvironmentCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getNode().isSuperTypeOf(domainElement.eClass())) {
					return NodeCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getClass_().isSuperTypeOf(domainElement.eClass())) {
					return ClassCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getCollaboration().isSuperTypeOf(domainElement.eClass())) {
					return CollaborationCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInterface().isSuperTypeOf(domainElement.eClass())) {
					return InterfaceEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getPrimitiveType().isSuperTypeOf(domainElement.eClass())) {
					return PrimitiveTypeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getEnumeration().isSuperTypeOf(domainElement.eClass())) {
					return EnumerationEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDataType().isSuperTypeOf(domainElement.eClass())) {
					return DataTypeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getActor().isSuperTypeOf(domainElement.eClass())) {
					return ActorEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDeploymentSpecification().isSuperTypeOf(domainElement.eClass())) {
					return DeploymentSpecificationEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getArtifact().isSuperTypeOf(domainElement.eClass())) {
					return ArtifactEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInformationItem().isSuperTypeOf(domainElement.eClass())) {
					return InformationItemEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getSignal().isSuperTypeOf(domainElement.eClass())) {
					return SignalEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getUseCase().isSuperTypeOf(domainElement.eClass())) {
					return UseCaseEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getComment().isSuperTypeOf(domainElement.eClass())) {
					return CommentEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDurationConstraint().isSuperTypeOf(domainElement.eClass())) {
					return DurationConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getTimeConstraint().isSuperTypeOf(domainElement.eClass())) {
					return TimeConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getIntervalConstraint().isSuperTypeOf(domainElement.eClass())) {
					return IntervalConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInteractionConstraint().isSuperTypeOf(domainElement.eClass())) {
					return InteractionConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getConstraint().isSuperTypeOf(domainElement.eClass())) {
					return ConstraintEditPartCN.VISUAL_ID;
				}
				break;
			case FunctionBehaviorCompositeCompartmentEditPartCN.VISUAL_ID:
				if (UMLPackage.eINSTANCE.getParameter().isSuperTypeOf(domainElement.eClass())) {
					return ParameterEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getProperty().isSuperTypeOf(domainElement.eClass()) && isProperty_Shape(containerView, (Property) domainElement)) {
					return PropertyPartEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getCollaborationUse().isSuperTypeOf(domainElement.eClass())) {
					return CollaborationUseEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getActivity().isSuperTypeOf(domainElement.eClass())) {
					return ActivityCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInteraction().isSuperTypeOf(domainElement.eClass())) {
					return InteractionCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getProtocolStateMachine().isSuperTypeOf(domainElement.eClass())) {
					return ProtocolStateMachineCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getStateMachine().isSuperTypeOf(domainElement.eClass())) {
					return StateMachineCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getFunctionBehavior().isSuperTypeOf(domainElement.eClass())) {
					return FunctionBehaviorCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getOpaqueBehavior().isSuperTypeOf(domainElement.eClass())) {
					return OpaqueBehaviorCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getComponent().isSuperTypeOf(domainElement.eClass())) {
					return ComponentCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDevice().isSuperTypeOf(domainElement.eClass())) {
					return DeviceCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getExecutionEnvironment().isSuperTypeOf(domainElement.eClass())) {
					return ExecutionEnvironmentCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getNode().isSuperTypeOf(domainElement.eClass())) {
					return NodeCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getClass_().isSuperTypeOf(domainElement.eClass())) {
					return ClassCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getCollaboration().isSuperTypeOf(domainElement.eClass())) {
					return CollaborationCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInterface().isSuperTypeOf(domainElement.eClass())) {
					return InterfaceEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getPrimitiveType().isSuperTypeOf(domainElement.eClass())) {
					return PrimitiveTypeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getEnumeration().isSuperTypeOf(domainElement.eClass())) {
					return EnumerationEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDataType().isSuperTypeOf(domainElement.eClass())) {
					return DataTypeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getActor().isSuperTypeOf(domainElement.eClass())) {
					return ActorEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDeploymentSpecification().isSuperTypeOf(domainElement.eClass())) {
					return DeploymentSpecificationEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getArtifact().isSuperTypeOf(domainElement.eClass())) {
					return ArtifactEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInformationItem().isSuperTypeOf(domainElement.eClass())) {
					return InformationItemEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getSignal().isSuperTypeOf(domainElement.eClass())) {
					return SignalEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getUseCase().isSuperTypeOf(domainElement.eClass())) {
					return UseCaseEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getComment().isSuperTypeOf(domainElement.eClass())) {
					return CommentEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDurationConstraint().isSuperTypeOf(domainElement.eClass())) {
					return DurationConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getTimeConstraint().isSuperTypeOf(domainElement.eClass())) {
					return TimeConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getIntervalConstraint().isSuperTypeOf(domainElement.eClass())) {
					return IntervalConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInteractionConstraint().isSuperTypeOf(domainElement.eClass())) {
					return InteractionConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getConstraint().isSuperTypeOf(domainElement.eClass())) {
					return ConstraintEditPartCN.VISUAL_ID;
				}
				break;
			case OpaqueBehaviorCompositeCompartmentEditPartCN.VISUAL_ID:
				if (UMLPackage.eINSTANCE.getParameter().isSuperTypeOf(domainElement.eClass())) {
					return ParameterEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getProperty().isSuperTypeOf(domainElement.eClass()) && isProperty_Shape(containerView, (Property) domainElement)) {
					return PropertyPartEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getCollaborationUse().isSuperTypeOf(domainElement.eClass())) {
					return CollaborationUseEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getActivity().isSuperTypeOf(domainElement.eClass())) {
					return ActivityCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInteraction().isSuperTypeOf(domainElement.eClass())) {
					return InteractionCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getProtocolStateMachine().isSuperTypeOf(domainElement.eClass())) {
					return ProtocolStateMachineCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getStateMachine().isSuperTypeOf(domainElement.eClass())) {
					return StateMachineCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getFunctionBehavior().isSuperTypeOf(domainElement.eClass())) {
					return FunctionBehaviorCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getOpaqueBehavior().isSuperTypeOf(domainElement.eClass())) {
					return OpaqueBehaviorCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getComponent().isSuperTypeOf(domainElement.eClass())) {
					return ComponentCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDevice().isSuperTypeOf(domainElement.eClass())) {
					return DeviceCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getExecutionEnvironment().isSuperTypeOf(domainElement.eClass())) {
					return ExecutionEnvironmentCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getNode().isSuperTypeOf(domainElement.eClass())) {
					return NodeCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getClass_().isSuperTypeOf(domainElement.eClass())) {
					return ClassCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getCollaboration().isSuperTypeOf(domainElement.eClass())) {
					return CollaborationCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInterface().isSuperTypeOf(domainElement.eClass())) {
					return InterfaceEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getPrimitiveType().isSuperTypeOf(domainElement.eClass())) {
					return PrimitiveTypeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getEnumeration().isSuperTypeOf(domainElement.eClass())) {
					return EnumerationEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDataType().isSuperTypeOf(domainElement.eClass())) {
					return DataTypeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getActor().isSuperTypeOf(domainElement.eClass())) {
					return ActorEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDeploymentSpecification().isSuperTypeOf(domainElement.eClass())) {
					return DeploymentSpecificationEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getArtifact().isSuperTypeOf(domainElement.eClass())) {
					return ArtifactEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInformationItem().isSuperTypeOf(domainElement.eClass())) {
					return InformationItemEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getSignal().isSuperTypeOf(domainElement.eClass())) {
					return SignalEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getUseCase().isSuperTypeOf(domainElement.eClass())) {
					return UseCaseEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getComment().isSuperTypeOf(domainElement.eClass())) {
					return CommentEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDurationConstraint().isSuperTypeOf(domainElement.eClass())) {
					return DurationConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getTimeConstraint().isSuperTypeOf(domainElement.eClass())) {
					return TimeConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getIntervalConstraint().isSuperTypeOf(domainElement.eClass())) {
					return IntervalConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInteractionConstraint().isSuperTypeOf(domainElement.eClass())) {
					return InteractionConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getConstraint().isSuperTypeOf(domainElement.eClass())) {
					return ConstraintEditPartCN.VISUAL_ID;
				}
				break;
			case ComponentCompositeCompartmentEditPartCN.VISUAL_ID:
				if (UMLPackage.eINSTANCE.getProperty().isSuperTypeOf(domainElement.eClass()) && isProperty_Shape(containerView, (Property) domainElement)) {
					return PropertyPartEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getCollaborationUse().isSuperTypeOf(domainElement.eClass())) {
					return CollaborationUseEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getActivity().isSuperTypeOf(domainElement.eClass())) {
					return ActivityCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInteraction().isSuperTypeOf(domainElement.eClass())) {
					return InteractionCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getProtocolStateMachine().isSuperTypeOf(domainElement.eClass())) {
					return ProtocolStateMachineCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getStateMachine().isSuperTypeOf(domainElement.eClass())) {
					return StateMachineCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getFunctionBehavior().isSuperTypeOf(domainElement.eClass())) {
					return FunctionBehaviorCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getOpaqueBehavior().isSuperTypeOf(domainElement.eClass())) {
					return OpaqueBehaviorCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getComponent().isSuperTypeOf(domainElement.eClass())) {
					return ComponentCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDevice().isSuperTypeOf(domainElement.eClass())) {
					return DeviceCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getExecutionEnvironment().isSuperTypeOf(domainElement.eClass())) {
					return ExecutionEnvironmentCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getNode().isSuperTypeOf(domainElement.eClass())) {
					return NodeCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getClass_().isSuperTypeOf(domainElement.eClass())) {
					return ClassCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getCollaboration().isSuperTypeOf(domainElement.eClass())) {
					return CollaborationCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInterface().isSuperTypeOf(domainElement.eClass())) {
					return InterfaceEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getPrimitiveType().isSuperTypeOf(domainElement.eClass())) {
					return PrimitiveTypeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getEnumeration().isSuperTypeOf(domainElement.eClass())) {
					return EnumerationEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDataType().isSuperTypeOf(domainElement.eClass())) {
					return DataTypeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getActor().isSuperTypeOf(domainElement.eClass())) {
					return ActorEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDeploymentSpecification().isSuperTypeOf(domainElement.eClass())) {
					return DeploymentSpecificationEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getArtifact().isSuperTypeOf(domainElement.eClass())) {
					return ArtifactEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInformationItem().isSuperTypeOf(domainElement.eClass())) {
					return InformationItemEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getSignal().isSuperTypeOf(domainElement.eClass())) {
					return SignalEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getUseCase().isSuperTypeOf(domainElement.eClass())) {
					return UseCaseEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getComment().isSuperTypeOf(domainElement.eClass())) {
					return CommentEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDurationConstraint().isSuperTypeOf(domainElement.eClass())) {
					return DurationConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getTimeConstraint().isSuperTypeOf(domainElement.eClass())) {
					return TimeConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getIntervalConstraint().isSuperTypeOf(domainElement.eClass())) {
					return IntervalConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInteractionConstraint().isSuperTypeOf(domainElement.eClass())) {
					return InteractionConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getConstraint().isSuperTypeOf(domainElement.eClass())) {
					return ConstraintEditPartCN.VISUAL_ID;
				}
				break;
			case DeviceCompositeCompartmentEditPartCN.VISUAL_ID:
				if (UMLPackage.eINSTANCE.getProperty().isSuperTypeOf(domainElement.eClass()) && isProperty_Shape(containerView, (Property) domainElement)) {
					return PropertyPartEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getCollaborationUse().isSuperTypeOf(domainElement.eClass())) {
					return CollaborationUseEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getActivity().isSuperTypeOf(domainElement.eClass())) {
					return ActivityCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInteraction().isSuperTypeOf(domainElement.eClass())) {
					return InteractionCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getProtocolStateMachine().isSuperTypeOf(domainElement.eClass())) {
					return ProtocolStateMachineCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getStateMachine().isSuperTypeOf(domainElement.eClass())) {
					return StateMachineCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getFunctionBehavior().isSuperTypeOf(domainElement.eClass())) {
					return FunctionBehaviorCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getOpaqueBehavior().isSuperTypeOf(domainElement.eClass())) {
					return OpaqueBehaviorCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getComponent().isSuperTypeOf(domainElement.eClass())) {
					return ComponentCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDevice().isSuperTypeOf(domainElement.eClass())) {
					return DeviceCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getExecutionEnvironment().isSuperTypeOf(domainElement.eClass())) {
					return ExecutionEnvironmentCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getNode().isSuperTypeOf(domainElement.eClass())) {
					return NodeCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getClass_().isSuperTypeOf(domainElement.eClass())) {
					return ClassCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getCollaboration().isSuperTypeOf(domainElement.eClass())) {
					return CollaborationCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInterface().isSuperTypeOf(domainElement.eClass())) {
					return InterfaceEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getPrimitiveType().isSuperTypeOf(domainElement.eClass())) {
					return PrimitiveTypeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getEnumeration().isSuperTypeOf(domainElement.eClass())) {
					return EnumerationEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDataType().isSuperTypeOf(domainElement.eClass())) {
					return DataTypeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getActor().isSuperTypeOf(domainElement.eClass())) {
					return ActorEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDeploymentSpecification().isSuperTypeOf(domainElement.eClass())) {
					return DeploymentSpecificationEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getArtifact().isSuperTypeOf(domainElement.eClass())) {
					return ArtifactEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInformationItem().isSuperTypeOf(domainElement.eClass())) {
					return InformationItemEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getSignal().isSuperTypeOf(domainElement.eClass())) {
					return SignalEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getUseCase().isSuperTypeOf(domainElement.eClass())) {
					return UseCaseEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getComment().isSuperTypeOf(domainElement.eClass())) {
					return CommentEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDurationConstraint().isSuperTypeOf(domainElement.eClass())) {
					return DurationConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getTimeConstraint().isSuperTypeOf(domainElement.eClass())) {
					return TimeConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getIntervalConstraint().isSuperTypeOf(domainElement.eClass())) {
					return IntervalConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInteractionConstraint().isSuperTypeOf(domainElement.eClass())) {
					return InteractionConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getConstraint().isSuperTypeOf(domainElement.eClass())) {
					return ConstraintEditPartCN.VISUAL_ID;
				}
				break;
			case ExecutionEnvironmentCompositeCompartmentEditPartCN.VISUAL_ID:
				if (UMLPackage.eINSTANCE.getProperty().isSuperTypeOf(domainElement.eClass()) && isProperty_Shape(containerView, (Property) domainElement)) {
					return PropertyPartEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getCollaborationUse().isSuperTypeOf(domainElement.eClass())) {
					return CollaborationUseEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getActivity().isSuperTypeOf(domainElement.eClass())) {
					return ActivityCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInteraction().isSuperTypeOf(domainElement.eClass())) {
					return InteractionCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getProtocolStateMachine().isSuperTypeOf(domainElement.eClass())) {
					return ProtocolStateMachineCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getStateMachine().isSuperTypeOf(domainElement.eClass())) {
					return StateMachineCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getFunctionBehavior().isSuperTypeOf(domainElement.eClass())) {
					return FunctionBehaviorCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getOpaqueBehavior().isSuperTypeOf(domainElement.eClass())) {
					return OpaqueBehaviorCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getComponent().isSuperTypeOf(domainElement.eClass())) {
					return ComponentCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDevice().isSuperTypeOf(domainElement.eClass())) {
					return DeviceCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getExecutionEnvironment().isSuperTypeOf(domainElement.eClass())) {
					return ExecutionEnvironmentCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getNode().isSuperTypeOf(domainElement.eClass())) {
					return NodeCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getClass_().isSuperTypeOf(domainElement.eClass())) {
					return ClassCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getCollaboration().isSuperTypeOf(domainElement.eClass())) {
					return CollaborationCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInterface().isSuperTypeOf(domainElement.eClass())) {
					return InterfaceEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getPrimitiveType().isSuperTypeOf(domainElement.eClass())) {
					return PrimitiveTypeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getEnumeration().isSuperTypeOf(domainElement.eClass())) {
					return EnumerationEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDataType().isSuperTypeOf(domainElement.eClass())) {
					return DataTypeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getActor().isSuperTypeOf(domainElement.eClass())) {
					return ActorEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDeploymentSpecification().isSuperTypeOf(domainElement.eClass())) {
					return DeploymentSpecificationEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getArtifact().isSuperTypeOf(domainElement.eClass())) {
					return ArtifactEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInformationItem().isSuperTypeOf(domainElement.eClass())) {
					return InformationItemEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getSignal().isSuperTypeOf(domainElement.eClass())) {
					return SignalEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getUseCase().isSuperTypeOf(domainElement.eClass())) {
					return UseCaseEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getComment().isSuperTypeOf(domainElement.eClass())) {
					return CommentEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDurationConstraint().isSuperTypeOf(domainElement.eClass())) {
					return DurationConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getTimeConstraint().isSuperTypeOf(domainElement.eClass())) {
					return TimeConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getIntervalConstraint().isSuperTypeOf(domainElement.eClass())) {
					return IntervalConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInteractionConstraint().isSuperTypeOf(domainElement.eClass())) {
					return InteractionConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getConstraint().isSuperTypeOf(domainElement.eClass())) {
					return ConstraintEditPartCN.VISUAL_ID;
				}
				break;
			case NodeCompositeCompartmentEditPartCN.VISUAL_ID:
				if (UMLPackage.eINSTANCE.getProperty().isSuperTypeOf(domainElement.eClass()) && isProperty_Shape(containerView, (Property) domainElement)) {
					return PropertyPartEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getCollaborationUse().isSuperTypeOf(domainElement.eClass())) {
					return CollaborationUseEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getActivity().isSuperTypeOf(domainElement.eClass())) {
					return ActivityCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInteraction().isSuperTypeOf(domainElement.eClass())) {
					return InteractionCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getProtocolStateMachine().isSuperTypeOf(domainElement.eClass())) {
					return ProtocolStateMachineCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getStateMachine().isSuperTypeOf(domainElement.eClass())) {
					return StateMachineCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getFunctionBehavior().isSuperTypeOf(domainElement.eClass())) {
					return FunctionBehaviorCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getOpaqueBehavior().isSuperTypeOf(domainElement.eClass())) {
					return OpaqueBehaviorCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getComponent().isSuperTypeOf(domainElement.eClass())) {
					return ComponentCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDevice().isSuperTypeOf(domainElement.eClass())) {
					return DeviceCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getExecutionEnvironment().isSuperTypeOf(domainElement.eClass())) {
					return ExecutionEnvironmentCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getNode().isSuperTypeOf(domainElement.eClass())) {
					return NodeCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getClass_().isSuperTypeOf(domainElement.eClass())) {
					return ClassCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getCollaboration().isSuperTypeOf(domainElement.eClass())) {
					return CollaborationCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInterface().isSuperTypeOf(domainElement.eClass())) {
					return InterfaceEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getPrimitiveType().isSuperTypeOf(domainElement.eClass())) {
					return PrimitiveTypeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getEnumeration().isSuperTypeOf(domainElement.eClass())) {
					return EnumerationEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDataType().isSuperTypeOf(domainElement.eClass())) {
					return DataTypeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getActor().isSuperTypeOf(domainElement.eClass())) {
					return ActorEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDeploymentSpecification().isSuperTypeOf(domainElement.eClass())) {
					return DeploymentSpecificationEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getArtifact().isSuperTypeOf(domainElement.eClass())) {
					return ArtifactEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInformationItem().isSuperTypeOf(domainElement.eClass())) {
					return InformationItemEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getSignal().isSuperTypeOf(domainElement.eClass())) {
					return SignalEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getUseCase().isSuperTypeOf(domainElement.eClass())) {
					return UseCaseEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getComment().isSuperTypeOf(domainElement.eClass())) {
					return CommentEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDurationConstraint().isSuperTypeOf(domainElement.eClass())) {
					return DurationConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getTimeConstraint().isSuperTypeOf(domainElement.eClass())) {
					return TimeConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getIntervalConstraint().isSuperTypeOf(domainElement.eClass())) {
					return IntervalConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInteractionConstraint().isSuperTypeOf(domainElement.eClass())) {
					return InteractionConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getConstraint().isSuperTypeOf(domainElement.eClass())) {
					return ConstraintEditPartCN.VISUAL_ID;
				}
				break;
			case ClassCompositeCompartmentEditPartCN.VISUAL_ID:
				if (UMLPackage.eINSTANCE.getProperty().isSuperTypeOf(domainElement.eClass()) && isProperty_Shape(containerView, (Property) domainElement)) {
					return PropertyPartEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getCollaborationUse().isSuperTypeOf(domainElement.eClass())) {
					return CollaborationUseEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getActivity().isSuperTypeOf(domainElement.eClass())) {
					return ActivityCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInteraction().isSuperTypeOf(domainElement.eClass())) {
					return InteractionCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getProtocolStateMachine().isSuperTypeOf(domainElement.eClass())) {
					return ProtocolStateMachineCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getStateMachine().isSuperTypeOf(domainElement.eClass())) {
					return StateMachineCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getFunctionBehavior().isSuperTypeOf(domainElement.eClass())) {
					return FunctionBehaviorCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getOpaqueBehavior().isSuperTypeOf(domainElement.eClass())) {
					return OpaqueBehaviorCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getComponent().isSuperTypeOf(domainElement.eClass())) {
					return ComponentCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDevice().isSuperTypeOf(domainElement.eClass())) {
					return DeviceCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getExecutionEnvironment().isSuperTypeOf(domainElement.eClass())) {
					return ExecutionEnvironmentCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getNode().isSuperTypeOf(domainElement.eClass())) {
					return NodeCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getClass_().isSuperTypeOf(domainElement.eClass())) {
					return ClassCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getCollaboration().isSuperTypeOf(domainElement.eClass())) {
					return CollaborationCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInterface().isSuperTypeOf(domainElement.eClass())) {
					return InterfaceEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getPrimitiveType().isSuperTypeOf(domainElement.eClass())) {
					return PrimitiveTypeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getEnumeration().isSuperTypeOf(domainElement.eClass())) {
					return EnumerationEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDataType().isSuperTypeOf(domainElement.eClass())) {
					return DataTypeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getActor().isSuperTypeOf(domainElement.eClass())) {
					return ActorEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDeploymentSpecification().isSuperTypeOf(domainElement.eClass())) {
					return DeploymentSpecificationEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getArtifact().isSuperTypeOf(domainElement.eClass())) {
					return ArtifactEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInformationItem().isSuperTypeOf(domainElement.eClass())) {
					return InformationItemEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getSignal().isSuperTypeOf(domainElement.eClass())) {
					return SignalEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getUseCase().isSuperTypeOf(domainElement.eClass())) {
					return UseCaseEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getComment().isSuperTypeOf(domainElement.eClass())) {
					return CommentEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDurationConstraint().isSuperTypeOf(domainElement.eClass())) {
					return DurationConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getTimeConstraint().isSuperTypeOf(domainElement.eClass())) {
					return TimeConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getIntervalConstraint().isSuperTypeOf(domainElement.eClass())) {
					return IntervalConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInteractionConstraint().isSuperTypeOf(domainElement.eClass())) {
					return InteractionConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getConstraint().isSuperTypeOf(domainElement.eClass())) {
					return ConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getPort().isSuperTypeOf(domainElement.eClass())) {
					return BehaviorPortEditPart.VISUAL_ID;
				}
				break;
			case CollaborationCompositeCompartmentEditPartCN.VISUAL_ID:
				if (UMLPackage.eINSTANCE.getProperty().isSuperTypeOf(domainElement.eClass()) && isProperty_Shape(containerView, (Property) domainElement)) {
					return PropertyPartEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getCollaborationUse().isSuperTypeOf(domainElement.eClass())) {
					return CollaborationUseEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getComment().isSuperTypeOf(domainElement.eClass())) {
					return CommentEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getConnectableElement().isSuperTypeOf(domainElement.eClass())) {
					return CollaborationRoleEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDurationConstraint().isSuperTypeOf(domainElement.eClass())) {
					return DurationConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getTimeConstraint().isSuperTypeOf(domainElement.eClass())) {
					return TimeConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getIntervalConstraint().isSuperTypeOf(domainElement.eClass())) {
					return IntervalConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInteractionConstraint().isSuperTypeOf(domainElement.eClass())) {
					return InteractionConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getConstraint().isSuperTypeOf(domainElement.eClass())) {
					return ConstraintEditPartCN.VISUAL_ID;
				}
				break;
			case ActivityCompositeCompartmentEditPart.VISUAL_ID:
				if (UMLPackage.eINSTANCE.getParameter().isSuperTypeOf(domainElement.eClass())) {
					return ParameterEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getProperty().isSuperTypeOf(domainElement.eClass()) && isProperty_Shape(containerView, (Property) domainElement)) {
					return PropertyPartEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getCollaborationUse().isSuperTypeOf(domainElement.eClass())) {
					return CollaborationUseEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getActivity().isSuperTypeOf(domainElement.eClass())) {
					return ActivityCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInteraction().isSuperTypeOf(domainElement.eClass())) {
					return InteractionCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getProtocolStateMachine().isSuperTypeOf(domainElement.eClass())) {
					return ProtocolStateMachineCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getStateMachine().isSuperTypeOf(domainElement.eClass())) {
					return StateMachineCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getFunctionBehavior().isSuperTypeOf(domainElement.eClass())) {
					return FunctionBehaviorCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getOpaqueBehavior().isSuperTypeOf(domainElement.eClass())) {
					return OpaqueBehaviorCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getComponent().isSuperTypeOf(domainElement.eClass())) {
					return ComponentCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDevice().isSuperTypeOf(domainElement.eClass())) {
					return DeviceCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getExecutionEnvironment().isSuperTypeOf(domainElement.eClass())) {
					return ExecutionEnvironmentCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getNode().isSuperTypeOf(domainElement.eClass())) {
					return NodeCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getClass_().isSuperTypeOf(domainElement.eClass())) {
					return ClassCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getCollaboration().isSuperTypeOf(domainElement.eClass())) {
					return CollaborationCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInterface().isSuperTypeOf(domainElement.eClass())) {
					return InterfaceEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getPrimitiveType().isSuperTypeOf(domainElement.eClass())) {
					return PrimitiveTypeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getEnumeration().isSuperTypeOf(domainElement.eClass())) {
					return EnumerationEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDataType().isSuperTypeOf(domainElement.eClass())) {
					return DataTypeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getActor().isSuperTypeOf(domainElement.eClass())) {
					return ActorEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDeploymentSpecification().isSuperTypeOf(domainElement.eClass())) {
					return DeploymentSpecificationEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getArtifact().isSuperTypeOf(domainElement.eClass())) {
					return ArtifactEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInformationItem().isSuperTypeOf(domainElement.eClass())) {
					return InformationItemEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getSignal().isSuperTypeOf(domainElement.eClass())) {
					return SignalEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getUseCase().isSuperTypeOf(domainElement.eClass())) {
					return UseCaseEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getComment().isSuperTypeOf(domainElement.eClass())) {
					return CommentEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDurationConstraint().isSuperTypeOf(domainElement.eClass())) {
					return DurationConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getTimeConstraint().isSuperTypeOf(domainElement.eClass())) {
					return TimeConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getIntervalConstraint().isSuperTypeOf(domainElement.eClass())) {
					return IntervalConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInteractionConstraint().isSuperTypeOf(domainElement.eClass())) {
					return InteractionConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getConstraint().isSuperTypeOf(domainElement.eClass())) {
					return ConstraintEditPartCN.VISUAL_ID;
				}
				break;
			case InteractionCompositeCompartmentEditPart.VISUAL_ID:
				if (UMLPackage.eINSTANCE.getParameter().isSuperTypeOf(domainElement.eClass())) {
					return ParameterEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getProperty().isSuperTypeOf(domainElement.eClass()) && isProperty_Shape(containerView, (Property) domainElement)) {
					return PropertyPartEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getCollaborationUse().isSuperTypeOf(domainElement.eClass())) {
					return CollaborationUseEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getActivity().isSuperTypeOf(domainElement.eClass())) {
					return ActivityCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInteraction().isSuperTypeOf(domainElement.eClass())) {
					return InteractionCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getProtocolStateMachine().isSuperTypeOf(domainElement.eClass())) {
					return ProtocolStateMachineCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getStateMachine().isSuperTypeOf(domainElement.eClass())) {
					return StateMachineCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getFunctionBehavior().isSuperTypeOf(domainElement.eClass())) {
					return FunctionBehaviorCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getOpaqueBehavior().isSuperTypeOf(domainElement.eClass())) {
					return OpaqueBehaviorCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getComponent().isSuperTypeOf(domainElement.eClass())) {
					return ComponentCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDevice().isSuperTypeOf(domainElement.eClass())) {
					return DeviceCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getExecutionEnvironment().isSuperTypeOf(domainElement.eClass())) {
					return ExecutionEnvironmentCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getNode().isSuperTypeOf(domainElement.eClass())) {
					return NodeCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getClass_().isSuperTypeOf(domainElement.eClass())) {
					return ClassCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getCollaboration().isSuperTypeOf(domainElement.eClass())) {
					return CollaborationCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInterface().isSuperTypeOf(domainElement.eClass())) {
					return InterfaceEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getPrimitiveType().isSuperTypeOf(domainElement.eClass())) {
					return PrimitiveTypeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getEnumeration().isSuperTypeOf(domainElement.eClass())) {
					return EnumerationEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDataType().isSuperTypeOf(domainElement.eClass())) {
					return DataTypeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getActor().isSuperTypeOf(domainElement.eClass())) {
					return ActorEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDeploymentSpecification().isSuperTypeOf(domainElement.eClass())) {
					return DeploymentSpecificationEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getArtifact().isSuperTypeOf(domainElement.eClass())) {
					return ArtifactEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInformationItem().isSuperTypeOf(domainElement.eClass())) {
					return InformationItemEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getSignal().isSuperTypeOf(domainElement.eClass())) {
					return SignalEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getUseCase().isSuperTypeOf(domainElement.eClass())) {
					return UseCaseEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getComment().isSuperTypeOf(domainElement.eClass())) {
					return CommentEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDurationConstraint().isSuperTypeOf(domainElement.eClass())) {
					return DurationConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getTimeConstraint().isSuperTypeOf(domainElement.eClass())) {
					return TimeConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getIntervalConstraint().isSuperTypeOf(domainElement.eClass())) {
					return IntervalConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInteractionConstraint().isSuperTypeOf(domainElement.eClass())) {
					return InteractionConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getConstraint().isSuperTypeOf(domainElement.eClass())) {
					return ConstraintEditPartCN.VISUAL_ID;
				}
				break;
			case ProtocolStateMachineCompositeCompartmentEditPart.VISUAL_ID:
				if (UMLPackage.eINSTANCE.getParameter().isSuperTypeOf(domainElement.eClass())) {
					return ParameterEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getProperty().isSuperTypeOf(domainElement.eClass()) && isProperty_Shape(containerView, (Property) domainElement)) {
					return PropertyPartEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getCollaborationUse().isSuperTypeOf(domainElement.eClass())) {
					return CollaborationUseEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getActivity().isSuperTypeOf(domainElement.eClass())) {
					return ActivityCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInteraction().isSuperTypeOf(domainElement.eClass())) {
					return InteractionCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getProtocolStateMachine().isSuperTypeOf(domainElement.eClass())) {
					return ProtocolStateMachineCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getStateMachine().isSuperTypeOf(domainElement.eClass())) {
					return StateMachineCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getFunctionBehavior().isSuperTypeOf(domainElement.eClass())) {
					return FunctionBehaviorCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getOpaqueBehavior().isSuperTypeOf(domainElement.eClass())) {
					return OpaqueBehaviorCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getComponent().isSuperTypeOf(domainElement.eClass())) {
					return ComponentCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDevice().isSuperTypeOf(domainElement.eClass())) {
					return DeviceCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getExecutionEnvironment().isSuperTypeOf(domainElement.eClass())) {
					return ExecutionEnvironmentCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getNode().isSuperTypeOf(domainElement.eClass())) {
					return NodeCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getClass_().isSuperTypeOf(domainElement.eClass())) {
					return ClassCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getCollaboration().isSuperTypeOf(domainElement.eClass())) {
					return CollaborationCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInterface().isSuperTypeOf(domainElement.eClass())) {
					return InterfaceEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getPrimitiveType().isSuperTypeOf(domainElement.eClass())) {
					return PrimitiveTypeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getEnumeration().isSuperTypeOf(domainElement.eClass())) {
					return EnumerationEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDataType().isSuperTypeOf(domainElement.eClass())) {
					return DataTypeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getActor().isSuperTypeOf(domainElement.eClass())) {
					return ActorEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDeploymentSpecification().isSuperTypeOf(domainElement.eClass())) {
					return DeploymentSpecificationEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getArtifact().isSuperTypeOf(domainElement.eClass())) {
					return ArtifactEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInformationItem().isSuperTypeOf(domainElement.eClass())) {
					return InformationItemEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getSignal().isSuperTypeOf(domainElement.eClass())) {
					return SignalEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getUseCase().isSuperTypeOf(domainElement.eClass())) {
					return UseCaseEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getComment().isSuperTypeOf(domainElement.eClass())) {
					return CommentEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDurationConstraint().isSuperTypeOf(domainElement.eClass())) {
					return DurationConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getTimeConstraint().isSuperTypeOf(domainElement.eClass())) {
					return TimeConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getIntervalConstraint().isSuperTypeOf(domainElement.eClass())) {
					return IntervalConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInteractionConstraint().isSuperTypeOf(domainElement.eClass())) {
					return InteractionConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getConstraint().isSuperTypeOf(domainElement.eClass())) {
					return ConstraintEditPartCN.VISUAL_ID;
				}
				break;
			case StateMachineCompositeCompartmentEditPart.VISUAL_ID:
				if (UMLPackage.eINSTANCE.getParameter().isSuperTypeOf(domainElement.eClass())) {
					return ParameterEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getProperty().isSuperTypeOf(domainElement.eClass()) && isProperty_Shape(containerView, (Property) domainElement)) {
					return PropertyPartEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getCollaborationUse().isSuperTypeOf(domainElement.eClass())) {
					return CollaborationUseEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getActivity().isSuperTypeOf(domainElement.eClass())) {
					return ActivityCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInteraction().isSuperTypeOf(domainElement.eClass())) {
					return InteractionCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getProtocolStateMachine().isSuperTypeOf(domainElement.eClass())) {
					return ProtocolStateMachineCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getStateMachine().isSuperTypeOf(domainElement.eClass())) {
					return StateMachineCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getFunctionBehavior().isSuperTypeOf(domainElement.eClass())) {
					return FunctionBehaviorCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getOpaqueBehavior().isSuperTypeOf(domainElement.eClass())) {
					return OpaqueBehaviorCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getComponent().isSuperTypeOf(domainElement.eClass())) {
					return ComponentCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDevice().isSuperTypeOf(domainElement.eClass())) {
					return DeviceCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getExecutionEnvironment().isSuperTypeOf(domainElement.eClass())) {
					return ExecutionEnvironmentCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getNode().isSuperTypeOf(domainElement.eClass())) {
					return NodeCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getClass_().isSuperTypeOf(domainElement.eClass())) {
					return ClassCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getCollaboration().isSuperTypeOf(domainElement.eClass())) {
					return CollaborationCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInterface().isSuperTypeOf(domainElement.eClass())) {
					return InterfaceEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getPrimitiveType().isSuperTypeOf(domainElement.eClass())) {
					return PrimitiveTypeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getEnumeration().isSuperTypeOf(domainElement.eClass())) {
					return EnumerationEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDataType().isSuperTypeOf(domainElement.eClass())) {
					return DataTypeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getActor().isSuperTypeOf(domainElement.eClass())) {
					return ActorEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDeploymentSpecification().isSuperTypeOf(domainElement.eClass())) {
					return DeploymentSpecificationEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getArtifact().isSuperTypeOf(domainElement.eClass())) {
					return ArtifactEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInformationItem().isSuperTypeOf(domainElement.eClass())) {
					return InformationItemEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getSignal().isSuperTypeOf(domainElement.eClass())) {
					return SignalEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getUseCase().isSuperTypeOf(domainElement.eClass())) {
					return UseCaseEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getComment().isSuperTypeOf(domainElement.eClass())) {
					return CommentEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDurationConstraint().isSuperTypeOf(domainElement.eClass())) {
					return DurationConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getTimeConstraint().isSuperTypeOf(domainElement.eClass())) {
					return TimeConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getIntervalConstraint().isSuperTypeOf(domainElement.eClass())) {
					return IntervalConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInteractionConstraint().isSuperTypeOf(domainElement.eClass())) {
					return InteractionConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getConstraint().isSuperTypeOf(domainElement.eClass())) {
					return ConstraintEditPartCN.VISUAL_ID;
				}
				break;
			case FunctionBehaviorCompositeCompartmentEditPart.VISUAL_ID:
				if (UMLPackage.eINSTANCE.getParameter().isSuperTypeOf(domainElement.eClass())) {
					return ParameterEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getProperty().isSuperTypeOf(domainElement.eClass()) && isProperty_Shape(containerView, (Property) domainElement)) {
					return PropertyPartEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getCollaborationUse().isSuperTypeOf(domainElement.eClass())) {
					return CollaborationUseEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getActivity().isSuperTypeOf(domainElement.eClass())) {
					return ActivityCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInteraction().isSuperTypeOf(domainElement.eClass())) {
					return InteractionCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getProtocolStateMachine().isSuperTypeOf(domainElement.eClass())) {
					return ProtocolStateMachineCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getStateMachine().isSuperTypeOf(domainElement.eClass())) {
					return StateMachineCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getFunctionBehavior().isSuperTypeOf(domainElement.eClass())) {
					return FunctionBehaviorCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getOpaqueBehavior().isSuperTypeOf(domainElement.eClass())) {
					return OpaqueBehaviorCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getComponent().isSuperTypeOf(domainElement.eClass())) {
					return ComponentCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDevice().isSuperTypeOf(domainElement.eClass())) {
					return DeviceCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getExecutionEnvironment().isSuperTypeOf(domainElement.eClass())) {
					return ExecutionEnvironmentCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getNode().isSuperTypeOf(domainElement.eClass())) {
					return NodeCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getClass_().isSuperTypeOf(domainElement.eClass())) {
					return ClassCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getCollaboration().isSuperTypeOf(domainElement.eClass())) {
					return CollaborationCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInterface().isSuperTypeOf(domainElement.eClass())) {
					return InterfaceEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getPrimitiveType().isSuperTypeOf(domainElement.eClass())) {
					return PrimitiveTypeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getEnumeration().isSuperTypeOf(domainElement.eClass())) {
					return EnumerationEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDataType().isSuperTypeOf(domainElement.eClass())) {
					return DataTypeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getActor().isSuperTypeOf(domainElement.eClass())) {
					return ActorEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDeploymentSpecification().isSuperTypeOf(domainElement.eClass())) {
					return DeploymentSpecificationEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getArtifact().isSuperTypeOf(domainElement.eClass())) {
					return ArtifactEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInformationItem().isSuperTypeOf(domainElement.eClass())) {
					return InformationItemEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getSignal().isSuperTypeOf(domainElement.eClass())) {
					return SignalEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getUseCase().isSuperTypeOf(domainElement.eClass())) {
					return UseCaseEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getComment().isSuperTypeOf(domainElement.eClass())) {
					return CommentEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDurationConstraint().isSuperTypeOf(domainElement.eClass())) {
					return DurationConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getTimeConstraint().isSuperTypeOf(domainElement.eClass())) {
					return TimeConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getIntervalConstraint().isSuperTypeOf(domainElement.eClass())) {
					return IntervalConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInteractionConstraint().isSuperTypeOf(domainElement.eClass())) {
					return InteractionConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getConstraint().isSuperTypeOf(domainElement.eClass())) {
					return ConstraintEditPartCN.VISUAL_ID;
				}
				break;
			case OpaqueBehaviorCompositeCompartmentEditPart.VISUAL_ID:
				if (UMLPackage.eINSTANCE.getParameter().isSuperTypeOf(domainElement.eClass())) {
					return ParameterEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getProperty().isSuperTypeOf(domainElement.eClass()) && isProperty_Shape(containerView, (Property) domainElement)) {
					return PropertyPartEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getCollaborationUse().isSuperTypeOf(domainElement.eClass())) {
					return CollaborationUseEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getActivity().isSuperTypeOf(domainElement.eClass())) {
					return ActivityCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInteraction().isSuperTypeOf(domainElement.eClass())) {
					return InteractionCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getProtocolStateMachine().isSuperTypeOf(domainElement.eClass())) {
					return ProtocolStateMachineCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getStateMachine().isSuperTypeOf(domainElement.eClass())) {
					return StateMachineCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getFunctionBehavior().isSuperTypeOf(domainElement.eClass())) {
					return FunctionBehaviorCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getOpaqueBehavior().isSuperTypeOf(domainElement.eClass())) {
					return OpaqueBehaviorCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getComponent().isSuperTypeOf(domainElement.eClass())) {
					return ComponentCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDevice().isSuperTypeOf(domainElement.eClass())) {
					return DeviceCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getExecutionEnvironment().isSuperTypeOf(domainElement.eClass())) {
					return ExecutionEnvironmentCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getNode().isSuperTypeOf(domainElement.eClass())) {
					return NodeCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getClass_().isSuperTypeOf(domainElement.eClass())) {
					return ClassCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getCollaboration().isSuperTypeOf(domainElement.eClass())) {
					return CollaborationCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInterface().isSuperTypeOf(domainElement.eClass())) {
					return InterfaceEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getPrimitiveType().isSuperTypeOf(domainElement.eClass())) {
					return PrimitiveTypeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getEnumeration().isSuperTypeOf(domainElement.eClass())) {
					return EnumerationEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDataType().isSuperTypeOf(domainElement.eClass())) {
					return DataTypeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getActor().isSuperTypeOf(domainElement.eClass())) {
					return ActorEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDeploymentSpecification().isSuperTypeOf(domainElement.eClass())) {
					return DeploymentSpecificationEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getArtifact().isSuperTypeOf(domainElement.eClass())) {
					return ArtifactEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInformationItem().isSuperTypeOf(domainElement.eClass())) {
					return InformationItemEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getSignal().isSuperTypeOf(domainElement.eClass())) {
					return SignalEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getUseCase().isSuperTypeOf(domainElement.eClass())) {
					return UseCaseEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getComment().isSuperTypeOf(domainElement.eClass())) {
					return CommentEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDurationConstraint().isSuperTypeOf(domainElement.eClass())) {
					return DurationConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getTimeConstraint().isSuperTypeOf(domainElement.eClass())) {
					return TimeConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getIntervalConstraint().isSuperTypeOf(domainElement.eClass())) {
					return IntervalConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInteractionConstraint().isSuperTypeOf(domainElement.eClass())) {
					return InteractionConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getConstraint().isSuperTypeOf(domainElement.eClass())) {
					return ConstraintEditPartCN.VISUAL_ID;
				}
				break;
			case ComponentCompositeCompartmentEditPart.VISUAL_ID:
				if (UMLPackage.eINSTANCE.getProperty().isSuperTypeOf(domainElement.eClass()) && isProperty_Shape(containerView, (Property) domainElement)) {
					return PropertyPartEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getCollaborationUse().isSuperTypeOf(domainElement.eClass())) {
					return CollaborationUseEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getActivity().isSuperTypeOf(domainElement.eClass())) {
					return ActivityCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInteraction().isSuperTypeOf(domainElement.eClass())) {
					return InteractionCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getProtocolStateMachine().isSuperTypeOf(domainElement.eClass())) {
					return ProtocolStateMachineCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getStateMachine().isSuperTypeOf(domainElement.eClass())) {
					return StateMachineCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getFunctionBehavior().isSuperTypeOf(domainElement.eClass())) {
					return FunctionBehaviorCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getOpaqueBehavior().isSuperTypeOf(domainElement.eClass())) {
					return OpaqueBehaviorCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getComponent().isSuperTypeOf(domainElement.eClass())) {
					return ComponentCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDevice().isSuperTypeOf(domainElement.eClass())) {
					return DeviceCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getExecutionEnvironment().isSuperTypeOf(domainElement.eClass())) {
					return ExecutionEnvironmentCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getNode().isSuperTypeOf(domainElement.eClass())) {
					return NodeCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getClass_().isSuperTypeOf(domainElement.eClass())) {
					return ClassCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getCollaboration().isSuperTypeOf(domainElement.eClass())) {
					return CollaborationCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInterface().isSuperTypeOf(domainElement.eClass())) {
					return InterfaceEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getPrimitiveType().isSuperTypeOf(domainElement.eClass())) {
					return PrimitiveTypeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getEnumeration().isSuperTypeOf(domainElement.eClass())) {
					return EnumerationEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDataType().isSuperTypeOf(domainElement.eClass())) {
					return DataTypeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getActor().isSuperTypeOf(domainElement.eClass())) {
					return ActorEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDeploymentSpecification().isSuperTypeOf(domainElement.eClass())) {
					return DeploymentSpecificationEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getArtifact().isSuperTypeOf(domainElement.eClass())) {
					return ArtifactEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInformationItem().isSuperTypeOf(domainElement.eClass())) {
					return InformationItemEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getSignal().isSuperTypeOf(domainElement.eClass())) {
					return SignalEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getUseCase().isSuperTypeOf(domainElement.eClass())) {
					return UseCaseEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getComment().isSuperTypeOf(domainElement.eClass())) {
					return CommentEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDurationConstraint().isSuperTypeOf(domainElement.eClass())) {
					return DurationConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getTimeConstraint().isSuperTypeOf(domainElement.eClass())) {
					return TimeConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getIntervalConstraint().isSuperTypeOf(domainElement.eClass())) {
					return IntervalConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInteractionConstraint().isSuperTypeOf(domainElement.eClass())) {
					return InteractionConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getConstraint().isSuperTypeOf(domainElement.eClass())) {
					return ConstraintEditPartCN.VISUAL_ID;
				}
				break;
			case DeviceCompositeCompartmentEditPart.VISUAL_ID:
				if (UMLPackage.eINSTANCE.getProperty().isSuperTypeOf(domainElement.eClass()) && isProperty_Shape(containerView, (Property) domainElement)) {
					return PropertyPartEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getCollaborationUse().isSuperTypeOf(domainElement.eClass())) {
					return CollaborationUseEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getActivity().isSuperTypeOf(domainElement.eClass())) {
					return ActivityCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInteraction().isSuperTypeOf(domainElement.eClass())) {
					return InteractionCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getProtocolStateMachine().isSuperTypeOf(domainElement.eClass())) {
					return ProtocolStateMachineCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getStateMachine().isSuperTypeOf(domainElement.eClass())) {
					return StateMachineCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getFunctionBehavior().isSuperTypeOf(domainElement.eClass())) {
					return FunctionBehaviorCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getOpaqueBehavior().isSuperTypeOf(domainElement.eClass())) {
					return OpaqueBehaviorCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getComponent().isSuperTypeOf(domainElement.eClass())) {
					return ComponentCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDevice().isSuperTypeOf(domainElement.eClass())) {
					return DeviceCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getExecutionEnvironment().isSuperTypeOf(domainElement.eClass())) {
					return ExecutionEnvironmentCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getNode().isSuperTypeOf(domainElement.eClass())) {
					return NodeCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getClass_().isSuperTypeOf(domainElement.eClass())) {
					return ClassCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getCollaboration().isSuperTypeOf(domainElement.eClass())) {
					return CollaborationCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInterface().isSuperTypeOf(domainElement.eClass())) {
					return InterfaceEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getPrimitiveType().isSuperTypeOf(domainElement.eClass())) {
					return PrimitiveTypeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getEnumeration().isSuperTypeOf(domainElement.eClass())) {
					return EnumerationEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDataType().isSuperTypeOf(domainElement.eClass())) {
					return DataTypeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getActor().isSuperTypeOf(domainElement.eClass())) {
					return ActorEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDeploymentSpecification().isSuperTypeOf(domainElement.eClass())) {
					return DeploymentSpecificationEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getArtifact().isSuperTypeOf(domainElement.eClass())) {
					return ArtifactEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInformationItem().isSuperTypeOf(domainElement.eClass())) {
					return InformationItemEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getSignal().isSuperTypeOf(domainElement.eClass())) {
					return SignalEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getUseCase().isSuperTypeOf(domainElement.eClass())) {
					return UseCaseEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getComment().isSuperTypeOf(domainElement.eClass())) {
					return CommentEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDurationConstraint().isSuperTypeOf(domainElement.eClass())) {
					return DurationConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getTimeConstraint().isSuperTypeOf(domainElement.eClass())) {
					return TimeConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getIntervalConstraint().isSuperTypeOf(domainElement.eClass())) {
					return IntervalConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInteractionConstraint().isSuperTypeOf(domainElement.eClass())) {
					return InteractionConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getConstraint().isSuperTypeOf(domainElement.eClass())) {
					return ConstraintEditPartCN.VISUAL_ID;
				}
				break;
			case ExecutionEnvironmentCompositeCompartmentEditPart.VISUAL_ID:
				if (UMLPackage.eINSTANCE.getProperty().isSuperTypeOf(domainElement.eClass()) && isProperty_Shape(containerView, (Property) domainElement)) {
					return PropertyPartEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getCollaborationUse().isSuperTypeOf(domainElement.eClass())) {
					return CollaborationUseEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getActivity().isSuperTypeOf(domainElement.eClass())) {
					return ActivityCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInteraction().isSuperTypeOf(domainElement.eClass())) {
					return InteractionCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getProtocolStateMachine().isSuperTypeOf(domainElement.eClass())) {
					return ProtocolStateMachineCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getStateMachine().isSuperTypeOf(domainElement.eClass())) {
					return StateMachineCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getFunctionBehavior().isSuperTypeOf(domainElement.eClass())) {
					return FunctionBehaviorCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getOpaqueBehavior().isSuperTypeOf(domainElement.eClass())) {
					return OpaqueBehaviorCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getComponent().isSuperTypeOf(domainElement.eClass())) {
					return ComponentCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDevice().isSuperTypeOf(domainElement.eClass())) {
					return DeviceCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getExecutionEnvironment().isSuperTypeOf(domainElement.eClass())) {
					return ExecutionEnvironmentCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getNode().isSuperTypeOf(domainElement.eClass())) {
					return NodeCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getClass_().isSuperTypeOf(domainElement.eClass())) {
					return ClassCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getCollaboration().isSuperTypeOf(domainElement.eClass())) {
					return CollaborationCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInterface().isSuperTypeOf(domainElement.eClass())) {
					return InterfaceEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getPrimitiveType().isSuperTypeOf(domainElement.eClass())) {
					return PrimitiveTypeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getEnumeration().isSuperTypeOf(domainElement.eClass())) {
					return EnumerationEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDataType().isSuperTypeOf(domainElement.eClass())) {
					return DataTypeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getActor().isSuperTypeOf(domainElement.eClass())) {
					return ActorEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDeploymentSpecification().isSuperTypeOf(domainElement.eClass())) {
					return DeploymentSpecificationEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getArtifact().isSuperTypeOf(domainElement.eClass())) {
					return ArtifactEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInformationItem().isSuperTypeOf(domainElement.eClass())) {
					return InformationItemEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getSignal().isSuperTypeOf(domainElement.eClass())) {
					return SignalEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getUseCase().isSuperTypeOf(domainElement.eClass())) {
					return UseCaseEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getComment().isSuperTypeOf(domainElement.eClass())) {
					return CommentEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDurationConstraint().isSuperTypeOf(domainElement.eClass())) {
					return DurationConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getTimeConstraint().isSuperTypeOf(domainElement.eClass())) {
					return TimeConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getIntervalConstraint().isSuperTypeOf(domainElement.eClass())) {
					return IntervalConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInteractionConstraint().isSuperTypeOf(domainElement.eClass())) {
					return InteractionConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getConstraint().isSuperTypeOf(domainElement.eClass())) {
					return ConstraintEditPartCN.VISUAL_ID;
				}
				break;
			case NodeCompositeCompartmentEditPart.VISUAL_ID:
				if (UMLPackage.eINSTANCE.getProperty().isSuperTypeOf(domainElement.eClass()) && isProperty_Shape(containerView, (Property) domainElement)) {
					return PropertyPartEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getCollaborationUse().isSuperTypeOf(domainElement.eClass())) {
					return CollaborationUseEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getActivity().isSuperTypeOf(domainElement.eClass())) {
					return ActivityCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInteraction().isSuperTypeOf(domainElement.eClass())) {
					return InteractionCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getProtocolStateMachine().isSuperTypeOf(domainElement.eClass())) {
					return ProtocolStateMachineCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getStateMachine().isSuperTypeOf(domainElement.eClass())) {
					return StateMachineCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getFunctionBehavior().isSuperTypeOf(domainElement.eClass())) {
					return FunctionBehaviorCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getOpaqueBehavior().isSuperTypeOf(domainElement.eClass())) {
					return OpaqueBehaviorCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getComponent().isSuperTypeOf(domainElement.eClass())) {
					return ComponentCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDevice().isSuperTypeOf(domainElement.eClass())) {
					return DeviceCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getExecutionEnvironment().isSuperTypeOf(domainElement.eClass())) {
					return ExecutionEnvironmentCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getNode().isSuperTypeOf(domainElement.eClass())) {
					return NodeCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getClass_().isSuperTypeOf(domainElement.eClass())) {
					return ClassCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getCollaboration().isSuperTypeOf(domainElement.eClass())) {
					return CollaborationCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInterface().isSuperTypeOf(domainElement.eClass())) {
					return InterfaceEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getPrimitiveType().isSuperTypeOf(domainElement.eClass())) {
					return PrimitiveTypeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getEnumeration().isSuperTypeOf(domainElement.eClass())) {
					return EnumerationEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDataType().isSuperTypeOf(domainElement.eClass())) {
					return DataTypeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getActor().isSuperTypeOf(domainElement.eClass())) {
					return ActorEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDeploymentSpecification().isSuperTypeOf(domainElement.eClass())) {
					return DeploymentSpecificationEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getArtifact().isSuperTypeOf(domainElement.eClass())) {
					return ArtifactEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInformationItem().isSuperTypeOf(domainElement.eClass())) {
					return InformationItemEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getSignal().isSuperTypeOf(domainElement.eClass())) {
					return SignalEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getUseCase().isSuperTypeOf(domainElement.eClass())) {
					return UseCaseEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getComment().isSuperTypeOf(domainElement.eClass())) {
					return CommentEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDurationConstraint().isSuperTypeOf(domainElement.eClass())) {
					return DurationConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getTimeConstraint().isSuperTypeOf(domainElement.eClass())) {
					return TimeConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getIntervalConstraint().isSuperTypeOf(domainElement.eClass())) {
					return IntervalConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInteractionConstraint().isSuperTypeOf(domainElement.eClass())) {
					return InteractionConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getConstraint().isSuperTypeOf(domainElement.eClass())) {
					return ConstraintEditPartCN.VISUAL_ID;
				}
				break;
			case ClassCompositeCompartmentEditPart.VISUAL_ID:
				if (UMLPackage.eINSTANCE.getProperty().isSuperTypeOf(domainElement.eClass()) && isProperty_Shape(containerView, (Property) domainElement)) {
					return PropertyPartEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getCollaborationUse().isSuperTypeOf(domainElement.eClass())) {
					return CollaborationUseEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getActivity().isSuperTypeOf(domainElement.eClass())) {
					return ActivityCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInteraction().isSuperTypeOf(domainElement.eClass())) {
					return InteractionCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getProtocolStateMachine().isSuperTypeOf(domainElement.eClass())) {
					return ProtocolStateMachineCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getStateMachine().isSuperTypeOf(domainElement.eClass())) {
					return StateMachineCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getFunctionBehavior().isSuperTypeOf(domainElement.eClass())) {
					return FunctionBehaviorCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getOpaqueBehavior().isSuperTypeOf(domainElement.eClass())) {
					return OpaqueBehaviorCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getComponent().isSuperTypeOf(domainElement.eClass())) {
					return ComponentCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDevice().isSuperTypeOf(domainElement.eClass())) {
					return DeviceCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getExecutionEnvironment().isSuperTypeOf(domainElement.eClass())) {
					return ExecutionEnvironmentCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getNode().isSuperTypeOf(domainElement.eClass())) {
					return NodeCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getClass_().isSuperTypeOf(domainElement.eClass())) {
					return ClassCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getCollaboration().isSuperTypeOf(domainElement.eClass())) {
					return CollaborationCompositeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInterface().isSuperTypeOf(domainElement.eClass())) {
					return InterfaceEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getPrimitiveType().isSuperTypeOf(domainElement.eClass())) {
					return PrimitiveTypeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getEnumeration().isSuperTypeOf(domainElement.eClass())) {
					return EnumerationEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDataType().isSuperTypeOf(domainElement.eClass())) {
					return DataTypeEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getActor().isSuperTypeOf(domainElement.eClass())) {
					return ActorEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDeploymentSpecification().isSuperTypeOf(domainElement.eClass())) {
					return DeploymentSpecificationEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getArtifact().isSuperTypeOf(domainElement.eClass())) {
					return ArtifactEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInformationItem().isSuperTypeOf(domainElement.eClass())) {
					return InformationItemEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getSignal().isSuperTypeOf(domainElement.eClass())) {
					return SignalEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getUseCase().isSuperTypeOf(domainElement.eClass())) {
					return UseCaseEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getComment().isSuperTypeOf(domainElement.eClass())) {
					return CommentEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getConstraint().isSuperTypeOf(domainElement.eClass())) {
					return ConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDurationConstraint().isSuperTypeOf(domainElement.eClass())) {
					return DurationConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getTimeConstraint().isSuperTypeOf(domainElement.eClass())) {
					return TimeConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getIntervalConstraint().isSuperTypeOf(domainElement.eClass())) {
					return IntervalConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInteractionConstraint().isSuperTypeOf(domainElement.eClass())) {
					return InteractionConstraintEditPartCN.VISUAL_ID;
				}
				break;
			case CollaborationCompositeCompartmentEditPart.VISUAL_ID:
				if (UMLPackage.eINSTANCE.getProperty().isSuperTypeOf(domainElement.eClass()) && isProperty_Shape(containerView, (Property) domainElement)) {
					return PropertyPartEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getCollaborationUse().isSuperTypeOf(domainElement.eClass())) {
					return CollaborationUseEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getComment().isSuperTypeOf(domainElement.eClass())) {
					return CommentEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getConnectableElement().isSuperTypeOf(domainElement.eClass())) {
					return CollaborationRoleEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getDurationConstraint().isSuperTypeOf(domainElement.eClass())) {
					return DurationConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getTimeConstraint().isSuperTypeOf(domainElement.eClass())) {
					return TimeConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getIntervalConstraint().isSuperTypeOf(domainElement.eClass())) {
					return IntervalConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getInteractionConstraint().isSuperTypeOf(domainElement.eClass())) {
					return InteractionConstraintEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getConstraint().isSuperTypeOf(domainElement.eClass())) {
					return ConstraintEditPartCN.VISUAL_ID;
				}
				break;
			case PropertyPartCompartmentEditPartCN.VISUAL_ID:
				if (UMLPackage.eINSTANCE.getProperty().isSuperTypeOf(domainElement.eClass()) && isProperty_Shape(containerView, (Property) domainElement)) {
					return PropertyPartEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getComment().isSuperTypeOf(domainElement.eClass())) {
					return CommentEditPartCN.VISUAL_ID;
				}
				break;
			}
		}
		return "";
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, String nodeVisualID) {
		String containerModelID = org.eclipse.papyrus.uml.diagram.composite.part.UMLVisualIDRegistry.getModelID(containerView);
		if (!CompositeStructureDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		String containerVisualID;
		if (CompositeStructureDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.eclipse.papyrus.uml.diagram.composite.part.UMLVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = CompositeStructureDiagramEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		if (containerVisualID != null) {
			switch (containerVisualID) {
			case CompositeStructureDiagramEditPart.VISUAL_ID:
				if (ActivityCompositeEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InteractionCompositeEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ProtocolStateMachineCompositeEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (StateMachineCompositeEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (FunctionBehaviorCompositeEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (OpaqueBehaviorCompositeEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ComponentCompositeEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DeviceCompositeEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ExecutionEnvironmentCompositeEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (NodeCompositeEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ClassCompositeEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CollaborationCompositeEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InterfaceEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (PrimitiveTypeEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (EnumerationEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DataTypeEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ActorEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DeploymentSpecificationEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ArtifactEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InformationItemEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (SignalEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (UseCaseEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (SignalEventEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CallEventEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (AnyReceiveEventEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ChangeEventEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (TimeEventEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DurationObservationEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (TimeObservationEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (LiteralBooleanEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (LiteralIntegerEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (LiteralNullEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (LiteralStringEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (LiteralUnlimitedNaturalEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (StringExpressionEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (OpaqueExpressionEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (TimeExpressionEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ExpressionEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DurationEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (TimeIntervalEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DurationIntervalEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (IntervalEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InstanceValueEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CommentEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DurationConstraintEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (TimeConstraintEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (IntervalConstraintEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InteractionConstraintEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ConstraintEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case ActivityCompositeEditPart.VISUAL_ID:
				if (ActivityCompositeNameEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ActivityCompositeFloatingLabelEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ActivityCompositeCompartmentEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (PortEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ParameterEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case InteractionCompositeEditPart.VISUAL_ID:
				if (InteractionCompositeNameEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InteractionCompositeFloatingLabelEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InteractionCompositeCompartmentEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (PortEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ParameterEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case ProtocolStateMachineCompositeEditPart.VISUAL_ID:
				if (ProtocolStateMachineCompositeNameEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ProtocolStateMachineCompositeFloatingLabelEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ProtocolStateMachineCompositeCompartmentEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (PortEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ParameterEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case StateMachineCompositeEditPart.VISUAL_ID:
				if (StateMachineCompositeNameEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (StateMachineCompositeFloatingLabelEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (StateMachineCompositeCompartmentEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (PortEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ParameterEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case FunctionBehaviorCompositeEditPart.VISUAL_ID:
				if (FunctionBehaviorCompositeNameEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (FunctionBehaviorCompositeFloatingLabelEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (FunctionBehaviorCompositeCompartmentEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (PortEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ParameterEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case OpaqueBehaviorCompositeEditPart.VISUAL_ID:
				if (OpaqueBehaviorCompositeNameEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (OpaqueBehaviorCompositeFloatingLabelEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (OpaqueBehaviorCompositeCompartmentEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (PortEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ParameterEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case ComponentCompositeEditPart.VISUAL_ID:
				if (ComponentCompositeNameEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ComponentCompositeFloatingLabelEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ComponentCompositeCompartmentEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (PortEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case DeviceCompositeEditPart.VISUAL_ID:
				if (DeviceCompositeNameEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DeviceCompositeFloatingLabelEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DeviceCompositeCompartmentEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (PortEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case ExecutionEnvironmentCompositeEditPart.VISUAL_ID:
				if (ExecutionEnvironmentCompositeNameEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ExecutionEnvironmentCompositeFloatingLabelEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ExecutionEnvironmentCompositeCompartmentEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (PortEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case NodeCompositeEditPart.VISUAL_ID:
				if (NodeCompositeNameEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (NodeCompositeFloatingLabelEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (NodeCompositeCompartmentEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (PortEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case ClassCompositeEditPart.VISUAL_ID:
				if (ClassCompositeNameEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ClassCompositeFloatingLabelEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ClassCompositeCompartmentEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (PortEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case CollaborationCompositeEditPart.VISUAL_ID:
				if (CollaborationCompositeNameEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CollaborationCompositeFloatingLabelEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CollaborationCompositeCompartmentEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case InterfaceEditPart.VISUAL_ID:
				if (InterfaceNameEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InterfaceFloatingLabelEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case PrimitiveTypeEditPart.VISUAL_ID:
				if (PrimitiveTypeNameEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (PrimitiveTypeFloatingLabelEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case EnumerationEditPart.VISUAL_ID:
				if (EnumerationNameEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (EnumerationFloatingLabelEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (EnumerationEnumerationLiteralCompartmentEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (EnumerationLiteralEditPartCLN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case DataTypeEditPart.VISUAL_ID:
				if (DataTypeNameEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DataTypeFloatingLabelEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DataTypeAttributeCompartmentEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DataTypeOperationCompartmentEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case ActorEditPart.VISUAL_ID:
				if (ActorNameEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ActorFloatingLabelEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case DeploymentSpecificationEditPart.VISUAL_ID:
				if (DeploymentSpecificationNameEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DeploymentSpecificationFloatingLabelEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case ArtifactEditPart.VISUAL_ID:
				if (ArtifactNameEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ArtifactFloatingLabelEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case InformationItemEditPart.VISUAL_ID:
				if (InformationItemNameEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InformationItemFloatingLabelEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case SignalEditPart.VISUAL_ID:
				if (SignalNameEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (SignalFloatingLabelEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case UseCaseEditPart.VISUAL_ID:
				if (UseCaseNameEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (UseCaseFloatingLabelEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case SignalEventEditPart.VISUAL_ID:
				if (SignalEventNameEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (SignalEventFloatingLabelEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case CallEventEditPart.VISUAL_ID:
				if (CallEventNameEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CallEventFloatingLabelEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case AnyReceiveEventEditPart.VISUAL_ID:
				if (AnyReceiveEventNameEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (AnyReceiveEventFloatingLabelEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case ChangeEventEditPart.VISUAL_ID:
				if (ChangeEventNameEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ChangeEventFloatingLabelEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case TimeEventEditPart.VISUAL_ID:
				if (TimeEventNameEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (TimeEventFloatingLabelEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case DurationObservationEditPart.VISUAL_ID:
				if (DurationObservationNameEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DurationObservationStereotypeLabelEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case TimeObservationEditPart.VISUAL_ID:
				if (TimeObservationNameEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (TimeObservationStereotypeLabelEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case LiteralBooleanEditPart.VISUAL_ID:
				if (LiteralBooleanNameEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (LiteralBooleanFloatingLabelEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case LiteralIntegerEditPart.VISUAL_ID:
				if (LiteralIntegerNameEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (LiteralIntegerFloatingLabelEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case LiteralNullEditPart.VISUAL_ID:
				if (LiteralNullNameEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (LiteralNullFloatingLabelEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case LiteralStringEditPart.VISUAL_ID:
				if (LiteralStringNameEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (LiteralStringFloatingLabelEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case LiteralUnlimitedNaturalEditPart.VISUAL_ID:
				if (LiteralUnlimitedNaturalNameEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (LiteralUnlimitedNaturalFloatingLabelEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case StringExpressionEditPart.VISUAL_ID:
				if (StringExpressionNameEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (StringExpressionFloatingLabelEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case OpaqueExpressionEditPart.VISUAL_ID:
				if (OpaqueExpressionNameEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (OpaqueExpressionFloatingLabelEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case TimeExpressionEditPart.VISUAL_ID:
				if (TimeExpressionNameEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (TimeExpressionFloatingLabelEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case ExpressionEditPart.VISUAL_ID:
				if (ExpressionNameEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ExpressionFloatingLabelEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case DurationEditPart.VISUAL_ID:
				if (DurationNameEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DurationFloatingLabelEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case TimeIntervalEditPart.VISUAL_ID:
				if (TimeIntervalNameEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (TimeIntervalFloatingLabelEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case DurationIntervalEditPart.VISUAL_ID:
				if (DurationIntervalNameEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DurationIntervalFloatingLabelEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case IntervalEditPart.VISUAL_ID:
				if (IntervalNameEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (IntervalFloatingLabelEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case InstanceValueEditPart.VISUAL_ID:
				if (InstanceValueNameEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InstanceValueFloatingLabelEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case CommentEditPart.VISUAL_ID:
				if (CommentBodyEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case DurationConstraintEditPart.VISUAL_ID:
				if (DurationConstraintNameEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DurationConstraintSpecificationEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case TimeConstraintEditPart.VISUAL_ID:
				if (TimeConstraintNameEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (TimeConstraintSpecificationEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case IntervalConstraintEditPart.VISUAL_ID:
				if (IntervalConstraintNameEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (IntervalConstraintSpecificationEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case InteractionConstraintEditPart.VISUAL_ID:
				if (InteractionConstraintNameEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InteractionConstraintSpecificationEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case ConstraintEditPart.VISUAL_ID:
				if (ConstraintNameEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ConstraintSpecificationEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case BehaviorPortEditPart.VISUAL_ID:
				if (BehaviorPortFloatingLabelEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case PortEditPart.VISUAL_ID:
				if (PortNameEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (PortAppliedStereotypeEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case ParameterEditPart.VISUAL_ID:
				if (ParameterNameEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ParameterAppliedStereotypeEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case PropertyPartEditPartCN.VISUAL_ID:
				if (PropertyPartNameEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (PropertyPartFloatingLabelEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (PropertyPartCompartmentEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (PortEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case CollaborationRoleEditPartCN.VISUAL_ID:
				if (CollaborationRoleNameEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CollaborationRoleFloatingLabelEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case CollaborationUseEditPartCN.VISUAL_ID:
				if (CollaborationUseNameEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CollaborationUseFloatingLabelEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case ActivityCompositeEditPartCN.VISUAL_ID:
				if (ActivityCompositeNameEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ActivityCompositeFloatingLabelEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ActivityCompositeCompartmentEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (PortEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ParameterEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case InteractionCompositeEditPartCN.VISUAL_ID:
				if (InteractionCompositeNameEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InteractionCompositeFloatingLabelEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InteractionCompositeCompartmentEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (PortEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ParameterEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case ProtocolStateMachineCompositeEditPartCN.VISUAL_ID:
				if (ProtocolStateMachineCompositeNameEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ProtocolStateMachineCompositeFloatingLabelEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ProtocolStateMachineCompositeCompartmentEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (PortEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ParameterEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case StateMachineCompositeEditPartCN.VISUAL_ID:
				if (StateMachineCompositeNameEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (StateMachineCompositeFloatingLabelEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (StateMachineCompositeCompartmentEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (PortEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ParameterEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case FunctionBehaviorCompositeEditPartCN.VISUAL_ID:
				if (FunctionBehaviorCompositeNameEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (FunctionBehaviorCompositeFloatingLabelEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (FunctionBehaviorCompositeCompartmentEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (PortEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ParameterEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case OpaqueBehaviorCompositeEditPartCN.VISUAL_ID:
				if (OpaqueBehaviorCompositeNameEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (OpaqueBehaviorCompositeFloatingLabelEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (OpaqueBehaviorCompositeCompartmentEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (PortEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ParameterEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case ComponentCompositeEditPartCN.VISUAL_ID:
				if (ComponentCompositeNameEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ComponentCompositeFloatingLabelEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ComponentCompositeCompartmentEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (PortEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case DeviceCompositeEditPartCN.VISUAL_ID:
				if (DeviceCompositeNameEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DeviceCompositeFloatingLabelEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DeviceCompositeCompartmentEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (PortEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case ExecutionEnvironmentCompositeEditPartCN.VISUAL_ID:
				if (ExecutionEnvironmentCompositeNameEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ExecutionEnvironmentCompositeFloatingLabelEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ExecutionEnvironmentCompositeCompartmentEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (PortEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case NodeCompositeEditPartCN.VISUAL_ID:
				if (NodeCompositeNameEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (NodeCompositeFloatingLabelEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (NodeCompositeCompartmentEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (PortEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case ClassCompositeEditPartCN.VISUAL_ID:
				if (ClassCompositeNameEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ClassCompositeFloatingLabelEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ClassCompositeCompartmentEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (PortEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case CollaborationCompositeEditPartCN.VISUAL_ID:
				if (CollaborationCompositeNameEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CollaborationCompositeFloatingLabelEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CollaborationCompositeCompartmentEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case InterfaceEditPartCN.VISUAL_ID:
				if (InterfaceNameEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InterfaceFloatingLabelEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case PrimitiveTypeEditPartCN.VISUAL_ID:
				if (PrimitiveTypeNameEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (PrimitiveTypeFloatingLabelEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case EnumerationEditPartCN.VISUAL_ID:
				if (EnumerationNameEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (EnumerationFloatingLabelEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (EnumerationEnumerationLiteralCompartmentEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (EnumerationLiteralEditPartCLN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case DataTypeEditPartCN.VISUAL_ID:
				if (DataTypeNameEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DataTypeFloatingLabelEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DataTypeAttributeCompartmentEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DataTypeOperationCompartmentEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case ActorEditPartCN.VISUAL_ID:
				if (ActorNameEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ActorFloatingLabelEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case DeploymentSpecificationEditPartCN.VISUAL_ID:
				if (DeploymentSpecificationNameEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DeploymentSpecificationFloatingLabelEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case ArtifactEditPartCN.VISUAL_ID:
				if (ArtifactNameEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ArtifactFloatingLabelEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case InformationItemEditPartCN.VISUAL_ID:
				if (InformationItemNameEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InformationItemFloatingLabelEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case SignalEditPartCN.VISUAL_ID:
				if (SignalNameEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (SignalFloatingLabelEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case UseCaseEditPartCN.VISUAL_ID:
				if (UseCaseNameEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (UseCaseFloatingLabelEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case CommentEditPartCN.VISUAL_ID:
				if (CommentBodyEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case DurationConstraintEditPartCN.VISUAL_ID:
				if (DurationConstraintNameEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DurationConstraintSpecificationEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case TimeConstraintEditPartCN.VISUAL_ID:
				if (TimeConstraintNameEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (TimeConstraintSpecificationEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case IntervalConstraintEditPartCN.VISUAL_ID:
				if (IntervalConstraintNameEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (IntervalConstraintSpecificationEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case InteractionConstraintEditPartCN.VISUAL_ID:
				if (InteractionConstraintNameEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InteractionConstraintSpecificationEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case ConstraintEditPartCN.VISUAL_ID:
				if (ConstraintNameEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ConstraintSpecificationEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case DataTypeAttributeCompartmentEditPart.VISUAL_ID:
				if (PropertyEditPartCLN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case DataTypeOperationCompartmentEditPart.VISUAL_ID:
				if (OperationEditPartCLN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case DataTypeAttributeCompartmentEditPartCN.VISUAL_ID:
				if (PropertyEditPartCLN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case DataTypeOperationCompartmentEditPartCN.VISUAL_ID:
				if (OperationEditPartCLN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case EnumerationEnumerationLiteralCompartmentEditPart.VISUAL_ID:
				if (EnumerationLiteralEditPartCLN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case EnumerationEnumerationLiteralCompartmentEditPartCN.VISUAL_ID:
				if (EnumerationLiteralEditPartCLN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case ActivityCompositeCompartmentEditPartCN.VISUAL_ID:
				if (ParameterEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (PropertyPartEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CollaborationUseEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ActivityCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InteractionCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ProtocolStateMachineCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (StateMachineCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (FunctionBehaviorCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (OpaqueBehaviorCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ComponentCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DeviceCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ExecutionEnvironmentCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (NodeCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ClassCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CollaborationCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InterfaceEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (PrimitiveTypeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (EnumerationEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DataTypeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ActorEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DeploymentSpecificationEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ArtifactEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InformationItemEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (SignalEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (UseCaseEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CommentEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DurationConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (TimeConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (IntervalConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InteractionConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case InteractionCompositeCompartmentEditPartCN.VISUAL_ID:
				if (ParameterEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (PropertyPartEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CollaborationUseEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ActivityCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InteractionCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ProtocolStateMachineCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (StateMachineCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (FunctionBehaviorCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (OpaqueBehaviorCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ComponentCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DeviceCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ExecutionEnvironmentCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (NodeCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ClassCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CollaborationCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InterfaceEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (PrimitiveTypeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (EnumerationEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DataTypeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ActorEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DeploymentSpecificationEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ArtifactEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InformationItemEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (SignalEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (UseCaseEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CommentEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DurationConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (TimeConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (IntervalConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InteractionConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case ProtocolStateMachineCompositeCompartmentEditPartCN.VISUAL_ID:
				if (ParameterEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (PropertyPartEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CollaborationUseEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ActivityCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InteractionCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ProtocolStateMachineCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (StateMachineCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (FunctionBehaviorCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (OpaqueBehaviorCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ComponentCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DeviceCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ExecutionEnvironmentCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (NodeCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ClassCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CollaborationCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InterfaceEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (PrimitiveTypeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (EnumerationEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DataTypeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ActorEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DeploymentSpecificationEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ArtifactEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InformationItemEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (SignalEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (UseCaseEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CommentEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DurationConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (TimeConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (IntervalConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InteractionConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case StateMachineCompositeCompartmentEditPartCN.VISUAL_ID:
				if (ParameterEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (PropertyPartEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CollaborationUseEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ActivityCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InteractionCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ProtocolStateMachineCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (StateMachineCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (FunctionBehaviorCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (OpaqueBehaviorCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ComponentCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DeviceCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ExecutionEnvironmentCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (NodeCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ClassCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CollaborationCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InterfaceEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (PrimitiveTypeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (EnumerationEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DataTypeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ActorEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DeploymentSpecificationEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ArtifactEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InformationItemEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (SignalEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (UseCaseEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CommentEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DurationConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (TimeConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (IntervalConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InteractionConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case FunctionBehaviorCompositeCompartmentEditPartCN.VISUAL_ID:
				if (ParameterEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (PropertyPartEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CollaborationUseEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ActivityCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InteractionCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ProtocolStateMachineCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (StateMachineCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (FunctionBehaviorCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (OpaqueBehaviorCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ComponentCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DeviceCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ExecutionEnvironmentCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (NodeCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ClassCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CollaborationCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InterfaceEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (PrimitiveTypeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (EnumerationEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DataTypeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ActorEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DeploymentSpecificationEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ArtifactEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InformationItemEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (SignalEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (UseCaseEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CommentEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DurationConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (TimeConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (IntervalConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InteractionConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case OpaqueBehaviorCompositeCompartmentEditPartCN.VISUAL_ID:
				if (ParameterEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (PropertyPartEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CollaborationUseEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ActivityCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InteractionCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ProtocolStateMachineCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (StateMachineCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (FunctionBehaviorCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (OpaqueBehaviorCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ComponentCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DeviceCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ExecutionEnvironmentCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (NodeCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ClassCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CollaborationCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InterfaceEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (PrimitiveTypeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (EnumerationEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DataTypeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ActorEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DeploymentSpecificationEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ArtifactEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InformationItemEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (SignalEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (UseCaseEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CommentEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DurationConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (TimeConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (IntervalConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InteractionConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case ComponentCompositeCompartmentEditPartCN.VISUAL_ID:
				if (PropertyPartEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CollaborationUseEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ActivityCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InteractionCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ProtocolStateMachineCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (StateMachineCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (FunctionBehaviorCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (OpaqueBehaviorCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ComponentCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DeviceCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ExecutionEnvironmentCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (NodeCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ClassCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CollaborationCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InterfaceEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (PrimitiveTypeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (EnumerationEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DataTypeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ActorEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DeploymentSpecificationEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ArtifactEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InformationItemEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (SignalEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (UseCaseEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CommentEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DurationConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (TimeConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (IntervalConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InteractionConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case DeviceCompositeCompartmentEditPartCN.VISUAL_ID:
				if (PropertyPartEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CollaborationUseEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ActivityCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InteractionCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ProtocolStateMachineCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (StateMachineCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (FunctionBehaviorCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (OpaqueBehaviorCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ComponentCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DeviceCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ExecutionEnvironmentCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (NodeCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ClassCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CollaborationCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InterfaceEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (PrimitiveTypeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (EnumerationEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DataTypeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ActorEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DeploymentSpecificationEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ArtifactEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InformationItemEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (SignalEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (UseCaseEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CommentEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DurationConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (TimeConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (IntervalConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InteractionConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case ExecutionEnvironmentCompositeCompartmentEditPartCN.VISUAL_ID:
				if (PropertyPartEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CollaborationUseEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ActivityCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InteractionCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ProtocolStateMachineCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (StateMachineCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (FunctionBehaviorCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (OpaqueBehaviorCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ComponentCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DeviceCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ExecutionEnvironmentCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (NodeCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ClassCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CollaborationCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InterfaceEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (PrimitiveTypeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (EnumerationEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DataTypeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ActorEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DeploymentSpecificationEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ArtifactEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InformationItemEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (SignalEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (UseCaseEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CommentEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DurationConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (TimeConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (IntervalConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InteractionConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case NodeCompositeCompartmentEditPartCN.VISUAL_ID:
				if (PropertyPartEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CollaborationUseEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ActivityCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InteractionCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ProtocolStateMachineCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (StateMachineCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (FunctionBehaviorCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (OpaqueBehaviorCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ComponentCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DeviceCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ExecutionEnvironmentCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (NodeCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ClassCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CollaborationCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InterfaceEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (PrimitiveTypeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (EnumerationEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DataTypeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ActorEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DeploymentSpecificationEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ArtifactEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InformationItemEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (SignalEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (UseCaseEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CommentEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DurationConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (TimeConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (IntervalConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InteractionConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case ClassCompositeCompartmentEditPartCN.VISUAL_ID:
				if (PropertyPartEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CollaborationUseEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ActivityCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InteractionCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ProtocolStateMachineCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (StateMachineCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (FunctionBehaviorCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (OpaqueBehaviorCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ComponentCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DeviceCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ExecutionEnvironmentCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (NodeCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ClassCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CollaborationCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InterfaceEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (PrimitiveTypeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (EnumerationEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DataTypeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ActorEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DeploymentSpecificationEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ArtifactEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InformationItemEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (SignalEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (UseCaseEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CommentEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DurationConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (TimeConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (IntervalConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InteractionConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (BehaviorPortEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case CollaborationCompositeCompartmentEditPartCN.VISUAL_ID:
				if (PropertyPartEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CollaborationUseEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CommentEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CollaborationRoleEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DurationConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (TimeConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (IntervalConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InteractionConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case ActivityCompositeCompartmentEditPart.VISUAL_ID:
				if (ParameterEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (PropertyPartEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CollaborationUseEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ActivityCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InteractionCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ProtocolStateMachineCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (StateMachineCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (FunctionBehaviorCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (OpaqueBehaviorCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ComponentCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DeviceCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ExecutionEnvironmentCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (NodeCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ClassCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CollaborationCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InterfaceEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (PrimitiveTypeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (EnumerationEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DataTypeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ActorEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DeploymentSpecificationEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ArtifactEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InformationItemEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (SignalEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (UseCaseEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CommentEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DurationConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (TimeConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (IntervalConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InteractionConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case InteractionCompositeCompartmentEditPart.VISUAL_ID:
				if (ParameterEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (PropertyPartEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CollaborationUseEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ActivityCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InteractionCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ProtocolStateMachineCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (StateMachineCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (FunctionBehaviorCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (OpaqueBehaviorCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ComponentCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DeviceCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ExecutionEnvironmentCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (NodeCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ClassCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CollaborationCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InterfaceEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (PrimitiveTypeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (EnumerationEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DataTypeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ActorEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DeploymentSpecificationEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ArtifactEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InformationItemEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (SignalEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (UseCaseEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CommentEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DurationConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (TimeConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (IntervalConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InteractionConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case ProtocolStateMachineCompositeCompartmentEditPart.VISUAL_ID:
				if (ParameterEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (PropertyPartEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CollaborationUseEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ActivityCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InteractionCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ProtocolStateMachineCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (StateMachineCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (FunctionBehaviorCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (OpaqueBehaviorCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ComponentCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DeviceCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ExecutionEnvironmentCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (NodeCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ClassCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CollaborationCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InterfaceEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (PrimitiveTypeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (EnumerationEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DataTypeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ActorEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DeploymentSpecificationEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ArtifactEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InformationItemEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (SignalEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (UseCaseEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CommentEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DurationConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (TimeConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (IntervalConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InteractionConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case StateMachineCompositeCompartmentEditPart.VISUAL_ID:
				if (ParameterEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (PropertyPartEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CollaborationUseEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ActivityCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InteractionCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ProtocolStateMachineCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (StateMachineCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (FunctionBehaviorCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (OpaqueBehaviorCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ComponentCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DeviceCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ExecutionEnvironmentCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (NodeCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ClassCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CollaborationCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InterfaceEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (PrimitiveTypeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (EnumerationEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DataTypeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ActorEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DeploymentSpecificationEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ArtifactEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InformationItemEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (SignalEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (UseCaseEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CommentEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DurationConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (TimeConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (IntervalConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InteractionConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case FunctionBehaviorCompositeCompartmentEditPart.VISUAL_ID:
				if (ParameterEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (PropertyPartEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CollaborationUseEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ActivityCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InteractionCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ProtocolStateMachineCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (StateMachineCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (FunctionBehaviorCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (OpaqueBehaviorCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ComponentCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DeviceCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ExecutionEnvironmentCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (NodeCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ClassCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CollaborationCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InterfaceEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (PrimitiveTypeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (EnumerationEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DataTypeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ActorEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DeploymentSpecificationEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ArtifactEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InformationItemEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (SignalEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (UseCaseEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CommentEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DurationConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (TimeConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (IntervalConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InteractionConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case OpaqueBehaviorCompositeCompartmentEditPart.VISUAL_ID:
				if (ParameterEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (PropertyPartEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CollaborationUseEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ActivityCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InteractionCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ProtocolStateMachineCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (StateMachineCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (FunctionBehaviorCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (OpaqueBehaviorCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ComponentCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DeviceCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ExecutionEnvironmentCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (NodeCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ClassCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CollaborationCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InterfaceEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (PrimitiveTypeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (EnumerationEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DataTypeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ActorEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DeploymentSpecificationEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ArtifactEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InformationItemEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (SignalEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (UseCaseEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CommentEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DurationConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (TimeConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (IntervalConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InteractionConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case ComponentCompositeCompartmentEditPart.VISUAL_ID:
				if (PropertyPartEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CollaborationUseEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ActivityCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InteractionCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ProtocolStateMachineCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (StateMachineCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (FunctionBehaviorCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (OpaqueBehaviorCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ComponentCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DeviceCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ExecutionEnvironmentCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (NodeCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ClassCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CollaborationCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InterfaceEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (PrimitiveTypeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (EnumerationEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DataTypeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ActorEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DeploymentSpecificationEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ArtifactEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InformationItemEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (SignalEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (UseCaseEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CommentEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DurationConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (TimeConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (IntervalConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InteractionConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case DeviceCompositeCompartmentEditPart.VISUAL_ID:
				if (PropertyPartEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CollaborationUseEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ActivityCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InteractionCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ProtocolStateMachineCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (StateMachineCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (FunctionBehaviorCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (OpaqueBehaviorCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ComponentCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DeviceCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ExecutionEnvironmentCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (NodeCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ClassCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CollaborationCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InterfaceEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (PrimitiveTypeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (EnumerationEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DataTypeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ActorEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DeploymentSpecificationEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ArtifactEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InformationItemEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (SignalEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (UseCaseEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CommentEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DurationConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (TimeConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (IntervalConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InteractionConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case ExecutionEnvironmentCompositeCompartmentEditPart.VISUAL_ID:
				if (PropertyPartEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CollaborationUseEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ActivityCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InteractionCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ProtocolStateMachineCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (StateMachineCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (FunctionBehaviorCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (OpaqueBehaviorCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ComponentCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DeviceCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ExecutionEnvironmentCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (NodeCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ClassCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CollaborationCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InterfaceEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (PrimitiveTypeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (EnumerationEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DataTypeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ActorEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DeploymentSpecificationEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ArtifactEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InformationItemEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (SignalEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (UseCaseEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CommentEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DurationConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (TimeConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (IntervalConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InteractionConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case NodeCompositeCompartmentEditPart.VISUAL_ID:
				if (PropertyPartEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CollaborationUseEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ActivityCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InteractionCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ProtocolStateMachineCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (StateMachineCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (FunctionBehaviorCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (OpaqueBehaviorCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ComponentCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DeviceCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ExecutionEnvironmentCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (NodeCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ClassCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CollaborationCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InterfaceEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (PrimitiveTypeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (EnumerationEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DataTypeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ActorEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DeploymentSpecificationEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ArtifactEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InformationItemEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (SignalEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (UseCaseEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CommentEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DurationConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (TimeConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (IntervalConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InteractionConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case ClassCompositeCompartmentEditPart.VISUAL_ID:
				if (PropertyPartEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CollaborationUseEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ActivityCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InteractionCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ProtocolStateMachineCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (StateMachineCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (FunctionBehaviorCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (OpaqueBehaviorCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ComponentCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DeviceCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ExecutionEnvironmentCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (NodeCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ClassCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CollaborationCompositeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InterfaceEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (PrimitiveTypeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (EnumerationEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DataTypeEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ActorEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DeploymentSpecificationEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ArtifactEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InformationItemEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (SignalEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (UseCaseEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CommentEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DurationConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (TimeConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (IntervalConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InteractionConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case CollaborationCompositeCompartmentEditPart.VISUAL_ID:
				if (PropertyPartEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CollaborationUseEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CommentEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CollaborationRoleEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DurationConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (TimeConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (IntervalConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InteractionConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ConstraintEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case PropertyPartCompartmentEditPartCN.VISUAL_ID:
				if (PropertyPartEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CommentEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case ComponentRealizationEditPart.VISUAL_ID:
				if (ComponentRealizationNameEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ComponentRealizationAppliedStereotypeEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case InterfaceRealizationEditPart.VISUAL_ID:
				if (InterfaceRealizationNameEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InterfaceRealizationAppliedStereotypeEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case SubstitutionEditPart.VISUAL_ID:
				if (SubstitutionNameEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (SubstitutionAppliedStereotypeEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case RealizationEditPart.VISUAL_ID:
				if (RealizationNameEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (RealizationAppliedStereotypeEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case ManifestationEditPart.VISUAL_ID:
				if (ManifestationNameEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ManifestationAppliedStereotypeEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case AbstractionEditPart.VISUAL_ID:
				if (AbstractionNameEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (AbstractionAppliedStereotypeEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case UsageEditPart.VISUAL_ID:
				if (UsageNameEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (UsageAppliedStereotypeEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case DeploymentEditPart.VISUAL_ID:
				if (DeploymentNameEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DeploymentAppliedStereotypeEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case RoleBindingEditPart.VISUAL_ID:
				if (RoleBindingRoleNameEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (RoleBindingAppliedStereotypeEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case DependencyEditPart.VISUAL_ID:
				if (DependencyNameEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DependencyAppliedStereotypeEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case ConnectorEditPart.VISUAL_ID:
				if (ConnectorAppliedStereotypeEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ConnectorNameEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ConnectorMultiplicitySourceEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ConnectorMultiplicityTargetEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case GeneralizationEditPart.VISUAL_ID:
				if (GeneralizationAppliedStereotypeEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case RepresentationEditPart.VISUAL_ID:
				if (RepresentationTagLabelEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case InformationFlowEditPart.VISUAL_ID:
				if (InformationFlowConveyedLabelEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InformationFlowAppliedStereotypeEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (InformationFlowNameEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			}
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static String getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return "";
		}
		if (UMLPackage.eINSTANCE.getComponentRealization().isSuperTypeOf(domainElement.eClass())) {
			return ComponentRealizationEditPart.VISUAL_ID;
		}
		if (UMLPackage.eINSTANCE.getInterfaceRealization().isSuperTypeOf(domainElement.eClass())) {
			return InterfaceRealizationEditPart.VISUAL_ID;
		}
		if (UMLPackage.eINSTANCE.getSubstitution().isSuperTypeOf(domainElement.eClass())) {
			return SubstitutionEditPart.VISUAL_ID;
		}
		if (UMLPackage.eINSTANCE.getRealization().isSuperTypeOf(domainElement.eClass())) {
			return RealizationEditPart.VISUAL_ID;
		}
		if (UMLPackage.eINSTANCE.getManifestation().isSuperTypeOf(domainElement.eClass())) {
			return ManifestationEditPart.VISUAL_ID;
		}
		if (UMLPackage.eINSTANCE.getAbstraction().isSuperTypeOf(domainElement.eClass())) {
			return AbstractionEditPart.VISUAL_ID;
		}
		if (UMLPackage.eINSTANCE.getUsage().isSuperTypeOf(domainElement.eClass())) {
			return UsageEditPart.VISUAL_ID;
		}
		if (UMLPackage.eINSTANCE.getDeployment().isSuperTypeOf(domainElement.eClass())) {
			return DeploymentEditPart.VISUAL_ID;
		}
		if (UMLPackage.eINSTANCE.getDependency().isSuperTypeOf(domainElement.eClass()) && isDependency_RoleBindingEdge((Dependency) domainElement)) {
			return RoleBindingEditPart.VISUAL_ID;
		}
		if (UMLPackage.eINSTANCE.getDependency().isSuperTypeOf(domainElement.eClass()) && isDependency_Edge((Dependency) domainElement)) {
			return DependencyEditPart.VISUAL_ID;
		}
		if (UMLPackage.eINSTANCE.getConnector().isSuperTypeOf(domainElement.eClass())) {
			return ConnectorEditPart.VISUAL_ID;
		}
		if (UMLPackage.eINSTANCE.getGeneralization().isSuperTypeOf(domainElement.eClass())) {
			return GeneralizationEditPart.VISUAL_ID;
		}
		if (UMLPackage.eINSTANCE.getInformationFlow().isSuperTypeOf(domainElement.eClass())) {
			return InformationFlowEditPart.VISUAL_ID;
		}
		return "";
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static boolean isDiagram(Package element) {
		return true;
	}

	/**
	 * @generated
	 */
	private static boolean isProperty_Shape(View containerView, Property domainElement) {
		// Property / CollaborationRole constraint		
		// Restriction for the case where domainElement owner is a Collaboration
		// If the domainElement is not referenced as one of its owner role
		// then it should be considered as a Property creation on Collaboration,
		// else the test should return false and be considered as a representation of
		// a collaboration role (ConnectableElement).
		if (containerView.getElement() instanceof Collaboration) {
			Collaboration graphicalParent = (Collaboration) containerView.getElement();
			if (graphicalParent.getCollaborationRoles().contains(domainElement)) {
				return false;
			}
		}

		// General case : no restriction
		return true;
	}

	/**
	 * @generated
	 */
	private static boolean isDependency_RoleBindingEdge(Dependency domainElement) {
		// Test if the dependency is a RoleBinding
		if (domainElement.getOwner() instanceof CollaborationUse) {
			CollaborationUse owner = (CollaborationUse) domainElement.getOwner();
			if (owner.getRoleBindings().contains(domainElement)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static boolean isDependency_Edge(Dependency domainElement) {
		// Test if the dependency is not a RoleBinding
		if (domainElement.getOwner() instanceof CollaborationUse) {
			CollaborationUse owner = (CollaborationUse) domainElement.getOwner();
			if (owner.getRoleBindings().contains(domainElement)) {
				return false;
			}
		}
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, String candidate) {
		if (candidate == null) {
			//unrecognized id is always bad
			return false;
		}
		String basic = getNodeVisualID(containerView, domainElement);
		return candidate.equals(basic);
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(String visualID) {
		if (visualID != null) {
			switch (visualID) {
			case DataTypeAttributeCompartmentEditPart.VISUAL_ID:
			case DataTypeOperationCompartmentEditPart.VISUAL_ID:
			case DataTypeAttributeCompartmentEditPartCN.VISUAL_ID:
			case DataTypeOperationCompartmentEditPartCN.VISUAL_ID:
			case EnumerationEnumerationLiteralCompartmentEditPart.VISUAL_ID:
			case EnumerationEnumerationLiteralCompartmentEditPartCN.VISUAL_ID:
			case ActivityCompositeCompartmentEditPartCN.VISUAL_ID:
			case InteractionCompositeCompartmentEditPartCN.VISUAL_ID:
			case ProtocolStateMachineCompositeCompartmentEditPartCN.VISUAL_ID:
			case StateMachineCompositeCompartmentEditPartCN.VISUAL_ID:
			case FunctionBehaviorCompositeCompartmentEditPartCN.VISUAL_ID:
			case OpaqueBehaviorCompositeCompartmentEditPartCN.VISUAL_ID:
			case ComponentCompositeCompartmentEditPartCN.VISUAL_ID:
			case DeviceCompositeCompartmentEditPartCN.VISUAL_ID:
			case ExecutionEnvironmentCompositeCompartmentEditPartCN.VISUAL_ID:
			case NodeCompositeCompartmentEditPartCN.VISUAL_ID:
			case ClassCompositeCompartmentEditPartCN.VISUAL_ID:
			case CollaborationCompositeCompartmentEditPartCN.VISUAL_ID:
			case ActivityCompositeCompartmentEditPart.VISUAL_ID:
			case InteractionCompositeCompartmentEditPart.VISUAL_ID:
			case ProtocolStateMachineCompositeCompartmentEditPart.VISUAL_ID:
			case StateMachineCompositeCompartmentEditPart.VISUAL_ID:
			case FunctionBehaviorCompositeCompartmentEditPart.VISUAL_ID:
			case OpaqueBehaviorCompositeCompartmentEditPart.VISUAL_ID:
			case ComponentCompositeCompartmentEditPart.VISUAL_ID:
			case DeviceCompositeCompartmentEditPart.VISUAL_ID:
			case ExecutionEnvironmentCompositeCompartmentEditPart.VISUAL_ID:
			case NodeCompositeCompartmentEditPart.VISUAL_ID:
			case ClassCompositeCompartmentEditPart.VISUAL_ID:
			case CollaborationCompositeCompartmentEditPart.VISUAL_ID:
			case PropertyPartCompartmentEditPartCN.VISUAL_ID:
				return true;
			}
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(String visualID) {
		if (visualID != null) {
			switch (visualID) {
			case CompositeStructureDiagramEditPart.VISUAL_ID:
				return false;
			case PrimitiveTypeEditPart.VISUAL_ID:
			case InterfaceEditPart.VISUAL_ID:
			case ActorEditPart.VISUAL_ID:
			case DeploymentSpecificationEditPart.VISUAL_ID:
			case ArtifactEditPart.VISUAL_ID:
			case InformationItemEditPart.VISUAL_ID:
			case SignalEditPart.VISUAL_ID:
			case UseCaseEditPart.VISUAL_ID:
			case SignalEventEditPart.VISUAL_ID:
			case CallEventEditPart.VISUAL_ID:
			case AnyReceiveEventEditPart.VISUAL_ID:
			case ChangeEventEditPart.VISUAL_ID:
			case TimeEventEditPart.VISUAL_ID:
			case DurationObservationEditPart.VISUAL_ID:
			case TimeObservationEditPart.VISUAL_ID:
			case LiteralBooleanEditPart.VISUAL_ID:
			case LiteralIntegerEditPart.VISUAL_ID:
			case LiteralNullEditPart.VISUAL_ID:
			case LiteralStringEditPart.VISUAL_ID:
			case LiteralUnlimitedNaturalEditPart.VISUAL_ID:
			case StringExpressionEditPart.VISUAL_ID:
			case OpaqueExpressionEditPart.VISUAL_ID:
			case TimeExpressionEditPart.VISUAL_ID:
			case ExpressionEditPart.VISUAL_ID:
			case DurationEditPart.VISUAL_ID:
			case TimeIntervalEditPart.VISUAL_ID:
			case DurationIntervalEditPart.VISUAL_ID:
			case IntervalEditPart.VISUAL_ID:
			case InstanceValueEditPart.VISUAL_ID:
			case CommentEditPart.VISUAL_ID:
			case DurationConstraintEditPart.VISUAL_ID:
			case TimeConstraintEditPart.VISUAL_ID:
			case IntervalConstraintEditPart.VISUAL_ID:
			case InteractionConstraintEditPart.VISUAL_ID:
			case ConstraintEditPart.VISUAL_ID:
			case EnumerationLiteralEditPartCLN.VISUAL_ID:
			case PortEditPart.VISUAL_ID:
			case CollaborationUseEditPartCN.VISUAL_ID:
			case PrimitiveTypeEditPartCN.VISUAL_ID:
			case InterfaceEditPartCN.VISUAL_ID:
			case ParameterEditPart.VISUAL_ID:
			case ActorEditPartCN.VISUAL_ID:
			case DeploymentSpecificationEditPartCN.VISUAL_ID:
			case ArtifactEditPartCN.VISUAL_ID:
			case InformationItemEditPartCN.VISUAL_ID:
			case SignalEditPartCN.VISUAL_ID:
			case UseCaseEditPartCN.VISUAL_ID:
			case CommentEditPartCN.VISUAL_ID:
			case PropertyEditPartCLN.VISUAL_ID:
			case OperationEditPartCLN.VISUAL_ID:
			case CollaborationRoleEditPartCN.VISUAL_ID:
			case DurationConstraintEditPartCN.VISUAL_ID:
			case TimeConstraintEditPartCN.VISUAL_ID:
			case IntervalConstraintEditPartCN.VISUAL_ID:
			case InteractionConstraintEditPartCN.VISUAL_ID:
			case ConstraintEditPartCN.VISUAL_ID:
			case BehaviorPortEditPart.VISUAL_ID:
				return true;
			}
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public String getVisualID(View view) {
			return org.eclipse.papyrus.uml.diagram.composite.part.UMLVisualIDRegistry.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return org.eclipse.papyrus.uml.diagram.composite.part.UMLVisualIDRegistry.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getNodeVisualID(View containerView, EObject domainElement) {
			return org.eclipse.papyrus.uml.diagram.composite.part.UMLVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView, EObject domainElement, String candidate) {
			return org.eclipse.papyrus.uml.diagram.composite.part.UMLVisualIDRegistry.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(String visualID) {
			return org.eclipse.papyrus.uml.diagram.composite.part.UMLVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(String visualID) {
			return org.eclipse.papyrus.uml.diagram.composite.part.UMLVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
