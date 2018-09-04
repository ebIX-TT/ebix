/**
 * UMM Schema Generator
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
package org.ebix.umm.uml2text.ods;

import org.ebix.umm.uml2text.ods.OdsPart;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class Meta extends OdsPart {
  @Override
  public String fileName() {
    return "meta.xml";
  }
  
  @Override
  public String content() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
    _builder.newLine();
    _builder.append("<office:document-meta ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("xmlns:office=\"urn:oasis:names:tc:opendocument:xmlns:office:1.0\" ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("xmlns:xlink=\"http://www.w3.org/1999/xlink\" ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("xmlns:dc=\"http://purl.org/dc/elements/1.1/\" ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("xmlns:meta=\"urn:oasis:names:tc:opendocument:xmlns:meta:1.0\" ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("xmlns:ooo=\"http://openoffice.org/2004/office\" ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("xmlns:grddl=\"http://www.w3.org/2003/g/data-view#\" ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("office:version=\"1.1\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<office:meta ");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("xmlns:style=\"urn:oasis:names:tc:opendocument:xmlns:style:1.0\" ");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("xmlns:text=\"urn:oasis:names:tc:opendocument:xmlns:text:1.0\" ");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("xmlns:table=\"urn:oasis:names:tc:opendocument:xmlns:table:1.0\" ");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("xmlns:draw=\"urn:oasis:names:tc:opendocument:xmlns:drawing:1.0\" ");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("xmlns:fo=\"urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0\" ");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("xmlns:number=\"urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0\" ");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("xmlns:presentation=\"urn:oasis:names:tc:opendocument:xmlns:presentation:1.0\" ");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("xmlns:svg=\"urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0\" ");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("xmlns:chart=\"urn:oasis:names:tc:opendocument:xmlns:chart:1.0\" ");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("xmlns:dr3d=\"urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0\" ");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("xmlns:math=\"http://www.w3.org/1998/Math/MathML\" ");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("xmlns:form=\"urn:oasis:names:tc:opendocument:xmlns:form:1.0\" ");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("xmlns:script=\"urn:oasis:names:tc:opendocument:xmlns:script:1.0\" ");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("xmlns:config=\"urn:oasis:names:tc:opendocument:xmlns:config:1.0\" ");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("xmlns:ooow=\"http://openoffice.org/2004/writer\" ");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("xmlns:oooc=\"http://openoffice.org/2004/calc\" ");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("xmlns:dom=\"http://www.w3.org/2001/xml-events\" ");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("xmlns:xforms=\"http://www.w3.org/2002/xforms\" ");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" ");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" ");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("xmlns:rpt=\"http://openoffice.org/2005/report\" ");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("xmlns:of=\"urn:oasis:names:tc:opendocument:xmlns:of:1.2\" ");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("xmlns:xhtml=\"http://www.w3.org/1999/xhtml\" ");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("xmlns:tableooo=\"http://openoffice.org/2009/table\" ");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("xmlns:field=\"urn:openoffice:names:experimental:ooo-ms-interop:xmlns:field:1.0\" ");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("xmlns:formx=\"urn:openoffice:names:experimental:ooxml-odf-interop:xmlns:form:1.0\" ");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("xmlns:css3t=\"http://www.w3.org/TR/css3-text/\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<meta:initial-creator>UMM Gnerator</meta:initial-creator>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<meta:creation-date>2012-07-29T18:18:34</meta:creation-date>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<dc:date>2012-07-29T18:21:32</dc:date>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<dc:creator>UMM Gnerator</dc:creator>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<meta:editing-duration>PT2M58S</meta:editing-duration>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<meta:editing-cycles>1</meta:editing-cycles>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<meta:generator>UMM Gnerator</meta:generator>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<meta:document-statistic meta:table-count=\"3\" meta:cell-count=\"164\" meta:object-count=\"0\"/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</office:meta>");
    _builder.newLine();
    _builder.append("</office:document-meta>");
    _builder.newLine();
    return _builder.toString();
  }
}
