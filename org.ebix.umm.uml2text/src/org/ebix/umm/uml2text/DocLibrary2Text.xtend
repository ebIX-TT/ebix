package org.ebix.umm.uml2text

import org.eclipse.uml2.uml.Package
import org.eclipse.uml2.uml.Class
import org.ebix.umm.uml2text.model.DocLibrary
import org.eclipse.uml2.uml.Constraint
import org.eclipse.uml2.uml.NamedElement
import org.eclipse.uml2.uml.Model
import org.eclipse.uml2.uml.Property
import org.ebix.umm.uml2text.model.impl.DocLibraryImpl
import org.ebix.umm.uml2text.file.FileWriter

class DocLibrary2Text {
	
	extension Constraint2Text constraint2Text = new Constraint2Text
	extension DocLibrary doclibrary
	extension Multiplicity2Text multiplicity2Text = new Multiplicity2Text
	extension Name2Text name2Text = new Name2Text
	
	private UmmStereotypes ummStereotypes
	
	new (UmmStereotypes ummStereotypes) {
		this.ummStereotypes = ummStereotypes
		this.doclibrary = new DocLibraryImpl(ummStereotypes.DocLibrary)
	}  
	
	def generate(Model umlModel, FileWriter fw) {
		println("Generating DOCLibraries ...")
		for (umlPackage : umlModel.allOwnedElements.filter(typeof(Package)).filter(p | p.docLibrary) ) {
			println("DOCLibrary " + umlPackage.name)
			fw.writeFile(umlPackage.qualifiedName.fileName, umlPackage.generateDocLibrary)
		} 
		println("Done.")
	}
	
	
	def generateDocLibrary(Package umlPackage) '''
		DocLibrary "«umlPackage.qualifiedName»"
		{
			businessTerm:      «FOR term      : umlPackage.businessTerm SEPARATOR ', '»"«term»"«ENDFOR»
			copyright:         «FOR copyright : umlPackage.copyright    SEPARATOR ', '»"«copyright»"«ENDFOR»
			owner:             «FOR owner     : umlPackage.owner()      SEPARATOR ", "»"«owner»"«ENDFOR»
			reference:         «FOR reference : umlPackage.reference    SEPARATOR ', '»"«reference»"«ENDFOR»
			uniqueIdentifier:  "«umlPackage.uniqueIdentifier»"
			versionIdentifier: "«umlPackage.versionIdentifier»"
			
			baseURN:           "«umlPackage.baseURN»"
			namespacePrefix:   "«umlPackage.namespacePrefix»"
		
			BIE: «umlPackage.bieVersion?.qualifiedName»
			BDT: «umlPackage.bdtVersion?.qualifiedName»
			
			«FOR infEnvelope : umlPackage.ownedMembers.filter(typeof(Class)).filter(c | c.isStereotypeApplied(ummStereotypes.InfEnvelope.value))»
			«infEnvelope.generateInfEnvelope»
			«ENDFOR»
		}
	''' 
	
	def generateInfEnvelope(Class umlClass) '''
		InfEnvelope "«umlClass.name»"
		{
			«FOR attr : umlClass.attributes.filter(attr| attr.association != null && attr.type.isStereotypeApplied(ummStereotypes.MA.value))»
			«(attr.type as Class)?.generateMA»
			«ENDFOR»
		}
	'''

	def generateMA(Class umlClass) '''
		MA «umlClass.name»
		{
			«FOR attr : umlClass.allAttributes.filter(attr| attr.type.isStereotypeApplied(ummStereotypes.ABIE.value))»
				«attr.prefixMAAttribute» «attr.name» «attr.multiplicity» «attr.type?.name»
			«ENDFOR»
			
			«FOR constraint : umlClass.ownedRules»
				«constraint.generatConstraint(ummStereotypes, constraint.constrainedElements.head as NamedElement)»
			«ENDFOR»
		}
	'''
	
	def prefixMAAttribute(Property umlProperty) {
		if (umlProperty.association.isStereotypeApplied(ummStereotypes.ASMA.value)) {
			return "ASMA"
		} else {
			return "    "
		}
	} 

}


