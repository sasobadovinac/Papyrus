/**
 */
package Cpp.impl;

import Cpp.CppPackage;
import Cpp.CppVisibility;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.uml2.uml.Generalization;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Visibility</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Cpp.impl.CppVisibilityImpl#getValue <em>Value</em>}</li>
 *   <li>{@link Cpp.impl.CppVisibilityImpl#getBase_generalization <em>Base generalization</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CppVisibilityImpl extends EObjectImpl implements CppVisibility {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBase_generalization() <em>Base generalization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_generalization()
	 * @generated
	 * @ordered
	 */
	protected Generalization base_generalization;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CppVisibilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CppPackage.Literals.CPP_VISIBILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CppPackage.CPP_VISIBILITY__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generalization getBase_generalization() {
		if (base_generalization != null && base_generalization.eIsProxy()) {
			InternalEObject oldBase_generalization = (InternalEObject)base_generalization;
			base_generalization = (Generalization)eResolveProxy(oldBase_generalization);
			if (base_generalization != oldBase_generalization) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CppPackage.CPP_VISIBILITY__BASE_GENERALIZATION, oldBase_generalization, base_generalization));
			}
		}
		return base_generalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generalization basicGetBase_generalization() {
		return base_generalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_generalization(Generalization newBase_generalization) {
		Generalization oldBase_generalization = base_generalization;
		base_generalization = newBase_generalization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CppPackage.CPP_VISIBILITY__BASE_GENERALIZATION, oldBase_generalization, base_generalization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CppPackage.CPP_VISIBILITY__VALUE:
				return getValue();
			case CppPackage.CPP_VISIBILITY__BASE_GENERALIZATION:
				if (resolve) return getBase_generalization();
				return basicGetBase_generalization();
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
			case CppPackage.CPP_VISIBILITY__VALUE:
				setValue((String)newValue);
				return;
			case CppPackage.CPP_VISIBILITY__BASE_GENERALIZATION:
				setBase_generalization((Generalization)newValue);
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
			case CppPackage.CPP_VISIBILITY__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case CppPackage.CPP_VISIBILITY__BASE_GENERALIZATION:
				setBase_generalization((Generalization)null);
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
			case CppPackage.CPP_VISIBILITY__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case CppPackage.CPP_VISIBILITY__BASE_GENERALIZATION:
				return base_generalization != null;
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //CppVisibilityImpl
