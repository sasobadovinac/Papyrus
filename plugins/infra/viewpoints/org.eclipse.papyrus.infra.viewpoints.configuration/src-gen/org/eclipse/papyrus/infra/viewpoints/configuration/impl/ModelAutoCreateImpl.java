/**
 * Copyright (c) 2013, 2015 CEA LIST, Christian W. Damus, and others.
 *
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *  Laurent Wouters laurent.wouters@cea.fr - Initial API and implementation
 *  Christian W. Damus - bug 463156
 *
 *
 */
package org.eclipse.papyrus.infra.viewpoints.configuration.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.papyrus.infra.viewpoints.configuration.ConfigurationPackage;
import org.eclipse.papyrus.infra.viewpoints.configuration.ModelAutoCreate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Auto Create</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.infra.viewpoints.configuration.impl.ModelAutoCreateImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.eclipse.papyrus.infra.viewpoints.configuration.impl.ModelAutoCreateImpl#getOrigin <em>Origin</em>}</li>
 *   <li>{@link org.eclipse.papyrus.infra.viewpoints.configuration.impl.ModelAutoCreateImpl#getCreationType <em>Creation Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelAutoCreateImpl extends MinimalEObjectImpl.Container implements ModelAutoCreate {
	/**
	 * The cached value of the '{@link #getFeature() <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected EReference feature;

	/**
	 * The default value of the '{@link #getCreationType() <em>Creation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationType()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATION_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreationType() <em>Creation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationType()
	 * @generated
	 * @ordered
	 */
	protected String creationType = CREATION_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelAutoCreateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigurationPackage.Literals.MODEL_AUTO_CREATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeature() {
		if (feature != null && feature.eIsProxy()) {
			InternalEObject oldFeature = (InternalEObject) feature;
			feature = (EReference) eResolveProxy(oldFeature);
			if (feature != oldFeature) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConfigurationPackage.MODEL_AUTO_CREATE__FEATURE, oldFeature, feature));
				}
			}
		}
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference basicGetFeature() {
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeature(EReference newFeature) {
		EReference oldFeature = feature;
		feature = newFeature;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.MODEL_AUTO_CREATE__FEATURE, oldFeature, feature));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrigin() {
		EClass origin = basicGetOrigin();
		return origin != null && origin.eIsProxy() ? (EClass) eResolveProxy((InternalEObject) origin) : origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetOrigin() {
		// TODO: implement this method to return the 'Origin' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreationType() {
		return creationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationType(String newCreationType) {
		String oldCreationType = creationType;
		creationType = newCreationType;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.MODEL_AUTO_CREATE__CREATION_TYPE, oldCreationType, creationType));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ConfigurationPackage.MODEL_AUTO_CREATE__FEATURE:
			if (resolve) {
				return getFeature();
			}
			return basicGetFeature();
		case ConfigurationPackage.MODEL_AUTO_CREATE__ORIGIN:
			if (resolve) {
				return getOrigin();
			}
			return basicGetOrigin();
		case ConfigurationPackage.MODEL_AUTO_CREATE__CREATION_TYPE:
			return getCreationType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ConfigurationPackage.MODEL_AUTO_CREATE__FEATURE:
			setFeature((EReference) newValue);
			return;
		case ConfigurationPackage.MODEL_AUTO_CREATE__CREATION_TYPE:
			setCreationType((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ConfigurationPackage.MODEL_AUTO_CREATE__FEATURE:
			setFeature((EReference) null);
			return;
		case ConfigurationPackage.MODEL_AUTO_CREATE__CREATION_TYPE:
			setCreationType(CREATION_TYPE_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ConfigurationPackage.MODEL_AUTO_CREATE__FEATURE:
			return feature != null;
		case ConfigurationPackage.MODEL_AUTO_CREATE__ORIGIN:
			return basicGetOrigin() != null;
		case ConfigurationPackage.MODEL_AUTO_CREATE__CREATION_TYPE:
			return CREATION_TYPE_EDEFAULT == null ? creationType != null : !CREATION_TYPE_EDEFAULT.equals(creationType);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) {
			return super.toString();
		}

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (creationType: ");
		result.append(creationType);
		result.append(')');
		return result.toString();
	}

} //ModelAutoCreateImpl
