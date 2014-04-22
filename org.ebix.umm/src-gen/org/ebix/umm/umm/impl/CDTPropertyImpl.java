/**
 */
package org.ebix.umm.umm.impl;

import java.util.Collection;

import org.ebix.umm.umm.CDTProperty;
import org.ebix.umm.umm.MultiplicityKind;
import org.ebix.umm.umm.Primitive;
import org.ebix.umm.umm.UmmPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CDT Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ebix.umm.umm.impl.CDTPropertyImpl#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link org.ebix.umm.umm.impl.CDTPropertyImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.ebix.umm.umm.impl.CDTPropertyImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.ebix.umm.umm.impl.CDTPropertyImpl#getBusinessTerm <em>Business Term</em>}</li>
 *   <li>{@link org.ebix.umm.umm.impl.CDTPropertyImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.ebix.umm.umm.impl.CDTPropertyImpl#getDictionary <em>Dictionary</em>}</li>
 *   <li>{@link org.ebix.umm.umm.impl.CDTPropertyImpl#getUniqueIdentifier <em>Unique Identifier</em>}</li>
 *   <li>{@link org.ebix.umm.umm.impl.CDTPropertyImpl#getVersionIdentifier <em>Version Identifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CDTPropertyImpl extends MinimalEObjectImpl.Container implements CDTProperty
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
   * The cached value of the '{@link #getType() <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected Primitive type;

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
  protected CDTPropertyImpl()
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
    return UmmPackage.Literals.CDT_PROPERTY;
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
      eNotify(new ENotificationImpl(this, Notification.SET, UmmPackage.CDT_PROPERTY__MULTIPLICITY, oldMultiplicity, multiplicity));
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
      eNotify(new ENotificationImpl(this, Notification.SET, UmmPackage.CDT_PROPERTY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Primitive getType()
  {
    if (type != null && type.eIsProxy())
    {
      InternalEObject oldType = (InternalEObject)type;
      type = (Primitive)eResolveProxy(oldType);
      if (type != oldType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmmPackage.CDT_PROPERTY__TYPE, oldType, type));
      }
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Primitive basicGetType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(Primitive newType)
  {
    Primitive oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UmmPackage.CDT_PROPERTY__TYPE, oldType, type));
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
      businessTerm = new EDataTypeEList<String>(String.class, this, UmmPackage.CDT_PROPERTY__BUSINESS_TERM);
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
      eNotify(new ENotificationImpl(this, Notification.SET, UmmPackage.CDT_PROPERTY__DEFINITION, oldDefinition, definition));
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
      eNotify(new ENotificationImpl(this, Notification.SET, UmmPackage.CDT_PROPERTY__DICTIONARY, oldDictionary, dictionary));
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
      eNotify(new ENotificationImpl(this, Notification.SET, UmmPackage.CDT_PROPERTY__UNIQUE_IDENTIFIER, oldUniqueIdentifier, uniqueIdentifier));
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
      eNotify(new ENotificationImpl(this, Notification.SET, UmmPackage.CDT_PROPERTY__VERSION_IDENTIFIER, oldVersionIdentifier, versionIdentifier));
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
      case UmmPackage.CDT_PROPERTY__MULTIPLICITY:
        return getMultiplicity();
      case UmmPackage.CDT_PROPERTY__NAME:
        return getName();
      case UmmPackage.CDT_PROPERTY__TYPE:
        if (resolve) return getType();
        return basicGetType();
      case UmmPackage.CDT_PROPERTY__BUSINESS_TERM:
        return getBusinessTerm();
      case UmmPackage.CDT_PROPERTY__DEFINITION:
        return getDefinition();
      case UmmPackage.CDT_PROPERTY__DICTIONARY:
        return getDictionary();
      case UmmPackage.CDT_PROPERTY__UNIQUE_IDENTIFIER:
        return getUniqueIdentifier();
      case UmmPackage.CDT_PROPERTY__VERSION_IDENTIFIER:
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
      case UmmPackage.CDT_PROPERTY__MULTIPLICITY:
        setMultiplicity((MultiplicityKind)newValue);
        return;
      case UmmPackage.CDT_PROPERTY__NAME:
        setName((String)newValue);
        return;
      case UmmPackage.CDT_PROPERTY__TYPE:
        setType((Primitive)newValue);
        return;
      case UmmPackage.CDT_PROPERTY__BUSINESS_TERM:
        getBusinessTerm().clear();
        getBusinessTerm().addAll((Collection<? extends String>)newValue);
        return;
      case UmmPackage.CDT_PROPERTY__DEFINITION:
        setDefinition((String)newValue);
        return;
      case UmmPackage.CDT_PROPERTY__DICTIONARY:
        setDictionary((String)newValue);
        return;
      case UmmPackage.CDT_PROPERTY__UNIQUE_IDENTIFIER:
        setUniqueIdentifier((String)newValue);
        return;
      case UmmPackage.CDT_PROPERTY__VERSION_IDENTIFIER:
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
      case UmmPackage.CDT_PROPERTY__MULTIPLICITY:
        setMultiplicity(MULTIPLICITY_EDEFAULT);
        return;
      case UmmPackage.CDT_PROPERTY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case UmmPackage.CDT_PROPERTY__TYPE:
        setType((Primitive)null);
        return;
      case UmmPackage.CDT_PROPERTY__BUSINESS_TERM:
        getBusinessTerm().clear();
        return;
      case UmmPackage.CDT_PROPERTY__DEFINITION:
        setDefinition(DEFINITION_EDEFAULT);
        return;
      case UmmPackage.CDT_PROPERTY__DICTIONARY:
        setDictionary(DICTIONARY_EDEFAULT);
        return;
      case UmmPackage.CDT_PROPERTY__UNIQUE_IDENTIFIER:
        setUniqueIdentifier(UNIQUE_IDENTIFIER_EDEFAULT);
        return;
      case UmmPackage.CDT_PROPERTY__VERSION_IDENTIFIER:
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
      case UmmPackage.CDT_PROPERTY__MULTIPLICITY:
        return multiplicity != MULTIPLICITY_EDEFAULT;
      case UmmPackage.CDT_PROPERTY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case UmmPackage.CDT_PROPERTY__TYPE:
        return type != null;
      case UmmPackage.CDT_PROPERTY__BUSINESS_TERM:
        return businessTerm != null && !businessTerm.isEmpty();
      case UmmPackage.CDT_PROPERTY__DEFINITION:
        return DEFINITION_EDEFAULT == null ? definition != null : !DEFINITION_EDEFAULT.equals(definition);
      case UmmPackage.CDT_PROPERTY__DICTIONARY:
        return DICTIONARY_EDEFAULT == null ? dictionary != null : !DICTIONARY_EDEFAULT.equals(dictionary);
      case UmmPackage.CDT_PROPERTY__UNIQUE_IDENTIFIER:
        return UNIQUE_IDENTIFIER_EDEFAULT == null ? uniqueIdentifier != null : !UNIQUE_IDENTIFIER_EDEFAULT.equals(uniqueIdentifier);
      case UmmPackage.CDT_PROPERTY__VERSION_IDENTIFIER:
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
    result.append(')');
    return result.toString();
  }

} //CDTPropertyImpl
