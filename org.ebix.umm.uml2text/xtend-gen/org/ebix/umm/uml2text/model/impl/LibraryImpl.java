package org.ebix.umm.uml2text.model.impl;

import java.util.List;
import org.ebix.umm.uml2text.UmmStereotype;
import org.ebix.umm.uml2text.model.Library;

@SuppressWarnings("all")
public abstract class LibraryImpl implements Library {
  protected UmmStereotype ummStereotype;
  
  public LibraryImpl(final UmmStereotype ummStereotype) {
    this.ummStereotype = ummStereotype;
  }
  
  public String baseURN(final org.eclipse.uml2.uml.Package umlPackage) {
    String _stringValue = this.ummStereotype.getStringValue(umlPackage, "baseURN");
    return _stringValue;
  }
  
  public List<String> businessTerm(final org.eclipse.uml2.uml.Package umlPackage) {
    List<String> _listOfStringValue = this.ummStereotype.getListOfStringValue(umlPackage, "businessTerm");
    return _listOfStringValue;
  }
  
  public List<String> copyright(final org.eclipse.uml2.uml.Package umlPackage) {
    List<String> _listOfStringValue = this.ummStereotype.getListOfStringValue(umlPackage, "copyright");
    return _listOfStringValue;
  }
  
  public List<String> owner(final org.eclipse.uml2.uml.Package umlPackage) {
    List<String> _listOfStringValue = this.ummStereotype.getListOfStringValue(umlPackage, "owner");
    return _listOfStringValue;
  }
  
  public List<String> reference(final org.eclipse.uml2.uml.Package umlPackage) {
    List<String> _listOfStringValue = this.ummStereotype.getListOfStringValue(umlPackage, "reference");
    return _listOfStringValue;
  }
  
  public String status(final org.eclipse.uml2.uml.Package umlPackage) {
    String _stringValue = this.ummStereotype.getStringValue(umlPackage, "status");
    return _stringValue;
  }
  
  public String uniqueIdentifier(final org.eclipse.uml2.uml.Package umlPackage) {
    String _stringValue = this.ummStereotype.getStringValue(umlPackage, "uniqueIdentifier");
    return _stringValue;
  }
  
  public String versionIdentifier(final org.eclipse.uml2.uml.Package umlPackage) {
    String _stringValue = this.ummStereotype.getStringValue(umlPackage, "versionIdentifier");
    return _stringValue;
  }
  
  public String namespacePrefix(final org.eclipse.uml2.uml.Package umlPackage) {
    String _stringValue = this.ummStereotype.getStringValue(umlPackage, "namespacePrefix");
    return _stringValue;
  }
}
