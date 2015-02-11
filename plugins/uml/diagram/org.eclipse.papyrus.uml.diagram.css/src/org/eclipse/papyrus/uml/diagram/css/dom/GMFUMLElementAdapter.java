/*****************************************************************************
 * Copyright (c) 2013 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.css.dom;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.notation.BasicCompartment;
import org.eclipse.gmf.runtime.notation.DecorationNode;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.infra.gmfdiag.css.dom.GMFElementAdapter;
import org.eclipse.papyrus.infra.gmfdiag.css.engine.ExtendedCSSEngine;
import org.eclipse.papyrus.infra.tools.util.ListHelper;
import org.eclipse.papyrus.uml.diagram.common.stereotype.StereotypeDisplayHelper;
import org.eclipse.papyrus.uml.diagram.common.stereotype.StereotypeDisplayUtils;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;

/**
 * DOM Element Adapter for UML Elements
 *
 * Supports applied stereotypes and stereotype properties
 *
 * @author Camille Letavernier
 *
 */
public class GMFUMLElementAdapter extends GMFElementAdapter {

	public static final String APPLIED_STEREOTYPES_PROPERTY = "appliedStereotypes"; //$NON-NLS-1$

	/**
	 * The CSS Separator for qualifiers, when we must use CSS ID
	 * When we can use CSS String, we use the standard UML "::" qualifier separator
	 *
	 * NOTE: Separator "__" does not work
	 */
	public static final String QUALIFIER_SEPARATOR = "--"; //$NON-NLS-1$

	public GMFUMLElementAdapter(View view, ExtendedCSSEngine engine) {
		super(view, engine);
	}

	/**
	 * {@inheritDoc}
	 *
	 * Applied Stereotypes are manipulated as DOM Attributes
	 */
	@Override
	protected String doGetAttribute(String attr) {
		String parentValue = super.doGetAttribute(attr);
		if (parentValue != null) {
			return parentValue;
		}

		// get stereotype Label attribute
		if (StereotypeDisplayHelper.isStereotypeLabel(semanticElement)) {
			String value = getStereotypeLabelAttribute(attr);
			if (value != null && !value.isEmpty()) {
				return value;
			}
		}

		// get stereotype Compartment attribute
		if (StereotypeDisplayHelper.isStereotypeCompartment(semanticElement)) {
			String value = getStereotypeCompartmentAttribute(attr);
			if (value != null && !value.isEmpty()) {
				return value;
			}
		}

		// get stereotype Property attribute
		if (StereotypeDisplayHelper.isStereotypeProperty(semanticElement)) {

			String value = getStereotypePropertyAttribute(attr);
			if (value != null && !value.isEmpty()) {
				return value;
			}
		}


		if (semanticElement instanceof Element) {

			// Applied stereotypes
			Element currentElement = (Element) semanticElement;

			// Get applied STereotypes Attributes
			if (APPLIED_STEREOTYPES_PROPERTY.equals(attr)) {
				List<String> appliedStereotypes = new LinkedList<String>();
				for (Stereotype stereotype : currentElement.getAppliedStereotypes()) {
					appliedStereotypes.add(stereotype.getName());
					appliedStereotypes.add(stereotype.getQualifiedName());
				}
				if (!appliedStereotypes.isEmpty()) {
					return ListHelper.deepToString(appliedStereotypes, CSS_VALUES_SEPARATOR);
				}
			}
			for (EObject stereotypeApplication : currentElement.getStereotypeApplications()) {
				EStructuralFeature feature = stereotypeApplication.eClass().getEStructuralFeature(attr);
				if (feature != null) {
					if (feature.isMany()) {
						List<?> values = (List<?>) stereotypeApplication.eGet(feature);
						List<String> cssValues = new LinkedList<String>();
						for (Object value : values) {
							cssValues.add(getCSSValue(feature, value));
						}
						return ListHelper.deepToString(cssValues, CSS_VALUES_SEPARATOR);
					} else {
						Object value = stereotypeApplication.eGet(feature);
						String cssValue = getCSSValue(feature, value);
						return cssValue;
					}
				}
			}
			if (attr.contains(QUALIFIER_SEPARATOR)) {
				List<String> qualifiers = ListHelper.asList(attr.split(QUALIFIER_SEPARATOR)); // Writable list
				String propertyName = qualifiers.remove(qualifiers.size() - 1); // Last element is the property name
				// Remaining strings can be used to build the Stereotype's qualified name
				String stereotypeName = ListHelper.deepToString(qualifiers, "::"); //$NON-NLS-1$
				Stereotype appliedStereotype = currentElement.getAppliedStereotype(stereotypeName);
				if (appliedStereotype != null) {
					EObject stereotypeApplication = currentElement.getStereotypeApplication(appliedStereotype);
					EStructuralFeature feature = stereotypeApplication.eClass().getEStructuralFeature(propertyName);
					if (feature != null) {
						Object value = stereotypeApplication.eGet(feature);
						return getCSSValue(feature, value);
					}
				}
			}
		}
		return null;
	}

	/**
	 * Retrieve the Matching String Value for the StereotypeCompartment Element
	 * 
	 * @param attr
	 *            Attribute of the String to match with
	 * @return The matching value for this Attribute
	 */
	protected String getStereotypeCompartmentAttribute(String attr) {
		if (StereotypeDisplayUtils.STEREOTYPE_COMPARTMENT_NAME.equals(attr)) {

			BasicCompartment propertyCompartment = (BasicCompartment) semanticElement;
			return StereotypeDisplayHelper.getName(propertyCompartment);

		}
		return "";
	}

	/**
	 * Retrieve the Matching String Value for the StereotypeCompartment Element
	 * 
	 * @param attr
	 *            Attribute of the String to match with
	 * @return The matching value for this Attribute
	 */
	protected String getStereotypePropertyAttribute(String attr) {
		if (StereotypeDisplayUtils.STEREOTYPE_PROPERTY_NAME.equals(attr)) {

			DecorationNode propertyLabel = (DecorationNode) semanticElement;
			if (propertyLabel.getElement() instanceof Property) {
				Property prop = (Property) propertyLabel.getElement();
				String propLabel = prop.getName();
				return propLabel;
			}

		}
		return "";

	}

	/**
	 * Get the matching Value of the Attribute
	 * 
	 * @param attr
	 *            Attribute of the String to match with
	 * @return The matching value for this Attribute
	 */
	protected String getStereotypeLabelAttribute(String attr) {

		if (StereotypeDisplayUtils.STEREOTYPE_LABEL_NAME.equals(attr)) {
			DecorationNode label = (DecorationNode) semanticElement;

			String stereoName = StereotypeDisplayHelper.getName(label);
			return stereoName;

		}
		return null;
	}



	@Override
	protected String getCSSValue(EStructuralFeature feature, Object value) {
		if (feature instanceof EReference && value instanceof NamedElement) {
			return ((NamedElement) value).getName();
		}
		return super.getCSSValue(feature, value);
	}
}
