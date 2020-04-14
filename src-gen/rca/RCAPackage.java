/**
 */
package rca;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see rca.RCAFactory
 * @model kind="package"
 * @generated
 */
public interface RCAPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rca";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/rca";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rca";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RCAPackage eINSTANCE = rca.impl.RcaPackageImpl.init();

	/**
	 * The meta object id for the '{@link rca.impl.PairableElementImpl <em>Pairable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rca.impl.PairableElementImpl
	 * @see rca.impl.RcaPackageImpl#getPairableElement()
	 * @generated
	 */
	int PAIRABLE_ELEMENT = 14;

	/**
	 * The number of structural features of the '<em>Pairable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIRABLE_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Pairable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIRABLE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rca.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rca.impl.AttributeImpl
	 * @see rca.impl.RcaPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = PAIRABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = PAIRABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = PAIRABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rca.impl.PairImpl <em>Pair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rca.impl.PairImpl
	 * @see rca.impl.RcaPackageImpl#getPair()
	 * @generated
	 */
	int PAIR = 1;

	/**
	 * The feature id for the '<em><b>First</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIR__FIRST = 0;

	/**
	 * The feature id for the '<em><b>Second</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIR__SECOND = 1;

	/**
	 * The number of structural features of the '<em>Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rca.impl.SetImpl <em>Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rca.impl.SetImpl
	 * @see rca.impl.RcaPackageImpl#getSet()
	 * @generated
	 */
	int SET = 15;

	/**
	 * The number of structural features of the '<em>Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rca.impl.RelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rca.impl.RelationImpl
	 * @see rca.impl.RcaPackageImpl#getRelation()
	 * @generated
	 */
	int RELATION = 5;

	/**
	 * The feature id for the '<em><b>Pairs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__PAIRS = SET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FEATURE_COUNT = SET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPERATION_COUNT = SET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rca.impl.RRelationImpl <em>RRelation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rca.impl.RRelationImpl
	 * @see rca.impl.RcaPackageImpl#getRRelation()
	 * @generated
	 */
	int RRELATION = 2;

	/**
	 * The feature id for the '<em><b>Pairs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RRELATION__PAIRS = RELATION__PAIRS;

	/**
	 * The feature id for the '<em><b>RPairs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RRELATION__RPAIRS = RELATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>RRelation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RRELATION_FEATURE_COUNT = RELATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>RRelation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RRELATION_OPERATION_COUNT = RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rca.impl.RPairImpl <em>RPair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rca.impl.RPairImpl
	 * @see rca.impl.RcaPackageImpl#getRPair()
	 * @generated
	 */
	int RPAIR = 3;

	/**
	 * The feature id for the '<em><b>First</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPAIR__FIRST = PAIR__FIRST;

	/**
	 * The feature id for the '<em><b>Second</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPAIR__SECOND = PAIR__SECOND;

	/**
	 * The feature id for the '<em><b>RSource Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPAIR__RSOURCE_OBJECT = PAIR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>RTarget Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPAIR__RTARGET_OBJECT = PAIR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>RPair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPAIR_FEATURE_COUNT = PAIR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>RPair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPAIR_OPERATION_COUNT = PAIR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rca.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rca.impl.ContextImpl
	 * @see rca.impl.RcaPackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__TARGET = 2;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__RELATION = 3;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rca.impl.FContextImpl <em>FContext</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rca.impl.FContextImpl
	 * @see rca.impl.RcaPackageImpl#getFContext()
	 * @generated
	 */
	int FCONTEXT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FCONTEXT__NAME = CONTEXT__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FCONTEXT__SOURCE = CONTEXT__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FCONTEXT__TARGET = CONTEXT__TARGET;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FCONTEXT__RELATION = CONTEXT__RELATION;

	/**
	 * The feature id for the '<em><b>FRelation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FCONTEXT__FRELATION = CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attribute Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FCONTEXT__ATTRIBUTE_SET = CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Object Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FCONTEXT__OBJECT_SET = CONTEXT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>FContext</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FCONTEXT_FEATURE_COUNT = CONTEXT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>FContext</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FCONTEXT_OPERATION_COUNT = CONTEXT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rca.impl.AttributeSetImpl <em>Attribute Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rca.impl.AttributeSetImpl
	 * @see rca.impl.RcaPackageImpl#getAttributeSet()
	 * @generated
	 */
	int ATTRIBUTE_SET = 6;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_SET__ATTRIBUTES = SET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attribute Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_SET_FEATURE_COUNT = SET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Attribute Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_SET_OPERATION_COUNT = SET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rca.impl.FAttributeImpl <em>FAttribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rca.impl.FAttributeImpl
	 * @see rca.impl.RcaPackageImpl#getFAttribute()
	 * @generated
	 */
	int FATTRIBUTE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATTRIBUTE__NAME = ATTRIBUTE__NAME;

	/**
	 * The number of structural features of the '<em>FAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>FAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATTRIBUTE_OPERATION_COUNT = ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rca.impl.RCFImpl <em>RCF</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rca.impl.RCFImpl
	 * @see rca.impl.RcaPackageImpl#getRCF()
	 * @generated
	 */
	int RCF = 8;

	/**
	 * The feature id for the '<em><b>Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCF__CONTEXTS = 0;

	/**
	 * The number of structural features of the '<em>RCF</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCF_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>RCF</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rca.impl.RContextImpl <em>RContext</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rca.impl.RContextImpl
	 * @see rca.impl.RcaPackageImpl#getRContext()
	 * @generated
	 */
	int RCONTEXT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCONTEXT__NAME = CONTEXT__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCONTEXT__SOURCE = CONTEXT__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCONTEXT__TARGET = CONTEXT__TARGET;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCONTEXT__RELATION = CONTEXT__RELATION;

	/**
	 * The feature id for the '<em><b>RRelation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCONTEXT__RRELATION = CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Object Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCONTEXT__TARGET_OBJECT_SET = CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source Object Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCONTEXT__SOURCE_OBJECT_SET = CONTEXT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>RContext</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCONTEXT_FEATURE_COUNT = CONTEXT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>RContext</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCONTEXT_OPERATION_COUNT = CONTEXT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rca.impl.FPairImpl <em>FPair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rca.impl.FPairImpl
	 * @see rca.impl.RcaPackageImpl#getFPair()
	 * @generated
	 */
	int FPAIR = 11;

	/**
	 * The feature id for the '<em><b>First</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPAIR__FIRST = PAIR__FIRST;

	/**
	 * The feature id for the '<em><b>Second</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPAIR__SECOND = PAIR__SECOND;

	/**
	 * The feature id for the '<em><b>FAttribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPAIR__FATTRIBUTE = PAIR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>FObject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPAIR__FOBJECT = PAIR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>FPair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPAIR_FEATURE_COUNT = PAIR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>FPair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPAIR_OPERATION_COUNT = PAIR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rca.impl.ObjectSetImpl <em>Object Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rca.impl.ObjectSetImpl
	 * @see rca.impl.RcaPackageImpl#getObjectSet()
	 * @generated
	 */
	int OBJECT_SET = 12;

	/**
	 * The feature id for the '<em><b>Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SET__OBJECTS = SET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SET_FEATURE_COUNT = SET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Object Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SET_OPERATION_COUNT = SET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rca.impl.FRelationImpl <em>FRelation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rca.impl.FRelationImpl
	 * @see rca.impl.RcaPackageImpl#getFRelation()
	 * @generated
	 */
	int FRELATION = 13;

	/**
	 * The feature id for the '<em><b>Pairs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRELATION__PAIRS = RELATION__PAIRS;

	/**
	 * The feature id for the '<em><b>FPairs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRELATION__FPAIRS = RELATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>FRelation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRELATION_FEATURE_COUNT = RELATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>FRelation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRELATION_OPERATION_COUNT = RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rca.impl.ObjectImpl <em>Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rca.impl.ObjectImpl
	 * @see rca.impl.RcaPackageImpl#getObject()
	 * @generated
	 */
	int OBJECT = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__NAME = PAIRABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FEATURE_COUNT = PAIRABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_OPERATION_COUNT = PAIRABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link rca.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see rca.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link rca.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rca.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for class '{@link rca.Pair <em>Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pair</em>'.
	 * @see rca.Pair
	 * @generated
	 */
	EClass getPair();

	/**
	 * Returns the meta object for the containment reference '{@link rca.Pair#getFirst <em>First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>First</em>'.
	 * @see rca.Pair#getFirst()
	 * @see #getPair()
	 * @generated
	 */
	EReference getPair_First();

	/**
	 * Returns the meta object for the containment reference '{@link rca.Pair#getSecond <em>Second</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Second</em>'.
	 * @see rca.Pair#getSecond()
	 * @see #getPair()
	 * @generated
	 */
	EReference getPair_Second();

	/**
	 * Returns the meta object for class '{@link rca.RRelation <em>RRelation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RRelation</em>'.
	 * @see rca.RRelation
	 * @generated
	 */
	EClass getRRelation();

	/**
	 * Returns the meta object for the containment reference list '{@link rca.RRelation#getRPairs <em>RPairs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>RPairs</em>'.
	 * @see rca.RRelation#getRPairs()
	 * @see #getRRelation()
	 * @generated
	 */
	EReference getRRelation_RPairs();

	/**
	 * Returns the meta object for class '{@link rca.RPair <em>RPair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RPair</em>'.
	 * @see rca.RPair
	 * @generated
	 */
	EClass getRPair();

	/**
	 * Returns the meta object for the containment reference '{@link rca.RPair#getRSourceObject <em>RSource Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>RSource Object</em>'.
	 * @see rca.RPair#getRSourceObject()
	 * @see #getRPair()
	 * @generated
	 */
	EReference getRPair_RSourceObject();

	/**
	 * Returns the meta object for the containment reference '{@link rca.RPair#getRTargetObject <em>RTarget Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>RTarget Object</em>'.
	 * @see rca.RPair#getRTargetObject()
	 * @see #getRPair()
	 * @generated
	 */
	EReference getRPair_RTargetObject();

	/**
	 * Returns the meta object for class '{@link rca.FContext <em>FContext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FContext</em>'.
	 * @see rca.FContext
	 * @generated
	 */
	EClass getFContext();

	/**
	 * Returns the meta object for the containment reference '{@link rca.FContext#getFRelation <em>FRelation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>FRelation</em>'.
	 * @see rca.FContext#getFRelation()
	 * @see #getFContext()
	 * @generated
	 */
	EReference getFContext_FRelation();

	/**
	 * Returns the meta object for the containment reference '{@link rca.FContext#getAttributeSet <em>Attribute Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attribute Set</em>'.
	 * @see rca.FContext#getAttributeSet()
	 * @see #getFContext()
	 * @generated
	 */
	EReference getFContext_AttributeSet();

	/**
	 * Returns the meta object for the containment reference '{@link rca.FContext#getObjectSet <em>Object Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object Set</em>'.
	 * @see rca.FContext#getObjectSet()
	 * @see #getFContext()
	 * @generated
	 */
	EReference getFContext_ObjectSet();

	/**
	 * Returns the meta object for class '{@link rca.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see rca.Relation
	 * @generated
	 */
	EClass getRelation();

	/**
	 * Returns the meta object for the containment reference list '{@link rca.Relation#getPairs <em>Pairs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pairs</em>'.
	 * @see rca.Relation#getPairs()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Pairs();

	/**
	 * Returns the meta object for class '{@link rca.AttributeSet <em>Attribute Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Set</em>'.
	 * @see rca.AttributeSet
	 * @generated
	 */
	EClass getAttributeSet();

	/**
	 * Returns the meta object for the containment reference list '{@link rca.AttributeSet#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see rca.AttributeSet#getAttributes()
	 * @see #getAttributeSet()
	 * @generated
	 */
	EReference getAttributeSet_Attributes();

	/**
	 * Returns the meta object for class '{@link rca.FAttribute <em>FAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FAttribute</em>'.
	 * @see rca.FAttribute
	 * @generated
	 */
	EClass getFAttribute();

	/**
	 * Returns the meta object for class '{@link rca.RCF <em>RCF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RCF</em>'.
	 * @see rca.RCF
	 * @generated
	 */
	EClass getRCF();

	/**
	 * Returns the meta object for the containment reference list '{@link rca.RCF#getContexts <em>Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contexts</em>'.
	 * @see rca.RCF#getContexts()
	 * @see #getRCF()
	 * @generated
	 */
	EReference getRCF_Contexts();

	/**
	 * Returns the meta object for class '{@link rca.RContext <em>RContext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RContext</em>'.
	 * @see rca.RContext
	 * @generated
	 */
	EClass getRContext();

	/**
	 * Returns the meta object for the containment reference '{@link rca.RContext#getRRelation <em>RRelation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>RRelation</em>'.
	 * @see rca.RContext#getRRelation()
	 * @see #getRContext()
	 * @generated
	 */
	EReference getRContext_RRelation();

	/**
	 * Returns the meta object for the containment reference '{@link rca.RContext#getTargetObjectSet <em>Target Object Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target Object Set</em>'.
	 * @see rca.RContext#getTargetObjectSet()
	 * @see #getRContext()
	 * @generated
	 */
	EReference getRContext_TargetObjectSet();

	/**
	 * Returns the meta object for the containment reference '{@link rca.RContext#getSourceObjectSet <em>Source Object Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source Object Set</em>'.
	 * @see rca.RContext#getSourceObjectSet()
	 * @see #getRContext()
	 * @generated
	 */
	EReference getRContext_SourceObjectSet();

	/**
	 * Returns the meta object for class '{@link rca.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see rca.Context
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the meta object for the attribute '{@link rca.Context#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rca.Context#getName()
	 * @see #getContext()
	 * @generated
	 */
	EAttribute getContext_Name();

	/**
	 * Returns the meta object for the containment reference '{@link rca.Context#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see rca.Context#getSource()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_Source();

	/**
	 * Returns the meta object for the containment reference '{@link rca.Context#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see rca.Context#getTarget()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_Target();

	/**
	 * Returns the meta object for the containment reference '{@link rca.Context#getRelation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relation</em>'.
	 * @see rca.Context#getRelation()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_Relation();

	/**
	 * Returns the meta object for class '{@link rca.FPair <em>FPair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FPair</em>'.
	 * @see rca.FPair
	 * @generated
	 */
	EClass getFPair();

	/**
	 * Returns the meta object for the containment reference '{@link rca.FPair#getFAttribute <em>FAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>FAttribute</em>'.
	 * @see rca.FPair#getFAttribute()
	 * @see #getFPair()
	 * @generated
	 */
	EReference getFPair_FAttribute();

	/**
	 * Returns the meta object for the containment reference '{@link rca.FPair#getFObject <em>FObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>FObject</em>'.
	 * @see rca.FPair#getFObject()
	 * @see #getFPair()
	 * @generated
	 */
	EReference getFPair_FObject();

	/**
	 * Returns the meta object for class '{@link rca.ObjectSet <em>Object Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Set</em>'.
	 * @see rca.ObjectSet
	 * @generated
	 */
	EClass getObjectSet();

	/**
	 * Returns the meta object for the containment reference list '{@link rca.ObjectSet#getObjects <em>Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Objects</em>'.
	 * @see rca.ObjectSet#getObjects()
	 * @see #getObjectSet()
	 * @generated
	 */
	EReference getObjectSet_Objects();

	/**
	 * Returns the meta object for class '{@link rca.FRelation <em>FRelation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FRelation</em>'.
	 * @see rca.FRelation
	 * @generated
	 */
	EClass getFRelation();

	/**
	 * Returns the meta object for the containment reference list '{@link rca.FRelation#getFPairs <em>FPairs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>FPairs</em>'.
	 * @see rca.FRelation#getFPairs()
	 * @see #getFRelation()
	 * @generated
	 */
	EReference getFRelation_FPairs();

	/**
	 * Returns the meta object for class '{@link rca.PairableElement <em>Pairable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pairable Element</em>'.
	 * @see rca.PairableElement
	 * @generated
	 */
	EClass getPairableElement();

	/**
	 * Returns the meta object for class '{@link rca.Set <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set</em>'.
	 * @see rca.Set
	 * @generated
	 */
	EClass getSet();

	/**
	 * Returns the meta object for class '{@link rca.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object</em>'.
	 * @see rca.Object
	 * @generated
	 */
	EClass getObject();

	/**
	 * Returns the meta object for the attribute '{@link rca.Object#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rca.Object#getName()
	 * @see #getObject()
	 * @generated
	 */
	EAttribute getObject_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RCAFactory getRcaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link rca.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rca.impl.AttributeImpl
		 * @see rca.impl.RcaPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

		/**
		 * The meta object literal for the '{@link rca.impl.PairImpl <em>Pair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rca.impl.PairImpl
		 * @see rca.impl.RcaPackageImpl#getPair()
		 * @generated
		 */
		EClass PAIR = eINSTANCE.getPair();

		/**
		 * The meta object literal for the '<em><b>First</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAIR__FIRST = eINSTANCE.getPair_First();

		/**
		 * The meta object literal for the '<em><b>Second</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAIR__SECOND = eINSTANCE.getPair_Second();

		/**
		 * The meta object literal for the '{@link rca.impl.RRelationImpl <em>RRelation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rca.impl.RRelationImpl
		 * @see rca.impl.RcaPackageImpl#getRRelation()
		 * @generated
		 */
		EClass RRELATION = eINSTANCE.getRRelation();

		/**
		 * The meta object literal for the '<em><b>RPairs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RRELATION__RPAIRS = eINSTANCE.getRRelation_RPairs();

		/**
		 * The meta object literal for the '{@link rca.impl.RPairImpl <em>RPair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rca.impl.RPairImpl
		 * @see rca.impl.RcaPackageImpl#getRPair()
		 * @generated
		 */
		EClass RPAIR = eINSTANCE.getRPair();

		/**
		 * The meta object literal for the '<em><b>RSource Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RPAIR__RSOURCE_OBJECT = eINSTANCE.getRPair_RSourceObject();

		/**
		 * The meta object literal for the '<em><b>RTarget Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RPAIR__RTARGET_OBJECT = eINSTANCE.getRPair_RTargetObject();

		/**
		 * The meta object literal for the '{@link rca.impl.FContextImpl <em>FContext</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rca.impl.FContextImpl
		 * @see rca.impl.RcaPackageImpl#getFContext()
		 * @generated
		 */
		EClass FCONTEXT = eINSTANCE.getFContext();

		/**
		 * The meta object literal for the '<em><b>FRelation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FCONTEXT__FRELATION = eINSTANCE.getFContext_FRelation();

		/**
		 * The meta object literal for the '<em><b>Attribute Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FCONTEXT__ATTRIBUTE_SET = eINSTANCE.getFContext_AttributeSet();

		/**
		 * The meta object literal for the '<em><b>Object Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FCONTEXT__OBJECT_SET = eINSTANCE.getFContext_ObjectSet();

		/**
		 * The meta object literal for the '{@link rca.impl.RelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rca.impl.RelationImpl
		 * @see rca.impl.RcaPackageImpl#getRelation()
		 * @generated
		 */
		EClass RELATION = eINSTANCE.getRelation();

		/**
		 * The meta object literal for the '<em><b>Pairs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__PAIRS = eINSTANCE.getRelation_Pairs();

		/**
		 * The meta object literal for the '{@link rca.impl.AttributeSetImpl <em>Attribute Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rca.impl.AttributeSetImpl
		 * @see rca.impl.RcaPackageImpl#getAttributeSet()
		 * @generated
		 */
		EClass ATTRIBUTE_SET = eINSTANCE.getAttributeSet();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_SET__ATTRIBUTES = eINSTANCE.getAttributeSet_Attributes();

		/**
		 * The meta object literal for the '{@link rca.impl.FAttributeImpl <em>FAttribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rca.impl.FAttributeImpl
		 * @see rca.impl.RcaPackageImpl#getFAttribute()
		 * @generated
		 */
		EClass FATTRIBUTE = eINSTANCE.getFAttribute();

		/**
		 * The meta object literal for the '{@link rca.impl.RCFImpl <em>RCF</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rca.impl.RCFImpl
		 * @see rca.impl.RcaPackageImpl#getRCF()
		 * @generated
		 */
		EClass RCF = eINSTANCE.getRCF();

		/**
		 * The meta object literal for the '<em><b>Contexts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RCF__CONTEXTS = eINSTANCE.getRCF_Contexts();

		/**
		 * The meta object literal for the '{@link rca.impl.RContextImpl <em>RContext</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rca.impl.RContextImpl
		 * @see rca.impl.RcaPackageImpl#getRContext()
		 * @generated
		 */
		EClass RCONTEXT = eINSTANCE.getRContext();

		/**
		 * The meta object literal for the '<em><b>RRelation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RCONTEXT__RRELATION = eINSTANCE.getRContext_RRelation();

		/**
		 * The meta object literal for the '<em><b>Target Object Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RCONTEXT__TARGET_OBJECT_SET = eINSTANCE.getRContext_TargetObjectSet();

		/**
		 * The meta object literal for the '<em><b>Source Object Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RCONTEXT__SOURCE_OBJECT_SET = eINSTANCE.getRContext_SourceObjectSet();

		/**
		 * The meta object literal for the '{@link rca.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rca.impl.ContextImpl
		 * @see rca.impl.RcaPackageImpl#getContext()
		 * @generated
		 */
		EClass CONTEXT = eINSTANCE.getContext();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT__NAME = eINSTANCE.getContext_Name();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__SOURCE = eINSTANCE.getContext_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__TARGET = eINSTANCE.getContext_Target();

		/**
		 * The meta object literal for the '<em><b>Relation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__RELATION = eINSTANCE.getContext_Relation();

		/**
		 * The meta object literal for the '{@link rca.impl.FPairImpl <em>FPair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rca.impl.FPairImpl
		 * @see rca.impl.RcaPackageImpl#getFPair()
		 * @generated
		 */
		EClass FPAIR = eINSTANCE.getFPair();

		/**
		 * The meta object literal for the '<em><b>FAttribute</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FPAIR__FATTRIBUTE = eINSTANCE.getFPair_FAttribute();

		/**
		 * The meta object literal for the '<em><b>FObject</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FPAIR__FOBJECT = eINSTANCE.getFPair_FObject();

		/**
		 * The meta object literal for the '{@link rca.impl.ObjectSetImpl <em>Object Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rca.impl.ObjectSetImpl
		 * @see rca.impl.RcaPackageImpl#getObjectSet()
		 * @generated
		 */
		EClass OBJECT_SET = eINSTANCE.getObjectSet();

		/**
		 * The meta object literal for the '<em><b>Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_SET__OBJECTS = eINSTANCE.getObjectSet_Objects();

		/**
		 * The meta object literal for the '{@link rca.impl.FRelationImpl <em>FRelation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rca.impl.FRelationImpl
		 * @see rca.impl.RcaPackageImpl#getFRelation()
		 * @generated
		 */
		EClass FRELATION = eINSTANCE.getFRelation();

		/**
		 * The meta object literal for the '<em><b>FPairs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRELATION__FPAIRS = eINSTANCE.getFRelation_FPairs();

		/**
		 * The meta object literal for the '{@link rca.impl.PairableElementImpl <em>Pairable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rca.impl.PairableElementImpl
		 * @see rca.impl.RcaPackageImpl#getPairableElement()
		 * @generated
		 */
		EClass PAIRABLE_ELEMENT = eINSTANCE.getPairableElement();

		/**
		 * The meta object literal for the '{@link rca.impl.SetImpl <em>Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rca.impl.SetImpl
		 * @see rca.impl.RcaPackageImpl#getSet()
		 * @generated
		 */
		EClass SET = eINSTANCE.getSet();

		/**
		 * The meta object literal for the '{@link rca.impl.ObjectImpl <em>Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rca.impl.ObjectImpl
		 * @see rca.impl.RcaPackageImpl#getObject()
		 * @generated
		 */
		EClass OBJECT = eINSTANCE.getObject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT__NAME = eINSTANCE.getObject_Name();

	}

} //RcaPackage
