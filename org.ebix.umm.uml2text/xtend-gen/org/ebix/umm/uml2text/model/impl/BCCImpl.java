package org.ebix.umm.uml2text.model.impl;

import java.util.List;
import org.ebix.umm.uml2text.UmmStereotype;
import org.ebix.umm.uml2text.model.BCC;
import org.eclipse.uml2.uml.Property;

@SuppressWarnings("all")
public class BCCImpl implements BCC {
  protected UmmStereotype ummStereotype;
  
  public BCCImpl(final UmmStereotype ummStereotype) {
    this.ummStereotype = ummStereotype;
  }
  
  public List<String> businessTerm(final Property umlProperty) {
    List<String> _listOfStringValue = this.ummStereotype.getListOfStringValue(umlProperty, "businessTerm");
    return _listOfStringValue;
  }
  
  public String uniqueIdentifier(final Property umlProperty) {
    String _stringValue = this.ummStereotype.getStringValue(umlProperty, "uniqueIdentifier");
    return _stringValue;
  }
  
  public String versionIdentifier(final Property umlProperty) {
    String _stringValue = this.ummStereotype.getStringValue(umlProperty, "versionIdentifier");
    return _stringValue;
  }
  
  public String definition(final Property umlProperty) {
    String _stringValue = this.ummStereotype.getStringValue(umlProperty, "definition");
    return _stringValue;
  }
  
  public String dictionaryEntryName(final Property umlProperty) {
    String _stringValue = this.ummStereotype.getStringValue(umlProperty, "dictionaryEntryName");
    return _stringValue;
  }
  
  public String sequencingKey(final Property umlProperty) {
    String _stringValue = this.ummStereotype.getStringValue(umlProperty, "sequencingKey");
    return _stringValue;
  }
}
