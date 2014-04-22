package org.ebix.umm.uml2text.model.impl;

import org.ebix.umm.uml2text.UmmStereotype;
import org.ebix.umm.uml2text.model.CdtLibrary;
import org.ebix.umm.uml2text.model.impl.LibraryImpl;

@SuppressWarnings("all")
public class CdtLibraryImpl extends LibraryImpl implements CdtLibrary {
  public CdtLibraryImpl(final UmmStereotype ummStereotype) {
    super(ummStereotype);
  }
  
  public boolean isCdtLibrary(final org.eclipse.uml2.uml.Package umlPackage) {
    return this.ummStereotype.hasStereotype(umlPackage);
  }
}
