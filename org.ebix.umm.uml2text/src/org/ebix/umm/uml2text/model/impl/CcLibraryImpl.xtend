package org.ebix.umm.uml2text.model.impl

import org.ebix.umm.uml2text.model.CcLibrary
import org.eclipse.uml2.uml.Package
import org.ebix.umm.uml2text.UmmStereotype

class CcLibraryImpl extends LibraryImpl implements CcLibrary {
	
	new (UmmStereotype ummStereotype) {
		super(ummStereotype)
	}
	
	override isCcLibrary(Package umlPackage) {
		return ummStereotype.hasStereotype(umlPackage)
	}
	
}