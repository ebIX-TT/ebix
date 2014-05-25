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
package org.ebix.umm.uml2text.ods;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.List;
import org.ebix.umm.uml2text.Multiplicity2Text;
import org.ebix.umm.uml2text.UmmStereotypes;
import org.ebix.umm.uml2text.model.ACC;
import org.ebix.umm.uml2text.model.ASCC;
import org.ebix.umm.uml2text.model.BCC;
import org.ebix.umm.uml2text.model.CcLibrary;
import org.ebix.umm.uml2text.model.impl.ACCImpl;
import org.ebix.umm.uml2text.model.impl.ASCCImpl;
import org.ebix.umm.uml2text.model.impl.BCCImpl;
import org.ebix.umm.uml2text.model.impl.CcLibraryImpl;
import org.ebix.umm.uml2text.ods.BasicFunctions;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class CcContent {
  @Extension
  private CcLibrary cclibraryExtension;
  
  @Extension
  private ACC accExtension;
  
  @Extension
  private ASCC asccExtension;
  
  @Extension
  private BCC bccExtension;
  
  @Extension
  private Multiplicity2Text multiplicity2Text = new Multiplicity2Text();
  
  private UmmStereotypes ummStereotypes;
  
  private Model umlModel;
  
  public CcContent(final UmmStereotypes ummStereotypes, final Model umlModel) {
    this.ummStereotypes = ummStereotypes;
    this.umlModel = umlModel;
    CcLibraryImpl _ccLibraryImpl = new CcLibraryImpl(ummStereotypes.CCLibrary);
    this.cclibraryExtension = _ccLibraryImpl;
    ACCImpl _aCCImpl = new ACCImpl(ummStereotypes.ACC);
    this.accExtension = _aCCImpl;
    ASCCImpl _aSCCImpl = new ASCCImpl(ummStereotypes.ASCC);
    this.asccExtension = _aSCCImpl;
    BCCImpl _bCCImpl = new BCCImpl(ummStereotypes.BCC);
    this.bccExtension = _bCCImpl;
  }
  
  public CharSequence sheet() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<table:table table:name=\"CC\'s\" table:style-name=\"ta1\">");
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
    _builder.append("\t\t\t\t");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _headerRow = this.headerRow();
    _builder.append(_headerRow, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _content = this.content();
    _builder.append(_content, "\t");
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
      "Sequencing key", "Version", "Unique identifier", "Usage Rules");
    _builder.append(_headerCell, "\t");
    _builder.newLineIfNotEmpty();
    CharSequence _closeHeaderRow = BasicFunctions.closeHeaderRow();
    _builder.append(_closeHeaderRow, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence content() {
    final StringConcatenation builder = new StringConcatenation();
    int accCount = 0;
    EList<Element> _allOwnedElements = this.umlModel.allOwnedElements();
    Iterable<org.eclipse.uml2.uml.Package> _filter = Iterables.<org.eclipse.uml2.uml.Package>filter(_allOwnedElements, org.eclipse.uml2.uml.Package.class);
    final Function1<org.eclipse.uml2.uml.Package,Boolean> _function = new Function1<org.eclipse.uml2.uml.Package,Boolean>() {
      public Boolean apply(final org.eclipse.uml2.uml.Package p) {
        return Boolean.valueOf(CcContent.this.cclibraryExtension.isCcLibrary(p));
      }
    };
    Iterable<org.eclipse.uml2.uml.Package> _filter_1 = IterableExtensions.<org.eclipse.uml2.uml.Package>filter(_filter, _function);
    for (final org.eclipse.uml2.uml.Package umlPackage : _filter_1) {
      EList<NamedElement> _ownedMembers = umlPackage.getOwnedMembers();
      Iterable<org.eclipse.uml2.uml.Class> _filter_2 = Iterables.<org.eclipse.uml2.uml.Class>filter(_ownedMembers, org.eclipse.uml2.uml.Class.class);
      final Function1<org.eclipse.uml2.uml.Class,Boolean> _function_1 = new Function1<org.eclipse.uml2.uml.Class,Boolean>() {
        public Boolean apply(final org.eclipse.uml2.uml.Class c) {
          return Boolean.valueOf(c.isStereotypeApplied(CcContent.this.ummStereotypes.ACC.value));
        }
      };
      Iterable<org.eclipse.uml2.uml.Class> _filter_3 = IterableExtensions.<org.eclipse.uml2.uml.Class>filter(_filter_2, _function_1);
      for (final org.eclipse.uml2.uml.Class acc : _filter_3) {
        {
          accCount = (accCount + 100);
          CharSequence _accContent = this.accContent(Integer.valueOf(accCount), acc);
          builder.append(_accContent);
        }
      }
    }
    return builder;
  }
  
  public CharSequence accContent(final Integer count, final org.eclipse.uml2.uml.Class acc) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _openRow = BasicFunctions.openRow("rclass");
    _builder.append(_openRow, "");
    _builder.newLineIfNotEmpty();
    String _string = count.toString();
    CharSequence _cell = BasicFunctions.cell("cclass", _string);
    _builder.append(_cell, "");
    _builder.newLineIfNotEmpty();
    Namespace _namespace = acc.getNamespace();
    String _qualifiedName = _namespace.getQualifiedName();
    CharSequence _cell_1 = BasicFunctions.cell("cclass", _qualifiedName);
    _builder.append(_cell_1, "");
    _builder.newLineIfNotEmpty();
    CharSequence _cell_2 = BasicFunctions.cell("cclass", "ACC");
    _builder.append(_cell_2, "");
    _builder.newLineIfNotEmpty();
    String _constructedDictionaryEntryName = this.constructedDictionaryEntryName(acc);
    CharSequence _cell_3 = BasicFunctions.cell("cclass", _constructedDictionaryEntryName);
    _builder.append(_cell_3, "");
    _builder.newLineIfNotEmpty();
    CharSequence _cell_4 = BasicFunctions.cell("cclass", "");
    _builder.append(_cell_4, "");
    _builder.newLineIfNotEmpty();
    CharSequence _cell_5 = BasicFunctions.cell("cclass-red", "");
    _builder.append(_cell_5, "");
    _builder.newLineIfNotEmpty();
    String _definition = this.accExtension.definition(acc);
    CharSequence _cell_6 = BasicFunctions.cell("cclass-wrap", _definition);
    _builder.append(_cell_6, "");
    _builder.newLineIfNotEmpty();
    CharSequence _flatBusinessTerm = this.flatBusinessTerm(acc);
    String _string_1 = _flatBusinessTerm.toString();
    String _trim = _string_1.trim();
    CharSequence _cell_7 = BasicFunctions.cell("cclass", _trim);
    _builder.append(_cell_7, "");
    _builder.newLineIfNotEmpty();
    CharSequence _cell_8 = BasicFunctions.cell("cclass-red", "");
    _builder.append(_cell_8, "");
    _builder.newLineIfNotEmpty();
    String _versionIdentifier = this.accExtension.versionIdentifier(acc);
    CharSequence _cell_9 = BasicFunctions.cell("cclass", _versionIdentifier);
    _builder.append(_cell_9, "");
    _builder.newLineIfNotEmpty();
    String _uniqueIdentifier = this.accExtension.uniqueIdentifier(acc);
    CharSequence _cell_10 = BasicFunctions.cell("cclass", _uniqueIdentifier);
    _builder.append(_cell_10, "");
    _builder.newLineIfNotEmpty();
    CharSequence _cell_11 = BasicFunctions.cell("cclass", "");
    _builder.append(_cell_11, "");
    _builder.newLineIfNotEmpty();
    CharSequence _closeRow = BasicFunctions.closeRow();
    _builder.append(_closeRow, "");
    _builder.newLineIfNotEmpty();
    CharSequence _attributeContent = this.attributeContent((count).intValue(), acc);
    _builder.append(_attributeContent, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence attributeContent(final int count, final org.eclipse.uml2.uml.Class acc) {
    final StringConcatenation builder = new StringConcatenation();
    int attrCount = count;
    EList<Property> _attributes = acc.getAttributes();
    for (final Property attr : _attributes) {
      {
        attrCount = (attrCount + 1);
        Association _association = attr.getAssociation();
        boolean _notEquals = (!Objects.equal(_association, null));
        if (_notEquals) {
          CharSequence _asccContent = this.asccContent(Integer.valueOf(attrCount), attr);
          builder.append(_asccContent);
        } else {
          CharSequence _bccContent = this.bccContent(Integer.valueOf(attrCount), attr);
          builder.append(_bccContent);
        }
      }
    }
    return builder;
  }
  
  public CharSequence bccContent(final Integer count, final Property bcc) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _openRow = BasicFunctions.openRow("rattr");
    _builder.append(_openRow, "");
    _builder.newLineIfNotEmpty();
    String _string = count.toString();
    CharSequence _cell = BasicFunctions.cell("cattr", _string);
    _builder.append(_cell, "");
    _builder.newLineIfNotEmpty();
    org.eclipse.uml2.uml.Class _class_ = bcc.getClass_();
    Namespace _namespace = _class_.getNamespace();
    String _qualifiedName = _namespace.getQualifiedName();
    CharSequence _cell_1 = BasicFunctions.cell("cattr", _qualifiedName);
    _builder.append(_cell_1, "");
    _builder.newLineIfNotEmpty();
    CharSequence _cell_2 = BasicFunctions.cell("cattr", "");
    _builder.append(_cell_2, "");
    _builder.newLineIfNotEmpty();
    CharSequence _cell_3 = BasicFunctions.cell("cattr-blue", "BCC");
    _builder.append(_cell_3, "");
    _builder.newLineIfNotEmpty();
    String _constructedDictionaryEntryName = this.constructedDictionaryEntryName(bcc);
    CharSequence _cell_4 = BasicFunctions.cell("cattr", _constructedDictionaryEntryName);
    _builder.append(_cell_4, "");
    _builder.newLineIfNotEmpty();
    String _multiplicity = this.multiplicity2Text.multiplicity(bcc);
    CharSequence _cell_5 = BasicFunctions.cell("cattr", _multiplicity);
    _builder.append(_cell_5, "");
    _builder.newLineIfNotEmpty();
    String _definition = this.bccExtension.definition(bcc);
    CharSequence _cell_6 = BasicFunctions.cell("cattr-wrap", _definition);
    _builder.append(_cell_6, "");
    _builder.newLineIfNotEmpty();
    CharSequence _flatBusinessTerm = this.flatBusinessTerm(bcc);
    String _string_1 = _flatBusinessTerm.toString();
    String _trim = _string_1.trim();
    CharSequence _cell_7 = BasicFunctions.cell("cattr", _trim);
    _builder.append(_cell_7, "");
    _builder.newLineIfNotEmpty();
    String _sequencingKey = this.bccExtension.sequencingKey(bcc);
    CharSequence _cell_8 = BasicFunctions.cell("cattr", _sequencingKey);
    _builder.append(_cell_8, "");
    _builder.newLineIfNotEmpty();
    String _versionIdentifier = this.bccExtension.versionIdentifier(bcc);
    CharSequence _cell_9 = BasicFunctions.cell("cattr", _versionIdentifier);
    _builder.append(_cell_9, "");
    _builder.newLineIfNotEmpty();
    String _uniqueIdentifier = this.bccExtension.uniqueIdentifier(bcc);
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
  
  public CharSequence asccContent(final Integer count, final Property property) {
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
    CharSequence _cell_3 = BasicFunctions.cell("cattr-blue", "ASCC");
    _builder.append(_cell_3, "");
    _builder.newLineIfNotEmpty();
    Association _association = property.getAssociation();
    String _constructedDictionaryEntryName = this.constructedDictionaryEntryName(property, _association);
    CharSequence _cell_4 = BasicFunctions.cell("cattr", _constructedDictionaryEntryName);
    _builder.append(_cell_4, "");
    _builder.newLineIfNotEmpty();
    String _multiplicity = this.multiplicity2Text.multiplicity(property);
    CharSequence _cell_5 = BasicFunctions.cell("cattr", _multiplicity);
    _builder.append(_cell_5, "");
    _builder.newLineIfNotEmpty();
    Association _association_1 = property.getAssociation();
    String _definition = this.asccExtension.definition(_association_1);
    CharSequence _cell_6 = BasicFunctions.cell("cattr-wrap", _definition);
    _builder.append(_cell_6, "");
    _builder.newLineIfNotEmpty();
    Association _association_2 = property.getAssociation();
    CharSequence _flatBusinessTerm = this.flatBusinessTerm(_association_2);
    String _string_1 = _flatBusinessTerm.toString();
    String _trim = _string_1.trim();
    CharSequence _cell_7 = BasicFunctions.cell("cattr", _trim);
    _builder.append(_cell_7, "");
    _builder.newLineIfNotEmpty();
    Association _association_3 = property.getAssociation();
    String _sequencingKey = this.asccExtension.sequencingKey(_association_3);
    CharSequence _cell_8 = BasicFunctions.cell("cattr", _sequencingKey);
    _builder.append(_cell_8, "");
    _builder.newLineIfNotEmpty();
    Association _association_4 = property.getAssociation();
    String _versionIdentifier = this.asccExtension.versionIdentifier(_association_4);
    CharSequence _cell_9 = BasicFunctions.cell("cattr", _versionIdentifier);
    _builder.append(_cell_9, "");
    _builder.newLineIfNotEmpty();
    Association _association_5 = property.getAssociation();
    String _uniqueIdentifier = this.asccExtension.uniqueIdentifier(_association_5);
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
  
  public String constructedDictionaryEntryName(final org.eclipse.uml2.uml.Class acc) {
    String _dictionaryEntryName = this.accExtension.dictionaryEntryName(acc);
    int _length = _dictionaryEntryName.length();
    boolean _greaterThan = (_length > 0);
    if (_greaterThan) {
      return this.accExtension.dictionaryEntryName(acc);
    } else {
      String _name = acc.getName();
      String _replaceAll = _name.replaceAll("_", "_ ");
      return (_replaceAll + ". Details");
    }
  }
  
  public String constructedDictionaryEntryName(final Property bcc) {
    String _dictionaryEntryName = this.bccExtension.dictionaryEntryName(bcc);
    int _length = _dictionaryEntryName.length();
    boolean _greaterThan = (_length > 0);
    if (_greaterThan) {
      return this.bccExtension.dictionaryEntryName(bcc);
    } else {
      String typeName = "-no type-";
      Type _type = bcc.getType();
      boolean _notEquals = (!Objects.equal(_type, null));
      if (_notEquals) {
        Type _type_1 = bcc.getType();
        String _name = _type_1.getName();
        String _replaceAll = _name.replaceAll("_", "_ ");
        String _replaceAll_1 = _replaceAll.replaceAll("Type", "");
        typeName = _replaceAll_1;
      }
      org.eclipse.uml2.uml.Class _class_ = bcc.getClass_();
      String _constructedDictionaryEntryName = this.constructedDictionaryEntryName(_class_);
      String _plus = (_constructedDictionaryEntryName + ". ");
      String _name_1 = bcc.getName();
      String _replaceAll_2 = _name_1.replaceAll("_", "_ ");
      String _plus_1 = (_plus + _replaceAll_2);
      String _plus_2 = (_plus_1 + ". ");
      return (_plus_2 + typeName);
    }
  }
  
  public String constructedDictionaryEntryName(final Property property, final Association ascc) {
    String _dictionaryEntryName = this.asccExtension.dictionaryEntryName(ascc);
    int _length = _dictionaryEntryName.length();
    boolean _greaterThan = (_length > 0);
    if (_greaterThan) {
      return this.asccExtension.dictionaryEntryName(ascc);
    } else {
      String typeName = "-no type-";
      Type _type = property.getType();
      boolean _notEquals = (!Objects.equal(_type, null));
      if (_notEquals) {
        Type _type_1 = property.getType();
        String _name = _type_1.getName();
        String _replaceAll = _name.replaceAll("_", "_ ");
        String _replaceAll_1 = _replaceAll.replaceAll("Type", "");
        typeName = _replaceAll_1;
      }
      org.eclipse.uml2.uml.Class _class_ = property.getClass_();
      String _constructedDictionaryEntryName = this.constructedDictionaryEntryName(_class_);
      String _plus = (_constructedDictionaryEntryName + ". ");
      String _name_1 = ascc.getName();
      String _replaceAll_2 = _name_1.replaceAll("_", "_ ");
      String _plus_1 = (_plus + _replaceAll_2);
      String _plus_2 = (_plus_1 + ". ");
      return (_plus_2 + typeName);
    }
  }
  
  public CharSequence flatBusinessTerm(final org.eclipse.uml2.uml.Class clazz) {
    StringConcatenation _builder = new StringConcatenation();
    {
      List<String> _businessTerm = this.accExtension.businessTerm(clazz);
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
  
  public CharSequence flatBusinessTerm(final Property property) {
    StringConcatenation _builder = new StringConcatenation();
    {
      List<String> _businessTerm = this.bccExtension.businessTerm(property);
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
  
  public CharSequence flatBusinessTerm(final Association association) {
    StringConcatenation _builder = new StringConcatenation();
    {
      List<String> _businessTerm = this.asccExtension.businessTerm(association);
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
}
