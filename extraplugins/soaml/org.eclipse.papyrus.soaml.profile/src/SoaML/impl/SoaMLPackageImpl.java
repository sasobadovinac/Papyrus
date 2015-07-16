/*****************************************************************************
 * Copyright (c) 2015 CEA LIST.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Fadwa TMAR (CEA LIST) fadwa.tmar@cea.fr - Initial API and implementation
 *****************************************************************************/
package SoaML.impl;

import SoaML.Agent;
import SoaML.Attachment;
import SoaML.Capability;
import SoaML.Catalog;
import SoaML.Categorization;
import SoaML.Category;
import SoaML.CategoryValue;
import SoaML.Collaboration;
import SoaML.CollaborationUse;
import SoaML.Consumer;
import SoaML.Expose;
import SoaML.FreeFormDescriptor;
import SoaML.FreeFormValue;
import SoaML.MessageType;
import SoaML.Milestone;
import SoaML.MotivationElement;
import SoaML.MotivationRealization;
import SoaML.NodeDescriptor;
import SoaML.Participant;
import SoaML.Port;
import SoaML.Property;
import SoaML.Provider;
import SoaML.Request;
import SoaML.Service;
import SoaML.ServiceChannel;
import SoaML.ServiceContract;
import SoaML.ServiceInterface;
import SoaML.ServicesArchitecture;
import SoaML.SoaMLFactory;
import SoaML.SoaMLPackage;

import SoaML.util.SoaMLValidator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SoaMLPackageImpl extends EPackageImpl implements SoaMLPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass participantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collaborationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass motivationElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass freeFormValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass milestoneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass freeFormDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categoryValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceContractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass consumerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass catalogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categorizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass motivationRealizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass servicesArchitectureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collaborationUseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceChannelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exposeEClass = null;

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
	 * @see SoaML.SoaMLPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SoaMLPackageImpl() {
		super(eNS_URI, SoaMLFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SoaMLPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SoaMLPackage init() {
		if (isInited) return (SoaMLPackage)EPackage.Registry.INSTANCE.getEPackage(SoaMLPackage.eNS_URI);

		// Obtain or create and register package
		SoaMLPackageImpl theSoaMLPackage = (SoaMLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SoaMLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SoaMLPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		UMLPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSoaMLPackage.createPackageContents();

		// Initialize created meta-data
		theSoaMLPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theSoaMLPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return SoaMLValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theSoaMLPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SoaMLPackage.eNS_URI, theSoaMLPackage);
		return theSoaMLPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAgent() {
		return agentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAgent__IsActive__DiagnosticChain_Map() {
		return agentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParticipant() {
		return participantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParticipant_Base_Class() {
		return (EReference)participantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParticipant__NoRealizedUsedInterface__DiagnosticChain_Map() {
		return participantEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParticipant__PortTypes__DiagnosticChain_Map() {
		return participantEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollaboration() {
		return collaborationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollaboration_Base_Collaboration() {
		return (EReference)collaborationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollaboration_IsStrict() {
		return (EAttribute)collaborationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMotivationElement() {
		return motivationElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProvider() {
		return providerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvider_Base_Interface() {
		return (EReference)providerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvider_Base_Class() {
		return (EReference)providerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFreeFormValue() {
		return freeFormValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFreeFormValue_Base_ValueSpecification() {
		return (EReference)freeFormValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageType() {
		return messageTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageType_Base_Signal() {
		return (EReference)messageTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageType_Encoding() {
		return (EAttribute)messageTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageType_Base_Class() {
		return (EReference)messageTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageType_Base_DataType() {
		return (EReference)messageTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMessageType__NoOwnedBehaviors__DiagnosticChain_Map() {
		return messageTypeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMessageType__NoOwnedOperations__DiagnosticChain_Map() {
		return messageTypeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMessageType__PublicAttributes__DiagnosticChain_Map() {
		return messageTypeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCategory() {
		return categoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeDescriptor() {
		return nodeDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeDescriptor_Base_Artifact() {
		return (EReference)nodeDescriptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMilestone() {
		return milestoneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMilestone_Signal() {
		return (EReference)milestoneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMilestone_Progress() {
		return (EAttribute)milestoneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMilestone_Value() {
		return (EReference)milestoneEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMilestone_Base_Comment() {
		return (EReference)milestoneEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFreeFormDescriptor() {
		return freeFormDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFreeFormDescriptor_Base_Property() {
		return (EReference)freeFormDescriptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCategoryValue() {
		return categoryValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceContract() {
		return serviceContractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceContract__RoleType__DiagnosticChain_Map() {
		return serviceContractEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceContract__AttachedBehaviorCompatibility__DiagnosticChain_Map() {
		return serviceContractEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequest() {
		return requestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequest_Base_Port() {
		return (EReference)requestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRequest__RequestType__DiagnosticChain_Map() {
		return requestEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRequest__IsConjugatedTrue__DiagnosticChain_Map() {
		return requestEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConsumer() {
		return consumerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConsumer_Base_Interface() {
		return (EReference)consumerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConsumer_Base_Class() {
		return (EReference)consumerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCatalog() {
		return catalogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCatalog_Base_Package() {
		return (EReference)catalogEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapability() {
		return capabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapability_Base_Class() {
		return (EReference)capabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCategorization() {
		return categorizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategorization_Base_Dependency() {
		return (EReference)categorizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMotivationRealization() {
		return motivationRealizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMotivationRealization_Base_Realization() {
		return (EReference)motivationRealizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceInterface() {
		return serviceInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceInterface_Base_Class() {
		return (EReference)serviceInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceInterface__PartsTypesOfServiceInterface__DiagnosticChain_Map() {
		return serviceInterfaceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServicesArchitecture() {
		return servicesArchitectureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServicesArchitecture__ParticipantsRoleCompatibility__DiagnosticChain_Map() {
		return servicesArchitectureEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServicesArchitecture__PartsTypes__DiagnosticChain_Map() {
		return servicesArchitectureEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServicesArchitecture__GetIcon__Image() {
		return servicesArchitectureEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttachment() {
		return attachmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttachment_Encoding() {
		return (EAttribute)attachmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachment_Base_Property() {
		return (EReference)attachmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttachment_Mimetype() {
		return (EAttribute)attachmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollaborationUse() {
		return collaborationUseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollaborationUse_Base_CollaborationUse() {
		return (EReference)collaborationUseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollaborationUse_IsStrict() {
		return (EAttribute)collaborationUseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCollaborationUse__RoleBindingClientSupplierCompatibility__DiagnosticChain_Map() {
		return collaborationUseEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceChannel() {
		return serviceChannelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceChannel_Base_Connector() {
		return (EReference)serviceChannelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceChannel__Onlybinaryconnectorsallowed__DiagnosticChain_Map() {
		return serviceChannelEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceChannel__ServiceChannelEndTypes__DiagnosticChain_Map() {
		return serviceChannelEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceChannel__Compatibility__DiagnosticChain_Map() {
		return serviceChannelEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getService() {
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_Base_Port() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getService__ServiceType__DiagnosticChain_Map() {
		return serviceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getService__IsConjugatedFalse__DiagnosticChain_Map() {
		return serviceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPort() {
		return portEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_Base_Port() {
		return (EReference)portEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_ConnectorRequired() {
		return (EAttribute)portEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPort__ConnectorRequired__DiagnosticChain_Map() {
		return portEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_IsID() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Base_Property() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpose() {
		return exposeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpose_Base_Dependency() {
		return (EReference)exposeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoaMLFactory getSoaMLFactory() {
		return (SoaMLFactory)getEFactoryInstance();
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
		agentEClass = createEClass(AGENT);
		createEOperation(agentEClass, AGENT___IS_ACTIVE__DIAGNOSTICCHAIN_MAP);

		participantEClass = createEClass(PARTICIPANT);
		createEReference(participantEClass, PARTICIPANT__BASE_CLASS);
		createEOperation(participantEClass, PARTICIPANT___NO_REALIZED_USED_INTERFACE__DIAGNOSTICCHAIN_MAP);
		createEOperation(participantEClass, PARTICIPANT___PORT_TYPES__DIAGNOSTICCHAIN_MAP);

		collaborationEClass = createEClass(COLLABORATION);
		createEReference(collaborationEClass, COLLABORATION__BASE_COLLABORATION);
		createEAttribute(collaborationEClass, COLLABORATION__IS_STRICT);

		motivationElementEClass = createEClass(MOTIVATION_ELEMENT);

		providerEClass = createEClass(PROVIDER);
		createEReference(providerEClass, PROVIDER__BASE_CLASS);
		createEReference(providerEClass, PROVIDER__BASE_INTERFACE);

		freeFormValueEClass = createEClass(FREE_FORM_VALUE);
		createEReference(freeFormValueEClass, FREE_FORM_VALUE__BASE_VALUE_SPECIFICATION);

		messageTypeEClass = createEClass(MESSAGE_TYPE);
		createEReference(messageTypeEClass, MESSAGE_TYPE__BASE_SIGNAL);
		createEAttribute(messageTypeEClass, MESSAGE_TYPE__ENCODING);
		createEReference(messageTypeEClass, MESSAGE_TYPE__BASE_CLASS);
		createEReference(messageTypeEClass, MESSAGE_TYPE__BASE_DATA_TYPE);
		createEOperation(messageTypeEClass, MESSAGE_TYPE___NO_OWNED_BEHAVIORS__DIAGNOSTICCHAIN_MAP);
		createEOperation(messageTypeEClass, MESSAGE_TYPE___NO_OWNED_OPERATIONS__DIAGNOSTICCHAIN_MAP);
		createEOperation(messageTypeEClass, MESSAGE_TYPE___PUBLIC_ATTRIBUTES__DIAGNOSTICCHAIN_MAP);

		categoryEClass = createEClass(CATEGORY);

		nodeDescriptorEClass = createEClass(NODE_DESCRIPTOR);
		createEReference(nodeDescriptorEClass, NODE_DESCRIPTOR__BASE_ARTIFACT);

		milestoneEClass = createEClass(MILESTONE);
		createEReference(milestoneEClass, MILESTONE__SIGNAL);
		createEAttribute(milestoneEClass, MILESTONE__PROGRESS);
		createEReference(milestoneEClass, MILESTONE__VALUE);
		createEReference(milestoneEClass, MILESTONE__BASE_COMMENT);

		freeFormDescriptorEClass = createEClass(FREE_FORM_DESCRIPTOR);
		createEReference(freeFormDescriptorEClass, FREE_FORM_DESCRIPTOR__BASE_PROPERTY);

		categoryValueEClass = createEClass(CATEGORY_VALUE);

		serviceContractEClass = createEClass(SERVICE_CONTRACT);
		createEOperation(serviceContractEClass, SERVICE_CONTRACT___ROLE_TYPE__DIAGNOSTICCHAIN_MAP);
		createEOperation(serviceContractEClass, SERVICE_CONTRACT___ATTACHED_BEHAVIOR_COMPATIBILITY__DIAGNOSTICCHAIN_MAP);

		requestEClass = createEClass(REQUEST);
		createEReference(requestEClass, REQUEST__BASE_PORT);
		createEOperation(requestEClass, REQUEST___REQUEST_TYPE__DIAGNOSTICCHAIN_MAP);
		createEOperation(requestEClass, REQUEST___IS_CONJUGATED_TRUE__DIAGNOSTICCHAIN_MAP);

		consumerEClass = createEClass(CONSUMER);
		createEReference(consumerEClass, CONSUMER__BASE_INTERFACE);
		createEReference(consumerEClass, CONSUMER__BASE_CLASS);

		catalogEClass = createEClass(CATALOG);
		createEReference(catalogEClass, CATALOG__BASE_PACKAGE);

		capabilityEClass = createEClass(CAPABILITY);
		createEReference(capabilityEClass, CAPABILITY__BASE_CLASS);

		categorizationEClass = createEClass(CATEGORIZATION);
		createEReference(categorizationEClass, CATEGORIZATION__BASE_DEPENDENCY);

		motivationRealizationEClass = createEClass(MOTIVATION_REALIZATION);
		createEReference(motivationRealizationEClass, MOTIVATION_REALIZATION__BASE_REALIZATION);

		serviceInterfaceEClass = createEClass(SERVICE_INTERFACE);
		createEReference(serviceInterfaceEClass, SERVICE_INTERFACE__BASE_CLASS);
		createEOperation(serviceInterfaceEClass, SERVICE_INTERFACE___PARTS_TYPES_OF_SERVICE_INTERFACE__DIAGNOSTICCHAIN_MAP);

		servicesArchitectureEClass = createEClass(SERVICES_ARCHITECTURE);
		createEOperation(servicesArchitectureEClass, SERVICES_ARCHITECTURE___PARTICIPANTS_ROLE_COMPATIBILITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(servicesArchitectureEClass, SERVICES_ARCHITECTURE___PARTS_TYPES__DIAGNOSTICCHAIN_MAP);
		createEOperation(servicesArchitectureEClass, SERVICES_ARCHITECTURE___GET_ICON__IMAGE);

		attachmentEClass = createEClass(ATTACHMENT);
		createEAttribute(attachmentEClass, ATTACHMENT__ENCODING);
		createEReference(attachmentEClass, ATTACHMENT__BASE_PROPERTY);
		createEAttribute(attachmentEClass, ATTACHMENT__MIMETYPE);

		collaborationUseEClass = createEClass(COLLABORATION_USE);
		createEReference(collaborationUseEClass, COLLABORATION_USE__BASE_COLLABORATION_USE);
		createEAttribute(collaborationUseEClass, COLLABORATION_USE__IS_STRICT);
		createEOperation(collaborationUseEClass, COLLABORATION_USE___ROLE_BINDING_CLIENT_SUPPLIER_COMPATIBILITY__DIAGNOSTICCHAIN_MAP);

		serviceChannelEClass = createEClass(SERVICE_CHANNEL);
		createEReference(serviceChannelEClass, SERVICE_CHANNEL__BASE_CONNECTOR);
		createEOperation(serviceChannelEClass, SERVICE_CHANNEL___ONLYBINARYCONNECTORSALLOWED__DIAGNOSTICCHAIN_MAP);
		createEOperation(serviceChannelEClass, SERVICE_CHANNEL___SERVICE_CHANNEL_END_TYPES__DIAGNOSTICCHAIN_MAP);
		createEOperation(serviceChannelEClass, SERVICE_CHANNEL___COMPATIBILITY__DIAGNOSTICCHAIN_MAP);

		serviceEClass = createEClass(SERVICE);
		createEReference(serviceEClass, SERVICE__BASE_PORT);
		createEOperation(serviceEClass, SERVICE___SERVICE_TYPE__DIAGNOSTICCHAIN_MAP);
		createEOperation(serviceEClass, SERVICE___IS_CONJUGATED_FALSE__DIAGNOSTICCHAIN_MAP);

		portEClass = createEClass(PORT);
		createEReference(portEClass, PORT__BASE_PORT);
		createEAttribute(portEClass, PORT__CONNECTOR_REQUIRED);
		createEOperation(portEClass, PORT___CONNECTOR_REQUIRED__DIAGNOSTICCHAIN_MAP);

		propertyEClass = createEClass(PROPERTY);
		createEAttribute(propertyEClass, PROPERTY__IS_ID);
		createEReference(propertyEClass, PROPERTY__BASE_PROPERTY);

		exposeEClass = createEClass(EXPOSE);
		createEReference(exposeEClass, EXPOSE__BASE_DEPENDENCY);
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
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		agentEClass.getESuperTypes().add(this.getParticipant());
		categoryEClass.getESuperTypes().add(this.getNodeDescriptor());
		categoryValueEClass.getESuperTypes().add(this.getFreeFormValue());
		serviceContractEClass.getESuperTypes().add(this.getCollaboration());
		catalogEClass.getESuperTypes().add(this.getNodeDescriptor());
		servicesArchitectureEClass.getESuperTypes().add(this.getCollaboration());

		// Initialize classes, features, and operations; add parameters
		initEClass(agentEClass, Agent.class, "Agent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getAgent__IsActive__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "isActive", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(participantEClass, Participant.class, "Participant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParticipant_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 1, 1, Participant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getParticipant__NoRealizedUsedInterface__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "noRealizedUsedInterface", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getParticipant__PortTypes__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "portTypes", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(collaborationEClass, Collaboration.class, "Collaboration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCollaboration_Base_Collaboration(), theUMLPackage.getCollaboration(), null, "base_Collaboration", null, 1, 1, Collaboration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCollaboration_IsStrict(), theTypesPackage.getBoolean(), "isStrict", "true", 1, 1, Collaboration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(motivationElementEClass, MotivationElement.class, "MotivationElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(providerEClass, Provider.class, "Provider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProvider_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 0, 1, Provider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProvider_Base_Interface(), theUMLPackage.getInterface(), null, "base_Interface", null, 0, 1, Provider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(freeFormValueEClass, FreeFormValue.class, "FreeFormValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFreeFormValue_Base_ValueSpecification(), theUMLPackage.getValueSpecification(), null, "base_ValueSpecification", null, 1, 1, FreeFormValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(messageTypeEClass, MessageType.class, "MessageType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMessageType_Base_Signal(), theUMLPackage.getSignal(), null, "base_Signal", null, 0, 1, MessageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMessageType_Encoding(), theTypesPackage.getString(), "encoding", null, 0, 1, MessageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMessageType_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 0, 1, MessageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMessageType_Base_DataType(), theUMLPackage.getDataType(), null, "base_DataType", null, 0, 1, MessageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getMessageType__NoOwnedBehaviors__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "noOwnedBehaviors", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMessageType__NoOwnedOperations__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "noOwnedOperations", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMessageType__PublicAttributes__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "publicAttributes", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(categoryEClass, Category.class, "Category", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nodeDescriptorEClass, NodeDescriptor.class, "NodeDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNodeDescriptor_Base_Artifact(), theUMLPackage.getArtifact(), null, "base_Artifact", null, 1, 1, NodeDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(milestoneEClass, Milestone.class, "Milestone", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMilestone_Signal(), theUMLPackage.getSignal(), null, "signal", null, 0, 1, Milestone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMilestone_Progress(), theTypesPackage.getInteger(), "progress", null, 1, 1, Milestone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMilestone_Value(), theUMLPackage.getValueSpecification(), null, "value", null, 0, -1, Milestone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMilestone_Base_Comment(), theUMLPackage.getComment(), null, "base_Comment", null, 1, 1, Milestone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(freeFormDescriptorEClass, FreeFormDescriptor.class, "FreeFormDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFreeFormDescriptor_Base_Property(), theUMLPackage.getProperty(), null, "base_Property", null, 1, 1, FreeFormDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(categoryValueEClass, CategoryValue.class, "CategoryValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serviceContractEClass, ServiceContract.class, "ServiceContract", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getServiceContract__RoleType__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "RoleType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getServiceContract__AttachedBehaviorCompatibility__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "AttachedBehaviorCompatibility", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(requestEClass, Request.class, "Request", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequest_Base_Port(), theUMLPackage.getPort(), null, "base_Port", null, 1, 1, Request.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getRequest__RequestType__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "requestType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRequest__IsConjugatedTrue__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "isConjugatedTrue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(consumerEClass, Consumer.class, "Consumer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConsumer_Base_Interface(), theUMLPackage.getInterface(), null, "base_Interface", null, 0, 1, Consumer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConsumer_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 0, 1, Consumer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(catalogEClass, Catalog.class, "Catalog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCatalog_Base_Package(), theUMLPackage.getPackage(), null, "base_Package", null, 1, 1, Catalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(capabilityEClass, Capability.class, "Capability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCapability_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 1, 1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(categorizationEClass, Categorization.class, "Categorization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCategorization_Base_Dependency(), theUMLPackage.getDependency(), null, "base_Dependency", null, 1, 1, Categorization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(motivationRealizationEClass, MotivationRealization.class, "MotivationRealization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMotivationRealization_Base_Realization(), theUMLPackage.getRealization(), null, "base_Realization", null, 1, 1, MotivationRealization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(serviceInterfaceEClass, ServiceInterface.class, "ServiceInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceInterface_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 0, 1, ServiceInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getServiceInterface__PartsTypesOfServiceInterface__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "partsTypesOfServiceInterface", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(servicesArchitectureEClass, ServicesArchitecture.class, "ServicesArchitecture", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getServicesArchitecture__ParticipantsRoleCompatibility__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "participantsRoleCompatibility", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getServicesArchitecture__PartsTypes__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "partsTypes", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getServicesArchitecture__GetIcon__Image(), null, "getIcon", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theUMLPackage.getImage(), "image", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(attachmentEClass, Attachment.class, "Attachment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttachment_Encoding(), theTypesPackage.getString(), "encoding", null, 1, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAttachment_Base_Property(), theUMLPackage.getProperty(), null, "base_Property", null, 1, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAttachment_Mimetype(), theTypesPackage.getString(), "mimetype", null, 1, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(collaborationUseEClass, CollaborationUse.class, "CollaborationUse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCollaborationUse_Base_CollaborationUse(), theUMLPackage.getCollaborationUse(), null, "base_CollaborationUse", null, 1, 1, CollaborationUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCollaborationUse_IsStrict(), theTypesPackage.getBoolean(), "isStrict", null, 1, 1, CollaborationUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getCollaborationUse__RoleBindingClientSupplierCompatibility__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "RoleBindingClientSupplierCompatibility", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(serviceChannelEClass, ServiceChannel.class, "ServiceChannel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceChannel_Base_Connector(), theUMLPackage.getConnector(), null, "base_Connector", null, 1, 1, ServiceChannel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getServiceChannel__Onlybinaryconnectorsallowed__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "Onlybinaryconnectorsallowed", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getServiceChannel__ServiceChannelEndTypes__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "serviceChannelEndTypes", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getServiceChannel__Compatibility__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "Compatibility", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getService_Base_Port(), theUMLPackage.getPort(), null, "base_Port", null, 1, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getService__ServiceType__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "serviceType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getService__IsConjugatedFalse__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "isConjugatedFalse", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(portEClass, Port.class, "Port", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPort_Base_Port(), theUMLPackage.getPort(), null, "base_Port", null, 1, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPort_ConnectorRequired(), theTypesPackage.getBoolean(), "connectorRequired", "true", 1, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getPort__ConnectorRequired__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "connectorRequired", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProperty_IsID(), theTypesPackage.getBoolean(), "isID", "false", 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProperty_Base_Property(), theUMLPackage.getProperty(), null, "base_Property", null, 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(exposeEClass, Expose.class, "Expose", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpose_Base_Dependency(), theUMLPackage.getDependency(), null, "base_Dependency", null, 1, 1, Expose.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/1.1.0/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/1.1.0/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/uml2/1.1.0/GenModel";	
		addAnnotation
		  (getAgent__IsActive__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "base_Class.isActive"
		   });	
		addAnnotation
		  (getParticipant__NoRealizedUsedInterface__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "Realization.allInstances()->select(r|r.client->includes(self.base_Class))->size()=0 and \r\nUsage.allInstances()->select(r|r.client->includes(self.base_Class))->size()=0"
		   });	
		addAnnotation
		  (getParticipant__PortTypes__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "  let portsSet: OrderedSet(UML::Port)= self.base_Class.ownedPort() in\r\n  portsSet->size()>0 implies \r\n  portsSet->forAll(p|p.getAppliedStereotypes()->select(s|s.name=\'Request\' or s.name=\'Service\')->size()=1 )"
		   });	
		addAnnotation
		  (getMessageType__NoOwnedBehaviors__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.base_Class<>null  implies self.base_Class.ownedBehavior->size()=0"
		   });	
		addAnnotation
		  (getMessageType__NoOwnedOperations__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "if self.base_Class<>null \r\nthen self.base_Class.ownedOperation->size()=0  \r\nelse\r\n\t if self.base_DataType<>null \r\n\t then self.base_DataType.ownedOperation->size()=0\r\n\t else self.base_Signal<>null implies true endif  \r\nendif"
		   });	
		addAnnotation
		  (getMessageType__PublicAttributes__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "if self.base_Class<>null then self.base_Class.attribute->size()>0 implies self.base_Class.attribute->forAll (a|a.visibility=UML::VisibilityKind::public)\r\n else \r\n\t  (if self.base_DataType<>null then \r\n\t\t  \tself.base_DataType.attribute->size()>0 implies self.base_DataType.attribute->forAll(a|a.visibility=UML::VisibilityKind::public)\r\n \t\telse \r\n  \t\t\tself.base_Signal.attribute->size()>0 implies self.base_Signal.attribute-> forAll (a|a.visibility=UML::VisibilityKind::public)\r\n\t\tendif)\r\n endif"
		   });	
		addAnnotation
		  (getServiceContract__RoleType__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", " \r\nlet isComposit :  Boolean= self.base_Collaboration.ownedConnector->isEmpty()\r\n and self.base_Collaboration.getAllAttributes()\r\n->collect(oclAsType(UML::CollaborationUse))->notEmpty(),\r\nisSimple :Boolean=  self.base_Collaboration.getAllAttributes()\r\n->collect(oclAsType(UML::CollaborationUse))->isEmpty()\r\nin  self.base_Collaboration.role-> notEmpty() implies \r\nisSimple and  self.base_Collaboration.role-> forAll(role|\r\nrole.type.oclIsTypeOf(UML::Interface))\r\nor\r\nisComposit  and self.base_Collaboration.role->forAll(role|\r\nrole.type.oclIsTypeOf(UML::Interface) or\r\n(role.type.oclIsTypeOf(UML::Class)\tand\r\n(role.type.oclIsTypeOf(UML::Class) implies(role.type.getAppliedStereotypes()\r\n->select(s|s.name=\'Provider\' or s.name=\'Consumer\' \r\nor s.name=\'ServiceInterface\') ->size()=1))))\r\n"
		   });	
		addAnnotation
		  (getServiceContract__AttachedBehaviorCompatibility__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", " self.base_Collaboration.ownedBehavior->size()>0 implies (\r\n\tself.base_Collaboration.ownedBehavior->asOrderedSet()->first().oclIsTypeOf(UML::Interaction) implies\r\n\t\tlet attachedInteraction=self.base_Collaboration.ownedBehavior->asOrderedSet()->first().oclAsType(UML::Interaction),\r\n\t\tlifelines=self.base_Collaboration.ownedBehavior->asOrderedSet()->first().oclAsType(UML::Interaction).lifeline,\r\n\t\tmessages= self.base_Collaboration.ownedBehavior->asOrderedSet()->first().oclAsType(UML::Interaction).message,\r\n\t\tmessOccuSpec=self.base_Collaboration.ownedBehavior->asOrderedSet()->first().oclAsType(UML::Interaction).fragment\r\n\t\t->select(f|f.oclIsTypeOf(MessageOccurrenceSpecification)) in \r\n\t\tlifelines->size()>0 implies lifelines->forAll(l| self.base_Collaboration.role -> includes(l.oclAsType(UML::Lifeline).represents)  ) \r\n\t\tand \r\n\t\tmessages->size()>0 implies messages\r\n\t\t--->select(m|m.messageSort=MessageSort::asynchCall) \r\n\t\t--signature of messages should be one of the operations or signal of the corresponding Service Declaration\r\n\t\t->forAll(m|m.signature.oclIsTypeOf(Operation) implies \r\n\t\t\tm.receiveEvent.oclAsType(MessageOccurrenceSpecification).covered->flatten()->asOrderedSet()\r\n\t\t\t->first().oclAsType(Lifeline).represents.type.oclAsType(Classifier).ownedElement->select(oclIsTypeOf(Operation))\r\n\t\t\t->includes(m.signature.oclAsType(Operation)) and \r\n\t\t\t\tm.signature.oclIsTypeOf(Signal) implies \r\n\t\t\t\tm.sendEvent->asOrderedSet()->first().oclAsType(MessageOccurrenceSpecification).covered->asOrderedSet()\r\n\t\t\t\t->first().oclAsType(Sequence)->asOrderedSet()->first().oclAsType(Lifeline).represents.type.oclAsType(Classifier).ownedElement\r\n\t\t\t\t->select(oclIsTypeOf(Signal))->includes(m.signature.oclAsType(Signal)\r\n\t\t\t))  )"
		   });	
		addAnnotation
		  (getRequest__RequestType__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", " let portType: Type=  base_Port.type in\r\n portType.getAppliedStereotypes()->select(s|s.name=\'ServiceInterface\' or s.name=\'Consumer\')->size()=1 or portType.oclIsTypeOf(Interface) "
		   });	
		addAnnotation
		  (getRequest__IsConjugatedTrue__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "base_Port.isConjugated"
		   });	
		addAnnotation
		  (getServiceInterface__PartsTypesOfServiceInterface__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.base_Class.ownedAttribute->forAll(a|self.base_Class.getAllUsedInterfaces()->includes(a.type) or \r\n\tself.base_Class.allRealizedInterfaces()->includes(a.type))\r\n"
		   });	
		addAnnotation
		  (getServicesArchitecture__ParticipantsRoleCompatibility__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "let properties : Set (UML::ConnectableElement) = self.base_Collaboration.role,\r\ncollBUses: Set(UML::Element)= self.base_Collaboration.collaborationUse in\r\ncollBUses->notEmpty() implies \r\n-- Each participant satisfying roles in a ServicesArchitecture shall have a port for each role binding attached to that participant. \r\n--This port shall have a type compliant with the type of the role used in the ServiceContract.\r\ncollBUses.oclAsType(UML::CollaborationUse).roleBinding-> forAll(rb| let \r\n\tportTypesOfSupplier=\trb.oclAsType(UML::Dependency).supplier->select(s|s.oclIsTypeOf(UML::Property))->select(s|s.oclAsType(UML::Property).type.oclIsTypeOf(Class))->collect(oclAsType(UML::Property).type.oclAsType(Class).getAllAttributes())->select(att|att.oclIsTypeOf(UML::Port))->collect(oclAsType(UML::Port).type) , clientType=rb.oclAsType(UML::Dependency).client->select(s|s.oclIsTypeOf(UML::Property))->collect(t:UML::NamedElement|t.oclAsType(UML::Property).type)->asOrderedSet()->first()in \t\r\nportTypesOfSupplier->includes(clientType)--1. The role correspond to a port type on the supplier.\r\n--2. the supplier has a port type that specializes the type of the role.\r\nor(clientType.oclAsType(Classifier).generalization.general->closure(general)->includes(portTypesOfSupplier)) \r\n--3. the supplier has a port type that realizes the type of the role.\r\nor(clientType.oclAsType(Classifier).getRelationships().oclAsType(UML::Realization)->includes(portTypesOfSupplier)) \r\n--4. the supplier has a port type that contains at least the ownedAttributes and ownedOperations of the role.\r\nor(portTypesOfSupplier.oclAsType(Classifier).getAllAttributes()->includesAll(clientType.oclAsType(Classifier).getAllAttributes()) \r\n\tand portTypesOfSupplier.oclAsType(Classifier).getAllOperations()->includesAll(clientType.oclAsType(Classifier).getAllOperations())\r\n) )"
		   });	
		addAnnotation
		  (getServicesArchitecture__PartsTypes__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "let properties : Set (UML::ConnectableElement) = self.base_Collaboration.role,\r\ncollBUses: Set(UML::Element)= self.base_Collaboration.collaborationUse in\r\nproperties->notEmpty() implies \r\nproperties-> forAll(p|p.type->exists(p|p.getAppliedStereotypes()->select(s|s.name=\'Participant\' or s.name=\'Capability\' or s.name=\'Agent\' )->size()=1) )\r\n"
		   });	
		addAnnotation
		  (getCollaborationUse__RoleBindingClientSupplierCompatibility__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "--only in case of defining Contract collaboratinUse inside the ServiceInterface\r\n--If the CollaborationUse has isStrict=true, then the parts must be compatible with the roles they are bound to.\r\nself.isStrict=true and self.base_CollaborationUse.owner.oclIsTypeOf(Classifier) \r\nand  self.base_CollaborationUse.type.oclAsType(UML::Collaboration).getAppliedStereotypes()->select(s|s.name=\'ServiceContract\')->size()=1 implies\r\n--For parts to be compatible with a role, one of the following must be true:\r\n--1. The role and part have the same type.\r\nself.base_CollaborationUse.roleBinding-> forAll(rb|\r\n\t(let supplierType =(rb.oclAsType(UML::Dependency).supplier->select(s|s.oclIsTypeOf(UML::Property))->select(s|s.oclAsType(UML::Property).type.oclIsTypeOf(Class))\r\n\t->collect(oclAsType(UML::Property).type ->asOrderedSet()->first())),\r\n\tclientType= (rb.oclAsType(UML::Dependency).client->select(s|s.oclIsTypeOf(UML::Property))->collect(t:UML::NamedElement|t.oclAsType(UML::Property).type)->asOrderedSet()->first())in (\r\n\tsupplierType= clientType\r\n--2. The part (the supplier) has a type that specializes the type of the role.\r\nor(clientType.oclAsType(Classifier).generalization.general->closure(general)->includes(supplierType)) \r\n--3. The part has a type that realizes the type of the role.\r\nor(clientType.oclAsType(Classifier).getRelationships().oclAsType(UML::Realization)->includes(supplierType)) \r\n--4. The part has a type that contains at least the ownedAttributes and ownedOperations of the role. In general this is a\r\n--special case of item 3 where the part has an Interface type that realizes another Interface.\r\nor(supplierType.oclAsType(Classifier).getAllAttributes()->includesAll(clientType.oclAsType(Classifier).getAllAttributes()) \r\n\tand supplierType.oclAsType(Classifier).getAllOperations()->includesAll(clientType.oclAsType(Classifier).getAllOperations())\r\n) )\r\n--5. The type of each role in a service contract shall have a uses dependency to the type of all roles that role is connected to.\r\n)\r\n)"
		   });	
		addAnnotation
		  (getServiceChannel__Onlybinaryconnectorsallowed__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.base_Connector.end->size() = 2 \r\n--and self.base_Connector.end->forAll(e|e.oclIsTypeOf(UML::Port)) "
		   });	
		addAnnotation
		  (getServiceChannel__ServiceChannelEndTypes__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "let portsSet: OrderedSet(UML::ConnectorEnd)= self.base_Connector.end ->select(e|e.oclIsTypeOf(UML::Port)) in\r\n  portsSet->size()>0 implies \r\n  portsSet->forAll(p|p.getAppliedStereotypes()->select(s|s.name=\'Request\' or s.name=\'Service\')->size()=1 )\r\n"
		   });	
		addAnnotation
		  (getServiceChannel__Compatibility__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "let \r\n requestTypeClassifier: UML::Classifier=self.base_Connector.end->select(p|p.oclIsTypeOf(UML::Port) and  \toclIsTypeOf(SoaML::Request))\r\n -> select(p|p.oclAsType(UML::Port).type.oclIsTypeOf(Classifier))->first().oclAsType(UML::Port).type.oclAsType(Classifier),\r\n serviceTypeClassifier: UML::Classifier=self.base_Connector.end->select(p|p.oclIsTypeOf(UML::Port) and oclIsTypeOf(SoaML::Service))\r\n ->select(p|p.oclAsType(UML::Port).type.oclIsTypeOf(Classifier))->first().oclAsType(UML::Port).type.oclAsType(Classifier)  in \r\n--The Request and Service connected by a ServiceChannel must be compatible\r\n  --1. The Request and Service have the same type, either an Interface or ServiceInterface.\r\nnot requestTypeClassifier.oclIsUndefined() and not serviceTypeClassifier.oclIsUndefined() implies requestTypeClassifier=serviceTypeClassifier or\r\n --2. The type of the Service is a specialization or realization of the type of the Request.  --2 implies 1\r\nserviceTypeClassifier.Generalization.general->closure(general)-> includes(requestTypeClassifier) or\r\n requestTypeClassifier.allUsedInterfaces()->includes(serviceTypeClassifier) or\r\n --3. The Request and Service have compatible needs and capabilities respectively. This means the Service must provide an \r\n--Operation for every Operation used through the Request, the Request must provide an Operation for every Operation used \r\n--through the Service, and the protocols for how the capabilities are compatible between the Request and Service. \r\n(requestTypeClassifier.allUsedInterfaces().getAllOperations()->includesAll(serviceTypeClassifier.allRealizedInterfaces().getAllOperations() )and \r\n\trequestTypeClassifier.allRealizedInterfaces().getAllOperations()-> includesAll(serviceTypeClassifier.allUsedInterfaces().getAllOperations()))"
		   });	
		addAnnotation
		  (getService__ServiceType__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "  if base_Port.type.oclIsUndefined() then false else\r\n  let portType: Type=  base_Port.type in\r\n portType.getAppliedStereotypes()->select(s|s.name=\'ServiceInterface\' or  s.name=\'Provider\' )->size()=1 or portType.oclIsTypeOf(Interface)\r\n endif "
		   });	
		addAnnotation
		  (getService__IsConjugatedFalse__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", " \r\n  not base_Port.isConjugated"
		   });	
		addAnnotation
		  (getPort__ConnectorRequired__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "--self.connectorRequired=true implies self.base_Port.owner.\r\ntrue"
		   });
	}

} //SoaMLPackageImpl
