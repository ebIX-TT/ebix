/**
 */
package org.ebix.umm.umm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ebix.umm.umm.Subset#getCodes <em>Codes</em>}</li>
 * </ul>
 *
 * @see org.ebix.umm.umm.UmmPackage#getSubset()
 * @model
 * @generated
 */
public interface Subset extends ENUM
{
  /**
   * Returns the value of the '<em><b>Codes</b></em>' containment reference list.
   * The list contents are of type {@link org.ebix.umm.umm.CodelistEntry}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Codes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Codes</em>' containment reference list.
   * @see org.ebix.umm.umm.UmmPackage#getSubset_Codes()
   * @model containment="true"
   * @generated
   */
  EList<CodelistEntry> getCodes();

} // Subset
