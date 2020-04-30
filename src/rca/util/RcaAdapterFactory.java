/**
 */
package rca.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see rca.RCAPackage
 * @generated
 */
public class RcaAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RCAPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RcaAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RCAPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RcaSwitch<Adapter> modelSwitch = new RcaSwitch<Adapter>() {
		@Override
		public Adapter caseAttribute(Attribute object) {
			return createAttributeAdapter();
		}

		@Override
		public Adapter casePair(Pair object) {
			return createPairAdapter();
		}

		@Override
		public Adapter caseRRelation(RRelation object) {
			return createRRelationAdapter();
		}

		@Override
		public Adapter caseRPair(RPair object) {
			return createRPairAdapter();
		}

		@Override
		public Adapter caseFContext(FContext object) {
			return createFContextAdapter();
		}

		@Override
		public Adapter caseRelation(Relation object) {
			return createRelationAdapter();
		}

		@Override
		public Adapter caseAttributeSet(AttributeSet object) {
			return createAttributeSetAdapter();
		}

		@Override
		public Adapter caseFAttribute(FAttribute object) {
			return createFAttributeAdapter();
		}

		@Override
		public Adapter caseRCF(RCF object) {
			return createRCFAdapter();
		}

		@Override
		public Adapter caseRContext(RContext object) {
			return createRContextAdapter();
		}

		@Override
		public Adapter caseContext(Context object) {
			return createContextAdapter();
		}

		@Override
		public Adapter caseFPair(FPair object) {
			return createFPairAdapter();
		}

		@Override
		public Adapter caseObjectSet(ObjectSet object) {
			return createObjectSetAdapter();
		}

		@Override
		public Adapter caseFRelation(FRelation object) {
			return createFRelationAdapter();
		}

		@Override
		public Adapter casePairableElement(PairableElement object) {
			return createPairableElementAdapter();
		}

		@Override
		public Adapter caseSet(Set object) {
			return createSetAdapter();
		}

		@Override
		public Adapter caseObject(rca.Object object) {
			return createObjectAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link rca.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rca.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rca.Pair <em>Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rca.Pair
	 * @generated
	 */
	public Adapter createPairAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rca.RRelation <em>RRelation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rca.RRelation
	 * @generated
	 */
	public Adapter createRRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rca.RPair <em>RPair</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rca.RPair
	 * @generated
	 */
	public Adapter createRPairAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rca.FContext <em>FContext</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rca.FContext
	 * @generated
	 */
	public Adapter createFContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rca.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rca.Relation
	 * @generated
	 */
	public Adapter createRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rca.AttributeSet <em>Attribute Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rca.AttributeSet
	 * @generated
	 */
	public Adapter createAttributeSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rca.FAttribute <em>FAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rca.FAttribute
	 * @generated
	 */
	public Adapter createFAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rca.RCF <em>RCF</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rca.RCF
	 * @generated
	 */
	public Adapter createRCFAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rca.RContext <em>RContext</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rca.RContext
	 * @generated
	 */
	public Adapter createRContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rca.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rca.Context
	 * @generated
	 */
	public Adapter createContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rca.FPair <em>FPair</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rca.FPair
	 * @generated
	 */
	public Adapter createFPairAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rca.ObjectSet <em>Object Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rca.ObjectSet
	 * @generated
	 */
	public Adapter createObjectSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rca.FRelation <em>FRelation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rca.FRelation
	 * @generated
	 */
	public Adapter createFRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rca.PairableElement <em>Pairable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rca.PairableElement
	 * @generated
	 */
	public Adapter createPairableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rca.Set <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rca.Set
	 * @generated
	 */
	public Adapter createSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rca.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rca.Object
	 * @generated
	 */
	public Adapter createObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //RcaAdapterFactory
