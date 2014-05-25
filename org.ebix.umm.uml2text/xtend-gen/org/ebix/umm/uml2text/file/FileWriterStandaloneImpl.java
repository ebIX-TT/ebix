/**
 * UMM Schema Generator
 *  Copyright (C) 2014  ebIX, the European forum for energy Business Information eXchange.
 * 
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 * 
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 * 
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
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
      final PrintWriter printWriter = new PrintWriter(fileName);
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
      final File file = new File(fileName);
      File _parentFile = file.getParentFile();
      _xblockexpression = _parentFile.mkdirs();
    }
    return _xblockexpression;
  }
  
  public void writeFile(final String fileName, final byte[] contents) {
    try {
      this.makeDirectories(fileName);
      final FileOutputStream fileOutputStream = new FileOutputStream(fileName);
      fileOutputStream.write(contents);
      fileOutputStream.close();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
