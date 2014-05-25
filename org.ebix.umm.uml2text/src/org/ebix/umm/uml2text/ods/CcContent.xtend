/*
 *  UMM Schema Generator
 *  Copyright (C) 2014  ebIX, the European forum for energy Business Information eXchange. 
 * 
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 * 
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.ebix.umm.uml2text.ods

import org.ebix.umm.uml2text.Multiplicity2Text
import org.ebix.umm.uml2text.UmmStereotypes
import org.eclipse.uml2.uml.Association
import org.eclipse.uml2.uml.Class
import org.eclipse.uml2.uml.Model
import org.eclipse.uml2.uml.Package
import org.eclipse.uml2.uml.Property
import org.eclipse.xtend2.lib.StringConcatenation

import static org.ebix.umm.uml2text.ods.BasicFunctions.*
import org.ebix.umm.uml2text.model.impl.CcLibraryImpl
import org.ebix.umm.uml2text.model.CcLibrary
import org.ebix.umm.uml2text.model.ACC
import org.ebix.umm.uml2text.model.ASCC
import org.ebix.umm.uml2text.model.BCC
import org.ebix.umm.uml2text.model.impl.ACCImpl
import org.ebix.umm.uml2text.model.impl.ASCCImpl
import org.ebix.umm.uml2text.model.impl.BCCImpl

class CcContent {

	extension CcLibrary cclibraryExtension
	extension ACC accExtension
	extension ASCC asccExtension
	extension BCC bccExtension


	extension Multiplicity2Text multiplicity2Text = new Multiplicity2Text
	
	private UmmStereotypes ummStereotypes
	private Model umlModel
	
	new (UmmStereotypes ummStereotypes, Model umlModel) {
		this.ummStereotypes = ummStereotypes
		this.umlModel = umlModel
		
		this.cclibraryExtension = new CcLibraryImpl(ummStereotypes.CCLibrary)
		this.accExtension = new ACCImpl(ummStereotypes.ACC)
		this.asccExtension = new ASCCImpl(ummStereotypes.ASCC)
		this.bccExtension = new BCCImpl(ummStereotypes.BCC)
		
	}

	def sheet() '''
		<table:table table:name="CC's" table:style-name="ta1">
			<table:table-column table:style-name="co-narrow" table:default-cell-style-name="Default"/>
			<table:table-column table:style-name="co-narrow" table:default-cell-style-name="Default"/>
			<table:table-column table:style-name="co-narrow" table:default-cell-style-name="Default"/>
			<table:table-column table:style-name="co-narrow" table:default-cell-style-name="Default"/>
			<table:table-column table:style-name="co-name" table:default-cell-style-name="Default"/>
			<table:table-column table:style-name="co1" table:default-cell-style-name="Default"/>
			<table:table-column table:style-name="co-name" table:default-cell-style-name="Default"/>
			<table:table-column table:style-name="co-term" table:default-cell-style-name="Default"/>
			<table:table-column table:style-name="co1" table:default-cell-style-name="Default"/>
			<table:table-column table:style-name="co1" table:default-cell-style-name="Default"/>
			<table:table-column table:style-name="co1" table:default-cell-style-name="Default"/>
			<table:table-column table:style-name="co1" table:default-cell-style-name="Default"/>
						
			«headerRow()»
			«content()»
		</table:table>
	'''
	
	def headerRow() '''
		«openHeaderRow»
			«headerCell("#", "Library", "Type", "Name", "", "Cardinality", "Definition", "Business term",
				"Sequencing key", "Version", "Unique identifier", "Usage Rules"
			)»
		«closeHeaderRow»
	'''
	
	
	def CharSequence content() {
    	val builder = new StringConcatenation
		var accCount = 0
		for (umlPackage : umlModel.allOwnedElements.filter(typeof(Package)).filter(p | p.ccLibrary) ) {
			for (acc : umlPackage.ownedMembers.filter(typeof(Class)).filter(c | c.isStereotypeApplied(ummStereotypes.ACC.value))) {
				accCount = accCount + 100
				builder.append(accContent(accCount, acc))
			}
		} 
		return builder
	}
	
	def accContent(Integer count, Class acc) '''
		«openRow("rclass")»
		«cell("cclass", count.toString)»
		«cell("cclass", acc.namespace.qualifiedName)»
		«cell("cclass", "ACC")»
		«cell("cclass", acc.constructedDictionaryEntryName)»
		«cell("cclass", "")»
		«cell("cclass-red", "")»
		«cell("cclass-wrap", acc.definition)»
		«cell("cclass", acc.flatBusinessTerm.toString.trim)»
		«cell("cclass-red", "")»
		«cell("cclass", acc.versionIdentifier)»
		«cell("cclass", acc.uniqueIdentifier)»
		«cell("cclass", "")»
		«closeRow»
		«attributeContent(count, acc)»
	'''

	def CharSequence attributeContent(int count, Class acc) {
    	val builder = new StringConcatenation
		var attrCount = count
		for (attr : acc.attributes) {
			attrCount = attrCount + 1
			if (attr.association != null) {
				builder.append(asccContent(attrCount, attr))
			} else {
				builder.append(bccContent(attrCount, attr))
			}
		}
		return builder
	}

	def bccContent(Integer count, Property bcc) '''
		«openRow("rattr")»
		«cell("cattr", count.toString)»
		«cell("cattr", bcc.class_.namespace.qualifiedName)»
		«cell("cattr", "")»
		«cell("cattr-blue", "BCC")»
		«cell("cattr", bcc.constructedDictionaryEntryName)»
		«cell("cattr", bcc.multiplicity)»
		«cell("cattr-wrap", bcc.definition)»
		«cell("cattr", bcc.flatBusinessTerm.toString.trim)»
		«cell("cattr", bcc.sequencingKey)»
		«cell("cattr", bcc.versionIdentifier)»
		«cell("cattr", bcc.uniqueIdentifier)»
		«cell("cattr", "")»
		«closeRow»
	'''
	
	def asccContent(Integer count, Property property) '''
		«openRow("rattr")»
		«cell("cattr", count.toString)»
		«cell("cattr", property.class_.namespace.qualifiedName)»
		«cell("cattr", "")»
		«cell("cattr-blue", "ASCC")»
		«cell("cattr", property.constructedDictionaryEntryName(property.association))»
		«cell("cattr", property.multiplicity)»
		«cell("cattr-wrap", property.association.definition)»
		«cell("cattr", property.association.flatBusinessTerm.toString.trim)»
		«cell("cattr", property.association.sequencingKey)»
		«cell("cattr", property.association.versionIdentifier)»
		«cell("cattr", property.association.uniqueIdentifier)»
		«cell("cattr", "")»
		«closeRow»
	'''

	def constructedDictionaryEntryName(Class acc) {
		if (acc.dictionaryEntryName.length > 0) {
			return acc.dictionaryEntryName
		} else {
			return acc.name.replaceAll("_", "_ ") + ". Details" 
		}
	}

	def constructedDictionaryEntryName(Property bcc) {
		if (bcc.dictionaryEntryName.length > 0) {
			return bcc.dictionaryEntryName 
		} else {
			var typeName = "-no type-"
			if (bcc.type != null) {
				typeName = bcc.type.name.replaceAll("_", "_ ").replaceAll("Type", "")
			} 
			return 
				bcc.class_.constructedDictionaryEntryName
                + ". " 
                + bcc.name.replaceAll("_", "_ ") 
                + ". " 
                + typeName;
		}
	}

	def constructedDictionaryEntryName(Property property, Association ascc) {
		if (ascc.dictionaryEntryName.length > 0) {
			return ascc.dictionaryEntryName
		} else {
			var typeName = "-no type-"
			if (property.type != null) {
				typeName = property.type.name.replaceAll("_", "_ ").replaceAll("Type", "")
			} 
			return
				property.class_.constructedDictionaryEntryName
                + ". " 
                + ascc.name.replaceAll("_", "_ ") 
                + ". " 
                + typeName;
		}
	}
	
	def flatBusinessTerm (Class clazz) '''
		«FOR term : clazz.businessTerm SEPARATOR ", "»«term»«ENDFOR»
	'''
	
	def flatBusinessTerm (Property property) '''
		«FOR term : property.businessTerm SEPARATOR ", "»«term»«ENDFOR»
	'''
	
	def flatBusinessTerm (Association association) '''
		«FOR term : association.businessTerm SEPARATOR ", "»«term»«ENDFOR»
	'''
	
}