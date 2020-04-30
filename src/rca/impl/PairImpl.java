/**
 */
package rca.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import rca.Pair;
import rca.PairableElement;
import rca.RCAPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pair</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rca.impl.PairImpl#getFirst <em>First</em>}</li>
 *   <li>{@link rca.impl.PairImpl#getSecond <em>Second</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PairImpl extends MinimalEObjectImpl.Container implements Pair {
	/**
	 * The cached value of the '{@link #getFirst() <em>First</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirst()
	 * @generated
	 * @ordered
	 */
	protected PairableElement first;

	/**
	 * The cached value of the '{@link #getSecond() <em>Second</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecond()
	 * @generated
	 * @ordered
	 */
	protected PairableElement second;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PairImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RCAPackage.Literals.PAIR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PairableElement getFirst() {
		return first;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFirst(PairableElement newFirst, NotificationChain msgs) {
		PairableElement oldFirst = first;
		first = newFirst;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RCAPackage.PAIR__FIRST,
					oldFirst, newFirst);
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
	public void setFirst(PairableElement newFirst) {
		if (newFirst != first) {
			NotificationChain msgs = null;
			if (first != null)
				msgs = ((InternalEObject) first).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RCAPackage.PAIR__FIRST,
						null, msgs);
			if (newFirst != null)
				msgs = ((InternalEObject) newFirst).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RCAPackage.PAIR__FIRST,
						null, msgs);
			msgs = basicSetFirst(newFirst, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RCAPackage.PAIR__FIRST, newFirst, newFirst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PairableElement getSecond() {
		return second;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecond(PairableElement newSecond, NotificationChain msgs) {
		PairableElement oldSecond = second;
		second = newSecond;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RCAPackage.PAIR__SECOND,
					oldSecond, newSecond);
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
	public void setSecond(PairableElement newSecond) {
		if (newSecond != second) {
			NotificationChain msgs = null;
			if (second != null)
				msgs = ((InternalEObject) second).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RCAPackage.PAIR__SECOND,
						null, msgs);
			if (newSecond != null)
				msgs = ((InternalEObject) newSecond).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RCAPackage.PAIR__SECOND,
						null, msgs);
			msgs = basicSetSecond(newSecond, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RCAPackage.PAIR__SECOND, newSecond, newSecond));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RCAPackage.PAIR__FIRST:
			return basicSetFirst(null, msgs);
		case RCAPackage.PAIR__SECOND:
			return basicSetSecond(null, msgs);
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
		case RCAPackage.PAIR__FIRST:
			return getFirst();
		case RCAPackage.PAIR__SECOND:
			return getSecond();
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
		case RCAPackage.PAIR__FIRST:
			setFirst((PairableElement) newValue);
			return;
		case RCAPackage.PAIR__SECOND:
			setSecond((PairableElement) newValue);
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
		case RCAPackage.PAIR__FIRST:
			setFirst((PairableElement) null);
			return;
		case RCAPackage.PAIR__SECOND:
			setSecond((PairableElement) null);
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
		case RCAPackage.PAIR__FIRST:
			return first != null;
		case RCAPackage.PAIR__SECOND:
			return second != null;
		}
		return super.eIsSet(featureID);
	}

} //PairImpl
