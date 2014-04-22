package org.ebix.umm.uml2text.preferences;

import com.google.common.base.Objects;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.ebix.umm.uml2text.UmmStereotype;
import org.ebix.umm.uml2text.UmmStereotypes;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ProjectScope;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.dialogs.PropertyPage;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.MapExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;

@SuppressWarnings("all")
public class UmmStereotypeProjectPropertiesPage extends PropertyPage {
  private Map<UmmStereotype,StringFieldEditor> editors = new Function0<Map<UmmStereotype,StringFieldEditor>>() {
    public Map<UmmStereotype,StringFieldEditor> apply() {
      HashMap<UmmStereotype,StringFieldEditor> _hashMap = new HashMap<UmmStereotype,StringFieldEditor>();
      return _hashMap;
    }
  }.apply();
  
  public UmmStereotypeProjectPropertiesPage() {
    InputOutput.<String>println("start of UmmStereotypeProjectPropertiesPage");
  }
  
  public Control createContents(final Composite parent) {
    IAdaptable _element = this.getElement();
    final IProject project = ((IProject) _element);
    String _plus = ("in create contents of " + project);
    InputOutput.<String>println(_plus);
    ProjectScope _projectScope = new ProjectScope(project);
    final ProjectScope projectScope = _projectScope;
    final IEclipsePreferences projectNode = projectScope.getNode("org.ebix.umm.uml2text");
    boolean _notEquals = (!Objects.equal(projectNode, null));
    if (_notEquals) {
      UmmStereotypes _ummStereotypes = new UmmStereotypes();
      final UmmStereotypes ummStereotypes = _ummStereotypes;
      for (final UmmStereotype st : ummStereotypes.allStereotypes) {
        {
          StringFieldEditor _stringFieldEditor = new StringFieldEditor(st.shortName, st.shortName, parent);
          final StringFieldEditor st_editor = _stringFieldEditor;
          final String value = projectNode.get(st.shortName, st.defaultName);
          st_editor.setStringValue(value);
          this.editors.put(st, st_editor);
        }
      }
    }
    return parent;
  }
  
  public boolean performOk() {
    try {
      IAdaptable _element = this.getElement();
      final IProject project = ((IProject) _element);
      String _plus = ("in performOk of " + project);
      InputOutput.<String>println(_plus);
      ProjectScope _projectScope = new ProjectScope(project);
      final ProjectScope projectScope = _projectScope;
      final IEclipsePreferences projectNode = projectScope.getNode("org.ebix.umm.uml2text");
      boolean _notEquals = (!Objects.equal(projectNode, null));
      if (_notEquals) {
        Collection<StringFieldEditor> _values = this.editors.values();
        for (final StringFieldEditor st_editor : _values) {
          String _labelText = st_editor.getLabelText();
          String _stringValue = st_editor.getStringValue();
          projectNode.put(_labelText, _stringValue);
        }
        projectNode.flush();
      }
      return true;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void performDefaults() {
    final Procedure2<UmmStereotype,StringFieldEditor> _function = new Procedure2<UmmStereotype,StringFieldEditor>() {
        public void apply(final UmmStereotype st, final StringFieldEditor st_editor) {
          st_editor.setStringValue(st.defaultName);
        }
      };
    MapExtensions.<UmmStereotype, StringFieldEditor>forEach(this.editors, _function);
  }
}
