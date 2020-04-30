/**
 */
package rca;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rca.ObjectSet#getObjects <em>Objects</em>}</li>
 * </ul>
 *
 * @see rca.RCAPackage#getObjectSet()
 * @model
 * @generated
 */
public interface ObjectSet extends Set {
	/**
	 * Returns the value of the '<em><b>Objects</b></em>' containment reference list.
	 * The list contents are of type {@link rca.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objects</em>' containment reference list.
	 * @see rca.RCAPackage#getObjectSet_Objects()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<rca.Object> getObjects();

} // ObjectSet
