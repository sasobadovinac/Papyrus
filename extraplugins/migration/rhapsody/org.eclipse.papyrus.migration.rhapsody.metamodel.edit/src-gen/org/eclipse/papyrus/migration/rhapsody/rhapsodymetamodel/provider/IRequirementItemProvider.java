/**
 *   Copyright (c) 2016 CEA LIST and others.
 *   
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v1.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v10.html
 *  
 *   Contributors:
 *     CEA LIST - Initial API and implementation
 * 
 */
package org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.IRequirement;
import org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.UMLRhapsodyFactory;
import org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.UMLRhapsodyPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.papyrus.migration.rhapsody.rhapsodymetamodel.IRequirement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IRequirementItemProvider extends IAnnotationItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IRequirementItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addIdPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addMyStatePropertyDescriptor(object);
			addLastIDPropertyDescriptor(object);
			addModifiedTimeWeakPropertyDescriptor(object);
			addReqIDPropertyDescriptor(object);
			addTheMainDiagramPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IRequirement_id_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_IRequirement_id_feature", "_UI_IRequirement_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UMLRhapsodyPackage.eINSTANCE.getIRequirement_Id(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IRequirement_name_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_IRequirement_name_feature", "_UI_IRequirement_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UMLRhapsodyPackage.eINSTANCE.getIRequirement_Name(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the My State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMyStatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IRequirement_myState_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_IRequirement_myState_feature", "_UI_IRequirement_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UMLRhapsodyPackage.eINSTANCE.getIRequirement_MyState(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Last ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLastIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IRequirement_lastID_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_IRequirement_lastID_feature", "_UI_IRequirement_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UMLRhapsodyPackage.eINSTANCE.getIRequirement_LastID(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Modified Time Weak feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModifiedTimeWeakPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IRequirement_modifiedTimeWeak_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_IRequirement_modifiedTimeWeak_feature", "_UI_IRequirement_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UMLRhapsodyPackage.eINSTANCE.getIRequirement_ModifiedTimeWeak(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Req ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReqIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IRequirement_reqID_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_IRequirement_reqID_feature", "_UI_IRequirement_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UMLRhapsodyPackage.eINSTANCE.getIRequirement_ReqID(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the The Main Diagram feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTheMainDiagramPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IRequirement_theMainDiagram_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_IRequirement_theMainDiagram_feature", "_UI_IRequirement_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 UMLRhapsodyPackage.eINSTANCE.getIRequirement_TheMainDiagram(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(UMLRhapsodyPackage.eINSTANCE.getIRequirement_Annotations());
			childrenFeatures.add(UMLRhapsodyPackage.eINSTANCE.getIRequirement_Stereotypes());
			childrenFeatures.add(UMLRhapsodyPackage.eINSTANCE.getIRequirement_Dependencies());
			childrenFeatures.add(UMLRhapsodyPackage.eINSTANCE.getIRequirement_Anchors());
			childrenFeatures.add(UMLRhapsodyPackage.eINSTANCE.getIRequirement_HyperLinks());
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns IRequirement.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IRequirement")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((IRequirement)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_IRequirement_type") : //$NON-NLS-1$
			getString("_UI_IRequirement_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(IRequirement.class)) {
			case UMLRhapsodyPackage.IREQUIREMENT__ID:
			case UMLRhapsodyPackage.IREQUIREMENT__NAME:
			case UMLRhapsodyPackage.IREQUIREMENT__MY_STATE:
			case UMLRhapsodyPackage.IREQUIREMENT__LAST_ID:
			case UMLRhapsodyPackage.IREQUIREMENT__MODIFIED_TIME_WEAK:
			case UMLRhapsodyPackage.IREQUIREMENT__REQ_ID:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case UMLRhapsodyPackage.IREQUIREMENT__ANNOTATIONS:
			case UMLRhapsodyPackage.IREQUIREMENT__STEREOTYPES:
			case UMLRhapsodyPackage.IREQUIREMENT__DEPENDENCIES:
			case UMLRhapsodyPackage.IREQUIREMENT__ANCHORS:
			case UMLRhapsodyPackage.IREQUIREMENT__HYPER_LINKS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(UMLRhapsodyPackage.eINSTANCE.getIRequirement_Annotations(),
				 UMLRhapsodyFactory.eINSTANCE.createIRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(UMLRhapsodyPackage.eINSTANCE.getIRequirement_Stereotypes(),
				 UMLRhapsodyFactory.eINSTANCE.createIStereotype()));

		newChildDescriptors.add
			(createChildParameter
				(UMLRhapsodyPackage.eINSTANCE.getIRequirement_Dependencies(),
				 UMLRhapsodyFactory.eINSTANCE.createIDependency()));

		newChildDescriptors.add
			(createChildParameter
				(UMLRhapsodyPackage.eINSTANCE.getIRequirement_Dependencies(),
				 UMLRhapsodyFactory.eINSTANCE.createIHyperLink()));

		newChildDescriptors.add
			(createChildParameter
				(UMLRhapsodyPackage.eINSTANCE.getIRequirement_Anchors(),
				 UMLRhapsodyFactory.eINSTANCE.createIAnchor()));

		newChildDescriptors.add
			(createChildParameter
				(UMLRhapsodyPackage.eINSTANCE.getIRequirement_HyperLinks(),
				 UMLRhapsodyFactory.eINSTANCE.createIMHyperLink()));
	}

}
