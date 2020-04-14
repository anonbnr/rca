/**
 */
package rca.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import rca.FAttribute;
import rca.FPair;
import rca.RCAPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FPair</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rca.impl.FPairImpl#getFAttribute <em>FAttribute</em>}</li>
 *   <li>{@link rca.impl.FPairImpl#getFObject <em>FObject</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FPairImpl extends PairImpl implements FPair {
	/**
	 * The cached value of the '{@link #getFAttribute() <em>FAttribute</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFAttribute()
	 * @generated
	 * @ordered
	 */
	protected FAttribute fAttribute;

	/**
	 * The cached value of the '{@link #getFObject() <em>FObject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFObject()
	 * @generated
	 * @ordered
	 */
	protected rca.Object fObject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FPairImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RCAPackage.Literals.FPAIR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FAttribute getFAttribute() {
		return fAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFAttribute(FAttribute newFAttribute, NotificationChain msgs) {
		FAttribute oldFAttribute = fAttribute;
		fAttribute = newFAttribute;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RCAPackage.FPAIR__FATTRIBUTE,
					oldFAttribute, newFAttribute);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFAttribute(FAttribute newFAttribute) {
		if (newFAttribute != fAttribute) {
			NotificationChain msgs = null;
			if (fAttribute != null)
				msgs = ((InternalEObject) fAttribute).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RCAPackage.FPAIR__FATTRIBUTE, null, msgs);
			if (newFAttribute != null)
				msgs = ((InternalEObject) newFAttribute).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RCAPackage.FPAIR__FATTRIBUTE, null, msgs);
			msgs = basicSetFAttribute(newFAttribute, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RCAPackage.FPAIR__FATTRIBUTE, newFAttribute,
					newFAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public rca.Object getFObject() {
		return fObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFObject(rca.Object newFObject, NotificationChain msgs) {
		rca.Object oldFObject = fObject;
		fObject = newFObject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RCAPackage.FPAIR__FOBJECT,
					oldFObject, newFObject);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFObject(rca.Object newFObject) {
		if (newFObject != fObject) {
			NotificationChain msgs = null;
			if (fObject != null)
				msgs = ((InternalEObject) fObject).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RCAPackage.FPAIR__FOBJECT, null, msgs);
			if (newFObject != null)
				msgs = ((InternalEObject) newFObject).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RCAPackage.FPAIR__FOBJECT, null, msgs);
			msgs = basicSetFObject(newFObject, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RCAPackage.FPAIR__FOBJECT, newFObject, newFObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RCAPackage.FPAIR__FATTRIBUTE:
			return basicSetFAttribute(null, msgs);
		case RCAPackage.FPAIR__FOBJECT:
			return basicSetFObject(null, msgs);
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
		case RCAPackage.FPAIR__FATTRIBUTE:
			return getFAttribute();
		case RCAPackage.FPAIR__FOBJECT:
			return getFObject();
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
		case RCAPackage.FPAIR__FATTRIBUTE:
			setFAttribute((FAttribute) newValue);
			return;
		case RCAPackage.FPAIR__FOBJECT:
			setFObject((rca.Object) newValue);
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
		case RCAPackage.FPAIR__FATTRIBUTE:
			setFAttribute((FAttribute) null);
			return;
		case RCAPackage.FPAIR__FOBJECT:
			setFObject((rca.Object) null);
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
		case RCAPackage.FPAIR__FATTRIBUTE:
			return fAttribute != null;
		case RCAPackage.FPAIR__FOBJECT:
			return fObject != null;
		}
		return super.eIsSet(featureID);
	}

} //FPairImpl
