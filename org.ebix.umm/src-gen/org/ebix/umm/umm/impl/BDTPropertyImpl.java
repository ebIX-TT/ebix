/**
 */
package org.ebix.umm.umm.impl;

import java.util.Collection;

import org.ebix.umm.umm.AssembledBase;
import org.ebix.umm.umm.BDTProperty;
import org.ebix.umm.umm.UmmPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BDT Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ebix.umm.umm.impl.BDTPropertyImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.ebix.umm.umm.impl.BDTPropertyImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.ebix.umm.umm.impl.BDTPropertyImpl#getMinLength <em>Min Length</em>}</li>
 *   <li>{@link org.ebix.umm.umm.impl.BDTPropertyImpl#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link org.ebix.umm.umm.impl.BDTPropertyImpl#getLength <em>Length</em>}</li>
 *   <li>{@link org.ebix.umm.umm.impl.BDTPropertyImpl#getBusinessTerm <em>Business Term</em>}</li>
 *   <li>{@link org.ebix.umm.umm.impl.BDTPropertyImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.ebix.umm.umm.impl.BDTPropertyImpl#getDictionary <em>Dictionary</em>}</li>
 *   <li>{@link org.ebix.umm.umm.impl.BDTPropertyImpl#getUniqueIdentifier <em>Unique Identifier</em>}</li>
 *   <li>{@link org.ebix.umm.umm.impl.BDTPropertyImpl#getVersionIdentifier <em>Version Identifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BDTPropertyImpl extends OclRefImpl implements BDTProperty
{
  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected AssembledBase type;

  /**
   * The default value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPattern()
   * @generated
   * @ordered
   */
  protected static final String PATTERN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPattern()
   * @generated
   * @ordered
   */
  protected String pattern = PATTERN_EDEFAULT;

  /**
   * The default value of the '{@link #getMinLength() <em>Min Length</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinLength()
   * @generated
   * @ordered
   */
  protected static final int MIN_LENGTH_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMinLength() <em>Min Length</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinLength()
   * @generated
   * @ordered
   */
  protected int minLength = MIN_LENGTH_EDEFAULT;

  /**
   * The default value of the '{@link #getMaxLength() <em>Max Length</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxLength()
   * @generated
   * @ordered
   */
  protected static final int MAX_LENGTH_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMaxLength() <em>Max Length</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxLength()
   * @generated
   * @ordered
   */
  protected int maxLength = MAX_LENGTH_EDEFAULT;

  /**
   * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLength()
   * @generated
   * @ordered
   */
  protected static final int LENGTH_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLength()
   * @generated
   * @ordered
   */
  protected int length = LENGTH_EDEFAULT;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BDTPropertyImpl()
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
    return UmmPackage.Literals.BDT_PROPERTY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssembledBase getType()
  {
    if (type != null && type.eIsProxy())
    {
      InternalEObject oldType = (InternalEObject)type;
      type = (AssembledBase)eResolveProxy(oldType);
      if (type != oldType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmmPackage.BDT_PROPERTY__TYPE, oldType, type));
      }
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssembledBase basicGetType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(AssembledBase newType)
  {
    AssembledBase oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UmmPackage.BDT_PROPERTY__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPattern()
  {
    return pattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPattern(String newPattern)
  {
    String oldPattern = pattern;
    pattern = newPattern;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UmmPackage.BDT_PROPERTY__PATTERN, oldPattern, pattern));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getMinLength()
  {
    return minLength;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMinLength(int newMinLength)
  {
    int oldMinLength = minLength;
    minLength = newMinLength;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UmmPackage.BDT_PROPERTY__MIN_LENGTH, oldMinLength, minLength));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getMaxLength()
  {
    return maxLength;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMaxLength(int newMaxLength)
  {
    int oldMaxLength = maxLength;
    maxLength = newMaxLength;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UmmPackage.BDT_PROPERTY__MAX_LENGTH, oldMaxLength, maxLength));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getLength()
  {
    return length;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLength(int newLength)
  {
    int oldLength = length;
    length = newLength;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UmmPackage.BDT_PROPERTY__LENGTH, oldLength, length));
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
      businessTerm = new EDataTypeEList<String>(String.class, this, UmmPackage.BDT_PROPERTY__BUSINESS_TERM);
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
      eNotify(new ENotificationImpl(this, Notification.SET, UmmPackage.BDT_PROPERTY__DEFINITION, oldDefinition, definition));
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
      eNotify(new ENotificationImpl(this, Notification.SET, UmmPackage.BDT_PROPERTY__DICTIONARY, oldDictionary, dictionary));
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
      eNotify(new ENotificationImpl(this, Notification.SET, UmmPackage.BDT_PROPERTY__UNIQUE_IDENTIFIER, oldUniqueIdentifier, uniqueIdentifier));
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
      eNotify(new ENotificationImpl(this, Notification.SET, UmmPackage.BDT_PROPERTY__VERSION_IDENTIFIER, oldVersionIdentifier, versionIdentifier));
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
      case UmmPackage.BDT_PROPERTY__TYPE:
        if (resolve) return getType();
        return basicGetType();
      case UmmPackage.BDT_PROPERTY__PATTERN:
        return getPattern();
      case UmmPackage.BDT_PROPERTY__MIN_LENGTH:
        return getMinLength();
      case UmmPackage.BDT_PROPERTY__MAX_LENGTH:
        return getMaxLength();
      case UmmPackage.BDT_PROPERTY__LENGTH:
        return getLength();
      case UmmPackage.BDT_PROPERTY__BUSINESS_TERM:
        return getBusinessTerm();
      case UmmPackage.BDT_PROPERTY__DEFINITION:
        return getDefinition();
      case UmmPackage.BDT_PROPERTY__DICTIONARY:
        return getDictionary();
      case UmmPackage.BDT_PROPERTY__UNIQUE_IDENTIFIER:
        return getUniqueIdentifier();
      case UmmPackage.BDT_PROPERTY__VERSION_IDENTIFIER:
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
      case UmmPackage.BDT_PROPERTY__TYPE:
        setType((AssembledBase)newValue);
        return;
      case UmmPackage.BDT_PROPERTY__PATTERN:
        setPattern((String)newValue);
        return;
      case UmmPackage.BDT_PROPERTY__MIN_LENGTH:
        setMinLength((Integer)newValue);
        return;
      case UmmPackage.BDT_PROPERTY__MAX_LENGTH:
        setMaxLength((Integer)newValue);
        return;
      case UmmPackage.BDT_PROPERTY__LENGTH:
        setLength((Integer)newValue);
        return;
      case UmmPackage.BDT_PROPERTY__BUSINESS_TERM:
        getBusinessTerm().clear();
        getBusinessTerm().addAll((Collection<? extends String>)newValue);
        return;
      case UmmPackage.BDT_PROPERTY__DEFINITION:
        setDefinition((String)newValue);
        return;
      case UmmPackage.BDT_PROPERTY__DICTIONARY:
        setDictionary((String)newValue);
        return;
      case UmmPackage.BDT_PROPERTY__UNIQUE_IDENTIFIER:
        setUniqueIdentifier((String)newValue);
        return;
      case UmmPackage.BDT_PROPERTY__VERSION_IDENTIFIER:
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
      case UmmPackage.BDT_PROPERTY__TYPE:
        setType((AssembledBase)null);
        return;
      case UmmPackage.BDT_PROPERTY__PATTERN:
        setPattern(PATTERN_EDEFAULT);
        return;
      case UmmPackage.BDT_PROPERTY__MIN_LENGTH:
        setMinLength(MIN_LENGTH_EDEFAULT);
        return;
      case UmmPackage.BDT_PROPERTY__MAX_LENGTH:
        setMaxLength(MAX_LENGTH_EDEFAULT);
        return;
      case UmmPackage.BDT_PROPERTY__LENGTH:
        setLength(LENGTH_EDEFAULT);
        return;
      case UmmPackage.BDT_PROPERTY__BUSINESS_TERM:
        getBusinessTerm().clear();
        return;
      case UmmPackage.BDT_PROPERTY__DEFINITION:
        setDefinition(DEFINITION_EDEFAULT);
        return;
      case UmmPackage.BDT_PROPERTY__DICTIONARY:
        setDictionary(DICTIONARY_EDEFAULT);
        return;
      case UmmPackage.BDT_PROPERTY__UNIQUE_IDENTIFIER:
        setUniqueIdentifier(UNIQUE_IDENTIFIER_EDEFAULT);
        return;
      case UmmPackage.BDT_PROPERTY__VERSION_IDENTIFIER:
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
      case UmmPackage.BDT_PROPERTY__TYPE:
        return type != null;
      case UmmPackage.BDT_PROPERTY__PATTERN:
        return PATTERN_EDEFAULT == null ? pattern != null : !PATTERN_EDEFAULT.equals(pattern);
      case UmmPackage.BDT_PROPERTY__MIN_LENGTH:
        return minLength != MIN_LENGTH_EDEFAULT;
      case UmmPackage.BDT_PROPERTY__MAX_LENGTH:
        return maxLength != MAX_LENGTH_EDEFAULT;
      case UmmPackage.BDT_PROPERTY__LENGTH:
        return length != LENGTH_EDEFAULT;
      case UmmPackage.BDT_PROPERTY__BUSINESS_TERM:
        return businessTerm != null && !businessTerm.isEmpty();
      case UmmPackage.BDT_PROPERTY__DEFINITION:
        return DEFINITION_EDEFAULT == null ? definition != null : !DEFINITION_EDEFAULT.equals(definition);
      case UmmPackage.BDT_PROPERTY__DICTIONARY:
        return DICTIONARY_EDEFAULT == null ? dictionary != null : !DICTIONARY_EDEFAULT.equals(dictionary);
      case UmmPackage.BDT_PROPERTY__UNIQUE_IDENTIFIER:
        return UNIQUE_IDENTIFIER_EDEFAULT == null ? uniqueIdentifier != null : !UNIQUE_IDENTIFIER_EDEFAULT.equals(uniqueIdentifier);
      case UmmPackage.BDT_PROPERTY__VERSION_IDENTIFIER:
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
    result.append(" (pattern: ");
    result.append(pattern);
    result.append(", minLength: ");
    result.append(minLength);
    result.append(", maxLength: ");
    result.append(maxLength);
    result.append(", length: ");
    result.append(length);
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
    result.append(')');
    return result.toString();
  }

} //BDTPropertyImpl
