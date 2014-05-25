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
package org.ebix.umm.uml2text.preferences;

import com.google.common.base.Objects;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
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
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class UmmStereotypeProjectPropertiesPage extends PropertyPage {
  private Map<UmmStereotype,StringFieldEditor> editors = new HashMap<UmmStereotype, StringFieldEditor>();
  
  public UmmStereotypeProjectPropertiesPage() {
    InputOutput.<String>println("start of UmmStereotypeProjectPropertiesPage");
  }
  
  public Control createContents(final Composite parent) {
    IAdaptable _element = this.getElement();
    final IProject project = ((IProject) _element);
    InputOutput.<String>println(("in create contents of " + project));
    final ProjectScope projectScope = new ProjectScope(project);
    final IEclipsePreferences projectNode = projectScope.getNode("org.ebix.umm.uml2text");
    boolean _notEquals = (!Objects.equal(projectNode, null));
    if (_notEquals) {
      final UmmStereotypes ummStereotypes = new UmmStereotypes();
      for (final UmmStereotype st : ummStereotypes.allStereotypes) {
        {
          final StringFieldEditor st_editor = new StringFieldEditor(st.shortName, st.shortName, parent);
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
      InputOutput.<String>println(("in performOk of " + project));
      final ProjectScope projectScope = new ProjectScope(project);
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
    final BiConsumer<UmmStereotype,StringFieldEditor> _function = new BiConsumer<UmmStereotype,StringFieldEditor>() {
      public void accept(final UmmStereotype st, final StringFieldEditor st_editor) {
        st_editor.setStringValue(st.defaultName);
      }
    };
    this.editors.forEach(_function);
  }
}
