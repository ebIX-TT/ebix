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
package org.ebix.umm.uml2text.model.impl

import org.ebix.umm.uml2text.model.ASCC
import org.eclipse.uml2.uml.Association
import org.ebix.umm.uml2text.UmmStereotype

class ASCCImpl implements ASCC {
	
	protected UmmStereotype ummStereotype
	
	new (UmmStereotype ummStereotype) {
		this.ummStereotype = ummStereotype
	}
	
	override businessTerm(Association umlAssociation) {
		ummStereotype.getListOfStringValue(umlAssociation, "businessTerm");
	}
	
	override uniqueIdentifier(Association umlAssociation) {
		ummStereotype.getStringValue(umlAssociation, "uniqueIdentifier");
	}
	
	override versionIdentifier(Association umlAssociation) {
		ummStereotype.getStringValue(umlAssociation, "versionIdentifier");
	}
	
	override definition(Association umlAssociation) {
		ummStereotype.getStringValue(umlAssociation, "definition");
	}
	
	override dictionaryEntryName(Association umlAssociation) {
		ummStereotype.getStringValue(umlAssociation, "dictionaryEntryName");
	}
	
	override sequencingKey(Association umlAssociation) {
		ummStereotype.getStringValue(umlAssociation, "sequencingKey");
	}
	
}