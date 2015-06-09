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
package org.ebix.umm.scoping;

import com.google.common.base.Objects;
import org.ebix.umm.umm.ABIE;
import org.ebix.umm.umm.ABIEProperty;
import org.ebix.umm.umm.ASBIE;
import org.ebix.umm.umm.BBIE;
import org.ebix.umm.umm.BDT;
import org.ebix.umm.umm.BDTProperty;
import org.ebix.umm.umm.Constraint;
import org.ebix.umm.umm.ContextRef;
import org.ebix.umm.umm.MA;
import org.ebix.umm.umm.MAProperty;
import org.ebix.umm.umm.OclArrow;
import org.ebix.umm.umm.OclForAll;
import org.ebix.umm.umm.OclInvariant;
import org.ebix.umm.umm.OclPathFeatureHead;
import org.ebix.umm.umm.OclPathSelfHead;
import org.ebix.umm.umm.OclPathTail;
import org.ebix.umm.umm.OclRef;
import org.ebix.umm.umm.OclReference;
import org.ebix.umm.umm.OclValue;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#scoping
 * on how and when to use it
 */
@SuppressWarnings("all")
public class UmmScopeProvider extends AbstractDeclarativeScopeProvider {
  @Override
  public IScope getScope(final EObject context, final EReference reference) {
    return super.getScope(context, reference);
  }
  
  public IScope scope_OclPathFeatureHead_feature(final OclInvariant oclInvariant, final EReference eRef) {
    EObject _eContainer = oclInvariant.eContainer();
    final ContextRef context = ((Constraint) _eContainer).getContext();
    return this.getScope(context);
  }
  
  public IScope scope_OclPathFeatureHead_feature(final OclForAll forAll, final EReference eRef) {
    IScope scope = IScope.NULLSCOPE;
    EObject _eContainer = forAll.eContainer();
    final OclValue value = ((OclArrow) _eContainer).getLeft();
    if ((value instanceof OclReference)) {
      ContextRef _type = this.getType(((OclReference) value));
      IScope _scope = this.getScope(_type);
      scope = _scope;
    }
    return scope;
  }
  
  public IScope scope_OclPathTail_feature(final OclPathTail pathTail, final EReference eRef) {
    ContextRef _previousType = this.previousType(pathTail);
    return this.getScope(_previousType);
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
  public ContextRef previousType(final OclPathTail pathTail) {
    ContextRef context = null;
    final EObject container = pathTail.eContainer();
    if ((container instanceof OclPathFeatureHead)) {
      OclRef _feature = ((OclPathFeatureHead) container).getFeature();
      ContextRef _referedType = this.getReferedType(_feature);
      context = _referedType;
    } else {
      if ((container instanceof OclPathSelfHead)) {
        EObject container2 = ((OclPathSelfHead)container).eContainer();
        while ((!(container2 instanceof Constraint))) {
          EObject _eContainer = container2.eContainer();
          container2 = _eContainer;
        }
        final Constraint constraint = ((Constraint) container2);
        ContextRef _context = constraint.getContext();
        context = _context;
      } else {
        if ((container instanceof OclPathTail)) {
          final OclRef oclRef = ((OclPathTail) container).getFeature();
          ContextRef _referedType_1 = this.getReferedType(oclRef);
          context = _referedType_1;
        }
      }
    }
    return context;
  }
  
  public ContextRef getType(final OclReference oclReference) {
    ContextRef type = null;
    if ((oclReference instanceof OclPathFeatureHead)) {
      final OclPathFeatureHead head = ((OclPathFeatureHead) oclReference);
      OclPathTail _tail = head.getTail();
      boolean _notEquals = (!Objects.equal(_tail, null));
      if (_notEquals) {
        OclPathTail _tail_1 = head.getTail();
        ContextRef _resultType = this.resultType(_tail_1);
        type = _resultType;
      } else {
        OclRef _feature = head.getFeature();
        ContextRef _referedType = this.getReferedType(_feature);
        type = _referedType;
      }
    } else {
      if ((oclReference instanceof OclPathSelfHead)) {
        OclPathTail _path = ((OclPathSelfHead) oclReference).getPath();
        ContextRef _resultType_1 = this.resultType(_path);
        type = _resultType_1;
      }
    }
    return type;
  }
  
  /**
   * Looks up the end of the path and returns its type (of meta type
   * {@link Entity}).
   */
  public ContextRef resultType(final OclPathTail pathTail) {
    OclPathTail pathEnd = pathTail;
    while ((!Objects.equal(pathEnd.getTail(), null))) {
      OclPathTail _tail = pathEnd.getTail();
      pathEnd = _tail;
    }
    OclRef _feature = pathEnd.getFeature();
    return this.getReferedType(_feature);
  }
  
  public IScope getScope(final ContextRef type) {
    IScope result = IScope.NULLSCOPE;
    boolean _matched = false;
    if (!_matched) {
      if (type instanceof MA) {
        if (true) {
          _matched=true;
          EList<MAProperty> _properties = ((MA)type).getProperties();
          IScope _scopeFor = Scopes.scopeFor(_properties);
          result = _scopeFor;
        }
      }
    }
    if (!_matched) {
      if (type instanceof ABIE) {
        if (true) {
          _matched=true;
          EList<ABIEProperty> _properties = ((ABIE)type).getProperties();
          IScope _scopeFor = Scopes.scopeFor(_properties);
          result = _scopeFor;
        }
      }
    }
    if (!_matched) {
      if (type instanceof BDT) {
        if (true) {
          _matched=true;
          EList<BDTProperty> _properties = ((BDT)type).getProperties();
          IScope _scopeFor = Scopes.scopeFor(_properties);
          result = _scopeFor;
        }
      }
    }
    return result;
  }
  
  private ContextRef getReferedType(final OclRef oclRef) {
    ContextRef type = null;
    boolean _matched = false;
    if (!_matched) {
      if (oclRef instanceof MAProperty) {
        if (true) {
          _matched=true;
          ABIE _type = ((MAProperty)oclRef).getType();
          type = _type;
        }
      }
    }
    if (!_matched) {
      if (oclRef instanceof ASBIE) {
        if (true) {
          _matched=true;
          ABIE _type = ((ASBIE)oclRef).getType();
          type = _type;
        }
      }
    }
    if (!_matched) {
      if (oclRef instanceof BBIE) {
        if (true) {
          _matched=true;
          BDT _type = ((BBIE)oclRef).getType();
          type = _type;
        }
      }
    }
    return type;
  }
}
