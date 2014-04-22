package org.ebix.umm.uml2text.model;

import org.ebix.umm.uml2text.model.Library;

@SuppressWarnings("all")
public interface DocLibrary extends Library {
  public abstract boolean isDocLibrary(final org.eclipse.uml2.uml.Package umlPackage);
  
  public abstract org.eclipse.uml2.uml.Package bdtVersion(final org.eclipse.uml2.uml.Package umlPackage);
  
  public abstract org.eclipse.uml2.uml.Package bieVersion(final org.eclipse.uml2.uml.Package umlPackage);
}
