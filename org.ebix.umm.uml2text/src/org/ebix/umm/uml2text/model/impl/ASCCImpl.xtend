package org.ebix.umm.uml2text.model.impl

import org.ebix.umm.uml2text.model.ASCC
import org.eclipse.uml2.uml.Association
import org.ebix.umm.uml2text.UmmStereotype

class ASCCImpl implements ASCC {
	
	protected UmmStereotype ummStereotype
	
	new (UmmStereotype ummStereotype) {
		this.ummStereotype = ummStereotype
	}
	
	override businessTerm(Association umlAssociation) {
		ummStereotype.getListOfStringValue(umlAssociation, "businessTerm");
	}
	
	override uniqueIdentifier(Association umlAssociation) {
		ummStereotype.getStringValue(umlAssociation, "uniqueIdentifier");
	}
	
	override versionIdentifier(Association umlAssociation) {
		ummStereotype.getStringValue(umlAssociation, "versionIdentifier");
	}
	
	override definition(Association umlAssociation) {
		ummStereotype.getStringValue(umlAssociation, "definition");
	}
	
	override dictionaryEntryName(Association umlAssociation) {
		ummStereotype.getStringValue(umlAssociation, "dictionaryEntryName");
	}
	
	override sequencingKey(Association umlAssociation) {
		ummStereotype.getStringValue(umlAssociation, "sequencingKey");
	}
	
}