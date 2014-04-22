package org.ebix.umm.uml2text.model

import org.eclipse.uml2.uml.Class
import java.util.List

interface CDT {
	def List<String> businessTerm(Class umlClass)
	def String definition(Class umlClass)
	def String dictionaryEntryName(Class umlClass)
	def String uniqueIdentifier(Class umlClass)
	def String versionIdentifier(Class umlClass)
}


