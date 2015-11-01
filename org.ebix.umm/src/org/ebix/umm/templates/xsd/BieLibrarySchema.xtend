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

import org.ebix.umm.umm.ABIE
import org.ebix.umm.umm.ABIEProperty
import org.ebix.umm.umm.ASBIE
import org.ebix.umm.umm.BBIE
import org.ebix.umm.umm.BIELibrary
import org.ebix.umm.umm.MA
import java.util.HashMap
import org.ebix.umm.validation.ocl.FieldOcls

class BieLibrarySchema {
	
	public static HashMap<String, FieldOcls> fieldOcls = new HashMap<String, FieldOcls>();
    
    @Inject extension Xml xmlExtension
    @Inject extension AbieExtension abieExtension
    @Inject extension BdtExtension bdtExtension
    @Inject extension BdtLibraryExtension bdtLibraryExtension
    @Inject extension BieLibraryExtension bieLibraryExtension
    @Inject extension MultiplicityKindExtension multiplicityExtension

    def compile(BIELibrary library, Constants constants, MA ma)     '''
        <?xml version="1.0" encoding="UTF-8"?>
        «"Message Business Information Entities XML Schema Module".comment»
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
            xmlns:ns1="«library.baseURN»"
            targetNamespace="«library.namespace(ma)»"
            elementFormDefault="qualified"
            attributeFormDefault="unqualified"
            version="«library.versionIdentifier»">
            «"Imports".comment»
            «"Inclusions".comment»
            «"Inclusion of Message Data Types".comment»
            <xsd:include schemaLocation="«library.bdtLibrary.fileName(ma)»"/>
            
            «"Message Business Information Entities Definitions".comment»
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
        <xsd:element ref="«prefix»:«property.xsdRoleName»" «IF (MultiplicityKindExtension.hasSize(property.xsdRoleName))»minOccurs="«property.multiplicity.minOccurs(property.xsdRoleName)»" maxOccurs="«property.multiplicity.maxOccurs(property.xsdRoleName)»"«ENDIF»/>
    '''


    def dispatch AProperty(BBIE property, String prefix) '''
        «IF (property.type.xsdName.equals("DateTimeType") || property.type.xsdName.equals("DateType") || property.type.xsdName.equals("TimeType") || property.type.xsdName.equals("UTCOffsetDateTimeType") || property.type.xsdName.equals("UTCDateTimeType"))»
        	<xsd:element name="«property.xsdName»" «IF (MultiplicityKindExtension.hasSize(property.xsdName))»minOccurs="«property.multiplicity.minOccurs(property.xsdName)»" maxOccurs="«property.multiplicity.maxOccurs(property.xsdName)»"«ENDIF»>
	        «IF (property.type.isSimpleType())»
	            <xsd:simpleType>
	            	<xsd:restriction base="«property.type.xsdType»">
		                    «IF (property.type.content.hasPattern)»
		                    <xsd:pattern value="«property.type.content.pattern»"/>
		                    «ENDIF»
	                </xsd:restriction>
	            </xsd:simpleType>
	        «ENDIF»
	        </xsd:element>
	    «ELSE»
	    «IF (property.type.xsdName.equals("DayDateType") || property.type.xsdName.equals("YearDateType") || property.type.xsdName.equals("MonthDateType") || property.type.xsdName.equals("MonthDayDateType"))»        
        <xsd:element name="«property.xsdName»" type="«property.type.xsdType»"«IF(property.hasFixedValue)» fixed="«property.fixedValue»"«ENDIF» «IF (MultiplicityKindExtension.hasSize(property.xsdName))»minOccurs="«property.multiplicity.minOccurs(property.xsdName)»" maxOccurs="«property.multiplicity.maxOccurs(property.xsdName)»"«ENDIF»/>
        «ELSE»
        «IF (fieldOcls.containsKey(property.name))»
        <xsd:element name="«property.xsdName»" «IF (MultiplicityKindExtension.hasSize(property.xsdName))»minOccurs="«property.multiplicity.minOccurs(property.xsdName)»" maxOccurs="«property.multiplicity.maxOccurs(property.xsdName)»"«ENDIF»>
             «IF (property.type.isSimpleType())»
	            <xsd:simpleType>
	          «ELSE»  
            <xsd:complexType>
                <xsd:simpleContent>
              «ENDIF»
                    <xsd:restriction base="«property.type.xsdType»">
                        «IF (fieldOcls.get(property.name).minExclusive != null)»<xsd:minExclusive value="«fieldOcls.get(property.name).minExclusive»"/>«ENDIF»
                        «IF (fieldOcls.get(property.name).maxExclusive != null)»<xsd:maxExclusive value="«fieldOcls.get(property.name).maxExclusive»"/>«ENDIF»
                        «IF (fieldOcls.get(property.name).minInclusive != null)»<xsd:minInclusive value="«fieldOcls.get(property.name).minInclusive»"/>«ENDIF»
                        «IF (fieldOcls.get(property.name).maxInclusive != null)»<xsd:maxInclusive value="«fieldOcls.get(property.name).maxInclusive»"/>«ENDIF»
                        «IF (fieldOcls.get(property.name).maxLength != null)»<xsd:maxLength value="«fieldOcls.get(property.name).maxLength»"/>«ENDIF»
                        «IF (fieldOcls.get(property.name).minLength != null)»<xsd:minLength value="«fieldOcls.get(property.name).minLength»"/>«ENDIF»
                        «IF (fieldOcls.get(property.name).totalDigits != null)»<xsd:totalDigits value="«fieldOcls.get(property.name).totalDigits»"/>«ENDIF»
                        «IF (fieldOcls.get(property.name).fractionalDigits != null)»<xsd:fractionDigits value="«fieldOcls.get(property.name).fractionalDigits»"/>«ENDIF»
                        «IF (fieldOcls.get(property.name).pattern != null)»<xsd:pattern value="«fieldOcls.get(property.name).pattern»"/>«ENDIF»
                        «IF (fieldOcls.get(property.name).length != null)»<xsd:length value="«fieldOcls.get(property.name).length»"/>«ENDIF»
                    </xsd:restriction>
              «IF (property.type.isSimpleType())»
	            </xsd:simpleType>
	          «ELSE»  
                </xsd:simpleContent>
            </xsd:complexType>
              «ENDIF»    

        </xsd:element>	
        «ELSE»
        «IF (property.restriction.size == 0 && (property.type.content==null||(!property.type.content.hasPattern && property.type.content.minLength == 0 && property.type.content.maxLength == 0 && property.type.content.length == 0 && property.type.content.minExclusive == 0 && property.type.content.minInclusive == 0 && property.type.content.maxExclusive == 0 && property.type.content.maxInclusive == 0 && property.type.content.fractionalDigits == 0 && property.type.content.totalDigits == 0)))»
        <xsd:element name="«property.xsdName»" type="«property.type.xsdType»"«IF(property.hasFixedValue)» fixed="«property.fixedValue»"«ENDIF» «IF (MultiplicityKindExtension.hasSize(property.xsdName))»minOccurs="«property.multiplicity.minOccurs(property.xsdName)»" maxOccurs="«property.multiplicity.maxOccurs(property.xsdName)»"«ENDIF»/>
        «ELSE»
        <xsd:element name="«property.xsdName»" «IF (MultiplicityKindExtension.hasSize(property.xsdName))»minOccurs="«property.multiplicity.minOccurs(property.xsdName)»" maxOccurs="«property.multiplicity.maxOccurs(property.xsdName)»"«ENDIF»>
        «IF (property.type.isSimpleType())»
            <xsd:simpleType>
            	<xsd:restriction base="«property.type.xsdType»">
	                «FOR restriction: property.restriction.sort»
	                <xsd:enumeration value="«restriction»"/>
	                «ENDFOR» 
	                «IF (property.restriction.size == 0)»
	                    «IF (property.type.content.hasPattern)»
	                    <xsd:pattern value="«property.type.content.pattern»"/>
	                    «ENDIF»
	                    «IF (property.type.content.minLength != 0)»
	                    <xsd:minLength value="«property.type.content.minLength»"/>
	                    «ENDIF»
	                    «IF (property.type.content.maxLength != 0)»
	                    <xsd:maxLength value="«property.type.content.maxLength»"/>
	                    «ENDIF»
	                    «IF (property.type.content.length != 0)»
	                    <xsd:length value="«property.type.content.length»"/>
	                    «ENDIF»
	                    «IF (property.type.content.minExclusive != 0)»
	                    <xsd:minExclusive value="«property.type.content.minExclusive»"/>
	                    «ENDIF»
	                    «IF (property.type.content.minInclusive != 0)»
	                    <xsd:minInclusive value="«property.type.content.minInclusive»"/>
	                    «ENDIF»
	                    «IF (property.type.content.maxExclusive != 0)»
	                    <xsd:maxExclusive value="«property.type.content.maxExclusive»"/>
	                    «ENDIF»
	                    «IF (property.type.content.maxInclusive != 0)»
	                    <xsd:maxInclusive value="«property.type.content.maxInclusive»"/>
	                    «ENDIF»
				         «IF (property.type.content.fractionalDigits != 0)»
	                    <xsd:fractionDigits value="«property.type.content.fractionalDigits»"/>
	                    «ENDIF»
	                    «IF (property.type.content.totalDigits != 0)»
	                    <xsd:totalDigits value="«property.type.content.totalDigits»"/>
	                	«ENDIF»
	            	«ENDIF»
                </xsd:restriction>
            </xsd:simpleType>
        «ELSE»
            <xsd:complexType>
                <xsd:simpleContent>
                    <xsd:restriction base="«property.type.xsdType»">
                        «FOR restriction: property.restriction.sort»
                        <xsd:enumeration value="«restriction»"/>
                        «ENDFOR»  
                        «IF (property.restriction.size == 0)»
                            «IF (property.type.content.hasPattern)»
                            <xsd:pattern value="«property.type.content.pattern»"/>
                            «ENDIF»
                            «IF (property.type.content.minLength != 0)»
                            <xsd:minLength value="«property.type.content.minLength»"/>
                            «ENDIF»
                            «IF (property.type.content.maxLength != 0)»
                            <xsd:maxLength value="«property.type.content.maxLength»"/>
                            «ENDIF»
                            «IF (property.type.content.length != 0)»
                            <xsd:length value="«property.type.content.length»"/>
                            «ENDIF»
                            «IF (property.type.content.minExclusive != 0)»
                            <xsd:minExclusive value="«property.type.content.minExclusive»"/>
                            «ENDIF»
                            «IF (property.type.content.minInclusive != 0)»
                            <xsd:minInclusive value="«property.type.content.minInclusive»"/>
                            «ENDIF»
                            «IF (property.type.content.maxExclusive != 0)»
                            <xsd:maxExclusive value="«property.type.content.maxExclusive»"/>
                            «ENDIF»
                            «IF (property.type.content.maxInclusive != 0)»
                            <xsd:maxInclusive value="«property.type.content.maxInclusive»"/>
                            «ENDIF»
                            «IF (property.type.content.fractionalDigits != 0)»
                            <xsd:fractionDigits value="«property.type.content.fractionalDigits»"/>
                            «ENDIF»
                            «IF (property.type.content.totalDigits != 0)»
                            <xsd:totalDigits value="«property.type.content.totalDigits»"/>
                            «ENDIF»
                        «ENDIF»
                    </xsd:restriction>
                </xsd:simpleContent>
            </xsd:complexType>
        «ENDIF»
        </xsd:element>
        «ENDIF»
        «ENDIF»
        «ENDIF»
        «ENDIF»
    '''

}