/**
 */
package rca;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rca.Relation#getPairs <em>Pairs</em>}</li>
 * </ul>
 *
 * @see rca.RCAPackage#getRelation()
 * @model abstract="true"
 * @generated
 */
public interface Relation extends Set {
	/**
	 * Returns the value of the '<em><b>Pairs</b></em>' containment reference list.
	 * The list contents are of type {@link rca.Pair}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pairs</em>' containment reference list.
	 * @see rca.RCAPackage#getRelation_Pairs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Pair> getPairs();

} // Relation
