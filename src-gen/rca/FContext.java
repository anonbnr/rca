/**
 */
package rca;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FContext</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rca.FContext#getFRelation <em>FRelation</em>}</li>
 *   <li>{@link rca.FContext#getAttributeSet <em>Attribute Set</em>}</li>
 *   <li>{@link rca.FContext#getObjectSet <em>Object Set</em>}</li>
 * </ul>
 *
 * @see rca.RCAPackage#getFContext()
 * @model
 * @generated
 */
public interface FContext extends Context {
	/**
	 * Returns the value of the '<em><b>FRelation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FRelation</em>' containment reference.
	 * @see #setFRelation(FRelation)
	 * @see rca.RCAPackage#getFContext_FRelation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FRelation getFRelation();

	/**
	 * Sets the value of the '{@link rca.FContext#getFRelation <em>FRelation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FRelation</em>' containment reference.
	 * @see #getFRelation()
	 * @generated
	 */
	void setFRelation(FRelation value);

	/**
	 * Returns the value of the '<em><b>Attribute Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Set</em>' containment reference.
	 * @see #setAttributeSet(AttributeSet)
	 * @see rca.RCAPackage#getFContext_AttributeSet()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AttributeSet getAttributeSet();

	/**
	 * Sets the value of the '{@link rca.FContext#getAttributeSet <em>Attribute Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Set</em>' containment reference.
	 * @see #getAttributeSet()
	 * @generated
	 */
	void setAttributeSet(AttributeSet value);

	/**
	 * Returns the value of the '<em><b>Object Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Set</em>' containment reference.
	 * @see #setObjectSet(ObjectSet)
	 * @see rca.RCAPackage#getFContext_ObjectSet()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ObjectSet getObjectSet();

	/**
	 * Sets the value of the '{@link rca.FContext#getObjectSet <em>Object Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Set</em>' containment reference.
	 * @see #getObjectSet()
	 * @generated
	 */
	void setObjectSet(ObjectSet value);

} // FContext
