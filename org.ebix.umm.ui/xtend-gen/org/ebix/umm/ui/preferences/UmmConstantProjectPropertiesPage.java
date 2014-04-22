package org.ebix.umm.ui.preferences;

import com.google.common.base.Objects;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.ebix.umm.templates.Constant;
import org.ebix.umm.templates.Constants;
import org.ebix.umm.ui.preferences.MultiLineFieldEditor;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ProjectScope;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.dialogs.PropertyPage;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.MapExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;

@SuppressWarnings("all")
public class UmmConstantProjectPropertiesPage extends PropertyPage {
  private Map<Constant,MultiLineFieldEditor> editors = new Function0<Map<Constant,MultiLineFieldEditor>>() {
    public Map<Constant,MultiLineFieldEditor> apply() {
      HashMap<Constant,MultiLineFieldEditor> _hashMap = new HashMap<Constant,MultiLineFieldEditor>();
      return _hashMap;
    }
  }.apply();
  
  public UmmConstantProjectPropertiesPage() {
    InputOutput.<String>println("start of UmmStereotypeProjectPropertiesPage");
  }
  
  public Control createContents(final Composite parent) {
    IAdaptable _element = this.getElement();
    final IProject project = ((IProject) _element);
    String _plus = ("in create contents of " + project);
    InputOutput.<String>println(_plus);
    ProjectScope _projectScope = new ProjectScope(project);
    final ProjectScope projectScope = _projectScope;
    final IEclipsePreferences projectNode = projectScope.getNode("org.ebix.umm");
    boolean _notEquals = (!Objects.equal(projectNode, null));
    if (_notEquals) {
      Constants _constants = new Constants();
      final Constants constants = _constants;
      for (final Constant constant : constants.allConstants) {
        {
          MultiLineFieldEditor _multiLineFieldEditor = new MultiLineFieldEditor(constant.name, constant.name, parent);
          final MultiLineFieldEditor constant_editor = _multiLineFieldEditor;
          final String value = projectNode.get(constant.name, constant.defaultValue);
          constant_editor.setStringValue(value);
          this.editors.put(constant, constant_editor);
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
      final IEclipsePreferences projectNode = projectScope.getNode("org.ebix.umm");
      boolean _notEquals = (!Objects.equal(projectNode, null));
      if (_notEquals) {
        Collection<MultiLineFieldEditor> _values = this.editors.values();
        for (final MultiLineFieldEditor constant_editor : _values) {
          String _labelText = constant_editor.getLabelText();
          String _stringValue = constant_editor.getStringValue();
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
    final Procedure2<Constant,MultiLineFieldEditor> _function = new Procedure2<Constant,MultiLineFieldEditor>() {
        public void apply(final Constant constant, final MultiLineFieldEditor constant_editor) {
          constant_editor.setStringValue(constant.defaultValue);
        }
      };
    MapExtensions.<Constant, MultiLineFieldEditor>forEach(this.editors, _function);
  }
}
