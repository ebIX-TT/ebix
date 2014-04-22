package org.ebix.umm.templates.xsd


import org.ebix.umm.umm.BIELibrary
import org.ebix.umm.umm.MA

class BieLibraryExtension {
    
    def String fileName(BIELibrary library) {
        return "ebIX_AggregatedBusinessInformationEntities_" + library.versionIdentifier.replaceAll("\\.", "p") + ".xsd"
    }

    def String fileName(BIELibrary library, String directory) {
        directory + "/" + fileName(library)
    }

    def String namespace(BIELibrary library, MA ma) {
        var String namespace = library.baseURN
        if (ma != null) {
            namespace = namespace + "-" + ma.name
        }
        return namespace
    }
	
}