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
package org.ebix.umm.uml2text.model.impl;

import org.ebix.umm.uml2text.UmmStereotype;
import org.ebix.umm.uml2text.model.BieLibrary;
import org.ebix.umm.uml2text.model.impl.LibraryImpl;

@SuppressWarnings("all")
public class BieLibraryImpl extends LibraryImpl implements BieLibrary {
  public BieLibraryImpl(final UmmStereotype ummStereotype) {
    super(ummStereotype);
  }
  
  public boolean isBieLibrary(final org.eclipse.uml2.uml.Package umlPackage) {
    return this.ummStereotype.hasStereotype(umlPackage);
  }
  
  public org.eclipse.uml2.uml.Package bdtVersion(final org.eclipse.uml2.uml.Package umlPackage) {
    Object _value = this.ummStereotype.getValue(umlPackage, "e-BDT version");
    return ((org.eclipse.uml2.uml.Package) _value);
  }
  
  public org.eclipse.uml2.uml.Package cefactVersion(final org.eclipse.uml2.uml.Package umlPackage) {
    Object _value = this.ummStereotype.getValue(umlPackage, "Cefact version");
    return ((org.eclipse.uml2.uml.Package) _value);
  }
  
  public String unsm(final org.eclipse.uml2.uml.Package umlPackage) {
    return this.ummStereotype.getStringValue(umlPackage, "UNSM");
  }
}
