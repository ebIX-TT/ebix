/**
 */
package org.ebix.umm.umm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BBIE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ebix.umm.umm.BBIE#getType <em>Type</em>}</li>
 *   <li>{@link org.ebix.umm.umm.BBIE#getRestriction <em>Restriction</em>}</li>
 *   <li>{@link org.ebix.umm.umm.BBIE#getFixedValue <em>Fixed Value</em>}</li>
 * </ul>
 *
 * @see org.ebix.umm.umm.UmmPackage#getBBIE()
 * @model
 * @generated
 */
public interface BBIE extends ABIEProperty
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
   * @see #setType(BDT)
   * @see org.ebix.umm.umm.UmmPackage#getBBIE_Type()
   * @model
   * @generated
   */
  BDT getType();

  /**
   * Sets the value of the '{@link org.ebix.umm.umm.BBIE#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(BDT value);

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
   * @see org.ebix.umm.umm.UmmPackage#getBBIE_Restriction()
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
   * @see org.ebix.umm.umm.UmmPackage#getBBIE_FixedValue()
   * @model
   * @generated
   */
  String getFixedValue();

  /**
   * Sets the value of the '{@link org.ebix.umm.umm.BBIE#getFixedValue <em>Fixed Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fixed Value</em>' attribute.
   * @see #getFixedValue()
   * @generated
   */
  void setFixedValue(String value);

} // BBIE
