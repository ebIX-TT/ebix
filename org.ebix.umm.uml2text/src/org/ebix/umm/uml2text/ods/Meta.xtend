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

class Meta extends OdsPart {
	
	override String fileName() {
		return "meta.xml"
	}
	
	override String content() '''
		<?xml version="1.0" encoding="UTF-8"?>
		<office:document-meta 
				xmlns:office="urn:oasis:names:tc:opendocument:xmlns:office:1.0" 
				xmlns:xlink="http://www.w3.org/1999/xlink" 
				xmlns:dc="http://purl.org/dc/elements/1.1/" 
				xmlns:meta="urn:oasis:names:tc:opendocument:xmlns:meta:1.0" 
				xmlns:ooo="http://openoffice.org/2004/office" 
				xmlns:grddl="http://www.w3.org/2003/g/data-view#" 
				office:version="1.1">
			<office:meta 
					xmlns:style="urn:oasis:names:tc:opendocument:xmlns:style:1.0" 
					xmlns:text="urn:oasis:names:tc:opendocument:xmlns:text:1.0" 
					xmlns:table="urn:oasis:names:tc:opendocument:xmlns:table:1.0" 
					xmlns:draw="urn:oasis:names:tc:opendocument:xmlns:drawing:1.0" 
					xmlns:fo="urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0" 
					xmlns:number="urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0" 
					xmlns:presentation="urn:oasis:names:tc:opendocument:xmlns:presentation:1.0" 
					xmlns:svg="urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0" 
					xmlns:chart="urn:oasis:names:tc:opendocument:xmlns:chart:1.0" 
					xmlns:dr3d="urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0" 
					xmlns:math="http://www.w3.org/1998/Math/MathML" 
					xmlns:form="urn:oasis:names:tc:opendocument:xmlns:form:1.0" 
					xmlns:script="urn:oasis:names:tc:opendocument:xmlns:script:1.0" 
					xmlns:config="urn:oasis:names:tc:opendocument:xmlns:config:1.0" 
					xmlns:ooow="http://openoffice.org/2004/writer" 
					xmlns:oooc="http://openoffice.org/2004/calc" 
					xmlns:dom="http://www.w3.org/2001/xml-events" 
					xmlns:xforms="http://www.w3.org/2002/xforms" 
					xmlns:xsd="http://www.w3.org/2001/XMLSchema" 
					xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
					xmlns:rpt="http://openoffice.org/2005/report" 
					xmlns:of="urn:oasis:names:tc:opendocument:xmlns:of:1.2" 
					xmlns:xhtml="http://www.w3.org/1999/xhtml" 
					xmlns:tableooo="http://openoffice.org/2009/table" 
					xmlns:field="urn:openoffice:names:experimental:ooo-ms-interop:xmlns:field:1.0" 
					xmlns:formx="urn:openoffice:names:experimental:ooxml-odf-interop:xmlns:form:1.0" 
					xmlns:css3t="http://www.w3.org/TR/css3-text/">
				<meta:initial-creator>UMM Gnerator</meta:initial-creator>
				<meta:creation-date>2012-07-29T18:18:34</meta:creation-date>
				<dc:date>2012-07-29T18:21:32</dc:date>
				<dc:creator>UMM Gnerator</dc:creator>
				<meta:editing-duration>PT2M58S</meta:editing-duration>
				<meta:editing-cycles>1</meta:editing-cycles>
				<meta:generator>UMM Gnerator</meta:generator>
				<meta:document-statistic meta:table-count="3" meta:cell-count="164" meta:object-count="0"/>
			</office:meta>
		</office:document-meta>
	'''
	
}