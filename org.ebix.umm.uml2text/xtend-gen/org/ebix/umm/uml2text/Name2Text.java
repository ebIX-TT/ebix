package org.ebix.umm.uml2text;

import org.eclipse.emf.common.util.URI;

@SuppressWarnings("all")
public class Name2Text {
  private final String GENERATED_CODE_DIR = "model-text/";
  
  public String fileName(final String name) {
    String _replaceAll = name.replaceAll("::", "/");
    String _replaceAll_1 = _replaceAll.replaceAll(":", "/");
    String _plus = (this.GENERATED_CODE_DIR + _replaceAll_1);
    return (_plus + ".umm");
  }
  
  public String fileName(final URI file) {
    String _lastSegment = file.lastSegment();
    String _fileExtension = file.fileExtension();
    String _replaceAll = _lastSegment.replaceAll(_fileExtension, "ods");
    return (this.GENERATED_CODE_DIR + _replaceAll);
  }
}
