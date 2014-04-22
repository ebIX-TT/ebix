/**
 */
package org.ebix.umm.umm.impl;

import org.ebix.umm.umm.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UmmFactoryImpl extends EFactoryImpl implements UmmFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static UmmFactory init()
  {
    try
    {
      UmmFactory theUmmFactory = (UmmFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.ebix.org/umm/Umm"); 
      if (theUmmFactory != null)
      {
        return theUmmFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new UmmFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UmmFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case UmmPackage.LIBRARY: return createLibrary();
      case UmmPackage.DOC_LIBRARY: return createDocLibrary();
      case UmmPackage.INF_ENVELOPE: return createInfEnvelope();
      case UmmPackage.MA: return createMA();
      case UmmPackage.MA_PROPERTY: return createMAProperty();
      case UmmPackage.ASMA: return createASMA();
      case UmmPackage.ASNONE: return createASNONE();
      case UmmPackage.CONSTRAINT: return createConstraint();
      case UmmPackage.CONTEXT_REF: return createContextRef();
      case UmmPackage.TC_CONSTRAINT: return createTC_Constraint();
      case UmmPackage.BIE_LIBRARY: return createBIELibrary();
      case UmmPackage.ABIE: return createABIE();
      case UmmPackage.ABIE_PROPERTY: return createABIEProperty();
      case UmmPackage.ASBIE: return createASBIE();
      case UmmPackage.BBIE: return createBBIE();
      case UmmPackage.BDT_LIBRARY: return createBDTLibrary();
      case UmmPackage.BDT: return createBDT();
      case UmmPackage.BDT_PROPERTY: return createBDTProperty();
      case UmmPackage.CONTENT: return createContent();
      case UmmPackage.SUPPLEMENT: return createSupplement();
      case UmmPackage.ENUM_LIBRARY: return createENUMLibrary();
      case UmmPackage.ENUM: return createENUM();
      case UmmPackage.ASSEMBLED_BASE: return createAssembledBase();
      case UmmPackage.PRIMITIVE: return createPrimitive();
      case UmmPackage.ASSEMBLED: return createAssembled();
      case UmmPackage.ORIGINAL: return createOriginal();
      case UmmPackage.SUBSET: return createSubset();
      case UmmPackage.CODELIST_ENTRY: return createCodelistEntry();
      case UmmPackage.CC_LIBRARY: return createCCLibrary();
      case UmmPackage.ACC: return createACC();
      case UmmPackage.ACC_PROPERTY: return createACCProperty();
      case UmmPackage.ASCC: return createASCC();
      case UmmPackage.BCC: return createBCC();
      case UmmPackage.CDT_LIBRARY: return createCDTLibrary();
      case UmmPackage.CDT: return createCDT();
      case UmmPackage.CDT_PROPERTY: return createCDTProperty();
      case UmmPackage.CDT_CONTENT: return createCDT_Content();
      case UmmPackage.CDT_SUPPLEMENT: return createCDT_Supplement();
      case UmmPackage.PRIMITIVE_LIBRARY: return createPrimitiveLibrary();
      case UmmPackage.OCL_INVARIANT: return createOclInvariant();
      case UmmPackage.OCL_EXPRESSION: return createOclExpression();
      case UmmPackage.OCL_VALUE: return createOclValue();
      case UmmPackage.OCL_REFERENCE: return createOclReference();
      case UmmPackage.OCL_PATH_SELF_HEAD: return createOclPathSelfHead();
      case UmmPackage.OCL_PATH_FEATURE_HEAD: return createOclPathFeatureHead();
      case UmmPackage.OCL_PATH_TAIL: return createOclPathTail();
      case UmmPackage.OCL_REF: return createOclRef();
      case UmmPackage.OCL_FUNCTION_CALL: return createOclFunctionCall();
      case UmmPackage.OCL_FOR_ALL: return createOclForAll();
      case UmmPackage.OCL_IS_EMPTY: return createOclIsEmpty();
      case UmmPackage.OCL_NOT_EMPTY: return createOclNotEmpty();
      case UmmPackage.OCL_SIZE: return createOclSize();
      case UmmPackage.OCL_LITERAL: return createOclLiteral();
      case UmmPackage.OCL_ENUMERATION_LITERAL: return createOclEnumerationLiteral();
      case UmmPackage.OCL_INTEGER_LITERAL: return createOclIntegerLiteral();
      case UmmPackage.OCL_STRING_LITERAL: return createOclStringLiteral();
      case UmmPackage.OCL_BOOLEAN_LITERAL: return createOclBooleanLiteral();
      case UmmPackage.OCL_BOOLEAN_FALSE: return createOclBooleanFalse();
      case UmmPackage.OCL_IMPLIES: return createOclImplies();
      case UmmPackage.OCL_AND: return createOclAnd();
      case UmmPackage.OCL_OR: return createOclOr();
      case UmmPackage.OCL_XOR: return createOclXor();
      case UmmPackage.OCL_EQUAL: return createOclEqual();
      case UmmPackage.OCL_LESS: return createOclLess();
      case UmmPackage.OCL_LESS_OR_EQUAL: return createOclLessOrEqual();
      case UmmPackage.OCL_MORE: return createOclMore();
      case UmmPackage.OCL_MORE_OR_EQUAL: return createOclMoreOrEqual();
      case UmmPackage.OCL_ARROW: return createOclArrow();
      case UmmPackage.OCL_BOOLEAN_TRUE: return createOclBooleanTrue();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case UmmPackage.CONSTRAINT_KIND:
        return createConstraintKindFromString(eDataType, initialValue);
      case UmmPackage.MULTIPLICITY_KIND:
        return createMultiplicityKindFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case UmmPackage.CONSTRAINT_KIND:
        return convertConstraintKindToString(eDataType, instanceValue);
      case UmmPackage.MULTIPLICITY_KIND:
        return convertMultiplicityKindToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Library createLibrary()
  {
    LibraryImpl library = new LibraryImpl();
    return library;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DocLibrary createDocLibrary()
  {
    DocLibraryImpl docLibrary = new DocLibraryImpl();
    return docLibrary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InfEnvelope createInfEnvelope()
  {
    InfEnvelopeImpl infEnvelope = new InfEnvelopeImpl();
    return infEnvelope;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MA createMA()
  {
    MAImpl ma = new MAImpl();
    return ma;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MAProperty createMAProperty()
  {
    MAPropertyImpl maProperty = new MAPropertyImpl();
    return maProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ASMA createASMA()
  {
    ASMAImpl asma = new ASMAImpl();
    return asma;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ASNONE createASNONE()
  {
    ASNONEImpl asnone = new ASNONEImpl();
    return asnone;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constraint createConstraint()
  {
    ConstraintImpl constraint = new ConstraintImpl();
    return constraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContextRef createContextRef()
  {
    ContextRefImpl contextRef = new ContextRefImpl();
    return contextRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TC_Constraint createTC_Constraint()
  {
    TC_ConstraintImpl tC_Constraint = new TC_ConstraintImpl();
    return tC_Constraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BIELibrary createBIELibrary()
  {
    BIELibraryImpl bieLibrary = new BIELibraryImpl();
    return bieLibrary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ABIE createABIE()
  {
    ABIEImpl abie = new ABIEImpl();
    return abie;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ABIEProperty createABIEProperty()
  {
    ABIEPropertyImpl abieProperty = new ABIEPropertyImpl();
    return abieProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ASBIE createASBIE()
  {
    ASBIEImpl asbie = new ASBIEImpl();
    return asbie;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BBIE createBBIE()
  {
    BBIEImpl bbie = new BBIEImpl();
    return bbie;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BDTLibrary createBDTLibrary()
  {
    BDTLibraryImpl bdtLibrary = new BDTLibraryImpl();
    return bdtLibrary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BDT createBDT()
  {
    BDTImpl bdt = new BDTImpl();
    return bdt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BDTProperty createBDTProperty()
  {
    BDTPropertyImpl bdtProperty = new BDTPropertyImpl();
    return bdtProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Content createContent()
  {
    ContentImpl content = new ContentImpl();
    return content;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Supplement createSupplement()
  {
    SupplementImpl supplement = new SupplementImpl();
    return supplement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ENUMLibrary createENUMLibrary()
  {
    ENUMLibraryImpl enumLibrary = new ENUMLibraryImpl();
    return enumLibrary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ENUM createENUM()
  {
    ENUMImpl enum_ = new ENUMImpl();
    return enum_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssembledBase createAssembledBase()
  {
    AssembledBaseImpl assembledBase = new AssembledBaseImpl();
    return assembledBase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Primitive createPrimitive()
  {
    PrimitiveImpl primitive = new PrimitiveImpl();
    return primitive;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assembled createAssembled()
  {
    AssembledImpl assembled = new AssembledImpl();
    return assembled;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Original createOriginal()
  {
    OriginalImpl original = new OriginalImpl();
    return original;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Subset createSubset()
  {
    SubsetImpl subset = new SubsetImpl();
    return subset;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CodelistEntry createCodelistEntry()
  {
    CodelistEntryImpl codelistEntry = new CodelistEntryImpl();
    return codelistEntry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CCLibrary createCCLibrary()
  {
    CCLibraryImpl ccLibrary = new CCLibraryImpl();
    return ccLibrary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ACC createACC()
  {
    ACCImpl acc = new ACCImpl();
    return acc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ACCProperty createACCProperty()
  {
    ACCPropertyImpl accProperty = new ACCPropertyImpl();
    return accProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ASCC createASCC()
  {
    ASCCImpl ascc = new ASCCImpl();
    return ascc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BCC createBCC()
  {
    BCCImpl bcc = new BCCImpl();
    return bcc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CDTLibrary createCDTLibrary()
  {
    CDTLibraryImpl cdtLibrary = new CDTLibraryImpl();
    return cdtLibrary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CDT createCDT()
  {
    CDTImpl cdt = new CDTImpl();
    return cdt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CDTProperty createCDTProperty()
  {
    CDTPropertyImpl cdtProperty = new CDTPropertyImpl();
    return cdtProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CDT_Content createCDT_Content()
  {
    CDT_ContentImpl cdT_Content = new CDT_ContentImpl();
    return cdT_Content;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CDT_Supplement createCDT_Supplement()
  {
    CDT_SupplementImpl cdT_Supplement = new CDT_SupplementImpl();
    return cdT_Supplement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimitiveLibrary createPrimitiveLibrary()
  {
    PrimitiveLibraryImpl primitiveLibrary = new PrimitiveLibraryImpl();
    return primitiveLibrary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OclInvariant createOclInvariant()
  {
    OclInvariantImpl oclInvariant = new OclInvariantImpl();
    return oclInvariant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OclExpression createOclExpression()
  {
    OclExpressionImpl oclExpression = new OclExpressionImpl();
    return oclExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OclValue createOclValue()
  {
    OclValueImpl oclValue = new OclValueImpl();
    return oclValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OclReference createOclReference()
  {
    OclReferenceImpl oclReference = new OclReferenceImpl();
    return oclReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OclPathSelfHead createOclPathSelfHead()
  {
    OclPathSelfHeadImpl oclPathSelfHead = new OclPathSelfHeadImpl();
    return oclPathSelfHead;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OclPathFeatureHead createOclPathFeatureHead()
  {
    OclPathFeatureHeadImpl oclPathFeatureHead = new OclPathFeatureHeadImpl();
    return oclPathFeatureHead;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OclPathTail createOclPathTail()
  {
    OclPathTailImpl oclPathTail = new OclPathTailImpl();
    return oclPathTail;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OclRef createOclRef()
  {
    OclRefImpl oclRef = new OclRefImpl();
    return oclRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OclFunctionCall createOclFunctionCall()
  {
    OclFunctionCallImpl oclFunctionCall = new OclFunctionCallImpl();
    return oclFunctionCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OclForAll createOclForAll()
  {
    OclForAllImpl oclForAll = new OclForAllImpl();
    return oclForAll;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OclIsEmpty createOclIsEmpty()
  {
    OclIsEmptyImpl oclIsEmpty = new OclIsEmptyImpl();
    return oclIsEmpty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OclNotEmpty createOclNotEmpty()
  {
    OclNotEmptyImpl oclNotEmpty = new OclNotEmptyImpl();
    return oclNotEmpty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OclSize createOclSize()
  {
    OclSizeImpl oclSize = new OclSizeImpl();
    return oclSize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OclLiteral createOclLiteral()
  {
    OclLiteralImpl oclLiteral = new OclLiteralImpl();
    return oclLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OclEnumerationLiteral createOclEnumerationLiteral()
  {
    OclEnumerationLiteralImpl oclEnumerationLiteral = new OclEnumerationLiteralImpl();
    return oclEnumerationLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OclIntegerLiteral createOclIntegerLiteral()
  {
    OclIntegerLiteralImpl oclIntegerLiteral = new OclIntegerLiteralImpl();
    return oclIntegerLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OclStringLiteral createOclStringLiteral()
  {
    OclStringLiteralImpl oclStringLiteral = new OclStringLiteralImpl();
    return oclStringLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OclBooleanLiteral createOclBooleanLiteral()
  {
    OclBooleanLiteralImpl oclBooleanLiteral = new OclBooleanLiteralImpl();
    return oclBooleanLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OclBooleanFalse createOclBooleanFalse()
  {
    OclBooleanFalseImpl oclBooleanFalse = new OclBooleanFalseImpl();
    return oclBooleanFalse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OclImplies createOclImplies()
  {
    OclImpliesImpl oclImplies = new OclImpliesImpl();
    return oclImplies;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OclAnd createOclAnd()
  {
    OclAndImpl oclAnd = new OclAndImpl();
    return oclAnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OclOr createOclOr()
  {
    OclOrImpl oclOr = new OclOrImpl();
    return oclOr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OclXor createOclXor()
  {
    OclXorImpl oclXor = new OclXorImpl();
    return oclXor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OclEqual createOclEqual()
  {
    OclEqualImpl oclEqual = new OclEqualImpl();
    return oclEqual;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OclLess createOclLess()
  {
    OclLessImpl oclLess = new OclLessImpl();
    return oclLess;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OclLessOrEqual createOclLessOrEqual()
  {
    OclLessOrEqualImpl oclLessOrEqual = new OclLessOrEqualImpl();
    return oclLessOrEqual;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OclMore createOclMore()
  {
    OclMoreImpl oclMore = new OclMoreImpl();
    return oclMore;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OclMoreOrEqual createOclMoreOrEqual()
  {
    OclMoreOrEqualImpl oclMoreOrEqual = new OclMoreOrEqualImpl();
    return oclMoreOrEqual;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OclArrow createOclArrow()
  {
    OclArrowImpl oclArrow = new OclArrowImpl();
    return oclArrow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OclBooleanTrue createOclBooleanTrue()
  {
    OclBooleanTrueImpl oclBooleanTrue = new OclBooleanTrueImpl();
    return oclBooleanTrue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstraintKind createConstraintKindFromString(EDataType eDataType, String initialValue)
  {
    ConstraintKind result = ConstraintKind.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertConstraintKindToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultiplicityKind createMultiplicityKindFromString(EDataType eDataType, String initialValue)
  {
    MultiplicityKind result = MultiplicityKind.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertMultiplicityKindToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UmmPackage getUmmPackage()
  {
    return (UmmPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static UmmPackage getPackage()
  {
    return UmmPackage.eINSTANCE;
  }

} //UmmFactoryImpl
