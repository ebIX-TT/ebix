/**
 */
package org.ebix.umm.umm.impl;

import org.ebix.umm.umm.Content;
import org.ebix.umm.umm.UmmPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ebix.umm.umm.impl.ContentImpl#getMaxInclusive <em>Max Inclusive</em>}</li>
 *   <li>{@link org.ebix.umm.umm.impl.ContentImpl#getMaxExclusive <em>Max Exclusive</em>}</li>
 *   <li>{@link org.ebix.umm.umm.impl.ContentImpl#getMinInclusive <em>Min Inclusive</em>}</li>
 *   <li>{@link org.ebix.umm.umm.impl.ContentImpl#getMinExclusive <em>Min Exclusive</em>}</li>
 *   <li>{@link org.ebix.umm.umm.impl.ContentImpl#getFractionalDigits <em>Fractional Digits</em>}</li>
 *   <li>{@link org.ebix.umm.umm.impl.ContentImpl#getTotalDigits <em>Total Digits</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContentImpl extends BDTPropertyImpl implements Content
{
  /**
   * The default value of the '{@link #getMaxInclusive() <em>Max Inclusive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxInclusive()
   * @generated
   * @ordered
   */
  protected static final int MAX_INCLUSIVE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMaxInclusive() <em>Max Inclusive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxInclusive()
   * @generated
   * @ordered
   */
  protected int maxInclusive = MAX_INCLUSIVE_EDEFAULT;

  /**
   * The default value of the '{@link #getMaxExclusive() <em>Max Exclusive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxExclusive()
   * @generated
   * @ordered
   */
  protected static final int MAX_EXCLUSIVE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMaxExclusive() <em>Max Exclusive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxExclusive()
   * @generated
   * @ordered
   */
  protected int maxExclusive = MAX_EXCLUSIVE_EDEFAULT;

  /**
   * The default value of the '{@link #getMinInclusive() <em>Min Inclusive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinInclusive()
   * @generated
   * @ordered
   */
  protected static final int MIN_INCLUSIVE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMinInclusive() <em>Min Inclusive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinInclusive()
   * @generated
   * @ordered
   */
  protected int minInclusive = MIN_INCLUSIVE_EDEFAULT;

  /**
   * The default value of the '{@link #getMinExclusive() <em>Min Exclusive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinExclusive()
   * @generated
   * @ordered
   */
  protected static final int MIN_EXCLUSIVE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMinExclusive() <em>Min Exclusive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinExclusive()
   * @generated
   * @ordered
   */
  protected int minExclusive = MIN_EXCLUSIVE_EDEFAULT;

  /**
   * The default value of the '{@link #getFractionalDigits() <em>Fractional Digits</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFractionalDigits()
   * @generated
   * @ordered
   */
  protected static final int FRACTIONAL_DIGITS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getFractionalDigits() <em>Fractional Digits</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFractionalDigits()
   * @generated
   * @ordered
   */
  protected int fractionalDigits = FRACTIONAL_DIGITS_EDEFAULT;

  /**
   * The default value of the '{@link #getTotalDigits() <em>Total Digits</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTotalDigits()
   * @generated
   * @ordered
   */
  protected static final int TOTAL_DIGITS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getTotalDigits() <em>Total Digits</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTotalDigits()
   * @generated
   * @ordered
   */
  protected int totalDigits = TOTAL_DIGITS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ContentImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return UmmPackage.Literals.CONTENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getMaxInclusive()
  {
    return maxInclusive;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMaxInclusive(int newMaxInclusive)
  {
    int oldMaxInclusive = maxInclusive;
    maxInclusive = newMaxInclusive;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UmmPackage.CONTENT__MAX_INCLUSIVE, oldMaxInclusive, maxInclusive));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getMaxExclusive()
  {
    return maxExclusive;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMaxExclusive(int newMaxExclusive)
  {
    int oldMaxExclusive = maxExclusive;
    maxExclusive = newMaxExclusive;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UmmPackage.CONTENT__MAX_EXCLUSIVE, oldMaxExclusive, maxExclusive));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getMinInclusive()
  {
    return minInclusive;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMinInclusive(int newMinInclusive)
  {
    int oldMinInclusive = minInclusive;
    minInclusive = newMinInclusive;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UmmPackage.CONTENT__MIN_INCLUSIVE, oldMinInclusive, minInclusive));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getMinExclusive()
  {
    return minExclusive;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMinExclusive(int newMinExclusive)
  {
    int oldMinExclusive = minExclusive;
    minExclusive = newMinExclusive;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UmmPackage.CONTENT__MIN_EXCLUSIVE, oldMinExclusive, minExclusive));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getFractionalDigits()
  {
    return fractionalDigits;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFractionalDigits(int newFractionalDigits)
  {
    int oldFractionalDigits = fractionalDigits;
    fractionalDigits = newFractionalDigits;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UmmPackage.CONTENT__FRACTIONAL_DIGITS, oldFractionalDigits, fractionalDigits));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getTotalDigits()
  {
    return totalDigits;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTotalDigits(int newTotalDigits)
  {
    int oldTotalDigits = totalDigits;
    totalDigits = newTotalDigits;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UmmPackage.CONTENT__TOTAL_DIGITS, oldTotalDigits, totalDigits));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case UmmPackage.CONTENT__MAX_INCLUSIVE:
        return getMaxInclusive();
      case UmmPackage.CONTENT__MAX_EXCLUSIVE:
        return getMaxExclusive();
      case UmmPackage.CONTENT__MIN_INCLUSIVE:
        return getMinInclusive();
      case UmmPackage.CONTENT__MIN_EXCLUSIVE:
        return getMinExclusive();
      case UmmPackage.CONTENT__FRACTIONAL_DIGITS:
        return getFractionalDigits();
      case UmmPackage.CONTENT__TOTAL_DIGITS:
        return getTotalDigits();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case UmmPackage.CONTENT__MAX_INCLUSIVE:
        setMaxInclusive((Integer)newValue);
        return;
      case UmmPackage.CONTENT__MAX_EXCLUSIVE:
        setMaxExclusive((Integer)newValue);
        return;
      case UmmPackage.CONTENT__MIN_INCLUSIVE:
        setMinInclusive((Integer)newValue);
        return;
      case UmmPackage.CONTENT__MIN_EXCLUSIVE:
        setMinExclusive((Integer)newValue);
        return;
      case UmmPackage.CONTENT__FRACTIONAL_DIGITS:
        setFractionalDigits((Integer)newValue);
        return;
      case UmmPackage.CONTENT__TOTAL_DIGITS:
        setTotalDigits((Integer)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case UmmPackage.CONTENT__MAX_INCLUSIVE:
        setMaxInclusive(MAX_INCLUSIVE_EDEFAULT);
        return;
      case UmmPackage.CONTENT__MAX_EXCLUSIVE:
        setMaxExclusive(MAX_EXCLUSIVE_EDEFAULT);
        return;
      case UmmPackage.CONTENT__MIN_INCLUSIVE:
        setMinInclusive(MIN_INCLUSIVE_EDEFAULT);
        return;
      case UmmPackage.CONTENT__MIN_EXCLUSIVE:
        setMinExclusive(MIN_EXCLUSIVE_EDEFAULT);
        return;
      case UmmPackage.CONTENT__FRACTIONAL_DIGITS:
        setFractionalDigits(FRACTIONAL_DIGITS_EDEFAULT);
        return;
      case UmmPackage.CONTENT__TOTAL_DIGITS:
        setTotalDigits(TOTAL_DIGITS_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case UmmPackage.CONTENT__MAX_INCLUSIVE:
        return maxInclusive != MAX_INCLUSIVE_EDEFAULT;
      case UmmPackage.CONTENT__MAX_EXCLUSIVE:
        return maxExclusive != MAX_EXCLUSIVE_EDEFAULT;
      case UmmPackage.CONTENT__MIN_INCLUSIVE:
        return minInclusive != MIN_INCLUSIVE_EDEFAULT;
      case UmmPackage.CONTENT__MIN_EXCLUSIVE:
        return minExclusive != MIN_EXCLUSIVE_EDEFAULT;
      case UmmPackage.CONTENT__FRACTIONAL_DIGITS:
        return fractionalDigits != FRACTIONAL_DIGITS_EDEFAULT;
      case UmmPackage.CONTENT__TOTAL_DIGITS:
        return totalDigits != TOTAL_DIGITS_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (maxInclusive: ");
    result.append(maxInclusive);
    result.append(", maxExclusive: ");
    result.append(maxExclusive);
    result.append(", minInclusive: ");
    result.append(minInclusive);
    result.append(", minExclusive: ");
    result.append(minExclusive);
    result.append(", fractionalDigits: ");
    result.append(fractionalDigits);
    result.append(", totalDigits: ");
    result.append(totalDigits);
    result.append(')');
    return result.toString();
  }

} //ContentImpl
