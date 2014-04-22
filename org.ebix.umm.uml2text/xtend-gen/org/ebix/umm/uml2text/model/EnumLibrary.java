package org.ebix.umm.uml2text.model;

import org.ebix.umm.uml2text.model.Library;

@SuppressWarnings("all")
public interface EnumLibrary extends Library {
  public abstract boolean isEnumLibrary(final org.eclipse.uml2.uml.Package umlPackage);
}
