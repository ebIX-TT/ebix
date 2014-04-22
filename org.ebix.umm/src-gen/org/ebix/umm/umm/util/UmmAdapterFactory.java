/**
 */
package org.ebix.umm.umm.util;

import org.ebix.umm.umm.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.ebix.umm.umm.UmmPackage
 * @generated
 */
public class UmmAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static UmmPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UmmAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = UmmPackage.eINSTANCE;
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
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UmmSwitch<Adapter> modelSwitch =
    new UmmSwitch<Adapter>()
    {
      @Override
      public Adapter caseLibrary(Library object)
      {
        return createLibraryAdapter();
      }
      @Override
      public Adapter caseDocLibrary(DocLibrary object)
      {
        return createDocLibraryAdapter();
      }
      @Override
      public Adapter caseInfEnvelope(InfEnvelope object)
      {
        return createInfEnvelopeAdapter();
      }
      @Override
      public Adapter caseMA(MA object)
      {
        return createMAAdapter();
      }
      @Override
      public Adapter caseMAProperty(MAProperty object)
      {
        return createMAPropertyAdapter();
      }
      @Override
      public Adapter caseASMA(ASMA object)
      {
        return createASMAAdapter();
      }
      @Override
      public Adapter caseASNONE(ASNONE object)
      {
        return createASNONEAdapter();
      }
      @Override
      public Adapter caseConstraint(Constraint object)
      {
        return createConstraintAdapter();
      }
      @Override
      public Adapter caseContextRef(ContextRef object)
      {
        return createContextRefAdapter();
      }
      @Override
      public Adapter caseTC_Constraint(TC_Constraint object)
      {
        return createTC_ConstraintAdapter();
      }
      @Override
      public Adapter caseBIELibrary(BIELibrary object)
      {
        return createBIELibraryAdapter();
      }
      @Override
      public Adapter caseABIE(ABIE object)
      {
        return createABIEAdapter();
      }
      @Override
      public Adapter caseABIEProperty(ABIEProperty object)
      {
        return createABIEPropertyAdapter();
      }
      @Override
      public Adapter caseASBIE(ASBIE object)
      {
        return createASBIEAdapter();
      }
      @Override
      public Adapter caseBBIE(BBIE object)
      {
        return createBBIEAdapter();
      }
      @Override
      public Adapter caseBDTLibrary(BDTLibrary object)
      {
        return createBDTLibraryAdapter();
      }
      @Override
      public Adapter caseBDT(BDT object)
      {
        return createBDTAdapter();
      }
      @Override
      public Adapter caseBDTProperty(BDTProperty object)
      {
        return createBDTPropertyAdapter();
      }
      @Override
      public Adapter caseContent(Content object)
      {
        return createContentAdapter();
      }
      @Override
      public Adapter caseSupplement(Supplement object)
      {
        return createSupplementAdapter();
      }
      @Override
      public Adapter caseENUMLibrary(ENUMLibrary object)
      {
        return createENUMLibraryAdapter();
      }
      @Override
      public Adapter caseENUM(ENUM object)
      {
        return createENUMAdapter();
      }
      @Override
      public Adapter caseAssembledBase(AssembledBase object)
      {
        return createAssembledBaseAdapter();
      }
      @Override
      public Adapter casePrimitive(Primitive object)
      {
        return createPrimitiveAdapter();
      }
      @Override
      public Adapter caseAssembled(Assembled object)
      {
        return createAssembledAdapter();
      }
      @Override
      public Adapter caseOriginal(Original object)
      {
        return createOriginalAdapter();
      }
      @Override
      public Adapter caseSubset(Subset object)
      {
        return createSubsetAdapter();
      }
      @Override
      public Adapter caseCodelistEntry(CodelistEntry object)
      {
        return createCodelistEntryAdapter();
      }
      @Override
      public Adapter caseCCLibrary(CCLibrary object)
      {
        return createCCLibraryAdapter();
      }
      @Override
      public Adapter caseACC(ACC object)
      {
        return createACCAdapter();
      }
      @Override
      public Adapter caseACCProperty(ACCProperty object)
      {
        return createACCPropertyAdapter();
      }
      @Override
      public Adapter caseASCC(ASCC object)
      {
        return createASCCAdapter();
      }
      @Override
      public Adapter caseBCC(BCC object)
      {
        return createBCCAdapter();
      }
      @Override
      public Adapter caseCDTLibrary(CDTLibrary object)
      {
        return createCDTLibraryAdapter();
      }
      @Override
      public Adapter caseCDT(CDT object)
      {
        return createCDTAdapter();
      }
      @Override
      public Adapter caseCDTProperty(CDTProperty object)
      {
        return createCDTPropertyAdapter();
      }
      @Override
      public Adapter caseCDT_Content(CDT_Content object)
      {
        return createCDT_ContentAdapter();
      }
      @Override
      public Adapter caseCDT_Supplement(CDT_Supplement object)
      {
        return createCDT_SupplementAdapter();
      }
      @Override
      public Adapter casePrimitiveLibrary(PrimitiveLibrary object)
      {
        return createPrimitiveLibraryAdapter();
      }
      @Override
      public Adapter caseOclInvariant(OclInvariant object)
      {
        return createOclInvariantAdapter();
      }
      @Override
      public Adapter caseOclExpression(OclExpression object)
      {
        return createOclExpressionAdapter();
      }
      @Override
      public Adapter caseOclValue(OclValue object)
      {
        return createOclValueAdapter();
      }
      @Override
      public Adapter caseOclReference(OclReference object)
      {
        return createOclReferenceAdapter();
      }
      @Override
      public Adapter caseOclPathSelfHead(OclPathSelfHead object)
      {
        return createOclPathSelfHeadAdapter();
      }
      @Override
      public Adapter caseOclPathFeatureHead(OclPathFeatureHead object)
      {
        return createOclPathFeatureHeadAdapter();
      }
      @Override
      public Adapter caseOclPathTail(OclPathTail object)
      {
        return createOclPathTailAdapter();
      }
      @Override
      public Adapter caseOclRef(OclRef object)
      {
        return createOclRefAdapter();
      }
      @Override
      public Adapter caseOclFunctionCall(OclFunctionCall object)
      {
        return createOclFunctionCallAdapter();
      }
      @Override
      public Adapter caseOclForAll(OclForAll object)
      {
        return createOclForAllAdapter();
      }
      @Override
      public Adapter caseOclIsEmpty(OclIsEmpty object)
      {
        return createOclIsEmptyAdapter();
      }
      @Override
      public Adapter caseOclNotEmpty(OclNotEmpty object)
      {
        return createOclNotEmptyAdapter();
      }
      @Override
      public Adapter caseOclSize(OclSize object)
      {
        return createOclSizeAdapter();
      }
      @Override
      public Adapter caseOclLiteral(OclLiteral object)
      {
        return createOclLiteralAdapter();
      }
      @Override
      public Adapter caseOclEnumerationLiteral(OclEnumerationLiteral object)
      {
        return createOclEnumerationLiteralAdapter();
      }
      @Override
      public Adapter caseOclIntegerLiteral(OclIntegerLiteral object)
      {
        return createOclIntegerLiteralAdapter();
      }
      @Override
      public Adapter caseOclStringLiteral(OclStringLiteral object)
      {
        return createOclStringLiteralAdapter();
      }
      @Override
      public Adapter caseOclBooleanLiteral(OclBooleanLiteral object)
      {
        return createOclBooleanLiteralAdapter();
      }
      @Override
      public Adapter caseOclBooleanFalse(OclBooleanFalse object)
      {
        return createOclBooleanFalseAdapter();
      }
      @Override
      public Adapter caseOclImplies(OclImplies object)
      {
        return createOclImpliesAdapter();
      }
      @Override
      public Adapter caseOclAnd(OclAnd object)
      {
        return createOclAndAdapter();
      }
      @Override
      public Adapter caseOclOr(OclOr object)
      {
        return createOclOrAdapter();
      }
      @Override
      public Adapter caseOclXor(OclXor object)
      {
        return createOclXorAdapter();
      }
      @Override
      public Adapter caseOclEqual(OclEqual object)
      {
        return createOclEqualAdapter();
      }
      @Override
      public Adapter caseOclLess(OclLess object)
      {
        return createOclLessAdapter();
      }
      @Override
      public Adapter caseOclLessOrEqual(OclLessOrEqual object)
      {
        return createOclLessOrEqualAdapter();
      }
      @Override
      public Adapter caseOclMore(OclMore object)
      {
        return createOclMoreAdapter();
      }
      @Override
      public Adapter caseOclMoreOrEqual(OclMoreOrEqual object)
      {
        return createOclMoreOrEqualAdapter();
      }
      @Override
      public Adapter caseOclArrow(OclArrow object)
      {
        return createOclArrowAdapter();
      }
      @Override
      public Adapter caseOclBooleanTrue(OclBooleanTrue object)
      {
        return createOclBooleanTrueAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
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
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.ebix.umm.umm.Library <em>Library</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ebix.umm.umm.Library
   * @generated
   */
  public Adapter createLibraryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ebix.umm.umm.DocLibrary <em>Doc Library</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ebix.umm.umm.DocLibrary
   * @generated
   */
  public Adapter createDocLibraryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ebix.umm.umm.InfEnvelope <em>Inf Envelope</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ebix.umm.umm.InfEnvelope
   * @generated
   */
  public Adapter createInfEnvelopeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ebix.umm.umm.MA <em>MA</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ebix.umm.umm.MA
   * @generated
   */
  public Adapter createMAAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ebix.umm.umm.MAProperty <em>MA Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ebix.umm.umm.MAProperty
   * @generated
   */
  public Adapter createMAPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ebix.umm.umm.ASMA <em>ASMA</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ebix.umm.umm.ASMA
   * @generated
   */
  public Adapter createASMAAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ebix.umm.umm.ASNONE <em>ASNONE</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ebix.umm.umm.ASNONE
   * @generated
   */
  public Adapter createASNONEAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ebix.umm.umm.Constraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ebix.umm.umm.Constraint
   * @generated
   */
  public Adapter createConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ebix.umm.umm.ContextRef <em>Context Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ebix.umm.umm.ContextRef
   * @generated
   */
  public Adapter createContextRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ebix.umm.umm.TC_Constraint <em>TC Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ebix.umm.umm.TC_Constraint
   * @generated
   */
  public Adapter createTC_ConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ebix.umm.umm.BIELibrary <em>BIE Library</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ebix.umm.umm.BIELibrary
   * @generated
   */
  public Adapter createBIELibraryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ebix.umm.umm.ABIE <em>ABIE</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ebix.umm.umm.ABIE
   * @generated
   */
  public Adapter createABIEAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ebix.umm.umm.ABIEProperty <em>ABIE Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ebix.umm.umm.ABIEProperty
   * @generated
   */
  public Adapter createABIEPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ebix.umm.umm.ASBIE <em>ASBIE</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ebix.umm.umm.ASBIE
   * @generated
   */
  public Adapter createASBIEAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ebix.umm.umm.BBIE <em>BBIE</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ebix.umm.umm.BBIE
   * @generated
   */
  public Adapter createBBIEAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ebix.umm.umm.BDTLibrary <em>BDT Library</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ebix.umm.umm.BDTLibrary
   * @generated
   */
  public Adapter createBDTLibraryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ebix.umm.umm.BDT <em>BDT</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ebix.umm.umm.BDT
   * @generated
   */
  public Adapter createBDTAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ebix.umm.umm.BDTProperty <em>BDT Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ebix.umm.umm.BDTProperty
   * @generated
   */
  public Adapter createBDTPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ebix.umm.umm.Content <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ebix.umm.umm.Content
   * @generated
   */
  public Adapter createContentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ebix.umm.umm.Supplement <em>Supplement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ebix.umm.umm.Supplement
   * @generated
   */
  public Adapter createSupplementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ebix.umm.umm.ENUMLibrary <em>ENUM Library</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ebix.umm.umm.ENUMLibrary
   * @generated
   */
  public Adapter createENUMLibraryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ebix.umm.umm.ENUM <em>ENUM</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ebix.umm.umm.ENUM
   * @generated
   */
  public Adapter createENUMAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ebix.umm.umm.AssembledBase <em>Assembled Base</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ebix.umm.umm.AssembledBase
   * @generated
   */
  public Adapter createAssembledBaseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ebix.umm.umm.Primitive <em>Primitive</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ebix.umm.umm.Primitive
   * @generated
   */
  public Adapter createPrimitiveAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ebix.umm.umm.Assembled <em>Assembled</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ebix.umm.umm.Assembled
   * @generated
   */
  public Adapter createAssembledAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ebix.umm.umm.Original <em>Original</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ebix.umm.umm.Original
   * @generated
   */
  public Adapter createOriginalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ebix.umm.umm.Subset <em>Subset</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ebix.umm.umm.Subset
   * @generated
   */
  public Adapter createSubsetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ebix.umm.umm.CodelistEntry <em>Codelist Entry</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ebix.umm.umm.CodelistEntry
   * @generated
   */
  public Adapter createCodelistEntryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ebix.umm.umm.CCLibrary <em>CC Library</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ebix.umm.umm.CCLibrary
   * @generated
   */
  public Adapter createCCLibraryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ebix.umm.umm.ACC <em>ACC</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ebix.umm.umm.ACC
   * @generated
   */
  public Adapter createACCAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ebix.umm.umm.ACCProperty <em>ACC Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ebix.umm.umm.ACCProperty
   * @generated
   */
  public Adapter createACCPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ebix.umm.umm.ASCC <em>ASCC</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ebix.umm.umm.ASCC
   * @generated
   */
  public Adapter createASCCAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ebix.umm.umm.BCC <em>BCC</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ebix.umm.umm.BCC
   * @generated
   */
  public Adapter createBCCAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ebix.umm.umm.CDTLibrary <em>CDT Library</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ebix.umm.umm.CDTLibrary
   * @generated
   */
  public Adapter createCDTLibraryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ebix.umm.umm.CDT <em>CDT</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ebix.umm.umm.CDT
   * @generated
   */
  public Adapter createCDTAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ebix.umm.umm.CDTProperty <em>CDT Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ebix.umm.umm.CDTProperty
   * @generated
   */
  public Adapter createCDTPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ebix.umm.umm.CDT_Content <em>CDT Content</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ebix.umm.umm.CDT_Content
   * @generated
   */
  public Adapter createCDT_ContentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ebix.umm.umm.CDT_Supplement <em>CDT Supplement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ebix.umm.umm.CDT_Supplement
   * @generated
   */
  public Adapter createCDT_SupplementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ebix.umm.umm.PrimitiveLibrary <em>Primitive Library</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ebix.umm.umm.PrimitiveLibrary
   * @generated
   */
  public Adapter createPrimitiveLibraryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ebix.umm.umm.OclInvariant <em>Ocl Invariant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ebix.umm.umm.OclInvariant
   * @generated
   */
  public Adapter createOclInvariantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ebix.umm.umm.OclExpression <em>Ocl Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ebix.umm.umm.OclExpression
   * @generated
   */
  public Adapter createOclExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ebix.umm.umm.OclValue <em>Ocl Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ebix.umm.umm.OclValue
   * @generated
   */
  public Adapter createOclValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ebix.umm.umm.OclReference <em>Ocl Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ebix.umm.umm.OclReference
   * @generated
   */
  public Adapter createOclReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ebix.umm.umm.OclPathSelfHead <em>Ocl Path Self Head</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ebix.umm.umm.OclPathSelfHead
   * @generated
   */
  public Adapter createOclPathSelfHeadAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ebix.umm.umm.OclPathFeatureHead <em>Ocl Path Feature Head</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ebix.umm.umm.OclPathFeatureHead
   * @generated
   */
  public Adapter createOclPathFeatureHeadAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ebix.umm.umm.OclPathTail <em>Ocl Path Tail</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ebix.umm.umm.OclPathTail
   * @generated
   */
  public Adapter createOclPathTailAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ebix.umm.umm.OclRef <em>Ocl Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ebix.umm.umm.OclRef
   * @generated
   */
  public Adapter createOclRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ebix.umm.umm.OclFunctionCall <em>Ocl Function Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ebix.umm.umm.OclFunctionCall
   * @generated
   */
  public Adapter createOclFunctionCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ebix.umm.umm.OclForAll <em>Ocl For All</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ebix.umm.umm.OclForAll
   * @generated
   */
  public Adapter createOclForAllAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ebix.umm.umm.OclIsEmpty <em>Ocl Is Empty</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ebix.umm.umm.OclIsEmpty
   * @generated
   */
  public Adapter createOclIsEmptyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ebix.umm.umm.OclNotEmpty <em>Ocl Not Empty</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ebix.umm.umm.OclNotEmpty
   * @generated
   */
  public Adapter createOclNotEmptyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ebix.umm.umm.OclSize <em>Ocl Size</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ebix.umm.umm.OclSize
   * @generated
   */
  public Adapter createOclSizeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ebix.umm.umm.OclLiteral <em>Ocl Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ebix.umm.umm.OclLiteral
   * @generated
   */
  public Adapter createOclLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ebix.umm.umm.OclEnumerationLiteral <em>Ocl Enumeration Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ebix.umm.umm.OclEnumerationLiteral
   * @generated
   */
  public Adapter createOclEnumerationLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ebix.umm.umm.OclIntegerLiteral <em>Ocl Integer Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ebix.umm.umm.OclIntegerLiteral
   * @generated
   */
  public Adapter createOclIntegerLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ebix.umm.umm.OclStringLiteral <em>Ocl String Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ebix.umm.umm.OclStringLiteral
   * @generated
   */
  public Adapter createOclStringLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ebix.umm.umm.OclBooleanLiteral <em>Ocl Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ebix.umm.umm.OclBooleanLiteral
   * @generated
   */
  public Adapter createOclBooleanLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ebix.umm.umm.OclBooleanFalse <em>Ocl Boolean False</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ebix.umm.umm.OclBooleanFalse
   * @generated
   */
  public Adapter createOclBooleanFalseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ebix.umm.umm.OclImplies <em>Ocl Implies</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ebix.umm.umm.OclImplies
   * @generated
   */
  public Adapter createOclImpliesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ebix.umm.umm.OclAnd <em>Ocl And</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ebix.umm.umm.OclAnd
   * @generated
   */
  public Adapter createOclAndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ebix.umm.umm.OclOr <em>Ocl Or</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ebix.umm.umm.OclOr
   * @generated
   */
  public Adapter createOclOrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ebix.umm.umm.OclXor <em>Ocl Xor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ebix.umm.umm.OclXor
   * @generated
   */
  public Adapter createOclXorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ebix.umm.umm.OclEqual <em>Ocl Equal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ebix.umm.umm.OclEqual
   * @generated
   */
  public Adapter createOclEqualAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ebix.umm.umm.OclLess <em>Ocl Less</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ebix.umm.umm.OclLess
   * @generated
   */
  public Adapter createOclLessAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ebix.umm.umm.OclLessOrEqual <em>Ocl Less Or Equal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ebix.umm.umm.OclLessOrEqual
   * @generated
   */
  public Adapter createOclLessOrEqualAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ebix.umm.umm.OclMore <em>Ocl More</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ebix.umm.umm.OclMore
   * @generated
   */
  public Adapter createOclMoreAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ebix.umm.umm.OclMoreOrEqual <em>Ocl More Or Equal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ebix.umm.umm.OclMoreOrEqual
   * @generated
   */
  public Adapter createOclMoreOrEqualAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ebix.umm.umm.OclArrow <em>Ocl Arrow</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ebix.umm.umm.OclArrow
   * @generated
   */
  public Adapter createOclArrowAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ebix.umm.umm.OclBooleanTrue <em>Ocl Boolean True</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ebix.umm.umm.OclBooleanTrue
   * @generated
   */
  public Adapter createOclBooleanTrueAdapter()
  {
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
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //UmmAdapterFactory
