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
import org.ebix.umm.templates.xsd.AssembledExtension;
import org.ebix.umm.templates.xsd.EnumExtension;
import org.ebix.umm.templates.xsd.Xml;
import org.ebix.umm.umm.Assembled;
import org.ebix.umm.umm.CodelistEntry;
import org.ebix.umm.umm.ENUM;
import org.ebix.umm.umm.Original;
import org.ebix.umm.umm.Subset;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class EnumSchema {
  @Inject
  @Extension
  private Xml xmlExtension;
  
  @Inject
  @Extension
  private AssembledExtension assembledExtension;
  
  @Inject
  @Extension
  private EnumExtension enumExtension;
  
  public CharSequence compile(final ENUM e, final Constants constants) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
    _builder.newLine();
    String _xsdName = this.enumExtension.xsdName(e);
    String _plus = (_xsdName + " - Code List Schema Module");
    CharSequence _comment = this.xmlExtension.comment(_plus);
    _builder.append(_comment, "");
    _builder.newLineIfNotEmpty();
    _builder.append("<!--");
    _builder.newLine();
    _builder.append("Schema agency:     ");
    _builder.append(constants.schemaAgency.value, "");
    _builder.newLineIfNotEmpty();
    _builder.append("Schema version:    ");
    String _versionIdentifier = e.getVersionIdentifier();
    _builder.append(_versionIdentifier, "");
    _builder.newLineIfNotEmpty();
    _builder.append("Schema date:       ");
    String _schemaDate = constants.schemaDate();
    _builder.append(_schemaDate, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("Code list name:    ");
    String _codeListName = e.getCodeListName();
    _builder.append(_codeListName, "");
    _builder.newLineIfNotEmpty();
    _builder.append("Code list agency:  ");
    String _codeListAgency = this.enumExtension.codeListAgency(e);
    _builder.append(_codeListAgency, "");
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    _builder.append("Code list version: ");
    String _versionIdentifier_1 = e.getVersionIdentifier();
    _builder.append(_versionIdentifier_1, "");
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
    _builder.append("xmlns:");
    String _namespacePrefix = this.enumExtension.namespacePrefix(e);
    _builder.append(_namespacePrefix, "    ");
    _builder.append("=\"");
    String _namespace = this.enumExtension.namespace(e);
    _builder.append(_namespace, "    ");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _importNamespace = this.importNamespace(e);
    _builder.append(_importNamespace, "    ");
    _builder.append("   ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("xmlns:ccts=\"urn:un:unece:uncefact:documentation:common:3:standard:CoreComponentsTechnicalSpecification:3\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("xmlns:xbt=\"urn:un:unece:uncefact:data:common:1:draft\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("targetNamespace=\"");
    String _namespace_1 = this.enumExtension.namespace(e);
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
    String _versionIdentifier_2 = e.getVersionIdentifier();
    _builder.append(_versionIdentifier_2, "    ");
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _comment_1 = this.xmlExtension.comment("Imports");
    _builder.append(_comment_1, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _imports = this.imports(e);
    _builder.append(_imports, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _includes = this.includes(e);
    _builder.append(_includes, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _comment_2 = this.xmlExtension.comment("Root element for this code list");
    _builder.append(_comment_2, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("<xsd:element name=\"");
    String _xsdName_1 = this.enumExtension.xsdName(e);
    _builder.append(_xsdName_1, "    ");
    _builder.append("\" ");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("type=\"");
    String _xsdQualifiedType = this.enumExtension.xsdQualifiedType(e);
    _builder.append(_xsdQualifiedType, "        ");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("    ");
    CharSequence _comment_3 = this.xmlExtension.comment("Content type for this code list");
    _builder.append(_comment_3, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("<xsd:simpleType name=\"");
    String _xsdType = this.enumExtension.xsdType(e);
    _builder.append(_xsdType, "    ");
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    CharSequence _content = this.content(e);
    _builder.append(_content, "        ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("</xsd:simpleType>");
    _builder.newLine();
    _builder.append("</xsd:schema>  ");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _importNamespace(final ENUM e) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected CharSequence _imports(final ENUM e) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected CharSequence _includes(final ENUM e) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected CharSequence _content(final ENUM e) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected CharSequence _content(final Original original) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<xsd:restriction base=\"xsd:token\">");
    _builder.newLine();
    {
      EList<CodelistEntry> _codes = original.getCodes();
      for(final CodelistEntry code : _codes) {
        _builder.append("<xsd:enumeration value=\"");
        String _name = code.getName();
        _builder.append(_name, "");
        _builder.append("\">");
        _builder.newLineIfNotEmpty();
        _builder.append("   ");
        _builder.append("<xsd:annotation>");
        _builder.newLine();
        _builder.append("      ");
        _builder.append("<xsd:documentation xml:lang=\"en\">");
        _builder.newLine();
        _builder.append("         ");
        _builder.append("<ccts:Name>");
        String _name_1 = code.getName();
        _builder.append(_name_1, "         ");
        _builder.append("</ccts:Name>");
        _builder.newLineIfNotEmpty();
        _builder.append("         ");
        _builder.append("<ccts:Description>");
        String _description = code.getDescription();
        String _escapeXML = this.xmlExtension.escapeXML(_description);
        _builder.append(_escapeXML, "         ");
        _builder.append("</ccts:Description>");
        _builder.newLineIfNotEmpty();
        _builder.append("      ");
        _builder.append("</xsd:documentation>");
        _builder.newLine();
        _builder.append("   ");
        _builder.append("</xsd:annotation>");
        _builder.newLine();
        _builder.append("</xsd:enumeration>");
        _builder.newLine();
      }
    }
    _builder.append("</xsd:restriction>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _content(final Subset subset) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<xsd:restriction base=\"xsd:token\">");
    _builder.newLine();
    {
      EList<CodelistEntry> _codes = subset.getCodes();
      for(final CodelistEntry code : _codes) {
        _builder.append("<xsd:enumeration value=\"");
        String _name = code.getName();
        _builder.append(_name, "");
        _builder.append("\">");
        _builder.newLineIfNotEmpty();
        _builder.append("   ");
        _builder.append("<xsd:annotation>");
        _builder.newLine();
        _builder.append("      ");
        _builder.append("<xsd:documentation xml:lang=\"en\">");
        _builder.newLine();
        _builder.append("         ");
        _builder.append("<ccts:Name>");
        String _name_1 = code.getName();
        _builder.append(_name_1, "         ");
        _builder.append("</ccts:Name>");
        _builder.newLineIfNotEmpty();
        _builder.append("         ");
        _builder.append("<ccts:Description>");
        String _description = code.getDescription();
        String _escapeXML = this.xmlExtension.escapeXML(_description);
        _builder.append(_escapeXML, "         ");
        _builder.append("</ccts:Description>");
        _builder.newLineIfNotEmpty();
        _builder.append("      ");
        _builder.append("</xsd:documentation>");
        _builder.newLine();
        _builder.append("   ");
        _builder.append("</xsd:annotation>");
        _builder.newLine();
        _builder.append("</xsd:enumeration>");
        _builder.newLine();
      }
    }
    _builder.append("</xsd:restriction>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _importNamespace(final Assembled assembled) {
    StringConcatenation _builder = new StringConcatenation();
    {
      List<ENUM> _imports = this.assembledExtension.imports(assembled);
      for(final ENUM e : _imports) {
        _builder.append("xmlns:");
        String _namespacePrefix = this.enumExtension.namespacePrefix(e);
        _builder.append(_namespacePrefix, "");
        _builder.append("=\"");
        String _namespace = this.enumExtension.namespace(e);
        _builder.append(_namespace, "");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _imports(final Assembled assembled) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _comment = this.xmlExtension.comment("Import of Code Lists");
    _builder.append(_comment, "");
    _builder.newLineIfNotEmpty();
    {
      List<ENUM> _imports = this.assembledExtension.imports(assembled);
      for(final ENUM e : _imports) {
        _builder.append("<xsd:import namespace=\"");
        String _namespace = this.enumExtension.namespace(e);
        _builder.append(_namespace, "");
        _builder.append("\" schemaLocation=\"");
        String _fileName = this.enumExtension.fileName(e);
        _builder.append(_fileName, "");
        _builder.append("\"/>");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _includes(final Assembled assembled) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _comment = this.xmlExtension.comment("Include of Code Lists");
    _builder.append(_comment, "");
    _builder.newLineIfNotEmpty();
    {
      List<ENUM> _includes = this.assembledExtension.includes(assembled);
      for(final ENUM e : _includes) {
        _builder.append("<xsd:include schemaLocation=\"");
        String _fileName = this.enumExtension.fileName(e);
        _builder.append(_fileName, "");
        _builder.append("\"/>");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _content(final Assembled assembled) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<xsd:union memberTypes=\"");
    {
      List<ENUM> _enums = this.assembledExtension.enums(assembled);
      boolean _hasElements = false;
      for(final ENUM e : _enums) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(" ", "");
        }
        {
          String _namespace = this.enumExtension.namespace(assembled);
          String _namespace_1 = this.enumExtension.namespace(e);
          boolean _equals = Objects.equal(_namespace, _namespace_1);
          if (_equals) {
            String _namespacePrefix = this.enumExtension.namespacePrefix(assembled);
            _builder.append(_namespacePrefix, "");
          } else {
            String _namespacePrefix_1 = this.enumExtension.namespacePrefix(e);
            _builder.append(_namespacePrefix_1, "");
          }
        }
        _builder.append(":");
        String _xsdType = this.enumExtension.xsdType(e);
        _builder.append(_xsdType, "");
      }
    }
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence importNamespace(final ENUM assembled) {
    if (assembled instanceof Assembled) {
      return _importNamespace((Assembled)assembled);
    } else if (assembled != null) {
      return _importNamespace(assembled);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(assembled).toString());
    }
  }
  
  public CharSequence imports(final ENUM assembled) {
    if (assembled instanceof Assembled) {
      return _imports((Assembled)assembled);
    } else if (assembled != null) {
      return _imports(assembled);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(assembled).toString());
    }
  }
  
  public CharSequence includes(final ENUM assembled) {
    if (assembled instanceof Assembled) {
      return _includes((Assembled)assembled);
    } else if (assembled != null) {
      return _includes(assembled);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(assembled).toString());
    }
  }
  
  public CharSequence content(final ENUM assembled) {
    if (assembled instanceof Assembled) {
      return _content((Assembled)assembled);
    } else if (assembled instanceof Original) {
      return _content((Original)assembled);
    } else if (assembled instanceof Subset) {
      return _content((Subset)assembled);
    } else if (assembled != null) {
      return _content(assembled);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(assembled).toString());
    }
  }
}
