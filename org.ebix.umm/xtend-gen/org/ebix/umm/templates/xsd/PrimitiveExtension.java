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
package org.ebix.umm.templates.xsd;

import com.google.common.base.Objects;
import org.ebix.umm.umm.Primitive;

@SuppressWarnings("all")
public class PrimitiveExtension {
  public String xsdQualifiedType(final Primitive p) {
    String _switchResult = null;
    String _name = p.getName();
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(_name,"Boolean")) {
        _matched=true;
        _switchResult = "xsd:boolean";
      }
    }
    if (!_matched) {
      if (Objects.equal(_name,"Decimal")) {
        _matched=true;
        _switchResult = "xsd:decimal";
      }
    }
    if (!_matched) {
      if (Objects.equal(_name,"Integer")) {
        _matched=true;
        _switchResult = "xsd:integer";
      }
    }
    if (!_matched) {
      if (Objects.equal(_name,"String")) {
        _matched=true;
        _switchResult = "xsd:string";
      }
    }
    if (!_matched) {
      if (Objects.equal(_name,"TimeDuration")) {
        _matched=true;
        _switchResult = "xsd:duration";
      }
    }
    if (!_matched) {
      if (Objects.equal(_name,"TimePoint")) {
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
