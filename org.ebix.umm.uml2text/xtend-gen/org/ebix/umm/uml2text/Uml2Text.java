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
package org.ebix.umm.uml2text;

import java.io.IOException;
import org.ebix.umm.uml2text.BdtLibrary2Text;
import org.ebix.umm.uml2text.BieLibrary2Text;
import org.ebix.umm.uml2text.DocLibrary2Text;
import org.ebix.umm.uml2text.EnumLibrary2Text;
import org.ebix.umm.uml2text.PrimLibrary2Text;
import org.ebix.umm.uml2text.UmmStereotypes;
import org.ebix.umm.uml2text.file.FileWriter;
import org.ebix.umm.uml2text.file.FileWriterStandaloneImpl;
import org.ebix.umm.uml2text.ods.Uml2Ods;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.resources.util.UMLResourcesUtil;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class Uml2Text {
  public UmmStereotypes ummStereotypes = new UmmStereotypes();
  
  public static void main(final String[] args) {
    final URI fileURI = URI.createFileURI("/home/xrdj6c/workspace/new/runtime-Umm.product/Test3/uml/European_Energy_Market.uml");
    final FileWriterStandaloneImpl fw = new FileWriterStandaloneImpl();
    final ResourceSetImpl resourceSet = new ResourceSetImpl();
    UMLResourcesUtil.init(resourceSet);
    Uml2Text _uml2Text = new Uml2Text();
    _uml2Text.processFile(fileURI, resourceSet, fw);
  }
  
  public void processFile(final URI file, final ResourceSet resourceSet, final FileWriter fw) {
    final Resource resource = resourceSet.createResource(file);
    try {
      resource.load(null);
    } catch (final Throwable _t) {
      if (_t instanceof IOException) {
        final IOException ioe = (IOException)_t;
        String _message = ioe.getMessage();
        InputOutput.<String>println(_message);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    EList<EObject> _contents = resource.getContents();
    EObject _get = _contents.get(0);
    final Model umlModel = ((Model) _get);
    String _qualifiedName = umlModel.getQualifiedName();
    String _plus = ("Loaded \'" + _qualifiedName);
    String _plus_1 = (_plus + "\' from \'");
    String _plus_2 = (_plus_1 + file);
    String _plus_3 = (_plus_2 + "\'.");
    InputOutput.<String>println(_plus_3);
    this.ummStereotypes.resolveAll(resourceSet);
    final DocLibrary2Text docLibrary2Text = new DocLibrary2Text(this.ummStereotypes);
    docLibrary2Text.generate(umlModel, fw);
    final BieLibrary2Text bieLibrary2Text = new BieLibrary2Text(this.ummStereotypes);
    bieLibrary2Text.generate(umlModel, fw);
    final BdtLibrary2Text bdtLibrary2Text = new BdtLibrary2Text(this.ummStereotypes);
    bdtLibrary2Text.generate(umlModel, fw);
    final EnumLibrary2Text enumLibrary2Text = new EnumLibrary2Text(this.ummStereotypes);
    enumLibrary2Text.generate(umlModel, fw);
    final PrimLibrary2Text primLibrary2Text = new PrimLibrary2Text(this.ummStereotypes);
    primLibrary2Text.generate(resourceSet, fw);
    final Uml2Ods uml2ods = new Uml2Ods(this.ummStereotypes, umlModel, fw);
    uml2ods.generate(file);
  }
}
