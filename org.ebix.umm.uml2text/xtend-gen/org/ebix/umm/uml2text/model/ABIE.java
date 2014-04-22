package org.ebix.umm.uml2text.model;

import java.util.List;

@SuppressWarnings("all")
public interface ABIE {
  public abstract List<String> businessTerm(final org.eclipse.uml2.uml.Class umlClass);
  
  public abstract String definition(final org.eclipse.uml2.uml.Class umlClass);
  
  public abstract String dictionaryEntryName(final org.eclipse.uml2.uml.Class umlClass);
  
  public abstract String languageCode(final org.eclipse.uml2.uml.Class umlClass);
  
  public abstract String uniqueIdentifier(final org.eclipse.uml2.uml.Class umlClass);
  
  public abstract String versionIdentifier(final org.eclipse.uml2.uml.Class umlClass);
  
  public abstract List<String> usageRule(final org.eclipse.uml2.uml.Class umlClass);
}
