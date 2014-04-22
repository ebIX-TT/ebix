package org.ebix.umm.validation.ocl

import org.ebix.umm.umm.OclAnd
import org.ebix.umm.umm.OclArrow
import org.ebix.umm.umm.OclBooleanLiteral
import org.ebix.umm.umm.OclEnumerationLiteral
import org.ebix.umm.umm.OclExpression
import org.ebix.umm.umm.OclEqual
import org.ebix.umm.umm.OclForAll
import org.ebix.umm.umm.OclImplies
import org.ebix.umm.umm.OclIntegerLiteral
import org.ebix.umm.umm.OclInvariant
import org.ebix.umm.umm.OclIsEmpty
import org.ebix.umm.umm.OclLessOrEqual
import org.ebix.umm.umm.OclNotEmpty
import org.ebix.umm.umm.OclOr
import org.ebix.umm.umm.OclPathFeatureHead
import org.ebix.umm.umm.OclPathSelfHead
import org.ebix.umm.umm.OclPathTail
import org.ebix.umm.umm.OclReference
import org.ebix.umm.umm.OclSize
import org.ebix.umm.umm.OclStringLiteral
import org.ebix.umm.umm.OclXor

class UmmOclValidator {
	
	def boolean recognizeInvariant(OclInvariant oclInvariant) {
		oclInvariant.matchRemoveReference 
		|| oclInvariant.matchMandatoryReference
		|| oclInvariant.matchSingleReference
		|| oclInvariant.matchReduceCodelistEntries
		|| oclInvariant.matchFixedValue
		|| oclInvariant.matchChoice
		|| oclInvariant.matchChoiceFixedValue
		|| oclInvariant.matchMandatoryChoice;
	}
	
	/*
	Statement 1
	(  =
		( ->
		reference
		size()
		)
		integer literal: 0
	)
	
	Or
	
	( ->
		reference
		isEmpty()
	)
	
	
	Or the above within the body of a forAll expression.
	 
	Precheck: cardinality of the reference must be 0..1 or 0..*.	
	Action: remove reference from the model
	*/
	def boolean matchRemoveReference(OclInvariant invariant) {
		invariant.expression.matchRemoveReference() ||
			(invariant.expression.matchForAll() && invariant.expression.forAllBody().matchRemoveReference() );
	}

	def boolean matchRemoveReference(OclExpression expr) {
		expr.matchSizeEq(0) || expr.matchIsEmpty();
	}

	/*
	Statement 2
	(  =
		( ->
		reference
		size()
		)
		integer literal: 1
	)
	
	Or
	
	( ->
		reference
		notEmpty()
	)

	Or the above within the body of a forAll expression.
	
	Precheck: none.	
	Action: change cardinality of the reference to 1..1.
	*/
	def boolean matchMandatoryReference(OclInvariant invariant) {
		invariant.expression.matchMandatoryReference() ||
		(invariant.expression.matchForAll() && invariant.expression.forAllBody().matchMandatoryReference() );
	}
	

	/*
	Statement 4
	(  <=
		( ->
		reference
		size()
		)
		integer literal: 1
	)
	
	Or the above within the body of a forAll expression.
	
	Precheck: none
	Action: change cardinality of the reference:
		If the cardinality was 0..*, change the cardinality to 0..1.
		If the cardinality was 1..*, change the cardinality to 1..1.
		otherwise no change.
	*/
	def boolean matchSingleReference(OclInvariant invariant) {
		invariant.expression.matchSizeLE1() ||
		(invariant.expression.matchForAll() && invariant.expression.forAllBody().matchSizeLE1());
	}

	/*
	Statement 5a
	( =
		reference
		codelist entry
	)
	
	Precheck: none
	Action: remove all other codelist entries for the involved Assembled from the model
	
	Statement 5b
	( or
		( =
			reference
			codelist entry1
		)
		( =
			reference
			codelist entry2
		)
	
	Precheck: none
	Action: remove all other codelist entries for the involved Assembled from the model
	
	Statement 5c
	( or
		( or
			( or
				( =
					reference
					codelist entry1
				)
				( =
					reference
					codelist entry2
				)
			)
			( =
				reference
				codelist entry3
			)
		)
		( =
			reference
			codelist entry4
		)
	
	Or the above within the body of a forAll expression.
	
	Precheck: none
	Action: remove all other codelist entries for the involved Assembled from the model
	*/
	def boolean matchReduceCodelistEntries(OclInvariant invariant) {
		invariant.expression.matchReduceCodelistEntries() ||
		(invariant.expression.matchForAll() && invariant.expression.forAllBody().matchReduceCodelistEntries() );
	}	
	
	def boolean matchReduceCodelistEntries(OclExpression expr) {
		matchOrWithRefEqEnum(expr);
		// && expr.allReferences().forAll(r| r.isSame( expr.allReferences().first() ));
	}
	
	def boolean matchOrWithRefEqEnum(OclExpression expr) {
		matchRefEqEnum(expr) 
		|| expr instanceof OclOr 
			&& matchOrWithRefEqEnum( (expr as OclOr).left )
			&& matchOrWithRefEqEnum( (expr as OclOr).right );
	}
	
	// match the equality of a reference with a codelist entry, e.g.: agency = AgencyCode::24
	def boolean matchRefEqEnum(OclExpression expr) {
		expr instanceof OclEqual
			&& (expr as OclEqual).left  instanceof OclReference
			&& (expr as OclEqual).right instanceof OclEnumerationLiteral;
	}
	
	//def List<OclReference> allReferences(OclExpression expr) {
	//	expr.eAllContents.filter(OclReference);
	//}
	
	def boolean isSame(OclReference tail, OclReference otherTail) {
		( 
			tail instanceof OclPathSelfHead  && 
		  	otherTail instanceof OclPathSelfHead &&
		  	(tail as OclPathSelfHead).path.isSame((otherTail as OclPathSelfHead).path) 
		) || (
		 	tail instanceof OclPathFeatureHead &&
		 	otherTail instanceof OclPathFeatureHead &&
		 	(tail as OclPathFeatureHead).feature == (otherTail as OclPathFeatureHead).feature && 
		 	(
		 		( (tail as OclPathFeatureHead).tail == null && (otherTail as OclPathFeatureHead) == null )  ||
		  		(tail as OclPathFeatureHead).tail.isSame((otherTail as OclPathFeatureHead).tail)
		  	) 
		);
	}
	
	def boolean isSame(OclPathTail tail, OclPathTail otherTail) {
		tail.feature == otherTail.feature && ( (tail.tail == null && otherTail.tail == null) || tail.tail.isSame(otherTail.tail) );
	} 
	
	/*
	Statement 6
	( =
		reference
		boolean literal  or integer literal or string literal
	)
	
	Or the above within the body of a forAll expression, or the statement repeated with or's.
	
	Precheck: none
	Action: fixed value or enumeration in case of Resolution_Duration.
	*/
	def boolean matchFixedValue(OclInvariant invariant) {
		invariant.expression.matchOrWithFixedValue() ||
		(invariant.expression.matchForAll() && invariant.expression.forAllBody().matchOrWithFixedValue());
	}
	
	def boolean matchOrWithFixedValue(OclExpression expr) {
		matchFixedValue(expr) 
		|| expr instanceof OclOr 
			&& matchOrWithFixedValue( (expr as OclOr).left )
			&& matchOrWithFixedValue( (expr as OclOr).right );
	}
	def boolean matchFixedValue(OclExpression expr) {
		 expr instanceof OclEqual  
				&& (expr as OclEqual).left  instanceof OclReference 
				&& ( (expr as OclEqual).right instanceof OclBooleanLiteral 
					 || (expr as OclEqual).right instanceof  OclIntegerLiteral
					 || (expr as OclEqual).right instanceof OclStringLiteral
				   );
	}

	/*
	Statement 7a:
	( implies
		(  ->                      or           ( =
			reference A                            ( ->
			notEmpty()                                 reference A
                                                       size()
                                                   )
                                                   1 
		)                                       )
		( =                        or           ( ->
			( ->                                  reference B
			  reference B                         isEmpty()
			   size()                           )
			)
			0
		)
	)
	
	Statement 7b:
	( implies
		(  ->
			reference A
			isEmpty()
		)
		( = 
			( ->
			  reference B
			   size()
			)
			1
		)
	)
	
	Statement 7c:
	( implies
		(  ->
			reference A
			notEmpty()
		)
		( and
			( = 
				( ->
			  	reference B
			   	size()
				)
				0
			)
			( and ...
			)
		)
	)
	
	Precheck: none
	Action: (this construct represents a choice)
	*/
	def boolean matchChoice(OclInvariant invariant) {
		invariant.matchChoiceA
		|| invariant.matchChoiceB
		// || invariant.matchChoiceC
	}

	def boolean matchChoiceA(OclInvariant invariant) {
		invariant.expression.matchChoiceA() ||
		(invariant.expression.matchForAll() && invariant.expression.forAllBody().matchChoiceA())
	}
	
	def boolean matchChoiceA(OclExpression expr) {
		expr instanceof OclImplies
			&& (expr as OclImplies).left.matchEntries
			&& (expr as OclImplies).right.matchAndNoEntries
	}
	
	def boolean matchEntries(OclExpression expr) {
		expr.matchNotEmpty || expr.matchSizeEq(1)
	}
	
	def boolean matchAndNoEntries(OclExpression expr) {
		expr.matchNoEntries
		|| expr instanceof OclAnd
			&& (expr as OclAnd).left.matchAndNoEntries
			&& (expr as OclAnd).right.matchAndNoEntries
	}
	
	def boolean matchNoEntries(OclExpression expr) {
		expr.matchSizeEq(0) || expr.matchIsEmpty
	}
	
	def boolean matchChoiceB(OclInvariant invariant) {
		invariant.expression instanceof OclImplies
			&& (invariant.expression as OclImplies).left.matchSizeEq(1) 
			&& matchIsEmpty( (invariant.expression as OclImplies).right );
	}
	
	/*
	def boolean matchChoiceC(OclInvariant invariant) {
		invariant.expression instanceof OclImplies
			&& matchNotEmpty( (invariant.expression as OclImplies).left )
			&& matchAndWithSizeEq0( (invariant.expression as OclImplies).right );
	}
	
	def boolean matchAndWithSizeEq0(OclExpression expr) {
		expr.matchSizeEq(0) 
		|| expr instanceof OclAnd 
			&& matchAndWithSizeEq0( (expr as OclAnd).left )
			&& matchAndWithSizeEq0( (expr as OclAnd).right );
	}
	*/

	/*
	Statement 8
	( implies
		( = 
			( ->
			  reference B
			   size()
			)
			1
		)
		( = 
			reference B
			true
		)
	)	
	
	Precheck: none
	Action: (this construct represents a mandatory value for reference B if reference B is present)
	*/	
	def boolean matchChoiceFixedValue(OclInvariant invariant) {
		invariant.expression instanceof OclImplies
			&& (invariant.expression as OclImplies).left.matchSizeEq(1)
			&& (invariant.expression as OclImplies).right.matchFixedValue;
	}

	/*
	Statement 9
	( xor
		( = 
			( ->                                         or (  ->
			  reference A                                      reference A
			   size()                                          isNotEmpty()
			)                                               )
			1
		)
		( = 
			( ->
			  reference B
			   size()
			)
			1
		)
	)	
	
	Or the above within the body of a forAll expression.
	
	Precheck: two implies statements have been stated to exclude the other reference if the reference is present. 
	Action: 
		1) change cardinality of the reference:
		If the cardinality was 0..*, change the cardinality to 1..*.
		If the cardinality was 0..1, change the cardinality to 1..1.
		otherwise no change.
	    2) this construct represents a choice
	
	*/	
	def boolean matchMandatoryChoice(OclInvariant invariant) {
		invariant.expression.matchMandatoryChoice ||
		(invariant.expression.matchForAll && invariant.expression.forAllBody.matchMandatoryChoice);
	}
	
	def boolean matchMandatoryChoice(OclExpression expr) {
		expr instanceof OclXor
			&& ( (expr as OclXor).left.matchMandatoryChoice  || (expr as OclXor).left.matchMandatoryReference  ) 
			&& ( (expr as OclXor).right.matchMandatoryChoice || (expr as OclXor).right.matchMandatoryReference )
	}
			
	def boolean matchMandatoryReference(OclExpression expr) {
		expr.matchSizeEq(1) || expr.matchNotEmpty;
	}
	
	/*
	 * Matches ref->size() <= 1
	 */	
	def boolean matchSizeLE1(OclExpression expr) {
		 expr instanceof OclLessOrEqual  
			&& (expr as OclLessOrEqual).left  instanceof OclArrow
				&& (((expr as OclLessOrEqual).left) as OclArrow).left  instanceof OclReference
				&& (((expr as OclLessOrEqual).left) as OclArrow).right instanceof OclSize
			&& (expr as OclLessOrEqual).right instanceof OclIntegerLiteral 
			&& ((expr as OclLessOrEqual).right as OclIntegerLiteral).value == 1;
	}
	
	/*
	 * Matches ref->size() = 1
	 */
	def boolean matchSizeEq(OclExpression expr, int value) {
		 expr instanceof OclEqual  
			&& (expr as OclEqual).left  instanceof OclArrow
				&& (((expr as OclEqual).left) as OclArrow).left  instanceof OclReference
				&& (((expr as OclEqual).left) as OclArrow).right instanceof OclSize
			&& (expr as OclEqual).right instanceof OclIntegerLiteral 
			&& ((expr as OclEqual).right as OclIntegerLiteral).value == value;
	}


	/*
	 * Matches ref->isEmpty()
	 */
	def boolean matchIsEmpty(OclExpression expr) {
		expr instanceof OclArrow
			&& (expr as OclArrow).left  instanceof OclReference
			&& (expr as OclArrow).right instanceof OclIsEmpty;
	}

	/*
	 * Matches ref->notEmpty()
	 */
	def boolean matchNotEmpty(OclExpression expr) {
		expr instanceof OclArrow
			&& (expr as OclArrow).left  instanceof OclReference
			&& (expr as OclArrow).right instanceof OclNotEmpty;
	}

	//
	// Utility functions
	//
	def boolean matchForAll(OclExpression expr) {
		expr instanceof OclArrow
			&& (expr as OclArrow).left  instanceof OclReference
			&& (expr as OclArrow).right instanceof OclForAll;
	} 
	
	def OclExpression forAllBody(OclExpression expr) {
		((expr as OclArrow).right as OclForAll).body;
	} 
	
	def OclExpression forAllContext(OclExpression expr) {
		(expr as OclArrow).left;
	} 

	
}