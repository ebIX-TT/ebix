package org.ebix.umm.templates;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import org.ebix.umm.templates.Constant;
import org.ebix.umm.templates.SchemaDate;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function0;

@SuppressWarnings("all")
public class Constants {
  private SchemaDate schemaDate = new Function0<SchemaDate>() {
    public SchemaDate apply() {
      SchemaDate _schemaDate = new SchemaDate();
      return _schemaDate;
    }
  }.apply();
  
  public final Constant schemaMajorVersion = new Function0<Constant>() {
    public Constant apply() {
      Constant _constant = new Constant("Major version", "0");
      return _constant;
    }
  }.apply();
  
  public final Constant schemaMinorVersion = new Function0<Constant>() {
    public Constant apply() {
      Constant _constant = new Constant("Minor version", "1");
      return _constant;
    }
  }.apply();
  
  public final Constant schemaRevision = new Function0<Constant>() {
    public Constant apply() {
      Constant _constant = new Constant("Revision", "A");
      return _constant;
    }
  }.apply();
  
  public final Constant schemaAgency = new Function0<Constant>() {
    public Constant apply() {
      Constant _constant = new Constant("Schema Agency", "ebIX");
      return _constant;
    }
  }.apply();
  
  public final Constant copyright = new Function0<Constant>() {
    public Constant apply() {
      Constant _constant = new Constant("Copyright Notice", "Copyright (C) ebIX (2010). All Rights Reserved.");
      return _constant;
    }
  }.apply();
  
  public final Constant disclaimer = new Function0<Constant>() {
    public Constant apply() {
      CharSequence _defaultDisclaimerText = Constants.this.defaultDisclaimerText();
      String _string = _defaultDisclaimerText.toString();
      Constant _constant = new Constant("Disclaimer", _string);
      return _constant;
    }
  }.apply();
  
  public final List<Constant> allConstants = new Function0<List<Constant>>() {
    public List<Constant> apply() {
      List<Constant> _xlistliteral = null;
      Builder<Constant> _builder = ImmutableList.builder();
      _builder.add(Constants.this.schemaAgency);
      _builder.add(Constants.this.copyright);
      _builder.add(Constants.this.disclaimer);
      _xlistliteral = _builder.build();
      return _xlistliteral;
    }
  }.apply();
  
  private String schemaLocation;
  
  public String schemaVersion() {
    String _plus = (this.schemaMajorVersion.value + ".");
    String _plus_1 = (_plus + this.schemaMinorVersion.value);
    String _plus_2 = (_plus_1 + ".");
    String _plus_3 = (_plus_2 + this.schemaRevision.value);
    return _plus_3;
  }
  
  public String schemaDate() {
    return this.schemaDate.schemaDate();
  }
  
  public String schemaLocation() {
    return this.schemaLocation;
  }
  
  public String setSchemaLocation(final String schemaLocation) {
    String _schemaLocation = this.schemaLocation = schemaLocation;
    return _schemaLocation;
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
