package org.ebix.umm.uml2text;

@SuppressWarnings("all")
public class ConstraintKind {
  private String name;
  
  private String listIdentifier;
  
  private String responsibleAgency;
  
  public ConstraintKind(final String name, final String listIdentifier, final String responsibleAgency) {
    this.name = name;
    this.listIdentifier = listIdentifier;
    this.responsibleAgency = responsibleAgency;
  }
  
  public String getName() {
    return this.name;
  }
  
  public String getListIdentifier() {
    return this.listIdentifier;
  }
  
  public String getResponsibleAgency() {
    return this.responsibleAgency;
  }
}
