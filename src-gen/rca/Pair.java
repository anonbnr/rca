/**
 */
package rca;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rca.Pair#getFirst <em>First</em>}</li>
 *   <li>{@link rca.Pair#getSecond <em>Second</em>}</li>
 * </ul>
 *
 * @see rca.RCAPackage#getPair()
 * @model abstract="true"
 * @generated
 */
public interface Pair extends EObject {
	/**
	 * Returns the value of the '<em><b>First</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First</em>' containment reference.
	 * @see #setFirst(PairableElement)
	 * @see rca.RCAPackage#getPair_First()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PairableElement getFirst();

	/**
	 * Sets the value of the '{@link rca.Pair#getFirst <em>First</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First</em>' containment reference.
	 * @see #getFirst()
	 * @generated
	 */
	void setFirst(PairableElement value);

	/**
	 * Returns the value of the '<em><b>Second</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second</em>' containment reference.
	 * @see #setSecond(PairableElement)
	 * @see rca.RCAPackage#getPair_Second()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PairableElement getSecond();

	/**
	 * Sets the value of the '{@link rca.Pair#getSecond <em>Second</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second</em>' containment reference.
	 * @see #getSecond()
	 * @generated
	 */
	void setSecond(PairableElement value);

} // Pair
