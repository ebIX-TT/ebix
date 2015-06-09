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

import java.util.ArrayList
import java.util.List
import java.util.Collections

import org.ebix.umm.umm.Assembled
import org.ebix.umm.umm.BDTLibrary
import org.ebix.umm.umm.MA
import java.util.LinkedList

class BdtLibraryExtension {

    @Inject extension EnumExtension enumExtension
    
    def String fileName(BDTLibrary library) {
        return "ebIX_MessageDataType_" + library.versionIdentifier.replaceAll("\\.", "p") + ".xsd"
    }

    def String fileName(BDTLibrary library, String directory) {
        return directory + "/" + fileName(library)
    }
    
    def String fileName(BDTLibrary library, MA ma) {
    	if(ma!=null){
    		return "ebIX_MessageDataType_" + ma.name +"_"+ library.versionIdentifier.replaceAll("\\.", "p") + ".xsd"
    	}
        return "ebIX_MessageDataType_" + library.versionIdentifier.replaceAll("\\.", "p") + ".xsd"
    }

    def String fileName(BDTLibrary library, String directory, MA ma) {
        return directory + "/" + fileName(library, ma)
    }

    def String namespace(BDTLibrary library, MA ma) {
        var String namespace = library.baseURN
        if (ma != null) {
            namespace = namespace + "-" + ma.name
        }
        return namespace
    }

    def List<Assembled> allReferencedCodelists(BDTLibrary library) {
        var List<Assembled> referenced = new LinkedList<Assembled>()
        for (bdt: library.bdts)
            for (property: bdt.properties)
                if (property.type instanceof Assembled)
                	if(!referenced.contains(property.type as Assembled))
                    	referenced.add(property.type as Assembled)
        Collections::sort(referenced, [ a1, a2 |  a1.fileName.compareTo( a2.fileName ) ] )
        return referenced
    }
	
}