/**
 */
package org.ebix.umm.umm.impl;

import java.util.Collection;

import org.ebix.umm.umm.ABIE;
import org.ebix.umm.umm.BDTLibrary;
import org.ebix.umm.umm.BIELibrary;
import org.ebix.umm.umm.UmmPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BIE Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ebix.umm.umm.impl.BIELibraryImpl#getBusinessTerm <em>Business Term</em>}</li>
 *   <li>{@link org.ebix.umm.umm.impl.BIELibraryImpl#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.ebix.umm.umm.impl.BIELibraryImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.ebix.umm.umm.impl.BIELibraryImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link org.ebix.umm.umm.impl.BIELibraryImpl#getUniqueIdentifier <em>Unique Identifier</em>}</li>
 *   <li>{@link org.ebix.umm.umm.impl.BIELibraryImpl#getVersionIdentifier <em>Version Identifier</em>}</li>
 *   <li>{@link org.ebix.umm.umm.impl.BIELibraryImpl#getBaseURN <em>Base URN</em>}</li>
 *   <li>{@link org.ebix.umm.umm.impl.BIELibraryImpl#getNamespacePrefix <em>Namespace Prefix</em>}</li>
 *   <li>{@link org.ebix.umm.umm.impl.BIELibraryImpl#getBdtLibrary <em>Bdt Library</em>}</li>
 *   <li>{@link org.ebix.umm.umm.impl.BIELibraryImpl#getAbies <em>Abies</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BIELibraryImpl extends LibraryImpl implements BIELibrary
{
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
   * The cached value of the '{@link #getCopyright() <em>Copyright</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCopyright()
   * @generated
   * @ordered
   */
  protected EList<String> copyright;

  /**
   * The cached value of the '{@link #getOwner() <em>Owner</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwner()
   * @generated
   * @ordered
   */
  protected EList<String> owner;

  /**
   * The cached value of the '{@link #getReference() <em>Reference</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReference()
   * @generated
   * @ordered
   */
  protected EList<String> reference;

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
   * The default value of the '{@link #getBaseURN() <em>Base URN</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBaseURN()
   * @generated
   * @ordered
   */
  protected static final String BASE_URN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBaseURN() <em>Base URN</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBaseURN()
   * @generated
   * @ordered
   */
  protected String baseURN = BASE_URN_EDEFAULT;

  /**
   * The default value of the '{@link #getNamespacePrefix() <em>Namespace Prefix</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNamespacePrefix()
   * @generated
   * @ordered
   */
  protected static final String NAMESPACE_PREFIX_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNamespacePrefix() <em>Namespace Prefix</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNamespacePrefix()
   * @generated
   * @ordered
   */
  protected String namespacePrefix = NAMESPACE_PREFIX_EDEFAULT;

  /**
   * The cached value of the '{@link #getBdtLibrary() <em>Bdt Library</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBdtLibrary()
   * @generated
   * @ordered
   */
  protected BDTLibrary bdtLibrary;

  /**
   * The cached value of the '{@link #getAbies() <em>Abies</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAbies()
   * @generated
   * @ordered
   */
  protected EList<ABIE> abies;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BIELibraryImpl()
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
    return UmmPackage.Literals.BIE_LIBRARY;
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
      businessTerm = new EDataTypeEList<String>(String.class, this, UmmPackage.BIE_LIBRARY__BUSINESS_TERM);
    }
    return businessTerm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getCopyright()
  {
    if (copyright == null)
    {
      copyright = new EDataTypeEList<String>(String.class, this, UmmPackage.BIE_LIBRARY__COPYRIGHT);
    }
    return copyright;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getOwner()
  {
    if (owner == null)
    {
      owner = new EDataTypeEList<String>(String.class, this, UmmPackage.BIE_LIBRARY__OWNER);
    }
    return owner;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getReference()
  {
    if (reference == null)
    {
      reference = new EDataTypeEList<String>(String.class, this, UmmPackage.BIE_LIBRARY__REFERENCE);
    }
    return reference;
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
      eNotify(new ENotificationImpl(this, Notification.SET, UmmPackage.BIE_LIBRARY__UNIQUE_IDENTIFIER, oldUniqueIdentifier, uniqueIdentifier));
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
      eNotify(new ENotificationImpl(this, Notification.SET, UmmPackage.BIE_LIBRARY__VERSION_IDENTIFIER, oldVersionIdentifier, versionIdentifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBaseURN()
  {
    return baseURN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBaseURN(String newBaseURN)
  {
    String oldBaseURN = baseURN;
    baseURN = newBaseURN;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UmmPackage.BIE_LIBRARY__BASE_URN, oldBaseURN, baseURN));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNamespacePrefix()
  {
    return namespacePrefix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNamespacePrefix(String newNamespacePrefix)
  {
    String oldNamespacePrefix = namespacePrefix;
    namespacePrefix = newNamespacePrefix;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UmmPackage.BIE_LIBRARY__NAMESPACE_PREFIX, oldNamespacePrefix, namespacePrefix));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BDTLibrary getBdtLibrary()
  {
    if (bdtLibrary != null && bdtLibrary.eIsProxy())
    {
      InternalEObject oldBdtLibrary = (InternalEObject)bdtLibrary;
      bdtLibrary = (BDTLibrary)eResolveProxy(oldBdtLibrary);
      if (bdtLibrary != oldBdtLibrary)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmmPackage.BIE_LIBRARY__BDT_LIBRARY, oldBdtLibrary, bdtLibrary));
      }
    }
    return bdtLibrary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BDTLibrary basicGetBdtLibrary()
  {
    return bdtLibrary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBdtLibrary(BDTLibrary newBdtLibrary)
  {
    BDTLibrary oldBdtLibrary = bdtLibrary;
    bdtLibrary = newBdtLibrary;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UmmPackage.BIE_LIBRARY__BDT_LIBRARY, oldBdtLibrary, bdtLibrary));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ABIE> getAbies()
  {
    if (abies == null)
    {
      abies = new EObjectContainmentEList<ABIE>(ABIE.class, this, UmmPackage.BIE_LIBRARY__ABIES);
    }
    return abies;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case UmmPackage.BIE_LIBRARY__ABIES:
        return ((InternalEList<?>)getAbies()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case UmmPackage.BIE_LIBRARY__BUSINESS_TERM:
        return getBusinessTerm();
      case UmmPackage.BIE_LIBRARY__COPYRIGHT:
        return getCopyright();
      case UmmPackage.BIE_LIBRARY__OWNER:
        return getOwner();
      case UmmPackage.BIE_LIBRARY__REFERENCE:
        return getReference();
      case UmmPackage.BIE_LIBRARY__UNIQUE_IDENTIFIER:
        return getUniqueIdentifier();
      case UmmPackage.BIE_LIBRARY__VERSION_IDENTIFIER:
        return getVersionIdentifier();
      case UmmPackage.BIE_LIBRARY__BASE_URN:
        return getBaseURN();
      case UmmPackage.BIE_LIBRARY__NAMESPACE_PREFIX:
        return getNamespacePrefix();
      case UmmPackage.BIE_LIBRARY__BDT_LIBRARY:
        if (resolve) return getBdtLibrary();
        return basicGetBdtLibrary();
      case UmmPackage.BIE_LIBRARY__ABIES:
        return getAbies();
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
      case UmmPackage.BIE_LIBRARY__BUSINESS_TERM:
        getBusinessTerm().clear();
        getBusinessTerm().addAll((Collection<? extends String>)newValue);
        return;
      case UmmPackage.BIE_LIBRARY__COPYRIGHT:
        getCopyright().clear();
        getCopyright().addAll((Collection<? extends String>)newValue);
        return;
      case UmmPackage.BIE_LIBRARY__OWNER:
        getOwner().clear();
        getOwner().addAll((Collection<? extends String>)newValue);
        return;
      case UmmPackage.BIE_LIBRARY__REFERENCE:
        getReference().clear();
        getReference().addAll((Collection<? extends String>)newValue);
        return;
      case UmmPackage.BIE_LIBRARY__UNIQUE_IDENTIFIER:
        setUniqueIdentifier((String)newValue);
        return;
      case UmmPackage.BIE_LIBRARY__VERSION_IDENTIFIER:
        setVersionIdentifier((String)newValue);
        return;
      case UmmPackage.BIE_LIBRARY__BASE_URN:
        setBaseURN((String)newValue);
        return;
      case UmmPackage.BIE_LIBRARY__NAMESPACE_PREFIX:
        setNamespacePrefix((String)newValue);
        return;
      case UmmPackage.BIE_LIBRARY__BDT_LIBRARY:
        setBdtLibrary((BDTLibrary)newValue);
        return;
      case UmmPackage.BIE_LIBRARY__ABIES:
        getAbies().clear();
        getAbies().addAll((Collection<? extends ABIE>)newValue);
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
      case UmmPackage.BIE_LIBRARY__BUSINESS_TERM:
        getBusinessTerm().clear();
        return;
      case UmmPackage.BIE_LIBRARY__COPYRIGHT:
        getCopyright().clear();
        return;
      case UmmPackage.BIE_LIBRARY__OWNER:
        getOwner().clear();
        return;
      case UmmPackage.BIE_LIBRARY__REFERENCE:
        getReference().clear();
        return;
      case UmmPackage.BIE_LIBRARY__UNIQUE_IDENTIFIER:
        setUniqueIdentifier(UNIQUE_IDENTIFIER_EDEFAULT);
        return;
      case UmmPackage.BIE_LIBRARY__VERSION_IDENTIFIER:
        setVersionIdentifier(VERSION_IDENTIFIER_EDEFAULT);
        return;
      case UmmPackage.BIE_LIBRARY__BASE_URN:
        setBaseURN(BASE_URN_EDEFAULT);
        return;
      case UmmPackage.BIE_LIBRARY__NAMESPACE_PREFIX:
        setNamespacePrefix(NAMESPACE_PREFIX_EDEFAULT);
        return;
      case UmmPackage.BIE_LIBRARY__BDT_LIBRARY:
        setBdtLibrary((BDTLibrary)null);
        return;
      case UmmPackage.BIE_LIBRARY__ABIES:
        getAbies().clear();
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
      case UmmPackage.BIE_LIBRARY__BUSINESS_TERM:
        return businessTerm != null && !businessTerm.isEmpty();
      case UmmPackage.BIE_LIBRARY__COPYRIGHT:
        return copyright != null && !copyright.isEmpty();
      case UmmPackage.BIE_LIBRARY__OWNER:
        return owner != null && !owner.isEmpty();
      case UmmPackage.BIE_LIBRARY__REFERENCE:
        return reference != null && !reference.isEmpty();
      case UmmPackage.BIE_LIBRARY__UNIQUE_IDENTIFIER:
        return UNIQUE_IDENTIFIER_EDEFAULT == null ? uniqueIdentifier != null : !UNIQUE_IDENTIFIER_EDEFAULT.equals(uniqueIdentifier);
      case UmmPackage.BIE_LIBRARY__VERSION_IDENTIFIER:
        return VERSION_IDENTIFIER_EDEFAULT == null ? versionIdentifier != null : !VERSION_IDENTIFIER_EDEFAULT.equals(versionIdentifier);
      case UmmPackage.BIE_LIBRARY__BASE_URN:
        return BASE_URN_EDEFAULT == null ? baseURN != null : !BASE_URN_EDEFAULT.equals(baseURN);
      case UmmPackage.BIE_LIBRARY__NAMESPACE_PREFIX:
        return NAMESPACE_PREFIX_EDEFAULT == null ? namespacePrefix != null : !NAMESPACE_PREFIX_EDEFAULT.equals(namespacePrefix);
      case UmmPackage.BIE_LIBRARY__BDT_LIBRARY:
        return bdtLibrary != null;
      case UmmPackage.BIE_LIBRARY__ABIES:
        return abies != null && !abies.isEmpty();
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
    result.append(" (businessTerm: ");
    result.append(businessTerm);
    result.append(", copyright: ");
    result.append(copyright);
    result.append(", owner: ");
    result.append(owner);
    result.append(", reference: ");
    result.append(reference);
    result.append(", uniqueIdentifier: ");
    result.append(uniqueIdentifier);
    result.append(", versionIdentifier: ");
    result.append(versionIdentifier);
    result.append(", baseURN: ");
    result.append(baseURN);
    result.append(", namespacePrefix: ");
    result.append(namespacePrefix);
    result.append(')');
    return result.toString();
  }

} //BIELibraryImpl
