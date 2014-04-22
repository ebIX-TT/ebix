package org.ebix.umm.uml2text

import org.eclipse.uml2.uml.Property

class Multiplicity2Text {
	def String multiplicity(Property p) {
		if (p.lower == 0 && p.upper == 1) {
			return "(0..1)"
		} else if (p.lower == 0 && p.upper == -1) {
			return "(0..*)"
		} else if (p.lower == 1 && p.upper == 1) {
			return "(1..1)"
		} else if(p.lower == 1 && p.upper == -1) {
			return "(1..*)"
		} else { 
			return "unsupported_multiplicity";	
		}
	}
}