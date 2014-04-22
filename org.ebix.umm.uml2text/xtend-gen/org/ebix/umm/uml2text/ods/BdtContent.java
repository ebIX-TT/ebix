package org.ebix.umm.uml2text.ods;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.List;
import org.ebix.umm.uml2text.Multiplicity2Text;
import org.ebix.umm.uml2text.UmmStereotype;
import org.ebix.umm.uml2text.UmmStereotypes;
import org.ebix.umm.uml2text.model.BDT;
import org.ebix.umm.uml2text.model.BdtLibrary;
import org.ebix.umm.uml2text.model.CON;
import org.ebix.umm.uml2text.model.SUP;
import org.ebix.umm.uml2text.model.impl.BDTImpl;
import org.ebix.umm.uml2text.model.impl.BdtLibraryImpl;
import org.ebix.umm.uml2text.model.impl.CONImpl;
import org.ebix.umm.uml2text.model.impl.SUPImpl;
import org.ebix.umm.uml2text.ods.BasicFunctions;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class BdtContent {
  @Extension
  private BdtLibrary bdtlibraryExtension;
  
  @Extension
  private BDT bdtExtension;
  
  @Extension
  private Multiplicity2Text multiplicity2Text = new Function0<Multiplicity2Text>() {
    public Multiplicity2Text apply() {
      Multiplicity2Text _multiplicity2Text = new Multiplicity2Text();
      return _multiplicity2Text;
    }
  }.apply();
  
  private UmmStereotypes ummStereotypes;
  
  private Model umlModel;
  
  private CON con;
  
  private SUP sup;
  
  private Stereotype CON;
  
  private Stereotype SUP;
  
  public BdtContent(final UmmStereotypes ummStereotypes, final Model umlModel) {
    this.ummStereotypes = ummStereotypes;
    this.umlModel = umlModel;
    BdtLibraryImpl _bdtLibraryImpl = new BdtLibraryImpl(ummStereotypes.BDTLibrary);
    this.bdtlibraryExtension = _bdtLibraryImpl;
    BDTImpl _bDTImpl = new BDTImpl(ummStereotypes.BDT);
    this.bdtExtension = _bDTImpl;
    CONImpl _cONImpl = new CONImpl(ummStereotypes.BDT_CON);
    this.con = _cONImpl;
    SUPImpl _sUPImpl = new SUPImpl(ummStereotypes.BDT_SUP);
    this.sup = _sUPImpl;
    this.CON = ummStereotypes.BDT_CON.value;
    this.SUP = ummStereotypes.BDT_SUP.value;
  }
  
  public CharSequence sheet() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<table:table table:name=\"BDT\'s\" table:style-name=\"ta1\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<table:table-column table:style-name=\"co-narrow\" table:default-cell-style-name=\"Default\"/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<table:table-column table:style-name=\"co-narrow\" table:default-cell-style-name=\"Default\"/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<table:table-column table:style-name=\"co-narrow\" table:default-cell-style-name=\"Default\"/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<table:table-column table:style-name=\"co-narrow\" table:default-cell-style-name=\"Default\"/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<table:table-column table:style-name=\"co-name\" table:default-cell-style-name=\"Default\"/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<table:table-column table:style-name=\"co1\" table:default-cell-style-name=\"Default\"/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<table:table-column table:style-name=\"co-name\" table:default-cell-style-name=\"Default\"/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<table:table-column table:style-name=\"co-term\" table:default-cell-style-name=\"Default\"/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<table:table-column table:style-name=\"co1\" table:default-cell-style-name=\"Default\"/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<table:table-column table:style-name=\"co1\" table:default-cell-style-name=\"Default\"/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<table:table-column table:style-name=\"co1\" table:default-cell-style-name=\"Default\"/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<table:table-column table:style-name=\"co1\" table:default-cell-style-name=\"Default\"/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _headerRow = this.headerRow();
    _builder.append(_headerRow, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _content = this.content();
    _builder.append(_content, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("</table:table>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence headerRow() {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _openHeaderRow = BasicFunctions.openHeaderRow();
    _builder.append(_openHeaderRow, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _headerCell = BasicFunctions.headerCell("#", "Library", "Type", "Name", "", "Cardinality", "Definition", "Business term", 
      "Version", "Language code", "Unique identifier", "Usage Rules");
    _builder.append(_headerCell, "	");
    _builder.newLineIfNotEmpty();
    CharSequence _closeHeaderRow = BasicFunctions.closeHeaderRow();
    _builder.append(_closeHeaderRow, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence content() {
    StringConcatenation _stringConcatenation = new StringConcatenation();
    final StringConcatenation builder = _stringConcatenation;
    int bdtCount = 0;
    EList<Element> _allOwnedElements = this.umlModel.allOwnedElements();
    Iterable<org.eclipse.uml2.uml.Package> _filter = Iterables.<org.eclipse.uml2.uml.Package>filter(_allOwnedElements, org.eclipse.uml2.uml.Package.class);
    final Function1<org.eclipse.uml2.uml.Package,Boolean> _function = new Function1<org.eclipse.uml2.uml.Package,Boolean>() {
        public Boolean apply(final org.eclipse.uml2.uml.Package p) {
          boolean _isBdtLibrary = BdtContent.this.bdtlibraryExtension.isBdtLibrary(p);
          return Boolean.valueOf(_isBdtLibrary);
        }
      };
    Iterable<org.eclipse.uml2.uml.Package> _filter_1 = IterableExtensions.<org.eclipse.uml2.uml.Package>filter(_filter, _function);
    for (final org.eclipse.uml2.uml.Package umlPackage : _filter_1) {
      EList<NamedElement> _ownedMembers = umlPackage.getOwnedMembers();
      Iterable<org.eclipse.uml2.uml.Class> _filter_2 = Iterables.<org.eclipse.uml2.uml.Class>filter(_ownedMembers, org.eclipse.uml2.uml.Class.class);
      final Function1<org.eclipse.uml2.uml.Class,Boolean> _function_1 = new Function1<org.eclipse.uml2.uml.Class,Boolean>() {
          public Boolean apply(final org.eclipse.uml2.uml.Class c) {
            boolean _isStereotypeApplied = c.isStereotypeApplied(BdtContent.this.ummStereotypes.BDT.value);
            return Boolean.valueOf(_isStereotypeApplied);
          }
        };
      Iterable<org.eclipse.uml2.uml.Class> _filter_3 = IterableExtensions.<org.eclipse.uml2.uml.Class>filter(_filter_2, _function_1);
      for (final org.eclipse.uml2.uml.Class bdt : _filter_3) {
        {
          int _plus = (bdtCount + 100);
          bdtCount = _plus;
          CharSequence _bdtContent = this.bdtContent(Integer.valueOf(bdtCount), bdt);
          builder.append(_bdtContent);
        }
      }
    }
    return builder;
  }
  
  public CharSequence bdtContent(final Integer count, final org.eclipse.uml2.uml.Class bdt) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _openRow = BasicFunctions.openRow("rclass");
    _builder.append(_openRow, "");
    _builder.newLineIfNotEmpty();
    String _string = count.toString();
    CharSequence _cell = BasicFunctions.cell("cclass", _string);
    _builder.append(_cell, "");
    _builder.newLineIfNotEmpty();
    Namespace _namespace = bdt.getNamespace();
    String _qualifiedName = _namespace.getQualifiedName();
    CharSequence _cell_1 = BasicFunctions.cell("cclass", _qualifiedName);
    _builder.append(_cell_1, "");
    _builder.newLineIfNotEmpty();
    CharSequence _cell_2 = BasicFunctions.cell("cclass", "BDT");
    _builder.append(_cell_2, "");
    _builder.newLineIfNotEmpty();
    String _constructedDictionaryEntryName = this.constructedDictionaryEntryName(bdt);
    CharSequence _cell_3 = BasicFunctions.cell("cclass", _constructedDictionaryEntryName);
    _builder.append(_cell_3, "");
    _builder.newLineIfNotEmpty();
    CharSequence _cell_4 = BasicFunctions.cell("cclass", "");
    _builder.append(_cell_4, "");
    _builder.newLineIfNotEmpty();
    CharSequence _cell_5 = BasicFunctions.cell("cclass-red", "");
    _builder.append(_cell_5, "");
    _builder.newLineIfNotEmpty();
    String _definition = this.bdtExtension.definition(bdt);
    CharSequence _cell_6 = BasicFunctions.cell("cclass-wrap", _definition);
    _builder.append(_cell_6, "");
    _builder.newLineIfNotEmpty();
    CharSequence _flatBusinessTerm = this.flatBusinessTerm(bdt);
    String _string_1 = _flatBusinessTerm.toString();
    String _trim = _string_1.trim();
    CharSequence _cell_7 = BasicFunctions.cell("cclass", _trim);
    _builder.append(_cell_7, "");
    _builder.newLineIfNotEmpty();
    String _versionIdentifier = this.bdtExtension.versionIdentifier(bdt);
    CharSequence _cell_8 = BasicFunctions.cell("cclass", _versionIdentifier);
    _builder.append(_cell_8, "");
    _builder.newLineIfNotEmpty();
    String _languageCode = this.bdtExtension.languageCode(bdt);
    CharSequence _cell_9 = BasicFunctions.cell("cclass", _languageCode);
    _builder.append(_cell_9, "");
    _builder.newLineIfNotEmpty();
    String _uniqueIdentifier = this.bdtExtension.uniqueIdentifier(bdt);
    CharSequence _cell_10 = BasicFunctions.cell("cclass", _uniqueIdentifier);
    _builder.append(_cell_10, "");
    _builder.newLineIfNotEmpty();
    CharSequence _cell_11 = BasicFunctions.cell("cclass", "");
    _builder.append(_cell_11, "");
    _builder.newLineIfNotEmpty();
    CharSequence _closeRow = BasicFunctions.closeRow();
    _builder.append(_closeRow, "");
    _builder.newLineIfNotEmpty();
    CharSequence _attributeContent = this.attributeContent((count).intValue(), bdt);
    _builder.append(_attributeContent, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence attributeContent(final int count, final org.eclipse.uml2.uml.Class abie) {
    StringConcatenation _stringConcatenation = new StringConcatenation();
    final StringConcatenation builder = _stringConcatenation;
    int attrCount = count;
    EList<Property> _attributes = abie.getAttributes();
    for (final Property attr : _attributes) {
      {
        int _plus = (attrCount + 1);
        attrCount = _plus;
        boolean _isCON = this.con.isCON(attr);
        if (_isCON) {
          CharSequence _conContent = this.conContent(Integer.valueOf(attrCount), attr);
          builder.append(_conContent);
        } else {
          boolean _isSUP = this.sup.isSUP(attr);
          if (_isSUP) {
            CharSequence _supContent = this.supContent(Integer.valueOf(attrCount), attr);
            builder.append(_supContent);
          }
        }
      }
    }
    return builder;
  }
  
  public CharSequence conContent(final Integer count, final Property property) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _openRow = BasicFunctions.openRow("rattr");
    _builder.append(_openRow, "");
    _builder.newLineIfNotEmpty();
    String _string = count.toString();
    CharSequence _cell = BasicFunctions.cell("cattr", _string);
    _builder.append(_cell, "");
    _builder.newLineIfNotEmpty();
    org.eclipse.uml2.uml.Class _class_ = property.getClass_();
    Namespace _namespace = _class_.getNamespace();
    String _qualifiedName = _namespace.getQualifiedName();
    CharSequence _cell_1 = BasicFunctions.cell("cattr", _qualifiedName);
    _builder.append(_cell_1, "");
    _builder.newLineIfNotEmpty();
    CharSequence _cell_2 = BasicFunctions.cell("cattr", "");
    _builder.append(_cell_2, "");
    _builder.newLineIfNotEmpty();
    CharSequence _cell_3 = BasicFunctions.cell("cattr-blue", "CON");
    _builder.append(_cell_3, "");
    _builder.newLineIfNotEmpty();
    String _constructedDictionaryEntryName = this.constructedDictionaryEntryName(property, this.ummStereotypes.BDT_CON);
    CharSequence _cell_4 = BasicFunctions.cell("cattr", _constructedDictionaryEntryName);
    _builder.append(_cell_4, "");
    _builder.newLineIfNotEmpty();
    String _multiplicity = this.multiplicity2Text.multiplicity(property);
    CharSequence _cell_5 = BasicFunctions.cell("cattr", _multiplicity);
    _builder.append(_cell_5, "");
    _builder.newLineIfNotEmpty();
    String _definition = this.con.definition(property);
    CharSequence _cell_6 = BasicFunctions.cell("cattr-wrap", _definition);
    _builder.append(_cell_6, "");
    _builder.newLineIfNotEmpty();
    CharSequence _flatBusinessTerm = this.flatBusinessTerm(property, this.ummStereotypes.BDT_CON);
    String _string_1 = _flatBusinessTerm.toString();
    String _trim = _string_1.trim();
    CharSequence _cell_7 = BasicFunctions.cell("cattr", _trim);
    _builder.append(_cell_7, "");
    _builder.newLineIfNotEmpty();
    String _versionIdentifier = this.con.versionIdentifier(property);
    CharSequence _cell_8 = BasicFunctions.cell("cattr", _versionIdentifier);
    _builder.append(_cell_8, "");
    _builder.newLineIfNotEmpty();
    String _languageCode = this.con.languageCode(property);
    CharSequence _cell_9 = BasicFunctions.cell("cattr", _languageCode);
    _builder.append(_cell_9, "");
    _builder.newLineIfNotEmpty();
    String _uniqueIdentifier = this.con.uniqueIdentifier(property);
    CharSequence _cell_10 = BasicFunctions.cell("cattr", _uniqueIdentifier);
    _builder.append(_cell_10, "");
    _builder.newLineIfNotEmpty();
    CharSequence _cell_11 = BasicFunctions.cell("cattr", "");
    _builder.append(_cell_11, "");
    _builder.newLineIfNotEmpty();
    CharSequence _closeRow = BasicFunctions.closeRow();
    _builder.append(_closeRow, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence supContent(final Integer count, final Property property) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _openRow = BasicFunctions.openRow("rattr");
    _builder.append(_openRow, "");
    _builder.newLineIfNotEmpty();
    String _string = count.toString();
    CharSequence _cell = BasicFunctions.cell("cattr", _string);
    _builder.append(_cell, "");
    _builder.newLineIfNotEmpty();
    org.eclipse.uml2.uml.Class _class_ = property.getClass_();
    Namespace _namespace = _class_.getNamespace();
    String _qualifiedName = _namespace.getQualifiedName();
    CharSequence _cell_1 = BasicFunctions.cell("cattr", _qualifiedName);
    _builder.append(_cell_1, "");
    _builder.newLineIfNotEmpty();
    CharSequence _cell_2 = BasicFunctions.cell("cattr", "");
    _builder.append(_cell_2, "");
    _builder.newLineIfNotEmpty();
    CharSequence _cell_3 = BasicFunctions.cell("cattr-blue", "SUP");
    _builder.append(_cell_3, "");
    _builder.newLineIfNotEmpty();
    String _constructedDictionaryEntryName = this.constructedDictionaryEntryName(property, this.ummStereotypes.BDT_SUP);
    CharSequence _cell_4 = BasicFunctions.cell("cattr", _constructedDictionaryEntryName);
    _builder.append(_cell_4, "");
    _builder.newLineIfNotEmpty();
    String _multiplicity = this.multiplicity2Text.multiplicity(property);
    CharSequence _cell_5 = BasicFunctions.cell("cattr", _multiplicity);
    _builder.append(_cell_5, "");
    _builder.newLineIfNotEmpty();
    String _definition = this.sup.definition(property);
    CharSequence _cell_6 = BasicFunctions.cell("cattr-wrap", _definition);
    _builder.append(_cell_6, "");
    _builder.newLineIfNotEmpty();
    CharSequence _flatBusinessTerm = this.flatBusinessTerm(property, this.ummStereotypes.BDT_SUP);
    String _string_1 = _flatBusinessTerm.toString();
    String _trim = _string_1.trim();
    CharSequence _cell_7 = BasicFunctions.cell("cattr", _trim);
    _builder.append(_cell_7, "");
    _builder.newLineIfNotEmpty();
    String _versionIdentifier = this.sup.versionIdentifier(property);
    CharSequence _cell_8 = BasicFunctions.cell("cattr", _versionIdentifier);
    _builder.append(_cell_8, "");
    _builder.newLineIfNotEmpty();
    String _languageCode = this.sup.languageCode(property);
    CharSequence _cell_9 = BasicFunctions.cell("cattr", _languageCode);
    _builder.append(_cell_9, "");
    _builder.newLineIfNotEmpty();
    String _uniqueIdentifier = this.sup.uniqueIdentifier(property);
    CharSequence _cell_10 = BasicFunctions.cell("cattr", _uniqueIdentifier);
    _builder.append(_cell_10, "");
    _builder.newLineIfNotEmpty();
    CharSequence _cell_11 = BasicFunctions.cell("cattr", "");
    _builder.append(_cell_11, "");
    _builder.newLineIfNotEmpty();
    CharSequence _closeRow = BasicFunctions.closeRow();
    _builder.append(_closeRow, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public String constructedDictionaryEntryName(final org.eclipse.uml2.uml.Class bdt) {
    String _dictionaryEntryName = this.bdtExtension.dictionaryEntryName(bdt);
    int _length = _dictionaryEntryName.length();
    boolean _greaterThan = (_length > 0);
    if (_greaterThan) {
      return this.bdtExtension.dictionaryEntryName(bdt);
    } else {
      String _name = bdt.getName();
      String _replaceAll = _name.replaceAll("_", "_ ");
      return (_replaceAll + ". Type");
    }
  }
  
  public String constructedDictionaryEntryName(final Property property, final UmmStereotype stereotype) {
    String _stringValue = stereotype.getStringValue(property, "dictionaryEntryName");
    int _length = _stringValue.length();
    boolean _greaterThan = (_length > 0);
    if (_greaterThan) {
      return stereotype.getStringValue(property, "dictionaryEntryName");
    } else {
      String typeName = "-no type-";
      Type _type = property.getType();
      boolean _notEquals = (!Objects.equal(_type, null));
      if (_notEquals) {
        Type _type_1 = property.getType();
        String _name = _type_1.getName();
        String _replaceAll = _name.replaceAll("_", "_ ");
        typeName = _replaceAll;
      }
      org.eclipse.uml2.uml.Class _class_ = property.getClass_();
      String _constructedDictionaryEntryName = this.constructedDictionaryEntryName(_class_);
      String _plus = (_constructedDictionaryEntryName + ". ");
      String _name_1 = property.getName();
      String _replaceAll_1 = _name_1.replaceAll("_", "_ ");
      String _plus_1 = (_plus + _replaceAll_1);
      String _plus_2 = (_plus_1 + ". ");
      return (_plus_2 + typeName);
    }
  }
  
  public CharSequence flatBusinessTerm(final org.eclipse.uml2.uml.Class clazz) {
    StringConcatenation _builder = new StringConcatenation();
    {
      List<String> _businessTerm = this.bdtExtension.businessTerm(clazz);
      boolean _hasElements = false;
      for(final String term : _businessTerm) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        _builder.append(term, "");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence flatBusinessTerm(final Property property, final UmmStereotype stereotype) {
    StringConcatenation _builder = new StringConcatenation();
    {
      List<String> _listOfStringValue = stereotype.getListOfStringValue(property, "businessTerm");
      boolean _hasElements = false;
      for(final String term : _listOfStringValue) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        _builder.append(term, "");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
}
