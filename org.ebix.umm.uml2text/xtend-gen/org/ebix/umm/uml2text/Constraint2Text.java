package org.ebix.umm.uml2text;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.List;
import org.ebix.umm.uml2text.ConstraintKind;
import org.ebix.umm.uml2text.UmmStereotype;
import org.ebix.umm.uml2text.UmmStereotypes;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class Constraint2Text {
  public CharSequence generatConstraint(final Constraint umlConstraint, final UmmStereotypes ummStereotypes, final NamedElement context) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("constraint");
    _builder.newLine();
    _builder.append("{ ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("context: ");
    String _name = context.getName();
    _builder.append(_name, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("kind: ");
    {
      List<ConstraintKind> _kinds = this.kinds(umlConstraint, ummStereotypes);
      boolean _hasElements = false;
      for(final ConstraintKind kind : _kinds) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "    ");
        }
        String _name_1 = kind.getName();
        _builder.append(_name_1, "    ");
        _builder.append("(List Identifier = \'");
        String _listIdentifier = kind.getListIdentifier();
        _builder.append(_listIdentifier, "    ");
        _builder.append("\', Responsible Agency = \'");
        String _responsibleAgency = kind.getResponsibleAgency();
        _builder.append(_responsibleAgency, "    ");
        _builder.append("\')");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    ValueSpecification _specification = umlConstraint.getSpecification();
    String _stringValue = _specification.stringValue();
    String _replaceSelf = this.replaceSelf(_stringValue);
    _builder.append(_replaceSelf, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("}    ");
    _builder.newLine();
    return _builder;
  }
  
  private List<ConstraintKind> kinds(final Constraint umlConstraint, final UmmStereotypes ummStereotypes) {
    ArrayList<ConstraintKind> _arrayList = new ArrayList<ConstraintKind>();
    final List<ConstraintKind> kinds = _arrayList;
    boolean _hasStereotype = ummStereotypes.TC_Document.hasStereotype(umlConstraint);
    if (_hasStereotype) {
      String _listIdentifier = this.listIdentifier(ummStereotypes.TC_Document, umlConstraint);
      String _responsibleAgency = this.responsibleAgency(ummStereotypes.TC_Document, umlConstraint);
      ConstraintKind _constraintKind = new ConstraintKind(
        "document", _listIdentifier, _responsibleAgency);
      final ConstraintKind ck = _constraintKind;
      kinds.add(ck);
    }
    boolean _hasStereotype_1 = ummStereotypes.TC_Payload.hasStereotype(umlConstraint);
    if (_hasStereotype_1) {
      String _listIdentifier_1 = this.listIdentifier(ummStereotypes.TC_Payload, umlConstraint);
      String _responsibleAgency_1 = this.responsibleAgency(ummStereotypes.TC_Payload, umlConstraint);
      ConstraintKind _constraintKind_1 = new ConstraintKind(
        "payload", _listIdentifier_1, _responsibleAgency_1);
      final ConstraintKind ck_1 = _constraintKind_1;
      kinds.add(ck_1);
    }
    boolean _hasStereotype_2 = ummStereotypes.TC_ABIE.hasStereotype(umlConstraint);
    if (_hasStereotype_2) {
      String _listIdentifier_2 = this.listIdentifier(ummStereotypes.TC_ABIE, umlConstraint);
      String _responsibleAgency_2 = this.responsibleAgency(ummStereotypes.TC_ABIE, umlConstraint);
      ConstraintKind _constraintKind_2 = new ConstraintKind(
        "abie", _listIdentifier_2, _responsibleAgency_2);
      final ConstraintKind ck_2 = _constraintKind_2;
      kinds.add(ck_2);
    }
    boolean _hasStereotype_3 = ummStereotypes.TC_BDT.hasStereotype(umlConstraint);
    if (_hasStereotype_3) {
      String _listIdentifier_3 = this.listIdentifier(ummStereotypes.TC_BDT, umlConstraint);
      String _responsibleAgency_3 = this.responsibleAgency(ummStereotypes.TC_BDT, umlConstraint);
      ConstraintKind _constraintKind_3 = new ConstraintKind(
        "bdt", _listIdentifier_3, _responsibleAgency_3);
      final ConstraintKind ck_3 = _constraintKind_3;
      kinds.add(ck_3);
    }
    boolean _hasStereotype_4 = ummStereotypes.TC_Dependency.hasStereotype(umlConstraint);
    if (_hasStereotype_4) {
      String _listIdentifier_4 = this.listIdentifier(ummStereotypes.TC_Dependency, umlConstraint);
      String _responsibleAgency_4 = this.responsibleAgency(ummStereotypes.TC_Dependency, umlConstraint);
      ConstraintKind _constraintKind_4 = new ConstraintKind(
        "dependency", _listIdentifier_4, _responsibleAgency_4);
      final ConstraintKind ck_4 = _constraintKind_4;
      kinds.add(ck_4);
    }
    boolean _hasStereotype_5 = ummStereotypes.TC_Facet.hasStereotype(umlConstraint);
    if (_hasStereotype_5) {
      String _listIdentifier_5 = this.listIdentifier(ummStereotypes.TC_Facet, umlConstraint);
      String _responsibleAgency_5 = this.responsibleAgency(ummStereotypes.TC_Facet, umlConstraint);
      ConstraintKind _constraintKind_5 = new ConstraintKind(
        "facet", _listIdentifier_5, _responsibleAgency_5);
      final ConstraintKind ck_5 = _constraintKind_5;
      kinds.add(ck_5);
    }
    return kinds;
  }
  
  public String listIdentifier(final UmmStereotype st, final Constraint umlConstraint) {
    String listIdentifierStr = "";
    final Object listIdentifier = st.getValue(umlConstraint, "ListIdentifier");
    boolean _equals = Objects.equal(listIdentifier, null);
    if (_equals) {
      String _defaultValue = st.getDefaultValue("ListIdentifier");
      listIdentifierStr = _defaultValue;
    } else {
      String _name = ((NamedElement) listIdentifier).getName();
      listIdentifierStr = _name;
    }
    return listIdentifierStr;
  }
  
  public String responsibleAgency(final UmmStereotype st, final Constraint umlConstraint) {
    String responsibleAgencyStr = "";
    final Object responsibleAgency = st.getValue(umlConstraint, "ResponsibleAgency");
    boolean _equals = Objects.equal(responsibleAgency, null);
    if (_equals) {
      String _defaultValue = st.getDefaultValue("ResponsibleAgency");
      responsibleAgencyStr = _defaultValue;
    } else {
      String _name = ((NamedElement) responsibleAgency).getName();
      responsibleAgencyStr = _name;
    }
    return responsibleAgencyStr;
  }
  
  private String replaceSelf(final String constraint) {
    boolean replaced = false;
    final String[] lines = constraint.split("\\r?\\n|\\r");
    String out = "";
    for (final String line : lines) {
      if (replaced) {
        String _plus = (out + "\n");
        String _plus_1 = (_plus + line);
        out = _plus_1;
      } else {
        boolean _matches = line.matches("\\s*--.*");
        if (_matches) {
          String _plus_2 = (out + "\n");
          String _plus_3 = (_plus_2 + line);
          out = _plus_3;
        } else {
          boolean _contains = line.contains("self");
          if (_contains) {
            replaced = true;
            String _plus_4 = (out + "\n");
            String _replaceFirst = line.replaceFirst("self", "inv: self");
            String _plus_5 = (_plus_4 + _replaceFirst);
            out = _plus_5;
          } else {
            String _plus_6 = (out + "\n");
            String _plus_7 = (_plus_6 + line);
            out = _plus_7;
          }
        }
      }
    }
    return out;
  }
}
