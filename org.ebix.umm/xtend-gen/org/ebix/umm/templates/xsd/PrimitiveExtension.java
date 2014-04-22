package org.ebix.umm.templates.xsd;

import com.google.common.base.Objects;
import org.ebix.umm.umm.Primitive;

@SuppressWarnings("all")
public class PrimitiveExtension {
  public String xsdQualifiedType(final Primitive p) {
    String _switchResult = null;
    String _name = p.getName();
    final String _switchValue = _name;
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(_switchValue,"Boolean")) {
        _matched=true;
        _switchResult = "xsd:boolean";
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"Decimal")) {
        _matched=true;
        _switchResult = "xsd:decimal";
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"Integer")) {
        _matched=true;
        _switchResult = "xsd:integer";
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"String")) {
        _matched=true;
        _switchResult = "xsd:string";
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"TimeDuration")) {
        _matched=true;
        _switchResult = "xsd:duration";
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"TimePoint")) {
        _matched=true;
        _switchResult = "xsd:dateTime";
      }
    }
    if (!_matched) {
      _switchResult = "unk";
    }
    return _switchResult;
  }
}
