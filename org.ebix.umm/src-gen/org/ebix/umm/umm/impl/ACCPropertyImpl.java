/**
 */
package org.ebix.umm.umm.impl;

import java.util.Collection;

import org.ebix.umm.umm.ACCProperty;
import org.ebix.umm.umm.MultiplicityKind;
import org.ebix.umm.umm.UmmPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ACC Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ebix.umm.umm.impl.ACCPropertyImpl#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link org.ebix.umm.umm.impl.ACCPropertyImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.ebix.umm.umm.impl.ACCPropertyImpl#getBusinessTerm <em>Business Term</em>}</li>
 *   <li>{@link org.ebix.umm.umm.impl.ACCPropertyImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.ebix.umm.umm.impl.ACCPropertyImpl#getDictionary <em>Dictionary</em>}</li>
 *   <li>{@link org.ebix.umm.umm.impl.ACCPropertyImpl#getUniqueIdentifier <em>Unique Identifier</em>}</li>
 *   <li>{@link org.ebix.umm.umm.impl.ACCPropertyImpl#getVersionIdentifier <em>Version Identifier</em>}</li>
 *   <li>{@link org.ebix.umm.umm.impl.ACCPropertyImpl#getSequencingKey <em>Sequencing Key</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ACCPropertyImpl extends MinimalEObjectImpl.Container implements ACCProperty
{
  /**
   * The default value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMultiplicity()
   * @generated
   * @ordered
   */
  protected static final MultiplicityKind MULTIPLICITY_EDEFAULT = MultiplicityKind.OPTIONAL;

  /**
   * The cached value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMultiplicity()
   * @generated
   * @ordered
   */
  protected MultiplicityKind multiplicity = MULTIPLICITY_EDEFAULT;

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
   * The default value of the '{@link #getSequencingKey() <em>Sequencing Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSequencingKey()
   * @generated
   * @ordered
   */
  protected static final String SEQUENCING_KEY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSequencingKey() <em>Sequencing Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSequencingKey()
   * @generated
   * @ordered
   */
  protected String sequencingKey = SEQUENCING_KEY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ACCPropertyImpl()
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
    return UmmPackage.Literals.ACC_PROPERTY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultiplicityKind getMultiplicity()
  {
    return multiplicity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMultiplicity(MultiplicityKind newMultiplicity)
  {
    MultiplicityKind oldMultiplicity = multiplicity;
    multiplicity = newMultiplicity == null ? MULTIPLICITY_EDEFAULT : newMultiplicity;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UmmPackage.ACC_PROPERTY__MULTIPLICITY, oldMultiplicity, multiplicity));
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
      eNotify(new ENotificationImpl(this, Notification.SET, UmmPackage.ACC_PROPERTY__NAME, oldName, name));
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
      businessTerm = new EDataTypeEList<String>(String.class, this, UmmPackage.ACC_PROPERTY__BUSINESS_TERM);
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
      eNotify(new ENotificationImpl(this, Notification.SET, UmmPackage.ACC_PROPERTY__DEFINITION, oldDefinition, definition));
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
      eNotify(new ENotificationImpl(this, Notification.SET, UmmPackage.ACC_PROPERTY__DICTIONARY, oldDictionary, dictionary));
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
      eNotify(new ENotificationImpl(this, Notification.SET, UmmPackage.ACC_PROPERTY__UNIQUE_IDENTIFIER, oldUniqueIdentifier, uniqueIdentifier));
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
      eNotify(new ENotificationImpl(this, Notification.SET, UmmPackage.ACC_PROPERTY__VERSION_IDENTIFIER, oldVersionIdentifier, versionIdentifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSequencingKey()
  {
    return sequencingKey;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSequencingKey(String newSequencingKey)
  {
    String oldSequencingKey = sequencingKey;
    sequencingKey = newSequencingKey;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UmmPackage.ACC_PROPERTY__SEQUENCING_KEY, oldSequencingKey, sequencingKey));
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
      case UmmPackage.ACC_PROPERTY__MULTIPLICITY:
        return getMultiplicity();
      case UmmPackage.ACC_PROPERTY__NAME:
        return getName();
      case UmmPackage.ACC_PROPERTY__BUSINESS_TERM:
        return getBusinessTerm();
      case UmmPackage.ACC_PROPERTY__DEFINITION:
        return getDefinition();
      case UmmPackage.ACC_PROPERTY__DICTIONARY:
        return getDictionary();
      case UmmPackage.ACC_PROPERTY__UNIQUE_IDENTIFIER:
        return getUniqueIdentifier();
      case UmmPackage.ACC_PROPERTY__VERSION_IDENTIFIER:
        return getVersionIdentifier();
      case UmmPackage.ACC_PROPERTY__SEQUENCING_KEY:
        return getSequencingKey();
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
      case UmmPackage.ACC_PROPERTY__MULTIPLICITY:
        setMultiplicity((MultiplicityKind)newValue);
        return;
      case UmmPackage.ACC_PROPERTY__NAME:
        setName((String)newValue);
        return;
      case UmmPackage.ACC_PROPERTY__BUSINESS_TERM:
        getBusinessTerm().clear();
        getBusinessTerm().addAll((Collection<? extends String>)newValue);
        return;
      case UmmPackage.ACC_PROPERTY__DEFINITION:
        setDefinition((String)newValue);
        return;
      case UmmPackage.ACC_PROPERTY__DICTIONARY:
        setDictionary((String)newValue);
        return;
      case UmmPackage.ACC_PROPERTY__UNIQUE_IDENTIFIER:
        setUniqueIdentifier((String)newValue);
        return;
      case UmmPackage.ACC_PROPERTY__VERSION_IDENTIFIER:
        setVersionIdentifier((String)newValue);
        return;
      case UmmPackage.ACC_PROPERTY__SEQUENCING_KEY:
        setSequencingKey((String)newValue);
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
      case UmmPackage.ACC_PROPERTY__MULTIPLICITY:
        setMultiplicity(MULTIPLICITY_EDEFAULT);
        return;
      case UmmPackage.ACC_PROPERTY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case UmmPackage.ACC_PROPERTY__BUSINESS_TERM:
        getBusinessTerm().clear();
        return;
      case UmmPackage.ACC_PROPERTY__DEFINITION:
        setDefinition(DEFINITION_EDEFAULT);
        return;
      case UmmPackage.ACC_PROPERTY__DICTIONARY:
        setDictionary(DICTIONARY_EDEFAULT);
        return;
      case UmmPackage.ACC_PROPERTY__UNIQUE_IDENTIFIER:
        setUniqueIdentifier(UNIQUE_IDENTIFIER_EDEFAULT);
        return;
      case UmmPackage.ACC_PROPERTY__VERSION_IDENTIFIER:
        setVersionIdentifier(VERSION_IDENTIFIER_EDEFAULT);
        return;
      case UmmPackage.ACC_PROPERTY__SEQUENCING_KEY:
        setSequencingKey(SEQUENCING_KEY_EDEFAULT);
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
      case UmmPackage.ACC_PROPERTY__MULTIPLICITY:
        return multiplicity != MULTIPLICITY_EDEFAULT;
      case UmmPackage.ACC_PROPERTY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case UmmPackage.ACC_PROPERTY__BUSINESS_TERM:
        return businessTerm != null && !businessTerm.isEmpty();
      case UmmPackage.ACC_PROPERTY__DEFINITION:
        return DEFINITION_EDEFAULT == null ? definition != null : !DEFINITION_EDEFAULT.equals(definition);
      case UmmPackage.ACC_PROPERTY__DICTIONARY:
        return DICTIONARY_EDEFAULT == null ? dictionary != null : !DICTIONARY_EDEFAULT.equals(dictionary);
      case UmmPackage.ACC_PROPERTY__UNIQUE_IDENTIFIER:
        return UNIQUE_IDENTIFIER_EDEFAULT == null ? uniqueIdentifier != null : !UNIQUE_IDENTIFIER_EDEFAULT.equals(uniqueIdentifier);
      case UmmPackage.ACC_PROPERTY__VERSION_IDENTIFIER:
        return VERSION_IDENTIFIER_EDEFAULT == null ? versionIdentifier != null : !VERSION_IDENTIFIER_EDEFAULT.equals(versionIdentifier);
      case UmmPackage.ACC_PROPERTY__SEQUENCING_KEY:
        return SEQUENCING_KEY_EDEFAULT == null ? sequencingKey != null : !SEQUENCING_KEY_EDEFAULT.equals(sequencingKey);
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
    result.append(" (multiplicity: ");
    result.append(multiplicity);
    result.append(", name: ");
    result.append(name);
    result.append(", businessTerm: ");
    result.append(businessTerm);
    result.append(", definition: ");
    result.append(definition);
    result.append(", dictionary: ");
    result.append(dictionary);
    result.append(", uniqueIdentifier: ");
    result.append(uniqueIdentifier);
    result.append(", versionIdentifier: ");
    result.append(versionIdentifier);
    result.append(", sequencingKey: ");
    result.append(sequencingKey);
    result.append(')');
    return result.toString();
  }

} //ACCPropertyImpl
