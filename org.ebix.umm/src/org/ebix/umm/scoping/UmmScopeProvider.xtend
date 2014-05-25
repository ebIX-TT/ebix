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
package org.ebix.umm.scoping

import org.eclipse.xtext.scoping.Scopes

import org.ebix.umm.umm.ABIE
import org.ebix.umm.umm.ASBIE
import org.ebix.umm.umm.BBIE
import org.ebix.umm.umm.BDT
import org.ebix.umm.umm.Constraint
import org.ebix.umm.umm.ContextRef
import org.ebix.umm.umm.MA
import org.ebix.umm.umm.MAProperty
import org.ebix.umm.umm.OclArrow
import org.ebix.umm.umm.OclForAll
import org.ebix.umm.umm.OclInvariant
import org.ebix.umm.umm.OclPathFeatureHead
import org.ebix.umm.umm.OclPathSelfHead
import org.ebix.umm.umm.OclPathTail
import org.ebix.umm.umm.OclRef
import org.ebix.umm.umm.OclReference
import org.ebix.umm.umm.OclValue
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
//import org.eclipse.xtext.parsetree.AbstractNode
//import org.eclipse.xtext.parsetree.CompositeNode
//import org.eclipse.xtext.parsetree.LeafNode
//import org.eclipse.xtext.parsetree.NodeUtil
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider


/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#scoping
 * on how and when to use it 
 *
 */
class UmmScopeProvider extends AbstractDeclarativeScopeProvider {
	
	override IScope getScope(EObject context, EReference reference) {
		//System.out.println("context: " + context.toString());
		//System.out.println("reference: " + reference.toString());
		
		/*
		CompositeNode node = NodeUtil.getNode(context);
		Iterable<AbstractNode> contents = NodeUtil.getAllContents(node);
		StringBuffer text = new StringBuffer();
		for (AbstractNode abstractNode : contents) {
		  if (abstractNode instanceof LeafNode)
		    text.append(((LeafNode)abstractNode).getText());
		}
		System.out.println(text);
		*/
		
		return super.getScope(context, reference);
	}

	def IScope scope_OclPathFeatureHead_feature(OclInvariant oclInvariant, EReference eRef) {
		//System.out.println("scope_OclPathFeatureHead_feature()");
		val ContextRef context = (oclInvariant.eContainer() as Constraint).getContext();
		return getScope(context);
	}

	def IScope scope_OclPathFeatureHead_feature(OclForAll forAll, EReference eRef) {
		var IScope scope = IScope::NULLSCOPE;
		val OclValue value = (forAll.eContainer() as OclArrow).getLeft();

		if ( value instanceof OclReference ) {
			scope = getScope( getType(value as OclReference) );
		}
		
		return scope;
	}
	
	
	def IScope scope_OclPathTail_feature(OclPathTail pathTail, EReference eRef) {
		return getScope(previousType(pathTail));
	}
	

	/**
	 * Returns the {@link ContextRef} instance pointed to by either the previous
	 * path element ({@link OclPathSelfHead}, {@link OclPathFeatureHead} or
	 * {@link OclPathTail}) or by the containing element (either an
	 * {@link OclInvariant} or {@link OclForAll}).
	 * 
	 * @throws RuntimeException
	 *             if the previous type cannot be determined.
	 */
	def ContextRef previousType(OclPathTail pathTail) {
		var ContextRef context = null;
		val EObject container = pathTail.eContainer();

		if (container instanceof OclPathFeatureHead) {
			context = getReferedType( (container as OclPathFeatureHead).getFeature() );
			
		} else if (container instanceof OclPathSelfHead) {
			// context type for 'self' is found in the constraint
			var EObject container2 = container.eContainer();
			while ( !(container2 instanceof Constraint)) {
				container2 = container2.eContainer();
			}
			val Constraint constraint =  container2 as Constraint;
			context = constraint.getContext();
			
		} else if (container instanceof OclPathTail) {
			val OclRef oclRef = (container as OclPathTail).getFeature();
			context = getReferedType(oclRef)
		}
		// OclForAll is not implemented yet, as are references not starting with 'self'

		return context;
	}
	
	def ContextRef getType(OclReference oclReference) {
		var ContextRef type = null;
		
		if (oclReference instanceof OclPathFeatureHead) {
			val OclPathFeatureHead head = oclReference as OclPathFeatureHead;
			if( head.getTail() != null ) {
				type = resultType(head.getTail());
			} else {
				type = getReferedType(head.getFeature());
			}
		} else if (oclReference instanceof OclPathSelfHead ) {
			type = resultType((oclReference as OclPathSelfHead).getPath());
			// should the context of the constraint not be returned when the path == null?
		}
		
		return type;
	}
	
	/**
	 * Looks up the end of the path and returns its type (of meta type
	 * {@link Entity}).
	 */
	def ContextRef resultType(OclPathTail pathTail) {
		var pathEnd = pathTail
		while( pathEnd.tail != null ) {
			pathEnd = pathEnd.tail
		}

		return getReferedType(pathEnd.feature);
	}

	
	def IScope getScope(ContextRef type) {
		var IScope result = IScope::NULLSCOPE
		
		switch type {
			MA   case true: result = Scopes::scopeFor(type.properties)
			ABIE case true: result = Scopes::scopeFor(type.properties)
			BDT  case true: result = Scopes::scopeFor(type.properties)
		}
		 
		return result;
	}
	
	def private ContextRef getReferedType(OclRef oclRef) {
		var ContextRef type = null
	
		switch oclRef {
			MAProperty case true: type = oclRef.type
			ASBIE      case true: type = oclRef.type
			BBIE       case true: type = oclRef.type
		}
			
		return type
	}


}
