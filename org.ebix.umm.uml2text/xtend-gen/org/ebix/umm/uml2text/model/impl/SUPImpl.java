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
import org.ebix.umm.uml2text.model.SUP;
import org.eclipse.uml2.uml.Property;

@SuppressWarnings("all")
public class SUPImpl implements SUP {
  protected UmmStereotype ummStereotype;
  
  public SUPImpl(final UmmStereotype ummStereotype) {
    this.ummStereotype = ummStereotype;
  }
  
  @Override
  public boolean isSUP(final Property umlProperty) {
    return this.ummStereotype.hasStereotype(umlProperty);
  }
  
  @Override
  public List<String> businessTerm(final Property umlProperty) {
    return this.ummStereotype.getListOfStringValue(umlProperty, "businessTerm");
  }
  
  @Override
  public String uniqueIdentifier(final Property umlProperty) {
    return this.ummStereotype.getStringValue(umlProperty, "uniqueIdentifier");
  }
  
  @Override
  public String versionIdentifier(final Property umlProperty) {
    return this.ummStereotype.getStringValue(umlProperty, "versionIdentifier");
  }
  
  @Override
  public String definition(final Property umlProperty) {
    return this.ummStereotype.getStringValue(umlProperty, "definition");
  }
  
  @Override
  public String dictionaryEntryName(final Property umlProperty) {
    return this.ummStereotype.getStringValue(umlProperty, "dictionaryEntryName");
  }
  
  @Override
  public String languageCode(final Property umlProperty) {
    return this.ummStereotype.getStringValue(umlProperty, "languageCode");
  }
  
  @Override
  public List<String> usageRule(final Property umlProperty) {
    return this.ummStereotype.getListOfStringValue(umlProperty, "usageRule");
  }
}
