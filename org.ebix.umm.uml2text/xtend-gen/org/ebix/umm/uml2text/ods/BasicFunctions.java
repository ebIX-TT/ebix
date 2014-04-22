package org.ebix.umm.uml2text.ods;

import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class BasicFunctions {
  public static CharSequence openHeaderRow() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<table:table-row table:style-name=\"rheader\">");
    _builder.newLine();
    return _builder;
  }
  
  public static CharSequence closeHeaderRow() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("</table:table-row>");
    _builder.newLine();
    return _builder;
  }
  
  public static CharSequence headerCell(final String... names) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final String name : names) {
        _builder.append("<table:table-cell table:style-name=\"cheader\" office:value-type=\"string\"><text:p>");
        _builder.append(name, "");
        _builder.append("</text:p></table:table-cell>");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public static CharSequence openRow(final String styleName) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<table:table-row table:style-name=\"");
    _builder.append(styleName, "");
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public static CharSequence closeRow() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("</table:table-row>");
    _builder.newLine();
    return _builder;
  }
  
  public static CharSequence cell(final String styleName, final String content) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<table:table-cell table:style-name=\"");
    _builder.append(styleName, "");
    _builder.append("\" office:value-type=\"string\"><text:p>");
    _builder.append(content, "");
    _builder.append("</text:p></table:table-cell>");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
}
