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
package org.ebix.umm.validation

import org.ebix.umm.umm.Assembled
import org.ebix.umm.umm.CodelistEntry
import org.ebix.umm.umm.OclEnumerationLiteral
import org.ebix.umm.umm.OclInvariant
import org.ebix.umm.umm.Original
import org.ebix.umm.umm.Subset
import org.ebix.umm.umm.UmmPackage
import org.ebix.umm.validation.ocl.UmmOclValidator
import org.eclipse.emf.ecore.EcoreFactory
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.naming.IQualifiedNameConverter
import org.eclipse.xtext.scoping.IGlobalScopeProvider
import org.eclipse.xtext.validation.Check

import com.google.inject.Inject

/**
 * Custom validation rules. 
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
class UmmValidator extends AbstractUmmValidator {

	@Inject var IGlobalScopeProvider globalScopeProvider
	@Inject var IQualifiedNameConverter qualifiedNameConverter;
	@Inject var UmmOclValidator oclValidator;


	@Check
	def checkOclEnumerationLiteral(OclEnumerationLiteral oclLiteral) {
		//System.out.println("checkOclEnumerationLiteral: " + oclLiteral.getValue());
		//if (oclLiteral.getValue().contains("::") && !oclLiteral.getValue().startsWith("P") ) {
			val String[] part = oclLiteral.getValue().split("::");
			val assembledName = part.get(0);
			val entryName = part.get(1);
			//System.out.println("assembled name = " + assembledName + " codelist entry = " + entryName);
			val assembled = findAssembled(oclLiteral, assembledName);
			if (assembled != null) {
				var present = false;
				for (Original original : assembled.getOriginals()) {
					for (CodelistEntry entry : original.getCodes())
						if (entry.getName().equals(entryName)) {
							//System.out.println("original code name = " + entry.getName());
							present = true;
					}
				}
				for (Subset subset : assembled.getSubsets()) {
					for (CodelistEntry entry : subset.getCodes())
						if (entry.getName().equals(entryName)) {
							//System.out.println("subset code name = " + entry.getName());
							present = true;
					}
				}
				if (!present) {
					warning("Codelist entry does not exist.", UmmPackage$Literals::OCL_ENUMERATION_LITERAL__VALUE);
				}
			} else {
				warning("Assembled does not exist.", UmmPackage$Literals::OCL_ENUMERATION_LITERAL__VALUE);
			}
		//}
	}

	def Assembled findAssembled(OclEnumerationLiteral oclLiteral, String name) {
		val eRef = EcoreFactory::eINSTANCE.createEReference()
		eRef.setEType(UmmPackage::eINSTANCE.getAssembled())
		val scope = globalScopeProvider.getScope(oclLiteral.eResource(), eRef, null) /* TODO: changed in 2.0, is this code correct?*/
		val qn = qualifiedNameConverter.toQualifiedName(name)
		var result = scope.getSingleElement(qn).getEObjectOrProxy() as Assembled
		
		if (result.eIsProxy()) {
			result = EcoreUtil::resolve(result, oclLiteral) as Assembled
		}
		
		return result;
	}

	@Check
	def checkRecognizedInvariant(OclInvariant oclInvariant) {
		if (!oclValidator.recognizeInvariant(oclInvariant)) {
			warning("Invariant statement is not recognised; this statement will have no effect on the resulting artifacts.",
					UmmPackage$Literals::OCL_INVARIANT__EXPRESSION);
		}
		
	}

	@Check
	def checkMatchRemoveReference(OclInvariant oclInvariant) {
		if (oclValidator.matchRemoveReference(oclInvariant)) {
			info("Invariant statement recognised as: remove reference.",
					UmmPackage$Literals::OCL_INVARIANT__EXPRESSION);
		}
	}

	@Check
	def checkMatchMandatorySingleReference(OclInvariant oclInvariant) {
		if (oclValidator.matchMandatoryReference(oclInvariant)) {
			info("Invariant statement recognised as: mandatory reference",
					UmmPackage$Literals::OCL_INVARIANT__EXPRESSION);
		}
		
	}
	
	@Check
	def checkMatchSingleReference(OclInvariant oclInvariant) {
		if (oclValidator.matchSingleReference(oclInvariant)) {
			info("Invariant statement recognised as: single reference",
					UmmPackage$Literals::OCL_INVARIANT__EXPRESSION);
		}
		
	}
	
	@Check
	def checkMatchFixedValue(OclInvariant oclInvariant) {
		if (oclValidator.matchFixedValue(oclInvariant)) {
			info("Invariant statement recognised as: fixed value",
					UmmPackage$Literals::OCL_INVARIANT__EXPRESSION);
		}
		
	}
	
	@Check
	def checkMatchReduceCodelistEntries(OclInvariant oclInvariant) {
		if (oclValidator.matchReduceCodelistEntries(oclInvariant)) {
			info("Invariant statement recognised as: reduce codelist entries",
					UmmPackage$Literals::OCL_INVARIANT__EXPRESSION);
		}
		
	}
	
	@Check
	def checkMatchChoice(OclInvariant oclInvariant) {
		if (oclValidator.matchChoice(oclInvariant)) {
			info("Invariant statement recognised as: choice",
					UmmPackage$Literals::OCL_INVARIANT__EXPRESSION);
		}
		
	}
	
	@Check
	def checkMatchChoiceFixedValue(OclInvariant oclInvariant) {
		if (oclValidator.matchChoiceFixedValue(oclInvariant)) {
			info("Invariant statement recognised as: fixed value in a choice construct",
					UmmPackage$Literals::OCL_INVARIANT__EXPRESSION);
		}
		
	}
	
	@Check
	def checkMatchMandatory(OclInvariant oclInvariant) {
		if (oclValidator.matchMandatoryChoice(oclInvariant)) {
			info("Invariant statement recognised as: mandatory choice; one of the references is mandatory, and the others are empty",
					UmmPackage$Literals::OCL_INVARIANT__EXPRESSION);
		}
		
	}
	
		@Check
	def matchOclRestrictions(OclInvariant oclInvariant) {
		if (oclValidator.matchOclRestrictions(oclInvariant)) {
			info("Invariant statement recognized as: ocl restrictions",
					UmmPackage$Literals::OCL_INVARIANT__EXPRESSION);
		}
		
	}


}
