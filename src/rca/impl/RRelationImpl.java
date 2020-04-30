/**
 */
package rca.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import rca.RPair;
import rca.RRelation;
import rca.RCAPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RRelation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rca.impl.RRelationImpl#getRPairs <em>RPairs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RRelationImpl extends RelationImpl implements RRelation {
	/**
	 * The cached value of the '{@link #getRPairs() <em>RPairs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRPairs()
	 * @generated
	 * @ordered
	 */
	protected EList<RPair> rPairs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RRelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RCAPackage.Literals.RRELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RPair> getRPairs() {
		if (rPairs == null) {
			rPairs = new EObjectContainmentEList<RPair>(RPair.class, this, RCAPackage.RRELATION__RPAIRS);
		}
		return rPairs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RCAPackage.RRELATION__RPAIRS:
			return ((InternalEList<?>) getRPairs()).basicRemove(otherEnd, msgs);
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
		case RCAPackage.RRELATION__RPAIRS:
			return getRPairs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case RCAPackage.RRELATION__RPAIRS:
			getRPairs().clear();
			getRPairs().addAll((Collection<? extends RPair>) newValue);
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
		case RCAPackage.RRELATION__RPAIRS:
			getRPairs().clear();
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
		case RCAPackage.RRELATION__RPAIRS:
			return rPairs != null && !rPairs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RRelationImpl
