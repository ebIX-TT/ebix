/**
 */
package org.ebix.umm.umm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ebix.umm.umm.MA#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.ebix.umm.umm.MA#getConstraints <em>Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ebix.umm.umm.UmmPackage#getMA()
 * @model
 * @generated
 */
public interface MA extends ContextRef
{
  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link org.ebix.umm.umm.MAProperty}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see org.ebix.umm.umm.UmmPackage#getMA_Properties()
   * @model containment="true"
   * @generated
   */
  EList<MAProperty> getProperties();

  /**
   * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
   * The list contents are of type {@link org.ebix.umm.umm.Constraint}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constraints</em>' containment reference list.
   * @see org.ebix.umm.umm.UmmPackage#getMA_Constraints()
   * @model containment="true"
   * @generated
   */
  EList<Constraint> getConstraints();

} // MA
