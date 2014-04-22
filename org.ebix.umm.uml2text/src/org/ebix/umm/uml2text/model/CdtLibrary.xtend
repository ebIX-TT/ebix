package org.ebix.umm.uml2text.model

import org.eclipse.uml2.uml.Package

interface CdtLibrary extends Library {
	def boolean isCdtLibrary(Package umlPackage)
}