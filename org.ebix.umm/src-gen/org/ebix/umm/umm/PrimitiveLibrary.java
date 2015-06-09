/**
 */
package org.ebix.umm.umm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ebix.umm.umm.PrimitiveLibrary#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @see org.ebix.umm.umm.UmmPackage#getPrimitiveLibrary()
 * @model
 * @generated
 */
public interface PrimitiveLibrary extends Library
{
  /**
   * Returns the value of the '<em><b>Types</b></em>' containment reference list.
   * The list contents are of type {@link org.ebix.umm.umm.Primitive}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Types</em>' containment reference list.
   * @see org.ebix.umm.umm.UmmPackage#getPrimitiveLibrary_Types()
   * @model containment="true"
   * @generated
   */
  EList<Primitive> getTypes();

} // PrimitiveLibrary
