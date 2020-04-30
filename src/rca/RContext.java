/**
 */
package rca;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RContext</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rca.RContext#getRRelation <em>RRelation</em>}</li>
 *   <li>{@link rca.RContext#getTargetObjectSet <em>Target Object Set</em>}</li>
 *   <li>{@link rca.RContext#getSourceObjectSet <em>Source Object Set</em>}</li>
 * </ul>
 *
 * @see rca.RCAPackage#getRContext()
 * @model
 * @generated
 */
public interface RContext extends Context {
	/**
	 * Returns the value of the '<em><b>RRelation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RRelation</em>' containment reference.
	 * @see #setRRelation(RRelation)
	 * @see rca.RCAPackage#getRContext_RRelation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RRelation getRRelation();

	/**
	 * Sets the value of the '{@link rca.RContext#getRRelation <em>RRelation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RRelation</em>' containment reference.
	 * @see #getRRelation()
	 * @generated
	 */
	void setRRelation(RRelation value);

	/**
	 * Returns the value of the '<em><b>Target Object Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Object Set</em>' containment reference.
	 * @see #setTargetObjectSet(ObjectSet)
	 * @see rca.RCAPackage#getRContext_TargetObjectSet()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ObjectSet getTargetObjectSet();

	/**
	 * Sets the value of the '{@link rca.RContext#getTargetObjectSet <em>Target Object Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Object Set</em>' containment reference.
	 * @see #getTargetObjectSet()
	 * @generated
	 */
	void setTargetObjectSet(ObjectSet value);

	/**
	 * Returns the value of the '<em><b>Source Object Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Object Set</em>' containment reference.
	 * @see #setSourceObjectSet(ObjectSet)
	 * @see rca.RCAPackage#getRContext_SourceObjectSet()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ObjectSet getSourceObjectSet();

	/**
	 * Sets the value of the '{@link rca.RContext#getSourceObjectSet <em>Source Object Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Object Set</em>' containment reference.
	 * @see #getSourceObjectSet()
	 * @generated
	 */
	void setSourceObjectSet(ObjectSet value);

} // RContext
