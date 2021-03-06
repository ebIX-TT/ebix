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
import com.google.inject.Inject;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.ebix.umm.templates.xsd.MaExtension;
import org.ebix.umm.umm.ABIE;
import org.ebix.umm.umm.ABIEProperty;
import org.ebix.umm.umm.ASBIE;
import org.ebix.umm.umm.BBIE;
import org.ebix.umm.umm.BDT;
import org.ebix.umm.umm.BDTLibrary;
import org.ebix.umm.umm.BIELibrary;
import org.ebix.umm.umm.DocLibrary;
import org.ebix.umm.umm.Library;
import org.ebix.umm.umm.MA;
import org.ebix.umm.umm.MAProperty;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class Prune {
  @Inject
  @Extension
  private MaExtension maExtension;
  
  public MA clone(final MA ma) {
    DocLibrary _library = this.maExtension.library(ma);
    DocLibrary clonedDocLibrary = this.clone(_library);
    TreeIterator<EObject> _eAllContents = clonedDocLibrary.eAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_eAllContents);
    Iterable<MA> _filter = Iterables.<MA>filter(_iterable, MA.class);
    Set<MA> allClonedMa = IterableExtensions.<MA>toSet(_filter);
    final Function1<MA, Boolean> _function = (MA m) -> {
      String _name = m.getName();
      String _name_1 = ma.getName();
      return Boolean.valueOf(Objects.equal(_name, _name_1));
    };
    MA clonedMa = IterableExtensions.<MA>findFirst(allClonedMa, _function);
    allClonedMa.remove(clonedMa);
    for (final MA m : allClonedMa) {
      EcoreUtil.delete(m);
    }
    return clonedMa;
  }
  
  public DocLibrary clone(final DocLibrary docLibrary) {
    List<Library> model = new ArrayList<Library>();
    model.add(docLibrary);
    BIELibrary _bieLibrary = docLibrary.getBieLibrary();
    model.add(_bieLibrary);
    BDTLibrary _bdtLibrary = docLibrary.getBdtLibrary();
    model.add(_bdtLibrary);
    Collection<Library> clonedModel = EcoreUtil.<Library>copyAll(model);
    Iterable<DocLibrary> _filter = Iterables.<DocLibrary>filter(clonedModel, DocLibrary.class);
    return IterableExtensions.<DocLibrary>head(_filter);
  }
  
  public void purge(final MA ma) {
    this.purgeABIE(ma);
    this.purgeBDT(ma);
  }
  
  public void purgeABIE(final MA ma) {
    DocLibrary _library = this.maExtension.library(ma);
    BIELibrary _bieLibrary = _library.getBieLibrary();
    EList<ABIE> _abies = _bieLibrary.getAbies();
    Set<ABIE> abies = IterableExtensions.<ABIE>toSet(_abies);
    List<ABIE> _allReferedABIE = this.allReferedABIE(ma);
    abies.removeAll(_allReferedABIE);
    for (final ABIE abie : abies) {
      EcoreUtil.delete(abie);
    }
  }
  
  public void purgeBDT(final MA ma) {
    DocLibrary _library = this.maExtension.library(ma);
    BDTLibrary _bdtLibrary = _library.getBdtLibrary();
    EList<BDT> _bdts = _bdtLibrary.getBdts();
    Set<BDT> bdts = IterableExtensions.<BDT>toSet(_bdts);
    Set<BDT> _allReferedBDT = this.allReferedBDT(ma);
    bdts.removeAll(_allReferedBDT);
    for (final BDT bdt : bdts) {
      EcoreUtil.delete(bdt);
    }
  }
  
  public List<ABIE> allReferedABIE(final MA ma) {
    List<ABIE> collected = new ArrayList<ABIE>();
    Set<ABIE> _abies = this.abies(ma);
    for (final ABIE abie : _abies) {
      this.allReferedABIE(collected, abie);
    }
    return collected;
  }
  
  public void allReferedABIE(final List<ABIE> collected, final ABIE abie) {
    boolean _contains = collected.contains(abie);
    boolean _not = (!_contains);
    if (_not) {
      collected.add(abie);
      Set<ABIE> _abies = this.abies(abie);
      for (final ABIE abie2 : _abies) {
        this.allReferedABIE(collected, abie2);
      }
    }
  }
  
  public Set<ABIE> abies(final MA ma) {
    Set<ABIE> abies = new HashSet<ABIE>();
    EList<MAProperty> _properties = ma.getProperties();
    for (final MAProperty p : _properties) {
      ABIE _type = p.getType();
      abies.add(_type);
    }
    return abies;
  }
  
  public Set<ABIE> abies(final ABIE abie) {
    Set<ABIE> abies = new HashSet<ABIE>();
    EList<ABIEProperty> _properties = abie.getProperties();
    Iterable<ASBIE> _filter = Iterables.<ASBIE>filter(_properties, ASBIE.class);
    for (final ASBIE asbie : _filter) {
      ABIE _type = asbie.getType();
      abies.add(_type);
    }
    return abies;
  }
  
  public Set<BDT> allReferedBDT(final MA ma) {
    Set<BDT> bdts = new HashSet<BDT>();
    DocLibrary _library = this.maExtension.library(ma);
    BIELibrary _bieLibrary = _library.getBieLibrary();
    EList<ABIE> _abies = _bieLibrary.getAbies();
    for (final ABIE abie : _abies) {
      EList<ABIEProperty> _properties = abie.getProperties();
      Iterable<BBIE> _filter = Iterables.<BBIE>filter(_properties, BBIE.class);
      for (final BBIE bbie : _filter) {
        BDT _type = bbie.getType();
        bdts.add(_type);
      }
    }
    return bdts;
  }
}
