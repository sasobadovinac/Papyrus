/*****************************************************************************
 * Copyright (c) 2011 Atos.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Atos - Initial API and implementation
 *   Arthur Daussy Bug 366026 - [ActivityDiagram] Refactoring in order to try respect Generation Gap Pattern 
 *
 *****************************************************************************/
package org.eclipse.papyrus.diagram.activity.edit.part;

import org.eclipse.draw2d.FigureListener;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.PolylineShape;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramColorRegistry;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ISemanticParser;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.diagram.activity.edit.parts.ObjectFlowTransformationEditPart;
import org.eclipse.papyrus.diagram.activity.edit.policies.BehaviorPropertyNodeEditPolicy;
import org.eclipse.papyrus.diagram.activity.figures.ActivityEdgeFigure;
import org.eclipse.papyrus.diagram.activity.figures.WrappedLabel;
import org.eclipse.papyrus.diagram.common.figure.node.CornerBentFigure;
import org.eclipse.papyrus.diagram.common.figure.node.ILabelFigure;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.ObjectFlow;

public class CustomObjectFlowTransformationEditPart extends ObjectFlowTransformationEditPart {

	public CustomObjectFlowTransformationEditPart(View view) {
		super(view);
	}
	
	
	@Override
	protected IFigure createFigurePrim() {
		return new CustomLinkAndCornerBentWithTextFigure();
	}
	
	/**
	 *handle LinkAndCornerBentWithTextFigure
	 */
	protected String getLabelTextHelper(IFigure figure) {
		if(figure instanceof WrappingLabel) {
			return ((WrappingLabel)figure).getText();
		} else if(figure instanceof ILabelFigure) {
			return ((ILabelFigure)figure).getText();
		} else if(figure instanceof CustomLinkAndCornerBentWithTextFigure) {
			return ((CustomLinkAndCornerBentWithTextFigure)figure).getCornerBentContent().getText();
		} else {
			return ((Label)figure).getText();
		}
	}
	
	
	/**
	 * handle CustomLinkAndCornerBentWithTextFigure
	 */
	protected void setLabelTextHelper(IFigure figure, String text) {
		if(figure instanceof WrappingLabel) {
			((WrappingLabel)figure).setText(text);
		} else if(figure instanceof ILabelFigure) {
			((ILabelFigure)figure).setText(text);
		} else if(figure instanceof CustomLinkAndCornerBentWithTextFigure) {
			((CustomLinkAndCornerBentWithTextFigure)figure).getCornerBentContent().setText(text);
		} else {
			((Label)figure).setText(text);
		}
	}
	
	/**
	 *handle CustomLinkAndCornerBentWithTextFigure
	 */
	protected Image getLabelIconHelper(IFigure figure) {
		if(figure instanceof WrappingLabel) {
			return ((WrappingLabel)figure).getIcon();
		} else if(figure instanceof ILabelFigure) {
			return ((ILabelFigure)figure).getIcon();
		} else if(figure instanceof CustomLinkAndCornerBentWithTextFigure) {
			return ((CustomLinkAndCornerBentWithTextFigure)figure).getCornerBentContent().getIcon();
		} else {
			return ((Label)figure).getIcon();
		}
	}
	
	/**
	 * handle CustomLinkAndCornerBentWithTextFigure
	 */
	protected void setLabelIconHelper(IFigure figure, Image icon) {
		if(figure instanceof WrappingLabel) {
			((WrappingLabel)figure).setIcon(icon);
		} else if(figure instanceof ILabelFigure) {
			((ILabelFigure)figure).setIcon(icon);
		} else if(figure instanceof CustomLinkAndCornerBentWithTextFigure) {
			((CustomLinkAndCornerBentWithTextFigure)figure).getCornerBentContent().setIcon(icon);
		} else {
			((Label)figure).setIcon(icon);
		}
	}
	
	/**
	 * sets the visibility of this edit part
	 * 
	 * @param vis
	 *        the new value of the visibility
	 */
	protected void setVisibility(boolean vis) {
		EObject element = resolveSemanticElement();
		if(element instanceof ObjectFlow) {
			Behavior transformation = ((ObjectFlow)element).getTransformation();
			if(transformation == null) {
				vis = false;
			}
		}
		super.setVisibility(vis);
	}
	
	/**
	 * Refresh the visibility in case the transformation
	 *            assignment changed
	 */
	protected void handleNotificationEvent(Notification event) {
		Object feature = event.getFeature();
		if(NotationPackage.eINSTANCE.getFontStyle_FontColor().equals(feature)) {
			Integer c = (Integer)event.getNewValue();
			setFontColor(DiagramColorRegistry.getInstance().getColor(c));
		} else if(NotationPackage.eINSTANCE.getFontStyle_Underline().equals(feature)) {
			refreshUnderline();
		} else if(NotationPackage.eINSTANCE.getFontStyle_StrikeThrough().equals(feature)) {
			refreshStrikeThrough();
		} else if(NotationPackage.eINSTANCE.getFontStyle_FontHeight().equals(feature) || NotationPackage.eINSTANCE.getFontStyle_FontName().equals(feature) || NotationPackage.eINSTANCE.getFontStyle_Bold().equals(feature) || NotationPackage.eINSTANCE.getFontStyle_Italic().equals(feature)) {
			refreshFont();
		} else {
			if(getParser() != null && getParser().isAffectingEvent(event, getParserOptions().intValue())) {
				refreshLabel();
			}
			if(getParser() instanceof ISemanticParser) {
				ISemanticParser modelParser = (ISemanticParser)getParser();
				if(modelParser.areSemanticElementsAffected(null, event)) {
					removeSemanticListeners();
					if(resolveSemanticElement() != null) {
						addSemanticListeners();
					}
					refreshLabel();
					// refresh the visibility in case the transformation
					// assignment changed
					refreshVisibility();
				}
			}
		}
		super.handleNotificationEvent(event);
	}



	/**
	 * @generated
	 */
	public class CustomLinkAndCornerBentWithTextFigure extends CornerBentFigure {

		final Color THIS_BACK = new Color(null, 248, 249, 214);

		/**
		 * @generated
		 */
		private WrappedLabel fCornerBentContent;

		/**
		 * @generated
		 */
		private PolylineShape fLinkToBehaviorProperty;

		/**
		 * @generated
		 */
		public CustomLinkAndCornerBentWithTextFigure() {
			this.setBackgroundColor(THIS_BACK);
			createContents();
		}

		/**
		 * @generated NOT do not add link in this figure
		 */
		private void createContents() {
			fCornerBentContent = new WrappedLabel();
			this.add(fCornerBentContent);
			fLinkToBehaviorProperty = new PolylineShape();
			fLinkToBehaviorProperty.setLineWidth(1);
			fLinkToBehaviorProperty.setLineStyle(Graphics.LINE_DASH);
			// do not add link in this figure but refresh it when figure moves
			addFigureListener(new FigureListener() {

				public void figureMoved(IFigure source) {
					refreshLinkToBehaviorProperty();
				}
			});
		}

		/**
		 * @see org.eclipse.draw2d.Figure#setVisible(boolean)
		 * @generated report visibility on the link
		 */
		@Override
		public void setVisible(boolean visible) {
			super.setVisible(visible);
			getLinkToBehaviorProperty().setVisible(visible);
		}

		/**
		 * Refresh the link between parent figure and this one
		 * 
		 * @generated
		 */
		private void refreshLinkToBehaviorProperty() {
			if(getLinkToBehaviorProperty().getParent() == null) {
				// add in appropriate figure
				getParent().add(getLinkToBehaviorProperty());
			}
			if(getParent() != null && getParent() instanceof ActivityEdgeFigure) {
				Point parentCenter = getReferencePoint();
				Rectangle currentBounds = getBounds();
				Point end = BehaviorPropertyNodeEditPolicy.getAppropriateBorderPoint(parentCenter, currentBounds);
				// adapt ends to bounds
				Rectangle linkBounds = new Rectangle(parentCenter, end);
				getLinkToBehaviorProperty().setStart(parentCenter.translate(linkBounds.getLocation().getNegated()));
				getLinkToBehaviorProperty().setEnd(end.translate(linkBounds.getLocation().getNegated()));
				getLinkToBehaviorProperty().setBounds(linkBounds);
			}
		}

		/**
		 * @generated
		 */
		public WrappedLabel getCornerBentContent() {
			return fCornerBentContent;
		}

		/**
		 * @generated
		 */
		public PolylineShape getLinkToBehaviorProperty() {
			return fLinkToBehaviorProperty;
		}
	}
}
