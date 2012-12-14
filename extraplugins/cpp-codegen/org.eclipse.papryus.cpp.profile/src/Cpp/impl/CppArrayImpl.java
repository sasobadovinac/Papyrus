/**
 */
package Cpp.impl;

import Cpp.CppArray;
import Cpp.CppPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Cpp.impl.CppArrayImpl#getBase_parameter <em>Base parameter</em>}</li>
 *   <li>{@link Cpp.impl.CppArrayImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link Cpp.impl.CppArrayImpl#getBase_property <em>Base property</em>}</li>
 *   <li>{@link Cpp.impl.CppArrayImpl#getBase_association <em>Base association</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CppArrayImpl extends EObjectImpl implements CppArray {
	/**
	 * The cached value of the '{@link #getBase_parameter() <em>Base parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_parameter()
	 * @generated
	 * @ordered
	 */
	protected Parameter base_parameter;

	/**
	 * The default value of the '{@link #getDefinition() <em>Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFINITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected String definition = DEFINITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBase_property() <em>Base property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_property()
	 * @generated
	 * @ordered
	 */
	protected Property base_property;

	/**
	 * The cached value of the '{@link #getBase_association() <em>Base association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_association()
	 * @generated
	 * @ordered
	 */
	protected Association base_association;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CppArrayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CppPackage.Literals.CPP_ARRAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getBase_parameter() {
		if (base_parameter != null && base_parameter.eIsProxy()) {
			InternalEObject oldBase_parameter = (InternalEObject)base_parameter;
			base_parameter = (Parameter)eResolveProxy(oldBase_parameter);
			if (base_parameter != oldBase_parameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CppPackage.CPP_ARRAY__BASE_PARAMETER, oldBase_parameter, base_parameter));
			}
		}
		return base_parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter basicGetBase_parameter() {
		return base_parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_parameter(Parameter newBase_parameter) {
		Parameter oldBase_parameter = base_parameter;
		base_parameter = newBase_parameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CppPackage.CPP_ARRAY__BASE_PARAMETER, oldBase_parameter, base_parameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefinition() {
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinition(String newDefinition) {
		String oldDefinition = definition;
		definition = newDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CppPackage.CPP_ARRAY__DEFINITION, oldDefinition, definition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getBase_property() {
		if (base_property != null && base_property.eIsProxy()) {
			InternalEObject oldBase_property = (InternalEObject)base_property;
			base_property = (Property)eResolveProxy(oldBase_property);
			if (base_property != oldBase_property) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CppPackage.CPP_ARRAY__BASE_PROPERTY, oldBase_property, base_property));
			}
		}
		return base_property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetBase_property() {
		return base_property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_property(Property newBase_property) {
		Property oldBase_property = base_property;
		base_property = newBase_property;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CppPackage.CPP_ARRAY__BASE_PROPERTY, oldBase_property, base_property));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association getBase_association() {
		if (base_association != null && base_association.eIsProxy()) {
			InternalEObject oldBase_association = (InternalEObject)base_association;
			base_association = (Association)eResolveProxy(oldBase_association);
			if (base_association != oldBase_association) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CppPackage.CPP_ARRAY__BASE_ASSOCIATION, oldBase_association, base_association));
			}
		}
		return base_association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association basicGetBase_association() {
		return base_association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_association(Association newBase_association) {
		Association oldBase_association = base_association;
		base_association = newBase_association;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CppPackage.CPP_ARRAY__BASE_ASSOCIATION, oldBase_association, base_association));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CppPackage.CPP_ARRAY__BASE_PARAMETER:
				if (resolve) return getBase_parameter();
				return basicGetBase_parameter();
			case CppPackage.CPP_ARRAY__DEFINITION:
				return getDefinition();
			case CppPackage.CPP_ARRAY__BASE_PROPERTY:
				if (resolve) return getBase_property();
				return basicGetBase_property();
			case CppPackage.CPP_ARRAY__BASE_ASSOCIATION:
				if (resolve) return getBase_association();
				return basicGetBase_association();
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
			case CppPackage.CPP_ARRAY__BASE_PARAMETER:
				setBase_parameter((Parameter)newValue);
				return;
			case CppPackage.CPP_ARRAY__DEFINITION:
				setDefinition((String)newValue);
				return;
			case CppPackage.CPP_ARRAY__BASE_PROPERTY:
				setBase_property((Property)newValue);
				return;
			case CppPackage.CPP_ARRAY__BASE_ASSOCIATION:
				setBase_association((Association)newValue);
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
			case CppPackage.CPP_ARRAY__BASE_PARAMETER:
				setBase_parameter((Parameter)null);
				return;
			case CppPackage.CPP_ARRAY__DEFINITION:
				setDefinition(DEFINITION_EDEFAULT);
				return;
			case CppPackage.CPP_ARRAY__BASE_PROPERTY:
				setBase_property((Property)null);
				return;
			case CppPackage.CPP_ARRAY__BASE_ASSOCIATION:
				setBase_association((Association)null);
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
			case CppPackage.CPP_ARRAY__BASE_PARAMETER:
				return base_parameter != null;
			case CppPackage.CPP_ARRAY__DEFINITION:
				return DEFINITION_EDEFAULT == null ? definition != null : !DEFINITION_EDEFAULT.equals(definition);
			case CppPackage.CPP_ARRAY__BASE_PROPERTY:
				return base_property != null;
			case CppPackage.CPP_ARRAY__BASE_ASSOCIATION:
				return base_association != null;
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
		result.append(" (definition: ");
		result.append(definition);
		result.append(')');
		return result.toString();
	}

} //CppArrayImpl
