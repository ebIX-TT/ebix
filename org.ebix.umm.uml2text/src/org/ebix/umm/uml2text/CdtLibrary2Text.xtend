package org.ebix.umm.uml2text

import org.eclipse.uml2.uml.Package
import org.eclipse.uml2.uml.Class
import org.eclipse.uml2.uml.Property
import org.eclipse.uml2.uml.Model
import org.ebix.umm.uml2text.model.CdtLibrary
import org.ebix.umm.uml2text.model.impl.CdtLibraryImpl
import org.ebix.umm.uml2text.model.impl.CDTImpl
import org.ebix.umm.uml2text.model.CDT
import org.eclipse.uml2.uml.Stereotype
import java.util.List
import org.ebix.umm.uml2text.file.FileWriter

class CdtLibrary2Text {
	
	extension CdtLibrary cdtlibraryExtension
	extension CDT cdtExtension
	extension Multiplicity2Text multiplicity2Text = new Multiplicity2Text
	extension Name2Text name2Text = new Name2Text
	
	private UmmStereotypes ummStereotypes
	private Stereotype CON
	private Stereotype SUP
	
	new (UmmStereotypes ummStereotypes) {
		this.ummStereotypes = ummStereotypes
		this.cdtlibraryExtension = new CdtLibraryImpl(ummStereotypes.CDTLibrary)
		this.cdtExtension = new CDTImpl(ummStereotypes.CDT)
		CON = ummStereotypes.CDT_CON.value
		SUP = ummStereotypes.CDT_SUP.value
	}  
	
	def generate(Model umlModel, FileWriter fw) {
		println("Generating CDTLibraries ...")
		for (umlPackage : umlModel.allOwnedElements.filter(typeof(Package)).filter(p | p.cdtLibrary) ) {
			println("CDTLibrary " + umlPackage.name)
			fw.writeFile(umlPackage.qualifiedName.fileName, umlPackage.generateCdtLibrary)
		} 
		println("Done.")
	}
	
	def generateCdtLibrary(Package umlPackage) '''
		CDTLibrary "«umlPackage.qualifiedName»"
		{
			businessTerm:      «FOR term      : umlPackage.businessTerm SEPARATOR ', '»"«term»"«ENDFOR»
			copyright:         «FOR copyright : umlPackage.copyright    SEPARATOR ', '»"«copyright»"«ENDFOR»
			owner:             «FOR owner     : umlPackage.owner()      SEPARATOR ", "»"«owner»"«ENDFOR»
			reference:         «FOR reference : umlPackage.reference    SEPARATOR ', '»"«reference»"«ENDFOR»
			uniqueIdentifier:  "«umlPackage.uniqueIdentifier»"
			versionIdentifier: "«umlPackage.versionIdentifier»"
			
			baseURN:           "«umlPackage.baseURN»"
			namespacePrefix:   "«umlPackage.namespacePrefix»"
		
			«FOR cdt : umlPackage.ownedMembers.filter(typeof(Class)).filter(c | c.isStereotypeApplied(ummStereotypes.CDT.value))»
			«cdt.generateCDT»
			
			«ENDFOR»
		}
	''' 
	
	def generateCDT(Class cdt) '''
		CDT «cdt.name»
		{
			businessTerm:      «FOR term : cdt.businessTerm SEPARATOR ", "»"«term»"«ENDFOR»
			definition:        "«cdt.definition»"
			dictionary:        "«cdt.dictionaryEntryName»"
			uniqueIdentifier:  "«cdt.uniqueIdentifier»"
			versionIdentifier: "«cdt.versionIdentifier»"
			
			«FOR attr : cdt.attributes»
				«IF attr.appliedStereotypes.contains(CON)»
					CON «attr.multiplicity()» «attr.name» : «attr.type.name» «attr.generate_defaultValue»
					{
						businessTerm:      «FOR term : attr.getValue(CON, "businessTerm") as List<String> SEPARATOR ", "»"«term»"«ENDFOR»
						definition:        "«attr.getValue(CON, "definition")»"
						dictionary:        "«attr.getValue(CON, "dictionaryEntryName")»"
						uniqueIdentifier:  "«attr.getValue(CON, "uniqueIdentifier")»"
						versionIdentifier: "«attr.getValue(CON, "versionIdentifier")»"
					}
				«ELSEIF attr.appliedStereotypes.contains(SUP)»
					SUP «attr.multiplicity()» «attr.name» : «attr.type.name» «attr.generate_defaultValue»
					{
						businessTerm:      «FOR term : attr.getValue(SUP, "businessTerm") as List<String> SEPARATOR ", "»"«term»"«ENDFOR»
						definition:        "«attr.getValue(SUP, "definition")»"
						dictionary:        "«attr.getValue(SUP, "dictionaryEntryName")»"
						uniqueIdentifier:  "«attr.getValue(SUP, "uniqueIdentifier")»"
						versionIdentifier: "«attr.getValue(SUP, "versionIdentifier")»"
					}
				«ENDIF»
			«ENDFOR»

		}
	'''

	def generate_defaultValue(Property p) {
		if (p.^default != null && p.^default.length > 0) {
			return "defaultValue: " + p.^default
		}
	}
}







