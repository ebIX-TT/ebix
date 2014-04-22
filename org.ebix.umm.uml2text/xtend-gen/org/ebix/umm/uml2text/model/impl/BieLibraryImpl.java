package org.ebix.umm.uml2text.model.impl;

import org.ebix.umm.uml2text.UmmStereotype;
import org.ebix.umm.uml2text.model.BieLibrary;
import org.ebix.umm.uml2text.model.impl.LibraryImpl;

@SuppressWarnings("all")
public class BieLibraryImpl extends LibraryImpl implements BieLibrary {
  public BieLibraryImpl(final UmmStereotype ummStereotype) {
    super(ummStereotype);
  }
  
  public boolean isBieLibrary(final org.eclipse.uml2.uml.Package umlPackage) {
    return this.ummStereotype.hasStereotype(umlPackage);
  }
  
  public org.eclipse.uml2.uml.Package bdtVersion(final org.eclipse.uml2.uml.Package umlPackage) {
    Object _value = this.ummStereotype.getValue(umlPackage, "e-BDT version");
    return ((org.eclipse.uml2.uml.Package) _value);
  }
  
  public org.eclipse.uml2.uml.Package cefactVersion(final org.eclipse.uml2.uml.Package umlPackage) {
    Object _value = this.ummStereotype.getValue(umlPackage, "Cefact version");
    return ((org.eclipse.uml2.uml.Package) _value);
  }
  
  public String unsm(final org.eclipse.uml2.uml.Package umlPackage) {
    String _stringValue = this.ummStereotype.getStringValue(umlPackage, "UNSM");
    return _stringValue;
  }
}
