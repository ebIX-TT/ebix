/**
 */
package org.ebix.umm.umm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.ebix.umm.umm.UmmFactory
 * @model kind="package"
 * @generated
 */
public interface UmmPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "umm";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.ebix.org/umm/Umm";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "umm";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  UmmPackage eINSTANCE = org.ebix.umm.umm.impl.UmmPackageImpl.init();

  /**
   * The meta object id for the '{@link org.ebix.umm.umm.impl.LibraryImpl <em>Library</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ebix.umm.umm.impl.LibraryImpl
   * @see org.ebix.umm.umm.impl.UmmPackageImpl#getLibrary()
   * @generated
   */
  int LIBRARY = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIBRARY__NAME = 0;

  /**
   * The number of structural features of the '<em>Library</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIBRARY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.ebix.umm.umm.impl.DocLibraryImpl <em>Doc Library</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ebix.umm.umm.impl.DocLibraryImpl
   * @see org.ebix.umm.umm.impl.UmmPackageImpl#getDocLibrary()
   * @generated
   */
  int DOC_LIBRARY = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOC_LIBRARY__NAME = LIBRARY__NAME;

  /**
   * The feature id for the '<em><b>Business Term</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOC_LIBRARY__BUSINESS_TERM = LIBRARY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Copyright</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOC_LIBRARY__COPYRIGHT = LIBRARY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Owner</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOC_LIBRARY__OWNER = LIBRARY_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Reference</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOC_LIBRARY__REFERENCE = LIBRARY_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Unique Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOC_LIBRARY__UNIQUE_IDENTIFIER = LIBRARY_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Version Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOC_LIBRARY__VERSION_IDENTIFIER = LIBRARY_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Base URN</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOC_LIBRARY__BASE_URN = LIBRARY_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Namespace Prefix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOC_LIBRARY__NAMESPACE_PREFIX = LIBRARY_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Bie Library</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOC_LIBRARY__BIE_LIBRARY = LIBRARY_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Bdt Library</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOC_LIBRARY__BDT_LIBRARY = LIBRARY_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Envelopes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOC_LIBRARY__ENVELOPES = LIBRARY_FEATURE_COUNT + 10;

  /**
   * The number of structural features of the '<em>Doc Library</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOC_LIBRARY_FEATURE_COUNT = LIBRARY_FEATURE_COUNT + 11;

  /**
   * The meta object id for the '{@link org.ebix.umm.umm.impl.InfEnvelopeImpl <em>Inf Envelope</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ebix.umm.umm.impl.InfEnvelopeImpl
   * @see org.ebix.umm.umm.impl.UmmPackageImpl#getInfEnvelope()
   * @generated
   */
  int INF_ENVELOPE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INF_ENVELOPE__NAME = 0;

  /**
   * The feature id for the '<em><b>Assemblies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INF_ENVELOPE__ASSEMBLIES = 1;

  /**
   * The number of structural features of the '<em>Inf Envelope</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INF_ENVELOPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.ebix.umm.umm.impl.ContextRefImpl <em>Context Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ebix.umm.umm.impl.ContextRefImpl
   * @see org.ebix.umm.umm.impl.UmmPackageImpl#getContextRef()
   * @generated
   */
  int CONTEXT_REF = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_REF__NAME = 0;

  /**
   * The number of structural features of the '<em>Context Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_REF_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.ebix.umm.umm.impl.MAImpl <em>MA</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ebix.umm.umm.impl.MAImpl
   * @see org.ebix.umm.umm.impl.UmmPackageImpl#getMA()
   * @generated
   */
  int MA = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MA__NAME = CONTEXT_REF__NAME;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MA__PROPERTIES = CONTEXT_REF_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MA__CONSTRAINTS = CONTEXT_REF_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>MA</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MA_FEATURE_COUNT = CONTEXT_REF_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.ebix.umm.umm.impl.OclRefImpl <em>Ocl Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ebix.umm.umm.impl.OclRefImpl
   * @see org.ebix.umm.umm.impl.UmmPackageImpl#getOclRef()
   * @generated
   */
  int OCL_REF = 46;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_REF__NAME = 0;

  /**
   * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_REF__MULTIPLICITY = 1;

  /**
   * The number of structural features of the '<em>Ocl Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_REF_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.ebix.umm.umm.impl.MAPropertyImpl <em>MA Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ebix.umm.umm.impl.MAPropertyImpl
   * @see org.ebix.umm.umm.impl.UmmPackageImpl#getMAProperty()
   * @generated
   */
  int MA_PROPERTY = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MA_PROPERTY__NAME = OCL_REF__NAME;

  /**
   * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MA_PROPERTY__MULTIPLICITY = OCL_REF__MULTIPLICITY;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MA_PROPERTY__TYPE = OCL_REF_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>MA Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MA_PROPERTY_FEATURE_COUNT = OCL_REF_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.ebix.umm.umm.impl.ASMAImpl <em>ASMA</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ebix.umm.umm.impl.ASMAImpl
   * @see org.ebix.umm.umm.impl.UmmPackageImpl#getASMA()
   * @generated
   */
  int ASMA = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASMA__NAME = MA_PROPERTY__NAME;

  /**
   * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASMA__MULTIPLICITY = MA_PROPERTY__MULTIPLICITY;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASMA__TYPE = MA_PROPERTY__TYPE;

  /**
   * The number of structural features of the '<em>ASMA</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASMA_FEATURE_COUNT = MA_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.ebix.umm.umm.impl.ASNONEImpl <em>ASNONE</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ebix.umm.umm.impl.ASNONEImpl
   * @see org.ebix.umm.umm.impl.UmmPackageImpl#getASNONE()
   * @generated
   */
  int ASNONE = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASNONE__NAME = MA_PROPERTY__NAME;

  /**
   * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASNONE__MULTIPLICITY = MA_PROPERTY__MULTIPLICITY;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASNONE__TYPE = MA_PROPERTY__TYPE;

  /**
   * The number of structural features of the '<em>ASNONE</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASNONE_FEATURE_COUNT = MA_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.ebix.umm.umm.impl.ConstraintImpl <em>Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ebix.umm.umm.impl.ConstraintImpl
   * @see org.ebix.umm.umm.impl.UmmPackageImpl#getConstraint()
   * @generated
   */
  int CONSTRAINT = 7;

  /**
   * The feature id for the '<em><b>Context</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__CONTEXT = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__TYPE = 1;

  /**
   * The feature id for the '<em><b>Invariants</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__INVARIANTS = 2;

  /**
   * The number of structural features of the '<em>Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.ebix.umm.umm.impl.TC_ConstraintImpl <em>TC Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ebix.umm.umm.impl.TC_ConstraintImpl
   * @see org.ebix.umm.umm.impl.UmmPackageImpl#getTC_Constraint()
   * @generated
   */
  int TC_CONSTRAINT = 9;

  /**
   * The feature id for the '<em><b>Kind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TC_CONSTRAINT__KIND = 0;

  /**
   * The feature id for the '<em><b>List Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TC_CONSTRAINT__LIST_IDENTIFIER = 1;

  /**
   * The feature id for the '<em><b>Responsible Agency</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TC_CONSTRAINT__RESPONSIBLE_AGENCY = 2;

  /**
   * The number of structural features of the '<em>TC Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TC_CONSTRAINT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.ebix.umm.umm.impl.BIELibraryImpl <em>BIE Library</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ebix.umm.umm.impl.BIELibraryImpl
   * @see org.ebix.umm.umm.impl.UmmPackageImpl#getBIELibrary()
   * @generated
   */
  int BIE_LIBRARY = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIE_LIBRARY__NAME = LIBRARY__NAME;

  /**
   * The feature id for the '<em><b>Business Term</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIE_LIBRARY__BUSINESS_TERM = LIBRARY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Copyright</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIE_LIBRARY__COPYRIGHT = LIBRARY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Owner</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIE_LIBRARY__OWNER = LIBRARY_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Reference</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIE_LIBRARY__REFERENCE = LIBRARY_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Unique Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIE_LIBRARY__UNIQUE_IDENTIFIER = LIBRARY_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Version Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIE_LIBRARY__VERSION_IDENTIFIER = LIBRARY_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Base URN</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIE_LIBRARY__BASE_URN = LIBRARY_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Namespace Prefix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIE_LIBRARY__NAMESPACE_PREFIX = LIBRARY_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Bdt Library</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIE_LIBRARY__BDT_LIBRARY = LIBRARY_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Abies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIE_LIBRARY__ABIES = LIBRARY_FEATURE_COUNT + 9;

  /**
   * The number of structural features of the '<em>BIE Library</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIE_LIBRARY_FEATURE_COUNT = LIBRARY_FEATURE_COUNT + 10;

  /**
   * The meta object id for the '{@link org.ebix.umm.umm.impl.ABIEImpl <em>ABIE</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ebix.umm.umm.impl.ABIEImpl
   * @see org.ebix.umm.umm.impl.UmmPackageImpl#getABIE()
   * @generated
   */
  int ABIE = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABIE__NAME = CONTEXT_REF__NAME;

  /**
   * The feature id for the '<em><b>Business Term</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABIE__BUSINESS_TERM = CONTEXT_REF_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Definition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABIE__DEFINITION = CONTEXT_REF_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Dictionary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABIE__DICTIONARY = CONTEXT_REF_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Unique Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABIE__UNIQUE_IDENTIFIER = CONTEXT_REF_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Version Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABIE__VERSION_IDENTIFIER = CONTEXT_REF_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABIE__PROPERTIES = CONTEXT_REF_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABIE__CONSTRAINTS = CONTEXT_REF_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>ABIE</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABIE_FEATURE_COUNT = CONTEXT_REF_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link org.ebix.umm.umm.impl.ABIEPropertyImpl <em>ABIE Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ebix.umm.umm.impl.ABIEPropertyImpl
   * @see org.ebix.umm.umm.impl.UmmPackageImpl#getABIEProperty()
   * @generated
   */
  int ABIE_PROPERTY = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABIE_PROPERTY__NAME = OCL_REF__NAME;

  /**
   * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABIE_PROPERTY__MULTIPLICITY = OCL_REF__MULTIPLICITY;

  /**
   * The feature id for the '<em><b>Or</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABIE_PROPERTY__OR = OCL_REF_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Business Term</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABIE_PROPERTY__BUSINESS_TERM = OCL_REF_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Definition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABIE_PROPERTY__DEFINITION = OCL_REF_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Dictionary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABIE_PROPERTY__DICTIONARY = OCL_REF_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Unique Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABIE_PROPERTY__UNIQUE_IDENTIFIER = OCL_REF_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Version Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABIE_PROPERTY__VERSION_IDENTIFIER = OCL_REF_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Sequencing Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABIE_PROPERTY__SEQUENCING_KEY = OCL_REF_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>ABIE Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABIE_PROPERTY_FEATURE_COUNT = OCL_REF_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link org.ebix.umm.umm.impl.ASBIEImpl <em>ASBIE</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ebix.umm.umm.impl.ASBIEImpl
   * @see org.ebix.umm.umm.impl.UmmPackageImpl#getASBIE()
   * @generated
   */
  int ASBIE = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASBIE__NAME = ABIE_PROPERTY__NAME;

  /**
   * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASBIE__MULTIPLICITY = ABIE_PROPERTY__MULTIPLICITY;

  /**
   * The feature id for the '<em><b>Or</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASBIE__OR = ABIE_PROPERTY__OR;

  /**
   * The feature id for the '<em><b>Business Term</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASBIE__BUSINESS_TERM = ABIE_PROPERTY__BUSINESS_TERM;

  /**
   * The feature id for the '<em><b>Definition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASBIE__DEFINITION = ABIE_PROPERTY__DEFINITION;

  /**
   * The feature id for the '<em><b>Dictionary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASBIE__DICTIONARY = ABIE_PROPERTY__DICTIONARY;

  /**
   * The feature id for the '<em><b>Unique Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASBIE__UNIQUE_IDENTIFIER = ABIE_PROPERTY__UNIQUE_IDENTIFIER;

  /**
   * The feature id for the '<em><b>Version Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASBIE__VERSION_IDENTIFIER = ABIE_PROPERTY__VERSION_IDENTIFIER;

  /**
   * The feature id for the '<em><b>Sequencing Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASBIE__SEQUENCING_KEY = ABIE_PROPERTY__SEQUENCING_KEY;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASBIE__TYPE = ABIE_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>ASBIE</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASBIE_FEATURE_COUNT = ABIE_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.ebix.umm.umm.impl.BBIEImpl <em>BBIE</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ebix.umm.umm.impl.BBIEImpl
   * @see org.ebix.umm.umm.impl.UmmPackageImpl#getBBIE()
   * @generated
   */
  int BBIE = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BBIE__NAME = ABIE_PROPERTY__NAME;

  /**
   * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BBIE__MULTIPLICITY = ABIE_PROPERTY__MULTIPLICITY;

  /**
   * The feature id for the '<em><b>Or</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BBIE__OR = ABIE_PROPERTY__OR;

  /**
   * The feature id for the '<em><b>Business Term</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BBIE__BUSINESS_TERM = ABIE_PROPERTY__BUSINESS_TERM;

  /**
   * The feature id for the '<em><b>Definition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BBIE__DEFINITION = ABIE_PROPERTY__DEFINITION;

  /**
   * The feature id for the '<em><b>Dictionary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BBIE__DICTIONARY = ABIE_PROPERTY__DICTIONARY;

  /**
   * The feature id for the '<em><b>Unique Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BBIE__UNIQUE_IDENTIFIER = ABIE_PROPERTY__UNIQUE_IDENTIFIER;

  /**
   * The feature id for the '<em><b>Version Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BBIE__VERSION_IDENTIFIER = ABIE_PROPERTY__VERSION_IDENTIFIER;

  /**
   * The feature id for the '<em><b>Sequencing Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BBIE__SEQUENCING_KEY = ABIE_PROPERTY__SEQUENCING_KEY;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BBIE__TYPE = ABIE_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Restriction</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BBIE__RESTRICTION = ABIE_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Fixed Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BBIE__FIXED_VALUE = ABIE_PROPERTY_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>BBIE</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BBIE_FEATURE_COUNT = ABIE_PROPERTY_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.ebix.umm.umm.impl.BDTLibraryImpl <em>BDT Library</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ebix.umm.umm.impl.BDTLibraryImpl
   * @see org.ebix.umm.umm.impl.UmmPackageImpl#getBDTLibrary()
   * @generated
   */
  int BDT_LIBRARY = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BDT_LIBRARY__NAME = LIBRARY__NAME;

  /**
   * The feature id for the '<em><b>Business Term</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BDT_LIBRARY__BUSINESS_TERM = LIBRARY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Copyright</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BDT_LIBRARY__COPYRIGHT = LIBRARY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Owner</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BDT_LIBRARY__OWNER = LIBRARY_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Reference</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BDT_LIBRARY__REFERENCE = LIBRARY_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Unique Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BDT_LIBRARY__UNIQUE_IDENTIFIER = LIBRARY_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Version Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BDT_LIBRARY__VERSION_IDENTIFIER = LIBRARY_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Base URN</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BDT_LIBRARY__BASE_URN = LIBRARY_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Namespace Prefix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BDT_LIBRARY__NAMESPACE_PREFIX = LIBRARY_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Bdts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BDT_LIBRARY__BDTS = LIBRARY_FEATURE_COUNT + 8;

  /**
   * The number of structural features of the '<em>BDT Library</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BDT_LIBRARY_FEATURE_COUNT = LIBRARY_FEATURE_COUNT + 9;

  /**
   * The meta object id for the '{@link org.ebix.umm.umm.impl.BDTImpl <em>BDT</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ebix.umm.umm.impl.BDTImpl
   * @see org.ebix.umm.umm.impl.UmmPackageImpl#getBDT()
   * @generated
   */
  int BDT = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BDT__NAME = CONTEXT_REF__NAME;

  /**
   * The feature id for the '<em><b>Business Term</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BDT__BUSINESS_TERM = CONTEXT_REF_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Definition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BDT__DEFINITION = CONTEXT_REF_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Dictionary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BDT__DICTIONARY = CONTEXT_REF_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Unique Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BDT__UNIQUE_IDENTIFIER = CONTEXT_REF_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Version Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BDT__VERSION_IDENTIFIER = CONTEXT_REF_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BDT__PROPERTIES = CONTEXT_REF_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>BDT</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BDT_FEATURE_COUNT = CONTEXT_REF_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link org.ebix.umm.umm.impl.BDTPropertyImpl <em>BDT Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ebix.umm.umm.impl.BDTPropertyImpl
   * @see org.ebix.umm.umm.impl.UmmPackageImpl#getBDTProperty()
   * @generated
   */
  int BDT_PROPERTY = 17;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BDT_PROPERTY__NAME = OCL_REF__NAME;

  /**
   * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BDT_PROPERTY__MULTIPLICITY = OCL_REF__MULTIPLICITY;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BDT_PROPERTY__TYPE = OCL_REF_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BDT_PROPERTY__PATTERN = OCL_REF_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Min Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BDT_PROPERTY__MIN_LENGTH = OCL_REF_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Max Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BDT_PROPERTY__MAX_LENGTH = OCL_REF_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BDT_PROPERTY__LENGTH = OCL_REF_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Business Term</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BDT_PROPERTY__BUSINESS_TERM = OCL_REF_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Definition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BDT_PROPERTY__DEFINITION = OCL_REF_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Dictionary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BDT_PROPERTY__DICTIONARY = OCL_REF_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Unique Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BDT_PROPERTY__UNIQUE_IDENTIFIER = OCL_REF_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Version Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BDT_PROPERTY__VERSION_IDENTIFIER = OCL_REF_FEATURE_COUNT + 9;

  /**
   * The number of structural features of the '<em>BDT Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BDT_PROPERTY_FEATURE_COUNT = OCL_REF_FEATURE_COUNT + 10;

  /**
   * The meta object id for the '{@link org.ebix.umm.umm.impl.ContentImpl <em>Content</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ebix.umm.umm.impl.ContentImpl
   * @see org.ebix.umm.umm.impl.UmmPackageImpl#getContent()
   * @generated
   */
  int CONTENT = 18;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT__NAME = BDT_PROPERTY__NAME;

  /**
   * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT__MULTIPLICITY = BDT_PROPERTY__MULTIPLICITY;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT__TYPE = BDT_PROPERTY__TYPE;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT__PATTERN = BDT_PROPERTY__PATTERN;

  /**
   * The feature id for the '<em><b>Min Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT__MIN_LENGTH = BDT_PROPERTY__MIN_LENGTH;

  /**
   * The feature id for the '<em><b>Max Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT__MAX_LENGTH = BDT_PROPERTY__MAX_LENGTH;

  /**
   * The feature id for the '<em><b>Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT__LENGTH = BDT_PROPERTY__LENGTH;

  /**
   * The feature id for the '<em><b>Business Term</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT__BUSINESS_TERM = BDT_PROPERTY__BUSINESS_TERM;

  /**
   * The feature id for the '<em><b>Definition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT__DEFINITION = BDT_PROPERTY__DEFINITION;

  /**
   * The feature id for the '<em><b>Dictionary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT__DICTIONARY = BDT_PROPERTY__DICTIONARY;

  /**
   * The feature id for the '<em><b>Unique Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT__UNIQUE_IDENTIFIER = BDT_PROPERTY__UNIQUE_IDENTIFIER;

  /**
   * The feature id for the '<em><b>Version Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT__VERSION_IDENTIFIER = BDT_PROPERTY__VERSION_IDENTIFIER;

  /**
   * The number of structural features of the '<em>Content</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_FEATURE_COUNT = BDT_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.ebix.umm.umm.impl.SupplementImpl <em>Supplement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ebix.umm.umm.impl.SupplementImpl
   * @see org.ebix.umm.umm.impl.UmmPackageImpl#getSupplement()
   * @generated
   */
  int SUPPLEMENT = 19;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPPLEMENT__NAME = BDT_PROPERTY__NAME;

  /**
   * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPPLEMENT__MULTIPLICITY = BDT_PROPERTY__MULTIPLICITY;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPPLEMENT__TYPE = BDT_PROPERTY__TYPE;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPPLEMENT__PATTERN = BDT_PROPERTY__PATTERN;

  /**
   * The feature id for the '<em><b>Min Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPPLEMENT__MIN_LENGTH = BDT_PROPERTY__MIN_LENGTH;

  /**
   * The feature id for the '<em><b>Max Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPPLEMENT__MAX_LENGTH = BDT_PROPERTY__MAX_LENGTH;

  /**
   * The feature id for the '<em><b>Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPPLEMENT__LENGTH = BDT_PROPERTY__LENGTH;

  /**
   * The feature id for the '<em><b>Business Term</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPPLEMENT__BUSINESS_TERM = BDT_PROPERTY__BUSINESS_TERM;

  /**
   * The feature id for the '<em><b>Definition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPPLEMENT__DEFINITION = BDT_PROPERTY__DEFINITION;

  /**
   * The feature id for the '<em><b>Dictionary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPPLEMENT__DICTIONARY = BDT_PROPERTY__DICTIONARY;

  /**
   * The feature id for the '<em><b>Unique Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPPLEMENT__UNIQUE_IDENTIFIER = BDT_PROPERTY__UNIQUE_IDENTIFIER;

  /**
   * The feature id for the '<em><b>Version Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPPLEMENT__VERSION_IDENTIFIER = BDT_PROPERTY__VERSION_IDENTIFIER;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPPLEMENT__DEFAULT_VALUE = BDT_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Restriction</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPPLEMENT__RESTRICTION = BDT_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Fixed Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPPLEMENT__FIXED_VALUE = BDT_PROPERTY_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Supplement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPPLEMENT_FEATURE_COUNT = BDT_PROPERTY_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.ebix.umm.umm.impl.ENUMLibraryImpl <em>ENUM Library</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ebix.umm.umm.impl.ENUMLibraryImpl
   * @see org.ebix.umm.umm.impl.UmmPackageImpl#getENUMLibrary()
   * @generated
   */
  int ENUM_LIBRARY = 20;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_LIBRARY__NAME = LIBRARY__NAME;

  /**
   * The feature id for the '<em><b>Business Term</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_LIBRARY__BUSINESS_TERM = LIBRARY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Copyright</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_LIBRARY__COPYRIGHT = LIBRARY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Owner</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_LIBRARY__OWNER = LIBRARY_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Reference</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_LIBRARY__REFERENCE = LIBRARY_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Unique Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_LIBRARY__UNIQUE_IDENTIFIER = LIBRARY_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Version Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_LIBRARY__VERSION_IDENTIFIER = LIBRARY_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Base URN</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_LIBRARY__BASE_URN = LIBRARY_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Namespace Prefix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_LIBRARY__NAMESPACE_PREFIX = LIBRARY_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Enums</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_LIBRARY__ENUMS = LIBRARY_FEATURE_COUNT + 8;

  /**
   * The number of structural features of the '<em>ENUM Library</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_LIBRARY_FEATURE_COUNT = LIBRARY_FEATURE_COUNT + 9;

  /**
   * The meta object id for the '{@link org.ebix.umm.umm.impl.ENUMImpl <em>ENUM</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ebix.umm.umm.impl.ENUMImpl
   * @see org.ebix.umm.umm.impl.UmmPackageImpl#getENUM()
   * @generated
   */
  int ENUM = 21;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM__NAME = 0;

  /**
   * The feature id for the '<em><b>Business Term</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM__BUSINESS_TERM = 1;

  /**
   * The feature id for the '<em><b>Definition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM__DEFINITION = 2;

  /**
   * The feature id for the '<em><b>Code List Agency Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM__CODE_LIST_AGENCY_IDENTIFIER = 3;

  /**
   * The feature id for the '<em><b>Code List Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM__CODE_LIST_NAME = 4;

  /**
   * The feature id for the '<em><b>Code List Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM__CODE_LIST_IDENTIFIER = 5;

  /**
   * The feature id for the '<em><b>Dictionary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM__DICTIONARY = 6;

  /**
   * The feature id for the '<em><b>Unique Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM__UNIQUE_IDENTIFIER = 7;

  /**
   * The feature id for the '<em><b>Version Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM__VERSION_IDENTIFIER = 8;

  /**
   * The number of structural features of the '<em>ENUM</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_FEATURE_COUNT = 9;

  /**
   * The meta object id for the '{@link org.ebix.umm.umm.impl.AssembledBaseImpl <em>Assembled Base</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ebix.umm.umm.impl.AssembledBaseImpl
   * @see org.ebix.umm.umm.impl.UmmPackageImpl#getAssembledBase()
   * @generated
   */
  int ASSEMBLED_BASE = 22;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSEMBLED_BASE__NAME = ENUM__NAME;

  /**
   * The feature id for the '<em><b>Business Term</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSEMBLED_BASE__BUSINESS_TERM = ENUM__BUSINESS_TERM;

  /**
   * The feature id for the '<em><b>Definition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSEMBLED_BASE__DEFINITION = ENUM__DEFINITION;

  /**
   * The feature id for the '<em><b>Code List Agency Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSEMBLED_BASE__CODE_LIST_AGENCY_IDENTIFIER = ENUM__CODE_LIST_AGENCY_IDENTIFIER;

  /**
   * The feature id for the '<em><b>Code List Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSEMBLED_BASE__CODE_LIST_NAME = ENUM__CODE_LIST_NAME;

  /**
   * The feature id for the '<em><b>Code List Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSEMBLED_BASE__CODE_LIST_IDENTIFIER = ENUM__CODE_LIST_IDENTIFIER;

  /**
   * The feature id for the '<em><b>Dictionary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSEMBLED_BASE__DICTIONARY = ENUM__DICTIONARY;

  /**
   * The feature id for the '<em><b>Unique Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSEMBLED_BASE__UNIQUE_IDENTIFIER = ENUM__UNIQUE_IDENTIFIER;

  /**
   * The feature id for the '<em><b>Version Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSEMBLED_BASE__VERSION_IDENTIFIER = ENUM__VERSION_IDENTIFIER;

  /**
   * The number of structural features of the '<em>Assembled Base</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSEMBLED_BASE_FEATURE_COUNT = ENUM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.ebix.umm.umm.impl.PrimitiveImpl <em>Primitive</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ebix.umm.umm.impl.PrimitiveImpl
   * @see org.ebix.umm.umm.impl.UmmPackageImpl#getPrimitive()
   * @generated
   */
  int PRIMITIVE = 23;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE__NAME = ASSEMBLED_BASE__NAME;

  /**
   * The feature id for the '<em><b>Business Term</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE__BUSINESS_TERM = ASSEMBLED_BASE__BUSINESS_TERM;

  /**
   * The feature id for the '<em><b>Definition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE__DEFINITION = ASSEMBLED_BASE__DEFINITION;

  /**
   * The feature id for the '<em><b>Code List Agency Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE__CODE_LIST_AGENCY_IDENTIFIER = ASSEMBLED_BASE__CODE_LIST_AGENCY_IDENTIFIER;

  /**
   * The feature id for the '<em><b>Code List Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE__CODE_LIST_NAME = ASSEMBLED_BASE__CODE_LIST_NAME;

  /**
   * The feature id for the '<em><b>Code List Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE__CODE_LIST_IDENTIFIER = ASSEMBLED_BASE__CODE_LIST_IDENTIFIER;

  /**
   * The feature id for the '<em><b>Dictionary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE__DICTIONARY = ASSEMBLED_BASE__DICTIONARY;

  /**
   * The feature id for the '<em><b>Unique Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE__UNIQUE_IDENTIFIER = ASSEMBLED_BASE__UNIQUE_IDENTIFIER;

  /**
   * The feature id for the '<em><b>Version Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE__VERSION_IDENTIFIER = ASSEMBLED_BASE__VERSION_IDENTIFIER;

  /**
   * The number of structural features of the '<em>Primitive</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_FEATURE_COUNT = ASSEMBLED_BASE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.ebix.umm.umm.impl.AssembledImpl <em>Assembled</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ebix.umm.umm.impl.AssembledImpl
   * @see org.ebix.umm.umm.impl.UmmPackageImpl#getAssembled()
   * @generated
   */
  int ASSEMBLED = 24;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSEMBLED__NAME = ASSEMBLED_BASE__NAME;

  /**
   * The feature id for the '<em><b>Business Term</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSEMBLED__BUSINESS_TERM = ASSEMBLED_BASE__BUSINESS_TERM;

  /**
   * The feature id for the '<em><b>Definition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSEMBLED__DEFINITION = ASSEMBLED_BASE__DEFINITION;

  /**
   * The feature id for the '<em><b>Code List Agency Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSEMBLED__CODE_LIST_AGENCY_IDENTIFIER = ASSEMBLED_BASE__CODE_LIST_AGENCY_IDENTIFIER;

  /**
   * The feature id for the '<em><b>Code List Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSEMBLED__CODE_LIST_NAME = ASSEMBLED_BASE__CODE_LIST_NAME;

  /**
   * The feature id for the '<em><b>Code List Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSEMBLED__CODE_LIST_IDENTIFIER = ASSEMBLED_BASE__CODE_LIST_IDENTIFIER;

  /**
   * The feature id for the '<em><b>Dictionary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSEMBLED__DICTIONARY = ASSEMBLED_BASE__DICTIONARY;

  /**
   * The feature id for the '<em><b>Unique Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSEMBLED__UNIQUE_IDENTIFIER = ASSEMBLED_BASE__UNIQUE_IDENTIFIER;

  /**
   * The feature id for the '<em><b>Version Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSEMBLED__VERSION_IDENTIFIER = ASSEMBLED_BASE__VERSION_IDENTIFIER;

  /**
   * The feature id for the '<em><b>Originals</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSEMBLED__ORIGINALS = ASSEMBLED_BASE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Subsets</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSEMBLED__SUBSETS = ASSEMBLED_BASE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Assembled</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSEMBLED_FEATURE_COUNT = ASSEMBLED_BASE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.ebix.umm.umm.impl.OriginalImpl <em>Original</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ebix.umm.umm.impl.OriginalImpl
   * @see org.ebix.umm.umm.impl.UmmPackageImpl#getOriginal()
   * @generated
   */
  int ORIGINAL = 25;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORIGINAL__NAME = ENUM__NAME;

  /**
   * The feature id for the '<em><b>Business Term</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORIGINAL__BUSINESS_TERM = ENUM__BUSINESS_TERM;

  /**
   * The feature id for the '<em><b>Definition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORIGINAL__DEFINITION = ENUM__DEFINITION;

  /**
   * The feature id for the '<em><b>Code List Agency Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORIGINAL__CODE_LIST_AGENCY_IDENTIFIER = ENUM__CODE_LIST_AGENCY_IDENTIFIER;

  /**
   * The feature id for the '<em><b>Code List Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORIGINAL__CODE_LIST_NAME = ENUM__CODE_LIST_NAME;

  /**
   * The feature id for the '<em><b>Code List Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORIGINAL__CODE_LIST_IDENTIFIER = ENUM__CODE_LIST_IDENTIFIER;

  /**
   * The feature id for the '<em><b>Dictionary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORIGINAL__DICTIONARY = ENUM__DICTIONARY;

  /**
   * The feature id for the '<em><b>Unique Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORIGINAL__UNIQUE_IDENTIFIER = ENUM__UNIQUE_IDENTIFIER;

  /**
   * The feature id for the '<em><b>Version Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORIGINAL__VERSION_IDENTIFIER = ENUM__VERSION_IDENTIFIER;

  /**
   * The feature id for the '<em><b>Codes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORIGINAL__CODES = ENUM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Original</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORIGINAL_FEATURE_COUNT = ENUM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.ebix.umm.umm.impl.SubsetImpl <em>Subset</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ebix.umm.umm.impl.SubsetImpl
   * @see org.ebix.umm.umm.impl.UmmPackageImpl#getSubset()
   * @generated
   */
  int SUBSET = 26;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSET__NAME = ENUM__NAME;

  /**
   * The feature id for the '<em><b>Business Term</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSET__BUSINESS_TERM = ENUM__BUSINESS_TERM;

  /**
   * The feature id for the '<em><b>Definition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSET__DEFINITION = ENUM__DEFINITION;

  /**
   * The feature id for the '<em><b>Code List Agency Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSET__CODE_LIST_AGENCY_IDENTIFIER = ENUM__CODE_LIST_AGENCY_IDENTIFIER;

  /**
   * The feature id for the '<em><b>Code List Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSET__CODE_LIST_NAME = ENUM__CODE_LIST_NAME;

  /**
   * The feature id for the '<em><b>Code List Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSET__CODE_LIST_IDENTIFIER = ENUM__CODE_LIST_IDENTIFIER;

  /**
   * The feature id for the '<em><b>Dictionary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSET__DICTIONARY = ENUM__DICTIONARY;

  /**
   * The feature id for the '<em><b>Unique Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSET__UNIQUE_IDENTIFIER = ENUM__UNIQUE_IDENTIFIER;

  /**
   * The feature id for the '<em><b>Version Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSET__VERSION_IDENTIFIER = ENUM__VERSION_IDENTIFIER;

  /**
   * The feature id for the '<em><b>Codes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSET__CODES = ENUM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Subset</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSET_FEATURE_COUNT = ENUM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.ebix.umm.umm.impl.CodelistEntryImpl <em>Codelist Entry</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ebix.umm.umm.impl.CodelistEntryImpl
   * @see org.ebix.umm.umm.impl.UmmPackageImpl#getCodelistEntry()
   * @generated
   */
  int CODELIST_ENTRY = 27;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODELIST_ENTRY__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODELIST_ENTRY__DESCRIPTION = 1;

  /**
   * The number of structural features of the '<em>Codelist Entry</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODELIST_ENTRY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.ebix.umm.umm.impl.CCLibraryImpl <em>CC Library</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ebix.umm.umm.impl.CCLibraryImpl
   * @see org.ebix.umm.umm.impl.UmmPackageImpl#getCCLibrary()
   * @generated
   */
  int CC_LIBRARY = 28;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CC_LIBRARY__NAME = LIBRARY__NAME;

  /**
   * The feature id for the '<em><b>Business Term</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CC_LIBRARY__BUSINESS_TERM = LIBRARY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Copyright</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CC_LIBRARY__COPYRIGHT = LIBRARY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Owner</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CC_LIBRARY__OWNER = LIBRARY_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Reference</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CC_LIBRARY__REFERENCE = LIBRARY_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Unique Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CC_LIBRARY__UNIQUE_IDENTIFIER = LIBRARY_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Version Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CC_LIBRARY__VERSION_IDENTIFIER = LIBRARY_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Base URN</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CC_LIBRARY__BASE_URN = LIBRARY_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Namespace Prefix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CC_LIBRARY__NAMESPACE_PREFIX = LIBRARY_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Accs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CC_LIBRARY__ACCS = LIBRARY_FEATURE_COUNT + 8;

  /**
   * The number of structural features of the '<em>CC Library</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CC_LIBRARY_FEATURE_COUNT = LIBRARY_FEATURE_COUNT + 9;

  /**
   * The meta object id for the '{@link org.ebix.umm.umm.impl.ACCImpl <em>ACC</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ebix.umm.umm.impl.ACCImpl
   * @see org.ebix.umm.umm.impl.UmmPackageImpl#getACC()
   * @generated
   */
  int ACC = 29;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACC__NAME = 0;

  /**
   * The feature id for the '<em><b>Business Term</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACC__BUSINESS_TERM = 1;

  /**
   * The feature id for the '<em><b>Definition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACC__DEFINITION = 2;

  /**
   * The feature id for the '<em><b>Dictionary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACC__DICTIONARY = 3;

  /**
   * The feature id for the '<em><b>Unique Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACC__UNIQUE_IDENTIFIER = 4;

  /**
   * The feature id for the '<em><b>Version Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACC__VERSION_IDENTIFIER = 5;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACC__PROPERTIES = 6;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACC__CONSTRAINTS = 7;

  /**
   * The number of structural features of the '<em>ACC</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACC_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link org.ebix.umm.umm.impl.ACCPropertyImpl <em>ACC Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ebix.umm.umm.impl.ACCPropertyImpl
   * @see org.ebix.umm.umm.impl.UmmPackageImpl#getACCProperty()
   * @generated
   */
  int ACC_PROPERTY = 30;

  /**
   * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACC_PROPERTY__MULTIPLICITY = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACC_PROPERTY__NAME = 1;

  /**
   * The feature id for the '<em><b>Business Term</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACC_PROPERTY__BUSINESS_TERM = 2;

  /**
   * The feature id for the '<em><b>Definition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACC_PROPERTY__DEFINITION = 3;

  /**
   * The feature id for the '<em><b>Dictionary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACC_PROPERTY__DICTIONARY = 4;

  /**
   * The feature id for the '<em><b>Unique Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACC_PROPERTY__UNIQUE_IDENTIFIER = 5;

  /**
   * The feature id for the '<em><b>Version Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACC_PROPERTY__VERSION_IDENTIFIER = 6;

  /**
   * The feature id for the '<em><b>Sequencing Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACC_PROPERTY__SEQUENCING_KEY = 7;

  /**
   * The number of structural features of the '<em>ACC Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACC_PROPERTY_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link org.ebix.umm.umm.impl.ASCCImpl <em>ASCC</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ebix.umm.umm.impl.ASCCImpl
   * @see org.ebix.umm.umm.impl.UmmPackageImpl#getASCC()
   * @generated
   */
  int ASCC = 31;

  /**
   * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASCC__MULTIPLICITY = ACC_PROPERTY__MULTIPLICITY;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASCC__NAME = ACC_PROPERTY__NAME;

  /**
   * The feature id for the '<em><b>Business Term</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASCC__BUSINESS_TERM = ACC_PROPERTY__BUSINESS_TERM;

  /**
   * The feature id for the '<em><b>Definition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASCC__DEFINITION = ACC_PROPERTY__DEFINITION;

  /**
   * The feature id for the '<em><b>Dictionary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASCC__DICTIONARY = ACC_PROPERTY__DICTIONARY;

  /**
   * The feature id for the '<em><b>Unique Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASCC__UNIQUE_IDENTIFIER = ACC_PROPERTY__UNIQUE_IDENTIFIER;

  /**
   * The feature id for the '<em><b>Version Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASCC__VERSION_IDENTIFIER = ACC_PROPERTY__VERSION_IDENTIFIER;

  /**
   * The feature id for the '<em><b>Sequencing Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASCC__SEQUENCING_KEY = ACC_PROPERTY__SEQUENCING_KEY;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASCC__TYPE = ACC_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>ASCC</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASCC_FEATURE_COUNT = ACC_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.ebix.umm.umm.impl.BCCImpl <em>BCC</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ebix.umm.umm.impl.BCCImpl
   * @see org.ebix.umm.umm.impl.UmmPackageImpl#getBCC()
   * @generated
   */
  int BCC = 32;

  /**
   * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BCC__MULTIPLICITY = ACC_PROPERTY__MULTIPLICITY;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BCC__NAME = ACC_PROPERTY__NAME;

  /**
   * The feature id for the '<em><b>Business Term</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BCC__BUSINESS_TERM = ACC_PROPERTY__BUSINESS_TERM;

  /**
   * The feature id for the '<em><b>Definition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BCC__DEFINITION = ACC_PROPERTY__DEFINITION;

  /**
   * The feature id for the '<em><b>Dictionary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BCC__DICTIONARY = ACC_PROPERTY__DICTIONARY;

  /**
   * The feature id for the '<em><b>Unique Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BCC__UNIQUE_IDENTIFIER = ACC_PROPERTY__UNIQUE_IDENTIFIER;

  /**
   * The feature id for the '<em><b>Version Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BCC__VERSION_IDENTIFIER = ACC_PROPERTY__VERSION_IDENTIFIER;

  /**
   * The feature id for the '<em><b>Sequencing Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BCC__SEQUENCING_KEY = ACC_PROPERTY__SEQUENCING_KEY;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BCC__TYPE = ACC_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Restriction</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BCC__RESTRICTION = ACC_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Fixed Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BCC__FIXED_VALUE = ACC_PROPERTY_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>BCC</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BCC_FEATURE_COUNT = ACC_PROPERTY_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.ebix.umm.umm.impl.CDTLibraryImpl <em>CDT Library</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ebix.umm.umm.impl.CDTLibraryImpl
   * @see org.ebix.umm.umm.impl.UmmPackageImpl#getCDTLibrary()
   * @generated
   */
  int CDT_LIBRARY = 33;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CDT_LIBRARY__NAME = LIBRARY__NAME;

  /**
   * The feature id for the '<em><b>Business Term</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CDT_LIBRARY__BUSINESS_TERM = LIBRARY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Copyright</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CDT_LIBRARY__COPYRIGHT = LIBRARY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Owner</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CDT_LIBRARY__OWNER = LIBRARY_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Reference</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CDT_LIBRARY__REFERENCE = LIBRARY_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Unique Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CDT_LIBRARY__UNIQUE_IDENTIFIER = LIBRARY_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Version Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CDT_LIBRARY__VERSION_IDENTIFIER = LIBRARY_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Base URN</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CDT_LIBRARY__BASE_URN = LIBRARY_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Namespace Prefix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CDT_LIBRARY__NAMESPACE_PREFIX = LIBRARY_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Cdts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CDT_LIBRARY__CDTS = LIBRARY_FEATURE_COUNT + 8;

  /**
   * The number of structural features of the '<em>CDT Library</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CDT_LIBRARY_FEATURE_COUNT = LIBRARY_FEATURE_COUNT + 9;

  /**
   * The meta object id for the '{@link org.ebix.umm.umm.impl.CDTImpl <em>CDT</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ebix.umm.umm.impl.CDTImpl
   * @see org.ebix.umm.umm.impl.UmmPackageImpl#getCDT()
   * @generated
   */
  int CDT = 34;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CDT__NAME = 0;

  /**
   * The feature id for the '<em><b>Business Term</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CDT__BUSINESS_TERM = 1;

  /**
   * The feature id for the '<em><b>Definition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CDT__DEFINITION = 2;

  /**
   * The feature id for the '<em><b>Dictionary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CDT__DICTIONARY = 3;

  /**
   * The feature id for the '<em><b>Unique Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CDT__UNIQUE_IDENTIFIER = 4;

  /**
   * The feature id for the '<em><b>Version Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CDT__VERSION_IDENTIFIER = 5;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CDT__PROPERTIES = 6;

  /**
   * The number of structural features of the '<em>CDT</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CDT_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link org.ebix.umm.umm.impl.CDTPropertyImpl <em>CDT Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ebix.umm.umm.impl.CDTPropertyImpl
   * @see org.ebix.umm.umm.impl.UmmPackageImpl#getCDTProperty()
   * @generated
   */
  int CDT_PROPERTY = 35;

  /**
   * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CDT_PROPERTY__MULTIPLICITY = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CDT_PROPERTY__NAME = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CDT_PROPERTY__TYPE = 2;

  /**
   * The feature id for the '<em><b>Business Term</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CDT_PROPERTY__BUSINESS_TERM = 3;

  /**
   * The feature id for the '<em><b>Definition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CDT_PROPERTY__DEFINITION = 4;

  /**
   * The feature id for the '<em><b>Dictionary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CDT_PROPERTY__DICTIONARY = 5;

  /**
   * The feature id for the '<em><b>Unique Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CDT_PROPERTY__UNIQUE_IDENTIFIER = 6;

  /**
   * The feature id for the '<em><b>Version Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CDT_PROPERTY__VERSION_IDENTIFIER = 7;

  /**
   * The number of structural features of the '<em>CDT Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CDT_PROPERTY_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link org.ebix.umm.umm.impl.CDT_ContentImpl <em>CDT Content</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ebix.umm.umm.impl.CDT_ContentImpl
   * @see org.ebix.umm.umm.impl.UmmPackageImpl#getCDT_Content()
   * @generated
   */
  int CDT_CONTENT = 36;

  /**
   * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CDT_CONTENT__MULTIPLICITY = CDT_PROPERTY__MULTIPLICITY;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CDT_CONTENT__NAME = CDT_PROPERTY__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CDT_CONTENT__TYPE = CDT_PROPERTY__TYPE;

  /**
   * The feature id for the '<em><b>Business Term</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CDT_CONTENT__BUSINESS_TERM = CDT_PROPERTY__BUSINESS_TERM;

  /**
   * The feature id for the '<em><b>Definition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CDT_CONTENT__DEFINITION = CDT_PROPERTY__DEFINITION;

  /**
   * The feature id for the '<em><b>Dictionary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CDT_CONTENT__DICTIONARY = CDT_PROPERTY__DICTIONARY;

  /**
   * The feature id for the '<em><b>Unique Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CDT_CONTENT__UNIQUE_IDENTIFIER = CDT_PROPERTY__UNIQUE_IDENTIFIER;

  /**
   * The feature id for the '<em><b>Version Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CDT_CONTENT__VERSION_IDENTIFIER = CDT_PROPERTY__VERSION_IDENTIFIER;

  /**
   * The number of structural features of the '<em>CDT Content</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CDT_CONTENT_FEATURE_COUNT = CDT_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.ebix.umm.umm.impl.CDT_SupplementImpl <em>CDT Supplement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ebix.umm.umm.impl.CDT_SupplementImpl
   * @see org.ebix.umm.umm.impl.UmmPackageImpl#getCDT_Supplement()
   * @generated
   */
  int CDT_SUPPLEMENT = 37;

  /**
   * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CDT_SUPPLEMENT__MULTIPLICITY = CDT_PROPERTY__MULTIPLICITY;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CDT_SUPPLEMENT__NAME = CDT_PROPERTY__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CDT_SUPPLEMENT__TYPE = CDT_PROPERTY__TYPE;

  /**
   * The feature id for the '<em><b>Business Term</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CDT_SUPPLEMENT__BUSINESS_TERM = CDT_PROPERTY__BUSINESS_TERM;

  /**
   * The feature id for the '<em><b>Definition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CDT_SUPPLEMENT__DEFINITION = CDT_PROPERTY__DEFINITION;

  /**
   * The feature id for the '<em><b>Dictionary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CDT_SUPPLEMENT__DICTIONARY = CDT_PROPERTY__DICTIONARY;

  /**
   * The feature id for the '<em><b>Unique Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CDT_SUPPLEMENT__UNIQUE_IDENTIFIER = CDT_PROPERTY__UNIQUE_IDENTIFIER;

  /**
   * The feature id for the '<em><b>Version Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CDT_SUPPLEMENT__VERSION_IDENTIFIER = CDT_PROPERTY__VERSION_IDENTIFIER;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CDT_SUPPLEMENT__DEFAULT_VALUE = CDT_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Restriction</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CDT_SUPPLEMENT__RESTRICTION = CDT_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Fixed Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CDT_SUPPLEMENT__FIXED_VALUE = CDT_PROPERTY_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>CDT Supplement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CDT_SUPPLEMENT_FEATURE_COUNT = CDT_PROPERTY_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.ebix.umm.umm.impl.PrimitiveLibraryImpl <em>Primitive Library</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ebix.umm.umm.impl.PrimitiveLibraryImpl
   * @see org.ebix.umm.umm.impl.UmmPackageImpl#getPrimitiveLibrary()
   * @generated
   */
  int PRIMITIVE_LIBRARY = 38;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_LIBRARY__NAME = LIBRARY__NAME;

  /**
   * The feature id for the '<em><b>Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_LIBRARY__TYPES = LIBRARY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Primitive Library</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_LIBRARY_FEATURE_COUNT = LIBRARY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.ebix.umm.umm.impl.OclInvariantImpl <em>Ocl Invariant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ebix.umm.umm.impl.OclInvariantImpl
   * @see org.ebix.umm.umm.impl.UmmPackageImpl#getOclInvariant()
   * @generated
   */
  int OCL_INVARIANT = 39;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_INVARIANT__EXPRESSION = 0;

  /**
   * The number of structural features of the '<em>Ocl Invariant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_INVARIANT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.ebix.umm.umm.impl.OclExpressionImpl <em>Ocl Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ebix.umm.umm.impl.OclExpressionImpl
   * @see org.ebix.umm.umm.impl.UmmPackageImpl#getOclExpression()
   * @generated
   */
  int OCL_EXPRESSION = 40;

  /**
   * The number of structural features of the '<em>Ocl Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.ebix.umm.umm.impl.OclValueImpl <em>Ocl Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ebix.umm.umm.impl.OclValueImpl
   * @see org.ebix.umm.umm.impl.UmmPackageImpl#getOclValue()
   * @generated
   */
  int OCL_VALUE = 41;

  /**
   * The number of structural features of the '<em>Ocl Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_VALUE_FEATURE_COUNT = OCL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.ebix.umm.umm.impl.OclReferenceImpl <em>Ocl Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ebix.umm.umm.impl.OclReferenceImpl
   * @see org.ebix.umm.umm.impl.UmmPackageImpl#getOclReference()
   * @generated
   */
  int OCL_REFERENCE = 42;

  /**
   * The number of structural features of the '<em>Ocl Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_REFERENCE_FEATURE_COUNT = OCL_VALUE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.ebix.umm.umm.impl.OclPathSelfHeadImpl <em>Ocl Path Self Head</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ebix.umm.umm.impl.OclPathSelfHeadImpl
   * @see org.ebix.umm.umm.impl.UmmPackageImpl#getOclPathSelfHead()
   * @generated
   */
  int OCL_PATH_SELF_HEAD = 43;

  /**
   * The feature id for the '<em><b>Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_PATH_SELF_HEAD__PATH = OCL_REFERENCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Ocl Path Self Head</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_PATH_SELF_HEAD_FEATURE_COUNT = OCL_REFERENCE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.ebix.umm.umm.impl.OclPathFeatureHeadImpl <em>Ocl Path Feature Head</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ebix.umm.umm.impl.OclPathFeatureHeadImpl
   * @see org.ebix.umm.umm.impl.UmmPackageImpl#getOclPathFeatureHead()
   * @generated
   */
  int OCL_PATH_FEATURE_HEAD = 44;

  /**
   * The feature id for the '<em><b>Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_PATH_FEATURE_HEAD__FEATURE = OCL_REFERENCE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tail</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_PATH_FEATURE_HEAD__TAIL = OCL_REFERENCE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Ocl Path Feature Head</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_PATH_FEATURE_HEAD_FEATURE_COUNT = OCL_REFERENCE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.ebix.umm.umm.impl.OclPathTailImpl <em>Ocl Path Tail</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ebix.umm.umm.impl.OclPathTailImpl
   * @see org.ebix.umm.umm.impl.UmmPackageImpl#getOclPathTail()
   * @generated
   */
  int OCL_PATH_TAIL = 45;

  /**
   * The feature id for the '<em><b>Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_PATH_TAIL__FEATURE = 0;

  /**
   * The feature id for the '<em><b>Tail</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_PATH_TAIL__TAIL = 1;

  /**
   * The number of structural features of the '<em>Ocl Path Tail</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_PATH_TAIL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.ebix.umm.umm.impl.OclFunctionCallImpl <em>Ocl Function Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ebix.umm.umm.impl.OclFunctionCallImpl
   * @see org.ebix.umm.umm.impl.UmmPackageImpl#getOclFunctionCall()
   * @generated
   */
  int OCL_FUNCTION_CALL = 47;

  /**
   * The number of structural features of the '<em>Ocl Function Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_FUNCTION_CALL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.ebix.umm.umm.impl.OclForAllImpl <em>Ocl For All</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ebix.umm.umm.impl.OclForAllImpl
   * @see org.ebix.umm.umm.impl.UmmPackageImpl#getOclForAll()
   * @generated
   */
  int OCL_FOR_ALL = 48;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_FOR_ALL__BODY = OCL_FUNCTION_CALL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Ocl For All</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_FOR_ALL_FEATURE_COUNT = OCL_FUNCTION_CALL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.ebix.umm.umm.impl.OclIsEmptyImpl <em>Ocl Is Empty</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ebix.umm.umm.impl.OclIsEmptyImpl
   * @see org.ebix.umm.umm.impl.UmmPackageImpl#getOclIsEmpty()
   * @generated
   */
  int OCL_IS_EMPTY = 49;

  /**
   * The number of structural features of the '<em>Ocl Is Empty</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_IS_EMPTY_FEATURE_COUNT = OCL_FUNCTION_CALL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.ebix.umm.umm.impl.OclNotEmptyImpl <em>Ocl Not Empty</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ebix.umm.umm.impl.OclNotEmptyImpl
   * @see org.ebix.umm.umm.impl.UmmPackageImpl#getOclNotEmpty()
   * @generated
   */
  int OCL_NOT_EMPTY = 50;

  /**
   * The number of structural features of the '<em>Ocl Not Empty</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_NOT_EMPTY_FEATURE_COUNT = OCL_FUNCTION_CALL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.ebix.umm.umm.impl.OclSizeImpl <em>Ocl Size</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ebix.umm.umm.impl.OclSizeImpl
   * @see org.ebix.umm.umm.impl.UmmPackageImpl#getOclSize()
   * @generated
   */
  int OCL_SIZE = 51;

  /**
   * The number of structural features of the '<em>Ocl Size</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_SIZE_FEATURE_COUNT = OCL_FUNCTION_CALL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.ebix.umm.umm.impl.OclLiteralImpl <em>Ocl Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ebix.umm.umm.impl.OclLiteralImpl
   * @see org.ebix.umm.umm.impl.UmmPackageImpl#getOclLiteral()
   * @generated
   */
  int OCL_LITERAL = 52;

  /**
   * The number of structural features of the '<em>Ocl Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_LITERAL_FEATURE_COUNT = OCL_VALUE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.ebix.umm.umm.impl.OclEnumerationLiteralImpl <em>Ocl Enumeration Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ebix.umm.umm.impl.OclEnumerationLiteralImpl
   * @see org.ebix.umm.umm.impl.UmmPackageImpl#getOclEnumerationLiteral()
   * @generated
   */
  int OCL_ENUMERATION_LITERAL = 53;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_ENUMERATION_LITERAL__VALUE = OCL_LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Ocl Enumeration Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_ENUMERATION_LITERAL_FEATURE_COUNT = OCL_LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.ebix.umm.umm.impl.OclIntegerLiteralImpl <em>Ocl Integer Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ebix.umm.umm.impl.OclIntegerLiteralImpl
   * @see org.ebix.umm.umm.impl.UmmPackageImpl#getOclIntegerLiteral()
   * @generated
   */
  int OCL_INTEGER_LITERAL = 54;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_INTEGER_LITERAL__VALUE = OCL_LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Ocl Integer Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_INTEGER_LITERAL_FEATURE_COUNT = OCL_LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.ebix.umm.umm.impl.OclStringLiteralImpl <em>Ocl String Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ebix.umm.umm.impl.OclStringLiteralImpl
   * @see org.ebix.umm.umm.impl.UmmPackageImpl#getOclStringLiteral()
   * @generated
   */
  int OCL_STRING_LITERAL = 55;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_STRING_LITERAL__VALUE = OCL_LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Ocl String Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_STRING_LITERAL_FEATURE_COUNT = OCL_LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.ebix.umm.umm.impl.OclBooleanLiteralImpl <em>Ocl Boolean Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ebix.umm.umm.impl.OclBooleanLiteralImpl
   * @see org.ebix.umm.umm.impl.UmmPackageImpl#getOclBooleanLiteral()
   * @generated
   */
  int OCL_BOOLEAN_LITERAL = 56;

  /**
   * The number of structural features of the '<em>Ocl Boolean Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_BOOLEAN_LITERAL_FEATURE_COUNT = OCL_LITERAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.ebix.umm.umm.impl.OclBooleanFalseImpl <em>Ocl Boolean False</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ebix.umm.umm.impl.OclBooleanFalseImpl
   * @see org.ebix.umm.umm.impl.UmmPackageImpl#getOclBooleanFalse()
   * @generated
   */
  int OCL_BOOLEAN_FALSE = 57;

  /**
   * The number of structural features of the '<em>Ocl Boolean False</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_BOOLEAN_FALSE_FEATURE_COUNT = OCL_BOOLEAN_LITERAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.ebix.umm.umm.impl.OclImpliesImpl <em>Ocl Implies</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ebix.umm.umm.impl.OclImpliesImpl
   * @see org.ebix.umm.umm.impl.UmmPackageImpl#getOclImplies()
   * @generated
   */
  int OCL_IMPLIES = 58;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_IMPLIES__LEFT = OCL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_IMPLIES__RIGHT = OCL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Ocl Implies</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_IMPLIES_FEATURE_COUNT = OCL_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.ebix.umm.umm.impl.OclAndImpl <em>Ocl And</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ebix.umm.umm.impl.OclAndImpl
   * @see org.ebix.umm.umm.impl.UmmPackageImpl#getOclAnd()
   * @generated
   */
  int OCL_AND = 59;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_AND__LEFT = OCL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_AND__RIGHT = OCL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Ocl And</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_AND_FEATURE_COUNT = OCL_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.ebix.umm.umm.impl.OclOrImpl <em>Ocl Or</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ebix.umm.umm.impl.OclOrImpl
   * @see org.ebix.umm.umm.impl.UmmPackageImpl#getOclOr()
   * @generated
   */
  int OCL_OR = 60;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_OR__LEFT = OCL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_OR__RIGHT = OCL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Ocl Or</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_OR_FEATURE_COUNT = OCL_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.ebix.umm.umm.impl.OclXorImpl <em>Ocl Xor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ebix.umm.umm.impl.OclXorImpl
   * @see org.ebix.umm.umm.impl.UmmPackageImpl#getOclXor()
   * @generated
   */
  int OCL_XOR = 61;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_XOR__LEFT = OCL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_XOR__RIGHT = OCL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Ocl Xor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_XOR_FEATURE_COUNT = OCL_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.ebix.umm.umm.impl.OclEqualImpl <em>Ocl Equal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ebix.umm.umm.impl.OclEqualImpl
   * @see org.ebix.umm.umm.impl.UmmPackageImpl#getOclEqual()
   * @generated
   */
  int OCL_EQUAL = 62;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_EQUAL__LEFT = OCL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_EQUAL__RIGHT = OCL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Ocl Equal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_EQUAL_FEATURE_COUNT = OCL_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.ebix.umm.umm.impl.OclLessImpl <em>Ocl Less</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ebix.umm.umm.impl.OclLessImpl
   * @see org.ebix.umm.umm.impl.UmmPackageImpl#getOclLess()
   * @generated
   */
  int OCL_LESS = 63;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_LESS__LEFT = OCL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_LESS__RIGHT = OCL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Ocl Less</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_LESS_FEATURE_COUNT = OCL_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.ebix.umm.umm.impl.OclLessOrEqualImpl <em>Ocl Less Or Equal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ebix.umm.umm.impl.OclLessOrEqualImpl
   * @see org.ebix.umm.umm.impl.UmmPackageImpl#getOclLessOrEqual()
   * @generated
   */
  int OCL_LESS_OR_EQUAL = 64;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_LESS_OR_EQUAL__LEFT = OCL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_LESS_OR_EQUAL__RIGHT = OCL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Ocl Less Or Equal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_LESS_OR_EQUAL_FEATURE_COUNT = OCL_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.ebix.umm.umm.impl.OclMoreImpl <em>Ocl More</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ebix.umm.umm.impl.OclMoreImpl
   * @see org.ebix.umm.umm.impl.UmmPackageImpl#getOclMore()
   * @generated
   */
  int OCL_MORE = 65;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_MORE__LEFT = OCL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_MORE__RIGHT = OCL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Ocl More</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_MORE_FEATURE_COUNT = OCL_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.ebix.umm.umm.impl.OclMoreOrEqualImpl <em>Ocl More Or Equal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ebix.umm.umm.impl.OclMoreOrEqualImpl
   * @see org.ebix.umm.umm.impl.UmmPackageImpl#getOclMoreOrEqual()
   * @generated
   */
  int OCL_MORE_OR_EQUAL = 66;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_MORE_OR_EQUAL__LEFT = OCL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_MORE_OR_EQUAL__RIGHT = OCL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Ocl More Or Equal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_MORE_OR_EQUAL_FEATURE_COUNT = OCL_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.ebix.umm.umm.impl.OclArrowImpl <em>Ocl Arrow</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ebix.umm.umm.impl.OclArrowImpl
   * @see org.ebix.umm.umm.impl.UmmPackageImpl#getOclArrow()
   * @generated
   */
  int OCL_ARROW = 67;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_ARROW__LEFT = OCL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_ARROW__RIGHT = OCL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Ocl Arrow</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_ARROW_FEATURE_COUNT = OCL_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.ebix.umm.umm.impl.OclBooleanTrueImpl <em>Ocl Boolean True</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ebix.umm.umm.impl.OclBooleanTrueImpl
   * @see org.ebix.umm.umm.impl.UmmPackageImpl#getOclBooleanTrue()
   * @generated
   */
  int OCL_BOOLEAN_TRUE = 68;

  /**
   * The number of structural features of the '<em>Ocl Boolean True</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_BOOLEAN_TRUE_FEATURE_COUNT = OCL_BOOLEAN_LITERAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.ebix.umm.umm.ConstraintKind <em>Constraint Kind</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ebix.umm.umm.ConstraintKind
   * @see org.ebix.umm.umm.impl.UmmPackageImpl#getConstraintKind()
   * @generated
   */
  int CONSTRAINT_KIND = 69;

  /**
   * The meta object id for the '{@link org.ebix.umm.umm.MultiplicityKind <em>Multiplicity Kind</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ebix.umm.umm.MultiplicityKind
   * @see org.ebix.umm.umm.impl.UmmPackageImpl#getMultiplicityKind()
   * @generated
   */
  int MULTIPLICITY_KIND = 70;


  /**
   * Returns the meta object for class '{@link org.ebix.umm.umm.Library <em>Library</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Library</em>'.
   * @see org.ebix.umm.umm.Library
   * @generated
   */
  EClass getLibrary();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.Library#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.ebix.umm.umm.Library#getName()
   * @see #getLibrary()
   * @generated
   */
  EAttribute getLibrary_Name();

  /**
   * Returns the meta object for class '{@link org.ebix.umm.umm.DocLibrary <em>Doc Library</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Doc Library</em>'.
   * @see org.ebix.umm.umm.DocLibrary
   * @generated
   */
  EClass getDocLibrary();

  /**
   * Returns the meta object for the attribute list '{@link org.ebix.umm.umm.DocLibrary#getBusinessTerm <em>Business Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Business Term</em>'.
   * @see org.ebix.umm.umm.DocLibrary#getBusinessTerm()
   * @see #getDocLibrary()
   * @generated
   */
  EAttribute getDocLibrary_BusinessTerm();

  /**
   * Returns the meta object for the attribute list '{@link org.ebix.umm.umm.DocLibrary#getCopyright <em>Copyright</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Copyright</em>'.
   * @see org.ebix.umm.umm.DocLibrary#getCopyright()
   * @see #getDocLibrary()
   * @generated
   */
  EAttribute getDocLibrary_Copyright();

  /**
   * Returns the meta object for the attribute list '{@link org.ebix.umm.umm.DocLibrary#getOwner <em>Owner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Owner</em>'.
   * @see org.ebix.umm.umm.DocLibrary#getOwner()
   * @see #getDocLibrary()
   * @generated
   */
  EAttribute getDocLibrary_Owner();

  /**
   * Returns the meta object for the attribute list '{@link org.ebix.umm.umm.DocLibrary#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Reference</em>'.
   * @see org.ebix.umm.umm.DocLibrary#getReference()
   * @see #getDocLibrary()
   * @generated
   */
  EAttribute getDocLibrary_Reference();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.DocLibrary#getUniqueIdentifier <em>Unique Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unique Identifier</em>'.
   * @see org.ebix.umm.umm.DocLibrary#getUniqueIdentifier()
   * @see #getDocLibrary()
   * @generated
   */
  EAttribute getDocLibrary_UniqueIdentifier();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.DocLibrary#getVersionIdentifier <em>Version Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Version Identifier</em>'.
   * @see org.ebix.umm.umm.DocLibrary#getVersionIdentifier()
   * @see #getDocLibrary()
   * @generated
   */
  EAttribute getDocLibrary_VersionIdentifier();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.DocLibrary#getBaseURN <em>Base URN</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Base URN</em>'.
   * @see org.ebix.umm.umm.DocLibrary#getBaseURN()
   * @see #getDocLibrary()
   * @generated
   */
  EAttribute getDocLibrary_BaseURN();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.DocLibrary#getNamespacePrefix <em>Namespace Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Namespace Prefix</em>'.
   * @see org.ebix.umm.umm.DocLibrary#getNamespacePrefix()
   * @see #getDocLibrary()
   * @generated
   */
  EAttribute getDocLibrary_NamespacePrefix();

  /**
   * Returns the meta object for the reference '{@link org.ebix.umm.umm.DocLibrary#getBieLibrary <em>Bie Library</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Bie Library</em>'.
   * @see org.ebix.umm.umm.DocLibrary#getBieLibrary()
   * @see #getDocLibrary()
   * @generated
   */
  EReference getDocLibrary_BieLibrary();

  /**
   * Returns the meta object for the reference '{@link org.ebix.umm.umm.DocLibrary#getBdtLibrary <em>Bdt Library</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Bdt Library</em>'.
   * @see org.ebix.umm.umm.DocLibrary#getBdtLibrary()
   * @see #getDocLibrary()
   * @generated
   */
  EReference getDocLibrary_BdtLibrary();

  /**
   * Returns the meta object for the containment reference list '{@link org.ebix.umm.umm.DocLibrary#getEnvelopes <em>Envelopes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Envelopes</em>'.
   * @see org.ebix.umm.umm.DocLibrary#getEnvelopes()
   * @see #getDocLibrary()
   * @generated
   */
  EReference getDocLibrary_Envelopes();

  /**
   * Returns the meta object for class '{@link org.ebix.umm.umm.InfEnvelope <em>Inf Envelope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inf Envelope</em>'.
   * @see org.ebix.umm.umm.InfEnvelope
   * @generated
   */
  EClass getInfEnvelope();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.InfEnvelope#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.ebix.umm.umm.InfEnvelope#getName()
   * @see #getInfEnvelope()
   * @generated
   */
  EAttribute getInfEnvelope_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.ebix.umm.umm.InfEnvelope#getAssemblies <em>Assemblies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Assemblies</em>'.
   * @see org.ebix.umm.umm.InfEnvelope#getAssemblies()
   * @see #getInfEnvelope()
   * @generated
   */
  EReference getInfEnvelope_Assemblies();

  /**
   * Returns the meta object for class '{@link org.ebix.umm.umm.MA <em>MA</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MA</em>'.
   * @see org.ebix.umm.umm.MA
   * @generated
   */
  EClass getMA();

  /**
   * Returns the meta object for the containment reference list '{@link org.ebix.umm.umm.MA#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see org.ebix.umm.umm.MA#getProperties()
   * @see #getMA()
   * @generated
   */
  EReference getMA_Properties();

  /**
   * Returns the meta object for the containment reference list '{@link org.ebix.umm.umm.MA#getConstraints <em>Constraints</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Constraints</em>'.
   * @see org.ebix.umm.umm.MA#getConstraints()
   * @see #getMA()
   * @generated
   */
  EReference getMA_Constraints();

  /**
   * Returns the meta object for class '{@link org.ebix.umm.umm.MAProperty <em>MA Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MA Property</em>'.
   * @see org.ebix.umm.umm.MAProperty
   * @generated
   */
  EClass getMAProperty();

  /**
   * Returns the meta object for the reference '{@link org.ebix.umm.umm.MAProperty#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.ebix.umm.umm.MAProperty#getType()
   * @see #getMAProperty()
   * @generated
   */
  EReference getMAProperty_Type();

  /**
   * Returns the meta object for class '{@link org.ebix.umm.umm.ASMA <em>ASMA</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ASMA</em>'.
   * @see org.ebix.umm.umm.ASMA
   * @generated
   */
  EClass getASMA();

  /**
   * Returns the meta object for class '{@link org.ebix.umm.umm.ASNONE <em>ASNONE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ASNONE</em>'.
   * @see org.ebix.umm.umm.ASNONE
   * @generated
   */
  EClass getASNONE();

  /**
   * Returns the meta object for class '{@link org.ebix.umm.umm.Constraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constraint</em>'.
   * @see org.ebix.umm.umm.Constraint
   * @generated
   */
  EClass getConstraint();

  /**
   * Returns the meta object for the reference '{@link org.ebix.umm.umm.Constraint#getContext <em>Context</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Context</em>'.
   * @see org.ebix.umm.umm.Constraint#getContext()
   * @see #getConstraint()
   * @generated
   */
  EReference getConstraint_Context();

  /**
   * Returns the meta object for the containment reference list '{@link org.ebix.umm.umm.Constraint#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Type</em>'.
   * @see org.ebix.umm.umm.Constraint#getType()
   * @see #getConstraint()
   * @generated
   */
  EReference getConstraint_Type();

  /**
   * Returns the meta object for the containment reference list '{@link org.ebix.umm.umm.Constraint#getInvariants <em>Invariants</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Invariants</em>'.
   * @see org.ebix.umm.umm.Constraint#getInvariants()
   * @see #getConstraint()
   * @generated
   */
  EReference getConstraint_Invariants();

  /**
   * Returns the meta object for class '{@link org.ebix.umm.umm.ContextRef <em>Context Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Context Ref</em>'.
   * @see org.ebix.umm.umm.ContextRef
   * @generated
   */
  EClass getContextRef();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.ContextRef#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.ebix.umm.umm.ContextRef#getName()
   * @see #getContextRef()
   * @generated
   */
  EAttribute getContextRef_Name();

  /**
   * Returns the meta object for class '{@link org.ebix.umm.umm.TC_Constraint <em>TC Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>TC Constraint</em>'.
   * @see org.ebix.umm.umm.TC_Constraint
   * @generated
   */
  EClass getTC_Constraint();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.TC_Constraint#getKind <em>Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Kind</em>'.
   * @see org.ebix.umm.umm.TC_Constraint#getKind()
   * @see #getTC_Constraint()
   * @generated
   */
  EAttribute getTC_Constraint_Kind();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.TC_Constraint#getListIdentifier <em>List Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>List Identifier</em>'.
   * @see org.ebix.umm.umm.TC_Constraint#getListIdentifier()
   * @see #getTC_Constraint()
   * @generated
   */
  EAttribute getTC_Constraint_ListIdentifier();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.TC_Constraint#getResponsibleAgency <em>Responsible Agency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Responsible Agency</em>'.
   * @see org.ebix.umm.umm.TC_Constraint#getResponsibleAgency()
   * @see #getTC_Constraint()
   * @generated
   */
  EAttribute getTC_Constraint_ResponsibleAgency();

  /**
   * Returns the meta object for class '{@link org.ebix.umm.umm.BIELibrary <em>BIE Library</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BIE Library</em>'.
   * @see org.ebix.umm.umm.BIELibrary
   * @generated
   */
  EClass getBIELibrary();

  /**
   * Returns the meta object for the attribute list '{@link org.ebix.umm.umm.BIELibrary#getBusinessTerm <em>Business Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Business Term</em>'.
   * @see org.ebix.umm.umm.BIELibrary#getBusinessTerm()
   * @see #getBIELibrary()
   * @generated
   */
  EAttribute getBIELibrary_BusinessTerm();

  /**
   * Returns the meta object for the attribute list '{@link org.ebix.umm.umm.BIELibrary#getCopyright <em>Copyright</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Copyright</em>'.
   * @see org.ebix.umm.umm.BIELibrary#getCopyright()
   * @see #getBIELibrary()
   * @generated
   */
  EAttribute getBIELibrary_Copyright();

  /**
   * Returns the meta object for the attribute list '{@link org.ebix.umm.umm.BIELibrary#getOwner <em>Owner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Owner</em>'.
   * @see org.ebix.umm.umm.BIELibrary#getOwner()
   * @see #getBIELibrary()
   * @generated
   */
  EAttribute getBIELibrary_Owner();

  /**
   * Returns the meta object for the attribute list '{@link org.ebix.umm.umm.BIELibrary#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Reference</em>'.
   * @see org.ebix.umm.umm.BIELibrary#getReference()
   * @see #getBIELibrary()
   * @generated
   */
  EAttribute getBIELibrary_Reference();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.BIELibrary#getUniqueIdentifier <em>Unique Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unique Identifier</em>'.
   * @see org.ebix.umm.umm.BIELibrary#getUniqueIdentifier()
   * @see #getBIELibrary()
   * @generated
   */
  EAttribute getBIELibrary_UniqueIdentifier();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.BIELibrary#getVersionIdentifier <em>Version Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Version Identifier</em>'.
   * @see org.ebix.umm.umm.BIELibrary#getVersionIdentifier()
   * @see #getBIELibrary()
   * @generated
   */
  EAttribute getBIELibrary_VersionIdentifier();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.BIELibrary#getBaseURN <em>Base URN</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Base URN</em>'.
   * @see org.ebix.umm.umm.BIELibrary#getBaseURN()
   * @see #getBIELibrary()
   * @generated
   */
  EAttribute getBIELibrary_BaseURN();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.BIELibrary#getNamespacePrefix <em>Namespace Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Namespace Prefix</em>'.
   * @see org.ebix.umm.umm.BIELibrary#getNamespacePrefix()
   * @see #getBIELibrary()
   * @generated
   */
  EAttribute getBIELibrary_NamespacePrefix();

  /**
   * Returns the meta object for the reference '{@link org.ebix.umm.umm.BIELibrary#getBdtLibrary <em>Bdt Library</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Bdt Library</em>'.
   * @see org.ebix.umm.umm.BIELibrary#getBdtLibrary()
   * @see #getBIELibrary()
   * @generated
   */
  EReference getBIELibrary_BdtLibrary();

  /**
   * Returns the meta object for the containment reference list '{@link org.ebix.umm.umm.BIELibrary#getAbies <em>Abies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Abies</em>'.
   * @see org.ebix.umm.umm.BIELibrary#getAbies()
   * @see #getBIELibrary()
   * @generated
   */
  EReference getBIELibrary_Abies();

  /**
   * Returns the meta object for class '{@link org.ebix.umm.umm.ABIE <em>ABIE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ABIE</em>'.
   * @see org.ebix.umm.umm.ABIE
   * @generated
   */
  EClass getABIE();

  /**
   * Returns the meta object for the attribute list '{@link org.ebix.umm.umm.ABIE#getBusinessTerm <em>Business Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Business Term</em>'.
   * @see org.ebix.umm.umm.ABIE#getBusinessTerm()
   * @see #getABIE()
   * @generated
   */
  EAttribute getABIE_BusinessTerm();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.ABIE#getDefinition <em>Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Definition</em>'.
   * @see org.ebix.umm.umm.ABIE#getDefinition()
   * @see #getABIE()
   * @generated
   */
  EAttribute getABIE_Definition();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.ABIE#getDictionary <em>Dictionary</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dictionary</em>'.
   * @see org.ebix.umm.umm.ABIE#getDictionary()
   * @see #getABIE()
   * @generated
   */
  EAttribute getABIE_Dictionary();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.ABIE#getUniqueIdentifier <em>Unique Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unique Identifier</em>'.
   * @see org.ebix.umm.umm.ABIE#getUniqueIdentifier()
   * @see #getABIE()
   * @generated
   */
  EAttribute getABIE_UniqueIdentifier();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.ABIE#getVersionIdentifier <em>Version Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Version Identifier</em>'.
   * @see org.ebix.umm.umm.ABIE#getVersionIdentifier()
   * @see #getABIE()
   * @generated
   */
  EAttribute getABIE_VersionIdentifier();

  /**
   * Returns the meta object for the containment reference list '{@link org.ebix.umm.umm.ABIE#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see org.ebix.umm.umm.ABIE#getProperties()
   * @see #getABIE()
   * @generated
   */
  EReference getABIE_Properties();

  /**
   * Returns the meta object for the containment reference list '{@link org.ebix.umm.umm.ABIE#getConstraints <em>Constraints</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Constraints</em>'.
   * @see org.ebix.umm.umm.ABIE#getConstraints()
   * @see #getABIE()
   * @generated
   */
  EReference getABIE_Constraints();

  /**
   * Returns the meta object for class '{@link org.ebix.umm.umm.ABIEProperty <em>ABIE Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ABIE Property</em>'.
   * @see org.ebix.umm.umm.ABIEProperty
   * @generated
   */
  EClass getABIEProperty();

  /**
   * Returns the meta object for the reference list '{@link org.ebix.umm.umm.ABIEProperty#getOr <em>Or</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Or</em>'.
   * @see org.ebix.umm.umm.ABIEProperty#getOr()
   * @see #getABIEProperty()
   * @generated
   */
  EReference getABIEProperty_Or();

  /**
   * Returns the meta object for the attribute list '{@link org.ebix.umm.umm.ABIEProperty#getBusinessTerm <em>Business Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Business Term</em>'.
   * @see org.ebix.umm.umm.ABIEProperty#getBusinessTerm()
   * @see #getABIEProperty()
   * @generated
   */
  EAttribute getABIEProperty_BusinessTerm();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.ABIEProperty#getDefinition <em>Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Definition</em>'.
   * @see org.ebix.umm.umm.ABIEProperty#getDefinition()
   * @see #getABIEProperty()
   * @generated
   */
  EAttribute getABIEProperty_Definition();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.ABIEProperty#getDictionary <em>Dictionary</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dictionary</em>'.
   * @see org.ebix.umm.umm.ABIEProperty#getDictionary()
   * @see #getABIEProperty()
   * @generated
   */
  EAttribute getABIEProperty_Dictionary();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.ABIEProperty#getUniqueIdentifier <em>Unique Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unique Identifier</em>'.
   * @see org.ebix.umm.umm.ABIEProperty#getUniqueIdentifier()
   * @see #getABIEProperty()
   * @generated
   */
  EAttribute getABIEProperty_UniqueIdentifier();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.ABIEProperty#getVersionIdentifier <em>Version Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Version Identifier</em>'.
   * @see org.ebix.umm.umm.ABIEProperty#getVersionIdentifier()
   * @see #getABIEProperty()
   * @generated
   */
  EAttribute getABIEProperty_VersionIdentifier();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.ABIEProperty#getSequencingKey <em>Sequencing Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sequencing Key</em>'.
   * @see org.ebix.umm.umm.ABIEProperty#getSequencingKey()
   * @see #getABIEProperty()
   * @generated
   */
  EAttribute getABIEProperty_SequencingKey();

  /**
   * Returns the meta object for class '{@link org.ebix.umm.umm.ASBIE <em>ASBIE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ASBIE</em>'.
   * @see org.ebix.umm.umm.ASBIE
   * @generated
   */
  EClass getASBIE();

  /**
   * Returns the meta object for the reference '{@link org.ebix.umm.umm.ASBIE#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.ebix.umm.umm.ASBIE#getType()
   * @see #getASBIE()
   * @generated
   */
  EReference getASBIE_Type();

  /**
   * Returns the meta object for class '{@link org.ebix.umm.umm.BBIE <em>BBIE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BBIE</em>'.
   * @see org.ebix.umm.umm.BBIE
   * @generated
   */
  EClass getBBIE();

  /**
   * Returns the meta object for the reference '{@link org.ebix.umm.umm.BBIE#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.ebix.umm.umm.BBIE#getType()
   * @see #getBBIE()
   * @generated
   */
  EReference getBBIE_Type();

  /**
   * Returns the meta object for the attribute list '{@link org.ebix.umm.umm.BBIE#getRestriction <em>Restriction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Restriction</em>'.
   * @see org.ebix.umm.umm.BBIE#getRestriction()
   * @see #getBBIE()
   * @generated
   */
  EAttribute getBBIE_Restriction();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.BBIE#getFixedValue <em>Fixed Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fixed Value</em>'.
   * @see org.ebix.umm.umm.BBIE#getFixedValue()
   * @see #getBBIE()
   * @generated
   */
  EAttribute getBBIE_FixedValue();

  /**
   * Returns the meta object for class '{@link org.ebix.umm.umm.BDTLibrary <em>BDT Library</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BDT Library</em>'.
   * @see org.ebix.umm.umm.BDTLibrary
   * @generated
   */
  EClass getBDTLibrary();

  /**
   * Returns the meta object for the attribute list '{@link org.ebix.umm.umm.BDTLibrary#getBusinessTerm <em>Business Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Business Term</em>'.
   * @see org.ebix.umm.umm.BDTLibrary#getBusinessTerm()
   * @see #getBDTLibrary()
   * @generated
   */
  EAttribute getBDTLibrary_BusinessTerm();

  /**
   * Returns the meta object for the attribute list '{@link org.ebix.umm.umm.BDTLibrary#getCopyright <em>Copyright</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Copyright</em>'.
   * @see org.ebix.umm.umm.BDTLibrary#getCopyright()
   * @see #getBDTLibrary()
   * @generated
   */
  EAttribute getBDTLibrary_Copyright();

  /**
   * Returns the meta object for the attribute list '{@link org.ebix.umm.umm.BDTLibrary#getOwner <em>Owner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Owner</em>'.
   * @see org.ebix.umm.umm.BDTLibrary#getOwner()
   * @see #getBDTLibrary()
   * @generated
   */
  EAttribute getBDTLibrary_Owner();

  /**
   * Returns the meta object for the attribute list '{@link org.ebix.umm.umm.BDTLibrary#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Reference</em>'.
   * @see org.ebix.umm.umm.BDTLibrary#getReference()
   * @see #getBDTLibrary()
   * @generated
   */
  EAttribute getBDTLibrary_Reference();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.BDTLibrary#getUniqueIdentifier <em>Unique Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unique Identifier</em>'.
   * @see org.ebix.umm.umm.BDTLibrary#getUniqueIdentifier()
   * @see #getBDTLibrary()
   * @generated
   */
  EAttribute getBDTLibrary_UniqueIdentifier();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.BDTLibrary#getVersionIdentifier <em>Version Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Version Identifier</em>'.
   * @see org.ebix.umm.umm.BDTLibrary#getVersionIdentifier()
   * @see #getBDTLibrary()
   * @generated
   */
  EAttribute getBDTLibrary_VersionIdentifier();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.BDTLibrary#getBaseURN <em>Base URN</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Base URN</em>'.
   * @see org.ebix.umm.umm.BDTLibrary#getBaseURN()
   * @see #getBDTLibrary()
   * @generated
   */
  EAttribute getBDTLibrary_BaseURN();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.BDTLibrary#getNamespacePrefix <em>Namespace Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Namespace Prefix</em>'.
   * @see org.ebix.umm.umm.BDTLibrary#getNamespacePrefix()
   * @see #getBDTLibrary()
   * @generated
   */
  EAttribute getBDTLibrary_NamespacePrefix();

  /**
   * Returns the meta object for the containment reference list '{@link org.ebix.umm.umm.BDTLibrary#getBdts <em>Bdts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Bdts</em>'.
   * @see org.ebix.umm.umm.BDTLibrary#getBdts()
   * @see #getBDTLibrary()
   * @generated
   */
  EReference getBDTLibrary_Bdts();

  /**
   * Returns the meta object for class '{@link org.ebix.umm.umm.BDT <em>BDT</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BDT</em>'.
   * @see org.ebix.umm.umm.BDT
   * @generated
   */
  EClass getBDT();

  /**
   * Returns the meta object for the attribute list '{@link org.ebix.umm.umm.BDT#getBusinessTerm <em>Business Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Business Term</em>'.
   * @see org.ebix.umm.umm.BDT#getBusinessTerm()
   * @see #getBDT()
   * @generated
   */
  EAttribute getBDT_BusinessTerm();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.BDT#getDefinition <em>Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Definition</em>'.
   * @see org.ebix.umm.umm.BDT#getDefinition()
   * @see #getBDT()
   * @generated
   */
  EAttribute getBDT_Definition();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.BDT#getDictionary <em>Dictionary</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dictionary</em>'.
   * @see org.ebix.umm.umm.BDT#getDictionary()
   * @see #getBDT()
   * @generated
   */
  EAttribute getBDT_Dictionary();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.BDT#getUniqueIdentifier <em>Unique Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unique Identifier</em>'.
   * @see org.ebix.umm.umm.BDT#getUniqueIdentifier()
   * @see #getBDT()
   * @generated
   */
  EAttribute getBDT_UniqueIdentifier();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.BDT#getVersionIdentifier <em>Version Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Version Identifier</em>'.
   * @see org.ebix.umm.umm.BDT#getVersionIdentifier()
   * @see #getBDT()
   * @generated
   */
  EAttribute getBDT_VersionIdentifier();

  /**
   * Returns the meta object for the containment reference list '{@link org.ebix.umm.umm.BDT#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see org.ebix.umm.umm.BDT#getProperties()
   * @see #getBDT()
   * @generated
   */
  EReference getBDT_Properties();

  /**
   * Returns the meta object for class '{@link org.ebix.umm.umm.BDTProperty <em>BDT Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BDT Property</em>'.
   * @see org.ebix.umm.umm.BDTProperty
   * @generated
   */
  EClass getBDTProperty();

  /**
   * Returns the meta object for the reference '{@link org.ebix.umm.umm.BDTProperty#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.ebix.umm.umm.BDTProperty#getType()
   * @see #getBDTProperty()
   * @generated
   */
  EReference getBDTProperty_Type();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.BDTProperty#getPattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pattern</em>'.
   * @see org.ebix.umm.umm.BDTProperty#getPattern()
   * @see #getBDTProperty()
   * @generated
   */
  EAttribute getBDTProperty_Pattern();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.BDTProperty#getMinLength <em>Min Length</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Min Length</em>'.
   * @see org.ebix.umm.umm.BDTProperty#getMinLength()
   * @see #getBDTProperty()
   * @generated
   */
  EAttribute getBDTProperty_MinLength();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.BDTProperty#getMaxLength <em>Max Length</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Max Length</em>'.
   * @see org.ebix.umm.umm.BDTProperty#getMaxLength()
   * @see #getBDTProperty()
   * @generated
   */
  EAttribute getBDTProperty_MaxLength();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.BDTProperty#getLength <em>Length</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Length</em>'.
   * @see org.ebix.umm.umm.BDTProperty#getLength()
   * @see #getBDTProperty()
   * @generated
   */
  EAttribute getBDTProperty_Length();

  /**
   * Returns the meta object for the attribute list '{@link org.ebix.umm.umm.BDTProperty#getBusinessTerm <em>Business Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Business Term</em>'.
   * @see org.ebix.umm.umm.BDTProperty#getBusinessTerm()
   * @see #getBDTProperty()
   * @generated
   */
  EAttribute getBDTProperty_BusinessTerm();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.BDTProperty#getDefinition <em>Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Definition</em>'.
   * @see org.ebix.umm.umm.BDTProperty#getDefinition()
   * @see #getBDTProperty()
   * @generated
   */
  EAttribute getBDTProperty_Definition();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.BDTProperty#getDictionary <em>Dictionary</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dictionary</em>'.
   * @see org.ebix.umm.umm.BDTProperty#getDictionary()
   * @see #getBDTProperty()
   * @generated
   */
  EAttribute getBDTProperty_Dictionary();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.BDTProperty#getUniqueIdentifier <em>Unique Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unique Identifier</em>'.
   * @see org.ebix.umm.umm.BDTProperty#getUniqueIdentifier()
   * @see #getBDTProperty()
   * @generated
   */
  EAttribute getBDTProperty_UniqueIdentifier();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.BDTProperty#getVersionIdentifier <em>Version Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Version Identifier</em>'.
   * @see org.ebix.umm.umm.BDTProperty#getVersionIdentifier()
   * @see #getBDTProperty()
   * @generated
   */
  EAttribute getBDTProperty_VersionIdentifier();

  /**
   * Returns the meta object for class '{@link org.ebix.umm.umm.Content <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Content</em>'.
   * @see org.ebix.umm.umm.Content
   * @generated
   */
  EClass getContent();

  /**
   * Returns the meta object for class '{@link org.ebix.umm.umm.Supplement <em>Supplement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Supplement</em>'.
   * @see org.ebix.umm.umm.Supplement
   * @generated
   */
  EClass getSupplement();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.Supplement#getDefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default Value</em>'.
   * @see org.ebix.umm.umm.Supplement#getDefaultValue()
   * @see #getSupplement()
   * @generated
   */
  EAttribute getSupplement_DefaultValue();

  /**
   * Returns the meta object for the attribute list '{@link org.ebix.umm.umm.Supplement#getRestriction <em>Restriction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Restriction</em>'.
   * @see org.ebix.umm.umm.Supplement#getRestriction()
   * @see #getSupplement()
   * @generated
   */
  EAttribute getSupplement_Restriction();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.Supplement#getFixedValue <em>Fixed Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fixed Value</em>'.
   * @see org.ebix.umm.umm.Supplement#getFixedValue()
   * @see #getSupplement()
   * @generated
   */
  EAttribute getSupplement_FixedValue();

  /**
   * Returns the meta object for class '{@link org.ebix.umm.umm.ENUMLibrary <em>ENUM Library</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ENUM Library</em>'.
   * @see org.ebix.umm.umm.ENUMLibrary
   * @generated
   */
  EClass getENUMLibrary();

  /**
   * Returns the meta object for the attribute list '{@link org.ebix.umm.umm.ENUMLibrary#getBusinessTerm <em>Business Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Business Term</em>'.
   * @see org.ebix.umm.umm.ENUMLibrary#getBusinessTerm()
   * @see #getENUMLibrary()
   * @generated
   */
  EAttribute getENUMLibrary_BusinessTerm();

  /**
   * Returns the meta object for the attribute list '{@link org.ebix.umm.umm.ENUMLibrary#getCopyright <em>Copyright</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Copyright</em>'.
   * @see org.ebix.umm.umm.ENUMLibrary#getCopyright()
   * @see #getENUMLibrary()
   * @generated
   */
  EAttribute getENUMLibrary_Copyright();

  /**
   * Returns the meta object for the attribute list '{@link org.ebix.umm.umm.ENUMLibrary#getOwner <em>Owner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Owner</em>'.
   * @see org.ebix.umm.umm.ENUMLibrary#getOwner()
   * @see #getENUMLibrary()
   * @generated
   */
  EAttribute getENUMLibrary_Owner();

  /**
   * Returns the meta object for the attribute list '{@link org.ebix.umm.umm.ENUMLibrary#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Reference</em>'.
   * @see org.ebix.umm.umm.ENUMLibrary#getReference()
   * @see #getENUMLibrary()
   * @generated
   */
  EAttribute getENUMLibrary_Reference();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.ENUMLibrary#getUniqueIdentifier <em>Unique Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unique Identifier</em>'.
   * @see org.ebix.umm.umm.ENUMLibrary#getUniqueIdentifier()
   * @see #getENUMLibrary()
   * @generated
   */
  EAttribute getENUMLibrary_UniqueIdentifier();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.ENUMLibrary#getVersionIdentifier <em>Version Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Version Identifier</em>'.
   * @see org.ebix.umm.umm.ENUMLibrary#getVersionIdentifier()
   * @see #getENUMLibrary()
   * @generated
   */
  EAttribute getENUMLibrary_VersionIdentifier();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.ENUMLibrary#getBaseURN <em>Base URN</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Base URN</em>'.
   * @see org.ebix.umm.umm.ENUMLibrary#getBaseURN()
   * @see #getENUMLibrary()
   * @generated
   */
  EAttribute getENUMLibrary_BaseURN();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.ENUMLibrary#getNamespacePrefix <em>Namespace Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Namespace Prefix</em>'.
   * @see org.ebix.umm.umm.ENUMLibrary#getNamespacePrefix()
   * @see #getENUMLibrary()
   * @generated
   */
  EAttribute getENUMLibrary_NamespacePrefix();

  /**
   * Returns the meta object for the containment reference list '{@link org.ebix.umm.umm.ENUMLibrary#getEnums <em>Enums</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Enums</em>'.
   * @see org.ebix.umm.umm.ENUMLibrary#getEnums()
   * @see #getENUMLibrary()
   * @generated
   */
  EReference getENUMLibrary_Enums();

  /**
   * Returns the meta object for class '{@link org.ebix.umm.umm.ENUM <em>ENUM</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ENUM</em>'.
   * @see org.ebix.umm.umm.ENUM
   * @generated
   */
  EClass getENUM();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.ENUM#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.ebix.umm.umm.ENUM#getName()
   * @see #getENUM()
   * @generated
   */
  EAttribute getENUM_Name();

  /**
   * Returns the meta object for the attribute list '{@link org.ebix.umm.umm.ENUM#getBusinessTerm <em>Business Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Business Term</em>'.
   * @see org.ebix.umm.umm.ENUM#getBusinessTerm()
   * @see #getENUM()
   * @generated
   */
  EAttribute getENUM_BusinessTerm();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.ENUM#getDefinition <em>Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Definition</em>'.
   * @see org.ebix.umm.umm.ENUM#getDefinition()
   * @see #getENUM()
   * @generated
   */
  EAttribute getENUM_Definition();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.ENUM#getCodeListAgencyIdentifier <em>Code List Agency Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Code List Agency Identifier</em>'.
   * @see org.ebix.umm.umm.ENUM#getCodeListAgencyIdentifier()
   * @see #getENUM()
   * @generated
   */
  EAttribute getENUM_CodeListAgencyIdentifier();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.ENUM#getCodeListName <em>Code List Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Code List Name</em>'.
   * @see org.ebix.umm.umm.ENUM#getCodeListName()
   * @see #getENUM()
   * @generated
   */
  EAttribute getENUM_CodeListName();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.ENUM#getCodeListIdentifier <em>Code List Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Code List Identifier</em>'.
   * @see org.ebix.umm.umm.ENUM#getCodeListIdentifier()
   * @see #getENUM()
   * @generated
   */
  EAttribute getENUM_CodeListIdentifier();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.ENUM#getDictionary <em>Dictionary</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dictionary</em>'.
   * @see org.ebix.umm.umm.ENUM#getDictionary()
   * @see #getENUM()
   * @generated
   */
  EAttribute getENUM_Dictionary();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.ENUM#getUniqueIdentifier <em>Unique Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unique Identifier</em>'.
   * @see org.ebix.umm.umm.ENUM#getUniqueIdentifier()
   * @see #getENUM()
   * @generated
   */
  EAttribute getENUM_UniqueIdentifier();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.ENUM#getVersionIdentifier <em>Version Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Version Identifier</em>'.
   * @see org.ebix.umm.umm.ENUM#getVersionIdentifier()
   * @see #getENUM()
   * @generated
   */
  EAttribute getENUM_VersionIdentifier();

  /**
   * Returns the meta object for class '{@link org.ebix.umm.umm.AssembledBase <em>Assembled Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assembled Base</em>'.
   * @see org.ebix.umm.umm.AssembledBase
   * @generated
   */
  EClass getAssembledBase();

  /**
   * Returns the meta object for class '{@link org.ebix.umm.umm.Primitive <em>Primitive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primitive</em>'.
   * @see org.ebix.umm.umm.Primitive
   * @generated
   */
  EClass getPrimitive();

  /**
   * Returns the meta object for class '{@link org.ebix.umm.umm.Assembled <em>Assembled</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assembled</em>'.
   * @see org.ebix.umm.umm.Assembled
   * @generated
   */
  EClass getAssembled();

  /**
   * Returns the meta object for the reference list '{@link org.ebix.umm.umm.Assembled#getOriginals <em>Originals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Originals</em>'.
   * @see org.ebix.umm.umm.Assembled#getOriginals()
   * @see #getAssembled()
   * @generated
   */
  EReference getAssembled_Originals();

  /**
   * Returns the meta object for the reference list '{@link org.ebix.umm.umm.Assembled#getSubsets <em>Subsets</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Subsets</em>'.
   * @see org.ebix.umm.umm.Assembled#getSubsets()
   * @see #getAssembled()
   * @generated
   */
  EReference getAssembled_Subsets();

  /**
   * Returns the meta object for class '{@link org.ebix.umm.umm.Original <em>Original</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Original</em>'.
   * @see org.ebix.umm.umm.Original
   * @generated
   */
  EClass getOriginal();

  /**
   * Returns the meta object for the containment reference list '{@link org.ebix.umm.umm.Original#getCodes <em>Codes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Codes</em>'.
   * @see org.ebix.umm.umm.Original#getCodes()
   * @see #getOriginal()
   * @generated
   */
  EReference getOriginal_Codes();

  /**
   * Returns the meta object for class '{@link org.ebix.umm.umm.Subset <em>Subset</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Subset</em>'.
   * @see org.ebix.umm.umm.Subset
   * @generated
   */
  EClass getSubset();

  /**
   * Returns the meta object for the containment reference list '{@link org.ebix.umm.umm.Subset#getCodes <em>Codes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Codes</em>'.
   * @see org.ebix.umm.umm.Subset#getCodes()
   * @see #getSubset()
   * @generated
   */
  EReference getSubset_Codes();

  /**
   * Returns the meta object for class '{@link org.ebix.umm.umm.CodelistEntry <em>Codelist Entry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Codelist Entry</em>'.
   * @see org.ebix.umm.umm.CodelistEntry
   * @generated
   */
  EClass getCodelistEntry();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.CodelistEntry#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.ebix.umm.umm.CodelistEntry#getName()
   * @see #getCodelistEntry()
   * @generated
   */
  EAttribute getCodelistEntry_Name();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.CodelistEntry#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.ebix.umm.umm.CodelistEntry#getDescription()
   * @see #getCodelistEntry()
   * @generated
   */
  EAttribute getCodelistEntry_Description();

  /**
   * Returns the meta object for class '{@link org.ebix.umm.umm.CCLibrary <em>CC Library</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CC Library</em>'.
   * @see org.ebix.umm.umm.CCLibrary
   * @generated
   */
  EClass getCCLibrary();

  /**
   * Returns the meta object for the attribute list '{@link org.ebix.umm.umm.CCLibrary#getBusinessTerm <em>Business Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Business Term</em>'.
   * @see org.ebix.umm.umm.CCLibrary#getBusinessTerm()
   * @see #getCCLibrary()
   * @generated
   */
  EAttribute getCCLibrary_BusinessTerm();

  /**
   * Returns the meta object for the attribute list '{@link org.ebix.umm.umm.CCLibrary#getCopyright <em>Copyright</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Copyright</em>'.
   * @see org.ebix.umm.umm.CCLibrary#getCopyright()
   * @see #getCCLibrary()
   * @generated
   */
  EAttribute getCCLibrary_Copyright();

  /**
   * Returns the meta object for the attribute list '{@link org.ebix.umm.umm.CCLibrary#getOwner <em>Owner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Owner</em>'.
   * @see org.ebix.umm.umm.CCLibrary#getOwner()
   * @see #getCCLibrary()
   * @generated
   */
  EAttribute getCCLibrary_Owner();

  /**
   * Returns the meta object for the attribute list '{@link org.ebix.umm.umm.CCLibrary#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Reference</em>'.
   * @see org.ebix.umm.umm.CCLibrary#getReference()
   * @see #getCCLibrary()
   * @generated
   */
  EAttribute getCCLibrary_Reference();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.CCLibrary#getUniqueIdentifier <em>Unique Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unique Identifier</em>'.
   * @see org.ebix.umm.umm.CCLibrary#getUniqueIdentifier()
   * @see #getCCLibrary()
   * @generated
   */
  EAttribute getCCLibrary_UniqueIdentifier();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.CCLibrary#getVersionIdentifier <em>Version Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Version Identifier</em>'.
   * @see org.ebix.umm.umm.CCLibrary#getVersionIdentifier()
   * @see #getCCLibrary()
   * @generated
   */
  EAttribute getCCLibrary_VersionIdentifier();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.CCLibrary#getBaseURN <em>Base URN</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Base URN</em>'.
   * @see org.ebix.umm.umm.CCLibrary#getBaseURN()
   * @see #getCCLibrary()
   * @generated
   */
  EAttribute getCCLibrary_BaseURN();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.CCLibrary#getNamespacePrefix <em>Namespace Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Namespace Prefix</em>'.
   * @see org.ebix.umm.umm.CCLibrary#getNamespacePrefix()
   * @see #getCCLibrary()
   * @generated
   */
  EAttribute getCCLibrary_NamespacePrefix();

  /**
   * Returns the meta object for the containment reference list '{@link org.ebix.umm.umm.CCLibrary#getAccs <em>Accs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Accs</em>'.
   * @see org.ebix.umm.umm.CCLibrary#getAccs()
   * @see #getCCLibrary()
   * @generated
   */
  EReference getCCLibrary_Accs();

  /**
   * Returns the meta object for class '{@link org.ebix.umm.umm.ACC <em>ACC</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ACC</em>'.
   * @see org.ebix.umm.umm.ACC
   * @generated
   */
  EClass getACC();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.ACC#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.ebix.umm.umm.ACC#getName()
   * @see #getACC()
   * @generated
   */
  EAttribute getACC_Name();

  /**
   * Returns the meta object for the attribute list '{@link org.ebix.umm.umm.ACC#getBusinessTerm <em>Business Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Business Term</em>'.
   * @see org.ebix.umm.umm.ACC#getBusinessTerm()
   * @see #getACC()
   * @generated
   */
  EAttribute getACC_BusinessTerm();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.ACC#getDefinition <em>Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Definition</em>'.
   * @see org.ebix.umm.umm.ACC#getDefinition()
   * @see #getACC()
   * @generated
   */
  EAttribute getACC_Definition();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.ACC#getDictionary <em>Dictionary</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dictionary</em>'.
   * @see org.ebix.umm.umm.ACC#getDictionary()
   * @see #getACC()
   * @generated
   */
  EAttribute getACC_Dictionary();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.ACC#getUniqueIdentifier <em>Unique Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unique Identifier</em>'.
   * @see org.ebix.umm.umm.ACC#getUniqueIdentifier()
   * @see #getACC()
   * @generated
   */
  EAttribute getACC_UniqueIdentifier();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.ACC#getVersionIdentifier <em>Version Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Version Identifier</em>'.
   * @see org.ebix.umm.umm.ACC#getVersionIdentifier()
   * @see #getACC()
   * @generated
   */
  EAttribute getACC_VersionIdentifier();

  /**
   * Returns the meta object for the containment reference list '{@link org.ebix.umm.umm.ACC#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see org.ebix.umm.umm.ACC#getProperties()
   * @see #getACC()
   * @generated
   */
  EReference getACC_Properties();

  /**
   * Returns the meta object for the containment reference list '{@link org.ebix.umm.umm.ACC#getConstraints <em>Constraints</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Constraints</em>'.
   * @see org.ebix.umm.umm.ACC#getConstraints()
   * @see #getACC()
   * @generated
   */
  EReference getACC_Constraints();

  /**
   * Returns the meta object for class '{@link org.ebix.umm.umm.ACCProperty <em>ACC Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ACC Property</em>'.
   * @see org.ebix.umm.umm.ACCProperty
   * @generated
   */
  EClass getACCProperty();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.ACCProperty#getMultiplicity <em>Multiplicity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Multiplicity</em>'.
   * @see org.ebix.umm.umm.ACCProperty#getMultiplicity()
   * @see #getACCProperty()
   * @generated
   */
  EAttribute getACCProperty_Multiplicity();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.ACCProperty#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.ebix.umm.umm.ACCProperty#getName()
   * @see #getACCProperty()
   * @generated
   */
  EAttribute getACCProperty_Name();

  /**
   * Returns the meta object for the attribute list '{@link org.ebix.umm.umm.ACCProperty#getBusinessTerm <em>Business Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Business Term</em>'.
   * @see org.ebix.umm.umm.ACCProperty#getBusinessTerm()
   * @see #getACCProperty()
   * @generated
   */
  EAttribute getACCProperty_BusinessTerm();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.ACCProperty#getDefinition <em>Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Definition</em>'.
   * @see org.ebix.umm.umm.ACCProperty#getDefinition()
   * @see #getACCProperty()
   * @generated
   */
  EAttribute getACCProperty_Definition();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.ACCProperty#getDictionary <em>Dictionary</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dictionary</em>'.
   * @see org.ebix.umm.umm.ACCProperty#getDictionary()
   * @see #getACCProperty()
   * @generated
   */
  EAttribute getACCProperty_Dictionary();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.ACCProperty#getUniqueIdentifier <em>Unique Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unique Identifier</em>'.
   * @see org.ebix.umm.umm.ACCProperty#getUniqueIdentifier()
   * @see #getACCProperty()
   * @generated
   */
  EAttribute getACCProperty_UniqueIdentifier();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.ACCProperty#getVersionIdentifier <em>Version Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Version Identifier</em>'.
   * @see org.ebix.umm.umm.ACCProperty#getVersionIdentifier()
   * @see #getACCProperty()
   * @generated
   */
  EAttribute getACCProperty_VersionIdentifier();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.ACCProperty#getSequencingKey <em>Sequencing Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sequencing Key</em>'.
   * @see org.ebix.umm.umm.ACCProperty#getSequencingKey()
   * @see #getACCProperty()
   * @generated
   */
  EAttribute getACCProperty_SequencingKey();

  /**
   * Returns the meta object for class '{@link org.ebix.umm.umm.ASCC <em>ASCC</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ASCC</em>'.
   * @see org.ebix.umm.umm.ASCC
   * @generated
   */
  EClass getASCC();

  /**
   * Returns the meta object for the reference '{@link org.ebix.umm.umm.ASCC#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.ebix.umm.umm.ASCC#getType()
   * @see #getASCC()
   * @generated
   */
  EReference getASCC_Type();

  /**
   * Returns the meta object for class '{@link org.ebix.umm.umm.BCC <em>BCC</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BCC</em>'.
   * @see org.ebix.umm.umm.BCC
   * @generated
   */
  EClass getBCC();

  /**
   * Returns the meta object for the reference '{@link org.ebix.umm.umm.BCC#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.ebix.umm.umm.BCC#getType()
   * @see #getBCC()
   * @generated
   */
  EReference getBCC_Type();

  /**
   * Returns the meta object for the attribute list '{@link org.ebix.umm.umm.BCC#getRestriction <em>Restriction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Restriction</em>'.
   * @see org.ebix.umm.umm.BCC#getRestriction()
   * @see #getBCC()
   * @generated
   */
  EAttribute getBCC_Restriction();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.BCC#getFixedValue <em>Fixed Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fixed Value</em>'.
   * @see org.ebix.umm.umm.BCC#getFixedValue()
   * @see #getBCC()
   * @generated
   */
  EAttribute getBCC_FixedValue();

  /**
   * Returns the meta object for class '{@link org.ebix.umm.umm.CDTLibrary <em>CDT Library</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CDT Library</em>'.
   * @see org.ebix.umm.umm.CDTLibrary
   * @generated
   */
  EClass getCDTLibrary();

  /**
   * Returns the meta object for the attribute list '{@link org.ebix.umm.umm.CDTLibrary#getBusinessTerm <em>Business Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Business Term</em>'.
   * @see org.ebix.umm.umm.CDTLibrary#getBusinessTerm()
   * @see #getCDTLibrary()
   * @generated
   */
  EAttribute getCDTLibrary_BusinessTerm();

  /**
   * Returns the meta object for the attribute list '{@link org.ebix.umm.umm.CDTLibrary#getCopyright <em>Copyright</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Copyright</em>'.
   * @see org.ebix.umm.umm.CDTLibrary#getCopyright()
   * @see #getCDTLibrary()
   * @generated
   */
  EAttribute getCDTLibrary_Copyright();

  /**
   * Returns the meta object for the attribute list '{@link org.ebix.umm.umm.CDTLibrary#getOwner <em>Owner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Owner</em>'.
   * @see org.ebix.umm.umm.CDTLibrary#getOwner()
   * @see #getCDTLibrary()
   * @generated
   */
  EAttribute getCDTLibrary_Owner();

  /**
   * Returns the meta object for the attribute list '{@link org.ebix.umm.umm.CDTLibrary#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Reference</em>'.
   * @see org.ebix.umm.umm.CDTLibrary#getReference()
   * @see #getCDTLibrary()
   * @generated
   */
  EAttribute getCDTLibrary_Reference();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.CDTLibrary#getUniqueIdentifier <em>Unique Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unique Identifier</em>'.
   * @see org.ebix.umm.umm.CDTLibrary#getUniqueIdentifier()
   * @see #getCDTLibrary()
   * @generated
   */
  EAttribute getCDTLibrary_UniqueIdentifier();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.CDTLibrary#getVersionIdentifier <em>Version Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Version Identifier</em>'.
   * @see org.ebix.umm.umm.CDTLibrary#getVersionIdentifier()
   * @see #getCDTLibrary()
   * @generated
   */
  EAttribute getCDTLibrary_VersionIdentifier();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.CDTLibrary#getBaseURN <em>Base URN</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Base URN</em>'.
   * @see org.ebix.umm.umm.CDTLibrary#getBaseURN()
   * @see #getCDTLibrary()
   * @generated
   */
  EAttribute getCDTLibrary_BaseURN();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.CDTLibrary#getNamespacePrefix <em>Namespace Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Namespace Prefix</em>'.
   * @see org.ebix.umm.umm.CDTLibrary#getNamespacePrefix()
   * @see #getCDTLibrary()
   * @generated
   */
  EAttribute getCDTLibrary_NamespacePrefix();

  /**
   * Returns the meta object for the containment reference list '{@link org.ebix.umm.umm.CDTLibrary#getCdts <em>Cdts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cdts</em>'.
   * @see org.ebix.umm.umm.CDTLibrary#getCdts()
   * @see #getCDTLibrary()
   * @generated
   */
  EReference getCDTLibrary_Cdts();

  /**
   * Returns the meta object for class '{@link org.ebix.umm.umm.CDT <em>CDT</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CDT</em>'.
   * @see org.ebix.umm.umm.CDT
   * @generated
   */
  EClass getCDT();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.CDT#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.ebix.umm.umm.CDT#getName()
   * @see #getCDT()
   * @generated
   */
  EAttribute getCDT_Name();

  /**
   * Returns the meta object for the attribute list '{@link org.ebix.umm.umm.CDT#getBusinessTerm <em>Business Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Business Term</em>'.
   * @see org.ebix.umm.umm.CDT#getBusinessTerm()
   * @see #getCDT()
   * @generated
   */
  EAttribute getCDT_BusinessTerm();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.CDT#getDefinition <em>Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Definition</em>'.
   * @see org.ebix.umm.umm.CDT#getDefinition()
   * @see #getCDT()
   * @generated
   */
  EAttribute getCDT_Definition();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.CDT#getDictionary <em>Dictionary</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dictionary</em>'.
   * @see org.ebix.umm.umm.CDT#getDictionary()
   * @see #getCDT()
   * @generated
   */
  EAttribute getCDT_Dictionary();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.CDT#getUniqueIdentifier <em>Unique Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unique Identifier</em>'.
   * @see org.ebix.umm.umm.CDT#getUniqueIdentifier()
   * @see #getCDT()
   * @generated
   */
  EAttribute getCDT_UniqueIdentifier();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.CDT#getVersionIdentifier <em>Version Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Version Identifier</em>'.
   * @see org.ebix.umm.umm.CDT#getVersionIdentifier()
   * @see #getCDT()
   * @generated
   */
  EAttribute getCDT_VersionIdentifier();

  /**
   * Returns the meta object for the containment reference list '{@link org.ebix.umm.umm.CDT#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see org.ebix.umm.umm.CDT#getProperties()
   * @see #getCDT()
   * @generated
   */
  EReference getCDT_Properties();

  /**
   * Returns the meta object for class '{@link org.ebix.umm.umm.CDTProperty <em>CDT Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CDT Property</em>'.
   * @see org.ebix.umm.umm.CDTProperty
   * @generated
   */
  EClass getCDTProperty();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.CDTProperty#getMultiplicity <em>Multiplicity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Multiplicity</em>'.
   * @see org.ebix.umm.umm.CDTProperty#getMultiplicity()
   * @see #getCDTProperty()
   * @generated
   */
  EAttribute getCDTProperty_Multiplicity();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.CDTProperty#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.ebix.umm.umm.CDTProperty#getName()
   * @see #getCDTProperty()
   * @generated
   */
  EAttribute getCDTProperty_Name();

  /**
   * Returns the meta object for the reference '{@link org.ebix.umm.umm.CDTProperty#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.ebix.umm.umm.CDTProperty#getType()
   * @see #getCDTProperty()
   * @generated
   */
  EReference getCDTProperty_Type();

  /**
   * Returns the meta object for the attribute list '{@link org.ebix.umm.umm.CDTProperty#getBusinessTerm <em>Business Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Business Term</em>'.
   * @see org.ebix.umm.umm.CDTProperty#getBusinessTerm()
   * @see #getCDTProperty()
   * @generated
   */
  EAttribute getCDTProperty_BusinessTerm();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.CDTProperty#getDefinition <em>Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Definition</em>'.
   * @see org.ebix.umm.umm.CDTProperty#getDefinition()
   * @see #getCDTProperty()
   * @generated
   */
  EAttribute getCDTProperty_Definition();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.CDTProperty#getDictionary <em>Dictionary</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dictionary</em>'.
   * @see org.ebix.umm.umm.CDTProperty#getDictionary()
   * @see #getCDTProperty()
   * @generated
   */
  EAttribute getCDTProperty_Dictionary();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.CDTProperty#getUniqueIdentifier <em>Unique Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unique Identifier</em>'.
   * @see org.ebix.umm.umm.CDTProperty#getUniqueIdentifier()
   * @see #getCDTProperty()
   * @generated
   */
  EAttribute getCDTProperty_UniqueIdentifier();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.CDTProperty#getVersionIdentifier <em>Version Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Version Identifier</em>'.
   * @see org.ebix.umm.umm.CDTProperty#getVersionIdentifier()
   * @see #getCDTProperty()
   * @generated
   */
  EAttribute getCDTProperty_VersionIdentifier();

  /**
   * Returns the meta object for class '{@link org.ebix.umm.umm.CDT_Content <em>CDT Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CDT Content</em>'.
   * @see org.ebix.umm.umm.CDT_Content
   * @generated
   */
  EClass getCDT_Content();

  /**
   * Returns the meta object for class '{@link org.ebix.umm.umm.CDT_Supplement <em>CDT Supplement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CDT Supplement</em>'.
   * @see org.ebix.umm.umm.CDT_Supplement
   * @generated
   */
  EClass getCDT_Supplement();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.CDT_Supplement#getDefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default Value</em>'.
   * @see org.ebix.umm.umm.CDT_Supplement#getDefaultValue()
   * @see #getCDT_Supplement()
   * @generated
   */
  EAttribute getCDT_Supplement_DefaultValue();

  /**
   * Returns the meta object for the attribute list '{@link org.ebix.umm.umm.CDT_Supplement#getRestriction <em>Restriction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Restriction</em>'.
   * @see org.ebix.umm.umm.CDT_Supplement#getRestriction()
   * @see #getCDT_Supplement()
   * @generated
   */
  EAttribute getCDT_Supplement_Restriction();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.CDT_Supplement#getFixedValue <em>Fixed Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fixed Value</em>'.
   * @see org.ebix.umm.umm.CDT_Supplement#getFixedValue()
   * @see #getCDT_Supplement()
   * @generated
   */
  EAttribute getCDT_Supplement_FixedValue();

  /**
   * Returns the meta object for class '{@link org.ebix.umm.umm.PrimitiveLibrary <em>Primitive Library</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primitive Library</em>'.
   * @see org.ebix.umm.umm.PrimitiveLibrary
   * @generated
   */
  EClass getPrimitiveLibrary();

  /**
   * Returns the meta object for the containment reference list '{@link org.ebix.umm.umm.PrimitiveLibrary#getTypes <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Types</em>'.
   * @see org.ebix.umm.umm.PrimitiveLibrary#getTypes()
   * @see #getPrimitiveLibrary()
   * @generated
   */
  EReference getPrimitiveLibrary_Types();

  /**
   * Returns the meta object for class '{@link org.ebix.umm.umm.OclInvariant <em>Ocl Invariant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ocl Invariant</em>'.
   * @see org.ebix.umm.umm.OclInvariant
   * @generated
   */
  EClass getOclInvariant();

  /**
   * Returns the meta object for the containment reference '{@link org.ebix.umm.umm.OclInvariant#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.ebix.umm.umm.OclInvariant#getExpression()
   * @see #getOclInvariant()
   * @generated
   */
  EReference getOclInvariant_Expression();

  /**
   * Returns the meta object for class '{@link org.ebix.umm.umm.OclExpression <em>Ocl Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ocl Expression</em>'.
   * @see org.ebix.umm.umm.OclExpression
   * @generated
   */
  EClass getOclExpression();

  /**
   * Returns the meta object for class '{@link org.ebix.umm.umm.OclValue <em>Ocl Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ocl Value</em>'.
   * @see org.ebix.umm.umm.OclValue
   * @generated
   */
  EClass getOclValue();

  /**
   * Returns the meta object for class '{@link org.ebix.umm.umm.OclReference <em>Ocl Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ocl Reference</em>'.
   * @see org.ebix.umm.umm.OclReference
   * @generated
   */
  EClass getOclReference();

  /**
   * Returns the meta object for class '{@link org.ebix.umm.umm.OclPathSelfHead <em>Ocl Path Self Head</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ocl Path Self Head</em>'.
   * @see org.ebix.umm.umm.OclPathSelfHead
   * @generated
   */
  EClass getOclPathSelfHead();

  /**
   * Returns the meta object for the containment reference '{@link org.ebix.umm.umm.OclPathSelfHead#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Path</em>'.
   * @see org.ebix.umm.umm.OclPathSelfHead#getPath()
   * @see #getOclPathSelfHead()
   * @generated
   */
  EReference getOclPathSelfHead_Path();

  /**
   * Returns the meta object for class '{@link org.ebix.umm.umm.OclPathFeatureHead <em>Ocl Path Feature Head</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ocl Path Feature Head</em>'.
   * @see org.ebix.umm.umm.OclPathFeatureHead
   * @generated
   */
  EClass getOclPathFeatureHead();

  /**
   * Returns the meta object for the reference '{@link org.ebix.umm.umm.OclPathFeatureHead#getFeature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Feature</em>'.
   * @see org.ebix.umm.umm.OclPathFeatureHead#getFeature()
   * @see #getOclPathFeatureHead()
   * @generated
   */
  EReference getOclPathFeatureHead_Feature();

  /**
   * Returns the meta object for the containment reference '{@link org.ebix.umm.umm.OclPathFeatureHead#getTail <em>Tail</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tail</em>'.
   * @see org.ebix.umm.umm.OclPathFeatureHead#getTail()
   * @see #getOclPathFeatureHead()
   * @generated
   */
  EReference getOclPathFeatureHead_Tail();

  /**
   * Returns the meta object for class '{@link org.ebix.umm.umm.OclPathTail <em>Ocl Path Tail</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ocl Path Tail</em>'.
   * @see org.ebix.umm.umm.OclPathTail
   * @generated
   */
  EClass getOclPathTail();

  /**
   * Returns the meta object for the reference '{@link org.ebix.umm.umm.OclPathTail#getFeature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Feature</em>'.
   * @see org.ebix.umm.umm.OclPathTail#getFeature()
   * @see #getOclPathTail()
   * @generated
   */
  EReference getOclPathTail_Feature();

  /**
   * Returns the meta object for the containment reference '{@link org.ebix.umm.umm.OclPathTail#getTail <em>Tail</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tail</em>'.
   * @see org.ebix.umm.umm.OclPathTail#getTail()
   * @see #getOclPathTail()
   * @generated
   */
  EReference getOclPathTail_Tail();

  /**
   * Returns the meta object for class '{@link org.ebix.umm.umm.OclRef <em>Ocl Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ocl Ref</em>'.
   * @see org.ebix.umm.umm.OclRef
   * @generated
   */
  EClass getOclRef();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.OclRef#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.ebix.umm.umm.OclRef#getName()
   * @see #getOclRef()
   * @generated
   */
  EAttribute getOclRef_Name();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.OclRef#getMultiplicity <em>Multiplicity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Multiplicity</em>'.
   * @see org.ebix.umm.umm.OclRef#getMultiplicity()
   * @see #getOclRef()
   * @generated
   */
  EAttribute getOclRef_Multiplicity();

  /**
   * Returns the meta object for class '{@link org.ebix.umm.umm.OclFunctionCall <em>Ocl Function Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ocl Function Call</em>'.
   * @see org.ebix.umm.umm.OclFunctionCall
   * @generated
   */
  EClass getOclFunctionCall();

  /**
   * Returns the meta object for class '{@link org.ebix.umm.umm.OclForAll <em>Ocl For All</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ocl For All</em>'.
   * @see org.ebix.umm.umm.OclForAll
   * @generated
   */
  EClass getOclForAll();

  /**
   * Returns the meta object for the containment reference '{@link org.ebix.umm.umm.OclForAll#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see org.ebix.umm.umm.OclForAll#getBody()
   * @see #getOclForAll()
   * @generated
   */
  EReference getOclForAll_Body();

  /**
   * Returns the meta object for class '{@link org.ebix.umm.umm.OclIsEmpty <em>Ocl Is Empty</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ocl Is Empty</em>'.
   * @see org.ebix.umm.umm.OclIsEmpty
   * @generated
   */
  EClass getOclIsEmpty();

  /**
   * Returns the meta object for class '{@link org.ebix.umm.umm.OclNotEmpty <em>Ocl Not Empty</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ocl Not Empty</em>'.
   * @see org.ebix.umm.umm.OclNotEmpty
   * @generated
   */
  EClass getOclNotEmpty();

  /**
   * Returns the meta object for class '{@link org.ebix.umm.umm.OclSize <em>Ocl Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ocl Size</em>'.
   * @see org.ebix.umm.umm.OclSize
   * @generated
   */
  EClass getOclSize();

  /**
   * Returns the meta object for class '{@link org.ebix.umm.umm.OclLiteral <em>Ocl Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ocl Literal</em>'.
   * @see org.ebix.umm.umm.OclLiteral
   * @generated
   */
  EClass getOclLiteral();

  /**
   * Returns the meta object for class '{@link org.ebix.umm.umm.OclEnumerationLiteral <em>Ocl Enumeration Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ocl Enumeration Literal</em>'.
   * @see org.ebix.umm.umm.OclEnumerationLiteral
   * @generated
   */
  EClass getOclEnumerationLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.OclEnumerationLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.ebix.umm.umm.OclEnumerationLiteral#getValue()
   * @see #getOclEnumerationLiteral()
   * @generated
   */
  EAttribute getOclEnumerationLiteral_Value();

  /**
   * Returns the meta object for class '{@link org.ebix.umm.umm.OclIntegerLiteral <em>Ocl Integer Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ocl Integer Literal</em>'.
   * @see org.ebix.umm.umm.OclIntegerLiteral
   * @generated
   */
  EClass getOclIntegerLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.OclIntegerLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.ebix.umm.umm.OclIntegerLiteral#getValue()
   * @see #getOclIntegerLiteral()
   * @generated
   */
  EAttribute getOclIntegerLiteral_Value();

  /**
   * Returns the meta object for class '{@link org.ebix.umm.umm.OclStringLiteral <em>Ocl String Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ocl String Literal</em>'.
   * @see org.ebix.umm.umm.OclStringLiteral
   * @generated
   */
  EClass getOclStringLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.ebix.umm.umm.OclStringLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.ebix.umm.umm.OclStringLiteral#getValue()
   * @see #getOclStringLiteral()
   * @generated
   */
  EAttribute getOclStringLiteral_Value();

  /**
   * Returns the meta object for class '{@link org.ebix.umm.umm.OclBooleanLiteral <em>Ocl Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ocl Boolean Literal</em>'.
   * @see org.ebix.umm.umm.OclBooleanLiteral
   * @generated
   */
  EClass getOclBooleanLiteral();

  /**
   * Returns the meta object for class '{@link org.ebix.umm.umm.OclBooleanFalse <em>Ocl Boolean False</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ocl Boolean False</em>'.
   * @see org.ebix.umm.umm.OclBooleanFalse
   * @generated
   */
  EClass getOclBooleanFalse();

  /**
   * Returns the meta object for class '{@link org.ebix.umm.umm.OclImplies <em>Ocl Implies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ocl Implies</em>'.
   * @see org.ebix.umm.umm.OclImplies
   * @generated
   */
  EClass getOclImplies();

  /**
   * Returns the meta object for the containment reference '{@link org.ebix.umm.umm.OclImplies#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.ebix.umm.umm.OclImplies#getLeft()
   * @see #getOclImplies()
   * @generated
   */
  EReference getOclImplies_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.ebix.umm.umm.OclImplies#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.ebix.umm.umm.OclImplies#getRight()
   * @see #getOclImplies()
   * @generated
   */
  EReference getOclImplies_Right();

  /**
   * Returns the meta object for class '{@link org.ebix.umm.umm.OclAnd <em>Ocl And</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ocl And</em>'.
   * @see org.ebix.umm.umm.OclAnd
   * @generated
   */
  EClass getOclAnd();

  /**
   * Returns the meta object for the containment reference '{@link org.ebix.umm.umm.OclAnd#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.ebix.umm.umm.OclAnd#getLeft()
   * @see #getOclAnd()
   * @generated
   */
  EReference getOclAnd_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.ebix.umm.umm.OclAnd#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.ebix.umm.umm.OclAnd#getRight()
   * @see #getOclAnd()
   * @generated
   */
  EReference getOclAnd_Right();

  /**
   * Returns the meta object for class '{@link org.ebix.umm.umm.OclOr <em>Ocl Or</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ocl Or</em>'.
   * @see org.ebix.umm.umm.OclOr
   * @generated
   */
  EClass getOclOr();

  /**
   * Returns the meta object for the containment reference '{@link org.ebix.umm.umm.OclOr#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.ebix.umm.umm.OclOr#getLeft()
   * @see #getOclOr()
   * @generated
   */
  EReference getOclOr_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.ebix.umm.umm.OclOr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.ebix.umm.umm.OclOr#getRight()
   * @see #getOclOr()
   * @generated
   */
  EReference getOclOr_Right();

  /**
   * Returns the meta object for class '{@link org.ebix.umm.umm.OclXor <em>Ocl Xor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ocl Xor</em>'.
   * @see org.ebix.umm.umm.OclXor
   * @generated
   */
  EClass getOclXor();

  /**
   * Returns the meta object for the containment reference '{@link org.ebix.umm.umm.OclXor#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.ebix.umm.umm.OclXor#getLeft()
   * @see #getOclXor()
   * @generated
   */
  EReference getOclXor_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.ebix.umm.umm.OclXor#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.ebix.umm.umm.OclXor#getRight()
   * @see #getOclXor()
   * @generated
   */
  EReference getOclXor_Right();

  /**
   * Returns the meta object for class '{@link org.ebix.umm.umm.OclEqual <em>Ocl Equal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ocl Equal</em>'.
   * @see org.ebix.umm.umm.OclEqual
   * @generated
   */
  EClass getOclEqual();

  /**
   * Returns the meta object for the containment reference '{@link org.ebix.umm.umm.OclEqual#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.ebix.umm.umm.OclEqual#getLeft()
   * @see #getOclEqual()
   * @generated
   */
  EReference getOclEqual_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.ebix.umm.umm.OclEqual#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.ebix.umm.umm.OclEqual#getRight()
   * @see #getOclEqual()
   * @generated
   */
  EReference getOclEqual_Right();

  /**
   * Returns the meta object for class '{@link org.ebix.umm.umm.OclLess <em>Ocl Less</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ocl Less</em>'.
   * @see org.ebix.umm.umm.OclLess
   * @generated
   */
  EClass getOclLess();

  /**
   * Returns the meta object for the containment reference '{@link org.ebix.umm.umm.OclLess#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.ebix.umm.umm.OclLess#getLeft()
   * @see #getOclLess()
   * @generated
   */
  EReference getOclLess_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.ebix.umm.umm.OclLess#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.ebix.umm.umm.OclLess#getRight()
   * @see #getOclLess()
   * @generated
   */
  EReference getOclLess_Right();

  /**
   * Returns the meta object for class '{@link org.ebix.umm.umm.OclLessOrEqual <em>Ocl Less Or Equal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ocl Less Or Equal</em>'.
   * @see org.ebix.umm.umm.OclLessOrEqual
   * @generated
   */
  EClass getOclLessOrEqual();

  /**
   * Returns the meta object for the containment reference '{@link org.ebix.umm.umm.OclLessOrEqual#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.ebix.umm.umm.OclLessOrEqual#getLeft()
   * @see #getOclLessOrEqual()
   * @generated
   */
  EReference getOclLessOrEqual_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.ebix.umm.umm.OclLessOrEqual#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.ebix.umm.umm.OclLessOrEqual#getRight()
   * @see #getOclLessOrEqual()
   * @generated
   */
  EReference getOclLessOrEqual_Right();

  /**
   * Returns the meta object for class '{@link org.ebix.umm.umm.OclMore <em>Ocl More</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ocl More</em>'.
   * @see org.ebix.umm.umm.OclMore
   * @generated
   */
  EClass getOclMore();

  /**
   * Returns the meta object for the containment reference '{@link org.ebix.umm.umm.OclMore#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.ebix.umm.umm.OclMore#getLeft()
   * @see #getOclMore()
   * @generated
   */
  EReference getOclMore_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.ebix.umm.umm.OclMore#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.ebix.umm.umm.OclMore#getRight()
   * @see #getOclMore()
   * @generated
   */
  EReference getOclMore_Right();

  /**
   * Returns the meta object for class '{@link org.ebix.umm.umm.OclMoreOrEqual <em>Ocl More Or Equal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ocl More Or Equal</em>'.
   * @see org.ebix.umm.umm.OclMoreOrEqual
   * @generated
   */
  EClass getOclMoreOrEqual();

  /**
   * Returns the meta object for the containment reference '{@link org.ebix.umm.umm.OclMoreOrEqual#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.ebix.umm.umm.OclMoreOrEqual#getLeft()
   * @see #getOclMoreOrEqual()
   * @generated
   */
  EReference getOclMoreOrEqual_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.ebix.umm.umm.OclMoreOrEqual#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.ebix.umm.umm.OclMoreOrEqual#getRight()
   * @see #getOclMoreOrEqual()
   * @generated
   */
  EReference getOclMoreOrEqual_Right();

  /**
   * Returns the meta object for class '{@link org.ebix.umm.umm.OclArrow <em>Ocl Arrow</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ocl Arrow</em>'.
   * @see org.ebix.umm.umm.OclArrow
   * @generated
   */
  EClass getOclArrow();

  /**
   * Returns the meta object for the containment reference '{@link org.ebix.umm.umm.OclArrow#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.ebix.umm.umm.OclArrow#getLeft()
   * @see #getOclArrow()
   * @generated
   */
  EReference getOclArrow_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.ebix.umm.umm.OclArrow#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.ebix.umm.umm.OclArrow#getRight()
   * @see #getOclArrow()
   * @generated
   */
  EReference getOclArrow_Right();

  /**
   * Returns the meta object for class '{@link org.ebix.umm.umm.OclBooleanTrue <em>Ocl Boolean True</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ocl Boolean True</em>'.
   * @see org.ebix.umm.umm.OclBooleanTrue
   * @generated
   */
  EClass getOclBooleanTrue();

  /**
   * Returns the meta object for enum '{@link org.ebix.umm.umm.ConstraintKind <em>Constraint Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Constraint Kind</em>'.
   * @see org.ebix.umm.umm.ConstraintKind
   * @generated
   */
  EEnum getConstraintKind();

  /**
   * Returns the meta object for enum '{@link org.ebix.umm.umm.MultiplicityKind <em>Multiplicity Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Multiplicity Kind</em>'.
   * @see org.ebix.umm.umm.MultiplicityKind
   * @generated
   */
  EEnum getMultiplicityKind();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  UmmFactory getUmmFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.ebix.umm.umm.impl.LibraryImpl <em>Library</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ebix.umm.umm.impl.LibraryImpl
     * @see org.ebix.umm.umm.impl.UmmPackageImpl#getLibrary()
     * @generated
     */
    EClass LIBRARY = eINSTANCE.getLibrary();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LIBRARY__NAME = eINSTANCE.getLibrary_Name();

    /**
     * The meta object literal for the '{@link org.ebix.umm.umm.impl.DocLibraryImpl <em>Doc Library</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ebix.umm.umm.impl.DocLibraryImpl
     * @see org.ebix.umm.umm.impl.UmmPackageImpl#getDocLibrary()
     * @generated
     */
    EClass DOC_LIBRARY = eINSTANCE.getDocLibrary();

    /**
     * The meta object literal for the '<em><b>Business Term</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOC_LIBRARY__BUSINESS_TERM = eINSTANCE.getDocLibrary_BusinessTerm();

    /**
     * The meta object literal for the '<em><b>Copyright</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOC_LIBRARY__COPYRIGHT = eINSTANCE.getDocLibrary_Copyright();

    /**
     * The meta object literal for the '<em><b>Owner</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOC_LIBRARY__OWNER = eINSTANCE.getDocLibrary_Owner();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOC_LIBRARY__REFERENCE = eINSTANCE.getDocLibrary_Reference();

    /**
     * The meta object literal for the '<em><b>Unique Identifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOC_LIBRARY__UNIQUE_IDENTIFIER = eINSTANCE.getDocLibrary_UniqueIdentifier();

    /**
     * The meta object literal for the '<em><b>Version Identifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOC_LIBRARY__VERSION_IDENTIFIER = eINSTANCE.getDocLibrary_VersionIdentifier();

    /**
     * The meta object literal for the '<em><b>Base URN</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOC_LIBRARY__BASE_URN = eINSTANCE.getDocLibrary_BaseURN();

    /**
     * The meta object literal for the '<em><b>Namespace Prefix</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOC_LIBRARY__NAMESPACE_PREFIX = eINSTANCE.getDocLibrary_NamespacePrefix();

    /**
     * The meta object literal for the '<em><b>Bie Library</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOC_LIBRARY__BIE_LIBRARY = eINSTANCE.getDocLibrary_BieLibrary();

    /**
     * The meta object literal for the '<em><b>Bdt Library</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOC_LIBRARY__BDT_LIBRARY = eINSTANCE.getDocLibrary_BdtLibrary();

    /**
     * The meta object literal for the '<em><b>Envelopes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOC_LIBRARY__ENVELOPES = eINSTANCE.getDocLibrary_Envelopes();

    /**
     * The meta object literal for the '{@link org.ebix.umm.umm.impl.InfEnvelopeImpl <em>Inf Envelope</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ebix.umm.umm.impl.InfEnvelopeImpl
     * @see org.ebix.umm.umm.impl.UmmPackageImpl#getInfEnvelope()
     * @generated
     */
    EClass INF_ENVELOPE = eINSTANCE.getInfEnvelope();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INF_ENVELOPE__NAME = eINSTANCE.getInfEnvelope_Name();

    /**
     * The meta object literal for the '<em><b>Assemblies</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INF_ENVELOPE__ASSEMBLIES = eINSTANCE.getInfEnvelope_Assemblies();

    /**
     * The meta object literal for the '{@link org.ebix.umm.umm.impl.MAImpl <em>MA</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ebix.umm.umm.impl.MAImpl
     * @see org.ebix.umm.umm.impl.UmmPackageImpl#getMA()
     * @generated
     */
    EClass MA = eINSTANCE.getMA();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MA__PROPERTIES = eINSTANCE.getMA_Properties();

    /**
     * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MA__CONSTRAINTS = eINSTANCE.getMA_Constraints();

    /**
     * The meta object literal for the '{@link org.ebix.umm.umm.impl.MAPropertyImpl <em>MA Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ebix.umm.umm.impl.MAPropertyImpl
     * @see org.ebix.umm.umm.impl.UmmPackageImpl#getMAProperty()
     * @generated
     */
    EClass MA_PROPERTY = eINSTANCE.getMAProperty();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MA_PROPERTY__TYPE = eINSTANCE.getMAProperty_Type();

    /**
     * The meta object literal for the '{@link org.ebix.umm.umm.impl.ASMAImpl <em>ASMA</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ebix.umm.umm.impl.ASMAImpl
     * @see org.ebix.umm.umm.impl.UmmPackageImpl#getASMA()
     * @generated
     */
    EClass ASMA = eINSTANCE.getASMA();

    /**
     * The meta object literal for the '{@link org.ebix.umm.umm.impl.ASNONEImpl <em>ASNONE</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ebix.umm.umm.impl.ASNONEImpl
     * @see org.ebix.umm.umm.impl.UmmPackageImpl#getASNONE()
     * @generated
     */
    EClass ASNONE = eINSTANCE.getASNONE();

    /**
     * The meta object literal for the '{@link org.ebix.umm.umm.impl.ConstraintImpl <em>Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ebix.umm.umm.impl.ConstraintImpl
     * @see org.ebix.umm.umm.impl.UmmPackageImpl#getConstraint()
     * @generated
     */
    EClass CONSTRAINT = eINSTANCE.getConstraint();

    /**
     * The meta object literal for the '<em><b>Context</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRAINT__CONTEXT = eINSTANCE.getConstraint_Context();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRAINT__TYPE = eINSTANCE.getConstraint_Type();

    /**
     * The meta object literal for the '<em><b>Invariants</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRAINT__INVARIANTS = eINSTANCE.getConstraint_Invariants();

    /**
     * The meta object literal for the '{@link org.ebix.umm.umm.impl.ContextRefImpl <em>Context Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ebix.umm.umm.impl.ContextRefImpl
     * @see org.ebix.umm.umm.impl.UmmPackageImpl#getContextRef()
     * @generated
     */
    EClass CONTEXT_REF = eINSTANCE.getContextRef();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTEXT_REF__NAME = eINSTANCE.getContextRef_Name();

    /**
     * The meta object literal for the '{@link org.ebix.umm.umm.impl.TC_ConstraintImpl <em>TC Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ebix.umm.umm.impl.TC_ConstraintImpl
     * @see org.ebix.umm.umm.impl.UmmPackageImpl#getTC_Constraint()
     * @generated
     */
    EClass TC_CONSTRAINT = eINSTANCE.getTC_Constraint();

    /**
     * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TC_CONSTRAINT__KIND = eINSTANCE.getTC_Constraint_Kind();

    /**
     * The meta object literal for the '<em><b>List Identifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TC_CONSTRAINT__LIST_IDENTIFIER = eINSTANCE.getTC_Constraint_ListIdentifier();

    /**
     * The meta object literal for the '<em><b>Responsible Agency</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TC_CONSTRAINT__RESPONSIBLE_AGENCY = eINSTANCE.getTC_Constraint_ResponsibleAgency();

    /**
     * The meta object literal for the '{@link org.ebix.umm.umm.impl.BIELibraryImpl <em>BIE Library</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ebix.umm.umm.impl.BIELibraryImpl
     * @see org.ebix.umm.umm.impl.UmmPackageImpl#getBIELibrary()
     * @generated
     */
    EClass BIE_LIBRARY = eINSTANCE.getBIELibrary();

    /**
     * The meta object literal for the '<em><b>Business Term</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BIE_LIBRARY__BUSINESS_TERM = eINSTANCE.getBIELibrary_BusinessTerm();

    /**
     * The meta object literal for the '<em><b>Copyright</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BIE_LIBRARY__COPYRIGHT = eINSTANCE.getBIELibrary_Copyright();

    /**
     * The meta object literal for the '<em><b>Owner</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BIE_LIBRARY__OWNER = eINSTANCE.getBIELibrary_Owner();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BIE_LIBRARY__REFERENCE = eINSTANCE.getBIELibrary_Reference();

    /**
     * The meta object literal for the '<em><b>Unique Identifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BIE_LIBRARY__UNIQUE_IDENTIFIER = eINSTANCE.getBIELibrary_UniqueIdentifier();

    /**
     * The meta object literal for the '<em><b>Version Identifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BIE_LIBRARY__VERSION_IDENTIFIER = eINSTANCE.getBIELibrary_VersionIdentifier();

    /**
     * The meta object literal for the '<em><b>Base URN</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BIE_LIBRARY__BASE_URN = eINSTANCE.getBIELibrary_BaseURN();

    /**
     * The meta object literal for the '<em><b>Namespace Prefix</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BIE_LIBRARY__NAMESPACE_PREFIX = eINSTANCE.getBIELibrary_NamespacePrefix();

    /**
     * The meta object literal for the '<em><b>Bdt Library</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BIE_LIBRARY__BDT_LIBRARY = eINSTANCE.getBIELibrary_BdtLibrary();

    /**
     * The meta object literal for the '<em><b>Abies</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BIE_LIBRARY__ABIES = eINSTANCE.getBIELibrary_Abies();

    /**
     * The meta object literal for the '{@link org.ebix.umm.umm.impl.ABIEImpl <em>ABIE</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ebix.umm.umm.impl.ABIEImpl
     * @see org.ebix.umm.umm.impl.UmmPackageImpl#getABIE()
     * @generated
     */
    EClass ABIE = eINSTANCE.getABIE();

    /**
     * The meta object literal for the '<em><b>Business Term</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABIE__BUSINESS_TERM = eINSTANCE.getABIE_BusinessTerm();

    /**
     * The meta object literal for the '<em><b>Definition</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABIE__DEFINITION = eINSTANCE.getABIE_Definition();

    /**
     * The meta object literal for the '<em><b>Dictionary</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABIE__DICTIONARY = eINSTANCE.getABIE_Dictionary();

    /**
     * The meta object literal for the '<em><b>Unique Identifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABIE__UNIQUE_IDENTIFIER = eINSTANCE.getABIE_UniqueIdentifier();

    /**
     * The meta object literal for the '<em><b>Version Identifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABIE__VERSION_IDENTIFIER = eINSTANCE.getABIE_VersionIdentifier();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABIE__PROPERTIES = eINSTANCE.getABIE_Properties();

    /**
     * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABIE__CONSTRAINTS = eINSTANCE.getABIE_Constraints();

    /**
     * The meta object literal for the '{@link org.ebix.umm.umm.impl.ABIEPropertyImpl <em>ABIE Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ebix.umm.umm.impl.ABIEPropertyImpl
     * @see org.ebix.umm.umm.impl.UmmPackageImpl#getABIEProperty()
     * @generated
     */
    EClass ABIE_PROPERTY = eINSTANCE.getABIEProperty();

    /**
     * The meta object literal for the '<em><b>Or</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABIE_PROPERTY__OR = eINSTANCE.getABIEProperty_Or();

    /**
     * The meta object literal for the '<em><b>Business Term</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABIE_PROPERTY__BUSINESS_TERM = eINSTANCE.getABIEProperty_BusinessTerm();

    /**
     * The meta object literal for the '<em><b>Definition</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABIE_PROPERTY__DEFINITION = eINSTANCE.getABIEProperty_Definition();

    /**
     * The meta object literal for the '<em><b>Dictionary</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABIE_PROPERTY__DICTIONARY = eINSTANCE.getABIEProperty_Dictionary();

    /**
     * The meta object literal for the '<em><b>Unique Identifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABIE_PROPERTY__UNIQUE_IDENTIFIER = eINSTANCE.getABIEProperty_UniqueIdentifier();

    /**
     * The meta object literal for the '<em><b>Version Identifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABIE_PROPERTY__VERSION_IDENTIFIER = eINSTANCE.getABIEProperty_VersionIdentifier();

    /**
     * The meta object literal for the '<em><b>Sequencing Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABIE_PROPERTY__SEQUENCING_KEY = eINSTANCE.getABIEProperty_SequencingKey();

    /**
     * The meta object literal for the '{@link org.ebix.umm.umm.impl.ASBIEImpl <em>ASBIE</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ebix.umm.umm.impl.ASBIEImpl
     * @see org.ebix.umm.umm.impl.UmmPackageImpl#getASBIE()
     * @generated
     */
    EClass ASBIE = eINSTANCE.getASBIE();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASBIE__TYPE = eINSTANCE.getASBIE_Type();

    /**
     * The meta object literal for the '{@link org.ebix.umm.umm.impl.BBIEImpl <em>BBIE</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ebix.umm.umm.impl.BBIEImpl
     * @see org.ebix.umm.umm.impl.UmmPackageImpl#getBBIE()
     * @generated
     */
    EClass BBIE = eINSTANCE.getBBIE();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BBIE__TYPE = eINSTANCE.getBBIE_Type();

    /**
     * The meta object literal for the '<em><b>Restriction</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BBIE__RESTRICTION = eINSTANCE.getBBIE_Restriction();

    /**
     * The meta object literal for the '<em><b>Fixed Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BBIE__FIXED_VALUE = eINSTANCE.getBBIE_FixedValue();

    /**
     * The meta object literal for the '{@link org.ebix.umm.umm.impl.BDTLibraryImpl <em>BDT Library</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ebix.umm.umm.impl.BDTLibraryImpl
     * @see org.ebix.umm.umm.impl.UmmPackageImpl#getBDTLibrary()
     * @generated
     */
    EClass BDT_LIBRARY = eINSTANCE.getBDTLibrary();

    /**
     * The meta object literal for the '<em><b>Business Term</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BDT_LIBRARY__BUSINESS_TERM = eINSTANCE.getBDTLibrary_BusinessTerm();

    /**
     * The meta object literal for the '<em><b>Copyright</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BDT_LIBRARY__COPYRIGHT = eINSTANCE.getBDTLibrary_Copyright();

    /**
     * The meta object literal for the '<em><b>Owner</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BDT_LIBRARY__OWNER = eINSTANCE.getBDTLibrary_Owner();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BDT_LIBRARY__REFERENCE = eINSTANCE.getBDTLibrary_Reference();

    /**
     * The meta object literal for the '<em><b>Unique Identifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BDT_LIBRARY__UNIQUE_IDENTIFIER = eINSTANCE.getBDTLibrary_UniqueIdentifier();

    /**
     * The meta object literal for the '<em><b>Version Identifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BDT_LIBRARY__VERSION_IDENTIFIER = eINSTANCE.getBDTLibrary_VersionIdentifier();

    /**
     * The meta object literal for the '<em><b>Base URN</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BDT_LIBRARY__BASE_URN = eINSTANCE.getBDTLibrary_BaseURN();

    /**
     * The meta object literal for the '<em><b>Namespace Prefix</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BDT_LIBRARY__NAMESPACE_PREFIX = eINSTANCE.getBDTLibrary_NamespacePrefix();

    /**
     * The meta object literal for the '<em><b>Bdts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BDT_LIBRARY__BDTS = eINSTANCE.getBDTLibrary_Bdts();

    /**
     * The meta object literal for the '{@link org.ebix.umm.umm.impl.BDTImpl <em>BDT</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ebix.umm.umm.impl.BDTImpl
     * @see org.ebix.umm.umm.impl.UmmPackageImpl#getBDT()
     * @generated
     */
    EClass BDT = eINSTANCE.getBDT();

    /**
     * The meta object literal for the '<em><b>Business Term</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BDT__BUSINESS_TERM = eINSTANCE.getBDT_BusinessTerm();

    /**
     * The meta object literal for the '<em><b>Definition</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BDT__DEFINITION = eINSTANCE.getBDT_Definition();

    /**
     * The meta object literal for the '<em><b>Dictionary</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BDT__DICTIONARY = eINSTANCE.getBDT_Dictionary();

    /**
     * The meta object literal for the '<em><b>Unique Identifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BDT__UNIQUE_IDENTIFIER = eINSTANCE.getBDT_UniqueIdentifier();

    /**
     * The meta object literal for the '<em><b>Version Identifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BDT__VERSION_IDENTIFIER = eINSTANCE.getBDT_VersionIdentifier();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BDT__PROPERTIES = eINSTANCE.getBDT_Properties();

    /**
     * The meta object literal for the '{@link org.ebix.umm.umm.impl.BDTPropertyImpl <em>BDT Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ebix.umm.umm.impl.BDTPropertyImpl
     * @see org.ebix.umm.umm.impl.UmmPackageImpl#getBDTProperty()
     * @generated
     */
    EClass BDT_PROPERTY = eINSTANCE.getBDTProperty();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BDT_PROPERTY__TYPE = eINSTANCE.getBDTProperty_Type();

    /**
     * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BDT_PROPERTY__PATTERN = eINSTANCE.getBDTProperty_Pattern();

    /**
     * The meta object literal for the '<em><b>Min Length</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BDT_PROPERTY__MIN_LENGTH = eINSTANCE.getBDTProperty_MinLength();

    /**
     * The meta object literal for the '<em><b>Max Length</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BDT_PROPERTY__MAX_LENGTH = eINSTANCE.getBDTProperty_MaxLength();

    /**
     * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BDT_PROPERTY__LENGTH = eINSTANCE.getBDTProperty_Length();

    /**
     * The meta object literal for the '<em><b>Business Term</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BDT_PROPERTY__BUSINESS_TERM = eINSTANCE.getBDTProperty_BusinessTerm();

    /**
     * The meta object literal for the '<em><b>Definition</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BDT_PROPERTY__DEFINITION = eINSTANCE.getBDTProperty_Definition();

    /**
     * The meta object literal for the '<em><b>Dictionary</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BDT_PROPERTY__DICTIONARY = eINSTANCE.getBDTProperty_Dictionary();

    /**
     * The meta object literal for the '<em><b>Unique Identifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BDT_PROPERTY__UNIQUE_IDENTIFIER = eINSTANCE.getBDTProperty_UniqueIdentifier();

    /**
     * The meta object literal for the '<em><b>Version Identifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BDT_PROPERTY__VERSION_IDENTIFIER = eINSTANCE.getBDTProperty_VersionIdentifier();

    /**
     * The meta object literal for the '{@link org.ebix.umm.umm.impl.ContentImpl <em>Content</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ebix.umm.umm.impl.ContentImpl
     * @see org.ebix.umm.umm.impl.UmmPackageImpl#getContent()
     * @generated
     */
    EClass CONTENT = eINSTANCE.getContent();

    /**
     * The meta object literal for the '{@link org.ebix.umm.umm.impl.SupplementImpl <em>Supplement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ebix.umm.umm.impl.SupplementImpl
     * @see org.ebix.umm.umm.impl.UmmPackageImpl#getSupplement()
     * @generated
     */
    EClass SUPPLEMENT = eINSTANCE.getSupplement();

    /**
     * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUPPLEMENT__DEFAULT_VALUE = eINSTANCE.getSupplement_DefaultValue();

    /**
     * The meta object literal for the '<em><b>Restriction</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUPPLEMENT__RESTRICTION = eINSTANCE.getSupplement_Restriction();

    /**
     * The meta object literal for the '<em><b>Fixed Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUPPLEMENT__FIXED_VALUE = eINSTANCE.getSupplement_FixedValue();

    /**
     * The meta object literal for the '{@link org.ebix.umm.umm.impl.ENUMLibraryImpl <em>ENUM Library</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ebix.umm.umm.impl.ENUMLibraryImpl
     * @see org.ebix.umm.umm.impl.UmmPackageImpl#getENUMLibrary()
     * @generated
     */
    EClass ENUM_LIBRARY = eINSTANCE.getENUMLibrary();

    /**
     * The meta object literal for the '<em><b>Business Term</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_LIBRARY__BUSINESS_TERM = eINSTANCE.getENUMLibrary_BusinessTerm();

    /**
     * The meta object literal for the '<em><b>Copyright</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_LIBRARY__COPYRIGHT = eINSTANCE.getENUMLibrary_Copyright();

    /**
     * The meta object literal for the '<em><b>Owner</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_LIBRARY__OWNER = eINSTANCE.getENUMLibrary_Owner();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_LIBRARY__REFERENCE = eINSTANCE.getENUMLibrary_Reference();

    /**
     * The meta object literal for the '<em><b>Unique Identifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_LIBRARY__UNIQUE_IDENTIFIER = eINSTANCE.getENUMLibrary_UniqueIdentifier();

    /**
     * The meta object literal for the '<em><b>Version Identifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_LIBRARY__VERSION_IDENTIFIER = eINSTANCE.getENUMLibrary_VersionIdentifier();

    /**
     * The meta object literal for the '<em><b>Base URN</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_LIBRARY__BASE_URN = eINSTANCE.getENUMLibrary_BaseURN();

    /**
     * The meta object literal for the '<em><b>Namespace Prefix</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_LIBRARY__NAMESPACE_PREFIX = eINSTANCE.getENUMLibrary_NamespacePrefix();

    /**
     * The meta object literal for the '<em><b>Enums</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_LIBRARY__ENUMS = eINSTANCE.getENUMLibrary_Enums();

    /**
     * The meta object literal for the '{@link org.ebix.umm.umm.impl.ENUMImpl <em>ENUM</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ebix.umm.umm.impl.ENUMImpl
     * @see org.ebix.umm.umm.impl.UmmPackageImpl#getENUM()
     * @generated
     */
    EClass ENUM = eINSTANCE.getENUM();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM__NAME = eINSTANCE.getENUM_Name();

    /**
     * The meta object literal for the '<em><b>Business Term</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM__BUSINESS_TERM = eINSTANCE.getENUM_BusinessTerm();

    /**
     * The meta object literal for the '<em><b>Definition</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM__DEFINITION = eINSTANCE.getENUM_Definition();

    /**
     * The meta object literal for the '<em><b>Code List Agency Identifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM__CODE_LIST_AGENCY_IDENTIFIER = eINSTANCE.getENUM_CodeListAgencyIdentifier();

    /**
     * The meta object literal for the '<em><b>Code List Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM__CODE_LIST_NAME = eINSTANCE.getENUM_CodeListName();

    /**
     * The meta object literal for the '<em><b>Code List Identifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM__CODE_LIST_IDENTIFIER = eINSTANCE.getENUM_CodeListIdentifier();

    /**
     * The meta object literal for the '<em><b>Dictionary</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM__DICTIONARY = eINSTANCE.getENUM_Dictionary();

    /**
     * The meta object literal for the '<em><b>Unique Identifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM__UNIQUE_IDENTIFIER = eINSTANCE.getENUM_UniqueIdentifier();

    /**
     * The meta object literal for the '<em><b>Version Identifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM__VERSION_IDENTIFIER = eINSTANCE.getENUM_VersionIdentifier();

    /**
     * The meta object literal for the '{@link org.ebix.umm.umm.impl.AssembledBaseImpl <em>Assembled Base</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ebix.umm.umm.impl.AssembledBaseImpl
     * @see org.ebix.umm.umm.impl.UmmPackageImpl#getAssembledBase()
     * @generated
     */
    EClass ASSEMBLED_BASE = eINSTANCE.getAssembledBase();

    /**
     * The meta object literal for the '{@link org.ebix.umm.umm.impl.PrimitiveImpl <em>Primitive</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ebix.umm.umm.impl.PrimitiveImpl
     * @see org.ebix.umm.umm.impl.UmmPackageImpl#getPrimitive()
     * @generated
     */
    EClass PRIMITIVE = eINSTANCE.getPrimitive();

    /**
     * The meta object literal for the '{@link org.ebix.umm.umm.impl.AssembledImpl <em>Assembled</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ebix.umm.umm.impl.AssembledImpl
     * @see org.ebix.umm.umm.impl.UmmPackageImpl#getAssembled()
     * @generated
     */
    EClass ASSEMBLED = eINSTANCE.getAssembled();

    /**
     * The meta object literal for the '<em><b>Originals</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSEMBLED__ORIGINALS = eINSTANCE.getAssembled_Originals();

    /**
     * The meta object literal for the '<em><b>Subsets</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSEMBLED__SUBSETS = eINSTANCE.getAssembled_Subsets();

    /**
     * The meta object literal for the '{@link org.ebix.umm.umm.impl.OriginalImpl <em>Original</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ebix.umm.umm.impl.OriginalImpl
     * @see org.ebix.umm.umm.impl.UmmPackageImpl#getOriginal()
     * @generated
     */
    EClass ORIGINAL = eINSTANCE.getOriginal();

    /**
     * The meta object literal for the '<em><b>Codes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ORIGINAL__CODES = eINSTANCE.getOriginal_Codes();

    /**
     * The meta object literal for the '{@link org.ebix.umm.umm.impl.SubsetImpl <em>Subset</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ebix.umm.umm.impl.SubsetImpl
     * @see org.ebix.umm.umm.impl.UmmPackageImpl#getSubset()
     * @generated
     */
    EClass SUBSET = eINSTANCE.getSubset();

    /**
     * The meta object literal for the '<em><b>Codes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUBSET__CODES = eINSTANCE.getSubset_Codes();

    /**
     * The meta object literal for the '{@link org.ebix.umm.umm.impl.CodelistEntryImpl <em>Codelist Entry</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ebix.umm.umm.impl.CodelistEntryImpl
     * @see org.ebix.umm.umm.impl.UmmPackageImpl#getCodelistEntry()
     * @generated
     */
    EClass CODELIST_ENTRY = eINSTANCE.getCodelistEntry();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CODELIST_ENTRY__NAME = eINSTANCE.getCodelistEntry_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CODELIST_ENTRY__DESCRIPTION = eINSTANCE.getCodelistEntry_Description();

    /**
     * The meta object literal for the '{@link org.ebix.umm.umm.impl.CCLibraryImpl <em>CC Library</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ebix.umm.umm.impl.CCLibraryImpl
     * @see org.ebix.umm.umm.impl.UmmPackageImpl#getCCLibrary()
     * @generated
     */
    EClass CC_LIBRARY = eINSTANCE.getCCLibrary();

    /**
     * The meta object literal for the '<em><b>Business Term</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CC_LIBRARY__BUSINESS_TERM = eINSTANCE.getCCLibrary_BusinessTerm();

    /**
     * The meta object literal for the '<em><b>Copyright</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CC_LIBRARY__COPYRIGHT = eINSTANCE.getCCLibrary_Copyright();

    /**
     * The meta object literal for the '<em><b>Owner</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CC_LIBRARY__OWNER = eINSTANCE.getCCLibrary_Owner();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CC_LIBRARY__REFERENCE = eINSTANCE.getCCLibrary_Reference();

    /**
     * The meta object literal for the '<em><b>Unique Identifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CC_LIBRARY__UNIQUE_IDENTIFIER = eINSTANCE.getCCLibrary_UniqueIdentifier();

    /**
     * The meta object literal for the '<em><b>Version Identifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CC_LIBRARY__VERSION_IDENTIFIER = eINSTANCE.getCCLibrary_VersionIdentifier();

    /**
     * The meta object literal for the '<em><b>Base URN</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CC_LIBRARY__BASE_URN = eINSTANCE.getCCLibrary_BaseURN();

    /**
     * The meta object literal for the '<em><b>Namespace Prefix</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CC_LIBRARY__NAMESPACE_PREFIX = eINSTANCE.getCCLibrary_NamespacePrefix();

    /**
     * The meta object literal for the '<em><b>Accs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CC_LIBRARY__ACCS = eINSTANCE.getCCLibrary_Accs();

    /**
     * The meta object literal for the '{@link org.ebix.umm.umm.impl.ACCImpl <em>ACC</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ebix.umm.umm.impl.ACCImpl
     * @see org.ebix.umm.umm.impl.UmmPackageImpl#getACC()
     * @generated
     */
    EClass ACC = eINSTANCE.getACC();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACC__NAME = eINSTANCE.getACC_Name();

    /**
     * The meta object literal for the '<em><b>Business Term</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACC__BUSINESS_TERM = eINSTANCE.getACC_BusinessTerm();

    /**
     * The meta object literal for the '<em><b>Definition</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACC__DEFINITION = eINSTANCE.getACC_Definition();

    /**
     * The meta object literal for the '<em><b>Dictionary</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACC__DICTIONARY = eINSTANCE.getACC_Dictionary();

    /**
     * The meta object literal for the '<em><b>Unique Identifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACC__UNIQUE_IDENTIFIER = eINSTANCE.getACC_UniqueIdentifier();

    /**
     * The meta object literal for the '<em><b>Version Identifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACC__VERSION_IDENTIFIER = eINSTANCE.getACC_VersionIdentifier();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACC__PROPERTIES = eINSTANCE.getACC_Properties();

    /**
     * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACC__CONSTRAINTS = eINSTANCE.getACC_Constraints();

    /**
     * The meta object literal for the '{@link org.ebix.umm.umm.impl.ACCPropertyImpl <em>ACC Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ebix.umm.umm.impl.ACCPropertyImpl
     * @see org.ebix.umm.umm.impl.UmmPackageImpl#getACCProperty()
     * @generated
     */
    EClass ACC_PROPERTY = eINSTANCE.getACCProperty();

    /**
     * The meta object literal for the '<em><b>Multiplicity</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACC_PROPERTY__MULTIPLICITY = eINSTANCE.getACCProperty_Multiplicity();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACC_PROPERTY__NAME = eINSTANCE.getACCProperty_Name();

    /**
     * The meta object literal for the '<em><b>Business Term</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACC_PROPERTY__BUSINESS_TERM = eINSTANCE.getACCProperty_BusinessTerm();

    /**
     * The meta object literal for the '<em><b>Definition</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACC_PROPERTY__DEFINITION = eINSTANCE.getACCProperty_Definition();

    /**
     * The meta object literal for the '<em><b>Dictionary</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACC_PROPERTY__DICTIONARY = eINSTANCE.getACCProperty_Dictionary();

    /**
     * The meta object literal for the '<em><b>Unique Identifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACC_PROPERTY__UNIQUE_IDENTIFIER = eINSTANCE.getACCProperty_UniqueIdentifier();

    /**
     * The meta object literal for the '<em><b>Version Identifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACC_PROPERTY__VERSION_IDENTIFIER = eINSTANCE.getACCProperty_VersionIdentifier();

    /**
     * The meta object literal for the '<em><b>Sequencing Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACC_PROPERTY__SEQUENCING_KEY = eINSTANCE.getACCProperty_SequencingKey();

    /**
     * The meta object literal for the '{@link org.ebix.umm.umm.impl.ASCCImpl <em>ASCC</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ebix.umm.umm.impl.ASCCImpl
     * @see org.ebix.umm.umm.impl.UmmPackageImpl#getASCC()
     * @generated
     */
    EClass ASCC = eINSTANCE.getASCC();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASCC__TYPE = eINSTANCE.getASCC_Type();

    /**
     * The meta object literal for the '{@link org.ebix.umm.umm.impl.BCCImpl <em>BCC</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ebix.umm.umm.impl.BCCImpl
     * @see org.ebix.umm.umm.impl.UmmPackageImpl#getBCC()
     * @generated
     */
    EClass BCC = eINSTANCE.getBCC();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BCC__TYPE = eINSTANCE.getBCC_Type();

    /**
     * The meta object literal for the '<em><b>Restriction</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BCC__RESTRICTION = eINSTANCE.getBCC_Restriction();

    /**
     * The meta object literal for the '<em><b>Fixed Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BCC__FIXED_VALUE = eINSTANCE.getBCC_FixedValue();

    /**
     * The meta object literal for the '{@link org.ebix.umm.umm.impl.CDTLibraryImpl <em>CDT Library</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ebix.umm.umm.impl.CDTLibraryImpl
     * @see org.ebix.umm.umm.impl.UmmPackageImpl#getCDTLibrary()
     * @generated
     */
    EClass CDT_LIBRARY = eINSTANCE.getCDTLibrary();

    /**
     * The meta object literal for the '<em><b>Business Term</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CDT_LIBRARY__BUSINESS_TERM = eINSTANCE.getCDTLibrary_BusinessTerm();

    /**
     * The meta object literal for the '<em><b>Copyright</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CDT_LIBRARY__COPYRIGHT = eINSTANCE.getCDTLibrary_Copyright();

    /**
     * The meta object literal for the '<em><b>Owner</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CDT_LIBRARY__OWNER = eINSTANCE.getCDTLibrary_Owner();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CDT_LIBRARY__REFERENCE = eINSTANCE.getCDTLibrary_Reference();

    /**
     * The meta object literal for the '<em><b>Unique Identifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CDT_LIBRARY__UNIQUE_IDENTIFIER = eINSTANCE.getCDTLibrary_UniqueIdentifier();

    /**
     * The meta object literal for the '<em><b>Version Identifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CDT_LIBRARY__VERSION_IDENTIFIER = eINSTANCE.getCDTLibrary_VersionIdentifier();

    /**
     * The meta object literal for the '<em><b>Base URN</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CDT_LIBRARY__BASE_URN = eINSTANCE.getCDTLibrary_BaseURN();

    /**
     * The meta object literal for the '<em><b>Namespace Prefix</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CDT_LIBRARY__NAMESPACE_PREFIX = eINSTANCE.getCDTLibrary_NamespacePrefix();

    /**
     * The meta object literal for the '<em><b>Cdts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CDT_LIBRARY__CDTS = eINSTANCE.getCDTLibrary_Cdts();

    /**
     * The meta object literal for the '{@link org.ebix.umm.umm.impl.CDTImpl <em>CDT</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ebix.umm.umm.impl.CDTImpl
     * @see org.ebix.umm.umm.impl.UmmPackageImpl#getCDT()
     * @generated
     */
    EClass CDT = eINSTANCE.getCDT();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CDT__NAME = eINSTANCE.getCDT_Name();

    /**
     * The meta object literal for the '<em><b>Business Term</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CDT__BUSINESS_TERM = eINSTANCE.getCDT_BusinessTerm();

    /**
     * The meta object literal for the '<em><b>Definition</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CDT__DEFINITION = eINSTANCE.getCDT_Definition();

    /**
     * The meta object literal for the '<em><b>Dictionary</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CDT__DICTIONARY = eINSTANCE.getCDT_Dictionary();

    /**
     * The meta object literal for the '<em><b>Unique Identifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CDT__UNIQUE_IDENTIFIER = eINSTANCE.getCDT_UniqueIdentifier();

    /**
     * The meta object literal for the '<em><b>Version Identifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CDT__VERSION_IDENTIFIER = eINSTANCE.getCDT_VersionIdentifier();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CDT__PROPERTIES = eINSTANCE.getCDT_Properties();

    /**
     * The meta object literal for the '{@link org.ebix.umm.umm.impl.CDTPropertyImpl <em>CDT Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ebix.umm.umm.impl.CDTPropertyImpl
     * @see org.ebix.umm.umm.impl.UmmPackageImpl#getCDTProperty()
     * @generated
     */
    EClass CDT_PROPERTY = eINSTANCE.getCDTProperty();

    /**
     * The meta object literal for the '<em><b>Multiplicity</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CDT_PROPERTY__MULTIPLICITY = eINSTANCE.getCDTProperty_Multiplicity();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CDT_PROPERTY__NAME = eINSTANCE.getCDTProperty_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CDT_PROPERTY__TYPE = eINSTANCE.getCDTProperty_Type();

    /**
     * The meta object literal for the '<em><b>Business Term</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CDT_PROPERTY__BUSINESS_TERM = eINSTANCE.getCDTProperty_BusinessTerm();

    /**
     * The meta object literal for the '<em><b>Definition</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CDT_PROPERTY__DEFINITION = eINSTANCE.getCDTProperty_Definition();

    /**
     * The meta object literal for the '<em><b>Dictionary</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CDT_PROPERTY__DICTIONARY = eINSTANCE.getCDTProperty_Dictionary();

    /**
     * The meta object literal for the '<em><b>Unique Identifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CDT_PROPERTY__UNIQUE_IDENTIFIER = eINSTANCE.getCDTProperty_UniqueIdentifier();

    /**
     * The meta object literal for the '<em><b>Version Identifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CDT_PROPERTY__VERSION_IDENTIFIER = eINSTANCE.getCDTProperty_VersionIdentifier();

    /**
     * The meta object literal for the '{@link org.ebix.umm.umm.impl.CDT_ContentImpl <em>CDT Content</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ebix.umm.umm.impl.CDT_ContentImpl
     * @see org.ebix.umm.umm.impl.UmmPackageImpl#getCDT_Content()
     * @generated
     */
    EClass CDT_CONTENT = eINSTANCE.getCDT_Content();

    /**
     * The meta object literal for the '{@link org.ebix.umm.umm.impl.CDT_SupplementImpl <em>CDT Supplement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ebix.umm.umm.impl.CDT_SupplementImpl
     * @see org.ebix.umm.umm.impl.UmmPackageImpl#getCDT_Supplement()
     * @generated
     */
    EClass CDT_SUPPLEMENT = eINSTANCE.getCDT_Supplement();

    /**
     * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CDT_SUPPLEMENT__DEFAULT_VALUE = eINSTANCE.getCDT_Supplement_DefaultValue();

    /**
     * The meta object literal for the '<em><b>Restriction</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CDT_SUPPLEMENT__RESTRICTION = eINSTANCE.getCDT_Supplement_Restriction();

    /**
     * The meta object literal for the '<em><b>Fixed Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CDT_SUPPLEMENT__FIXED_VALUE = eINSTANCE.getCDT_Supplement_FixedValue();

    /**
     * The meta object literal for the '{@link org.ebix.umm.umm.impl.PrimitiveLibraryImpl <em>Primitive Library</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ebix.umm.umm.impl.PrimitiveLibraryImpl
     * @see org.ebix.umm.umm.impl.UmmPackageImpl#getPrimitiveLibrary()
     * @generated
     */
    EClass PRIMITIVE_LIBRARY = eINSTANCE.getPrimitiveLibrary();

    /**
     * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMITIVE_LIBRARY__TYPES = eINSTANCE.getPrimitiveLibrary_Types();

    /**
     * The meta object literal for the '{@link org.ebix.umm.umm.impl.OclInvariantImpl <em>Ocl Invariant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ebix.umm.umm.impl.OclInvariantImpl
     * @see org.ebix.umm.umm.impl.UmmPackageImpl#getOclInvariant()
     * @generated
     */
    EClass OCL_INVARIANT = eINSTANCE.getOclInvariant();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OCL_INVARIANT__EXPRESSION = eINSTANCE.getOclInvariant_Expression();

    /**
     * The meta object literal for the '{@link org.ebix.umm.umm.impl.OclExpressionImpl <em>Ocl Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ebix.umm.umm.impl.OclExpressionImpl
     * @see org.ebix.umm.umm.impl.UmmPackageImpl#getOclExpression()
     * @generated
     */
    EClass OCL_EXPRESSION = eINSTANCE.getOclExpression();

    /**
     * The meta object literal for the '{@link org.ebix.umm.umm.impl.OclValueImpl <em>Ocl Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ebix.umm.umm.impl.OclValueImpl
     * @see org.ebix.umm.umm.impl.UmmPackageImpl#getOclValue()
     * @generated
     */
    EClass OCL_VALUE = eINSTANCE.getOclValue();

    /**
     * The meta object literal for the '{@link org.ebix.umm.umm.impl.OclReferenceImpl <em>Ocl Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ebix.umm.umm.impl.OclReferenceImpl
     * @see org.ebix.umm.umm.impl.UmmPackageImpl#getOclReference()
     * @generated
     */
    EClass OCL_REFERENCE = eINSTANCE.getOclReference();

    /**
     * The meta object literal for the '{@link org.ebix.umm.umm.impl.OclPathSelfHeadImpl <em>Ocl Path Self Head</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ebix.umm.umm.impl.OclPathSelfHeadImpl
     * @see org.ebix.umm.umm.impl.UmmPackageImpl#getOclPathSelfHead()
     * @generated
     */
    EClass OCL_PATH_SELF_HEAD = eINSTANCE.getOclPathSelfHead();

    /**
     * The meta object literal for the '<em><b>Path</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OCL_PATH_SELF_HEAD__PATH = eINSTANCE.getOclPathSelfHead_Path();

    /**
     * The meta object literal for the '{@link org.ebix.umm.umm.impl.OclPathFeatureHeadImpl <em>Ocl Path Feature Head</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ebix.umm.umm.impl.OclPathFeatureHeadImpl
     * @see org.ebix.umm.umm.impl.UmmPackageImpl#getOclPathFeatureHead()
     * @generated
     */
    EClass OCL_PATH_FEATURE_HEAD = eINSTANCE.getOclPathFeatureHead();

    /**
     * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OCL_PATH_FEATURE_HEAD__FEATURE = eINSTANCE.getOclPathFeatureHead_Feature();

    /**
     * The meta object literal for the '<em><b>Tail</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OCL_PATH_FEATURE_HEAD__TAIL = eINSTANCE.getOclPathFeatureHead_Tail();

    /**
     * The meta object literal for the '{@link org.ebix.umm.umm.impl.OclPathTailImpl <em>Ocl Path Tail</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ebix.umm.umm.impl.OclPathTailImpl
     * @see org.ebix.umm.umm.impl.UmmPackageImpl#getOclPathTail()
     * @generated
     */
    EClass OCL_PATH_TAIL = eINSTANCE.getOclPathTail();

    /**
     * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OCL_PATH_TAIL__FEATURE = eINSTANCE.getOclPathTail_Feature();

    /**
     * The meta object literal for the '<em><b>Tail</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OCL_PATH_TAIL__TAIL = eINSTANCE.getOclPathTail_Tail();

    /**
     * The meta object literal for the '{@link org.ebix.umm.umm.impl.OclRefImpl <em>Ocl Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ebix.umm.umm.impl.OclRefImpl
     * @see org.ebix.umm.umm.impl.UmmPackageImpl#getOclRef()
     * @generated
     */
    EClass OCL_REF = eINSTANCE.getOclRef();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OCL_REF__NAME = eINSTANCE.getOclRef_Name();

    /**
     * The meta object literal for the '<em><b>Multiplicity</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OCL_REF__MULTIPLICITY = eINSTANCE.getOclRef_Multiplicity();

    /**
     * The meta object literal for the '{@link org.ebix.umm.umm.impl.OclFunctionCallImpl <em>Ocl Function Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ebix.umm.umm.impl.OclFunctionCallImpl
     * @see org.ebix.umm.umm.impl.UmmPackageImpl#getOclFunctionCall()
     * @generated
     */
    EClass OCL_FUNCTION_CALL = eINSTANCE.getOclFunctionCall();

    /**
     * The meta object literal for the '{@link org.ebix.umm.umm.impl.OclForAllImpl <em>Ocl For All</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ebix.umm.umm.impl.OclForAllImpl
     * @see org.ebix.umm.umm.impl.UmmPackageImpl#getOclForAll()
     * @generated
     */
    EClass OCL_FOR_ALL = eINSTANCE.getOclForAll();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OCL_FOR_ALL__BODY = eINSTANCE.getOclForAll_Body();

    /**
     * The meta object literal for the '{@link org.ebix.umm.umm.impl.OclIsEmptyImpl <em>Ocl Is Empty</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ebix.umm.umm.impl.OclIsEmptyImpl
     * @see org.ebix.umm.umm.impl.UmmPackageImpl#getOclIsEmpty()
     * @generated
     */
    EClass OCL_IS_EMPTY = eINSTANCE.getOclIsEmpty();

    /**
     * The meta object literal for the '{@link org.ebix.umm.umm.impl.OclNotEmptyImpl <em>Ocl Not Empty</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ebix.umm.umm.impl.OclNotEmptyImpl
     * @see org.ebix.umm.umm.impl.UmmPackageImpl#getOclNotEmpty()
     * @generated
     */
    EClass OCL_NOT_EMPTY = eINSTANCE.getOclNotEmpty();

    /**
     * The meta object literal for the '{@link org.ebix.umm.umm.impl.OclSizeImpl <em>Ocl Size</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ebix.umm.umm.impl.OclSizeImpl
     * @see org.ebix.umm.umm.impl.UmmPackageImpl#getOclSize()
     * @generated
     */
    EClass OCL_SIZE = eINSTANCE.getOclSize();

    /**
     * The meta object literal for the '{@link org.ebix.umm.umm.impl.OclLiteralImpl <em>Ocl Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ebix.umm.umm.impl.OclLiteralImpl
     * @see org.ebix.umm.umm.impl.UmmPackageImpl#getOclLiteral()
     * @generated
     */
    EClass OCL_LITERAL = eINSTANCE.getOclLiteral();

    /**
     * The meta object literal for the '{@link org.ebix.umm.umm.impl.OclEnumerationLiteralImpl <em>Ocl Enumeration Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ebix.umm.umm.impl.OclEnumerationLiteralImpl
     * @see org.ebix.umm.umm.impl.UmmPackageImpl#getOclEnumerationLiteral()
     * @generated
     */
    EClass OCL_ENUMERATION_LITERAL = eINSTANCE.getOclEnumerationLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OCL_ENUMERATION_LITERAL__VALUE = eINSTANCE.getOclEnumerationLiteral_Value();

    /**
     * The meta object literal for the '{@link org.ebix.umm.umm.impl.OclIntegerLiteralImpl <em>Ocl Integer Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ebix.umm.umm.impl.OclIntegerLiteralImpl
     * @see org.ebix.umm.umm.impl.UmmPackageImpl#getOclIntegerLiteral()
     * @generated
     */
    EClass OCL_INTEGER_LITERAL = eINSTANCE.getOclIntegerLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OCL_INTEGER_LITERAL__VALUE = eINSTANCE.getOclIntegerLiteral_Value();

    /**
     * The meta object literal for the '{@link org.ebix.umm.umm.impl.OclStringLiteralImpl <em>Ocl String Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ebix.umm.umm.impl.OclStringLiteralImpl
     * @see org.ebix.umm.umm.impl.UmmPackageImpl#getOclStringLiteral()
     * @generated
     */
    EClass OCL_STRING_LITERAL = eINSTANCE.getOclStringLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OCL_STRING_LITERAL__VALUE = eINSTANCE.getOclStringLiteral_Value();

    /**
     * The meta object literal for the '{@link org.ebix.umm.umm.impl.OclBooleanLiteralImpl <em>Ocl Boolean Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ebix.umm.umm.impl.OclBooleanLiteralImpl
     * @see org.ebix.umm.umm.impl.UmmPackageImpl#getOclBooleanLiteral()
     * @generated
     */
    EClass OCL_BOOLEAN_LITERAL = eINSTANCE.getOclBooleanLiteral();

    /**
     * The meta object literal for the '{@link org.ebix.umm.umm.impl.OclBooleanFalseImpl <em>Ocl Boolean False</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ebix.umm.umm.impl.OclBooleanFalseImpl
     * @see org.ebix.umm.umm.impl.UmmPackageImpl#getOclBooleanFalse()
     * @generated
     */
    EClass OCL_BOOLEAN_FALSE = eINSTANCE.getOclBooleanFalse();

    /**
     * The meta object literal for the '{@link org.ebix.umm.umm.impl.OclImpliesImpl <em>Ocl Implies</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ebix.umm.umm.impl.OclImpliesImpl
     * @see org.ebix.umm.umm.impl.UmmPackageImpl#getOclImplies()
     * @generated
     */
    EClass OCL_IMPLIES = eINSTANCE.getOclImplies();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OCL_IMPLIES__LEFT = eINSTANCE.getOclImplies_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OCL_IMPLIES__RIGHT = eINSTANCE.getOclImplies_Right();

    /**
     * The meta object literal for the '{@link org.ebix.umm.umm.impl.OclAndImpl <em>Ocl And</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ebix.umm.umm.impl.OclAndImpl
     * @see org.ebix.umm.umm.impl.UmmPackageImpl#getOclAnd()
     * @generated
     */
    EClass OCL_AND = eINSTANCE.getOclAnd();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OCL_AND__LEFT = eINSTANCE.getOclAnd_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OCL_AND__RIGHT = eINSTANCE.getOclAnd_Right();

    /**
     * The meta object literal for the '{@link org.ebix.umm.umm.impl.OclOrImpl <em>Ocl Or</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ebix.umm.umm.impl.OclOrImpl
     * @see org.ebix.umm.umm.impl.UmmPackageImpl#getOclOr()
     * @generated
     */
    EClass OCL_OR = eINSTANCE.getOclOr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OCL_OR__LEFT = eINSTANCE.getOclOr_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OCL_OR__RIGHT = eINSTANCE.getOclOr_Right();

    /**
     * The meta object literal for the '{@link org.ebix.umm.umm.impl.OclXorImpl <em>Ocl Xor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ebix.umm.umm.impl.OclXorImpl
     * @see org.ebix.umm.umm.impl.UmmPackageImpl#getOclXor()
     * @generated
     */
    EClass OCL_XOR = eINSTANCE.getOclXor();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OCL_XOR__LEFT = eINSTANCE.getOclXor_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OCL_XOR__RIGHT = eINSTANCE.getOclXor_Right();

    /**
     * The meta object literal for the '{@link org.ebix.umm.umm.impl.OclEqualImpl <em>Ocl Equal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ebix.umm.umm.impl.OclEqualImpl
     * @see org.ebix.umm.umm.impl.UmmPackageImpl#getOclEqual()
     * @generated
     */
    EClass OCL_EQUAL = eINSTANCE.getOclEqual();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OCL_EQUAL__LEFT = eINSTANCE.getOclEqual_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OCL_EQUAL__RIGHT = eINSTANCE.getOclEqual_Right();

    /**
     * The meta object literal for the '{@link org.ebix.umm.umm.impl.OclLessImpl <em>Ocl Less</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ebix.umm.umm.impl.OclLessImpl
     * @see org.ebix.umm.umm.impl.UmmPackageImpl#getOclLess()
     * @generated
     */
    EClass OCL_LESS = eINSTANCE.getOclLess();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OCL_LESS__LEFT = eINSTANCE.getOclLess_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OCL_LESS__RIGHT = eINSTANCE.getOclLess_Right();

    /**
     * The meta object literal for the '{@link org.ebix.umm.umm.impl.OclLessOrEqualImpl <em>Ocl Less Or Equal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ebix.umm.umm.impl.OclLessOrEqualImpl
     * @see org.ebix.umm.umm.impl.UmmPackageImpl#getOclLessOrEqual()
     * @generated
     */
    EClass OCL_LESS_OR_EQUAL = eINSTANCE.getOclLessOrEqual();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OCL_LESS_OR_EQUAL__LEFT = eINSTANCE.getOclLessOrEqual_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OCL_LESS_OR_EQUAL__RIGHT = eINSTANCE.getOclLessOrEqual_Right();

    /**
     * The meta object literal for the '{@link org.ebix.umm.umm.impl.OclMoreImpl <em>Ocl More</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ebix.umm.umm.impl.OclMoreImpl
     * @see org.ebix.umm.umm.impl.UmmPackageImpl#getOclMore()
     * @generated
     */
    EClass OCL_MORE = eINSTANCE.getOclMore();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OCL_MORE__LEFT = eINSTANCE.getOclMore_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OCL_MORE__RIGHT = eINSTANCE.getOclMore_Right();

    /**
     * The meta object literal for the '{@link org.ebix.umm.umm.impl.OclMoreOrEqualImpl <em>Ocl More Or Equal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ebix.umm.umm.impl.OclMoreOrEqualImpl
     * @see org.ebix.umm.umm.impl.UmmPackageImpl#getOclMoreOrEqual()
     * @generated
     */
    EClass OCL_MORE_OR_EQUAL = eINSTANCE.getOclMoreOrEqual();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OCL_MORE_OR_EQUAL__LEFT = eINSTANCE.getOclMoreOrEqual_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OCL_MORE_OR_EQUAL__RIGHT = eINSTANCE.getOclMoreOrEqual_Right();

    /**
     * The meta object literal for the '{@link org.ebix.umm.umm.impl.OclArrowImpl <em>Ocl Arrow</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ebix.umm.umm.impl.OclArrowImpl
     * @see org.ebix.umm.umm.impl.UmmPackageImpl#getOclArrow()
     * @generated
     */
    EClass OCL_ARROW = eINSTANCE.getOclArrow();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OCL_ARROW__LEFT = eINSTANCE.getOclArrow_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OCL_ARROW__RIGHT = eINSTANCE.getOclArrow_Right();

    /**
     * The meta object literal for the '{@link org.ebix.umm.umm.impl.OclBooleanTrueImpl <em>Ocl Boolean True</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ebix.umm.umm.impl.OclBooleanTrueImpl
     * @see org.ebix.umm.umm.impl.UmmPackageImpl#getOclBooleanTrue()
     * @generated
     */
    EClass OCL_BOOLEAN_TRUE = eINSTANCE.getOclBooleanTrue();

    /**
     * The meta object literal for the '{@link org.ebix.umm.umm.ConstraintKind <em>Constraint Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ebix.umm.umm.ConstraintKind
     * @see org.ebix.umm.umm.impl.UmmPackageImpl#getConstraintKind()
     * @generated
     */
    EEnum CONSTRAINT_KIND = eINSTANCE.getConstraintKind();

    /**
     * The meta object literal for the '{@link org.ebix.umm.umm.MultiplicityKind <em>Multiplicity Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ebix.umm.umm.MultiplicityKind
     * @see org.ebix.umm.umm.impl.UmmPackageImpl#getMultiplicityKind()
     * @generated
     */
    EEnum MULTIPLICITY_KIND = eINSTANCE.getMultiplicityKind();

  }

} //UmmPackage
