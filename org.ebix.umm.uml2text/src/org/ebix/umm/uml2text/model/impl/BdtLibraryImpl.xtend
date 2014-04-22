package org.ebix.umm.uml2text.model.impl

import org.ebix.umm.uml2text.model.BdtLibrary
import org.eclipse.uml2.uml.Package
import org.ebix.umm.uml2text.UmmStereotype

class BdtLibraryImpl extends LibraryImpl implements BdtLibrary {
	
	new (UmmStereotype ummStereotype) {
		super(ummStereotype)
	}
	
	override isBdtLibrary(Package umlPackage) {
		return ummStereotype.hasStereotype(umlPackage)
	}
	
	override cefactVersion(Package umlPackage) {
		ummStereotype.getValue(umlPackage, "Cefact version") as Package;
	}
	
}