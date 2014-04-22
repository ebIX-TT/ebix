package org.ebix.umm.uml2text.model.impl;

import java.util.List;
import org.ebix.umm.uml2text.UmmStereotype;
import org.ebix.umm.uml2text.model.BDT;

@SuppressWarnings("all")
public class BDTImpl implements BDT {
  protected UmmStereotype ummStereotype;
  
  public BDTImpl(final UmmStereotype ummStereotype) {
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
  
  public String languageCode(final org.eclipse.uml2.uml.Class umlClass) {
    String _stringValue = this.ummStereotype.getStringValue(umlClass, "languageCode");
    return _stringValue;
  }
  
  public List<String> usageRule(final org.eclipse.uml2.uml.Class umlClass) {
    List<String> _listOfStringValue = this.ummStereotype.getListOfStringValue(umlClass, "usageRule");
    return _listOfStringValue;
  }
}
