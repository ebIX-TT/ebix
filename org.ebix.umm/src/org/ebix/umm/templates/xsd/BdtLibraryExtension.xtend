package org.ebix.umm.templates.xsd


import com.google.inject.Inject

import java.util.ArrayList
import java.util.List
import java.util.Collections

import org.ebix.umm.umm.Assembled
import org.ebix.umm.umm.BDTLibrary
import org.ebix.umm.umm.MA

class BdtLibraryExtension {

    @Inject extension EnumExtension enumExtension
    
    def String fileName(BDTLibrary library) {
        return "ebIX_BusinessDataType_" + library.versionIdentifier.replaceAll("\\.", "p") + ".xsd"
    }

    def String fileName(BDTLibrary library, String directory) {
        return directory + "/" + fileName(library)
    }

    def String namespace(BDTLibrary library, MA ma) {
        var String namespace = library.baseURN
        if (ma != null) {
            namespace = namespace + "-" + ma.name
        }
        return namespace
    }

    def List<Assembled> allReferencedCodelists(BDTLibrary library) {
        var List<Assembled> referenced = new ArrayList<Assembled>()
        for (bdt: library.bdts)
            for (property: bdt.properties)
                if (property.type instanceof Assembled)
                    referenced.add(property.type as Assembled)
        Collections::sort(referenced, [ a1, a2 | a1.fileName.compareTo( a2.fileName ) ] )
        return referenced
    }
	
}