/*****************************************************************************
 * Copyright (c) 2012, 2014 CEA LIST and others.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Patrick Tessier (CEA LIST) Patrick.tessier@cea.fr - Initial API and implementation
 *  Christian W. Damus (CEA) - bug 323802
 *  Gabriel Pascual (ALL4TEC) - Bug 441195
 *  Celine Janssens (ALL4TEC) celine.janssens@all4tec.net - Bug 455311 : Refactor Stereotypes Display
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.stereotype.edition.editpolicies;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.uml.diagram.common.editpolicies.AppliedStereotypeNodeLabelDisplayEditPolicy;
import org.eclipse.uml2.uml.Element;

/**
 * This editPolicy is used to add dynamically labels of stereotypes into nodes in the context of AppliedStereorypeCompartmentEditpart
 */
public class AppliedStereotypePropertiesEditPolicy extends AppliedStereotypeNodeLabelDisplayEditPolicy {


	public static String APPLIED_STEREOTYPE_VISIBILITY_COMPARTMENT = "AppliedStereotypeVisibilityEditPolicy";

	/**
	 * Creates a new AppliedStereotype display edit policy
	 */
	public AppliedStereotypePropertiesEditPolicy() {
		super();
	}

	/**
	 * Returns the uml element controlled by the host edit part
	 *
	 * @return the uml element controlled by the host edit part
	 */
	@Override
	protected Element getUMLElement() {
		Element element = null;

		View view = getView();
		if (view != null) {

			EObject container = view.eContainer();
			if (container instanceof View) {
				element = (Element) ((View) container).getElement();
			}
		}

		return element;
	}

	/**
	 *
	 * @see org.eclipse.papyrus.uml.diagram.common.editpolicies.AbstractAppliedStereotypeDisplayEditPolicy#getView()
	 *
	 * @return
	 */
	@Override
	protected View getView() {
		View view = null;

		Object model = getHost().getModel();
		if (model instanceof View) {

			EObject container = ((View) model).eContainer();
			if (container instanceof View) {
				view = (View) container;
			}
		}
		return view;
	}


}

