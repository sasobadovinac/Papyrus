/**
* Copyright (c) 2017 CEA LIST.
 * 
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License 2.0
 *  which accompanies this distribution, and is available at
 *  https://www.eclipse.org/legal/epl-2.0/
 *
 *  SPDX-License-Identifier: EPL-2.0
 *  
 *  Contributors:
 *  Maged Elaasar - Initial API and implementation
 *  
 * 
 */
package org.eclipse.papyrus.infra.core.architecture.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.papyrus.infra.core.architecture.ADElement;
import org.eclipse.papyrus.infra.core.architecture.ArchitectureContext;
import org.eclipse.papyrus.infra.core.architecture.ArchitectureDescription;
import org.eclipse.papyrus.infra.core.architecture.ArchitectureDescriptionLanguage;
import org.eclipse.papyrus.infra.core.architecture.ArchitectureDescriptionPreferences;
import org.eclipse.papyrus.infra.core.architecture.ArchitectureDomain;
import org.eclipse.papyrus.infra.core.architecture.ArchitectureFactory;
import org.eclipse.papyrus.infra.core.architecture.ArchitectureFramework;
import org.eclipse.papyrus.infra.core.architecture.ArchitecturePackage;
import org.eclipse.papyrus.infra.core.architecture.ArchitectureViewpoint;
import org.eclipse.papyrus.infra.core.architecture.Concern;
import org.eclipse.papyrus.infra.core.architecture.RepresentationKind;
import org.eclipse.papyrus.infra.core.architecture.Stakeholder;
import org.eclipse.papyrus.infra.core.architecture.TreeViewerConfiguration;
import org.eclipse.papyrus.infra.core.architecture.util.ArchitectureValidator;
import org.eclipse.papyrus.infra.types.ElementTypesConfigurationsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArchitecturePackageImpl extends EPackageImpl implements ArchitecturePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass architectureDomainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass architectureDescriptionLanguageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stakeholderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concernEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass architectureViewpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass representationKindEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass architectureContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass architectureFrameworkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass architectureDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass architectureDescriptionPreferencesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass treeViewerConfigurationEClass = null;

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
	 * @see org.eclipse.papyrus.infra.core.architecture.ArchitecturePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ArchitecturePackageImpl() {
		super(eNS_URI, ArchitectureFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ArchitecturePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ArchitecturePackage init() {
		if (isInited) return (ArchitecturePackage)EPackage.Registry.INSTANCE.getEPackage(ArchitecturePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredArchitecturePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ArchitecturePackageImpl theArchitecturePackage = registeredArchitecturePackage instanceof ArchitecturePackageImpl ? (ArchitecturePackageImpl)registeredArchitecturePackage : new ArchitecturePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		ElementTypesConfigurationsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theArchitecturePackage.createPackageContents();

		// Initialize created meta-data
		theArchitecturePackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theArchitecturePackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return ArchitectureValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theArchitecturePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ArchitecturePackage.eNS_URI, theArchitecturePackage);
		return theArchitecturePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getADElement() {
		return adElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getADElement_Id() {
		return (EAttribute)adElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getADElement_Name() {
		return (EAttribute)adElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getADElement_Description() {
		return (EAttribute)adElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getADElement_QualifiedName() {
		return (EAttribute)adElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getADElement_Icon() {
		return (EAttribute)adElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArchitectureDomain() {
		return architectureDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArchitectureDomain_Stakeholders() {
		return (EReference)architectureDomainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArchitectureDomain_Concerns() {
		return (EReference)architectureDomainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArchitectureDomain_Contexts() {
		return (EReference)architectureDomainEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArchitectureDescriptionLanguage() {
		return architectureDescriptionLanguageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArchitectureDescriptionLanguage_RepresentationKinds() {
		return (EReference)architectureDescriptionLanguageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArchitectureDescriptionLanguage_Metamodel() {
		return (EReference)architectureDescriptionLanguageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArchitectureDescriptionLanguage_Profiles() {
		return (EReference)architectureDescriptionLanguageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArchitectureDescriptionLanguage_TreeViewerConfigurations() {
		return (EReference)architectureDescriptionLanguageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStakeholder() {
		return stakeholderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStakeholder_Concerns() {
		return (EReference)stakeholderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStakeholder_Domain() {
		return (EReference)stakeholderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConcern() {
		return concernEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConcern_Domain() {
		return (EReference)concernEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArchitectureViewpoint() {
		return architectureViewpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArchitectureViewpoint_Concerns() {
		return (EReference)architectureViewpointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArchitectureViewpoint_RepresentationKinds() {
		return (EReference)architectureViewpointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArchitectureViewpoint_Context() {
		return (EReference)architectureViewpointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRepresentationKind() {
		return representationKindEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRepresentationKind_Concerns() {
		return (EReference)representationKindEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRepresentationKind_GrayedIcon() {
		return (EAttribute)representationKindEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRepresentationKind_Language() {
		return (EReference)representationKindEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArchitectureContext() {
		return architectureContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArchitectureContext_Viewpoints() {
		return (EReference)architectureContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArchitectureContext_DefaultViewpoints() {
		return (EReference)architectureContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArchitectureContext_ElementTypes() {
		return (EReference)architectureContextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArchitectureContext_ExtensionPrefix() {
		return (EAttribute)architectureContextEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArchitectureContext_CreationCommandClass() {
		return (EAttribute)architectureContextEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArchitectureContext_ConversionCommandClass() {
		return (EAttribute)architectureContextEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArchitectureContext__CeationCommandClassExists__DiagnosticChain_Map() {
		return architectureContextEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArchitectureContext__ConversionCommandClassExists__DiagnosticChain_Map() {
		return architectureContextEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArchitectureContext_Domain() {
		return (EReference)architectureContextEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArchitectureFramework() {
		return architectureFrameworkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArchitectureDescription() {
		return architectureDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArchitectureDescription_ContextId() {
		return (EAttribute)architectureDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArchitectureDescriptionPreferences() {
		return architectureDescriptionPreferencesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArchitectureDescriptionPreferences_ViewpointIds() {
		return (EAttribute)architectureDescriptionPreferencesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTreeViewerConfiguration() {
		return treeViewerConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTreeViewerConfiguration_Description() {
		return (EAttribute)treeViewerConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArchitectureFactory getArchitectureFactory() {
		return (ArchitectureFactory)getEFactoryInstance();
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
		adElementEClass = createEClass(AD_ELEMENT);
		createEAttribute(adElementEClass, AD_ELEMENT__ID);
		createEAttribute(adElementEClass, AD_ELEMENT__NAME);
		createEAttribute(adElementEClass, AD_ELEMENT__DESCRIPTION);
		createEAttribute(adElementEClass, AD_ELEMENT__QUALIFIED_NAME);
		createEAttribute(adElementEClass, AD_ELEMENT__ICON);

		architectureDomainEClass = createEClass(ARCHITECTURE_DOMAIN);
		createEReference(architectureDomainEClass, ARCHITECTURE_DOMAIN__STAKEHOLDERS);
		createEReference(architectureDomainEClass, ARCHITECTURE_DOMAIN__CONCERNS);
		createEReference(architectureDomainEClass, ARCHITECTURE_DOMAIN__CONTEXTS);

		architectureDescriptionLanguageEClass = createEClass(ARCHITECTURE_DESCRIPTION_LANGUAGE);
		createEReference(architectureDescriptionLanguageEClass, ARCHITECTURE_DESCRIPTION_LANGUAGE__REPRESENTATION_KINDS);
		createEReference(architectureDescriptionLanguageEClass, ARCHITECTURE_DESCRIPTION_LANGUAGE__METAMODEL);
		createEReference(architectureDescriptionLanguageEClass, ARCHITECTURE_DESCRIPTION_LANGUAGE__PROFILES);
		createEReference(architectureDescriptionLanguageEClass, ARCHITECTURE_DESCRIPTION_LANGUAGE__TREE_VIEWER_CONFIGURATIONS);

		stakeholderEClass = createEClass(STAKEHOLDER);
		createEReference(stakeholderEClass, STAKEHOLDER__CONCERNS);
		createEReference(stakeholderEClass, STAKEHOLDER__DOMAIN);

		concernEClass = createEClass(CONCERN);
		createEReference(concernEClass, CONCERN__DOMAIN);

		architectureViewpointEClass = createEClass(ARCHITECTURE_VIEWPOINT);
		createEReference(architectureViewpointEClass, ARCHITECTURE_VIEWPOINT__CONCERNS);
		createEReference(architectureViewpointEClass, ARCHITECTURE_VIEWPOINT__REPRESENTATION_KINDS);
		createEReference(architectureViewpointEClass, ARCHITECTURE_VIEWPOINT__CONTEXT);

		representationKindEClass = createEClass(REPRESENTATION_KIND);
		createEReference(representationKindEClass, REPRESENTATION_KIND__LANGUAGE);
		createEReference(representationKindEClass, REPRESENTATION_KIND__CONCERNS);
		createEAttribute(representationKindEClass, REPRESENTATION_KIND__GRAYED_ICON);

		architectureContextEClass = createEClass(ARCHITECTURE_CONTEXT);
		createEReference(architectureContextEClass, ARCHITECTURE_CONTEXT__VIEWPOINTS);
		createEReference(architectureContextEClass, ARCHITECTURE_CONTEXT__DEFAULT_VIEWPOINTS);
		createEReference(architectureContextEClass, ARCHITECTURE_CONTEXT__ELEMENT_TYPES);
		createEReference(architectureContextEClass, ARCHITECTURE_CONTEXT__DOMAIN);
		createEAttribute(architectureContextEClass, ARCHITECTURE_CONTEXT__EXTENSION_PREFIX);
		createEAttribute(architectureContextEClass, ARCHITECTURE_CONTEXT__CREATION_COMMAND_CLASS);
		createEAttribute(architectureContextEClass, ARCHITECTURE_CONTEXT__CONVERSION_COMMAND_CLASS);
		createEOperation(architectureContextEClass, ARCHITECTURE_CONTEXT___CEATION_COMMAND_CLASS_EXISTS__DIAGNOSTICCHAIN_MAP);
		createEOperation(architectureContextEClass, ARCHITECTURE_CONTEXT___CONVERSION_COMMAND_CLASS_EXISTS__DIAGNOSTICCHAIN_MAP);

		architectureFrameworkEClass = createEClass(ARCHITECTURE_FRAMEWORK);

		architectureDescriptionEClass = createEClass(ARCHITECTURE_DESCRIPTION);
		createEAttribute(architectureDescriptionEClass, ARCHITECTURE_DESCRIPTION__CONTEXT_ID);

		architectureDescriptionPreferencesEClass = createEClass(ARCHITECTURE_DESCRIPTION_PREFERENCES);
		createEAttribute(architectureDescriptionPreferencesEClass, ARCHITECTURE_DESCRIPTION_PREFERENCES__VIEWPOINT_IDS);

		treeViewerConfigurationEClass = createEClass(TREE_VIEWER_CONFIGURATION);
		createEAttribute(treeViewerConfigurationEClass, TREE_VIEWER_CONFIGURATION__DESCRIPTION);
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
		ElementTypesConfigurationsPackage theElementTypesConfigurationsPackage = (ElementTypesConfigurationsPackage)EPackage.Registry.INSTANCE.getEPackage(ElementTypesConfigurationsPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		architectureDomainEClass.getESuperTypes().add(this.getADElement());
		architectureDescriptionLanguageEClass.getESuperTypes().add(this.getArchitectureContext());
		stakeholderEClass.getESuperTypes().add(this.getADElement());
		concernEClass.getESuperTypes().add(this.getADElement());
		architectureViewpointEClass.getESuperTypes().add(this.getADElement());
		representationKindEClass.getESuperTypes().add(this.getADElement());
		architectureContextEClass.getESuperTypes().add(this.getADElement());
		architectureFrameworkEClass.getESuperTypes().add(this.getArchitectureContext());

		// Initialize classes, features, and operations; add parameters
		initEClass(adElementEClass, ADElement.class, "ADElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getADElement_Id(), ecorePackage.getEString(), "id", null, 1, 1, ADElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getADElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, ADElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getADElement_Description(), ecorePackage.getEString(), "description", null, 0, 1, ADElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getADElement_QualifiedName(), ecorePackage.getEString(), "qualifiedName", null, 0, 1, ADElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getADElement_Icon(), ecorePackage.getEString(), "icon", null, 0, 1, ADElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(architectureDomainEClass, ArchitectureDomain.class, "ArchitectureDomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getArchitectureDomain_Stakeholders(), this.getStakeholder(), this.getStakeholder_Domain(), "stakeholders", null, 0, -1, ArchitectureDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getArchitectureDomain_Concerns(), this.getConcern(), this.getConcern_Domain(), "concerns", null, 0, -1, ArchitectureDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getArchitectureDomain_Contexts(), this.getArchitectureContext(), this.getArchitectureContext_Domain(), "contexts", null, 0, -1, ArchitectureDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(architectureDescriptionLanguageEClass, ArchitectureDescriptionLanguage.class, "ArchitectureDescriptionLanguage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getArchitectureDescriptionLanguage_RepresentationKinds(), this.getRepresentationKind(), this.getRepresentationKind_Language(), "representationKinds", null, 0, -1, ArchitectureDescriptionLanguage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getArchitectureDescriptionLanguage_Metamodel(), ecorePackage.getEPackage(), null, "metamodel", null, 1, 1, ArchitectureDescriptionLanguage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getArchitectureDescriptionLanguage_Profiles(), ecorePackage.getEPackage(), null, "profiles", null, 0, -1, ArchitectureDescriptionLanguage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getArchitectureDescriptionLanguage_TreeViewerConfigurations(), this.getTreeViewerConfiguration(), null, "treeViewerConfigurations", null, 0, -1, ArchitectureDescriptionLanguage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(stakeholderEClass, Stakeholder.class, "Stakeholder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getStakeholder_Concerns(), this.getConcern(), null, "concerns", null, 0, -1, Stakeholder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getStakeholder_Domain(), this.getArchitectureDomain(), this.getArchitectureDomain_Stakeholders(), "domain", null, 1, 1, Stakeholder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(concernEClass, Concern.class, "Concern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getConcern_Domain(), this.getArchitectureDomain(), this.getArchitectureDomain_Concerns(), "domain", null, 1, 1, Concern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(architectureViewpointEClass, ArchitectureViewpoint.class, "ArchitectureViewpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getArchitectureViewpoint_Concerns(), this.getConcern(), null, "concerns", null, 0, -1, ArchitectureViewpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getArchitectureViewpoint_RepresentationKinds(), this.getRepresentationKind(), null, "representationKinds", null, 0, -1, ArchitectureViewpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getArchitectureViewpoint_Context(), this.getArchitectureContext(), this.getArchitectureContext_Viewpoints(), "context", null, 1, 1, ArchitectureViewpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(representationKindEClass, RepresentationKind.class, "RepresentationKind", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getRepresentationKind_Language(), this.getArchitectureDescriptionLanguage(), this.getArchitectureDescriptionLanguage_RepresentationKinds(), "language", null, 1, 1, RepresentationKind.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRepresentationKind_Concerns(), this.getConcern(), null, "concerns", null, 0, -1, RepresentationKind.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRepresentationKind_GrayedIcon(), ecorePackage.getEString(), "grayedIcon", null, 0, 1, RepresentationKind.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(architectureContextEClass, ArchitectureContext.class, "ArchitectureContext", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getArchitectureContext_Viewpoints(), this.getArchitectureViewpoint(), this.getArchitectureViewpoint_Context(), "viewpoints", null, 0, -1, ArchitectureContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getArchitectureContext_DefaultViewpoints(), this.getArchitectureViewpoint(), null, "defaultViewpoints", null, 0, -1, ArchitectureContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getArchitectureContext_ElementTypes(), theElementTypesConfigurationsPackage.getElementTypeSetConfiguration(), null, "elementTypes", null, 0, -1, ArchitectureContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getArchitectureContext_Domain(), this.getArchitectureDomain(), this.getArchitectureDomain_Contexts(), "domain", null, 1, 1, ArchitectureContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getArchitectureContext_ExtensionPrefix(), ecorePackage.getEString(), "extensionPrefix", null, 0, 1, ArchitectureContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getArchitectureContext_CreationCommandClass(), ecorePackage.getEString(), "creationCommandClass", null, 1, 1, ArchitectureContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getArchitectureContext_ConversionCommandClass(), ecorePackage.getEString(), "conversionCommandClass", null, 0, 1, ArchitectureContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		EOperation op = initEOperation(getArchitectureContext__CeationCommandClassExists__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "ceationCommandClassExists", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theEcorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		EGenericType g1 = createEGenericType(theEcorePackage.getEMap());
		EGenericType g2 = createEGenericType(theEcorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theEcorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = initEOperation(getArchitectureContext__ConversionCommandClassExists__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "conversionCommandClassExists", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theEcorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		g1 = createEGenericType(theEcorePackage.getEMap());
		g2 = createEGenericType(theEcorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theEcorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(architectureFrameworkEClass, ArchitectureFramework.class, "ArchitectureFramework", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(architectureDescriptionEClass, ArchitectureDescription.class, "ArchitectureDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getArchitectureDescription_ContextId(), ecorePackage.getEString(), "contextId", null, 0, 1, ArchitectureDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(architectureDescriptionPreferencesEClass, ArchitectureDescriptionPreferences.class, "ArchitectureDescriptionPreferences", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getArchitectureDescriptionPreferences_ViewpointIds(), ecorePackage.getEString(), "viewpointIds", null, 0, -1, ArchitectureDescriptionPreferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(treeViewerConfigurationEClass, TreeViewerConfiguration.class, "TreeViewerConfiguration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getTreeViewerConfiguration_Description(), ecorePackage.getEString(), "description", null, 0, 1, TreeViewerConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		// Create resource
		createResource(eNS_URI);
	}

} //ArchitecturePackageImpl
