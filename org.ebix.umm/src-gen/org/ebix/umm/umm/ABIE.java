/**
 */
package org.ebix.umm.umm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ABIE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ebix.umm.umm.ABIE#getBusinessTerm <em>Business Term</em>}</li>
 *   <li>{@link org.ebix.umm.umm.ABIE#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.ebix.umm.umm.ABIE#getDictionary <em>Dictionary</em>}</li>
 *   <li>{@link org.ebix.umm.umm.ABIE#getUniqueIdentifier <em>Unique Identifier</em>}</li>
 *   <li>{@link org.ebix.umm.umm.ABIE#getVersionIdentifier <em>Version Identifier</em>}</li>
 *   <li>{@link org.ebix.umm.umm.ABIE#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.ebix.umm.umm.ABIE#getConstraints <em>Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ebix.umm.umm.UmmPackage#getABIE()
 * @model
 * @generated
 */
public interface ABIE extends ContextRef
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
   * @see org.ebix.umm.umm.UmmPackage#getABIE_BusinessTerm()
   * @model unique="false"
   * @generated
   */
  EList<String> getBusinessTerm();

  /**
   * Returns the value of the '<em><b>Definition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Definition</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Definition</em>' attribute.
   * @see #setDefinition(String)
   * @see org.ebix.umm.umm.UmmPackage#getABIE_Definition()
   * @model
   * @generated
   */
  String getDefinition();

  /**
   * Sets the value of the '{@link org.ebix.umm.umm.ABIE#getDefinition <em>Definition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Definition</em>' attribute.
   * @see #getDefinition()
   * @generated
   */
  void setDefinition(String value);

  /**
   * Returns the value of the '<em><b>Dictionary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dictionary</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dictionary</em>' attribute.
   * @see #setDictionary(String)
   * @see org.ebix.umm.umm.UmmPackage#getABIE_Dictionary()
   * @model
   * @generated
   */
  String getDictionary();

  /**
   * Sets the value of the '{@link org.ebix.umm.umm.ABIE#getDictionary <em>Dictionary</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dictionary</em>' attribute.
   * @see #getDictionary()
   * @generated
   */
  void setDictionary(String value);

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
   * @see org.ebix.umm.umm.UmmPackage#getABIE_UniqueIdentifier()
   * @model
   * @generated
   */
  String getUniqueIdentifier();

  /**
   * Sets the value of the '{@link org.ebix.umm.umm.ABIE#getUniqueIdentifier <em>Unique Identifier</em>}' attribute.
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
   * @see org.ebix.umm.umm.UmmPackage#getABIE_VersionIdentifier()
   * @model
   * @generated
   */
  String getVersionIdentifier();

  /**
   * Sets the value of the '{@link org.ebix.umm.umm.ABIE#getVersionIdentifier <em>Version Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Version Identifier</em>' attribute.
   * @see #getVersionIdentifier()
   * @generated
   */
  void setVersionIdentifier(String value);

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link org.ebix.umm.umm.ABIEProperty}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see org.ebix.umm.umm.UmmPackage#getABIE_Properties()
   * @model containment="true"
   * @generated
   */
  EList<ABIEProperty> getProperties();

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
   * @see org.ebix.umm.umm.UmmPackage#getABIE_Constraints()
   * @model containment="true"
   * @generated
   */
  EList<Constraint> getConstraints();

} // ABIE
