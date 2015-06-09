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
import com.google.inject.Inject;
import java.util.Arrays;
import java.util.List;
import org.ebix.umm.templates.Constants;
import org.ebix.umm.templates.xsd.AbieExtension;
import org.ebix.umm.templates.xsd.BdtExtension;
import org.ebix.umm.templates.xsd.BdtLibraryExtension;
import org.ebix.umm.templates.xsd.BieLibraryExtension;
import org.ebix.umm.templates.xsd.MultiplicityKindExtension;
import org.ebix.umm.templates.xsd.Xml;
import org.ebix.umm.umm.ABIE;
import org.ebix.umm.umm.ABIEProperty;
import org.ebix.umm.umm.ASBIE;
import org.ebix.umm.umm.BBIE;
import org.ebix.umm.umm.BDT;
import org.ebix.umm.umm.BDTLibrary;
import org.ebix.umm.umm.BIELibrary;
import org.ebix.umm.umm.Content;
import org.ebix.umm.umm.MA;
import org.ebix.umm.umm.MultiplicityKind;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class BieLibrarySchema {
  @Inject
  @Extension
  private Xml xmlExtension;
  
  @Inject
  @Extension
  private AbieExtension abieExtension;
  
  @Inject
  @Extension
  private BdtExtension bdtExtension;
  
  @Inject
  @Extension
  private BdtLibraryExtension bdtLibraryExtension;
  
  @Inject
  @Extension
  private BieLibraryExtension bieLibraryExtension;
  
  @Inject
  @Extension
  private MultiplicityKindExtension multiplicityExtension;
  
  public CharSequence compile(final BIELibrary library, final Constants constants, final MA ma) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
    _builder.newLine();
    CharSequence _comment = this.xmlExtension.comment("Message Business Information Entities XML Schema Module");
    _builder.append(_comment, "");
    _builder.newLineIfNotEmpty();
    _builder.append("<!--");
    _builder.newLine();
    _builder.append("Schema agency:     ");
    _builder.append(constants.schemaAgency.value, "");
    _builder.newLineIfNotEmpty();
    _builder.append("Schema version:    ");
    String _versionIdentifier = library.getVersionIdentifier();
    _builder.append(_versionIdentifier, "");
    _builder.newLineIfNotEmpty();
    _builder.append("Schema date:       ");
    String _schemaDate = constants.schemaDate();
    _builder.append(_schemaDate, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append(constants.copyright.value, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append(constants.disclaimer.value, "");
    _builder.newLineIfNotEmpty();
    _builder.append("-->");
    _builder.newLine();
    _builder.append("<xsd:schema");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("xmlns:bie=\"");
    String _namespace = this.bieLibraryExtension.namespace(library, ma);
    _builder.append(_namespace, "    ");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("xmlns:ccts=\"urn:un:unece:uncefact:documentation:common:3:standard:CoreComponentsTechnicalSpecification:3\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("xmlns:xbt=\"urn:un:unece:uncefact:data:common:1:draft\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("targetNamespace=\"");
    String _namespace_1 = this.bieLibraryExtension.namespace(library, ma);
    _builder.append(_namespace_1, "    ");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("elementFormDefault=\"qualified\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("attributeFormDefault=\"unqualified\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("version=\"");
    String _versionIdentifier_1 = library.getVersionIdentifier();
    _builder.append(_versionIdentifier_1, "    ");
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _comment_1 = this.xmlExtension.comment("Imports");
    _builder.append(_comment_1, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _comment_2 = this.xmlExtension.comment("Inclusions");
    _builder.append(_comment_2, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _comment_3 = this.xmlExtension.comment("Inclusion of Message Data Types");
    _builder.append(_comment_3, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("<xsd:include schemaLocation=\"");
    BDTLibrary _bdtLibrary = library.getBdtLibrary();
    String _fileName = this.bdtLibraryExtension.fileName(_bdtLibrary, ma);
    _builder.append(_fileName, "    ");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _comment_4 = this.xmlExtension.comment("Message Business Information Entities Definitions");
    _builder.append(_comment_4, "    ");
    _builder.newLineIfNotEmpty();
    {
      EList<ABIE> _abies = library.getAbies();
      for(final ABIE abie : _abies) {
        _builder.append("    ");
        String _namespacePrefix = library.getNamespacePrefix();
        CharSequence _ABIEType = this.ABIEType(abie, _namespacePrefix);
        _builder.append(_ABIEType, "    ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</xsd:schema>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence ABIEType(final ABIE abie, final String prefix) {
    StringConcatenation _builder = new StringConcatenation();
    String _xsdName = this.abieExtension.xsdName(abie);
    String _plus = (_xsdName + " Type");
    CharSequence _comment = this.xmlExtension.comment(_plus);
    _builder.append(_comment, "");
    _builder.newLineIfNotEmpty();
    _builder.append("<xsd:complexType name=\"");
    String _xsdType = this.abieExtension.xsdType(abie);
    _builder.append(_xsdType, "");
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("<xsd:sequence>");
    _builder.newLine();
    {
      EList<ABIEProperty> _properties = abie.getProperties();
      for(final ABIEProperty property : _properties) {
        _builder.append("        ");
        CharSequence _Property = this.Property(property, prefix);
        _builder.append(_Property, "        ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("    ");
    _builder.append("</xsd:sequence>");
    _builder.newLine();
    _builder.append("</xsd:complexType>");
    _builder.newLine();
    {
      List<ASBIE> _allReferingRolesUniqueByName = this.abieExtension.allReferingRolesUniqueByName(abie);
      for(final ASBIE role : _allReferingRolesUniqueByName) {
        _builder.append("<xsd:element name=\"");
        String _xsdRoleName = this.abieExtension.xsdRoleName(role);
        _builder.append(_xsdRoleName, "");
        _builder.append("\" type=\"");
        _builder.append(prefix, "");
        _builder.append(":");
        String _xsdType_1 = this.abieExtension.xsdType(abie);
        _builder.append(_xsdType_1, "");
        _builder.append("\"/>");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence Property(final ABIEProperty property, final String prefix) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isPartOfChoice = this.abieExtension.isPartOfChoice(property);
      boolean _not = (!_isPartOfChoice);
      if (_not) {
        {
          EList<ABIEProperty> _or = property.getOr();
          boolean _isEmpty = _or.isEmpty();
          if (_isEmpty) {
            CharSequence _AProperty = this.AProperty(property, prefix);
            _builder.append(_AProperty, "");
            _builder.newLineIfNotEmpty();
          } else {
            _builder.append("<xsd:choice");
            {
              boolean _or_1 = false;
              MultiplicityKind _multiplicity = property.getMultiplicity();
              boolean _lowerBoundZero = this.multiplicityExtension.lowerBoundZero(_multiplicity);
              if (_lowerBoundZero) {
                _or_1 = true;
              } else {
                EList<ABIEProperty> _or_2 = property.getOr();
                final Function1<ABIEProperty, Boolean> _function = (ABIEProperty p) -> {
                  MultiplicityKind _multiplicity_1 = p.getMultiplicity();
                  return Boolean.valueOf(this.multiplicityExtension.lowerBoundZero(_multiplicity_1));
                };
                boolean _exists = IterableExtensions.<ABIEProperty>exists(_or_2, _function);
                _or_1 = _exists;
              }
              if (_or_1) {
                _builder.append(" minOccurs=\"0\"");
              }
            }
            _builder.append(">");
            _builder.newLineIfNotEmpty();
            _builder.append("    ");
            CharSequence _AProperty_1 = this.AProperty(property, prefix);
            _builder.append(_AProperty_1, "    ");
            _builder.newLineIfNotEmpty();
            {
              EList<ABIEProperty> _or_3 = property.getOr();
              for(final ABIEProperty orProperty : _or_3) {
                _builder.append("    ");
                CharSequence _AProperty_2 = this.AProperty(orProperty, prefix);
                _builder.append(_AProperty_2, "    ");
                _builder.newLineIfNotEmpty();
              }
            }
            _builder.append("</xsd:choice>");
            _builder.newLine();
          }
        }
      }
    }
    return _builder;
  }
  
  protected CharSequence _AProperty(final ASBIE property, final String prefix) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<xsd:element ref=\"");
    _builder.append(prefix, "");
    _builder.append(":");
    String _xsdRoleName = this.abieExtension.xsdRoleName(property);
    _builder.append(_xsdRoleName, "");
    _builder.append("\" minOccurs=\"");
    MultiplicityKind _multiplicity = property.getMultiplicity();
    String _minOccurs = this.multiplicityExtension.minOccurs(_multiplicity);
    _builder.append(_minOccurs, "");
    _builder.append("\" maxOccurs=\"");
    MultiplicityKind _multiplicity_1 = property.getMultiplicity();
    String _maxOccurs = this.multiplicityExtension.maxOccurs(_multiplicity_1);
    _builder.append(_maxOccurs, "");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _AProperty(final BBIE property, final String prefix) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _and = false;
      EList<String> _restriction = property.getRestriction();
      int _size = _restriction.size();
      boolean _equals = (_size == 0);
      if (!_equals) {
        _and = false;
      } else {
        boolean _or = false;
        BDT _type = property.getType();
        Content _content = this.bdtExtension.content(_type);
        boolean _equals_1 = Objects.equal(_content, null);
        if (_equals_1) {
          _or = true;
        } else {
          boolean _and_1 = false;
          boolean _and_2 = false;
          boolean _and_3 = false;
          boolean _and_4 = false;
          boolean _and_5 = false;
          boolean _and_6 = false;
          boolean _and_7 = false;
          boolean _and_8 = false;
          boolean _and_9 = false;
          BDT _type_1 = property.getType();
          Content _content_1 = this.bdtExtension.content(_type_1);
          boolean _hasPattern = this.bdtExtension.hasPattern(_content_1);
          boolean _not = (!_hasPattern);
          if (!_not) {
            _and_9 = false;
          } else {
            BDT _type_2 = property.getType();
            Content _content_2 = this.bdtExtension.content(_type_2);
            int _minLength = _content_2.getMinLength();
            boolean _equals_2 = (_minLength == 0);
            _and_9 = _equals_2;
          }
          if (!_and_9) {
            _and_8 = false;
          } else {
            BDT _type_3 = property.getType();
            Content _content_3 = this.bdtExtension.content(_type_3);
            int _maxLength = _content_3.getMaxLength();
            boolean _equals_3 = (_maxLength == 0);
            _and_8 = _equals_3;
          }
          if (!_and_8) {
            _and_7 = false;
          } else {
            BDT _type_4 = property.getType();
            Content _content_4 = this.bdtExtension.content(_type_4);
            int _length = _content_4.getLength();
            boolean _equals_4 = (_length == 0);
            _and_7 = _equals_4;
          }
          if (!_and_7) {
            _and_6 = false;
          } else {
            BDT _type_5 = property.getType();
            Content _content_5 = this.bdtExtension.content(_type_5);
            int _minExclusive = _content_5.getMinExclusive();
            boolean _equals_5 = (_minExclusive == 0);
            _and_6 = _equals_5;
          }
          if (!_and_6) {
            _and_5 = false;
          } else {
            BDT _type_6 = property.getType();
            Content _content_6 = this.bdtExtension.content(_type_6);
            int _minInclusive = _content_6.getMinInclusive();
            boolean _equals_6 = (_minInclusive == 0);
            _and_5 = _equals_6;
          }
          if (!_and_5) {
            _and_4 = false;
          } else {
            BDT _type_7 = property.getType();
            Content _content_7 = this.bdtExtension.content(_type_7);
            int _maxExclusive = _content_7.getMaxExclusive();
            boolean _equals_7 = (_maxExclusive == 0);
            _and_4 = _equals_7;
          }
          if (!_and_4) {
            _and_3 = false;
          } else {
            BDT _type_8 = property.getType();
            Content _content_8 = this.bdtExtension.content(_type_8);
            int _maxInclusive = _content_8.getMaxInclusive();
            boolean _equals_8 = (_maxInclusive == 0);
            _and_3 = _equals_8;
          }
          if (!_and_3) {
            _and_2 = false;
          } else {
            BDT _type_9 = property.getType();
            Content _content_9 = this.bdtExtension.content(_type_9);
            int _fractionalDigits = _content_9.getFractionalDigits();
            boolean _equals_9 = (_fractionalDigits == 0);
            _and_2 = _equals_9;
          }
          if (!_and_2) {
            _and_1 = false;
          } else {
            BDT _type_10 = property.getType();
            Content _content_10 = this.bdtExtension.content(_type_10);
            int _totalDigits = _content_10.getTotalDigits();
            boolean _equals_10 = (_totalDigits == 0);
            _and_1 = _equals_10;
          }
          _or = _and_1;
        }
        _and = _or;
      }
      if (_and) {
        _builder.append("<xsd:element name=\"");
        String _xsdName = this.abieExtension.xsdName(property);
        _builder.append(_xsdName, "");
        _builder.append("\" type=\"");
        _builder.append(prefix, "");
        _builder.append(":");
        BDT _type_11 = property.getType();
        String _xsdType = this.bdtExtension.xsdType(_type_11);
        _builder.append(_xsdType, "");
        _builder.append("\"");
        {
          boolean _hasFixedValue = this.abieExtension.hasFixedValue(property);
          if (_hasFixedValue) {
            _builder.append(" fixed=\"");
            String _fixedValue = property.getFixedValue();
            _builder.append(_fixedValue, "");
            _builder.append("\"");
          }
        }
        _builder.append(" minOccurs=\"");
        MultiplicityKind _multiplicity = property.getMultiplicity();
        String _minOccurs = this.multiplicityExtension.minOccurs(_multiplicity);
        _builder.append(_minOccurs, "");
        _builder.append("\" maxOccurs=\"");
        MultiplicityKind _multiplicity_1 = property.getMultiplicity();
        String _maxOccurs = this.multiplicityExtension.maxOccurs(_multiplicity_1);
        _builder.append(_maxOccurs, "");
        _builder.append("\"/>");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("<xsd:element name=\"");
        String _xsdName_1 = this.abieExtension.xsdName(property);
        _builder.append(_xsdName_1, "");
        _builder.append("\" minOccurs=\"");
        MultiplicityKind _multiplicity_2 = property.getMultiplicity();
        String _minOccurs_1 = this.multiplicityExtension.minOccurs(_multiplicity_2);
        _builder.append(_minOccurs_1, "");
        _builder.append("\" maxOccurs=\"");
        MultiplicityKind _multiplicity_3 = property.getMultiplicity();
        String _maxOccurs_1 = this.multiplicityExtension.maxOccurs(_multiplicity_3);
        _builder.append(_maxOccurs_1, "");
        _builder.append("\">");
        _builder.newLineIfNotEmpty();
        {
          BDT _type_12 = property.getType();
          boolean _isSimpleType = this.bdtExtension.isSimpleType(_type_12);
          if (_isSimpleType) {
            _builder.append("<xsd:simpleType>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("<xsd:restriction base=\"");
            _builder.append(prefix, "\t");
            _builder.append(":");
            BDT _type_13 = property.getType();
            String _xsdType_1 = this.bdtExtension.xsdType(_type_13);
            _builder.append(_xsdType_1, "\t");
            _builder.append("\">");
            _builder.newLineIfNotEmpty();
            {
              EList<String> _restriction_1 = property.getRestriction();
              List<String> _sort = IterableExtensions.<String>sort(_restriction_1);
              for(final String restriction : _sort) {
                _builder.append("\t                ");
                _builder.append("<xsd:enumeration value=\"");
                _builder.append(restriction, "\t                ");
                _builder.append("\"/>");
                _builder.newLineIfNotEmpty();
              }
            }
            {
              EList<String> _restriction_2 = property.getRestriction();
              int _size_1 = _restriction_2.size();
              boolean _equals_11 = (_size_1 == 0);
              if (_equals_11) {
                {
                  BDT _type_14 = property.getType();
                  Content _content_11 = this.bdtExtension.content(_type_14);
                  boolean _hasPattern_1 = this.bdtExtension.hasPattern(_content_11);
                  if (_hasPattern_1) {
                    _builder.append("\t                ");
                    _builder.append("<xsd:pattern value=\"");
                    BDT _type_15 = property.getType();
                    Content _content_12 = this.bdtExtension.content(_type_15);
                    String _pattern = _content_12.getPattern();
                    _builder.append(_pattern, "\t                ");
                    _builder.append("\"/>");
                    _builder.newLineIfNotEmpty();
                  }
                }
                {
                  BDT _type_16 = property.getType();
                  Content _content_13 = this.bdtExtension.content(_type_16);
                  int _minLength_1 = _content_13.getMinLength();
                  boolean _notEquals = (_minLength_1 != 0);
                  if (_notEquals) {
                    _builder.append("\t                ");
                    _builder.append("<xsd:minLength value=\"");
                    BDT _type_17 = property.getType();
                    Content _content_14 = this.bdtExtension.content(_type_17);
                    int _minLength_2 = _content_14.getMinLength();
                    _builder.append(_minLength_2, "\t                ");
                    _builder.append("\"/>");
                    _builder.newLineIfNotEmpty();
                  }
                }
                {
                  BDT _type_18 = property.getType();
                  Content _content_15 = this.bdtExtension.content(_type_18);
                  int _maxLength_1 = _content_15.getMaxLength();
                  boolean _notEquals_1 = (_maxLength_1 != 0);
                  if (_notEquals_1) {
                    _builder.append("\t                ");
                    _builder.append("<xsd:maxLength value=\"");
                    BDT _type_19 = property.getType();
                    Content _content_16 = this.bdtExtension.content(_type_19);
                    int _maxLength_2 = _content_16.getMaxLength();
                    _builder.append(_maxLength_2, "\t                ");
                    _builder.append("\"/>");
                    _builder.newLineIfNotEmpty();
                  }
                }
                {
                  BDT _type_20 = property.getType();
                  Content _content_17 = this.bdtExtension.content(_type_20);
                  int _length_1 = _content_17.getLength();
                  boolean _notEquals_2 = (_length_1 != 0);
                  if (_notEquals_2) {
                    _builder.append("\t                ");
                    _builder.append("<xsd:length value=\"");
                    BDT _type_21 = property.getType();
                    Content _content_18 = this.bdtExtension.content(_type_21);
                    int _length_2 = _content_18.getLength();
                    _builder.append(_length_2, "\t                ");
                    _builder.append("\"/>");
                    _builder.newLineIfNotEmpty();
                  }
                }
                {
                  BDT _type_22 = property.getType();
                  Content _content_19 = this.bdtExtension.content(_type_22);
                  int _minExclusive_1 = _content_19.getMinExclusive();
                  boolean _notEquals_3 = (_minExclusive_1 != 0);
                  if (_notEquals_3) {
                    _builder.append("\t                ");
                    _builder.append("<xsd:minExclusive value=\"");
                    BDT _type_23 = property.getType();
                    Content _content_20 = this.bdtExtension.content(_type_23);
                    int _minExclusive_2 = _content_20.getMinExclusive();
                    _builder.append(_minExclusive_2, "\t                ");
                    _builder.append("\"/>");
                    _builder.newLineIfNotEmpty();
                  }
                }
                {
                  BDT _type_24 = property.getType();
                  Content _content_21 = this.bdtExtension.content(_type_24);
                  int _minInclusive_1 = _content_21.getMinInclusive();
                  boolean _notEquals_4 = (_minInclusive_1 != 0);
                  if (_notEquals_4) {
                    _builder.append("\t                ");
                    _builder.append("<xsd:minInclusive value=\"");
                    BDT _type_25 = property.getType();
                    Content _content_22 = this.bdtExtension.content(_type_25);
                    int _minInclusive_2 = _content_22.getMinInclusive();
                    _builder.append(_minInclusive_2, "\t                ");
                    _builder.append("\"/>");
                    _builder.newLineIfNotEmpty();
                  }
                }
                {
                  BDT _type_26 = property.getType();
                  Content _content_23 = this.bdtExtension.content(_type_26);
                  int _maxExclusive_1 = _content_23.getMaxExclusive();
                  boolean _notEquals_5 = (_maxExclusive_1 != 0);
                  if (_notEquals_5) {
                    _builder.append("\t                ");
                    _builder.append("<xsd:maxExclusive value=\"");
                    BDT _type_27 = property.getType();
                    Content _content_24 = this.bdtExtension.content(_type_27);
                    int _maxExclusive_2 = _content_24.getMaxExclusive();
                    _builder.append(_maxExclusive_2, "\t                ");
                    _builder.append("\"/>");
                    _builder.newLineIfNotEmpty();
                  }
                }
                {
                  BDT _type_28 = property.getType();
                  Content _content_25 = this.bdtExtension.content(_type_28);
                  int _maxInclusive_1 = _content_25.getMaxInclusive();
                  boolean _notEquals_6 = (_maxInclusive_1 != 0);
                  if (_notEquals_6) {
                    _builder.append("\t                ");
                    _builder.append("<xsd:maxInclusive value=\"");
                    BDT _type_29 = property.getType();
                    Content _content_26 = this.bdtExtension.content(_type_29);
                    int _maxInclusive_2 = _content_26.getMaxInclusive();
                    _builder.append(_maxInclusive_2, "\t                ");
                    _builder.append("\"/>");
                    _builder.newLineIfNotEmpty();
                  }
                }
                {
                  BDT _type_30 = property.getType();
                  Content _content_27 = this.bdtExtension.content(_type_30);
                  int _fractionalDigits_1 = _content_27.getFractionalDigits();
                  boolean _notEquals_7 = (_fractionalDigits_1 != 0);
                  if (_notEquals_7) {
                    _builder.append("\t                ");
                    _builder.append("<xsd:fractionalDigits value=\"");
                    BDT _type_31 = property.getType();
                    Content _content_28 = this.bdtExtension.content(_type_31);
                    int _fractionalDigits_2 = _content_28.getFractionalDigits();
                    _builder.append(_fractionalDigits_2, "\t                ");
                    _builder.append("\"/>");
                    _builder.newLineIfNotEmpty();
                  }
                }
                {
                  BDT _type_32 = property.getType();
                  Content _content_29 = this.bdtExtension.content(_type_32);
                  int _totalDigits_1 = _content_29.getTotalDigits();
                  boolean _notEquals_8 = (_totalDigits_1 != 0);
                  if (_notEquals_8) {
                    _builder.append("\t                ");
                    _builder.append("<xsd:totalDigits value=\"");
                    BDT _type_33 = property.getType();
                    Content _content_30 = this.bdtExtension.content(_type_33);
                    int _totalDigits_2 = _content_30.getTotalDigits();
                    _builder.append(_totalDigits_2, "\t                ");
                    _builder.append("\"/>");
                    _builder.newLineIfNotEmpty();
                  }
                }
              }
            }
            _builder.append("    ");
            _builder.append("</xsd:restriction>");
            _builder.newLine();
            _builder.append("</xsd:simpleType>");
            _builder.newLine();
          } else {
            _builder.append("<xsd:complexType>");
            _builder.newLine();
            _builder.append("    ");
            _builder.append("<xsd:simpleContent>");
            _builder.newLine();
            _builder.append("        ");
            _builder.append("<xsd:restriction base=\"");
            _builder.append(prefix, "        ");
            _builder.append(":");
            BDT _type_34 = property.getType();
            String _xsdType_2 = this.bdtExtension.xsdType(_type_34);
            _builder.append(_xsdType_2, "        ");
            _builder.append("\">");
            _builder.newLineIfNotEmpty();
            {
              EList<String> _restriction_3 = property.getRestriction();
              List<String> _sort_1 = IterableExtensions.<String>sort(_restriction_3);
              for(final String restriction_1 : _sort_1) {
                _builder.append("            ");
                _builder.append("<xsd:enumeration value=\"");
                _builder.append(restriction_1, "            ");
                _builder.append("\"/>");
                _builder.newLineIfNotEmpty();
              }
            }
            {
              EList<String> _restriction_4 = property.getRestriction();
              int _size_2 = _restriction_4.size();
              boolean _equals_12 = (_size_2 == 0);
              if (_equals_12) {
                {
                  BDT _type_35 = property.getType();
                  Content _content_31 = this.bdtExtension.content(_type_35);
                  boolean _hasPattern_2 = this.bdtExtension.hasPattern(_content_31);
                  if (_hasPattern_2) {
                    _builder.append("            ");
                    _builder.append("<xsd:pattern value=\"");
                    BDT _type_36 = property.getType();
                    Content _content_32 = this.bdtExtension.content(_type_36);
                    String _pattern_1 = _content_32.getPattern();
                    _builder.append(_pattern_1, "            ");
                    _builder.append("\"/>");
                    _builder.newLineIfNotEmpty();
                  }
                }
                {
                  BDT _type_37 = property.getType();
                  Content _content_33 = this.bdtExtension.content(_type_37);
                  int _minLength_3 = _content_33.getMinLength();
                  boolean _notEquals_9 = (_minLength_3 != 0);
                  if (_notEquals_9) {
                    _builder.append("            ");
                    _builder.append("<xsd:minLength value=\"");
                    BDT _type_38 = property.getType();
                    Content _content_34 = this.bdtExtension.content(_type_38);
                    int _minLength_4 = _content_34.getMinLength();
                    _builder.append(_minLength_4, "            ");
                    _builder.append("\"/>");
                    _builder.newLineIfNotEmpty();
                  }
                }
                {
                  BDT _type_39 = property.getType();
                  Content _content_35 = this.bdtExtension.content(_type_39);
                  int _maxLength_3 = _content_35.getMaxLength();
                  boolean _notEquals_10 = (_maxLength_3 != 0);
                  if (_notEquals_10) {
                    _builder.append("            ");
                    _builder.append("<xsd:maxLength value=\"");
                    BDT _type_40 = property.getType();
                    Content _content_36 = this.bdtExtension.content(_type_40);
                    int _maxLength_4 = _content_36.getMaxLength();
                    _builder.append(_maxLength_4, "            ");
                    _builder.append("\"/>");
                    _builder.newLineIfNotEmpty();
                  }
                }
                {
                  BDT _type_41 = property.getType();
                  Content _content_37 = this.bdtExtension.content(_type_41);
                  int _length_3 = _content_37.getLength();
                  boolean _notEquals_11 = (_length_3 != 0);
                  if (_notEquals_11) {
                    _builder.append("            ");
                    _builder.append("<xsd:length value=\"");
                    BDT _type_42 = property.getType();
                    Content _content_38 = this.bdtExtension.content(_type_42);
                    int _length_4 = _content_38.getLength();
                    _builder.append(_length_4, "            ");
                    _builder.append("\"/>");
                    _builder.newLineIfNotEmpty();
                  }
                }
                {
                  BDT _type_43 = property.getType();
                  Content _content_39 = this.bdtExtension.content(_type_43);
                  int _minExclusive_3 = _content_39.getMinExclusive();
                  boolean _notEquals_12 = (_minExclusive_3 != 0);
                  if (_notEquals_12) {
                    _builder.append("            ");
                    _builder.append("<xsd:minExclusive value=\"");
                    BDT _type_44 = property.getType();
                    Content _content_40 = this.bdtExtension.content(_type_44);
                    int _minExclusive_4 = _content_40.getMinExclusive();
                    _builder.append(_minExclusive_4, "            ");
                    _builder.append("\"/>");
                    _builder.newLineIfNotEmpty();
                  }
                }
                {
                  BDT _type_45 = property.getType();
                  Content _content_41 = this.bdtExtension.content(_type_45);
                  int _minInclusive_3 = _content_41.getMinInclusive();
                  boolean _notEquals_13 = (_minInclusive_3 != 0);
                  if (_notEquals_13) {
                    _builder.append("            ");
                    _builder.append("<xsd:minInclusive value=\"");
                    BDT _type_46 = property.getType();
                    Content _content_42 = this.bdtExtension.content(_type_46);
                    int _minInclusive_4 = _content_42.getMinInclusive();
                    _builder.append(_minInclusive_4, "            ");
                    _builder.append("\"/>");
                    _builder.newLineIfNotEmpty();
                  }
                }
                {
                  BDT _type_47 = property.getType();
                  Content _content_43 = this.bdtExtension.content(_type_47);
                  int _maxExclusive_3 = _content_43.getMaxExclusive();
                  boolean _notEquals_14 = (_maxExclusive_3 != 0);
                  if (_notEquals_14) {
                    _builder.append("            ");
                    _builder.append("<xsd:maxExclusive value=\"");
                    BDT _type_48 = property.getType();
                    Content _content_44 = this.bdtExtension.content(_type_48);
                    int _maxExclusive_4 = _content_44.getMaxExclusive();
                    _builder.append(_maxExclusive_4, "            ");
                    _builder.append("\"/>");
                    _builder.newLineIfNotEmpty();
                  }
                }
                {
                  BDT _type_49 = property.getType();
                  Content _content_45 = this.bdtExtension.content(_type_49);
                  int _maxInclusive_3 = _content_45.getMaxInclusive();
                  boolean _notEquals_15 = (_maxInclusive_3 != 0);
                  if (_notEquals_15) {
                    _builder.append("            ");
                    _builder.append("<xsd:maxInclusive value=\"");
                    BDT _type_50 = property.getType();
                    Content _content_46 = this.bdtExtension.content(_type_50);
                    int _maxInclusive_4 = _content_46.getMaxInclusive();
                    _builder.append(_maxInclusive_4, "            ");
                    _builder.append("\"/>");
                    _builder.newLineIfNotEmpty();
                  }
                }
                {
                  BDT _type_51 = property.getType();
                  Content _content_47 = this.bdtExtension.content(_type_51);
                  int _fractionalDigits_3 = _content_47.getFractionalDigits();
                  boolean _notEquals_16 = (_fractionalDigits_3 != 0);
                  if (_notEquals_16) {
                    _builder.append("            ");
                    _builder.append("<xsd:fractionalDigits value=\"");
                    BDT _type_52 = property.getType();
                    Content _content_48 = this.bdtExtension.content(_type_52);
                    int _fractionalDigits_4 = _content_48.getFractionalDigits();
                    _builder.append(_fractionalDigits_4, "            ");
                    _builder.append("\"/>");
                    _builder.newLineIfNotEmpty();
                  }
                }
                {
                  BDT _type_53 = property.getType();
                  Content _content_49 = this.bdtExtension.content(_type_53);
                  int _totalDigits_3 = _content_49.getTotalDigits();
                  boolean _notEquals_17 = (_totalDigits_3 != 0);
                  if (_notEquals_17) {
                    _builder.append("            ");
                    _builder.append("<xsd:totalDigits value=\"");
                    BDT _type_54 = property.getType();
                    Content _content_50 = this.bdtExtension.content(_type_54);
                    int _totalDigits_4 = _content_50.getTotalDigits();
                    _builder.append(_totalDigits_4, "            ");
                    _builder.append("\"/>");
                    _builder.newLineIfNotEmpty();
                  }
                }
              }
            }
            _builder.append("        ");
            _builder.append("</xsd:restriction>");
            _builder.newLine();
            _builder.append("    ");
            _builder.append("</xsd:simpleContent>");
            _builder.newLine();
            _builder.append("</xsd:complexType>");
            _builder.newLine();
          }
        }
        _builder.append("</xsd:element>");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  public CharSequence AProperty(final ABIEProperty property, final String prefix) {
    if (property instanceof ASBIE) {
      return _AProperty((ASBIE)property, prefix);
    } else if (property instanceof BBIE) {
      return _AProperty((BBIE)property, prefix);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(property, prefix).toString());
    }
  }
}
