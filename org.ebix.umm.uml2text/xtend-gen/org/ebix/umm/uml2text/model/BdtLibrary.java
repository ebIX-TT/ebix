package org.ebix.umm.uml2text.model;

import org.ebix.umm.uml2text.model.Library;

@SuppressWarnings("all")
public interface BdtLibrary extends Library {
  public abstract boolean isBdtLibrary(final org.eclipse.uml2.uml.Package umlPackage);
  
  public abstract org.eclipse.uml2.uml.Package cefactVersion(final org.eclipse.uml2.uml.Package umlPackage);
}
