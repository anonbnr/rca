/**
 */
package rca.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import rca.AttributeSet;
import rca.FContext;
import rca.FRelation;
import rca.ObjectSet;
import rca.RCAPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FContext</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rca.impl.FContextImpl#getFRelation <em>FRelation</em>}</li>
 *   <li>{@link rca.impl.FContextImpl#getAttributeSet <em>Attribute Set</em>}</li>
 *   <li>{@link rca.impl.FContextImpl#getObjectSet <em>Object Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FContextImpl extends ContextImpl implements FContext {
	/**
	 * The cached value of the '{@link #getFRelation() <em>FRelation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFRelation()
	 * @generated
	 * @ordered
	 */
	protected FRelation fRelation;

	/**
	 * The cached value of the '{@link #getAttributeSet() <em>Attribute Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeSet()
	 * @generated
	 * @ordered
	 */
	protected AttributeSet attributeSet;

	/**
	 * The cached value of the '{@link #getObjectSet() <em>Object Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectSet()
	 * @generated
	 * @ordered
	 */
	protected ObjectSet objectSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RCAPackage.Literals.FCONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FRelation getFRelation() {
		return fRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFRelation(FRelation newFRelation, NotificationChain msgs) {
		FRelation oldFRelation = fRelation;
		fRelation = newFRelation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RCAPackage.FCONTEXT__FRELATION, oldFRelation, newFRelation);
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
	public void setFRelation(FRelation newFRelation) {
		if (newFRelation != fRelation) {
			NotificationChain msgs = null;
			if (fRelation != null)
				msgs = ((InternalEObject) fRelation).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RCAPackage.FCONTEXT__FRELATION, null, msgs);
			if (newFRelation != null)
				msgs = ((InternalEObject) newFRelation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RCAPackage.FCONTEXT__FRELATION, null, msgs);
			msgs = basicSetFRelation(newFRelation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RCAPackage.FCONTEXT__FRELATION, newFRelation,
					newFRelation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeSet getAttributeSet() {
		return attributeSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttributeSet(AttributeSet newAttributeSet, NotificationChain msgs) {
		AttributeSet oldAttributeSet = attributeSet;
		attributeSet = newAttributeSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RCAPackage.FCONTEXT__ATTRIBUTE_SET, oldAttributeSet, newAttributeSet);
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
	public void setAttributeSet(AttributeSet newAttributeSet) {
		if (newAttributeSet != attributeSet) {
			NotificationChain msgs = null;
			if (attributeSet != null)
				msgs = ((InternalEObject) attributeSet).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RCAPackage.FCONTEXT__ATTRIBUTE_SET, null, msgs);
			if (newAttributeSet != null)
				msgs = ((InternalEObject) newAttributeSet).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RCAPackage.FCONTEXT__ATTRIBUTE_SET, null, msgs);
			msgs = basicSetAttributeSet(newAttributeSet, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RCAPackage.FCONTEXT__ATTRIBUTE_SET, newAttributeSet,
					newAttributeSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectSet getObjectSet() {
		return objectSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectSet(ObjectSet newObjectSet, NotificationChain msgs) {
		ObjectSet oldObjectSet = objectSet;
		objectSet = newObjectSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RCAPackage.FCONTEXT__OBJECT_SET, oldObjectSet, newObjectSet);
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
	public void setObjectSet(ObjectSet newObjectSet) {
		if (newObjectSet != objectSet) {
			NotificationChain msgs = null;
			if (objectSet != null)
				msgs = ((InternalEObject) objectSet).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RCAPackage.FCONTEXT__OBJECT_SET, null, msgs);
			if (newObjectSet != null)
				msgs = ((InternalEObject) newObjectSet).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RCAPackage.FCONTEXT__OBJECT_SET, null, msgs);
			msgs = basicSetObjectSet(newObjectSet, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RCAPackage.FCONTEXT__OBJECT_SET, newObjectSet,
					newObjectSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RCAPackage.FCONTEXT__FRELATION:
			return basicSetFRelation(null, msgs);
		case RCAPackage.FCONTEXT__ATTRIBUTE_SET:
			return basicSetAttributeSet(null, msgs);
		case RCAPackage.FCONTEXT__OBJECT_SET:
			return basicSetObjectSet(null, msgs);
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
		case RCAPackage.FCONTEXT__FRELATION:
			return getFRelation();
		case RCAPackage.FCONTEXT__ATTRIBUTE_SET:
			return getAttributeSet();
		case RCAPackage.FCONTEXT__OBJECT_SET:
			return getObjectSet();
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
		case RCAPackage.FCONTEXT__FRELATION:
			setFRelation((FRelation) newValue);
			return;
		case RCAPackage.FCONTEXT__ATTRIBUTE_SET:
			setAttributeSet((AttributeSet) newValue);
			return;
		case RCAPackage.FCONTEXT__OBJECT_SET:
			setObjectSet((ObjectSet) newValue);
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
		case RCAPackage.FCONTEXT__FRELATION:
			setFRelation((FRelation) null);
			return;
		case RCAPackage.FCONTEXT__ATTRIBUTE_SET:
			setAttributeSet((AttributeSet) null);
			return;
		case RCAPackage.FCONTEXT__OBJECT_SET:
			setObjectSet((ObjectSet) null);
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
		case RCAPackage.FCONTEXT__FRELATION:
			return fRelation != null;
		case RCAPackage.FCONTEXT__ATTRIBUTE_SET:
			return attributeSet != null;
		case RCAPackage.FCONTEXT__OBJECT_SET:
			return objectSet != null;
		}
		return super.eIsSet(featureID);
	}

} //FContextImpl
