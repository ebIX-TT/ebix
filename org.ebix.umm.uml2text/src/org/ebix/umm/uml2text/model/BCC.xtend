package org.ebix.umm.uml2text.model

import java.util.List
import org.eclipse.uml2.uml.Property

interface BCC {
	def List<String> businessTerm(Property umlProperty)
	def String definition(Property umlProperty)
	def String dictionaryEntryName(Property umlProperty)
	def String uniqueIdentifier(Property umlProperty)
	def String versionIdentifier(Property umlProperty)
	def String sequencingKey(Property umlProperty)
}


