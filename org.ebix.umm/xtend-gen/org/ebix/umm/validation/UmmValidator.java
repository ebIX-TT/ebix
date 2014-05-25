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
package org.ebix.umm.validation;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import org.ebix.umm.umm.Assembled;
import org.ebix.umm.umm.CodelistEntry;
import org.ebix.umm.umm.OclEnumerationLiteral;
import org.ebix.umm.umm.OclInvariant;
import org.ebix.umm.umm.Original;
import org.ebix.umm.umm.Subset;
import org.ebix.umm.umm.UmmPackage;
import org.ebix.umm.validation.AbstractUmmValidator;
import org.ebix.umm.validation.ocl.UmmOclValidator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IGlobalScopeProvider;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.validation.Check;

/**
 * Custom validation rules.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
@SuppressWarnings("all")
public class UmmValidator extends AbstractUmmValidator {
  @Inject
  private IGlobalScopeProvider globalScopeProvider;
  
  @Inject
  private IQualifiedNameConverter qualifiedNameConverter;
  
  @Inject
  private UmmOclValidator oclValidator;
  
  @Check
  public void checkOclEnumerationLiteral(final OclEnumerationLiteral oclLiteral) {
    String _value = oclLiteral.getValue();
    final String[] part = _value.split("::");
    final String assembledName = part[0];
    final String entryName = part[1];
    final Assembled assembled = this.findAssembled(oclLiteral, assembledName);
    boolean _notEquals = (!Objects.equal(assembled, null));
    if (_notEquals) {
      boolean present = false;
      EList<Original> _originals = assembled.getOriginals();
      for (final Original original : _originals) {
        EList<CodelistEntry> _codes = original.getCodes();
        for (final CodelistEntry entry : _codes) {
          String _name = entry.getName();
          boolean _equals = _name.equals(entryName);
          if (_equals) {
            present = true;
          }
        }
      }
      EList<Subset> _subsets = assembled.getSubsets();
      for (final Subset subset : _subsets) {
        EList<CodelistEntry> _codes_1 = subset.getCodes();
        for (final CodelistEntry entry_1 : _codes_1) {
          String _name_1 = entry_1.getName();
          boolean _equals_1 = _name_1.equals(entryName);
          if (_equals_1) {
            present = true;
          }
        }
      }
      if ((!present)) {
        this.warning("Codelist entry does not exist.", UmmPackage.Literals.OCL_ENUMERATION_LITERAL__VALUE);
      }
    } else {
      this.warning("Assembled does not exist.", UmmPackage.Literals.OCL_ENUMERATION_LITERAL__VALUE);
    }
  }
  
  public Assembled findAssembled(final OclEnumerationLiteral oclLiteral, final String name) {
    final EReference eRef = EcoreFactory.eINSTANCE.createEReference();
    EClass _assembled = UmmPackage.eINSTANCE.getAssembled();
    eRef.setEType(_assembled);
    Resource _eResource = oclLiteral.eResource();
    final IScope scope = this.globalScopeProvider.getScope(_eResource, eRef, null);
    final QualifiedName qn = this.qualifiedNameConverter.toQualifiedName(name);
    IEObjectDescription _singleElement = scope.getSingleElement(qn);
    EObject _eObjectOrProxy = _singleElement.getEObjectOrProxy();
    Assembled result = ((Assembled) _eObjectOrProxy);
    boolean _eIsProxy = result.eIsProxy();
    if (_eIsProxy) {
      EObject _resolve = EcoreUtil.resolve(result, oclLiteral);
      result = ((Assembled) _resolve);
    }
    return result;
  }
  
  @Check
  public void checkRecognizedInvariant(final OclInvariant oclInvariant) {
    boolean _recognizeInvariant = this.oclValidator.recognizeInvariant(oclInvariant);
    boolean _not = (!_recognizeInvariant);
    if (_not) {
      this.warning("Invariant statement is not recognised; this statement will have no effect on the resulting artifacts.", 
        UmmPackage.Literals.OCL_INVARIANT__EXPRESSION);
    }
  }
  
  @Check
  public void checkMatchRemoveReference(final OclInvariant oclInvariant) {
    boolean _matchRemoveReference = this.oclValidator.matchRemoveReference(oclInvariant);
    if (_matchRemoveReference) {
      this.info("Invariant statement recognised as: remove reference.", 
        UmmPackage.Literals.OCL_INVARIANT__EXPRESSION);
    }
  }
  
  @Check
  public void checkMatchMandatorySingleReference(final OclInvariant oclInvariant) {
    boolean _matchMandatoryReference = this.oclValidator.matchMandatoryReference(oclInvariant);
    if (_matchMandatoryReference) {
      this.info("Invariant statement recognised as: mandatory reference", 
        UmmPackage.Literals.OCL_INVARIANT__EXPRESSION);
    }
  }
  
  @Check
  public void checkMatchSingleReference(final OclInvariant oclInvariant) {
    boolean _matchSingleReference = this.oclValidator.matchSingleReference(oclInvariant);
    if (_matchSingleReference) {
      this.info("Invariant statement recognised as: single reference", 
        UmmPackage.Literals.OCL_INVARIANT__EXPRESSION);
    }
  }
  
  @Check
  public void checkMatchFixedValue(final OclInvariant oclInvariant) {
    boolean _matchFixedValue = this.oclValidator.matchFixedValue(oclInvariant);
    if (_matchFixedValue) {
      this.info("Invariant statement recognised as: fixed value", 
        UmmPackage.Literals.OCL_INVARIANT__EXPRESSION);
    }
  }
  
  @Check
  public void checkMatchReduceCodelistEntries(final OclInvariant oclInvariant) {
    boolean _matchReduceCodelistEntries = this.oclValidator.matchReduceCodelistEntries(oclInvariant);
    if (_matchReduceCodelistEntries) {
      this.info("Invariant statement recognised as: reduce codelist entries", 
        UmmPackage.Literals.OCL_INVARIANT__EXPRESSION);
    }
  }
  
  @Check
  public void checkMatchChoice(final OclInvariant oclInvariant) {
    boolean _matchChoice = this.oclValidator.matchChoice(oclInvariant);
    if (_matchChoice) {
      this.info("Invariant statement recognised as: choice", 
        UmmPackage.Literals.OCL_INVARIANT__EXPRESSION);
    }
  }
  
  @Check
  public void checkMatchChoiceFixedValue(final OclInvariant oclInvariant) {
    boolean _matchChoiceFixedValue = this.oclValidator.matchChoiceFixedValue(oclInvariant);
    if (_matchChoiceFixedValue) {
      this.info("Invariant statement recognised as: fixed value in a choice construct", 
        UmmPackage.Literals.OCL_INVARIANT__EXPRESSION);
    }
  }
  
  @Check
  public void checkMatchMandatory(final OclInvariant oclInvariant) {
    boolean _matchMandatoryChoice = this.oclValidator.matchMandatoryChoice(oclInvariant);
    if (_matchMandatoryChoice) {
      this.info("Invariant statement recognised as: mandatory choice; one of the references is mandatory, and the others are empty", 
        UmmPackage.Literals.OCL_INVARIANT__EXPRESSION);
    }
  }
}
