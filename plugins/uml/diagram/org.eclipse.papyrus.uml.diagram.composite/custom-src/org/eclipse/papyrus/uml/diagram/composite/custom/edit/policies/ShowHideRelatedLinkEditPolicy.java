/*****************************************************************************
 * Copyright (c) 2016 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Benoit Maggi (CEA LIST) benoit.maggi@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.composite.custom.edit.policies;

import org.eclipse.papyrus.infra.gmfdiag.common.structure.DiagramStructure;
import org.eclipse.papyrus.infra.gmfdiag.common.updater.DiagramUpdater;
import org.eclipse.papyrus.uml.diagram.common.editpolicies.AbstractUMLShowHideRelatedLinkEditPolicy;
import org.eclipse.papyrus.uml.diagram.composite.part.UMLDiagramUpdater;
import org.eclipse.papyrus.uml.diagram.composite.part.UMLVisualIDRegistry;

/**
 * Show Hide Related link editpolicy for Composite Diagram
 *
 *
 */
public class ShowHideRelatedLinkEditPolicy extends AbstractUMLShowHideRelatedLinkEditPolicy {

	/**
	 *
	 * Constructor.
	 *
	 * @param host
	 */
	public ShowHideRelatedLinkEditPolicy() {
		super();
	}


	/**
	 * {@inheritDoc}
	 */
	@Override
	public DiagramUpdater getDiagramUpdater() {
		return UMLDiagramUpdater.INSTANCE;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.papyrus.infra.gmfdiag.common.editpolicies.IDiagramInformationProviderEditPolicy#getDiagramStructure()
	 *
	 * @return
	 */

	@Override
	public DiagramStructure getDiagramStructure() {
		return UMLVisualIDRegistry.TYPED_INSTANCE;
	}
}
