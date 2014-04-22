package org.ebix.umm.uml2text.model.impl;

import java.util.List;
import org.ebix.umm.uml2text.UmmStereotype;
import org.ebix.umm.uml2text.model.CDT;

@SuppressWarnings("all")
public class CDTImpl implements CDT {
  protected UmmStereotype ummStereotype;
  
  public CDTImpl(final UmmStereotype ummStereotype) {
    this.ummStereotype = ummStereotype;
  }
  
  public List<String> businessTerm(final org.eclipse.uml2.uml.Class umlClass) {
    List<String> _listOfStringValue = this.ummStereotype.getListOfStringValue(umlClass, "businessTerm");
    return _listOfStringValue;
  }
  
  public String uniqueIdentifier(final org.eclipse.uml2.uml.Class umlClass) {
    String _stringValue = this.ummStereotype.getStringValue(umlClass, "uniqueIdentifier");
    return _stringValue;
  }
  
  public String versionIdentifier(final org.eclipse.uml2.uml.Class umlClass) {
    String _stringValue = this.ummStereotype.getStringValue(umlClass, "versionIdentifier");
    return _stringValue;
  }
  
  public String definition(final org.eclipse.uml2.uml.Class umlClass) {
    String _stringValue = this.ummStereotype.getStringValue(umlClass, "definition");
    return _stringValue;
  }
  
  public String dictionaryEntryName(final org.eclipse.uml2.uml.Class umlClass) {
    String _stringValue = this.ummStereotype.getStringValue(umlClass, "dictionaryEntryName");
    return _stringValue;
  }
}
