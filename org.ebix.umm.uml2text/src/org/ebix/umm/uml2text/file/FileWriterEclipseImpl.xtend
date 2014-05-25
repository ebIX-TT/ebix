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

import org.eclipse.core.resources.IProject
import java.io.StringBufferInputStream
import org.eclipse.core.resources.IFile
import static org.eclipse.core.resources.IResource.*
import java.io.ByteArrayInputStream

class FileWriterEclipseImpl implements FileWriter {
	
	IProject project
	
	new(IProject project) {
		this.project = project
	}
	
	
	override writeFile(String fileName, CharSequence contents) {
		val file = project.getFile(fileName)
		makeDirectories(project, file)
		file.create(new StringBufferInputStream(contents.toString), DERIVED, null)
	}
	
	def void makeDirectories(IProject project, IFile file) {
		val segments = file.fullPath.segments
		var name = ""
		for (segment : segments.subList(1, segments.size - 1)) {
			name = name + "/" + segment
			val folder = project.getFolder(name)
			println("checking: " + folder.toString)
			if (!folder.exists) {
				println("creating: " + folder.toString)
				folder.create(DERIVED, true, null)
			}
		}
	}
	
	override writeFile(String fileName, byte[] contents) {
		val file = project.getFile(fileName)
		makeDirectories(project, file)
		val inputStream = new ByteArrayInputStream(contents)
		file.create(inputStream, DERIVED, null)
	}
	
}