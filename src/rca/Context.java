/**
 */
package rca;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rca.Context#getName <em>Name</em>}</li>
 *   <li>{@link rca.Context#getSource <em>Source</em>}</li>
 *   <li>{@link rca.Context#getTarget <em>Target</em>}</li>
 *   <li>{@link rca.Context#getRelation <em>Relation</em>}</li>
 * </ul>
 *
 * @see rca.RCAPackage#getContext()
 * @model abstract="true"
 * @generated
 */
public interface Context extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see rca.RCAPackage#getContext_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link rca.Context#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(Set)
	 * @see rca.RCAPackage#getContext_Source()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Set getSource();

	/**
	 * Sets the value of the '{@link rca.Context#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Set value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(Set)
	 * @see rca.RCAPackage#getContext_Target()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Set getTarget();

	/**
	 * Sets the value of the '{@link rca.Context#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Set value);

	/**
	 * Returns the value of the '<em><b>Relation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation</em>' containment reference.
	 * @see #setRelation(Relation)
	 * @see rca.RCAPackage#getContext_Relation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Relation getRelation();

	/**
	 * Sets the value of the '{@link rca.Context#getRelation <em>Relation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation</em>' containment reference.
	 * @see #getRelation()
	 * @generated
	 */
	void setRelation(Relation value);

} // Context
