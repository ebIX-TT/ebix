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
package org.ebix.umm.uml2text.model;

import java.util.List;
import org.eclipse.uml2.uml.Property;

@SuppressWarnings("all")
public interface BCC {
  public abstract List<String> businessTerm(final Property umlProperty);
  
  public abstract String definition(final Property umlProperty);
  
  public abstract String dictionaryEntryName(final Property umlProperty);
  
  public abstract String uniqueIdentifier(final Property umlProperty);
  
  public abstract String versionIdentifier(final Property umlProperty);
  
  public abstract String sequencingKey(final Property umlProperty);
}
