package org.ebix.umm.uml2text;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.List;
import org.ebix.umm.uml2text.Multiplicity2Text;
import org.ebix.umm.uml2text.Name2Text;
import org.ebix.umm.uml2text.UmmStereotypes;
import org.ebix.umm.uml2text.file.FileWriter;
import org.ebix.umm.uml2text.model.CDT;
import org.ebix.umm.uml2text.model.CdtLibrary;
import org.ebix.umm.uml2text.model.impl.CDTImpl;
import org.ebix.umm.uml2text.model.impl.CdtLibraryImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class CdtLibrary2Text {
  @Extension
  private CdtLibrary cdtlibraryExtension;
  
  @Extension
  private CDT cdtExtension;
  
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
  
  private Stereotype CON;
  
  private Stereotype SUP;
  
  public CdtLibrary2Text(final UmmStereotypes ummStereotypes) {
    this.ummStereotypes = ummStereotypes;
    CdtLibraryImpl _cdtLibraryImpl = new CdtLibraryImpl(ummStereotypes.CDTLibrary);
    this.cdtlibraryExtension = _cdtLibraryImpl;
    CDTImpl _cDTImpl = new CDTImpl(ummStereotypes.CDT);
    this.cdtExtension = _cDTImpl;
    this.CON = ummStereotypes.CDT_CON.value;
    this.SUP = ummStereotypes.CDT_SUP.value;
  }
  
  public String generate(final Model umlModel, final FileWriter fw) {
    String _xblockexpression = null;
    {
      InputOutput.<String>println("Generating CDTLibraries ...");
      EList<Element> _allOwnedElements = umlModel.allOwnedElements();
      Iterable<org.eclipse.uml2.uml.Package> _filter = Iterables.<org.eclipse.uml2.uml.Package>filter(_allOwnedElements, org.eclipse.uml2.uml.Package.class);
      final Function1<org.eclipse.uml2.uml.Package,Boolean> _function = new Function1<org.eclipse.uml2.uml.Package,Boolean>() {
          public Boolean apply(final org.eclipse.uml2.uml.Package p) {
            boolean _isCdtLibrary = CdtLibrary2Text.this.cdtlibraryExtension.isCdtLibrary(p);
            return Boolean.valueOf(_isCdtLibrary);
          }
        };
      Iterable<org.eclipse.uml2.uml.Package> _filter_1 = IterableExtensions.<org.eclipse.uml2.uml.Package>filter(_filter, _function);
      for (final org.eclipse.uml2.uml.Package umlPackage : _filter_1) {
        {
          String _name = umlPackage.getName();
          String _plus = ("CDTLibrary " + _name);
          InputOutput.<String>println(_plus);
          String _qualifiedName = umlPackage.getQualifiedName();
          String _fileName = this.name2Text.fileName(_qualifiedName);
          CharSequence _generateCdtLibrary = this.generateCdtLibrary(umlPackage);
          fw.writeFile(_fileName, _generateCdtLibrary);
        }
      }
      String _println = InputOutput.<String>println("Done.");
      _xblockexpression = (_println);
    }
    return _xblockexpression;
  }
  
  public CharSequence generateCdtLibrary(final org.eclipse.uml2.uml.Package umlPackage) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("CDTLibrary \"");
    String _qualifiedName = umlPackage.getQualifiedName();
    _builder.append(_qualifiedName, "");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("businessTerm:      ");
    {
      List<String> _businessTerm = this.cdtlibraryExtension.businessTerm(umlPackage);
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
      List<String> _copyright = this.cdtlibraryExtension.copyright(umlPackage);
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
      List<String> _owner = this.cdtlibraryExtension.owner(umlPackage);
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
      List<String> _reference = this.cdtlibraryExtension.reference(umlPackage);
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
    String _uniqueIdentifier = this.cdtlibraryExtension.uniqueIdentifier(umlPackage);
    _builder.append(_uniqueIdentifier, "	");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("versionIdentifier: \"");
    String _versionIdentifier = this.cdtlibraryExtension.versionIdentifier(umlPackage);
    _builder.append(_versionIdentifier, "	");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("baseURN:           \"");
    String _baseURN = this.cdtlibraryExtension.baseURN(umlPackage);
    _builder.append(_baseURN, "	");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("namespacePrefix:   \"");
    String _namespacePrefix = this.cdtlibraryExtension.namespacePrefix(umlPackage);
    _builder.append(_namespacePrefix, "	");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      EList<NamedElement> _ownedMembers = umlPackage.getOwnedMembers();
      Iterable<org.eclipse.uml2.uml.Class> _filter = Iterables.<org.eclipse.uml2.uml.Class>filter(_ownedMembers, org.eclipse.uml2.uml.Class.class);
      final Function1<org.eclipse.uml2.uml.Class,Boolean> _function = new Function1<org.eclipse.uml2.uml.Class,Boolean>() {
          public Boolean apply(final org.eclipse.uml2.uml.Class c) {
            boolean _isStereotypeApplied = c.isStereotypeApplied(CdtLibrary2Text.this.ummStereotypes.CDT.value);
            return Boolean.valueOf(_isStereotypeApplied);
          }
        };
      Iterable<org.eclipse.uml2.uml.Class> _filter_1 = IterableExtensions.<org.eclipse.uml2.uml.Class>filter(_filter, _function);
      for(final org.eclipse.uml2.uml.Class cdt : _filter_1) {
        _builder.append("\t");
        CharSequence _generateCDT = this.generateCDT(cdt);
        _builder.append(_generateCDT, "	");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.newLine();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateCDT(final org.eclipse.uml2.uml.Class cdt) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("CDT ");
    String _name = cdt.getName();
    _builder.append(_name, "");
    _builder.newLineIfNotEmpty();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("businessTerm:      ");
    {
      List<String> _businessTerm = this.cdtExtension.businessTerm(cdt);
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
    String _definition = this.cdtExtension.definition(cdt);
    _builder.append(_definition, "	");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("dictionary:        \"");
    String _dictionaryEntryName = this.cdtExtension.dictionaryEntryName(cdt);
    _builder.append(_dictionaryEntryName, "	");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("uniqueIdentifier:  \"");
    String _uniqueIdentifier = this.cdtExtension.uniqueIdentifier(cdt);
    _builder.append(_uniqueIdentifier, "	");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("versionIdentifier: \"");
    String _versionIdentifier = this.cdtExtension.versionIdentifier(cdt);
    _builder.append(_versionIdentifier, "	");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    {
      EList<Property> _attributes = cdt.getAttributes();
      for(final Property attr : _attributes) {
        {
          EList<Stereotype> _appliedStereotypes = attr.getAppliedStereotypes();
          boolean _contains = _appliedStereotypes.contains(this.CON);
          if (_contains) {
            _builder.append("\t");
            _builder.append("CON ");
            String _multiplicity = this.multiplicity2Text.multiplicity(attr);
            _builder.append(_multiplicity, "	");
            _builder.append(" ");
            String _name_1 = attr.getName();
            _builder.append(_name_1, "	");
            _builder.append(" : ");
            Type _type = attr.getType();
            String _name_2 = _type.getName();
            _builder.append(_name_2, "	");
            _builder.append(" ");
            String _generate_defaultValue = this.generate_defaultValue(attr);
            _builder.append(_generate_defaultValue, "	");
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
            Object _value_1 = attr.getValue(this.CON, "definition");
            _builder.append(_value_1, "		");
            _builder.append("\"");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("dictionary:        \"");
            Object _value_2 = attr.getValue(this.CON, "dictionaryEntryName");
            _builder.append(_value_2, "		");
            _builder.append("\"");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("uniqueIdentifier:  \"");
            Object _value_3 = attr.getValue(this.CON, "uniqueIdentifier");
            _builder.append(_value_3, "		");
            _builder.append("\"");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("versionIdentifier: \"");
            Object _value_4 = attr.getValue(this.CON, "versionIdentifier");
            _builder.append(_value_4, "		");
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
              _builder.append(_multiplicity_1, "	");
              _builder.append(" ");
              String _name_3 = attr.getName();
              _builder.append(_name_3, "	");
              _builder.append(" : ");
              Type _type_1 = attr.getType();
              String _name_4 = _type_1.getName();
              _builder.append(_name_4, "	");
              _builder.append(" ");
              String _generate_defaultValue_1 = this.generate_defaultValue(attr);
              _builder.append(_generate_defaultValue_1, "	");
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
              Object _value_6 = attr.getValue(this.SUP, "definition");
              _builder.append(_value_6, "		");
              _builder.append("\"");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("\t");
              _builder.append("dictionary:        \"");
              Object _value_7 = attr.getValue(this.SUP, "dictionaryEntryName");
              _builder.append(_value_7, "		");
              _builder.append("\"");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("\t");
              _builder.append("uniqueIdentifier:  \"");
              Object _value_8 = attr.getValue(this.SUP, "uniqueIdentifier");
              _builder.append(_value_8, "		");
              _builder.append("\"");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("\t");
              _builder.append("versionIdentifier: \"");
              Object _value_9 = attr.getValue(this.SUP, "versionIdentifier");
              _builder.append(_value_9, "		");
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
  
  public String generate_defaultValue(final Property p) {
    String _xifexpression = null;
    boolean _and = false;
    String _default = p.getDefault();
    boolean _notEquals = (!Objects.equal(_default, null));
    if (!_notEquals) {
      _and = false;
    } else {
      String _default_1 = p.getDefault();
      int _length = _default_1.length();
      boolean _greaterThan = (_length > 0);
      _and = (_notEquals && _greaterThan);
    }
    if (_and) {
      String _default_2 = p.getDefault();
      return ("defaultValue: " + _default_2);
    }
    return _xifexpression;
  }
}
