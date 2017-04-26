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
package org.eclipse.papyrus.infra.emf.expressions.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.papyrus.infra.emf.expressions.ExpressionCatalog;
import org.eclipse.papyrus.infra.emf.expressions.ExpressionsFactory;
import org.eclipse.papyrus.infra.emf.expressions.ExpressionsPackage;
import org.eclipse.papyrus.infra.emf.expressions.IBasicExpressionElement;
import org.eclipse.papyrus.infra.emf.expressions.IExpression;

import org.eclipse.papyrus.infra.emf.expressions.booleanexpressions.BooleanExpressionsPackage;

import org.eclipse.papyrus.infra.emf.expressions.booleanexpressions.impl.BooleanExpressionsPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExpressionsPackageImpl extends EPackageImpl implements ExpressionsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iBasicExpressionElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionCatalogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType boolEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.papyrus.infra.emf.expressions.ExpressionsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ExpressionsPackageImpl() {
		super(eNS_URI, ExpressionsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ExpressionsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ExpressionsPackage init() {
		if (isInited) return (ExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI);

		// Obtain or create and register package
		ExpressionsPackageImpl theExpressionsPackage = (ExpressionsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ExpressionsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ExpressionsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TypesPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		BooleanExpressionsPackageImpl theBooleanExpressionsPackage = (BooleanExpressionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BooleanExpressionsPackage.eNS_URI) instanceof BooleanExpressionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BooleanExpressionsPackage.eNS_URI) : BooleanExpressionsPackage.eINSTANCE);

		// Create package meta-data objects
		theExpressionsPackage.createPackageContents();
		theBooleanExpressionsPackage.createPackageContents();

		// Initialize created meta-data
		theExpressionsPackage.initializePackageContents();
		theBooleanExpressionsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theExpressionsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ExpressionsPackage.eNS_URI, theExpressionsPackage);
		return theExpressionsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIBasicExpressionElement() {
		return iBasicExpressionElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIBasicExpressionElement_Name() {
		return (EAttribute)iBasicExpressionElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIBasicExpressionElement_Description() {
		return (EAttribute)iBasicExpressionElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIExpression() {
		return iExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIExpression__Evaluate__Object() {
		return iExpressionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpressionCatalog() {
		return expressionCatalogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpressionCatalog_Expressions() {
		return (EReference)expressionCatalogEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEClass() {
		return eClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEObject() {
		return eObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBool() {
		return boolEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionsFactory getExpressionsFactory() {
		return (ExpressionsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		iBasicExpressionElementEClass = createEClass(IBASIC_EXPRESSION_ELEMENT);
		createEAttribute(iBasicExpressionElementEClass, IBASIC_EXPRESSION_ELEMENT__NAME);
		createEAttribute(iBasicExpressionElementEClass, IBASIC_EXPRESSION_ELEMENT__DESCRIPTION);

		iExpressionEClass = createEClass(IEXPRESSION);
		createEOperation(iExpressionEClass, IEXPRESSION___EVALUATE__OBJECT);

		expressionCatalogEClass = createEClass(EXPRESSION_CATALOG);
		createEReference(expressionCatalogEClass, EXPRESSION_CATALOG__EXPRESSIONS);

		eClassEClass = createEClass(ECLASS);

		eObjectEClass = createEClass(EOBJECT);

		// Create data types
		boolEDataType = createEDataType(BOOL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		BooleanExpressionsPackage theBooleanExpressionsPackage = (BooleanExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(BooleanExpressionsPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theBooleanExpressionsPackage);

		// Create type parameters
		ETypeParameter iExpressionEClass_CONTEXT_TYPE = addETypeParameter(iExpressionEClass, "CONTEXT_TYPE"); //$NON-NLS-1$
		ETypeParameter iExpressionEClass_RETURN_TYPE = addETypeParameter(iExpressionEClass, "RETURN_TYPE"); //$NON-NLS-1$

		// Set bounds for type parameters

		// Add supertypes to classes
		iExpressionEClass.getESuperTypes().add(this.getIBasicExpressionElement());
		expressionCatalogEClass.getESuperTypes().add(this.getIBasicExpressionElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(iBasicExpressionElementEClass, IBasicExpressionElement.class, "IBasicExpressionElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getIBasicExpressionElement_Name(), theTypesPackage.getString(), "name", null, 1, 1, IBasicExpressionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getIBasicExpressionElement_Description(), theTypesPackage.getString(), "description", null, 1, 1, IBasicExpressionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(iExpressionEClass, IExpression.class, "IExpression", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		EOperation op = initEOperation(getIExpression__Evaluate__Object(), null, "evaluate", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		EGenericType g1 = createEGenericType(iExpressionEClass_CONTEXT_TYPE);
		addEParameter(op, g1, "context", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		g1 = createEGenericType(iExpressionEClass_RETURN_TYPE);
		initEOperation(op, g1);

		initEClass(expressionCatalogEClass, ExpressionCatalog.class, "ExpressionCatalog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getExpressionCatalog_Expressions(), this.getIExpression(), null, "expressions", null, 0, -1, ExpressionCatalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(eClassEClass, EClass.class, "EClass", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(eObjectEClass, EObject.class, "EObject", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		// Initialize data types
		initEDataType(boolEDataType, Boolean.class, "Bool", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/2.0.0/UML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUMLAnnotations() {
		String source = "http://www.eclipse.org/uml2/2.0.0/UML"; //$NON-NLS-1$	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "originalName", "Expressions" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (boolEDataType, 
		   source, 
		   new String[] {
			 "originalName", "Boolean" //$NON-NLS-1$ //$NON-NLS-2$
		   });
	}

} //ExpressionsPackageImpl
