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
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class Uml2Text {
  public UmmStereotypes ummStereotypes = new Function0<UmmStereotypes>() {
    public UmmStereotypes apply() {
      UmmStereotypes _ummStereotypes = new UmmStereotypes();
      return _ummStereotypes;
    }
  }.apply();
  
  public static void main(final String[] args) {
    final URI fileURI = URI.createFileURI("/home/peter/Development/ws-uml/uml-2012A2/model/European_Energy_Market.uml");
    FileWriterStandaloneImpl _fileWriterStandaloneImpl = new FileWriterStandaloneImpl();
    final FileWriterStandaloneImpl fw = _fileWriterStandaloneImpl;
    ResourceSetImpl _resourceSetImpl = new ResourceSetImpl();
    final ResourceSetImpl resourceSet = _resourceSetImpl;
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
    DocLibrary2Text _docLibrary2Text = new DocLibrary2Text(this.ummStereotypes);
    final DocLibrary2Text docLibrary2Text = _docLibrary2Text;
    docLibrary2Text.generate(umlModel, fw);
    BieLibrary2Text _bieLibrary2Text = new BieLibrary2Text(this.ummStereotypes);
    final BieLibrary2Text bieLibrary2Text = _bieLibrary2Text;
    bieLibrary2Text.generate(umlModel, fw);
    BdtLibrary2Text _bdtLibrary2Text = new BdtLibrary2Text(this.ummStereotypes);
    final BdtLibrary2Text bdtLibrary2Text = _bdtLibrary2Text;
    bdtLibrary2Text.generate(umlModel, fw);
    EnumLibrary2Text _enumLibrary2Text = new EnumLibrary2Text(this.ummStereotypes);
    final EnumLibrary2Text enumLibrary2Text = _enumLibrary2Text;
    enumLibrary2Text.generate(umlModel, fw);
    PrimLibrary2Text _primLibrary2Text = new PrimLibrary2Text(this.ummStereotypes);
    final PrimLibrary2Text primLibrary2Text = _primLibrary2Text;
    primLibrary2Text.generate(resourceSet, fw);
    Uml2Ods _uml2Ods = new Uml2Ods(this.ummStereotypes, umlModel, fw);
    final Uml2Ods uml2ods = _uml2Ods;
    uml2ods.generate(file);
  }
}
