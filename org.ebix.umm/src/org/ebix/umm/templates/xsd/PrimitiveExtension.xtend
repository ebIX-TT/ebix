/*
 *  UMM Schema Generator
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
package org.ebix.umm.templates.xsd

import org.ebix.umm.umm.Primitive

class PrimitiveExtension {
    
    def String xsdQualifiedType(Primitive p) {
        switch(p.name) {
            case "Boolean":         "xsd:boolean"
            case "Decimal":         "xsd:decimal"
            case "Integer":         "xsd:integer"
            case "String":          "xsd:string"
            case "TimeDuration":    "xsd:duration"
            case "TimePoint":       "xsd:dateTime"
            case "Binary":          "xsd:base64Binary"
            case "Double":          "xsd:decimal"
            case "Float":          "xsd:decimal"
            case "Token":          "xsd:string"
            case "NormalizedString":          "xsd:string"
            default:                "unk"
        }
    }
    
}