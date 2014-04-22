package org.ebix.umm.uml2text.ods;

import org.ebix.umm.uml2text.ods.OdsPart;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class Mimetype extends OdsPart {
  public String fileName() {
    return "mimetype";
  }
  
  public String content() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("application/vnd.oasis.opendocument.spreadsheet");
    return _builder.toString();
  }
}
