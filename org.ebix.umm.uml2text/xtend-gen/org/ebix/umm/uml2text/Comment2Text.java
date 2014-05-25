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

@SuppressWarnings("all")
public class Comment2Text {
  public String strip(final String comment) {
    boolean _contains = comment.contains("<html>");
    if (_contains) {
      String _replaceAll = comment.replaceAll("<html>", "");
      String _replaceAll_1 = _replaceAll.replaceAll("</html>", "");
      String _replaceAll_2 = _replaceAll_1.replaceAll("<head>", "");
      String _replaceAll_3 = _replaceAll_2.replaceAll("</head>", "");
      String _replaceAll_4 = _replaceAll_3.replaceAll("<body>", "");
      String _replaceAll_5 = _replaceAll_4.replaceAll("</body>", "");
      String _replaceAll_6 = _replaceAll_5.replaceAll("<p>", "");
      String _replaceAll_7 = _replaceAll_6.replaceAll("</p>", "");
      return _replaceAll_7.trim();
    } else {
      return comment;
    }
  }
}
