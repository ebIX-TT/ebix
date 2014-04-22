package org.ebix.umm.templates.xsd

import com.google.inject.Inject

import org.ebix.umm.templates.Constants

import org.ebix.umm.umm.BDT
import org.ebix.umm.umm.BDTLibrary
import org.ebix.umm.umm.MA
import org.ebix.umm.umm.Supplement

class BdtLibrarySchema {

    @Inject extension Xml xmlExtension
    @Inject extension BdtLibraryExtension bdtLibraryExtension
    @Inject extension BdtExtension bdtExtension
    @Inject extension EnumExtension enumExtension
    @Inject extension MultiplicityKindExtension multiplicityExtension

    def compile(BDTLibrary library, Constants constants, MA ma) '''
        <?xml version="1.0" encoding="UTF-8"?>
        «"Business Data Type XML Schema Module".comment»
        <!--
        Schema agency:     «constants.schemaAgency.value»
        Schema version:    «library.versionIdentifier»
        Schema date:       «constants.schemaDate»
        
        «constants.copyright.value»
        
        «constants.disclaimer.value»
        -->
        <xsd:schema
            xmlns:xsd="http://www.w3.org/2001/XMLSchema"
            xmlns:bdt="«library.namespace(null)»"
            xmlns:ccts="urn:un:unece:uncefact:documentation:common:3:standard:CoreComponentsTechnicalSpecification:3"
            xmlns:xbt="urn:un:unece:uncefact:data:common:1:draft"
            targetNamespace="«library.namespace(ma)»"
            elementFormDefault="qualified"
            attributeFormDefault="unqualified"
            version="«library.versionIdentifier»">
            «"Imports".comment»
            «IF (ma != null)»
            «"Import of Code Lists".comment»
            «FOR codelist: library.allReferencedCodelists()»
            <xsd:import namespace="«library.namespace(null)»" schemaLocation="«constants.schemaLocation»«codelist.fileName»"/>
            «ENDFOR»
            «ELSE»
            «"Import of Code Lists".comment»
            «ENDIF»
            «"Inclusions".comment»
            «"Inclusion of Code Lists".comment»
            «IF (ma == null)»
            «FOR codelist: library.allReferencedCodelists()»
            <xsd:include schemaLocation="«codelist.fileName»"/>
            «ENDFOR»
            «ENDIF»
            «"Business Data Type Definitions".comment»
            «FOR bdt:  library.bdts»
            «bdt.BdtType»
            «ENDFOR»
        </xsd:schema>  
    '''

    def BdtType(BDT bdt) '''
        «(bdt.xsdName + " Type").comment»
        «IF(bdt.isSimpleType)»
        <xsd:simpleType name="«bdt.xsdType»">
            «IF (!bdt.content.isExtraRestricted)»
            <xsd:restriction base="«bdt.conQualifiedType()»"/>
            «ELSE»
            <xsd:restriction base="«bdt.conQualifiedType()»">
                «IF (bdt.content.hasPattern)»
                <xsd:pattern value="«bdt.content.pattern»"/>
                «ENDIF»
                «IF (bdt.content.minLength != 0)»
                <xsd:minLength value="«bdt.content.minLength»"/>
                «ENDIF»
                «IF (bdt.content.maxLength != 0)»
                «IF (bdt.content.type.name == "String")»
                <xsd:maxLength value="«bdt.content.maxLength»"/>
                «ELSE»
                <xsd:totalDigits value="«bdt.content.maxLength»"/>
                «ENDIF»
                «ENDIF»
                «IF (bdt.content.length != 0)»
                <xsd:length value="«bdt.content.length»"/>
                «ENDIF»
            </xsd:restriction>
            «ENDIF»
        </xsd:simpleType>
        «ELSE»
        <xsd:complexType name="«bdt.xsdType»">
            <xsd:simpleContent>
                <xsd:extension base="«bdt.conQualifiedType»">
                    «FOR sup: bdt.properties.filter(typeof(Supplement))»
                    «IF (sup.restriction.size == 0 && !sup.isExtraRestricted)»
                    <xsd:attribute name="«sup.name»" type="«sup.xsdQualifiedType»" use="«sup.multiplicity.use»"«IF(sup.hasDefaultValue)» fixed="«sup.defaultValue»"«ENDIF»«IF(sup.hasFixedValue)» fixed="«sup.fixedValue»"«ENDIF»/>
                    «ELSE»
                    <xsd:attribute name="«sup.name»" use="«sup.multiplicity.use()»"«IF(sup.hasDefaultValue)» fixed="«sup.defaultValue»"«ENDIF»«IF(sup.hasFixedValue)» fixed="«sup.fixedValue»"«ENDIF»>
                        <xsd:simpleType>
                            <xsd:restriction base="«sup.xsdQualifiedType»">
                                «FOR restriction: sup.restriction»
                                <xsd:enumeration value="«restriction»"/>
                                «ENDFOR»
                                «IF (sup.restriction.size == 0)»
                                    «IF (sup.hasPattern)»
                                    <xsd:pattern value="«sup.pattern»"/>
                                    «ENDIF»
                                    «IF (sup.minLength != 0)»
                                    <xsd:minLength value="«sup.minLength»"/>
                                    «ENDIF»
                                    «IF (sup.maxLength != 0)»
                                        «IF (sup.type.name == "String")»
                                        <xsd:maxLength value="«sup.maxLength»"/>
                                        «ELSE»
                                        <xsd:totalDigits value="«sup.maxLength»"/>
                                        «ENDIF»
                                    «ENDIF»
                                    «IF (sup.length != 0)»
                                       <xsd:length value="«sup.length»"/>
                                    «ENDIF»
                                «ENDIF»
                            </xsd:restriction>
                        </xsd:simpleType>
                    </xsd:attribute>
                    «ENDIF»
                    «ENDFOR»   
                </xsd:extension>
            </xsd:simpleContent>
        </xsd:complexType>
        «ENDIF»
    '''

}

