/**
 * Copyright (c) 2013 CEA LIST.
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
package org.eclipse.papyrus.infra.nattable.model.nattable.nattableconfiguration.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.papyrus.infra.nattable.model.nattable.NattablePackage;

import org.eclipse.papyrus.infra.nattable.model.nattable.impl.NattablePackageImpl;

import org.eclipse.papyrus.infra.nattable.model.nattable.nattableconfiguration.CellEditorDeclaration;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableconfiguration.LocalTableEditorConfiguration;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableconfiguration.NattableconfigurationFactory;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableconfiguration.NattableconfigurationPackage;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableconfiguration.TableEditorConfiguration;

import org.eclipse.papyrus.infra.nattable.model.nattable.nattablecontentprovider.NattablecontentproviderPackage;

import org.eclipse.papyrus.infra.nattable.model.nattable.nattablecontentprovider.impl.NattablecontentproviderPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NattableconfigurationPackageImpl extends EPackageImpl implements NattableconfigurationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableEditorConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localTableEditorConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cellEditorDeclarationEEnum = null;

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
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableconfiguration.NattableconfigurationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private NattableconfigurationPackageImpl() {
		super(eNS_URI, NattableconfigurationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link NattableconfigurationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static NattableconfigurationPackage init() {
		if (isInited) return (NattableconfigurationPackage)EPackage.Registry.INSTANCE.getEPackage(NattableconfigurationPackage.eNS_URI);

		// Obtain or create and register package
		NattableconfigurationPackageImpl theNattableconfigurationPackage = (NattableconfigurationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof NattableconfigurationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new NattableconfigurationPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		NattablePackageImpl theNattablePackage = (NattablePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NattablePackage.eNS_URI) instanceof NattablePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NattablePackage.eNS_URI) : NattablePackage.eINSTANCE);
		NattablecontentproviderPackageImpl theNattablecontentproviderPackage = (NattablecontentproviderPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NattablecontentproviderPackage.eNS_URI) instanceof NattablecontentproviderPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NattablecontentproviderPackage.eNS_URI) : NattablecontentproviderPackage.eINSTANCE);

		// Create package meta-data objects
		theNattableconfigurationPackage.createPackageContents();
		theNattablePackage.createPackageContents();
		theNattablecontentproviderPackage.createPackageContents();

		// Initialize created meta-data
		theNattableconfigurationPackage.initializePackageContents();
		theNattablePackage.initializePackageContents();
		theNattablecontentproviderPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theNattableconfigurationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(NattableconfigurationPackage.eNS_URI, theNattableconfigurationPackage);
		return theNattableconfigurationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableEditorConfiguration() {
		return tableEditorConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableEditorConfiguration_PastedElementTypeId() {
		return (EAttribute)tableEditorConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableEditorConfiguration_PastedElementContainmentFeature() {
		return (EReference)tableEditorConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableEditorConfiguration_DefaultVerticalContentProvider() {
		return (EReference)tableEditorConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableEditorConfiguration_DefaultHorizontalContentProvider() {
		return (EReference)tableEditorConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableEditorConfiguration_EditorDeclaration() {
		return (EAttribute)tableEditorConfigurationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalTableEditorConfiguration() {
		return localTableEditorConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalTableEditorConfiguration_DefaultTableEditorConfiguration() {
		return (EReference)localTableEditorConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalTableEditorConfiguration_Type() {
		return (EAttribute)localTableEditorConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCellEditorDeclaration() {
		return cellEditorDeclarationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NattableconfigurationFactory getNattableconfigurationFactory() {
		return (NattableconfigurationFactory)getEFactoryInstance();
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
		tableEditorConfigurationEClass = createEClass(TABLE_EDITOR_CONFIGURATION);
		createEAttribute(tableEditorConfigurationEClass, TABLE_EDITOR_CONFIGURATION__PASTED_ELEMENT_TYPE_ID);
		createEReference(tableEditorConfigurationEClass, TABLE_EDITOR_CONFIGURATION__PASTED_ELEMENT_CONTAINMENT_FEATURE);
		createEReference(tableEditorConfigurationEClass, TABLE_EDITOR_CONFIGURATION__DEFAULT_VERTICAL_CONTENT_PROVIDER);
		createEReference(tableEditorConfigurationEClass, TABLE_EDITOR_CONFIGURATION__DEFAULT_HORIZONTAL_CONTENT_PROVIDER);
		createEAttribute(tableEditorConfigurationEClass, TABLE_EDITOR_CONFIGURATION__EDITOR_DECLARATION);

		localTableEditorConfigurationEClass = createEClass(LOCAL_TABLE_EDITOR_CONFIGURATION);
		createEReference(localTableEditorConfigurationEClass, LOCAL_TABLE_EDITOR_CONFIGURATION__DEFAULT_TABLE_EDITOR_CONFIGURATION);
		createEAttribute(localTableEditorConfigurationEClass, LOCAL_TABLE_EDITOR_CONFIGURATION__TYPE);

		// Create enums
		cellEditorDeclarationEEnum = createEEnum(CELL_EDITOR_DECLARATION);
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
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		NattablecontentproviderPackage theNattablecontentproviderPackage = (NattablecontentproviderPackage)EPackage.Registry.INSTANCE.getEPackage(NattablecontentproviderPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		tableEditorConfigurationEClass.getESuperTypes().add(theEcorePackage.getEModelElement());
		localTableEditorConfigurationEClass.getESuperTypes().add(this.getTableEditorConfiguration());

		// Initialize classes, features, and operations; add parameters
		initEClass(tableEditorConfigurationEClass, TableEditorConfiguration.class, "TableEditorConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getTableEditorConfiguration_PastedElementTypeId(), theEcorePackage.getEString(), "pastedElementTypeId", null, 0, 1, TableEditorConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getTableEditorConfiguration_PastedElementContainmentFeature(), theEcorePackage.getEReference(), null, "pastedElementContainmentFeature", null, 0, 1, TableEditorConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getTableEditorConfiguration_DefaultVerticalContentProvider(), theNattablecontentproviderPackage.getIAxisContentsProvider(), null, "defaultVerticalContentProvider", null, 0, 1, TableEditorConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getTableEditorConfiguration_DefaultHorizontalContentProvider(), theNattablecontentproviderPackage.getIAxisContentsProvider(), null, "defaultHorizontalContentProvider", null, 0, 1, TableEditorConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getTableEditorConfiguration_EditorDeclaration(), this.getCellEditorDeclaration(), "editorDeclaration", "COLUMN", 1, 1, TableEditorConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(localTableEditorConfigurationEClass, LocalTableEditorConfiguration.class, "LocalTableEditorConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getLocalTableEditorConfiguration_DefaultTableEditorConfiguration(), this.getTableEditorConfiguration(), null, "defaultTableEditorConfiguration", null, 0, 1, LocalTableEditorConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getLocalTableEditorConfiguration_Type(), ecorePackage.getEString(), "type", null, 0, 1, LocalTableEditorConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		// Initialize enums and add enum literals
		initEEnum(cellEditorDeclarationEEnum, CellEditorDeclaration.class, "CellEditorDeclaration"); //$NON-NLS-1$
		addEEnumLiteral(cellEditorDeclarationEEnum, CellEditorDeclaration.COLUMN);
		addEEnumLiteral(cellEditorDeclarationEEnum, CellEditorDeclaration.ROW);
		addEEnumLiteral(cellEditorDeclarationEEnum, CellEditorDeclaration.CELL);
	}

} //NattableconfigurationPackageImpl
