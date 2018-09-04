/**
 */
package org.ebix.umm.umm.impl;

import java.util.Collection;

import org.ebix.umm.umm.CDT_Supplement;
import org.ebix.umm.umm.UmmPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CDT Supplement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ebix.umm.umm.impl.CDT_SupplementImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.ebix.umm.umm.impl.CDT_SupplementImpl#getRestriction <em>Restriction</em>}</li>
 *   <li>{@link org.ebix.umm.umm.impl.CDT_SupplementImpl#getFixedValue <em>Fixed Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CDT_SupplementImpl extends CDTPropertyImpl implements CDT_Supplement
{
  /**
   * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultValue()
   * @generated
   * @ordered
   */
  protected static final String DEFAULT_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultValue()
   * @generated
   * @ordered
   */
  protected String defaultValue = DEFAULT_VALUE_EDEFAULT;

  /**
   * The cached value of the '{@link #getRestriction() <em>Restriction</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRestriction()
   * @generated
   * @ordered
   */
  protected EList<String> restriction;

  /**
   * The default value of the '{@link #getFixedValue() <em>Fixed Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFixedValue()
   * @generated
   * @ordered
   */
  protected static final String FIXED_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFixedValue() <em>Fixed Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFixedValue()
   * @generated
   * @ordered
   */
  protected String fixedValue = FIXED_VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CDT_SupplementImpl()
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
    return UmmPackage.Literals.CDT_SUPPLEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDefaultValue()
  {
    return defaultValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefaultValue(String newDefaultValue)
  {
    String oldDefaultValue = defaultValue;
    defaultValue = newDefaultValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UmmPackage.CDT_SUPPLEMENT__DEFAULT_VALUE, oldDefaultValue, defaultValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getRestriction()
  {
    if (restriction == null)
    {
      restriction = new EDataTypeEList<String>(String.class, this, UmmPackage.CDT_SUPPLEMENT__RESTRICTION);
    }
    return restriction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFixedValue()
  {
    return fixedValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFixedValue(String newFixedValue)
  {
    String oldFixedValue = fixedValue;
    fixedValue = newFixedValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UmmPackage.CDT_SUPPLEMENT__FIXED_VALUE, oldFixedValue, fixedValue));
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
      case UmmPackage.CDT_SUPPLEMENT__DEFAULT_VALUE:
        return getDefaultValue();
      case UmmPackage.CDT_SUPPLEMENT__RESTRICTION:
        return getRestriction();
      case UmmPackage.CDT_SUPPLEMENT__FIXED_VALUE:
        return getFixedValue();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case UmmPackage.CDT_SUPPLEMENT__DEFAULT_VALUE:
        setDefaultValue((String)newValue);
        return;
      case UmmPackage.CDT_SUPPLEMENT__RESTRICTION:
        getRestriction().clear();
        getRestriction().addAll((Collection<? extends String>)newValue);
        return;
      case UmmPackage.CDT_SUPPLEMENT__FIXED_VALUE:
        setFixedValue((String)newValue);
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
      case UmmPackage.CDT_SUPPLEMENT__DEFAULT_VALUE:
        setDefaultValue(DEFAULT_VALUE_EDEFAULT);
        return;
      case UmmPackage.CDT_SUPPLEMENT__RESTRICTION:
        getRestriction().clear();
        return;
      case UmmPackage.CDT_SUPPLEMENT__FIXED_VALUE:
        setFixedValue(FIXED_VALUE_EDEFAULT);
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
      case UmmPackage.CDT_SUPPLEMENT__DEFAULT_VALUE:
        return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
      case UmmPackage.CDT_SUPPLEMENT__RESTRICTION:
        return restriction != null && !restriction.isEmpty();
      case UmmPackage.CDT_SUPPLEMENT__FIXED_VALUE:
        return FIXED_VALUE_EDEFAULT == null ? fixedValue != null : !FIXED_VALUE_EDEFAULT.equals(fixedValue);
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
    result.append(" (defaultValue: ");
    result.append(defaultValue);
    result.append(", restriction: ");
    result.append(restriction);
    result.append(", fixedValue: ");
    result.append(fixedValue);
    result.append(')');
    return result.toString();
  }

} //CDT_SupplementImpl
