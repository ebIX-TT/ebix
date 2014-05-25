/*
 *  UMM Schema Generator
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
package org.ebix.umm.uml2text.builder

import org.eclipse.core.resources.IncrementalProjectBuilder
import java.util.Map
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.CoreException
import org.ebix.umm.uml2text.Uml2Text
import static org.eclipse.emf.common.util.URI.*
import org.ebix.umm.uml2text.file.FileWriterEclipseImpl
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.ProjectScope
import org.ebix.umm.uml2text.UmmStereotypes
import org.eclipse.core.resources.IResource

class UmmBuilder extends IncrementalProjectBuilder {
	
	override protected build(int kind, Map<String,String> args, IProgressMonitor monitor) throws CoreException {
		println("Umm building, kind = " + kind)
		if (kind == FULL_BUILD) {
			val modelFolder = project.getFolder("uml")
			for (resource : modelFolder.members()) {
				if (resource.fileExtension.equals("uml") && !resource.fullPath.toPortableString.endsWith("profile.uml")) {
					println("UML resource: " + resource.fullPath.makeAbsolute.toPortableString)
					val uri = createPlatformResourceURI(resource.fullPath.toString, true)
					val uml2text = new Uml2Text
					applyStereotypeSettings(project, uml2text.ummStereotypes)
					val fw = new FileWriterEclipseImpl(project)
					val rs = new ResourceSetImpl()
					uml2text.processFile(uri, rs, fw)
				}
			}
		}
		
		return null
	}

	override protected clean(IProgressMonitor monitor) throws CoreException {
		println("Umm cleaning")
		val ummTextFolder = project.getFolder("model-text")
		for (IResource resource : ummTextFolder.members()) {
			resource.delete(IResource::KEEP_HISTORY, monitor);
		}
		
		//ummTextFolder.delete(false, null)
	}	
	
	def private applyStereotypeSettings(IProject project, UmmStereotypes ummStereotypes) {
		println("Getting settings")
		val projectScope = new ProjectScope(project);
		val projectNode = projectScope.getNode("org.ebix.umm.uml2text");
		if (projectNode != null) {
			for (st : ummStereotypes.allStereotypes) {
				val value = projectNode.get(st.shortName, st.qualifiedName);
				st.qualifiedName = value 
			}
		}
	}
}