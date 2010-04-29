/*****************************************************************************
 * Copyright (c) 2010 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *****************************************************************************/
package org.eclipse.papyrus.sysml.diagram.blockdefinition.provider;

import org.eclipse.gmf.runtime.diagram.ui.services.editpart.AbstractEditPartProvider;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.sysml.diagram.blockdefinition.edit.part.BlockDefinitionDiagramEditPart;



public class BlockDefinitionDiagramEditPartProvider extends AbstractEditPartProvider {

	protected Class getDiagramEditPartClass(View view) {
		if(BlockDefinitionDiagramEditPart.DIAGRAM_ID.equals(view.getType())) {
			return BlockDefinitionDiagramEditPart.class;
		}
		return null;
	}

}
