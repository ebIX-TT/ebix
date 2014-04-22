package org.ebix.umm.uml2text;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.List;
import org.ebix.umm.uml2text.Constraint2Text;
import org.ebix.umm.uml2text.Multiplicity2Text;
import org.ebix.umm.uml2text.Name2Text;
import org.ebix.umm.uml2text.UmmStereotypes;
import org.ebix.umm.uml2text.file.FileWriter;
import org.ebix.umm.uml2text.model.ABIE;
import org.ebix.umm.uml2text.model.ASBIE;
import org.ebix.umm.uml2text.model.BBIE;
import org.ebix.umm.uml2text.model.BieLibrary;
import org.ebix.umm.uml2text.model.impl.ABIEImpl;
import org.ebix.umm.uml2text.model.impl.ASBIEImpl;
import org.ebix.umm.uml2text.model.impl.BBIEImpl;
import org.ebix.umm.uml2text.model.impl.BieLibraryImpl;
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
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class BieLibrary2Text {
  @Extension
  private BieLibrary bielibraryExtension;
  
  @Extension
  private ABIE abieExtension;
  
  @Extension
  private ASBIE asbieExtension;
  
  @Extension
  private BBIE bbieExtension;
  
  @Extension
  private Constraint2Text constraint2Text = new Function0<Constraint2Text>() {
    public Constraint2Text apply() {
      Constraint2Text _constraint2Text = new Constraint2Text();
      return _constraint2Text;
    }
  }.apply();
  
  @Extension
  private Multiplicity2Text multiplicity2Text = new Function0<Multiplicity2Text>() {
    public Multiplicity2Text apply() {
      Multiplicity2Text _multiplicity2Text = new Multiplicity2Text();
      return _multiplicity2Text;
    }
  }.apply();
  
  @Extension
  private Name2Text name2Text = new Function0<Name2Text>() {
    public Name2Text apply() {
      Name2Text _name2Text = new Name2Text();
      return _name2Text;
    }
  }.apply();
  
  private UmmStereotypes ummStereotypes;
  
  public BieLibrary2Text(final UmmStereotypes ummStereotypes) {
    this.ummStereotypes = ummStereotypes;
    BieLibraryImpl _bieLibraryImpl = new BieLibraryImpl(ummStereotypes.BIELibrary);
    this.bielibraryExtension = _bieLibraryImpl;
    ABIEImpl _aBIEImpl = new ABIEImpl(ummStereotypes.ABIE);
    this.abieExtension = _aBIEImpl;
    ASBIEImpl _aSBIEImpl = new ASBIEImpl(ummStereotypes.ASBIE);
    this.asbieExtension = _aSBIEImpl;
    BBIEImpl _bBIEImpl = new BBIEImpl(ummStereotypes.BBIE);
    this.bbieExtension = _bBIEImpl;
  }
  
  public String generate(final Model umlModel, final FileWriter fw) {
    String _xblockexpression = null;
    {
      InputOutput.<String>println("Generating BIELibraries ...");
      EList<Element> _allOwnedElements = umlModel.allOwnedElements();
      Iterable<org.eclipse.uml2.uml.Package> _filter = Iterables.<org.eclipse.uml2.uml.Package>filter(_allOwnedElements, org.eclipse.uml2.uml.Package.class);
      final Function1<org.eclipse.uml2.uml.Package,Boolean> _function = new Function1<org.eclipse.uml2.uml.Package,Boolean>() {
          public Boolean apply(final org.eclipse.uml2.uml.Package p) {
            boolean _isBieLibrary = BieLibrary2Text.this.bielibraryExtension.isBieLibrary(p);
            return Boolean.valueOf(_isBieLibrary);
          }
        };
      Iterable<org.eclipse.uml2.uml.Package> _filter_1 = IterableExtensions.<org.eclipse.uml2.uml.Package>filter(_filter, _function);
      for (final org.eclipse.uml2.uml.Package umlPackage : _filter_1) {
        {
          String _name = umlPackage.getName();
          String _plus = ("BIELibrary " + _name);
          InputOutput.<String>println(_plus);
          String _qualifiedName = umlPackage.getQualifiedName();
          String _fileName = this.name2Text.fileName(_qualifiedName);
          CharSequence _generateBieLibrary = this.generateBieLibrary(umlPackage);
          fw.writeFile(_fileName, _generateBieLibrary);
        }
      }
      String _println = InputOutput.<String>println("Done.");
      _xblockexpression = (_println);
    }
    return _xblockexpression;
  }
  
  public CharSequence generateBieLibrary(final org.eclipse.uml2.uml.Package umlPackage) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("BIELibrary ");
    String _qualifiedName = umlPackage.getQualifiedName();
    _builder.append(_qualifiedName, "");
    _builder.newLineIfNotEmpty();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("businessTerm:      ");
    {
      List<String> _businessTerm = this.bielibraryExtension.businessTerm(umlPackage);
      boolean _hasElements = false;
      for(final String term : _businessTerm) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "	");
        }
        _builder.append("\"");
        _builder.append(term, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("copyright:         ");
    {
      List<String> _copyright = this.bielibraryExtension.copyright(umlPackage);
      boolean _hasElements_1 = false;
      for(final String copyright : _copyright) {
        if (!_hasElements_1) {
          _hasElements_1 = true;
        } else {
          _builder.appendImmediate(", ", "	");
        }
        _builder.append("\"");
        _builder.append(copyright, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("owner:             ");
    {
      List<String> _owner = this.bielibraryExtension.owner(umlPackage);
      boolean _hasElements_2 = false;
      for(final String owner : _owner) {
        if (!_hasElements_2) {
          _hasElements_2 = true;
        } else {
          _builder.appendImmediate(", ", "	");
        }
        _builder.append("\"");
        _builder.append(owner, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("reference:         ");
    {
      List<String> _reference = this.bielibraryExtension.reference(umlPackage);
      boolean _hasElements_3 = false;
      for(final String reference : _reference) {
        if (!_hasElements_3) {
          _hasElements_3 = true;
        } else {
          _builder.appendImmediate(", ", "	");
        }
        _builder.append("\"");
        _builder.append(reference, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("uniqueIdentifier:  \"");
    String _uniqueIdentifier = this.bielibraryExtension.uniqueIdentifier(umlPackage);
    _builder.append(_uniqueIdentifier, "	");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("versionIdentifier: \"");
    String _versionIdentifier = this.bielibraryExtension.versionIdentifier(umlPackage);
    _builder.append(_versionIdentifier, "	");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("baseURN:           \"");
    String _baseURN = this.bielibraryExtension.baseURN(umlPackage);
    _builder.append(_baseURN, "	");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("namespacePrefix:   \"");
    String _namespacePrefix = this.bielibraryExtension.namespacePrefix(umlPackage);
    _builder.append(_namespacePrefix, "	");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("BDT: ");
    org.eclipse.uml2.uml.Package _bdtVersion = this.bielibraryExtension.bdtVersion(umlPackage);
    String _qualifiedName_1 = _bdtVersion==null?(String)null:_bdtVersion.getQualifiedName();
    _builder.append(_qualifiedName_1, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    {
      EList<NamedElement> _ownedMembers = umlPackage.getOwnedMembers();
      Iterable<org.eclipse.uml2.uml.Class> _filter = Iterables.<org.eclipse.uml2.uml.Class>filter(_ownedMembers, org.eclipse.uml2.uml.Class.class);
      final Function1<org.eclipse.uml2.uml.Class,Boolean> _function = new Function1<org.eclipse.uml2.uml.Class,Boolean>() {
          public Boolean apply(final org.eclipse.uml2.uml.Class c) {
            boolean _isStereotypeApplied = c.isStereotypeApplied(BieLibrary2Text.this.ummStereotypes.ABIE.value);
            return Boolean.valueOf(_isStereotypeApplied);
          }
        };
      Iterable<org.eclipse.uml2.uml.Class> _filter_1 = IterableExtensions.<org.eclipse.uml2.uml.Class>filter(_filter, _function);
      for(final org.eclipse.uml2.uml.Class abie : _filter_1) {
        _builder.append("\t");
        CharSequence _generateABIE = this.generateABIE(abie);
        _builder.append(_generateABIE, "	");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.newLine();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateABIE(final org.eclipse.uml2.uml.Class abie) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("ABIE ");
    String _name = abie.getName();
    _builder.append(_name, "");
    _builder.newLineIfNotEmpty();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("businessTerm:      ");
    {
      List<String> _businessTerm = this.abieExtension.businessTerm(abie);
      boolean _hasElements = false;
      for(final String term : _businessTerm) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "	");
        }
        _builder.append("\"");
        _builder.append(term, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("definition:        \"");
    String _definition = this.abieExtension.definition(abie);
    _builder.append(_definition, "	");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("dictionary:        \"");
    String _dictionaryEntryName = this.abieExtension.dictionaryEntryName(abie);
    _builder.append(_dictionaryEntryName, "	");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("uniqueIdentifier:  \"");
    String _uniqueIdentifier = this.abieExtension.uniqueIdentifier(abie);
    _builder.append(_uniqueIdentifier, "	");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("versionIdentifier: \"");
    String _versionIdentifier = this.abieExtension.versionIdentifier(abie);
    _builder.append(_versionIdentifier, "	");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    {
      EList<Property> _attributes = abie.getAttributes();
      for(final Property attr : _attributes) {
        {
          Association _association = attr.getAssociation();
          boolean _notEquals = (!Objects.equal(_association, null));
          if (_notEquals) {
            _builder.append("\t");
            _builder.append("ASBIE ");
            String _multiplicity = this.multiplicity2Text.multiplicity(attr);
            _builder.append(_multiplicity, "	");
            _builder.append(" ");
            String _name_1 = attr.getName();
            _builder.append(_name_1, "	");
            _builder.append(" : ");
            Type _type = attr.getType();
            String _name_2 = _type==null?(String)null:_type.getName();
            _builder.append(_name_2, "	");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("{");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("businessTerm:      ");
            {
              Association _association_1 = attr.getAssociation();
              List<String> _businessTerm_1 = this.asbieExtension.businessTerm(_association_1);
              boolean _hasElements_1 = false;
              for(final String term_1 : _businessTerm_1) {
                if (!_hasElements_1) {
                  _hasElements_1 = true;
                } else {
                  _builder.appendImmediate(", ", "		");
                }
                _builder.append("\"");
                _builder.append(term_1, "		");
                _builder.append("\"");
              }
            }
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("definition:        \"");
            Association _association_2 = attr.getAssociation();
            String _definition_1 = this.asbieExtension.definition(_association_2);
            _builder.append(_definition_1, "		");
            _builder.append("\"");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("dictionary:        \"");
            Association _association_3 = attr.getAssociation();
            String _dictionaryEntryName_1 = this.asbieExtension.dictionaryEntryName(_association_3);
            _builder.append(_dictionaryEntryName_1, "		");
            _builder.append("\"");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("uniqueIdentifier:  \"");
            Association _association_4 = attr.getAssociation();
            String _uniqueIdentifier_1 = this.asbieExtension.uniqueIdentifier(_association_4);
            _builder.append(_uniqueIdentifier_1, "		");
            _builder.append("\"");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("versionIdentifier: \"");
            Association _association_5 = attr.getAssociation();
            String _versionIdentifier_1 = this.asbieExtension.versionIdentifier(_association_5);
            _builder.append(_versionIdentifier_1, "		");
            _builder.append("\"");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("sequencingKey:     \"");
            Association _association_6 = attr.getAssociation();
            String _sequencingKey = this.asbieExtension.sequencingKey(_association_6);
            _builder.append(_sequencingKey, "		");
            _builder.append("\"");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("}");
            _builder.newLine();
          } else {
            _builder.append("\t");
            _builder.append("BBIE ");
            String _multiplicity_1 = this.multiplicity2Text.multiplicity(attr);
            _builder.append(_multiplicity_1, "	");
            _builder.append(" ");
            String _name_3 = attr.getName();
            _builder.append(_name_3, "	");
            _builder.append(" : ");
            Type _type_1 = attr.getType();
            String _name_4 = _type_1==null?(String)null:_type_1.getName();
            _builder.append(_name_4, "	");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("{");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("businessTerm:      ");
            {
              List<String> _businessTerm_2 = this.bbieExtension.businessTerm(attr);
              boolean _hasElements_2 = false;
              for(final String term_2 : _businessTerm_2) {
                if (!_hasElements_2) {
                  _hasElements_2 = true;
                } else {
                  _builder.appendImmediate(", ", "		");
                }
                _builder.append("\"");
                _builder.append(term_2, "		");
                _builder.append("\"");
              }
            }
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("definition:        \"");
            String _definition_2 = this.bbieExtension.definition(attr);
            _builder.append(_definition_2, "		");
            _builder.append("\"");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("dictionary:        \"");
            String _dictionaryEntryName_2 = this.bbieExtension.dictionaryEntryName(attr);
            _builder.append(_dictionaryEntryName_2, "		");
            _builder.append("\"");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("uniqueIdentifier:  \"");
            String _uniqueIdentifier_2 = this.bbieExtension.uniqueIdentifier(attr);
            _builder.append(_uniqueIdentifier_2, "		");
            _builder.append("\"");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("versionIdentifier: \"");
            String _versionIdentifier_2 = this.bbieExtension.versionIdentifier(attr);
            _builder.append(_versionIdentifier_2, "		");
            _builder.append("\"");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("sequencingKey:     \"");
            String _sequencingKey_1 = this.bbieExtension.sequencingKey(attr);
            _builder.append(_sequencingKey_1, "		");
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
      EList<Constraint> _ownedRules = abie.getOwnedRules();
      for(final Constraint constraint : _ownedRules) {
        _builder.append("\t");
        Namespace _context = constraint.getContext();
        CharSequence _generatConstraint = this.constraint2Text.generatConstraint(constraint, this.ummStereotypes, _context);
        _builder.append(_generatConstraint, "	");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
