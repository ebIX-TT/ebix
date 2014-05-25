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

class BasicFunctions {
	
	static def openHeaderRow() '''
		<table:table-row table:style-name="rheader">
	'''
	
	static def closeHeaderRow() '''
		</table:table-row>
	'''

	static def headerCell(String... names) '''
		«FOR name : names»
			<table:table-cell table:style-name="cheader" office:value-type="string"><text:p>«name»</text:p></table:table-cell>
		«ENDFOR»
	'''

	static def openRow(String styleName) '''
		<table:table-row table:style-name="«styleName»">
	'''
	
	static def closeRow() '''
		</table:table-row>
	'''

	static def cell(String styleName, String content) '''
		<table:table-cell table:style-name="«styleName»" office:value-type="string"><text:p>«content»</text:p></table:table-cell>
	'''
	
}