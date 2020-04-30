/**
 */
package rca.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import rca.RPair;
import rca.RCAPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RPair</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rca.impl.RPairImpl#getRSourceObject <em>RSource Object</em>}</li>
 *   <li>{@link rca.impl.RPairImpl#getRTargetObject <em>RTarget Object</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RPairImpl extends PairImpl implements RPair {
	/**
	 * The cached value of the '{@link #getRSourceObject() <em>RSource Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRSourceObject()
	 * @generated
	 * @ordered
	 */
	protected rca.Object rSourceObject;

	/**
	 * The cached value of the '{@link #getRTargetObject() <em>RTarget Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRTargetObject()
	 * @generated
	 * @ordered
	 */
	protected rca.Object rTargetObject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RPairImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RCAPackage.Literals.RPAIR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public rca.Object getRSourceObject() {
		return rSourceObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRSourceObject(rca.Object newRSourceObject, NotificationChain msgs) {
		rca.Object oldRSourceObject = rSourceObject;
		rSourceObject = newRSourceObject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RCAPackage.RPAIR__RSOURCE_OBJECT, oldRSourceObject, newRSourceObject);
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
	public void setRSourceObject(rca.Object newRSourceObject) {
		if (newRSourceObject != rSourceObject) {
			NotificationChain msgs = null;
			if (rSourceObject != null)
				msgs = ((InternalEObject) rSourceObject).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RCAPackage.RPAIR__RSOURCE_OBJECT, null, msgs);
			if (newRSourceObject != null)
				msgs = ((InternalEObject) newRSourceObject).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RCAPackage.RPAIR__RSOURCE_OBJECT, null, msgs);
			msgs = basicSetRSourceObject(newRSourceObject, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RCAPackage.RPAIR__RSOURCE_OBJECT, newRSourceObject,
					newRSourceObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public rca.Object getRTargetObject() {
		return rTargetObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRTargetObject(rca.Object newRTargetObject, NotificationChain msgs) {
		rca.Object oldRTargetObject = rTargetObject;
		rTargetObject = newRTargetObject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RCAPackage.RPAIR__RTARGET_OBJECT, oldRTargetObject, newRTargetObject);
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
	public void setRTargetObject(rca.Object newRTargetObject) {
		if (newRTargetObject != rTargetObject) {
			NotificationChain msgs = null;
			if (rTargetObject != null)
				msgs = ((InternalEObject) rTargetObject).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RCAPackage.RPAIR__RTARGET_OBJECT, null, msgs);
			if (newRTargetObject != null)
				msgs = ((InternalEObject) newRTargetObject).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RCAPackage.RPAIR__RTARGET_OBJECT, null, msgs);
			msgs = basicSetRTargetObject(newRTargetObject, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RCAPackage.RPAIR__RTARGET_OBJECT, newRTargetObject,
					newRTargetObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RCAPackage.RPAIR__RSOURCE_OBJECT:
			return basicSetRSourceObject(null, msgs);
		case RCAPackage.RPAIR__RTARGET_OBJECT:
			return basicSetRTargetObject(null, msgs);
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
		case RCAPackage.RPAIR__RSOURCE_OBJECT:
			return getRSourceObject();
		case RCAPackage.RPAIR__RTARGET_OBJECT:
			return getRTargetObject();
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
		case RCAPackage.RPAIR__RSOURCE_OBJECT:
			setRSourceObject((rca.Object) newValue);
			return;
		case RCAPackage.RPAIR__RTARGET_OBJECT:
			setRTargetObject((rca.Object) newValue);
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
		case RCAPackage.RPAIR__RSOURCE_OBJECT:
			setRSourceObject((rca.Object) null);
			return;
		case RCAPackage.RPAIR__RTARGET_OBJECT:
			setRTargetObject((rca.Object) null);
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
		case RCAPackage.RPAIR__RSOURCE_OBJECT:
			return rSourceObject != null;
		case RCAPackage.RPAIR__RTARGET_OBJECT:
			return rTargetObject != null;
		}
		return super.eIsSet(featureID);
	}

} //RPairImpl
