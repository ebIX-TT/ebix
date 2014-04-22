package org.ebix.umm.uml2text.model;

import java.util.List;

@SuppressWarnings("all")
public interface Library {
  /**
   * from bLibrary:
   */
  public abstract List<String> businessTerm(final org.eclipse.uml2.uml.Package umlPackage);
  
  public abstract List<String> copyright(final org.eclipse.uml2.uml.Package umlPackage);
  
  public abstract List<String> owner(final org.eclipse.uml2.uml.Package umlPackage);
  
  public abstract List<String> reference(final org.eclipse.uml2.uml.Package umlPackage);
  
  public abstract String status(final org.eclipse.uml2.uml.Package umlPackage);
  
  public abstract String uniqueIdentifier(final org.eclipse.uml2.uml.Package umlPackage);
  
  public abstract String versionIdentifier(final org.eclipse.uml2.uml.Package umlPackage);
  
  /**
   * from BIELibrary, BDTLibrary, DocLibrary, and ENUMLibrary:
   */
  public abstract String baseURN(final org.eclipse.uml2.uml.Package umlPackage);
  
  public abstract String namespacePrefix(final org.eclipse.uml2.uml.Package umlPackage);
}
