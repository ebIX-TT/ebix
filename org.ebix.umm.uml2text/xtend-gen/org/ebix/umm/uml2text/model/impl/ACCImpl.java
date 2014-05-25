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
import org.ebix.umm.uml2text.model.ACC;

@SuppressWarnings("all")
public class ACCImpl implements ACC {
  protected UmmStereotype ummStereotype;
  
  public ACCImpl(final UmmStereotype ummStereotype) {
    this.ummStereotype = ummStereotype;
  }
  
  public List<String> businessTerm(final org.eclipse.uml2.uml.Class umlClass) {
    return this.ummStereotype.getListOfStringValue(umlClass, "businessTerm");
  }
  
  public String uniqueIdentifier(final org.eclipse.uml2.uml.Class umlClass) {
    return this.ummStereotype.getStringValue(umlClass, "uniqueIdentifier");
  }
  
  public String versionIdentifier(final org.eclipse.uml2.uml.Class umlClass) {
    return this.ummStereotype.getStringValue(umlClass, "versionIdentifier");
  }
  
  public String definition(final org.eclipse.uml2.uml.Class umlClass) {
    return this.ummStereotype.getStringValue(umlClass, "definition");
  }
  
  public String dictionaryEntryName(final org.eclipse.uml2.uml.Class umlClass) {
    return this.ummStereotype.getStringValue(umlClass, "dictionaryEntryName");
  }
}
