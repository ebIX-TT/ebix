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
package org.ebix.umm.templates;

import java.util.Collections;
import java.util.List;
import org.ebix.umm.templates.Constant;
import org.ebix.umm.templates.SchemaDate;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@SuppressWarnings("all")
public class Constants {
  private SchemaDate schemaDate = new SchemaDate();
  
  public final Constant schemaMajorVersion = new Constant("Major version", "0");
  
  public final Constant schemaMinorVersion = new Constant("Minor version", "1");
  
  public final Constant schemaRevision = new Constant("Revision", "A");
  
  public final Constant schemaAgency = new Constant("Schema Agency", "ebIX");
  
  public final Constant copyright = new Constant("Copyright Notice", "Copyright (C) ebIX (2010). All Rights Reserved.");
  
  public final Constant disclaimer = new Constant("Disclaimer", this.defaultDisclaimerText().toString());
  
  public final List<Constant> allConstants = Collections.<Constant>unmodifiableList(CollectionLiterals.<Constant>newArrayList(this.schemaAgency, this.copyright, this.disclaimer));
  
  private String schemaLocation;
  
  public String schemaVersion() {
    return ((((this.schemaMajorVersion.value + ".") + this.schemaMinorVersion.value) + ".") + this.schemaRevision.value);
  }
  
  public String schemaDate() {
    return this.schemaDate.schemaDate();
  }
  
  public String schemaLocation() {
    return this.schemaLocation;
  }
  
  public String setSchemaLocation(final String schemaLocation) {
    return this.schemaLocation = schemaLocation;
  }
  
  private final CharSequence defaultDisclaimerText() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("This document and translations of it may be copied and furnished to others,");
    _builder.newLine();
    _builder.append("and derivative works that comment on or otherwise explain it or assist in");
    _builder.newLine();
    _builder.append("its implementation may be prepared, copied, published and distributed, in");
    _builder.newLine();
    _builder.append("whole or in part, without restriction of any kind, provided that the above");
    _builder.newLine();
    _builder.append("copyright notice and this paragraph are included on all such copies and");
    _builder.newLine();
    _builder.append("derivative works. However, this document itself may not be modified in any");
    _builder.newLine();
    _builder.append("way, such as by removing the copyright notice or references to ebIX, except");
    _builder.newLine();
    _builder.append("as needed for the purpose of developing ebIX specifications, in which case");
    _builder.newLine();
    _builder.append("the procedures for copyrights defined in the UN/CEFACT Intellectual Property");
    _builder.newLine();
    _builder.append("Rights document must be followed, or as required to translate it into");
    _builder.newLine();
    _builder.append("languages other than English.");
    _builder.newLine();
    _builder.append("The limited permissions granted above are perpetual and will not be revoked");
    _builder.newLine();
    _builder.append("by ebIX or its successors or assigns.");
    _builder.newLine();
    _builder.append("This document and the information contained herein is provided on an \"AS IS\"");
    _builder.newLine();
    _builder.append("basis and ebIX DISCLAIMS ALL WARRANTIES, EXPRESS OR IMPLIED, INCLUDING BUT");
    _builder.newLine();
    _builder.append("NOT LIMITED TO ANY WARRANTY THAT THE USE OF THE INFORMATION HEREIN WILL NOT");
    _builder.newLine();
    _builder.append("INFRINGE ANY RIGHTS OR ANY IMPLIED WARRANTIES OF MERCHANTABILITY OR FITNESS");
    _builder.newLine();
    _builder.append("FOR A PARTICULAR PURPOSE.");
    _builder.newLine();
    return _builder;
  }
}
