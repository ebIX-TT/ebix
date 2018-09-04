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
    boolean _equals = Objects.equal(bdt, null);
    if (_equals) {
      return "undefined";
    }
    String _name = bdt.getName();
    return this.rules.typeNameRule(_name);
  }
  
  public String xsdType(final BDT bdt) {
    boolean _equals = Objects.equal(bdt, null);
    if (_equals) {
      return "undefined";
    }
    String _xsdName = this.xsdName(bdt);
    boolean _containsString = this.containsString(_xsdName, "DateTimeType");
    if (_containsString) {
      return "xsd:datetime";
    } else {
      String _xsdName_1 = this.xsdName(bdt);
      boolean _containsString_1 = this.containsString(_xsdName_1, "DateType");
      if (_containsString_1) {
        EList<BDTProperty> _properties = bdt.getProperties();
        BDTProperty _get = _properties.get(0);
        _get.setPattern("[0-9]{4}-[0-1][0-9]-[0-3][0-9]");
        return "xsd:date";
      } else {
        String _xsdName_2 = this.xsdName(bdt);
        boolean _containsString_2 = this.containsString(_xsdName_2, "TimeType");
        if (_containsString_2) {
          EList<BDTProperty> _properties_1 = bdt.getProperties();
          BDTProperty _get_1 = _properties_1.get(0);
          _get_1.setPattern("[0-2][0-9]:[0-5][0-9]:[0-5][0-9]");
          return "xsd:time";
        } else {
          String _xsdName_3 = this.xsdName(bdt);
          boolean _containsString_3 = this.containsString(_xsdName_3, "UTCOffsetDateTimeType");
          if (_containsString_3) {
            EList<BDTProperty> _properties_2 = bdt.getProperties();
            BDTProperty _get_2 = _properties_2.get(0);
            _get_2.setPattern("[0-9]{4}-[0-1][0-9]-[0-3][0-9]T[0-2][0-9]:[0-5][0-9]:[0-5][0-9].[0-9]*[\\+|-][0-2][0-9]:[0-6][0-9]");
            return "xsd:datetime";
          } else {
            String _xsdName_4 = this.xsdName(bdt);
            boolean _containsString_4 = this.containsString(_xsdName_4, "UTCDateTimeType");
            if (_containsString_4) {
              EList<BDTProperty> _properties_3 = bdt.getProperties();
              BDTProperty _get_3 = _properties_3.get(0);
              _get_3.setPattern("[0-9]{4}-[0-1][0-9]-[0-3][0-9]T[0-2][0-9]:[0-5][0-9]:[0-5][0-9].[0-9]*Z");
              return "xsd:datetime";
            } else {
              String _xsdName_5 = this.xsdName(bdt);
              boolean _containsString_5 = this.containsString(_xsdName_5, "DayDateType");
              if (_containsString_5) {
                EList<BDTProperty> _properties_4 = bdt.getProperties();
                BDTProperty _get_4 = _properties_4.get(0);
                _get_4.setPattern("---[0-3][0-9]");
                return "xsd:gDay";
              } else {
                String _xsdName_6 = this.xsdName(bdt);
                boolean _containsString_6 = this.containsString(_xsdName_6, "YearDateType");
                if (_containsString_6) {
                  EList<BDTProperty> _properties_5 = bdt.getProperties();
                  BDTProperty _get_5 = _properties_5.get(0);
                  _get_5.setPattern("[0-9]{4}");
                  return "xsd:gYear";
                } else {
                  String _xsdName_7 = this.xsdName(bdt);
                  boolean _containsString_7 = this.containsString(_xsdName_7, "MonthDateType");
                  if (_containsString_7) {
                    EList<BDTProperty> _properties_6 = bdt.getProperties();
                    BDTProperty _get_6 = _properties_6.get(0);
                    _get_6.setPattern("--[0-1][0-9]--");
                    return "xsd:gMonth";
                  } else {
                    String _xsdName_8 = this.xsdName(bdt);
                    boolean _containsString_8 = this.containsString(_xsdName_8, "MonthDayDateType");
                    if (_containsString_8) {
                      EList<BDTProperty> _properties_7 = bdt.getProperties();
                      BDTProperty _get_7 = _properties_7.get(0);
                      _get_7.setPattern("--[0-1][0-9]-[0-3][0-9]");
                      return "xsd:date";
                    } else {
                      String _xsdName_9 = this.xsdName(bdt);
                      String _plus = (_xsdName_9 + "_");
                      String _uniqueIdentifier = bdt.getUniqueIdentifier();
                      return (_plus + _uniqueIdentifier);
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  
  public boolean containsString(final String searchIn, final String searchFor) {
    String _lowerCase = searchIn.toLowerCase();
    String _lowerCase_1 = searchFor.toLowerCase();
    return _lowerCase.contains(_lowerCase_1);
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
    boolean _or = false;
    boolean _or_1 = false;
    boolean _equals = Objects.equal(bdt, null);
    if (_equals) {
      _or_1 = true;
    } else {
      EList<BDTProperty> _properties = bdt.getProperties();
      boolean _equals_1 = Objects.equal(_properties, null);
      _or_1 = _equals_1;
    }
    if (_or_1) {
      _or = true;
    } else {
      EList<BDTProperty> _properties_1 = bdt.getProperties();
      Iterable<Content> _filter = Iterables.<Content>filter(_properties_1, Content.class);
      boolean _equals_2 = Objects.equal(_filter, null);
      _or = _equals_2;
    }
    if (_or) {
      return null;
    }
    EList<BDTProperty> _properties_2 = bdt.getProperties();
    Iterable<Content> _filter_1 = Iterables.<Content>filter(_properties_2, Content.class);
    return IterableExtensions.<Content>head(_filter_1);
  }
  
  public String xsdQualifiedType(final BDTProperty property) {
    AssembledBase _type = property.getType();
    if ((_type instanceof Assembled)) {
      AssembledBase _type_1 = property.getType();
      String _xsdType = this.enumExtension.xsdType(((Assembled) _type_1));
      return ("bdt:" + _xsdType);
    } else {
      AssembledBase _type_2 = property.getType();
      String _name = _type_2.getName();
      boolean _equals = _name.equals("DateTimeType");
      if (_equals) {
        return "xsd:dateTime";
      } else {
        AssembledBase _type_3 = property.getType();
        String _name_1 = _type_3.getName();
        boolean _equals_1 = _name_1.equals("DateType");
        if (_equals_1) {
          return "xsd:date";
        } else {
          AssembledBase _type_4 = property.getType();
          String _name_2 = _type_4.getName();
          boolean _equals_2 = _name_2.equals("TimeType");
          if (_equals_2) {
            return "xsd:time";
          } else {
            AssembledBase _type_5 = property.getType();
            return this.primitiveExtension.xsdQualifiedType(((Primitive) _type_5));
          }
        }
      }
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
