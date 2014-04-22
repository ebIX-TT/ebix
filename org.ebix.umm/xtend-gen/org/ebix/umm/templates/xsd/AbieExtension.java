package org.ebix.umm.templates.xsd;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.ebix.umm.templates.Rules;
import org.ebix.umm.umm.ABIE;
import org.ebix.umm.umm.ABIEProperty;
import org.ebix.umm.umm.ASBIE;
import org.ebix.umm.umm.BBIE;
import org.ebix.umm.umm.BIELibrary;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class AbieExtension {
  @Inject
  @Extension
  private Rules rules;
  
  public String xsdName(final ABIE abie) {
    String _name = abie.getName();
    return this.rules.typeNameRule(_name);
  }
  
  public String xsdType(final ABIE abie) {
    return this.xsdName(abie);
  }
  
  public BIELibrary library(final ABIE abie) {
    EObject _eContainer = abie.eContainer();
    return ((BIELibrary) _eContainer);
  }
  
  public List<ASBIE> allReferingRoles(final ABIE abie) {
    ArrayList<ASBIE> _arrayList = new ArrayList<ASBIE>();
    List<ASBIE> referingRoles = _arrayList;
    BIELibrary _library = this.library(abie);
    EList<ABIE> _abies = _library.getAbies();
    for (final ABIE abie2 : _abies) {
      EList<ABIEProperty> _properties = abie2.getProperties();
      Iterable<ASBIE> _filter = Iterables.<ASBIE>filter(_properties, ASBIE.class);
      for (final ASBIE asbie : _filter) {
        ABIE _type = asbie.getType();
        boolean _equals = Objects.equal(_type, abie);
        if (_equals) {
          referingRoles.add(asbie);
        }
      }
    }
    return referingRoles;
  }
  
  public List<ASBIE> allReferingRolesUniqueByName(final ABIE abie) {
    HashSet<String> _hashSet = new HashSet<String>();
    Set<String> roleNames = _hashSet;
    ArrayList<ASBIE> _arrayList = new ArrayList<ASBIE>();
    List<ASBIE> referingRolesUniqueByName = _arrayList;
    List<ASBIE> referingRoles = this.allReferingRoles(abie);
    for (final ASBIE asbie : referingRoles) {
      String _name = asbie.getName();
      roleNames.add(_name);
    }
    for (final String name : roleNames) {
      {
        boolean found = false;
        for (final ASBIE role : referingRoles) {
          boolean _and = false;
          boolean _not = (!found);
          if (!_not) {
            _and = false;
          } else {
            String _name_1 = role.getName();
            boolean _equals = name.equals(_name_1);
            _and = (_not && _equals);
          }
          if (_and) {
            referingRolesUniqueByName.add(role);
            found = true;
          }
        }
      }
    }
    return referingRolesUniqueByName;
  }
  
  public ABIE abie(final ABIEProperty property) {
    EObject _eContainer = property.eContainer();
    return ((ABIE) _eContainer);
  }
  
  public boolean isPartOfChoice(final ABIEProperty property) {
    ABIE _abie = this.abie(property);
    EList<ABIEProperty> _properties = _abie.getProperties();
    for (final ABIEProperty p : _properties) {
      EList<ABIEProperty> _or = p.getOr();
      boolean _contains = _or.contains(property);
      if (_contains) {
        return true;
      }
    }
    return false;
  }
  
  public String xsdName(final BBIE bbie) {
    String _name = bbie.getName();
    return this.rules.typeNameRule(_name);
  }
  
  public boolean hasFixedValue(final BBIE bbie) {
    boolean _and = false;
    String _fixedValue = bbie.getFixedValue();
    boolean _notEquals = (!Objects.equal(_fixedValue, null));
    if (!_notEquals) {
      _and = false;
    } else {
      String _fixedValue_1 = bbie.getFixedValue();
      int _length = _fixedValue_1.length();
      boolean _greaterThan = (_length > 0);
      _and = (_notEquals && _greaterThan);
    }
    return _and;
  }
  
  public String xsdName(final ASBIE asbie) {
    String _name = asbie.getName();
    return this.rules.typeNameRule(_name);
  }
  
  public String xsdRoleName(final ASBIE asbie) {
    String _name = asbie.getName();
    String _typeNameRule = this.rules.typeNameRule(_name);
    ABIE _type = asbie.getType();
    String _name_1 = _type.getName();
    String _typeNameRule_1 = this.rules.typeNameRule(_name_1);
    return (_typeNameRule + _typeNameRule_1);
  }
}
