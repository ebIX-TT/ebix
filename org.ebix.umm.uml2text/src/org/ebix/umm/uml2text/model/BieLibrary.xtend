package org.ebix.umm.uml2text.model

import org.eclipse.uml2.uml.Package

interface BieLibrary extends Library {
	def boolean isBieLibrary(Package umlPackage)
	def Package bdtVersion(Package umlPackage)
	def Package cefactVersion(Package umlPackage)
	def String unsm(Package umlPackage)
}