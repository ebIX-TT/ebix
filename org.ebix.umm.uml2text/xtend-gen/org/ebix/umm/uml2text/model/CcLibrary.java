package org.ebix.umm.uml2text.model;

import org.ebix.umm.uml2text.model.Library;

@SuppressWarnings("all")
public interface CcLibrary extends Library {
  public abstract boolean isCcLibrary(final org.eclipse.uml2.uml.Package umlPackage);
}
