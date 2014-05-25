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
package org.ebix.umm.uml2text;

import org.eclipse.emf.common.util.URI;

@SuppressWarnings("all")
public class Name2Text {
  private final String GENERATED_CODE_DIR = "model-text/";
  
  public String fileName(final String name) {
    String _replaceAll = name.replaceAll("::", "/");
    String _replaceAll_1 = _replaceAll.replaceAll(":", "/");
    String _plus = (this.GENERATED_CODE_DIR + _replaceAll_1);
    return (_plus + ".umm");
  }
  
  public String fileName(final URI file) {
    String _lastSegment = file.lastSegment();
    String _fileExtension = file.fileExtension();
    String _replaceAll = _lastSegment.replaceAll(_fileExtension, "ods");
    return (this.GENERATED_CODE_DIR + _replaceAll);
  }
}
