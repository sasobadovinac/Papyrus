/*****************************************************************************
 * Copyright (c) 2010, 2014 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Yann Tanguy (CEA LIST) yann.tanguy@cea.fr - Initial API and implementation
 *   Mickael ADAM (ALL4TEC) mickael.adam@all4tec.net - Move to common
 * 
 *****************************************************************************/

package org.eclipse.papyrus.infra.gmfdiag.common.editpolicies;

import java.util.Collections;
import java.util.List;

import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.PrecisionRectangle;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.handles.MoveHandle;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.SetBoundsCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.LabelEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.NonResizableLabelEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramUIMessages;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.infra.gmfdiag.common.editpart.PapyrusLabelEditPart;
import org.eclipse.papyrus.infra.gmfdiag.common.utils.DiagramEditPartsUtil;

/**
 * This policy provides the selection handles, feedback and move command for
 * external node label.
 * The expected behavior is to provide an external label that can freely move and with a link feedback
 * towards its parent figure during the move.
 */
public class ExternalLabelPrimaryDragRoleEditPolicy extends NonResizableLabelEditPolicy {

	/**
	 * Creates the selection handles.
	 *
	 * @return the list
	 * @see org.eclipse.gef.editpolicies.NonResizableEditPolicy#createSelectionHandles()
	 */
	@Override
	protected List<MoveHandle> createSelectionHandles() {
		MoveHandle mh = new MoveHandle((GraphicalEditPart) getHost());
		mh.setBorder(null);
		return Collections.singletonList(mh);
	}

	/**
	 * Gets the move command.
	 *
	 * @param request
	 *            the request
	 * @return the move command
	 * @see org.eclipse.gmf.runtime.diagram.ui.editpolicies.NonResizableLabelEditPolicy#getMoveCommand(org.eclipse.gef.requests.ChangeBoundsRequest)
	 */
	@Override
	protected Command getMoveCommand(ChangeBoundsRequest request) {
		LabelEditPart editPart = (LabelEditPart) getHost();
		// FeedBack - Port + Delta
		Rectangle updatedRect = new Rectangle();
		PrecisionRectangle initialRect = new PrecisionRectangle(getInitialFeedbackBounds().getCopy());
		updatedRect = initialRect.getTranslated(getHostFigure().getParent().getBounds().getLocation().getNegated());

		// take into account the zoom
		double zoomLevel = DiagramEditPartsUtil.getDiagramZoomLevel(editPart);
		updatedRect = updatedRect.getTranslated(request.getMoveDelta().scale(1 / zoomLevel));

		// translate according to the text alignments
		if (editPart instanceof PapyrusLabelEditPart) {
			switch (((PapyrusLabelEditPart) editPart).getTextAlignment()) {
			case PositionConstants.LEFT:
				break;
			case PositionConstants.CENTER:
				updatedRect.translate(getHostFigure().getBounds().width / 2, 0);
				break;
			case PositionConstants.RIGHT:
				updatedRect.translate(getHostFigure().getBounds().width, 0);
				break;
			default:
				break;
			}
		}

		ICommand moveCommand = new SetBoundsCommand(editPart.getEditingDomain(), DiagramUIMessages.MoveLabelCommand_Label_Location, new EObjectAdapter((View) editPart.getModel()), updatedRect);
		return new ICommandProxy(moveCommand);
	}
}
