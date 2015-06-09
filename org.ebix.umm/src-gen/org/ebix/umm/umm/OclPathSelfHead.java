/**
 */
package org.ebix.umm.umm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ocl Path Self Head</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ebix.umm.umm.OclPathSelfHead#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @see org.ebix.umm.umm.UmmPackage#getOclPathSelfHead()
 * @model
 * @generated
 */
public interface OclPathSelfHead extends OclReference
{
  /**
   * Returns the value of the '<em><b>Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Path</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Path</em>' containment reference.
   * @see #setPath(OclPathTail)
   * @see org.ebix.umm.umm.UmmPackage#getOclPathSelfHead_Path()
   * @model containment="true"
   * @generated
   */
  OclPathTail getPath();

  /**
   * Sets the value of the '{@link org.ebix.umm.umm.OclPathSelfHead#getPath <em>Path</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Path</em>' containment reference.
   * @see #getPath()
   * @generated
   */
  void setPath(OclPathTail value);

} // OclPathSelfHead
