/**
 */
package org.ebix.umm.umm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BCC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ebix.umm.umm.BCC#getType <em>Type</em>}</li>
 *   <li>{@link org.ebix.umm.umm.BCC#getRestriction <em>Restriction</em>}</li>
 *   <li>{@link org.ebix.umm.umm.BCC#getFixedValue <em>Fixed Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ebix.umm.umm.UmmPackage#getBCC()
 * @model
 * @generated
 */
public interface BCC extends ACCProperty
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
   * @see #setType(CDT)
   * @see org.ebix.umm.umm.UmmPackage#getBCC_Type()
   * @model
   * @generated
   */
  CDT getType();

  /**
   * Sets the value of the '{@link org.ebix.umm.umm.BCC#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(CDT value);

  /**
   * Returns the value of the '<em><b>Restriction</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Restriction</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Restriction</em>' attribute list.
   * @see org.ebix.umm.umm.UmmPackage#getBCC_Restriction()
   * @model unique="false"
   * @generated
   */
  EList<String> getRestriction();

  /**
   * Returns the value of the '<em><b>Fixed Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fixed Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fixed Value</em>' attribute.
   * @see #setFixedValue(String)
   * @see org.ebix.umm.umm.UmmPackage#getBCC_FixedValue()
   * @model
   * @generated
   */
  String getFixedValue();

  /**
   * Sets the value of the '{@link org.ebix.umm.umm.BCC#getFixedValue <em>Fixed Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fixed Value</em>' attribute.
   * @see #getFixedValue()
   * @generated
   */
  void setFixedValue(String value);

} // BCC
