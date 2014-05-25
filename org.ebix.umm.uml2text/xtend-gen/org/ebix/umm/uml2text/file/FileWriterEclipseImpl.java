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

import java.io.ByteArrayInputStream;
import java.io.StringBufferInputStream;
import java.util.List;
import org.ebix.umm.uml2text.file.FileWriter;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class FileWriterEclipseImpl implements FileWriter {
  private IProject project;
  
  public FileWriterEclipseImpl(final IProject project) {
    this.project = project;
  }
  
  public void writeFile(final String fileName, final CharSequence contents) {
    try {
      final IFile file = this.project.getFile(fileName);
      this.makeDirectories(this.project, file);
      String _string = contents.toString();
      StringBufferInputStream _stringBufferInputStream = new StringBufferInputStream(_string);
      file.create(_stringBufferInputStream, IResource.DERIVED, null);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void makeDirectories(final IProject project, final IFile file) {
    try {
      IPath _fullPath = file.getFullPath();
      final String[] segments = _fullPath.segments();
      String name = "";
      int _size = ((List<String>)Conversions.doWrapArray(segments)).size();
      int _minus = (_size - 1);
      List<String> _subList = ((List<String>)Conversions.doWrapArray(segments)).subList(1, _minus);
      for (final String segment : _subList) {
        {
          name = ((name + "/") + segment);
          final IFolder folder = project.getFolder(name);
          String _string = folder.toString();
          String _plus = ("checking: " + _string);
          InputOutput.<String>println(_plus);
          boolean _exists = folder.exists();
          boolean _not = (!_exists);
          if (_not) {
            String _string_1 = folder.toString();
            String _plus_1 = ("creating: " + _string_1);
            InputOutput.<String>println(_plus_1);
            folder.create(IResource.DERIVED, true, null);
          }
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void writeFile(final String fileName, final byte[] contents) {
    try {
      final IFile file = this.project.getFile(fileName);
      this.makeDirectories(this.project, file);
      final ByteArrayInputStream inputStream = new ByteArrayInputStream(contents);
      file.create(inputStream, IResource.DERIVED, null);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
