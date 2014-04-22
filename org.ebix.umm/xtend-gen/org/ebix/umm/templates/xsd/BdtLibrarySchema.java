package org.ebix.umm.templates.xsd;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.List;
import org.ebix.umm.templates.Constants;
import org.ebix.umm.templates.xsd.BdtExtension;
import org.ebix.umm.templates.xsd.BdtLibraryExtension;
import org.ebix.umm.templates.xsd.EnumExtension;
import org.ebix.umm.templates.xsd.MultiplicityKindExtension;
import org.ebix.umm.templates.xsd.Xml;
import org.ebix.umm.umm.Assembled;
import org.ebix.umm.umm.AssembledBase;
import org.ebix.umm.umm.BDT;
import org.ebix.umm.umm.BDTLibrary;
import org.ebix.umm.umm.BDTProperty;
import org.ebix.umm.umm.Content;
import org.ebix.umm.umm.MA;
import org.ebix.umm.umm.MultiplicityKind;
import org.ebix.umm.umm.Supplement;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class BdtLibrarySchema {
  @Inject
  @Extension
  private Xml xmlExtension;
  
  @Inject
  @Extension
  private BdtLibraryExtension bdtLibraryExtension;
  
  @Inject
  @Extension
  private BdtExtension bdtExtension;
  
  @Inject
  @Extension
  private EnumExtension enumExtension;
  
  @Inject
  @Extension
  private MultiplicityKindExtension multiplicityExtension;
  
  public CharSequence compile(final BDTLibrary library, final Constants constants, final MA ma) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
    _builder.newLine();
    CharSequence _comment = this.xmlExtension.comment("Business Data Type XML Schema Module");
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
    _builder.append("xmlns:bdt=\"");
    String _namespace = this.bdtLibraryExtension.namespace(library, null);
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
    String _namespace_1 = this.bdtLibraryExtension.namespace(library, ma);
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
    {
      boolean _notEquals = (!Objects.equal(ma, null));
      if (_notEquals) {
        _builder.append("    ");
        CharSequence _comment_2 = this.xmlExtension.comment("Import of Code Lists");
        _builder.append(_comment_2, "    ");
        _builder.newLineIfNotEmpty();
        {
          List<Assembled> _allReferencedCodelists = this.bdtLibraryExtension.allReferencedCodelists(library);
          for(final Assembled codelist : _allReferencedCodelists) {
            _builder.append("    ");
            _builder.append("<xsd:import namespace=\"");
            String _namespace_2 = this.bdtLibraryExtension.namespace(library, null);
            _builder.append(_namespace_2, "    ");
            _builder.append("\" schemaLocation=\"");
            String _schemaLocation = constants.schemaLocation();
            _builder.append(_schemaLocation, "    ");
            String _fileName = this.enumExtension.fileName(codelist);
            _builder.append(_fileName, "    ");
            _builder.append("\"/>");
            _builder.newLineIfNotEmpty();
          }
        }
      } else {
        _builder.append("    ");
        CharSequence _comment_3 = this.xmlExtension.comment("Import of Code Lists");
        _builder.append(_comment_3, "    ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("    ");
    CharSequence _comment_4 = this.xmlExtension.comment("Inclusions");
    _builder.append(_comment_4, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _comment_5 = this.xmlExtension.comment("Inclusion of Code Lists");
    _builder.append(_comment_5, "    ");
    _builder.newLineIfNotEmpty();
    {
      boolean _equals = Objects.equal(ma, null);
      if (_equals) {
        {
          List<Assembled> _allReferencedCodelists_1 = this.bdtLibraryExtension.allReferencedCodelists(library);
          for(final Assembled codelist_1 : _allReferencedCodelists_1) {
            _builder.append("    ");
            _builder.append("<xsd:include schemaLocation=\"");
            String _fileName_1 = this.enumExtension.fileName(codelist_1);
            _builder.append(_fileName_1, "    ");
            _builder.append("\"/>");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("    ");
    CharSequence _comment_6 = this.xmlExtension.comment("Business Data Type Definitions");
    _builder.append(_comment_6, "    ");
    _builder.newLineIfNotEmpty();
    {
      EList<BDT> _bdts = library.getBdts();
      for(final BDT bdt : _bdts) {
        _builder.append("    ");
        CharSequence _BdtType = this.BdtType(bdt);
        _builder.append(_BdtType, "    ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</xsd:schema>  ");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence BdtType(final BDT bdt) {
    StringConcatenation _builder = new StringConcatenation();
    String _xsdName = this.bdtExtension.xsdName(bdt);
    String _plus = (_xsdName + " Type");
    CharSequence _comment = this.xmlExtension.comment(_plus);
    _builder.append(_comment, "");
    _builder.newLineIfNotEmpty();
    {
      boolean _isSimpleType = this.bdtExtension.isSimpleType(bdt);
      if (_isSimpleType) {
        _builder.append("<xsd:simpleType name=\"");
        String _xsdType = this.bdtExtension.xsdType(bdt);
        _builder.append(_xsdType, "");
        _builder.append("\">");
        _builder.newLineIfNotEmpty();
        {
          Content _content = this.bdtExtension.content(bdt);
          boolean _isExtraRestricted = this.bdtExtension.isExtraRestricted(_content);
          boolean _not = (!_isExtraRestricted);
          if (_not) {
            _builder.append("    ");
            _builder.append("<xsd:restriction base=\"");
            String _conQualifiedType = this.bdtExtension.conQualifiedType(bdt);
            _builder.append(_conQualifiedType, "    ");
            _builder.append("\"/>");
            _builder.newLineIfNotEmpty();
          } else {
            _builder.append("    ");
            _builder.append("<xsd:restriction base=\"");
            String _conQualifiedType_1 = this.bdtExtension.conQualifiedType(bdt);
            _builder.append(_conQualifiedType_1, "    ");
            _builder.append("\">");
            _builder.newLineIfNotEmpty();
            {
              Content _content_1 = this.bdtExtension.content(bdt);
              boolean _hasPattern = this.bdtExtension.hasPattern(_content_1);
              if (_hasPattern) {
                _builder.append("    ");
                _builder.append("    ");
                _builder.append("<xsd:pattern value=\"");
                Content _content_2 = this.bdtExtension.content(bdt);
                String _pattern = _content_2.getPattern();
                _builder.append(_pattern, "        ");
                _builder.append("\"/>");
                _builder.newLineIfNotEmpty();
              }
            }
            {
              Content _content_3 = this.bdtExtension.content(bdt);
              int _minLength = _content_3.getMinLength();
              boolean _notEquals = (_minLength != 0);
              if (_notEquals) {
                _builder.append("    ");
                _builder.append("    ");
                _builder.append("<xsd:minLength value=\"");
                Content _content_4 = this.bdtExtension.content(bdt);
                int _minLength_1 = _content_4.getMinLength();
                _builder.append(_minLength_1, "        ");
                _builder.append("\"/>");
                _builder.newLineIfNotEmpty();
              }
            }
            {
              Content _content_5 = this.bdtExtension.content(bdt);
              int _maxLength = _content_5.getMaxLength();
              boolean _notEquals_1 = (_maxLength != 0);
              if (_notEquals_1) {
                {
                  Content _content_6 = this.bdtExtension.content(bdt);
                  AssembledBase _type = _content_6.getType();
                  String _name = _type.getName();
                  boolean _equals = Objects.equal(_name, "String");
                  if (_equals) {
                    _builder.append("    ");
                    _builder.append("    ");
                    _builder.append("<xsd:maxLength value=\"");
                    Content _content_7 = this.bdtExtension.content(bdt);
                    int _maxLength_1 = _content_7.getMaxLength();
                    _builder.append(_maxLength_1, "        ");
                    _builder.append("\"/>");
                    _builder.newLineIfNotEmpty();
                  } else {
                    _builder.append("    ");
                    _builder.append("    ");
                    _builder.append("<xsd:totalDigits value=\"");
                    Content _content_8 = this.bdtExtension.content(bdt);
                    int _maxLength_2 = _content_8.getMaxLength();
                    _builder.append(_maxLength_2, "        ");
                    _builder.append("\"/>");
                    _builder.newLineIfNotEmpty();
                  }
                }
              }
            }
            {
              Content _content_9 = this.bdtExtension.content(bdt);
              int _length = _content_9.getLength();
              boolean _notEquals_2 = (_length != 0);
              if (_notEquals_2) {
                _builder.append("    ");
                _builder.append("    ");
                _builder.append("<xsd:length value=\"");
                Content _content_10 = this.bdtExtension.content(bdt);
                int _length_1 = _content_10.getLength();
                _builder.append(_length_1, "        ");
                _builder.append("\"/>");
                _builder.newLineIfNotEmpty();
              }
            }
            _builder.append("    ");
            _builder.append("</xsd:restriction>");
            _builder.newLine();
          }
        }
        _builder.append("</xsd:simpleType>");
        _builder.newLine();
      } else {
        _builder.append("<xsd:complexType name=\"");
        String _xsdType_1 = this.bdtExtension.xsdType(bdt);
        _builder.append(_xsdType_1, "");
        _builder.append("\">");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("<xsd:simpleContent>");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("<xsd:extension base=\"");
        String _conQualifiedType_2 = this.bdtExtension.conQualifiedType(bdt);
        _builder.append(_conQualifiedType_2, "        ");
        _builder.append("\">");
        _builder.newLineIfNotEmpty();
        {
          EList<BDTProperty> _properties = bdt.getProperties();
          Iterable<Supplement> _filter = Iterables.<Supplement>filter(_properties, Supplement.class);
          for(final Supplement sup : _filter) {
            {
              boolean _and = false;
              EList<String> _restriction = sup.getRestriction();
              int _size = _restriction.size();
              boolean _equals_1 = (_size == 0);
              if (!_equals_1) {
                _and = false;
              } else {
                boolean _isExtraRestricted_1 = this.bdtExtension.isExtraRestricted(sup);
                boolean _not_1 = (!_isExtraRestricted_1);
                _and = (_equals_1 && _not_1);
              }
              if (_and) {
                _builder.append("            ");
                _builder.append("<xsd:attribute name=\"");
                String _name_1 = sup.getName();
                _builder.append(_name_1, "            ");
                _builder.append("\" type=\"");
                String _xsdQualifiedType = this.bdtExtension.xsdQualifiedType(sup);
                _builder.append(_xsdQualifiedType, "            ");
                _builder.append("\" use=\"");
                MultiplicityKind _multiplicity = sup.getMultiplicity();
                String _use = this.multiplicityExtension.use(_multiplicity);
                _builder.append(_use, "            ");
                _builder.append("\"");
                {
                  boolean _hasDefaultValue = this.bdtExtension.hasDefaultValue(sup);
                  if (_hasDefaultValue) {
                    _builder.append(" fixed=\"");
                    String _defaultValue = sup.getDefaultValue();
                    _builder.append(_defaultValue, "            ");
                    _builder.append("\"");
                  }
                }
                {
                  boolean _hasFixedValue = this.bdtExtension.hasFixedValue(sup);
                  if (_hasFixedValue) {
                    _builder.append(" fixed=\"");
                    String _fixedValue = sup.getFixedValue();
                    _builder.append(_fixedValue, "            ");
                    _builder.append("\"");
                  }
                }
                _builder.append("/>");
                _builder.newLineIfNotEmpty();
              } else {
                _builder.append("            ");
                _builder.append("<xsd:attribute name=\"");
                String _name_2 = sup.getName();
                _builder.append(_name_2, "            ");
                _builder.append("\" use=\"");
                MultiplicityKind _multiplicity_1 = sup.getMultiplicity();
                String _use_1 = this.multiplicityExtension.use(_multiplicity_1);
                _builder.append(_use_1, "            ");
                _builder.append("\"");
                {
                  boolean _hasDefaultValue_1 = this.bdtExtension.hasDefaultValue(sup);
                  if (_hasDefaultValue_1) {
                    _builder.append(" fixed=\"");
                    String _defaultValue_1 = sup.getDefaultValue();
                    _builder.append(_defaultValue_1, "            ");
                    _builder.append("\"");
                  }
                }
                {
                  boolean _hasFixedValue_1 = this.bdtExtension.hasFixedValue(sup);
                  if (_hasFixedValue_1) {
                    _builder.append(" fixed=\"");
                    String _fixedValue_1 = sup.getFixedValue();
                    _builder.append(_fixedValue_1, "            ");
                    _builder.append("\"");
                  }
                }
                _builder.append(">");
                _builder.newLineIfNotEmpty();
                _builder.append("            ");
                _builder.append("    ");
                _builder.append("<xsd:simpleType>");
                _builder.newLine();
                _builder.append("            ");
                _builder.append("        ");
                _builder.append("<xsd:restriction base=\"");
                String _xsdQualifiedType_1 = this.bdtExtension.xsdQualifiedType(sup);
                _builder.append(_xsdQualifiedType_1, "                    ");
                _builder.append("\">");
                _builder.newLineIfNotEmpty();
                {
                  EList<String> _restriction_1 = sup.getRestriction();
                  for(final String restriction : _restriction_1) {
                    _builder.append("            ");
                    _builder.append("            ");
                    _builder.append("<xsd:enumeration value=\"");
                    _builder.append(restriction, "                        ");
                    _builder.append("\"/>");
                    _builder.newLineIfNotEmpty();
                  }
                }
                {
                  EList<String> _restriction_2 = sup.getRestriction();
                  int _size_1 = _restriction_2.size();
                  boolean _equals_2 = (_size_1 == 0);
                  if (_equals_2) {
                    {
                      boolean _hasPattern_1 = this.bdtExtension.hasPattern(sup);
                      if (_hasPattern_1) {
                        _builder.append("            ");
                        _builder.append("            ");
                        _builder.append("<xsd:pattern value=\"");
                        String _pattern_1 = sup.getPattern();
                        _builder.append(_pattern_1, "                        ");
                        _builder.append("\"/>");
                        _builder.newLineIfNotEmpty();
                      }
                    }
                    {
                      int _minLength_2 = sup.getMinLength();
                      boolean _notEquals_3 = (_minLength_2 != 0);
                      if (_notEquals_3) {
                        _builder.append("            ");
                        _builder.append("            ");
                        _builder.append("<xsd:minLength value=\"");
                        int _minLength_3 = sup.getMinLength();
                        _builder.append(_minLength_3, "                        ");
                        _builder.append("\"/>");
                        _builder.newLineIfNotEmpty();
                      }
                    }
                    {
                      int _maxLength_3 = sup.getMaxLength();
                      boolean _notEquals_4 = (_maxLength_3 != 0);
                      if (_notEquals_4) {
                        {
                          AssembledBase _type_1 = sup.getType();
                          String _name_3 = _type_1.getName();
                          boolean _equals_3 = Objects.equal(_name_3, "String");
                          if (_equals_3) {
                            _builder.append("            ");
                            _builder.append("            ");
                            _builder.append("<xsd:maxLength value=\"");
                            int _maxLength_4 = sup.getMaxLength();
                            _builder.append(_maxLength_4, "                        ");
                            _builder.append("\"/>");
                            _builder.newLineIfNotEmpty();
                          } else {
                            _builder.append("            ");
                            _builder.append("            ");
                            _builder.append("<xsd:totalDigits value=\"");
                            int _maxLength_5 = sup.getMaxLength();
                            _builder.append(_maxLength_5, "                        ");
                            _builder.append("\"/>");
                            _builder.newLineIfNotEmpty();
                          }
                        }
                      }
                    }
                    {
                      int _length_2 = sup.getLength();
                      boolean _notEquals_5 = (_length_2 != 0);
                      if (_notEquals_5) {
                        _builder.append("            ");
                        _builder.append("            ");
                        _builder.append("<xsd:length value=\"");
                        int _length_3 = sup.getLength();
                        _builder.append(_length_3, "                        ");
                        _builder.append("\"/>");
                        _builder.newLineIfNotEmpty();
                      }
                    }
                  }
                }
                _builder.append("            ");
                _builder.append("        ");
                _builder.append("</xsd:restriction>");
                _builder.newLine();
                _builder.append("            ");
                _builder.append("    ");
                _builder.append("</xsd:simpleType>");
                _builder.newLine();
                _builder.append("            ");
                _builder.append("</xsd:attribute>");
                _builder.newLine();
              }
            }
          }
        }
        _builder.append("        ");
        _builder.append("</xsd:extension>");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("</xsd:simpleContent>");
        _builder.newLine();
        _builder.append("</xsd:complexType>");
        _builder.newLine();
      }
    }
    return _builder;
  }
}
