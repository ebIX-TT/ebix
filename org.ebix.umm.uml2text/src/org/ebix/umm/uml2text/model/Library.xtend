package org.ebix.umm.uml2text.model

import org.eclipse.uml2.uml.Package
import java.util.List

interface Library {
	/** from bLibrary:  */ 
	def List<String> businessTerm(Package umlPackage)
	def List<String> copyright(Package umlPackage)
	def List<String> owner(Package umlPackage)
	def List<String> reference(Package umlPackage)
	def String status(Package umlPackage)
	def String uniqueIdentifier(Package umlPackage)
	def String versionIdentifier(Package umlPackage)
	
	/** from BIELibrary, BDTLibrary, DocLibrary, and ENUMLibrary: */
	def String baseURN(Package umlPackage)
	def String namespacePrefix(Package umlPackage)
}


