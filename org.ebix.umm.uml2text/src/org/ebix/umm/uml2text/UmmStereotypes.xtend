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

import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.uml2.uml.Stereotype

class UmmStereotypes {
	// DOC library 
	public final UmmStereotype DocLibrary =       new UmmStereotype("DocLibrary",       "ebIX stereotypes::e-DocLibrary")
	public final UmmStereotype InfEnvelope =      new UmmStereotype("InfEnvelope",      "UMM 2.0 Base Module::InfEnvelope")
	public final UmmStereotype MA =               new UmmStereotype("MA",               "Business Document Library::MA")
	public final UmmStereotype ASMA =             new UmmStereotype("ASMA",             "Business Document Library::ASMA")

	// Constraint  
	public final UmmStereotype TC_Document =      new UmmStereotype("document",         "TransformationXML::document")
	public final UmmStereotype TC_Payload =       new UmmStereotype("payload",          "TransformationXML::payload")
	public final UmmStereotype TC_ABIE =          new UmmStereotype("abie",             "TransformationXML::abie")
	public final UmmStereotype TC_BDT =           new UmmStereotype("bdt",              "TransformationXML::bdt")
	public final UmmStereotype TC_Dependency =    new UmmStereotype("dependency",       "TransformationXML::dependency")
	public final UmmStereotype TC_Facet =         new UmmStereotype("facet",            "TransformationXML::facet")

	// BIE library contains ABIE's
	public final UmmStereotype BIELibrary =       new UmmStereotype("BIELibrary",       "ebIX stereotypes::e-BIELibrary")
	public final UmmStereotype ABIE =             new UmmStereotype("ABIE",             "Business Information Entity Library::ABIE")
	public final UmmStereotype BBIE =             new UmmStereotype("BBIE",             "Business Information Entity Library::BBIE")
	public final UmmStereotype ASBIE =            new UmmStereotype("ASBIE",            "Business Information Entity Library::ASBIE")

	// Business Data Type library contains business data types (BDT).
	public final UmmStereotype BDTLibrary =       new UmmStereotype("BDTLibrary",       "UPCC Module Management::BDTLibrary")
	public final UmmStereotype BDT =              new UmmStereotype("BDT",              "Business Data Type Library::BDT")
	public final UmmStereotype BDT_CON =          new UmmStereotype("BDT_CON",          "Business Data Type Library::CON")
	public final UmmStereotype BDT_SUP =          new UmmStereotype("BDT_SUP",          "Business Data Type Library::SUP")

	// Core Component library contains core components (ACC).
	public final UmmStereotype CCLibrary =        new UmmStereotype("CCLibrary",        "ebIX stereotypes::e-CCLibrary" /*"UPCC Module Management::CCLibrary"*/)
	public final UmmStereotype ACC =              new UmmStereotype("ACC",              "Core Component Library::ACC")
	public final UmmStereotype BCC =              new UmmStereotype("BCC",              "Core Component Library::BCC")
	public final UmmStereotype ASCC =             new UmmStereotype("ASCC",             "Core Component Library::ASCC")

	// Core Data Type library contains core data types (CDT).
	public final UmmStereotype CDTLibrary =       new UmmStereotype("CDTLibrary",       "UPCC Module Management::CDTLibrary")
	public final UmmStereotype CDT =              new UmmStereotype("CDT",              "Core Data Type Library::CDT")
	public final UmmStereotype CDT_CON =          new UmmStereotype("CDT_CON",          "Core Data Type Library::CON")
	public final UmmStereotype CDT_SUP =          new UmmStereotype("CDT_SUP",          "Core Data Type Library::SUP")

	// Enum library, contains Original, Subset, and Assembled	
	public final UmmStereotype ENUMLibrary =      new UmmStereotype("ENUMLibrary",      "UPCC Module Management::ENUMLibrary")
	public final UmmStereotype ENUM =             new UmmStereotype("ENUM",             "Enumeration Type Library::ENUM")
	public final UmmStereotype Original =         new UmmStereotype("Original",         "ebIX stereotypes::Original")
	public final UmmStereotype Subset =           new UmmStereotype("Subset",           "ebIX stereotypes::Subset")
	public final UmmStereotype Assembled =        new UmmStereotype("Assembled",        "ebIX stereotypes::Assembled")
	public final UmmStereotype CodelistEntry =    new UmmStereotype("CodelistEntry",    "Enumeration Type Library::CodelistEntry")

	// PRIM library 
	public final UmmStereotype PRIMLibrary =       new UmmStereotype("PRIMLibrary",     "UPCC Module Management::PRIMLibrary")
	public final UmmStereotype PRIM =              new UmmStereotype("PRIM",            "Primitive Data Type Library::PRIM")
	
	public val allStereotypes = #[ DocLibrary, InfEnvelope, MA, ASMA, 
							TC_Document, TC_Payload, TC_ABIE, TC_BDT, TC_Dependency, TC_Facet,
							BIELibrary, ABIE, BBIE, ASBIE,
							BDTLibrary, BDT, BDT_CON, BDT_SUP,
							CCLibrary, ACC, BCC, ASCC,
							CDTLibrary, CDT, CDT_CON, CDT_SUP,
							ENUMLibrary, ENUM, Original, Subset, Assembled,	CodelistEntry,
							PRIMLibrary /*, PRIM cannot be located in UML files, although present */]
	
	def resolveAll(ResourceSet resourceSet) {
		for (ummStereotype : allStereotypes)
			resolve(resourceSet, ummStereotype)
	}
							
	def resolve(ResourceSet resourceSet, UmmStereotype ummStereotype) {
    	for (Resource resource : resourceSet.getResources()) {
	    	val iterator = resource.getAllContents()
	    	while (iterator.hasNext()) {
	    		val obj = iterator.next();
	    		if (obj instanceof Stereotype) {
	    			val stereotype = obj as Stereotype;
					if (ummStereotype.qualifiedName.equals(stereotype.getQualifiedName())) {
						ummStereotype.value = stereotype;
					}
				}
	    	}
    	}
    	if (ummStereotype.value == null)
    		println("No stereotype found for " + ummStereotype.shortName + ". Searched for " + ummStereotype.qualifiedName + ".")
    	else 
    		println("Stereotype found for " + ummStereotype.shortName + ". Got: " + ummStereotype.value) 
	}							
	
}