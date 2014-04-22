package org.ebix.umm.uml2text.model

import org.eclipse.uml2.uml.Package

interface CcLibrary extends Library {
	def boolean isCcLibrary(Package umlPackage)
}