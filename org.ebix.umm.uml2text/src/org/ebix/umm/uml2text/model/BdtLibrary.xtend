package org.ebix.umm.uml2text.model

import org.eclipse.uml2.uml.Package

interface BdtLibrary extends Library {
	def boolean isBdtLibrary(Package umlPackage)
	def Package cefactVersion(Package umlPackage)
}