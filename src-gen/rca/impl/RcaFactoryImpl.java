/**
 */
package rca.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import rca.AttributeSet;
import rca.FAttribute;
import rca.FContext;
import rca.FPair;
import rca.FRelation;
import rca.ObjectSet;
import rca.RCF;
import rca.RContext;
import rca.RPair;
import rca.RRelation;
import rca.RCAFactory;
import rca.RCAPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RcaFactoryImpl extends EFactoryImpl implements RCAFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RCAFactory init() {
		try {
			RCAFactory theRcaFactory = (RCAFactory) EPackage.Registry.INSTANCE.getEFactory(RCAPackage.eNS_URI);
			if (theRcaFactory != null) {
				return theRcaFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RcaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RcaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case RCAPackage.RRELATION:
			return createRRelation();
		case RCAPackage.RPAIR:
			return createRPair();
		case RCAPackage.FCONTEXT:
			return createFContext();
		case RCAPackage.ATTRIBUTE_SET:
			return createAttributeSet();
		case RCAPackage.FATTRIBUTE:
			return createFAttribute();
		case RCAPackage.RCF:
			return createRCF();
		case RCAPackage.RCONTEXT:
			return createRContext();
		case RCAPackage.FPAIR:
			return createFPair();
		case RCAPackage.OBJECT_SET:
			return createObjectSet();
		case RCAPackage.FRELATION:
			return createFRelation();
		case RCAPackage.OBJECT:
			return createObject();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RRelation createRRelation() {
		RRelationImpl rRelation = new RRelationImpl();
		return rRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RPair createRPair() {
		RPairImpl rPair = new RPairImpl();
		return rPair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FContext createFContext() {
		FContextImpl fContext = new FContextImpl();
		return fContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeSet createAttributeSet() {
		AttributeSetImpl attributeSet = new AttributeSetImpl();
		return attributeSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FAttribute createFAttribute() {
		FAttributeImpl fAttribute = new FAttributeImpl();
		return fAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RCF createRCF() {
		RCFImpl rcf = new RCFImpl();
		return rcf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RContext createRContext() {
		RContextImpl rContext = new RContextImpl();
		return rContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FPair createFPair() {
		FPairImpl fPair = new FPairImpl();
		return fPair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectSet createObjectSet() {
		ObjectSetImpl objectSet = new ObjectSetImpl();
		return objectSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FRelation createFRelation() {
		FRelationImpl fRelation = new FRelationImpl();
		return fRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public rca.Object createObject() {
		ObjectImpl object = new ObjectImpl();
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RCAPackage getRcaPackage() {
		return (RCAPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RCAPackage getPackage() {
		return RCAPackage.eINSTANCE;
	}

} //RcaFactoryImpl
