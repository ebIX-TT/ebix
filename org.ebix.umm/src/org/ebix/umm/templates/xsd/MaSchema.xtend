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

import org.ebix.umm.templates.Constants

import org.ebix.umm.umm.MA


class MaSchema {

    @Inject extension Xml xmlExtension
    @Inject extension AbieExtension abieExtension
    @Inject extension BdtLibraryExtension bdtLibraryExtension
    @Inject extension BieLibraryExtension bieLibraryExtension
    @Inject extension MaExtension maExtension
    @Inject extension MultiplicityKindExtension multiplicityExtension

    def compile(MA ma, Constants constants, MA otherMa) '''
        <?xml version="1.0" encoding="UTF-8"?>
        «"EEM European Energy Market XML Schema Module".comment»
        <!--
        Schema agency:     «constants.schemaAgency.value»
        Schema version:    «ma.library.versionIdentifier»
        Schema date:       «constants.schemaDate»
        
        «constants.copyright.value»
        
        «constants.disclaimer.value»
        -->
        <xsd:schema
            xmlns:xsd="http://www.w3.org/2001/XMLSchema"
            xmlns:rsm="«ma.namespace(otherMa)»"
            xmlns:ccts="urn:un:unece:uncefact:documentation:common:3:standard:CoreComponentsTechnicalSpecification:3"
            xmlns:xbt="urn:un:unece:uncefact:data:common:1:draft"
            targetNamespace="«ma.namespace(otherMa)»"
            elementFormDefault="qualified"
            attributeFormDefault="unqualified"
            version="«ma.library.versionIdentifier»">
            «"Imports".comment»
            «"Inclusions".comment»
            «"Inclusion of Message Business Information Entities".comment»
            <xsd:include schemaLocation="«ma.library.bieLibrary.fileName(otherMa)»"/>
            «"Inclusion of Message Data Types".comment»
            <xsd:include schemaLocation="«ma.library.bdtLibrary.fileName(otherMa)»"/>
            «"Element Declarations".comment»
            «"Root Element Declarations".comment»
            «ma.name.comment»
            «"Root Element".comment»
            <xsd:element name="«ma.name»" type="«ma.library.namespacePrefix»:«ma.xsdType»"/>
            «"Complex Element".comment»
            <xsd:complexType name="«ma.xsdType»">
                <xsd:sequence>
                    «FOR property: ma.properties»
                    <xsd:element ref="«ma.library.namespacePrefix»:«property.xsdRoleName»" minOccurs="«property.multiplicity.minOccurs»" maxOccurs="«property.multiplicity.maxOccurs»"/>
                    «ENDFOR»
                </xsd:sequence>
            </xsd:complexType>
            «"".div»
            «FOR property: ma.properties»
            <xsd:element name="«property.xsdRoleName()»" type="«ma.library.namespacePrefix»:«property.type.xsdType»"/>
            «ENDFOR»
        </xsd:schema>
    '''
}