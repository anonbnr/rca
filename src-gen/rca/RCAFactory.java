/**
 */
package rca;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see rca.RCAPackage
 * @generated
 */
public interface RCAFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RCAFactory eINSTANCE = rca.impl.RcaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>RRelation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RRelation</em>'.
	 * @generated
	 */
	RRelation createRRelation();

	/**
	 * Returns a new object of class '<em>RPair</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RPair</em>'.
	 * @generated
	 */
	RPair createRPair();

	/**
	 * Returns a new object of class '<em>FContext</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FContext</em>'.
	 * @generated
	 */
	FContext createFContext();

	/**
	 * Returns a new object of class '<em>Attribute Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Set</em>'.
	 * @generated
	 */
	AttributeSet createAttributeSet();

	/**
	 * Returns a new object of class '<em>FAttribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FAttribute</em>'.
	 * @generated
	 */
	FAttribute createFAttribute();

	/**
	 * Returns a new object of class '<em>RCF</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RCF</em>'.
	 * @generated
	 */
	RCF createRCF();

	/**
	 * Returns a new object of class '<em>RContext</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RContext</em>'.
	 * @generated
	 */
	RContext createRContext();

	/**
	 * Returns a new object of class '<em>FPair</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FPair</em>'.
	 * @generated
	 */
	FPair createFPair();

	/**
	 * Returns a new object of class '<em>Object Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Set</em>'.
	 * @generated
	 */
	ObjectSet createObjectSet();

	/**
	 * Returns a new object of class '<em>FRelation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FRelation</em>'.
	 * @generated
	 */
	FRelation createFRelation();

	/**
	 * Returns a new object of class '<em>Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object</em>'.
	 * @generated
	 */
	Object createObject();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RCAPackage getRcaPackage();

} //RcaFactory
