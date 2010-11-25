/*****************************************************************************
 * Copyright (c) 2010 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Chokri MRAIDHA (CEA LIST) chokri.mraidha@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.impl;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.papyrus.MARTE.MARTEPackage;

import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage;

import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.impl.GQAMPackageImpl;

import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.PAM.PAMPackage;

import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.PAM.impl.PAMPackageImpl;

import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.SAM.SAMPackage;

import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.SAM.impl.SAMPackageImpl;

import org.eclipse.papyrus.MARTE.MARTE_Annexes.RSM.RSMPackage;

import org.eclipse.papyrus.MARTE.MARTE_Annexes.RSM.impl.RSMPackageImpl;

import org.eclipse.papyrus.MARTE.MARTE_Annexes.VSL.DataTypes.DataTypesPackage;

import org.eclipse.papyrus.MARTE.MARTE_Annexes.VSL.DataTypes.impl.DataTypesPackageImpl;

import org.eclipse.papyrus.MARTE.MARTE_Annexes.VSL.Operators.OperatorsPackage;
import org.eclipse.papyrus.MARTE.MARTE_Annexes.VSL.Operators.impl.OperatorsPackageImpl;
import org.eclipse.papyrus.MARTE.MARTE_Annexes.VSL.Variables.VariablesPackage;

import org.eclipse.papyrus.MARTE.MARTE_Annexes.VSL.Variables.impl.VariablesPackageImpl;

import org.eclipse.papyrus.MARTE.MARTE_DesignModel.GCM.GCMPackage;

import org.eclipse.papyrus.MARTE.MARTE_DesignModel.GCM.impl.GCMPackageImpl;

import org.eclipse.papyrus.MARTE.MARTE_DesignModel.HLAM.HLAMPackage;

import org.eclipse.papyrus.MARTE.MARTE_DesignModel.HLAM.impl.HLAMPackageImpl;

import org.eclipse.papyrus.MARTE.MARTE_DesignModel.HRM.HwGeneral.HwGeneralPackage;

import org.eclipse.papyrus.MARTE.MARTE_DesignModel.HRM.HwGeneral.impl.HwGeneralPackageImpl;

import org.eclipse.papyrus.MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwCommunicationPackage;

import org.eclipse.papyrus.MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.impl.HwCommunicationPackageImpl;

import org.eclipse.papyrus.MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingPackage;

import org.eclipse.papyrus.MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwComputingPackageImpl;

import org.eclipse.papyrus.MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwDevicePackage;

import org.eclipse.papyrus.MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.impl.HwDevicePackageImpl;

import org.eclipse.papyrus.MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemoryPackage;

import org.eclipse.papyrus.MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.HwMemoryPackageImpl;

import org.eclipse.papyrus.MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwStorageManager.HwStorageManagerPackage;

import org.eclipse.papyrus.MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwStorageManager.impl.HwStorageManagerPackageImpl;

import org.eclipse.papyrus.MARTE.MARTE_DesignModel.HRM.HwLogical.HwTiming.HwTimingPackage;

import org.eclipse.papyrus.MARTE.MARTE_DesignModel.HRM.HwLogical.HwTiming.impl.HwTimingPackageImpl;

import org.eclipse.papyrus.MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.ComponentKind;
import org.eclipse.papyrus.MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.ComponentState;
import org.eclipse.papyrus.MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.ConditionType;
import org.eclipse.papyrus.MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwComponent;
import org.eclipse.papyrus.MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwLayoutFactory;
import org.eclipse.papyrus.MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwLayoutPackage;

import org.eclipse.papyrus.MARTE.MARTE_DesignModel.HRM.HwPhysical.HwPower.HwPowerPackage;

import org.eclipse.papyrus.MARTE.MARTE_DesignModel.HRM.HwPhysical.HwPower.impl.HwPowerPackageImpl;

import org.eclipse.papyrus.MARTE.MARTE_DesignModel.SRM.SW_Brokering.SW_BrokeringPackage;

import org.eclipse.papyrus.MARTE.MARTE_DesignModel.SRM.SW_Brokering.impl.SW_BrokeringPackageImpl;

import org.eclipse.papyrus.MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SW_ConcurrencyPackage;

import org.eclipse.papyrus.MARTE.MARTE_DesignModel.SRM.SW_Concurrency.impl.SW_ConcurrencyPackageImpl;

import org.eclipse.papyrus.MARTE.MARTE_DesignModel.SRM.SW_Interaction.SW_InteractionPackage;

import org.eclipse.papyrus.MARTE.MARTE_DesignModel.SRM.SW_Interaction.impl.SW_InteractionPackageImpl;

import org.eclipse.papyrus.MARTE.MARTE_DesignModel.SRM.SW_ResourceCore.SW_ResourceCorePackage;

import org.eclipse.papyrus.MARTE.MARTE_DesignModel.SRM.SW_ResourceCore.impl.SW_ResourceCorePackageImpl;

import org.eclipse.papyrus.MARTE.MARTE_Foundations.Alloc.AllocPackage;

import org.eclipse.papyrus.MARTE.MARTE_Foundations.Alloc.impl.AllocPackageImpl;

import org.eclipse.papyrus.MARTE.MARTE_Foundations.CoreElements.CoreElementsPackage;

import org.eclipse.papyrus.MARTE.MARTE_Foundations.CoreElements.impl.CoreElementsPackageImpl;

import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.GRMPackage;

import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.impl.GRMPackageImpl;

import org.eclipse.papyrus.MARTE.MARTE_Foundations.NFPs.NFPsPackage;

import org.eclipse.papyrus.MARTE.MARTE_Foundations.NFPs.impl.NFPsPackageImpl;

import org.eclipse.papyrus.MARTE.MARTE_Foundations.Time.TimePackage;

import org.eclipse.papyrus.MARTE.MARTE_Foundations.Time.impl.TimePackageImpl;

import org.eclipse.papyrus.MARTE.impl.MARTEPackageImpl;

import org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage;

import org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.impl.BasicNFP_TypesPackageImpl;

import org.eclipse.papyrus.MARTE_Library.GRM_BasicTypes.GRM_BasicTypesPackage;

import org.eclipse.papyrus.MARTE_Library.GRM_BasicTypes.impl.GRM_BasicTypesPackageImpl;

import org.eclipse.papyrus.MARTE_Library.MARTE_DataTypes.MARTE_DataTypesPackage;

import org.eclipse.papyrus.MARTE_Library.MARTE_DataTypes.impl.MARTE_DataTypesPackageImpl;

import org.eclipse.papyrus.MARTE_Library.MARTE_PrimitivesTypes.MARTE_PrimitivesTypesPackage;

import org.eclipse.papyrus.MARTE_Library.MARTE_PrimitivesTypes.impl.MARTE_PrimitivesTypesPackageImpl;

import org.eclipse.papyrus.MARTE_Library.MeasurementUnits.MeasurementUnitsPackage;

import org.eclipse.papyrus.MARTE_Library.MeasurementUnits.impl.MeasurementUnitsPackageImpl;

import org.eclipse.papyrus.MARTE_Library.RS_Library.RS_LibraryPackage;

import org.eclipse.papyrus.MARTE_Library.RS_Library.impl.RS_LibraryPackageImpl;

import org.eclipse.papyrus.MARTE_Library.TimeLibrary.TimeLibraryPackage;

import org.eclipse.papyrus.MARTE_Library.TimeLibrary.impl.TimeLibraryPackageImpl;

import org.eclipse.papyrus.MARTE_Library.TimeTypesLibrary.TimeTypesLibraryPackage;

import org.eclipse.papyrus.MARTE_Library.TimeTypesLibrary.impl.TimeTypesLibraryPackageImpl;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HwLayoutPackageImpl extends EPackageImpl implements HwLayoutPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hwComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum componentKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum conditionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum componentStateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType env_ConditionEDataType = null;

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
	 * @see org.eclipse.papyrus.MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwLayoutPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private HwLayoutPackageImpl() {
		super(eNS_URI, HwLayoutFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link HwLayoutPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static HwLayoutPackage init() {
		if (isInited) return (HwLayoutPackage)EPackage.Registry.INSTANCE.getEPackage(HwLayoutPackage.eNS_URI);

		// Obtain or create and register package
		HwLayoutPackageImpl theHwLayoutPackage = (HwLayoutPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof HwLayoutPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new HwLayoutPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		UMLPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		MARTEPackageImpl theMARTEPackage = (MARTEPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MARTEPackage.eNS_URI) instanceof MARTEPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MARTEPackage.eNS_URI) : MARTEPackage.eINSTANCE);
		NFPsPackageImpl theNFPsPackage = (NFPsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NFPsPackage.eNS_URI) instanceof NFPsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NFPsPackage.eNS_URI) : NFPsPackage.eINSTANCE);
		CoreElementsPackageImpl theCoreElementsPackage = (CoreElementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CoreElementsPackage.eNS_URI) instanceof CoreElementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CoreElementsPackage.eNS_URI) : CoreElementsPackage.eINSTANCE);
		AllocPackageImpl theAllocPackage = (AllocPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AllocPackage.eNS_URI) instanceof AllocPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AllocPackage.eNS_URI) : AllocPackage.eINSTANCE);
		TimePackageImpl theTimePackage = (TimePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TimePackage.eNS_URI) instanceof TimePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TimePackage.eNS_URI) : TimePackage.eINSTANCE);
		GRMPackageImpl theGRMPackage = (GRMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GRMPackage.eNS_URI) instanceof GRMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GRMPackage.eNS_URI) : GRMPackage.eINSTANCE);
		RSMPackageImpl theRSMPackage = (RSMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RSMPackage.eNS_URI) instanceof RSMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RSMPackage.eNS_URI) : RSMPackage.eINSTANCE);
		VariablesPackageImpl theVariablesPackage = (VariablesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VariablesPackage.eNS_URI) instanceof VariablesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VariablesPackage.eNS_URI) : VariablesPackage.eINSTANCE);
		OperatorsPackageImpl theOperatorsPackage = (OperatorsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OperatorsPackage.eNS_URI) instanceof OperatorsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OperatorsPackage.eNS_URI) : OperatorsPackage.eINSTANCE);
		DataTypesPackageImpl theDataTypesPackage = (DataTypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataTypesPackage.eNS_URI) instanceof DataTypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataTypesPackage.eNS_URI) : DataTypesPackage.eINSTANCE);
		HLAMPackageImpl theHLAMPackage = (HLAMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HLAMPackage.eNS_URI) instanceof HLAMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HLAMPackage.eNS_URI) : HLAMPackage.eINSTANCE);
		HwComputingPackageImpl theHwComputingPackage = (HwComputingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HwComputingPackage.eNS_URI) instanceof HwComputingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HwComputingPackage.eNS_URI) : HwComputingPackage.eINSTANCE);
		HwCommunicationPackageImpl theHwCommunicationPackage = (HwCommunicationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HwCommunicationPackage.eNS_URI) instanceof HwCommunicationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HwCommunicationPackage.eNS_URI) : HwCommunicationPackage.eINSTANCE);
		HwStorageManagerPackageImpl theHwStorageManagerPackage = (HwStorageManagerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HwStorageManagerPackage.eNS_URI) instanceof HwStorageManagerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HwStorageManagerPackage.eNS_URI) : HwStorageManagerPackage.eINSTANCE);
		HwMemoryPackageImpl theHwMemoryPackage = (HwMemoryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HwMemoryPackage.eNS_URI) instanceof HwMemoryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HwMemoryPackage.eNS_URI) : HwMemoryPackage.eINSTANCE);
		HwTimingPackageImpl theHwTimingPackage = (HwTimingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HwTimingPackage.eNS_URI) instanceof HwTimingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HwTimingPackage.eNS_URI) : HwTimingPackage.eINSTANCE);
		HwDevicePackageImpl theHwDevicePackage = (HwDevicePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HwDevicePackage.eNS_URI) instanceof HwDevicePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HwDevicePackage.eNS_URI) : HwDevicePackage.eINSTANCE);
		HwGeneralPackageImpl theHwGeneralPackage = (HwGeneralPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HwGeneralPackage.eNS_URI) instanceof HwGeneralPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HwGeneralPackage.eNS_URI) : HwGeneralPackage.eINSTANCE);
		HwPowerPackageImpl theHwPowerPackage = (HwPowerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HwPowerPackage.eNS_URI) instanceof HwPowerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HwPowerPackage.eNS_URI) : HwPowerPackage.eINSTANCE);
		SW_ResourceCorePackageImpl theSW_ResourceCorePackage = (SW_ResourceCorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SW_ResourceCorePackage.eNS_URI) instanceof SW_ResourceCorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SW_ResourceCorePackage.eNS_URI) : SW_ResourceCorePackage.eINSTANCE);
		SW_ConcurrencyPackageImpl theSW_ConcurrencyPackage = (SW_ConcurrencyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SW_ConcurrencyPackage.eNS_URI) instanceof SW_ConcurrencyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SW_ConcurrencyPackage.eNS_URI) : SW_ConcurrencyPackage.eINSTANCE);
		SW_BrokeringPackageImpl theSW_BrokeringPackage = (SW_BrokeringPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SW_BrokeringPackage.eNS_URI) instanceof SW_BrokeringPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SW_BrokeringPackage.eNS_URI) : SW_BrokeringPackage.eINSTANCE);
		SW_InteractionPackageImpl theSW_InteractionPackage = (SW_InteractionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SW_InteractionPackage.eNS_URI) instanceof SW_InteractionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SW_InteractionPackage.eNS_URI) : SW_InteractionPackage.eINSTANCE);
		GCMPackageImpl theGCMPackage = (GCMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GCMPackage.eNS_URI) instanceof GCMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GCMPackage.eNS_URI) : GCMPackage.eINSTANCE);
		GQAMPackageImpl theGQAMPackage = (GQAMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GQAMPackage.eNS_URI) instanceof GQAMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GQAMPackage.eNS_URI) : GQAMPackage.eINSTANCE);
		SAMPackageImpl theSAMPackage = (SAMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SAMPackage.eNS_URI) instanceof SAMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SAMPackage.eNS_URI) : SAMPackage.eINSTANCE);
		PAMPackageImpl thePAMPackage = (PAMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PAMPackage.eNS_URI) instanceof PAMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PAMPackage.eNS_URI) : PAMPackage.eINSTANCE);
		MeasurementUnitsPackageImpl theMeasurementUnitsPackage = (MeasurementUnitsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MeasurementUnitsPackage.eNS_URI) instanceof MeasurementUnitsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MeasurementUnitsPackage.eNS_URI) : MeasurementUnitsPackage.eINSTANCE);
		GRM_BasicTypesPackageImpl theGRM_BasicTypesPackage = (GRM_BasicTypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GRM_BasicTypesPackage.eNS_URI) instanceof GRM_BasicTypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GRM_BasicTypesPackage.eNS_URI) : GRM_BasicTypesPackage.eINSTANCE);
		MARTE_DataTypesPackageImpl theMARTE_DataTypesPackage = (MARTE_DataTypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MARTE_DataTypesPackage.eNS_URI) instanceof MARTE_DataTypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MARTE_DataTypesPackage.eNS_URI) : MARTE_DataTypesPackage.eINSTANCE);
		BasicNFP_TypesPackageImpl theBasicNFP_TypesPackage = (BasicNFP_TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasicNFP_TypesPackage.eNS_URI) instanceof BasicNFP_TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasicNFP_TypesPackage.eNS_URI) : BasicNFP_TypesPackage.eINSTANCE);
		TimeTypesLibraryPackageImpl theTimeTypesLibraryPackage = (TimeTypesLibraryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TimeTypesLibraryPackage.eNS_URI) instanceof TimeTypesLibraryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TimeTypesLibraryPackage.eNS_URI) : TimeTypesLibraryPackage.eINSTANCE);
		TimeLibraryPackageImpl theTimeLibraryPackage = (TimeLibraryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TimeLibraryPackage.eNS_URI) instanceof TimeLibraryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TimeLibraryPackage.eNS_URI) : TimeLibraryPackage.eINSTANCE);
		RS_LibraryPackageImpl theRS_LibraryPackage = (RS_LibraryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RS_LibraryPackage.eNS_URI) instanceof RS_LibraryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RS_LibraryPackage.eNS_URI) : RS_LibraryPackage.eINSTANCE);
		MARTE_PrimitivesTypesPackageImpl theMARTE_PrimitivesTypesPackage = (MARTE_PrimitivesTypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MARTE_PrimitivesTypesPackage.eNS_URI) instanceof MARTE_PrimitivesTypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MARTE_PrimitivesTypesPackage.eNS_URI) : MARTE_PrimitivesTypesPackage.eINSTANCE);

		// Create package meta-data objects
		theHwLayoutPackage.createPackageContents();
		theMARTEPackage.createPackageContents();
		theNFPsPackage.createPackageContents();
		theCoreElementsPackage.createPackageContents();
		theAllocPackage.createPackageContents();
		theTimePackage.createPackageContents();
		theGRMPackage.createPackageContents();
		theRSMPackage.createPackageContents();
		theVariablesPackage.createPackageContents();
		theOperatorsPackage.createPackageContents();
		theDataTypesPackage.createPackageContents();
		theHLAMPackage.createPackageContents();
		theHwComputingPackage.createPackageContents();
		theHwCommunicationPackage.createPackageContents();
		theHwStorageManagerPackage.createPackageContents();
		theHwMemoryPackage.createPackageContents();
		theHwTimingPackage.createPackageContents();
		theHwDevicePackage.createPackageContents();
		theHwGeneralPackage.createPackageContents();
		theHwPowerPackage.createPackageContents();
		theSW_ResourceCorePackage.createPackageContents();
		theSW_ConcurrencyPackage.createPackageContents();
		theSW_BrokeringPackage.createPackageContents();
		theSW_InteractionPackage.createPackageContents();
		theGCMPackage.createPackageContents();
		theGQAMPackage.createPackageContents();
		theSAMPackage.createPackageContents();
		thePAMPackage.createPackageContents();
		theMeasurementUnitsPackage.createPackageContents();
		theGRM_BasicTypesPackage.createPackageContents();
		theMARTE_DataTypesPackage.createPackageContents();
		theBasicNFP_TypesPackage.createPackageContents();
		theTimeTypesLibraryPackage.createPackageContents();
		theTimeLibraryPackage.createPackageContents();
		theRS_LibraryPackage.createPackageContents();
		theMARTE_PrimitivesTypesPackage.createPackageContents();

		// Initialize created meta-data
		theHwLayoutPackage.initializePackageContents();
		theMARTEPackage.initializePackageContents();
		theNFPsPackage.initializePackageContents();
		theCoreElementsPackage.initializePackageContents();
		theAllocPackage.initializePackageContents();
		theTimePackage.initializePackageContents();
		theGRMPackage.initializePackageContents();
		theRSMPackage.initializePackageContents();
		theVariablesPackage.initializePackageContents();
		theOperatorsPackage.initializePackageContents();
		theDataTypesPackage.initializePackageContents();
		theHLAMPackage.initializePackageContents();
		theHwComputingPackage.initializePackageContents();
		theHwCommunicationPackage.initializePackageContents();
		theHwStorageManagerPackage.initializePackageContents();
		theHwMemoryPackage.initializePackageContents();
		theHwTimingPackage.initializePackageContents();
		theHwDevicePackage.initializePackageContents();
		theHwGeneralPackage.initializePackageContents();
		theHwPowerPackage.initializePackageContents();
		theSW_ResourceCorePackage.initializePackageContents();
		theSW_ConcurrencyPackage.initializePackageContents();
		theSW_BrokeringPackage.initializePackageContents();
		theSW_InteractionPackage.initializePackageContents();
		theGCMPackage.initializePackageContents();
		theGQAMPackage.initializePackageContents();
		theSAMPackage.initializePackageContents();
		thePAMPackage.initializePackageContents();
		theMeasurementUnitsPackage.initializePackageContents();
		theGRM_BasicTypesPackage.initializePackageContents();
		theMARTE_DataTypesPackage.initializePackageContents();
		theBasicNFP_TypesPackage.initializePackageContents();
		theTimeTypesLibraryPackage.initializePackageContents();
		theTimeLibraryPackage.initializePackageContents();
		theRS_LibraryPackage.initializePackageContents();
		theMARTE_PrimitivesTypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theHwLayoutPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(HwLayoutPackage.eNS_URI, theHwLayoutPackage);
		return theHwLayoutPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHwComponent() {
		return hwComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHwComponent_Kind() {
		return (EAttribute)hwComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHwComponent_Dimensions() {
		return (EAttribute)hwComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHwComponent_Area() {
		return (EAttribute)hwComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHwComponent_Position() {
		return (EAttribute)hwComponentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHwComponent_Grid() {
		return (EAttribute)hwComponentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHwComponent_NbPins() {
		return (EAttribute)hwComponentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHwComponent_Weight() {
		return (EAttribute)hwComponentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHwComponent_Price() {
		return (EAttribute)hwComponentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHwComponent_R_Conditions() {
		return (EAttribute)hwComponentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHwComponent_PoweredServices() {
		return (EReference)hwComponentEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHwComponent_StaticConsumption() {
		return (EAttribute)hwComponentEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHwComponent_StaticDissipation() {
		return (EAttribute)hwComponentEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHwComponent_SubComponents() {
		return (EReference)hwComponentEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getComponentKind() {
		return componentKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConditionType() {
		return conditionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getComponentState() {
		return componentStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEnv_Condition() {
		return env_ConditionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwLayoutFactory getHwLayoutFactory() {
		return (HwLayoutFactory)getEFactoryInstance();
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
		hwComponentEClass = createEClass(HW_COMPONENT);
		createEAttribute(hwComponentEClass, HW_COMPONENT__KIND);
		createEAttribute(hwComponentEClass, HW_COMPONENT__DIMENSIONS);
		createEAttribute(hwComponentEClass, HW_COMPONENT__AREA);
		createEAttribute(hwComponentEClass, HW_COMPONENT__POSITION);
		createEAttribute(hwComponentEClass, HW_COMPONENT__GRID);
		createEAttribute(hwComponentEClass, HW_COMPONENT__NB_PINS);
		createEAttribute(hwComponentEClass, HW_COMPONENT__WEIGHT);
		createEAttribute(hwComponentEClass, HW_COMPONENT__PRICE);
		createEAttribute(hwComponentEClass, HW_COMPONENT__RCONDITIONS);
		createEReference(hwComponentEClass, HW_COMPONENT__POWERED_SERVICES);
		createEAttribute(hwComponentEClass, HW_COMPONENT__STATIC_CONSUMPTION);
		createEAttribute(hwComponentEClass, HW_COMPONENT__STATIC_DISSIPATION);
		createEReference(hwComponentEClass, HW_COMPONENT__SUB_COMPONENTS);

		// Create enums
		componentKindEEnum = createEEnum(COMPONENT_KIND);
		conditionTypeEEnum = createEEnum(CONDITION_TYPE);
		componentStateEEnum = createEEnum(COMPONENT_STATE);

		// Create data types
		env_ConditionEDataType = createEDataType(ENV_CONDITION);
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
		HwGeneralPackage theHwGeneralPackage = (HwGeneralPackage)EPackage.Registry.INSTANCE.getEPackage(HwGeneralPackage.eNS_URI);
		BasicNFP_TypesPackage theBasicNFP_TypesPackage = (BasicNFP_TypesPackage)EPackage.Registry.INSTANCE.getEPackage(BasicNFP_TypesPackage.eNS_URI);
		MARTE_DataTypesPackage theMARTE_DataTypesPackage = (MARTE_DataTypesPackage)EPackage.Registry.INSTANCE.getEPackage(MARTE_DataTypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		hwComponentEClass.getESuperTypes().add(theHwGeneralPackage.getHwResource());

		// Initialize classes and features; add operations and parameters
		initEClass(hwComponentEClass, HwComponent.class, "HwComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHwComponent_Kind(), this.getComponentKind(), "kind", null, 0, 1, HwComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHwComponent_Dimensions(), theBasicNFP_TypesPackage.getNFP_Length(), "dimensions", null, 0, 3, HwComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHwComponent_Area(), theBasicNFP_TypesPackage.getNFP_Area(), "area", null, 0, 1, HwComponent.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHwComponent_Position(), theMARTE_DataTypesPackage.getNFP_NaturalInterval(), "position", null, 0, 2, HwComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHwComponent_Grid(), theBasicNFP_TypesPackage.getNFP_Natural(), "grid", null, 0, 2, HwComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHwComponent_NbPins(), theBasicNFP_TypesPackage.getNFP_Natural(), "nbPins", null, 0, 1, HwComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHwComponent_Weight(), theBasicNFP_TypesPackage.getNFP_Real(), "weight", null, 0, 1, HwComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHwComponent_Price(), theBasicNFP_TypesPackage.getNFP_Price(), "price", null, 0, 1, HwComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHwComponent_R_Conditions(), this.getEnv_Condition(), "r_Conditions", null, 0, -1, HwComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHwComponent_PoweredServices(), theHwGeneralPackage.getHwResourceService(), null, "poweredServices", null, 0, -1, HwComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHwComponent_StaticConsumption(), theBasicNFP_TypesPackage.getNFP_Power(), "staticConsumption", null, 0, 1, HwComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHwComponent_StaticDissipation(), theBasicNFP_TypesPackage.getNFP_Power(), "staticDissipation", null, 0, 1, HwComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHwComponent_SubComponents(), this.getHwComponent(), null, "subComponents", null, 0, -1, HwComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(componentKindEEnum, ComponentKind.class, "ComponentKind");
		addEEnumLiteral(componentKindEEnum, ComponentKind.CARD);
		addEEnumLiteral(componentKindEEnum, ComponentKind.CHANNEL);
		addEEnumLiteral(componentKindEEnum, ComponentKind.CHIP);
		addEEnumLiteral(componentKindEEnum, ComponentKind.PORT);
		addEEnumLiteral(componentKindEEnum, ComponentKind.UNIT);
		addEEnumLiteral(componentKindEEnum, ComponentKind.OTHER);
		addEEnumLiteral(componentKindEEnum, ComponentKind.UNDEF);

		initEEnum(conditionTypeEEnum, ConditionType.class, "ConditionType");
		addEEnumLiteral(conditionTypeEEnum, ConditionType.TEMPERATURE);
		addEEnumLiteral(conditionTypeEEnum, ConditionType.HUMIDITY);
		addEEnumLiteral(conditionTypeEEnum, ConditionType.ALTITUDE);
		addEEnumLiteral(conditionTypeEEnum, ConditionType.VIBRATION);
		addEEnumLiteral(conditionTypeEEnum, ConditionType.SHOCK);
		addEEnumLiteral(conditionTypeEEnum, ConditionType.OTHER);
		addEEnumLiteral(conditionTypeEEnum, ConditionType.UNDEF);

		initEEnum(componentStateEEnum, ComponentState.class, "ComponentState");
		addEEnumLiteral(componentStateEEnum, ComponentState.OPERATING);
		addEEnumLiteral(componentStateEEnum, ComponentState.STORAGE);
		addEEnumLiteral(componentStateEEnum, ComponentState.OTHER);
		addEEnumLiteral(componentStateEEnum, ComponentState.UNDEF);

		// Initialize data types
		initEDataType(env_ConditionEDataType, String.class, "Env_Condition", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create annotations
		// redefines
		createRedefinesAnnotations();
		// subsets
		createSubsetsAnnotations();
	}

	/**
	 * Initializes the annotations for <b>redefines</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createRedefinesAnnotations() {
		String source = "redefines";		
		addAnnotation
		  (getHwComponent_PoweredServices(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(MARTEPackage.eNS_URI).appendFragment("//MARTE_DesignModel/HRM/HwGeneral/HwResource/p_HW_Services")
		   });	
	}

	/**
	 * Initializes the annotations for <b>subsets</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createSubsetsAnnotations() {
		String source = "subsets";			
		addAnnotation
		  (getHwComponent_SubComponents(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(MARTEPackage.eNS_URI).appendFragment("//MARTE_DesignModel/HRM/HwGeneral/HwResource/ownedHW")
		   });
	}

} //HwLayoutPackageImpl
