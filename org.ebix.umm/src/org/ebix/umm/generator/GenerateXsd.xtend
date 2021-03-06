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
import org.ebix.umm.umm.impl.OclStringLiteralImpl
import org.ebix.umm.validation.ocl.FieldOcls
import org.ebix.umm.umm.impl.OclMinExclusiveImpl
import org.ebix.umm.umm.OclMaxExclusive
import org.ebix.umm.umm.impl.OclMinInclusiveImpl
import org.ebix.umm.umm.impl.OclMaxExclusiveImpl
import org.ebix.umm.umm.impl.OclMaxLengthImpl
import org.ebix.umm.umm.impl.OclMinLengthImpl
import org.ebix.umm.umm.impl.OclTotalDigitsImpl
import org.ebix.umm.umm.impl.OclFractionalDigitsImpl
import org.ebix.umm.umm.impl.OclPatternImpl
import org.ebix.umm.umm.impl.OclMaxInclusiveImpl
import org.ebix.umm.umm.OclPathTail
import org.ebix.umm.umm.MAProperty
import org.ebix.umm.umm.ABIEProperty
import org.ebix.umm.umm.BDTProperty
import org.ebix.umm.umm.ASBIE
import org.ebix.umm.umm.BBIE
import org.ebix.umm.umm.Content
import org.ebix.umm.umm.OclRef

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
    	//Paweł: Rozróżnienie jaki xsd jest generowany
        generateGenericXsd(resource, fsa, constants)
        
        //Paweł: Tutaj generują się dwa rodzaje xsd: document i payload   
        generateConstrainedXsd(resource, fsa, constants)   
    }
    
    def generateGenericXsd(Resource resource, IFileSystemAccess fsa, Constants constants) {
        var String location = "generic"
        for(enumLibrary: resource.allContents.toIterable.filter(typeof(ENUMLibrary))) {
            for(e: enumLibrary.enums) {
            	if(e.compile(constants).toString().contains("TestFacet")){
            		System.out.println("generic-enum")
            	}
                fsa.generateFile(e.fileName(location), e.compile(constants))
            }
        }
    	constants.setSchemaLocation("../../generic/")
        for(bdtLibrary: resource.allContents.toIterable.filter(typeof(BDTLibrary))) {
        	if(bdtLibrary.compile(constants,null).toString().contains("TestFacet")){
        		System.out.println("generic-bdt");
        	}
        	System.out.println("generating BDT");
        	var String bdtStr = bdtLibrary.compile(constants, null).toString();
        	bdtStr = bdtStr.replace("xmlns:ns1","xmlns:bcl");
        	bdtStr = bdtStr.replace("\"ns1:","\"bcl:");
            fsa.generateFile(bdtLibrary.fileName(location), bdtStr)
        }
        for(bieLibrary: resource.allContents.toIterable.filter(typeof(BIELibrary))) {
            var copyOfBieLibrary = copy(bieLibrary) as BIELibrary;
            copyOfBieLibrary.applyInvariants
            if(copyOfBieLibrary.compile(constants,null).toString().contains("TestFacet")){
            	val tmp = copyOfBieLibrary.compile(constants,null);
            	System.out.println("generic-bie");
            }
            System.out.println("generating BIE");
            var String bieStr = copyOfBieLibrary.compile(constants, null).toString();
            bieStr = bieStr.replace("xmlns:ns1","xmlns:bdt");
        	bieStr = bieStr.replace("\"ns1:","\"bdt:");
        	bieStr = bieStr.replaceFirst(".*xmlns:mdt.*",'');
            fsa.generateFile(copyOfBieLibrary.fileName(location), bieStr)
        }
        for(docLibrary: resource.allContents.toIterable.filter(typeof(DocLibrary))) {
            for (envelope: docLibrary.envelopes) {
                for (ma: envelope.assemblies) {
                		if(ma.compile(constants,null).toString().contains("TestFacet")){
                		System.out.println("generic-ma");
                	}
                	var String maStr = ma.compile(constants, null).toString();
                	maStr = maStr.replaceFirst("(type=\")(rsm)(:.*\"/>)","$1xxxx$3");
                	maStr = maStr.replaceAll("(type=\")(rsm)(:.*\"/>)","$1bie$3");
                	maStr = maStr.replaceFirst("(type=\")(xxxx)(:.*\"/>)","$1rsm$3");
                    fsa.generateFile(ma.fileName(location), maStr)
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
        BieLibrarySchema.fieldOcls.clear;
		ma.getSizeOclFromConstrains();
		ma.getAllOcls();
        clonedMa.library.bieLibrary.applyInvariants
        clonedMa.applyInvariantsFor(kind, "")
        if (listIdentifier.length > 0) {
	        clonedMa.applyInvariantsFor(kind, listIdentifier)
        }
        clonedMa.purge
        val maCompile = clonedMa.compile(constants, clonedMa);
        val bieCompile = clonedMa.library.bieLibrary.compile(constants, clonedMa);
        val bdtCompile = clonedMa.library.bdtLibrary.compile(constants, clonedMa);
        var String maStr = maCompile.toString();
        maStr = maStr.replace("xmlns:bdt","xmlns:mdt");
        maStr = maStr.replace("\"bdt:","\"mdt:");
        maStr = maStr.replace("xmlns:bie","xmlns:mie");
        maStr = maStr.replace("\"bie:","\"mie:");
        maStr = maStr.replace("xmlns:rsm","xmlns:crs");
        maStr = maStr.replace("\"rsm:","\"crs:");
        maStr = maStr.replaceFirst("(type=\")(crs)(:.*\"/>)","$1xxxx$3");
        maStr = maStr.replaceAll("(type=\")(crs)(:.*\"/>)","$1mie$3");
        maStr = maStr.replaceFirst("(type=\")(xxxx)(:.*\"/>)","$1crs$3");
        fsa.generateFile(clonedMa.fileName(location), maStr)
        var String bieStr = bieCompile.toString();
        bieStr = bieStr.replace("xmlns:bie","xmlns:mie");
        bieStr = bieStr.replace("\"bie:","\"mie:");
        bieStr = bieStr.replace("xmlns:ns1","xmlns:bie");
        bieStr = bieStr.replace("\"ns1:","\"bie:");
        bieStr = bieStr.replaceAll("(type=\")(mie)(:.*Type_.*\\d{6}\")","$1mdt$3");
        bieStr = bieStr.replaceAll("(base=\")(mie)(:.*Type_.*\\d{6}\")","$1mdt$3");
        fsa.generateFile(clonedMa.library.bieLibrary.fileName(location, clonedMa), bieStr)
        var String bdtStr = bdtCompile.toString();
        bdtStr = bdtStr.replace("xmlns:ns1","xmlns:bcl");
        bdtStr = bdtStr.replace("\"ns1:","\"bcl:");
        bdtStr = bdtStr.replace("xmlns:bdt","xmlns:mdt");
        bdtStr = bdtStr.replace("\"bdt:","\"mdt:");
        fsa.generateFile(clonedMa.library.bdtLibrary.fileName(location, clonedMa), bdtStr)
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
    
    	def void getAllOcls(MA ma){
    		getOclFromConstrains(ma, OclMinExclusiveImpl);
    		getOclFromConstrains(ma, OclMaxExclusiveImpl);
    		getOclFromConstrains(ma, OclMinInclusiveImpl);
    		getOclFromConstrains(ma, OclMaxInclusiveImpl);
    		getOclFromConstrains(ma, OclMaxLengthImpl);
    		getOclFromConstrains(ma, OclMinLengthImpl);
    		getOclFromConstrains(ma, OclTotalDigitsImpl);
    		getOclFromConstrains(ma, OclFractionalDigitsImpl);
    		getOclFromConstrains(ma, OclPatternImpl);
    		getOclFromConstrains(ma, OclLengthImpl);
    	}
    
        def void getOclFromConstrains(MA ma, Class oclImplClass){
        for(contraint : ma.constraints){
        	for(invariant : contraint.invariants){
        		if(invariant.expression instanceof OclEqualImpl){
        		  val invEqual = invariant.expression as OclEqualImpl
       			  if(invEqual.left instanceof OclArrowImpl){
       			  	val invArrow = invEqual.left as OclArrowImpl;
       			  	if(invArrow.right.class.isAssignableFrom(oclImplClass)){
       			  		//val fieldName = (invArrow.left as OclPathSelfHeadImpl).path.tail.tail.feature.name;//nazwa pola do ograniczenia
       			  		val fieldName = getNameForMap((invArrow.left as OclPathSelfHeadImpl).path);
       			  		//val fieldName = (invArrow.left as OclPathSelfHeadImpl).path.tail.feature.name+'.'+
       			  		//(invArrow.left as OclPathSelfHeadImpl).path.tail.tail.feature.name;
       			  		var oclValue = -1
       			  		var oclStrValue = ""
       			  		if(invEqual.right instanceof OclIntegerLiteralImpl){
       			  			oclValue = (invEqual.right as OclIntegerLiteralImpl).value
       			  		}
       			  		else if(invEqual.right instanceof OclStringLiteralImpl){
       			  			oclStrValue = (invEqual.right as OclStringLiteralImpl).value
       			  		}
       			  		val oclName = oclImplClass.simpleName.toLowerCase;
       			  		if(BieLibrarySchema.fieldOcls.containsKey(fieldName)){
							if(oclName.contains("minexclusive") && oclValue != -1) BieLibrarySchema.fieldOcls.get(fieldName).minExclusive = oclValue;
							if(oclName.contains("maxexclusive") && oclValue != -1) BieLibrarySchema.fieldOcls.get(fieldName).maxExclusive = oclValue;
							if(oclName.contains("mininclusive") && oclValue != -1) BieLibrarySchema.fieldOcls.get(fieldName).minInclusive = oclValue;
							if(oclName.contains("maxinclusive") && oclValue != -1) BieLibrarySchema.fieldOcls.get(fieldName).maxInclusive = oclValue;
							if(oclName.contains("maxlength") && oclValue != -1) BieLibrarySchema.fieldOcls.get(fieldName).maxLength = oclValue;
							if(oclName.contains("minlength") && oclValue != -1) BieLibrarySchema.fieldOcls.get(fieldName).minLength = oclValue;
							if(oclName.contains("totaldigits") && oclValue != -1) BieLibrarySchema.fieldOcls.get(fieldName).totalDigits = oclValue;
							if(oclName.contains("fractionaldigits") && oclValue != -1) BieLibrarySchema.fieldOcls.get(fieldName).fractionalDigits = oclValue;
							if(oclName.contains("pattern") && oclStrValue.length > 0) BieLibrarySchema.fieldOcls.get(fieldName).pattern = oclStrValue;
							if(oclName.contains("ocllength") && oclValue != -1) BieLibrarySchema.fieldOcls.get(fieldName).length  = oclValue;
       			  		} else{
       			  			var ocls = new FieldOcls()
       			  			if(oclName.contains("minexclusive") && oclValue != -1) ocls.minExclusive = oclValue;
							if(oclName.contains("maxexclusive") && oclValue != -1) ocls.maxExclusive = oclValue;
							if(oclName.contains("mininclusive") && oclValue != -1) ocls.minInclusive = oclValue;
							if(oclName.contains("maxinclusive") && oclValue != -1) ocls.maxInclusive = oclValue;
							if(oclName.contains("maxlength") && oclValue != -1) ocls.maxLength = oclValue;
							if(oclName.contains("minlength") && oclValue != -1) ocls.minLength = oclValue;
							if(oclName.contains("totaldigits") && oclValue != -1) ocls.totalDigits = oclValue;
							if(oclName.contains("fractionaldigits") && oclValue != -1) ocls.fractionalDigits = oclValue;
							if(oclName.contains("pattern") && oclStrValue.length > 0) ocls.pattern = oclStrValue;
							if(oclName.contains("ocllength") && oclValue != -1) ocls.length  = oclValue;
       			  			BieLibrarySchema.fieldOcls.put(fieldName,ocls);     			  		
       			  		}
       			  	} 
       			  }
        		}
        	}
        }
    }
    def private String getNameForMap(OclPathTail path){
    	if ("Sender".equals(path.feature.name)){
    		print("");
    	}
    	if (path.tail == null){
    		println("feature + name: "+ path.feature.name);
    		println("-------------------");
    		return path.feature.name;
    	}else if ("content".equals(path.tail.feature.name)){
    		println("feature + name: "+ path.feature.name);
    		println("-------------------");
    		return path.feature.name;
    	}else{
    		return getNameForMap(path.tail, path.feature);
    	}
    }
    
    def private String getNameForMap(OclPathTail path, OclRef parent){
    	if (path.tail == null){
    		var na = getNameForOclRef(parent)+"."+getNameForOclRef(path.feature);
    		println("-------------------");
    		return na;
    	}else if ("content".equals(path.tail.feature.name)){
    		var na = getNameForOclRef(parent)+"."+getNameForOclRef(path.feature);
    		println("-------------------");
    		return na;
    	}else{    		
    		return getNameForMap(path.tail, path.feature);
    	}
    }
    
        def private String getNameForOclRef( OclRef ref){
        	var nam =ref.name
    		if (ref instanceof MAProperty){
    			var f1 = ref as MAProperty
    			nam = f1.type.name;
    		}else if (ref instanceof ASBIE){
    			var f1 = ref as ASBIE
    			nam = f1.type.name;
    		}else if (ref instanceof BBIE){
    			var f1 = ref as BBIE
    			nam = f1.name;
    		}else if (ref instanceof BDTProperty){
    			var f1 = ref as BDTProperty //Content || Supplement
    			nam = f1.name;
    		}
    		println("feature. name: "+ nam+"\t");	
    		return nam;
    }
    
    
    def private Constants projectConstants(IFileSystemAccess fsa) {
    	//2016-06-05 disabled
		//println("Getting settings")
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