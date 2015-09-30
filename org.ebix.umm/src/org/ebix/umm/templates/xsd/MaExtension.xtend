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


import com.google.inject.Inject

import org.ebix.umm.umm.ASMA
import org.ebix.umm.umm.ASNONE
import org.ebix.umm.umm.DocLibrary
import org.ebix.umm.umm.MA

class MaExtension {
    
    @Inject extension AbieExtension abieExtension
    
    def String fileName(MA ma) {
        return "ebIX_" + ma.name + "_" + library(ma).versionIdentifier.replaceAll("\\.", "p") + ".xsd"
    }

    def String fileName(MA ma, String directory) {
        return directory + "/" + fileName(ma)
    }

    def DocLibrary library(MA ma) {
        return ma.eContainer.eContainer as DocLibrary
    }

    def String namespace(MA ma, MA otherMa) {
        var String namespace = library(ma).baseURN
        if (otherMa != null) {
            namespace = namespace +  "-" + otherMa.name
        }
        
        return namespace
    }

    def String xsdName(MA ma) {
        return ma.name
    }

    def String xsdType(MA ma) {
        return xsdName(ma) + "Type"
    }

    def dispatch String xsdRoleName(ASMA asma) {
        return asma.name + asma.type.xsdName
    }
    
    def dispatch String xsdRoleName(ASNONE asnone) {
        return asnone.name.replaceAll("\"", "");
    }
    

}