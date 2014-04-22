package org.ebix.umm.uml2text.model;

import org.ebix.umm.uml2text.model.Library;

@SuppressWarnings("all")
public interface CdtLibrary extends Library {
  public abstract boolean isCdtLibrary(final org.eclipse.uml2.uml.Package umlPackage);
}
