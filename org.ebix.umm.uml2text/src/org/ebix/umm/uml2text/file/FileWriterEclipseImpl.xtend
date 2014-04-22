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