package org.ebix.umm.uml2text.ods

import org.ebix.umm.uml2text.file.FileWriter
import java.util.zip.ZipOutputStream
import org.ebix.umm.uml2text.UmmStereotypes
import org.eclipse.uml2.uml.Model
import java.io.ByteArrayOutputStream
import org.eclipse.emf.common.util.URI
import org.ebix.umm.uml2text.Name2Text

class Uml2Ods {

	extension Name2Text name2Text = new Name2Text
	
	private UmmStereotypes ummStereotypes
	private FileWriter fw
	private Model umlModel
	
	
	new (UmmStereotypes ummStereotypes, Model umlModel, FileWriter fw) {
		this.ummStereotypes = ummStereotypes
		this.umlModel = umlModel
		this.fw = fw
	}  
	
	def generate(URI file) {
		println("Generating spreadsheet " + file.fileName + " ...")
		val parts = #[ new Manifest, new Mimetype, new Meta, new Styles, new Content(ummStereotypes, umlModel) ]
		val bout = new ByteArrayOutputStream
		val zout = new ZipOutputStream(bout);
		parts.forEach[ add(zout) ]
		zout.close
		fw.writeFile(file.fileName, bout.toByteArray)
		println("Done.")
	}
	
	
}