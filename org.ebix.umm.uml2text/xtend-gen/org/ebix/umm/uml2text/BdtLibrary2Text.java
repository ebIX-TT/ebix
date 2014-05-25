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
package org.ebix.umm.uml2text;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.List;
import org.ebix.umm.uml2text.Multiplicity2Text;
import org.ebix.umm.uml2text.Name2Text;
import org.ebix.umm.uml2text.UmmStereotypes;
import org.ebix.umm.uml2text.file.FileWriter;
import org.ebix.umm.uml2text.model.BDT;
import org.ebix.umm.uml2text.model.BdtLibrary;
import org.ebix.umm.uml2text.model.impl.BDTImpl;
import org.ebix.umm.uml2text.model.impl.BdtLibraryImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class BdtLibrary2Text {
  @Extension
  private BdtLibrary bdtlibraryExtension;
  
  @Extension
  private BDT bdtExtension;
  
  @Extension
  private Multiplicity2Text multiplicity2Text = new Multiplicity2Text();
  
  @Extension
  private Name2Text name2Text = new Name2Text();
  
  private UmmStereotypes ummStereotypes;
  
  private Stereotype CON;
  
  private Stereotype SUP;
  
  public BdtLibrary2Text(final UmmStereotypes ummStereotypes) {
    this.ummStereotypes = ummStereotypes;
    BdtLibraryImpl _bdtLibraryImpl = new BdtLibraryImpl(ummStereotypes.BDTLibrary);
    this.bdtlibraryExtension = _bdtLibraryImpl;
    BDTImpl _bDTImpl = new BDTImpl(ummStereotypes.BDT);
    this.bdtExtension = _bDTImpl;
    this.CON = ummStereotypes.BDT_CON.value;
    this.SUP = ummStereotypes.BDT_SUP.value;
  }
  
  public String generate(final Model umlModel, final FileWriter fw) {
    String _xblockexpression = null;
    {
      InputOutput.<String>println("Generating BDTLibraries ...");
      EList<Element> _allOwnedElements = umlModel.allOwnedElements();
      Iterable<org.eclipse.uml2.uml.Package> _filter = Iterables.<org.eclipse.uml2.uml.Package>filter(_allOwnedElements, org.eclipse.uml2.uml.Package.class);
      final Function1<org.eclipse.uml2.uml.Package,Boolean> _function = new Function1<org.eclipse.uml2.uml.Package,Boolean>() {
        public Boolean apply(final org.eclipse.uml2.uml.Package p) {
          return Boolean.valueOf(BdtLibrary2Text.this.bdtlibraryExtension.isBdtLibrary(p));
        }
      };
      Iterable<org.eclipse.uml2.uml.Package> _filter_1 = IterableExtensions.<org.eclipse.uml2.uml.Package>filter(_filter, _function);
      for (final org.eclipse.uml2.uml.Package umlPackage : _filter_1) {
        {
          String _name = umlPackage.getName();
          String _plus = ("BDTLibrary " + _name);
          InputOutput.<String>println(_plus);
          String _qualifiedName = umlPackage.getQualifiedName();
          String _fileName = this.name2Text.fileName(_qualifiedName);
          CharSequence _generateBdtLibrary = this.generateBdtLibrary(umlPackage);
          fw.writeFile(_fileName, _generateBdtLibrary);
        }
      }
      _xblockexpression = InputOutput.<String>println("Done.");
    }
    return _xblockexpression;
  }
  
  public CharSequence generateBdtLibrary(final org.eclipse.uml2.uml.Package umlPackage) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("BDTLibrary ");
    String _qualifiedName = umlPackage.getQualifiedName();
    _builder.append(_qualifiedName, "");
    _builder.newLineIfNotEmpty();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("businessTerm:      ");
    {
      List<String> _businessTerm = this.bdtlibraryExtension.businessTerm(umlPackage);
      boolean _hasElements = false;
      for(final String term : _businessTerm) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "\t");
        }
        _builder.append("\"");
        _builder.append(term, "\t");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("copyright:         ");
    {
      List<String> _copyright = this.bdtlibraryExtension.copyright(umlPackage);
      boolean _hasElements_1 = false;
      for(final String copyright : _copyright) {
        if (!_hasElements_1) {
          _hasElements_1 = true;
        } else {
          _builder.appendImmediate(", ", "\t");
        }
        _builder.append("\"");
        _builder.append(copyright, "\t");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("owner:             ");
    {
      List<String> _owner = this.bdtlibraryExtension.owner(umlPackage);
      boolean _hasElements_2 = false;
      for(final String owner : _owner) {
        if (!_hasElements_2) {
          _hasElements_2 = true;
        } else {
          _builder.appendImmediate(", ", "\t");
        }
        _builder.append("\"");
        _builder.append(owner, "\t");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("reference:         ");
    {
      List<String> _reference = this.bdtlibraryExtension.reference(umlPackage);
      boolean _hasElements_3 = false;
      for(final String reference : _reference) {
        if (!_hasElements_3) {
          _hasElements_3 = true;
        } else {
          _builder.appendImmediate(", ", "\t");
        }
        _builder.append("\"");
        _builder.append(reference, "\t");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("uniqueIdentifier:  \"");
    String _uniqueIdentifier = this.bdtlibraryExtension.uniqueIdentifier(umlPackage);
    _builder.append(_uniqueIdentifier, "\t");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("versionIdentifier: \"");
    String _versionIdentifier = this.bdtlibraryExtension.versionIdentifier(umlPackage);
    _builder.append(_versionIdentifier, "\t");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("baseURN:           \"");
    String _baseURN = this.bdtlibraryExtension.baseURN(umlPackage);
    _builder.append(_baseURN, "\t");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("namespacePrefix:   \"");
    String _namespacePrefix = this.bdtlibraryExtension.namespacePrefix(umlPackage);
    _builder.append(_namespacePrefix, "\t");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      EList<NamedElement> _ownedMembers = umlPackage.getOwnedMembers();
      Iterable<org.eclipse.uml2.uml.Class> _filter = Iterables.<org.eclipse.uml2.uml.Class>filter(_ownedMembers, org.eclipse.uml2.uml.Class.class);
      final Function1<org.eclipse.uml2.uml.Class,Boolean> _function = new Function1<org.eclipse.uml2.uml.Class,Boolean>() {
        public Boolean apply(final org.eclipse.uml2.uml.Class c) {
          return Boolean.valueOf(c.isStereotypeApplied(BdtLibrary2Text.this.ummStereotypes.BDT.value));
        }
      };
      Iterable<org.eclipse.uml2.uml.Class> _filter_1 = IterableExtensions.<org.eclipse.uml2.uml.Class>filter(_filter, _function);
      for(final org.eclipse.uml2.uml.Class bdt : _filter_1) {
        _builder.append("\t");
        CharSequence _generateBDT = this.generateBDT(bdt);
        _builder.append(_generateBDT, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.newLine();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateBDT(final org.eclipse.uml2.uml.Class bdt) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("BDT ");
    String _name = bdt.getName();
    _builder.append(_name, "");
    _builder.newLineIfNotEmpty();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("businessTerm:      ");
    {
      List<String> _businessTerm = this.bdtExtension.businessTerm(bdt);
      boolean _hasElements = false;
      for(final String term : _businessTerm) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "\t");
        }
        _builder.append("\"");
        _builder.append(term, "\t");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("definition:        \"");
    String _definition = this.bdtExtension.definition(bdt);
    _builder.append(_definition, "\t");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("dictionary:        \"");
    String _dictionaryEntryName = this.bdtExtension.dictionaryEntryName(bdt);
    _builder.append(_dictionaryEntryName, "\t");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("uniqueIdentifier:  \"");
    String _uniqueIdentifier = this.bdtExtension.uniqueIdentifier(bdt);
    _builder.append(_uniqueIdentifier, "\t");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("versionIdentifier: \"");
    String _versionIdentifier = this.bdtExtension.versionIdentifier(bdt);
    _builder.append(_versionIdentifier, "\t");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    {
      EList<Property> _attributes = bdt.getAttributes();
      for(final Property attr : _attributes) {
        {
          EList<Stereotype> _appliedStereotypes = attr.getAppliedStereotypes();
          boolean _contains = _appliedStereotypes.contains(this.CON);
          if (_contains) {
            _builder.append("\t");
            _builder.append("CON ");
            String _multiplicity = this.multiplicity2Text.multiplicity(attr);
            _builder.append(_multiplicity, "\t");
            _builder.append(" ");
            String _name_1 = attr.getName();
            _builder.append(_name_1, "\t");
            _builder.append(" : ");
            Type _type = attr.getType();
            String _name_2 = _type.getName();
            _builder.append(_name_2, "\t");
            _builder.append(" ");
            String _tagAsString = this.tagAsString(attr, this.CON, "pattern");
            _builder.append(_tagAsString, "\t");
            _builder.append(" ");
            String _tag = this.tag(attr, this.CON, "minLength");
            _builder.append(_tag, "\t");
            _builder.append(" ");
            String _tag_1 = this.tag(attr, this.CON, "maxLength");
            _builder.append(_tag_1, "\t");
            _builder.append(" ");
            String _tag_2 = this.tag(attr, this.CON, "length");
            _builder.append(_tag_2, "\t");
            _builder.append(" ");
            String _generate_defaultValue = this.generate_defaultValue(attr);
            _builder.append(_generate_defaultValue, "\t");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("{");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("businessTerm:      ");
            {
              Object _value = attr.getValue(this.CON, "businessTerm");
              boolean _hasElements_1 = false;
              for(final String term_1 : ((List<String>) _value)) {
                if (!_hasElements_1) {
                  _hasElements_1 = true;
                } else {
                  _builder.appendImmediate(", ", "\t\t");
                }
                _builder.append("\"");
                _builder.append(term_1, "\t\t");
                _builder.append("\"");
              }
            }
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("definition:        \"");
            Object _value_1 = attr.getValue(this.CON, "definition");
            _builder.append(_value_1, "\t\t");
            _builder.append("\"");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("dictionary:        \"");
            Object _value_2 = attr.getValue(this.CON, "dictionaryEntryName");
            _builder.append(_value_2, "\t\t");
            _builder.append("\"");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("uniqueIdentifier:  \"");
            Object _value_3 = attr.getValue(this.CON, "uniqueIdentifier");
            _builder.append(_value_3, "\t\t");
            _builder.append("\"");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("versionIdentifier: \"");
            Object _value_4 = attr.getValue(this.CON, "versionIdentifier");
            _builder.append(_value_4, "\t\t");
            _builder.append("\"");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("}");
            _builder.newLine();
          } else {
            EList<Stereotype> _appliedStereotypes_1 = attr.getAppliedStereotypes();
            boolean _contains_1 = _appliedStereotypes_1.contains(this.SUP);
            if (_contains_1) {
              _builder.append("\t");
              _builder.append("SUP ");
              String _multiplicity_1 = this.multiplicity2Text.multiplicity(attr);
              _builder.append(_multiplicity_1, "\t");
              _builder.append(" ");
              String _name_3 = attr.getName();
              _builder.append(_name_3, "\t");
              _builder.append(" : ");
              Type _type_1 = attr.getType();
              String _name_4 = _type_1.getName();
              _builder.append(_name_4, "\t");
              _builder.append(" ");
              String _tagAsString_1 = this.tagAsString(attr, this.SUP, "pattern");
              _builder.append(_tagAsString_1, "\t");
              _builder.append(" ");
              String _tag_3 = this.tag(attr, this.SUP, "minLength");
              _builder.append(_tag_3, "\t");
              _builder.append(" ");
              String _tag_4 = this.tag(attr, this.SUP, "maxLength");
              _builder.append(_tag_4, "\t");
              _builder.append(" ");
              String _tag_5 = this.tag(attr, this.SUP, "length");
              _builder.append(_tag_5, "\t");
              _builder.append(" ");
              String _generate_defaultValue_1 = this.generate_defaultValue(attr);
              _builder.append(_generate_defaultValue_1, "\t");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("{");
              _builder.newLine();
              _builder.append("\t");
              _builder.append("\t");
              _builder.append("businessTerm:      ");
              {
                Object _value_5 = attr.getValue(this.SUP, "businessTerm");
                boolean _hasElements_2 = false;
                for(final String term_2 : ((List<String>) _value_5)) {
                  if (!_hasElements_2) {
                    _hasElements_2 = true;
                  } else {
                    _builder.appendImmediate(", ", "\t\t");
                  }
                  _builder.append("\"");
                  _builder.append(term_2, "\t\t");
                  _builder.append("\"");
                }
              }
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("\t");
              _builder.append("definition:        \"");
              Object _value_6 = attr.getValue(this.SUP, "definition");
              _builder.append(_value_6, "\t\t");
              _builder.append("\"");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("\t");
              _builder.append("dictionary:        \"");
              Object _value_7 = attr.getValue(this.SUP, "dictionaryEntryName");
              _builder.append(_value_7, "\t\t");
              _builder.append("\"");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("\t");
              _builder.append("uniqueIdentifier:  \"");
              Object _value_8 = attr.getValue(this.SUP, "uniqueIdentifier");
              _builder.append(_value_8, "\t\t");
              _builder.append("\"");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("\t");
              _builder.append("versionIdentifier: \"");
              Object _value_9 = attr.getValue(this.SUP, "versionIdentifier");
              _builder.append(_value_9, "\t\t");
              _builder.append("\"");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("}");
              _builder.newLine();
            }
          }
        }
      }
    }
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public String tag(final Property p, final Stereotype st, final String tag) {
    Object _value = p.getValue(st, tag);
    if ((_value instanceof String)) {
      Object _value_1 = p.getValue(st, tag);
      final String tagValue = ((String) _value_1);
      int _length = tagValue.length();
      boolean _greaterThan = (_length > 0);
      if (_greaterThan) {
        return ((tag + ": ") + tagValue);
      }
    }
    return "";
  }
  
  public String tagAsString(final Property p, final Stereotype st, final String tag) {
    Object _value = p.getValue(st, tag);
    if ((_value instanceof String)) {
      Object _value_1 = p.getValue(st, tag);
      final String tagValue = ((String) _value_1);
      int _length = tagValue.length();
      boolean _greaterThan = (_length > 0);
      if (_greaterThan) {
        return (((tag + ": \"") + tagValue) + "\"");
      }
    }
    return "";
  }
  
  public String generate_defaultValue(final Property p) {
    boolean _and = false;
    String _default = p.getDefault();
    boolean _notEquals = (!Objects.equal(_default, null));
    if (!_notEquals) {
      _and = false;
    } else {
      String _default_1 = p.getDefault();
      int _length = _default_1.length();
      boolean _greaterThan = (_length > 0);
      _and = _greaterThan;
    }
    if (_and) {
      String _default_2 = p.getDefault();
      return ("defaultValue: " + _default_2);
    }
    return null;
  }
}
