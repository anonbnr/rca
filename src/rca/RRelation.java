/**
 */
package rca;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RRelation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rca.RRelation#getRPairs <em>RPairs</em>}</li>
 * </ul>
 *
 * @see rca.RCAPackage#getRRelation()
 * @model
 * @generated
 */
public interface RRelation extends Relation {
	/**
	 * Returns the value of the '<em><b>RPairs</b></em>' containment reference list.
	 * The list contents are of type {@link rca.RPair}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RPairs</em>' containment reference list.
	 * @see rca.RCAPackage#getRRelation_RPairs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<RPair> getRPairs();

} // RRelation
