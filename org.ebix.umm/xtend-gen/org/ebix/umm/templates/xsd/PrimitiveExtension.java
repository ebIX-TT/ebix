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

import org.ebix.umm.umm.Primitive;

@SuppressWarnings("all")
public class PrimitiveExtension {
  public String xsdQualifiedType(final Primitive p) {
    String _switchResult = null;
    String _name = p.getName();
    switch (_name) {
      case "Boolean":
        _switchResult = "xsd:boolean";
        break;
      case "Decimal":
        _switchResult = "xsd:decimal";
        break;
      case "Integer":
        _switchResult = "xsd:integer";
        break;
      case "String":
        _switchResult = "xsd:string";
        break;
      case "TimeDuration":
        _switchResult = "xsd:duration";
        break;
      case "TimePoint":
        _switchResult = "xsd:dateTime";
        break;
      case "Binary":
        _switchResult = "xsd:base64Binary";
        break;
      default:
        _switchResult = "unk";
        break;
    }
    return _switchResult;
  }
}
