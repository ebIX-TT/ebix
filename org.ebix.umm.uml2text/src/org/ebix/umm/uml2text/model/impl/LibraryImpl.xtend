package org.ebix.umm.uml2text.model.impl

import org.ebix.umm.uml2text.model.Library
import org.eclipse.uml2.uml.Package
import org.ebix.umm.uml2text.UmmStereotype

abstract class LibraryImpl implements Library {
	
	protected UmmStereotype ummStereotype
	
	new (UmmStereotype ummStereotype) {
		this.ummStereotype = ummStereotype
	}
	
	override baseURN(Package umlPackage) {
		ummStereotype.getStringValue(umlPackage, "baseURN");
	}
	
	override businessTerm(Package umlPackage) {
		ummStereotype.getListOfStringValue(umlPackage, "businessTerm");
	}
	
	override copyright(Package umlPackage) {
		ummStereotype.getListOfStringValue(umlPackage, "copyright");
	}
	
	override owner(Package umlPackage) {
		ummStereotype.getListOfStringValue(umlPackage, "owner");
	}
	
	override reference(Package umlPackage) {
		ummStereotype.getListOfStringValue(umlPackage, "reference");
	}
	
	override status(Package umlPackage) {
		ummStereotype.getStringValue(umlPackage, "status");
	}
	
	override uniqueIdentifier(Package umlPackage) {
		ummStereotype.getStringValue(umlPackage, "uniqueIdentifier");
	}
	
	override versionIdentifier(Package umlPackage) {
		ummStereotype.getStringValue(umlPackage, "versionIdentifier");
	}
	
	override namespacePrefix(Package umlPackage) {
		ummStereotype.getStringValue(umlPackage, "namespacePrefix");
	}
	
}