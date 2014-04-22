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
          String _plus = (name + "/");
          String _plus_1 = (_plus + segment);
          name = _plus_1;
          final IFolder folder = project.getFolder(name);
          String _string = folder.toString();
          String _plus_2 = ("checking: " + _string);
          InputOutput.<String>println(_plus_2);
          boolean _exists = folder.exists();
          boolean _not = (!_exists);
          if (_not) {
            String _string_1 = folder.toString();
            String _plus_3 = ("creating: " + _string_1);
            InputOutput.<String>println(_plus_3);
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
      ByteArrayInputStream _byteArrayInputStream = new ByteArrayInputStream(contents);
      final ByteArrayInputStream inputStream = _byteArrayInputStream;
      file.create(inputStream, IResource.DERIVED, null);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
