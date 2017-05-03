/**
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
 */
package org.eclipse.papyrus.uml.expressions.umlexpressions.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.papyrus.uml.expressions.umlexpressions.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UMLExpressionsFactoryImpl extends EFactoryImpl implements UMLExpressionsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UMLExpressionsFactory init() {
		try {
			UMLExpressionsFactory theUMLExpressionsFactory = (UMLExpressionsFactory)EPackage.Registry.INSTANCE.getEFactory(UMLExpressionsPackage.eNS_URI);
			if (theUMLExpressionsFactory != null) {
				return theUMLExpressionsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UMLExpressionsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLExpressionsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case UMLExpressionsPackage.IS_STEREOTYPED_WITH_EXPRESSION: return createIsStereotypedWithExpression();
			case UMLExpressionsPackage.HAS_APPLIED_STEREOTYPES_EXPRESSION: return createHasAppliedStereotypesExpression();
			case UMLExpressionsPackage.IS_TYPE_OF_EXPRESSION: return createIsTypeOfExpression();
			case UMLExpressionsPackage.IS_KIND_OF_EXPRESSION: return createIsKindOfExpression();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsStereotypedWithExpression createIsStereotypedWithExpression() {
		IsStereotypedWithExpressionImpl isStereotypedWithExpression = new IsStereotypedWithExpressionImpl();
		return isStereotypedWithExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HasAppliedStereotypesExpression createHasAppliedStereotypesExpression() {
		HasAppliedStereotypesExpressionImpl hasAppliedStereotypesExpression = new HasAppliedStereotypesExpressionImpl();
		return hasAppliedStereotypesExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsTypeOfExpression createIsTypeOfExpression() {
		IsTypeOfExpressionImpl isTypeOfExpression = new IsTypeOfExpressionImpl();
		return isTypeOfExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsKindOfExpression createIsKindOfExpression() {
		IsKindOfExpressionImpl isKindOfExpression = new IsKindOfExpressionImpl();
		return isKindOfExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLExpressionsPackage getUMLExpressionsPackage() {
		return (UMLExpressionsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UMLExpressionsPackage getPackage() {
		return UMLExpressionsPackage.eINSTANCE;
	}

} //UMLExpressionsFactoryImpl
