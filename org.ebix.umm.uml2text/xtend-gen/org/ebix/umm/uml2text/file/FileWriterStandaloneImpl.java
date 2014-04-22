package org.ebix.umm.uml2text.file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import org.ebix.umm.uml2text.file.FileWriter;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class FileWriterStandaloneImpl implements FileWriter {
  public void writeFile(final String fileName, final CharSequence contents) {
    try {
      this.makeDirectories(fileName);
      PrintWriter _printWriter = new PrintWriter(fileName);
      final PrintWriter printWriter = _printWriter;
      String _string = contents.toString();
      printWriter.write(_string);
      printWriter.close();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private boolean makeDirectories(final String fileName) {
    boolean _xblockexpression = false;
    {
      File _file = new File(fileName);
      final File file = _file;
      File _parentFile = file.getParentFile();
      boolean _mkdirs = _parentFile.mkdirs();
      _xblockexpression = (_mkdirs);
    }
    return _xblockexpression;
  }
  
  public void writeFile(final String fileName, final byte[] contents) {
    try {
      this.makeDirectories(fileName);
      FileOutputStream _fileOutputStream = new FileOutputStream(fileName);
      final FileOutputStream fileOutputStream = _fileOutputStream;
      fileOutputStream.write(contents);
      fileOutputStream.close();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
