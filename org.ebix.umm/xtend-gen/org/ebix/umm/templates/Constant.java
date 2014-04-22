package org.ebix.umm.templates;

@SuppressWarnings("all")
public class Constant {
  public String name;
  
  public String defaultValue;
  
  public String value;
  
  public Constant(final String name, final String value) {
    this.name = name;
    this.defaultValue = value;
    this.value = value;
  }
}
