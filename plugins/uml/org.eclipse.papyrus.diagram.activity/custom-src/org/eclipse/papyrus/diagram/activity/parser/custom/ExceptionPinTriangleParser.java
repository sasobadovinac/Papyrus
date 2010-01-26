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
package org.eclipse.papyrus.diagram.activity.parser.custom;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ISemanticParser;
import org.eclipse.papyrus.diagram.activity.parsers.MessageFormatParser;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Pin;
import org.eclipse.uml2.uml.State;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * A specific parser for displaying the label of a Pin. This parser refreshes the text
 * displayed for the Pin.
 */
public class ExceptionPinTriangleParser extends MessageFormatParser implements ISemanticParser {

	private static final String STATE_DISPLAY = "\n[%s]";

	public ExceptionPinTriangleParser(EAttribute[] features, EAttribute[] editableFeatures) {
		super(features, editableFeatures);
	}

	public ExceptionPinTriangleParser(EAttribute[] features) {
		super(features);
	}

	public ExceptionPinTriangleParser() {
		super(new EAttribute[]{ UMLPackage.eINSTANCE.getNamedElement_Name() });
	}

	protected EStructuralFeature getEStructuralFeature(Object notification) {
		EStructuralFeature featureImpl = null;
		if(notification instanceof Notification) {
			Object feature = ((Notification)notification).getFeature();
			if(feature instanceof EStructuralFeature) {
				featureImpl = (EStructuralFeature)feature;
			}
		}
		return featureImpl;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.papyrus.diagram.sequence.parsers.AbstractParser#isAffectingEvent(java.lang.Object
	 * , int)
	 */
	public boolean isAffectingEvent(Object event, int flags) {
		EStructuralFeature feature = getEStructuralFeature(event);
		return isValidFeature(feature);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.papyrus.diagram.sequence.parsers.MessageFormatParser#getPrintString(org.eclipse
	 * .core.runtime.IAdaptable, int)
	 */
	public String getPrintString(IAdaptable element, int flags) {
		StringBuffer label = new StringBuffer();
		Object obj = element.getAdapter(EObject.class);
		if(obj instanceof Pin) {
			Pin pin = (Pin)obj;
			String name = pin.getName();
			if(name == null) {
				name = "";
			}
			label.append(name);
			if(pin.getInStates() != null) {
				for(State state : pin.getInStates()) {
					if(state != null) {
						String stateName = state.getName();
						if(stateName == null) {
							stateName = "";
						}
						if(!"".equals(stateName)) {
							label.append(String.format(STATE_DISPLAY, stateName));
						}
					}
				}
			}
		}
		if(label.length() == 0) {
			label.append(" ");
		}
		return label.toString();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.gmf.runtime.emf.ui.services.parser.ISemanticParser#areSemanticElementsAffected
	 * (org.eclipse.emf.ecore.EObject, java.lang.Object)
	 */
	public boolean areSemanticElementsAffected(EObject listener, Object notification) {
		EStructuralFeature feature = getEStructuralFeature(notification);
		return isValidFeature(feature);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.gmf.runtime.emf.ui.services.parser.ISemanticParser#getSemanticElementsBeingParsed
	 * (org.eclipse.emf.ecore.EObject)
	 */
	public List<?> getSemanticElementsBeingParsed(EObject element) {
		List<Element> semanticElementsBeingParsed = new ArrayList<Element>();
		if(element instanceof Pin) {
			Pin pin = (Pin)element;
			semanticElementsBeingParsed.add(pin);
			if(pin.getInStates() != null) {
				for(State state : pin.getInStates()) {
					if(state != null) {
						semanticElementsBeingParsed.add(state);
					}
				}
			}
		}
		return semanticElementsBeingParsed;
	}

	/**
	 * Determines if the given feature has to be taken into account in this parser
	 * 
	 * @param feature
	 *        the feature to test
	 * @return true if is valid, false otherwise
	 */
	private boolean isValidFeature(EStructuralFeature feature) {
		return UMLPackage.eINSTANCE.getNamedElement_Name().equals(feature) || UMLPackage.eINSTANCE.getObjectNode_InState().equals(feature);
	}
}
