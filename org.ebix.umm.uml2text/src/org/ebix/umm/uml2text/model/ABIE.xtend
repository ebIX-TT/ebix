package org.ebix.umm.uml2text.model

import org.eclipse.uml2.uml.Class
import java.util.List

interface ABIE {
	def List<String> businessTerm(Class umlClass)
	def String definition(Class umlClass)
	def String dictionaryEntryName(Class umlClass)
	def String languageCode(Class umlClass)
	def String uniqueIdentifier(Class umlClass)
	def String versionIdentifier(Class umlClass)
	def List<String> usageRule(Class umlClass)
}


