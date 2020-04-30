/**
 */
package rca.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import rca.Attribute;
import rca.AttributeSet;
import rca.Context;
import rca.FAttribute;
import rca.FContext;
import rca.FPair;
import rca.FRelation;
import rca.ObjectSet;
import rca.Pair;
import rca.PairableElement;
import rca.RCF;
import rca.RContext;
import rca.RPair;
import rca.RRelation;
import rca.RCAPackage;
import rca.Relation;
import rca.Set;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see rca.RCAPackage
 * @generated
 */
public class RcaSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RCAPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RcaSwitch() {
		if (modelPackage == null) {
			modelPackage = RCAPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case RCAPackage.ATTRIBUTE: {
			Attribute attribute = (Attribute) theEObject;
			T result = caseAttribute(attribute);
			if (result == null)
				result = casePairableElement(attribute);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RCAPackage.PAIR: {
			Pair pair = (Pair) theEObject;
			T result = casePair(pair);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RCAPackage.RRELATION: {
			RRelation rRelation = (RRelation) theEObject;
			T result = caseRRelation(rRelation);
			if (result == null)
				result = caseRelation(rRelation);
			if (result == null)
				result = caseSet(rRelation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RCAPackage.RPAIR: {
			RPair rPair = (RPair) theEObject;
			T result = caseRPair(rPair);
			if (result == null)
				result = casePair(rPair);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RCAPackage.FCONTEXT: {
			FContext fContext = (FContext) theEObject;
			T result = caseFContext(fContext);
			if (result == null)
				result = caseContext(fContext);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RCAPackage.RELATION: {
			Relation relation = (Relation) theEObject;
			T result = caseRelation(relation);
			if (result == null)
				result = caseSet(relation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RCAPackage.ATTRIBUTE_SET: {
			AttributeSet attributeSet = (AttributeSet) theEObject;
			T result = caseAttributeSet(attributeSet);
			if (result == null)
				result = caseSet(attributeSet);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RCAPackage.FATTRIBUTE: {
			FAttribute fAttribute = (FAttribute) theEObject;
			T result = caseFAttribute(fAttribute);
			if (result == null)
				result = caseAttribute(fAttribute);
			if (result == null)
				result = casePairableElement(fAttribute);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RCAPackage.RCF: {
			RCF rcf = (RCF) theEObject;
			T result = caseRCF(rcf);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RCAPackage.RCONTEXT: {
			RContext rContext = (RContext) theEObject;
			T result = caseRContext(rContext);
			if (result == null)
				result = caseContext(rContext);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RCAPackage.CONTEXT: {
			Context context = (Context) theEObject;
			T result = caseContext(context);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RCAPackage.FPAIR: {
			FPair fPair = (FPair) theEObject;
			T result = caseFPair(fPair);
			if (result == null)
				result = casePair(fPair);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RCAPackage.OBJECT_SET: {
			ObjectSet objectSet = (ObjectSet) theEObject;
			T result = caseObjectSet(objectSet);
			if (result == null)
				result = caseSet(objectSet);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RCAPackage.FRELATION: {
			FRelation fRelation = (FRelation) theEObject;
			T result = caseFRelation(fRelation);
			if (result == null)
				result = caseRelation(fRelation);
			if (result == null)
				result = caseSet(fRelation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RCAPackage.PAIRABLE_ELEMENT: {
			PairableElement pairableElement = (PairableElement) theEObject;
			T result = casePairableElement(pairableElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RCAPackage.SET: {
			Set set = (Set) theEObject;
			T result = caseSet(set);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RCAPackage.OBJECT: {
			rca.Object object = (rca.Object) theEObject;
			T result = caseObject(object);
			if (result == null)
				result = casePairableElement(object);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute(Attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pair</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pair</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePair(Pair object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RRelation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RRelation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRRelation(RRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RPair</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RPair</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRPair(RPair object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FContext</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FContext</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFContext(FContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelation(Relation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeSet(AttributeSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FAttribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FAttribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFAttribute(FAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RCF</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RCF</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRCF(RCF object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RContext</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RContext</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRContext(RContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContext(Context object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FPair</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FPair</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFPair(FPair object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectSet(ObjectSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FRelation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FRelation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFRelation(FRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pairable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pairable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePairableElement(PairableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSet(Set object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject(rca.Object object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //RcaSwitch
