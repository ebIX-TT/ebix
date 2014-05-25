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
package org.ebix.umm.uml2text.ods

import org.ebix.umm.uml2text.UmmStereotypes
import org.eclipse.uml2.uml.Model

import static org.ebix.umm.uml2text.ods.BasicFunctions.*

class Content extends OdsPart {

	private UmmStereotypes ummStereotypes
	private Model umlModel
	
	private CcContent ccContent
	private BieContent bieContent
	private BdtContent bdtContent
	
	new (UmmStereotypes ummStereotypes, Model umlModel) {
		this.ummStereotypes = ummStereotypes
		this.umlModel = umlModel
		
		this.ccContent = new CcContent(ummStereotypes, umlModel)
		this.bieContent = new BieContent(ummStereotypes, umlModel)
		this.bdtContent = new BdtContent(ummStereotypes, umlModel)
	}
	
	override String fileName() {
		return "content.xml"
	}
	
	override String content() '''
		<?xml version="1.0" encoding="UTF-8"?>
		<office:document-content xmlns:office="urn:oasis:names:tc:opendocument:xmlns:office:1.0"
				xmlns:style="urn:oasis:names:tc:opendocument:xmlns:style:1.0"
				xmlns:text="urn:oasis:names:tc:opendocument:xmlns:text:1.0"
				xmlns:table="urn:oasis:names:tc:opendocument:xmlns:table:1.0"
				xmlns:draw="urn:oasis:names:tc:opendocument:xmlns:drawing:1.0"
				xmlns:fo="urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0"
				xmlns:xlink="http://www.w3.org/1999/xlink"
				xmlns:dc="http://purl.org/dc/elements/1.1/"
				xmlns:meta="urn:oasis:names:tc:opendocument:xmlns:meta:1.0"
				xmlns:number="urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0"
				xmlns:presentation="urn:oasis:names:tc:opendocument:xmlns:presentation:1.0"
				xmlns:svg="urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0"
				xmlns:chart="urn:oasis:names:tc:opendocument:xmlns:chart:1.0"
				xmlns:dr3d="urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0"
				xmlns:math="http://www.w3.org/1998/Math/MathML"
				xmlns:form="urn:oasis:names:tc:opendocument:xmlns:form:1.0"
				xmlns:script="urn:oasis:names:tc:opendocument:xmlns:script:1.0"
				xmlns:ooo="http://openoffice.org/2004/office"
				xmlns:ooow="http://openoffice.org/2004/writer"
				xmlns:oooc="http://openoffice.org/2004/calc"
				xmlns:dom="http://www.w3.org/2001/xml-events"
				xmlns:xforms="http://www.w3.org/2002/xforms"
				xmlns:xsd="http://www.w3.org/2001/XMLSchema"
				xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
				xmlns:rpt="http://openoffice.org/2005/report"
				xmlns:of="urn:oasis:names:tc:opendocument:xmlns:of:1.2"
				xmlns:xhtml="http://www.w3.org/1999/xhtml"
				xmlns:grddl="http://www.w3.org/2003/g/data-view#"
				xmlns:field="urn:openoffice:names:experimental:ooo-ms-interop:xmlns:field:1.0"
				xmlns:formx="urn:openoffice:names:experimental:ooxml-odf-interop:xmlns:form:1.0"
				xmlns:css3t="http://www.w3.org/TR/css3-text/" 
				office:version="1.1">
			<office:scripts/>
			<office:font-face-decls>
				<style:font-face style:name="Liberation Sans" svg:font-family="&apos;Liberation Sans&apos;" style:font-family-generic="swiss" style:font-pitch="variable"/>
				<style:font-face style:name="DejaVu Sans" svg:font-family="&apos;DejaVu Sans&apos;" style:font-family-generic="system" style:font-pitch="variable"/>
				<style:font-face style:name="Lohit Hindi" svg:font-family="&apos;Lohit Hindi&apos;" style:font-family-generic="system" style:font-pitch="variable"/>
				<style:font-face style:name="WenQuanYi Micro Hei" svg:font-family="&apos;WenQuanYi Micro Hei&apos;" style:font-family-generic="system" style:font-pitch="variable"/>
			</office:font-face-decls>
			<office:automatic-styles>
				<style:style style:name="co1" style:family="table-column">
					<style:table-column-properties fo:break-before="auto" style:column-width="0.8925in"/>
				</style:style>
				<style:style style:name="co-narrow" style:family="table-column">
					<style:table-column-properties fo:break-before="auto" style:column-width="0.5000in"/>
				</style:style>
				<style:style style:name="co-name" style:family="table-column">
					<style:table-column-properties fo:break-before="auto" style:column-width="5.2000in"/>
				</style:style>
				<style:style style:name="co-term" style:family="table-column">
					<style:table-column-properties fo:break-before="auto" style:column-width="3.0000in"/>
				</style:style>
				<style:style style:name="ro1" style:family="table-row">
					<style:table-row-properties style:row-height="0.178in" fo:break-before="auto" style:use-optimal-row-height="true"/>
				</style:style>
				<style:style style:name="rheader" style:family="table-row">
					<style:table-row-properties style:row-height="0.300in" fo:break-before="auto" style:use-optimal-row-height="false"/>
				</style:style>
				<style:style style:name="rdef" style:family="table-row">
					<style:table-row-properties style:row-height="0.650in" fo:break-before="auto" style:use-optimal-row-height="false"/>
				</style:style>
				<style:style style:name="rclass" style:family="table-row">
					<style:table-row-properties style:row-height="0.400in" fo:break-before="auto" style:use-optimal-row-height="false"/>
				</style:style>
				<style:style style:name="rattr" style:family="table-row">
					<style:table-row-properties style:row-height="0.400in" fo:break-before="auto" style:use-optimal-row-height="false"/>
				</style:style>
				<style:style style:name="ta1" style:family="table" style:master-page-name="Default">
					<style:table-properties table:display="true" style:writing-mode="lr-tb"/>
				</style:style>
				<style:style style:name="ce1" style:family="table-cell" style:parent-style-name="Default">
					<style:text-properties fo:font-weight="bold" style:font-weight-asian="bold" style:font-weight-complex="bold"/>
				</style:style>
				<style:style style:name="cheader" style:family="table-cell" style:parent-style-name="Default">
					<style:table-cell-properties fo:background-color="#000000" style:vertical-align="top"/>
					<style:text-properties fo:color="#ffffff" fo:font-weight="bold" style:font-weight-asian="bold" style:font-weight-complex="bold"/>
				</style:style>
				<style:style style:name="cdef" style:family="table-cell" style:parent-style-name="Default">
					<style:table-cell-properties fo:background-color="#ffff00" fo:wrap-option="wrap" style:vertical-align="top" />
					<style:text-properties fo:color="#000000" fo:font-weight="bold" style:font-weight-asian="bold" style:font-weight-complex="bold"/>
				</style:style>
				<style:style style:name="cclass" style:family="table-cell" style:parent-style-name="Default">
					<style:table-cell-properties fo:background-color="#ffff00" style:vertical-align="top" />
					<style:text-properties fo:color="#000000" fo:font-weight="bold" style:font-weight-asian="bold" style:font-weight-complex="bold"/>
				</style:style>
				<style:style style:name="cclass-wrap" style:family="table-cell" style:parent-style-name="Default">
					<style:table-cell-properties fo:background-color="#ffff00" fo:wrap-option="wrap" style:vertical-align="top" />
					<style:text-properties fo:color="#000000" fo:font-weight="bold" style:font-weight-asian="bold" style:font-weight-complex="bold"/>
				</style:style>
				<style:style style:name="cclass-red" style:family="table-cell" style:parent-style-name="Default">
					<style:table-cell-properties fo:background-color="#800000" style:vertical-align="top" />
					<style:text-properties fo:color="#000000" fo:font-weight="bold" style:font-weight-asian="bold" style:font-weight-complex="bold"/>
				</style:style>
				<style:style style:name="cattr" style:family="table-cell" style:parent-style-name="Default">
					<style:table-cell-properties fo:wrap-option="wrap" style:vertical-align="top" />
				</style:style>
				<style:style style:name="cattr-wrap" style:family="table-cell" style:parent-style-name="Default">
					<style:table-cell-properties fo:wrap-option="wrap" style:vertical-align="top" />
				</style:style>
				<style:style style:name="cattr-blue" style:family="table-cell" style:parent-style-name="Default">
					<style:table-cell-properties style:vertical-align="top" />
					<style:text-properties fo:color="#000080"/>
				</style:style>
			</office:automatic-styles>
			<office:body>
				<office:spreadsheet>
					«ccContent.sheet»
					«bieContent.sheet»
					«bdtContent.sheet»
					«usageRulesSheet()»
					«constraintTypeCodeSheet()»
					«conditionTypeCodeSheet()»
				</office:spreadsheet>
			</office:body>
		</office:document-content>
	'''

	def usageRulesSheet() '''
		<table:table table:name="UsageRules" table:style-name="ta1">
			<table:table-column table:style-name="co1" table:default-cell-style-name="Default"/>
			<table:table-column table:style-name="co1" table:default-cell-style-name="Default"/>
			<table:table-column table:style-name="co-name" table:default-cell-style-name="Default"/>
			<table:table-column table:style-name="co-term" table:default-cell-style-name="Default"/>
			<table:table-column table:style-name="co-term" table:default-cell-style-name="Default"/>
			«openHeaderRow»
				«headerCell("Unique ID", "Constraint", "Constraint Type Code", 
					"Constraint Language Code", "Condition Type (pre, post, or invariant)")»
			«closeHeaderRow»
			«openRow("rdef")»
				«cell("cdef", "")»
				«cell("cdef", "")»
				«cell("cdef", "UNS, OCL, SBVR, XSRE, ECL, CHIP, CAT, BON, NCL, PERL, SCR")»
				«cell("cdef", "")»
				«cell("cdef", "PRE, POST, INV")»
			«closeRow»
			«openRow("rdef")»
				«cell("cdef", "")»
				«cell("cdef", "")»
				«cell("cdef", "OCL")»
				«cell("cdef", "EN")»
				«cell("cdef", "INV")»
			«closeRow»
		</table:table>
	'''

	def constraintTypeCodeSheet() '''
		<table:table table:name="ConstraintTypeCode" table:style-name="ta1">
			<table:table-column table:style-name="co-narrow" table:default-cell-style-name="Default"/>
			<table:table-column table:style-name="co-term" table:default-cell-style-name="Default"/>
			<table:table-column table:style-name="co-name" table:default-cell-style-name="Default"/>
			«header»
			«row("UNS",	 "Unstructured",	"An unstructured constraint is expressed in plain text without any formalism other than the grammar of the language in which it is expressed")»
			«row("OCL",	 "OCL",	"The Object Constraint Language is a declarative language for describing rules that apply to Unified Modeling Language (UML) models")»
			«row("SBVR", "Semantics of Business Vocabulary and Business Rules",	"The Semantics of Business Vocabulary and Business Rules (SBVR) is a formal and detailed natural language declarative description of a complex entity that is an integral part of the OMG Model Driven Architecture (MDA)")»
			«row("XSRE", "XML Schema Regular Expression",	"XML Schema Regular Expression is used to formally define the pattern facet in a W3C XML Schema Definition Language Schema")»
			«row("ECL",	 "Eclipse",	"The Eclipse language is a constraint logic programming system that implements an open source programming language")»
			«row("CHIP", "Constraint Handling in Prolog",	"The Constraint Handling in Prolog (CHIP) language is used to tell an object what to do")»
			«row("CAT",	 "Catalysis",	"Catalysis is an approach for the systematic business-driven development of component-based systems based on the Unified Modeling Language")»
			«row("BON",	 "Business Object Notation",	"Business Object Notation is a method and graphical notation for high-level object oriented analysis and design")»
			«row("NCL",	 "Natural Constraint Language",	"The Natural Constraint Language is a description language with mathematical logic as syntax")»
			«row("PERL", "Perl",	"Scripting program language")»
			«row("SCR",	 "Schematron",	"XML Schematron")»
		</table:table>
	'''
	
	def conditionTypeCodeSheet() '''
		<table:table table:name="ConditionTypeCode" table:style-name="ta1">
			<table:table-column table:style-name="co-narrow" table:default-cell-style-name="Default"/>
			<table:table-column table:style-name="co-name" table:default-cell-style-name="Default"/>
			<table:table-column table:style-name="co-name" table:default-cell-style-name="Default"/>
			«header»
			«row("PRE",	 "Precondition",  "A precondition to an operation is a restriction that must be true at the moment that the operation is going to be executed")»
			«row("POST", "Postcondition", "A postcondition to an operation is a restriction that must be true at the moment that the operation has just ended its execution")»
			«row("INV",	 "Invariant",	  "An invariant is a constraint that states a condition that must always be met by all instances of the class, type, or interface. An invariant is described using an expression that evaluates to true if the invariant is met. Invariants must be true all the time.")»
		</table:table>
	'''

	def header() '''
		«openHeaderRow»
			«headerCell("Code", "Name", "Description")»
		«closeHeaderRow»
	'''
	
	def row(String code, String name, String description) '''
		«openRow("rdef")»
			«cell("cdef", code)»
			«cell("cdef", name)»
			«cell("cdef", description)»
		«closeRow»
	'''
	
}