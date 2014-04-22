/**
 */
package org.ebix.umm.umm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ocl Path Tail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ebix.umm.umm.OclPathTail#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.ebix.umm.umm.OclPathTail#getTail <em>Tail</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ebix.umm.umm.UmmPackage#getOclPathTail()
 * @model
 * @generated
 */
public interface OclPathTail extends EObject
{
  /**
   * Returns the value of the '<em><b>Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature</em>' reference.
   * @see #setFeature(OclRef)
   * @see org.ebix.umm.umm.UmmPackage#getOclPathTail_Feature()
   * @model
   * @generated
   */
  OclRef getFeature();

  /**
   * Sets the value of the '{@link org.ebix.umm.umm.OclPathTail#getFeature <em>Feature</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Feature</em>' reference.
   * @see #getFeature()
   * @generated
   */
  void setFeature(OclRef value);

  /**
   * Returns the value of the '<em><b>Tail</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tail</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tail</em>' containment reference.
   * @see #setTail(OclPathTail)
   * @see org.ebix.umm.umm.UmmPackage#getOclPathTail_Tail()
   * @model containment="true"
   * @generated
   */
  OclPathTail getTail();

  /**
   * Sets the value of the '{@link org.ebix.umm.umm.OclPathTail#getTail <em>Tail</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tail</em>' containment reference.
   * @see #getTail()
   * @generated
   */
  void setTail(OclPathTail value);

} // OclPathTail
