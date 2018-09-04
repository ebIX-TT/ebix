/**
 */
package org.ebix.umm.umm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TC Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ebix.umm.umm.TC_Constraint#getKind <em>Kind</em>}</li>
 *   <li>{@link org.ebix.umm.umm.TC_Constraint#getListIdentifier <em>List Identifier</em>}</li>
 *   <li>{@link org.ebix.umm.umm.TC_Constraint#getResponsibleAgency <em>Responsible Agency</em>}</li>
 * </ul>
 *
 * @see org.ebix.umm.umm.UmmPackage#getTC_Constraint()
 * @model
 * @generated
 */
public interface TC_Constraint extends EObject
{
  /**
   * Returns the value of the '<em><b>Kind</b></em>' attribute.
   * The literals are from the enumeration {@link org.ebix.umm.umm.ConstraintKind}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Kind</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Kind</em>' attribute.
   * @see org.ebix.umm.umm.ConstraintKind
   * @see #setKind(ConstraintKind)
   * @see org.ebix.umm.umm.UmmPackage#getTC_Constraint_Kind()
   * @model
   * @generated
   */
  ConstraintKind getKind();

  /**
   * Sets the value of the '{@link org.ebix.umm.umm.TC_Constraint#getKind <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Kind</em>' attribute.
   * @see org.ebix.umm.umm.ConstraintKind
   * @see #getKind()
   * @generated
   */
  void setKind(ConstraintKind value);

  /**
   * Returns the value of the '<em><b>List Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>List Identifier</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>List Identifier</em>' attribute.
   * @see #setListIdentifier(String)
   * @see org.ebix.umm.umm.UmmPackage#getTC_Constraint_ListIdentifier()
   * @model
   * @generated
   */
  String getListIdentifier();

  /**
   * Sets the value of the '{@link org.ebix.umm.umm.TC_Constraint#getListIdentifier <em>List Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>List Identifier</em>' attribute.
   * @see #getListIdentifier()
   * @generated
   */
  void setListIdentifier(String value);

  /**
   * Returns the value of the '<em><b>Responsible Agency</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Responsible Agency</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Responsible Agency</em>' attribute.
   * @see #setResponsibleAgency(String)
   * @see org.ebix.umm.umm.UmmPackage#getTC_Constraint_ResponsibleAgency()
   * @model
   * @generated
   */
  String getResponsibleAgency();

  /**
   * Sets the value of the '{@link org.ebix.umm.umm.TC_Constraint#getResponsibleAgency <em>Responsible Agency</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Responsible Agency</em>' attribute.
   * @see #getResponsibleAgency()
   * @generated
   */
  void setResponsibleAgency(String value);

} // TC_Constraint
