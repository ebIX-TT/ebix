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
import org.ebix.umm.umm.impl.OclEqualImpl
import org.ebix.umm.umm.impl.OclArrowImpl
import org.ebix.umm.umm.impl.OclSizeImpl
import org.ebix.umm.umm.impl.OclIntegerLiteralImpl
import org.ebix.umm.umm.impl.OclPathSelfHeadImpl
import org.ebix.umm.templates.xsd.MultiplicityKindExtension
import java.util.HashMap
import org.ebix.umm.umm.impl.OclLengthImpl

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
    @Inject extension MultiplicityKindExtension multiplicityKindExtension
    
    def generateXsd(Resource resource, IFileSystemAccess fsa) {
    	val constants = projectConstants(fsa)
    	
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
		ma.getSizeOclFromConstrains();
		ma.getOclLengthFromConstrains();
        clonedMa.library.bieLibrary.applyInvariants
        clonedMa.applyInvariantsFor(kind, "")
        if (listIdentifier.length > 0) {
	        clonedMa.applyInvariantsFor(kind, listIdentifier)
        }
        clonedMa.purge
        fsa.generateFile(clonedMa.fileName(location), clonedMa.compile(constants, clonedMa))
        fsa.generateFile(clonedMa.library.bieLibrary.fileName(location, clonedMa), clonedMa.library.bieLibrary.compile(constants, clonedMa))
        fsa.generateFile(clonedMa.library.bdtLibrary.fileName(location, clonedMa), clonedMa.library.bdtLibrary.compile(constants, clonedMa))
    }
    
    def void getSizeOclFromConstrains(MA ma){
    	val fieldSizeMap = newHashMap();
        for(contraint : ma.constraints){
        	for(invariant : contraint.invariants){
        		if(invariant.expression instanceof OclEqualImpl){
        		  val invEqual = invariant.expression as OclEqualImpl
       			  if(invEqual.left instanceof OclArrowImpl){
       			  	val invArrow = invEqual.left as OclArrowImpl;
       			  	if(invArrow.right instanceof OclSizeImpl){//<-- OclLength, OclMinExclusive...
       			  		val fieldName = (invArrow.left as OclPathSelfHeadImpl).path.feature.name;//nazwa pola do ograniczenia
       			  		val sizeValue = (invEqual.right as OclIntegerLiteralImpl).value;///wartość - w przypadku pattern musi byc OclStringLiteralImpl
       			  		fieldSizeMap.put(fieldName, sizeValue);
       			  	} 
       			  }
        		}
        	}
        }
        MultiplicityKindExtension.fieldSizeMap = fieldSizeMap;
    }
    
        def void getOclLengthFromConstrains(MA ma){
    	val fieldLengthMap = newHashMap();
        for(contraint : ma.constraints){
        	for(invariant : contraint.invariants){
        		if(invariant.expression instanceof OclEqualImpl){
        		  val invEqual = invariant.expression as OclEqualImpl
       			  if(invEqual.left instanceof OclArrowImpl){
       			  	val invArrow = invEqual.left as OclArrowImpl;
       			  	if(invArrow.right instanceof OclLengthImpl){//<-- OclLength, OclMinExclusive...
       			  		val fieldName = (invArrow.left as OclPathSelfHeadImpl).path.tail.tail.feature.name;//nazwa pola do ograniczenia
       			  		val sizeValue = (invEqual.right as OclIntegerLiteralImpl).value;///wartość - w przypadku pattern musi byc OclStringLiteralImpl
       			  		fieldLengthMap.put(fieldName, sizeValue);
       			  	} 
       			  }
        		}
        	}
        }
        BieLibrarySchema.fieldLengthMap = fieldLengthMap;
        BdtLibrarySchema.fieldLengthMap = fieldLengthMap;
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