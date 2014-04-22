package org.ebix.umm.uml2text.file

interface FileWriter {
	def void writeFile(String fileName, CharSequence contents)
	def void writeFile(String fileName, byte[] contents)
}