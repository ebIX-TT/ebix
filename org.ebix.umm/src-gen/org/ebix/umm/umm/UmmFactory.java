/**
 */
package org.ebix.umm.umm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.ebix.umm.umm.UmmPackage
 * @generated
 */
public interface UmmFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  UmmFactory eINSTANCE = org.ebix.umm.umm.impl.UmmFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Library</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Library</em>'.
   * @generated
   */
  Library createLibrary();

  /**
   * Returns a new object of class '<em>Doc Library</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Doc Library</em>'.
   * @generated
   */
  DocLibrary createDocLibrary();

  /**
   * Returns a new object of class '<em>Inf Envelope</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Inf Envelope</em>'.
   * @generated
   */
  InfEnvelope createInfEnvelope();

  /**
   * Returns a new object of class '<em>MA</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>MA</em>'.
   * @generated
   */
  MA createMA();

  /**
   * Returns a new object of class '<em>MA Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>MA Property</em>'.
   * @generated
   */
  MAProperty createMAProperty();

  /**
   * Returns a new object of class '<em>ASMA</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ASMA</em>'.
   * @generated
   */
  ASMA createASMA();

  /**
   * Returns a new object of class '<em>ASNONE</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ASNONE</em>'.
   * @generated
   */
  ASNONE createASNONE();

  /**
   * Returns a new object of class '<em>Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constraint</em>'.
   * @generated
   */
  Constraint createConstraint();

  /**
   * Returns a new object of class '<em>Context Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Context Ref</em>'.
   * @generated
   */
  ContextRef createContextRef();

  /**
   * Returns a new object of class '<em>TC Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>TC Constraint</em>'.
   * @generated
   */
  TC_Constraint createTC_Constraint();

  /**
   * Returns a new object of class '<em>BIE Library</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BIE Library</em>'.
   * @generated
   */
  BIELibrary createBIELibrary();

  /**
   * Returns a new object of class '<em>ABIE</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ABIE</em>'.
   * @generated
   */
  ABIE createABIE();

  /**
   * Returns a new object of class '<em>ABIE Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ABIE Property</em>'.
   * @generated
   */
  ABIEProperty createABIEProperty();

  /**
   * Returns a new object of class '<em>ASBIE</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ASBIE</em>'.
   * @generated
   */
  ASBIE createASBIE();

  /**
   * Returns a new object of class '<em>BBIE</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BBIE</em>'.
   * @generated
   */
  BBIE createBBIE();

  /**
   * Returns a new object of class '<em>BDT Library</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BDT Library</em>'.
   * @generated
   */
  BDTLibrary createBDTLibrary();

  /**
   * Returns a new object of class '<em>BDT</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BDT</em>'.
   * @generated
   */
  BDT createBDT();

  /**
   * Returns a new object of class '<em>BDT Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BDT Property</em>'.
   * @generated
   */
  BDTProperty createBDTProperty();

  /**
   * Returns a new object of class '<em>Content</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Content</em>'.
   * @generated
   */
  Content createContent();

  /**
   * Returns a new object of class '<em>Supplement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Supplement</em>'.
   * @generated
   */
  Supplement createSupplement();

  /**
   * Returns a new object of class '<em>ENUM Library</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ENUM Library</em>'.
   * @generated
   */
  ENUMLibrary createENUMLibrary();

  /**
   * Returns a new object of class '<em>ENUM</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ENUM</em>'.
   * @generated
   */
  ENUM createENUM();

  /**
   * Returns a new object of class '<em>Assembled Base</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Assembled Base</em>'.
   * @generated
   */
  AssembledBase createAssembledBase();

  /**
   * Returns a new object of class '<em>Primitive</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Primitive</em>'.
   * @generated
   */
  Primitive createPrimitive();

  /**
   * Returns a new object of class '<em>Assembled</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Assembled</em>'.
   * @generated
   */
  Assembled createAssembled();

  /**
   * Returns a new object of class '<em>Original</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Original</em>'.
   * @generated
   */
  Original createOriginal();

  /**
   * Returns a new object of class '<em>Subset</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Subset</em>'.
   * @generated
   */
  Subset createSubset();

  /**
   * Returns a new object of class '<em>Codelist Entry</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Codelist Entry</em>'.
   * @generated
   */
  CodelistEntry createCodelistEntry();

  /**
   * Returns a new object of class '<em>CC Library</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>CC Library</em>'.
   * @generated
   */
  CCLibrary createCCLibrary();

  /**
   * Returns a new object of class '<em>ACC</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ACC</em>'.
   * @generated
   */
  ACC createACC();

  /**
   * Returns a new object of class '<em>ACC Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ACC Property</em>'.
   * @generated
   */
  ACCProperty createACCProperty();

  /**
   * Returns a new object of class '<em>ASCC</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ASCC</em>'.
   * @generated
   */
  ASCC createASCC();

  /**
   * Returns a new object of class '<em>BCC</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BCC</em>'.
   * @generated
   */
  BCC createBCC();

  /**
   * Returns a new object of class '<em>CDT Library</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>CDT Library</em>'.
   * @generated
   */
  CDTLibrary createCDTLibrary();

  /**
   * Returns a new object of class '<em>CDT</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>CDT</em>'.
   * @generated
   */
  CDT createCDT();

  /**
   * Returns a new object of class '<em>CDT Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>CDT Property</em>'.
   * @generated
   */
  CDTProperty createCDTProperty();

  /**
   * Returns a new object of class '<em>CDT Content</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>CDT Content</em>'.
   * @generated
   */
  CDT_Content createCDT_Content();

  /**
   * Returns a new object of class '<em>CDT Supplement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>CDT Supplement</em>'.
   * @generated
   */
  CDT_Supplement createCDT_Supplement();

  /**
   * Returns a new object of class '<em>Primitive Library</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Primitive Library</em>'.
   * @generated
   */
  PrimitiveLibrary createPrimitiveLibrary();

  /**
   * Returns a new object of class '<em>Ocl Invariant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ocl Invariant</em>'.
   * @generated
   */
  OclInvariant createOclInvariant();

  /**
   * Returns a new object of class '<em>Ocl Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ocl Expression</em>'.
   * @generated
   */
  OclExpression createOclExpression();

  /**
   * Returns a new object of class '<em>Ocl Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ocl Value</em>'.
   * @generated
   */
  OclValue createOclValue();

  /**
   * Returns a new object of class '<em>Ocl Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ocl Reference</em>'.
   * @generated
   */
  OclReference createOclReference();

  /**
   * Returns a new object of class '<em>Ocl Path Self Head</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ocl Path Self Head</em>'.
   * @generated
   */
  OclPathSelfHead createOclPathSelfHead();

  /**
   * Returns a new object of class '<em>Ocl Path Feature Head</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ocl Path Feature Head</em>'.
   * @generated
   */
  OclPathFeatureHead createOclPathFeatureHead();

  /**
   * Returns a new object of class '<em>Ocl Path Tail</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ocl Path Tail</em>'.
   * @generated
   */
  OclPathTail createOclPathTail();

  /**
   * Returns a new object of class '<em>Ocl Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ocl Ref</em>'.
   * @generated
   */
  OclRef createOclRef();

  /**
   * Returns a new object of class '<em>Ocl Function Call</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ocl Function Call</em>'.
   * @generated
   */
  OclFunctionCall createOclFunctionCall();

  /**
   * Returns a new object of class '<em>Ocl For All</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ocl For All</em>'.
   * @generated
   */
  OclForAll createOclForAll();

  /**
   * Returns a new object of class '<em>Ocl Is Empty</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ocl Is Empty</em>'.
   * @generated
   */
  OclIsEmpty createOclIsEmpty();

  /**
   * Returns a new object of class '<em>Ocl Not Empty</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ocl Not Empty</em>'.
   * @generated
   */
  OclNotEmpty createOclNotEmpty();

  /**
   * Returns a new object of class '<em>Ocl Size</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ocl Size</em>'.
   * @generated
   */
  OclSize createOclSize();

  /**
   * Returns a new object of class '<em>Ocl Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ocl Literal</em>'.
   * @generated
   */
  OclLiteral createOclLiteral();

  /**
   * Returns a new object of class '<em>Ocl Enumeration Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ocl Enumeration Literal</em>'.
   * @generated
   */
  OclEnumerationLiteral createOclEnumerationLiteral();

  /**
   * Returns a new object of class '<em>Ocl Integer Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ocl Integer Literal</em>'.
   * @generated
   */
  OclIntegerLiteral createOclIntegerLiteral();

  /**
   * Returns a new object of class '<em>Ocl String Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ocl String Literal</em>'.
   * @generated
   */
  OclStringLiteral createOclStringLiteral();

  /**
   * Returns a new object of class '<em>Ocl Boolean Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ocl Boolean Literal</em>'.
   * @generated
   */
  OclBooleanLiteral createOclBooleanLiteral();

  /**
   * Returns a new object of class '<em>Ocl Boolean False</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ocl Boolean False</em>'.
   * @generated
   */
  OclBooleanFalse createOclBooleanFalse();

  /**
   * Returns a new object of class '<em>Ocl Implies</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ocl Implies</em>'.
   * @generated
   */
  OclImplies createOclImplies();

  /**
   * Returns a new object of class '<em>Ocl And</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ocl And</em>'.
   * @generated
   */
  OclAnd createOclAnd();

  /**
   * Returns a new object of class '<em>Ocl Or</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ocl Or</em>'.
   * @generated
   */
  OclOr createOclOr();

  /**
   * Returns a new object of class '<em>Ocl Xor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ocl Xor</em>'.
   * @generated
   */
  OclXor createOclXor();

  /**
   * Returns a new object of class '<em>Ocl Equal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ocl Equal</em>'.
   * @generated
   */
  OclEqual createOclEqual();

  /**
   * Returns a new object of class '<em>Ocl Less</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ocl Less</em>'.
   * @generated
   */
  OclLess createOclLess();

  /**
   * Returns a new object of class '<em>Ocl Less Or Equal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ocl Less Or Equal</em>'.
   * @generated
   */
  OclLessOrEqual createOclLessOrEqual();

  /**
   * Returns a new object of class '<em>Ocl More</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ocl More</em>'.
   * @generated
   */
  OclMore createOclMore();

  /**
   * Returns a new object of class '<em>Ocl More Or Equal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ocl More Or Equal</em>'.
   * @generated
   */
  OclMoreOrEqual createOclMoreOrEqual();

  /**
   * Returns a new object of class '<em>Ocl Arrow</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ocl Arrow</em>'.
   * @generated
   */
  OclArrow createOclArrow();

  /**
   * Returns a new object of class '<em>Ocl Boolean True</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ocl Boolean True</em>'.
   * @generated
   */
  OclBooleanTrue createOclBooleanTrue();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  UmmPackage getUmmPackage();

} //UmmFactory
