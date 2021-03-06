/**
 */
package org.ebix.umm.umm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MA Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ebix.umm.umm.MAProperty#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.ebix.umm.umm.UmmPackage#getMAProperty()
 * @model
 * @generated
 */
public interface MAProperty extends OclRef
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(ABIE)
   * @see org.ebix.umm.umm.UmmPackage#getMAProperty_Type()
   * @model
   * @generated
   */
  ABIE getType();

  /**
   * Sets the value of the '{@link org.ebix.umm.umm.MAProperty#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(ABIE value);

} // MAProperty
