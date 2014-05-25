/*
 *  UMM Schema Generator
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
package org.ebix.umm.templates.xsd

class Xml {

    def String escapeXML(String str) {
        str.replaceAll("&", "&amp;")
               .replaceAll("<", "&lt;")
               .replaceAll(">", "&gt;")
               .replaceAll("\"", "&quot;")
               .replaceAll("'", "&apos;")
    }


    def comment(String text) '''
        «div»
        <!-- ==== «text»«padding(text)» ==== -->
        «div»
    '''

    def int max(int a, int b) {
        if (a > b) {
            return a
        } else {
            return b
        }
    }

    def div(String arg) {
        return div()
    }

    def div() '''
        <!-- ================================================================================ -->
    '''

    def padding(String text) {
        var String blanks = "                                                                      "
        return blanks.substring(0, max(0, 70 - text.length))
    }

}