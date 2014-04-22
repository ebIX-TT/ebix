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







