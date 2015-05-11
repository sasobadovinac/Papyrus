/**
 * Copyright (c) 2014 CEA LIST.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *  CEA LIST - Initial API and implementation
 */
package org.eclipse.papyrus.umldi.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.papyrus.umldi.ActivityShape;
import org.eclipse.papyrus.umldi.UMLDIFactory;
import org.eclipse.papyrus.umldi.UMLDIPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.papyrus.umldi.ActivityShape} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ActivityShapeItemProvider extends ClassShapeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityShapeItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(UMLDIPackage.Literals.ACTIVITY_SHAPE__PARAMETER_COMPARTMENT);
			childrenFeatures.add(UMLDIPackage.Literals.ACTIVITY_SHAPE__POST_CONDITION_COMPARTMENT);
			childrenFeatures.add(UMLDIPackage.Literals.ACTIVITY_SHAPE__PRE_CONDITION_COMPARTMENT);
			childrenFeatures.add(UMLDIPackage.Literals.ACTIVITY_SHAPE__CONTENT_COMPARTMENT);
			childrenFeatures.add(UMLDIPackage.Literals.ACTIVITY_SHAPE__ACTIVITY_PARAMETER_NODE_SHAPE);
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
	 * This returns ActivityShape.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ActivityShape"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		ActivityShape activityShape = (ActivityShape)object;
		return getString("_UI_ActivityShape_type") + " " + activityShape.isUseClassifierNotation();
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

		switch (notification.getFeatureID(ActivityShape.class)) {
			case UMLDIPackage.ACTIVITY_SHAPE__PARAMETER_COMPARTMENT:
			case UMLDIPackage.ACTIVITY_SHAPE__POST_CONDITION_COMPARTMENT:
			case UMLDIPackage.ACTIVITY_SHAPE__PRE_CONDITION_COMPARTMENT:
			case UMLDIPackage.ACTIVITY_SHAPE__CONTENT_COMPARTMENT:
			case UMLDIPackage.ACTIVITY_SHAPE__ACTIVITY_PARAMETER_NODE_SHAPE:
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
				(UMLDIPackage.Literals.ACTIVITY_SHAPE__PARAMETER_COMPARTMENT,
				 UMLDIFactory.eINSTANCE.createParameterCompartment()));

		newChildDescriptors.add
			(createChildParameter
				(UMLDIPackage.Literals.ACTIVITY_SHAPE__POST_CONDITION_COMPARTMENT,
				 UMLDIFactory.eINSTANCE.createPostConditionCompartment()));

		newChildDescriptors.add
			(createChildParameter
				(UMLDIPackage.Literals.ACTIVITY_SHAPE__PRE_CONDITION_COMPARTMENT,
				 UMLDIFactory.eINSTANCE.createPreConditionCompartment()));

		newChildDescriptors.add
			(createChildParameter
				(UMLDIPackage.Literals.ACTIVITY_SHAPE__CONTENT_COMPARTMENT,
				 UMLDIFactory.eINSTANCE.createContentCompartment()));

		newChildDescriptors.add
			(createChildParameter
				(UMLDIPackage.Literals.ACTIVITY_SHAPE__ACTIVITY_PARAMETER_NODE_SHAPE,
				 UMLDIFactory.eINSTANCE.createActivityParameterNodeShape()));
	}

}