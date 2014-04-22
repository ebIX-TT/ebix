package org.ebix.umm.uml2text.model.impl

import org.ebix.umm.uml2text.model.ABIE
import org.eclipse.uml2.uml.Class
import org.ebix.umm.uml2text.UmmStereotype

class ABIEImpl implements ABIE {
	
	protected UmmStereotype ummStereotype
	
	new (UmmStereotype ummStereotype) {
		this.ummStereotype = ummStereotype
	}
	
	override businessTerm(Class umlClass) {
		ummStereotype.getListOfStringValue(umlClass, "businessTerm");
	}
	
	override uniqueIdentifier(Class umlClass) {
		ummStereotype.getStringValue(umlClass, "uniqueIdentifier");
	}
	
	override versionIdentifier(Class umlClass) {
		ummStereotype.getStringValue(umlClass, "versionIdentifier");
	}
	
	override definition(Class umlClass) {
		ummStereotype.getStringValue(umlClass, "definition");
	}
	
	override dictionaryEntryName(Class umlClass) {
		ummStereotype.getStringValue(umlClass, "dictionaryEntryName");
	}
	
	override languageCode(Class umlClass) {
		ummStereotype.getStringValue(umlClass, "languageCode");
	}
	
	override usageRule(Class umlClass) {
		ummStereotype.getListOfStringValue(umlClass, "usageRule");
	}
	
}