/**
 */
package org.ebix.umm.umm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ocl Arrow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ebix.umm.umm.OclArrow#getLeft <em>Left</em>}</li>
 *   <li>{@link org.ebix.umm.umm.OclArrow#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see org.ebix.umm.umm.UmmPackage#getOclArrow()
 * @model
 * @generated
 */
public interface OclArrow extends OclExpression
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(OclValue)
   * @see org.ebix.umm.umm.UmmPackage#getOclArrow_Left()
   * @model containment="true"
   * @generated
   */
  OclValue getLeft();

  /**
   * Sets the value of the '{@link org.ebix.umm.umm.OclArrow#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(OclValue value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(OclFunctionCall)
   * @see org.ebix.umm.umm.UmmPackage#getOclArrow_Right()
   * @model containment="true"
   * @generated
   */
  OclFunctionCall getRight();

  /**
   * Sets the value of the '{@link org.ebix.umm.umm.OclArrow#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(OclFunctionCall value);

} // OclArrow
