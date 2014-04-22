package org.ebix.umm.uml2text.ods;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.zip.ZipOutputStream;
import org.ebix.umm.uml2text.Name2Text;
import org.ebix.umm.uml2text.UmmStereotypes;
import org.ebix.umm.uml2text.file.FileWriter;
import org.ebix.umm.uml2text.ods.Content;
import org.ebix.umm.uml2text.ods.Manifest;
import org.ebix.umm.uml2text.ods.Meta;
import org.ebix.umm.uml2text.ods.Mimetype;
import org.ebix.umm.uml2text.ods.OdsPart;
import org.ebix.umm.uml2text.ods.Styles;
import org.eclipse.emf.common.util.URI;
import org.eclipse.uml2.uml.Model;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class Uml2Ods {
  @Extension
  private Name2Text name2Text = new Function0<Name2Text>() {
    public Name2Text apply() {
      Name2Text _name2Text = new Name2Text();
      return _name2Text;
    }
  }.apply();
  
  private UmmStereotypes ummStereotypes;
  
  private FileWriter fw;
  
  private Model umlModel;
  
  public Uml2Ods(final UmmStereotypes ummStereotypes, final Model umlModel, final FileWriter fw) {
    this.ummStereotypes = ummStereotypes;
    this.umlModel = umlModel;
    this.fw = fw;
  }
  
  public String generate(final URI file) {
    try {
      String _xblockexpression = null;
      {
        String _fileName = this.name2Text.fileName(file);
        String _plus = ("Generating spreadsheet " + _fileName);
        String _plus_1 = (_plus + " ...");
        InputOutput.<String>println(_plus_1);
        Manifest _manifest = new Manifest();
        Mimetype _mimetype = new Mimetype();
        Meta _meta = new Meta();
        Styles _styles = new Styles();
        Content _content = new Content(this.ummStereotypes, this.umlModel);
        List<? extends OdsPart> _xlistliteral = null;
        Builder<OdsPart> _builder = ImmutableList.builder();
        _builder.add(_manifest);
        _builder.add(_mimetype);
        _builder.add(_meta);
        _builder.add(_styles);
        _builder.add(_content);
        _xlistliteral = _builder.build();
        final List<? extends OdsPart> parts = _xlistliteral;
        ByteArrayOutputStream _byteArrayOutputStream = new ByteArrayOutputStream();
        final ByteArrayOutputStream bout = _byteArrayOutputStream;
        ZipOutputStream _zipOutputStream = new ZipOutputStream(bout);
        final ZipOutputStream zout = _zipOutputStream;
        final Procedure1<OdsPart> _function = new Procedure1<OdsPart>() {
            public void apply(final OdsPart it) {
              it.add(zout);
            }
          };
        IterableExtensions.forEach(parts, _function);
        zout.close();
        String _fileName_1 = this.name2Text.fileName(file);
        byte[] _byteArray = bout.toByteArray();
        this.fw.writeFile(_fileName_1, _byteArray);
        String _println = InputOutput.<String>println("Done.");
        _xblockexpression = (_println);
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
