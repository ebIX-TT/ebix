package org.ebix.umm.uml2text.model;

import org.ebix.umm.uml2text.model.Library;

@SuppressWarnings("all")
public interface BieLibrary extends Library {
  public abstract boolean isBieLibrary(final org.eclipse.uml2.uml.Package umlPackage);
  
  public abstract org.eclipse.uml2.uml.Package bdtVersion(final org.eclipse.uml2.uml.Package umlPackage);
  
  public abstract org.eclipse.uml2.uml.Package cefactVersion(final org.eclipse.uml2.uml.Package umlPackage);
  
  public abstract String unsm(final org.eclipse.uml2.uml.Package umlPackage);
}
