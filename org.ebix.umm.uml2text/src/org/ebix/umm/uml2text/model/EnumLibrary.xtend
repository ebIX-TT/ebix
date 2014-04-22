package org.ebix.umm.uml2text.model

import org.eclipse.uml2.uml.Package

interface EnumLibrary extends Library {
	def boolean isEnumLibrary(Package umlPackage)
}