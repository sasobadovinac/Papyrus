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
package org.eclipse.papyrus.uml.diagram.communication.edit.parts;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.papyrus.infra.gmfdiag.tooling.runtime.directedit.locator.CellEditorLocatorAccess;
import org.eclipse.papyrus.uml.diagram.common.figure.node.IMultilineEditableFigure;
import org.eclipse.papyrus.uml.diagram.communication.part.UMLVisualIDRegistry;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;

/**
 * @generated
 */
public class UMLEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (UMLVisualIDRegistry.getVisualID(view)) {

			case ModelEditPart.VISUAL_ID:
				return new ModelEditPart(view);

			case InteractionEditPart.VISUAL_ID:
				return new InteractionEditPart(view);

			case InteractionNameEditPart.VISUAL_ID:
				return new InteractionNameEditPart(view);

			case InteractionFloatingLabelEditPart.VISUAL_ID:
				return new InteractionFloatingLabelEditPart(view);

			case LifelineEditPartCN.VISUAL_ID:
				return new LifelineEditPartCN(view);

			case LifelineNameEditPart.VISUAL_ID:
				return new LifelineNameEditPart(view);

			case LifelineFloatingLabelEditPartCN.VISUAL_ID:
				return new LifelineFloatingLabelEditPartCN(view);

			case ConstraintEditPartCN.VISUAL_ID:
				return new ConstraintEditPartCN(view);

			case ConstraintNameEditPartCN.VISUAL_ID:
				return new ConstraintNameEditPartCN(view);

			case ConstraintBodyEditPartCN.VISUAL_ID:
				return new ConstraintBodyEditPartCN(view);

			case CommentEditPartCN.VISUAL_ID:
				return new CommentEditPartCN(view);

			case CommentBodyEditPartCN.VISUAL_ID:
				return new CommentBodyEditPartCN(view);

			case TimeObservationEditPartCN.VISUAL_ID:
				return new TimeObservationEditPartCN(view);

			case TimeObservationNameEditPartCN.VISUAL_ID:
				return new TimeObservationNameEditPartCN(view);

			case TimeObservationStereotypeLabelEditPartCN.VISUAL_ID:
				return new TimeObservationStereotypeLabelEditPartCN(view);

			case DurationObservationEditPartCN.VISUAL_ID:
				return new DurationObservationEditPartCN(view);

			case DurationObservationLabelEditPartCN.VISUAL_ID:
				return new DurationObservationLabelEditPartCN(view);

			case DurationObservationStereotypeLabelEditPartCN.VISUAL_ID:
				return new DurationObservationStereotypeLabelEditPartCN(view);

			case InteractionCompartmentEditPart.VISUAL_ID:
				return new InteractionCompartmentEditPart(view);

			case MessageEditPart.VISUAL_ID:
				return new MessageEditPart(view);

			case MessageNameEditPart.VISUAL_ID:
				return new MessageNameEditPart(view);

			case AppliedStereotypeMessageEditPart.VISUAL_ID:
				return new AppliedStereotypeMessageEditPart(view);


			case CommentAnnotatedElementEditPart.VISUAL_ID:
				return new CommentAnnotatedElementEditPart(view);


			case ConstraintConstrainedElementEditPart.VISUAL_ID:
				return new ConstraintConstrainedElementEditPart(view);


			case ConnectorDurationObservationEditPart.VISUAL_ID:
				return new ConnectorDurationObservationEditPart(view);


			case ConnectorTimeObservationEditPart.VISUAL_ID:
				return new ConnectorTimeObservationEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		if (source.getFigure() instanceof IMultilineEditableFigure) {
			return new MultilineCellEditorLocator(
					(IMultilineEditableFigure) source.getFigure());
		} else {
			return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);

		}
	}

	/**
	 * @generated
	 */
	static private class MultilineCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private IMultilineEditableFigure multilineEditableFigure;

		/**
		 * @generated
		 */
		public MultilineCellEditorLocator(IMultilineEditableFigure figure) {
			this.multilineEditableFigure = figure;
		}

		/**
		 * @generated
		 */
		public IMultilineEditableFigure getMultilineEditableFigure() {
			return multilineEditableFigure;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getMultilineEditableFigure().getBounds().getCopy();
			rect.x = getMultilineEditableFigure().getEditionLocation().x;
			rect.y = getMultilineEditableFigure().getEditionLocation().y;
			getMultilineEditableFigure().translateToAbsolute(rect);
			if (getMultilineEditableFigure().getText().length() > 0) {
				rect.setSize(new Dimension(text.computeSize(rect.width,
						SWT.DEFAULT)));
			}
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}

}
