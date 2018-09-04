/**
 */
package org.ebix.umm.umm.impl;

import org.ebix.umm.umm.ConstraintKind;
import org.ebix.umm.umm.TC_Constraint;
import org.ebix.umm.umm.UmmPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TC Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ebix.umm.umm.impl.TC_ConstraintImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.ebix.umm.umm.impl.TC_ConstraintImpl#getListIdentifier <em>List Identifier</em>}</li>
 *   <li>{@link org.ebix.umm.umm.impl.TC_ConstraintImpl#getResponsibleAgency <em>Responsible Agency</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TC_ConstraintImpl extends MinimalEObjectImpl.Container implements TC_Constraint
{
  /**
   * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKind()
   * @generated
   * @ordered
   */
  protected static final ConstraintKind KIND_EDEFAULT = ConstraintKind.INVARIANT;

  /**
   * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKind()
   * @generated
   * @ordered
   */
  protected ConstraintKind kind = KIND_EDEFAULT;

  /**
   * The default value of the '{@link #getListIdentifier() <em>List Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getListIdentifier()
   * @generated
   * @ordered
   */
  protected static final String LIST_IDENTIFIER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getListIdentifier() <em>List Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getListIdentifier()
   * @generated
   * @ordered
   */
  protected String listIdentifier = LIST_IDENTIFIER_EDEFAULT;

  /**
   * The default value of the '{@link #getResponsibleAgency() <em>Responsible Agency</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResponsibleAgency()
   * @generated
   * @ordered
   */
  protected static final String RESPONSIBLE_AGENCY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getResponsibleAgency() <em>Responsible Agency</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResponsibleAgency()
   * @generated
   * @ordered
   */
  protected String responsibleAgency = RESPONSIBLE_AGENCY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TC_ConstraintImpl()
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
    return UmmPackage.Literals.TC_CONSTRAINT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstraintKind getKind()
  {
    return kind;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKind(ConstraintKind newKind)
  {
    ConstraintKind oldKind = kind;
    kind = newKind == null ? KIND_EDEFAULT : newKind;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UmmPackage.TC_CONSTRAINT__KIND, oldKind, kind));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getListIdentifier()
  {
    return listIdentifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setListIdentifier(String newListIdentifier)
  {
    String oldListIdentifier = listIdentifier;
    listIdentifier = newListIdentifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UmmPackage.TC_CONSTRAINT__LIST_IDENTIFIER, oldListIdentifier, listIdentifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getResponsibleAgency()
  {
    return responsibleAgency;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResponsibleAgency(String newResponsibleAgency)
  {
    String oldResponsibleAgency = responsibleAgency;
    responsibleAgency = newResponsibleAgency;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UmmPackage.TC_CONSTRAINT__RESPONSIBLE_AGENCY, oldResponsibleAgency, responsibleAgency));
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
      case UmmPackage.TC_CONSTRAINT__KIND:
        return getKind();
      case UmmPackage.TC_CONSTRAINT__LIST_IDENTIFIER:
        return getListIdentifier();
      case UmmPackage.TC_CONSTRAINT__RESPONSIBLE_AGENCY:
        return getResponsibleAgency();
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
      case UmmPackage.TC_CONSTRAINT__KIND:
        setKind((ConstraintKind)newValue);
        return;
      case UmmPackage.TC_CONSTRAINT__LIST_IDENTIFIER:
        setListIdentifier((String)newValue);
        return;
      case UmmPackage.TC_CONSTRAINT__RESPONSIBLE_AGENCY:
        setResponsibleAgency((String)newValue);
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
      case UmmPackage.TC_CONSTRAINT__KIND:
        setKind(KIND_EDEFAULT);
        return;
      case UmmPackage.TC_CONSTRAINT__LIST_IDENTIFIER:
        setListIdentifier(LIST_IDENTIFIER_EDEFAULT);
        return;
      case UmmPackage.TC_CONSTRAINT__RESPONSIBLE_AGENCY:
        setResponsibleAgency(RESPONSIBLE_AGENCY_EDEFAULT);
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
      case UmmPackage.TC_CONSTRAINT__KIND:
        return kind != KIND_EDEFAULT;
      case UmmPackage.TC_CONSTRAINT__LIST_IDENTIFIER:
        return LIST_IDENTIFIER_EDEFAULT == null ? listIdentifier != null : !LIST_IDENTIFIER_EDEFAULT.equals(listIdentifier);
      case UmmPackage.TC_CONSTRAINT__RESPONSIBLE_AGENCY:
        return RESPONSIBLE_AGENCY_EDEFAULT == null ? responsibleAgency != null : !RESPONSIBLE_AGENCY_EDEFAULT.equals(responsibleAgency);
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
    result.append(" (kind: ");
    result.append(kind);
    result.append(", listIdentifier: ");
    result.append(listIdentifier);
    result.append(", responsibleAgency: ");
    result.append(responsibleAgency);
    result.append(')');
    return result.toString();
  }

} //TC_ConstraintImpl
