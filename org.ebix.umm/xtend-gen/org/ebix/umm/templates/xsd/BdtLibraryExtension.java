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
package org.ebix.umm.templates.xsd;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import org.ebix.umm.templates.xsd.EnumExtension;
import org.ebix.umm.umm.Assembled;
import org.ebix.umm.umm.AssembledBase;
import org.ebix.umm.umm.BDT;
import org.ebix.umm.umm.BDTLibrary;
import org.ebix.umm.umm.BDTProperty;
import org.ebix.umm.umm.MA;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class BdtLibraryExtension {
  @Inject
  @Extension
  private EnumExtension enumExtension;
  
  public String fileName(final BDTLibrary library) {
    String _versionIdentifier = library.getVersionIdentifier();
    String _replaceAll = _versionIdentifier.replaceAll("\\.", "p");
    String _plus = ("ebIX_MessageDataType_" + _replaceAll);
    return (_plus + ".xsd");
  }
  
  public String fileName(final BDTLibrary library, final String directory) {
    String _fileName = this.fileName(library);
    return ((directory + "/") + _fileName);
  }
  
  public String fileName(final BDTLibrary library, final MA ma) {
    boolean _notEquals = (!Objects.equal(ma, null));
    if (_notEquals) {
      String _name = ma.getName();
      String _plus = ("ebIX_MessageDataType_" + _name);
      String _plus_1 = (_plus + "_");
      String _versionIdentifier = library.getVersionIdentifier();
      String _replaceAll = _versionIdentifier.replaceAll("\\.", "p");
      String _plus_2 = (_plus_1 + _replaceAll);
      return (_plus_2 + ".xsd");
    }
    String _versionIdentifier_1 = library.getVersionIdentifier();
    String _replaceAll_1 = _versionIdentifier_1.replaceAll("\\.", "p");
    String _plus_3 = ("ebIX_MessageDataType_" + _replaceAll_1);
    return (_plus_3 + ".xsd");
  }
  
  public String fileName(final BDTLibrary library, final String directory, final MA ma) {
    String _fileName = this.fileName(library, ma);
    return ((directory + "/") + _fileName);
  }
  
  public String namespace(final BDTLibrary library, final MA ma) {
    String namespace = library.getBaseURN();
    boolean _notEquals = (!Objects.equal(ma, null));
    if (_notEquals) {
      String _name = ma.getName();
      String _plus = ((namespace + "-") + _name);
      namespace = _plus;
    }
    return namespace;
  }
  
  public List<Assembled> allReferencedCodelists(final BDTLibrary library) {
    List<Assembled> referenced = new LinkedList<Assembled>();
    EList<BDT> _bdts = library.getBdts();
    for (final BDT bdt : _bdts) {
      EList<BDTProperty> _properties = bdt.getProperties();
      for (final BDTProperty property : _properties) {
        AssembledBase _type = property.getType();
        if ((_type instanceof Assembled)) {
          AssembledBase _type_1 = property.getType();
          boolean _contains = referenced.contains(((Assembled) _type_1));
          boolean _not = (!_contains);
          if (_not) {
            AssembledBase _type_2 = property.getType();
            referenced.add(((Assembled) _type_2));
          }
        }
      }
    }
    final Comparator<Assembled> _function = (Assembled a1, Assembled a2) -> {
      String _fileName = this.enumExtension.fileName(a1);
      String _fileName_1 = this.enumExtension.fileName(a2);
      return _fileName.compareTo(_fileName_1);
    };
    Collections.<Assembled>sort(referenced, _function);
    return referenced;
  }
}
