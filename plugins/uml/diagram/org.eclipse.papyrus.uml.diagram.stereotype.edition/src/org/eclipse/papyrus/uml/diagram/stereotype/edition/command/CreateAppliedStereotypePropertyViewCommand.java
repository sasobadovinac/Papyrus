/*****************************************************************************
 * Copyright (c) 2012 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Patrick Tessier (CEA LIST) Patrick.tessier@cea.fr - Initial API and implementation
 *  Celine Janssens (ALL4TEC) celine.janssens@all4tec.net - Bug 455311 : Refactor Stereotypes Display
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.stereotype.edition.command;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.notation.DecorationNode;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.uml.diagram.common.stereotype.StereotypeDisplayUtils;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * the goal of this command is to create a basic compartment in the notation that represent a compartment of stereotypes
 *
 */
public class CreateAppliedStereotypePropertyViewCommand extends RecordingCommand {

	protected View owner;

	protected Property property;

	protected EObject stereotypeApplication;

	protected Element element;

	public CreateAppliedStereotypePropertyViewCommand(TransactionalEditingDomain domain, View owner, Property property, EObject stereotypeApplication) {

		super(domain, "CreateStereotypePropertyView");
		this.owner = owner;
		this.property = property;
		this.stereotypeApplication = stereotypeApplication;
		this.element = UMLUtil.getBaseElement(stereotypeApplication);
	}

	@SuppressWarnings("unchecked")
	@Override
	public void doExecute() {

		// Create Stereotype Property into Notation Structure
		// Init
		Stereotype stereotype = UMLUtil.getStereotype(stereotypeApplication);
		String propertyName = property.getName();
		Object value = element.getValue(stereotype, propertyName);

		// Create Label
		DecorationNode propertyLabel = NotationFactory.eINSTANCE.createDecorationNode();
		propertyLabel.setType(StereotypeDisplayUtils.STEREOTYPE_PROPERTY_TYPE);
		propertyLabel.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		propertyLabel.setElement(property);

		// Add the new Label to it's owner Object
		ViewUtil.insertChildView(owner, propertyLabel, ViewUtil.APPEND, true);
		propertyLabel.setMutable(true);

	}
}
