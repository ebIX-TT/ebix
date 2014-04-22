package org.ebix.umm.uml2text.model.impl;

import org.ebix.umm.uml2text.UmmStereotype;
import org.ebix.umm.uml2text.model.DocLibrary;
import org.ebix.umm.uml2text.model.impl.LibraryImpl;

@SuppressWarnings("all")
public class DocLibraryImpl extends LibraryImpl implements DocLibrary {
  public DocLibraryImpl(final UmmStereotype ummStereotype) {
    super(ummStereotype);
  }
  
  public boolean isDocLibrary(final org.eclipse.uml2.uml.Package umlPackage) {
    return this.ummStereotype.hasStereotype(umlPackage);
  }
  
  public org.eclipse.uml2.uml.Package bdtVersion(final org.eclipse.uml2.uml.Package umlPackage) {
    Object _value = this.ummStereotype.getValue(umlPackage, "eBDTversion");
    return ((org.eclipse.uml2.uml.Package) _value);
  }
  
  public org.eclipse.uml2.uml.Package bieVersion(final org.eclipse.uml2.uml.Package umlPackage) {
    Object _value = this.ummStereotype.getValue(umlPackage, "eBIEversion");
    return ((org.eclipse.uml2.uml.Package) _value);
  }
}
