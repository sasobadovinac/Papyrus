/**
 */
package org.eclipse.papyrus.uml.textedit.property.xtext.umlProperty.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.papyrus.uml.textedit.property.xtext.umlProperty.BooleanLiterals;
import org.eclipse.papyrus.uml.textedit.property.xtext.umlProperty.BooleanValue;
import org.eclipse.papyrus.uml.textedit.property.xtext.umlProperty.UmlPropertyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.uml.textedit.property.xtext.umlProperty.impl.BooleanValueImpl#getLiteralBoolean <em>Literal Boolean</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BooleanValueImpl extends ValueImpl implements BooleanValue
{
	/**
	 * The default value of the '{@link #getLiteralBoolean() <em>Literal Boolean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getLiteralBoolean()
	 * @generated
	 * @ordered
	 */
	protected static final BooleanLiterals LITERAL_BOOLEAN_EDEFAULT = BooleanLiterals.TRUE;

	/**
	 * The cached value of the '{@link #getLiteralBoolean() <em>Literal Boolean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getLiteralBoolean()
	 * @generated
	 * @ordered
	 */
	protected BooleanLiterals literalBoolean = LITERAL_BOOLEAN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected BooleanValueImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return UmlPropertyPackage.Literals.BOOLEAN_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public BooleanLiterals getLiteralBoolean()
	{
		return literalBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public void setLiteralBoolean(BooleanLiterals newLiteralBoolean)
	{
		BooleanLiterals oldLiteralBoolean = literalBoolean;
		literalBoolean = newLiteralBoolean == null ? LITERAL_BOOLEAN_EDEFAULT : newLiteralBoolean;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPropertyPackage.BOOLEAN_VALUE__LITERAL_BOOLEAN, oldLiteralBoolean, literalBoolean));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
		case UmlPropertyPackage.BOOLEAN_VALUE__LITERAL_BOOLEAN:
			return getLiteralBoolean();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
		case UmlPropertyPackage.BOOLEAN_VALUE__LITERAL_BOOLEAN:
			setLiteralBoolean((BooleanLiterals) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
		case UmlPropertyPackage.BOOLEAN_VALUE__LITERAL_BOOLEAN:
			setLiteralBoolean(LITERAL_BOOLEAN_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
		case UmlPropertyPackage.BOOLEAN_VALUE__LITERAL_BOOLEAN:
			return literalBoolean != LITERAL_BOOLEAN_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) {
			return super.toString();
		}

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (literalBoolean: ");
		result.append(literalBoolean);
		result.append(')');
		return result.toString();
	}

} // BooleanValueImpl
