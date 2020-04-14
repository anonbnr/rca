/**
 */
package rca;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FRelation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rca.FRelation#getFPairs <em>FPairs</em>}</li>
 * </ul>
 *
 * @see rca.RCAPackage#getFRelation()
 * @model
 * @generated
 */
public interface FRelation extends Relation {
	/**
	 * Returns the value of the '<em><b>FPairs</b></em>' containment reference list.
	 * The list contents are of type {@link rca.FPair}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FPairs</em>' containment reference list.
	 * @see rca.RCAPackage#getFRelation_FPairs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<FPair> getFPairs();

} // FRelation
