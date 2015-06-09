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
import org.ebix.umm.templates.Constants;
import org.ebix.umm.templates.xsd.AbieExtension;
import org.ebix.umm.templates.xsd.BdtLibraryExtension;
import org.ebix.umm.templates.xsd.BieLibraryExtension;
import org.ebix.umm.templates.xsd.MaExtension;
import org.ebix.umm.templates.xsd.MultiplicityKindExtension;
import org.ebix.umm.templates.xsd.Xml;
import org.ebix.umm.umm.ABIE;
import org.ebix.umm.umm.BDTLibrary;
import org.ebix.umm.umm.BIELibrary;
import org.ebix.umm.umm.DocLibrary;
import org.ebix.umm.umm.MA;
import org.ebix.umm.umm.MAProperty;
import org.ebix.umm.umm.MultiplicityKind;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class MaSchema {
  @Inject
  @Extension
  private Xml xmlExtension;
  
  @Inject
  @Extension
  private AbieExtension abieExtension;
  
  @Inject
  @Extension
  private BdtLibraryExtension bdtLibraryExtension;
  
  @Inject
  @Extension
  private BieLibraryExtension bieLibraryExtension;
  
  @Inject
  @Extension
  private MaExtension maExtension;
  
  @Inject
  @Extension
  private MultiplicityKindExtension multiplicityExtension;
  
  public CharSequence compile(final MA ma, final Constants constants, final MA otherMa) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
    _builder.newLine();
    CharSequence _comment = this.xmlExtension.comment("EEM European Energy Market XML Schema Module");
    _builder.append(_comment, "");
    _builder.newLineIfNotEmpty();
    _builder.append("<!--");
    _builder.newLine();
    _builder.append("Schema agency:     ");
    _builder.append(constants.schemaAgency.value, "");
    _builder.newLineIfNotEmpty();
    _builder.append("Schema version:    ");
    DocLibrary _library = this.maExtension.library(ma);
    String _versionIdentifier = _library.getVersionIdentifier();
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
    _builder.append("xmlns:rsm=\"");
    String _namespace = this.maExtension.namespace(ma, otherMa);
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
    String _namespace_1 = this.maExtension.namespace(ma, otherMa);
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
    DocLibrary _library_1 = this.maExtension.library(ma);
    String _versionIdentifier_1 = _library_1.getVersionIdentifier();
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
    CharSequence _comment_3 = this.xmlExtension.comment("Inclusion of Message Business Information Entities");
    _builder.append(_comment_3, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("<xsd:include schemaLocation=\"");
    DocLibrary _library_2 = this.maExtension.library(ma);
    BIELibrary _bieLibrary = _library_2.getBieLibrary();
    String _fileName = this.bieLibraryExtension.fileName(_bieLibrary, otherMa);
    _builder.append(_fileName, "    ");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _comment_4 = this.xmlExtension.comment("Inclusion of Message Data Types");
    _builder.append(_comment_4, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("<xsd:include schemaLocation=\"");
    DocLibrary _library_3 = this.maExtension.library(ma);
    BDTLibrary _bdtLibrary = _library_3.getBdtLibrary();
    String _fileName_1 = this.bdtLibraryExtension.fileName(_bdtLibrary, otherMa);
    _builder.append(_fileName_1, "    ");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _comment_5 = this.xmlExtension.comment("Element Declarations");
    _builder.append(_comment_5, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _comment_6 = this.xmlExtension.comment("Root Element Declarations");
    _builder.append(_comment_6, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    String _name = ma.getName();
    CharSequence _comment_7 = this.xmlExtension.comment(_name);
    _builder.append(_comment_7, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _comment_8 = this.xmlExtension.comment("Root Element");
    _builder.append(_comment_8, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("<xsd:element name=\"");
    String _name_1 = ma.getName();
    _builder.append(_name_1, "    ");
    _builder.append("\" type=\"");
    DocLibrary _library_4 = this.maExtension.library(ma);
    String _namespacePrefix = _library_4.getNamespacePrefix();
    _builder.append(_namespacePrefix, "    ");
    _builder.append(":");
    String _xsdType = this.maExtension.xsdType(ma);
    _builder.append(_xsdType, "    ");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _comment_9 = this.xmlExtension.comment("Complex Element");
    _builder.append(_comment_9, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("<xsd:complexType name=\"");
    String _xsdType_1 = this.maExtension.xsdType(ma);
    _builder.append(_xsdType_1, "    ");
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("<xsd:sequence>");
    _builder.newLine();
    {
      EList<MAProperty> _properties = ma.getProperties();
      for(final MAProperty property : _properties) {
        _builder.append("            ");
        _builder.append("<xsd:element ref=\"");
        DocLibrary _library_5 = this.maExtension.library(ma);
        String _namespacePrefix_1 = _library_5.getNamespacePrefix();
        _builder.append(_namespacePrefix_1, "            ");
        _builder.append(":");
        String _xsdRoleName = this.maExtension.xsdRoleName(property);
        _builder.append(_xsdRoleName, "            ");
        _builder.append("\" minOccurs=\"");
        MultiplicityKind _multiplicity = property.getMultiplicity();
        String _minOccurs = this.multiplicityExtension.minOccurs(_multiplicity);
        _builder.append(_minOccurs, "            ");
        _builder.append("\" maxOccurs=\"");
        MultiplicityKind _multiplicity_1 = property.getMultiplicity();
        String _maxOccurs = this.multiplicityExtension.maxOccurs(_multiplicity_1);
        _builder.append(_maxOccurs, "            ");
        _builder.append("\"/>");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("        ");
    _builder.append("</xsd:sequence>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("</xsd:complexType>");
    _builder.newLine();
    _builder.append("    ");
    CharSequence _div = this.xmlExtension.div("");
    _builder.append(_div, "    ");
    _builder.newLineIfNotEmpty();
    {
      EList<MAProperty> _properties_1 = ma.getProperties();
      for(final MAProperty property_1 : _properties_1) {
        _builder.append("    ");
        _builder.append("<xsd:element name=\"");
        String _xsdRoleName_1 = this.maExtension.xsdRoleName(property_1);
        _builder.append(_xsdRoleName_1, "    ");
        _builder.append("\" type=\"");
        DocLibrary _library_6 = this.maExtension.library(ma);
        String _namespacePrefix_2 = _library_6.getNamespacePrefix();
        _builder.append(_namespacePrefix_2, "    ");
        _builder.append(":");
        ABIE _type = property_1.getType();
        String _xsdType_2 = this.abieExtension.xsdType(_type);
        _builder.append(_xsdType_2, "    ");
        _builder.append("\"/>");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</xsd:schema>");
    _builder.newLine();
    return _builder;
  }
}
