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
        return asnone.name
    }
    

}