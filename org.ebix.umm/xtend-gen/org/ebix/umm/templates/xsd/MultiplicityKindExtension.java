package org.ebix.umm.templates.xsd;

import com.google.common.base.Objects;
import org.ebix.umm.umm.MultiplicityKind;

@SuppressWarnings("all")
public class MultiplicityKindExtension {
  public String use(final MultiplicityKind m) {
    String _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(m,MultiplicityKind.ONE)) {
        _matched=true;
        _switchResult = "required";
      }
    }
    if (!_matched) {
      if (Objects.equal(m,MultiplicityKind.OPTIONAL)) {
        _matched=true;
        _switchResult = "optional";
      }
    }
    if (!_matched) {
      if (Objects.equal(m,MultiplicityKind.ZERO_OR_MORE)) {
        _matched=true;
        _switchResult = "???";
      }
    }
    if (!_matched) {
      if (Objects.equal(m,MultiplicityKind.ONE_OR_MORE)) {
        _matched=true;
        _switchResult = "???";
      }
    }
    if (!_matched) {
      _switchResult = "ERROR: unknown multiplicity kind";
    }
    return _switchResult;
  }
  
  public String minOccurs(final MultiplicityKind m) {
    String _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(m,MultiplicityKind.ONE)) {
        _matched=true;
        _switchResult = "1";
      }
    }
    if (!_matched) {
      if (Objects.equal(m,MultiplicityKind.OPTIONAL)) {
        _matched=true;
        _switchResult = "0";
      }
    }
    if (!_matched) {
      if (Objects.equal(m,MultiplicityKind.ZERO_OR_MORE)) {
        _matched=true;
        _switchResult = "0";
      }
    }
    if (!_matched) {
      if (Objects.equal(m,MultiplicityKind.ONE_OR_MORE)) {
        _matched=true;
        _switchResult = "1";
      }
    }
    if (!_matched) {
      _switchResult = "ERROR: unknown multiplicity kind";
    }
    return _switchResult;
  }
  
  public String maxOccurs(final MultiplicityKind m) {
    String _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(m,MultiplicityKind.ONE)) {
        _matched=true;
        _switchResult = "1";
      }
    }
    if (!_matched) {
      if (Objects.equal(m,MultiplicityKind.OPTIONAL)) {
        _matched=true;
        _switchResult = "1";
      }
    }
    if (!_matched) {
      if (Objects.equal(m,MultiplicityKind.ZERO_OR_MORE)) {
        _matched=true;
        _switchResult = "unbounded";
      }
    }
    if (!_matched) {
      if (Objects.equal(m,MultiplicityKind.ONE_OR_MORE)) {
        _matched=true;
        _switchResult = "unbounded";
      }
    }
    if (!_matched) {
      _switchResult = "ERROR: unknown multiplicity kind";
    }
    return _switchResult;
  }
  
  public boolean lowerBoundZero(final MultiplicityKind m) {
    Boolean _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(m,MultiplicityKind.ONE)) {
        _matched=true;
        _switchResult = Boolean.valueOf(false);
      }
    }
    if (!_matched) {
      if (Objects.equal(m,MultiplicityKind.OPTIONAL)) {
        _matched=true;
        _switchResult = Boolean.valueOf(true);
      }
    }
    if (!_matched) {
      if (Objects.equal(m,MultiplicityKind.ZERO_OR_MORE)) {
        _matched=true;
        _switchResult = Boolean.valueOf(true);
      }
    }
    if (!_matched) {
      if (Objects.equal(m,MultiplicityKind.ONE_OR_MORE)) {
        _matched=true;
        _switchResult = Boolean.valueOf(false);
      }
    }
    return (_switchResult).booleanValue();
  }
}
