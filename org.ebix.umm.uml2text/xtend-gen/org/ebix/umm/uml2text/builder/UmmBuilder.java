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
package org.ebix.umm.uml2text.builder;

import com.google.common.base.Objects;
import java.util.Date;
import java.util.Map;
import org.ebix.umm.uml2text.Uml2Text;
import org.ebix.umm.uml2text.UmmStereotype;
import org.ebix.umm.uml2text.UmmStereotypes;
import org.ebix.umm.uml2text.file.FileWriterEclipseImpl;
import org.ebix.umm.uml2text.file.Utf8ToAsciiConverter;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ProjectScope;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class UmmBuilder extends IncrementalProjectBuilder {
  @Override
  protected IProject[] build(final int kind, final Map<String, String> args, final IProgressMonitor monitor) throws CoreException {
    InputOutput.<String>println(("Umm building, kind = " + Integer.valueOf(kind)));
    if ((kind == IncrementalProjectBuilder.FULL_BUILD)) {
      IProject _project = this.getProject();
      final IFolder modelFolder = _project.getFolder("uml");
      final Utf8ToAsciiConverter asciiConverter = new Utf8ToAsciiConverter();
      final Date backUpDate = new Date();
      IResource[] _members = modelFolder.members();
      for (final IResource resource : _members) {
        {
          IPath _location = resource.getLocation();
          String _string = _location.toString();
          asciiConverter.escapeUtf8CharactersFromFile(_string, backUpDate);
          boolean _and = false;
          String _fileExtension = resource.getFileExtension();
          boolean _equals = _fileExtension.equals("uml");
          if (!_equals) {
            _and = false;
          } else {
            IPath _fullPath = resource.getFullPath();
            String _portableString = _fullPath.toPortableString();
            boolean _endsWith = _portableString.endsWith("profile.uml");
            boolean _not = (!_endsWith);
            _and = _not;
          }
          if (_and) {
            IPath _fullPath_1 = resource.getFullPath();
            IPath _makeAbsolute = _fullPath_1.makeAbsolute();
            String _portableString_1 = _makeAbsolute.toPortableString();
            String _plus = ("UML resource: " + _portableString_1);
            InputOutput.<String>println(_plus);
            IPath _fullPath_2 = resource.getFullPath();
            String _string_1 = _fullPath_2.toString();
            final URI uri = URI.createPlatformResourceURI(_string_1, true);
            final Uml2Text uml2text = new Uml2Text();
            IProject _project_1 = this.getProject();
            this.applyStereotypeSettings(_project_1, uml2text.ummStereotypes);
            IProject _project_2 = this.getProject();
            final FileWriterEclipseImpl fw = new FileWriterEclipseImpl(_project_2);
            final ResourceSetImpl rs = new ResourceSetImpl();
            uml2text.processFile(uri, rs, fw);
          }
        }
      }
    }
    return null;
  }
  
  @Override
  protected void clean(final IProgressMonitor monitor) throws CoreException {
    InputOutput.<String>println("Umm cleaning");
    IProject _project = this.getProject();
    final IFolder ummTextFolder = _project.getFolder("model-text");
    IResource[] _members = ummTextFolder.members();
    for (final IResource resource : _members) {
      resource.delete(IResource.KEEP_HISTORY, monitor);
    }
  }
  
  private void applyStereotypeSettings(final IProject project, final UmmStereotypes ummStereotypes) {
    InputOutput.<String>println("Getting settings");
    final ProjectScope projectScope = new ProjectScope(project);
    final IEclipsePreferences projectNode = projectScope.getNode("org.ebix.umm.uml2text");
    boolean _notEquals = (!Objects.equal(projectNode, null));
    if (_notEquals) {
      for (final UmmStereotype st : ummStereotypes.allStereotypes) {
        {
          final String value = projectNode.get(st.shortName, st.qualifiedName);
          st.qualifiedName = value;
        }
      }
    }
  }
}
