/**
 */
package org.ebix.umm.umm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ebix.umm.umm.Content#getMaxInclusive <em>Max Inclusive</em>}</li>
 *   <li>{@link org.ebix.umm.umm.Content#getMaxExclusive <em>Max Exclusive</em>}</li>
 *   <li>{@link org.ebix.umm.umm.Content#getMinInclusive <em>Min Inclusive</em>}</li>
 *   <li>{@link org.ebix.umm.umm.Content#getMinExclusive <em>Min Exclusive</em>}</li>
 *   <li>{@link org.ebix.umm.umm.Content#getFractionalDigits <em>Fractional Digits</em>}</li>
 *   <li>{@link org.ebix.umm.umm.Content#getTotalDigits <em>Total Digits</em>}</li>
 * </ul>
 *
 * @see org.ebix.umm.umm.UmmPackage#getContent()
 * @model
 * @generated
 */
public interface Content extends BDTProperty
{
  /**
   * Returns the value of the '<em><b>Max Inclusive</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Max Inclusive</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Max Inclusive</em>' attribute.
   * @see #setMaxInclusive(int)
   * @see org.ebix.umm.umm.UmmPackage#getContent_MaxInclusive()
   * @model
   * @generated
   */
  int getMaxInclusive();

  /**
   * Sets the value of the '{@link org.ebix.umm.umm.Content#getMaxInclusive <em>Max Inclusive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max Inclusive</em>' attribute.
   * @see #getMaxInclusive()
   * @generated
   */
  void setMaxInclusive(int value);

  /**
   * Returns the value of the '<em><b>Max Exclusive</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Max Exclusive</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Max Exclusive</em>' attribute.
   * @see #setMaxExclusive(int)
   * @see org.ebix.umm.umm.UmmPackage#getContent_MaxExclusive()
   * @model
   * @generated
   */
  int getMaxExclusive();

  /**
   * Sets the value of the '{@link org.ebix.umm.umm.Content#getMaxExclusive <em>Max Exclusive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max Exclusive</em>' attribute.
   * @see #getMaxExclusive()
   * @generated
   */
  void setMaxExclusive(int value);

  /**
   * Returns the value of the '<em><b>Min Inclusive</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Min Inclusive</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Min Inclusive</em>' attribute.
   * @see #setMinInclusive(int)
   * @see org.ebix.umm.umm.UmmPackage#getContent_MinInclusive()
   * @model
   * @generated
   */
  int getMinInclusive();

  /**
   * Sets the value of the '{@link org.ebix.umm.umm.Content#getMinInclusive <em>Min Inclusive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Min Inclusive</em>' attribute.
   * @see #getMinInclusive()
   * @generated
   */
  void setMinInclusive(int value);

  /**
   * Returns the value of the '<em><b>Min Exclusive</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Min Exclusive</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Min Exclusive</em>' attribute.
   * @see #setMinExclusive(int)
   * @see org.ebix.umm.umm.UmmPackage#getContent_MinExclusive()
   * @model
   * @generated
   */
  int getMinExclusive();

  /**
   * Sets the value of the '{@link org.ebix.umm.umm.Content#getMinExclusive <em>Min Exclusive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Min Exclusive</em>' attribute.
   * @see #getMinExclusive()
   * @generated
   */
  void setMinExclusive(int value);

  /**
   * Returns the value of the '<em><b>Fractional Digits</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fractional Digits</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fractional Digits</em>' attribute.
   * @see #setFractionalDigits(int)
   * @see org.ebix.umm.umm.UmmPackage#getContent_FractionalDigits()
   * @model
   * @generated
   */
  int getFractionalDigits();

  /**
   * Sets the value of the '{@link org.ebix.umm.umm.Content#getFractionalDigits <em>Fractional Digits</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fractional Digits</em>' attribute.
   * @see #getFractionalDigits()
   * @generated
   */
  void setFractionalDigits(int value);

  /**
   * Returns the value of the '<em><b>Total Digits</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Total Digits</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Total Digits</em>' attribute.
   * @see #setTotalDigits(int)
   * @see org.ebix.umm.umm.UmmPackage#getContent_TotalDigits()
   * @model
   * @generated
   */
  int getTotalDigits();

  /**
   * Sets the value of the '{@link org.ebix.umm.umm.Content#getTotalDigits <em>Total Digits</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Total Digits</em>' attribute.
   * @see #getTotalDigits()
   * @generated
   */
  void setTotalDigits(int value);

} // Content
