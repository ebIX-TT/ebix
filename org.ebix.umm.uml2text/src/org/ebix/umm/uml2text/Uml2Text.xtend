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
package org.ebix.umm.uml2text

import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import static extension org.eclipse.emf.common.util.URI.*
import static extension org.eclipse.uml2.uml.resources.util.UMLResourcesUtil.*
import java.io.IOException
import org.eclipse.uml2.uml.Model
import org.eclipse.emf.common.util.URI
import org.ebix.umm.uml2text.file.FileWriterStandaloneImpl
import org.ebix.umm.uml2text.file.FileWriter
import org.eclipse.emf.ecore.resource.ResourceSet
import org.ebix.umm.uml2text.ods.Uml2Ods
import java.io.BufferedReader
import java.io.StringReader

class Uml2Text {
	
	public UmmStereotypes ummStereotypes = new UmmStereotypes
	
	def static String replaceOcls(String content){
		//TODO: Refactor this please, written in haste.
		var buffReader = new BufferedReader(new StringReader(content));
		var line = "";
		var tmpContent="";
		while( (line = buffReader.readLine()) != null){
			if (line.contains("pattern")){
				line = line.replace("\\","\\\\");
				println("replaced " + line);
			}
			if(line.contains(".content.pattern=")){
				line = line.replaceFirst("\\s+$", "");
				line += "\"";				
			} 
				
			tmpContent+= line + "\n";
		}
		return tmpContent
			.replaceAll(".content.length", "->length()")
			.replaceAll(".content.pattern=", "->pattern()=\"")
			.replaceAll(".content.maxLength", "->maxLength()")
			.replaceAll(".content.minLength", "->minLength()")
			.replaceAll(".content.maxInclusive", "->maxInclusive()")
			.replaceAll(".content.minInclusive", "->minInclusive()")
			.replaceAll(".content.fractionalDigits", "->fractionalDigits()")
			.replaceAll(".content.maxExclusive", "->maxExclusive()")
			.replaceAll(".content.minExclusive", "->minExclusive()")
			.replaceAll(".content.totalDigits", "->totalDigits()");
	}
	
	def static void main(String[] args) {
        val fileURI = "/home/adminuser/runtime-Umm.product/newUml/uml/European_Energy_Market.uml".createFileURI
		val fw = new FileWriterStandaloneImpl
    	val resourceSet = new ResourceSetImpl();
    	resourceSet.init   // standalone UML2 initialization
        new Uml2Text().processFile(fileURI, resourceSet, fw)
	}
	
	def void processFile(URI file, ResourceSet resourceSet, FileWriter fw) {
    	
		val resource = resourceSet.createResource(file);

        try {
            resource.load(null);
        } catch (IOException ioe) {
            println(ioe.getMessage());
        }
		val umlModel =  resource.getContents().get(0) as Model;
        println("Loaded '" + umlModel.qualifiedName + "' from '" + file + "'.");
		ummStereotypes.resolveAll(resourceSet)
		val docLibrary2Text = new DocLibrary2Text(ummStereotypes)
		docLibrary2Text.generate(umlModel, fw)
		val bieLibrary2Text = new BieLibrary2Text(ummStereotypes)
		bieLibrary2Text.generate(umlModel, fw)
		val bdtLibrary2Text = new BdtLibrary2Text(ummStereotypes)
		bdtLibrary2Text.generate(umlModel, fw)
		val enumLibrary2Text = new EnumLibrary2Text(ummStereotypes)
		enumLibrary2Text.generate(umlModel, fw)
		// CC library and CDT library are not needed for message generation
		//val ccLibrary2Text = new CcLibrary2Text(ummStereotypes)
		//ccLibrary2Text.generate(umlModel, fw)
		//val cdtLibrary2Text = new CdtLibrary2Text(ummStereotypes)
		//cdtLibrary2Text.generate(umlModel, fw)
		val primLibrary2Text = new PrimLibrary2Text(ummStereotypes)
		primLibrary2Text.generate(resourceSet, fw)
		
		val uml2ods = new Uml2Ods(ummStereotypes, umlModel, fw)
        uml2ods.generate(file)
	}
	
}