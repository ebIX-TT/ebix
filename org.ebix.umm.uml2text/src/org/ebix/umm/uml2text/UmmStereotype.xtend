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
package org.ebix.umm.uml2text

import org.eclipse.uml2.uml.Stereotype
import org.eclipse.uml2.uml.NamedElement
import java.util.List
import org.eclipse.emf.ecore.EObject

class UmmStereotype {
	public String shortName
	public String qualifiedName
	public String defaultName
	public Stereotype value
	
	new(String shortName, String qualifiedName) {
		this.shortName = shortName
		this.qualifiedName = qualifiedName
		this.defaultName = qualifiedName
	}
	
	def public boolean hasStereotype(NamedElement namedElement) {
		return namedElement.appliedStereotypes.contains(value)
	}
	
	def public String getStringValue(NamedElement namedElement, String tagName) {
		if (namedElement.hasValue(value, tagName)) {
			return namedElement.getValue(value, tagName) as String
		} else {
			println("Missing " + tagName + " for " + namedElement.qualifiedName)
			return ""
		}		
	}

	def public List<String> getListOfStringValue(NamedElement namedElement, String tagName) {
		if (namedElement.hasValue(value, tagName)) {
			return namedElement.getValue(value, tagName) as List<String>
		} else {
			println("Missing " + tagName + " for " + namedElement.qualifiedName)
			return #[]
		}		
	}

	def public getValue(NamedElement namedElement, String tagName) {
		if (namedElement.hasValue(value, tagName)) {
			return namedElement.getValue(value, tagName).dynamicValue
		} else {
			println("Missing " + tagName + " for " + namedElement.qualifiedName)
			return null
		}		
	}
	
	def Object getDynamicValue(Object value) {
		if (value instanceof EObject) {
			val dynObject =  value as EObject;
			val dynClass = dynObject.eClass;
			val eStructuralFeatures = dynClass.EAllStructuralFeatures

			for (feature : eStructuralFeatures) {
				if(feature.name.startsWith("base_")) {
					return dynObject.eGet(feature, true);
				}
			 }			
			 
			 // nothing found, so apparently no dynamic class but the real thing
			 return value						
		}
		return null
	}
	
	def getDefaultValue(String tagName) {
		value.allAttributes.findFirst[p | p.name == tagName]?.^default
	}


}