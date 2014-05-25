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

import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import org.ebix.umm.uml2text.UmmStereotype;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class UmmStereotypes {
  public final UmmStereotype DocLibrary = new UmmStereotype("DocLibrary", "ebIX stereotypes::e-DocLibrary");
  
  public final UmmStereotype InfEnvelope = new UmmStereotype("InfEnvelope", "UMM 2.0 Base Module::InfEnvelope");
  
  public final UmmStereotype MA = new UmmStereotype("MA", "Business Document Library::MA");
  
  public final UmmStereotype ASMA = new UmmStereotype("ASMA", "Business Document Library::ASMA");
  
  public final UmmStereotype TC_Document = new UmmStereotype("document", "Transformation XML::document");
  
  public final UmmStereotype TC_Payload = new UmmStereotype("payload", "Transformation XML::payload");
  
  public final UmmStereotype TC_ABIE = new UmmStereotype("abie", "Transformation XML::abie");
  
  public final UmmStereotype TC_BDT = new UmmStereotype("bdt", "Transformation XML::bdt");
  
  public final UmmStereotype TC_Dependency = new UmmStereotype("dependency", "Transformation XML::dependency");
  
  public final UmmStereotype TC_Facet = new UmmStereotype("facet", "Transformation XML::facet");
  
  public final UmmStereotype BIELibrary = new UmmStereotype("BIELibrary", "ebIX stereotypes::e-BIELibrary");
  
  public final UmmStereotype ABIE = new UmmStereotype("ABIE", "Business Information Entity Library::ABIE");
  
  public final UmmStereotype BBIE = new UmmStereotype("BBIE", "Business Information Entity Library::BBIE");
  
  public final UmmStereotype ASBIE = new UmmStereotype("ASBIE", "Business Information Entity Library::ASBIE");
  
  public final UmmStereotype BDTLibrary = new UmmStereotype("BDTLibrary", "UPCC Module Management::BDTLibrary");
  
  public final UmmStereotype BDT = new UmmStereotype("BDT", "Business Data Type Library::BDT");
  
  public final UmmStereotype BDT_CON = new UmmStereotype("BDT_CON", "Business Data Type Library::CON");
  
  public final UmmStereotype BDT_SUP = new UmmStereotype("BDT_SUP", "Business Data Type Library::SUP");
  
  public final UmmStereotype CCLibrary = new UmmStereotype("CCLibrary", "ebIX stereotypes::e-CCLibrary");
  
  public final UmmStereotype ACC = new UmmStereotype("ACC", "Core Component Library::ACC");
  
  public final UmmStereotype BCC = new UmmStereotype("BCC", "Core Component Library::BCC");
  
  public final UmmStereotype ASCC = new UmmStereotype("ASCC", "Core Component Library::ASCC");
  
  public final UmmStereotype CDTLibrary = new UmmStereotype("CDTLibrary", "UPCC Module Management::CDTLibrary");
  
  public final UmmStereotype CDT = new UmmStereotype("CDT", "Core Data Type Library::CDT");
  
  public final UmmStereotype CDT_CON = new UmmStereotype("CDT_CON", "Core Data Type Library::CON");
  
  public final UmmStereotype CDT_SUP = new UmmStereotype("CDT_SUP", "Core Data Type Library::SUP");
  
  public final UmmStereotype ENUMLibrary = new UmmStereotype("ENUMLibrary", "UPCC Module Management::ENUMLibrary");
  
  public final UmmStereotype ENUM = new UmmStereotype("ENUM", "Enumeration Type Library::ENUM");
  
  public final UmmStereotype Original = new UmmStereotype("Original", "ebIX stereotypes::Original");
  
  public final UmmStereotype Subset = new UmmStereotype("Subset", "ebIX stereotypes::Subset");
  
  public final UmmStereotype Assembled = new UmmStereotype("Assembled", "ebIX stereotypes::Assembled");
  
  public final UmmStereotype CodelistEntry = new UmmStereotype("CodelistEntry", "Enumeration Type Library::CodelistEntry");
  
  public final UmmStereotype PRIMLibrary = new UmmStereotype("PRIMLibrary", "UPCC Module Management::PRIMLibrary");
  
  public final UmmStereotype PRIM = new UmmStereotype("PRIM", "Primitive Data Type Library::PRIM");
  
  public final List<UmmStereotype> allStereotypes = Collections.<UmmStereotype>unmodifiableList(Lists.<UmmStereotype>newArrayList(this.DocLibrary, this.InfEnvelope, this.MA, this.ASMA, this.TC_Document, this.TC_Payload, this.TC_ABIE, this.TC_BDT, this.TC_Dependency, this.TC_Facet, this.BIELibrary, this.ABIE, this.BBIE, this.ASBIE, this.BDTLibrary, this.BDT, this.BDT_CON, this.BDT_SUP, this.CCLibrary, this.ACC, this.BCC, this.ASCC, this.CDTLibrary, this.CDT, this.CDT_CON, this.CDT_SUP, this.ENUMLibrary, this.ENUM, this.Original, this.Subset, this.Assembled, this.CodelistEntry, this.PRIMLibrary));
  
  public void resolveAll(final ResourceSet resourceSet) {
    for (final UmmStereotype ummStereotype : this.allStereotypes) {
      this.resolve(resourceSet, ummStereotype);
    }
  }
  
  public String resolve(final ResourceSet resourceSet, final UmmStereotype ummStereotype) {
    String _xblockexpression = null;
    {
      EList<Resource> _resources = resourceSet.getResources();
      for (final Resource resource : _resources) {
        {
          final TreeIterator<EObject> iterator = resource.getAllContents();
          boolean _hasNext = iterator.hasNext();
          boolean _while = _hasNext;
          while (_while) {
            {
              final EObject obj = iterator.next();
              if ((obj instanceof Stereotype)) {
                final Stereotype stereotype = ((Stereotype) obj);
                String _qualifiedName = stereotype.getQualifiedName();
                boolean _equals = ummStereotype.qualifiedName.equals(_qualifiedName);
                if (_equals) {
                  ummStereotype.value = stereotype;
                }
              }
            }
            boolean _hasNext_1 = iterator.hasNext();
            _while = _hasNext_1;
          }
        }
      }
      String _xifexpression = null;
      boolean _equals = Objects.equal(ummStereotype.value, null);
      if (_equals) {
        _xifexpression = InputOutput.<String>println((((("No stereotype found for " + ummStereotype.shortName) + ". Searched for ") + ummStereotype.qualifiedName) + "."));
      } else {
        _xifexpression = InputOutput.<String>println(((("Stereotype found for " + ummStereotype.shortName) + ". Got: ") + ummStereotype.value));
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
}
