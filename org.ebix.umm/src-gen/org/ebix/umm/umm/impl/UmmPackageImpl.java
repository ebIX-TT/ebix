/**
 */
package org.ebix.umm.umm.impl;

import org.ebix.umm.umm.ABIEProperty;
import org.ebix.umm.umm.ACCProperty;
import org.ebix.umm.umm.Assembled;
import org.ebix.umm.umm.AssembledBase;
import org.ebix.umm.umm.BDTLibrary;
import org.ebix.umm.umm.BDTProperty;
import org.ebix.umm.umm.BIELibrary;
import org.ebix.umm.umm.CCLibrary;
import org.ebix.umm.umm.CDTLibrary;
import org.ebix.umm.umm.CDTProperty;
import org.ebix.umm.umm.CDT_Content;
import org.ebix.umm.umm.CDT_Supplement;
import org.ebix.umm.umm.CodelistEntry;
import org.ebix.umm.umm.Constraint;
import org.ebix.umm.umm.ConstraintKind;
import org.ebix.umm.umm.Content;
import org.ebix.umm.umm.ContextRef;
import org.ebix.umm.umm.DocLibrary;
import org.ebix.umm.umm.ENUMLibrary;
import org.ebix.umm.umm.InfEnvelope;
import org.ebix.umm.umm.Library;
import org.ebix.umm.umm.MAProperty;
import org.ebix.umm.umm.MultiplicityKind;
import org.ebix.umm.umm.OclAnd;
import org.ebix.umm.umm.OclArrow;
import org.ebix.umm.umm.OclBooleanFalse;
import org.ebix.umm.umm.OclBooleanLiteral;
import org.ebix.umm.umm.OclBooleanTrue;
import org.ebix.umm.umm.OclEnumerationLiteral;
import org.ebix.umm.umm.OclEqual;
import org.ebix.umm.umm.OclExpression;
import org.ebix.umm.umm.OclForAll;
import org.ebix.umm.umm.OclFunctionCall;
import org.ebix.umm.umm.OclImplies;
import org.ebix.umm.umm.OclIntegerLiteral;
import org.ebix.umm.umm.OclInvariant;
import org.ebix.umm.umm.OclIsEmpty;
import org.ebix.umm.umm.OclLess;
import org.ebix.umm.umm.OclLessOrEqual;
import org.ebix.umm.umm.OclLiteral;
import org.ebix.umm.umm.OclMore;
import org.ebix.umm.umm.OclMoreOrEqual;
import org.ebix.umm.umm.OclNotEmpty;
import org.ebix.umm.umm.OclOr;
import org.ebix.umm.umm.OclPathFeatureHead;
import org.ebix.umm.umm.OclPathSelfHead;
import org.ebix.umm.umm.OclPathTail;
import org.ebix.umm.umm.OclRef;
import org.ebix.umm.umm.OclReference;
import org.ebix.umm.umm.OclSize;
import org.ebix.umm.umm.OclStringLiteral;
import org.ebix.umm.umm.OclValue;
import org.ebix.umm.umm.OclXor;
import org.ebix.umm.umm.Original;
import org.ebix.umm.umm.Primitive;
import org.ebix.umm.umm.PrimitiveLibrary;
import org.ebix.umm.umm.Subset;
import org.ebix.umm.umm.Supplement;
import org.ebix.umm.umm.TC_Constraint;
import org.ebix.umm.umm.UmmFactory;
import org.ebix.umm.umm.UmmPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UmmPackageImpl extends EPackageImpl implements UmmPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass libraryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass docLibraryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass infEnvelopeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass maEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass maPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass asmaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass asnoneEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass contextRefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tC_ConstraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bieLibraryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abieEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abiePropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass asbieEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bbieEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bdtLibraryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bdtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bdtPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass contentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass supplementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumLibraryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass assembledBaseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass primitiveEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass assembledEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass originalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subsetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass codelistEntryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ccLibraryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass accEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass accPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass asccEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bccEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cdtLibraryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cdtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cdtPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cdT_ContentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cdT_SupplementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass primitiveLibraryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass oclInvariantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass oclExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass oclValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass oclReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass oclPathSelfHeadEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass oclPathFeatureHeadEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass oclPathTailEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass oclRefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass oclFunctionCallEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass oclForAllEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass oclIsEmptyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass oclNotEmptyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass oclSizeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass oclLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass oclEnumerationLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass oclIntegerLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass oclStringLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass oclBooleanLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass oclBooleanFalseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass oclImpliesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass oclAndEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass oclOrEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass oclXorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass oclEqualEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass oclLessEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass oclLessOrEqualEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass oclMoreEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass oclMoreOrEqualEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass oclArrowEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass oclBooleanTrueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum constraintKindEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum multiplicityKindEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.ebix.umm.umm.UmmPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private UmmPackageImpl()
  {
    super(eNS_URI, UmmFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link UmmPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static UmmPackage init()
  {
    if (isInited) return (UmmPackage)EPackage.Registry.INSTANCE.getEPackage(UmmPackage.eNS_URI);

    // Obtain or create and register package
    UmmPackageImpl theUmmPackage = (UmmPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof UmmPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new UmmPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theUmmPackage.createPackageContents();

    // Initialize created meta-data
    theUmmPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theUmmPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(UmmPackage.eNS_URI, theUmmPackage);
    return theUmmPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLibrary()
  {
    return libraryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLibrary_Name()
  {
    return (EAttribute)libraryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDocLibrary()
  {
    return docLibraryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDocLibrary_BusinessTerm()
  {
    return (EAttribute)docLibraryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDocLibrary_Copyright()
  {
    return (EAttribute)docLibraryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDocLibrary_Owner()
  {
    return (EAttribute)docLibraryEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDocLibrary_Reference()
  {
    return (EAttribute)docLibraryEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDocLibrary_UniqueIdentifier()
  {
    return (EAttribute)docLibraryEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDocLibrary_VersionIdentifier()
  {
    return (EAttribute)docLibraryEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDocLibrary_BaseURN()
  {
    return (EAttribute)docLibraryEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDocLibrary_NamespacePrefix()
  {
    return (EAttribute)docLibraryEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocLibrary_BieLibrary()
  {
    return (EReference)docLibraryEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocLibrary_BdtLibrary()
  {
    return (EReference)docLibraryEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocLibrary_Envelopes()
  {
    return (EReference)docLibraryEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInfEnvelope()
  {
    return infEnvelopeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInfEnvelope_Name()
  {
    return (EAttribute)infEnvelopeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInfEnvelope_Assemblies()
  {
    return (EReference)infEnvelopeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMA()
  {
    return maEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMA_Properties()
  {
    return (EReference)maEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMA_Constraints()
  {
    return (EReference)maEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMAProperty()
  {
    return maPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMAProperty_Type()
  {
    return (EReference)maPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getASMA()
  {
    return asmaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getASNONE()
  {
    return asnoneEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstraint()
  {
    return constraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstraint_Context()
  {
    return (EReference)constraintEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstraint_Type()
  {
    return (EReference)constraintEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstraint_Invariants()
  {
    return (EReference)constraintEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContextRef()
  {
    return contextRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContextRef_Name()
  {
    return (EAttribute)contextRefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTC_Constraint()
  {
    return tC_ConstraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTC_Constraint_Kind()
  {
    return (EAttribute)tC_ConstraintEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTC_Constraint_ListIdentifier()
  {
    return (EAttribute)tC_ConstraintEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTC_Constraint_ResponsibleAgency()
  {
    return (EAttribute)tC_ConstraintEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBIELibrary()
  {
    return bieLibraryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBIELibrary_BusinessTerm()
  {
    return (EAttribute)bieLibraryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBIELibrary_Copyright()
  {
    return (EAttribute)bieLibraryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBIELibrary_Owner()
  {
    return (EAttribute)bieLibraryEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBIELibrary_Reference()
  {
    return (EAttribute)bieLibraryEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBIELibrary_UniqueIdentifier()
  {
    return (EAttribute)bieLibraryEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBIELibrary_VersionIdentifier()
  {
    return (EAttribute)bieLibraryEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBIELibrary_BaseURN()
  {
    return (EAttribute)bieLibraryEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBIELibrary_NamespacePrefix()
  {
    return (EAttribute)bieLibraryEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBIELibrary_BdtLibrary()
  {
    return (EReference)bieLibraryEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBIELibrary_Abies()
  {
    return (EReference)bieLibraryEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getABIE()
  {
    return abieEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getABIE_BusinessTerm()
  {
    return (EAttribute)abieEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getABIE_Definition()
  {
    return (EAttribute)abieEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getABIE_Dictionary()
  {
    return (EAttribute)abieEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getABIE_UniqueIdentifier()
  {
    return (EAttribute)abieEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getABIE_VersionIdentifier()
  {
    return (EAttribute)abieEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getABIE_Properties()
  {
    return (EReference)abieEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getABIE_Constraints()
  {
    return (EReference)abieEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getABIEProperty()
  {
    return abiePropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getABIEProperty_Or()
  {
    return (EReference)abiePropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getABIEProperty_BusinessTerm()
  {
    return (EAttribute)abiePropertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getABIEProperty_Definition()
  {
    return (EAttribute)abiePropertyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getABIEProperty_Dictionary()
  {
    return (EAttribute)abiePropertyEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getABIEProperty_UniqueIdentifier()
  {
    return (EAttribute)abiePropertyEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getABIEProperty_VersionIdentifier()
  {
    return (EAttribute)abiePropertyEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getABIEProperty_SequencingKey()
  {
    return (EAttribute)abiePropertyEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getASBIE()
  {
    return asbieEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getASBIE_Type()
  {
    return (EReference)asbieEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBBIE()
  {
    return bbieEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBBIE_Type()
  {
    return (EReference)bbieEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBBIE_Restriction()
  {
    return (EAttribute)bbieEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBBIE_FixedValue()
  {
    return (EAttribute)bbieEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBDTLibrary()
  {
    return bdtLibraryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBDTLibrary_BusinessTerm()
  {
    return (EAttribute)bdtLibraryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBDTLibrary_Copyright()
  {
    return (EAttribute)bdtLibraryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBDTLibrary_Owner()
  {
    return (EAttribute)bdtLibraryEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBDTLibrary_Reference()
  {
    return (EAttribute)bdtLibraryEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBDTLibrary_UniqueIdentifier()
  {
    return (EAttribute)bdtLibraryEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBDTLibrary_VersionIdentifier()
  {
    return (EAttribute)bdtLibraryEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBDTLibrary_BaseURN()
  {
    return (EAttribute)bdtLibraryEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBDTLibrary_NamespacePrefix()
  {
    return (EAttribute)bdtLibraryEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBDTLibrary_Bdts()
  {
    return (EReference)bdtLibraryEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBDT()
  {
    return bdtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBDT_BusinessTerm()
  {
    return (EAttribute)bdtEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBDT_Definition()
  {
    return (EAttribute)bdtEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBDT_Dictionary()
  {
    return (EAttribute)bdtEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBDT_UniqueIdentifier()
  {
    return (EAttribute)bdtEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBDT_VersionIdentifier()
  {
    return (EAttribute)bdtEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBDT_Properties()
  {
    return (EReference)bdtEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBDTProperty()
  {
    return bdtPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBDTProperty_Type()
  {
    return (EReference)bdtPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBDTProperty_Pattern()
  {
    return (EAttribute)bdtPropertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBDTProperty_MinLength()
  {
    return (EAttribute)bdtPropertyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBDTProperty_MaxLength()
  {
    return (EAttribute)bdtPropertyEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBDTProperty_Length()
  {
    return (EAttribute)bdtPropertyEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBDTProperty_BusinessTerm()
  {
    return (EAttribute)bdtPropertyEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBDTProperty_Definition()
  {
    return (EAttribute)bdtPropertyEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBDTProperty_Dictionary()
  {
    return (EAttribute)bdtPropertyEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBDTProperty_UniqueIdentifier()
  {
    return (EAttribute)bdtPropertyEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBDTProperty_VersionIdentifier()
  {
    return (EAttribute)bdtPropertyEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContent()
  {
    return contentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSupplement()
  {
    return supplementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSupplement_DefaultValue()
  {
    return (EAttribute)supplementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSupplement_Restriction()
  {
    return (EAttribute)supplementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSupplement_FixedValue()
  {
    return (EAttribute)supplementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getENUMLibrary()
  {
    return enumLibraryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getENUMLibrary_BusinessTerm()
  {
    return (EAttribute)enumLibraryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getENUMLibrary_Copyright()
  {
    return (EAttribute)enumLibraryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getENUMLibrary_Owner()
  {
    return (EAttribute)enumLibraryEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getENUMLibrary_Reference()
  {
    return (EAttribute)enumLibraryEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getENUMLibrary_UniqueIdentifier()
  {
    return (EAttribute)enumLibraryEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getENUMLibrary_VersionIdentifier()
  {
    return (EAttribute)enumLibraryEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getENUMLibrary_BaseURN()
  {
    return (EAttribute)enumLibraryEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getENUMLibrary_NamespacePrefix()
  {
    return (EAttribute)enumLibraryEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getENUMLibrary_Enums()
  {
    return (EReference)enumLibraryEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getENUM()
  {
    return enumEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getENUM_Name()
  {
    return (EAttribute)enumEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getENUM_BusinessTerm()
  {
    return (EAttribute)enumEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getENUM_Definition()
  {
    return (EAttribute)enumEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getENUM_CodeListAgencyIdentifier()
  {
    return (EAttribute)enumEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getENUM_CodeListName()
  {
    return (EAttribute)enumEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getENUM_CodeListIdentifier()
  {
    return (EAttribute)enumEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getENUM_Dictionary()
  {
    return (EAttribute)enumEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getENUM_UniqueIdentifier()
  {
    return (EAttribute)enumEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getENUM_VersionIdentifier()
  {
    return (EAttribute)enumEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAssembledBase()
  {
    return assembledBaseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrimitive()
  {
    return primitiveEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAssembled()
  {
    return assembledEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssembled_Originals()
  {
    return (EReference)assembledEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssembled_Subsets()
  {
    return (EReference)assembledEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOriginal()
  {
    return originalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOriginal_Codes()
  {
    return (EReference)originalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubset()
  {
    return subsetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubset_Codes()
  {
    return (EReference)subsetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCodelistEntry()
  {
    return codelistEntryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCodelistEntry_Name()
  {
    return (EAttribute)codelistEntryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCodelistEntry_Description()
  {
    return (EAttribute)codelistEntryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCCLibrary()
  {
    return ccLibraryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCCLibrary_BusinessTerm()
  {
    return (EAttribute)ccLibraryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCCLibrary_Copyright()
  {
    return (EAttribute)ccLibraryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCCLibrary_Owner()
  {
    return (EAttribute)ccLibraryEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCCLibrary_Reference()
  {
    return (EAttribute)ccLibraryEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCCLibrary_UniqueIdentifier()
  {
    return (EAttribute)ccLibraryEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCCLibrary_VersionIdentifier()
  {
    return (EAttribute)ccLibraryEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCCLibrary_BaseURN()
  {
    return (EAttribute)ccLibraryEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCCLibrary_NamespacePrefix()
  {
    return (EAttribute)ccLibraryEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCCLibrary_Accs()
  {
    return (EReference)ccLibraryEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getACC()
  {
    return accEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getACC_Name()
  {
    return (EAttribute)accEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getACC_BusinessTerm()
  {
    return (EAttribute)accEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getACC_Definition()
  {
    return (EAttribute)accEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getACC_Dictionary()
  {
    return (EAttribute)accEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getACC_UniqueIdentifier()
  {
    return (EAttribute)accEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getACC_VersionIdentifier()
  {
    return (EAttribute)accEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getACC_Properties()
  {
    return (EReference)accEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getACC_Constraints()
  {
    return (EReference)accEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getACCProperty()
  {
    return accPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getACCProperty_Multiplicity()
  {
    return (EAttribute)accPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getACCProperty_Name()
  {
    return (EAttribute)accPropertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getACCProperty_BusinessTerm()
  {
    return (EAttribute)accPropertyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getACCProperty_Definition()
  {
    return (EAttribute)accPropertyEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getACCProperty_Dictionary()
  {
    return (EAttribute)accPropertyEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getACCProperty_UniqueIdentifier()
  {
    return (EAttribute)accPropertyEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getACCProperty_VersionIdentifier()
  {
    return (EAttribute)accPropertyEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getACCProperty_SequencingKey()
  {
    return (EAttribute)accPropertyEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getASCC()
  {
    return asccEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getASCC_Type()
  {
    return (EReference)asccEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBCC()
  {
    return bccEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBCC_Type()
  {
    return (EReference)bccEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBCC_Restriction()
  {
    return (EAttribute)bccEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBCC_FixedValue()
  {
    return (EAttribute)bccEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCDTLibrary()
  {
    return cdtLibraryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCDTLibrary_BusinessTerm()
  {
    return (EAttribute)cdtLibraryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCDTLibrary_Copyright()
  {
    return (EAttribute)cdtLibraryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCDTLibrary_Owner()
  {
    return (EAttribute)cdtLibraryEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCDTLibrary_Reference()
  {
    return (EAttribute)cdtLibraryEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCDTLibrary_UniqueIdentifier()
  {
    return (EAttribute)cdtLibraryEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCDTLibrary_VersionIdentifier()
  {
    return (EAttribute)cdtLibraryEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCDTLibrary_BaseURN()
  {
    return (EAttribute)cdtLibraryEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCDTLibrary_NamespacePrefix()
  {
    return (EAttribute)cdtLibraryEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCDTLibrary_Cdts()
  {
    return (EReference)cdtLibraryEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCDT()
  {
    return cdtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCDT_Name()
  {
    return (EAttribute)cdtEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCDT_BusinessTerm()
  {
    return (EAttribute)cdtEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCDT_Definition()
  {
    return (EAttribute)cdtEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCDT_Dictionary()
  {
    return (EAttribute)cdtEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCDT_UniqueIdentifier()
  {
    return (EAttribute)cdtEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCDT_VersionIdentifier()
  {
    return (EAttribute)cdtEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCDT_Properties()
  {
    return (EReference)cdtEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCDTProperty()
  {
    return cdtPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCDTProperty_Multiplicity()
  {
    return (EAttribute)cdtPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCDTProperty_Name()
  {
    return (EAttribute)cdtPropertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCDTProperty_Type()
  {
    return (EReference)cdtPropertyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCDTProperty_BusinessTerm()
  {
    return (EAttribute)cdtPropertyEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCDTProperty_Definition()
  {
    return (EAttribute)cdtPropertyEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCDTProperty_Dictionary()
  {
    return (EAttribute)cdtPropertyEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCDTProperty_UniqueIdentifier()
  {
    return (EAttribute)cdtPropertyEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCDTProperty_VersionIdentifier()
  {
    return (EAttribute)cdtPropertyEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCDT_Content()
  {
    return cdT_ContentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCDT_Supplement()
  {
    return cdT_SupplementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCDT_Supplement_DefaultValue()
  {
    return (EAttribute)cdT_SupplementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCDT_Supplement_Restriction()
  {
    return (EAttribute)cdT_SupplementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCDT_Supplement_FixedValue()
  {
    return (EAttribute)cdT_SupplementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrimitiveLibrary()
  {
    return primitiveLibraryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrimitiveLibrary_Types()
  {
    return (EReference)primitiveLibraryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOclInvariant()
  {
    return oclInvariantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOclInvariant_Expression()
  {
    return (EReference)oclInvariantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOclExpression()
  {
    return oclExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOclValue()
  {
    return oclValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOclReference()
  {
    return oclReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOclPathSelfHead()
  {
    return oclPathSelfHeadEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOclPathSelfHead_Path()
  {
    return (EReference)oclPathSelfHeadEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOclPathFeatureHead()
  {
    return oclPathFeatureHeadEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOclPathFeatureHead_Feature()
  {
    return (EReference)oclPathFeatureHeadEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOclPathFeatureHead_Tail()
  {
    return (EReference)oclPathFeatureHeadEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOclPathTail()
  {
    return oclPathTailEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOclPathTail_Feature()
  {
    return (EReference)oclPathTailEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOclPathTail_Tail()
  {
    return (EReference)oclPathTailEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOclRef()
  {
    return oclRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOclRef_Name()
  {
    return (EAttribute)oclRefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOclRef_Multiplicity()
  {
    return (EAttribute)oclRefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOclFunctionCall()
  {
    return oclFunctionCallEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOclForAll()
  {
    return oclForAllEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOclForAll_Body()
  {
    return (EReference)oclForAllEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOclIsEmpty()
  {
    return oclIsEmptyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOclNotEmpty()
  {
    return oclNotEmptyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOclSize()
  {
    return oclSizeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOclLiteral()
  {
    return oclLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOclEnumerationLiteral()
  {
    return oclEnumerationLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOclEnumerationLiteral_Value()
  {
    return (EAttribute)oclEnumerationLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOclIntegerLiteral()
  {
    return oclIntegerLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOclIntegerLiteral_Value()
  {
    return (EAttribute)oclIntegerLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOclStringLiteral()
  {
    return oclStringLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOclStringLiteral_Value()
  {
    return (EAttribute)oclStringLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOclBooleanLiteral()
  {
    return oclBooleanLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOclBooleanFalse()
  {
    return oclBooleanFalseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOclImplies()
  {
    return oclImpliesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOclImplies_Left()
  {
    return (EReference)oclImpliesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOclImplies_Right()
  {
    return (EReference)oclImpliesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOclAnd()
  {
    return oclAndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOclAnd_Left()
  {
    return (EReference)oclAndEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOclAnd_Right()
  {
    return (EReference)oclAndEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOclOr()
  {
    return oclOrEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOclOr_Left()
  {
    return (EReference)oclOrEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOclOr_Right()
  {
    return (EReference)oclOrEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOclXor()
  {
    return oclXorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOclXor_Left()
  {
    return (EReference)oclXorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOclXor_Right()
  {
    return (EReference)oclXorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOclEqual()
  {
    return oclEqualEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOclEqual_Left()
  {
    return (EReference)oclEqualEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOclEqual_Right()
  {
    return (EReference)oclEqualEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOclLess()
  {
    return oclLessEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOclLess_Left()
  {
    return (EReference)oclLessEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOclLess_Right()
  {
    return (EReference)oclLessEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOclLessOrEqual()
  {
    return oclLessOrEqualEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOclLessOrEqual_Left()
  {
    return (EReference)oclLessOrEqualEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOclLessOrEqual_Right()
  {
    return (EReference)oclLessOrEqualEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOclMore()
  {
    return oclMoreEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOclMore_Left()
  {
    return (EReference)oclMoreEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOclMore_Right()
  {
    return (EReference)oclMoreEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOclMoreOrEqual()
  {
    return oclMoreOrEqualEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOclMoreOrEqual_Left()
  {
    return (EReference)oclMoreOrEqualEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOclMoreOrEqual_Right()
  {
    return (EReference)oclMoreOrEqualEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOclArrow()
  {
    return oclArrowEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOclArrow_Left()
  {
    return (EReference)oclArrowEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOclArrow_Right()
  {
    return (EReference)oclArrowEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOclBooleanTrue()
  {
    return oclBooleanTrueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getConstraintKind()
  {
    return constraintKindEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getMultiplicityKind()
  {
    return multiplicityKindEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UmmFactory getUmmFactory()
  {
    return (UmmFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    libraryEClass = createEClass(LIBRARY);
    createEAttribute(libraryEClass, LIBRARY__NAME);

    docLibraryEClass = createEClass(DOC_LIBRARY);
    createEAttribute(docLibraryEClass, DOC_LIBRARY__BUSINESS_TERM);
    createEAttribute(docLibraryEClass, DOC_LIBRARY__COPYRIGHT);
    createEAttribute(docLibraryEClass, DOC_LIBRARY__OWNER);
    createEAttribute(docLibraryEClass, DOC_LIBRARY__REFERENCE);
    createEAttribute(docLibraryEClass, DOC_LIBRARY__UNIQUE_IDENTIFIER);
    createEAttribute(docLibraryEClass, DOC_LIBRARY__VERSION_IDENTIFIER);
    createEAttribute(docLibraryEClass, DOC_LIBRARY__BASE_URN);
    createEAttribute(docLibraryEClass, DOC_LIBRARY__NAMESPACE_PREFIX);
    createEReference(docLibraryEClass, DOC_LIBRARY__BIE_LIBRARY);
    createEReference(docLibraryEClass, DOC_LIBRARY__BDT_LIBRARY);
    createEReference(docLibraryEClass, DOC_LIBRARY__ENVELOPES);

    infEnvelopeEClass = createEClass(INF_ENVELOPE);
    createEAttribute(infEnvelopeEClass, INF_ENVELOPE__NAME);
    createEReference(infEnvelopeEClass, INF_ENVELOPE__ASSEMBLIES);

    maEClass = createEClass(MA);
    createEReference(maEClass, MA__PROPERTIES);
    createEReference(maEClass, MA__CONSTRAINTS);

    maPropertyEClass = createEClass(MA_PROPERTY);
    createEReference(maPropertyEClass, MA_PROPERTY__TYPE);

    asmaEClass = createEClass(ASMA);

    asnoneEClass = createEClass(ASNONE);

    constraintEClass = createEClass(CONSTRAINT);
    createEReference(constraintEClass, CONSTRAINT__CONTEXT);
    createEReference(constraintEClass, CONSTRAINT__TYPE);
    createEReference(constraintEClass, CONSTRAINT__INVARIANTS);

    contextRefEClass = createEClass(CONTEXT_REF);
    createEAttribute(contextRefEClass, CONTEXT_REF__NAME);

    tC_ConstraintEClass = createEClass(TC_CONSTRAINT);
    createEAttribute(tC_ConstraintEClass, TC_CONSTRAINT__KIND);
    createEAttribute(tC_ConstraintEClass, TC_CONSTRAINT__LIST_IDENTIFIER);
    createEAttribute(tC_ConstraintEClass, TC_CONSTRAINT__RESPONSIBLE_AGENCY);

    bieLibraryEClass = createEClass(BIE_LIBRARY);
    createEAttribute(bieLibraryEClass, BIE_LIBRARY__BUSINESS_TERM);
    createEAttribute(bieLibraryEClass, BIE_LIBRARY__COPYRIGHT);
    createEAttribute(bieLibraryEClass, BIE_LIBRARY__OWNER);
    createEAttribute(bieLibraryEClass, BIE_LIBRARY__REFERENCE);
    createEAttribute(bieLibraryEClass, BIE_LIBRARY__UNIQUE_IDENTIFIER);
    createEAttribute(bieLibraryEClass, BIE_LIBRARY__VERSION_IDENTIFIER);
    createEAttribute(bieLibraryEClass, BIE_LIBRARY__BASE_URN);
    createEAttribute(bieLibraryEClass, BIE_LIBRARY__NAMESPACE_PREFIX);
    createEReference(bieLibraryEClass, BIE_LIBRARY__BDT_LIBRARY);
    createEReference(bieLibraryEClass, BIE_LIBRARY__ABIES);

    abieEClass = createEClass(ABIE);
    createEAttribute(abieEClass, ABIE__BUSINESS_TERM);
    createEAttribute(abieEClass, ABIE__DEFINITION);
    createEAttribute(abieEClass, ABIE__DICTIONARY);
    createEAttribute(abieEClass, ABIE__UNIQUE_IDENTIFIER);
    createEAttribute(abieEClass, ABIE__VERSION_IDENTIFIER);
    createEReference(abieEClass, ABIE__PROPERTIES);
    createEReference(abieEClass, ABIE__CONSTRAINTS);

    abiePropertyEClass = createEClass(ABIE_PROPERTY);
    createEReference(abiePropertyEClass, ABIE_PROPERTY__OR);
    createEAttribute(abiePropertyEClass, ABIE_PROPERTY__BUSINESS_TERM);
    createEAttribute(abiePropertyEClass, ABIE_PROPERTY__DEFINITION);
    createEAttribute(abiePropertyEClass, ABIE_PROPERTY__DICTIONARY);
    createEAttribute(abiePropertyEClass, ABIE_PROPERTY__UNIQUE_IDENTIFIER);
    createEAttribute(abiePropertyEClass, ABIE_PROPERTY__VERSION_IDENTIFIER);
    createEAttribute(abiePropertyEClass, ABIE_PROPERTY__SEQUENCING_KEY);

    asbieEClass = createEClass(ASBIE);
    createEReference(asbieEClass, ASBIE__TYPE);

    bbieEClass = createEClass(BBIE);
    createEReference(bbieEClass, BBIE__TYPE);
    createEAttribute(bbieEClass, BBIE__RESTRICTION);
    createEAttribute(bbieEClass, BBIE__FIXED_VALUE);

    bdtLibraryEClass = createEClass(BDT_LIBRARY);
    createEAttribute(bdtLibraryEClass, BDT_LIBRARY__BUSINESS_TERM);
    createEAttribute(bdtLibraryEClass, BDT_LIBRARY__COPYRIGHT);
    createEAttribute(bdtLibraryEClass, BDT_LIBRARY__OWNER);
    createEAttribute(bdtLibraryEClass, BDT_LIBRARY__REFERENCE);
    createEAttribute(bdtLibraryEClass, BDT_LIBRARY__UNIQUE_IDENTIFIER);
    createEAttribute(bdtLibraryEClass, BDT_LIBRARY__VERSION_IDENTIFIER);
    createEAttribute(bdtLibraryEClass, BDT_LIBRARY__BASE_URN);
    createEAttribute(bdtLibraryEClass, BDT_LIBRARY__NAMESPACE_PREFIX);
    createEReference(bdtLibraryEClass, BDT_LIBRARY__BDTS);

    bdtEClass = createEClass(BDT);
    createEAttribute(bdtEClass, BDT__BUSINESS_TERM);
    createEAttribute(bdtEClass, BDT__DEFINITION);
    createEAttribute(bdtEClass, BDT__DICTIONARY);
    createEAttribute(bdtEClass, BDT__UNIQUE_IDENTIFIER);
    createEAttribute(bdtEClass, BDT__VERSION_IDENTIFIER);
    createEReference(bdtEClass, BDT__PROPERTIES);

    bdtPropertyEClass = createEClass(BDT_PROPERTY);
    createEReference(bdtPropertyEClass, BDT_PROPERTY__TYPE);
    createEAttribute(bdtPropertyEClass, BDT_PROPERTY__PATTERN);
    createEAttribute(bdtPropertyEClass, BDT_PROPERTY__MIN_LENGTH);
    createEAttribute(bdtPropertyEClass, BDT_PROPERTY__MAX_LENGTH);
    createEAttribute(bdtPropertyEClass, BDT_PROPERTY__LENGTH);
    createEAttribute(bdtPropertyEClass, BDT_PROPERTY__BUSINESS_TERM);
    createEAttribute(bdtPropertyEClass, BDT_PROPERTY__DEFINITION);
    createEAttribute(bdtPropertyEClass, BDT_PROPERTY__DICTIONARY);
    createEAttribute(bdtPropertyEClass, BDT_PROPERTY__UNIQUE_IDENTIFIER);
    createEAttribute(bdtPropertyEClass, BDT_PROPERTY__VERSION_IDENTIFIER);

    contentEClass = createEClass(CONTENT);

    supplementEClass = createEClass(SUPPLEMENT);
    createEAttribute(supplementEClass, SUPPLEMENT__DEFAULT_VALUE);
    createEAttribute(supplementEClass, SUPPLEMENT__RESTRICTION);
    createEAttribute(supplementEClass, SUPPLEMENT__FIXED_VALUE);

    enumLibraryEClass = createEClass(ENUM_LIBRARY);
    createEAttribute(enumLibraryEClass, ENUM_LIBRARY__BUSINESS_TERM);
    createEAttribute(enumLibraryEClass, ENUM_LIBRARY__COPYRIGHT);
    createEAttribute(enumLibraryEClass, ENUM_LIBRARY__OWNER);
    createEAttribute(enumLibraryEClass, ENUM_LIBRARY__REFERENCE);
    createEAttribute(enumLibraryEClass, ENUM_LIBRARY__UNIQUE_IDENTIFIER);
    createEAttribute(enumLibraryEClass, ENUM_LIBRARY__VERSION_IDENTIFIER);
    createEAttribute(enumLibraryEClass, ENUM_LIBRARY__BASE_URN);
    createEAttribute(enumLibraryEClass, ENUM_LIBRARY__NAMESPACE_PREFIX);
    createEReference(enumLibraryEClass, ENUM_LIBRARY__ENUMS);

    enumEClass = createEClass(ENUM);
    createEAttribute(enumEClass, ENUM__NAME);
    createEAttribute(enumEClass, ENUM__BUSINESS_TERM);
    createEAttribute(enumEClass, ENUM__DEFINITION);
    createEAttribute(enumEClass, ENUM__CODE_LIST_AGENCY_IDENTIFIER);
    createEAttribute(enumEClass, ENUM__CODE_LIST_NAME);
    createEAttribute(enumEClass, ENUM__CODE_LIST_IDENTIFIER);
    createEAttribute(enumEClass, ENUM__DICTIONARY);
    createEAttribute(enumEClass, ENUM__UNIQUE_IDENTIFIER);
    createEAttribute(enumEClass, ENUM__VERSION_IDENTIFIER);

    assembledBaseEClass = createEClass(ASSEMBLED_BASE);

    primitiveEClass = createEClass(PRIMITIVE);

    assembledEClass = createEClass(ASSEMBLED);
    createEReference(assembledEClass, ASSEMBLED__ORIGINALS);
    createEReference(assembledEClass, ASSEMBLED__SUBSETS);

    originalEClass = createEClass(ORIGINAL);
    createEReference(originalEClass, ORIGINAL__CODES);

    subsetEClass = createEClass(SUBSET);
    createEReference(subsetEClass, SUBSET__CODES);

    codelistEntryEClass = createEClass(CODELIST_ENTRY);
    createEAttribute(codelistEntryEClass, CODELIST_ENTRY__NAME);
    createEAttribute(codelistEntryEClass, CODELIST_ENTRY__DESCRIPTION);

    ccLibraryEClass = createEClass(CC_LIBRARY);
    createEAttribute(ccLibraryEClass, CC_LIBRARY__BUSINESS_TERM);
    createEAttribute(ccLibraryEClass, CC_LIBRARY__COPYRIGHT);
    createEAttribute(ccLibraryEClass, CC_LIBRARY__OWNER);
    createEAttribute(ccLibraryEClass, CC_LIBRARY__REFERENCE);
    createEAttribute(ccLibraryEClass, CC_LIBRARY__UNIQUE_IDENTIFIER);
    createEAttribute(ccLibraryEClass, CC_LIBRARY__VERSION_IDENTIFIER);
    createEAttribute(ccLibraryEClass, CC_LIBRARY__BASE_URN);
    createEAttribute(ccLibraryEClass, CC_LIBRARY__NAMESPACE_PREFIX);
    createEReference(ccLibraryEClass, CC_LIBRARY__ACCS);

    accEClass = createEClass(ACC);
    createEAttribute(accEClass, ACC__NAME);
    createEAttribute(accEClass, ACC__BUSINESS_TERM);
    createEAttribute(accEClass, ACC__DEFINITION);
    createEAttribute(accEClass, ACC__DICTIONARY);
    createEAttribute(accEClass, ACC__UNIQUE_IDENTIFIER);
    createEAttribute(accEClass, ACC__VERSION_IDENTIFIER);
    createEReference(accEClass, ACC__PROPERTIES);
    createEReference(accEClass, ACC__CONSTRAINTS);

    accPropertyEClass = createEClass(ACC_PROPERTY);
    createEAttribute(accPropertyEClass, ACC_PROPERTY__MULTIPLICITY);
    createEAttribute(accPropertyEClass, ACC_PROPERTY__NAME);
    createEAttribute(accPropertyEClass, ACC_PROPERTY__BUSINESS_TERM);
    createEAttribute(accPropertyEClass, ACC_PROPERTY__DEFINITION);
    createEAttribute(accPropertyEClass, ACC_PROPERTY__DICTIONARY);
    createEAttribute(accPropertyEClass, ACC_PROPERTY__UNIQUE_IDENTIFIER);
    createEAttribute(accPropertyEClass, ACC_PROPERTY__VERSION_IDENTIFIER);
    createEAttribute(accPropertyEClass, ACC_PROPERTY__SEQUENCING_KEY);

    asccEClass = createEClass(ASCC);
    createEReference(asccEClass, ASCC__TYPE);

    bccEClass = createEClass(BCC);
    createEReference(bccEClass, BCC__TYPE);
    createEAttribute(bccEClass, BCC__RESTRICTION);
    createEAttribute(bccEClass, BCC__FIXED_VALUE);

    cdtLibraryEClass = createEClass(CDT_LIBRARY);
    createEAttribute(cdtLibraryEClass, CDT_LIBRARY__BUSINESS_TERM);
    createEAttribute(cdtLibraryEClass, CDT_LIBRARY__COPYRIGHT);
    createEAttribute(cdtLibraryEClass, CDT_LIBRARY__OWNER);
    createEAttribute(cdtLibraryEClass, CDT_LIBRARY__REFERENCE);
    createEAttribute(cdtLibraryEClass, CDT_LIBRARY__UNIQUE_IDENTIFIER);
    createEAttribute(cdtLibraryEClass, CDT_LIBRARY__VERSION_IDENTIFIER);
    createEAttribute(cdtLibraryEClass, CDT_LIBRARY__BASE_URN);
    createEAttribute(cdtLibraryEClass, CDT_LIBRARY__NAMESPACE_PREFIX);
    createEReference(cdtLibraryEClass, CDT_LIBRARY__CDTS);

    cdtEClass = createEClass(CDT);
    createEAttribute(cdtEClass, CDT__NAME);
    createEAttribute(cdtEClass, CDT__BUSINESS_TERM);
    createEAttribute(cdtEClass, CDT__DEFINITION);
    createEAttribute(cdtEClass, CDT__DICTIONARY);
    createEAttribute(cdtEClass, CDT__UNIQUE_IDENTIFIER);
    createEAttribute(cdtEClass, CDT__VERSION_IDENTIFIER);
    createEReference(cdtEClass, CDT__PROPERTIES);

    cdtPropertyEClass = createEClass(CDT_PROPERTY);
    createEAttribute(cdtPropertyEClass, CDT_PROPERTY__MULTIPLICITY);
    createEAttribute(cdtPropertyEClass, CDT_PROPERTY__NAME);
    createEReference(cdtPropertyEClass, CDT_PROPERTY__TYPE);
    createEAttribute(cdtPropertyEClass, CDT_PROPERTY__BUSINESS_TERM);
    createEAttribute(cdtPropertyEClass, CDT_PROPERTY__DEFINITION);
    createEAttribute(cdtPropertyEClass, CDT_PROPERTY__DICTIONARY);
    createEAttribute(cdtPropertyEClass, CDT_PROPERTY__UNIQUE_IDENTIFIER);
    createEAttribute(cdtPropertyEClass, CDT_PROPERTY__VERSION_IDENTIFIER);

    cdT_ContentEClass = createEClass(CDT_CONTENT);

    cdT_SupplementEClass = createEClass(CDT_SUPPLEMENT);
    createEAttribute(cdT_SupplementEClass, CDT_SUPPLEMENT__DEFAULT_VALUE);
    createEAttribute(cdT_SupplementEClass, CDT_SUPPLEMENT__RESTRICTION);
    createEAttribute(cdT_SupplementEClass, CDT_SUPPLEMENT__FIXED_VALUE);

    primitiveLibraryEClass = createEClass(PRIMITIVE_LIBRARY);
    createEReference(primitiveLibraryEClass, PRIMITIVE_LIBRARY__TYPES);

    oclInvariantEClass = createEClass(OCL_INVARIANT);
    createEReference(oclInvariantEClass, OCL_INVARIANT__EXPRESSION);

    oclExpressionEClass = createEClass(OCL_EXPRESSION);

    oclValueEClass = createEClass(OCL_VALUE);

    oclReferenceEClass = createEClass(OCL_REFERENCE);

    oclPathSelfHeadEClass = createEClass(OCL_PATH_SELF_HEAD);
    createEReference(oclPathSelfHeadEClass, OCL_PATH_SELF_HEAD__PATH);

    oclPathFeatureHeadEClass = createEClass(OCL_PATH_FEATURE_HEAD);
    createEReference(oclPathFeatureHeadEClass, OCL_PATH_FEATURE_HEAD__FEATURE);
    createEReference(oclPathFeatureHeadEClass, OCL_PATH_FEATURE_HEAD__TAIL);

    oclPathTailEClass = createEClass(OCL_PATH_TAIL);
    createEReference(oclPathTailEClass, OCL_PATH_TAIL__FEATURE);
    createEReference(oclPathTailEClass, OCL_PATH_TAIL__TAIL);

    oclRefEClass = createEClass(OCL_REF);
    createEAttribute(oclRefEClass, OCL_REF__NAME);
    createEAttribute(oclRefEClass, OCL_REF__MULTIPLICITY);

    oclFunctionCallEClass = createEClass(OCL_FUNCTION_CALL);

    oclForAllEClass = createEClass(OCL_FOR_ALL);
    createEReference(oclForAllEClass, OCL_FOR_ALL__BODY);

    oclIsEmptyEClass = createEClass(OCL_IS_EMPTY);

    oclNotEmptyEClass = createEClass(OCL_NOT_EMPTY);

    oclSizeEClass = createEClass(OCL_SIZE);

    oclLiteralEClass = createEClass(OCL_LITERAL);

    oclEnumerationLiteralEClass = createEClass(OCL_ENUMERATION_LITERAL);
    createEAttribute(oclEnumerationLiteralEClass, OCL_ENUMERATION_LITERAL__VALUE);

    oclIntegerLiteralEClass = createEClass(OCL_INTEGER_LITERAL);
    createEAttribute(oclIntegerLiteralEClass, OCL_INTEGER_LITERAL__VALUE);

    oclStringLiteralEClass = createEClass(OCL_STRING_LITERAL);
    createEAttribute(oclStringLiteralEClass, OCL_STRING_LITERAL__VALUE);

    oclBooleanLiteralEClass = createEClass(OCL_BOOLEAN_LITERAL);

    oclBooleanFalseEClass = createEClass(OCL_BOOLEAN_FALSE);

    oclImpliesEClass = createEClass(OCL_IMPLIES);
    createEReference(oclImpliesEClass, OCL_IMPLIES__LEFT);
    createEReference(oclImpliesEClass, OCL_IMPLIES__RIGHT);

    oclAndEClass = createEClass(OCL_AND);
    createEReference(oclAndEClass, OCL_AND__LEFT);
    createEReference(oclAndEClass, OCL_AND__RIGHT);

    oclOrEClass = createEClass(OCL_OR);
    createEReference(oclOrEClass, OCL_OR__LEFT);
    createEReference(oclOrEClass, OCL_OR__RIGHT);

    oclXorEClass = createEClass(OCL_XOR);
    createEReference(oclXorEClass, OCL_XOR__LEFT);
    createEReference(oclXorEClass, OCL_XOR__RIGHT);

    oclEqualEClass = createEClass(OCL_EQUAL);
    createEReference(oclEqualEClass, OCL_EQUAL__LEFT);
    createEReference(oclEqualEClass, OCL_EQUAL__RIGHT);

    oclLessEClass = createEClass(OCL_LESS);
    createEReference(oclLessEClass, OCL_LESS__LEFT);
    createEReference(oclLessEClass, OCL_LESS__RIGHT);

    oclLessOrEqualEClass = createEClass(OCL_LESS_OR_EQUAL);
    createEReference(oclLessOrEqualEClass, OCL_LESS_OR_EQUAL__LEFT);
    createEReference(oclLessOrEqualEClass, OCL_LESS_OR_EQUAL__RIGHT);

    oclMoreEClass = createEClass(OCL_MORE);
    createEReference(oclMoreEClass, OCL_MORE__LEFT);
    createEReference(oclMoreEClass, OCL_MORE__RIGHT);

    oclMoreOrEqualEClass = createEClass(OCL_MORE_OR_EQUAL);
    createEReference(oclMoreOrEqualEClass, OCL_MORE_OR_EQUAL__LEFT);
    createEReference(oclMoreOrEqualEClass, OCL_MORE_OR_EQUAL__RIGHT);

    oclArrowEClass = createEClass(OCL_ARROW);
    createEReference(oclArrowEClass, OCL_ARROW__LEFT);
    createEReference(oclArrowEClass, OCL_ARROW__RIGHT);

    oclBooleanTrueEClass = createEClass(OCL_BOOLEAN_TRUE);

    // Create enums
    constraintKindEEnum = createEEnum(CONSTRAINT_KIND);
    multiplicityKindEEnum = createEEnum(MULTIPLICITY_KIND);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    docLibraryEClass.getESuperTypes().add(this.getLibrary());
    maEClass.getESuperTypes().add(this.getContextRef());
    maPropertyEClass.getESuperTypes().add(this.getOclRef());
    asmaEClass.getESuperTypes().add(this.getMAProperty());
    asnoneEClass.getESuperTypes().add(this.getMAProperty());
    bieLibraryEClass.getESuperTypes().add(this.getLibrary());
    abieEClass.getESuperTypes().add(this.getContextRef());
    abiePropertyEClass.getESuperTypes().add(this.getOclRef());
    asbieEClass.getESuperTypes().add(this.getABIEProperty());
    bbieEClass.getESuperTypes().add(this.getABIEProperty());
    bdtLibraryEClass.getESuperTypes().add(this.getLibrary());
    bdtEClass.getESuperTypes().add(this.getContextRef());
    bdtPropertyEClass.getESuperTypes().add(this.getOclRef());
    contentEClass.getESuperTypes().add(this.getBDTProperty());
    supplementEClass.getESuperTypes().add(this.getBDTProperty());
    enumLibraryEClass.getESuperTypes().add(this.getLibrary());
    assembledBaseEClass.getESuperTypes().add(this.getENUM());
    primitiveEClass.getESuperTypes().add(this.getAssembledBase());
    assembledEClass.getESuperTypes().add(this.getAssembledBase());
    originalEClass.getESuperTypes().add(this.getENUM());
    subsetEClass.getESuperTypes().add(this.getENUM());
    ccLibraryEClass.getESuperTypes().add(this.getLibrary());
    asccEClass.getESuperTypes().add(this.getACCProperty());
    bccEClass.getESuperTypes().add(this.getACCProperty());
    cdtLibraryEClass.getESuperTypes().add(this.getLibrary());
    cdT_ContentEClass.getESuperTypes().add(this.getCDTProperty());
    cdT_SupplementEClass.getESuperTypes().add(this.getCDTProperty());
    primitiveLibraryEClass.getESuperTypes().add(this.getLibrary());
    oclValueEClass.getESuperTypes().add(this.getOclExpression());
    oclReferenceEClass.getESuperTypes().add(this.getOclValue());
    oclPathSelfHeadEClass.getESuperTypes().add(this.getOclReference());
    oclPathFeatureHeadEClass.getESuperTypes().add(this.getOclReference());
    oclForAllEClass.getESuperTypes().add(this.getOclFunctionCall());
    oclIsEmptyEClass.getESuperTypes().add(this.getOclFunctionCall());
    oclNotEmptyEClass.getESuperTypes().add(this.getOclFunctionCall());
    oclSizeEClass.getESuperTypes().add(this.getOclFunctionCall());
    oclLiteralEClass.getESuperTypes().add(this.getOclValue());
    oclEnumerationLiteralEClass.getESuperTypes().add(this.getOclLiteral());
    oclIntegerLiteralEClass.getESuperTypes().add(this.getOclLiteral());
    oclStringLiteralEClass.getESuperTypes().add(this.getOclLiteral());
    oclBooleanLiteralEClass.getESuperTypes().add(this.getOclLiteral());
    oclBooleanFalseEClass.getESuperTypes().add(this.getOclBooleanLiteral());
    oclImpliesEClass.getESuperTypes().add(this.getOclExpression());
    oclAndEClass.getESuperTypes().add(this.getOclExpression());
    oclOrEClass.getESuperTypes().add(this.getOclExpression());
    oclXorEClass.getESuperTypes().add(this.getOclExpression());
    oclEqualEClass.getESuperTypes().add(this.getOclExpression());
    oclLessEClass.getESuperTypes().add(this.getOclExpression());
    oclLessOrEqualEClass.getESuperTypes().add(this.getOclExpression());
    oclMoreEClass.getESuperTypes().add(this.getOclExpression());
    oclMoreOrEqualEClass.getESuperTypes().add(this.getOclExpression());
    oclArrowEClass.getESuperTypes().add(this.getOclExpression());
    oclBooleanTrueEClass.getESuperTypes().add(this.getOclBooleanLiteral());

    // Initialize classes and features; add operations and parameters
    initEClass(libraryEClass, Library.class, "Library", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLibrary_Name(), ecorePackage.getEString(), "name", null, 0, 1, Library.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(docLibraryEClass, DocLibrary.class, "DocLibrary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDocLibrary_BusinessTerm(), ecorePackage.getEString(), "businessTerm", null, 0, -1, DocLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDocLibrary_Copyright(), ecorePackage.getEString(), "copyright", null, 0, -1, DocLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDocLibrary_Owner(), ecorePackage.getEString(), "owner", null, 0, -1, DocLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDocLibrary_Reference(), ecorePackage.getEString(), "reference", null, 0, -1, DocLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDocLibrary_UniqueIdentifier(), ecorePackage.getEString(), "uniqueIdentifier", null, 0, 1, DocLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDocLibrary_VersionIdentifier(), ecorePackage.getEString(), "versionIdentifier", null, 0, 1, DocLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDocLibrary_BaseURN(), ecorePackage.getEString(), "baseURN", null, 0, 1, DocLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDocLibrary_NamespacePrefix(), ecorePackage.getEString(), "namespacePrefix", null, 0, 1, DocLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDocLibrary_BieLibrary(), this.getBIELibrary(), null, "bieLibrary", null, 0, 1, DocLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDocLibrary_BdtLibrary(), this.getBDTLibrary(), null, "bdtLibrary", null, 0, 1, DocLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDocLibrary_Envelopes(), this.getInfEnvelope(), null, "envelopes", null, 0, -1, DocLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(infEnvelopeEClass, InfEnvelope.class, "InfEnvelope", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInfEnvelope_Name(), ecorePackage.getEString(), "name", null, 0, 1, InfEnvelope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInfEnvelope_Assemblies(), this.getMA(), null, "assemblies", null, 0, -1, InfEnvelope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(maEClass, org.ebix.umm.umm.MA.class, "MA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMA_Properties(), this.getMAProperty(), null, "properties", null, 0, -1, org.ebix.umm.umm.MA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMA_Constraints(), this.getConstraint(), null, "constraints", null, 0, -1, org.ebix.umm.umm.MA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(maPropertyEClass, MAProperty.class, "MAProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMAProperty_Type(), this.getABIE(), null, "type", null, 0, 1, MAProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(asmaEClass, org.ebix.umm.umm.ASMA.class, "ASMA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(asnoneEClass, org.ebix.umm.umm.ASNONE.class, "ASNONE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(constraintEClass, Constraint.class, "Constraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConstraint_Context(), this.getContextRef(), null, "context", null, 0, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConstraint_Type(), this.getTC_Constraint(), null, "type", null, 0, -1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConstraint_Invariants(), this.getOclInvariant(), null, "invariants", null, 0, -1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(contextRefEClass, ContextRef.class, "ContextRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getContextRef_Name(), ecorePackage.getEString(), "name", null, 0, 1, ContextRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tC_ConstraintEClass, TC_Constraint.class, "TC_Constraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTC_Constraint_Kind(), this.getConstraintKind(), "kind", null, 0, 1, TC_Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTC_Constraint_ListIdentifier(), ecorePackage.getEString(), "listIdentifier", null, 0, 1, TC_Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTC_Constraint_ResponsibleAgency(), ecorePackage.getEString(), "responsibleAgency", null, 0, 1, TC_Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bieLibraryEClass, BIELibrary.class, "BIELibrary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBIELibrary_BusinessTerm(), ecorePackage.getEString(), "businessTerm", null, 0, -1, BIELibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBIELibrary_Copyright(), ecorePackage.getEString(), "copyright", null, 0, -1, BIELibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBIELibrary_Owner(), ecorePackage.getEString(), "owner", null, 0, -1, BIELibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBIELibrary_Reference(), ecorePackage.getEString(), "reference", null, 0, -1, BIELibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBIELibrary_UniqueIdentifier(), ecorePackage.getEString(), "uniqueIdentifier", null, 0, 1, BIELibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBIELibrary_VersionIdentifier(), ecorePackage.getEString(), "versionIdentifier", null, 0, 1, BIELibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBIELibrary_BaseURN(), ecorePackage.getEString(), "baseURN", null, 0, 1, BIELibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBIELibrary_NamespacePrefix(), ecorePackage.getEString(), "namespacePrefix", null, 0, 1, BIELibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBIELibrary_BdtLibrary(), this.getBDTLibrary(), null, "bdtLibrary", null, 0, 1, BIELibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBIELibrary_Abies(), this.getABIE(), null, "abies", null, 0, -1, BIELibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abieEClass, org.ebix.umm.umm.ABIE.class, "ABIE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getABIE_BusinessTerm(), ecorePackage.getEString(), "businessTerm", null, 0, -1, org.ebix.umm.umm.ABIE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getABIE_Definition(), ecorePackage.getEString(), "definition", null, 0, 1, org.ebix.umm.umm.ABIE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getABIE_Dictionary(), ecorePackage.getEString(), "dictionary", null, 0, 1, org.ebix.umm.umm.ABIE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getABIE_UniqueIdentifier(), ecorePackage.getEString(), "uniqueIdentifier", null, 0, 1, org.ebix.umm.umm.ABIE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getABIE_VersionIdentifier(), ecorePackage.getEString(), "versionIdentifier", null, 0, 1, org.ebix.umm.umm.ABIE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getABIE_Properties(), this.getABIEProperty(), null, "properties", null, 0, -1, org.ebix.umm.umm.ABIE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getABIE_Constraints(), this.getConstraint(), null, "constraints", null, 0, -1, org.ebix.umm.umm.ABIE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abiePropertyEClass, ABIEProperty.class, "ABIEProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getABIEProperty_Or(), this.getABIEProperty(), null, "or", null, 0, -1, ABIEProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getABIEProperty_BusinessTerm(), ecorePackage.getEString(), "businessTerm", null, 0, -1, ABIEProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getABIEProperty_Definition(), ecorePackage.getEString(), "definition", null, 0, 1, ABIEProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getABIEProperty_Dictionary(), ecorePackage.getEString(), "dictionary", null, 0, 1, ABIEProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getABIEProperty_UniqueIdentifier(), ecorePackage.getEString(), "uniqueIdentifier", null, 0, 1, ABIEProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getABIEProperty_VersionIdentifier(), ecorePackage.getEString(), "versionIdentifier", null, 0, 1, ABIEProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getABIEProperty_SequencingKey(), ecorePackage.getEString(), "sequencingKey", null, 0, 1, ABIEProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(asbieEClass, org.ebix.umm.umm.ASBIE.class, "ASBIE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getASBIE_Type(), this.getABIE(), null, "type", null, 0, 1, org.ebix.umm.umm.ASBIE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bbieEClass, org.ebix.umm.umm.BBIE.class, "BBIE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBBIE_Type(), this.getBDT(), null, "type", null, 0, 1, org.ebix.umm.umm.BBIE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBBIE_Restriction(), ecorePackage.getEString(), "restriction", null, 0, -1, org.ebix.umm.umm.BBIE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBBIE_FixedValue(), ecorePackage.getEString(), "fixedValue", null, 0, 1, org.ebix.umm.umm.BBIE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bdtLibraryEClass, BDTLibrary.class, "BDTLibrary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBDTLibrary_BusinessTerm(), ecorePackage.getEString(), "businessTerm", null, 0, -1, BDTLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBDTLibrary_Copyright(), ecorePackage.getEString(), "copyright", null, 0, -1, BDTLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBDTLibrary_Owner(), ecorePackage.getEString(), "owner", null, 0, -1, BDTLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBDTLibrary_Reference(), ecorePackage.getEString(), "reference", null, 0, -1, BDTLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBDTLibrary_UniqueIdentifier(), ecorePackage.getEString(), "uniqueIdentifier", null, 0, 1, BDTLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBDTLibrary_VersionIdentifier(), ecorePackage.getEString(), "versionIdentifier", null, 0, 1, BDTLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBDTLibrary_BaseURN(), ecorePackage.getEString(), "baseURN", null, 0, 1, BDTLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBDTLibrary_NamespacePrefix(), ecorePackage.getEString(), "namespacePrefix", null, 0, 1, BDTLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBDTLibrary_Bdts(), this.getBDT(), null, "bdts", null, 0, -1, BDTLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bdtEClass, org.ebix.umm.umm.BDT.class, "BDT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBDT_BusinessTerm(), ecorePackage.getEString(), "businessTerm", null, 0, -1, org.ebix.umm.umm.BDT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBDT_Definition(), ecorePackage.getEString(), "definition", null, 0, 1, org.ebix.umm.umm.BDT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBDT_Dictionary(), ecorePackage.getEString(), "dictionary", null, 0, 1, org.ebix.umm.umm.BDT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBDT_UniqueIdentifier(), ecorePackage.getEString(), "uniqueIdentifier", null, 0, 1, org.ebix.umm.umm.BDT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBDT_VersionIdentifier(), ecorePackage.getEString(), "versionIdentifier", null, 0, 1, org.ebix.umm.umm.BDT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBDT_Properties(), this.getBDTProperty(), null, "properties", null, 0, -1, org.ebix.umm.umm.BDT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bdtPropertyEClass, BDTProperty.class, "BDTProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBDTProperty_Type(), this.getAssembledBase(), null, "type", null, 0, 1, BDTProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBDTProperty_Pattern(), ecorePackage.getEString(), "pattern", null, 0, 1, BDTProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBDTProperty_MinLength(), ecorePackage.getEInt(), "minLength", null, 0, 1, BDTProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBDTProperty_MaxLength(), ecorePackage.getEInt(), "maxLength", null, 0, 1, BDTProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBDTProperty_Length(), ecorePackage.getEInt(), "length", null, 0, 1, BDTProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBDTProperty_BusinessTerm(), ecorePackage.getEString(), "businessTerm", null, 0, -1, BDTProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBDTProperty_Definition(), ecorePackage.getEString(), "definition", null, 0, 1, BDTProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBDTProperty_Dictionary(), ecorePackage.getEString(), "dictionary", null, 0, 1, BDTProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBDTProperty_UniqueIdentifier(), ecorePackage.getEString(), "uniqueIdentifier", null, 0, 1, BDTProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBDTProperty_VersionIdentifier(), ecorePackage.getEString(), "versionIdentifier", null, 0, 1, BDTProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(contentEClass, Content.class, "Content", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(supplementEClass, Supplement.class, "Supplement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSupplement_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1, Supplement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSupplement_Restriction(), ecorePackage.getEString(), "restriction", null, 0, -1, Supplement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSupplement_FixedValue(), ecorePackage.getEString(), "fixedValue", null, 0, 1, Supplement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumLibraryEClass, ENUMLibrary.class, "ENUMLibrary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getENUMLibrary_BusinessTerm(), ecorePackage.getEString(), "businessTerm", null, 0, -1, ENUMLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getENUMLibrary_Copyright(), ecorePackage.getEString(), "copyright", null, 0, -1, ENUMLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getENUMLibrary_Owner(), ecorePackage.getEString(), "owner", null, 0, -1, ENUMLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getENUMLibrary_Reference(), ecorePackage.getEString(), "reference", null, 0, -1, ENUMLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getENUMLibrary_UniqueIdentifier(), ecorePackage.getEString(), "uniqueIdentifier", null, 0, 1, ENUMLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getENUMLibrary_VersionIdentifier(), ecorePackage.getEString(), "versionIdentifier", null, 0, 1, ENUMLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getENUMLibrary_BaseURN(), ecorePackage.getEString(), "baseURN", null, 0, 1, ENUMLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getENUMLibrary_NamespacePrefix(), ecorePackage.getEString(), "namespacePrefix", null, 0, 1, ENUMLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getENUMLibrary_Enums(), this.getENUM(), null, "enums", null, 0, -1, ENUMLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumEClass, org.ebix.umm.umm.ENUM.class, "ENUM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getENUM_Name(), ecorePackage.getEString(), "name", null, 0, 1, org.ebix.umm.umm.ENUM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getENUM_BusinessTerm(), ecorePackage.getEString(), "businessTerm", null, 0, -1, org.ebix.umm.umm.ENUM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getENUM_Definition(), ecorePackage.getEString(), "definition", null, 0, 1, org.ebix.umm.umm.ENUM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getENUM_CodeListAgencyIdentifier(), ecorePackage.getEString(), "codeListAgencyIdentifier", null, 0, 1, org.ebix.umm.umm.ENUM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getENUM_CodeListName(), ecorePackage.getEString(), "codeListName", null, 0, 1, org.ebix.umm.umm.ENUM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getENUM_CodeListIdentifier(), ecorePackage.getEString(), "codeListIdentifier", null, 0, 1, org.ebix.umm.umm.ENUM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getENUM_Dictionary(), ecorePackage.getEString(), "dictionary", null, 0, 1, org.ebix.umm.umm.ENUM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getENUM_UniqueIdentifier(), ecorePackage.getEString(), "uniqueIdentifier", null, 0, 1, org.ebix.umm.umm.ENUM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getENUM_VersionIdentifier(), ecorePackage.getEString(), "versionIdentifier", null, 0, 1, org.ebix.umm.umm.ENUM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(assembledBaseEClass, AssembledBase.class, "AssembledBase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(primitiveEClass, Primitive.class, "Primitive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(assembledEClass, Assembled.class, "Assembled", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAssembled_Originals(), this.getOriginal(), null, "originals", null, 0, -1, Assembled.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAssembled_Subsets(), this.getSubset(), null, "subsets", null, 0, -1, Assembled.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(originalEClass, Original.class, "Original", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOriginal_Codes(), this.getCodelistEntry(), null, "codes", null, 0, -1, Original.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(subsetEClass, Subset.class, "Subset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSubset_Codes(), this.getCodelistEntry(), null, "codes", null, 0, -1, Subset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(codelistEntryEClass, CodelistEntry.class, "CodelistEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCodelistEntry_Name(), ecorePackage.getEString(), "name", null, 0, 1, CodelistEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCodelistEntry_Description(), ecorePackage.getEString(), "description", null, 0, 1, CodelistEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ccLibraryEClass, CCLibrary.class, "CCLibrary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCCLibrary_BusinessTerm(), ecorePackage.getEString(), "businessTerm", null, 0, -1, CCLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCCLibrary_Copyright(), ecorePackage.getEString(), "copyright", null, 0, -1, CCLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCCLibrary_Owner(), ecorePackage.getEString(), "owner", null, 0, -1, CCLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCCLibrary_Reference(), ecorePackage.getEString(), "reference", null, 0, -1, CCLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCCLibrary_UniqueIdentifier(), ecorePackage.getEString(), "uniqueIdentifier", null, 0, 1, CCLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCCLibrary_VersionIdentifier(), ecorePackage.getEString(), "versionIdentifier", null, 0, 1, CCLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCCLibrary_BaseURN(), ecorePackage.getEString(), "baseURN", null, 0, 1, CCLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCCLibrary_NamespacePrefix(), ecorePackage.getEString(), "namespacePrefix", null, 0, 1, CCLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCCLibrary_Accs(), this.getACC(), null, "accs", null, 0, -1, CCLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(accEClass, org.ebix.umm.umm.ACC.class, "ACC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getACC_Name(), ecorePackage.getEString(), "name", null, 0, 1, org.ebix.umm.umm.ACC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getACC_BusinessTerm(), ecorePackage.getEString(), "businessTerm", null, 0, -1, org.ebix.umm.umm.ACC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getACC_Definition(), ecorePackage.getEString(), "definition", null, 0, 1, org.ebix.umm.umm.ACC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getACC_Dictionary(), ecorePackage.getEString(), "dictionary", null, 0, 1, org.ebix.umm.umm.ACC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getACC_UniqueIdentifier(), ecorePackage.getEString(), "uniqueIdentifier", null, 0, 1, org.ebix.umm.umm.ACC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getACC_VersionIdentifier(), ecorePackage.getEString(), "versionIdentifier", null, 0, 1, org.ebix.umm.umm.ACC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getACC_Properties(), this.getACCProperty(), null, "properties", null, 0, -1, org.ebix.umm.umm.ACC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getACC_Constraints(), this.getConstraint(), null, "constraints", null, 0, -1, org.ebix.umm.umm.ACC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(accPropertyEClass, ACCProperty.class, "ACCProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getACCProperty_Multiplicity(), this.getMultiplicityKind(), "multiplicity", null, 0, 1, ACCProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getACCProperty_Name(), ecorePackage.getEString(), "name", null, 0, 1, ACCProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getACCProperty_BusinessTerm(), ecorePackage.getEString(), "businessTerm", null, 0, -1, ACCProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getACCProperty_Definition(), ecorePackage.getEString(), "definition", null, 0, 1, ACCProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getACCProperty_Dictionary(), ecorePackage.getEString(), "dictionary", null, 0, 1, ACCProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getACCProperty_UniqueIdentifier(), ecorePackage.getEString(), "uniqueIdentifier", null, 0, 1, ACCProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getACCProperty_VersionIdentifier(), ecorePackage.getEString(), "versionIdentifier", null, 0, 1, ACCProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getACCProperty_SequencingKey(), ecorePackage.getEString(), "sequencingKey", null, 0, 1, ACCProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(asccEClass, org.ebix.umm.umm.ASCC.class, "ASCC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getASCC_Type(), this.getACC(), null, "type", null, 0, 1, org.ebix.umm.umm.ASCC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bccEClass, org.ebix.umm.umm.BCC.class, "BCC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBCC_Type(), this.getCDT(), null, "type", null, 0, 1, org.ebix.umm.umm.BCC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBCC_Restriction(), ecorePackage.getEString(), "restriction", null, 0, -1, org.ebix.umm.umm.BCC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBCC_FixedValue(), ecorePackage.getEString(), "fixedValue", null, 0, 1, org.ebix.umm.umm.BCC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cdtLibraryEClass, CDTLibrary.class, "CDTLibrary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCDTLibrary_BusinessTerm(), ecorePackage.getEString(), "businessTerm", null, 0, -1, CDTLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCDTLibrary_Copyright(), ecorePackage.getEString(), "copyright", null, 0, -1, CDTLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCDTLibrary_Owner(), ecorePackage.getEString(), "owner", null, 0, -1, CDTLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCDTLibrary_Reference(), ecorePackage.getEString(), "reference", null, 0, -1, CDTLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCDTLibrary_UniqueIdentifier(), ecorePackage.getEString(), "uniqueIdentifier", null, 0, 1, CDTLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCDTLibrary_VersionIdentifier(), ecorePackage.getEString(), "versionIdentifier", null, 0, 1, CDTLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCDTLibrary_BaseURN(), ecorePackage.getEString(), "baseURN", null, 0, 1, CDTLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCDTLibrary_NamespacePrefix(), ecorePackage.getEString(), "namespacePrefix", null, 0, 1, CDTLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCDTLibrary_Cdts(), this.getCDT(), null, "cdts", null, 0, -1, CDTLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cdtEClass, org.ebix.umm.umm.CDT.class, "CDT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCDT_Name(), ecorePackage.getEString(), "name", null, 0, 1, org.ebix.umm.umm.CDT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCDT_BusinessTerm(), ecorePackage.getEString(), "businessTerm", null, 0, -1, org.ebix.umm.umm.CDT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCDT_Definition(), ecorePackage.getEString(), "definition", null, 0, 1, org.ebix.umm.umm.CDT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCDT_Dictionary(), ecorePackage.getEString(), "dictionary", null, 0, 1, org.ebix.umm.umm.CDT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCDT_UniqueIdentifier(), ecorePackage.getEString(), "uniqueIdentifier", null, 0, 1, org.ebix.umm.umm.CDT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCDT_VersionIdentifier(), ecorePackage.getEString(), "versionIdentifier", null, 0, 1, org.ebix.umm.umm.CDT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCDT_Properties(), this.getCDTProperty(), null, "properties", null, 0, -1, org.ebix.umm.umm.CDT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cdtPropertyEClass, CDTProperty.class, "CDTProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCDTProperty_Multiplicity(), this.getMultiplicityKind(), "multiplicity", null, 0, 1, CDTProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCDTProperty_Name(), ecorePackage.getEString(), "name", null, 0, 1, CDTProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCDTProperty_Type(), this.getPrimitive(), null, "type", null, 0, 1, CDTProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCDTProperty_BusinessTerm(), ecorePackage.getEString(), "businessTerm", null, 0, -1, CDTProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCDTProperty_Definition(), ecorePackage.getEString(), "definition", null, 0, 1, CDTProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCDTProperty_Dictionary(), ecorePackage.getEString(), "dictionary", null, 0, 1, CDTProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCDTProperty_UniqueIdentifier(), ecorePackage.getEString(), "uniqueIdentifier", null, 0, 1, CDTProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCDTProperty_VersionIdentifier(), ecorePackage.getEString(), "versionIdentifier", null, 0, 1, CDTProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cdT_ContentEClass, CDT_Content.class, "CDT_Content", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(cdT_SupplementEClass, CDT_Supplement.class, "CDT_Supplement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCDT_Supplement_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1, CDT_Supplement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCDT_Supplement_Restriction(), ecorePackage.getEString(), "restriction", null, 0, -1, CDT_Supplement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCDT_Supplement_FixedValue(), ecorePackage.getEString(), "fixedValue", null, 0, 1, CDT_Supplement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(primitiveLibraryEClass, PrimitiveLibrary.class, "PrimitiveLibrary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPrimitiveLibrary_Types(), this.getPrimitive(), null, "types", null, 0, -1, PrimitiveLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(oclInvariantEClass, OclInvariant.class, "OclInvariant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOclInvariant_Expression(), this.getOclExpression(), null, "expression", null, 0, 1, OclInvariant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(oclExpressionEClass, OclExpression.class, "OclExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(oclValueEClass, OclValue.class, "OclValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(oclReferenceEClass, OclReference.class, "OclReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(oclPathSelfHeadEClass, OclPathSelfHead.class, "OclPathSelfHead", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOclPathSelfHead_Path(), this.getOclPathTail(), null, "path", null, 0, 1, OclPathSelfHead.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(oclPathFeatureHeadEClass, OclPathFeatureHead.class, "OclPathFeatureHead", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOclPathFeatureHead_Feature(), this.getOclRef(), null, "feature", null, 0, 1, OclPathFeatureHead.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOclPathFeatureHead_Tail(), this.getOclPathTail(), null, "tail", null, 0, 1, OclPathFeatureHead.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(oclPathTailEClass, OclPathTail.class, "OclPathTail", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOclPathTail_Feature(), this.getOclRef(), null, "feature", null, 0, 1, OclPathTail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOclPathTail_Tail(), this.getOclPathTail(), null, "tail", null, 0, 1, OclPathTail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(oclRefEClass, OclRef.class, "OclRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOclRef_Name(), ecorePackage.getEString(), "name", null, 0, 1, OclRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOclRef_Multiplicity(), this.getMultiplicityKind(), "multiplicity", null, 0, 1, OclRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(oclFunctionCallEClass, OclFunctionCall.class, "OclFunctionCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(oclForAllEClass, OclForAll.class, "OclForAll", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOclForAll_Body(), this.getOclExpression(), null, "body", null, 0, 1, OclForAll.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(oclIsEmptyEClass, OclIsEmpty.class, "OclIsEmpty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(oclNotEmptyEClass, OclNotEmpty.class, "OclNotEmpty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(oclSizeEClass, OclSize.class, "OclSize", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(oclLiteralEClass, OclLiteral.class, "OclLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(oclEnumerationLiteralEClass, OclEnumerationLiteral.class, "OclEnumerationLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOclEnumerationLiteral_Value(), ecorePackage.getEString(), "value", null, 0, 1, OclEnumerationLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(oclIntegerLiteralEClass, OclIntegerLiteral.class, "OclIntegerLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOclIntegerLiteral_Value(), ecorePackage.getEInt(), "value", null, 0, 1, OclIntegerLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(oclStringLiteralEClass, OclStringLiteral.class, "OclStringLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOclStringLiteral_Value(), ecorePackage.getEString(), "value", null, 0, 1, OclStringLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(oclBooleanLiteralEClass, OclBooleanLiteral.class, "OclBooleanLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(oclBooleanFalseEClass, OclBooleanFalse.class, "OclBooleanFalse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(oclImpliesEClass, OclImplies.class, "OclImplies", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOclImplies_Left(), this.getOclExpression(), null, "left", null, 0, 1, OclImplies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOclImplies_Right(), this.getOclExpression(), null, "right", null, 0, 1, OclImplies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(oclAndEClass, OclAnd.class, "OclAnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOclAnd_Left(), this.getOclExpression(), null, "left", null, 0, 1, OclAnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOclAnd_Right(), this.getOclExpression(), null, "right", null, 0, 1, OclAnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(oclOrEClass, OclOr.class, "OclOr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOclOr_Left(), this.getOclExpression(), null, "left", null, 0, 1, OclOr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOclOr_Right(), this.getOclExpression(), null, "right", null, 0, 1, OclOr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(oclXorEClass, OclXor.class, "OclXor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOclXor_Left(), this.getOclExpression(), null, "left", null, 0, 1, OclXor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOclXor_Right(), this.getOclExpression(), null, "right", null, 0, 1, OclXor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(oclEqualEClass, OclEqual.class, "OclEqual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOclEqual_Left(), this.getOclExpression(), null, "left", null, 0, 1, OclEqual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOclEqual_Right(), this.getOclExpression(), null, "right", null, 0, 1, OclEqual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(oclLessEClass, OclLess.class, "OclLess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOclLess_Left(), this.getOclExpression(), null, "left", null, 0, 1, OclLess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOclLess_Right(), this.getOclExpression(), null, "right", null, 0, 1, OclLess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(oclLessOrEqualEClass, OclLessOrEqual.class, "OclLessOrEqual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOclLessOrEqual_Left(), this.getOclExpression(), null, "left", null, 0, 1, OclLessOrEqual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOclLessOrEqual_Right(), this.getOclExpression(), null, "right", null, 0, 1, OclLessOrEqual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(oclMoreEClass, OclMore.class, "OclMore", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOclMore_Left(), this.getOclExpression(), null, "left", null, 0, 1, OclMore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOclMore_Right(), this.getOclExpression(), null, "right", null, 0, 1, OclMore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(oclMoreOrEqualEClass, OclMoreOrEqual.class, "OclMoreOrEqual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOclMoreOrEqual_Left(), this.getOclExpression(), null, "left", null, 0, 1, OclMoreOrEqual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOclMoreOrEqual_Right(), this.getOclExpression(), null, "right", null, 0, 1, OclMoreOrEqual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(oclArrowEClass, OclArrow.class, "OclArrow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOclArrow_Left(), this.getOclValue(), null, "left", null, 0, 1, OclArrow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOclArrow_Right(), this.getOclFunctionCall(), null, "right", null, 0, 1, OclArrow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(oclBooleanTrueEClass, OclBooleanTrue.class, "OclBooleanTrue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Initialize enums and add enum literals
    initEEnum(constraintKindEEnum, ConstraintKind.class, "ConstraintKind");
    addEEnumLiteral(constraintKindEEnum, ConstraintKind.INVARIANT);
    addEEnumLiteral(constraintKindEEnum, ConstraintKind.ABIE);
    addEEnumLiteral(constraintKindEEnum, ConstraintKind.BDT);
    addEEnumLiteral(constraintKindEEnum, ConstraintKind.DEPENDENCY);
    addEEnumLiteral(constraintKindEEnum, ConstraintKind.FACET);
    addEEnumLiteral(constraintKindEEnum, ConstraintKind.PAYLOAD);
    addEEnumLiteral(constraintKindEEnum, ConstraintKind.DOCUMENT);

    initEEnum(multiplicityKindEEnum, MultiplicityKind.class, "MultiplicityKind");
    addEEnumLiteral(multiplicityKindEEnum, MultiplicityKind.OPTIONAL);
    addEEnumLiteral(multiplicityKindEEnum, MultiplicityKind.ONE);
    addEEnumLiteral(multiplicityKindEEnum, MultiplicityKind.ONE_OR_MORE);
    addEEnumLiteral(multiplicityKindEEnum, MultiplicityKind.ZERO_OR_MORE);

    // Create resource
    createResource(eNS_URI);
  }

} //UmmPackageImpl
