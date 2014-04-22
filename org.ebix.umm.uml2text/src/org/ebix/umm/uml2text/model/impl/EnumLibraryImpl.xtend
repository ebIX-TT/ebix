package org.ebix.umm.uml2text.model.impl

import org.ebix.umm.uml2text.model.EnumLibrary
import org.ebix.umm.uml2text.UmmStereotype
import org.eclipse.uml2.uml.Package

class EnumLibraryImpl extends LibraryImpl implements EnumLibrary {
	
	new (UmmStereotype ummStereotype) {
		super(ummStereotype)
	}
	
	override isEnumLibrary(Package umlPackage) {
		return ummStereotype.hasStereotype(umlPackage)
	}
	
}