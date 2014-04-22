package org.ebix.umm.uml2text;

import org.eclipse.uml2.uml.Property;

@SuppressWarnings("all")
public class Multiplicity2Text {
  public String multiplicity(final Property p) {
    boolean _and = false;
    int _lower = p.getLower();
    boolean _equals = (_lower == 0);
    if (!_equals) {
      _and = false;
    } else {
      int _upper = p.getUpper();
      boolean _equals_1 = (_upper == 1);
      _and = (_equals && _equals_1);
    }
    if (_and) {
      return "(0..1)";
    } else {
      boolean _and_1 = false;
      int _lower_1 = p.getLower();
      boolean _equals_2 = (_lower_1 == 0);
      if (!_equals_2) {
        _and_1 = false;
      } else {
        int _upper_1 = p.getUpper();
        int _minus = (-1);
        boolean _equals_3 = (_upper_1 == _minus);
        _and_1 = (_equals_2 && _equals_3);
      }
      if (_and_1) {
        return "(0..*)";
      } else {
        boolean _and_2 = false;
        int _lower_2 = p.getLower();
        boolean _equals_4 = (_lower_2 == 1);
        if (!_equals_4) {
          _and_2 = false;
        } else {
          int _upper_2 = p.getUpper();
          boolean _equals_5 = (_upper_2 == 1);
          _and_2 = (_equals_4 && _equals_5);
        }
        if (_and_2) {
          return "(1..1)";
        } else {
          boolean _and_3 = false;
          int _lower_3 = p.getLower();
          boolean _equals_6 = (_lower_3 == 1);
          if (!_equals_6) {
            _and_3 = false;
          } else {
            int _upper_3 = p.getUpper();
            int _minus_1 = (-1);
            boolean _equals_7 = (_upper_3 == _minus_1);
            _and_3 = (_equals_6 && _equals_7);
          }
          if (_and_3) {
            return "(1..*)";
          } else {
            return "unsupported_multiplicity";
          }
        }
      }
    }
  }
}
