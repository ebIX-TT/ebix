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
	
    def String xsdQualifiedType(BDTProperty property) {
        if (property.type instanceof Assembled) {
            return "bdt:" + (property.type as Assembled).xsdType
        } else {
            return (property.type as Primitive).xsdQualifiedType
        }
    }
    
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