package org.ebix.umm.uml2text.ods;

import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public abstract class OdsPart {
  public void add(final ZipOutputStream zos) {
    try {
      String _fileName = this.fileName();
      ZipEntry _zipEntry = new ZipEntry(_fileName);
      final ZipEntry zipEntry = _zipEntry;
      zos.putNextEntry(zipEntry);
      String _content = this.content();
      byte[] _bytes = _content.getBytes();
      zos.write(_bytes);
      zos.closeEntry();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public abstract String fileName();
  
  public abstract String content();
}
