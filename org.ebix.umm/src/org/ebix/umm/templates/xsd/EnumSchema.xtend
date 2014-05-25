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

import org.ebix.umm.umm.ENUM
import org.ebix.umm.umm.Assembled
import org.ebix.umm.umm.Original
import org.ebix.umm.umm.Subset


class EnumSchema {

    @Inject extension Xml xmlExtension
    @Inject extension AssembledExtension assembledExtension
    @Inject extension EnumExtension enumExtension

    
    def compile(ENUM e, Constants constants) '''
        <?xml version="1.0" encoding="UTF-8"?>
        «(e.xsdName + " - Code List Schema Module").comment»
        <!--
        Schema agency:     «constants.schemaAgency.value»
        Schema version:    «e.versionIdentifier»
        Schema date:       «constants.schemaDate»

        Code list name:    «e.codeListName»
        Code list agency:  «e.codeListAgency» 
        Code list version: «e.versionIdentifier»

        «constants.copyright.value»

        «constants.disclaimer.value»
        -->
        <xsd:schema
            xmlns:xsd="http://www.w3.org/2001/XMLSchema"
            xmlns:«e.namespacePrefix»="«e.namespace()»"
            «importNamespace(e)»   
            xmlns:ccts="urn:un:unece:uncefact:documentation:common:3:standard:CoreComponentsTechnicalSpecification:3"
            xmlns:xbt="urn:un:unece:uncefact:data:common:1:draft"
            targetNamespace="«e.namespace»"
            elementFormDefault="qualified"
            attributeFormDefault="unqualified"
            version="«e.versionIdentifier»">
            «"Imports".comment»
            «imports(e)»
            «includes(e)»
            «"Root element for this code list".comment»
            <xsd:element name="«e.xsdName»" 
                type="«e.xsdQualifiedType»"/>
        
            «"Content type for this code list".comment»
            <xsd:simpleType name="«e.xsdType»">
                «content(e)»
            </xsd:simpleType>
        </xsd:schema>  
    '''

    def dispatch importNamespace(ENUM e) '''
    '''

    def dispatch imports(ENUM e) '''
    '''

    def dispatch includes(ENUM e) '''
    '''

    def dispatch content(ENUM e) '''
    '''

    def dispatch content(Original original) '''
      <xsd:restriction base="xsd:token">
      «FOR code:original.codes»
         <xsd:enumeration value="«code.name»">
            <xsd:annotation>
               <xsd:documentation xml:lang="en">
                  <ccts:Name>«code.name»</ccts:Name>
                  <ccts:Description>«code.description.escapeXML»</ccts:Description>
               </xsd:documentation>
            </xsd:annotation>
         </xsd:enumeration>
      «ENDFOR»            
      </xsd:restriction>
    '''

    def dispatch content(Subset subset) '''
      <xsd:restriction base="xsd:token">
      «FOR code:subset.codes»
         <xsd:enumeration value="«code.name»">
            <xsd:annotation>
               <xsd:documentation xml:lang="en">
                  <ccts:Name>«code.name»</ccts:Name>
                  <ccts:Description>«code.description.escapeXML»</ccts:Description>
               </xsd:documentation>
            </xsd:annotation>
         </xsd:enumeration>
      «ENDFOR»            
      </xsd:restriction>
    '''

    def dispatch importNamespace(Assembled assembled) '''
        «FOR e:assembled.imports()»
            xmlns:«e.namespacePrefix»="«e.namespace»"
        «ENDFOR»            
    '''

    def dispatch imports(Assembled assembled) '''
        «"Import of Code Lists".comment»
        «FOR e : assembled.imports() »
            <xsd:import namespace="«e.namespace»" schemaLocation="«e.fileName»"/>
        «ENDFOR»

    '''

    def dispatch includes(Assembled assembled) '''
        «"Include of Code Lists".comment»
        «FOR e:assembled.includes()»
            <xsd:include schemaLocation="«e.fileName»"/>
        «ENDFOR»

    '''


     def dispatch content(Assembled assembled) '''
        <xsd:union memberTypes="«FOR e:assembled.enums SEPARATOR ' '»«IF(assembled.namespace == e.namespace)»«assembled.namespacePrefix»«ELSE»«e.namespacePrefix»«ENDIF»:«e.xsdType»«ENDFOR»"/>
    '''
 
}
