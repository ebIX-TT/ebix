package org.ebix.umm.uml2text.model.impl;

import java.util.List;
import org.ebix.umm.uml2text.UmmStereotype;
import org.ebix.umm.uml2text.model.ASBIE;
import org.eclipse.uml2.uml.Association;

@SuppressWarnings("all")
public class ASBIEImpl implements ASBIE {
  protected UmmStereotype ummStereotype;
  
  public ASBIEImpl(final UmmStereotype ummStereotype) {
    this.ummStereotype = ummStereotype;
  }
  
  public List<String> businessTerm(final Association umlAssociation) {
    List<String> _listOfStringValue = this.ummStereotype.getListOfStringValue(umlAssociation, "businessTerm");
    return _listOfStringValue;
  }
  
  public String uniqueIdentifier(final Association umlAssociation) {
    String _stringValue = this.ummStereotype.getStringValue(umlAssociation, "uniqueIdentifier");
    return _stringValue;
  }
  
  public String versionIdentifier(final Association umlAssociation) {
    String _stringValue = this.ummStereotype.getStringValue(umlAssociation, "versionIdentifier");
    return _stringValue;
  }
  
  public String definition(final Association umlAssociation) {
    String _stringValue = this.ummStereotype.getStringValue(umlAssociation, "definition");
    return _stringValue;
  }
  
  public String dictionaryEntryName(final Association umlAssociation) {
    String _stringValue = this.ummStereotype.getStringValue(umlAssociation, "dictionaryEntryName");
    return _stringValue;
  }
  
  public String languageCode(final Association umlAssociation) {
    String _stringValue = this.ummStereotype.getStringValue(umlAssociation, "languageCode");
    return _stringValue;
  }
  
  public List<String> usageRule(final Association umlAssociation) {
    List<String> _listOfStringValue = this.ummStereotype.getListOfStringValue(umlAssociation, "usageRule");
    return _listOfStringValue;
  }
  
  public String sequencingKey(final Association umlAssociation) {
    String _stringValue = this.ummStereotype.getStringValue(umlAssociation, "sequencingKey");
    return _stringValue;
  }
}
