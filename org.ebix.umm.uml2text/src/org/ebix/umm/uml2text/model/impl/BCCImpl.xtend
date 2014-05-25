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

import org.ebix.umm.uml2text.model.BCC
import org.eclipse.uml2.uml.Property
import org.ebix.umm.uml2text.UmmStereotype

class BCCImpl implements BCC {
	
	protected UmmStereotype ummStereotype
	
	new (UmmStereotype ummStereotype) {
		this.ummStereotype = ummStereotype
	}
	
	override businessTerm(Property umlProperty) {
		ummStereotype.getListOfStringValue(umlProperty, "businessTerm");
	}
	
	override uniqueIdentifier(Property umlProperty) {
		ummStereotype.getStringValue(umlProperty, "uniqueIdentifier");
	}
	
	override versionIdentifier(Property umlProperty) {
		ummStereotype.getStringValue(umlProperty, "versionIdentifier");
	}
	
	override definition(Property umlProperty) {
		ummStereotype.getStringValue(umlProperty, "definition");
	}
	
	override dictionaryEntryName(Property umlProperty) {
		ummStereotype.getStringValue(umlProperty, "dictionaryEntryName");
	}
	
	override sequencingKey(Property umlProperty) {
		ummStereotype.getStringValue(umlProperty, "sequencingKey");
	}
	
}