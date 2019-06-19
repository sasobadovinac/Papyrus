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
 *  Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 */
package org.eclipse.papyrus.infra.emf.expressions.booleanexpressions.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.papyrus.infra.emf.expressions.booleanexpressions.BooleanExpressionsFactory;
import org.eclipse.papyrus.infra.emf.expressions.booleanexpressions.BooleanExpressionsPackage;
import org.eclipse.papyrus.infra.emf.expressions.booleanexpressions.OrExpression;

/**
 * This is the item provider adapter for a {@link org.eclipse.papyrus.infra.emf.expressions.booleanexpressions.OrExpression} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OrExpressionItemProvider 
	extends AbstractMultiBooleanEObjectExpressionsReferenceExpressionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrExpressionItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(BooleanExpressionsPackage.Literals.ABTRACT_MULTI_BOOLEAN_EOBJECT_EXPRESSIONS_OWNED_EXPRESSION__OWNED_EXPRESSIONS);
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
	 * This returns OrExpression.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/OrExpression")); //$NON-NLS-1$
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((OrExpression)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_OrExpression_type") : //$NON-NLS-1$
			getString("_UI_OrExpression_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(OrExpression.class)) {
			case BooleanExpressionsPackage.OR_EXPRESSION__OWNED_EXPRESSIONS:
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
				(BooleanExpressionsPackage.Literals.ABTRACT_MULTI_BOOLEAN_EOBJECT_EXPRESSIONS_OWNED_EXPRESSION__OWNED_EXPRESSIONS,
				 BooleanExpressionsFactory.eINSTANCE.createOrExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanExpressionsPackage.Literals.ABTRACT_MULTI_BOOLEAN_EOBJECT_EXPRESSIONS_OWNED_EXPRESSION__OWNED_EXPRESSIONS,
				 BooleanExpressionsFactory.eINSTANCE.createAndExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanExpressionsPackage.Literals.ABTRACT_MULTI_BOOLEAN_EOBJECT_EXPRESSIONS_OWNED_EXPRESSION__OWNED_EXPRESSIONS,
				 BooleanExpressionsFactory.eINSTANCE.createNotExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanExpressionsPackage.Literals.ABTRACT_MULTI_BOOLEAN_EOBJECT_EXPRESSIONS_OWNED_EXPRESSION__OWNED_EXPRESSIONS,
				 BooleanExpressionsFactory.eINSTANCE.createLiteralTrueExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanExpressionsPackage.Literals.ABTRACT_MULTI_BOOLEAN_EOBJECT_EXPRESSIONS_OWNED_EXPRESSION__OWNED_EXPRESSIONS,
				 BooleanExpressionsFactory.eINSTANCE.createLiteralFalseExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanExpressionsPackage.Literals.ABTRACT_MULTI_BOOLEAN_EOBJECT_EXPRESSIONS_OWNED_EXPRESSION__OWNED_EXPRESSIONS,
				 BooleanExpressionsFactory.eINSTANCE.createReferenceBooleanExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BooleanExpressionsPackage.Literals.ABTRACT_MULTI_BOOLEAN_EOBJECT_EXPRESSIONS_OWNED_EXPRESSION__OWNED_EXPRESSIONS,
				 BooleanExpressionsFactory.eINSTANCE.createSingleEAttributeValueEqualityExpression()));
	}

}
