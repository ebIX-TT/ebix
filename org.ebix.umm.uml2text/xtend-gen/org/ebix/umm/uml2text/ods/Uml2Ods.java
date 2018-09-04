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
package org.ebix.umm.uml2text.ods;

import java.io.ByteArrayOutputStream;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
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
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class Uml2Ods {
  @Extension
  private Name2Text name2Text = new Name2Text();
  
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
        final List<? extends OdsPart> parts = Collections.<OdsPart>unmodifiableList(CollectionLiterals.<OdsPart>newArrayList(_manifest, _mimetype, _meta, _styles, _content));
        final ByteArrayOutputStream bout = new ByteArrayOutputStream();
        final ZipOutputStream zout = new ZipOutputStream(bout);
        final Consumer<OdsPart> _function = (OdsPart it) -> {
          it.add(zout);
        };
        parts.forEach(_function);
        zout.close();
        String _fileName_1 = this.name2Text.fileName(file);
        byte[] _byteArray = bout.toByteArray();
        this.fw.writeFile(_fileName_1, _byteArray);
        _xblockexpression = InputOutput.<String>println("Done.");
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
