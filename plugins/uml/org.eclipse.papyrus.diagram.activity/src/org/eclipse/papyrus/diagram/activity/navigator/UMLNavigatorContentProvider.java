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
package org.eclipse.papyrus.diagram.activity.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.papyrus.diagram.activity.edit.parts.ActionInputPinInCallBeActEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ActionInputPinInCallOpActAsTargetEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ActionInputPinInCallOpActEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ActionInputPinInOpaqueActEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ActionLocalPostconditionEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ActionLocalPreconditionEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ActivityActivityContentCompartmentEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ActivityActivityParametersCompartmentEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ActivityActivityPostConditionsCompartmentEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ActivityActivityPreConditionsCompartmentEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ActivityAsSelectionEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ActivityAsTransformationEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ActivityDiagramEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ActivityEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ActivityFinalNodeEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.CallBehaviorActionEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.CallOperationActionEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ConstraintAsLocalPostcondEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ConstraintAsLocalPrecondEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ConstraintInActivityAsPostcondEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ConstraintInActivityAsPrecondEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ControlFlowEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.FlowFinalNodeEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.InitialNodeEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.InputPinInCallBeActEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.InputPinInCallOpActAsTargetEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.InputPinInCallOpActEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.InputPinInOpaqueActEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ObjectFlowEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ObjectFlowSelectionEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ObjectFlowTransformationEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.OpaqueActionEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.OutputPinInCallBeActEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.OutputPinInCallOpActEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.OutputPinInOpaqueActEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ParameterEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ValuePinInCallBeActEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ValuePinInCallOpActAsTargetEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ValuePinInCallOpActEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ValuePinInOpaqueActEditPart;
import org.eclipse.papyrus.diagram.activity.part.Messages;
import org.eclipse.papyrus.diagram.activity.part.UMLVisualIDRegistry;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

/**
 * @generated
 */
public class UMLNavigatorContentProvider implements ICommonContentProvider {

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	private Viewer myViewer;

	/**
	 * @generated
	 */
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	 * @generated
	 */
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	 * @generated
	 */
	private Runnable myViewerRefreshRunnable;

	/**
	 * @generated
	 */
	public UMLNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain)editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {

			public Object get(Object key) {
				if(!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {

			public void run() {
				if(myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain, new WorkspaceSynchronizer.Delegate() {

			public void dispose() {
			}

			public boolean handleResourceChanged(final Resource resource) {
				for(Iterator it = myEditingDomain.getResourceSet().getResources().iterator(); it.hasNext();) {
					Resource nextResource = (Resource)it.next();
					nextResource.unload();
				}
				if(myViewer != null) {
					myViewer.getControl().getDisplay().asyncExec(myViewerRefreshRunnable);
				}
				return true;
			}

			public boolean handleResourceDeleted(Resource resource) {
				for(Iterator it = myEditingDomain.getResourceSet().getResources().iterator(); it.hasNext();) {
					Resource nextResource = (Resource)it.next();
					nextResource.unload();
				}
				if(myViewer != null) {
					myViewer.getControl().getDisplay().asyncExec(myViewerRefreshRunnable);
				}
				return true;
			}

			public boolean handleResourceMoved(Resource resource, final URI newURI) {
				for(Iterator it = myEditingDomain.getResourceSet().getResources().iterator(); it.hasNext();) {
					Resource nextResource = (Resource)it.next();
					nextResource.unload();
				}
				if(myViewer != null) {
					myViewer.getControl().getDisplay().asyncExec(myViewerRefreshRunnable);
				}
				return true;
			}
		});
	}

	/**
	 * 
	 *Papyrus Template
	 *this method is a modification of gmf code in order to avoid getViewChidreen() method becoming greater than 64kb.
	 * 
	 * @generated
	 **/
	private Object[] getViewChildrenForActivityDiagramEditPart(View view, Object parentElement) {
		Collection result = new ArrayList();
		UMLNavigatorGroup links = new UMLNavigatorGroup(Messages.NavigatorGroupName_Package_1000_links, "icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ActivityEditPart.VISUAL_ID));
		result.addAll(createNavigatorItems(connectedViews, parentElement, false));
		connectedViews = getDiagramLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ActionLocalPreconditionEditPart.VISUAL_ID));
		links.addChildren(createNavigatorItems(connectedViews, links, false));
		connectedViews = getDiagramLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ActionLocalPostconditionEditPart.VISUAL_ID));
		links.addChildren(createNavigatorItems(connectedViews, links, false));
		connectedViews = getDiagramLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowSelectionEditPart.VISUAL_ID));
		links.addChildren(createNavigatorItems(connectedViews, links, false));
		connectedViews = getDiagramLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowTransformationEditPart.VISUAL_ID));
		links.addChildren(createNavigatorItems(connectedViews, links, false));
		connectedViews = getDiagramLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		links.addChildren(createNavigatorItems(connectedViews, links, false));
		connectedViews = getDiagramLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		links.addChildren(createNavigatorItems(connectedViews, links, false));
		if(!links.isEmpty()) {
			result.add(links);
		}
		return result.toArray();
	}

	/**
	 * 
	 *Papyrus Template
	 *this method is a modification of gmf code in order to avoid getViewChidreen() method becoming greater than 64kb.
	 * 
	 * @generated
	 **/
	private Object[] getViewChildrenForActivityEditPart(View view, Object parentElement) {
		Collection result = new ArrayList();
		UMLNavigatorGroup incominglinks = new UMLNavigatorGroup(Messages.NavigatorGroupName_Activity_2001_incominglinks, "icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ActivityActivityParametersCompartmentEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(ParameterEditPart.VISUAL_ID));
		result.addAll(createNavigatorItems(connectedViews, parentElement, false));
		connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ActivityActivityPreConditionsCompartmentEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(ConstraintInActivityAsPrecondEditPart.VISUAL_ID));
		result.addAll(createNavigatorItems(connectedViews, parentElement, false));
		connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ActivityActivityPostConditionsCompartmentEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(ConstraintInActivityAsPostcondEditPart.VISUAL_ID));
		result.addAll(createNavigatorItems(connectedViews, parentElement, false));
		connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ActivityActivityContentCompartmentEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(InitialNodeEditPart.VISUAL_ID));
		result.addAll(createNavigatorItems(connectedViews, parentElement, false));
		connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ActivityActivityContentCompartmentEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(ActivityFinalNodeEditPart.VISUAL_ID));
		result.addAll(createNavigatorItems(connectedViews, parentElement, false));
		connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ActivityActivityContentCompartmentEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(FlowFinalNodeEditPart.VISUAL_ID));
		result.addAll(createNavigatorItems(connectedViews, parentElement, false));
		connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ActivityActivityContentCompartmentEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(OpaqueActionEditPart.VISUAL_ID));
		result.addAll(createNavigatorItems(connectedViews, parentElement, false));
		connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ActivityActivityContentCompartmentEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(CallBehaviorActionEditPart.VISUAL_ID));
		result.addAll(createNavigatorItems(connectedViews, parentElement, false));
		connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ActivityActivityContentCompartmentEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(CallOperationActionEditPart.VISUAL_ID));
		result.addAll(createNavigatorItems(connectedViews, parentElement, false));
		connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ActivityActivityContentCompartmentEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(ConstraintAsLocalPrecondEditPart.VISUAL_ID));
		result.addAll(createNavigatorItems(connectedViews, parentElement, false));
		connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ActivityActivityContentCompartmentEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(ConstraintAsLocalPostcondEditPart.VISUAL_ID));
		result.addAll(createNavigatorItems(connectedViews, parentElement, false));
		connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ActivityActivityContentCompartmentEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(ActivityAsSelectionEditPart.VISUAL_ID));
		result.addAll(createNavigatorItems(connectedViews, parentElement, false));
		connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ActivityActivityContentCompartmentEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(ActivityAsTransformationEditPart.VISUAL_ID));
		result.addAll(createNavigatorItems(connectedViews, parentElement, false));
		connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowSelectionEditPart.VISUAL_ID));
		incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
		connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowTransformationEditPart.VISUAL_ID));
		incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
		if(!incominglinks.isEmpty()) {
			result.add(incominglinks);
		}
		return result.toArray();
	}

	/**
	 * 
	 *Papyrus Template
	 *this method is a modification of gmf code in order to avoid getViewChidreen() method becoming greater than 64kb.
	 * 
	 * @generated
	 **/
	private Object[] getViewChildrenForConstraintInActivityAsPrecondEditPart(View view, Object parentElement) {
		Collection result = new ArrayList();
		UMLNavigatorGroup incominglinks = new UMLNavigatorGroup(Messages.NavigatorGroupName_Constraint_3002_incominglinks, "icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ActionLocalPreconditionEditPart.VISUAL_ID));
		incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
		connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ActionLocalPostconditionEditPart.VISUAL_ID));
		incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
		if(!incominglinks.isEmpty()) {
			result.add(incominglinks);
		}
		return result.toArray();
	}

	/**
	 * 
	 *Papyrus Template
	 *this method is a modification of gmf code in order to avoid getViewChidreen() method becoming greater than 64kb.
	 * 
	 * @generated
	 **/
	private Object[] getViewChildrenForConstraintInActivityAsPostcondEditPart(View view, Object parentElement) {
		Collection result = new ArrayList();
		UMLNavigatorGroup incominglinks = new UMLNavigatorGroup(Messages.NavigatorGroupName_Constraint_3003_incominglinks, "icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ActionLocalPreconditionEditPart.VISUAL_ID));
		incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
		connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ActionLocalPostconditionEditPart.VISUAL_ID));
		incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
		if(!incominglinks.isEmpty()) {
			result.add(incominglinks);
		}
		return result.toArray();
	}

	/**
	 * 
	 *Papyrus Template
	 *this method is a modification of gmf code in order to avoid getViewChidreen() method becoming greater than 64kb.
	 * 
	 * @generated
	 **/
	private Object[] getViewChildrenForInitialNodeEditPart(View view, Object parentElement) {
		Collection result = new ArrayList();
		UMLNavigatorGroup incominglinks = new UMLNavigatorGroup(Messages.NavigatorGroupName_InitialNode_3004_incominglinks, "icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
		UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup(Messages.NavigatorGroupName_InitialNode_3004_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
		connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
		connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
		connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
		if(!incominglinks.isEmpty()) {
			result.add(incominglinks);
		}
		if(!outgoinglinks.isEmpty()) {
			result.add(outgoinglinks);
		}
		return result.toArray();
	}

	/**
	 * 
	 *Papyrus Template
	 *this method is a modification of gmf code in order to avoid getViewChidreen() method becoming greater than 64kb.
	 * 
	 * @generated
	 **/
	private Object[] getViewChildrenForActivityFinalNodeEditPart(View view, Object parentElement) {
		Collection result = new ArrayList();
		UMLNavigatorGroup incominglinks = new UMLNavigatorGroup(Messages.NavigatorGroupName_ActivityFinalNode_3005_incominglinks, "icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
		UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup(Messages.NavigatorGroupName_ActivityFinalNode_3005_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
		connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
		connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
		connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
		if(!incominglinks.isEmpty()) {
			result.add(incominglinks);
		}
		if(!outgoinglinks.isEmpty()) {
			result.add(outgoinglinks);
		}
		return result.toArray();
	}

	/**
	 * 
	 *Papyrus Template
	 *this method is a modification of gmf code in order to avoid getViewChidreen() method becoming greater than 64kb.
	 * 
	 * @generated
	 **/
	private Object[] getViewChildrenForFlowFinalNodeEditPart(View view, Object parentElement) {
		Collection result = new ArrayList();
		UMLNavigatorGroup incominglinks = new UMLNavigatorGroup(Messages.NavigatorGroupName_FlowFinalNode_3006_incominglinks, "icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
		UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup(Messages.NavigatorGroupName_FlowFinalNode_3006_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
		connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
		connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
		connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
		if(!incominglinks.isEmpty()) {
			result.add(incominglinks);
		}
		if(!outgoinglinks.isEmpty()) {
			result.add(outgoinglinks);
		}
		return result.toArray();
	}

	/**
	 * 
	 *Papyrus Template
	 *this method is a modification of gmf code in order to avoid getViewChidreen() method becoming greater than 64kb.
	 * 
	 * @generated
	 **/
	private Object[] getViewChildrenForOpaqueActionEditPart(View view, Object parentElement) {
		Collection result = new ArrayList();
		UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup(Messages.NavigatorGroupName_OpaqueAction_3007_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
		UMLNavigatorGroup incominglinks = new UMLNavigatorGroup(Messages.NavigatorGroupName_OpaqueAction_3007_incominglinks, "icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ValuePinInOpaqueActEditPart.VISUAL_ID));
		result.addAll(createNavigatorItems(connectedViews, parentElement, false));
		connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ActionInputPinInOpaqueActEditPart.VISUAL_ID));
		result.addAll(createNavigatorItems(connectedViews, parentElement, false));
		connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(InputPinInOpaqueActEditPart.VISUAL_ID));
		result.addAll(createNavigatorItems(connectedViews, parentElement, false));
		connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(OutputPinInOpaqueActEditPart.VISUAL_ID));
		result.addAll(createNavigatorItems(connectedViews, parentElement, false));
		connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ActionLocalPreconditionEditPart.VISUAL_ID));
		outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
		connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ActionLocalPostconditionEditPart.VISUAL_ID));
		outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
		connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
		connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
		connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
		connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
		if(!outgoinglinks.isEmpty()) {
			result.add(outgoinglinks);
		}
		if(!incominglinks.isEmpty()) {
			result.add(incominglinks);
		}
		return result.toArray();
	}

	/**
	 * 
	 *Papyrus Template
	 *this method is a modification of gmf code in order to avoid getViewChidreen() method becoming greater than 64kb.
	 * 
	 * @generated
	 **/
	private Object[] getViewChildrenForValuePinInOpaqueActEditPart(View view, Object parentElement) {
		Collection result = new ArrayList();
		UMLNavigatorGroup incominglinks = new UMLNavigatorGroup(Messages.NavigatorGroupName_ValuePin_3015_incominglinks, "icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
		UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup(Messages.NavigatorGroupName_ValuePin_3015_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
		connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
		connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
		connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
		if(!incominglinks.isEmpty()) {
			result.add(incominglinks);
		}
		if(!outgoinglinks.isEmpty()) {
			result.add(outgoinglinks);
		}
		return result.toArray();
	}

	/**
	 * 
	 *Papyrus Template
	 *this method is a modification of gmf code in order to avoid getViewChidreen() method becoming greater than 64kb.
	 * 
	 * @generated
	 **/
	private Object[] getViewChildrenForActionInputPinInOpaqueActEditPart(View view, Object parentElement) {
		Collection result = new ArrayList();
		UMLNavigatorGroup incominglinks = new UMLNavigatorGroup(Messages.NavigatorGroupName_ActionInputPin_3016_incominglinks, "icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
		UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup(Messages.NavigatorGroupName_ActionInputPin_3016_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
		connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
		connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
		connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
		if(!incominglinks.isEmpty()) {
			result.add(incominglinks);
		}
		if(!outgoinglinks.isEmpty()) {
			result.add(outgoinglinks);
		}
		return result.toArray();
	}

	/**
	 * 
	 *Papyrus Template
	 *this method is a modification of gmf code in order to avoid getViewChidreen() method becoming greater than 64kb.
	 * 
	 * @generated
	 **/
	private Object[] getViewChildrenForInputPinInOpaqueActEditPart(View view, Object parentElement) {
		Collection result = new ArrayList();
		UMLNavigatorGroup incominglinks = new UMLNavigatorGroup(Messages.NavigatorGroupName_InputPin_3013_incominglinks, "icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
		UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup(Messages.NavigatorGroupName_InputPin_3013_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
		connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
		connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
		connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
		if(!incominglinks.isEmpty()) {
			result.add(incominglinks);
		}
		if(!outgoinglinks.isEmpty()) {
			result.add(outgoinglinks);
		}
		return result.toArray();
	}

	/**
	 * 
	 *Papyrus Template
	 *this method is a modification of gmf code in order to avoid getViewChidreen() method becoming greater than 64kb.
	 * 
	 * @generated
	 **/
	private Object[] getViewChildrenForOutputPinInOpaqueActEditPart(View view, Object parentElement) {
		Collection result = new ArrayList();
		UMLNavigatorGroup incominglinks = new UMLNavigatorGroup(Messages.NavigatorGroupName_OutputPin_3014_incominglinks, "icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
		UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup(Messages.NavigatorGroupName_OutputPin_3014_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
		connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
		connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
		connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
		if(!incominglinks.isEmpty()) {
			result.add(incominglinks);
		}
		if(!outgoinglinks.isEmpty()) {
			result.add(outgoinglinks);
		}
		return result.toArray();
	}

	/**
	 * 
	 *Papyrus Template
	 *this method is a modification of gmf code in order to avoid getViewChidreen() method becoming greater than 64kb.
	 * 
	 * @generated
	 **/
	private Object[] getViewChildrenForCallBehaviorActionEditPart(View view, Object parentElement) {
		Collection result = new ArrayList();
		UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup(Messages.NavigatorGroupName_CallBehaviorAction_3008_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
		UMLNavigatorGroup incominglinks = new UMLNavigatorGroup(Messages.NavigatorGroupName_CallBehaviorAction_3008_incominglinks, "icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ValuePinInCallBeActEditPart.VISUAL_ID));
		result.addAll(createNavigatorItems(connectedViews, parentElement, false));
		connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ActionInputPinInCallBeActEditPart.VISUAL_ID));
		result.addAll(createNavigatorItems(connectedViews, parentElement, false));
		connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(InputPinInCallBeActEditPart.VISUAL_ID));
		result.addAll(createNavigatorItems(connectedViews, parentElement, false));
		connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(OutputPinInCallBeActEditPart.VISUAL_ID));
		result.addAll(createNavigatorItems(connectedViews, parentElement, false));
		connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ActionLocalPreconditionEditPart.VISUAL_ID));
		outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
		connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ActionLocalPostconditionEditPart.VISUAL_ID));
		outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
		connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
		connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
		connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
		connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
		if(!outgoinglinks.isEmpty()) {
			result.add(outgoinglinks);
		}
		if(!incominglinks.isEmpty()) {
			result.add(incominglinks);
		}
		return result.toArray();
	}

	/**
	 * 
	 *Papyrus Template
	 *this method is a modification of gmf code in order to avoid getViewChidreen() method becoming greater than 64kb.
	 * 
	 * @generated
	 **/
	private Object[] getViewChildrenForValuePinInCallBeActEditPart(View view, Object parentElement) {
		Collection result = new ArrayList();
		UMLNavigatorGroup incominglinks = new UMLNavigatorGroup(Messages.NavigatorGroupName_ValuePin_3017_incominglinks, "icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
		UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup(Messages.NavigatorGroupName_ValuePin_3017_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
		connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
		connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
		connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
		if(!incominglinks.isEmpty()) {
			result.add(incominglinks);
		}
		if(!outgoinglinks.isEmpty()) {
			result.add(outgoinglinks);
		}
		return result.toArray();
	}

	/**
	 * 
	 *Papyrus Template
	 *this method is a modification of gmf code in order to avoid getViewChidreen() method becoming greater than 64kb.
	 * 
	 * @generated
	 **/
	private Object[] getViewChildrenForActionInputPinInCallBeActEditPart(View view, Object parentElement) {
		Collection result = new ArrayList();
		UMLNavigatorGroup incominglinks = new UMLNavigatorGroup(Messages.NavigatorGroupName_ActionInputPin_3018_incominglinks, "icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
		UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup(Messages.NavigatorGroupName_ActionInputPin_3018_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
		connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
		connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
		connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
		if(!incominglinks.isEmpty()) {
			result.add(incominglinks);
		}
		if(!outgoinglinks.isEmpty()) {
			result.add(outgoinglinks);
		}
		return result.toArray();
	}

	/**
	 * 
	 *Papyrus Template
	 *this method is a modification of gmf code in order to avoid getViewChidreen() method becoming greater than 64kb.
	 * 
	 * @generated
	 **/
	private Object[] getViewChildrenForInputPinInCallBeActEditPart(View view, Object parentElement) {
		Collection result = new ArrayList();
		UMLNavigatorGroup incominglinks = new UMLNavigatorGroup(Messages.NavigatorGroupName_InputPin_3019_incominglinks, "icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
		UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup(Messages.NavigatorGroupName_InputPin_3019_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
		connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
		connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
		connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
		if(!incominglinks.isEmpty()) {
			result.add(incominglinks);
		}
		if(!outgoinglinks.isEmpty()) {
			result.add(outgoinglinks);
		}
		return result.toArray();
	}

	/**
	 * 
	 *Papyrus Template
	 *this method is a modification of gmf code in order to avoid getViewChidreen() method becoming greater than 64kb.
	 * 
	 * @generated
	 **/
	private Object[] getViewChildrenForOutputPinInCallBeActEditPart(View view, Object parentElement) {
		Collection result = new ArrayList();
		UMLNavigatorGroup incominglinks = new UMLNavigatorGroup(Messages.NavigatorGroupName_OutputPin_3020_incominglinks, "icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
		UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup(Messages.NavigatorGroupName_OutputPin_3020_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
		connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
		connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
		connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
		if(!incominglinks.isEmpty()) {
			result.add(incominglinks);
		}
		if(!outgoinglinks.isEmpty()) {
			result.add(outgoinglinks);
		}
		return result.toArray();
	}

	/**
	 * 
	 *Papyrus Template
	 *this method is a modification of gmf code in order to avoid getViewChidreen() method becoming greater than 64kb.
	 * 
	 * @generated
	 **/
	private Object[] getViewChildrenForCallOperationActionEditPart(View view, Object parentElement) {
		Collection result = new ArrayList();
		UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup(Messages.NavigatorGroupName_CallOperationAction_3010_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
		UMLNavigatorGroup incominglinks = new UMLNavigatorGroup(Messages.NavigatorGroupName_CallOperationAction_3010_incominglinks, "icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ActionInputPinInCallOpActEditPart.VISUAL_ID));
		result.addAll(createNavigatorItems(connectedViews, parentElement, false));
		connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ValuePinInCallOpActEditPart.VISUAL_ID));
		result.addAll(createNavigatorItems(connectedViews, parentElement, false));
		connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(InputPinInCallOpActEditPart.VISUAL_ID));
		result.addAll(createNavigatorItems(connectedViews, parentElement, false));
		connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(OutputPinInCallOpActEditPart.VISUAL_ID));
		result.addAll(createNavigatorItems(connectedViews, parentElement, false));
		connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ValuePinInCallOpActAsTargetEditPart.VISUAL_ID));
		result.addAll(createNavigatorItems(connectedViews, parentElement, false));
		connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ActionInputPinInCallOpActAsTargetEditPart.VISUAL_ID));
		result.addAll(createNavigatorItems(connectedViews, parentElement, false));
		connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(InputPinInCallOpActAsTargetEditPart.VISUAL_ID));
		result.addAll(createNavigatorItems(connectedViews, parentElement, false));
		connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ActionLocalPreconditionEditPart.VISUAL_ID));
		outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
		connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ActionLocalPostconditionEditPart.VISUAL_ID));
		outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
		connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
		connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
		connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
		connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
		if(!outgoinglinks.isEmpty()) {
			result.add(outgoinglinks);
		}
		if(!incominglinks.isEmpty()) {
			result.add(incominglinks);
		}
		return result.toArray();
	}

	/**
	 * 
	 *Papyrus Template
	 *this method is a modification of gmf code in order to avoid getViewChidreen() method becoming greater than 64kb.
	 * 
	 * @generated
	 **/
	private Object[] getViewChildrenForActionInputPinInCallOpActEditPart(View view, Object parentElement) {
		Collection result = new ArrayList();
		UMLNavigatorGroup incominglinks = new UMLNavigatorGroup(Messages.NavigatorGroupName_ActionInputPin_3021_incominglinks, "icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
		UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup(Messages.NavigatorGroupName_ActionInputPin_3021_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
		connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
		connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
		connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
		if(!incominglinks.isEmpty()) {
			result.add(incominglinks);
		}
		if(!outgoinglinks.isEmpty()) {
			result.add(outgoinglinks);
		}
		return result.toArray();
	}

	/**
	 * 
	 *Papyrus Template
	 *this method is a modification of gmf code in order to avoid getViewChidreen() method becoming greater than 64kb.
	 * 
	 * @generated
	 **/
	private Object[] getViewChildrenForValuePinInCallOpActEditPart(View view, Object parentElement) {
		Collection result = new ArrayList();
		UMLNavigatorGroup incominglinks = new UMLNavigatorGroup(Messages.NavigatorGroupName_ValuePin_3022_incominglinks, "icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
		UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup(Messages.NavigatorGroupName_ValuePin_3022_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
		connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
		connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
		connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
		if(!incominglinks.isEmpty()) {
			result.add(incominglinks);
		}
		if(!outgoinglinks.isEmpty()) {
			result.add(outgoinglinks);
		}
		return result.toArray();
	}

	/**
	 * 
	 *Papyrus Template
	 *this method is a modification of gmf code in order to avoid getViewChidreen() method becoming greater than 64kb.
	 * 
	 * @generated
	 **/
	private Object[] getViewChildrenForInputPinInCallOpActEditPart(View view, Object parentElement) {
		Collection result = new ArrayList();
		UMLNavigatorGroup incominglinks = new UMLNavigatorGroup(Messages.NavigatorGroupName_InputPin_3023_incominglinks, "icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
		UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup(Messages.NavigatorGroupName_InputPin_3023_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
		connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
		connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
		connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
		if(!incominglinks.isEmpty()) {
			result.add(incominglinks);
		}
		if(!outgoinglinks.isEmpty()) {
			result.add(outgoinglinks);
		}
		return result.toArray();
	}

	/**
	 * 
	 *Papyrus Template
	 *this method is a modification of gmf code in order to avoid getViewChidreen() method becoming greater than 64kb.
	 * 
	 * @generated
	 **/
	private Object[] getViewChildrenForOutputPinInCallOpActEditPart(View view, Object parentElement) {
		Collection result = new ArrayList();
		UMLNavigatorGroup incominglinks = new UMLNavigatorGroup(Messages.NavigatorGroupName_OutputPin_3024_incominglinks, "icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
		UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup(Messages.NavigatorGroupName_OutputPin_3024_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
		connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
		connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
		connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
		if(!incominglinks.isEmpty()) {
			result.add(incominglinks);
		}
		if(!outgoinglinks.isEmpty()) {
			result.add(outgoinglinks);
		}
		return result.toArray();
	}

	/**
	 * 
	 *Papyrus Template
	 *this method is a modification of gmf code in order to avoid getViewChidreen() method becoming greater than 64kb.
	 * 
	 * @generated
	 **/
	private Object[] getViewChildrenForValuePinInCallOpActAsTargetEditPart(View view, Object parentElement) {
		Collection result = new ArrayList();
		UMLNavigatorGroup incominglinks = new UMLNavigatorGroup(Messages.NavigatorGroupName_ValuePin_3025_incominglinks, "icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
		UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup(Messages.NavigatorGroupName_ValuePin_3025_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
		connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
		connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
		connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
		if(!incominglinks.isEmpty()) {
			result.add(incominglinks);
		}
		if(!outgoinglinks.isEmpty()) {
			result.add(outgoinglinks);
		}
		return result.toArray();
	}

	/**
	 * 
	 *Papyrus Template
	 *this method is a modification of gmf code in order to avoid getViewChidreen() method becoming greater than 64kb.
	 * 
	 * @generated
	 **/
	private Object[] getViewChildrenForActionInputPinInCallOpActAsTargetEditPart(View view, Object parentElement) {
		Collection result = new ArrayList();
		UMLNavigatorGroup incominglinks = new UMLNavigatorGroup(Messages.NavigatorGroupName_ActionInputPin_3026_incominglinks, "icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
		UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup(Messages.NavigatorGroupName_ActionInputPin_3026_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
		connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
		connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
		connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
		if(!incominglinks.isEmpty()) {
			result.add(incominglinks);
		}
		if(!outgoinglinks.isEmpty()) {
			result.add(outgoinglinks);
		}
		return result.toArray();
	}

	/**
	 * 
	 *Papyrus Template
	 *this method is a modification of gmf code in order to avoid getViewChidreen() method becoming greater than 64kb.
	 * 
	 * @generated
	 **/
	private Object[] getViewChildrenForInputPinInCallOpActAsTargetEditPart(View view, Object parentElement) {
		Collection result = new ArrayList();
		UMLNavigatorGroup incominglinks = new UMLNavigatorGroup(Messages.NavigatorGroupName_InputPin_3027_incominglinks, "icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
		UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup(Messages.NavigatorGroupName_InputPin_3027_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
		connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
		connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
		connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
		if(!incominglinks.isEmpty()) {
			result.add(incominglinks);
		}
		if(!outgoinglinks.isEmpty()) {
			result.add(outgoinglinks);
		}
		return result.toArray();
	}

	/**
	 * 
	 *Papyrus Template
	 *this method is a modification of gmf code in order to avoid getViewChidreen() method becoming greater than 64kb.
	 * 
	 * @generated
	 **/
	private Object[] getViewChildrenForConstraintAsLocalPrecondEditPart(View view, Object parentElement) {
		Collection result = new ArrayList();
		UMLNavigatorGroup incominglinks = new UMLNavigatorGroup(Messages.NavigatorGroupName_Constraint_3011_incominglinks, "icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ActionLocalPreconditionEditPart.VISUAL_ID));
		incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
		connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ActionLocalPostconditionEditPart.VISUAL_ID));
		incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
		if(!incominglinks.isEmpty()) {
			result.add(incominglinks);
		}
		return result.toArray();
	}

	/**
	 * 
	 *Papyrus Template
	 *this method is a modification of gmf code in order to avoid getViewChidreen() method becoming greater than 64kb.
	 * 
	 * @generated
	 **/
	private Object[] getViewChildrenForConstraintAsLocalPostcondEditPart(View view, Object parentElement) {
		Collection result = new ArrayList();
		UMLNavigatorGroup incominglinks = new UMLNavigatorGroup(Messages.NavigatorGroupName_Constraint_3012_incominglinks, "icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ActionLocalPreconditionEditPart.VISUAL_ID));
		incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
		connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ActionLocalPostconditionEditPart.VISUAL_ID));
		incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
		if(!incominglinks.isEmpty()) {
			result.add(incominglinks);
		}
		return result.toArray();
	}

	/**
	 * 
	 *Papyrus Template
	 *this method is a modification of gmf code in order to avoid getViewChidreen() method becoming greater than 64kb.
	 * 
	 * @generated
	 **/
	private Object[] getViewChildrenForActivityAsSelectionEditPart(View view, Object parentElement) {
		Collection result = new ArrayList();
		UMLNavigatorGroup incominglinks = new UMLNavigatorGroup(Messages.NavigatorGroupName_Activity_3028_incominglinks, "icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowSelectionEditPart.VISUAL_ID));
		incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
		connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowTransformationEditPart.VISUAL_ID));
		incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
		if(!incominglinks.isEmpty()) {
			result.add(incominglinks);
		}
		return result.toArray();
	}

	/**
	 * 
	 *Papyrus Template
	 *this method is a modification of gmf code in order to avoid getViewChidreen() method becoming greater than 64kb.
	 * 
	 * @generated
	 **/
	private Object[] getViewChildrenForActivityAsTransformationEditPart(View view, Object parentElement) {
		Collection result = new ArrayList();
		UMLNavigatorGroup incominglinks = new UMLNavigatorGroup(Messages.NavigatorGroupName_Activity_3029_incominglinks, "icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowSelectionEditPart.VISUAL_ID));
		incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
		connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowTransformationEditPart.VISUAL_ID));
		incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
		if(!incominglinks.isEmpty()) {
			result.add(incominglinks);
		}
		return result.toArray();
	}

	/**
	 * 
	 *Papyrus Template
	 *this method is a modification of gmf code in order to avoid getViewChidreen() method becoming greater than 64kb.
	 * 
	 * @generated
	 **/
	private Object[] getViewChildrenForActionLocalPreconditionEditPart(View view, Object parentElement) {
		Collection result = new ArrayList();
		UMLNavigatorGroup target = new UMLNavigatorGroup(Messages.NavigatorGroupName_ActionLocalPrecondition_4001_target, "icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
		UMLNavigatorGroup source = new UMLNavigatorGroup(Messages.NavigatorGroupName_ActionLocalPrecondition_4001_source, "icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
		Collection connectedViews = getLinksTargetByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ConstraintInActivityAsPrecondEditPart.VISUAL_ID));
		target.addChildren(createNavigatorItems(connectedViews, target, true));
		connectedViews = getLinksTargetByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ConstraintInActivityAsPostcondEditPart.VISUAL_ID));
		target.addChildren(createNavigatorItems(connectedViews, target, true));
		connectedViews = getLinksTargetByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ConstraintAsLocalPrecondEditPart.VISUAL_ID));
		target.addChildren(createNavigatorItems(connectedViews, target, true));
		connectedViews = getLinksTargetByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ConstraintAsLocalPostcondEditPart.VISUAL_ID));
		target.addChildren(createNavigatorItems(connectedViews, target, true));
		connectedViews = getLinksSourceByType(Collections.singleton(view), UMLVisualIDRegistry.getType(OpaqueActionEditPart.VISUAL_ID));
		source.addChildren(createNavigatorItems(connectedViews, source, true));
		connectedViews = getLinksSourceByType(Collections.singleton(view), UMLVisualIDRegistry.getType(CallBehaviorActionEditPart.VISUAL_ID));
		source.addChildren(createNavigatorItems(connectedViews, source, true));
		connectedViews = getLinksSourceByType(Collections.singleton(view), UMLVisualIDRegistry.getType(CallOperationActionEditPart.VISUAL_ID));
		source.addChildren(createNavigatorItems(connectedViews, source, true));
		if(!target.isEmpty()) {
			result.add(target);
		}
		if(!source.isEmpty()) {
			result.add(source);
		}
		return result.toArray();
	}

	/**
	 * 
	 *Papyrus Template
	 *this method is a modification of gmf code in order to avoid getViewChidreen() method becoming greater than 64kb.
	 * 
	 * @generated
	 **/
	private Object[] getViewChildrenForActionLocalPostconditionEditPart(View view, Object parentElement) {
		Collection result = new ArrayList();
		UMLNavigatorGroup target = new UMLNavigatorGroup(Messages.NavigatorGroupName_ActionLocalPostcondition_4002_target, "icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
		UMLNavigatorGroup source = new UMLNavigatorGroup(Messages.NavigatorGroupName_ActionLocalPostcondition_4002_source, "icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
		Collection connectedViews = getLinksTargetByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ConstraintInActivityAsPrecondEditPart.VISUAL_ID));
		target.addChildren(createNavigatorItems(connectedViews, target, true));
		connectedViews = getLinksTargetByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ConstraintInActivityAsPostcondEditPart.VISUAL_ID));
		target.addChildren(createNavigatorItems(connectedViews, target, true));
		connectedViews = getLinksTargetByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ConstraintAsLocalPrecondEditPart.VISUAL_ID));
		target.addChildren(createNavigatorItems(connectedViews, target, true));
		connectedViews = getLinksTargetByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ConstraintAsLocalPostcondEditPart.VISUAL_ID));
		target.addChildren(createNavigatorItems(connectedViews, target, true));
		connectedViews = getLinksSourceByType(Collections.singleton(view), UMLVisualIDRegistry.getType(OpaqueActionEditPart.VISUAL_ID));
		source.addChildren(createNavigatorItems(connectedViews, source, true));
		connectedViews = getLinksSourceByType(Collections.singleton(view), UMLVisualIDRegistry.getType(CallBehaviorActionEditPart.VISUAL_ID));
		source.addChildren(createNavigatorItems(connectedViews, source, true));
		connectedViews = getLinksSourceByType(Collections.singleton(view), UMLVisualIDRegistry.getType(CallOperationActionEditPart.VISUAL_ID));
		source.addChildren(createNavigatorItems(connectedViews, source, true));
		if(!target.isEmpty()) {
			result.add(target);
		}
		if(!source.isEmpty()) {
			result.add(source);
		}
		return result.toArray();
	}

	/**
	 * 
	 *Papyrus Template
	 *this method is a modification of gmf code in order to avoid getViewChidreen() method becoming greater than 64kb.
	 * 
	 * @generated
	 **/
	private Object[] getViewChildrenForObjectFlowSelectionEditPart(View view, Object parentElement) {
		Collection result = new ArrayList();
		UMLNavigatorGroup target = new UMLNavigatorGroup(Messages.NavigatorGroupName_ObjectFlowSelection_4005_target, "icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
		Collection connectedViews = getLinksTargetByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ActivityEditPart.VISUAL_ID));
		target.addChildren(createNavigatorItems(connectedViews, target, true));
		connectedViews = getLinksTargetByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ActivityAsSelectionEditPart.VISUAL_ID));
		target.addChildren(createNavigatorItems(connectedViews, target, true));
		connectedViews = getLinksTargetByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ActivityAsTransformationEditPart.VISUAL_ID));
		target.addChildren(createNavigatorItems(connectedViews, target, true));
		if(!target.isEmpty()) {
			result.add(target);
		}
		return result.toArray();
	}

	/**
	 * 
	 *Papyrus Template
	 *this method is a modification of gmf code in order to avoid getViewChidreen() method becoming greater than 64kb.
	 * 
	 * @generated
	 **/
	private Object[] getViewChildrenForObjectFlowTransformationEditPart(View view, Object parentElement) {
		Collection result = new ArrayList();
		UMLNavigatorGroup target = new UMLNavigatorGroup(Messages.NavigatorGroupName_ObjectFlowTransformation_4006_target, "icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
		Collection connectedViews = getLinksTargetByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ActivityEditPart.VISUAL_ID));
		target.addChildren(createNavigatorItems(connectedViews, target, true));
		connectedViews = getLinksTargetByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ActivityAsSelectionEditPart.VISUAL_ID));
		target.addChildren(createNavigatorItems(connectedViews, target, true));
		connectedViews = getLinksTargetByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ActivityAsTransformationEditPart.VISUAL_ID));
		target.addChildren(createNavigatorItems(connectedViews, target, true));
		if(!target.isEmpty()) {
			result.add(target);
		}
		return result.toArray();
	}

	/**
	 * 
	 *Papyrus Template
	 *this method is a modification of gmf code in order to avoid getViewChidreen() method becoming greater than 64kb.
	 * 
	 * @generated
	 **/
	private Object[] getViewChildrenForObjectFlowEditPart(View view, Object parentElement) {
		Collection result = new ArrayList();
		UMLNavigatorGroup target = new UMLNavigatorGroup(Messages.NavigatorGroupName_ObjectFlow_4003_target, "icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
		UMLNavigatorGroup source = new UMLNavigatorGroup(Messages.NavigatorGroupName_ObjectFlow_4003_source, "icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
		Collection connectedViews = getLinksTargetByType(Collections.singleton(view), UMLVisualIDRegistry.getType(InitialNodeEditPart.VISUAL_ID));
		target.addChildren(createNavigatorItems(connectedViews, target, true));
		connectedViews = getLinksTargetByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ActivityFinalNodeEditPart.VISUAL_ID));
		target.addChildren(createNavigatorItems(connectedViews, target, true));
		connectedViews = getLinksTargetByType(Collections.singleton(view), UMLVisualIDRegistry.getType(FlowFinalNodeEditPart.VISUAL_ID));
		target.addChildren(createNavigatorItems(connectedViews, target, true));
		connectedViews = getLinksTargetByType(Collections.singleton(view), UMLVisualIDRegistry.getType(OpaqueActionEditPart.VISUAL_ID));
		target.addChildren(createNavigatorItems(connectedViews, target, true));
		connectedViews = getLinksTargetByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ValuePinInOpaqueActEditPart.VISUAL_ID));
		target.addChildren(createNavigatorItems(connectedViews, target, true));
		connectedViews = getLinksTargetByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ActionInputPinInOpaqueActEditPart.VISUAL_ID));
		target.addChildren(createNavigatorItems(connectedViews, target, true));
		connectedViews = getLinksTargetByType(Collections.singleton(view), UMLVisualIDRegistry.getType(InputPinInOpaqueActEditPart.VISUAL_ID));
		target.addChildren(createNavigatorItems(connectedViews, target, true));
		connectedViews = getLinksTargetByType(Collections.singleton(view), UMLVisualIDRegistry.getType(OutputPinInOpaqueActEditPart.VISUAL_ID));
		target.addChildren(createNavigatorItems(connectedViews, target, true));
		connectedViews = getLinksTargetByType(Collections.singleton(view), UMLVisualIDRegistry.getType(CallBehaviorActionEditPart.VISUAL_ID));
		target.addChildren(createNavigatorItems(connectedViews, target, true));
		connectedViews = getLinksTargetByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ValuePinInCallBeActEditPart.VISUAL_ID));
		target.addChildren(createNavigatorItems(connectedViews, target, true));
		connectedViews = getLinksTargetByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ActionInputPinInCallBeActEditPart.VISUAL_ID));
		target.addChildren(createNavigatorItems(connectedViews, target, true));
		connectedViews = getLinksTargetByType(Collections.singleton(view), UMLVisualIDRegistry.getType(InputPinInCallBeActEditPart.VISUAL_ID));
		target.addChildren(createNavigatorItems(connectedViews, target, true));
		connectedViews = getLinksTargetByType(Collections.singleton(view), UMLVisualIDRegistry.getType(OutputPinInCallBeActEditPart.VISUAL_ID));
		target.addChildren(createNavigatorItems(connectedViews, target, true));
		connectedViews = getLinksTargetByType(Collections.singleton(view), UMLVisualIDRegistry.getType(CallOperationActionEditPart.VISUAL_ID));
		target.addChildren(createNavigatorItems(connectedViews, target, true));
		connectedViews = getLinksTargetByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ActionInputPinInCallOpActEditPart.VISUAL_ID));
		target.addChildren(createNavigatorItems(connectedViews, target, true));
		connectedViews = getLinksTargetByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ValuePinInCallOpActEditPart.VISUAL_ID));
		target.addChildren(createNavigatorItems(connectedViews, target, true));
		connectedViews = getLinksTargetByType(Collections.singleton(view), UMLVisualIDRegistry.getType(InputPinInCallOpActEditPart.VISUAL_ID));
		target.addChildren(createNavigatorItems(connectedViews, target, true));
		connectedViews = getLinksTargetByType(Collections.singleton(view), UMLVisualIDRegistry.getType(OutputPinInCallOpActEditPart.VISUAL_ID));
		target.addChildren(createNavigatorItems(connectedViews, target, true));
		connectedViews = getLinksTargetByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ValuePinInCallOpActAsTargetEditPart.VISUAL_ID));
		target.addChildren(createNavigatorItems(connectedViews, target, true));
		connectedViews = getLinksTargetByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ActionInputPinInCallOpActAsTargetEditPart.VISUAL_ID));
		target.addChildren(createNavigatorItems(connectedViews, target, true));
		connectedViews = getLinksTargetByType(Collections.singleton(view), UMLVisualIDRegistry.getType(InputPinInCallOpActAsTargetEditPart.VISUAL_ID));
		target.addChildren(createNavigatorItems(connectedViews, target, true));
		connectedViews = getLinksSourceByType(Collections.singleton(view), UMLVisualIDRegistry.getType(InitialNodeEditPart.VISUAL_ID));
		source.addChildren(createNavigatorItems(connectedViews, source, true));
		connectedViews = getLinksSourceByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ActivityFinalNodeEditPart.VISUAL_ID));
		source.addChildren(createNavigatorItems(connectedViews, source, true));
		connectedViews = getLinksSourceByType(Collections.singleton(view), UMLVisualIDRegistry.getType(FlowFinalNodeEditPart.VISUAL_ID));
		source.addChildren(createNavigatorItems(connectedViews, source, true));
		connectedViews = getLinksSourceByType(Collections.singleton(view), UMLVisualIDRegistry.getType(OpaqueActionEditPart.VISUAL_ID));
		source.addChildren(createNavigatorItems(connectedViews, source, true));
		connectedViews = getLinksSourceByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ValuePinInOpaqueActEditPart.VISUAL_ID));
		source.addChildren(createNavigatorItems(connectedViews, source, true));
		connectedViews = getLinksSourceByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ActionInputPinInOpaqueActEditPart.VISUAL_ID));
		source.addChildren(createNavigatorItems(connectedViews, source, true));
		connectedViews = getLinksSourceByType(Collections.singleton(view), UMLVisualIDRegistry.getType(InputPinInOpaqueActEditPart.VISUAL_ID));
		source.addChildren(createNavigatorItems(connectedViews, source, true));
		connectedViews = getLinksSourceByType(Collections.singleton(view), UMLVisualIDRegistry.getType(OutputPinInOpaqueActEditPart.VISUAL_ID));
		source.addChildren(createNavigatorItems(connectedViews, source, true));
		connectedViews = getLinksSourceByType(Collections.singleton(view), UMLVisualIDRegistry.getType(CallBehaviorActionEditPart.VISUAL_ID));
		source.addChildren(createNavigatorItems(connectedViews, source, true));
		connectedViews = getLinksSourceByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ValuePinInCallBeActEditPart.VISUAL_ID));
		source.addChildren(createNavigatorItems(connectedViews, source, true));
		connectedViews = getLinksSourceByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ActionInputPinInCallBeActEditPart.VISUAL_ID));
		source.addChildren(createNavigatorItems(connectedViews, source, true));
		connectedViews = getLinksSourceByType(Collections.singleton(view), UMLVisualIDRegistry.getType(InputPinInCallBeActEditPart.VISUAL_ID));
		source.addChildren(createNavigatorItems(connectedViews, source, true));
		connectedViews = getLinksSourceByType(Collections.singleton(view), UMLVisualIDRegistry.getType(OutputPinInCallBeActEditPart.VISUAL_ID));
		source.addChildren(createNavigatorItems(connectedViews, source, true));
		connectedViews = getLinksSourceByType(Collections.singleton(view), UMLVisualIDRegistry.getType(CallOperationActionEditPart.VISUAL_ID));
		source.addChildren(createNavigatorItems(connectedViews, source, true));
		connectedViews = getLinksSourceByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ActionInputPinInCallOpActEditPart.VISUAL_ID));
		source.addChildren(createNavigatorItems(connectedViews, source, true));
		connectedViews = getLinksSourceByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ValuePinInCallOpActEditPart.VISUAL_ID));
		source.addChildren(createNavigatorItems(connectedViews, source, true));
		connectedViews = getLinksSourceByType(Collections.singleton(view), UMLVisualIDRegistry.getType(InputPinInCallOpActEditPart.VISUAL_ID));
		source.addChildren(createNavigatorItems(connectedViews, source, true));
		connectedViews = getLinksSourceByType(Collections.singleton(view), UMLVisualIDRegistry.getType(OutputPinInCallOpActEditPart.VISUAL_ID));
		source.addChildren(createNavigatorItems(connectedViews, source, true));
		connectedViews = getLinksSourceByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ValuePinInCallOpActAsTargetEditPart.VISUAL_ID));
		source.addChildren(createNavigatorItems(connectedViews, source, true));
		connectedViews = getLinksSourceByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ActionInputPinInCallOpActAsTargetEditPart.VISUAL_ID));
		source.addChildren(createNavigatorItems(connectedViews, source, true));
		connectedViews = getLinksSourceByType(Collections.singleton(view), UMLVisualIDRegistry.getType(InputPinInCallOpActAsTargetEditPart.VISUAL_ID));
		source.addChildren(createNavigatorItems(connectedViews, source, true));
		if(!target.isEmpty()) {
			result.add(target);
		}
		if(!source.isEmpty()) {
			result.add(source);
		}
		return result.toArray();
	}

	/**
	 * 
	 *Papyrus Template
	 *this method is a modification of gmf code in order to avoid getViewChidreen() method becoming greater than 64kb.
	 * 
	 * @generated
	 **/
	private Object[] getViewChildrenForControlFlowEditPart(View view, Object parentElement) {
		Collection result = new ArrayList();
		UMLNavigatorGroup target = new UMLNavigatorGroup(Messages.NavigatorGroupName_ControlFlow_4004_target, "icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
		UMLNavigatorGroup source = new UMLNavigatorGroup(Messages.NavigatorGroupName_ControlFlow_4004_source, "icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
		Collection connectedViews = getLinksTargetByType(Collections.singleton(view), UMLVisualIDRegistry.getType(InitialNodeEditPart.VISUAL_ID));
		target.addChildren(createNavigatorItems(connectedViews, target, true));
		connectedViews = getLinksTargetByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ActivityFinalNodeEditPart.VISUAL_ID));
		target.addChildren(createNavigatorItems(connectedViews, target, true));
		connectedViews = getLinksTargetByType(Collections.singleton(view), UMLVisualIDRegistry.getType(FlowFinalNodeEditPart.VISUAL_ID));
		target.addChildren(createNavigatorItems(connectedViews, target, true));
		connectedViews = getLinksTargetByType(Collections.singleton(view), UMLVisualIDRegistry.getType(OpaqueActionEditPart.VISUAL_ID));
		target.addChildren(createNavigatorItems(connectedViews, target, true));
		connectedViews = getLinksTargetByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ValuePinInOpaqueActEditPart.VISUAL_ID));
		target.addChildren(createNavigatorItems(connectedViews, target, true));
		connectedViews = getLinksTargetByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ActionInputPinInOpaqueActEditPart.VISUAL_ID));
		target.addChildren(createNavigatorItems(connectedViews, target, true));
		connectedViews = getLinksTargetByType(Collections.singleton(view), UMLVisualIDRegistry.getType(InputPinInOpaqueActEditPart.VISUAL_ID));
		target.addChildren(createNavigatorItems(connectedViews, target, true));
		connectedViews = getLinksTargetByType(Collections.singleton(view), UMLVisualIDRegistry.getType(OutputPinInOpaqueActEditPart.VISUAL_ID));
		target.addChildren(createNavigatorItems(connectedViews, target, true));
		connectedViews = getLinksTargetByType(Collections.singleton(view), UMLVisualIDRegistry.getType(CallBehaviorActionEditPart.VISUAL_ID));
		target.addChildren(createNavigatorItems(connectedViews, target, true));
		connectedViews = getLinksTargetByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ValuePinInCallBeActEditPart.VISUAL_ID));
		target.addChildren(createNavigatorItems(connectedViews, target, true));
		connectedViews = getLinksTargetByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ActionInputPinInCallBeActEditPart.VISUAL_ID));
		target.addChildren(createNavigatorItems(connectedViews, target, true));
		connectedViews = getLinksTargetByType(Collections.singleton(view), UMLVisualIDRegistry.getType(InputPinInCallBeActEditPart.VISUAL_ID));
		target.addChildren(createNavigatorItems(connectedViews, target, true));
		connectedViews = getLinksTargetByType(Collections.singleton(view), UMLVisualIDRegistry.getType(OutputPinInCallBeActEditPart.VISUAL_ID));
		target.addChildren(createNavigatorItems(connectedViews, target, true));
		connectedViews = getLinksTargetByType(Collections.singleton(view), UMLVisualIDRegistry.getType(CallOperationActionEditPart.VISUAL_ID));
		target.addChildren(createNavigatorItems(connectedViews, target, true));
		connectedViews = getLinksTargetByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ActionInputPinInCallOpActEditPart.VISUAL_ID));
		target.addChildren(createNavigatorItems(connectedViews, target, true));
		connectedViews = getLinksTargetByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ValuePinInCallOpActEditPart.VISUAL_ID));
		target.addChildren(createNavigatorItems(connectedViews, target, true));
		connectedViews = getLinksTargetByType(Collections.singleton(view), UMLVisualIDRegistry.getType(InputPinInCallOpActEditPart.VISUAL_ID));
		target.addChildren(createNavigatorItems(connectedViews, target, true));
		connectedViews = getLinksTargetByType(Collections.singleton(view), UMLVisualIDRegistry.getType(OutputPinInCallOpActEditPart.VISUAL_ID));
		target.addChildren(createNavigatorItems(connectedViews, target, true));
		connectedViews = getLinksTargetByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ValuePinInCallOpActAsTargetEditPart.VISUAL_ID));
		target.addChildren(createNavigatorItems(connectedViews, target, true));
		connectedViews = getLinksTargetByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ActionInputPinInCallOpActAsTargetEditPart.VISUAL_ID));
		target.addChildren(createNavigatorItems(connectedViews, target, true));
		connectedViews = getLinksTargetByType(Collections.singleton(view), UMLVisualIDRegistry.getType(InputPinInCallOpActAsTargetEditPart.VISUAL_ID));
		target.addChildren(createNavigatorItems(connectedViews, target, true));
		connectedViews = getLinksSourceByType(Collections.singleton(view), UMLVisualIDRegistry.getType(InitialNodeEditPart.VISUAL_ID));
		source.addChildren(createNavigatorItems(connectedViews, source, true));
		connectedViews = getLinksSourceByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ActivityFinalNodeEditPart.VISUAL_ID));
		source.addChildren(createNavigatorItems(connectedViews, source, true));
		connectedViews = getLinksSourceByType(Collections.singleton(view), UMLVisualIDRegistry.getType(FlowFinalNodeEditPart.VISUAL_ID));
		source.addChildren(createNavigatorItems(connectedViews, source, true));
		connectedViews = getLinksSourceByType(Collections.singleton(view), UMLVisualIDRegistry.getType(OpaqueActionEditPart.VISUAL_ID));
		source.addChildren(createNavigatorItems(connectedViews, source, true));
		connectedViews = getLinksSourceByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ValuePinInOpaqueActEditPart.VISUAL_ID));
		source.addChildren(createNavigatorItems(connectedViews, source, true));
		connectedViews = getLinksSourceByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ActionInputPinInOpaqueActEditPart.VISUAL_ID));
		source.addChildren(createNavigatorItems(connectedViews, source, true));
		connectedViews = getLinksSourceByType(Collections.singleton(view), UMLVisualIDRegistry.getType(InputPinInOpaqueActEditPart.VISUAL_ID));
		source.addChildren(createNavigatorItems(connectedViews, source, true));
		connectedViews = getLinksSourceByType(Collections.singleton(view), UMLVisualIDRegistry.getType(OutputPinInOpaqueActEditPart.VISUAL_ID));
		source.addChildren(createNavigatorItems(connectedViews, source, true));
		connectedViews = getLinksSourceByType(Collections.singleton(view), UMLVisualIDRegistry.getType(CallBehaviorActionEditPart.VISUAL_ID));
		source.addChildren(createNavigatorItems(connectedViews, source, true));
		connectedViews = getLinksSourceByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ValuePinInCallBeActEditPart.VISUAL_ID));
		source.addChildren(createNavigatorItems(connectedViews, source, true));
		connectedViews = getLinksSourceByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ActionInputPinInCallBeActEditPart.VISUAL_ID));
		source.addChildren(createNavigatorItems(connectedViews, source, true));
		connectedViews = getLinksSourceByType(Collections.singleton(view), UMLVisualIDRegistry.getType(InputPinInCallBeActEditPart.VISUAL_ID));
		source.addChildren(createNavigatorItems(connectedViews, source, true));
		connectedViews = getLinksSourceByType(Collections.singleton(view), UMLVisualIDRegistry.getType(OutputPinInCallBeActEditPart.VISUAL_ID));
		source.addChildren(createNavigatorItems(connectedViews, source, true));
		connectedViews = getLinksSourceByType(Collections.singleton(view), UMLVisualIDRegistry.getType(CallOperationActionEditPart.VISUAL_ID));
		source.addChildren(createNavigatorItems(connectedViews, source, true));
		connectedViews = getLinksSourceByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ActionInputPinInCallOpActEditPart.VISUAL_ID));
		source.addChildren(createNavigatorItems(connectedViews, source, true));
		connectedViews = getLinksSourceByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ValuePinInCallOpActEditPart.VISUAL_ID));
		source.addChildren(createNavigatorItems(connectedViews, source, true));
		connectedViews = getLinksSourceByType(Collections.singleton(view), UMLVisualIDRegistry.getType(InputPinInCallOpActEditPart.VISUAL_ID));
		source.addChildren(createNavigatorItems(connectedViews, source, true));
		connectedViews = getLinksSourceByType(Collections.singleton(view), UMLVisualIDRegistry.getType(OutputPinInCallOpActEditPart.VISUAL_ID));
		source.addChildren(createNavigatorItems(connectedViews, source, true));
		connectedViews = getLinksSourceByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ValuePinInCallOpActAsTargetEditPart.VISUAL_ID));
		source.addChildren(createNavigatorItems(connectedViews, source, true));
		connectedViews = getLinksSourceByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ActionInputPinInCallOpActAsTargetEditPart.VISUAL_ID));
		source.addChildren(createNavigatorItems(connectedViews, source, true));
		connectedViews = getLinksSourceByType(Collections.singleton(view), UMLVisualIDRegistry.getType(InputPinInCallOpActAsTargetEditPart.VISUAL_ID));
		source.addChildren(createNavigatorItems(connectedViews, source, true));
		if(!target.isEmpty()) {
			result.add(target);
		}
		if(!source.isEmpty()) {
			result.add(source);
		}
		return result.toArray();
	}

	/**
	 * @generated
	 */
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		for(Iterator it = myEditingDomain.getResourceSet().getResources().iterator(); it.hasNext();) {
			Resource resource = (Resource)it.next();
			resource.unload();
		}
		((TransactionalEditingDomain)myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public Object[] getChildren(Object parentElement) {
		if(parentElement instanceof IFile) {
			IFile file = (IFile)parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(fileURI, true);
			Collection result = new ArrayList();
			result.addAll(createNavigatorItems(selectViewsByType(resource.getContents(), ActivityDiagramEditPart.MODEL_ID), file, false));
			return result.toArray();
		}

		if(parentElement instanceof UMLNavigatorGroup) {
			UMLNavigatorGroup group = (UMLNavigatorGroup)parentElement;
			return group.getChildren();
		}

		if(parentElement instanceof UMLNavigatorItem) {
			UMLNavigatorItem navigatorItem = (UMLNavigatorItem)parentElement;
			if(navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch(UMLVisualIDRegistry.getVisualID(view)) {



		case ActivityDiagramEditPart.VISUAL_ID:
		{


			//modification of the template to avoid mistake of 65kb.
			return getViewChildrenForActivityDiagramEditPart(view, parentElement);

		}

		case ActivityEditPart.VISUAL_ID:
		{


			//modification of the template to avoid mistake of 65kb.
			return getViewChildrenForActivityEditPart(view, parentElement);

		}

		case ConstraintInActivityAsPrecondEditPart.VISUAL_ID:
		{


			//modification of the template to avoid mistake of 65kb.
			return getViewChildrenForConstraintInActivityAsPrecondEditPart(view, parentElement);

		}

		case ConstraintInActivityAsPostcondEditPart.VISUAL_ID:
		{


			//modification of the template to avoid mistake of 65kb.
			return getViewChildrenForConstraintInActivityAsPostcondEditPart(view, parentElement);

		}

		case InitialNodeEditPart.VISUAL_ID:
		{


			//modification of the template to avoid mistake of 65kb.
			return getViewChildrenForInitialNodeEditPart(view, parentElement);

		}

		case ActivityFinalNodeEditPart.VISUAL_ID:
		{


			//modification of the template to avoid mistake of 65kb.
			return getViewChildrenForActivityFinalNodeEditPart(view, parentElement);

		}

		case FlowFinalNodeEditPart.VISUAL_ID:
		{


			//modification of the template to avoid mistake of 65kb.
			return getViewChildrenForFlowFinalNodeEditPart(view, parentElement);

		}

		case OpaqueActionEditPart.VISUAL_ID:
		{


			//modification of the template to avoid mistake of 65kb.
			return getViewChildrenForOpaqueActionEditPart(view, parentElement);

		}

		case ValuePinInOpaqueActEditPart.VISUAL_ID:
		{


			//modification of the template to avoid mistake of 65kb.
			return getViewChildrenForValuePinInOpaqueActEditPart(view, parentElement);

		}

		case ActionInputPinInOpaqueActEditPart.VISUAL_ID:
		{


			//modification of the template to avoid mistake of 65kb.
			return getViewChildrenForActionInputPinInOpaqueActEditPart(view, parentElement);

		}

		case InputPinInOpaqueActEditPart.VISUAL_ID:
		{


			//modification of the template to avoid mistake of 65kb.
			return getViewChildrenForInputPinInOpaqueActEditPart(view, parentElement);

		}

		case OutputPinInOpaqueActEditPart.VISUAL_ID:
		{


			//modification of the template to avoid mistake of 65kb.
			return getViewChildrenForOutputPinInOpaqueActEditPart(view, parentElement);

		}

		case CallBehaviorActionEditPart.VISUAL_ID:
		{


			//modification of the template to avoid mistake of 65kb.
			return getViewChildrenForCallBehaviorActionEditPart(view, parentElement);

		}

		case ValuePinInCallBeActEditPart.VISUAL_ID:
		{


			//modification of the template to avoid mistake of 65kb.
			return getViewChildrenForValuePinInCallBeActEditPart(view, parentElement);

		}

		case ActionInputPinInCallBeActEditPart.VISUAL_ID:
		{


			//modification of the template to avoid mistake of 65kb.
			return getViewChildrenForActionInputPinInCallBeActEditPart(view, parentElement);

		}

		case InputPinInCallBeActEditPart.VISUAL_ID:
		{


			//modification of the template to avoid mistake of 65kb.
			return getViewChildrenForInputPinInCallBeActEditPart(view, parentElement);

		}

		case OutputPinInCallBeActEditPart.VISUAL_ID:
		{


			//modification of the template to avoid mistake of 65kb.
			return getViewChildrenForOutputPinInCallBeActEditPart(view, parentElement);

		}

		case CallOperationActionEditPart.VISUAL_ID:
		{


			//modification of the template to avoid mistake of 65kb.
			return getViewChildrenForCallOperationActionEditPart(view, parentElement);

		}

		case ActionInputPinInCallOpActEditPart.VISUAL_ID:
		{


			//modification of the template to avoid mistake of 65kb.
			return getViewChildrenForActionInputPinInCallOpActEditPart(view, parentElement);

		}

		case ValuePinInCallOpActEditPart.VISUAL_ID:
		{


			//modification of the template to avoid mistake of 65kb.
			return getViewChildrenForValuePinInCallOpActEditPart(view, parentElement);

		}

		case InputPinInCallOpActEditPart.VISUAL_ID:
		{


			//modification of the template to avoid mistake of 65kb.
			return getViewChildrenForInputPinInCallOpActEditPart(view, parentElement);

		}

		case OutputPinInCallOpActEditPart.VISUAL_ID:
		{


			//modification of the template to avoid mistake of 65kb.
			return getViewChildrenForOutputPinInCallOpActEditPart(view, parentElement);

		}

		case ValuePinInCallOpActAsTargetEditPart.VISUAL_ID:
		{


			//modification of the template to avoid mistake of 65kb.
			return getViewChildrenForValuePinInCallOpActAsTargetEditPart(view, parentElement);

		}

		case ActionInputPinInCallOpActAsTargetEditPart.VISUAL_ID:
		{


			//modification of the template to avoid mistake of 65kb.
			return getViewChildrenForActionInputPinInCallOpActAsTargetEditPart(view, parentElement);

		}

		case InputPinInCallOpActAsTargetEditPart.VISUAL_ID:
		{


			//modification of the template to avoid mistake of 65kb.
			return getViewChildrenForInputPinInCallOpActAsTargetEditPart(view, parentElement);

		}

		case ConstraintAsLocalPrecondEditPart.VISUAL_ID:
		{


			//modification of the template to avoid mistake of 65kb.
			return getViewChildrenForConstraintAsLocalPrecondEditPart(view, parentElement);

		}

		case ConstraintAsLocalPostcondEditPart.VISUAL_ID:
		{


			//modification of the template to avoid mistake of 65kb.
			return getViewChildrenForConstraintAsLocalPostcondEditPart(view, parentElement);

		}

		case ActivityAsSelectionEditPart.VISUAL_ID:
		{


			//modification of the template to avoid mistake of 65kb.
			return getViewChildrenForActivityAsSelectionEditPart(view, parentElement);

		}

		case ActivityAsTransformationEditPart.VISUAL_ID:
		{


			//modification of the template to avoid mistake of 65kb.
			return getViewChildrenForActivityAsTransformationEditPart(view, parentElement);

		}

		case ActionLocalPreconditionEditPart.VISUAL_ID:
		{


			//modification of the template to avoid mistake of 65kb.
			return getViewChildrenForActionLocalPreconditionEditPart(view, parentElement);

		}

		case ActionLocalPostconditionEditPart.VISUAL_ID:
		{


			//modification of the template to avoid mistake of 65kb.
			return getViewChildrenForActionLocalPostconditionEditPart(view, parentElement);

		}

		case ObjectFlowSelectionEditPart.VISUAL_ID:
		{


			//modification of the template to avoid mistake of 65kb.
			return getViewChildrenForObjectFlowSelectionEditPart(view, parentElement);

		}

		case ObjectFlowTransformationEditPart.VISUAL_ID:
		{


			//modification of the template to avoid mistake of 65kb.
			return getViewChildrenForObjectFlowTransformationEditPart(view, parentElement);

		}

		case ObjectFlowEditPart.VISUAL_ID:
		{


			//modification of the template to avoid mistake of 65kb.
			return getViewChildrenForObjectFlowEditPart(view, parentElement);

		}

		case ControlFlowEditPart.VISUAL_ID:
		{


			//modification of the template to avoid mistake of 65kb.
			return getViewChildrenForControlFlowEditPart(view, parentElement);

		}

		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Collection getLinksSourceByType(Collection edges, String type) {
		Collection result = new ArrayList();
		for(Iterator it = edges.iterator(); it.hasNext();) {
			Edge nextEdge = (Edge)it.next();
			View nextEdgeSource = nextEdge.getSource();
			if(type.equals(nextEdgeSource.getType()) && isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection getLinksTargetByType(Collection edges, String type) {
		Collection result = new ArrayList();
		for(Iterator it = edges.iterator(); it.hasNext();) {
			Edge nextEdge = (Edge)it.next();
			View nextEdgeTarget = nextEdge.getTarget();
			if(type.equals(nextEdgeTarget.getType()) && isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection getOutgoingLinksByType(Collection nodes, String type) {
		Collection result = new ArrayList();
		for(Iterator it = nodes.iterator(); it.hasNext();) {
			View nextNode = (View)it.next();
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection getIncomingLinksByType(Collection nodes, String type) {
		Collection result = new ArrayList();
		for(Iterator it = nodes.iterator(); it.hasNext();) {
			View nextNode = (View)it.next();
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection getChildrenByType(Collection nodes, String type) {
		Collection result = new ArrayList();
		for(Iterator it = nodes.iterator(); it.hasNext();) {
			View nextNode = (View)it.next();
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection getDiagramLinksByType(Collection diagrams, String type) {
		Collection result = new ArrayList();
		for(Iterator it = diagrams.iterator(); it.hasNext();) {
			Diagram nextDiagram = (Diagram)it.next();
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection selectViewsByType(Collection views, String type) {
		Collection result = new ArrayList();
		for(Iterator it = views.iterator(); it.hasNext();) {
			View nextView = (View)it.next();
			if(type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return ActivityDiagramEditPart.MODEL_ID.equals(UMLVisualIDRegistry.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection createNavigatorItems(Collection views, Object parent, boolean isLeafs) {
		Collection result = new ArrayList();
		for(Iterator it = views.iterator(); it.hasNext();) {
			result.add(new UMLNavigatorItem((View)it.next(), parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if(element instanceof UMLAbstractNavigatorItem) {
			UMLAbstractNavigatorItem abstractNavigatorItem = (UMLAbstractNavigatorItem)element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
