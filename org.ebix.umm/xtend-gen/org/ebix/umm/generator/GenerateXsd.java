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
package org.ebix.umm.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.lang.reflect.Field;
import java.util.ArrayList;
import org.ebix.umm.invariants.Invariants;
import org.ebix.umm.invariants.Prune;
import org.ebix.umm.templates.Constant;
import org.ebix.umm.templates.Constants;
import org.ebix.umm.templates.xsd.BdtLibraryExtension;
import org.ebix.umm.templates.xsd.BdtLibrarySchema;
import org.ebix.umm.templates.xsd.BieLibraryExtension;
import org.ebix.umm.templates.xsd.BieLibrarySchema;
import org.ebix.umm.templates.xsd.EnumExtension;
import org.ebix.umm.templates.xsd.EnumSchema;
import org.ebix.umm.templates.xsd.MaExtension;
import org.ebix.umm.templates.xsd.MaSchema;
import org.ebix.umm.umm.BDTLibrary;
import org.ebix.umm.umm.BIELibrary;
import org.ebix.umm.umm.Constraint;
import org.ebix.umm.umm.ConstraintKind;
import org.ebix.umm.umm.DocLibrary;
import org.ebix.umm.umm.ENUM;
import org.ebix.umm.umm.ENUMLibrary;
import org.ebix.umm.umm.InfEnvelope;
import org.ebix.umm.umm.MA;
import org.ebix.umm.umm.TC_Constraint;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ProjectScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess2;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class GenerateXsd {
  @Inject
  @Extension
  private BdtLibraryExtension bdtLibraryExtension;
  
  @Inject
  @Extension
  private BdtLibrarySchema bdtLibrarySchema;
  
  @Inject
  @Extension
  private BieLibraryExtension bieLibraryExtension;
  
  @Inject
  @Extension
  private BieLibrarySchema bieLibrarySchema;
  
  @Inject
  @Extension
  private EnumSchema enumSchema;
  
  @Inject
  @Extension
  private EnumExtension enumExtension;
  
  @Inject
  @Extension
  private MaExtension maExtension;
  
  @Inject
  @Extension
  private MaSchema maSchema;
  
  @Inject
  @Extension
  private Invariants invariants;
  
  @Inject
  @Extension
  private Prune prune;
  
  public void generateXsd(final Resource resource, final IFileSystemAccess fsa) {
    final Constants constants = this.projectConstants(fsa);
    this.generateGenericXsd(resource, fsa, constants);
    this.generateConstrainedXsd(resource, fsa, constants);
  }
  
  public void generateGenericXsd(final Resource resource, final IFileSystemAccess fsa, final Constants constants) {
    String location = "generic";
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<ENUMLibrary> _filter = Iterables.<ENUMLibrary>filter(_iterable, ENUMLibrary.class);
    for (final ENUMLibrary enumLibrary : _filter) {
      EList<ENUM> _enums = enumLibrary.getEnums();
      for (final ENUM e : _enums) {
        String _fileName = this.enumExtension.fileName(e, location);
        CharSequence _compile = this.enumSchema.compile(e, constants);
        fsa.generateFile(_fileName, _compile);
      }
    }
    constants.setSchemaLocation("../../generic/");
    TreeIterator<EObject> _allContents_1 = resource.getAllContents();
    Iterable<EObject> _iterable_1 = IteratorExtensions.<EObject>toIterable(_allContents_1);
    Iterable<BDTLibrary> _filter_1 = Iterables.<BDTLibrary>filter(_iterable_1, BDTLibrary.class);
    for (final BDTLibrary bdtLibrary : _filter_1) {
      String _fileName_1 = this.bdtLibraryExtension.fileName(bdtLibrary, location);
      CharSequence _compile_1 = this.bdtLibrarySchema.compile(bdtLibrary, constants, null);
      fsa.generateFile(_fileName_1, _compile_1);
    }
    TreeIterator<EObject> _allContents_2 = resource.getAllContents();
    Iterable<EObject> _iterable_2 = IteratorExtensions.<EObject>toIterable(_allContents_2);
    Iterable<BIELibrary> _filter_2 = Iterables.<BIELibrary>filter(_iterable_2, BIELibrary.class);
    for (final BIELibrary bieLibrary : _filter_2) {
      {
        BIELibrary _copy = EcoreUtil.<BIELibrary>copy(bieLibrary);
        BIELibrary copyOfBieLibrary = ((BIELibrary) _copy);
        this.invariants.applyInvariants(copyOfBieLibrary);
        String _fileName_2 = this.bieLibraryExtension.fileName(copyOfBieLibrary, location);
        CharSequence _compile_2 = this.bieLibrarySchema.compile(copyOfBieLibrary, constants, null);
        fsa.generateFile(_fileName_2, _compile_2);
      }
    }
    TreeIterator<EObject> _allContents_3 = resource.getAllContents();
    Iterable<EObject> _iterable_3 = IteratorExtensions.<EObject>toIterable(_allContents_3);
    Iterable<DocLibrary> _filter_3 = Iterables.<DocLibrary>filter(_iterable_3, DocLibrary.class);
    for (final DocLibrary docLibrary : _filter_3) {
      EList<InfEnvelope> _envelopes = docLibrary.getEnvelopes();
      for (final InfEnvelope envelope : _envelopes) {
        EList<MA> _assemblies = envelope.getAssemblies();
        for (final MA ma : _assemblies) {
          String _fileName_2 = this.maExtension.fileName(ma, location);
          CharSequence _compile_2 = this.maSchema.compile(ma, constants, null);
          fsa.generateFile(_fileName_2, _compile_2);
        }
      }
    }
  }
  
  public void generateConstrainedXsd(final Resource resource, final IFileSystemAccess fsa, final Constants constants) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<MA> _filter = Iterables.<MA>filter(_iterable, MA.class);
    for (final MA ma : _filter) {
      {
        ArrayList<String> _listIdentifiers = this.listIdentifiers(ma);
        int _size = _listIdentifiers.size();
        boolean _equals = (_size == 0);
        if (_equals) {
          constants.setSchemaLocation("../../generic/");
          this.generateConstrainedXsd(ma, ConstraintKind.DOCUMENT, "", fsa, constants);
          this.generateConstrainedXsd(ma, ConstraintKind.PAYLOAD, "", fsa, constants);
        }
        ArrayList<String> _listIdentifiers_1 = this.listIdentifiers(ma);
        for (final String listIdentifier : _listIdentifiers_1) {
          {
            constants.setSchemaLocation("../../../generic/");
            this.generateConstrainedXsd(ma, ConstraintKind.DOCUMENT, listIdentifier, fsa, constants);
            this.generateConstrainedXsd(ma, ConstraintKind.PAYLOAD, listIdentifier, fsa, constants);
          }
        }
      }
    }
  }
  
  public void generateConstrainedXsd(final MA ma, final ConstraintKind kind, final String listIdentifier, final IFileSystemAccess fsa, final Constants constants) {
    String _string = kind.toString();
    String _plus = (_string + "/");
    String _name = ma.getName();
    String location = (_plus + _name);
    int _length = listIdentifier.length();
    boolean _greaterThan = (_length > 0);
    if (_greaterThan) {
      location = ((listIdentifier + "/") + location);
    }
    MA clonedMa = this.prune.clone(ma);
    DocLibrary _library = this.maExtension.library(clonedMa);
    BIELibrary _bieLibrary = _library.getBieLibrary();
    this.invariants.applyInvariants(_bieLibrary);
    this.invariants.applyInvariantsFor(clonedMa, kind, "");
    int _length_1 = listIdentifier.length();
    boolean _greaterThan_1 = (_length_1 > 0);
    if (_greaterThan_1) {
      this.invariants.applyInvariantsFor(clonedMa, kind, listIdentifier);
    }
    this.prune.purge(clonedMa);
    String _fileName = this.maExtension.fileName(clonedMa, location);
    CharSequence _compile = this.maSchema.compile(clonedMa, constants, clonedMa);
    fsa.generateFile(_fileName, _compile);
    DocLibrary _library_1 = this.maExtension.library(clonedMa);
    BIELibrary _bieLibrary_1 = _library_1.getBieLibrary();
    String _fileName_1 = this.bieLibraryExtension.fileName(_bieLibrary_1, location);
    DocLibrary _library_2 = this.maExtension.library(clonedMa);
    BIELibrary _bieLibrary_2 = _library_2.getBieLibrary();
    CharSequence _compile_1 = this.bieLibrarySchema.compile(_bieLibrary_2, constants, clonedMa);
    fsa.generateFile(_fileName_1, _compile_1);
    DocLibrary _library_3 = this.maExtension.library(clonedMa);
    BDTLibrary _bdtLibrary = _library_3.getBdtLibrary();
    String _fileName_2 = this.bdtLibraryExtension.fileName(_bdtLibrary, location);
    DocLibrary _library_4 = this.maExtension.library(clonedMa);
    BDTLibrary _bdtLibrary_1 = _library_4.getBdtLibrary();
    CharSequence _compile_2 = this.bdtLibrarySchema.compile(_bdtLibrary_1, constants, clonedMa);
    fsa.generateFile(_fileName_2, _compile_2);
  }
  
  private Constants projectConstants(final IFileSystemAccess fsa) {
    try {
      InputOutput.<String>println("Getting settings");
      final Constants constants = new Constants();
      if ((fsa instanceof EclipseResourceFileSystemAccess2)) {
        final EclipseResourceFileSystemAccess2 er = ((EclipseResourceFileSystemAccess2) fsa);
        Class<? extends EclipseResourceFileSystemAccess2> _class = er.getClass();
        final Field field = _class.getDeclaredField("project");
        field.setAccessible(true);
        Object _get = field.get(er);
        final IProject project = ((IProject) _get);
        boolean _notEquals = (!Objects.equal(project, null));
        if (_notEquals) {
          final ProjectScope projectScope = new ProjectScope(project);
          final IEclipsePreferences projectNode = projectScope.getNode("org.ebix.umm");
          boolean _notEquals_1 = (!Objects.equal(projectNode, null));
          if (_notEquals_1) {
            for (final Constant constant : constants.allConstants) {
              {
                final String value = projectNode.get(constant.name, constant.value);
                constant.value = value;
              }
            }
          }
        }
      }
      return constants;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private ArrayList<String> listIdentifiers(final MA ma) {
    final ArrayList<String> listIdentifiers = new ArrayList<String>();
    EList<Constraint> _constraints = ma.getConstraints();
    for (final Constraint c : _constraints) {
      EList<TC_Constraint> _type = c.getType();
      for (final TC_Constraint tc : _type) {
        boolean _and = false;
        String _listIdentifier = tc.getListIdentifier();
        int _length = _listIdentifier.length();
        boolean _greaterThan = (_length > 0);
        if (!_greaterThan) {
          _and = false;
        } else {
          String _listIdentifier_1 = tc.getListIdentifier();
          boolean _contains = listIdentifiers.contains(_listIdentifier_1);
          boolean _not = (!_contains);
          _and = _not;
        }
        if (_and) {
          String _listIdentifier_2 = tc.getListIdentifier();
          listIdentifiers.add(_listIdentifier_2);
        }
      }
    }
    return listIdentifiers;
  }
}
