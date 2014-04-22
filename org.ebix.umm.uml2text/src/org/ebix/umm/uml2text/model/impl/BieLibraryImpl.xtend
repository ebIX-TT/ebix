package org.ebix.umm.uml2text.model.impl

import org.ebix.umm.uml2text.model.BieLibrary
import org.eclipse.uml2.uml.Package
import org.ebix.umm.uml2text.UmmStereotype

class BieLibraryImpl extends LibraryImpl implements BieLibrary {
	
	new (UmmStereotype ummStereotype) {
		super(ummStereotype)
	}
	
	override isBieLibrary(Package umlPackage) {
		return ummStereotype.hasStereotype(umlPackage)
	}
	
	override bdtVersion(Package umlPackage) {
		ummStereotype.getValue(umlPackage, "e-BDT version") as Package;
	}
	
	override cefactVersion(Package umlPackage) {
		ummStereotype.getValue(umlPackage, "Cefact version") as Package;
	}
	
	override unsm(Package umlPackage) {
		ummStereotype.getStringValue(umlPackage, "UNSM");
	}	
	
}