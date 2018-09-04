/**
 */
package org.ebix.umm.umm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CDT Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ebix.umm.umm.CDTProperty#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link org.ebix.umm.umm.CDTProperty#getName <em>Name</em>}</li>
 *   <li>{@link org.ebix.umm.umm.CDTProperty#getType <em>Type</em>}</li>
 *   <li>{@link org.ebix.umm.umm.CDTProperty#getBusinessTerm <em>Business Term</em>}</li>
 *   <li>{@link org.ebix.umm.umm.CDTProperty#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.ebix.umm.umm.CDTProperty#getDictionary <em>Dictionary</em>}</li>
 *   <li>{@link org.ebix.umm.umm.CDTProperty#getUniqueIdentifier <em>Unique Identifier</em>}</li>
 *   <li>{@link org.ebix.umm.umm.CDTProperty#getVersionIdentifier <em>Version Identifier</em>}</li>
 * </ul>
 *
 * @see org.ebix.umm.umm.UmmPackage#getCDTProperty()
 * @model
 * @generated
 */
public interface CDTProperty extends EObject
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
   * @see org.ebix.umm.umm.UmmPackage#getCDTProperty_Multiplicity()
   * @model
   * @generated
   */
  MultiplicityKind getMultiplicity();

  /**
   * Sets the value of the '{@link org.ebix.umm.umm.CDTProperty#getMultiplicity <em>Multiplicity</em>}' attribute.
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
   * @see org.ebix.umm.umm.UmmPackage#getCDTProperty_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.ebix.umm.umm.CDTProperty#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(Primitive)
   * @see org.ebix.umm.umm.UmmPackage#getCDTProperty_Type()
   * @model
   * @generated
   */
  Primitive getType();

  /**
   * Sets the value of the '{@link org.ebix.umm.umm.CDTProperty#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(Primitive value);

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
   * @see org.ebix.umm.umm.UmmPackage#getCDTProperty_BusinessTerm()
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
   * @see org.ebix.umm.umm.UmmPackage#getCDTProperty_Definition()
   * @model
   * @generated
   */
  String getDefinition();

  /**
   * Sets the value of the '{@link org.ebix.umm.umm.CDTProperty#getDefinition <em>Definition</em>}' attribute.
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
   * @see org.ebix.umm.umm.UmmPackage#getCDTProperty_Dictionary()
   * @model
   * @generated
   */
  String getDictionary();

  /**
   * Sets the value of the '{@link org.ebix.umm.umm.CDTProperty#getDictionary <em>Dictionary</em>}' attribute.
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
   * @see org.ebix.umm.umm.UmmPackage#getCDTProperty_UniqueIdentifier()
   * @model
   * @generated
   */
  String getUniqueIdentifier();

  /**
   * Sets the value of the '{@link org.ebix.umm.umm.CDTProperty#getUniqueIdentifier <em>Unique Identifier</em>}' attribute.
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
   * @see org.ebix.umm.umm.UmmPackage#getCDTProperty_VersionIdentifier()
   * @model
   * @generated
   */
  String getVersionIdentifier();

  /**
   * Sets the value of the '{@link org.ebix.umm.umm.CDTProperty#getVersionIdentifier <em>Version Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Version Identifier</em>' attribute.
   * @see #getVersionIdentifier()
   * @generated
   */
  void setVersionIdentifier(String value);

} // CDTProperty
