package org.ebix.umm.uml2text.model.impl

import org.ebix.umm.uml2text.model.DocLibrary
import org.eclipse.uml2.uml.Package
import org.ebix.umm.uml2text.UmmStereotype

class DocLibraryImpl extends LibraryImpl implements DocLibrary {
	
	new (UmmStereotype ummStereotype) {
		super(ummStereotype)
	}
	
	override isDocLibrary(Package umlPackage) {
		return ummStereotype.hasStereotype(umlPackage)
	}
	
	override bdtVersion(Package umlPackage) {
		ummStereotype.getValue(umlPackage, "eBDTversion") as Package;
	}
	
	override bieVersion(Package umlPackage) {
		ummStereotype.getValue(umlPackage, "eBIEversion") as Package;
	}
	
}