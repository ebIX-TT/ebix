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
package org.ebix.umm.uml2text.ods

class Manifest extends OdsPart {
	
	override String fileName() {
		return "META-INF/manifest.xml"
	}
	
	override String content() '''
		<?xml version="1.0" encoding="UTF-8"?>
		<manifest:manifest xmlns:manifest="urn:oasis:names:tc:opendocument:xmlns:manifest:1.0">
			<manifest:file-entry manifest:media-type="application/vnd.oasis.opendocument.spreadsheet" manifest:full-path="/"/>
			<manifest:file-entry manifest:media-type="text/xml" manifest:full-path="meta.xml"/>
			<manifest:file-entry manifest:media-type="text/xml" manifest:full-path="content.xml"/>
			<manifest:file-entry manifest:media-type="text/xml" manifest:full-path="styles.xml"/>
		</manifest:manifest>
	'''
	
}