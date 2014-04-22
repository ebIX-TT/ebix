package org.ebix.umm.uml2text.model

import org.eclipse.uml2.uml.Package

interface DocLibrary extends Library {
	def boolean isDocLibrary(Package umlPackage)
	def Package bdtVersion(Package umlPackage)
	def Package bieVersion(Package umlPackage)
}