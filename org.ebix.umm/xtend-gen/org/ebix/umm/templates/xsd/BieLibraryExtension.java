package org.ebix.umm.templates.xsd;

import com.google.common.base.Objects;
import org.ebix.umm.umm.BIELibrary;
import org.ebix.umm.umm.MA;

@SuppressWarnings("all")
public class BieLibraryExtension {
  public String fileName(final BIELibrary library) {
    String _versionIdentifier = library.getVersionIdentifier();
    String _replaceAll = _versionIdentifier.replaceAll("\\.", "p");
    String _plus = ("ebIX_AggregatedBusinessInformationEntities_" + _replaceAll);
    return (_plus + ".xsd");
  }
  
  public String fileName(final BIELibrary library, final String directory) {
    String _plus = (directory + "/");
    String _fileName = this.fileName(library);
    String _plus_1 = (_plus + _fileName);
    return _plus_1;
  }
  
  public String namespace(final BIELibrary library, final MA ma) {
    String namespace = library.getBaseURN();
    boolean _notEquals = (!Objects.equal(ma, null));
    if (_notEquals) {
      String _plus = (namespace + "-");
      String _name = ma.getName();
      String _plus_1 = (_plus + _name);
      namespace = _plus_1;
    }
    return namespace;
  }
}
