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