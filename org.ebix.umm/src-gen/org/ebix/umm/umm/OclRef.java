/**
 */
package org.ebix.umm.umm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ocl Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ebix.umm.umm.OclRef#getName <em>Name</em>}</li>
 *   <li>{@link org.ebix.umm.umm.OclRef#getMultiplicity <em>Multiplicity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ebix.umm.umm.UmmPackage#getOclRef()
 * @model
 * @generated
 */
public interface OclRef extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.ebix.umm.umm.UmmPackage#getOclRef_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.ebix.umm.umm.OclRef#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Multiplicity</b></em>' attribute.
   * The literals are from the enumeration {@link org.ebix.umm.umm.MultiplicityKind}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Multiplicity</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Multiplicity</em>' attribute.
   * @see org.ebix.umm.umm.MultiplicityKind
   * @see #setMultiplicity(MultiplicityKind)
   * @see org.ebix.umm.umm.UmmPackage#getOclRef_Multiplicity()
   * @model
   * @generated
   */
  MultiplicityKind getMultiplicity();

  /**
   * Sets the value of the '{@link org.ebix.umm.umm.OclRef#getMultiplicity <em>Multiplicity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Multiplicity</em>' attribute.
   * @see org.ebix.umm.umm.MultiplicityKind
   * @see #getMultiplicity()
   * @generated
   */
  void setMultiplicity(MultiplicityKind value);

} // OclRef
