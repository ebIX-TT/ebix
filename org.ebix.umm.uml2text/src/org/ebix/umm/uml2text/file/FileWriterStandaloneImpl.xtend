package org.ebix.umm.uml2text.file

import java.io.File
import java.io.PrintWriter
import java.io.FileOutputStream

class FileWriterStandaloneImpl implements FileWriter {
	
	override writeFile(String fileName, CharSequence contents) {
		makeDirectories(fileName)
		val printWriter = new PrintWriter(fileName)
		printWriter.write(contents.toString)
		printWriter.close
	}

	def private makeDirectories(String fileName) {
		val file = new File(fileName)
		file.parentFile.mkdirs
	}
	
	override writeFile(String fileName, byte[] contents) {
		makeDirectories(fileName)
		val fileOutputStream = new FileOutputStream(fileName)
		fileOutputStream.write(contents)
		fileOutputStream.close
	}
	
}