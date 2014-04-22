package org.ebix.umm.templates;

import java.util.Date;
import java.util.Locale;

import java.text.DateFormat;

/**
 * Current date to include in generated schemas.
 */
public class SchemaDate
{
  public SchemaDate() {
	  
  }

  final static private Date NOW = new Date();
  
  public String schemaDate()
  {
	  return DateFormat.getDateInstance(DateFormat.LONG, Locale.ENGLISH).format(NOW);
  }
  
}
