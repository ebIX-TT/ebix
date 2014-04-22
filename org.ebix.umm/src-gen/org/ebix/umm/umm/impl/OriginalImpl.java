/**
 */
package org.ebix.umm.umm.impl;

import java.util.Collection;

import org.ebix.umm.umm.CodelistEntry;
import org.ebix.umm.umm.Original;
import org.ebix.umm.umm.UmmPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Original</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ebix.umm.umm.impl.OriginalImpl#getCodes <em>Codes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OriginalImpl extends ENUMImpl implements Original
{
  /**
   * The cached value of the '{@link #getCodes() <em>Codes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCodes()
   * @generated
   * @ordered
   */
  protected EList<CodelistEntry> codes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OriginalImpl()
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
    return UmmPackage.Literals.ORIGINAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CodelistEntry> getCodes()
  {
    if (codes == null)
    {
      codes = new EObjectContainmentEList<CodelistEntry>(CodelistEntry.class, this, UmmPackage.ORIGINAL__CODES);
    }
    return codes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case UmmPackage.ORIGINAL__CODES:
        return ((InternalEList<?>)getCodes()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case UmmPackage.ORIGINAL__CODES:
        return getCodes();
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
      case UmmPackage.ORIGINAL__CODES:
        getCodes().clear();
        getCodes().addAll((Collection<? extends CodelistEntry>)newValue);
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
      case UmmPackage.ORIGINAL__CODES:
        getCodes().clear();
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
      case UmmPackage.ORIGINAL__CODES:
        return codes != null && !codes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //OriginalImpl
