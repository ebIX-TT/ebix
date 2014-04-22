package org.ebix.umm.uml2text;

import com.google.common.collect.Iterables;
import java.util.List;
import org.ebix.umm.uml2text.Comment2Text;
import org.ebix.umm.uml2text.Name2Text;
import org.ebix.umm.uml2text.UmmStereotypes;
import org.ebix.umm.uml2text.file.FileWriter;
import org.ebix.umm.uml2text.model.EnumLibrary;
import org.ebix.umm.uml2text.model.impl.EnumLibraryImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class EnumLibrary2Text {
  @Extension
  private EnumLibrary enumlibraryExtension;
  
  @Extension
  private Comment2Text comment2Text = new Function0<Comment2Text>() {
    public Comment2Text apply() {
      Comment2Text _comment2Text = new Comment2Text();
      return _comment2Text;
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
  
  private Stereotype ENUM;
  
  private Stereotype Original;
  
  private Stereotype Subset;
  
  private Stereotype Assembled;
  
  private Stereotype CodelistEntry;
  
  public EnumLibrary2Text(final UmmStereotypes ummStereotypes) {
    this.ummStereotypes = ummStereotypes;
    EnumLibraryImpl _enumLibraryImpl = new EnumLibraryImpl(ummStereotypes.ENUMLibrary);
    this.enumlibraryExtension = _enumLibraryImpl;
    this.ENUM = ummStereotypes.ENUM.value;
    this.Original = ummStereotypes.Original.value;
    this.Subset = ummStereotypes.Subset.value;
    this.Assembled = ummStereotypes.Assembled.value;
    this.CodelistEntry = ummStereotypes.CodelistEntry.value;
  }
  
  public String generate(final Model umlModel, final FileWriter fw) {
    String _xblockexpression = null;
    {
      InputOutput.<String>println("Generating ENUMLibraries ...");
      EList<Element> _allOwnedElements = umlModel.allOwnedElements();
      Iterable<org.eclipse.uml2.uml.Package> _filter = Iterables.<org.eclipse.uml2.uml.Package>filter(_allOwnedElements, org.eclipse.uml2.uml.Package.class);
      final Function1<org.eclipse.uml2.uml.Package,Boolean> _function = new Function1<org.eclipse.uml2.uml.Package,Boolean>() {
          public Boolean apply(final org.eclipse.uml2.uml.Package p) {
            boolean _isEnumLibrary = EnumLibrary2Text.this.enumlibraryExtension.isEnumLibrary(p);
            return Boolean.valueOf(_isEnumLibrary);
          }
        };
      Iterable<org.eclipse.uml2.uml.Package> _filter_1 = IterableExtensions.<org.eclipse.uml2.uml.Package>filter(_filter, _function);
      for (final org.eclipse.uml2.uml.Package umlPackage : _filter_1) {
        {
          String _name = umlPackage.getName();
          String _plus = ("ENUMLibrary " + _name);
          InputOutput.<String>println(_plus);
          String _qualifiedName = umlPackage.getQualifiedName();
          String _fileName = this.name2Text.fileName(_qualifiedName);
          CharSequence _generateEnumLibrary = this.generateEnumLibrary(umlPackage);
          fw.writeFile(_fileName, _generateEnumLibrary);
        }
      }
      String _println = InputOutput.<String>println("Done.");
      _xblockexpression = (_println);
    }
    return _xblockexpression;
  }
  
  public CharSequence generateEnumLibrary(final org.eclipse.uml2.uml.Package umlPackage) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("ENUMLibrary \"");
    String _qualifiedName = umlPackage.getQualifiedName();
    _builder.append(_qualifiedName, "");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("businessTerm:      ");
    {
      List<String> _businessTerm = this.enumlibraryExtension.businessTerm(umlPackage);
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
      List<String> _copyright = this.enumlibraryExtension.copyright(umlPackage);
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
      List<String> _owner = this.enumlibraryExtension.owner(umlPackage);
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
      List<String> _reference = this.enumlibraryExtension.reference(umlPackage);
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
    String _uniqueIdentifier = this.enumlibraryExtension.uniqueIdentifier(umlPackage);
    _builder.append(_uniqueIdentifier, "	");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("versionIdentifier: \"");
    String _versionIdentifier = this.enumlibraryExtension.versionIdentifier(umlPackage);
    _builder.append(_versionIdentifier, "	");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("baseURN:           \"");
    String _baseURN = this.enumlibraryExtension.baseURN(umlPackage);
    _builder.append(_baseURN, "	");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("namespacePrefix:   \"");
    String _namespacePrefix = this.enumlibraryExtension.namespacePrefix(umlPackage);
    _builder.append(_namespacePrefix, "	");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      EList<Element> _allOwnedElements = umlPackage.allOwnedElements();
      Iterable<Enumeration> _filter = Iterables.<Enumeration>filter(_allOwnedElements, Enumeration.class);
      final Function1<Enumeration,Boolean> _function = new Function1<Enumeration,Boolean>() {
          public Boolean apply(final Enumeration e) {
            boolean _isStereotypeApplied = e.isStereotypeApplied(EnumLibrary2Text.this.ENUM);
            return Boolean.valueOf(_isStereotypeApplied);
          }
        };
      Iterable<Enumeration> _filter_1 = IterableExtensions.<Enumeration>filter(_filter, _function);
      for(final Enumeration e : _filter_1) {
        _builder.append("\t");
        CharSequence _generateEnum = this.generateEnum(e);
        _builder.append(_generateEnum, "	");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.newLine();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateEnum(final Enumeration e) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isStereotypeApplied = e.isStereotypeApplied(this.Assembled);
      if (_isStereotypeApplied) {
        _builder.append("Assembled ");
        String _name = e.getName();
        _builder.append(_name, "");
        _builder.newLineIfNotEmpty();
        _builder.append("{");
        _builder.newLine();
        _builder.append("\t");
        CharSequence _enumTags = this.enumTags(e);
        _builder.append(_enumTags, "	");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        {
          EList<Classifier> _generals = e.getGenerals();
          Iterable<Enumeration> _filter = Iterables.<Enumeration>filter(_generals, Enumeration.class);
          final Function1<Enumeration,Boolean> _function = new Function1<Enumeration,Boolean>() {
              public Boolean apply(final Enumeration g) {
                boolean _isStereotypeApplied = g.isStereotypeApplied(EnumLibrary2Text.this.Original);
                return Boolean.valueOf(_isStereotypeApplied);
              }
            };
          Iterable<Enumeration> _filter_1 = IterableExtensions.<Enumeration>filter(_filter, _function);
          boolean _hasElements = false;
          for(final Enumeration o : _filter_1) {
            if (!_hasElements) {
              _hasElements = true;
              _builder.append("originals: ", "	");
            } else {
              _builder.appendImmediate(", ", "	");
            }
            String _enumName = this.enumName(o);
            _builder.append(_enumName, "	");
          }
        }
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        {
          EList<Classifier> _generals_1 = e.getGenerals();
          Iterable<Enumeration> _filter_2 = Iterables.<Enumeration>filter(_generals_1, Enumeration.class);
          final Function1<Enumeration,Boolean> _function_1 = new Function1<Enumeration,Boolean>() {
              public Boolean apply(final Enumeration g) {
                boolean _isStereotypeApplied = g.isStereotypeApplied(EnumLibrary2Text.this.Subset);
                return Boolean.valueOf(_isStereotypeApplied);
              }
            };
          Iterable<Enumeration> _filter_3 = IterableExtensions.<Enumeration>filter(_filter_2, _function_1);
          boolean _hasElements_1 = false;
          for(final Enumeration o_1 : _filter_3) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
              _builder.append("subsets: ", "	");
            } else {
              _builder.appendImmediate(", ", "	");
            }
            String _enumName_1 = this.enumName(o_1);
            _builder.append(_enumName_1, "	");
          }
        }
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        CharSequence _enumMembers = this.enumMembers(e);
        _builder.append(_enumMembers, "	");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
      } else {
        boolean _isStereotypeApplied_1 = e.isStereotypeApplied(this.Subset);
        if (_isStereotypeApplied_1) {
          _builder.append("Subset ");
          String _enumName_2 = this.enumName(e);
          _builder.append(_enumName_2, "");
          _builder.newLineIfNotEmpty();
          _builder.append("{");
          _builder.newLine();
          _builder.append("\t");
          CharSequence _enumTags_1 = this.enumTags(e);
          _builder.append(_enumTags_1, "	");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          CharSequence _enumMembers_1 = this.enumMembers(e);
          _builder.append(_enumMembers_1, "	");
          _builder.newLineIfNotEmpty();
          _builder.append("}");
          _builder.newLine();
        } else {
          boolean _isStereotypeApplied_2 = e.isStereotypeApplied(this.Original);
          if (_isStereotypeApplied_2) {
            _builder.append("Original ");
            String _enumName_3 = this.enumName(e);
            _builder.append(_enumName_3, "");
            _builder.newLineIfNotEmpty();
            _builder.append("{");
            _builder.newLine();
            _builder.append("\t");
            CharSequence _enumTags_2 = this.enumTags(e);
            _builder.append(_enumTags_2, "	");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            CharSequence _enumMembers_2 = this.enumMembers(e);
            _builder.append(_enumMembers_2, "	");
            _builder.newLineIfNotEmpty();
            _builder.append("}");
            _builder.newLine();
          }
        }
      }
    }
    return _builder;
  }
  
  public String enumName(final Enumeration e) {
    Object _value = e.getValue(this.ENUM, "codeListIdentifier");
    if ((_value instanceof String)) {
      Object _value_1 = e.getValue(this.ENUM, "codeListIdentifier");
      final String idValue = ((String) _value_1);
      int _length = idValue.length();
      boolean _greaterThan = (_length > 0);
      if (_greaterThan) {
        String _plus = (idValue + "_");
        String _name = e.getName();
        return (_plus + _name);
      }
    }
    return e.getName();
  }
  
  public CharSequence enumTags(final Enumeration e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("businessTerm:              ");
    {
      Object _value = e.getValue(this.ENUM, "businessTerm");
      boolean _hasElements = false;
      for(final String term : ((List<String>) _value)) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        _builder.append("\"");
        _builder.append(term, "");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("definition:                \"");
    Object _value_1 = e.getValue(this.ENUM, "definition");
    _builder.append(_value_1, "");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("codeListAgencyIdentifier:  \"");
    Object _value_2 = e.getValue(this.ENUM, "codeListAgencyIdentifier");
    _builder.append(_value_2, "");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("codeListName:              \"");
    Object _value_3 = e.getValue(this.ENUM, "codeListName");
    _builder.append(_value_3, "");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("codeListIdentifier:        \"");
    Object _value_4 = e.getValue(this.ENUM, "codeListIdentifier");
    _builder.append(_value_4, "");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("dictionary:                \"");
    Object _value_5 = e.getValue(this.ENUM, "dictionaryEntryName");
    _builder.append(_value_5, "");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("uniqueIdentifier:          \"");
    Object _value_6 = e.getValue(this.ENUM, "uniqueIdentifier");
    _builder.append(_value_6, "");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("versionIdentifier:         \"");
    Object _value_7 = e.getValue(this.ENUM, "versionIdentifier");
    _builder.append(_value_7, "");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence enumMembers(final Enumeration e) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<EnumerationLiteral> _ownedLiterals = e.getOwnedLiterals();
      final Function1<EnumerationLiteral,Boolean> _function = new Function1<EnumerationLiteral,Boolean>() {
          public Boolean apply(final EnumerationLiteral l) {
            boolean _isStereotypeApplied = l.isStereotypeApplied(EnumLibrary2Text.this.CodelistEntry);
            return Boolean.valueOf(_isStereotypeApplied);
          }
        };
      Iterable<EnumerationLiteral> _filter = IterableExtensions.<EnumerationLiteral>filter(_ownedLiterals, _function);
      for(final EnumerationLiteral codelistEntry : _filter) {
        _builder.append("CodelistEntry \"");
        String _name = codelistEntry.getName();
        _builder.append(_name, "");
        _builder.append("\" \"");
        String _codeName = this.codeName(codelistEntry);
        _builder.append(_codeName, "");
        _builder.append("\"  ");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public String codeName(final EnumerationLiteral l) {
    final Object codeName = l.getValue(this.CodelistEntry, "codeName");
    if ((codeName instanceof String)) {
      return this.comment2Text.strip(((String) codeName));
    }
    return "";
  }
}
