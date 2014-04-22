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
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class PrimLibrary2Text {
  @Extension
  private Name2Text name2Text = new Function0<Name2Text>() {
    public Name2Text apply() {
      Name2Text _name2Text = new Name2Text();
      return _name2Text;
    }
  }.apply();
  
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
      String _println = InputOutput.<String>println("Done.");
      _xblockexpression = (_println);
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
        _builder.append(_name, "	");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
