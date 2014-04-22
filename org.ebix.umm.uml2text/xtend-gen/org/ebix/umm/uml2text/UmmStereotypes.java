package org.ebix.umm.uml2text;

import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import org.ebix.umm.uml2text.UmmStereotype;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class UmmStereotypes {
  public final UmmStereotype DocLibrary = new Function0<UmmStereotype>() {
    public UmmStereotype apply() {
      UmmStereotype _ummStereotype = new UmmStereotype("DocLibrary", "ebIX stereotypes::e-DocLibrary");
      return _ummStereotype;
    }
  }.apply();
  
  public final UmmStereotype InfEnvelope = new Function0<UmmStereotype>() {
    public UmmStereotype apply() {
      UmmStereotype _ummStereotype = new UmmStereotype("InfEnvelope", "UMM 2.0 Base Module::InfEnvelope");
      return _ummStereotype;
    }
  }.apply();
  
  public final UmmStereotype MA = new Function0<UmmStereotype>() {
    public UmmStereotype apply() {
      UmmStereotype _ummStereotype = new UmmStereotype("MA", "Business Document Library::MA");
      return _ummStereotype;
    }
  }.apply();
  
  public final UmmStereotype ASMA = new Function0<UmmStereotype>() {
    public UmmStereotype apply() {
      UmmStereotype _ummStereotype = new UmmStereotype("ASMA", "Business Document Library::ASMA");
      return _ummStereotype;
    }
  }.apply();
  
  public final UmmStereotype TC_Document = new Function0<UmmStereotype>() {
    public UmmStereotype apply() {
      UmmStereotype _ummStereotype = new UmmStereotype("document", "Transformation XML::document");
      return _ummStereotype;
    }
  }.apply();
  
  public final UmmStereotype TC_Payload = new Function0<UmmStereotype>() {
    public UmmStereotype apply() {
      UmmStereotype _ummStereotype = new UmmStereotype("payload", "Transformation XML::payload");
      return _ummStereotype;
    }
  }.apply();
  
  public final UmmStereotype TC_ABIE = new Function0<UmmStereotype>() {
    public UmmStereotype apply() {
      UmmStereotype _ummStereotype = new UmmStereotype("abie", "Transformation XML::abie");
      return _ummStereotype;
    }
  }.apply();
  
  public final UmmStereotype TC_BDT = new Function0<UmmStereotype>() {
    public UmmStereotype apply() {
      UmmStereotype _ummStereotype = new UmmStereotype("bdt", "Transformation XML::bdt");
      return _ummStereotype;
    }
  }.apply();
  
  public final UmmStereotype TC_Dependency = new Function0<UmmStereotype>() {
    public UmmStereotype apply() {
      UmmStereotype _ummStereotype = new UmmStereotype("dependency", "Transformation XML::dependency");
      return _ummStereotype;
    }
  }.apply();
  
  public final UmmStereotype TC_Facet = new Function0<UmmStereotype>() {
    public UmmStereotype apply() {
      UmmStereotype _ummStereotype = new UmmStereotype("facet", "Transformation XML::facet");
      return _ummStereotype;
    }
  }.apply();
  
  public final UmmStereotype BIELibrary = new Function0<UmmStereotype>() {
    public UmmStereotype apply() {
      UmmStereotype _ummStereotype = new UmmStereotype("BIELibrary", "ebIX stereotypes::e-BIELibrary");
      return _ummStereotype;
    }
  }.apply();
  
  public final UmmStereotype ABIE = new Function0<UmmStereotype>() {
    public UmmStereotype apply() {
      UmmStereotype _ummStereotype = new UmmStereotype("ABIE", "Business Information Entity Library::ABIE");
      return _ummStereotype;
    }
  }.apply();
  
  public final UmmStereotype BBIE = new Function0<UmmStereotype>() {
    public UmmStereotype apply() {
      UmmStereotype _ummStereotype = new UmmStereotype("BBIE", "Business Information Entity Library::BBIE");
      return _ummStereotype;
    }
  }.apply();
  
  public final UmmStereotype ASBIE = new Function0<UmmStereotype>() {
    public UmmStereotype apply() {
      UmmStereotype _ummStereotype = new UmmStereotype("ASBIE", "Business Information Entity Library::ASBIE");
      return _ummStereotype;
    }
  }.apply();
  
  public final UmmStereotype BDTLibrary = new Function0<UmmStereotype>() {
    public UmmStereotype apply() {
      UmmStereotype _ummStereotype = new UmmStereotype("BDTLibrary", "UPCC Module Management::BDTLibrary");
      return _ummStereotype;
    }
  }.apply();
  
  public final UmmStereotype BDT = new Function0<UmmStereotype>() {
    public UmmStereotype apply() {
      UmmStereotype _ummStereotype = new UmmStereotype("BDT", "Business Data Type Library::BDT");
      return _ummStereotype;
    }
  }.apply();
  
  public final UmmStereotype BDT_CON = new Function0<UmmStereotype>() {
    public UmmStereotype apply() {
      UmmStereotype _ummStereotype = new UmmStereotype("BDT_CON", "Business Data Type Library::CON");
      return _ummStereotype;
    }
  }.apply();
  
  public final UmmStereotype BDT_SUP = new Function0<UmmStereotype>() {
    public UmmStereotype apply() {
      UmmStereotype _ummStereotype = new UmmStereotype("BDT_SUP", "Business Data Type Library::SUP");
      return _ummStereotype;
    }
  }.apply();
  
  public final UmmStereotype CCLibrary = new Function0<UmmStereotype>() {
    public UmmStereotype apply() {
      UmmStereotype _ummStereotype = new UmmStereotype("CCLibrary", "ebIX stereotypes::e-CCLibrary");
      return _ummStereotype;
    }
  }.apply();
  
  public final UmmStereotype ACC = new Function0<UmmStereotype>() {
    public UmmStereotype apply() {
      UmmStereotype _ummStereotype = new UmmStereotype("ACC", "Core Component Library::ACC");
      return _ummStereotype;
    }
  }.apply();
  
  public final UmmStereotype BCC = new Function0<UmmStereotype>() {
    public UmmStereotype apply() {
      UmmStereotype _ummStereotype = new UmmStereotype("BCC", "Core Component Library::BCC");
      return _ummStereotype;
    }
  }.apply();
  
  public final UmmStereotype ASCC = new Function0<UmmStereotype>() {
    public UmmStereotype apply() {
      UmmStereotype _ummStereotype = new UmmStereotype("ASCC", "Core Component Library::ASCC");
      return _ummStereotype;
    }
  }.apply();
  
  public final UmmStereotype CDTLibrary = new Function0<UmmStereotype>() {
    public UmmStereotype apply() {
      UmmStereotype _ummStereotype = new UmmStereotype("CDTLibrary", "UPCC Module Management::CDTLibrary");
      return _ummStereotype;
    }
  }.apply();
  
  public final UmmStereotype CDT = new Function0<UmmStereotype>() {
    public UmmStereotype apply() {
      UmmStereotype _ummStereotype = new UmmStereotype("CDT", "Core Data Type Library::CDT");
      return _ummStereotype;
    }
  }.apply();
  
  public final UmmStereotype CDT_CON = new Function0<UmmStereotype>() {
    public UmmStereotype apply() {
      UmmStereotype _ummStereotype = new UmmStereotype("CDT_CON", "Core Data Type Library::CON");
      return _ummStereotype;
    }
  }.apply();
  
  public final UmmStereotype CDT_SUP = new Function0<UmmStereotype>() {
    public UmmStereotype apply() {
      UmmStereotype _ummStereotype = new UmmStereotype("CDT_SUP", "Core Data Type Library::SUP");
      return _ummStereotype;
    }
  }.apply();
  
  public final UmmStereotype ENUMLibrary = new Function0<UmmStereotype>() {
    public UmmStereotype apply() {
      UmmStereotype _ummStereotype = new UmmStereotype("ENUMLibrary", "UPCC Module Management::ENUMLibrary");
      return _ummStereotype;
    }
  }.apply();
  
  public final UmmStereotype ENUM = new Function0<UmmStereotype>() {
    public UmmStereotype apply() {
      UmmStereotype _ummStereotype = new UmmStereotype("ENUM", "Enumeration Type Library::ENUM");
      return _ummStereotype;
    }
  }.apply();
  
  public final UmmStereotype Original = new Function0<UmmStereotype>() {
    public UmmStereotype apply() {
      UmmStereotype _ummStereotype = new UmmStereotype("Original", "ebIX stereotypes::Original");
      return _ummStereotype;
    }
  }.apply();
  
  public final UmmStereotype Subset = new Function0<UmmStereotype>() {
    public UmmStereotype apply() {
      UmmStereotype _ummStereotype = new UmmStereotype("Subset", "ebIX stereotypes::Subset");
      return _ummStereotype;
    }
  }.apply();
  
  public final UmmStereotype Assembled = new Function0<UmmStereotype>() {
    public UmmStereotype apply() {
      UmmStereotype _ummStereotype = new UmmStereotype("Assembled", "ebIX stereotypes::Assembled");
      return _ummStereotype;
    }
  }.apply();
  
  public final UmmStereotype CodelistEntry = new Function0<UmmStereotype>() {
    public UmmStereotype apply() {
      UmmStereotype _ummStereotype = new UmmStereotype("CodelistEntry", "Enumeration Type Library::CodelistEntry");
      return _ummStereotype;
    }
  }.apply();
  
  public final UmmStereotype PRIMLibrary = new Function0<UmmStereotype>() {
    public UmmStereotype apply() {
      UmmStereotype _ummStereotype = new UmmStereotype("PRIMLibrary", "UPCC Module Management::PRIMLibrary");
      return _ummStereotype;
    }
  }.apply();
  
  public final UmmStereotype PRIM = new Function0<UmmStereotype>() {
    public UmmStereotype apply() {
      UmmStereotype _ummStereotype = new UmmStereotype("PRIM", "Primitive Data Type Library::PRIM");
      return _ummStereotype;
    }
  }.apply();
  
  public final List<UmmStereotype> allStereotypes = new Function0<List<UmmStereotype>>() {
    public List<UmmStereotype> apply() {
      List<UmmStereotype> _xlistliteral = null;
      Builder<UmmStereotype> _builder = ImmutableList.builder();
      _builder.add(UmmStereotypes.this.DocLibrary);
      _builder.add(UmmStereotypes.this.InfEnvelope);
      _builder.add(UmmStereotypes.this.MA);
      _builder.add(UmmStereotypes.this.ASMA);
      _builder.add(UmmStereotypes.this.TC_Document);
      _builder.add(UmmStereotypes.this.TC_Payload);
      _builder.add(UmmStereotypes.this.TC_ABIE);
      _builder.add(UmmStereotypes.this.TC_BDT);
      _builder.add(UmmStereotypes.this.TC_Dependency);
      _builder.add(UmmStereotypes.this.TC_Facet);
      _builder.add(UmmStereotypes.this.BIELibrary);
      _builder.add(UmmStereotypes.this.ABIE);
      _builder.add(UmmStereotypes.this.BBIE);
      _builder.add(UmmStereotypes.this.ASBIE);
      _builder.add(UmmStereotypes.this.BDTLibrary);
      _builder.add(UmmStereotypes.this.BDT);
      _builder.add(UmmStereotypes.this.BDT_CON);
      _builder.add(UmmStereotypes.this.BDT_SUP);
      _builder.add(UmmStereotypes.this.CCLibrary);
      _builder.add(UmmStereotypes.this.ACC);
      _builder.add(UmmStereotypes.this.BCC);
      _builder.add(UmmStereotypes.this.ASCC);
      _builder.add(UmmStereotypes.this.CDTLibrary);
      _builder.add(UmmStereotypes.this.CDT);
      _builder.add(UmmStereotypes.this.CDT_CON);
      _builder.add(UmmStereotypes.this.CDT_SUP);
      _builder.add(UmmStereotypes.this.ENUMLibrary);
      _builder.add(UmmStereotypes.this.ENUM);
      _builder.add(UmmStereotypes.this.Original);
      _builder.add(UmmStereotypes.this.Subset);
      _builder.add(UmmStereotypes.this.Assembled);
      _builder.add(UmmStereotypes.this.CodelistEntry);
      _builder.add(UmmStereotypes.this.PRIMLibrary);
      _xlistliteral = _builder.build();
      return _xlistliteral;
    }
  }.apply();
  
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
        String _plus = ("No stereotype found for " + ummStereotype.shortName);
        String _plus_1 = (_plus + ". Searched for ");
        String _plus_2 = (_plus_1 + ummStereotype.qualifiedName);
        String _plus_3 = (_plus_2 + ".");
        String _println = InputOutput.<String>println(_plus_3);
        _xifexpression = _println;
      } else {
        String _plus_4 = ("Stereotype found for " + ummStereotype.shortName);
        String _plus_5 = (_plus_4 + ". Got: ");
        String _plus_6 = (_plus_5 + ummStereotype.value);
        String _println_1 = InputOutput.<String>println(_plus_6);
        _xifexpression = _println_1;
      }
      _xblockexpression = (_xifexpression);
    }
    return _xblockexpression;
  }
}
