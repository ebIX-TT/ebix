/**
 */
package org.ebix.umm.umm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BDT Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ebix.umm.umm.BDTLibrary#getBusinessTerm <em>Business Term</em>}</li>
 *   <li>{@link org.ebix.umm.umm.BDTLibrary#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.ebix.umm.umm.BDTLibrary#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.ebix.umm.umm.BDTLibrary#getReference <em>Reference</em>}</li>
 *   <li>{@link org.ebix.umm.umm.BDTLibrary#getUniqueIdentifier <em>Unique Identifier</em>}</li>
 *   <li>{@link org.ebix.umm.umm.BDTLibrary#getVersionIdentifier <em>Version Identifier</em>}</li>
 *   <li>{@link org.ebix.umm.umm.BDTLibrary#getBaseURN <em>Base URN</em>}</li>
 *   <li>{@link org.ebix.umm.umm.BDTLibrary#getNamespacePrefix <em>Namespace Prefix</em>}</li>
 *   <li>{@link org.ebix.umm.umm.BDTLibrary#getBdts <em>Bdts</em>}</li>
 * </ul>
 *
 * @see org.ebix.umm.umm.UmmPackage#getBDTLibrary()
 * @model
 * @generated
 */
public interface BDTLibrary extends Library
{
  /**
   * Returns the value of the '<em><b>Business Term</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Business Term</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Business Term</em>' attribute list.
   * @see org.ebix.umm.umm.UmmPackage#getBDTLibrary_BusinessTerm()
   * @model unique="false"
   * @generated
   */
  EList<String> getBusinessTerm();

  /**
   * Returns the value of the '<em><b>Copyright</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Copyright</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Copyright</em>' attribute list.
   * @see org.ebix.umm.umm.UmmPackage#getBDTLibrary_Copyright()
   * @model unique="false"
   * @generated
   */
  EList<String> getCopyright();

  /**
   * Returns the value of the '<em><b>Owner</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owner</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owner</em>' attribute list.
   * @see org.ebix.umm.umm.UmmPackage#getBDTLibrary_Owner()
   * @model unique="false"
   * @generated
   */
  EList<String> getOwner();

  /**
   * Returns the value of the '<em><b>Reference</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reference</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reference</em>' attribute list.
   * @see org.ebix.umm.umm.UmmPackage#getBDTLibrary_Reference()
   * @model unique="false"
   * @generated
   */
  EList<String> getReference();

  /**
   * Returns the value of the '<em><b>Unique Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unique Identifier</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unique Identifier</em>' attribute.
   * @see #setUniqueIdentifier(String)
   * @see org.ebix.umm.umm.UmmPackage#getBDTLibrary_UniqueIdentifier()
   * @model
   * @generated
   */
  String getUniqueIdentifier();

  /**
   * Sets the value of the '{@link org.ebix.umm.umm.BDTLibrary#getUniqueIdentifier <em>Unique Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unique Identifier</em>' attribute.
   * @see #getUniqueIdentifier()
   * @generated
   */
  void setUniqueIdentifier(String value);

  /**
   * Returns the value of the '<em><b>Version Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Version Identifier</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Version Identifier</em>' attribute.
   * @see #setVersionIdentifier(String)
   * @see org.ebix.umm.umm.UmmPackage#getBDTLibrary_VersionIdentifier()
   * @model
   * @generated
   */
  String getVersionIdentifier();

  /**
   * Sets the value of the '{@link org.ebix.umm.umm.BDTLibrary#getVersionIdentifier <em>Version Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Version Identifier</em>' attribute.
   * @see #getVersionIdentifier()
   * @generated
   */
  void setVersionIdentifier(String value);

  /**
   * Returns the value of the '<em><b>Base URN</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Base URN</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Base URN</em>' attribute.
   * @see #setBaseURN(String)
   * @see org.ebix.umm.umm.UmmPackage#getBDTLibrary_BaseURN()
   * @model
   * @generated
   */
  String getBaseURN();

  /**
   * Sets the value of the '{@link org.ebix.umm.umm.BDTLibrary#getBaseURN <em>Base URN</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Base URN</em>' attribute.
   * @see #getBaseURN()
   * @generated
   */
  void setBaseURN(String value);

  /**
   * Returns the value of the '<em><b>Namespace Prefix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Namespace Prefix</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Namespace Prefix</em>' attribute.
   * @see #setNamespacePrefix(String)
   * @see org.ebix.umm.umm.UmmPackage#getBDTLibrary_NamespacePrefix()
   * @model
   * @generated
   */
  String getNamespacePrefix();

  /**
   * Sets the value of the '{@link org.ebix.umm.umm.BDTLibrary#getNamespacePrefix <em>Namespace Prefix</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Namespace Prefix</em>' attribute.
   * @see #getNamespacePrefix()
   * @generated
   */
  void setNamespacePrefix(String value);

  /**
   * Returns the value of the '<em><b>Bdts</b></em>' containment reference list.
   * The list contents are of type {@link org.ebix.umm.umm.BDT}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bdts</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bdts</em>' containment reference list.
   * @see org.ebix.umm.umm.UmmPackage#getBDTLibrary_Bdts()
   * @model containment="true"
   * @generated
   */
  EList<BDT> getBdts();

} // BDTLibrary
