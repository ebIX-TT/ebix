package org.ebix.umm.uml2text.ods

class Mimetype extends OdsPart {
	override String fileName() {
		return "mimetype"
	}

	override String content() '''application/vnd.oasis.opendocument.spreadsheet'''
	
}