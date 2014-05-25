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
import org.eclipse.uml2.uml.Class
import org.eclipse.uml2.uml.Model
import org.ebix.umm.uml2text.model.BieLibrary
import org.ebix.umm.uml2text.model.impl.BieLibraryImpl
import org.ebix.umm.uml2text.model.impl.ABIEImpl
import org.ebix.umm.uml2text.model.impl.ASBIEImpl
import org.ebix.umm.uml2text.model.impl.BBIEImpl
import org.ebix.umm.uml2text.model.ABIE
import org.ebix.umm.uml2text.model.ASBIE
import org.ebix.umm.uml2text.model.BBIE
import org.ebix.umm.uml2text.file.FileWriter

class BieLibrary2Text {
	
	extension BieLibrary bielibraryExtension
	extension ABIE abieExtension
	extension ASBIE asbieExtension
	extension BBIE bbieExtension
	extension Constraint2Text constraint2Text = new Constraint2Text
	extension Multiplicity2Text multiplicity2Text = new Multiplicity2Text
	extension Name2Text name2Text = new Name2Text
	
	private UmmStereotypes ummStereotypes
	
	new (UmmStereotypes ummStereotypes) {
		this.ummStereotypes = ummStereotypes
		this.bielibraryExtension = new BieLibraryImpl(ummStereotypes.BIELibrary)
		this.abieExtension = new ABIEImpl(ummStereotypes.ABIE)
		this.asbieExtension = new ASBIEImpl(ummStereotypes.ASBIE)
		this.bbieExtension = new BBIEImpl(ummStereotypes.BBIE)
	}  
	
	def generate(Model umlModel, FileWriter fw) {
		println("Generating BIELibraries ...")
		for (umlPackage : umlModel.allOwnedElements.filter(typeof(Package)).filter(p | p.bieLibrary) ) {
			println("BIELibrary " + umlPackage.name)
			fw.writeFile(umlPackage.qualifiedName.fileName, umlPackage.generateBieLibrary)
		} 
		println("Done.")
	}
	
	def generateBieLibrary(Package umlPackage) '''
		BIELibrary «umlPackage.qualifiedName»
		{
			businessTerm:      «FOR term      : umlPackage.businessTerm SEPARATOR ', '»"«term»"«ENDFOR»
			copyright:         «FOR copyright : umlPackage.copyright    SEPARATOR ', '»"«copyright»"«ENDFOR»
			owner:             «FOR owner     : umlPackage.owner()      SEPARATOR ", "»"«owner»"«ENDFOR»
			reference:         «FOR reference : umlPackage.reference    SEPARATOR ', '»"«reference»"«ENDFOR»
			uniqueIdentifier:  "«umlPackage.uniqueIdentifier»"
			versionIdentifier: "«umlPackage.versionIdentifier»"
			
			baseURN:           "«umlPackage.baseURN»"
			namespacePrefix:   "«umlPackage.namespacePrefix»"
		
			BDT: «umlPackage.bdtVersion?.qualifiedName»
			
			«FOR abie : umlPackage.ownedMembers.filter(typeof(Class)).filter(c | c.isStereotypeApplied(ummStereotypes.ABIE.value))»
			«abie.generateABIE»
			
			«ENDFOR»
		}
	''' 
	
	def generateABIE(Class abie) '''
		ABIE «abie.name»
		{
			businessTerm:      «FOR term : abie.businessTerm SEPARATOR ", "»"«term»"«ENDFOR»
			definition:        "«abie.definition»"
			dictionary:        "«abie.dictionaryEntryName»"
			uniqueIdentifier:  "«abie.uniqueIdentifier»"
			versionIdentifier: "«abie.versionIdentifier»"
			
			«FOR attr : abie.attributes»
				«IF attr.association != null»
					ASBIE «attr.multiplicity()» «attr.name» : «attr.type?.name»
					{
						businessTerm:      «FOR term : attr.association.businessTerm SEPARATOR ", "»"«term»"«ENDFOR»
						definition:        "«attr.association.definition»"
						dictionary:        "«attr.association.dictionaryEntryName»"
						uniqueIdentifier:  "«attr.association.uniqueIdentifier»"
						versionIdentifier: "«attr.association.versionIdentifier»"
						sequencingKey:     "«attr.association.sequencingKey»"
					}
				«ELSE»
					BBIE «attr.multiplicity()» «attr.name» : «attr.type?.name»
					{
						businessTerm:      «FOR term : attr.businessTerm SEPARATOR ", "»"«term»"«ENDFOR»
						definition:        "«attr.definition»"
						dictionary:        "«attr.dictionaryEntryName»"
						uniqueIdentifier:  "«attr.uniqueIdentifier»"
						versionIdentifier: "«attr.versionIdentifier»"
						sequencingKey:     "«attr.sequencingKey»"
					}
				«ENDIF»
			«ENDFOR»

			«FOR constraint : abie.ownedRules»
				«constraint.generatConstraint(ummStereotypes, constraint.context)»
			«ENDFOR»

		}
	'''

}







