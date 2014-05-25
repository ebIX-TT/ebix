/**
 * UMM Schema Generator
 *  Copyright (C) 2014  ebIX, the European forum for energy Business Information eXchange.
 * 
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 * 
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 * 
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.ebix.umm.templates.xsd;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import org.ebix.umm.templates.Rules;
import org.ebix.umm.templates.xsd.EnumExtension;
import org.ebix.umm.templates.xsd.PrimitiveExtension;
import org.ebix.umm.umm.Assembled;
import org.ebix.umm.umm.AssembledBase;
import org.ebix.umm.umm.BDT;
import org.ebix.umm.umm.BDTProperty;
import org.ebix.umm.umm.Content;
import org.ebix.umm.umm.Primitive;
import org.ebix.umm.umm.Supplement;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class BdtExtension {
  @Inject
  @Extension
  private Rules rules;
  
  @Inject
  @Extension
  private EnumExtension enumExtension;
  
  @Inject
  @Extension
  private PrimitiveExtension primitiveExtension;
  
  public String xsdName(final BDT bdt) {
    String _name = bdt.getName();
    return this.rules.typeNameRule(_name);
  }
  
  public String xsdType(final BDT bdt) {
    String _xsdName = this.xsdName(bdt);
    String _plus = (_xsdName + "_");
    String _uniqueIdentifier = bdt.getUniqueIdentifier();
    return (_plus + _uniqueIdentifier);
  }
  
  public String conQualifiedType(final BDT bdt) {
    Content _content = this.content(bdt);
    return this.xsdQualifiedType(_content);
  }
  
  public boolean isSimpleType(final BDT bdt) {
    EList<BDTProperty> _properties = bdt.getProperties();
    Iterable<Supplement> _filter = Iterables.<Supplement>filter(_properties, Supplement.class);
    int _size = IterableExtensions.size(_filter);
    return (_size == 0);
  }
  
  public Content content(final BDT bdt) {
    EList<BDTProperty> _properties = bdt.getProperties();
    Iterable<Content> _filter = Iterables.<Content>filter(_properties, Content.class);
    return IterableExtensions.<Content>head(_filter);
  }
  
  public String xsdQualifiedType(final BDTProperty property) {
    AssembledBase _type = property.getType();
    if ((_type instanceof Assembled)) {
      AssembledBase _type_1 = property.getType();
      String _xsdType = this.enumExtension.xsdType(((Assembled) _type_1));
      return ("bdt:" + _xsdType);
    } else {
      AssembledBase _type_2 = property.getType();
      return this.primitiveExtension.xsdQualifiedType(((Primitive) _type_2));
    }
  }
  
  public boolean isExtraRestricted(final BDTProperty property) {
    boolean _and = false;
    AssembledBase _type = property.getType();
    if (!(_type instanceof Primitive)) {
      _and = false;
    } else {
      boolean _or = false;
      boolean _or_1 = false;
      boolean _or_2 = false;
      boolean _hasPattern = this.hasPattern(property);
      if (_hasPattern) {
        _or_2 = true;
      } else {
        int _length = property.getLength();
        boolean _notEquals = (_length != 0);
        _or_2 = _notEquals;
      }
      if (_or_2) {
        _or_1 = true;
      } else {
        int _minLength = property.getMinLength();
        boolean _notEquals_1 = (_minLength != 0);
        _or_1 = _notEquals_1;
      }
      if (_or_1) {
        _or = true;
      } else {
        int _maxLength = property.getMaxLength();
        boolean _notEquals_2 = (_maxLength != 0);
        _or = _notEquals_2;
      }
      _and = _or;
    }
    return _and;
  }
  
  public boolean hasPattern(final BDTProperty property) {
    boolean _and = false;
    String _pattern = property.getPattern();
    boolean _notEquals = (!Objects.equal(_pattern, null));
    if (!_notEquals) {
      _and = false;
    } else {
      String _pattern_1 = property.getPattern();
      int _length = _pattern_1.length();
      boolean _notEquals_1 = (_length != 0);
      _and = _notEquals_1;
    }
    return _and;
  }
  
  public boolean hasDefaultValue(final Supplement sup) {
    boolean _and = false;
    String _defaultValue = sup.getDefaultValue();
    boolean _notEquals = (!Objects.equal(_defaultValue, null));
    if (!_notEquals) {
      _and = false;
    } else {
      String _defaultValue_1 = sup.getDefaultValue();
      int _length = _defaultValue_1.length();
      boolean _greaterThan = (_length > 0);
      _and = _greaterThan;
    }
    return _and;
  }
  
  public boolean hasFixedValue(final Supplement sup) {
    boolean _and = false;
    String _fixedValue = sup.getFixedValue();
    boolean _notEquals = (!Objects.equal(_fixedValue, null));
    if (!_notEquals) {
      _and = false;
    } else {
      String _fixedValue_1 = sup.getFixedValue();
      int _length = _fixedValue_1.length();
      boolean _greaterThan = (_length > 0);
      _and = _greaterThan;
    }
    return _and;
  }
}
