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
    CharSequence _comment = this.xmlExtension.comment("Aggregated Business Information Entities XML Schema Module");
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
    CharSequence _comment_3 = this.xmlExtension.comment("Inclusion of Business Data Types");
    _builder.append(_comment_3, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("<xsd:include schemaLocation=\"");
    BDTLibrary _bdtLibrary = library.getBdtLibrary();
    String _fileName = this.bdtLibraryExtension.fileName(_bdtLibrary);
    _builder.append(_fileName, "    ");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _comment_4 = this.xmlExtension.comment("Aggregated Business Information Entities Definitions");
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
                final Function1<ABIEProperty,Boolean> _function = new Function1<ABIEProperty,Boolean>() {
                  public Boolean apply(final ABIEProperty p) {
                    MultiplicityKind _multiplicity = p.getMultiplicity();
                    return Boolean.valueOf(BieLibrarySchema.this.multiplicityExtension.lowerBoundZero(_multiplicity));
                  }
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
      EList<String> _restriction = property.getRestriction();
      int _size = _restriction.size();
      boolean _equals = (_size == 0);
      if (_equals) {
        _builder.append("<xsd:element name=\"");
        String _xsdName = this.abieExtension.xsdName(property);
        _builder.append(_xsdName, "");
        _builder.append("\" type=\"");
        _builder.append(prefix, "");
        _builder.append(":");
        BDT _type = property.getType();
        String _xsdType = this.bdtExtension.xsdType(_type);
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
          BDT _type_1 = property.getType();
          boolean _isSimpleType = this.bdtExtension.isSimpleType(_type_1);
          if (_isSimpleType) {
            _builder.append("<xsd:simpleType>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("<xsd:restriction base=\"");
            _builder.append(prefix, "\t");
            _builder.append(":");
            BDT _type_2 = property.getType();
            String _xsdType_1 = this.bdtExtension.xsdType(_type_2);
            _builder.append(_xsdType_1, "\t");
            _builder.append("\">");
            _builder.newLineIfNotEmpty();
            {
              EList<String> _restriction_1 = property.getRestriction();
              List<String> _sort = IterableExtensions.<String>sort(_restriction_1);
              for(final String restriction : _sort) {
                _builder.append("        ");
                _builder.append("<xsd:enumeration value=\"");
                _builder.append(restriction, "        ");
                _builder.append("\"/>");
                _builder.newLineIfNotEmpty();
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
            BDT _type_3 = property.getType();
            String _xsdType_2 = this.bdtExtension.xsdType(_type_3);
            _builder.append(_xsdType_2, "        ");
            _builder.append("\">");
            _builder.newLineIfNotEmpty();
            {
              EList<String> _restriction_2 = property.getRestriction();
              List<String> _sort_1 = IterableExtensions.<String>sort(_restriction_2);
              for(final String restriction_1 : _sort_1) {
                _builder.append("            ");
                _builder.append("<xsd:enumeration value=\"");
                _builder.append(restriction_1, "            ");
                _builder.append("\"/>");
                _builder.newLineIfNotEmpty();
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
