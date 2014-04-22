package org.ebix.umm.uml2text.model;

import java.util.List;
import org.eclipse.uml2.uml.Association;

@SuppressWarnings("all")
public interface ASCC {
  public abstract List<String> businessTerm(final Association umlAssociation);
  
  public abstract String definition(final Association umlAssociation);
  
  public abstract String dictionaryEntryName(final Association umlAssociation);
  
  public abstract String uniqueIdentifier(final Association umlAssociation);
  
  public abstract String versionIdentifier(final Association umlAssociation);
  
  public abstract String sequencingKey(final Association umlAssociation);
}
