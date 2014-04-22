/**
 */
package org.ebix.umm.umm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ACC Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ebix.umm.umm.ACCProperty#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link org.ebix.umm.umm.ACCProperty#getName <em>Name</em>}</li>
 *   <li>{@link org.ebix.umm.umm.ACCProperty#getBusinessTerm <em>Business Term</em>}</li>
 *   <li>{@link org.ebix.umm.umm.ACCProperty#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.ebix.umm.umm.ACCProperty#getDictionary <em>Dictionary</em>}</li>
 *   <li>{@link org.ebix.umm.umm.ACCProperty#getUniqueIdentifier <em>Unique Identifier</em>}</li>
 *   <li>{@link org.ebix.umm.umm.ACCProperty#getVersionIdentifier <em>Version Identifier</em>}</li>
 *   <li>{@link org.ebix.umm.umm.ACCProperty#getSequencingKey <em>Sequencing Key</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ebix.umm.umm.UmmPackage#getACCProperty()
 * @model
 * @generated
 */
public interface ACCProperty extends EObject
{
  /**
   * Returns the value of the '<em><b>Multiplicity</b></em>' attribute.
   * The literals are from the enumeration {@link org.ebix.umm.umm.MultiplicityKind}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Multiplicity</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Multiplicity</em>' attribute.
   * @see org.ebix.umm.umm.MultiplicityKind
   * @see #setMultiplicity(MultiplicityKind)
   * @see org.ebix.umm.umm.UmmPackage#getACCProperty_Multiplicity()
   * @model
   * @generated
   */
  MultiplicityKind getMultiplicity();

  /**
   * Sets the value of the '{@link org.ebix.umm.umm.ACCProperty#getMultiplicity <em>Multiplicity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Multiplicity</em>' attribute.
   * @see org.ebix.umm.umm.MultiplicityKind
   * @see #getMultiplicity()
   * @generated
   */
  void setMultiplicity(MultiplicityKind value);

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
   * @see org.ebix.umm.umm.UmmPackage#getACCProperty_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.ebix.umm.umm.ACCProperty#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see org.ebix.umm.umm.UmmPackage#getACCProperty_BusinessTerm()
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
   * @see org.ebix.umm.umm.UmmPackage#getACCProperty_Definition()
   * @model
   * @generated
   */
  String getDefinition();

  /**
   * Sets the value of the '{@link org.ebix.umm.umm.ACCProperty#getDefinition <em>Definition</em>}' attribute.
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
   * @see org.ebix.umm.umm.UmmPackage#getACCProperty_Dictionary()
   * @model
   * @generated
   */
  String getDictionary();

  /**
   * Sets the value of the '{@link org.ebix.umm.umm.ACCProperty#getDictionary <em>Dictionary</em>}' attribute.
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
   * @see org.ebix.umm.umm.UmmPackage#getACCProperty_UniqueIdentifier()
   * @model
   * @generated
   */
  String getUniqueIdentifier();

  /**
   * Sets the value of the '{@link org.ebix.umm.umm.ACCProperty#getUniqueIdentifier <em>Unique Identifier</em>}' attribute.
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
   * @see org.ebix.umm.umm.UmmPackage#getACCProperty_VersionIdentifier()
   * @model
   * @generated
   */
  String getVersionIdentifier();

  /**
   * Sets the value of the '{@link org.ebix.umm.umm.ACCProperty#getVersionIdentifier <em>Version Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Version Identifier</em>' attribute.
   * @see #getVersionIdentifier()
   * @generated
   */
  void setVersionIdentifier(String value);

  /**
   * Returns the value of the '<em><b>Sequencing Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sequencing Key</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sequencing Key</em>' attribute.
   * @see #setSequencingKey(String)
   * @see org.ebix.umm.umm.UmmPackage#getACCProperty_SequencingKey()
   * @model
   * @generated
   */
  String getSequencingKey();

  /**
   * Sets the value of the '{@link org.ebix.umm.umm.ACCProperty#getSequencingKey <em>Sequencing Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sequencing Key</em>' attribute.
   * @see #getSequencingKey()
   * @generated
   */
  void setSequencingKey(String value);

} // ACCProperty
