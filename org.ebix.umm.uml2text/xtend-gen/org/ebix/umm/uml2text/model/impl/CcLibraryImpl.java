package org.ebix.umm.uml2text.model.impl;

import org.ebix.umm.uml2text.UmmStereotype;
import org.ebix.umm.uml2text.model.CcLibrary;
import org.ebix.umm.uml2text.model.impl.LibraryImpl;

@SuppressWarnings("all")
public class CcLibraryImpl extends LibraryImpl implements CcLibrary {
  public CcLibraryImpl(final UmmStereotype ummStereotype) {
    super(ummStereotype);
  }
  
  public boolean isCcLibrary(final org.eclipse.uml2.uml.Package umlPackage) {
    return this.ummStereotype.hasStereotype(umlPackage);
  }
}
