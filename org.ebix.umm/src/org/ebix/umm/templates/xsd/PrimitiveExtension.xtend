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
            default:                "unk"
        }
    }
    
}