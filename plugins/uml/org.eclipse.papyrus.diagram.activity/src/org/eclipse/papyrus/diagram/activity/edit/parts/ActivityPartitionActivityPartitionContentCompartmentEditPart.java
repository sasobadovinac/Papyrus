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
package org.eclipse.papyrus.diagram.activity.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.OneLineBorder;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.diagram.activity.edit.policies.ActivityPartitionActivityPartitionContentCompartmentItemSemanticEditPolicy;
import org.eclipse.papyrus.diagram.activity.part.Messages;

/**
 * @generated
 */
public class ActivityPartitionActivityPartitionContentCompartmentEditPart



extends ShapeCompartmentEditPart

{

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 7006;

	/**
	 * @generated
	 */
	public ActivityPartitionActivityPartitionContentCompartmentEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	public String getCompartmentName() {
		return Messages.ActivityPartitionActivityPartitionContentCompartmentEditPart_title;
	}

	/**
	 * @generated NOT (remove the bottom border)
	 */
	public IFigure createFigure() {
		ResizableCompartmentFigure result = (ResizableCompartmentFigure)super.createFigure();
		result.setTitleVisibility(false);
		// remove the top border
		OneLineBorder border = new OneLineBorder();
		border.setPosition(PositionConstants.TOP);
		result.setBorder(border);
		return result;
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new ActivityPartitionActivityPartitionContentCompartmentItemSemanticEditPolicy());
	}




	/**
	 * @generated
	 */
	protected void setRatio(Double ratio) {
		if(getFigure().getParent().getLayoutManager() instanceof ConstrainedToolbarLayout) {
			super.setRatio(ratio);
		}
	}



	/**
	 * @generated
	 */
	protected void handleNotificationEvent(Notification notification) {
		Object feature = notification.getFeature();
		if(NotationPackage.eINSTANCE.getSize_Width().equals(feature) || NotationPackage.eINSTANCE.getSize_Height().equals(feature) || NotationPackage.eINSTANCE.getLocation_X().equals(feature) || NotationPackage.eINSTANCE.getLocation_Y().equals(feature)) {
			refreshBounds();
		}
		super.handleNotificationEvent(notification);
	}

	/**
	 * @generated
	 */
	protected void refreshBounds() {
		int width = ((Integer)getStructuralFeatureValue(NotationPackage.eINSTANCE.getSize_Width())).intValue();
		int height = ((Integer)getStructuralFeatureValue(NotationPackage.eINSTANCE.getSize_Height())).intValue();
		Dimension size = new Dimension(width, height);
		int x = ((Integer)getStructuralFeatureValue(NotationPackage.eINSTANCE.getLocation_X())).intValue();
		int y = ((Integer)getStructuralFeatureValue(NotationPackage.eINSTANCE.getLocation_Y())).intValue();
		Point loc = new Point(x, y);
		((GraphicalEditPart)getParent()).setLayoutConstraint(this, getFigure(), new Rectangle(loc, size));
	}

	/**
	 * @generated
	 */
	protected void refreshVisuals() {
		super.refreshVisuals();
		refreshBounds();
	}
}
