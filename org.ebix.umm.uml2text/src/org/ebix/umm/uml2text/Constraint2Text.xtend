package org.ebix.umm.uml2text

import org.eclipse.uml2.uml.Constraint
import org.eclipse.uml2.uml.NamedElement
import java.util.List
import java.util.ArrayList

class Constraint2Text {

	def generatConstraint(Constraint umlConstraint, UmmStereotypes ummStereotypes, NamedElement context) '''
		constraint
		{ 
		    context: «context.name»
		    kind: «FOR kind : umlConstraint.kinds(ummStereotypes) SEPARATOR ', '»«kind.name»(List Identifier = '«kind.listIdentifier»', Responsible Agency = '«kind.responsibleAgency»')«ENDFOR»
		    
		    «umlConstraint.specification.stringValue.replaceSelf()»
		 }    
	'''

	def private List<ConstraintKind> kinds(Constraint umlConstraint, UmmStereotypes ummStereotypes) {
		val List<ConstraintKind> kinds = new ArrayList<ConstraintKind>()
		if (ummStereotypes.TC_Document.hasStereotype(umlConstraint)) {
			val ConstraintKind  ck = new ConstraintKind(
					"document", 
					listIdentifier(ummStereotypes.TC_Document, umlConstraint),
					responsibleAgency(ummStereotypes.TC_Document, umlConstraint)
			)
			kinds.add(ck)
		}
		if (ummStereotypes.TC_Payload.hasStereotype(umlConstraint)) {
			val ConstraintKind  ck = new ConstraintKind(
					"payload", 
					listIdentifier(ummStereotypes.TC_Payload, umlConstraint),
					responsibleAgency(ummStereotypes.TC_Payload, umlConstraint)
			)
			kinds.add(ck)
		}
		if (ummStereotypes.TC_ABIE.hasStereotype(umlConstraint)) {
			val ConstraintKind  ck = new ConstraintKind(
					"abie", 
					listIdentifier(ummStereotypes.TC_ABIE, umlConstraint),
					responsibleAgency(ummStereotypes.TC_ABIE, umlConstraint)
			)
			kinds.add(ck)
		}
		if (ummStereotypes.TC_BDT.hasStereotype(umlConstraint)) {
			val ConstraintKind  ck = new ConstraintKind(
					"bdt", 
					listIdentifier(ummStereotypes.TC_BDT, umlConstraint),
					responsibleAgency(ummStereotypes.TC_BDT, umlConstraint)
			)
			kinds.add(ck)
		}
		if (ummStereotypes.TC_Dependency.hasStereotype(umlConstraint)) {
			val ConstraintKind  ck = new ConstraintKind(
					"dependency", 
					listIdentifier(ummStereotypes.TC_Dependency, umlConstraint),
					responsibleAgency(ummStereotypes.TC_Dependency, umlConstraint)
			)
			kinds.add(ck)
		}
		if (ummStereotypes.TC_Facet.hasStereotype(umlConstraint)) {
			val ConstraintKind  ck = new ConstraintKind(
					"facet", 
					listIdentifier(ummStereotypes.TC_Facet, umlConstraint),
					responsibleAgency(ummStereotypes.TC_Facet, umlConstraint)
			)
			kinds.add(ck)
		}
		
		return kinds
	}
	
	def String listIdentifier(UmmStereotype st, Constraint umlConstraint) {
		var listIdentifierStr = ""
		val listIdentifier = st.getValue(umlConstraint, "ListIdentifier")
		if (listIdentifier == null) {
			listIdentifierStr = st.getDefaultValue("ListIdentifier")
		} else {
			listIdentifierStr = (listIdentifier as NamedElement).name
		}
		
		return listIdentifierStr
	}

	def String responsibleAgency(UmmStereotype st, Constraint umlConstraint) {
		var responsibleAgencyStr = ""
		val responsibleAgency = st.getValue(umlConstraint, "ResponsibleAgency")
		if (responsibleAgency == null) {
			responsibleAgencyStr = st.getDefaultValue("ResponsibleAgency")
		} else {
			responsibleAgencyStr = (responsibleAgency as NamedElement).name
		}
		
		return responsibleAgencyStr
	}

	def private String replaceSelf(String constraint) {
		var replaced = false
		val lines = constraint.split("\\r?\\n|\\r")
		var out = ""
		
		for (line : lines) {
			if (replaced) {
				out = out + "\n" + line
			} else {
				if (line.matches("\\s*--.*")) {
					// comment line
					out = out + "\n" + line
				} else {
					if (line.contains("self")) {
						// found
						replaced = true
						out = out + "\n" + line.replaceFirst("self", "inv: self")
					} else {
						out = out + "\n" + line
					}
				}
			}
			
		}
		
		return out
	}
	
}







