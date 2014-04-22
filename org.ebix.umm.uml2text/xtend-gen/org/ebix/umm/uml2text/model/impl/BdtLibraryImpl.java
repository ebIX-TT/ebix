package org.ebix.umm.uml2text.model.impl;

import org.ebix.umm.uml2text.UmmStereotype;
import org.ebix.umm.uml2text.model.BdtLibrary;
import org.ebix.umm.uml2text.model.impl.LibraryImpl;

@SuppressWarnings("all")
public class BdtLibraryImpl extends LibraryImpl implements BdtLibrary {
  public BdtLibraryImpl(final UmmStereotype ummStereotype) {
    super(ummStereotype);
  }
  
  public boolean isBdtLibrary(final org.eclipse.uml2.uml.Package umlPackage) {
    return this.ummStereotype.hasStereotype(umlPackage);
  }
  
  public org.eclipse.uml2.uml.Package cefactVersion(final org.eclipse.uml2.uml.Package umlPackage) {
    Object _value = this.ummStereotype.getValue(umlPackage, "Cefact version");
    return ((org.eclipse.uml2.uml.Package) _value);
  }
}
