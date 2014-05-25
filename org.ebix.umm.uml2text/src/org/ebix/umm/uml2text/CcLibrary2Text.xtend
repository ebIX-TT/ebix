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
import org.ebix.umm.uml2text.model.impl.CcLibraryImpl
import org.ebix.umm.uml2text.model.impl.ACCImpl
import org.ebix.umm.uml2text.model.impl.ASCCImpl
import org.ebix.umm.uml2text.model.impl.BCCImpl
import org.ebix.umm.uml2text.model.ACC
import org.ebix.umm.uml2text.model.ASCC
import org.ebix.umm.uml2text.model.BCC
import org.ebix.umm.uml2text.model.CcLibrary
import org.ebix.umm.uml2text.file.FileWriter

class CcLibrary2Text {
	
	extension CcLibrary ccLibraryExtension
	extension ACC accExtension
	extension ASCC asccExtension
	extension BCC bccExtension
	extension Constraint2Text constraint2Text = new Constraint2Text
	extension Multiplicity2Text multiplicity2Text = new Multiplicity2Text
	extension Name2Text name2Text = new Name2Text
	
	private UmmStereotypes ummStereotypes
	
	new (UmmStereotypes ummStereotypes) {
		this.ummStereotypes = ummStereotypes
		this.ccLibraryExtension = new CcLibraryImpl(ummStereotypes.CCLibrary)
		this.accExtension = new ACCImpl(ummStereotypes.ACC)
		this.asccExtension = new ASCCImpl(ummStereotypes.ASCC)
		this.bccExtension = new BCCImpl(ummStereotypes.BCC)
	}  
	
	def generate(Model umlModel, FileWriter fw) {
		println("Generating CCLibraries ...")
		for (umlPackage : umlModel.allOwnedElements.filter(typeof(Package)).filter(p | p.ccLibrary) ) {
			println("CCLibrary " + umlPackage.name)
			fw.writeFile(umlPackage.qualifiedName.fileName, umlPackage.generateCcLibrary)
		} 
		println("Done.")
	}
	
	def generateCcLibrary(Package umlPackage) '''
		CCLibrary "«umlPackage.qualifiedName»"
		{
			businessTerm:      «FOR term      : umlPackage.businessTerm SEPARATOR ', '»"«term»"«ENDFOR»
			copyright:         «FOR copyright : umlPackage.copyright    SEPARATOR ', '»"«copyright»"«ENDFOR»
			owner:             «FOR owner     : umlPackage.owner()      SEPARATOR ", "»"«owner»"«ENDFOR»
			reference:         «FOR reference : umlPackage.reference    SEPARATOR ', '»"«reference»"«ENDFOR»
			uniqueIdentifier:  "«umlPackage.uniqueIdentifier»"
			versionIdentifier: "«umlPackage.versionIdentifier»"
			
			baseURN:           "«umlPackage.baseURN»"
			namespacePrefix:   "«umlPackage.namespacePrefix»"
		
			
			«FOR acc : umlPackage.ownedMembers.filter(typeof(Class)).filter(c | c.isStereotypeApplied(ummStereotypes.ACC.value))»
			«acc.generateACC»
			
			«ENDFOR»
		}
	''' 
	
	def generateACC(Class acc) '''
		ACC «acc.name»
		{
			businessTerm:      «FOR term : acc.businessTerm SEPARATOR ", "»"«term»"«ENDFOR»
			definition:        "«acc.definition»"
			dictionary:        "«acc.dictionaryEntryName»"
			uniqueIdentifier:  "«acc.uniqueIdentifier»"
			versionIdentifier: "«acc.versionIdentifier»"
			
			«FOR attr : acc.attributes»
				«IF attr.association != null»
					ASCC «attr.multiplicity()» «attr.name» : «attr.type?.name»
					{
						businessTerm:      «FOR term : attr.association.businessTerm SEPARATOR ", "»"«term»"«ENDFOR»
						definition:        "«attr.association.definition»"
						dictionary:        "«attr.association.dictionaryEntryName»"
						uniqueIdentifier:  "«attr.association.uniqueIdentifier»"
						versionIdentifier: "«attr.association.versionIdentifier»"
						sequencingKey:     "«attr.association.sequencingKey»"
					}
				«ELSE»
					BCC «attr.multiplicity()» «attr.name» : «attr.type?.name»
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

			«FOR constraint : acc.ownedRules»
				«constraint.generatConstraint(ummStereotypes, constraint.context)»
			«ENDFOR»

		}
	'''
}







