package org.ebix.umm.uml2text.file;

@SuppressWarnings("all")
public interface FileWriter {
  public abstract void writeFile(final String fileName, final CharSequence contents);
  
  public abstract void writeFile(final String fileName, final byte[] contents);
}
