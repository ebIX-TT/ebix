/**
 */
package org.ebix.umm.umm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assembled</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ebix.umm.umm.Assembled#getOriginals <em>Originals</em>}</li>
 *   <li>{@link org.ebix.umm.umm.Assembled#getSubsets <em>Subsets</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ebix.umm.umm.UmmPackage#getAssembled()
 * @model
 * @generated
 */
public interface Assembled extends AssembledBase
{
  /**
   * Returns the value of the '<em><b>Originals</b></em>' reference list.
   * The list contents are of type {@link org.ebix.umm.umm.Original}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Originals</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Originals</em>' reference list.
   * @see org.ebix.umm.umm.UmmPackage#getAssembled_Originals()
   * @model
   * @generated
   */
  EList<Original> getOriginals();

  /**
   * Returns the value of the '<em><b>Subsets</b></em>' reference list.
   * The list contents are of type {@link org.ebix.umm.umm.Subset}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Subsets</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subsets</em>' reference list.
   * @see org.ebix.umm.umm.UmmPackage#getAssembled_Subsets()
   * @model
   * @generated
   */
  EList<Subset> getSubsets();

} // Assembled
