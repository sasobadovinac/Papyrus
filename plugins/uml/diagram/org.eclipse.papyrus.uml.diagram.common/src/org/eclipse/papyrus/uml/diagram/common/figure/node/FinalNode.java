/*****************************************************************************
 * Copyright (c) 2010 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *  Patrick Tessier (CEA LIST) Patrick.tessier@cea.fr - Initial API and implementation
 */
package org.eclipse.papyrus.uml.diagram.common.figure.node;

import org.eclipse.draw2d.Border;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.papyrus.infra.gmfdiag.common.figure.node.PapyrusWrappingLabel;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;

/**
 * this figure is a final node a circle into a circle
 *
 */
// unused! to delete
public class FinalNode extends PapyrusNodeFigure implements IPapyrusNodeUMLElementFigure {

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Border getDefaultBorder(Color borderColor) {
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Dimension getPreferredSize(int wHint, int hHint) {
		
		return new Dimension(20, 20);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void paintFigure(Graphics graphics) {

		final int space = 5;
		Rectangle f = Rectangle.SINGLETON;
		// to be in adequation with the figure node plate
		Rectangle r = getBounds().getCopy().crop(new Insets(0, 0, 1, 1));
		graphics.setBackgroundColor(getForegroundColor());
		graphics.drawOval(r);
		f.x = r.x + space;
		f.y = r.y + space;
		f.width = r.width - space * 2;
		f.height = r.height - space * 2;
		graphics.setBackgroundColor(getForegroundColor());
		graphics.fillOval(f);

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setStereotypeDisplay(String stereotypes, Image image) {
		

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setStereotypePropertiesInBrace(String stereotypeProperties) {
		

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setStereotypePropertiesInCompartment(String stereotypeProperties) {
		

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PapyrusWrappingLabel getStereotypesLabel() {
		return new PapyrusWrappingLabel();
	}
}
