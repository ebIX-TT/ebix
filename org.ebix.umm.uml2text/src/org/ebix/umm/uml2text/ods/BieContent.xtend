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

import org.ebix.umm.uml2text.model.BieLibrary
import org.ebix.umm.uml2text.model.ABIE
import org.ebix.umm.uml2text.model.ASBIE
import org.ebix.umm.uml2text.model.BBIE
import org.ebix.umm.uml2text.Multiplicity2Text
import org.ebix.umm.uml2text.UmmStereotypes
import org.ebix.umm.uml2text.model.impl.BieLibraryImpl
import org.ebix.umm.uml2text.model.impl.ABIEImpl
import org.ebix.umm.uml2text.model.impl.ASBIEImpl
import org.ebix.umm.uml2text.model.impl.BBIEImpl
import org.eclipse.uml2.uml.Association
import org.eclipse.uml2.uml.Class
import org.eclipse.uml2.uml.Model
import org.eclipse.uml2.uml.Package
import org.eclipse.uml2.uml.Property
import org.eclipse.xtend2.lib.StringConcatenation

import static org.ebix.umm.uml2text.ods.BasicFunctions.*

class BieContent {

	extension BieLibrary bielibraryExtension
	extension ABIE abieExtension
	extension ASBIE asbieExtension
	extension BBIE bbieExtension


	extension Multiplicity2Text multiplicity2Text = new Multiplicity2Text
	
	private UmmStereotypes ummStereotypes
	private Model umlModel
	
	new (UmmStereotypes ummStereotypes, Model umlModel) {
		this.ummStereotypes = ummStereotypes
		this.umlModel = umlModel
		
		this.bielibraryExtension = new BieLibraryImpl(ummStereotypes.BIELibrary)
		this.abieExtension = new ABIEImpl(ummStereotypes.ABIE)
		this.asbieExtension = new ASBIEImpl(ummStereotypes.ASBIE)
		this.bbieExtension = new BBIEImpl(ummStereotypes.BBIE)
		
	}

	def sheet() '''
		<table:table table:name="BIE's" table:style-name="ta1">
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
			<table:table-column table:style-name="co1" table:default-cell-style-name="Default"/>
						
			«headerRow()»
			«content()»
		</table:table>
	'''
	
	def headerRow() '''
		«openHeaderRow»
			«headerCell("#", "Library", "Type", "Name", "", "Cardinality", "Definition", "Business term",
				"Sequencing key", "Version", "Language code",	"Unique identifier", "Usage Rules"
			)»
		«closeHeaderRow»
	'''
	
	
	def CharSequence content() {
    	val builder = new StringConcatenation
		var abieCount = 0
		for (umlPackage : umlModel.allOwnedElements.filter(typeof(Package)).filter(p | p.bieLibrary) ) {
			for (abie : umlPackage.ownedMembers.filter(typeof(Class)).filter(c | c.isStereotypeApplied(ummStereotypes.ABIE.value))) {
				abieCount = abieCount + 100
				builder.append(abieContent(abieCount, abie))
			}
		} 
		return builder
	}
	
	def abieContent(Integer count, Class abie) '''
		«openRow("rclass")»
		«cell("cclass", count.toString)»
		«cell("cclass", abie.namespace.qualifiedName)»
		«cell("cclass", "ABIE")»
		«cell("cclass", abie.constructedDictionaryEntryName)»
		«cell("cclass", "")»
		«cell("cclass-red", "")»
		«cell("cclass-wrap", abie.definition)»
		«cell("cclass", abie.flatBusinessTerm.toString.trim)»
		«cell("cclass-red", "")»
		«cell("cclass", abie.versionIdentifier)»
		«cell("cclass", abie.languageCode)»
		«cell("cclass", abie.uniqueIdentifier)»
		«cell("cclass", "")»
		«closeRow»
		«attributeContent(count, abie)»
	'''

	def CharSequence attributeContent(int count, Class abie) {
    	val builder = new StringConcatenation
		var attrCount = count
		for (attr : abie.attributes) {
			attrCount = attrCount + 1
			if (attr.association != null) {
				builder.append(asbieContent(attrCount, attr))
			} else {
				builder.append(bbieContent(attrCount, attr))
			}
		}
		return builder
	}

	def bbieContent(Integer count, Property bbie) '''
		«openRow("rattr")»
		«cell("cattr", count.toString)»
		«cell("cattr", bbie.class_.namespace.qualifiedName)»
		«cell("cattr", "")»
		«cell("cattr-blue", "BBIE")»
		«cell("cattr", bbie.constructedDictionaryEntryName)»
		«cell("cattr", bbie.multiplicity)»
		«cell("cattr-wrap", bbie.definition)»
		«cell("cattr", bbie.flatBusinessTerm.toString.trim)»
		«cell("cattr", bbie.sequencingKey)»
		«cell("cattr", bbie.versionIdentifier)»
		«cell("cattr", bbie.languageCode)»
		«cell("cattr", bbie.uniqueIdentifier)»
		«cell("cattr", "")»
		«closeRow»
	'''
	
	def asbieContent(Integer count, Property property) '''
		«openRow("rattr")»
		«cell("cattr", count.toString)»
		«cell("cattr", property.class_.namespace.qualifiedName)»
		«cell("cattr", "")»
		«cell("cattr-blue", "ASBIE")»
		«cell("cattr", property.constructedDictionaryEntryName(property.association))»
		«cell("cattr", property.multiplicity)»
		«cell("cattr-wrap", property.association.definition)»
		«cell("cattr", property.association.flatBusinessTerm.toString.trim)»
		«cell("cattr", property.association.sequencingKey)»
		«cell("cattr", property.association.versionIdentifier)»
		«cell("cattr", property.association.languageCode)»
		«cell("cattr", property.association.uniqueIdentifier)»
		«cell("cattr", "")»
		«closeRow»
	'''

	def constructedDictionaryEntryName(Class abie) {
		if (abie.dictionaryEntryName.length > 0) {
			return abie.dictionaryEntryName
		} else {
			return abie.name.replaceAll("_", "_ ") + ". Details" 
		}
	}

	def constructedDictionaryEntryName(Property bbie) {
		if (bbie.dictionaryEntryName.length > 0) {
			return bbie.dictionaryEntryName
		} else {
			var typeName = "-no type-"
			if (bbie.type != null) {
				typeName = bbie.type.name.replaceAll("_", "_ ").replaceAll("Type", "")
			} 
			return
				bbie.class_.constructedDictionaryEntryName
                + ". " 
                + bbie.name.replaceAll("_", "_ ") 
                + ". " 
                + typeName
		}
	}

	def constructedDictionaryEntryName(Property property, Association asbie) {
		if (asbie.dictionaryEntryName.length > 0) {
			return asbie.dictionaryEntryName
		} else {
			var typeName = "-no type-"
			if (property.type != null) {
				typeName = property.type.name.replaceAll("_", "_ ").replaceAll("Type", "")
			} 
			return
				property.class_.constructedDictionaryEntryName
                + ". " 
                + asbie.name.replaceAll("_", "_ ") 
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