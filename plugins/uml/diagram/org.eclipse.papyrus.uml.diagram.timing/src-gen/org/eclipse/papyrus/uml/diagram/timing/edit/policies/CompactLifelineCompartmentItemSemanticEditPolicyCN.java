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
package org.eclipse.papyrus.uml.diagram.timing.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.papyrus.infra.gmfdiag.common.utils.DiagramUtils;
import org.eclipse.papyrus.uml.diagram.timing.edit.commands.CompactStateInvariantCreateCommandCN;
import org.eclipse.papyrus.uml.diagram.timing.edit.commands.DestructionOccurrenceSpecificationCreateCommandCN;
import org.eclipse.papyrus.uml.diagram.timing.edit.commands.DurationConstraintCreateCommandCN;
import org.eclipse.papyrus.uml.diagram.timing.edit.commands.DurationObservationCreateCommandCN;
import org.eclipse.papyrus.uml.diagram.timing.edit.commands.GeneralOrderingCreateCommand;
import org.eclipse.papyrus.uml.diagram.timing.edit.commands.MessageOccurrenceSpecificationCreateCommandCN;
import org.eclipse.papyrus.uml.diagram.timing.edit.commands.OccurrenceSpecificationCreateCommandCN;
import org.eclipse.papyrus.uml.diagram.timing.edit.commands.TimeConstraintCreateCommand;
import org.eclipse.papyrus.uml.diagram.timing.edit.commands.TimeObservationCreateCommand;
import org.eclipse.papyrus.uml.diagram.timing.providers.UMLElementTypes;

/**
 * @generated
 */
public class CompactLifelineCompartmentItemSemanticEditPolicyCN extends UMLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CompactLifelineCompartmentItemSemanticEditPolicyCN() {
		super(UMLElementTypes.Lifeline_CompactShape);
	}

	/**
	 * @generated
	 */
	@Override
	protected Command getCreateCommand(CreateElementRequest req) {
		IElementType requestElementType = req.getElementType();
		if (requestElementType == null) {
			return super.getCreateCommand(req);
		}


		if (UMLElementTypes.StateInvariant_CompactShape == requestElementType) {

			return getGEFWrapper(new CompactStateInvariantCreateCommandCN(req, DiagramUtils.getDiagramFrom(getHost())));

		}
		if (UMLElementTypes.OccurrenceSpecification_Shape == requestElementType) {

			return getGEFWrapper(new OccurrenceSpecificationCreateCommandCN(req, DiagramUtils.getDiagramFrom(getHost())));

		}
		if (UMLElementTypes.MessageOccurrenceSpecification_Shape == requestElementType) {

			return getGEFWrapper(new MessageOccurrenceSpecificationCreateCommandCN(req, DiagramUtils.getDiagramFrom(getHost())));

		}
		if (UMLElementTypes.DestructionOccurrenceSpecification_Shape == requestElementType) {

			return getGEFWrapper(new DestructionOccurrenceSpecificationCreateCommandCN(req, DiagramUtils.getDiagramFrom(getHost())));

		}
		if (UMLElementTypes.DurationConstraint_Shape == requestElementType) {

			return getGEFWrapper(new DurationConstraintCreateCommandCN(req, DiagramUtils.getDiagramFrom(getHost())));

		}
		if (UMLElementTypes.DurationObservation_Shape == requestElementType) {

			return getGEFWrapper(new DurationObservationCreateCommandCN(req, DiagramUtils.getDiagramFrom(getHost())));

		}
		if (UMLElementTypes.TimeConstraint_Shape == requestElementType) {

			return getGEFWrapper(new TimeConstraintCreateCommand(req, DiagramUtils.getDiagramFrom(getHost())));

		}
		if (UMLElementTypes.TimeObservation_Shape == requestElementType) {

			return getGEFWrapper(new TimeObservationCreateCommand(req, DiagramUtils.getDiagramFrom(getHost())));

		}
		if (UMLElementTypes.GeneralOrdering_Shape == requestElementType) {

			return getGEFWrapper(new GeneralOrderingCreateCommand(req, DiagramUtils.getDiagramFrom(getHost())));

		}
		return super.getCreateCommand(req);
	}
}
