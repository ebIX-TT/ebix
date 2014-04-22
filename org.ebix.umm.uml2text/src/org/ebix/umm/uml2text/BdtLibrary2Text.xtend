package org.ebix.umm.uml2text

import org.eclipse.uml2.uml.Package
import org.eclipse.uml2.uml.Class
import org.eclipse.uml2.uml.Property
import org.eclipse.uml2.uml.Model
import org.ebix.umm.uml2text.model.BdtLibrary
import org.ebix.umm.uml2text.model.impl.BdtLibraryImpl
import org.ebix.umm.uml2text.model.impl.BDTImpl
import org.ebix.umm.uml2text.model.BDT
import org.eclipse.uml2.uml.Stereotype
import java.util.List
import org.ebix.umm.uml2text.file.FileWriter

class BdtLibrary2Text {
	
	extension BdtLibrary bdtlibraryExtension
	extension BDT bdtExtension
	extension Multiplicity2Text multiplicity2Text = new Multiplicity2Text
	extension Name2Text name2Text = new Name2Text
	
	private UmmStereotypes ummStereotypes
	private Stereotype CON
	private Stereotype SUP
	
	new (UmmStereotypes ummStereotypes) {
		this.ummStereotypes = ummStereotypes
		this.bdtlibraryExtension = new BdtLibraryImpl(ummStereotypes.BDTLibrary)
		this.bdtExtension = new BDTImpl(ummStereotypes.BDT)
		CON = ummStereotypes.BDT_CON.value
		SUP = ummStereotypes.BDT_SUP.value
	}  
	
	def generate(Model umlModel, FileWriter fw) {
		println("Generating BDTLibraries ...")
		for (umlPackage : umlModel.allOwnedElements.filter(typeof(Package)).filter(p | p.bdtLibrary) ) {
			println("BDTLibrary " + umlPackage.name)
			fw.writeFile(umlPackage.qualifiedName.fileName, umlPackage.generateBdtLibrary)
		} 
		println("Done.")
	}
	
	def generateBdtLibrary(Package umlPackage) '''
		BDTLibrary «umlPackage.qualifiedName»
		{
			businessTerm:      «FOR term      : umlPackage.businessTerm SEPARATOR ', '»"«term»"«ENDFOR»
			copyright:         «FOR copyright : umlPackage.copyright    SEPARATOR ', '»"«copyright»"«ENDFOR»
			owner:             «FOR owner     : umlPackage.owner()      SEPARATOR ", "»"«owner»"«ENDFOR»
			reference:         «FOR reference : umlPackage.reference    SEPARATOR ', '»"«reference»"«ENDFOR»
			uniqueIdentifier:  "«umlPackage.uniqueIdentifier»"
			versionIdentifier: "«umlPackage.versionIdentifier»"
			
			baseURN:           "«umlPackage.baseURN»"
			namespacePrefix:   "«umlPackage.namespacePrefix»"
		
			«FOR bdt : umlPackage.ownedMembers.filter(typeof(Class)).filter(c | c.isStereotypeApplied(ummStereotypes.BDT.value))»
			«bdt.generateBDT»
			
			«ENDFOR»
		}
	''' 
	
	def generateBDT(Class bdt) '''
		BDT «bdt.name»
		{
			businessTerm:      «FOR term : bdt.businessTerm SEPARATOR ", "»"«term»"«ENDFOR»
			definition:        "«bdt.definition»"
			dictionary:        "«bdt.dictionaryEntryName»"
			uniqueIdentifier:  "«bdt.uniqueIdentifier»"
			versionIdentifier: "«bdt.versionIdentifier»"
			
			«FOR attr : bdt.attributes»
				«IF attr.appliedStereotypes.contains(CON)»
					CON «attr.multiplicity()» «attr.name» : «attr.type.name» «attr.tagAsString(CON, "pattern")» «attr.tag(CON, "minLength")» «attr.tag(CON, "maxLength")» «attr.tag(CON, "length")» «attr.generate_defaultValue»
					{
						businessTerm:      «FOR term : attr.getValue(CON, "businessTerm") as List<String> SEPARATOR ", "»"«term»"«ENDFOR»
						definition:        "«attr.getValue(CON, "definition")»"
						dictionary:        "«attr.getValue(CON, "dictionaryEntryName")»"
						uniqueIdentifier:  "«attr.getValue(CON, "uniqueIdentifier")»"
						versionIdentifier: "«attr.getValue(CON, "versionIdentifier")»"
					}
				«ELSEIF attr.appliedStereotypes.contains(SUP)»
					SUP «attr.multiplicity()» «attr.name» : «attr.type.name» «attr.tagAsString(SUP, "pattern")» «attr.tag(SUP, "minLength")» «attr.tag(SUP, "maxLength")» «attr.tag(SUP, "length")» «attr.generate_defaultValue»
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

	def tag(Property p, Stereotype st, String tag) {
		if (p.getValue(st, tag) instanceof String) {
			val tagValue = p.getValue(st, tag) as String
			if (tagValue.length > 0) {
				return tag + ": " + tagValue
			}
		}
		return ""
	}

	def tagAsString(Property p, Stereotype st, String tag) {
		if (p.getValue(st, tag) instanceof String) {
			val tagValue = p.getValue(st, tag) as String
			if (tagValue.length > 0) {
				return tag + ": \"" + tagValue + "\""
			}
		}
		return ""
	}
	
	def generate_defaultValue(Property p) {
		if (p.^default != null && p.^default.length > 0) {
			return "defaultValue: " + p.^default
		}
	}
}







