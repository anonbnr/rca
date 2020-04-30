/**
 */
package rca.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import rca.ObjectSet;
import rca.RContext;
import rca.RRelation;
import rca.RCAPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RContext</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rca.impl.RContextImpl#getRRelation <em>RRelation</em>}</li>
 *   <li>{@link rca.impl.RContextImpl#getTargetObjectSet <em>Target Object Set</em>}</li>
 *   <li>{@link rca.impl.RContextImpl#getSourceObjectSet <em>Source Object Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RContextImpl extends ContextImpl implements RContext {
	/**
	 * The cached value of the '{@link #getRRelation() <em>RRelation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRRelation()
	 * @generated
	 * @ordered
	 */
	protected RRelation rRelation;

	/**
	 * The cached value of the '{@link #getTargetObjectSet() <em>Target Object Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetObjectSet()
	 * @generated
	 * @ordered
	 */
	protected ObjectSet targetObjectSet;

	/**
	 * The cached value of the '{@link #getSourceObjectSet() <em>Source Object Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceObjectSet()
	 * @generated
	 * @ordered
	 */
	protected ObjectSet sourceObjectSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RCAPackage.Literals.RCONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RRelation getRRelation() {
		return rRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRRelation(RRelation newRRelation, NotificationChain msgs) {
		RRelation oldRRelation = rRelation;
		rRelation = newRRelation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RCAPackage.RCONTEXT__RRELATION, oldRRelation, newRRelation);
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
	public void setRRelation(RRelation newRRelation) {
		if (newRRelation != rRelation) {
			NotificationChain msgs = null;
			if (rRelation != null)
				msgs = ((InternalEObject) rRelation).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RCAPackage.RCONTEXT__RRELATION, null, msgs);
			if (newRRelation != null)
				msgs = ((InternalEObject) newRRelation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RCAPackage.RCONTEXT__RRELATION, null, msgs);
			msgs = basicSetRRelation(newRRelation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RCAPackage.RCONTEXT__RRELATION, newRRelation,
					newRRelation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectSet getTargetObjectSet() {
		return targetObjectSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetObjectSet(ObjectSet newTargetObjectSet, NotificationChain msgs) {
		ObjectSet oldTargetObjectSet = targetObjectSet;
		targetObjectSet = newTargetObjectSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RCAPackage.RCONTEXT__TARGET_OBJECT_SET, oldTargetObjectSet, newTargetObjectSet);
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
	public void setTargetObjectSet(ObjectSet newTargetObjectSet) {
		if (newTargetObjectSet != targetObjectSet) {
			NotificationChain msgs = null;
			if (targetObjectSet != null)
				msgs = ((InternalEObject) targetObjectSet).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RCAPackage.RCONTEXT__TARGET_OBJECT_SET, null, msgs);
			if (newTargetObjectSet != null)
				msgs = ((InternalEObject) newTargetObjectSet).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RCAPackage.RCONTEXT__TARGET_OBJECT_SET, null, msgs);
			msgs = basicSetTargetObjectSet(newTargetObjectSet, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RCAPackage.RCONTEXT__TARGET_OBJECT_SET,
					newTargetObjectSet, newTargetObjectSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectSet getSourceObjectSet() {
		return sourceObjectSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceObjectSet(ObjectSet newSourceObjectSet, NotificationChain msgs) {
		ObjectSet oldSourceObjectSet = sourceObjectSet;
		sourceObjectSet = newSourceObjectSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RCAPackage.RCONTEXT__SOURCE_OBJECT_SET, oldSourceObjectSet, newSourceObjectSet);
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
	public void setSourceObjectSet(ObjectSet newSourceObjectSet) {
		if (newSourceObjectSet != sourceObjectSet) {
			NotificationChain msgs = null;
			if (sourceObjectSet != null)
				msgs = ((InternalEObject) sourceObjectSet).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RCAPackage.RCONTEXT__SOURCE_OBJECT_SET, null, msgs);
			if (newSourceObjectSet != null)
				msgs = ((InternalEObject) newSourceObjectSet).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RCAPackage.RCONTEXT__SOURCE_OBJECT_SET, null, msgs);
			msgs = basicSetSourceObjectSet(newSourceObjectSet, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RCAPackage.RCONTEXT__SOURCE_OBJECT_SET,
					newSourceObjectSet, newSourceObjectSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RCAPackage.RCONTEXT__RRELATION:
			return basicSetRRelation(null, msgs);
		case RCAPackage.RCONTEXT__TARGET_OBJECT_SET:
			return basicSetTargetObjectSet(null, msgs);
		case RCAPackage.RCONTEXT__SOURCE_OBJECT_SET:
			return basicSetSourceObjectSet(null, msgs);
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
		case RCAPackage.RCONTEXT__RRELATION:
			return getRRelation();
		case RCAPackage.RCONTEXT__TARGET_OBJECT_SET:
			return getTargetObjectSet();
		case RCAPackage.RCONTEXT__SOURCE_OBJECT_SET:
			return getSourceObjectSet();
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
		case RCAPackage.RCONTEXT__RRELATION:
			setRRelation((RRelation) newValue);
			return;
		case RCAPackage.RCONTEXT__TARGET_OBJECT_SET:
			setTargetObjectSet((ObjectSet) newValue);
			return;
		case RCAPackage.RCONTEXT__SOURCE_OBJECT_SET:
			setSourceObjectSet((ObjectSet) newValue);
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
		case RCAPackage.RCONTEXT__RRELATION:
			setRRelation((RRelation) null);
			return;
		case RCAPackage.RCONTEXT__TARGET_OBJECT_SET:
			setTargetObjectSet((ObjectSet) null);
			return;
		case RCAPackage.RCONTEXT__SOURCE_OBJECT_SET:
			setSourceObjectSet((ObjectSet) null);
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
		case RCAPackage.RCONTEXT__RRELATION:
			return rRelation != null;
		case RCAPackage.RCONTEXT__TARGET_OBJECT_SET:
			return targetObjectSet != null;
		case RCAPackage.RCONTEXT__SOURCE_OBJECT_SET:
			return sourceObjectSet != null;
		}
		return super.eIsSet(featureID);
	}

} //RContextImpl
