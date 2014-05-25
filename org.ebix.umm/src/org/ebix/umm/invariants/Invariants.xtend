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
package org.ebix.umm.invariants


import com.google.inject.Inject

import java.util.List
import java.util.ArrayList

import org.ebix.umm.umm.OclBooleanFalse
import org.ebix.umm.umm.OclBooleanTrue
import org.ebix.umm.umm.OclEnumerationLiteral
import org.ebix.umm.umm.OclExpression
import org.ebix.umm.umm.OclImplies
import org.ebix.umm.umm.OclIntegerLiteral
import org.ebix.umm.umm.OclInvariant
import org.ebix.umm.umm.OclLiteral
import org.ebix.umm.umm.OclPathFeatureHead
import org.ebix.umm.umm.OclPathSelfHead
import org.ebix.umm.umm.OclPathTail
import org.ebix.umm.umm.OclRef
import org.ebix.umm.umm.OclReference
import org.ebix.umm.umm.OclStringLiteral

import org.ebix.umm.umm.ABIE
import org.ebix.umm.umm.ABIEProperty
import org.ebix.umm.umm.BBIE
import org.ebix.umm.umm.BIELibrary
import org.ebix.umm.umm.ConstraintKind
import org.ebix.umm.umm.Content
import org.ebix.umm.umm.MA
import org.ebix.umm.umm.MultiplicityKind
import org.ebix.umm.umm.Supplement

import org.ebix.umm.validation.ocl.UmmOclValidator

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import static extension org.eclipse.xtext.xbase.lib.IteratorExtensions.*

class Invariants {
	
	@Inject UmmOclValidator oclValidator
	
	def void applyInvariants(BIELibrary library) {
	    for (abie: library.abies)
	       abie.applyInvariants   
	}
	
	def void applyInvariants(ABIE abie) {
		for (constraint: abie.constraints.filter[c | c.type.exists[t | t.kind == ConstraintKind::DEPENDENCY]])
			for (invariant: constraint.invariants)
				invariant.apply;
	}
	
	def void applyInvariantsFor(MA ma, ConstraintKind kind, String listIdentifier) {
		for (c: ma.constraints.filter(c| c.type.exists[t | t.kind == kind && t.listIdentifier == listIdentifier])) {
			for(i: c.invariants) {
				if (oclValidator.matchRemoveReference(i)) {
					i.getRef.delete
				}
			}
		}
		for (c: ma.constraints.filter(c| c.type.exists[t | t.kind == kind && t.listIdentifier == listIdentifier])) {
			for(i: c.invariants) {
				i.apply		
			}
			
		}
	}
	
 	def apply(OclInvariant invariant) {
		if (oclValidator.matchMandatoryReference(invariant)) invariant.performMandatoryReference;
		if (oclValidator.matchSingleReference(invariant)) invariant.performSingleReference;
		if (oclValidator.matchReduceCodelistEntries(invariant)) invariant.performReduceCodelistEntries;
		if (oclValidator.matchFixedValue(invariant)) invariant.performFixedValue;
		if (oclValidator.matchChoiceA(invariant)) invariant.performChoice;
		// if (oclValidator.matchChoiceC(invariant)) invariant.performChoice;
		if (oclValidator.matchMandatoryChoice(invariant)) invariant.performMandatoryChoice;
		if (oclValidator.matchChoiceFixedValue(invariant)) invariant.performChoiceFixedValue;
	}

	//def void performMandatorySingleReference(OclInvariant invariant) {
	//	invariant.getRef().setMultiplicity(MultiplicityKind::ONE);
	//}


	def void performMandatoryReference(OclInvariant invariant) {
		invariant.getRef().setMultiplicity( invariant.getRef().multiplicity.newKind() );
	}

	def MultiplicityKind newKind(MultiplicityKind m) {
		switch (m) {
			case MultiplicityKind::ONE          : MultiplicityKind::ONE
			case MultiplicityKind::OPTIONAL     : MultiplicityKind::ONE
			case MultiplicityKind::ZERO_OR_MORE : MultiplicityKind::ONE_OR_MORE
			case MultiplicityKind::ONE_OR_MORE  : MultiplicityKind::ONE_OR_MORE
		}
	}

	def void performSingleReference(OclInvariant invariant) {
		invariant.getRef().setMultiplicity( invariant.getRef().multiplicity.newKind2() );
	}

	def MultiplicityKind newKind2(MultiplicityKind m) {
		switch (m) {
			case MultiplicityKind::ONE          : MultiplicityKind::ONE
			case MultiplicityKind::OPTIONAL     : MultiplicityKind::OPTIONAL
			case MultiplicityKind::ZERO_OR_MORE : MultiplicityKind::OPTIONAL
			case MultiplicityKind::ONE_OR_MORE  : MultiplicityKind::ONE
		}
	}

	def void performReduceCodelistEntries(OclInvariant invariant) {
		addRestrictions(invariant.getRef, invariant);
	}
	
	
	def dispatch void addRestrictions(BBIE bbie, OclInvariant invariant) {
		var literals = invariant.getLiteralNames;
		literals.removeAll(bbie.restriction);
		bbie.restriction.addAll(literals);	
	}
	
	def dispatch void addRestrictions(Content content, OclInvariant invariant) {
		invariant.lastRefButOne().addRestrictions(invariant);
	}
	
	def dispatch void addRestrictions(Supplement supplement, OclInvariant invariant) {
		var literals = invariant.getLiteralNames;
		literals.removeAll(supplement.restriction);
		supplement.restriction.addAll(literals);	
	}
	
	def List<String> getLiteralNames(OclInvariant invariant) {
		var List<String> names = new ArrayList<String>();
		for (obj: invariant.expression.eAllContents.toIterable) {
			if (obj instanceof OclEnumerationLiteral) {
				names.add( (obj as OclEnumerationLiteral).literalName);
			}
		}
		return names;
	}
	
	def String getLiteralName(OclEnumerationLiteral literal) {
		literal.value.split("::").get(1)
	}	
	
	
	def void performFixedValue(OclInvariant invariant) {
		for (oclLiteral : invariant.getFixedValue()) {
			invariant.getRef().setFixedValue(invariant, oclLiteral.value)
		}
	}
	
	def dispatch void setFixedValue(OclRef ref, OclInvariant invariant, String fixedValue) {
		//("setFixedValue not impemented on: " + ref.print() + " (value = " + fixedValue + ")").info();	
	}
	
	def dispatch void setFixedValue(BBIE bbie, OclInvariant invariant, String fixedValue) {
		println("setFixedValue on: " + bbie.name + " (value = " + fixedValue + ")")
		if ("Resolution_Duration" == bbie.name) {
			if (!bbie.restriction.contains(fixedValue)) {
				bbie.restriction.add(fixedValue)
			}
		} else {
			bbie.setFixedValue(fixedValue)
		}
	}

	def dispatch void setFixedValue(Content content, OclInvariant invariant, String fixedValue) {
		invariant.lastRefButOne().setFixedValue(invariant, fixedValue)
	}
	
	def dispatch void setFixedValue(Supplement supplement, OclInvariant invariant, String fixedValue) {
		//("setFixedValue on: " + this.print() + " (value = " + fixedValue + ")").info() ->		
		supplement.setFixedValue(fixedValue)
	}
	
	def List<OclLiteral> getFixedValue(OclInvariant invariant) {
		invariant.expression.eAllContents.toIterable.filter(typeof(OclLiteral)).toList
	}
	
	def dispatch String getValue(OclLiteral literal) {
		"unknown"
	}
		
	def dispatch String getValue(OclIntegerLiteral literal) {
		literal.value.toString()
	}

	def dispatch String getValue(OclStringLiteral literal) {
		literal.value.toString()
	}
	
	def dispatch String getValue(OclBooleanFalse literal) {
		"false"
	}

	def dispatch String getValue(OclBooleanTrue literal) {
		"true";
	}
	
	
	def void performChoice(OclInvariant invariant) {
		if (!invariant.selfImplies.abie.properties.exists(p | p.or.contains(invariant.selfImplies)) ) {
			for (r: (invariant.getImplies).right.eAllContents.toIterable.filter(typeof(OclReference)))
				invariant.selfImplies.or.add( r.ref	as ABIEProperty)
		}
	}
	
	def ABIEProperty selfImplies(OclInvariant invariant) {
		invariant.getImplies.left.firstRef as ABIEProperty
	}

	def OclImplies getImplies(OclInvariant invariant) {
		if (oclValidator.matchForAll(invariant.expression)) {
			oclValidator.forAllBody(invariant.expression) as OclImplies
		} else {
			invariant.expression as OclImplies
		}
	}

	def ABIE abie(ABIEProperty p) {
		p.eContainer as ABIE
	}


	def void performMandatoryChoice(OclInvariant invariant) {
		for (r: invariant.referencesInMandatoryChoice) {
			r.setMultiplicity( r.multiplicity.newKind() )
		}
		(invariant.referencesInMandatoryChoice.head).or.addAll(invariant.referencesInMandatoryChoice.tail)
	}
	
	def List<ABIEProperty> referencesInMandatoryChoice(OclInvariant invariant) {
		if (oclValidator.matchForAll(invariant.expression)) {
			return oclValidator.forAllBody(invariant.expression).eAllContents.filter(typeof(OclReference)).toList.abieProperties
		} else {
			return invariant.expression.eAllContents.filter(typeof(OclReference)).toList.abieProperties
		}
	}
	
	def List<ABIEProperty> abieProperties(List<OclReference> oclReferences) {
		var list = new ArrayList<ABIEProperty>()
		for (r : oclReferences) {
			list.add(r.ref as ABIEProperty)
		}
		return list
	}
	
	
	def void performChoiceFixedValue(OclInvariant invariant) {
		(invariant.expression as OclImplies).right.firstRef().setFixedValue(
			invariant, (invariant.expression as OclImplies).right.eAllContents.toIterable.filter(typeof(OclLiteral)).head.getValue);
	}


	def OclRef getRef(OclInvariant invariant) {
		if (oclValidator.matchForAll(invariant.expression)) {
			oclValidator.forAllBody(invariant.expression).firstRef()
		} else {
			invariant.expression.firstRef()
		}
	}		 

	def OclRef firstRef(OclExpression expr) {
		if (expr instanceof OclReference) { 
			(expr as OclReference).ref
		} else {
			expr.eAllContents.toIterable.filter(typeof(OclReference)).head.ref;
		}
	}


	def dispatch OclRef ref(OclPathSelfHead sh) {
		sh.path.last.feature;
	}
	
	def dispatch OclRef ref(OclPathFeatureHead fh) {
		if (fh.tail != null) {
			fh.tail.last.feature
		} else {
			fh.feature
		}
	}
				  
	def OclPathTail last(OclPathTail t) {
		if (t.tail == null) {
			t
		} else {
			t.tail.last
		}
	}

	// new implementation

	def OclRef lastRefButOne(OclInvariant invariant) {
		if (oclValidator.matchForAll(invariant.expression)) { 
			if (oclValidator.forAllBody(invariant.expression).eAllContents.toIterable.filter(typeof(OclReference)).head.refToList.size == 1) {
				oclValidator.forAllContext(invariant.expression).firstRef
			} else {
				oclValidator.forAllBody(invariant.expression).eAllContents.toIterable.filter(typeof(OclReference)).head.refToList.lastButOne
			}
		} else {
			invariant.expression.eAllContents.toIterable.filter(typeof(OclReference)).head.refToList.lastButOne;
		} 
	}

	def OclRef lastButOne(List<OclRef> list) {
		list.get( list.size - 2);
	}

	
	def dispatch List<OclRef> refToList(OclPathSelfHead sh) {
		refToList(sh.path);
	}

	def dispatch List<OclRef> refToList(OclPathFeatureHead fh) {
		var list = new ArrayList<OclRef>()
		list.add(fh.feature) 
		if (fh.tail != null) {
			list.addAll( refToList(fh.tail) )
		}
		return list
	}
	
	def dispatch List<OclRef> refToList(OclPathTail t) {
		var list = new ArrayList<OclRef>()
		list.add(t.feature) 
		if (t.tail != null) {
			list.addAll( refToList(t.tail) )
		}
		return list
 	}
}