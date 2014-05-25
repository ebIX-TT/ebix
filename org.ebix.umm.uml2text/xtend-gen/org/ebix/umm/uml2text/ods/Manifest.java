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
package org.ebix.umm.uml2text.ods;

import org.ebix.umm.uml2text.ods.OdsPart;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class Manifest extends OdsPart {
  public String fileName() {
    return "META-INF/manifest.xml";
  }
  
  public String content() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
    _builder.newLine();
    _builder.append("<manifest:manifest xmlns:manifest=\"urn:oasis:names:tc:opendocument:xmlns:manifest:1.0\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<manifest:file-entry manifest:media-type=\"application/vnd.oasis.opendocument.spreadsheet\" manifest:full-path=\"/\"/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<manifest:file-entry manifest:media-type=\"text/xml\" manifest:full-path=\"meta.xml\"/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<manifest:file-entry manifest:media-type=\"text/xml\" manifest:full-path=\"content.xml\"/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<manifest:file-entry manifest:media-type=\"text/xml\" manifest:full-path=\"styles.xml\"/>");
    _builder.newLine();
    _builder.append("</manifest:manifest>");
    _builder.newLine();
    return _builder.toString();
  }
}
