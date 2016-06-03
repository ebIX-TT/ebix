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
import java.util.HashSet
import java.util.List
import java.util.Set

import org.ebix.umm.templates.Rules

import org.ebix.umm.umm.ABIE
import org.ebix.umm.umm.ABIEProperty
import org.ebix.umm.umm.ASBIE
import org.ebix.umm.umm.BBIE
import org.ebix.umm.umm.BIELibrary

class AbieExtension {
    
    @Inject extension Rules rules
    
    def String xsdName(ABIE abie) {
        return abie.name.typeNameRule
    }

    def String xsdType(ABIE abie) {
        return xsdName(abie)
    }

    def BIELibrary library(ABIE abie) {
        return  abie.eContainer as BIELibrary
    }    

    def List<ASBIE> allReferingRoles(ABIE abie) {
        var List<ASBIE> referingRoles = new ArrayList<ASBIE>()
        for (abie2: library(abie).abies)
            for (asbie: abie2.properties.filter(typeof(ASBIE)))
                if (asbie.type == abie)
                    referingRoles.add(asbie)
        return referingRoles
    }


    def List<ASBIE> allReferingRolesUniqueByName(ABIE abie) {
        var Set<String> roleNames = new HashSet<String>()
        var List<ASBIE> referingRolesUniqueByName = new ArrayList<ASBIE>()
        var List<ASBIE> referingRoles = allReferingRoles(abie)
        
        for (asbie: referingRoles)
            roleNames.add(asbie.name)
            
        for (name: roleNames) {
            var found = false
            for (role: referingRoles) {
                if (!found && name.equals(role.name)) {
                    referingRolesUniqueByName.add(role)
                    found = true
                }
            }
        }
    
        return referingRolesUniqueByName
    }


    def ABIE abie(ABIEProperty property) {
         property.eContainer as ABIE
    }

    def boolean isPartOfChoice(ABIEProperty property) {
        for (p: property.abie.properties)
            if (p.or.contains(property))
                return true
        return false
    }
    
        def String fullNameForMap(ABIEProperty property) {
        //2016-06-05 disabled 
        //println("Labie+name: " +property.abie.name+'.'+property.name)
        //return property.name
         return property.abie.name+'.'+property.name
    }
    


    // BBIE
    def String xsdName(BBIE bbie) {
        return bbie.name.typeNameRule
    }
    

    def boolean hasFixedValue(BBIE bbie) {
        return bbie.fixedValue != null && bbie.fixedValue.length > 0
    }

    // ASBIE
    def String xsdName(ASBIE asbie) {
        return asbie.name.typeNameRule
    }

    def String xsdRoleName(ASBIE asbie) {
        return asbie.name.typeNameRule + asbie.type.name.typeNameRule
    }

}