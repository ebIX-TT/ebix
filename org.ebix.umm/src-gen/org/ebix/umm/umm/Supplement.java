/**
 */
package org.ebix.umm.umm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Supplement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ebix.umm.umm.Supplement#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.ebix.umm.umm.Supplement#getRestriction <em>Restriction</em>}</li>
 *   <li>{@link org.ebix.umm.umm.Supplement#getFixedValue <em>Fixed Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ebix.umm.umm.UmmPackage#getSupplement()
 * @model
 * @generated
 */
public interface Supplement extends BDTProperty
{
  /**
   * Returns the value of the '<em><b>Default Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Value</em>' attribute.
   * @see #setDefaultValue(String)
   * @see org.ebix.umm.umm.UmmPackage#getSupplement_DefaultValue()
   * @model
   * @generated
   */
  String getDefaultValue();

  /**
   * Sets the value of the '{@link org.ebix.umm.umm.Supplement#getDefaultValue <em>Default Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Value</em>' attribute.
   * @see #getDefaultValue()
   * @generated
   */
  void setDefaultValue(String value);

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
   * @see org.ebix.umm.umm.UmmPackage#getSupplement_Restriction()
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
   * @see org.ebix.umm.umm.UmmPackage#getSupplement_FixedValue()
   * @model
   * @generated
   */
  String getFixedValue();

  /**
   * Sets the value of the '{@link org.ebix.umm.umm.Supplement#getFixedValue <em>Fixed Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fixed Value</em>' attribute.
   * @see #getFixedValue()
   * @generated
   */
  void setFixedValue(String value);

} // Supplement
