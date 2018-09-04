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

import java.util.List;
import org.ebix.umm.uml2text.UmmStereotype;
import org.ebix.umm.uml2text.model.Library;

@SuppressWarnings("all")
public abstract class LibraryImpl implements Library {
  protected UmmStereotype ummStereotype;
  
  public LibraryImpl(final UmmStereotype ummStereotype) {
    this.ummStereotype = ummStereotype;
  }
  
  @Override
  public String baseURN(final org.eclipse.uml2.uml.Package umlPackage) {
    return this.ummStereotype.getStringValue(umlPackage, "baseURN");
  }
  
  @Override
  public List<String> businessTerm(final org.eclipse.uml2.uml.Package umlPackage) {
    return this.ummStereotype.getListOfStringValue(umlPackage, "businessTerm");
  }
  
  @Override
  public List<String> copyright(final org.eclipse.uml2.uml.Package umlPackage) {
    return this.ummStereotype.getListOfStringValue(umlPackage, "copyright");
  }
  
  @Override
  public List<String> owner(final org.eclipse.uml2.uml.Package umlPackage) {
    return this.ummStereotype.getListOfStringValue(umlPackage, "owner");
  }
  
  @Override
  public List<String> reference(final org.eclipse.uml2.uml.Package umlPackage) {
    return this.ummStereotype.getListOfStringValue(umlPackage, "reference");
  }
  
  @Override
  public String status(final org.eclipse.uml2.uml.Package umlPackage) {
    return this.ummStereotype.getStringValue(umlPackage, "status");
  }
  
  @Override
  public String uniqueIdentifier(final org.eclipse.uml2.uml.Package umlPackage) {
    return this.ummStereotype.getStringValue(umlPackage, "uniqueIdentifier");
  }
  
  @Override
  public String versionIdentifier(final org.eclipse.uml2.uml.Package umlPackage) {
    return this.ummStereotype.getStringValue(umlPackage, "versionIdentifier");
  }
  
  @Override
  public String namespacePrefix(final org.eclipse.uml2.uml.Package umlPackage) {
    return this.ummStereotype.getStringValue(umlPackage, "namespacePrefix");
  }
}
