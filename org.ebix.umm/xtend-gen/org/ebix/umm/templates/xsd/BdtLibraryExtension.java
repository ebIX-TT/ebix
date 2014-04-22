package org.ebix.umm.templates.xsd;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.ebix.umm.templates.xsd.EnumExtension;
import org.ebix.umm.umm.Assembled;
import org.ebix.umm.umm.AssembledBase;
import org.ebix.umm.umm.BDT;
import org.ebix.umm.umm.BDTLibrary;
import org.ebix.umm.umm.BDTProperty;
import org.ebix.umm.umm.MA;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class BdtLibraryExtension {
  @Inject
  @Extension
  private EnumExtension enumExtension;
  
  public String fileName(final BDTLibrary library) {
    String _versionIdentifier = library.getVersionIdentifier();
    String _replaceAll = _versionIdentifier.replaceAll("\\.", "p");
    String _plus = ("ebIX_BusinessDataType_" + _replaceAll);
    return (_plus + ".xsd");
  }
  
  public String fileName(final BDTLibrary library, final String directory) {
    String _plus = (directory + "/");
    String _fileName = this.fileName(library);
    return (_plus + _fileName);
  }
  
  public String namespace(final BDTLibrary library, final MA ma) {
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
  
  public List<Assembled> allReferencedCodelists(final BDTLibrary library) {
    ArrayList<Assembled> _arrayList = new ArrayList<Assembled>();
    List<Assembled> referenced = _arrayList;
    EList<BDT> _bdts = library.getBdts();
    for (final BDT bdt : _bdts) {
      EList<BDTProperty> _properties = bdt.getProperties();
      for (final BDTProperty property : _properties) {
        AssembledBase _type = property.getType();
        if ((_type instanceof Assembled)) {
          AssembledBase _type_1 = property.getType();
          referenced.add(((Assembled) _type_1));
        }
      }
    }
    final Comparator<Assembled> _function = new Comparator<Assembled>() {
        public int compare(final Assembled a1, final Assembled a2) {
          String _fileName = BdtLibraryExtension.this.enumExtension.fileName(a1);
          String _fileName_1 = BdtLibraryExtension.this.enumExtension.fileName(a2);
          int _compareTo = _fileName.compareTo(_fileName_1);
          return _compareTo;
        }
      };
    Collections.<Assembled>sort(referenced, _function);
    return referenced;
  }
}
