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
		if(bdt == null) return "undefined";
	    return bdt.name.typeNameRule
	}
	
	def String xsdType(BDT bdt) {
		if(bdt == null) return "undefined";
		if(bdt.xsdName.equals("DateTimeType")){
			return "xsd:dateTime"
		} else if(bdt.xsdName.equals("DateType")){
			bdt.properties.get(0).pattern = "[0-9]{4}-[0-1][0-9]-[0-3][0-9]"
			return "xsd:date"
		} else if(bdt.xsdName.equals("TimeType")){
			bdt.properties.get(0).pattern = "[0-2][0-9]:[0-5][0-9]:[0-5][0-9]";
			return "xsd:time"
		} else if(bdt.xsdName.equals("UTCOffsetDateTimeType")){
			bdt.properties.get(0).pattern = "[0-9]{4}-[0-1][0-9]-[0-3][0-9]T[0-2][0-9]:[0-5][0-9]:[0-5][0-9].[0-9]*[\\+|-][0-2][0-9]:[0-6][0-9]";
			return "xsd:dateTime"
		} else if(bdt.xsdName.equals("UTCDateTimeType")){
			bdt.properties.get(0).pattern = "[0-9]{4}-[0-1][0-9]-[0-3][0-9]T[0-2][0-9]:[0-5][0-9]:[0-5][0-9].[0-9]*Z";
			return "xsd:dateTime"
		} else if(bdt.xsdName.equals("DayDateType")){
			bdt.properties.get(0).pattern = "---[0-3][0-9]";
			return "xsd:gDay"
		} else if(bdt.xsdName.equals("YearDateType")){
			bdt.properties.get(0).pattern = "[0-9]{4}";
			return "xsd:gYear"
		} else if(bdt.xsdName.equals("MonthDateType")){
			bdt.properties.get(0).pattern = "--[0-1][0-9]--";
			return "xsd:gMonth"
		} else if(bdt.xsdName.equals("MonthDayDateType")){
			bdt.properties.get(0).pattern = "--[0-1][0-9]-[0-3][0-9]";
			return "xsd:gMonthDay"
		} else
	    return "bie:"+bdt.xsdName + "_" + bdt.uniqueIdentifier; 
	}
	
	def String xsdTypeName(BDT bdt) {
		if(bdt == null) return "undefined";
	    return bdt.xsdName + "_" + bdt.uniqueIdentifier; 
	}

	def boolean equalsString(String searchIn, String searchFor){
		return searchIn.toLowerCase.equals(searchFor.toLowerCase);
	}

    def String conQualifiedType(BDT bdt) {
        return content(bdt).xsdQualifiedType
    }
    
    def boolean isSimpleType(BDT bdt) {
        bdt.properties.filter(typeof(Supplement)).size == 0
    }

    def Content content(BDT bdt) {
    	if(bdt==null || bdt.properties==null || bdt.properties.filter(typeof(Content))==null){
    		return null
    	}
        return bdt.properties.filter(typeof(Content)).head
    }
	
    def String xsdQualifiedType(BDTProperty property) {
        if (property.type instanceof Assembled) {
            return "ns1:" + (property.type as Assembled).xsdType
        } else if(property.type.name.equals("DateTimeType")){
        	return "xsd:dateTime"
        } else if(property.type.name.equals("DateType")){
        	return "xsd:date"
        } else if(property.type.name.equals("TimeType")){
        	return "xsd:time"
        }
         else { 
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