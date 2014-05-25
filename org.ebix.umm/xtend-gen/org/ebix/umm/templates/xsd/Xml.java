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

import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class Xml {
  public String escapeXML(final String str) {
    String _replaceAll = str.replaceAll("&", "&amp;");
    String _replaceAll_1 = _replaceAll.replaceAll("<", "&lt;");
    String _replaceAll_2 = _replaceAll_1.replaceAll(">", "&gt;");
    String _replaceAll_3 = _replaceAll_2.replaceAll("\"", "&quot;");
    return _replaceAll_3.replaceAll("\'", "&apos;");
  }
  
  public CharSequence comment(final String text) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _div = this.div();
    _builder.append(_div, "");
    _builder.newLineIfNotEmpty();
    _builder.append("<!-- ==== ");
    _builder.append(text, "");
    String _padding = this.padding(text);
    _builder.append(_padding, "");
    _builder.append(" ==== -->");
    _builder.newLineIfNotEmpty();
    CharSequence _div_1 = this.div();
    _builder.append(_div_1, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public int max(final int a, final int b) {
    if ((a > b)) {
      return a;
    } else {
      return b;
    }
  }
  
  public CharSequence div(final String arg) {
    return this.div();
  }
  
  public CharSequence div() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<!-- ================================================================================ -->");
    _builder.newLine();
    return _builder;
  }
  
  public String padding(final String text) {
    String blanks = "                                                                      ";
    int _length = text.length();
    int _minus = (70 - _length);
    int _max = this.max(0, _minus);
    return blanks.substring(0, _max);
  }
}
