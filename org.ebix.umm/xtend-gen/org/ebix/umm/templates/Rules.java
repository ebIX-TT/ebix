package org.ebix.umm.templates;

@SuppressWarnings("all")
public class Rules {
  public String typeNameRule(final String name) {
    return name.replaceAll("_", "");
  }
}
