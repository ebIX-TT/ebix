package org.ebix.umm.uml2text.model

import java.util.List
import org.eclipse.uml2.uml.Property

interface SUP {
	def boolean isSUP(Property umlProperty)
	def List<String> businessTerm(Property umlProperty)
	def String definition(Property umlProperty)
	def String dictionaryEntryName(Property umlProperty)
	def String languageCode(Property umlProperty)
	def String uniqueIdentifier(Property umlProperty)
	def String versionIdentifier(Property umlProperty)
	def List<String> usageRule(Property umlProperty)
}


