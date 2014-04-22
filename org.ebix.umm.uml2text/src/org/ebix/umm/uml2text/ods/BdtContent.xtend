package org.ebix.umm.uml2text.ods

import org.ebix.umm.uml2text.Multiplicity2Text
import org.ebix.umm.uml2text.UmmStereotypes
import org.eclipse.uml2.uml.Class
import org.eclipse.uml2.uml.Model
import org.eclipse.uml2.uml.Package
import org.eclipse.uml2.uml.Property
import org.eclipse.xtend2.lib.StringConcatenation
import org.ebix.umm.uml2text.model.BdtLibrary
import org.ebix.umm.uml2text.model.BDT
import org.eclipse.uml2.uml.Stereotype
import org.ebix.umm.uml2text.model.impl.BdtLibraryImpl
import org.ebix.umm.uml2text.model.impl.BDTImpl

import static org.ebix.umm.uml2text.ods.BasicFunctions.*
import org.ebix.umm.uml2text.model.impl.CONImpl
import org.ebix.umm.uml2text.model.impl.SUPImpl
import org.ebix.umm.uml2text.model.CON
import org.ebix.umm.uml2text.model.SUP
import org.ebix.umm.uml2text.UmmStereotype

class BdtContent {

	extension BdtLibrary bdtlibraryExtension
	extension BDT bdtExtension

	extension Multiplicity2Text multiplicity2Text = new Multiplicity2Text
	
	private UmmStereotypes ummStereotypes
	private Model umlModel
	private CON con
	private SUP sup
	private Stereotype CON 
	private Stereotype SUP 
	
	
	new (UmmStereotypes ummStereotypes, Model umlModel) {
		this.ummStereotypes = ummStereotypes
		this.umlModel = umlModel
		
		this.bdtlibraryExtension = new BdtLibraryImpl(ummStereotypes.BDTLibrary)
		this.bdtExtension = new BDTImpl(ummStereotypes.BDT)
		this.con = new CONImpl(ummStereotypes.BDT_CON)
		this.sup = new SUPImpl(ummStereotypes.BDT_SUP)
		this.CON = ummStereotypes.BDT_CON.value
		this.SUP = ummStereotypes.BDT_SUP.value
	}
	
	def sheet() '''
		<table:table table:name="BDT's" table:style-name="ta1">
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
			
			«headerRow»
			«content»
		</table:table>
	'''

	def headerRow() '''
		«openHeaderRow»
			«headerCell("#", "Library", "Type", "Name", "", "Cardinality", "Definition", "Business term",
				"Version", "Language code",	"Unique identifier", "Usage Rules"
			)»
		«closeHeaderRow»
	'''

	def CharSequence content() {
    	val builder = new StringConcatenation
		var bdtCount = 0
		for (umlPackage : umlModel.allOwnedElements.filter(typeof(Package)).filter(p | p.bdtLibrary) ) {
			for (bdt : umlPackage.ownedMembers.filter(typeof(Class)).filter(c | c.isStereotypeApplied(ummStereotypes.BDT.value))) {
				bdtCount = bdtCount + 100
				builder.append(bdtContent(bdtCount, bdt))
			}
		} 
		return builder
	}

	def bdtContent(Integer count, Class bdt) '''
		«openRow("rclass")»
		«cell("cclass", count.toString)»
		«cell("cclass", bdt.namespace.qualifiedName)»
		«cell("cclass", "BDT")»
		«cell("cclass", bdt.constructedDictionaryEntryName)»
		«cell("cclass", "")»
		«cell("cclass-red", "")»
		«cell("cclass-wrap", bdt.definition)»
		«cell("cclass", bdt.flatBusinessTerm.toString.trim)»
		«cell("cclass", bdt.versionIdentifier)»
		«cell("cclass", bdt.languageCode)»
		«cell("cclass", bdt.uniqueIdentifier)»
		«cell("cclass", "")»
		«closeRow»
		«attributeContent(count, bdt)»
	'''
	
	def CharSequence attributeContent(int count, Class abie) {
    	val builder = new StringConcatenation
		var attrCount = count
		for (attr : abie.attributes) {
			attrCount = attrCount + 1
			if (con.isCON(attr)) {
				builder.append(conContent(attrCount, attr))
			} else if (sup.isSUP(attr)) {
				builder.append(supContent(attrCount, attr))
			}
		}
		return builder
	}

	def conContent(Integer count, Property property) '''
		«openRow("rattr")»
		«cell("cattr", count.toString)»
		«cell("cattr", property.class_.namespace.qualifiedName)»
		«cell("cattr", "")»
		«cell("cattr-blue", "CON")»
		«cell("cattr", property.constructedDictionaryEntryName(ummStereotypes.BDT_CON))»
		«cell("cattr", property.multiplicity)»
		«cell("cattr-wrap", con.definition(property))»
		«cell("cattr", property.flatBusinessTerm(ummStereotypes.BDT_CON).toString.trim)»
		«cell("cattr", con.versionIdentifier(property))»
		«cell("cattr", con.languageCode(property))»
		«cell("cattr", con.uniqueIdentifier(property))»
		«cell("cattr", "")»
		«closeRow»
	'''

	def supContent(Integer count, Property property) '''
		«openRow("rattr")»
		«cell("cattr", count.toString)»
		«cell("cattr", property.class_.namespace.qualifiedName)»
		«cell("cattr", "")»
		«cell("cattr-blue", "SUP")»
		«cell("cattr", property.constructedDictionaryEntryName(ummStereotypes.BDT_SUP))»
		«cell("cattr", property.multiplicity)»
		«cell("cattr-wrap", sup.definition(property))»
		«cell("cattr", property.flatBusinessTerm(ummStereotypes.BDT_SUP).toString.trim)»
		«cell("cattr", sup.versionIdentifier(property))»
		«cell("cattr", sup.languageCode(property))»
		«cell("cattr", sup.uniqueIdentifier(property))»
		«cell("cattr", "")»
		«closeRow»
	'''
	
	def constructedDictionaryEntryName(Class bdt) {
		if (bdt.dictionaryEntryName.length > 0) {
			return bdt.dictionaryEntryName
		} else {
			return bdt.name.replaceAll("_", "_ ") + ". Type" 
		}
	}
	
	def constructedDictionaryEntryName(Property property, UmmStereotype stereotype) {
		if (stereotype.getStringValue(property, "dictionaryEntryName").length > 0) {
			return stereotype.getStringValue(property, "dictionaryEntryName")
		} else {
			var typeName = "-no type-"
			if (property.type != null) {
				typeName = property.type.name.replaceAll("_", "_ ")
			} 
			return
				property.class_.constructedDictionaryEntryName
                + ". " 
                + property.name.replaceAll("_", "_ ") 
                + ". " 
                + typeName
		}
	}
	

	def flatBusinessTerm (Class clazz) '''
		«FOR term : clazz.businessTerm SEPARATOR ", "»«term»«ENDFOR»
	'''
	
	def flatBusinessTerm (Property property, UmmStereotype stereotype) '''
		«FOR term : stereotype.getListOfStringValue(property, "businessTerm") SEPARATOR ", "»«term»«ENDFOR»
	'''
}