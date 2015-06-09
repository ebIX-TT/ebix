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
import org.ebix.umm.umm.BIELibrary;
import org.ebix.umm.umm.MA;

@SuppressWarnings("all")
public class BieLibraryExtension {
  public String fileName(final BIELibrary library) {
    String _versionIdentifier = library.getVersionIdentifier();
    String _replaceAll = _versionIdentifier.replaceAll("\\.", "p");
    String _plus = ("ebIX_MessageBusinessInformationEntities_" + _replaceAll);
    return (_plus + ".xsd");
  }
  
  public String fileName(final BIELibrary library, final String directory) {
    String _fileName = this.fileName(library);
    return ((directory + "/") + _fileName);
  }
  
  public String fileName(final BIELibrary library, final MA ma) {
    boolean _notEquals = (!Objects.equal(ma, null));
    if (_notEquals) {
      String _name = ma.getName();
      String _plus = ("ebIX_MessageBusinessInformationEntities_" + _name);
      String _plus_1 = (_plus + "_");
      String _versionIdentifier = library.getVersionIdentifier();
      String _replaceAll = _versionIdentifier.replaceAll("\\.", "p");
      String _plus_2 = (_plus_1 + _replaceAll);
      return (_plus_2 + ".xsd");
    }
    String _versionIdentifier_1 = library.getVersionIdentifier();
    String _replaceAll_1 = _versionIdentifier_1.replaceAll("\\.", "p");
    String _plus_3 = ("ebIX_MessageBusinessInformationEntities_" + _replaceAll_1);
    return (_plus_3 + ".xsd");
  }
  
  public String fileName(final BIELibrary library, final String directory, final MA ma) {
    String _fileName = this.fileName(library, ma);
    return ((directory + "/") + _fileName);
  }
  
  public String namespace(final BIELibrary library, final MA ma) {
    String namespace = library.getBaseURN();
    boolean _notEquals = (!Objects.equal(ma, null));
    if (_notEquals) {
      String _name = ma.getName();
      String _plus = ((namespace + "-") + _name);
      namespace = _plus;
    }
    return namespace;
  }
}
