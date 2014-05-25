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
package org.ebix.umm.uml2text.model

import org.eclipse.uml2.uml.Package
import java.util.List

interface Library {
	/** from bLibrary:  */ 
	def List<String> businessTerm(Package umlPackage)
	def List<String> copyright(Package umlPackage)
	def List<String> owner(Package umlPackage)
	def List<String> reference(Package umlPackage)
	def String status(Package umlPackage)
	def String uniqueIdentifier(Package umlPackage)
	def String versionIdentifier(Package umlPackage)
	
	/** from BIELibrary, BDTLibrary, DocLibrary, and ENUMLibrary: */
	def String baseURN(Package umlPackage)
	def String namespacePrefix(Package umlPackage)
}


