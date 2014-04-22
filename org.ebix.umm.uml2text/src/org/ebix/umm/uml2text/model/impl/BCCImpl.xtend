package org.ebix.umm.uml2text.model.impl

import org.ebix.umm.uml2text.model.BCC
import org.eclipse.uml2.uml.Property
import org.ebix.umm.uml2text.UmmStereotype

class BCCImpl implements BCC {
	
	protected UmmStereotype ummStereotype
	
	new (UmmStereotype ummStereotype) {
		this.ummStereotype = ummStereotype
	}
	
	override businessTerm(Property umlProperty) {
		ummStereotype.getListOfStringValue(umlProperty, "businessTerm");
	}
	
	override uniqueIdentifier(Property umlProperty) {
		ummStereotype.getStringValue(umlProperty, "uniqueIdentifier");
	}
	
	override versionIdentifier(Property umlProperty) {
		ummStereotype.getStringValue(umlProperty, "versionIdentifier");
	}
	
	override definition(Property umlProperty) {
		ummStereotype.getStringValue(umlProperty, "definition");
	}
	
	override dictionaryEntryName(Property umlProperty) {
		ummStereotype.getStringValue(umlProperty, "dictionaryEntryName");
	}
	
	override sequencingKey(Property umlProperty) {
		ummStereotype.getStringValue(umlProperty, "sequencingKey");
	}
	
}