/**
 */
package org.ebix.umm.umm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ebix.umm.umm.Constraint#getContext <em>Context</em>}</li>
 *   <li>{@link org.ebix.umm.umm.Constraint#getType <em>Type</em>}</li>
 *   <li>{@link org.ebix.umm.umm.Constraint#getInvariants <em>Invariants</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ebix.umm.umm.UmmPackage#getConstraint()
 * @model
 * @generated
 */
public interface Constraint extends EObject
{
  /**
   * Returns the value of the '<em><b>Context</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Context</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Context</em>' reference.
   * @see #setContext(ContextRef)
   * @see org.ebix.umm.umm.UmmPackage#getConstraint_Context()
   * @model
   * @generated
   */
  ContextRef getContext();

  /**
   * Sets the value of the '{@link org.ebix.umm.umm.Constraint#getContext <em>Context</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Context</em>' reference.
   * @see #getContext()
   * @generated
   */
  void setContext(ContextRef value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference list.
   * The list contents are of type {@link org.ebix.umm.umm.TC_Constraint}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference list.
   * @see org.ebix.umm.umm.UmmPackage#getConstraint_Type()
   * @model containment="true"
   * @generated
   */
  EList<TC_Constraint> getType();

  /**
   * Returns the value of the '<em><b>Invariants</b></em>' containment reference list.
   * The list contents are of type {@link org.ebix.umm.umm.OclInvariant}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Invariants</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Invariants</em>' containment reference list.
   * @see org.ebix.umm.umm.UmmPackage#getConstraint_Invariants()
   * @model containment="true"
   * @generated
   */
  EList<OclInvariant> getInvariants();

} // Constraint
