/*****************************************************************************
 * Copyright (c) 2009 CEA
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
package org.eclipse.papyrus.diagram.sequence.edit.parts;

import org.eclipse.draw2d.AutomaticRouter;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.ConnectionLayer;
import org.eclipse.draw2d.ConnectionRouter;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.LayerConstants;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateUnspecifiedTypeRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.draw2d.ui.internal.figures.ConnectionLayerEx;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.Routing;
import org.eclipse.gmf.runtime.notation.RoutingStyle;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.papyrus.diagram.sequence.draw2d.routers.MessageRouter;
import org.eclipse.papyrus.diagram.sequence.edit.policies.CreationOnMessageEditPolicy;
import org.eclipse.papyrus.diagram.sequence.edit.policies.LifelineChildGraphicalNodeEditPolicy;
import org.eclipse.papyrus.diagram.sequence.edit.policies.Message7ItemSemanticEditPolicy;
import org.eclipse.papyrus.diagram.sequence.edit.policies.MessageConnectionEditPolicy;
import org.eclipse.papyrus.diagram.sequence.figures.EllipseDecoration;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.MessageSort;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class Message7EditPart extends ConnectionNodeEditPart

implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4009;

	/**
	 * Title for dialog of block message sort modification error
	 */
	private static final String BLOCK_SORT_MODIFICATION_TITLE = "Forbidden action"; //$NON-NLS-1$

	/**
	 * Message for dialog of block message sort modification error
	 */
	private static final String BLOCK_SORT_MODIFICATION_MSG = "It's impossible to change the message sort"; //$NON-NLS-1$

	/**
	 * The current message sort
	 */
	private MessageSort messageSort;

	/**
	 * @generated
	 */
	public Message7EditPart(View view) {
		super(view);
	}

	/**
	 * Installs a router on the edit part, depending on the <code>RoutingStyle</code> Use the specific message router rather than the default oblique
	 * one.
	 * 
	 * @generated NOT
	 */
	protected void installRouter() {
		ConnectionLayer cLayer = (ConnectionLayer)getLayer(LayerConstants.CONNECTION_LAYER);
		RoutingStyle style = (RoutingStyle)((View)getModel()).getStyle(NotationPackage.Literals.ROUTING_STYLE);

		if(style != null && cLayer instanceof ConnectionLayerEx) {

			ConnectionLayerEx cLayerEx = (ConnectionLayerEx)cLayer;
			Routing routing = style.getRouting();
			if(Routing.MANUAL_LITERAL == routing) {
				ConnectionRouter router = cLayerEx.getObliqueRouter();
				// replace the oblique router by the message router
				if(router instanceof AutomaticRouter) {
					if(LifelineChildGraphicalNodeEditPolicy.messageRouter == null) {

						LifelineChildGraphicalNodeEditPolicy.messageRouter = new MessageRouter();
					}
					((AutomaticRouter)router).setNextRouter(LifelineChildGraphicalNodeEditPolicy.messageRouter);
				}
				getConnectionFigure().setConnectionRouter(router);
			} else if(Routing.RECTILINEAR_LITERAL == routing) {
				getConnectionFigure().setConnectionRouter(cLayerEx.getRectilinearRouter());
			} else if(Routing.TREE_LITERAL == routing) {
				getConnectionFigure().setConnectionRouter(cLayerEx.getTreeRouter());
			}

		}

		refreshRouterChange();
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new Message7ItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE, new CreationOnMessageEditPolicy());
		installEditPolicy(EditPolicy.CONNECTION_ROLE, new MessageConnectionEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if(childEditPart instanceof MessageName7EditPart) {
			((MessageName7EditPart)childEditPart).setLabel(getPrimaryShape().getFigureMessageFoundLabelFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if(addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if(childEditPart instanceof MessageName7EditPart) {
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if(removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model so you may safely remove
	 * <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */

	protected Connection createConnectionFigure() {
		return new MessageFound();
	}

	/**
	 * @generated
	 */
	public MessageFound getPrimaryShape() {
		return (MessageFound)getFigure();
	}

	/**
	 * @generated
	 */
	public class MessageFound extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureMessageFoundLabelFigure;

		/**
		 * @generated
		 */
		public MessageFound() {
			this.setLineWidth(1);
			this.setForegroundColor(ColorConstants.black);

			createContents();
			setSourceDecoration(createSourceDecoration());
			setTargetDecoration(createTargetDecoration());
		}

		/**
		 * @generated
		 */
		private void createContents() {


			fFigureMessageFoundLabelFigure = new WrappingLabel();
			fFigureMessageFoundLabelFigure.setText("");

			fFigureMessageFoundLabelFigure.setFont(FFIGUREMESSAGEFOUNDLABELFIGURE_FONT);



			this.add(fFigureMessageFoundLabelFigure);


		}

		/**
		 * @generated
		 */
		private RotatableDecoration createSourceDecoration() {
			EllipseDecoration df = new EllipseDecoration();




			df.setAlwaysFill(true);




			df.setPreferredSize(new Dimension(10, 10));



			return df;
		}

		/**
		 * @generated
		 */
		private RotatableDecoration createTargetDecoration() {
			PolylineDecoration df = new PolylineDecoration();
			df.setLineWidth(1);
			df.setForegroundColor(ColorConstants.black);
			PointList pl = new PointList();
			pl.addPoint(getMapMode().DPtoLP(-2), getMapMode().DPtoLP(2));
			pl.addPoint(getMapMode().DPtoLP(0), getMapMode().DPtoLP(0));
			pl.addPoint(getMapMode().DPtoLP(-2), getMapMode().DPtoLP(-2));
			df.setTemplate(pl);
			df.setScale(getMapMode().DPtoLP(7), getMapMode().DPtoLP(3));
			return df;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMessageFoundLabelFigure() {
			return fFigureMessageFoundLabelFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Font FFIGUREMESSAGEFOUNDLABELFIGURE_FONT = new Font(Display.getCurrent(), "SANS", 9, SWT.NORMAL);

	/**
	 * Block message sort modification
	 */
	@Override
	protected void handleNotificationEvent(Notification notification) {
		Object feature = notification.getFeature();

		if(UMLPackage.eINSTANCE.getMessage_MessageSort().equals(feature) && (messageSort == null || !messageSort.equals(notification.getNewValue()))) {
			Object oldValue = notification.getOldValue();
			if(oldValue instanceof MessageSort) {
				Message message = (Message)resolveSemanticElement();
				MessageDialog.openWarning(Display.getCurrent().getActiveShell(), BLOCK_SORT_MODIFICATION_TITLE, BLOCK_SORT_MODIFICATION_MSG);
				// TODO Improve cancelation method
				message.setMessageSort((MessageSort)oldValue);
				messageSort = (MessageSort)oldValue;
				return;
			}
		}
		super.handleNotificationEvent(notification);
	}

	/**
	 * @generated NOT Override for redirecting creation request to the lifeline
	 */
	@Override
	public void showSourceFeedback(Request request) {
		if(request instanceof CreateUnspecifiedTypeRequest) {
			getSource().showSourceFeedback(request);
			getTarget().showSourceFeedback(request);
		}
		super.showSourceFeedback(request);
	}

	/**
	 * @generated NOT Override for redirecting creation request to the lifeline
	 */
	@Override
	public void eraseSourceFeedback(Request request) {
		if(request instanceof CreateUnspecifiedTypeRequest) {
			getSource().eraseSourceFeedback(request);
			getTarget().eraseSourceFeedback(request);
		}
		super.eraseSourceFeedback(request);
	}

}
