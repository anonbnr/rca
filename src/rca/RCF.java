/**
 */
package rca;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RCF</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rca.RCF#getContexts <em>Contexts</em>}</li>
 * </ul>
 *
 * @see rca.RCAPackage#getRCF()
 * @model
 * @generated
 */
public interface RCF extends EObject {
	/**
	 * Returns the value of the '<em><b>Contexts</b></em>' containment reference list.
	 * The list contents are of type {@link rca.Context}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contexts</em>' containment reference list.
	 * @see rca.RCAPackage#getRCF_Contexts()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Context> getContexts();

} // RCF
