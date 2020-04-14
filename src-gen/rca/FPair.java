/**
 */
package rca;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FPair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rca.FPair#getFAttribute <em>FAttribute</em>}</li>
 *   <li>{@link rca.FPair#getFObject <em>FObject</em>}</li>
 * </ul>
 *
 * @see rca.RCAPackage#getFPair()
 * @model
 * @generated
 */
public interface FPair extends Pair {
	/**
	 * Returns the value of the '<em><b>FAttribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FAttribute</em>' containment reference.
	 * @see #setFAttribute(FAttribute)
	 * @see rca.RCAPackage#getFPair_FAttribute()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FAttribute getFAttribute();

	/**
	 * Sets the value of the '{@link rca.FPair#getFAttribute <em>FAttribute</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FAttribute</em>' containment reference.
	 * @see #getFAttribute()
	 * @generated
	 */
	void setFAttribute(FAttribute value);

	/**
	 * Returns the value of the '<em><b>FObject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FObject</em>' containment reference.
	 * @see #setFObject(rca.Object)
	 * @see rca.RCAPackage#getFPair_FObject()
	 * @model containment="true" required="true"
	 * @generated
	 */
	rca.Object getFObject();

	/**
	 * Sets the value of the '{@link rca.FPair#getFObject <em>FObject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FObject</em>' containment reference.
	 * @see #getFObject()
	 * @generated
	 */
	void setFObject(rca.Object value);

} // FPair
