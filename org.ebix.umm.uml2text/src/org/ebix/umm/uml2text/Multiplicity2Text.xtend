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