/**
 */
package org.ebix.umm.umm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Codelist Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ebix.umm.umm.CodelistEntry#getName <em>Name</em>}</li>
 *   <li>{@link org.ebix.umm.umm.CodelistEntry#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see org.ebix.umm.umm.UmmPackage#getCodelistEntry()
 * @model
 * @generated
 */
public interface CodelistEntry extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.ebix.umm.umm.UmmPackage#getCodelistEntry_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.ebix.umm.umm.CodelistEntry#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see org.ebix.umm.umm.UmmPackage#getCodelistEntry_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link org.ebix.umm.umm.CodelistEntry#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

} // CodelistEntry
