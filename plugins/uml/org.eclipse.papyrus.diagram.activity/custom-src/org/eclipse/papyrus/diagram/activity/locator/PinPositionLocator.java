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
package org.eclipse.papyrus.diagram.activity.locator;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Polyline;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.draw2d.ui.mapmode.IMapMode;
import org.eclipse.gmf.runtime.draw2d.ui.mapmode.MapModeUtil;
import org.eclipse.papyrus.diagram.activity.edit.parts.ActionInputPinInCallBeActEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ActionInputPinInCallOpActAsTargetEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ActionInputPinInCallOpActEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ActionInputPinInOpaqueActEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.InputPinInCallBeActEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.InputPinInCallOpActAsTargetEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.InputPinInCallOpActEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.InputPinInOpaqueActEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.OutputPinInCallBeActEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.OutputPinInCallOpActEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.OutputPinInOpaqueActEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ValuePinInCallBeActEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ValuePinInCallOpActAsTargetEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ValuePinInCallOpActEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ValuePinInOpaqueActEditPart;
import org.eclipse.papyrus.diagram.activity.helper.ActivityFigureDrawer;
import org.eclipse.papyrus.diagram.common.locator.AdvancedBorderItemLocator;

/**
 * This class is used to constrain the position of Pin
 * 
 * TODO : The pin is not re-sizable
 */
public class PinPositionLocator extends AdvancedBorderItemLocator {

	/** The offset to add to default position. (to avoid corner of rounded rectangles) */
	private static final int EXTRA_BORDER_DEFAULT_OFFSET = 8;

	/** Constructor **/
	public PinPositionLocator(IFigure parentFigure) {
		super(parentFigure);
	}

	/** Constructor **/
	public PinPositionLocator(IFigure borderItem, IFigure parentFigure, Rectangle constraint) {
		super(borderItem, parentFigure, constraint);
	}

	/** Constructor **/
	public PinPositionLocator(IFigure parentFigure, int preferredSide) {
		super(parentFigure, preferredSide);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Rectangle getValidLocation(Rectangle proposedLocation, IFigure borderItem) {
		Rectangle realLocation = new Rectangle(proposedLocation);
		realLocation.width = Math.max(realLocation.width, realLocation.height);
		realLocation.height = realLocation.width;
		int side = findClosestSideOfParent(proposedLocation, getParentBorder());
		Point newTopLeft = locateOnBorder(realLocation.getTopLeft(), side, 0, borderItem);
		realLocation.setLocation(newTopLeft);
		return realLocation;
	}

	/**
	 * Re-arrange the location of the border item, and also the contained arrow.
	 * 
	 * @see org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator#relocate(org.eclipse.draw2d.IFigure)
	 * 
	 * @param borderItem
	 */
	@Override
	public void relocate(IFigure borderItem) {
		// reset bounds of borderItem
		Dimension size = getSize(borderItem);
		Rectangle rectSuggested = getConstraint();
		if(rectSuggested.getTopLeft().x == 0 && rectSuggested.getTopLeft().y == 0) {
			rectSuggested.setLocation(getPreferredLocation(borderItem));
		}
		rectSuggested.setSize(size);
		setConstraint(getValidLocation(rectSuggested, borderItem));
		borderItem.setBounds(getConstraint().getCopy());
		// ensure the side property is correctly set
		setCurrentSideOfParent(findClosestSideOfParent(borderItem.getBounds(), getParentBorder()));
		// refresh the arrow depending on the Pin type and the side on which it is located
		for(Object subfigure : borderItem.getChildren()) {
			if(subfigure instanceof IFigure) {
				for(Object child : ((IFigure)subfigure).getChildren()) {
					refreshPinDescriptorArrow(child, MapModeUtil.getMapMode(borderItem), size);
				}
			}
		}
	}

	/**
	 * Refresh the arrow in case child is a Pin Descriptor
	 * 
	 * @param child
	 *        the Pin Descriptor (no effect otherwise)
	 * @param mapMode
	 *        the IMapMode
	 * @param size
	 *        the size of the border item
	 */
	private void refreshPinDescriptorArrow(Object child, IMapMode mapMode, Dimension size) {
		boolean arrowIn = false;
		Polyline arrow = null;
		if(child instanceof InputPinInOpaqueActEditPart.PinDescriptor) {
			arrowIn = true;
			arrow = ((InputPinInOpaqueActEditPart.PinDescriptor)child).getOptionalArrowFigure();
		} else if(child instanceof InputPinInCallBeActEditPart.PinDescriptor) {
			arrowIn = true;
			arrow = ((InputPinInCallBeActEditPart.PinDescriptor)child).getOptionalArrowFigure();
		} else if(child instanceof InputPinInCallOpActEditPart.PinDescriptor) {
			arrowIn = true;
			arrow = ((InputPinInCallOpActEditPart.PinDescriptor)child).getOptionalArrowFigure();
		} else if(child instanceof InputPinInCallOpActAsTargetEditPart.PinDescriptor) {
			arrowIn = true;
			arrow = ((InputPinInCallOpActAsTargetEditPart.PinDescriptor)child).getOptionalArrowFigure();
		} else if(child instanceof ActionInputPinInOpaqueActEditPart.PinDescriptor) {
			arrowIn = true;
			arrow = ((ActionInputPinInOpaqueActEditPart.PinDescriptor)child).getOptionalArrowFigure();
		} else if(child instanceof ActionInputPinInCallBeActEditPart.PinDescriptor) {
			arrowIn = true;
			arrow = ((ActionInputPinInCallBeActEditPart.PinDescriptor)child).getOptionalArrowFigure();
		} else if(child instanceof ActionInputPinInCallOpActEditPart.PinDescriptor) {
			arrowIn = true;
			arrow = ((ActionInputPinInCallOpActEditPart.PinDescriptor)child).getOptionalArrowFigure();
		} else if(child instanceof ActionInputPinInCallOpActAsTargetEditPart.PinDescriptor) {
			arrowIn = true;
			arrow = ((ActionInputPinInCallOpActAsTargetEditPart.PinDescriptor)child).getOptionalArrowFigure();
		} else if(child instanceof ValuePinInOpaqueActEditPart.PinDescriptor) {
			arrowIn = true;
			arrow = ((ValuePinInOpaqueActEditPart.PinDescriptor)child).getOptionalArrowFigure();
		} else if(child instanceof ValuePinInCallBeActEditPart.PinDescriptor) {
			arrowIn = true;
			arrow = ((ValuePinInCallBeActEditPart.PinDescriptor)child).getOptionalArrowFigure();
		} else if(child instanceof ValuePinInCallOpActEditPart.PinDescriptor) {
			arrowIn = true;
			arrow = ((ValuePinInCallOpActEditPart.PinDescriptor)child).getOptionalArrowFigure();
		} else if(child instanceof ValuePinInCallOpActAsTargetEditPart.PinDescriptor) {
			arrowIn = true;
			arrow = ((ValuePinInCallOpActAsTargetEditPart.PinDescriptor)child).getOptionalArrowFigure();
		} else if(child instanceof OutputPinInOpaqueActEditPart.PinDescriptor) {
			arrowIn = false;
			arrow = ((OutputPinInOpaqueActEditPart.PinDescriptor)child).getOptionalArrowFigure();
		} else if(child instanceof OutputPinInCallBeActEditPart.PinDescriptor) {
			arrowIn = false;
			arrow = ((OutputPinInCallBeActEditPart.PinDescriptor)child).getOptionalArrowFigure();
		} else if(child instanceof OutputPinInCallOpActEditPart.PinDescriptor) {
			arrowIn = false;
			arrow = ((OutputPinInCallOpActEditPart.PinDescriptor)child).getOptionalArrowFigure();
		}
		if(arrow != null) {
			int arrowDirection;
			int side = getCurrentSideOfParent();
			switch(side) {
			case PositionConstants.NORTH:
				if(arrowIn) {
					arrowDirection = PositionConstants.SOUTH;
				} else {
					arrowDirection = PositionConstants.NORTH;
				}
				break;
			case PositionConstants.EAST:
				if(arrowIn) {
					arrowDirection = PositionConstants.WEST;
				} else {
					arrowDirection = PositionConstants.EAST;
				}
				break;
			case PositionConstants.SOUTH:
				if(arrowIn) {
					arrowDirection = PositionConstants.NORTH;
				} else {
					arrowDirection = PositionConstants.SOUTH;
				}
				break;
			case PositionConstants.WEST:
			default:
				if(arrowIn) {
					arrowDirection = PositionConstants.EAST;
				} else {
					arrowDirection = PositionConstants.WEST;
				}
			}
			ActivityFigureDrawer.redrawPinArrow(arrow, mapMode, size, arrowDirection);
		}
	}

	/**
	 * Get an initial location based on the side. ( appropriate extremity of the side )
	 * 
	 * @param side
	 *        the preferred side of the parent figure on which to place this
	 *        border item as defined in {@link PositionConstants}
	 * @return point
	 */
	protected Point getPreferredLocation(int side, IFigure borderItem) {
		Rectangle bounds = getParentBorder();
		int parentFigureWidth = bounds.width;
		int parentFigureHeight = bounds.height;
		int parentFigureX = bounds.x;
		int parentFigureY = bounds.y;
		int x = parentFigureX;
		int y = parentFigureY;

		Dimension borderItemSize = getSize(borderItem);
		switch(side) {
		case PositionConstants.NORTH:
			x += EXTRA_BORDER_DEFAULT_OFFSET + getBorderItemOffset().width;
			y += -borderItemSize.height + getBorderItemOffset().height;
			break;
		case PositionConstants.EAST:
			// take south east extremity to allow following pins placing above
			x += parentFigureWidth - getBorderItemOffset().width;
			y += parentFigureHeight - borderItemSize.height - EXTRA_BORDER_DEFAULT_OFFSET - getBorderItemOffset().height;
			break;
		case PositionConstants.SOUTH:
			x += EXTRA_BORDER_DEFAULT_OFFSET + getBorderItemOffset().width;
			y += parentFigureHeight - getBorderItemOffset().height;
			break;
		case PositionConstants.WEST:
		default:
			x += -borderItemSize.width + getBorderItemOffset().width;
			y += EXTRA_BORDER_DEFAULT_OFFSET + getBorderItemOffset().height;
		}
		return new Point(x, y);
	}

}
