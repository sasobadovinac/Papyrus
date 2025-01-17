/**
 * Copyright (c) 2014 CEA LIST.
 * 
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
 */
package org.eclipse.papyrus.infra.types.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.papyrus.infra.types.AbstractMatcherConfiguration;
import org.eclipse.papyrus.infra.types.ContainerConfiguration;
import org.eclipse.papyrus.infra.types.ElementTypesConfigurationsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.infra.types.impl.ContainerConfigurationImpl#getContainerMatcherConfiguration <em>Container Matcher Configuration</em>}</li>
 *   <li>{@link org.eclipse.papyrus.infra.types.impl.ContainerConfigurationImpl#getEContainmentFeatures <em>EContainment Features</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainerConfigurationImpl extends MinimalEObjectImpl.Container implements ContainerConfiguration {
	/**
	 * The cached value of the '{@link #getContainerMatcherConfiguration() <em>Container Matcher Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerMatcherConfiguration()
	 * @generated
	 * @ordered
	 */
	protected AbstractMatcherConfiguration containerMatcherConfiguration;

	/**
	 * The cached value of the '{@link #getEContainmentFeatures() <em>EContainment Features</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEContainmentFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<EReference> eContainmentFeatures;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElementTypesConfigurationsPackage.Literals.CONTAINER_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractMatcherConfiguration getContainerMatcherConfiguration() {
		return containerMatcherConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainerMatcherConfiguration(AbstractMatcherConfiguration newContainerMatcherConfiguration, NotificationChain msgs) {
		AbstractMatcherConfiguration oldContainerMatcherConfiguration = containerMatcherConfiguration;
		containerMatcherConfiguration = newContainerMatcherConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElementTypesConfigurationsPackage.CONTAINER_CONFIGURATION__CONTAINER_MATCHER_CONFIGURATION, oldContainerMatcherConfiguration, newContainerMatcherConfiguration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainerMatcherConfiguration(AbstractMatcherConfiguration newContainerMatcherConfiguration) {
		if (newContainerMatcherConfiguration != containerMatcherConfiguration) {
			NotificationChain msgs = null;
			if (containerMatcherConfiguration != null)
				msgs = ((InternalEObject)containerMatcherConfiguration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElementTypesConfigurationsPackage.CONTAINER_CONFIGURATION__CONTAINER_MATCHER_CONFIGURATION, null, msgs);
			if (newContainerMatcherConfiguration != null)
				msgs = ((InternalEObject)newContainerMatcherConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElementTypesConfigurationsPackage.CONTAINER_CONFIGURATION__CONTAINER_MATCHER_CONFIGURATION, null, msgs);
			msgs = basicSetContainerMatcherConfiguration(newContainerMatcherConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElementTypesConfigurationsPackage.CONTAINER_CONFIGURATION__CONTAINER_MATCHER_CONFIGURATION, newContainerMatcherConfiguration, newContainerMatcherConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EReference> getEContainmentFeatures() {
		if (eContainmentFeatures == null) {
			eContainmentFeatures = new EObjectResolvingEList<EReference>(EReference.class, this, ElementTypesConfigurationsPackage.CONTAINER_CONFIGURATION__ECONTAINMENT_FEATURES);
		}
		return eContainmentFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ElementTypesConfigurationsPackage.CONTAINER_CONFIGURATION__CONTAINER_MATCHER_CONFIGURATION:
				return basicSetContainerMatcherConfiguration(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ElementTypesConfigurationsPackage.CONTAINER_CONFIGURATION__CONTAINER_MATCHER_CONFIGURATION:
				return getContainerMatcherConfiguration();
			case ElementTypesConfigurationsPackage.CONTAINER_CONFIGURATION__ECONTAINMENT_FEATURES:
				return getEContainmentFeatures();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ElementTypesConfigurationsPackage.CONTAINER_CONFIGURATION__CONTAINER_MATCHER_CONFIGURATION:
				setContainerMatcherConfiguration((AbstractMatcherConfiguration)newValue);
				return;
			case ElementTypesConfigurationsPackage.CONTAINER_CONFIGURATION__ECONTAINMENT_FEATURES:
				getEContainmentFeatures().clear();
				getEContainmentFeatures().addAll((Collection<? extends EReference>)newValue);
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
			case ElementTypesConfigurationsPackage.CONTAINER_CONFIGURATION__CONTAINER_MATCHER_CONFIGURATION:
				setContainerMatcherConfiguration((AbstractMatcherConfiguration)null);
				return;
			case ElementTypesConfigurationsPackage.CONTAINER_CONFIGURATION__ECONTAINMENT_FEATURES:
				getEContainmentFeatures().clear();
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
			case ElementTypesConfigurationsPackage.CONTAINER_CONFIGURATION__CONTAINER_MATCHER_CONFIGURATION:
				return containerMatcherConfiguration != null;
			case ElementTypesConfigurationsPackage.CONTAINER_CONFIGURATION__ECONTAINMENT_FEATURES:
				return eContainmentFeatures != null && !eContainmentFeatures.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContainerConfigurationImpl
