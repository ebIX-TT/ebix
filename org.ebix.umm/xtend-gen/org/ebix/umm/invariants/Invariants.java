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
package org.ebix.umm.invariants;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import com.google.inject.Inject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.ebix.umm.umm.ABIE;
import org.ebix.umm.umm.ABIEProperty;
import org.ebix.umm.umm.BBIE;
import org.ebix.umm.umm.BIELibrary;
import org.ebix.umm.umm.Constraint;
import org.ebix.umm.umm.ConstraintKind;
import org.ebix.umm.umm.Content;
import org.ebix.umm.umm.MA;
import org.ebix.umm.umm.MultiplicityKind;
import org.ebix.umm.umm.OclBooleanFalse;
import org.ebix.umm.umm.OclBooleanTrue;
import org.ebix.umm.umm.OclEnumerationLiteral;
import org.ebix.umm.umm.OclExpression;
import org.ebix.umm.umm.OclImplies;
import org.ebix.umm.umm.OclIntegerLiteral;
import org.ebix.umm.umm.OclInvariant;
import org.ebix.umm.umm.OclLiteral;
import org.ebix.umm.umm.OclPathFeatureHead;
import org.ebix.umm.umm.OclPathSelfHead;
import org.ebix.umm.umm.OclPathTail;
import org.ebix.umm.umm.OclRef;
import org.ebix.umm.umm.OclReference;
import org.ebix.umm.umm.OclStringLiteral;
import org.ebix.umm.umm.Supplement;
import org.ebix.umm.umm.TC_Constraint;
import org.ebix.umm.validation.ocl.UmmOclValidator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class Invariants {
  @Inject
  private UmmOclValidator oclValidator;
  
  public void applyInvariants(final BIELibrary library) {
    EList<ABIE> _abies = library.getAbies();
    for (final ABIE abie : _abies) {
      this.applyInvariants(abie);
    }
  }
  
  public void applyInvariants(final ABIE abie) {
    EList<Constraint> _constraints = abie.getConstraints();
    final Function1<Constraint, Boolean> _function = (Constraint c) -> {
      EList<TC_Constraint> _type = c.getType();
      final Function1<TC_Constraint, Boolean> _function_1 = (TC_Constraint t) -> {
        ConstraintKind _kind = t.getKind();
        return Boolean.valueOf(Objects.equal(_kind, ConstraintKind.DEPENDENCY));
      };
      return Boolean.valueOf(IterableExtensions.<TC_Constraint>exists(_type, _function_1));
    };
    Iterable<Constraint> _filter = IterableExtensions.<Constraint>filter(_constraints, _function);
    for (final Constraint constraint : _filter) {
      EList<OclInvariant> _invariants = constraint.getInvariants();
      for (final OclInvariant invariant : _invariants) {
        this.apply(invariant);
      }
    }
  }
  
  public void applyInvariantsFor(final MA ma, final ConstraintKind kind, final String listIdentifier) {
    EList<Constraint> _constraints = ma.getConstraints();
    final Function1<Constraint, Boolean> _function = (Constraint c) -> {
      EList<TC_Constraint> _type = c.getType();
      final Function1<TC_Constraint, Boolean> _function_1 = (TC_Constraint t) -> {
        boolean _and = false;
        ConstraintKind _kind = t.getKind();
        boolean _equals = Objects.equal(_kind, kind);
        if (!_equals) {
          _and = false;
        } else {
          String _listIdentifier = t.getListIdentifier();
          boolean _equals_1 = Objects.equal(_listIdentifier, listIdentifier);
          _and = _equals_1;
        }
        return Boolean.valueOf(_and);
      };
      return Boolean.valueOf(IterableExtensions.<TC_Constraint>exists(_type, _function_1));
    };
    Iterable<Constraint> _filter = IterableExtensions.<Constraint>filter(_constraints, _function);
    for (final Constraint c : _filter) {
      EList<OclInvariant> _invariants = c.getInvariants();
      for (final OclInvariant i : _invariants) {
        boolean _matchRemoveReference = this.oclValidator.matchRemoveReference(i);
        if (_matchRemoveReference) {
          OclRef _ref = this.getRef(i);
          EcoreUtil.delete(_ref);
        }
      }
    }
    EList<Constraint> _constraints_1 = ma.getConstraints();
    final Function1<Constraint, Boolean> _function_1 = (Constraint c_1) -> {
      EList<TC_Constraint> _type = c_1.getType();
      final Function1<TC_Constraint, Boolean> _function_2 = (TC_Constraint t) -> {
        boolean _and = false;
        ConstraintKind _kind = t.getKind();
        boolean _equals = Objects.equal(_kind, kind);
        if (!_equals) {
          _and = false;
        } else {
          String _listIdentifier = t.getListIdentifier();
          boolean _equals_1 = Objects.equal(_listIdentifier, listIdentifier);
          _and = _equals_1;
        }
        return Boolean.valueOf(_and);
      };
      return Boolean.valueOf(IterableExtensions.<TC_Constraint>exists(_type, _function_2));
    };
    Iterable<Constraint> _filter_1 = IterableExtensions.<Constraint>filter(_constraints_1, _function_1);
    for (final Constraint c_1 : _filter_1) {
      EList<OclInvariant> _invariants_1 = c_1.getInvariants();
      for (final OclInvariant i_1 : _invariants_1) {
        this.apply(i_1);
      }
    }
  }
  
  public void apply(final OclInvariant invariant) {
    boolean _matchMandatoryReference = this.oclValidator.matchMandatoryReference(invariant);
    if (_matchMandatoryReference) {
      this.performMandatoryReference(invariant);
    }
    boolean _matchSingleReference = this.oclValidator.matchSingleReference(invariant);
    if (_matchSingleReference) {
      this.performSingleReference(invariant);
    }
    boolean _matchReduceCodelistEntries = this.oclValidator.matchReduceCodelistEntries(invariant);
    if (_matchReduceCodelistEntries) {
      this.performReduceCodelistEntries(invariant);
    }
    boolean _matchFixedValue = this.oclValidator.matchFixedValue(invariant);
    if (_matchFixedValue) {
      this.performFixedValue(invariant);
    }
    boolean _matchChoiceA = this.oclValidator.matchChoiceA(invariant);
    if (_matchChoiceA) {
      this.performChoice(invariant);
    }
    boolean _matchMandatoryChoice = this.oclValidator.matchMandatoryChoice(invariant);
    if (_matchMandatoryChoice) {
      this.performMandatoryChoice(invariant);
    }
    boolean _matchChoiceFixedValue = this.oclValidator.matchChoiceFixedValue(invariant);
    if (_matchChoiceFixedValue) {
      this.performChoiceFixedValue(invariant);
    }
  }
  
  public void performMandatoryReference(final OclInvariant invariant) {
    OclRef _ref = this.getRef(invariant);
    OclRef _ref_1 = this.getRef(invariant);
    MultiplicityKind _multiplicity = _ref_1.getMultiplicity();
    MultiplicityKind _newKind = this.newKind(_multiplicity);
    _ref.setMultiplicity(_newKind);
  }
  
  public MultiplicityKind newKind(final MultiplicityKind m) {
    MultiplicityKind _switchResult = null;
    if (m != null) {
      switch (m) {
        case ONE:
          _switchResult = MultiplicityKind.ONE;
          break;
        case OPTIONAL:
          _switchResult = MultiplicityKind.ONE;
          break;
        case ZERO_OR_MORE:
          _switchResult = MultiplicityKind.ONE_OR_MORE;
          break;
        case ONE_OR_MORE:
          _switchResult = MultiplicityKind.ONE_OR_MORE;
          break;
        default:
          break;
      }
    }
    return _switchResult;
  }
  
  public void performSingleReference(final OclInvariant invariant) {
    OclRef _ref = this.getRef(invariant);
    OclRef _ref_1 = this.getRef(invariant);
    MultiplicityKind _multiplicity = _ref_1.getMultiplicity();
    MultiplicityKind _newKind2 = this.newKind2(_multiplicity);
    _ref.setMultiplicity(_newKind2);
  }
  
  public MultiplicityKind newKind2(final MultiplicityKind m) {
    MultiplicityKind _switchResult = null;
    if (m != null) {
      switch (m) {
        case ONE:
          _switchResult = MultiplicityKind.ONE;
          break;
        case OPTIONAL:
          _switchResult = MultiplicityKind.OPTIONAL;
          break;
        case ZERO_OR_MORE:
          _switchResult = MultiplicityKind.OPTIONAL;
          break;
        case ONE_OR_MORE:
          _switchResult = MultiplicityKind.ONE;
          break;
        default:
          break;
      }
    }
    return _switchResult;
  }
  
  public void performReduceCodelistEntries(final OclInvariant invariant) {
    OclRef _ref = this.getRef(invariant);
    this.addRestrictions(_ref, invariant);
  }
  
  protected void _addRestrictions(final BBIE bbie, final OclInvariant invariant) {
    List<String> literals = this.getLiteralNames(invariant);
    EList<String> _restriction = bbie.getRestriction();
    literals.removeAll(_restriction);
    EList<String> _restriction_1 = bbie.getRestriction();
    _restriction_1.addAll(literals);
  }
  
  protected void _addRestrictions(final Content content, final OclInvariant invariant) {
    OclRef _lastRefButOne = this.lastRefButOne(invariant);
    this.addRestrictions(_lastRefButOne, invariant);
  }
  
  protected void _addRestrictions(final Supplement supplement, final OclInvariant invariant) {
    List<String> literals = this.getLiteralNames(invariant);
    EList<String> _restriction = supplement.getRestriction();
    literals.removeAll(_restriction);
    EList<String> _restriction_1 = supplement.getRestriction();
    _restriction_1.addAll(literals);
  }
  
  public List<String> getLiteralNames(final OclInvariant invariant) {
    List<String> names = new ArrayList<String>();
    OclExpression _expression = invariant.getExpression();
    TreeIterator<EObject> _eAllContents = _expression.eAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_eAllContents);
    for (final EObject obj : _iterable) {
      if ((obj instanceof OclEnumerationLiteral)) {
        String _literalName = this.getLiteralName(((OclEnumerationLiteral) obj));
        names.add(_literalName);
      }
    }
    return names;
  }
  
  public String getLiteralName(final OclEnumerationLiteral literal) {
    String _value = literal.getValue();
    String[] _split = _value.split("::");
    return _split[1];
  }
  
  public void performFixedValue(final OclInvariant invariant) {
    List<OclLiteral> _fixedValue = this.getFixedValue(invariant);
    for (final OclLiteral oclLiteral : _fixedValue) {
      OclRef _ref = this.getRef(invariant);
      String _value = this.getValue(oclLiteral);
      this.setFixedValue(_ref, invariant, _value);
    }
  }
  
  protected void _setFixedValue(final OclRef ref, final OclInvariant invariant, final String fixedValue) {
  }
  
  protected void _setFixedValue(final BBIE bbie, final OclInvariant invariant, final String fixedValue) {
    String _name = bbie.getName();
    String _plus = ("setFixedValue on: " + _name);
    String _plus_1 = (_plus + " (value = ");
    String _plus_2 = (_plus_1 + fixedValue);
    String _plus_3 = (_plus_2 + ")");
    InputOutput.<String>println(_plus_3);
    String _name_1 = bbie.getName();
    boolean _equals = Objects.equal("Resolution_Duration", _name_1);
    if (_equals) {
      EList<String> _restriction = bbie.getRestriction();
      boolean _contains = _restriction.contains(fixedValue);
      boolean _not = (!_contains);
      if (_not) {
        EList<String> _restriction_1 = bbie.getRestriction();
        _restriction_1.add(fixedValue);
      }
    } else {
      bbie.setFixedValue(fixedValue);
    }
  }
  
  protected void _setFixedValue(final Content content, final OclInvariant invariant, final String fixedValue) {
    OclRef _lastRefButOne = this.lastRefButOne(invariant);
    this.setFixedValue(_lastRefButOne, invariant, fixedValue);
  }
  
  protected void _setFixedValue(final Supplement supplement, final OclInvariant invariant, final String fixedValue) {
    supplement.setFixedValue(fixedValue);
  }
  
  public List<OclLiteral> getFixedValue(final OclInvariant invariant) {
    OclExpression _expression = invariant.getExpression();
    TreeIterator<EObject> _eAllContents = _expression.eAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_eAllContents);
    Iterable<OclLiteral> _filter = Iterables.<OclLiteral>filter(_iterable, OclLiteral.class);
    return IterableExtensions.<OclLiteral>toList(_filter);
  }
  
  protected String _getValue(final OclLiteral literal) {
    return "unknown";
  }
  
  protected String _getValue(final OclIntegerLiteral literal) {
    int _value = literal.getValue();
    return Integer.valueOf(_value).toString();
  }
  
  protected String _getValue(final OclStringLiteral literal) {
    String _value = literal.getValue();
    return _value.toString();
  }
  
  protected String _getValue(final OclBooleanFalse literal) {
    return "false";
  }
  
  protected String _getValue(final OclBooleanTrue literal) {
    return "true";
  }
  
  public void performChoice(final OclInvariant invariant) {
    ABIEProperty _selfImplies = this.selfImplies(invariant);
    ABIE _abie = this.abie(_selfImplies);
    EList<ABIEProperty> _properties = _abie.getProperties();
    final Function1<ABIEProperty, Boolean> _function = (ABIEProperty p) -> {
      EList<ABIEProperty> _or = p.getOr();
      ABIEProperty _selfImplies_1 = this.selfImplies(invariant);
      return Boolean.valueOf(_or.contains(_selfImplies_1));
    };
    boolean _exists = IterableExtensions.<ABIEProperty>exists(_properties, _function);
    boolean _not = (!_exists);
    if (_not) {
      OclImplies _implies = this.getImplies(invariant);
      OclExpression _right = _implies.getRight();
      TreeIterator<EObject> _eAllContents = _right.eAllContents();
      Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_eAllContents);
      Iterable<OclReference> _filter = Iterables.<OclReference>filter(_iterable, OclReference.class);
      for (final OclReference r : _filter) {
        ABIEProperty _selfImplies_1 = this.selfImplies(invariant);
        EList<ABIEProperty> _or = _selfImplies_1.getOr();
        OclRef _ref = this.ref(r);
        _or.add(((ABIEProperty) _ref));
      }
    }
  }
  
  public ABIEProperty selfImplies(final OclInvariant invariant) {
    OclImplies _implies = this.getImplies(invariant);
    OclExpression _left = _implies.getLeft();
    OclRef _firstRef = this.firstRef(_left);
    return ((ABIEProperty) _firstRef);
  }
  
  public OclImplies getImplies(final OclInvariant invariant) {
    OclImplies _xifexpression = null;
    OclExpression _expression = invariant.getExpression();
    boolean _matchForAll = this.oclValidator.matchForAll(_expression);
    if (_matchForAll) {
      OclExpression _expression_1 = invariant.getExpression();
      OclExpression _forAllBody = this.oclValidator.forAllBody(_expression_1);
      _xifexpression = ((OclImplies) _forAllBody);
    } else {
      OclExpression _expression_2 = invariant.getExpression();
      _xifexpression = ((OclImplies) _expression_2);
    }
    return _xifexpression;
  }
  
  public ABIE abie(final ABIEProperty p) {
    EObject _eContainer = p.eContainer();
    return ((ABIE) _eContainer);
  }
  
  public void performMandatoryChoice(final OclInvariant invariant) {
    List<ABIEProperty> _referencesInMandatoryChoice = this.referencesInMandatoryChoice(invariant);
    for (final ABIEProperty r : _referencesInMandatoryChoice) {
      MultiplicityKind _multiplicity = r.getMultiplicity();
      MultiplicityKind _newKind = this.newKind(_multiplicity);
      r.setMultiplicity(_newKind);
    }
    List<ABIEProperty> _referencesInMandatoryChoice_1 = this.referencesInMandatoryChoice(invariant);
    ABIEProperty _head = IterableExtensions.<ABIEProperty>head(_referencesInMandatoryChoice_1);
    EList<ABIEProperty> _or = _head.getOr();
    List<ABIEProperty> _referencesInMandatoryChoice_2 = this.referencesInMandatoryChoice(invariant);
    Iterable<ABIEProperty> _tail = IterableExtensions.<ABIEProperty>tail(_referencesInMandatoryChoice_2);
    Iterables.<ABIEProperty>addAll(_or, _tail);
  }
  
  public List<ABIEProperty> referencesInMandatoryChoice(final OclInvariant invariant) {
    OclExpression _expression = invariant.getExpression();
    boolean _matchForAll = this.oclValidator.matchForAll(_expression);
    if (_matchForAll) {
      OclExpression _expression_1 = invariant.getExpression();
      OclExpression _forAllBody = this.oclValidator.forAllBody(_expression_1);
      TreeIterator<EObject> _eAllContents = _forAllBody.eAllContents();
      Iterator<OclReference> _filter = Iterators.<OclReference>filter(_eAllContents, OclReference.class);
      List<OclReference> _list = IteratorExtensions.<OclReference>toList(_filter);
      return this.abieProperties(_list);
    } else {
      OclExpression _expression_2 = invariant.getExpression();
      TreeIterator<EObject> _eAllContents_1 = _expression_2.eAllContents();
      Iterator<OclReference> _filter_1 = Iterators.<OclReference>filter(_eAllContents_1, OclReference.class);
      List<OclReference> _list_1 = IteratorExtensions.<OclReference>toList(_filter_1);
      return this.abieProperties(_list_1);
    }
  }
  
  public List<ABIEProperty> abieProperties(final List<OclReference> oclReferences) {
    ArrayList<ABIEProperty> list = new ArrayList<ABIEProperty>();
    for (final OclReference r : oclReferences) {
      OclRef _ref = this.ref(r);
      list.add(((ABIEProperty) _ref));
    }
    return list;
  }
  
  public void performChoiceFixedValue(final OclInvariant invariant) {
    OclExpression _expression = invariant.getExpression();
    OclExpression _right = ((OclImplies) _expression).getRight();
    OclRef _firstRef = this.firstRef(_right);
    OclExpression _expression_1 = invariant.getExpression();
    OclExpression _right_1 = ((OclImplies) _expression_1).getRight();
    TreeIterator<EObject> _eAllContents = _right_1.eAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_eAllContents);
    Iterable<OclLiteral> _filter = Iterables.<OclLiteral>filter(_iterable, OclLiteral.class);
    OclLiteral _head = IterableExtensions.<OclLiteral>head(_filter);
    String _value = this.getValue(_head);
    this.setFixedValue(_firstRef, invariant, _value);
  }
  
  public OclRef getRef(final OclInvariant invariant) {
    OclRef _xifexpression = null;
    OclExpression _expression = invariant.getExpression();
    boolean _matchForAll = this.oclValidator.matchForAll(_expression);
    if (_matchForAll) {
      OclExpression _expression_1 = invariant.getExpression();
      OclExpression _forAllBody = this.oclValidator.forAllBody(_expression_1);
      _xifexpression = this.firstRef(_forAllBody);
    } else {
      OclExpression _expression_2 = invariant.getExpression();
      _xifexpression = this.firstRef(_expression_2);
    }
    return _xifexpression;
  }
  
  public OclRef firstRef(final OclExpression expr) {
    OclRef _xifexpression = null;
    if ((expr instanceof OclReference)) {
      _xifexpression = this.ref(((OclReference) expr));
    } else {
      TreeIterator<EObject> _eAllContents = expr.eAllContents();
      Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_eAllContents);
      Iterable<OclReference> _filter = Iterables.<OclReference>filter(_iterable, OclReference.class);
      OclReference _head = IterableExtensions.<OclReference>head(_filter);
      _xifexpression = this.ref(_head);
    }
    return _xifexpression;
  }
  
  protected OclRef _ref(final OclPathSelfHead sh) {
    OclPathTail _path = sh.getPath();
    OclPathTail _last = this.last(_path);
    return _last.getFeature();
  }
  
  protected OclRef _ref(final OclPathFeatureHead fh) {
    OclRef _xifexpression = null;
    OclPathTail _tail = fh.getTail();
    boolean _notEquals = (!Objects.equal(_tail, null));
    if (_notEquals) {
      OclPathTail _tail_1 = fh.getTail();
      OclPathTail _last = this.last(_tail_1);
      _xifexpression = _last.getFeature();
    } else {
      _xifexpression = fh.getFeature();
    }
    return _xifexpression;
  }
  
  public OclPathTail last(final OclPathTail t) {
    OclPathTail _xifexpression = null;
    OclPathTail _tail = t.getTail();
    boolean _equals = Objects.equal(_tail, null);
    if (_equals) {
      _xifexpression = t;
    } else {
      OclPathTail _tail_1 = t.getTail();
      _xifexpression = this.last(_tail_1);
    }
    return _xifexpression;
  }
  
  public OclRef lastRefButOne(final OclInvariant invariant) {
    OclRef _xifexpression = null;
    OclExpression _expression = invariant.getExpression();
    boolean _matchForAll = this.oclValidator.matchForAll(_expression);
    if (_matchForAll) {
      OclRef _xifexpression_1 = null;
      OclExpression _expression_1 = invariant.getExpression();
      OclExpression _forAllBody = this.oclValidator.forAllBody(_expression_1);
      TreeIterator<EObject> _eAllContents = _forAllBody.eAllContents();
      Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_eAllContents);
      Iterable<OclReference> _filter = Iterables.<OclReference>filter(_iterable, OclReference.class);
      OclReference _head = IterableExtensions.<OclReference>head(_filter);
      List<OclRef> _refToList = this.refToList(_head);
      int _size = _refToList.size();
      boolean _equals = (_size == 1);
      if (_equals) {
        OclExpression _expression_2 = invariant.getExpression();
        OclExpression _forAllContext = this.oclValidator.forAllContext(_expression_2);
        _xifexpression_1 = this.firstRef(_forAllContext);
      } else {
        OclExpression _expression_3 = invariant.getExpression();
        OclExpression _forAllBody_1 = this.oclValidator.forAllBody(_expression_3);
        TreeIterator<EObject> _eAllContents_1 = _forAllBody_1.eAllContents();
        Iterable<EObject> _iterable_1 = IteratorExtensions.<EObject>toIterable(_eAllContents_1);
        Iterable<OclReference> _filter_1 = Iterables.<OclReference>filter(_iterable_1, OclReference.class);
        OclReference _head_1 = IterableExtensions.<OclReference>head(_filter_1);
        List<OclRef> _refToList_1 = this.refToList(_head_1);
        _xifexpression_1 = this.lastButOne(_refToList_1);
      }
      _xifexpression = _xifexpression_1;
    } else {
      OclExpression _expression_4 = invariant.getExpression();
      TreeIterator<EObject> _eAllContents_2 = _expression_4.eAllContents();
      Iterable<EObject> _iterable_2 = IteratorExtensions.<EObject>toIterable(_eAllContents_2);
      Iterable<OclReference> _filter_2 = Iterables.<OclReference>filter(_iterable_2, OclReference.class);
      OclReference _head_2 = IterableExtensions.<OclReference>head(_filter_2);
      List<OclRef> _refToList_2 = this.refToList(_head_2);
      _xifexpression = this.lastButOne(_refToList_2);
    }
    return _xifexpression;
  }
  
  public OclRef lastButOne(final List<OclRef> list) {
    int _size = list.size();
    int _minus = (_size - 2);
    return list.get(_minus);
  }
  
  protected List<OclRef> _refToList(final OclPathSelfHead sh) {
    OclPathTail _path = sh.getPath();
    return this.refToList(_path);
  }
  
  protected List<OclRef> _refToList(final OclPathFeatureHead fh) {
    ArrayList<OclRef> list = new ArrayList<OclRef>();
    OclRef _feature = fh.getFeature();
    list.add(_feature);
    OclPathTail _tail = fh.getTail();
    boolean _notEquals = (!Objects.equal(_tail, null));
    if (_notEquals) {
      OclPathTail _tail_1 = fh.getTail();
      List<OclRef> _refToList = this.refToList(_tail_1);
      list.addAll(_refToList);
    }
    return list;
  }
  
  protected List<OclRef> _refToList(final OclPathTail t) {
    ArrayList<OclRef> list = new ArrayList<OclRef>();
    OclRef _feature = t.getFeature();
    list.add(_feature);
    OclPathTail _tail = t.getTail();
    boolean _notEquals = (!Objects.equal(_tail, null));
    if (_notEquals) {
      OclPathTail _tail_1 = t.getTail();
      List<OclRef> _refToList = this.refToList(_tail_1);
      list.addAll(_refToList);
    }
    return list;
  }
  
  public void addRestrictions(final OclRef bbie, final OclInvariant invariant) {
    if (bbie instanceof BBIE) {
      _addRestrictions((BBIE)bbie, invariant);
      return;
    } else if (bbie instanceof Content) {
      _addRestrictions((Content)bbie, invariant);
      return;
    } else if (bbie instanceof Supplement) {
      _addRestrictions((Supplement)bbie, invariant);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(bbie, invariant).toString());
    }
  }
  
  public void setFixedValue(final OclRef bbie, final OclInvariant invariant, final String fixedValue) {
    if (bbie instanceof BBIE) {
      _setFixedValue((BBIE)bbie, invariant, fixedValue);
      return;
    } else if (bbie instanceof Content) {
      _setFixedValue((Content)bbie, invariant, fixedValue);
      return;
    } else if (bbie instanceof Supplement) {
      _setFixedValue((Supplement)bbie, invariant, fixedValue);
      return;
    } else if (bbie != null) {
      _setFixedValue(bbie, invariant, fixedValue);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(bbie, invariant, fixedValue).toString());
    }
  }
  
  public String getValue(final OclLiteral literal) {
    if (literal instanceof OclBooleanFalse) {
      return _getValue((OclBooleanFalse)literal);
    } else if (literal instanceof OclBooleanTrue) {
      return _getValue((OclBooleanTrue)literal);
    } else if (literal instanceof OclIntegerLiteral) {
      return _getValue((OclIntegerLiteral)literal);
    } else if (literal instanceof OclStringLiteral) {
      return _getValue((OclStringLiteral)literal);
    } else if (literal != null) {
      return _getValue(literal);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(literal).toString());
    }
  }
  
  public OclRef ref(final OclReference fh) {
    if (fh instanceof OclPathFeatureHead) {
      return _ref((OclPathFeatureHead)fh);
    } else if (fh instanceof OclPathSelfHead) {
      return _ref((OclPathSelfHead)fh);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(fh).toString());
    }
  }
  
  public List<OclRef> refToList(final EObject fh) {
    if (fh instanceof OclPathFeatureHead) {
      return _refToList((OclPathFeatureHead)fh);
    } else if (fh instanceof OclPathSelfHead) {
      return _refToList((OclPathSelfHead)fh);
    } else if (fh instanceof OclPathTail) {
      return _refToList((OclPathTail)fh);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(fh).toString());
    }
  }
}
