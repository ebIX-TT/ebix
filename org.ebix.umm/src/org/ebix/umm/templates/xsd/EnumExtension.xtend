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

import org.ebix.umm.umm.Assembled
import org.ebix.umm.umm.ENUM
import org.ebix.umm.umm.ENUMLibrary
import org.ebix.umm.umm.MA
import org.ebix.umm.umm.Original
import org.ebix.umm.umm.Subset

class EnumExtension {
    
    def dispatch String xsdName(ENUM e) {
        return e.name.replaceAll("\\s+","")
    }
    
    def dispatch String xsdName(Original original) {
        return "Original" + original.name.replaceAll("\\s+","")
    }
    
    def dispatch String xsdName(Subset subset) {
        return "Subset" + subset.name.replaceAll("\\s+","")
    }
    
    def dispatch String xsdName(Assembled assembled) {
        return "Assembled" + assembled.name.replaceAll("\\s+","")
    }

    def ENUMLibrary library(ENUM e) {
        return e.eContainer as ENUMLibrary
    }

    def String namespace(ENUM e) {
        library(e).baseURN
    }

    def String xsdType(ENUM e) {
        return xsdName(e) + "ContentType"
    }

    def String namespacePrefix(ENUM e) {
         return library(e).namespacePrefix + e.codeListAgencyIdentifier + "_" + e.uniqueIdentifier + "_" + majorVersion(e) + minorVersion(e) + revisionVersion(e)
     }

    def String xsdQualifiedType(ENUM e) {
        return namespacePrefix(e) + ":" + xsdType(e)
    }


    def String fileName(ENUM e) {
        return e.codeListAgencyIdentifier + "_" + e.uniqueIdentifier + "_" + majorVersion(e) + "p" + minorVersion(e) + "p" + revisionVersion(e) + ".xsd"
    }

    def String fileName(ENUM e, String directory) {
        return directory + "/" + fileName(e)
    }

    def String fileName(ENUM e, String directory, MA ma) {
        return fileName(e, directory)
    }

    def String majorVersion(ENUM e) {
    	if (e.versionIdentifier.length > 0)
        	e.versionIdentifier.substring(0, 1)
        else 
        	""
    }

    def String minorVersion(ENUM e) {
    	if (e.versionIdentifier.length > 2)
        	e.versionIdentifier.substring(2, 3)
        else
        	""
    }
    
    def String revisionVersion(ENUM e) {
    	if (e.versionIdentifier.length > 4)
        	e.versionIdentifier.substring(4, 5)
        else 
        	""
    }

    def String codeListAgency(ENUM e) {
        switch(e.codeListAgencyIdentifier) {
            case "260":        "ebix"
            case "305":        "etso"
            case "6":        "UNECE"
            case "5":        "ISO"
            case "293":        "BDEW"
            case "9":        "GS1"
            case "379":      "IANA"
            default:          "unk"
        }
    }

}
