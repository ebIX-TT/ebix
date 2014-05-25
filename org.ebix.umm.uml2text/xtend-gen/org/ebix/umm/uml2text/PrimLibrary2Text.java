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

import com.google.common.collect.Iterables;
import org.ebix.umm.uml2text.Name2Text;
import org.ebix.umm.uml2text.UmmStereotypes;
import org.ebix.umm.uml2text.file.FileWriter;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class PrimLibrary2Text {
  @Extension
  private Name2Text name2Text = new Name2Text();
  
  private UmmStereotypes ummStereotypes;
  
  private Stereotype PRIMLibrary;
  
  public PrimLibrary2Text(final UmmStereotypes ummStereotypes) {
    this.ummStereotypes = ummStereotypes;
    this.PRIMLibrary = ummStereotypes.PRIMLibrary.value;
  }
  
  public String generate(final ResourceSet resourceSet, final FileWriter fw) {
    String _xblockexpression = null;
    {
      InputOutput.<String>println("Generating PRIMLibraries ...");
      EList<Resource> _resources = resourceSet.getResources();
      for (final Resource resource : _resources) {
        {
          final TreeIterator<EObject> iterator = resource.getAllContents();
          boolean _hasNext = iterator.hasNext();
          boolean _while = _hasNext;
          while (_while) {
            {
              final EObject object = iterator.next();
              if ((object instanceof org.eclipse.uml2.uml.Package)) {
                final org.eclipse.uml2.uml.Package umlPackage = ((org.eclipse.uml2.uml.Package) object);
                boolean _isStereotypeApplied = umlPackage.isStereotypeApplied(this.ummStereotypes.PRIMLibrary.value);
                if (_isStereotypeApplied) {
                  String _name = umlPackage.getName();
                  String _plus = ("PRIMLibrary " + _name);
                  InputOutput.<String>println(_plus);
                  String _qualifiedName = umlPackage.getQualifiedName();
                  String _fileName = this.name2Text.fileName(_qualifiedName);
                  CharSequence _generate = this.generate(umlPackage);
                  fw.writeFile(_fileName, _generate);
                }
              }
            }
            boolean _hasNext_1 = iterator.hasNext();
            _while = _hasNext_1;
          }
        }
      }
      _xblockexpression = InputOutput.<String>println("Done.");
    }
    return _xblockexpression;
  }
  
  public CharSequence generate(final org.eclipse.uml2.uml.Package umlPackage) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("PRIMLibrary \"");
    String _qualifiedName = umlPackage.getQualifiedName();
    _builder.append(_qualifiedName, "");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("{");
    _builder.newLine();
    {
      EList<NamedElement> _ownedMembers = umlPackage.getOwnedMembers();
      Iterable<DataType> _filter = Iterables.<DataType>filter(_ownedMembers, DataType.class);
      for(final DataType umlDataType : _filter) {
        _builder.append("\t");
        _builder.append("primitive ");
        String _name = umlDataType.getName();
        _builder.append(_name, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
