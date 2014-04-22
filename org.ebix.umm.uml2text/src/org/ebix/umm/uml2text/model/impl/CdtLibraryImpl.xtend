package org.ebix.umm.uml2text.model.impl

import org.ebix.umm.uml2text.model.CdtLibrary
import org.eclipse.uml2.uml.Package
import org.ebix.umm.uml2text.UmmStereotype

class CdtLibraryImpl extends LibraryImpl implements CdtLibrary {
	
	new (UmmStereotype ummStereotype) {
		super(ummStereotype)
	}
	
	override isCdtLibrary(Package umlPackage) {
		return ummStereotype.hasStereotype(umlPackage)
	}
	
}