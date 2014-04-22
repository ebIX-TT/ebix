package org.ebix.umm.uml2text;

@SuppressWarnings("all")
public class Comment2Text {
  public String strip(final String comment) {
    boolean _contains = comment.contains("<html>");
    if (_contains) {
      String _replaceAll = comment.replaceAll("<html>", "");
      String _replaceAll_1 = _replaceAll.replaceAll("</html>", "");
      String _replaceAll_2 = _replaceAll_1.replaceAll("<head>", "");
      String _replaceAll_3 = _replaceAll_2.replaceAll("</head>", "");
      String _replaceAll_4 = _replaceAll_3.replaceAll("<body>", "");
      String _replaceAll_5 = _replaceAll_4.replaceAll("</body>", "");
      String _replaceAll_6 = _replaceAll_5.replaceAll("<p>", "");
      String _replaceAll_7 = _replaceAll_6.replaceAll("</p>", "");
      return _replaceAll_7.trim();
    } else {
      return comment;
    }
  }
}
