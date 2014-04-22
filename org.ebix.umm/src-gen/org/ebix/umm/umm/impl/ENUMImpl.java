/**
 */
package org.ebix.umm.umm.impl;

import java.util.Collection;

import org.ebix.umm.umm.ENUM;
import org.ebix.umm.umm.UmmPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ENUM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ebix.umm.umm.impl.ENUMImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.ebix.umm.umm.impl.ENUMImpl#getBusinessTerm <em>Business Term</em>}</li>
 *   <li>{@link org.ebix.umm.umm.impl.ENUMImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.ebix.umm.umm.impl.ENUMImpl#getCodeListAgencyIdentifier <em>Code List Agency Identifier</em>}</li>
 *   <li>{@link org.ebix.umm.umm.impl.ENUMImpl#getCodeListName <em>Code List Name</em>}</li>
 *   <li>{@link org.ebix.umm.umm.impl.ENUMImpl#getCodeListIdentifier <em>Code List Identifier</em>}</li>
 *   <li>{@link org.ebix.umm.umm.impl.ENUMImpl#getDictionary <em>Dictionary</em>}</li>
 *   <li>{@link org.ebix.umm.umm.impl.ENUMImpl#getUniqueIdentifier <em>Unique Identifier</em>}</li>
 *   <li>{@link org.ebix.umm.umm.impl.ENUMImpl#getVersionIdentifier <em>Version Identifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ENUMImpl extends MinimalEObjectImpl.Container implements ENUM
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getBusinessTerm() <em>Business Term</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBusinessTerm()
   * @generated
   * @ordered
   */
  protected EList<String> businessTerm;

  /**
   * The default value of the '{@link #getDefinition() <em>Definition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefinition()
   * @generated
   * @ordered
   */
  protected static final String DEFINITION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDefinition() <em>Definition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefinition()
   * @generated
   * @ordered
   */
  protected String definition = DEFINITION_EDEFAULT;

  /**
   * The default value of the '{@link #getCodeListAgencyIdentifier() <em>Code List Agency Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCodeListAgencyIdentifier()
   * @generated
   * @ordered
   */
  protected static final String CODE_LIST_AGENCY_IDENTIFIER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCodeListAgencyIdentifier() <em>Code List Agency Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCodeListAgencyIdentifier()
   * @generated
   * @ordered
   */
  protected String codeListAgencyIdentifier = CODE_LIST_AGENCY_IDENTIFIER_EDEFAULT;

  /**
   * The default value of the '{@link #getCodeListName() <em>Code List Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCodeListName()
   * @generated
   * @ordered
   */
  protected static final String CODE_LIST_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCodeListName() <em>Code List Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCodeListName()
   * @generated
   * @ordered
   */
  protected String codeListName = CODE_LIST_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getCodeListIdentifier() <em>Code List Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCodeListIdentifier()
   * @generated
   * @ordered
   */
  protected static final String CODE_LIST_IDENTIFIER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCodeListIdentifier() <em>Code List Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCodeListIdentifier()
   * @generated
   * @ordered
   */
  protected String codeListIdentifier = CODE_LIST_IDENTIFIER_EDEFAULT;

  /**
   * The default value of the '{@link #getDictionary() <em>Dictionary</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDictionary()
   * @generated
   * @ordered
   */
  protected static final String DICTIONARY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDictionary() <em>Dictionary</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDictionary()
   * @generated
   * @ordered
   */
  protected String dictionary = DICTIONARY_EDEFAULT;

  /**
   * The default value of the '{@link #getUniqueIdentifier() <em>Unique Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUniqueIdentifier()
   * @generated
   * @ordered
   */
  protected static final String UNIQUE_IDENTIFIER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUniqueIdentifier() <em>Unique Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUniqueIdentifier()
   * @generated
   * @ordered
   */
  protected String uniqueIdentifier = UNIQUE_IDENTIFIER_EDEFAULT;

  /**
   * The default value of the '{@link #getVersionIdentifier() <em>Version Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersionIdentifier()
   * @generated
   * @ordered
   */
  protected static final String VERSION_IDENTIFIER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVersionIdentifier() <em>Version Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersionIdentifier()
   * @generated
   * @ordered
   */
  protected String versionIdentifier = VERSION_IDENTIFIER_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ENUMImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return UmmPackage.Literals.ENUM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UmmPackage.ENUM__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getBusinessTerm()
  {
    if (businessTerm == null)
    {
      businessTerm = new EDataTypeEList<String>(String.class, this, UmmPackage.ENUM__BUSINESS_TERM);
    }
    return businessTerm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDefinition()
  {
    return definition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefinition(String newDefinition)
  {
    String oldDefinition = definition;
    definition = newDefinition;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UmmPackage.ENUM__DEFINITION, oldDefinition, definition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCodeListAgencyIdentifier()
  {
    return codeListAgencyIdentifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCodeListAgencyIdentifier(String newCodeListAgencyIdentifier)
  {
    String oldCodeListAgencyIdentifier = codeListAgencyIdentifier;
    codeListAgencyIdentifier = newCodeListAgencyIdentifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UmmPackage.ENUM__CODE_LIST_AGENCY_IDENTIFIER, oldCodeListAgencyIdentifier, codeListAgencyIdentifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCodeListName()
  {
    return codeListName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCodeListName(String newCodeListName)
  {
    String oldCodeListName = codeListName;
    codeListName = newCodeListName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UmmPackage.ENUM__CODE_LIST_NAME, oldCodeListName, codeListName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCodeListIdentifier()
  {
    return codeListIdentifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCodeListIdentifier(String newCodeListIdentifier)
  {
    String oldCodeListIdentifier = codeListIdentifier;
    codeListIdentifier = newCodeListIdentifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UmmPackage.ENUM__CODE_LIST_IDENTIFIER, oldCodeListIdentifier, codeListIdentifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDictionary()
  {
    return dictionary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDictionary(String newDictionary)
  {
    String oldDictionary = dictionary;
    dictionary = newDictionary;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UmmPackage.ENUM__DICTIONARY, oldDictionary, dictionary));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUniqueIdentifier()
  {
    return uniqueIdentifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUniqueIdentifier(String newUniqueIdentifier)
  {
    String oldUniqueIdentifier = uniqueIdentifier;
    uniqueIdentifier = newUniqueIdentifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UmmPackage.ENUM__UNIQUE_IDENTIFIER, oldUniqueIdentifier, uniqueIdentifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVersionIdentifier()
  {
    return versionIdentifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVersionIdentifier(String newVersionIdentifier)
  {
    String oldVersionIdentifier = versionIdentifier;
    versionIdentifier = newVersionIdentifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UmmPackage.ENUM__VERSION_IDENTIFIER, oldVersionIdentifier, versionIdentifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case UmmPackage.ENUM__NAME:
        return getName();
      case UmmPackage.ENUM__BUSINESS_TERM:
        return getBusinessTerm();
      case UmmPackage.ENUM__DEFINITION:
        return getDefinition();
      case UmmPackage.ENUM__CODE_LIST_AGENCY_IDENTIFIER:
        return getCodeListAgencyIdentifier();
      case UmmPackage.ENUM__CODE_LIST_NAME:
        return getCodeListName();
      case UmmPackage.ENUM__CODE_LIST_IDENTIFIER:
        return getCodeListIdentifier();
      case UmmPackage.ENUM__DICTIONARY:
        return getDictionary();
      case UmmPackage.ENUM__UNIQUE_IDENTIFIER:
        return getUniqueIdentifier();
      case UmmPackage.ENUM__VERSION_IDENTIFIER:
        return getVersionIdentifier();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case UmmPackage.ENUM__NAME:
        setName((String)newValue);
        return;
      case UmmPackage.ENUM__BUSINESS_TERM:
        getBusinessTerm().clear();
        getBusinessTerm().addAll((Collection<? extends String>)newValue);
        return;
      case UmmPackage.ENUM__DEFINITION:
        setDefinition((String)newValue);
        return;
      case UmmPackage.ENUM__CODE_LIST_AGENCY_IDENTIFIER:
        setCodeListAgencyIdentifier((String)newValue);
        return;
      case UmmPackage.ENUM__CODE_LIST_NAME:
        setCodeListName((String)newValue);
        return;
      case UmmPackage.ENUM__CODE_LIST_IDENTIFIER:
        setCodeListIdentifier((String)newValue);
        return;
      case UmmPackage.ENUM__DICTIONARY:
        setDictionary((String)newValue);
        return;
      case UmmPackage.ENUM__UNIQUE_IDENTIFIER:
        setUniqueIdentifier((String)newValue);
        return;
      case UmmPackage.ENUM__VERSION_IDENTIFIER:
        setVersionIdentifier((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case UmmPackage.ENUM__NAME:
        setName(NAME_EDEFAULT);
        return;
      case UmmPackage.ENUM__BUSINESS_TERM:
        getBusinessTerm().clear();
        return;
      case UmmPackage.ENUM__DEFINITION:
        setDefinition(DEFINITION_EDEFAULT);
        return;
      case UmmPackage.ENUM__CODE_LIST_AGENCY_IDENTIFIER:
        setCodeListAgencyIdentifier(CODE_LIST_AGENCY_IDENTIFIER_EDEFAULT);
        return;
      case UmmPackage.ENUM__CODE_LIST_NAME:
        setCodeListName(CODE_LIST_NAME_EDEFAULT);
        return;
      case UmmPackage.ENUM__CODE_LIST_IDENTIFIER:
        setCodeListIdentifier(CODE_LIST_IDENTIFIER_EDEFAULT);
        return;
      case UmmPackage.ENUM__DICTIONARY:
        setDictionary(DICTIONARY_EDEFAULT);
        return;
      case UmmPackage.ENUM__UNIQUE_IDENTIFIER:
        setUniqueIdentifier(UNIQUE_IDENTIFIER_EDEFAULT);
        return;
      case UmmPackage.ENUM__VERSION_IDENTIFIER:
        setVersionIdentifier(VERSION_IDENTIFIER_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case UmmPackage.ENUM__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case UmmPackage.ENUM__BUSINESS_TERM:
        return businessTerm != null && !businessTerm.isEmpty();
      case UmmPackage.ENUM__DEFINITION:
        return DEFINITION_EDEFAULT == null ? definition != null : !DEFINITION_EDEFAULT.equals(definition);
      case UmmPackage.ENUM__CODE_LIST_AGENCY_IDENTIFIER:
        return CODE_LIST_AGENCY_IDENTIFIER_EDEFAULT == null ? codeListAgencyIdentifier != null : !CODE_LIST_AGENCY_IDENTIFIER_EDEFAULT.equals(codeListAgencyIdentifier);
      case UmmPackage.ENUM__CODE_LIST_NAME:
        return CODE_LIST_NAME_EDEFAULT == null ? codeListName != null : !CODE_LIST_NAME_EDEFAULT.equals(codeListName);
      case UmmPackage.ENUM__CODE_LIST_IDENTIFIER:
        return CODE_LIST_IDENTIFIER_EDEFAULT == null ? codeListIdentifier != null : !CODE_LIST_IDENTIFIER_EDEFAULT.equals(codeListIdentifier);
      case UmmPackage.ENUM__DICTIONARY:
        return DICTIONARY_EDEFAULT == null ? dictionary != null : !DICTIONARY_EDEFAULT.equals(dictionary);
      case UmmPackage.ENUM__UNIQUE_IDENTIFIER:
        return UNIQUE_IDENTIFIER_EDEFAULT == null ? uniqueIdentifier != null : !UNIQUE_IDENTIFIER_EDEFAULT.equals(uniqueIdentifier);
      case UmmPackage.ENUM__VERSION_IDENTIFIER:
        return VERSION_IDENTIFIER_EDEFAULT == null ? versionIdentifier != null : !VERSION_IDENTIFIER_EDEFAULT.equals(versionIdentifier);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", businessTerm: ");
    result.append(businessTerm);
    result.append(", definition: ");
    result.append(definition);
    result.append(", codeListAgencyIdentifier: ");
    result.append(codeListAgencyIdentifier);
    result.append(", codeListName: ");
    result.append(codeListName);
    result.append(", codeListIdentifier: ");
    result.append(codeListIdentifier);
    result.append(", dictionary: ");
    result.append(dictionary);
    result.append(", uniqueIdentifier: ");
    result.append(uniqueIdentifier);
    result.append(", versionIdentifier: ");
    result.append(versionIdentifier);
    result.append(')');
    return result.toString();
  }

} //ENUMImpl
