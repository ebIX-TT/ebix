package org.ebix.umm.ui.preferences

import org.eclipse.ui.dialogs.PropertyPage
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Control
import org.eclipse.jface.preference.StringFieldEditor
import org.eclipse.core.resources.IProject
import org.ebix.umm.templates.Constant
import org.eclipse.core.resources.ProjectScope
import java.util.HashMap
import java.util.Map
import org.ebix.umm.templates.Constants
import org.eclipse.jface.preference.FieldEditor

class UmmConstantProjectPropertiesPage extends PropertyPage {
	
	Map<Constant, MultiLineFieldEditor> editors = new HashMap<Constant, MultiLineFieldEditor> 
	
	new() {
    	println("start of UmmStereotypeProjectPropertiesPage")
	}

    override Control createContents(Composite parent) {
    	val project = element as IProject
    	println("in create contents of " + project)
		val projectScope = new ProjectScope(project);
		val projectNode = projectScope.getNode("org.ebix.umm");
		if (projectNode != null) {
			val constants = new Constants
			for (Constant constant : constants.allConstants) {
	    		val constant_editor = new MultiLineFieldEditor(constant.name, constant.name, parent)
				val value = projectNode.get(constant.name, constant.defaultValue);
	    		constant_editor.stringValue = value
	    		editors.put(constant, constant_editor)
			}    	
		}
        return parent;
    }
    
	override performOk() {
    	val project = element as IProject
    	println("in performOk of " + project)
		val projectScope = new ProjectScope(project);
		val projectNode = projectScope.getNode("org.ebix.umm");
		if (projectNode != null) {
			for (constant_editor : editors.values) {
				projectNode.put(constant_editor.labelText, constant_editor.stringValue)
			}
			projectNode.flush
		}
		
		return true
	}
	
	override performDefaults() {
		editors.forEach[constant, constant_editor| constant_editor.stringValue = constant.defaultValue]
	}
	
}