/**
 */
package org.ebix.umm.umm.impl;

import java.util.Collection;

import org.ebix.umm.umm.BBIE;
import org.ebix.umm.umm.BDT;
import org.ebix.umm.umm.UmmPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BBIE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ebix.umm.umm.impl.BBIEImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.ebix.umm.umm.impl.BBIEImpl#getRestriction <em>Restriction</em>}</li>
 *   <li>{@link org.ebix.umm.umm.impl.BBIEImpl#getFixedValue <em>Fixed Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BBIEImpl extends ABIEPropertyImpl implements BBIE
{
  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected BDT type;

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
  protected BBIEImpl()
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
    return UmmPackage.Literals.BBIE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BDT getType()
  {
    if (type != null && type.eIsProxy())
    {
      InternalEObject oldType = (InternalEObject)type;
      type = (BDT)eResolveProxy(oldType);
      if (type != oldType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmmPackage.BBIE__TYPE, oldType, type));
      }
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BDT basicGetType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(BDT newType)
  {
    BDT oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UmmPackage.BBIE__TYPE, oldType, type));
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
      restriction = new EDataTypeEList<String>(String.class, this, UmmPackage.BBIE__RESTRICTION);
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
      eNotify(new ENotificationImpl(this, Notification.SET, UmmPackage.BBIE__FIXED_VALUE, oldFixedValue, fixedValue));
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
      case UmmPackage.BBIE__TYPE:
        if (resolve) return getType();
        return basicGetType();
      case UmmPackage.BBIE__RESTRICTION:
        return getRestriction();
      case UmmPackage.BBIE__FIXED_VALUE:
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
      case UmmPackage.BBIE__TYPE:
        setType((BDT)newValue);
        return;
      case UmmPackage.BBIE__RESTRICTION:
        getRestriction().clear();
        getRestriction().addAll((Collection<? extends String>)newValue);
        return;
      case UmmPackage.BBIE__FIXED_VALUE:
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
      case UmmPackage.BBIE__TYPE:
        setType((BDT)null);
        return;
      case UmmPackage.BBIE__RESTRICTION:
        getRestriction().clear();
        return;
      case UmmPackage.BBIE__FIXED_VALUE:
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
      case UmmPackage.BBIE__TYPE:
        return type != null;
      case UmmPackage.BBIE__RESTRICTION:
        return restriction != null && !restriction.isEmpty();
      case UmmPackage.BBIE__FIXED_VALUE:
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
    result.append(" (restriction: ");
    result.append(restriction);
    result.append(", fixedValue: ");
    result.append(fixedValue);
    result.append(')');
    return result.toString();
  }

} //BBIEImpl
