package org.ebix.umm.uml2text.builder;

import com.google.common.base.Objects;
import java.util.Map;
import org.ebix.umm.uml2text.Uml2Text;
import org.ebix.umm.uml2text.UmmStereotype;
import org.ebix.umm.uml2text.UmmStereotypes;
import org.ebix.umm.uml2text.file.FileWriterEclipseImpl;
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
  protected IProject[] build(final int kind, final Map<String,String> args, final IProgressMonitor monitor) throws CoreException {
    String _plus = ("Umm building, kind = " + Integer.valueOf(kind));
    InputOutput.<String>println(_plus);
    boolean _equals = (kind == IncrementalProjectBuilder.FULL_BUILD);
    if (_equals) {
      IProject _project = this.getProject();
      final IFolder modelFolder = _project.getFolder("uml");
      IResource[] _members = modelFolder.members();
      for (final IResource resource : _members) {
        boolean _and = false;
        String _fileExtension = resource.getFileExtension();
        boolean _equals_1 = _fileExtension.equals("uml");
        if (!_equals_1) {
          _and = false;
        } else {
          IPath _fullPath = resource.getFullPath();
          String _portableString = _fullPath.toPortableString();
          boolean _endsWith = _portableString.endsWith("profile.uml");
          boolean _not = (!_endsWith);
          _and = (_equals_1 && _not);
        }
        if (_and) {
          IPath _fullPath_1 = resource.getFullPath();
          IPath _makeAbsolute = _fullPath_1.makeAbsolute();
          String _portableString_1 = _makeAbsolute.toPortableString();
          String _plus_1 = ("UML resource: " + _portableString_1);
          InputOutput.<String>println(_plus_1);
          IPath _fullPath_2 = resource.getFullPath();
          String _string = _fullPath_2.toString();
          final URI uri = URI.createPlatformResourceURI(_string, true);
          Uml2Text _uml2Text = new Uml2Text();
          final Uml2Text uml2text = _uml2Text;
          IProject _project_1 = this.getProject();
          this.applyStereotypeSettings(_project_1, uml2text.ummStereotypes);
          IProject _project_2 = this.getProject();
          FileWriterEclipseImpl _fileWriterEclipseImpl = new FileWriterEclipseImpl(_project_2);
          final FileWriterEclipseImpl fw = _fileWriterEclipseImpl;
          ResourceSetImpl _resourceSetImpl = new ResourceSetImpl();
          final ResourceSetImpl rs = _resourceSetImpl;
          uml2text.processFile(uri, rs, fw);
        }
      }
    }
    return null;
  }
  
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
    ProjectScope _projectScope = new ProjectScope(project);
    final ProjectScope projectScope = _projectScope;
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
