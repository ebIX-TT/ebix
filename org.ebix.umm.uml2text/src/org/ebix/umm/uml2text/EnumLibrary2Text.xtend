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
package org.ebix.umm.uml2text

import org.eclipse.uml2.uml.Package
import org.eclipse.uml2.uml.Model
import org.eclipse.uml2.uml.Stereotype
import java.util.List
import org.ebix.umm.uml2text.model.EnumLibrary
import org.ebix.umm.uml2text.model.impl.EnumLibraryImpl
import org.eclipse.uml2.uml.Enumeration
import org.eclipse.uml2.uml.EnumerationLiteral
import org.ebix.umm.uml2text.file.FileWriter

class EnumLibrary2Text {
	
	extension EnumLibrary enumlibraryExtension
	extension Comment2Text comment2Text = new Comment2Text
	extension Name2Text name2Text = new Name2Text
	
	private UmmStereotypes ummStereotypes
	private Stereotype ENUM
	private Stereotype Original
	private Stereotype Subset
	private Stereotype Assembled
	private Stereotype CodelistEntry
	
	new (UmmStereotypes ummStereotypes) {
		this.ummStereotypes = ummStereotypes
		this.enumlibraryExtension = new EnumLibraryImpl(ummStereotypes.ENUMLibrary)
		ENUM = ummStereotypes.ENUM.value
		Original = ummStereotypes.Original.value
		Subset = ummStereotypes.Subset.value
		Assembled = ummStereotypes.Assembled.value
		CodelistEntry = ummStereotypes.CodelistEntry.value
	}  
	
	def generate(Model umlModel, FileWriter fw) {
		println("Generating ENUMLibraries ...")
		for (umlPackage : umlModel.allOwnedElements.filter(typeof(Package)).filter(p | p.enumLibrary) ) {
			println("ENUMLibrary " + umlPackage.name)
			fw.writeFile(umlPackage.qualifiedName.fileName, umlPackage.generateEnumLibrary)
		} 
		println("Done.")
	}
	
	def generateEnumLibrary(Package umlPackage) '''
		ENUMLibrary "«umlPackage.qualifiedName»"
		{
			businessTerm:      «FOR term      : umlPackage.businessTerm SEPARATOR ', '»"«term»"«ENDFOR»
			copyright:         «FOR copyright : umlPackage.copyright    SEPARATOR ', '»"«copyright»"«ENDFOR»
			owner:             «FOR owner     : umlPackage.owner()      SEPARATOR ", "»"«owner»"«ENDFOR»
			reference:         «FOR reference : umlPackage.reference    SEPARATOR ', '»"«reference»"«ENDFOR»
			uniqueIdentifier:  "«umlPackage.uniqueIdentifier»"
			versionIdentifier: "«umlPackage.versionIdentifier»"
			
			baseURN:           "«umlPackage.baseURN»"
			namespacePrefix:   "«umlPackage.namespacePrefix»"
		
			«FOR e : umlPackage.allOwnedElements.filter(typeof(Enumeration)).filter(e | e.isStereotypeApplied(ENUM))»
			«e.generateEnum»
			
			«ENDFOR»
		}
	''' 
	
	def generateEnum(Enumeration e) '''
		«IF e.isStereotypeApplied(Assembled)»
			Assembled «e.name»
			{
				«e.enumTags»
				
				«FOR o : e.generals.filter(typeof(Enumeration)).filter(g | g.isStereotypeApplied(Original)) BEFORE "originals: " SEPARATOR ", "»«o.enumName»«ENDFOR»
				«FOR o : e.generals.filter(typeof(Enumeration)).filter(g | g.isStereotypeApplied(Subset)) BEFORE "subsets: " SEPARATOR ", "»«o.enumName»«ENDFOR»
				«e.enumMembers»
			}
		«ELSEIF e.isStereotypeApplied(Subset)»
			Subset «e.enumName»
			{
				«e.enumTags»
				«e.enumMembers»
			}
		«ELSEIF e.isStereotypeApplied(Original)»
			Original «e.enumName»
			{
				«e.enumTags»
				«e.enumMembers»
			}
		«ENDIF»		
	'''

	def enumName(Enumeration e) {
		if (e.getValue(ENUM, "codeListIdentifier") instanceof String) {
			val idValue = e.getValue(ENUM, "codeListIdentifier") as String
			if (idValue.length > 0) {
				return idValue + "_" + e.name
			}
		}
		return e.name
	}

	def enumTags(Enumeration e) '''
		businessTerm:              «FOR term : e.getValue(ENUM, "businessTerm") as List<String> SEPARATOR ", "»"«term»"«ENDFOR»
		definition:                "«e.getValue(ENUM, "definition")»"
		codeListAgencyIdentifier:  "«e.getValue(ENUM, "codeListAgencyIdentifier")»"
		codeListName:              "«e.getValue(ENUM, "codeListName")»"
		codeListIdentifier:        "«e.getValue(ENUM, "codeListIdentifier")»"
		dictionary:                "«e.getValue(ENUM, "dictionaryEntryName")»"
		uniqueIdentifier:          "«e.getValue(ENUM, "uniqueIdentifier")»"
		versionIdentifier:         "«e.getValue(ENUM, "versionIdentifier")»"
	'''
	
	 
	def enumMembers(Enumeration e) '''
		«FOR codelistEntry : e.ownedLiterals.filter(l | l.isStereotypeApplied(CodelistEntry))»
			CodelistEntry "«codelistEntry.name»" "«codelistEntry.codeName»"  
		«ENDFOR»
	'''
	
	def codeName(EnumerationLiteral l) {
		val codeName = l.getValue(CodelistEntry, "codeName")
		if (codeName instanceof String) {
			return (codeName as String).strip 
		}
		return ""
	}
	
}







