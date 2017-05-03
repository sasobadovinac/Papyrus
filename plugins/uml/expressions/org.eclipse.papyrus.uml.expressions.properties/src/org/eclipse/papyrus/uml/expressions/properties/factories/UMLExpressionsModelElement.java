/*****************************************************************************
 * Copyright (c) 2017 CEA LIST.
 * 
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 	Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *   
 *****************************************************************************/

package org.eclipse.papyrus.uml.expressions.properties.factories;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.papyrus.infra.properties.ui.modelelement.EMFModelElement;
import org.eclipse.papyrus.infra.widgets.providers.IStaticContentProvider;
import org.eclipse.papyrus.uml.expressions.properties.factories.utils.UMLExpressionsConstants;
import org.eclipse.papyrus.uml.tools.providers.UMLEClassContentProvider;
import org.eclipse.papyrus.uml.tools.providers.UMLEClassLabelProvider;

/**
 * ModelElement used for UML Expressions, to define the label provider and the content provider to use for some edited features of UML Expressions.
 *
 */
public class UMLExpressionsModelElement extends EMFModelElement {

	/**
	 * Constructor.
	 *
	 * @param source
	 * @param domain
	 */
	public UMLExpressionsModelElement(EObject source, EditingDomain domain) {
		super(source, domain);
	}

	/**
	 * Constructor.
	 *
	 * @param source
	 */
	public UMLExpressionsModelElement(EObject source) {
		super(source);
	}

	/**
	 * @see org.eclipse.papyrus.infra.properties.ui.modelelement.EMFModelElement#getContentProvider(java.lang.String)
	 *
	 * @param propertyPath
	 * @return
	 */
	@Override
	public IStaticContentProvider getContentProvider(String propertyPath) {
		if (UMLExpressionsConstants.UML_ECLASS.equals(propertyPath)) {
			return new UMLEClassContentProvider();
		}
		return super.getContentProvider(propertyPath);
	}


	/**
	 * @see org.eclipse.papyrus.infra.properties.ui.modelelement.EMFModelElement#getLabelProvider(java.lang.String)
	 *
	 * @param propertyPath
	 * @return
	 */
	@Override
	public ILabelProvider getLabelProvider(String propertyPath) {
		if (UMLExpressionsConstants.UML_ECLASS.equals(propertyPath)) {
			return new UMLEClassLabelProvider();
		}
		return super.getLabelProvider(propertyPath);
	}

}
