/*****************************************************************************
 * Copyright (c) 2010 CEA
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Soyatec - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.sequence.figures;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.gmf.runtime.draw2d.ui.mapmode.IMapMode;
import org.eclipse.swt.SWT;

/**
 * @author Jin Liu (jin.liu@soyatec.com)
 */
public class MessageCreate extends MessageFigure {

	/**
	 * Constructor.
	 *
	 */
	public MessageCreate() {
		super();
		setStyle();
	}

	/**
	 * Constructor.
	 *
	 * @param mapMode
	 */
	public MessageCreate(IMapMode mapMode) {
		super(mapMode);
		setStyle();

	}

	protected void setStyle() {
		this.setLineStyle(SWT.LINE_DASH);
		this.setForegroundColor(ColorConstants.black);
	}

	/**
	 * @see org.eclipse.papyrus.uml.diagram.sequence.figures.MessageFigure#createTargetDecoration()
	 *
	 * @return
	 */
	@Override
	protected RotatableDecoration createTargetDecoration() {
		PolylineDecoration df = new PolylineDecoration();
		df.setForegroundColor(getForegroundColor());
		PointList pl = new PointList();
		// pl.addPoint(getMapMode().DPtoLP(-2), getMapMode().DPtoLP(2));
		// pl.addPoint(getMapMode().DPtoLP(0), getMapMode().DPtoLP(0));
		// pl.addPoint(getMapMode().DPtoLP(-2), getMapMode().DPtoLP(-2));
		// df.setTemplate(pl);
		// df.setScale(getMapMode().DPtoLP(7), getMapMode().DPtoLP(3));
		return df;
	}

	/**
	 * @see org.eclipse.papyrus.uml.diagram.sequence.figures.MessageFigure#createSourceDecoration()
	 *
	 * @return
	 */
	@Override
	protected RotatableDecoration createSourceDecoration() {
		return null;
	}

	/**
	 * @see org.eclipse.draw2d.Figure#paint(org.eclipse.draw2d.Graphics)
	 *
	 * @param graphics
	 */
	@Override
	public void paint(Graphics graphics) {
		super.paint(graphics);
		graphics.pushState();
		graphics.setLineStyle(SWT.LINE_DASH);
		graphics.popState();

	}
}
