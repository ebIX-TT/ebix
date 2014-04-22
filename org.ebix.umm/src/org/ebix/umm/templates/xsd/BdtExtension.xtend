package org.ebix.umm.templates.xsd


import com.google.inject.Inject

import org.ebix.umm.templates.Rules

import org.ebix.umm.umm.Assembled
import org.ebix.umm.umm.BDT
import org.ebix.umm.umm.BDTProperty
import org.ebix.umm.umm.Content
import org.ebix.umm.umm.Primitive
import org.ebix.umm.umm.Supplement



class BdtExtension {

    @Inject extension Rules rules
    @Inject extension EnumExtension enumExtension
    @Inject extension PrimitiveExtension primitiveExtension
    
	def String xsdName(BDT bdt) {
	    return bdt.name.typeNameRule
	}
	
	def String xsdType(BDT bdt) {
	    return bdt.xsdName + "_" + bdt.uniqueIdentifier; 
	}

    def String conQualifiedType(BDT bdt) {
        return content(bdt).xsdQualifiedType
    }
    
    def boolean isSimpleType(BDT bdt) {
        bdt.properties.filter(typeof(Supplement)).size == 0
    }

    def Content content(BDT bdt) {
        return bdt.properties.filter(typeof(Content)).head
    }
	
    // Content
    //def dispatch String xsdType(Content property) {
    //    return property.type.xsdType
    //}
    
    def String xsdQualifiedType(BDTProperty property) {
        if (property.type instanceof Assembled) {
            return "bdt:" + (property.type as Assembled).xsdType
        } else {
            return (property.type as Primitive).xsdQualifiedType
        }
    }
    
    // Supplement
    //def dispatch String xsdType(Supplement property) {
    //    return property.type.xsdType
    //}
    
    //def dispatch String xsdQualifiedType(Supplement property) {
    //    if (property.type instanceof Assembled) {
    //        return "bdt:" + xsdType(property)
    //    } else {
    //        return property.type.xsdQualifiedType
    //    }
    //}
        
    def boolean isExtraRestricted(BDTProperty property) {
        return property.type instanceof Primitive &&
            (property.hasPattern || property.length != 0 || property.minLength != 0 || property.maxLength != 0)
    }
    
    def boolean hasPattern(BDTProperty property) {
    	return property.pattern != null && property.pattern.length != 0 
    }
    
    def boolean hasDefaultValue(Supplement sup) {
        return sup.defaultValue != null && sup.defaultValue.length > 0 
    }
    
    def boolean hasFixedValue(Supplement sup) {
        return sup.fixedValue != null && sup.fixedValue.length > 0 
    }
    
}