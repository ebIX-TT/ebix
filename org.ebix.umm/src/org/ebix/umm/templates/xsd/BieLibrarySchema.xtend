package org.ebix.umm.templates.xsd


import com.google.inject.Inject

import org.ebix.umm.templates.Constants

import org.ebix.umm.umm.ABIE
import org.ebix.umm.umm.ABIEProperty
import org.ebix.umm.umm.ASBIE
import org.ebix.umm.umm.BBIE
import org.ebix.umm.umm.BIELibrary
import org.ebix.umm.umm.MA

class BieLibrarySchema {
    
    @Inject extension Xml xmlExtension
    @Inject extension AbieExtension abieExtension
    @Inject extension BdtExtension bdtExtension
    @Inject extension BdtLibraryExtension bdtLibraryExtension
    @Inject extension BieLibraryExtension bieLibraryExtension
    @Inject extension MultiplicityKindExtension multiplicityExtension


    def compile(BIELibrary library, Constants constants, MA ma) '''
        <?xml version="1.0" encoding="UTF-8"?>
        «"Aggregated Business Information Entities XML Schema Module".comment»
        <!--
        Schema agency:     «constants.schemaAgency.value»
        Schema version:    «library.versionIdentifier»
        Schema date:       «constants.schemaDate»
        
        «constants.copyright.value»
        
        «constants.disclaimer.value»
        -->
        <xsd:schema
            xmlns:xsd="http://www.w3.org/2001/XMLSchema"
            xmlns:bie="«library.namespace(ma)»"
            xmlns:ccts="urn:un:unece:uncefact:documentation:common:3:standard:CoreComponentsTechnicalSpecification:3"
            xmlns:xbt="urn:un:unece:uncefact:data:common:1:draft"
            targetNamespace="«library.namespace(ma)»"
            elementFormDefault="qualified"
            attributeFormDefault="unqualified"
            version="«library.versionIdentifier»">
            «"Imports".comment»
            «"Inclusions".comment»
            «"Inclusion of Business Data Types".comment»
            <xsd:include schemaLocation="«library.bdtLibrary.fileName()»"/>
            «"Aggregated Business Information Entities Definitions".comment»
            «FOR abie: library.abies»
            «abie.ABIEType(library.namespacePrefix)»
            «ENDFOR»
        </xsd:schema>
    '''


    def ABIEType(ABIE abie, String prefix) '''
        «(abie.xsdName + " Type").comment»
        <xsd:complexType name="«abie.xsdType»">
            <xsd:sequence>
                «FOR property: abie.properties»
                    «property.Property(prefix)»
                «ENDFOR»
            </xsd:sequence>
        </xsd:complexType>
        «FOR role: abie.allReferingRolesUniqueByName»
        <xsd:element name="«role.xsdRoleName»" type="«prefix»:«abie.xsdType»"/>
        «ENDFOR»   
    '''

    def Property(ABIEProperty property , String prefix) '''
        «IF( !property.isPartOfChoice() )»
            «IF( property.or.isEmpty )»
                «property.AProperty(prefix)»
            «ELSE»
                <xsd:choice«IF( property.multiplicity.lowerBoundZero || property.or.exists( p | p.multiplicity.lowerBoundZero ))» minOccurs="0"«ENDIF»>
                    «property.AProperty(prefix)»
                    «FOR orProperty : property.or»
                    «orProperty.AProperty(prefix) »
                    «ENDFOR »
                </xsd:choice>
            «ENDIF»
        «ENDIF»
    '''

    def dispatch AProperty(ASBIE property, String prefix) '''
        <xsd:element ref="«prefix»:«property.xsdRoleName»" minOccurs="«property.multiplicity.minOccurs»" maxOccurs="«property.multiplicity.maxOccurs()»"/>
    '''


    def dispatch AProperty(BBIE property, String prefix) '''
        «IF (property.restriction.size == 0)»
        <xsd:element name="«property.xsdName»" type="«prefix»:«property.type.xsdType»"«IF(property.hasFixedValue)» fixed="«property.fixedValue»"«ENDIF» minOccurs="«property.multiplicity.minOccurs»" maxOccurs="«property.multiplicity.maxOccurs»"/>
        «ELSE»
        <xsd:element name="«property.xsdName»" minOccurs="«property.multiplicity.minOccurs»" maxOccurs="«property.multiplicity.maxOccurs()»">
        «IF (property.type.isSimpleType())»
            <xsd:simpleType>
            	<xsd:restriction base="«prefix»:«property.type.xsdType»">
                    «FOR restriction: property.restriction.sort»
                    <xsd:enumeration value="«restriction»"/>
                    «ENDFOR»   
                </xsd:restriction>
            </xsd:simpleType>
        «ELSE»
            <xsd:complexType>
                <xsd:simpleContent>
                    <xsd:restriction base="«prefix»:«property.type.xsdType»">
                        «FOR restriction: property.restriction.sort»
                        <xsd:enumeration value="«restriction»"/>
                        «ENDFOR»   
                    </xsd:restriction>
                </xsd:simpleContent>
            </xsd:complexType>
        «ENDIF»
        </xsd:element>
        «ENDIF»
    '''

}