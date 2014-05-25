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

import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class BasicFunctions {
  public static CharSequence openHeaderRow() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<table:table-row table:style-name=\"rheader\">");
    _builder.newLine();
    return _builder;
  }
  
  public static CharSequence closeHeaderRow() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("</table:table-row>");
    _builder.newLine();
    return _builder;
  }
  
  public static CharSequence headerCell(final String... names) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final String name : names) {
        _builder.append("<table:table-cell table:style-name=\"cheader\" office:value-type=\"string\"><text:p>");
        _builder.append(name, "");
        _builder.append("</text:p></table:table-cell>");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public static CharSequence openRow(final String styleName) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<table:table-row table:style-name=\"");
    _builder.append(styleName, "");
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public static CharSequence closeRow() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("</table:table-row>");
    _builder.newLine();
    return _builder;
  }
  
  public static CharSequence cell(final String styleName, final String content) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<table:table-cell table:style-name=\"");
    _builder.append(styleName, "");
    _builder.append("\" office:value-type=\"string\"><text:p>");
    _builder.append(content, "");
    _builder.append("</text:p></table:table-cell>");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
}
