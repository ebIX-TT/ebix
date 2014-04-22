/**
 */
package org.ebix.umm.umm.impl;

import java.util.Collection;

import org.ebix.umm.umm.Assembled;
import org.ebix.umm.umm.Original;
import org.ebix.umm.umm.Subset;
import org.ebix.umm.umm.UmmPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assembled</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ebix.umm.umm.impl.AssembledImpl#getOriginals <em>Originals</em>}</li>
 *   <li>{@link org.ebix.umm.umm.impl.AssembledImpl#getSubsets <em>Subsets</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssembledImpl extends AssembledBaseImpl implements Assembled
{
  /**
   * The cached value of the '{@link #getOriginals() <em>Originals</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOriginals()
   * @generated
   * @ordered
   */
  protected EList<Original> originals;

  /**
   * The cached value of the '{@link #getSubsets() <em>Subsets</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubsets()
   * @generated
   * @ordered
   */
  protected EList<Subset> subsets;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AssembledImpl()
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
    return UmmPackage.Literals.ASSEMBLED;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Original> getOriginals()
  {
    if (originals == null)
    {
      originals = new EObjectResolvingEList<Original>(Original.class, this, UmmPackage.ASSEMBLED__ORIGINALS);
    }
    return originals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Subset> getSubsets()
  {
    if (subsets == null)
    {
      subsets = new EObjectResolvingEList<Subset>(Subset.class, this, UmmPackage.ASSEMBLED__SUBSETS);
    }
    return subsets;
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
      case UmmPackage.ASSEMBLED__ORIGINALS:
        return getOriginals();
      case UmmPackage.ASSEMBLED__SUBSETS:
        return getSubsets();
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
      case UmmPackage.ASSEMBLED__ORIGINALS:
        getOriginals().clear();
        getOriginals().addAll((Collection<? extends Original>)newValue);
        return;
      case UmmPackage.ASSEMBLED__SUBSETS:
        getSubsets().clear();
        getSubsets().addAll((Collection<? extends Subset>)newValue);
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
      case UmmPackage.ASSEMBLED__ORIGINALS:
        getOriginals().clear();
        return;
      case UmmPackage.ASSEMBLED__SUBSETS:
        getSubsets().clear();
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
      case UmmPackage.ASSEMBLED__ORIGINALS:
        return originals != null && !originals.isEmpty();
      case UmmPackage.ASSEMBLED__SUBSETS:
        return subsets != null && !subsets.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //AssembledImpl
