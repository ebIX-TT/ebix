package org.ebix.umm.uml2text.preferences

import org.eclipse.ui.dialogs.PropertyPage
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Control
import org.eclipse.jface.preference.StringFieldEditor
import org.eclipse.core.resources.IProject
import org.ebix.umm.uml2text.UmmStereotypes
import org.ebix.umm.uml2text.UmmStereotype
import org.eclipse.core.resources.ProjectScope
import java.util.HashMap
import java.util.Map

class UmmStereotypeProjectPropertiesPage extends PropertyPage {
	
	Map<UmmStereotype, StringFieldEditor> editors = new HashMap<UmmStereotype, StringFieldEditor> 
	
	new() {
    	println("start of UmmStereotypeProjectPropertiesPage")
	}

    override Control createContents(Composite parent) {
    	val project = element as IProject
    	println("in create contents of " + project)
		val projectScope = new ProjectScope(project);
		val projectNode = projectScope.getNode("org.ebix.umm.uml2text");
		if (projectNode != null) {
			val ummStereotypes = new UmmStereotypes
			for (UmmStereotype st : ummStereotypes.allStereotypes) {
	    		val st_editor = new StringFieldEditor(st.shortName, st.shortName, parent)
				val value = projectNode.get(st.shortName, st.defaultName);
	    		st_editor.stringValue = value
	    		editors.put(st, st_editor)
			}    	
		}
        return parent;
    }
    
	override performOk() {
    	val project = element as IProject
    	println("in performOk of " + project)
		val projectScope = new ProjectScope(project);
		val projectNode = projectScope.getNode("org.ebix.umm.uml2text");
		if (projectNode != null) {
			for (st_editor : editors.values) {
				projectNode.put(st_editor.labelText, st_editor.stringValue)
			}
			projectNode.flush
		}
		
		return true
	}
	
	override performDefaults() {
		editors.forEach[st, st_editor| st_editor.stringValue = st.defaultName]
	}
	
}