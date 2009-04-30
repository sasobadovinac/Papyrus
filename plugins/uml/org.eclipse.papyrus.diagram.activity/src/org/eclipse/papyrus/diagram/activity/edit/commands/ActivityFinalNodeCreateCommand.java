/*
 * Copyright (c) 2007 Borland Software Corporation
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Copyright (c) of modifications Conselleria de Infraestructuras y
 * Transporte, Generalitat de la Comunitat Valenciana. All rights reserved.
 * Modifications are made available under the terms of the Eclipse Public
 * License v1.0.
 *
 * Contributors:
 *  Sergey Gribovsky (Borland) - initial API and implementation
 *  Francisco Javier Cano Mu�oz (Prodevelop)
 *  Marc Gil Sendra (Prodevelop)
 */
package org.eclipse.papyrus.diagram.activity.edit.commands;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.diagram.activity.edit.commands.helpers.ActivityPartitionActivity;
import org.eclipse.papyrus.diagram.activity.part.UMLDiagramEditorPlugin;
import org.eclipse.papyrus.diagram.activity.providers.UMLElementTypes;
import org.eclipse.papyrus.diagram.common.util.MultiDiagramUtil;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityFinalNode;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.ActivityPartition;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class ActivityFinalNodeCreateCommand extends CreateElementCommand {

	/**
	 * @generated
	 */
	private EClass eClass = null;

	/**
	 * @generated
	 */
	private EObject eObject = null;

	/**
	 * @generated
	 */
	public ActivityFinalNodeCreateCommand(CreateElementRequest req, EObject eObject) {
		super(req);
		this.eObject = eObject;
		this.eClass = eObject != null ? eObject.eClass() : null;
	}

	/**
	 * @generated
	 */
	public static ActivityFinalNodeCreateCommand create(CreateElementRequest req, EObject eObject) {
		return new ActivityFinalNodeCreateCommand(req, eObject);
	}

	/**
	 * @generated
	 */
	public ActivityFinalNodeCreateCommand(CreateElementRequest req) {
		super(req);
	}

	/**
	 * Modified to return the nearest <Activity>.
	 * 
	 * @generated NOT
	 */
	@Override
	protected EObject getElementToEdit() {
		EObject container = ((CreateElementRequest) getRequest()).getContainer();
		if (container instanceof View) {
			container = ((View) container).getElement();
		}
		// fjcano : we have to return the nearest Activity.
		if (container instanceof ActivityPartition) {
			return ActivityPartitionActivity.getActivityPartitionActivity((ActivityPartition) container);
		}

		return container;
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass getEClassToEdit() {

		EObject eObject = getElementToEdit();
		if (eObject != null) {
			return eObject.eClass();
		}
		if (eClass != null) {
			return eClass;
		}
		return UMLPackage.eINSTANCE.getActivity();
	}

	/**
	 * @generated
	 */
	protected Diagram getDiagramFromRequest() {

		if (getRequest().getParameters().get(MultiDiagramUtil.BelongToDiagramSource) != null) {
			Object parameter = getRequest().getParameters().get(MultiDiagramUtil.BelongToDiagramSource);
			if (parameter instanceof Diagram) {
				return (Diagram) parameter;
			}
		}
		return null;
	}

	/**
	 * @generated
	 */
	@Override
	protected EObject doDefaultElementCreation() {
		ActivityFinalNode newElement = (ActivityFinalNode) super.doDefaultElementCreation();
		if (newElement != null) {
			Activity owner = (Activity) getElementToEdit();
			owner.getNodes().add(newElement);

			UMLElementTypes.init_ActivityFinalNode_2009(newElement);

			addActionToActivityPartition(newElement);

			Diagram diagram = getDiagramFromRequest();
			if (diagram != null) {
				MultiDiagramUtil.AddEAnnotationReferenceToDiagram(diagram, newElement);
			} else {
				MultiDiagramUtil.addEAnnotationReferenceToDiagram(UMLDiagramEditorPlugin.getInstance(), newElement);
			}
		}
		return newElement;
	}

	/**
	 * Add the actions'a inPartition if it was created inside an ActivityPartition.
	 * 
	 * @param newAction
	 * @return
	 */
	protected boolean addActionToActivityPartition(ActivityNode newAction) {
		if (newAction == null) {
			return false;
		}
		CreateElementRequest createRequest = getCreateRequest() instanceof CreateElementRequest ? (CreateElementRequest) getCreateRequest() : null;
		if (createRequest != null) {
			EObject container = createRequest.getContainer();
			ActivityPartition activityPartition = (ActivityPartition) Platform.getAdapterManager().getAdapter(container, ActivityPartition.class);
			if (activityPartition != null) {
				newAction.getInPartitions().add(activityPartition);
				return newAction.getInPartitions().contains(activityPartition);
			}
		}
		return false;
	}
}
