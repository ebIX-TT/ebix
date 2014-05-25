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
package org.ebix.umm.templates


class Constants {
	
	org.ebix.umm.templates.SchemaDate schemaDate = new SchemaDate()
	
	public final Constant schemaMajorVersion = new Constant("Major version", "0")
	public final Constant schemaMinorVersion = new Constant("Minor version", "1")
	public final Constant schemaRevision     = new Constant("Revision", "A")

	public final Constant schemaAgency       = new Constant("Schema Agency", "ebIX")
	public final Constant copyright          = new Constant("Copyright Notice", "Copyright (C) ebIX (2010). All Rights Reserved.")
	public final Constant disclaimer         = new Constant("Disclaimer", defaultDisclaimerText().toString)
	
	public val allConstants = #[ 
		//schemaMajorVersion, schemaMinorVersion, schemaMinorVersion,
		schemaAgency,
		copyright, disclaimer
	]
	
	private String schemaLocation
	
	
	def schemaVersion() {
		schemaMajorVersion.value + "." + schemaMinorVersion.value + "." + schemaRevision.value
	}
	
	def String schemaDate() {
		return schemaDate.schemaDate()
	}
	
	def schemaLocation() {
		return schemaLocation
	}
	
	def setSchemaLocation(String schemaLocation) {
		this.schemaLocation = schemaLocation
	}

	private final def defaultDisclaimerText() '''
		This document and translations of it may be copied and furnished to others,
		and derivative works that comment on or otherwise explain it or assist in
		its implementation may be prepared, copied, published and distributed, in
		whole or in part, without restriction of any kind, provided that the above
		copyright notice and this paragraph are included on all such copies and
		derivative works. However, this document itself may not be modified in any
		way, such as by removing the copyright notice or references to ebIX, except
		as needed for the purpose of developing ebIX specifications, in which case
		the procedures for copyrights defined in the UN/CEFACT Intellectual Property
		Rights document must be followed, or as required to translate it into
		languages other than English.
		The limited permissions granted above are perpetual and will not be revoked
		by ebIX or its successors or assigns.
		This document and the information contained herein is provided on an "AS IS"
		basis and ebIX DISCLAIMS ALL WARRANTIES, EXPRESS OR IMPLIED, INCLUDING BUT
		NOT LIMITED TO ANY WARRANTY THAT THE USE OF THE INFORMATION HEREIN WILL NOT
		INFRINGE ANY RIGHTS OR ANY IMPLIED WARRANTIES OF MERCHANTABILITY OR FITNESS
		FOR A PARTICULAR PURPOSE.
	'''
	
}



