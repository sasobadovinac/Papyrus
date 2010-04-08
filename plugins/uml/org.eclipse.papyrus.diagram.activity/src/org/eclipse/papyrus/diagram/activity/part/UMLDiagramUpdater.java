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
package org.eclipse.papyrus.diagram.activity.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.diagram.activity.edit.parts.AcceptEventActionEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ActionInputPinInCallBeActEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ActionInputPinInCallOpActAsTargetEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ActionInputPinInCallOpActEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ActionInputPinInOpaqueActEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ActionInputPinInSendObjActAsReqEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ActionInputPinInSendObjActAsTargetEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ActionInputPinInSendSigActAsTargetEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ActionInputPinInSendSigActEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ActionLocalPostconditionEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ActionLocalPreconditionEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ActivityActivityContentCompartmentEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ActivityActivityParametersCompartmentEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ActivityActivityPostConditionsCompartmentEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ActivityActivityPreConditionsCompartmentEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ActivityDiagramEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ActivityEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ActivityFinalNodeEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ActivityParameterNodeEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ActivityPartitionEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.CallBehaviorActionEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.CallOperationActionEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ConditionalNodeEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ConstraintAsLocalPostcondEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ConstraintAsLocalPrecondEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ConstraintInActivityAsPostcondEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ConstraintInActivityAsPrecondEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ControlFlowEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.DataStoreNodeEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.DecisionNodeEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.DurationConstraintAsLocalPostcondEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.DurationConstraintAsLocalPrecondEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ExceptionHandlerEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ExpansionNodeAsInEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ExpansionNodeAsOutEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ExpansionRegionEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.FlowFinalNodeEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ForkNodeEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.InitialNodeEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.InputPinInCallBeActEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.InputPinInCallOpActAsTargetEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.InputPinInCallOpActEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.InputPinInOpaqueActEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.InputPinInSendObjActAsReqEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.InputPinInSendObjActAsTargetEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.InputPinInSendSigActAsTargetEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.InputPinInSendSigActEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.InteractionConstraintAsLocalPostcondEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.InteractionConstraintAsLocalPrecondEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.InterruptibleActivityRegionEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.IntervalConstraintAsLocalPostcondEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.IntervalConstraintAsLocalPrecondEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.JoinNodeEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.LoopNodeEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.MergeNodeEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ObjectFlowEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.OpaqueActionEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.OutputPinInAcceptEventActionEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.OutputPinInCallBeActEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.OutputPinInCallOpActEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.OutputPinInOpaqueActEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.OutputPinInValSpecActEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ParameterEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.SendObjectActionEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.SendSignalActionEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.SequenceNodeEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.StructuredActivityNodeEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.TimeConstraintAsLocalPostcondEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.TimeConstraintAsLocalPrecondEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ValuePinInCallBeActEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ValuePinInCallOpActAsTargetEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ValuePinInCallOpActEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ValuePinInOpaqueActEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ValuePinInSendObjActAsReqEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ValuePinInSendObjActAsTargetEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ValuePinInSendSigActAsTargetEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ValuePinInSendSigActEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ValueSpecificationActionEditPart;
import org.eclipse.papyrus.diagram.activity.providers.UMLElementTypes;
import org.eclipse.uml2.uml.AcceptEventAction;
import org.eclipse.uml2.uml.Action;
import org.eclipse.uml2.uml.ActionInputPin;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityFinalNode;
import org.eclipse.uml2.uml.ActivityGroup;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.ActivityParameterNode;
import org.eclipse.uml2.uml.CallBehaviorAction;
import org.eclipse.uml2.uml.CallOperationAction;
import org.eclipse.uml2.uml.ConditionalNode;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.ControlFlow;
import org.eclipse.uml2.uml.DataStoreNode;
import org.eclipse.uml2.uml.DecisionNode;
import org.eclipse.uml2.uml.DurationConstraint;
import org.eclipse.uml2.uml.ExceptionHandler;
import org.eclipse.uml2.uml.ExecutableNode;
import org.eclipse.uml2.uml.ExpansionNode;
import org.eclipse.uml2.uml.ExpansionRegion;
import org.eclipse.uml2.uml.FlowFinalNode;
import org.eclipse.uml2.uml.ForkNode;
import org.eclipse.uml2.uml.InitialNode;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.InteractionConstraint;
import org.eclipse.uml2.uml.IntervalConstraint;
import org.eclipse.uml2.uml.JoinNode;
import org.eclipse.uml2.uml.LoopNode;
import org.eclipse.uml2.uml.MergeNode;
import org.eclipse.uml2.uml.ObjectFlow;
import org.eclipse.uml2.uml.ObjectNode;
import org.eclipse.uml2.uml.OpaqueAction;
import org.eclipse.uml2.uml.OutputPin;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.SendObjectAction;
import org.eclipse.uml2.uml.SendSignalAction;
import org.eclipse.uml2.uml.SequenceNode;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.TimeConstraint;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValuePin;
import org.eclipse.uml2.uml.ValueSpecificationAction;

/**
 * @generated
 */
public class UMLDiagramUpdater {

	/**
	 * @generated
	 */
	public static List getSemanticChildren(View view) {
		switch(UMLVisualIDRegistry.getVisualID(view)) {
		case ActivityEditPart.VISUAL_ID:
			return getActivity_2001SemanticChildren(view);
		case OpaqueActionEditPart.VISUAL_ID:
			return getOpaqueAction_3007SemanticChildren(view);
		case CallBehaviorActionEditPart.VISUAL_ID:
			return getCallBehaviorAction_3008SemanticChildren(view);
		case CallOperationActionEditPart.VISUAL_ID:
			return getCallOperationAction_3010SemanticChildren(view);
		case SendObjectActionEditPart.VISUAL_ID:
			return getSendObjectAction_3042SemanticChildren(view);
		case SendSignalActionEditPart.VISUAL_ID:
			return getSendSignalAction_3052SemanticChildren(view);
		case AcceptEventActionEditPart.VISUAL_ID:
			return getAcceptEventAction_3063SemanticChildren(view);
		case ExpansionRegionEditPart.VISUAL_ID:
			return getExpansionRegion_3070SemanticChildren(view);
		case ValueSpecificationActionEditPart.VISUAL_ID:
			return getValueSpecificationAction_3076SemanticChildren(view);
		case ActivityActivityParametersCompartmentEditPart.VISUAL_ID:
			return getActivityActivityParametersCompartment_7001SemanticChildren(view);
		case ActivityActivityPreConditionsCompartmentEditPart.VISUAL_ID:
			return getActivityActivityPreConditionsCompartment_7002SemanticChildren(view);
		case ActivityActivityPostConditionsCompartmentEditPart.VISUAL_ID:
			return getActivityActivityPostConditionsCompartment_7003SemanticChildren(view);
		case ActivityActivityContentCompartmentEditPart.VISUAL_ID:
			return getActivityActivityContentCompartment_7004SemanticChildren(view);
		case ActivityDiagramEditPart.VISUAL_ID:
			return getPackage_1000SemanticChildren(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getActivity_2001SemanticChildren(View view) {
		if(!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Activity modelElement = (Activity)view.getElement();
		List result = new LinkedList();
		for(Iterator it = modelElement.getNodes().iterator(); it.hasNext();) {
			ActivityNode childElement = (ActivityNode)it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if(visualID == ActivityParameterNodeEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueAction_3007SemanticChildren(View view) {
		if(!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		OpaqueAction modelElement = (OpaqueAction)view.getElement();
		List result = new LinkedList();
		for(Iterator it = modelElement.getInputValues().iterator(); it.hasNext();) {
			InputPin childElement = (InputPin)it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if(visualID == ValuePinInOpaqueActEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if(visualID == ActionInputPinInOpaqueActEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if(visualID == InputPinInOpaqueActEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for(Iterator it = modelElement.getOutputValues().iterator(); it.hasNext();) {
			OutputPin childElement = (OutputPin)it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if(visualID == OutputPinInOpaqueActEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCallBehaviorAction_3008SemanticChildren(View view) {
		if(!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		CallBehaviorAction modelElement = (CallBehaviorAction)view.getElement();
		List result = new LinkedList();
		for(Iterator it = modelElement.getArguments().iterator(); it.hasNext();) {
			InputPin childElement = (InputPin)it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if(visualID == ValuePinInCallBeActEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if(visualID == ActionInputPinInCallBeActEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if(visualID == InputPinInCallBeActEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for(Iterator it = modelElement.getResults().iterator(); it.hasNext();) {
			OutputPin childElement = (OutputPin)it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if(visualID == OutputPinInCallBeActEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCallOperationAction_3010SemanticChildren(View view) {
		if(!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		CallOperationAction modelElement = (CallOperationAction)view.getElement();
		List result = new LinkedList();
		for(Iterator it = modelElement.getArguments().iterator(); it.hasNext();) {
			InputPin childElement = (InputPin)it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if(visualID == ActionInputPinInCallOpActEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if(visualID == ValuePinInCallOpActEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if(visualID == InputPinInCallOpActEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for(Iterator it = modelElement.getResults().iterator(); it.hasNext();) {
			OutputPin childElement = (OutputPin)it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if(visualID == OutputPinInCallOpActEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			InputPin childElement = modelElement.getTarget();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if(visualID == ValuePinInCallOpActAsTargetEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
			}
			if(visualID == ActionInputPinInCallOpActAsTargetEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
			}
			if(visualID == InputPinInCallOpActAsTargetEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSendObjectAction_3042SemanticChildren(View view) {
		if(!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		SendObjectAction modelElement = (SendObjectAction)view.getElement();
		List result = new LinkedList();
		{
			InputPin childElement = modelElement.getRequest();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if(visualID == ValuePinInSendObjActAsReqEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
			}
			if(visualID == ActionInputPinInSendObjActAsReqEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
			}
			if(visualID == InputPinInSendObjActAsReqEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
			}
		}
		{
			InputPin childElement = modelElement.getTarget();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if(visualID == ValuePinInSendObjActAsTargetEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
			}
			if(visualID == ActionInputPinInSendObjActAsTargetEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
			}
			if(visualID == InputPinInSendObjActAsTargetEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSendSignalAction_3052SemanticChildren(View view) {
		if(!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		SendSignalAction modelElement = (SendSignalAction)view.getElement();
		List result = new LinkedList();
		for(Iterator it = modelElement.getArguments().iterator(); it.hasNext();) {
			InputPin childElement = (InputPin)it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if(visualID == ActionInputPinInSendSigActEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if(visualID == ValuePinInSendSigActEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if(visualID == InputPinInSendSigActEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			InputPin childElement = modelElement.getTarget();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if(visualID == ValuePinInSendSigActAsTargetEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
			}
			if(visualID == ActionInputPinInSendSigActAsTargetEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
			}
			if(visualID == InputPinInSendSigActAsTargetEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAcceptEventAction_3063SemanticChildren(View view) {
		if(!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		AcceptEventAction modelElement = (AcceptEventAction)view.getElement();
		List result = new LinkedList();
		for(Iterator it = modelElement.getResults().iterator(); it.hasNext();) {
			OutputPin childElement = (OutputPin)it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if(visualID == OutputPinInAcceptEventActionEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getExpansionRegion_3070SemanticChildren(View view) {
		if(!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		ExpansionRegion modelElement = (ExpansionRegion)view.getElement();
		List result = new LinkedList();
		for(Iterator it = modelElement.getInputElements().iterator(); it.hasNext();) {
			ExpansionNode childElement = (ExpansionNode)it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if(visualID == ExpansionNodeAsInEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for(Iterator it = modelElement.getOutputElements().iterator(); it.hasNext();) {
			ExpansionNode childElement = (ExpansionNode)it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if(visualID == ExpansionNodeAsOutEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getValueSpecificationAction_3076SemanticChildren(View view) {
		if(!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		ValueSpecificationAction modelElement = (ValueSpecificationAction)view.getElement();
		List result = new LinkedList();
		{
			OutputPin childElement = modelElement.getResult();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if(visualID == OutputPinInValSpecActEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getActivityActivityParametersCompartment_7001SemanticChildren(View view) {
		if(false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View)view.eContainer();
		if(!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Activity modelElement = (Activity)containerView.getElement();
		List result = new LinkedList();
		for(Iterator it = modelElement.getOwnedParameters().iterator(); it.hasNext();) {
			Parameter childElement = (Parameter)it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if(visualID == ParameterEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getActivityActivityPreConditionsCompartment_7002SemanticChildren(View view) {
		if(false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View)view.eContainer();
		if(!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Activity modelElement = (Activity)containerView.getElement();
		List result = new LinkedList();
		for(Iterator it = modelElement.getPreconditions().iterator(); it.hasNext();) {
			Constraint childElement = (Constraint)it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if(visualID == ConstraintInActivityAsPrecondEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getActivityActivityPostConditionsCompartment_7003SemanticChildren(View view) {
		if(false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View)view.eContainer();
		if(!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Activity modelElement = (Activity)containerView.getElement();
		List result = new LinkedList();
		for(Iterator it = modelElement.getPostconditions().iterator(); it.hasNext();) {
			Constraint childElement = (Constraint)it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if(visualID == ConstraintInActivityAsPostcondEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated NOT (update at each gmf change) add children actions' local conditions
	 */
	public static List getActivityActivityContentCompartment_7004SemanticChildren(View view) {
		if(false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View)view.eContainer();
		if(!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Activity modelElement = (Activity)containerView.getElement();
		List result = new LinkedList();
		for(Iterator it = modelElement.getNodes().iterator(); it.hasNext();) {
			ActivityNode childElement = (ActivityNode)it.next();
			//add children actions' local conditions
			if(childElement instanceof Action) {
				result.addAll(getActionLocalConditionsDescriptors((Action)childElement, view));
			}
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if(visualID == InitialNodeEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if(visualID == ActivityFinalNodeEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if(visualID == FlowFinalNodeEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if(visualID == OpaqueActionEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if(visualID == CallBehaviorActionEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if(visualID == CallOperationActionEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if(visualID == DecisionNodeEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if(visualID == MergeNodeEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if(visualID == ForkNodeEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if(visualID == JoinNodeEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if(visualID == SendObjectActionEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if(visualID == SendSignalActionEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if(visualID == AcceptEventActionEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if(visualID == ValueSpecificationActionEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if(visualID == DataStoreNodeEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for(Iterator it = modelElement.getGroups().iterator(); it.hasNext();) {
			ActivityGroup childElement = (ActivityGroup)it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if(visualID == ConditionalNodeEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if(visualID == ExpansionRegionEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if(visualID == LoopNodeEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if(visualID == SequenceNodeEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if(visualID == StructuredActivityNodeEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if(visualID == ActivityPartitionEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if(visualID == InterruptibleActivityRegionEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * Get the node descriptors corresponding to local pre and post conditions of an action.
	 * These nodes are children of ActivityContentCompartment_7004.
	 * 
	 * @param actionElement
	 *        the action containing conditions
	 * @param parentView
	 *        the parent activity content compartment view
	 * @return the list of semantic children (node descriptors)
	 * @generated NOT
	 */
	private static List<UMLNodeDescriptor> getActionLocalConditionsDescriptors(Action actionElement, View parentView) {
		/*
		 * Called above by customized code (instead of generated code with errors) :
		 * //add children actions' local conditions
		 * if(childElement instanceof Action) {
		 * result.addAll(getActionLocalConditionsDescriptors((Action)childElement, view));
		 * }
		 */
		List<UMLNodeDescriptor> result = new LinkedList<UMLNodeDescriptor>();
		for(Constraint childElement : actionElement.getLocalPreconditions()) {
			int visualID = UMLVisualIDRegistry.getNodeVisualID(parentView, childElement);
			if(visualID == ConstraintAsLocalPrecondEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if(visualID == InteractionConstraintAsLocalPrecondEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if(visualID == IntervalConstraintAsLocalPrecondEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if(visualID == DurationConstraintAsLocalPrecondEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if(visualID == TimeConstraintAsLocalPrecondEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for(Constraint childElement : actionElement.getLocalPostconditions()) {
			int visualID = UMLVisualIDRegistry.getNodeVisualID(parentView, childElement);
			if(visualID == ConstraintAsLocalPostcondEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if(visualID == InteractionConstraintAsLocalPostcondEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if(visualID == IntervalConstraintAsLocalPostcondEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if(visualID == DurationConstraintAsLocalPostcondEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if(visualID == TimeConstraintAsLocalPostcondEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPackage_1000SemanticChildren(View view) {
		if(!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Package modelElement = (Package)view.getElement();
		List result = new LinkedList();
		for(Iterator it = modelElement.getPackagedElements().iterator(); it.hasNext();) {
			PackageableElement childElement = (PackageableElement)it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if(visualID == ActivityEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getContainedLinks(View view) {
		switch(UMLVisualIDRegistry.getVisualID(view)) {
		case ActivityDiagramEditPart.VISUAL_ID:
			return getPackage_1000ContainedLinks(view);
		case ActivityEditPart.VISUAL_ID:
			return getActivity_2001ContainedLinks(view);
		case ParameterEditPart.VISUAL_ID:
			return getParameter_3001ContainedLinks(view);
		case ConstraintInActivityAsPrecondEditPart.VISUAL_ID:
			return getConstraint_3002ContainedLinks(view);
		case ConstraintInActivityAsPostcondEditPart.VISUAL_ID:
			return getConstraint_3003ContainedLinks(view);
		case InitialNodeEditPart.VISUAL_ID:
			return getInitialNode_3004ContainedLinks(view);
		case ActivityFinalNodeEditPart.VISUAL_ID:
			return getActivityFinalNode_3005ContainedLinks(view);
		case FlowFinalNodeEditPart.VISUAL_ID:
			return getFlowFinalNode_3006ContainedLinks(view);
		case OpaqueActionEditPart.VISUAL_ID:
			return getOpaqueAction_3007ContainedLinks(view);
		case ValuePinInOpaqueActEditPart.VISUAL_ID:
			return getValuePin_3015ContainedLinks(view);
		case ActionInputPinInOpaqueActEditPart.VISUAL_ID:
			return getActionInputPin_3016ContainedLinks(view);
		case InputPinInOpaqueActEditPart.VISUAL_ID:
			return getInputPin_3013ContainedLinks(view);
		case OutputPinInOpaqueActEditPart.VISUAL_ID:
			return getOutputPin_3014ContainedLinks(view);
		case CallBehaviorActionEditPart.VISUAL_ID:
			return getCallBehaviorAction_3008ContainedLinks(view);
		case ValuePinInCallBeActEditPart.VISUAL_ID:
			return getValuePin_3017ContainedLinks(view);
		case ActionInputPinInCallBeActEditPart.VISUAL_ID:
			return getActionInputPin_3018ContainedLinks(view);
		case InputPinInCallBeActEditPart.VISUAL_ID:
			return getInputPin_3019ContainedLinks(view);
		case OutputPinInCallBeActEditPart.VISUAL_ID:
			return getOutputPin_3020ContainedLinks(view);
		case CallOperationActionEditPart.VISUAL_ID:
			return getCallOperationAction_3010ContainedLinks(view);
		case ActionInputPinInCallOpActEditPart.VISUAL_ID:
			return getActionInputPin_3021ContainedLinks(view);
		case ValuePinInCallOpActEditPart.VISUAL_ID:
			return getValuePin_3022ContainedLinks(view);
		case InputPinInCallOpActEditPart.VISUAL_ID:
			return getInputPin_3023ContainedLinks(view);
		case OutputPinInCallOpActEditPart.VISUAL_ID:
			return getOutputPin_3024ContainedLinks(view);
		case ValuePinInCallOpActAsTargetEditPart.VISUAL_ID:
			return getValuePin_3025ContainedLinks(view);
		case ActionInputPinInCallOpActAsTargetEditPart.VISUAL_ID:
			return getActionInputPin_3026ContainedLinks(view);
		case InputPinInCallOpActAsTargetEditPart.VISUAL_ID:
			return getInputPin_3027ContainedLinks(view);
		case DurationConstraintAsLocalPrecondEditPart.VISUAL_ID:
			return getDurationConstraint_3034ContainedLinks(view);
		case DurationConstraintAsLocalPostcondEditPart.VISUAL_ID:
			return getDurationConstraint_3035ContainedLinks(view);
		case TimeConstraintAsLocalPrecondEditPart.VISUAL_ID:
			return getTimeConstraint_3036ContainedLinks(view);
		case TimeConstraintAsLocalPostcondEditPart.VISUAL_ID:
			return getTimeConstraint_3037ContainedLinks(view);
		case InteractionConstraintAsLocalPrecondEditPart.VISUAL_ID:
			return getInteractionConstraint_3030ContainedLinks(view);
		case InteractionConstraintAsLocalPostcondEditPart.VISUAL_ID:
			return getInteractionConstraint_3031ContainedLinks(view);
		case IntervalConstraintAsLocalPrecondEditPart.VISUAL_ID:
			return getIntervalConstraint_3032ContainedLinks(view);
		case IntervalConstraintAsLocalPostcondEditPart.VISUAL_ID:
			return getIntervalConstraint_3033ContainedLinks(view);
		case ConstraintAsLocalPrecondEditPart.VISUAL_ID:
			return getConstraint_3011ContainedLinks(view);
		case ConstraintAsLocalPostcondEditPart.VISUAL_ID:
			return getConstraint_3012ContainedLinks(view);
		case DecisionNodeEditPart.VISUAL_ID:
			return getDecisionNode_3038ContainedLinks(view);
		case MergeNodeEditPart.VISUAL_ID:
			return getMergeNode_3039ContainedLinks(view);
		case ForkNodeEditPart.VISUAL_ID:
			return getForkNode_3040ContainedLinks(view);
		case JoinNodeEditPart.VISUAL_ID:
			return getJoinNode_3041ContainedLinks(view);
		case SendObjectActionEditPart.VISUAL_ID:
			return getSendObjectAction_3042ContainedLinks(view);
		case ValuePinInSendObjActAsReqEditPart.VISUAL_ID:
			return getValuePin_3046ContainedLinks(view);
		case ActionInputPinInSendObjActAsReqEditPart.VISUAL_ID:
			return getActionInputPin_3047ContainedLinks(view);
		case InputPinInSendObjActAsReqEditPart.VISUAL_ID:
			return getInputPin_3048ContainedLinks(view);
		case ValuePinInSendObjActAsTargetEditPart.VISUAL_ID:
			return getValuePin_3049ContainedLinks(view);
		case ActionInputPinInSendObjActAsTargetEditPart.VISUAL_ID:
			return getActionInputPin_3050ContainedLinks(view);
		case InputPinInSendObjActAsTargetEditPart.VISUAL_ID:
			return getInputPin_3051ContainedLinks(view);
		case SendSignalActionEditPart.VISUAL_ID:
			return getSendSignalAction_3052ContainedLinks(view);
		case ActionInputPinInSendSigActEditPart.VISUAL_ID:
			return getActionInputPin_3053ContainedLinks(view);
		case ValuePinInSendSigActEditPart.VISUAL_ID:
			return getValuePin_3054ContainedLinks(view);
		case InputPinInSendSigActEditPart.VISUAL_ID:
			return getInputPin_3055ContainedLinks(view);
		case ValuePinInSendSigActAsTargetEditPart.VISUAL_ID:
			return getValuePin_3060ContainedLinks(view);
		case ActionInputPinInSendSigActAsTargetEditPart.VISUAL_ID:
			return getActionInputPin_3061ContainedLinks(view);
		case InputPinInSendSigActAsTargetEditPart.VISUAL_ID:
			return getInputPin_3062ContainedLinks(view);
		case ActivityParameterNodeEditPart.VISUAL_ID:
			return getActivityParameterNode_3059ContainedLinks(view);
		case AcceptEventActionEditPart.VISUAL_ID:
			return getAcceptEventAction_3063ContainedLinks(view);
		case OutputPinInAcceptEventActionEditPart.VISUAL_ID:
			return getOutputPin_3064ContainedLinks(view);
		case ConditionalNodeEditPart.VISUAL_ID:
			return getConditionalNode_3069ContainedLinks(view);
		case ExpansionRegionEditPart.VISUAL_ID:
			return getExpansionRegion_3070ContainedLinks(view);
		case ExpansionNodeAsInEditPart.VISUAL_ID:
			return getExpansionNode_3074ContainedLinks(view);
		case ExpansionNodeAsOutEditPart.VISUAL_ID:
			return getExpansionNode_3075ContainedLinks(view);
		case LoopNodeEditPart.VISUAL_ID:
			return getLoopNode_3071ContainedLinks(view);
		case SequenceNodeEditPart.VISUAL_ID:
			return getSequenceNode_3073ContainedLinks(view);
		case StructuredActivityNodeEditPart.VISUAL_ID:
			return getStructuredActivityNode_3065ContainedLinks(view);
		case ActivityPartitionEditPart.VISUAL_ID:
			return getActivityPartition_3067ContainedLinks(view);
		case InterruptibleActivityRegionEditPart.VISUAL_ID:
			return getInterruptibleActivityRegion_3068ContainedLinks(view);
		case ValueSpecificationActionEditPart.VISUAL_ID:
			return getValueSpecificationAction_3076ContainedLinks(view);
		case OutputPinInValSpecActEditPart.VISUAL_ID:
			return getOutputPin_3077ContainedLinks(view);
		case DataStoreNodeEditPart.VISUAL_ID:
			return getDataStoreNode_3078ContainedLinks(view);
		case ObjectFlowEditPart.VISUAL_ID:
			return getObjectFlow_4003ContainedLinks(view);
		case ControlFlowEditPart.VISUAL_ID:
			return getControlFlow_4004ContainedLinks(view);
		case ExceptionHandlerEditPart.VISUAL_ID:
			return getExceptionHandler_4005ContainedLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIncomingLinks(View view) {
		switch(UMLVisualIDRegistry.getVisualID(view)) {
		case ActivityEditPart.VISUAL_ID:
			return getActivity_2001IncomingLinks(view);
		case ParameterEditPart.VISUAL_ID:
			return getParameter_3001IncomingLinks(view);
		case ConstraintInActivityAsPrecondEditPart.VISUAL_ID:
			return getConstraint_3002IncomingLinks(view);
		case ConstraintInActivityAsPostcondEditPart.VISUAL_ID:
			return getConstraint_3003IncomingLinks(view);
		case InitialNodeEditPart.VISUAL_ID:
			return getInitialNode_3004IncomingLinks(view);
		case ActivityFinalNodeEditPart.VISUAL_ID:
			return getActivityFinalNode_3005IncomingLinks(view);
		case FlowFinalNodeEditPart.VISUAL_ID:
			return getFlowFinalNode_3006IncomingLinks(view);
		case OpaqueActionEditPart.VISUAL_ID:
			return getOpaqueAction_3007IncomingLinks(view);
		case ValuePinInOpaqueActEditPart.VISUAL_ID:
			return getValuePin_3015IncomingLinks(view);
		case ActionInputPinInOpaqueActEditPart.VISUAL_ID:
			return getActionInputPin_3016IncomingLinks(view);
		case InputPinInOpaqueActEditPart.VISUAL_ID:
			return getInputPin_3013IncomingLinks(view);
		case OutputPinInOpaqueActEditPart.VISUAL_ID:
			return getOutputPin_3014IncomingLinks(view);
		case CallBehaviorActionEditPart.VISUAL_ID:
			return getCallBehaviorAction_3008IncomingLinks(view);
		case ValuePinInCallBeActEditPart.VISUAL_ID:
			return getValuePin_3017IncomingLinks(view);
		case ActionInputPinInCallBeActEditPart.VISUAL_ID:
			return getActionInputPin_3018IncomingLinks(view);
		case InputPinInCallBeActEditPart.VISUAL_ID:
			return getInputPin_3019IncomingLinks(view);
		case OutputPinInCallBeActEditPart.VISUAL_ID:
			return getOutputPin_3020IncomingLinks(view);
		case CallOperationActionEditPart.VISUAL_ID:
			return getCallOperationAction_3010IncomingLinks(view);
		case ActionInputPinInCallOpActEditPart.VISUAL_ID:
			return getActionInputPin_3021IncomingLinks(view);
		case ValuePinInCallOpActEditPart.VISUAL_ID:
			return getValuePin_3022IncomingLinks(view);
		case InputPinInCallOpActEditPart.VISUAL_ID:
			return getInputPin_3023IncomingLinks(view);
		case OutputPinInCallOpActEditPart.VISUAL_ID:
			return getOutputPin_3024IncomingLinks(view);
		case ValuePinInCallOpActAsTargetEditPart.VISUAL_ID:
			return getValuePin_3025IncomingLinks(view);
		case ActionInputPinInCallOpActAsTargetEditPart.VISUAL_ID:
			return getActionInputPin_3026IncomingLinks(view);
		case InputPinInCallOpActAsTargetEditPart.VISUAL_ID:
			return getInputPin_3027IncomingLinks(view);
		case DurationConstraintAsLocalPrecondEditPart.VISUAL_ID:
			return getDurationConstraint_3034IncomingLinks(view);
		case DurationConstraintAsLocalPostcondEditPart.VISUAL_ID:
			return getDurationConstraint_3035IncomingLinks(view);
		case TimeConstraintAsLocalPrecondEditPart.VISUAL_ID:
			return getTimeConstraint_3036IncomingLinks(view);
		case TimeConstraintAsLocalPostcondEditPart.VISUAL_ID:
			return getTimeConstraint_3037IncomingLinks(view);
		case InteractionConstraintAsLocalPrecondEditPart.VISUAL_ID:
			return getInteractionConstraint_3030IncomingLinks(view);
		case InteractionConstraintAsLocalPostcondEditPart.VISUAL_ID:
			return getInteractionConstraint_3031IncomingLinks(view);
		case IntervalConstraintAsLocalPrecondEditPart.VISUAL_ID:
			return getIntervalConstraint_3032IncomingLinks(view);
		case IntervalConstraintAsLocalPostcondEditPart.VISUAL_ID:
			return getIntervalConstraint_3033IncomingLinks(view);
		case ConstraintAsLocalPrecondEditPart.VISUAL_ID:
			return getConstraint_3011IncomingLinks(view);
		case ConstraintAsLocalPostcondEditPart.VISUAL_ID:
			return getConstraint_3012IncomingLinks(view);
		case DecisionNodeEditPart.VISUAL_ID:
			return getDecisionNode_3038IncomingLinks(view);
		case MergeNodeEditPart.VISUAL_ID:
			return getMergeNode_3039IncomingLinks(view);
		case ForkNodeEditPart.VISUAL_ID:
			return getForkNode_3040IncomingLinks(view);
		case JoinNodeEditPart.VISUAL_ID:
			return getJoinNode_3041IncomingLinks(view);
		case SendObjectActionEditPart.VISUAL_ID:
			return getSendObjectAction_3042IncomingLinks(view);
		case ValuePinInSendObjActAsReqEditPart.VISUAL_ID:
			return getValuePin_3046IncomingLinks(view);
		case ActionInputPinInSendObjActAsReqEditPart.VISUAL_ID:
			return getActionInputPin_3047IncomingLinks(view);
		case InputPinInSendObjActAsReqEditPart.VISUAL_ID:
			return getInputPin_3048IncomingLinks(view);
		case ValuePinInSendObjActAsTargetEditPart.VISUAL_ID:
			return getValuePin_3049IncomingLinks(view);
		case ActionInputPinInSendObjActAsTargetEditPart.VISUAL_ID:
			return getActionInputPin_3050IncomingLinks(view);
		case InputPinInSendObjActAsTargetEditPart.VISUAL_ID:
			return getInputPin_3051IncomingLinks(view);
		case SendSignalActionEditPart.VISUAL_ID:
			return getSendSignalAction_3052IncomingLinks(view);
		case ActionInputPinInSendSigActEditPart.VISUAL_ID:
			return getActionInputPin_3053IncomingLinks(view);
		case ValuePinInSendSigActEditPart.VISUAL_ID:
			return getValuePin_3054IncomingLinks(view);
		case InputPinInSendSigActEditPart.VISUAL_ID:
			return getInputPin_3055IncomingLinks(view);
		case ValuePinInSendSigActAsTargetEditPart.VISUAL_ID:
			return getValuePin_3060IncomingLinks(view);
		case ActionInputPinInSendSigActAsTargetEditPart.VISUAL_ID:
			return getActionInputPin_3061IncomingLinks(view);
		case InputPinInSendSigActAsTargetEditPart.VISUAL_ID:
			return getInputPin_3062IncomingLinks(view);
		case ActivityParameterNodeEditPart.VISUAL_ID:
			return getActivityParameterNode_3059IncomingLinks(view);
		case AcceptEventActionEditPart.VISUAL_ID:
			return getAcceptEventAction_3063IncomingLinks(view);
		case OutputPinInAcceptEventActionEditPart.VISUAL_ID:
			return getOutputPin_3064IncomingLinks(view);
		case ConditionalNodeEditPart.VISUAL_ID:
			return getConditionalNode_3069IncomingLinks(view);
		case ExpansionRegionEditPart.VISUAL_ID:
			return getExpansionRegion_3070IncomingLinks(view);
		case ExpansionNodeAsInEditPart.VISUAL_ID:
			return getExpansionNode_3074IncomingLinks(view);
		case ExpansionNodeAsOutEditPart.VISUAL_ID:
			return getExpansionNode_3075IncomingLinks(view);
		case LoopNodeEditPart.VISUAL_ID:
			return getLoopNode_3071IncomingLinks(view);
		case SequenceNodeEditPart.VISUAL_ID:
			return getSequenceNode_3073IncomingLinks(view);
		case StructuredActivityNodeEditPart.VISUAL_ID:
			return getStructuredActivityNode_3065IncomingLinks(view);
		case ActivityPartitionEditPart.VISUAL_ID:
			return getActivityPartition_3067IncomingLinks(view);
		case InterruptibleActivityRegionEditPart.VISUAL_ID:
			return getInterruptibleActivityRegion_3068IncomingLinks(view);
		case ValueSpecificationActionEditPart.VISUAL_ID:
			return getValueSpecificationAction_3076IncomingLinks(view);
		case OutputPinInValSpecActEditPart.VISUAL_ID:
			return getOutputPin_3077IncomingLinks(view);
		case DataStoreNodeEditPart.VISUAL_ID:
			return getDataStoreNode_3078IncomingLinks(view);
		case ObjectFlowEditPart.VISUAL_ID:
			return getObjectFlow_4003IncomingLinks(view);
		case ControlFlowEditPart.VISUAL_ID:
			return getControlFlow_4004IncomingLinks(view);
		case ExceptionHandlerEditPart.VISUAL_ID:
			return getExceptionHandler_4005IncomingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutgoingLinks(View view) {
		switch(UMLVisualIDRegistry.getVisualID(view)) {
		case ActivityEditPart.VISUAL_ID:
			return getActivity_2001OutgoingLinks(view);
		case ParameterEditPart.VISUAL_ID:
			return getParameter_3001OutgoingLinks(view);
		case ConstraintInActivityAsPrecondEditPart.VISUAL_ID:
			return getConstraint_3002OutgoingLinks(view);
		case ConstraintInActivityAsPostcondEditPart.VISUAL_ID:
			return getConstraint_3003OutgoingLinks(view);
		case InitialNodeEditPart.VISUAL_ID:
			return getInitialNode_3004OutgoingLinks(view);
		case ActivityFinalNodeEditPart.VISUAL_ID:
			return getActivityFinalNode_3005OutgoingLinks(view);
		case FlowFinalNodeEditPart.VISUAL_ID:
			return getFlowFinalNode_3006OutgoingLinks(view);
		case OpaqueActionEditPart.VISUAL_ID:
			return getOpaqueAction_3007OutgoingLinks(view);
		case ValuePinInOpaqueActEditPart.VISUAL_ID:
			return getValuePin_3015OutgoingLinks(view);
		case ActionInputPinInOpaqueActEditPart.VISUAL_ID:
			return getActionInputPin_3016OutgoingLinks(view);
		case InputPinInOpaqueActEditPart.VISUAL_ID:
			return getInputPin_3013OutgoingLinks(view);
		case OutputPinInOpaqueActEditPart.VISUAL_ID:
			return getOutputPin_3014OutgoingLinks(view);
		case CallBehaviorActionEditPart.VISUAL_ID:
			return getCallBehaviorAction_3008OutgoingLinks(view);
		case ValuePinInCallBeActEditPart.VISUAL_ID:
			return getValuePin_3017OutgoingLinks(view);
		case ActionInputPinInCallBeActEditPart.VISUAL_ID:
			return getActionInputPin_3018OutgoingLinks(view);
		case InputPinInCallBeActEditPart.VISUAL_ID:
			return getInputPin_3019OutgoingLinks(view);
		case OutputPinInCallBeActEditPart.VISUAL_ID:
			return getOutputPin_3020OutgoingLinks(view);
		case CallOperationActionEditPart.VISUAL_ID:
			return getCallOperationAction_3010OutgoingLinks(view);
		case ActionInputPinInCallOpActEditPart.VISUAL_ID:
			return getActionInputPin_3021OutgoingLinks(view);
		case ValuePinInCallOpActEditPart.VISUAL_ID:
			return getValuePin_3022OutgoingLinks(view);
		case InputPinInCallOpActEditPart.VISUAL_ID:
			return getInputPin_3023OutgoingLinks(view);
		case OutputPinInCallOpActEditPart.VISUAL_ID:
			return getOutputPin_3024OutgoingLinks(view);
		case ValuePinInCallOpActAsTargetEditPart.VISUAL_ID:
			return getValuePin_3025OutgoingLinks(view);
		case ActionInputPinInCallOpActAsTargetEditPart.VISUAL_ID:
			return getActionInputPin_3026OutgoingLinks(view);
		case InputPinInCallOpActAsTargetEditPart.VISUAL_ID:
			return getInputPin_3027OutgoingLinks(view);
		case DurationConstraintAsLocalPrecondEditPart.VISUAL_ID:
			return getDurationConstraint_3034OutgoingLinks(view);
		case DurationConstraintAsLocalPostcondEditPart.VISUAL_ID:
			return getDurationConstraint_3035OutgoingLinks(view);
		case TimeConstraintAsLocalPrecondEditPart.VISUAL_ID:
			return getTimeConstraint_3036OutgoingLinks(view);
		case TimeConstraintAsLocalPostcondEditPart.VISUAL_ID:
			return getTimeConstraint_3037OutgoingLinks(view);
		case InteractionConstraintAsLocalPrecondEditPart.VISUAL_ID:
			return getInteractionConstraint_3030OutgoingLinks(view);
		case InteractionConstraintAsLocalPostcondEditPart.VISUAL_ID:
			return getInteractionConstraint_3031OutgoingLinks(view);
		case IntervalConstraintAsLocalPrecondEditPart.VISUAL_ID:
			return getIntervalConstraint_3032OutgoingLinks(view);
		case IntervalConstraintAsLocalPostcondEditPart.VISUAL_ID:
			return getIntervalConstraint_3033OutgoingLinks(view);
		case ConstraintAsLocalPrecondEditPart.VISUAL_ID:
			return getConstraint_3011OutgoingLinks(view);
		case ConstraintAsLocalPostcondEditPart.VISUAL_ID:
			return getConstraint_3012OutgoingLinks(view);
		case DecisionNodeEditPart.VISUAL_ID:
			return getDecisionNode_3038OutgoingLinks(view);
		case MergeNodeEditPart.VISUAL_ID:
			return getMergeNode_3039OutgoingLinks(view);
		case ForkNodeEditPart.VISUAL_ID:
			return getForkNode_3040OutgoingLinks(view);
		case JoinNodeEditPart.VISUAL_ID:
			return getJoinNode_3041OutgoingLinks(view);
		case SendObjectActionEditPart.VISUAL_ID:
			return getSendObjectAction_3042OutgoingLinks(view);
		case ValuePinInSendObjActAsReqEditPart.VISUAL_ID:
			return getValuePin_3046OutgoingLinks(view);
		case ActionInputPinInSendObjActAsReqEditPart.VISUAL_ID:
			return getActionInputPin_3047OutgoingLinks(view);
		case InputPinInSendObjActAsReqEditPart.VISUAL_ID:
			return getInputPin_3048OutgoingLinks(view);
		case ValuePinInSendObjActAsTargetEditPart.VISUAL_ID:
			return getValuePin_3049OutgoingLinks(view);
		case ActionInputPinInSendObjActAsTargetEditPart.VISUAL_ID:
			return getActionInputPin_3050OutgoingLinks(view);
		case InputPinInSendObjActAsTargetEditPart.VISUAL_ID:
			return getInputPin_3051OutgoingLinks(view);
		case SendSignalActionEditPart.VISUAL_ID:
			return getSendSignalAction_3052OutgoingLinks(view);
		case ActionInputPinInSendSigActEditPart.VISUAL_ID:
			return getActionInputPin_3053OutgoingLinks(view);
		case ValuePinInSendSigActEditPart.VISUAL_ID:
			return getValuePin_3054OutgoingLinks(view);
		case InputPinInSendSigActEditPart.VISUAL_ID:
			return getInputPin_3055OutgoingLinks(view);
		case ValuePinInSendSigActAsTargetEditPart.VISUAL_ID:
			return getValuePin_3060OutgoingLinks(view);
		case ActionInputPinInSendSigActAsTargetEditPart.VISUAL_ID:
			return getActionInputPin_3061OutgoingLinks(view);
		case InputPinInSendSigActAsTargetEditPart.VISUAL_ID:
			return getInputPin_3062OutgoingLinks(view);
		case ActivityParameterNodeEditPart.VISUAL_ID:
			return getActivityParameterNode_3059OutgoingLinks(view);
		case AcceptEventActionEditPart.VISUAL_ID:
			return getAcceptEventAction_3063OutgoingLinks(view);
		case OutputPinInAcceptEventActionEditPart.VISUAL_ID:
			return getOutputPin_3064OutgoingLinks(view);
		case ConditionalNodeEditPart.VISUAL_ID:
			return getConditionalNode_3069OutgoingLinks(view);
		case ExpansionRegionEditPart.VISUAL_ID:
			return getExpansionRegion_3070OutgoingLinks(view);
		case ExpansionNodeAsInEditPart.VISUAL_ID:
			return getExpansionNode_3074OutgoingLinks(view);
		case ExpansionNodeAsOutEditPart.VISUAL_ID:
			return getExpansionNode_3075OutgoingLinks(view);
		case LoopNodeEditPart.VISUAL_ID:
			return getLoopNode_3071OutgoingLinks(view);
		case SequenceNodeEditPart.VISUAL_ID:
			return getSequenceNode_3073OutgoingLinks(view);
		case StructuredActivityNodeEditPart.VISUAL_ID:
			return getStructuredActivityNode_3065OutgoingLinks(view);
		case ActivityPartitionEditPart.VISUAL_ID:
			return getActivityPartition_3067OutgoingLinks(view);
		case InterruptibleActivityRegionEditPart.VISUAL_ID:
			return getInterruptibleActivityRegion_3068OutgoingLinks(view);
		case ValueSpecificationActionEditPart.VISUAL_ID:
			return getValueSpecificationAction_3076OutgoingLinks(view);
		case OutputPinInValSpecActEditPart.VISUAL_ID:
			return getOutputPin_3077OutgoingLinks(view);
		case DataStoreNodeEditPart.VISUAL_ID:
			return getDataStoreNode_3078OutgoingLinks(view);
		case ObjectFlowEditPart.VISUAL_ID:
			return getObjectFlow_4003OutgoingLinks(view);
		case ControlFlowEditPart.VISUAL_ID:
			return getControlFlow_4004OutgoingLinks(view);
		case ExceptionHandlerEditPart.VISUAL_ID:
			return getExceptionHandler_4005OutgoingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPackage_1000ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getActivity_2001ContainedLinks(View view) {
		Activity modelElement = (Activity)view.getElement();
		List result = new LinkedList();
		result.addAll(getContainedTypeModelFacetLinks_ObjectFlow_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ControlFlow_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getParameter_3001ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getConstraint_3002ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getConstraint_3003ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInitialNode_3004ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getActivityFinalNode_3005ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFlowFinalNode_3006ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueAction_3007ContainedLinks(View view) {
		OpaqueAction modelElement = (OpaqueAction)view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_LocalPrecondition_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_LocalPostcondition_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ExceptionHandler_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getValuePin_3015ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getActionInputPin_3016ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInputPin_3013ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutputPin_3014ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCallBehaviorAction_3008ContainedLinks(View view) {
		CallBehaviorAction modelElement = (CallBehaviorAction)view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_LocalPrecondition_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_LocalPostcondition_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ExceptionHandler_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getValuePin_3017ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getActionInputPin_3018ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInputPin_3019ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutputPin_3020ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCallOperationAction_3010ContainedLinks(View view) {
		CallOperationAction modelElement = (CallOperationAction)view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_LocalPrecondition_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_LocalPostcondition_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ExceptionHandler_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getActionInputPin_3021ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValuePin_3022ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInputPin_3023ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutputPin_3024ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValuePin_3025ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getActionInputPin_3026ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInputPin_3027ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getConstraint_3011ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getConstraint_3012ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDecisionNode_3038ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getMergeNode_3039ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getForkNode_3040ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getJoinNode_3041ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSendObjectAction_3042ContainedLinks(View view) {
		SendObjectAction modelElement = (SendObjectAction)view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_LocalPrecondition_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_LocalPostcondition_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ExceptionHandler_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getValuePin_3046ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getActionInputPin_3047ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInputPin_3048ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValuePin_3049ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getActionInputPin_3050ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInputPin_3051ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSendSignalAction_3052ContainedLinks(View view) {
		SendSignalAction modelElement = (SendSignalAction)view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_LocalPrecondition_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_LocalPostcondition_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ExceptionHandler_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getActionInputPin_3053ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValuePin_3054ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInputPin_3055ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValuePin_3060ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getActionInputPin_3061ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInputPin_3062ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getActivityParameterNode_3059ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAcceptEventAction_3063ContainedLinks(View view) {
		AcceptEventAction modelElement = (AcceptEventAction)view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_LocalPrecondition_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_LocalPostcondition_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ExceptionHandler_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOutputPin_3064ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getStructuredActivityNode_3065ContainedLinks(View view) {
		StructuredActivityNode modelElement = (StructuredActivityNode)view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_LocalPrecondition_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_LocalPostcondition_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ExceptionHandler_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getActivityPartition_3067ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInterruptibleActivityRegion_3068ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValueSpecificationAction_3076ContainedLinks(View view) {
		ValueSpecificationAction modelElement = (ValueSpecificationAction)view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_LocalPrecondition_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_LocalPostcondition_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ExceptionHandler_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOutputPin_3077ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDataStoreNode_3078ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getConditionalNode_3069ContainedLinks(View view) {
		ConditionalNode modelElement = (ConditionalNode)view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_LocalPrecondition_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_LocalPostcondition_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ExceptionHandler_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getExpansionRegion_3070ContainedLinks(View view) {
		ExpansionRegion modelElement = (ExpansionRegion)view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_LocalPrecondition_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_LocalPostcondition_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ExceptionHandler_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getExpansionNode_3074ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExpansionNode_3075ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getLoopNode_3071ContainedLinks(View view) {
		LoopNode modelElement = (LoopNode)view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_LocalPrecondition_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_LocalPostcondition_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ExceptionHandler_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSequenceNode_3073ContainedLinks(View view) {
		SequenceNode modelElement = (SequenceNode)view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_LocalPrecondition_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_LocalPostcondition_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ExceptionHandler_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInteractionConstraint_3030ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInteractionConstraint_3031ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIntervalConstraint_3032ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIntervalConstraint_3033ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDurationConstraint_3034ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDurationConstraint_3035ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTimeConstraint_3036ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTimeConstraint_3037ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getObjectFlow_4003ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getControlFlow_4004ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExceptionHandler_4005ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getActivity_2001IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getParameter_3001IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getConstraint_3002IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getConstraint_3003IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInitialNode_3004IncomingLinks(View view) {
		InitialNode modelElement = (InitialNode)view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getActivityFinalNode_3005IncomingLinks(View view) {
		ActivityFinalNode modelElement = (ActivityFinalNode)view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getFlowFinalNode_3006IncomingLinks(View view) {
		FlowFinalNode modelElement = (FlowFinalNode)view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueAction_3007IncomingLinks(View view) {
		OpaqueAction modelElement = (OpaqueAction)view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getValuePin_3015IncomingLinks(View view) {
		ValuePin modelElement = (ValuePin)view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ExceptionHandler_4005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getActionInputPin_3016IncomingLinks(View view) {
		ActionInputPin modelElement = (ActionInputPin)view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ExceptionHandler_4005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInputPin_3013IncomingLinks(View view) {
		InputPin modelElement = (InputPin)view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ExceptionHandler_4005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOutputPin_3014IncomingLinks(View view) {
		OutputPin modelElement = (OutputPin)view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ExceptionHandler_4005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCallBehaviorAction_3008IncomingLinks(View view) {
		CallBehaviorAction modelElement = (CallBehaviorAction)view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getValuePin_3017IncomingLinks(View view) {
		ValuePin modelElement = (ValuePin)view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ExceptionHandler_4005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getActionInputPin_3018IncomingLinks(View view) {
		ActionInputPin modelElement = (ActionInputPin)view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ExceptionHandler_4005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInputPin_3019IncomingLinks(View view) {
		InputPin modelElement = (InputPin)view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ExceptionHandler_4005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOutputPin_3020IncomingLinks(View view) {
		OutputPin modelElement = (OutputPin)view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ExceptionHandler_4005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCallOperationAction_3010IncomingLinks(View view) {
		CallOperationAction modelElement = (CallOperationAction)view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getActionInputPin_3021IncomingLinks(View view) {
		ActionInputPin modelElement = (ActionInputPin)view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ExceptionHandler_4005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getValuePin_3022IncomingLinks(View view) {
		ValuePin modelElement = (ValuePin)view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ExceptionHandler_4005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInputPin_3023IncomingLinks(View view) {
		InputPin modelElement = (InputPin)view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ExceptionHandler_4005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOutputPin_3024IncomingLinks(View view) {
		OutputPin modelElement = (OutputPin)view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ExceptionHandler_4005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getValuePin_3025IncomingLinks(View view) {
		ValuePin modelElement = (ValuePin)view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ExceptionHandler_4005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getActionInputPin_3026IncomingLinks(View view) {
		ActionInputPin modelElement = (ActionInputPin)view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ExceptionHandler_4005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInputPin_3027IncomingLinks(View view) {
		InputPin modelElement = (InputPin)view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ExceptionHandler_4005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getConstraint_3011IncomingLinks(View view) {
		Constraint modelElement = (Constraint)view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_Action_LocalPrecondition_4001(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Action_LocalPostcondition_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getConstraint_3012IncomingLinks(View view) {
		Constraint modelElement = (Constraint)view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_Action_LocalPrecondition_4001(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Action_LocalPostcondition_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDecisionNode_3038IncomingLinks(View view) {
		DecisionNode modelElement = (DecisionNode)view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getMergeNode_3039IncomingLinks(View view) {
		MergeNode modelElement = (MergeNode)view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getForkNode_3040IncomingLinks(View view) {
		ForkNode modelElement = (ForkNode)view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getJoinNode_3041IncomingLinks(View view) {
		JoinNode modelElement = (JoinNode)view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSendObjectAction_3042IncomingLinks(View view) {
		SendObjectAction modelElement = (SendObjectAction)view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getValuePin_3046IncomingLinks(View view) {
		ValuePin modelElement = (ValuePin)view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ExceptionHandler_4005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getActionInputPin_3047IncomingLinks(View view) {
		ActionInputPin modelElement = (ActionInputPin)view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ExceptionHandler_4005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInputPin_3048IncomingLinks(View view) {
		InputPin modelElement = (InputPin)view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ExceptionHandler_4005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getValuePin_3049IncomingLinks(View view) {
		ValuePin modelElement = (ValuePin)view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ExceptionHandler_4005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getActionInputPin_3050IncomingLinks(View view) {
		ActionInputPin modelElement = (ActionInputPin)view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ExceptionHandler_4005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInputPin_3051IncomingLinks(View view) {
		InputPin modelElement = (InputPin)view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ExceptionHandler_4005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSendSignalAction_3052IncomingLinks(View view) {
		SendSignalAction modelElement = (SendSignalAction)view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getActionInputPin_3053IncomingLinks(View view) {
		ActionInputPin modelElement = (ActionInputPin)view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ExceptionHandler_4005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getValuePin_3054IncomingLinks(View view) {
		ValuePin modelElement = (ValuePin)view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ExceptionHandler_4005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInputPin_3055IncomingLinks(View view) {
		InputPin modelElement = (InputPin)view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ExceptionHandler_4005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getValuePin_3060IncomingLinks(View view) {
		ValuePin modelElement = (ValuePin)view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ExceptionHandler_4005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getActionInputPin_3061IncomingLinks(View view) {
		ActionInputPin modelElement = (ActionInputPin)view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ExceptionHandler_4005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInputPin_3062IncomingLinks(View view) {
		InputPin modelElement = (InputPin)view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ExceptionHandler_4005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getActivityParameterNode_3059IncomingLinks(View view) {
		ActivityParameterNode modelElement = (ActivityParameterNode)view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ExceptionHandler_4005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAcceptEventAction_3063IncomingLinks(View view) {
		AcceptEventAction modelElement = (AcceptEventAction)view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOutputPin_3064IncomingLinks(View view) {
		OutputPin modelElement = (OutputPin)view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ExceptionHandler_4005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getStructuredActivityNode_3065IncomingLinks(View view) {
		StructuredActivityNode modelElement = (StructuredActivityNode)view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getActivityPartition_3067IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInterruptibleActivityRegion_3068IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValueSpecificationAction_3076IncomingLinks(View view) {
		ValueSpecificationAction modelElement = (ValueSpecificationAction)view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOutputPin_3077IncomingLinks(View view) {
		OutputPin modelElement = (OutputPin)view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ExceptionHandler_4005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDataStoreNode_3078IncomingLinks(View view) {
		DataStoreNode modelElement = (DataStoreNode)view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ExceptionHandler_4005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getConditionalNode_3069IncomingLinks(View view) {
		ConditionalNode modelElement = (ConditionalNode)view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getExpansionRegion_3070IncomingLinks(View view) {
		ExpansionRegion modelElement = (ExpansionRegion)view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getExpansionNode_3074IncomingLinks(View view) {
		ExpansionNode modelElement = (ExpansionNode)view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ExceptionHandler_4005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getExpansionNode_3075IncomingLinks(View view) {
		ExpansionNode modelElement = (ExpansionNode)view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ExceptionHandler_4005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getLoopNode_3071IncomingLinks(View view) {
		LoopNode modelElement = (LoopNode)view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSequenceNode_3073IncomingLinks(View view) {
		SequenceNode modelElement = (SequenceNode)view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInteractionConstraint_3030IncomingLinks(View view) {
		InteractionConstraint modelElement = (InteractionConstraint)view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_Action_LocalPrecondition_4001(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Action_LocalPostcondition_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInteractionConstraint_3031IncomingLinks(View view) {
		InteractionConstraint modelElement = (InteractionConstraint)view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_Action_LocalPrecondition_4001(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Action_LocalPostcondition_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIntervalConstraint_3032IncomingLinks(View view) {
		IntervalConstraint modelElement = (IntervalConstraint)view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_Action_LocalPrecondition_4001(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Action_LocalPostcondition_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIntervalConstraint_3033IncomingLinks(View view) {
		IntervalConstraint modelElement = (IntervalConstraint)view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_Action_LocalPrecondition_4001(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Action_LocalPostcondition_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDurationConstraint_3034IncomingLinks(View view) {
		DurationConstraint modelElement = (DurationConstraint)view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_Action_LocalPrecondition_4001(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Action_LocalPostcondition_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDurationConstraint_3035IncomingLinks(View view) {
		DurationConstraint modelElement = (DurationConstraint)view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_Action_LocalPrecondition_4001(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Action_LocalPostcondition_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTimeConstraint_3036IncomingLinks(View view) {
		TimeConstraint modelElement = (TimeConstraint)view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_Action_LocalPrecondition_4001(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Action_LocalPostcondition_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTimeConstraint_3037IncomingLinks(View view) {
		TimeConstraint modelElement = (TimeConstraint)view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_Action_LocalPrecondition_4001(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Action_LocalPostcondition_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getObjectFlow_4003IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getControlFlow_4004IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExceptionHandler_4005IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getActivity_2001OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getParameter_3001OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getConstraint_3002OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getConstraint_3003OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInitialNode_3004OutgoingLinks(View view) {
		InitialNode modelElement = (InitialNode)view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getActivityFinalNode_3005OutgoingLinks(View view) {
		ActivityFinalNode modelElement = (ActivityFinalNode)view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getFlowFinalNode_3006OutgoingLinks(View view) {
		FlowFinalNode modelElement = (FlowFinalNode)view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueAction_3007OutgoingLinks(View view) {
		OpaqueAction modelElement = (OpaqueAction)view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_LocalPrecondition_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_LocalPostcondition_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ExceptionHandler_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getValuePin_3015OutgoingLinks(View view) {
		ValuePin modelElement = (ValuePin)view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getActionInputPin_3016OutgoingLinks(View view) {
		ActionInputPin modelElement = (ActionInputPin)view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInputPin_3013OutgoingLinks(View view) {
		InputPin modelElement = (InputPin)view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOutputPin_3014OutgoingLinks(View view) {
		OutputPin modelElement = (OutputPin)view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCallBehaviorAction_3008OutgoingLinks(View view) {
		CallBehaviorAction modelElement = (CallBehaviorAction)view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_LocalPrecondition_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_LocalPostcondition_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ExceptionHandler_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getValuePin_3017OutgoingLinks(View view) {
		ValuePin modelElement = (ValuePin)view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getActionInputPin_3018OutgoingLinks(View view) {
		ActionInputPin modelElement = (ActionInputPin)view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInputPin_3019OutgoingLinks(View view) {
		InputPin modelElement = (InputPin)view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOutputPin_3020OutgoingLinks(View view) {
		OutputPin modelElement = (OutputPin)view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCallOperationAction_3010OutgoingLinks(View view) {
		CallOperationAction modelElement = (CallOperationAction)view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_LocalPrecondition_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_LocalPostcondition_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ExceptionHandler_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getActionInputPin_3021OutgoingLinks(View view) {
		ActionInputPin modelElement = (ActionInputPin)view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getValuePin_3022OutgoingLinks(View view) {
		ValuePin modelElement = (ValuePin)view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInputPin_3023OutgoingLinks(View view) {
		InputPin modelElement = (InputPin)view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOutputPin_3024OutgoingLinks(View view) {
		OutputPin modelElement = (OutputPin)view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getValuePin_3025OutgoingLinks(View view) {
		ValuePin modelElement = (ValuePin)view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getActionInputPin_3026OutgoingLinks(View view) {
		ActionInputPin modelElement = (ActionInputPin)view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInputPin_3027OutgoingLinks(View view) {
		InputPin modelElement = (InputPin)view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getConstraint_3011OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getConstraint_3012OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDecisionNode_3038OutgoingLinks(View view) {
		DecisionNode modelElement = (DecisionNode)view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getMergeNode_3039OutgoingLinks(View view) {
		MergeNode modelElement = (MergeNode)view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getForkNode_3040OutgoingLinks(View view) {
		ForkNode modelElement = (ForkNode)view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getJoinNode_3041OutgoingLinks(View view) {
		JoinNode modelElement = (JoinNode)view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSendObjectAction_3042OutgoingLinks(View view) {
		SendObjectAction modelElement = (SendObjectAction)view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_LocalPrecondition_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_LocalPostcondition_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ExceptionHandler_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getValuePin_3046OutgoingLinks(View view) {
		ValuePin modelElement = (ValuePin)view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getActionInputPin_3047OutgoingLinks(View view) {
		ActionInputPin modelElement = (ActionInputPin)view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInputPin_3048OutgoingLinks(View view) {
		InputPin modelElement = (InputPin)view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getValuePin_3049OutgoingLinks(View view) {
		ValuePin modelElement = (ValuePin)view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getActionInputPin_3050OutgoingLinks(View view) {
		ActionInputPin modelElement = (ActionInputPin)view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInputPin_3051OutgoingLinks(View view) {
		InputPin modelElement = (InputPin)view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSendSignalAction_3052OutgoingLinks(View view) {
		SendSignalAction modelElement = (SendSignalAction)view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_LocalPrecondition_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_LocalPostcondition_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ExceptionHandler_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getActionInputPin_3053OutgoingLinks(View view) {
		ActionInputPin modelElement = (ActionInputPin)view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getValuePin_3054OutgoingLinks(View view) {
		ValuePin modelElement = (ValuePin)view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInputPin_3055OutgoingLinks(View view) {
		InputPin modelElement = (InputPin)view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getValuePin_3060OutgoingLinks(View view) {
		ValuePin modelElement = (ValuePin)view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getActionInputPin_3061OutgoingLinks(View view) {
		ActionInputPin modelElement = (ActionInputPin)view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInputPin_3062OutgoingLinks(View view) {
		InputPin modelElement = (InputPin)view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getActivityParameterNode_3059OutgoingLinks(View view) {
		ActivityParameterNode modelElement = (ActivityParameterNode)view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAcceptEventAction_3063OutgoingLinks(View view) {
		AcceptEventAction modelElement = (AcceptEventAction)view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_LocalPrecondition_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_LocalPostcondition_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ExceptionHandler_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOutputPin_3064OutgoingLinks(View view) {
		OutputPin modelElement = (OutputPin)view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getStructuredActivityNode_3065OutgoingLinks(View view) {
		StructuredActivityNode modelElement = (StructuredActivityNode)view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_LocalPrecondition_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_LocalPostcondition_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ExceptionHandler_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getActivityPartition_3067OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInterruptibleActivityRegion_3068OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getValueSpecificationAction_3076OutgoingLinks(View view) {
		ValueSpecificationAction modelElement = (ValueSpecificationAction)view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_LocalPrecondition_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_LocalPostcondition_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ExceptionHandler_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOutputPin_3077OutgoingLinks(View view) {
		OutputPin modelElement = (OutputPin)view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDataStoreNode_3078OutgoingLinks(View view) {
		DataStoreNode modelElement = (DataStoreNode)view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getConditionalNode_3069OutgoingLinks(View view) {
		ConditionalNode modelElement = (ConditionalNode)view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_LocalPrecondition_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_LocalPostcondition_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ExceptionHandler_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getExpansionRegion_3070OutgoingLinks(View view) {
		ExpansionRegion modelElement = (ExpansionRegion)view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_LocalPrecondition_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_LocalPostcondition_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ExceptionHandler_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getExpansionNode_3074OutgoingLinks(View view) {
		ExpansionNode modelElement = (ExpansionNode)view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getExpansionNode_3075OutgoingLinks(View view) {
		ExpansionNode modelElement = (ExpansionNode)view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getLoopNode_3071OutgoingLinks(View view) {
		LoopNode modelElement = (LoopNode)view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_LocalPrecondition_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_LocalPostcondition_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ExceptionHandler_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSequenceNode_3073OutgoingLinks(View view) {
		SequenceNode modelElement = (SequenceNode)view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_LocalPrecondition_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_LocalPostcondition_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ExceptionHandler_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInteractionConstraint_3030OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInteractionConstraint_3031OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIntervalConstraint_3032OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIntervalConstraint_3033OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDurationConstraint_3034OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDurationConstraint_3035OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTimeConstraint_3036OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTimeConstraint_3037OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getObjectFlow_4003OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getControlFlow_4004OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExceptionHandler_4005OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_ObjectFlow_4003(Activity container) {
		Collection result = new LinkedList();
		for(Iterator links = container.getEdges().iterator(); links.hasNext();) {
			EObject linkObject = (EObject)links.next();
			if(false == linkObject instanceof ObjectFlow) {
				continue;
			}
			ObjectFlow link = (ObjectFlow)linkObject;
			if(ObjectFlowEditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}





			ActivityNode dst = link.getTarget();
			ActivityNode src = link.getSource();
			result.add(new UMLLinkDescriptor(src, dst, link, UMLElementTypes.ObjectFlow_4003, ObjectFlowEditPart.VISUAL_ID));


		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_ControlFlow_4004(Activity container) {
		Collection result = new LinkedList();
		for(Iterator links = container.getEdges().iterator(); links.hasNext();) {
			EObject linkObject = (EObject)links.next();
			if(false == linkObject instanceof ControlFlow) {
				continue;
			}
			ControlFlow link = (ControlFlow)linkObject;
			if(ControlFlowEditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}





			ActivityNode dst = link.getTarget();
			ActivityNode src = link.getSource();
			result.add(new UMLLinkDescriptor(src, dst, link, UMLElementTypes.ControlFlow_4004, ControlFlowEditPart.VISUAL_ID));


		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_ExceptionHandler_4005(ExecutableNode container) {
		Collection result = new LinkedList();
		for(Iterator links = container.getHandlers().iterator(); links.hasNext();) {
			EObject linkObject = (EObject)links.next();
			if(false == linkObject instanceof ExceptionHandler) {
				continue;
			}
			ExceptionHandler link = (ExceptionHandler)linkObject;
			if(ExceptionHandlerEditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}





			ObjectNode dst = link.getExceptionInput();
			ExecutableNode src = link.getProtectedNode();
			result.add(new UMLLinkDescriptor(src, dst, link, UMLElementTypes.ExceptionHandler_4005, ExceptionHandlerEditPart.VISUAL_ID));


		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Action_LocalPrecondition_4001(Constraint target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection)crossReferences.get(target);
		for(Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting)it.next();
			if(setting.getEStructuralFeature() == UMLPackage.eINSTANCE.getAction_LocalPrecondition()) {
				result.add(new UMLLinkDescriptor(setting.getEObject(), target, UMLElementTypes.ActionLocalPrecondition_4001, ActionLocalPreconditionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Action_LocalPostcondition_4002(Constraint target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection)crossReferences.get(target);
		for(Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting)it.next();
			if(setting.getEStructuralFeature() == UMLPackage.eINSTANCE.getAction_LocalPostcondition()) {
				result.add(new UMLLinkDescriptor(setting.getEObject(), target, UMLElementTypes.ActionLocalPostcondition_4002, ActionLocalPostconditionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_ObjectFlow_4003(ActivityNode target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection)crossReferences.get(target);
		for(Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting)it.next();
			if(setting.getEStructuralFeature() != UMLPackage.eINSTANCE.getActivityEdge_Target() || false == setting.getEObject() instanceof ObjectFlow) {
				continue;
			}
			ObjectFlow link = (ObjectFlow)setting.getEObject();
			if(ObjectFlowEditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ActivityNode src = link.getSource();
			result.add(new UMLLinkDescriptor(src, target, link, UMLElementTypes.ObjectFlow_4003, ObjectFlowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_ControlFlow_4004(ActivityNode target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection)crossReferences.get(target);
		for(Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting)it.next();
			if(setting.getEStructuralFeature() != UMLPackage.eINSTANCE.getActivityEdge_Target() || false == setting.getEObject() instanceof ControlFlow) {
				continue;
			}
			ControlFlow link = (ControlFlow)setting.getEObject();
			if(ControlFlowEditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ActivityNode src = link.getSource();
			result.add(new UMLLinkDescriptor(src, target, link, UMLElementTypes.ControlFlow_4004, ControlFlowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_ExceptionHandler_4005(ObjectNode target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection)crossReferences.get(target);
		for(Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting)it.next();
			if(setting.getEStructuralFeature() != UMLPackage.eINSTANCE.getExceptionHandler_ExceptionInput() || false == setting.getEObject() instanceof ExceptionHandler) {
				continue;
			}
			ExceptionHandler link = (ExceptionHandler)setting.getEObject();
			if(ExceptionHandlerEditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ExecutableNode src = link.getProtectedNode();
			result.add(new UMLLinkDescriptor(src, target, link, UMLElementTypes.ExceptionHandler_4005, ExceptionHandlerEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Action_LocalPrecondition_4001(Action source) {
		Collection result = new LinkedList();
		for(Iterator destinations = source.getLocalPreconditions().iterator(); destinations.hasNext();) {
			Constraint destination = (Constraint)destinations.next();
			result.add(new UMLLinkDescriptor(source, destination, UMLElementTypes.ActionLocalPrecondition_4001, ActionLocalPreconditionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Action_LocalPostcondition_4002(Action source) {
		Collection result = new LinkedList();
		for(Iterator destinations = source.getLocalPostconditions().iterator(); destinations.hasNext();) {
			Constraint destination = (Constraint)destinations.next();
			result.add(new UMLLinkDescriptor(source, destination, UMLElementTypes.ActionLocalPostcondition_4002, ActionLocalPostconditionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_ObjectFlow_4003(ActivityNode source) {
		Activity container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for(EObject element = source; element != null && container == null; element = element.eContainer()) {
			if(element instanceof Activity) {
				container = (Activity)element;
			}
		}
		if(container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for(Iterator links = container.getEdges().iterator(); links.hasNext();) {
			EObject linkObject = (EObject)links.next();
			if(false == linkObject instanceof ObjectFlow) {
				continue;
			}
			ObjectFlow link = (ObjectFlow)linkObject;
			if(ObjectFlowEditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}





			ActivityNode dst = link.getTarget();
			ActivityNode src = link.getSource();
			if(src != source) {
				continue;
			}
			result.add(new UMLLinkDescriptor(src, dst, link, UMLElementTypes.ObjectFlow_4003, ObjectFlowEditPart.VISUAL_ID));


		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_ControlFlow_4004(ActivityNode source) {
		Activity container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for(EObject element = source; element != null && container == null; element = element.eContainer()) {
			if(element instanceof Activity) {
				container = (Activity)element;
			}
		}
		if(container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for(Iterator links = container.getEdges().iterator(); links.hasNext();) {
			EObject linkObject = (EObject)links.next();
			if(false == linkObject instanceof ControlFlow) {
				continue;
			}
			ControlFlow link = (ControlFlow)linkObject;
			if(ControlFlowEditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}





			ActivityNode dst = link.getTarget();
			ActivityNode src = link.getSource();
			if(src != source) {
				continue;
			}
			result.add(new UMLLinkDescriptor(src, dst, link, UMLElementTypes.ControlFlow_4004, ControlFlowEditPart.VISUAL_ID));


		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_ExceptionHandler_4005(ExecutableNode source) {
		ExecutableNode container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for(EObject element = source; element != null && container == null; element = element.eContainer()) {
			if(element instanceof ExecutableNode) {
				container = (ExecutableNode)element;
			}
		}
		if(container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for(Iterator links = container.getHandlers().iterator(); links.hasNext();) {
			EObject linkObject = (EObject)links.next();
			if(false == linkObject instanceof ExceptionHandler) {
				continue;
			}
			ExceptionHandler link = (ExceptionHandler)linkObject;
			if(ExceptionHandlerEditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}





			ObjectNode dst = link.getExceptionInput();
			ExecutableNode src = link.getProtectedNode();
			if(src != source) {
				continue;
			}
			result.add(new UMLLinkDescriptor(src, dst, link, UMLElementTypes.ExceptionHandler_4005, ExceptionHandlerEditPart.VISUAL_ID));


		}
		return result;
	}

}
