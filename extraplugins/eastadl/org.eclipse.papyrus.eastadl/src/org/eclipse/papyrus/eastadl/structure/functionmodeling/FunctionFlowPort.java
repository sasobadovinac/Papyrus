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
 *  Sara TUCCI (CEA LIST) sara.tucci@cea.fr - Initial API and implementation
 *  Chokri MRAIDHA (CEA LIST) chokri.mraidha@cea.fr - Initial API and implementation
 *  David SERVAT (CEA LIST) david.servat@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.eastadl.structure.functionmodeling;


import org.eclipse.papyrus.eastadl.infrastructure.datatypes.EADatatype;
import org.eclipse.papyrus.eastadl.infrastructure.values.EAValue;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Flow Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The FunctionFlowPort is a metaclass for flowports, inspired by the SysML FlowPort.
 * 
 * Semantics:
 * FunctionFlowPorts are single buffer overwrite and nonconsumable.
 * 
 * FunctionFlowPorts can be connected if their FunctionPort signatures match; i.e.:
 * 
 * EADatatypes that are ValueTypes are compatible if
 * 
 * * They have the same "dimension".
 * 
 * * They have the same "unit".
 * 
 * EADatatypes that are RangeableValueTypes are compatible if
 * 
 * * The source EADatatype has the same or better "accuracy".
 * 
 * * They have the same baseRangeable.
 * 
 * * The source EADatatype has the same or smaller "maxValue".
 * 
 * * The source EADatatype has the same or higher "minValue".
 * 
 * * The source EADatatype has the same or higher "resolution".
 * 
 * * They have the same "significantDigits".
 * 
 * EADatatypes that are EnumerationValueTypes are compatible if
 * 
 * * They have the same baseEnumeration.
 * 
 * FunctionFlowPort with direction=in, is called an input FunctionFlowPort:
 * 
 * The input FunctionFlowPort indicates that the containing Function requires input data. The EADatatype of this data is defined by the associated EADatatype. The data is sampled at the invocation of the containing entity for discrete Functions. For continuous Functions, the input FunctionFlowPort represents a continuous input connection point.
 * 
 * The input FunctionFlowPort declares a reception point of data. It represents a single element buffer, which is overridden with the latest data. The type of the data is defined by the associated EADatatype.
 * 
 * FunctionFlowPort with direction=out, is called an output FunctionFlowPort:
 * 
 * The output FunctionFlowPort indicates that the containing Function provides output data. The EADatatype of this data is defined by the associated EADatatype. The data is sent at the completion of the containing entity for discrete Functions. For continuous Functions, the output FunctionFlowPort represents a (time-)continuous output connection point.
 * 
 * The output FunctionFlowPort declares a transmission point of data. The type of the data is defined by the associated EADatatype.
 * 
 * 
 * Extension: UML Port, specialization of SysML::FlowPort
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.eastadl.structure.functionmodeling.FunctionFlowPort#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.structure.functionmodeling.FunctionFlowPort#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.structure.functionmodeling.FunctionFlowPort#getDirection <em>Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.eastadl.structure.functionmodeling.FunctionmodelingPackage#getFunctionFlowPort()
 * @model
 * @generated
 */
public interface FunctionFlowPort extends FunctionPort {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see org.eclipse.papyrus.eastadl.structure.functionmodeling.FunctionmodelingPackage#getFunctionFlowPort_Type()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EADatatype getType();

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' reference.
	 * @see #setDefaultValue(EAValue)
	 * @see org.eclipse.papyrus.eastadl.structure.functionmodeling.FunctionmodelingPackage#getFunctionFlowPort_DefaultValue()
	 * @model ordered="false"
	 * @generated
	 */
	EAValue getDefaultValue();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.structure.functionmodeling.FunctionFlowPort#getDefaultValue <em>Default Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' reference.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(EAValue value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.eastadl.structure.functionmodeling.EADirectionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see org.eclipse.papyrus.eastadl.structure.functionmodeling.EADirectionKind
	 * @see #setDirection(EADirectionKind)
	 * @see org.eclipse.papyrus.eastadl.structure.functionmodeling.FunctionmodelingPackage#getFunctionFlowPort_Direction()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EADirectionKind getDirection();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.structure.functionmodeling.FunctionFlowPort#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see org.eclipse.papyrus.eastadl.structure.functionmodeling.EADirectionKind
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(EADirectionKind value);

} // FunctionFlowPort
