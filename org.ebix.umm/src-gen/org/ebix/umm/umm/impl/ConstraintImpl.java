/**
 */
package org.ebix.umm.umm.impl;

import java.util.Collection;

import org.ebix.umm.umm.Constraint;
import org.ebix.umm.umm.ContextRef;
import org.ebix.umm.umm.OclInvariant;
import org.ebix.umm.umm.TC_Constraint;
import org.ebix.umm.umm.UmmPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ebix.umm.umm.impl.ConstraintImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.ebix.umm.umm.impl.ConstraintImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.ebix.umm.umm.impl.ConstraintImpl#getInvariants <em>Invariants</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstraintImpl extends MinimalEObjectImpl.Container implements Constraint
{
  /**
   * The cached value of the '{@link #getContext() <em>Context</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContext()
   * @generated
   * @ordered
   */
  protected ContextRef context;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected EList<TC_Constraint> type;

  /**
   * The cached value of the '{@link #getInvariants() <em>Invariants</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInvariants()
   * @generated
   * @ordered
   */
  protected EList<OclInvariant> invariants;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConstraintImpl()
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
    return UmmPackage.Literals.CONSTRAINT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContextRef getContext()
  {
    if (context != null && context.eIsProxy())
    {
      InternalEObject oldContext = (InternalEObject)context;
      context = (ContextRef)eResolveProxy(oldContext);
      if (context != oldContext)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmmPackage.CONSTRAINT__CONTEXT, oldContext, context));
      }
    }
    return context;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContextRef basicGetContext()
  {
    return context;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContext(ContextRef newContext)
  {
    ContextRef oldContext = context;
    context = newContext;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UmmPackage.CONSTRAINT__CONTEXT, oldContext, context));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TC_Constraint> getType()
  {
    if (type == null)
    {
      type = new EObjectContainmentEList<TC_Constraint>(TC_Constraint.class, this, UmmPackage.CONSTRAINT__TYPE);
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<OclInvariant> getInvariants()
  {
    if (invariants == null)
    {
      invariants = new EObjectContainmentEList<OclInvariant>(OclInvariant.class, this, UmmPackage.CONSTRAINT__INVARIANTS);
    }
    return invariants;
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
      case UmmPackage.CONSTRAINT__TYPE:
        return ((InternalEList<?>)getType()).basicRemove(otherEnd, msgs);
      case UmmPackage.CONSTRAINT__INVARIANTS:
        return ((InternalEList<?>)getInvariants()).basicRemove(otherEnd, msgs);
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
      case UmmPackage.CONSTRAINT__CONTEXT:
        if (resolve) return getContext();
        return basicGetContext();
      case UmmPackage.CONSTRAINT__TYPE:
        return getType();
      case UmmPackage.CONSTRAINT__INVARIANTS:
        return getInvariants();
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
      case UmmPackage.CONSTRAINT__CONTEXT:
        setContext((ContextRef)newValue);
        return;
      case UmmPackage.CONSTRAINT__TYPE:
        getType().clear();
        getType().addAll((Collection<? extends TC_Constraint>)newValue);
        return;
      case UmmPackage.CONSTRAINT__INVARIANTS:
        getInvariants().clear();
        getInvariants().addAll((Collection<? extends OclInvariant>)newValue);
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
      case UmmPackage.CONSTRAINT__CONTEXT:
        setContext((ContextRef)null);
        return;
      case UmmPackage.CONSTRAINT__TYPE:
        getType().clear();
        return;
      case UmmPackage.CONSTRAINT__INVARIANTS:
        getInvariants().clear();
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
      case UmmPackage.CONSTRAINT__CONTEXT:
        return context != null;
      case UmmPackage.CONSTRAINT__TYPE:
        return type != null && !type.isEmpty();
      case UmmPackage.CONSTRAINT__INVARIANTS:
        return invariants != null && !invariants.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ConstraintImpl
