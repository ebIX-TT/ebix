/**
 */
package org.ebix.umm.umm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inf Envelope</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ebix.umm.umm.InfEnvelope#getName <em>Name</em>}</li>
 *   <li>{@link org.ebix.umm.umm.InfEnvelope#getAssemblies <em>Assemblies</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ebix.umm.umm.UmmPackage#getInfEnvelope()
 * @model
 * @generated
 */
public interface InfEnvelope extends EObject
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
   * @see org.ebix.umm.umm.UmmPackage#getInfEnvelope_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.ebix.umm.umm.InfEnvelope#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Assemblies</b></em>' containment reference list.
   * The list contents are of type {@link org.ebix.umm.umm.MA}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assemblies</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assemblies</em>' containment reference list.
   * @see org.ebix.umm.umm.UmmPackage#getInfEnvelope_Assemblies()
   * @model containment="true"
   * @generated
   */
  EList<MA> getAssemblies();

} // InfEnvelope
