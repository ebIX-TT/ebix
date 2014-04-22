package org.ebix.umm.uml2text.ods;

import org.ebix.umm.uml2text.ods.OdsPart;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class Manifest extends OdsPart {
  public String fileName() {
    return "META-INF/manifest.xml";
  }
  
  public String content() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
    _builder.newLine();
    _builder.append("<manifest:manifest xmlns:manifest=\"urn:oasis:names:tc:opendocument:xmlns:manifest:1.0\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<manifest:file-entry manifest:media-type=\"application/vnd.oasis.opendocument.spreadsheet\" manifest:full-path=\"/\"/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<manifest:file-entry manifest:media-type=\"text/xml\" manifest:full-path=\"meta.xml\"/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<manifest:file-entry manifest:media-type=\"text/xml\" manifest:full-path=\"content.xml\"/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<manifest:file-entry manifest:media-type=\"text/xml\" manifest:full-path=\"styles.xml\"/>");
    _builder.newLine();
    _builder.append("</manifest:manifest>");
    _builder.newLine();
    return _builder.toString();
  }
}
