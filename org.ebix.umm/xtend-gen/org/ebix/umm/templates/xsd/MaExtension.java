package org.ebix.umm.templates.xsd;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.Arrays;
import org.ebix.umm.templates.xsd.AbieExtension;
import org.ebix.umm.umm.ABIE;
import org.ebix.umm.umm.ASMA;
import org.ebix.umm.umm.ASNONE;
import org.ebix.umm.umm.DocLibrary;
import org.ebix.umm.umm.MA;
import org.ebix.umm.umm.MAProperty;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class MaExtension {
  @Inject
  @Extension
  private AbieExtension abieExtension;
  
  public String fileName(final MA ma) {
    String _name = ma.getName();
    String _plus = ("ebIX_" + _name);
    String _plus_1 = (_plus + "_");
    DocLibrary _library = this.library(ma);
    String _versionIdentifier = _library.getVersionIdentifier();
    String _replaceAll = _versionIdentifier.replaceAll("\\.", "p");
    String _plus_2 = (_plus_1 + _replaceAll);
    return (_plus_2 + ".xsd");
  }
  
  public String fileName(final MA ma, final String directory) {
    String _plus = (directory + "/");
    String _fileName = this.fileName(ma);
    return (_plus + _fileName);
  }
  
  public DocLibrary library(final MA ma) {
    EObject _eContainer = ma.eContainer();
    EObject _eContainer_1 = _eContainer.eContainer();
    return ((DocLibrary) _eContainer_1);
  }
  
  public String namespace(final MA ma, final MA otherMa) {
    DocLibrary _library = this.library(ma);
    String namespace = _library.getBaseURN();
    boolean _notEquals = (!Objects.equal(otherMa, null));
    if (_notEquals) {
      String _plus = (namespace + "-");
      String _name = otherMa.getName();
      String _plus_1 = (_plus + _name);
      namespace = _plus_1;
    }
    return namespace;
  }
  
  public String xsdName(final MA ma) {
    return ma.getName();
  }
  
  public String xsdType(final MA ma) {
    String _xsdName = this.xsdName(ma);
    return (_xsdName + "Type");
  }
  
  protected String _xsdRoleName(final ASMA asma) {
    String _name = asma.getName();
    ABIE _type = asma.getType();
    String _xsdName = this.abieExtension.xsdName(_type);
    return (_name + _xsdName);
  }
  
  protected String _xsdRoleName(final ASNONE asnone) {
    return asnone.getName();
  }
  
  public String xsdRoleName(final MAProperty asma) {
    if (asma instanceof ASMA) {
      return _xsdRoleName((ASMA)asma);
    } else if (asma instanceof ASNONE) {
      return _xsdRoleName((ASNONE)asma);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(asma).toString());
    }
  }
}
