package org.ebix.umm.uml2text.ods

import java.util.zip.ZipEntry
import java.util.zip.ZipOutputStream

abstract class OdsPart {
	
	
	def void add(ZipOutputStream zos) {
		val zipEntry = new ZipEntry(fileName)
		zos.putNextEntry(zipEntry)
		zos.write(content().bytes)
		zos.closeEntry
	}
	
	def String fileName() 
	def String content() 
	
}