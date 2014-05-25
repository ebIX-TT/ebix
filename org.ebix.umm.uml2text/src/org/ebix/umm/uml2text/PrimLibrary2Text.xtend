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

import org.eclipse.uml2.uml.Package
import org.eclipse.uml2.uml.Stereotype
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.uml2.uml.DataType
import org.ebix.umm.uml2text.file.FileWriter

class PrimLibrary2Text {
	
	extension Name2Text name2Text = new Name2Text
	
	private UmmStereotypes ummStereotypes
	private Stereotype PRIMLibrary
	
	new (UmmStereotypes ummStereotypes) {
		this.ummStereotypes = ummStereotypes
		this.PRIMLibrary = ummStereotypes.PRIMLibrary.value
	}  
	
	def generate(ResourceSet resourceSet, FileWriter fw) {
		println("Generating PRIMLibraries ...")
    	for (Resource resource : resourceSet.getResources()) {
	    	val iterator = resource.getAllContents()
	    	while (iterator.hasNext()) {
	    		val object = iterator.next
	    		if (object instanceof org.eclipse.uml2.uml.Package) {
	    			val umlPackage = object as org.eclipse.uml2.uml.Package
	    			if (umlPackage.isStereotypeApplied(ummStereotypes.PRIMLibrary.value)) {
						println("PRIMLibrary " + umlPackage.name)
						fw.writeFile(umlPackage.qualifiedName.fileName, umlPackage.generate)
	    			}
	    		}
	    		
    		}
    	}
		
		println("Done.")
	}
	
	def generate(Package umlPackage) '''
		PRIMLibrary "«umlPackage.qualifiedName»"
		{
			«FOR umlDataType : umlPackage.ownedMembers.filter(typeof(DataType))»
			primitive «umlDataType.name»
			«ENDFOR»
		}
	''' 
	
}







