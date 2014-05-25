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