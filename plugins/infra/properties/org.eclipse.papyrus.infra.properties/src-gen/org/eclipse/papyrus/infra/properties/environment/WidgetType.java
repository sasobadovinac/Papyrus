/*****************************************************************************
 * Copyright (c) 2011 CEA LIST.
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
 *****************************************************************************/
package org.eclipse.papyrus.infra.properties.environment;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Widget Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.infra.properties.environment.WidgetType#getLabel <em>Label</em>}</li>
 * <li>{@link org.eclipse.papyrus.infra.properties.environment.WidgetType#getWidgetClass <em>Widget Class</em>}</li>
 * <li>{@link org.eclipse.papyrus.infra.properties.environment.WidgetType#getNamespace <em>Namespace</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.infra.properties.environment.EnvironmentPackage#getWidgetType()
 * @model abstract="true"
 * @generated
 */
public interface WidgetType extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see org.eclipse.papyrus.infra.properties.environment.EnvironmentPackage#getWidgetType_Label()
	 * @model required="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.infra.properties.environment.WidgetType#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Widget Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Widget Class</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Widget Class</em>' attribute.
	 * @see #setWidgetClass(String)
	 * @see org.eclipse.papyrus.infra.properties.environment.EnvironmentPackage#getWidgetType_WidgetClass()
	 * @model required="true"
	 * @generated
	 */
	String getWidgetClass();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.infra.properties.environment.WidgetType#getWidgetClass <em>Widget Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Widget Class</em>' attribute.
	 * @see #getWidgetClass()
	 * @generated
	 */
	void setWidgetClass(String value);

	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namespace</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Namespace</em>' reference.
	 * @see #setNamespace(Namespace)
	 * @see org.eclipse.papyrus.infra.properties.environment.EnvironmentPackage#getWidgetType_Namespace()
	 * @model
	 * @generated
	 */
	Namespace getNamespace();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.infra.properties.environment.WidgetType#getNamespace <em>Namespace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Namespace</em>' reference.
	 * @see #getNamespace()
	 * @generated
	 */
	void setNamespace(Namespace value);

} // WidgetType
