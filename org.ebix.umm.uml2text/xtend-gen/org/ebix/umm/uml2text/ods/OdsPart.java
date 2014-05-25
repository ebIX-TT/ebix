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
package org.ebix.umm.uml2text.ods;

import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public abstract class OdsPart {
  public void add(final ZipOutputStream zos) {
    try {
      String _fileName = this.fileName();
      final ZipEntry zipEntry = new ZipEntry(_fileName);
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
