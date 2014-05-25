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
import org.ebix.umm.uml2text.Constraint2Text;
import org.ebix.umm.uml2text.Multiplicity2Text;
import org.ebix.umm.uml2text.Name2Text;
import org.ebix.umm.uml2text.UmmStereotypes;
import org.ebix.umm.uml2text.file.FileWriter;
import org.ebix.umm.uml2text.model.ACC;
import org.ebix.umm.uml2text.model.ASCC;
import org.ebix.umm.uml2text.model.BCC;
import org.ebix.umm.uml2text.model.CcLibrary;
import org.ebix.umm.uml2text.model.impl.ACCImpl;
import org.ebix.umm.uml2text.model.impl.ASCCImpl;
import org.ebix.umm.uml2text.model.impl.BCCImpl;
import org.ebix.umm.uml2text.model.impl.CcLibraryImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class CcLibrary2Text {
  @Extension
  private CcLibrary ccLibraryExtension;
  
  @Extension
  private ACC accExtension;
  
  @Extension
  private ASCC asccExtension;
  
  @Extension
  private BCC bccExtension;
  
  @Extension
  private Constraint2Text constraint2Text = new Constraint2Text();
  
  @Extension
  private Multiplicity2Text multiplicity2Text = new Multiplicity2Text();
  
  @Extension
  private Name2Text name2Text = new Name2Text();
  
  private UmmStereotypes ummStereotypes;
  
  public CcLibrary2Text(final UmmStereotypes ummStereotypes) {
    this.ummStereotypes = ummStereotypes;
    CcLibraryImpl _ccLibraryImpl = new CcLibraryImpl(ummStereotypes.CCLibrary);
    this.ccLibraryExtension = _ccLibraryImpl;
    ACCImpl _aCCImpl = new ACCImpl(ummStereotypes.ACC);
    this.accExtension = _aCCImpl;
    ASCCImpl _aSCCImpl = new ASCCImpl(ummStereotypes.ASCC);
    this.asccExtension = _aSCCImpl;
    BCCImpl _bCCImpl = new BCCImpl(ummStereotypes.BCC);
    this.bccExtension = _bCCImpl;
  }
  
  public String generate(final Model umlModel, final FileWriter fw) {
    String _xblockexpression = null;
    {
      InputOutput.<String>println("Generating CCLibraries ...");
      EList<Element> _allOwnedElements = umlModel.allOwnedElements();
      Iterable<org.eclipse.uml2.uml.Package> _filter = Iterables.<org.eclipse.uml2.uml.Package>filter(_allOwnedElements, org.eclipse.uml2.uml.Package.class);
      final Function1<org.eclipse.uml2.uml.Package,Boolean> _function = new Function1<org.eclipse.uml2.uml.Package,Boolean>() {
        public Boolean apply(final org.eclipse.uml2.uml.Package p) {
          return Boolean.valueOf(CcLibrary2Text.this.ccLibraryExtension.isCcLibrary(p));
        }
      };
      Iterable<org.eclipse.uml2.uml.Package> _filter_1 = IterableExtensions.<org.eclipse.uml2.uml.Package>filter(_filter, _function);
      for (final org.eclipse.uml2.uml.Package umlPackage : _filter_1) {
        {
          String _name = umlPackage.getName();
          String _plus = ("CCLibrary " + _name);
          InputOutput.<String>println(_plus);
          String _qualifiedName = umlPackage.getQualifiedName();
          String _fileName = this.name2Text.fileName(_qualifiedName);
          CharSequence _generateCcLibrary = this.generateCcLibrary(umlPackage);
          fw.writeFile(_fileName, _generateCcLibrary);
        }
      }
      _xblockexpression = InputOutput.<String>println("Done.");
    }
    return _xblockexpression;
  }
  
  public CharSequence generateCcLibrary(final org.eclipse.uml2.uml.Package umlPackage) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("CCLibrary \"");
    String _qualifiedName = umlPackage.getQualifiedName();
    _builder.append(_qualifiedName, "");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("businessTerm:      ");
    {
      List<String> _businessTerm = this.ccLibraryExtension.businessTerm(umlPackage);
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
      List<String> _copyright = this.ccLibraryExtension.copyright(umlPackage);
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
      List<String> _owner = this.ccLibraryExtension.owner(umlPackage);
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
      List<String> _reference = this.ccLibraryExtension.reference(umlPackage);
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
    String _uniqueIdentifier = this.ccLibraryExtension.uniqueIdentifier(umlPackage);
    _builder.append(_uniqueIdentifier, "\t");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("versionIdentifier: \"");
    String _versionIdentifier = this.ccLibraryExtension.versionIdentifier(umlPackage);
    _builder.append(_versionIdentifier, "\t");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("baseURN:           \"");
    String _baseURN = this.ccLibraryExtension.baseURN(umlPackage);
    _builder.append(_baseURN, "\t");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("namespacePrefix:   \"");
    String _namespacePrefix = this.ccLibraryExtension.namespacePrefix(umlPackage);
    _builder.append(_namespacePrefix, "\t");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    {
      EList<NamedElement> _ownedMembers = umlPackage.getOwnedMembers();
      Iterable<org.eclipse.uml2.uml.Class> _filter = Iterables.<org.eclipse.uml2.uml.Class>filter(_ownedMembers, org.eclipse.uml2.uml.Class.class);
      final Function1<org.eclipse.uml2.uml.Class,Boolean> _function = new Function1<org.eclipse.uml2.uml.Class,Boolean>() {
        public Boolean apply(final org.eclipse.uml2.uml.Class c) {
          return Boolean.valueOf(c.isStereotypeApplied(CcLibrary2Text.this.ummStereotypes.ACC.value));
        }
      };
      Iterable<org.eclipse.uml2.uml.Class> _filter_1 = IterableExtensions.<org.eclipse.uml2.uml.Class>filter(_filter, _function);
      for(final org.eclipse.uml2.uml.Class acc : _filter_1) {
        _builder.append("\t");
        CharSequence _generateACC = this.generateACC(acc);
        _builder.append(_generateACC, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.newLine();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateACC(final org.eclipse.uml2.uml.Class acc) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("ACC ");
    String _name = acc.getName();
    _builder.append(_name, "");
    _builder.newLineIfNotEmpty();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("businessTerm:      ");
    {
      List<String> _businessTerm = this.accExtension.businessTerm(acc);
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
    String _definition = this.accExtension.definition(acc);
    _builder.append(_definition, "\t");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("dictionary:        \"");
    String _dictionaryEntryName = this.accExtension.dictionaryEntryName(acc);
    _builder.append(_dictionaryEntryName, "\t");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("uniqueIdentifier:  \"");
    String _uniqueIdentifier = this.accExtension.uniqueIdentifier(acc);
    _builder.append(_uniqueIdentifier, "\t");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("versionIdentifier: \"");
    String _versionIdentifier = this.accExtension.versionIdentifier(acc);
    _builder.append(_versionIdentifier, "\t");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    {
      EList<Property> _attributes = acc.getAttributes();
      for(final Property attr : _attributes) {
        {
          Association _association = attr.getAssociation();
          boolean _notEquals = (!Objects.equal(_association, null));
          if (_notEquals) {
            _builder.append("\t");
            _builder.append("ASCC ");
            String _multiplicity = this.multiplicity2Text.multiplicity(attr);
            _builder.append(_multiplicity, "\t");
            _builder.append(" ");
            String _name_1 = attr.getName();
            _builder.append(_name_1, "\t");
            _builder.append(" : ");
            Type _type = attr.getType();
            String _name_2 = null;
            if (_type!=null) {
              _name_2=_type.getName();
            }
            _builder.append(_name_2, "\t");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("{");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("businessTerm:      ");
            {
              Association _association_1 = attr.getAssociation();
              List<String> _businessTerm_1 = this.asccExtension.businessTerm(_association_1);
              boolean _hasElements_1 = false;
              for(final String term_1 : _businessTerm_1) {
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
            Association _association_2 = attr.getAssociation();
            String _definition_1 = this.asccExtension.definition(_association_2);
            _builder.append(_definition_1, "\t\t");
            _builder.append("\"");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("dictionary:        \"");
            Association _association_3 = attr.getAssociation();
            String _dictionaryEntryName_1 = this.asccExtension.dictionaryEntryName(_association_3);
            _builder.append(_dictionaryEntryName_1, "\t\t");
            _builder.append("\"");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("uniqueIdentifier:  \"");
            Association _association_4 = attr.getAssociation();
            String _uniqueIdentifier_1 = this.asccExtension.uniqueIdentifier(_association_4);
            _builder.append(_uniqueIdentifier_1, "\t\t");
            _builder.append("\"");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("versionIdentifier: \"");
            Association _association_5 = attr.getAssociation();
            String _versionIdentifier_1 = this.asccExtension.versionIdentifier(_association_5);
            _builder.append(_versionIdentifier_1, "\t\t");
            _builder.append("\"");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("sequencingKey:     \"");
            Association _association_6 = attr.getAssociation();
            String _sequencingKey = this.asccExtension.sequencingKey(_association_6);
            _builder.append(_sequencingKey, "\t\t");
            _builder.append("\"");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("}");
            _builder.newLine();
          } else {
            _builder.append("\t");
            _builder.append("BCC ");
            String _multiplicity_1 = this.multiplicity2Text.multiplicity(attr);
            _builder.append(_multiplicity_1, "\t");
            _builder.append(" ");
            String _name_3 = attr.getName();
            _builder.append(_name_3, "\t");
            _builder.append(" : ");
            Type _type_1 = attr.getType();
            String _name_4 = null;
            if (_type_1!=null) {
              _name_4=_type_1.getName();
            }
            _builder.append(_name_4, "\t");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("{");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("businessTerm:      ");
            {
              List<String> _businessTerm_2 = this.bccExtension.businessTerm(attr);
              boolean _hasElements_2 = false;
              for(final String term_2 : _businessTerm_2) {
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
            String _definition_2 = this.bccExtension.definition(attr);
            _builder.append(_definition_2, "\t\t");
            _builder.append("\"");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("dictionary:        \"");
            String _dictionaryEntryName_2 = this.bccExtension.dictionaryEntryName(attr);
            _builder.append(_dictionaryEntryName_2, "\t\t");
            _builder.append("\"");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("uniqueIdentifier:  \"");
            String _uniqueIdentifier_2 = this.bccExtension.uniqueIdentifier(attr);
            _builder.append(_uniqueIdentifier_2, "\t\t");
            _builder.append("\"");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("versionIdentifier: \"");
            String _versionIdentifier_2 = this.bccExtension.versionIdentifier(attr);
            _builder.append(_versionIdentifier_2, "\t\t");
            _builder.append("\"");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("sequencingKey:     \"");
            String _sequencingKey_1 = this.bccExtension.sequencingKey(attr);
            _builder.append(_sequencingKey_1, "\t\t");
            _builder.append("\"");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("}");
            _builder.newLine();
          }
        }
      }
    }
    _builder.newLine();
    {
      EList<Constraint> _ownedRules = acc.getOwnedRules();
      for(final Constraint constraint : _ownedRules) {
        _builder.append("\t");
        Namespace _context = constraint.getContext();
        CharSequence _generatConstraint = this.constraint2Text.generatConstraint(constraint, this.ummStereotypes, _context);
        _builder.append(_generatConstraint, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
