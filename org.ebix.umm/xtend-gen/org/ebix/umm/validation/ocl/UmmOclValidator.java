/**
 * UMM Schema Generator
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
package org.ebix.umm.validation.ocl;

import com.google.common.base.Objects;
import org.ebix.umm.umm.OclAnd;
import org.ebix.umm.umm.OclArrow;
import org.ebix.umm.umm.OclBooleanLiteral;
import org.ebix.umm.umm.OclEnumerationLiteral;
import org.ebix.umm.umm.OclEqual;
import org.ebix.umm.umm.OclExpression;
import org.ebix.umm.umm.OclForAll;
import org.ebix.umm.umm.OclFunctionCall;
import org.ebix.umm.umm.OclImplies;
import org.ebix.umm.umm.OclIntegerLiteral;
import org.ebix.umm.umm.OclInvariant;
import org.ebix.umm.umm.OclIsEmpty;
import org.ebix.umm.umm.OclLessOrEqual;
import org.ebix.umm.umm.OclNotEmpty;
import org.ebix.umm.umm.OclOr;
import org.ebix.umm.umm.OclPathFeatureHead;
import org.ebix.umm.umm.OclPathSelfHead;
import org.ebix.umm.umm.OclPathTail;
import org.ebix.umm.umm.OclRef;
import org.ebix.umm.umm.OclReference;
import org.ebix.umm.umm.OclSize;
import org.ebix.umm.umm.OclStringLiteral;
import org.ebix.umm.umm.OclXor;

@SuppressWarnings("all")
public class UmmOclValidator {
  public boolean recognizeInvariant(final OclInvariant oclInvariant) {
    boolean _or = false;
    boolean _or_1 = false;
    boolean _or_2 = false;
    boolean _or_3 = false;
    boolean _or_4 = false;
    boolean _or_5 = false;
    boolean _or_6 = false;
    boolean _matchRemoveReference = this.matchRemoveReference(oclInvariant);
    if (_matchRemoveReference) {
      _or_6 = true;
    } else {
      boolean _matchMandatoryReference = this.matchMandatoryReference(oclInvariant);
      _or_6 = _matchMandatoryReference;
    }
    if (_or_6) {
      _or_5 = true;
    } else {
      boolean _matchSingleReference = this.matchSingleReference(oclInvariant);
      _or_5 = _matchSingleReference;
    }
    if (_or_5) {
      _or_4 = true;
    } else {
      boolean _matchReduceCodelistEntries = this.matchReduceCodelistEntries(oclInvariant);
      _or_4 = _matchReduceCodelistEntries;
    }
    if (_or_4) {
      _or_3 = true;
    } else {
      boolean _matchFixedValue = this.matchFixedValue(oclInvariant);
      _or_3 = _matchFixedValue;
    }
    if (_or_3) {
      _or_2 = true;
    } else {
      boolean _matchChoice = this.matchChoice(oclInvariant);
      _or_2 = _matchChoice;
    }
    if (_or_2) {
      _or_1 = true;
    } else {
      boolean _matchChoiceFixedValue = this.matchChoiceFixedValue(oclInvariant);
      _or_1 = _matchChoiceFixedValue;
    }
    if (_or_1) {
      _or = true;
    } else {
      boolean _matchMandatoryChoice = this.matchMandatoryChoice(oclInvariant);
      _or = _matchMandatoryChoice;
    }
    return _or;
  }
  
  /**
   * Statement 1
   * (  =
   * ( ->
   * reference
   * size()
   * )
   * integer literal: 0
   * )
   * 
   * Or
   * 
   * ( ->
   * reference
   * isEmpty()
   * )
   * 
   * 
   * Or the above within the body of a forAll expression.
   * 
   * Precheck: cardinality of the reference must be 0..1 or 0..*.
   * Action: remove reference from the model
   */
  public boolean matchRemoveReference(final OclInvariant invariant) {
    boolean _or = false;
    OclExpression _expression = invariant.getExpression();
    boolean _matchRemoveReference = this.matchRemoveReference(_expression);
    if (_matchRemoveReference) {
      _or = true;
    } else {
      boolean _and = false;
      OclExpression _expression_1 = invariant.getExpression();
      boolean _matchForAll = this.matchForAll(_expression_1);
      if (!_matchForAll) {
        _and = false;
      } else {
        OclExpression _expression_2 = invariant.getExpression();
        OclExpression _forAllBody = this.forAllBody(_expression_2);
        boolean _matchRemoveReference_1 = this.matchRemoveReference(_forAllBody);
        _and = _matchRemoveReference_1;
      }
      _or = _and;
    }
    return _or;
  }
  
  public boolean matchRemoveReference(final OclExpression expr) {
    boolean _or = false;
    boolean _matchSizeEq = this.matchSizeEq(expr, 0);
    if (_matchSizeEq) {
      _or = true;
    } else {
      boolean _matchIsEmpty = this.matchIsEmpty(expr);
      _or = _matchIsEmpty;
    }
    return _or;
  }
  
  /**
   * Statement 2
   * (  =
   * ( ->
   * reference
   * size()
   * )
   * integer literal: 1
   * )
   * 
   * Or
   * 
   * ( ->
   * reference
   * notEmpty()
   * )
   * 
   * Or the above within the body of a forAll expression.
   * 
   * Precheck: none.
   * Action: change cardinality of the reference to 1..1.
   */
  public boolean matchMandatoryReference(final OclInvariant invariant) {
    boolean _or = false;
    OclExpression _expression = invariant.getExpression();
    boolean _matchMandatoryReference = this.matchMandatoryReference(_expression);
    if (_matchMandatoryReference) {
      _or = true;
    } else {
      boolean _and = false;
      OclExpression _expression_1 = invariant.getExpression();
      boolean _matchForAll = this.matchForAll(_expression_1);
      if (!_matchForAll) {
        _and = false;
      } else {
        OclExpression _expression_2 = invariant.getExpression();
        OclExpression _forAllBody = this.forAllBody(_expression_2);
        boolean _matchMandatoryReference_1 = this.matchMandatoryReference(_forAllBody);
        _and = _matchMandatoryReference_1;
      }
      _or = _and;
    }
    return _or;
  }
  
  /**
   * Statement 4
   * (  <=
   * ( ->
   * reference
   * size()
   * )
   * integer literal: 1
   * )
   * 
   * Or the above within the body of a forAll expression.
   * 
   * Precheck: none
   * Action: change cardinality of the reference:
   * If the cardinality was 0..*, change the cardinality to 0..1.
   * If the cardinality was 1..*, change the cardinality to 1..1.
   * otherwise no change.
   */
  public boolean matchSingleReference(final OclInvariant invariant) {
    boolean _or = false;
    OclExpression _expression = invariant.getExpression();
    boolean _matchSizeLE1 = this.matchSizeLE1(_expression);
    if (_matchSizeLE1) {
      _or = true;
    } else {
      boolean _and = false;
      OclExpression _expression_1 = invariant.getExpression();
      boolean _matchForAll = this.matchForAll(_expression_1);
      if (!_matchForAll) {
        _and = false;
      } else {
        OclExpression _expression_2 = invariant.getExpression();
        OclExpression _forAllBody = this.forAllBody(_expression_2);
        boolean _matchSizeLE1_1 = this.matchSizeLE1(_forAllBody);
        _and = _matchSizeLE1_1;
      }
      _or = _and;
    }
    return _or;
  }
  
  /**
   * Statement 5a
   * ( =
   * reference
   * codelist entry
   * )
   * 
   * Precheck: none
   * Action: remove all other codelist entries for the involved Assembled from the model
   * 
   * Statement 5b
   * ( or
   * ( =
   * reference
   * codelist entry1
   * )
   * ( =
   * reference
   * codelist entry2
   * )
   * 
   * Precheck: none
   * Action: remove all other codelist entries for the involved Assembled from the model
   * 
   * Statement 5c
   * ( or
   * ( or
   * ( or
   * ( =
   * reference
   * codelist entry1
   * )
   * ( =
   * reference
   * codelist entry2
   * )
   * )
   * ( =
   * reference
   * codelist entry3
   * )
   * )
   * ( =
   * reference
   * codelist entry4
   * )
   * 
   * Or the above within the body of a forAll expression.
   * 
   * Precheck: none
   * Action: remove all other codelist entries for the involved Assembled from the model
   */
  public boolean matchReduceCodelistEntries(final OclInvariant invariant) {
    boolean _or = false;
    OclExpression _expression = invariant.getExpression();
    boolean _matchReduceCodelistEntries = this.matchReduceCodelistEntries(_expression);
    if (_matchReduceCodelistEntries) {
      _or = true;
    } else {
      boolean _and = false;
      OclExpression _expression_1 = invariant.getExpression();
      boolean _matchForAll = this.matchForAll(_expression_1);
      if (!_matchForAll) {
        _and = false;
      } else {
        OclExpression _expression_2 = invariant.getExpression();
        OclExpression _forAllBody = this.forAllBody(_expression_2);
        boolean _matchReduceCodelistEntries_1 = this.matchReduceCodelistEntries(_forAllBody);
        _and = _matchReduceCodelistEntries_1;
      }
      _or = _and;
    }
    return _or;
  }
  
  public boolean matchReduceCodelistEntries(final OclExpression expr) {
    return this.matchOrWithRefEqEnum(expr);
  }
  
  public boolean matchOrWithRefEqEnum(final OclExpression expr) {
    boolean _or = false;
    boolean _matchRefEqEnum = this.matchRefEqEnum(expr);
    if (_matchRefEqEnum) {
      _or = true;
    } else {
      boolean _and = false;
      boolean _and_1 = false;
      if (!(expr instanceof OclOr)) {
        _and_1 = false;
      } else {
        OclExpression _left = ((OclOr) expr).getLeft();
        boolean _matchOrWithRefEqEnum = this.matchOrWithRefEqEnum(_left);
        _and_1 = _matchOrWithRefEqEnum;
      }
      if (!_and_1) {
        _and = false;
      } else {
        OclExpression _right = ((OclOr) expr).getRight();
        boolean _matchOrWithRefEqEnum_1 = this.matchOrWithRefEqEnum(_right);
        _and = _matchOrWithRefEqEnum_1;
      }
      _or = _and;
    }
    return _or;
  }
  
  public boolean matchRefEqEnum(final OclExpression expr) {
    boolean _and = false;
    if (!((expr instanceof OclEqual) && (((OclEqual) expr).getLeft() instanceof OclReference))) {
      _and = false;
    } else {
      OclExpression _right = ((OclEqual) expr).getRight();
      _and = (_right instanceof OclEnumerationLiteral);
    }
    return _and;
  }
  
  public boolean isSame(final OclReference tail, final OclReference otherTail) {
    boolean _or = false;
    boolean _and = false;
    if (!((tail instanceof OclPathSelfHead) && 
      (otherTail instanceof OclPathSelfHead))) {
      _and = false;
    } else {
      OclPathTail _path = ((OclPathSelfHead) tail).getPath();
      OclPathTail _path_1 = ((OclPathSelfHead) otherTail).getPath();
      boolean _isSame = this.isSame(_path, _path_1);
      _and = _isSame;
    }
    if (_and) {
      _or = true;
    } else {
      boolean _and_1 = false;
      boolean _and_2 = false;
      if (!((tail instanceof OclPathFeatureHead) && 
        (otherTail instanceof OclPathFeatureHead))) {
        _and_2 = false;
      } else {
        OclRef _feature = ((OclPathFeatureHead) tail).getFeature();
        OclRef _feature_1 = ((OclPathFeatureHead) otherTail).getFeature();
        boolean _equals = Objects.equal(_feature, _feature_1);
        _and_2 = _equals;
      }
      if (!_and_2) {
        _and_1 = false;
      } else {
        boolean _or_1 = false;
        boolean _and_3 = false;
        OclPathTail _tail = ((OclPathFeatureHead) tail).getTail();
        boolean _equals_1 = Objects.equal(_tail, null);
        if (!_equals_1) {
          _and_3 = false;
        } else {
          boolean _equals_2 = Objects.equal(((OclPathFeatureHead) otherTail), null);
          _and_3 = _equals_2;
        }
        if (_and_3) {
          _or_1 = true;
        } else {
          OclPathTail _tail_1 = ((OclPathFeatureHead) tail).getTail();
          OclPathTail _tail_2 = ((OclPathFeatureHead) otherTail).getTail();
          boolean _isSame_1 = this.isSame(_tail_1, _tail_2);
          _or_1 = _isSame_1;
        }
        _and_1 = _or_1;
      }
      _or = _and_1;
    }
    return _or;
  }
  
  public boolean isSame(final OclPathTail tail, final OclPathTail otherTail) {
    boolean _and = false;
    OclRef _feature = tail.getFeature();
    OclRef _feature_1 = otherTail.getFeature();
    boolean _equals = Objects.equal(_feature, _feature_1);
    if (!_equals) {
      _and = false;
    } else {
      boolean _or = false;
      boolean _and_1 = false;
      OclPathTail _tail = tail.getTail();
      boolean _equals_1 = Objects.equal(_tail, null);
      if (!_equals_1) {
        _and_1 = false;
      } else {
        OclPathTail _tail_1 = otherTail.getTail();
        boolean _equals_2 = Objects.equal(_tail_1, null);
        _and_1 = _equals_2;
      }
      if (_and_1) {
        _or = true;
      } else {
        OclPathTail _tail_2 = tail.getTail();
        OclPathTail _tail_3 = otherTail.getTail();
        boolean _isSame = this.isSame(_tail_2, _tail_3);
        _or = _isSame;
      }
      _and = _or;
    }
    return _and;
  }
  
  /**
   * Statement 6
   * ( =
   * reference
   * boolean literal  or integer literal or string literal
   * )
   * 
   * Or the above within the body of a forAll expression, or the statement repeated with or's.
   * 
   * Precheck: none
   * Action: fixed value or enumeration in case of Resolution_Duration.
   */
  public boolean matchFixedValue(final OclInvariant invariant) {
    boolean _or = false;
    OclExpression _expression = invariant.getExpression();
    boolean _matchOrWithFixedValue = this.matchOrWithFixedValue(_expression);
    if (_matchOrWithFixedValue) {
      _or = true;
    } else {
      boolean _and = false;
      OclExpression _expression_1 = invariant.getExpression();
      boolean _matchForAll = this.matchForAll(_expression_1);
      if (!_matchForAll) {
        _and = false;
      } else {
        OclExpression _expression_2 = invariant.getExpression();
        OclExpression _forAllBody = this.forAllBody(_expression_2);
        boolean _matchOrWithFixedValue_1 = this.matchOrWithFixedValue(_forAllBody);
        _and = _matchOrWithFixedValue_1;
      }
      _or = _and;
    }
    return _or;
  }
  
  public boolean matchOrWithFixedValue(final OclExpression expr) {
    boolean _or = false;
    boolean _matchFixedValue = this.matchFixedValue(expr);
    if (_matchFixedValue) {
      _or = true;
    } else {
      boolean _and = false;
      boolean _and_1 = false;
      if (!(expr instanceof OclOr)) {
        _and_1 = false;
      } else {
        OclExpression _left = ((OclOr) expr).getLeft();
        boolean _matchOrWithFixedValue = this.matchOrWithFixedValue(_left);
        _and_1 = _matchOrWithFixedValue;
      }
      if (!_and_1) {
        _and = false;
      } else {
        OclExpression _right = ((OclOr) expr).getRight();
        boolean _matchOrWithFixedValue_1 = this.matchOrWithFixedValue(_right);
        _and = _matchOrWithFixedValue_1;
      }
      _or = _and;
    }
    return _or;
  }
  
  public boolean matchFixedValue(final OclExpression expr) {
    return (((expr instanceof OclEqual) && (((OclEqual) expr).getLeft() instanceof OclReference)) && (((((OclEqual) expr).getRight() instanceof OclBooleanLiteral) || (((OclEqual) expr).getRight() instanceof OclIntegerLiteral)) || (((OclEqual) expr).getRight() instanceof OclStringLiteral)));
  }
  
  /**
   * Statement 7a:
   * ( implies
   * (  ->                      or           ( =
   * reference A                            ( ->
   * notEmpty()                                 reference A
   * size()
   * )
   * 1
   * )                                       )
   * ( =                        or           ( ->
   * ( ->                                  reference B
   * reference B                         isEmpty()
   * size()                           )
   * )
   * 0
   * )
   * )
   * 
   * Statement 7b:
   * ( implies
   * (  ->
   * reference A
   * isEmpty()
   * )
   * ( =
   * ( ->
   * reference B
   * size()
   * )
   * 1
   * )
   * )
   * 
   * Statement 7c:
   * ( implies
   * (  ->
   * reference A
   * notEmpty()
   * )
   * ( and
   * ( =
   * ( ->
   * reference B
   * size()
   * )
   * 0
   * )
   * ( and ...
   * )
   * )
   * )
   * 
   * Precheck: none
   * Action: (this construct represents a choice)
   */
  public boolean matchChoice(final OclInvariant invariant) {
    boolean _or = false;
    boolean _matchChoiceA = this.matchChoiceA(invariant);
    if (_matchChoiceA) {
      _or = true;
    } else {
      boolean _matchChoiceB = this.matchChoiceB(invariant);
      _or = _matchChoiceB;
    }
    return _or;
  }
  
  public boolean matchChoiceA(final OclInvariant invariant) {
    boolean _or = false;
    OclExpression _expression = invariant.getExpression();
    boolean _matchChoiceA = this.matchChoiceA(_expression);
    if (_matchChoiceA) {
      _or = true;
    } else {
      boolean _and = false;
      OclExpression _expression_1 = invariant.getExpression();
      boolean _matchForAll = this.matchForAll(_expression_1);
      if (!_matchForAll) {
        _and = false;
      } else {
        OclExpression _expression_2 = invariant.getExpression();
        OclExpression _forAllBody = this.forAllBody(_expression_2);
        boolean _matchChoiceA_1 = this.matchChoiceA(_forAllBody);
        _and = _matchChoiceA_1;
      }
      _or = _and;
    }
    return _or;
  }
  
  public boolean matchChoiceA(final OclExpression expr) {
    boolean _and = false;
    boolean _and_1 = false;
    if (!(expr instanceof OclImplies)) {
      _and_1 = false;
    } else {
      OclExpression _left = ((OclImplies) expr).getLeft();
      boolean _matchEntries = this.matchEntries(_left);
      _and_1 = _matchEntries;
    }
    if (!_and_1) {
      _and = false;
    } else {
      OclExpression _right = ((OclImplies) expr).getRight();
      boolean _matchAndNoEntries = this.matchAndNoEntries(_right);
      _and = _matchAndNoEntries;
    }
    return _and;
  }
  
  public boolean matchEntries(final OclExpression expr) {
    boolean _or = false;
    boolean _matchNotEmpty = this.matchNotEmpty(expr);
    if (_matchNotEmpty) {
      _or = true;
    } else {
      boolean _matchSizeEq = this.matchSizeEq(expr, 1);
      _or = _matchSizeEq;
    }
    return _or;
  }
  
  public boolean matchAndNoEntries(final OclExpression expr) {
    boolean _or = false;
    boolean _matchNoEntries = this.matchNoEntries(expr);
    if (_matchNoEntries) {
      _or = true;
    } else {
      boolean _and = false;
      boolean _and_1 = false;
      if (!(expr instanceof OclAnd)) {
        _and_1 = false;
      } else {
        OclExpression _left = ((OclAnd) expr).getLeft();
        boolean _matchAndNoEntries = this.matchAndNoEntries(_left);
        _and_1 = _matchAndNoEntries;
      }
      if (!_and_1) {
        _and = false;
      } else {
        OclExpression _right = ((OclAnd) expr).getRight();
        boolean _matchAndNoEntries_1 = this.matchAndNoEntries(_right);
        _and = _matchAndNoEntries_1;
      }
      _or = _and;
    }
    return _or;
  }
  
  public boolean matchNoEntries(final OclExpression expr) {
    boolean _or = false;
    boolean _matchSizeEq = this.matchSizeEq(expr, 0);
    if (_matchSizeEq) {
      _or = true;
    } else {
      boolean _matchIsEmpty = this.matchIsEmpty(expr);
      _or = _matchIsEmpty;
    }
    return _or;
  }
  
  public boolean matchChoiceB(final OclInvariant invariant) {
    boolean _and = false;
    boolean _and_1 = false;
    OclExpression _expression = invariant.getExpression();
    if (!(_expression instanceof OclImplies)) {
      _and_1 = false;
    } else {
      OclExpression _expression_1 = invariant.getExpression();
      OclExpression _left = ((OclImplies) _expression_1).getLeft();
      boolean _matchSizeEq = this.matchSizeEq(_left, 1);
      _and_1 = _matchSizeEq;
    }
    if (!_and_1) {
      _and = false;
    } else {
      OclExpression _expression_2 = invariant.getExpression();
      OclExpression _right = ((OclImplies) _expression_2).getRight();
      boolean _matchIsEmpty = this.matchIsEmpty(_right);
      _and = _matchIsEmpty;
    }
    return _and;
  }
  
  /**
   * Statement 8
   * ( implies
   * ( =
   * ( ->
   * reference B
   * size()
   * )
   * 1
   * )
   * ( =
   * reference B
   * true
   * )
   * )
   * 
   * Precheck: none
   * Action: (this construct represents a mandatory value for reference B if reference B is present)
   */
  public boolean matchChoiceFixedValue(final OclInvariant invariant) {
    boolean _and = false;
    boolean _and_1 = false;
    OclExpression _expression = invariant.getExpression();
    if (!(_expression instanceof OclImplies)) {
      _and_1 = false;
    } else {
      OclExpression _expression_1 = invariant.getExpression();
      OclExpression _left = ((OclImplies) _expression_1).getLeft();
      boolean _matchSizeEq = this.matchSizeEq(_left, 1);
      _and_1 = _matchSizeEq;
    }
    if (!_and_1) {
      _and = false;
    } else {
      OclExpression _expression_2 = invariant.getExpression();
      OclExpression _right = ((OclImplies) _expression_2).getRight();
      boolean _matchFixedValue = this.matchFixedValue(_right);
      _and = _matchFixedValue;
    }
    return _and;
  }
  
  /**
   * Statement 9
   * ( xor
   * ( =
   * ( ->                                         or (  ->
   * reference A                                      reference A
   * size()                                          isNotEmpty()
   * )                                               )
   * 1
   * )
   * ( =
   * ( ->
   * reference B
   * size()
   * )
   * 1
   * )
   * )
   * 
   * Or the above within the body of a forAll expression.
   * 
   * Precheck: two implies statements have been stated to exclude the other reference if the reference is present.
   * Action:
   * 1) change cardinality of the reference:
   * If the cardinality was 0..*, change the cardinality to 1..*.
   * If the cardinality was 0..1, change the cardinality to 1..1.
   * otherwise no change.
   * 2) this construct represents a choice
   */
  public boolean matchMandatoryChoice(final OclInvariant invariant) {
    boolean _or = false;
    OclExpression _expression = invariant.getExpression();
    boolean _matchMandatoryChoice = this.matchMandatoryChoice(_expression);
    if (_matchMandatoryChoice) {
      _or = true;
    } else {
      boolean _and = false;
      OclExpression _expression_1 = invariant.getExpression();
      boolean _matchForAll = this.matchForAll(_expression_1);
      if (!_matchForAll) {
        _and = false;
      } else {
        OclExpression _expression_2 = invariant.getExpression();
        OclExpression _forAllBody = this.forAllBody(_expression_2);
        boolean _matchMandatoryChoice_1 = this.matchMandatoryChoice(_forAllBody);
        _and = _matchMandatoryChoice_1;
      }
      _or = _and;
    }
    return _or;
  }
  
  public boolean matchMandatoryChoice(final OclExpression expr) {
    boolean _and = false;
    boolean _and_1 = false;
    if (!(expr instanceof OclXor)) {
      _and_1 = false;
    } else {
      boolean _or = false;
      OclExpression _left = ((OclXor) expr).getLeft();
      boolean _matchMandatoryChoice = this.matchMandatoryChoice(_left);
      if (_matchMandatoryChoice) {
        _or = true;
      } else {
        OclExpression _left_1 = ((OclXor) expr).getLeft();
        boolean _matchMandatoryReference = this.matchMandatoryReference(_left_1);
        _or = _matchMandatoryReference;
      }
      _and_1 = _or;
    }
    if (!_and_1) {
      _and = false;
    } else {
      boolean _or_1 = false;
      OclExpression _right = ((OclXor) expr).getRight();
      boolean _matchMandatoryChoice_1 = this.matchMandatoryChoice(_right);
      if (_matchMandatoryChoice_1) {
        _or_1 = true;
      } else {
        OclExpression _right_1 = ((OclXor) expr).getRight();
        boolean _matchMandatoryReference_1 = this.matchMandatoryReference(_right_1);
        _or_1 = _matchMandatoryReference_1;
      }
      _and = _or_1;
    }
    return _and;
  }
  
  public boolean matchMandatoryReference(final OclExpression expr) {
    boolean _or = false;
    boolean _matchSizeEq = this.matchSizeEq(expr, 1);
    if (_matchSizeEq) {
      _or = true;
    } else {
      boolean _matchNotEmpty = this.matchNotEmpty(expr);
      _or = _matchNotEmpty;
    }
    return _or;
  }
  
  /**
   * Matches ref->size() <= 1
   */
  public boolean matchSizeLE1(final OclExpression expr) {
    boolean _and = false;
    if (!(((((expr instanceof OclLessOrEqual) && (((OclLessOrEqual) expr).getLeft() instanceof OclArrow)) && (((OclArrow) ((OclLessOrEqual) expr).getLeft()).getLeft() instanceof OclReference)) && (((OclArrow) ((OclLessOrEqual) expr).getLeft()).getRight() instanceof OclSize)) && (((OclLessOrEqual) expr).getRight() instanceof OclIntegerLiteral))) {
      _and = false;
    } else {
      OclExpression _right = ((OclLessOrEqual) expr).getRight();
      int _value = ((OclIntegerLiteral) _right).getValue();
      boolean _equals = (_value == 1);
      _and = _equals;
    }
    return _and;
  }
  
  /**
   * Matches ref->size() = 1
   */
  public boolean matchSizeEq(final OclExpression expr, final int value) {
    boolean _and = false;
    if (!(((((expr instanceof OclEqual) && (((OclEqual) expr).getLeft() instanceof OclArrow)) && (((OclArrow) ((OclEqual) expr).getLeft()).getLeft() instanceof OclReference)) && (((OclArrow) ((OclEqual) expr).getLeft()).getRight() instanceof OclSize)) && (((OclEqual) expr).getRight() instanceof OclIntegerLiteral))) {
      _and = false;
    } else {
      OclExpression _right = ((OclEqual) expr).getRight();
      int _value = ((OclIntegerLiteral) _right).getValue();
      boolean _equals = (_value == value);
      _and = _equals;
    }
    return _and;
  }
  
  /**
   * Matches ref->isEmpty()
   */
  public boolean matchIsEmpty(final OclExpression expr) {
    boolean _and = false;
    if (!((expr instanceof OclArrow) && (((OclArrow) expr).getLeft() instanceof OclReference))) {
      _and = false;
    } else {
      OclFunctionCall _right = ((OclArrow) expr).getRight();
      _and = (_right instanceof OclIsEmpty);
    }
    return _and;
  }
  
  /**
   * Matches ref->notEmpty()
   */
  public boolean matchNotEmpty(final OclExpression expr) {
    boolean _and = false;
    if (!((expr instanceof OclArrow) && (((OclArrow) expr).getLeft() instanceof OclReference))) {
      _and = false;
    } else {
      OclFunctionCall _right = ((OclArrow) expr).getRight();
      _and = (_right instanceof OclNotEmpty);
    }
    return _and;
  }
  
  public boolean matchForAll(final OclExpression expr) {
    boolean _and = false;
    if (!((expr instanceof OclArrow) && (((OclArrow) expr).getLeft() instanceof OclReference))) {
      _and = false;
    } else {
      OclFunctionCall _right = ((OclArrow) expr).getRight();
      _and = (_right instanceof OclForAll);
    }
    return _and;
  }
  
  public OclExpression forAllBody(final OclExpression expr) {
    OclFunctionCall _right = ((OclArrow) expr).getRight();
    return ((OclForAll) _right).getBody();
  }
  
  public OclExpression forAllContext(final OclExpression expr) {
    return ((OclArrow) expr).getLeft();
  }
}
