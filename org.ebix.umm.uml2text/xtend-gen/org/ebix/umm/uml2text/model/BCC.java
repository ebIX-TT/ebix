package org.ebix.umm.uml2text.model;

import java.util.List;
import org.eclipse.uml2.uml.Property;

@SuppressWarnings("all")
public interface BCC {
  public abstract List<String> businessTerm(final Property umlProperty);
  
  public abstract String definition(final Property umlProperty);
  
  public abstract String dictionaryEntryName(final Property umlProperty);
  
  public abstract String uniqueIdentifier(final Property umlProperty);
  
  public abstract String versionIdentifier(final Property umlProperty);
  
  public abstract String sequencingKey(final Property umlProperty);
}
