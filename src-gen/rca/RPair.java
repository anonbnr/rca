/**
 */
package rca;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RPair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rca.RPair#getRSourceObject <em>RSource Object</em>}</li>
 *   <li>{@link rca.RPair#getRTargetObject <em>RTarget Object</em>}</li>
 * </ul>
 *
 * @see rca.RCAPackage#getRPair()
 * @model
 * @generated
 */
public interface RPair extends Pair {
	/**
	 * Returns the value of the '<em><b>RSource Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RSource Object</em>' containment reference.
	 * @see #setRSourceObject(rca.Object)
	 * @see rca.RCAPackage#getRPair_RSourceObject()
	 * @model containment="true" required="true"
	 * @generated
	 */
	rca.Object getRSourceObject();

	/**
	 * Sets the value of the '{@link rca.RPair#getRSourceObject <em>RSource Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RSource Object</em>' containment reference.
	 * @see #getRSourceObject()
	 * @generated
	 */
	void setRSourceObject(rca.Object value);

	/**
	 * Returns the value of the '<em><b>RTarget Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RTarget Object</em>' containment reference.
	 * @see #setRTargetObject(rca.Object)
	 * @see rca.RCAPackage#getRPair_RTargetObject()
	 * @model containment="true" required="true"
	 * @generated
	 */
	rca.Object getRTargetObject();

	/**
	 * Sets the value of the '{@link rca.RPair#getRTargetObject <em>RTarget Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RTarget Object</em>' containment reference.
	 * @see #getRTargetObject()
	 * @generated
	 */
	void setRTargetObject(rca.Object value);

} // RPair
