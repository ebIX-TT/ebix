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

class Uml2Text {
	
	public UmmStereotypes ummStereotypes = new UmmStereotypes
	
	def static void main(String[] args) {
        val fileURI = "/home/peter/Development/ws-uml/uml-2012A2/model/European_Energy_Market.uml".createFileURI
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