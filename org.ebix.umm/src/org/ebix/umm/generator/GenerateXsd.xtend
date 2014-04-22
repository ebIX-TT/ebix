package org.ebix.umm.generator


import com.google.inject.Inject

import org.ebix.umm.umm.BDTLibrary
import org.ebix.umm.umm.BIELibrary
import org.ebix.umm.umm.ConstraintKind
import org.ebix.umm.umm.DocLibrary
import org.ebix.umm.umm.ENUMLibrary
import org.ebix.umm.umm.MA
import org.ebix.umm.templates.xsd.BdtLibraryExtension
import org.ebix.umm.templates.xsd.BdtLibrarySchema
import org.ebix.umm.templates.xsd.BieLibraryExtension
import org.ebix.umm.templates.xsd.BieLibrarySchema
import org.ebix.umm.templates.xsd.EnumExtension
import org.ebix.umm.templates.xsd.EnumSchema
import org.ebix.umm.templates.xsd.MaExtension
import org.ebix.umm.templates.xsd.MaSchema
import org.ebix.umm.invariants.Invariants
import org.ebix.umm.invariants.Prune

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import static extension org.eclipse.xtext.xbase.lib.IteratorExtensions.*
import org.ebix.umm.templates.Constants

import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess2
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.ProjectScope
import java.util.ArrayList

class GenerateXsd {
    
    @Inject extension BdtLibraryExtension  bdtLibraryExtension
    @Inject extension BdtLibrarySchema     bdtLibrarySchema
    @Inject extension BieLibraryExtension  bieLibraryExtension
    @Inject extension BieLibrarySchema     bieLibrarySchema
    @Inject extension EnumSchema           enumSchema
    @Inject extension EnumExtension        enumExtension
    @Inject extension MaExtension          maExtension
    @Inject extension MaSchema             maSchema
    @Inject extension Invariants           invariants
    @Inject extension Prune                prune
    
    def generateXsd(Resource resource, IFileSystemAccess fsa) {
    	val constants = projectConstants(fsa)
    	
//    	if (listIdentifiers(resource).size > 0) {
//	    	println("List of declared list identifiers:")
//	    	for (id : listIdentifiers(resource)) {
//	    		println("List identifier: " + id)
//	    	}
//    	}
    	
        generateGenericXsd(resource, fsa, constants)   
        generateConstrainedXsd(resource, fsa, constants)   
    }
    
    def generateGenericXsd(Resource resource, IFileSystemAccess fsa, Constants constants) {
        var String location = "generic"
        for(enumLibrary: resource.allContents.toIterable.filter(typeof(ENUMLibrary))) {
            for(e: enumLibrary.enums) {
                fsa.generateFile(e.fileName(location), e.compile(constants))
            }
        }
    	constants.setSchemaLocation("../../generic/")
        for(bdtLibrary: resource.allContents.toIterable.filter(typeof(BDTLibrary))) {
            fsa.generateFile(bdtLibrary.fileName(location), bdtLibrary.compile(constants, null))
        }
        for(bieLibrary: resource.allContents.toIterable.filter(typeof(BIELibrary))) {
            var copyOfBieLibrary = copy(bieLibrary) as BIELibrary;
            copyOfBieLibrary.applyInvariants
            fsa.generateFile(copyOfBieLibrary.fileName(location), copyOfBieLibrary.compile(constants, null))
        }
        for(docLibrary: resource.allContents.toIterable.filter(typeof(DocLibrary))) {
            for (envelope: docLibrary.envelopes) {
                for (ma: envelope.assemblies) {
                    fsa.generateFile(ma.fileName(location), ma.compile(constants, null))
                }
            }
        }
    }
    
    def generateConstrainedXsd(Resource resource, IFileSystemAccess fsa, Constants constants) {
        for(ma: resource.allContents.toIterable.filter(typeof(MA))) {
        	if (ma.listIdentifiers.size == 0) {
        		// ebix schema's
	            constants.setSchemaLocation("../../generic/")
	            generateConstrainedXsd(ma, ConstraintKind::DOCUMENT, "", fsa, constants)
	            generateConstrainedXsd(ma, ConstraintKind::PAYLOAD, "", fsa, constants)
            }
            for (listIdentifier : ma.listIdentifiers) {
	    		//println("List identifier: " + listIdentifier + " for ma: " + ma.name)
                constants.setSchemaLocation("../../../generic/")
                generateConstrainedXsd(ma, ConstraintKind::DOCUMENT, listIdentifier, fsa, constants)
                generateConstrainedXsd(ma, ConstraintKind::PAYLOAD, listIdentifier, fsa, constants)
            }
        }
    }

    def generateConstrainedXsd(MA ma, ConstraintKind kind, String listIdentifier, IFileSystemAccess fsa, Constants constants) {
        var location = kind.toString + "/" + ma.name
        if (listIdentifier.length > 0) {
	        location = listIdentifier + "/" + location
        }
        var clonedMa = ma.clone
        clonedMa.library.bieLibrary.applyInvariants
        clonedMa.applyInvariantsFor(kind, "")
        if (listIdentifier.length > 0) {
	        clonedMa.applyInvariantsFor(kind, listIdentifier)
        }
        clonedMa.purge
        fsa.generateFile(clonedMa.fileName(location), clonedMa.compile(constants, clonedMa))
        fsa.generateFile(clonedMa.library.bieLibrary.fileName(location), clonedMa.library.bieLibrary.compile(constants, clonedMa))
        fsa.generateFile(clonedMa.library.bdtLibrary.fileName(location), clonedMa.library.bdtLibrary.compile(constants, clonedMa))
    }
    
    def private Constants projectConstants(IFileSystemAccess fsa) {
		println("Getting settings")
		val constants = new Constants()
    	if (fsa instanceof EclipseResourceFileSystemAccess2 ) {
    		// Ugly, but Xtext builder hides a bit much
    		val er = fsa as EclipseResourceFileSystemAccess2
			val field = er.class.getDeclaredField("project")
			field.setAccessible(true)
			val project = field.get(er) as IProject    
			if (project != null) {
				val projectScope = new ProjectScope(project);
				val projectNode = projectScope.getNode("org.ebix.umm");
				if (projectNode != null) {
					for (constant : constants.allConstants) {
						val value = projectNode.get(constant.name, constant.value);
						constant.value = value 
					}
				}
				
			}
    	}
    	
    	return constants
    	
    }	

//    def private listIdentifiers(Resource resource) {
//    	val listIdentifiers = new ArrayList<String>()
//        for(ma: resource.allContents.toIterable.filter(typeof(MA))) {
//			for (c: ma.constraints) {
//				for(tc: c.type) {
//					if (tc.listIdentifier.length > 0 &&  !listIdentifiers.contains(tc.listIdentifier)) {
//						listIdentifiers.add(tc.listIdentifier)
//					}
//				}
//			}
//        }
//        
//        return listIdentifiers
//    }

    def private listIdentifiers(MA ma) {
    	val listIdentifiers = new ArrayList<String>()
		for (c: ma.constraints) {
			for(tc: c.type) {
				if (tc.listIdentifier.length > 0 &&  !listIdentifiers.contains(tc.listIdentifier)) {
					listIdentifiers.add(tc.listIdentifier)
				}
			}
		}
        
        return listIdentifiers
    }
    
}