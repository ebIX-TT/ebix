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