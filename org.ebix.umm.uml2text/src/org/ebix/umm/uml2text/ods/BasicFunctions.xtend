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