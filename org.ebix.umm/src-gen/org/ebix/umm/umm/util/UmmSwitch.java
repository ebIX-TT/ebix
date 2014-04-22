/**
 */
package org.ebix.umm.umm.util;

import org.ebix.umm.umm.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * @see org.ebix.umm.umm.UmmPackage
 * @generated
 */
public class UmmSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static UmmPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UmmSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = UmmPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
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
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case UmmPackage.LIBRARY:
      {
        Library library = (Library)theEObject;
        T result = caseLibrary(library);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmmPackage.DOC_LIBRARY:
      {
        DocLibrary docLibrary = (DocLibrary)theEObject;
        T result = caseDocLibrary(docLibrary);
        if (result == null) result = caseLibrary(docLibrary);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmmPackage.INF_ENVELOPE:
      {
        InfEnvelope infEnvelope = (InfEnvelope)theEObject;
        T result = caseInfEnvelope(infEnvelope);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmmPackage.MA:
      {
        MA ma = (MA)theEObject;
        T result = caseMA(ma);
        if (result == null) result = caseContextRef(ma);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmmPackage.MA_PROPERTY:
      {
        MAProperty maProperty = (MAProperty)theEObject;
        T result = caseMAProperty(maProperty);
        if (result == null) result = caseOclRef(maProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmmPackage.ASMA:
      {
        ASMA asma = (ASMA)theEObject;
        T result = caseASMA(asma);
        if (result == null) result = caseMAProperty(asma);
        if (result == null) result = caseOclRef(asma);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmmPackage.ASNONE:
      {
        ASNONE asnone = (ASNONE)theEObject;
        T result = caseASNONE(asnone);
        if (result == null) result = caseMAProperty(asnone);
        if (result == null) result = caseOclRef(asnone);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmmPackage.CONSTRAINT:
      {
        Constraint constraint = (Constraint)theEObject;
        T result = caseConstraint(constraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmmPackage.CONTEXT_REF:
      {
        ContextRef contextRef = (ContextRef)theEObject;
        T result = caseContextRef(contextRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmmPackage.TC_CONSTRAINT:
      {
        TC_Constraint tC_Constraint = (TC_Constraint)theEObject;
        T result = caseTC_Constraint(tC_Constraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmmPackage.BIE_LIBRARY:
      {
        BIELibrary bieLibrary = (BIELibrary)theEObject;
        T result = caseBIELibrary(bieLibrary);
        if (result == null) result = caseLibrary(bieLibrary);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmmPackage.ABIE:
      {
        ABIE abie = (ABIE)theEObject;
        T result = caseABIE(abie);
        if (result == null) result = caseContextRef(abie);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmmPackage.ABIE_PROPERTY:
      {
        ABIEProperty abieProperty = (ABIEProperty)theEObject;
        T result = caseABIEProperty(abieProperty);
        if (result == null) result = caseOclRef(abieProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmmPackage.ASBIE:
      {
        ASBIE asbie = (ASBIE)theEObject;
        T result = caseASBIE(asbie);
        if (result == null) result = caseABIEProperty(asbie);
        if (result == null) result = caseOclRef(asbie);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmmPackage.BBIE:
      {
        BBIE bbie = (BBIE)theEObject;
        T result = caseBBIE(bbie);
        if (result == null) result = caseABIEProperty(bbie);
        if (result == null) result = caseOclRef(bbie);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmmPackage.BDT_LIBRARY:
      {
        BDTLibrary bdtLibrary = (BDTLibrary)theEObject;
        T result = caseBDTLibrary(bdtLibrary);
        if (result == null) result = caseLibrary(bdtLibrary);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmmPackage.BDT:
      {
        BDT bdt = (BDT)theEObject;
        T result = caseBDT(bdt);
        if (result == null) result = caseContextRef(bdt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmmPackage.BDT_PROPERTY:
      {
        BDTProperty bdtProperty = (BDTProperty)theEObject;
        T result = caseBDTProperty(bdtProperty);
        if (result == null) result = caseOclRef(bdtProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmmPackage.CONTENT:
      {
        Content content = (Content)theEObject;
        T result = caseContent(content);
        if (result == null) result = caseBDTProperty(content);
        if (result == null) result = caseOclRef(content);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmmPackage.SUPPLEMENT:
      {
        Supplement supplement = (Supplement)theEObject;
        T result = caseSupplement(supplement);
        if (result == null) result = caseBDTProperty(supplement);
        if (result == null) result = caseOclRef(supplement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmmPackage.ENUM_LIBRARY:
      {
        ENUMLibrary enumLibrary = (ENUMLibrary)theEObject;
        T result = caseENUMLibrary(enumLibrary);
        if (result == null) result = caseLibrary(enumLibrary);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmmPackage.ENUM:
      {
        ENUM enum_ = (ENUM)theEObject;
        T result = caseENUM(enum_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmmPackage.ASSEMBLED_BASE:
      {
        AssembledBase assembledBase = (AssembledBase)theEObject;
        T result = caseAssembledBase(assembledBase);
        if (result == null) result = caseENUM(assembledBase);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmmPackage.PRIMITIVE:
      {
        Primitive primitive = (Primitive)theEObject;
        T result = casePrimitive(primitive);
        if (result == null) result = caseAssembledBase(primitive);
        if (result == null) result = caseENUM(primitive);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmmPackage.ASSEMBLED:
      {
        Assembled assembled = (Assembled)theEObject;
        T result = caseAssembled(assembled);
        if (result == null) result = caseAssembledBase(assembled);
        if (result == null) result = caseENUM(assembled);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmmPackage.ORIGINAL:
      {
        Original original = (Original)theEObject;
        T result = caseOriginal(original);
        if (result == null) result = caseENUM(original);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmmPackage.SUBSET:
      {
        Subset subset = (Subset)theEObject;
        T result = caseSubset(subset);
        if (result == null) result = caseENUM(subset);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmmPackage.CODELIST_ENTRY:
      {
        CodelistEntry codelistEntry = (CodelistEntry)theEObject;
        T result = caseCodelistEntry(codelistEntry);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmmPackage.CC_LIBRARY:
      {
        CCLibrary ccLibrary = (CCLibrary)theEObject;
        T result = caseCCLibrary(ccLibrary);
        if (result == null) result = caseLibrary(ccLibrary);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmmPackage.ACC:
      {
        ACC acc = (ACC)theEObject;
        T result = caseACC(acc);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmmPackage.ACC_PROPERTY:
      {
        ACCProperty accProperty = (ACCProperty)theEObject;
        T result = caseACCProperty(accProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmmPackage.ASCC:
      {
        ASCC ascc = (ASCC)theEObject;
        T result = caseASCC(ascc);
        if (result == null) result = caseACCProperty(ascc);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmmPackage.BCC:
      {
        BCC bcc = (BCC)theEObject;
        T result = caseBCC(bcc);
        if (result == null) result = caseACCProperty(bcc);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmmPackage.CDT_LIBRARY:
      {
        CDTLibrary cdtLibrary = (CDTLibrary)theEObject;
        T result = caseCDTLibrary(cdtLibrary);
        if (result == null) result = caseLibrary(cdtLibrary);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmmPackage.CDT:
      {
        CDT cdt = (CDT)theEObject;
        T result = caseCDT(cdt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmmPackage.CDT_PROPERTY:
      {
        CDTProperty cdtProperty = (CDTProperty)theEObject;
        T result = caseCDTProperty(cdtProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmmPackage.CDT_CONTENT:
      {
        CDT_Content cdT_Content = (CDT_Content)theEObject;
        T result = caseCDT_Content(cdT_Content);
        if (result == null) result = caseCDTProperty(cdT_Content);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmmPackage.CDT_SUPPLEMENT:
      {
        CDT_Supplement cdT_Supplement = (CDT_Supplement)theEObject;
        T result = caseCDT_Supplement(cdT_Supplement);
        if (result == null) result = caseCDTProperty(cdT_Supplement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmmPackage.PRIMITIVE_LIBRARY:
      {
        PrimitiveLibrary primitiveLibrary = (PrimitiveLibrary)theEObject;
        T result = casePrimitiveLibrary(primitiveLibrary);
        if (result == null) result = caseLibrary(primitiveLibrary);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmmPackage.OCL_INVARIANT:
      {
        OclInvariant oclInvariant = (OclInvariant)theEObject;
        T result = caseOclInvariant(oclInvariant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmmPackage.OCL_EXPRESSION:
      {
        OclExpression oclExpression = (OclExpression)theEObject;
        T result = caseOclExpression(oclExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmmPackage.OCL_VALUE:
      {
        OclValue oclValue = (OclValue)theEObject;
        T result = caseOclValue(oclValue);
        if (result == null) result = caseOclExpression(oclValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmmPackage.OCL_REFERENCE:
      {
        OclReference oclReference = (OclReference)theEObject;
        T result = caseOclReference(oclReference);
        if (result == null) result = caseOclValue(oclReference);
        if (result == null) result = caseOclExpression(oclReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmmPackage.OCL_PATH_SELF_HEAD:
      {
        OclPathSelfHead oclPathSelfHead = (OclPathSelfHead)theEObject;
        T result = caseOclPathSelfHead(oclPathSelfHead);
        if (result == null) result = caseOclReference(oclPathSelfHead);
        if (result == null) result = caseOclValue(oclPathSelfHead);
        if (result == null) result = caseOclExpression(oclPathSelfHead);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmmPackage.OCL_PATH_FEATURE_HEAD:
      {
        OclPathFeatureHead oclPathFeatureHead = (OclPathFeatureHead)theEObject;
        T result = caseOclPathFeatureHead(oclPathFeatureHead);
        if (result == null) result = caseOclReference(oclPathFeatureHead);
        if (result == null) result = caseOclValue(oclPathFeatureHead);
        if (result == null) result = caseOclExpression(oclPathFeatureHead);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmmPackage.OCL_PATH_TAIL:
      {
        OclPathTail oclPathTail = (OclPathTail)theEObject;
        T result = caseOclPathTail(oclPathTail);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmmPackage.OCL_REF:
      {
        OclRef oclRef = (OclRef)theEObject;
        T result = caseOclRef(oclRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmmPackage.OCL_FUNCTION_CALL:
      {
        OclFunctionCall oclFunctionCall = (OclFunctionCall)theEObject;
        T result = caseOclFunctionCall(oclFunctionCall);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmmPackage.OCL_FOR_ALL:
      {
        OclForAll oclForAll = (OclForAll)theEObject;
        T result = caseOclForAll(oclForAll);
        if (result == null) result = caseOclFunctionCall(oclForAll);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmmPackage.OCL_IS_EMPTY:
      {
        OclIsEmpty oclIsEmpty = (OclIsEmpty)theEObject;
        T result = caseOclIsEmpty(oclIsEmpty);
        if (result == null) result = caseOclFunctionCall(oclIsEmpty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmmPackage.OCL_NOT_EMPTY:
      {
        OclNotEmpty oclNotEmpty = (OclNotEmpty)theEObject;
        T result = caseOclNotEmpty(oclNotEmpty);
        if (result == null) result = caseOclFunctionCall(oclNotEmpty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmmPackage.OCL_SIZE:
      {
        OclSize oclSize = (OclSize)theEObject;
        T result = caseOclSize(oclSize);
        if (result == null) result = caseOclFunctionCall(oclSize);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmmPackage.OCL_LITERAL:
      {
        OclLiteral oclLiteral = (OclLiteral)theEObject;
        T result = caseOclLiteral(oclLiteral);
        if (result == null) result = caseOclValue(oclLiteral);
        if (result == null) result = caseOclExpression(oclLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmmPackage.OCL_ENUMERATION_LITERAL:
      {
        OclEnumerationLiteral oclEnumerationLiteral = (OclEnumerationLiteral)theEObject;
        T result = caseOclEnumerationLiteral(oclEnumerationLiteral);
        if (result == null) result = caseOclLiteral(oclEnumerationLiteral);
        if (result == null) result = caseOclValue(oclEnumerationLiteral);
        if (result == null) result = caseOclExpression(oclEnumerationLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmmPackage.OCL_INTEGER_LITERAL:
      {
        OclIntegerLiteral oclIntegerLiteral = (OclIntegerLiteral)theEObject;
        T result = caseOclIntegerLiteral(oclIntegerLiteral);
        if (result == null) result = caseOclLiteral(oclIntegerLiteral);
        if (result == null) result = caseOclValue(oclIntegerLiteral);
        if (result == null) result = caseOclExpression(oclIntegerLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmmPackage.OCL_STRING_LITERAL:
      {
        OclStringLiteral oclStringLiteral = (OclStringLiteral)theEObject;
        T result = caseOclStringLiteral(oclStringLiteral);
        if (result == null) result = caseOclLiteral(oclStringLiteral);
        if (result == null) result = caseOclValue(oclStringLiteral);
        if (result == null) result = caseOclExpression(oclStringLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmmPackage.OCL_BOOLEAN_LITERAL:
      {
        OclBooleanLiteral oclBooleanLiteral = (OclBooleanLiteral)theEObject;
        T result = caseOclBooleanLiteral(oclBooleanLiteral);
        if (result == null) result = caseOclLiteral(oclBooleanLiteral);
        if (result == null) result = caseOclValue(oclBooleanLiteral);
        if (result == null) result = caseOclExpression(oclBooleanLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmmPackage.OCL_BOOLEAN_FALSE:
      {
        OclBooleanFalse oclBooleanFalse = (OclBooleanFalse)theEObject;
        T result = caseOclBooleanFalse(oclBooleanFalse);
        if (result == null) result = caseOclBooleanLiteral(oclBooleanFalse);
        if (result == null) result = caseOclLiteral(oclBooleanFalse);
        if (result == null) result = caseOclValue(oclBooleanFalse);
        if (result == null) result = caseOclExpression(oclBooleanFalse);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmmPackage.OCL_IMPLIES:
      {
        OclImplies oclImplies = (OclImplies)theEObject;
        T result = caseOclImplies(oclImplies);
        if (result == null) result = caseOclExpression(oclImplies);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmmPackage.OCL_AND:
      {
        OclAnd oclAnd = (OclAnd)theEObject;
        T result = caseOclAnd(oclAnd);
        if (result == null) result = caseOclExpression(oclAnd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmmPackage.OCL_OR:
      {
        OclOr oclOr = (OclOr)theEObject;
        T result = caseOclOr(oclOr);
        if (result == null) result = caseOclExpression(oclOr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmmPackage.OCL_XOR:
      {
        OclXor oclXor = (OclXor)theEObject;
        T result = caseOclXor(oclXor);
        if (result == null) result = caseOclExpression(oclXor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmmPackage.OCL_EQUAL:
      {
        OclEqual oclEqual = (OclEqual)theEObject;
        T result = caseOclEqual(oclEqual);
        if (result == null) result = caseOclExpression(oclEqual);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmmPackage.OCL_LESS:
      {
        OclLess oclLess = (OclLess)theEObject;
        T result = caseOclLess(oclLess);
        if (result == null) result = caseOclExpression(oclLess);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmmPackage.OCL_LESS_OR_EQUAL:
      {
        OclLessOrEqual oclLessOrEqual = (OclLessOrEqual)theEObject;
        T result = caseOclLessOrEqual(oclLessOrEqual);
        if (result == null) result = caseOclExpression(oclLessOrEqual);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmmPackage.OCL_MORE:
      {
        OclMore oclMore = (OclMore)theEObject;
        T result = caseOclMore(oclMore);
        if (result == null) result = caseOclExpression(oclMore);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmmPackage.OCL_MORE_OR_EQUAL:
      {
        OclMoreOrEqual oclMoreOrEqual = (OclMoreOrEqual)theEObject;
        T result = caseOclMoreOrEqual(oclMoreOrEqual);
        if (result == null) result = caseOclExpression(oclMoreOrEqual);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmmPackage.OCL_ARROW:
      {
        OclArrow oclArrow = (OclArrow)theEObject;
        T result = caseOclArrow(oclArrow);
        if (result == null) result = caseOclExpression(oclArrow);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmmPackage.OCL_BOOLEAN_TRUE:
      {
        OclBooleanTrue oclBooleanTrue = (OclBooleanTrue)theEObject;
        T result = caseOclBooleanTrue(oclBooleanTrue);
        if (result == null) result = caseOclBooleanLiteral(oclBooleanTrue);
        if (result == null) result = caseOclLiteral(oclBooleanTrue);
        if (result == null) result = caseOclValue(oclBooleanTrue);
        if (result == null) result = caseOclExpression(oclBooleanTrue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Library</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Library</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLibrary(Library object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Doc Library</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Doc Library</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDocLibrary(DocLibrary object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Inf Envelope</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Inf Envelope</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInfEnvelope(InfEnvelope object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>MA</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MA</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMA(MA object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>MA Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MA Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMAProperty(MAProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ASMA</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ASMA</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseASMA(ASMA object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ASNONE</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ASNONE</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseASNONE(ASNONE object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstraint(Constraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Context Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Context Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContextRef(ContextRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>TC Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>TC Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTC_Constraint(TC_Constraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BIE Library</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BIE Library</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBIELibrary(BIELibrary object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ABIE</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ABIE</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseABIE(ABIE object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ABIE Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ABIE Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseABIEProperty(ABIEProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ASBIE</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ASBIE</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseASBIE(ASBIE object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BBIE</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BBIE</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBBIE(BBIE object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BDT Library</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BDT Library</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBDTLibrary(BDTLibrary object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BDT</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BDT</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBDT(BDT object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BDT Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BDT Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBDTProperty(BDTProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Content</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Content</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContent(Content object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Supplement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Supplement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSupplement(Supplement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ENUM Library</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ENUM Library</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseENUMLibrary(ENUMLibrary object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ENUM</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ENUM</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseENUM(ENUM object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assembled Base</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assembled Base</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssembledBase(AssembledBase object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Primitive</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Primitive</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrimitive(Primitive object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assembled</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assembled</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssembled(Assembled object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Original</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Original</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOriginal(Original object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Subset</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Subset</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubset(Subset object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Codelist Entry</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Codelist Entry</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCodelistEntry(CodelistEntry object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CC Library</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CC Library</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCCLibrary(CCLibrary object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ACC</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ACC</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseACC(ACC object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ACC Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ACC Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseACCProperty(ACCProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ASCC</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ASCC</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseASCC(ASCC object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BCC</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BCC</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBCC(BCC object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CDT Library</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CDT Library</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCDTLibrary(CDTLibrary object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CDT</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CDT</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCDT(CDT object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CDT Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CDT Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCDTProperty(CDTProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CDT Content</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CDT Content</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCDT_Content(CDT_Content object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CDT Supplement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CDT Supplement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCDT_Supplement(CDT_Supplement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Primitive Library</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Primitive Library</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrimitiveLibrary(PrimitiveLibrary object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ocl Invariant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ocl Invariant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOclInvariant(OclInvariant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ocl Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ocl Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOclExpression(OclExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ocl Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ocl Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOclValue(OclValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ocl Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ocl Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOclReference(OclReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ocl Path Self Head</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ocl Path Self Head</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOclPathSelfHead(OclPathSelfHead object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ocl Path Feature Head</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ocl Path Feature Head</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOclPathFeatureHead(OclPathFeatureHead object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ocl Path Tail</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ocl Path Tail</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOclPathTail(OclPathTail object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ocl Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ocl Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOclRef(OclRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ocl Function Call</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ocl Function Call</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOclFunctionCall(OclFunctionCall object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ocl For All</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ocl For All</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOclForAll(OclForAll object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ocl Is Empty</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ocl Is Empty</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOclIsEmpty(OclIsEmpty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ocl Not Empty</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ocl Not Empty</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOclNotEmpty(OclNotEmpty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ocl Size</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ocl Size</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOclSize(OclSize object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ocl Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ocl Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOclLiteral(OclLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ocl Enumeration Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ocl Enumeration Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOclEnumerationLiteral(OclEnumerationLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ocl Integer Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ocl Integer Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOclIntegerLiteral(OclIntegerLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ocl String Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ocl String Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOclStringLiteral(OclStringLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ocl Boolean Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ocl Boolean Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOclBooleanLiteral(OclBooleanLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ocl Boolean False</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ocl Boolean False</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOclBooleanFalse(OclBooleanFalse object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ocl Implies</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ocl Implies</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOclImplies(OclImplies object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ocl And</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ocl And</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOclAnd(OclAnd object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ocl Or</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ocl Or</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOclOr(OclOr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ocl Xor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ocl Xor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOclXor(OclXor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ocl Equal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ocl Equal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOclEqual(OclEqual object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ocl Less</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ocl Less</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOclLess(OclLess object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ocl Less Or Equal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ocl Less Or Equal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOclLessOrEqual(OclLessOrEqual object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ocl More</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ocl More</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOclMore(OclMore object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ocl More Or Equal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ocl More Or Equal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOclMoreOrEqual(OclMoreOrEqual object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ocl Arrow</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ocl Arrow</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOclArrow(OclArrow object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ocl Boolean True</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ocl Boolean True</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOclBooleanTrue(OclBooleanTrue object)
  {
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
  public T defaultCase(EObject object)
  {
    return null;
  }

} //UmmSwitch
