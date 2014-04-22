package org.ebix.umm.uml2text;

import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class UmmStereotype {
  public String shortName;
  
  public String qualifiedName;
  
  public String defaultName;
  
  public Stereotype value;
  
  public UmmStereotype(final String shortName, final String qualifiedName) {
    this.shortName = shortName;
    this.qualifiedName = qualifiedName;
    this.defaultName = qualifiedName;
  }
  
  public boolean hasStereotype(final NamedElement namedElement) {
    EList<Stereotype> _appliedStereotypes = namedElement.getAppliedStereotypes();
    return _appliedStereotypes.contains(this.value);
  }
  
  public String getStringValue(final NamedElement namedElement, final String tagName) {
    boolean _hasValue = namedElement.hasValue(this.value, tagName);
    if (_hasValue) {
      Object _value = namedElement.getValue(this.value, tagName);
      return ((String) _value);
    } else {
      String _plus = ("Missing " + tagName);
      String _plus_1 = (_plus + " for ");
      String _qualifiedName = namedElement.getQualifiedName();
      String _plus_2 = (_plus_1 + _qualifiedName);
      InputOutput.<String>println(_plus_2);
      return "";
    }
  }
  
  public List<String> getListOfStringValue(final NamedElement namedElement, final String tagName) {
    boolean _hasValue = namedElement.hasValue(this.value, tagName);
    if (_hasValue) {
      Object _value = namedElement.getValue(this.value, tagName);
      return ((List<String>) _value);
    } else {
      String _plus = ("Missing " + tagName);
      String _plus_1 = (_plus + " for ");
      String _qualifiedName = namedElement.getQualifiedName();
      String _plus_2 = (_plus_1 + _qualifiedName);
      InputOutput.<String>println(_plus_2);
      List<String> _xlistliteral = null;
      Builder<String> _builder = ImmutableList.builder();
      _xlistliteral = _builder.build();
      return _xlistliteral;
    }
  }
  
  public Object getValue(final NamedElement namedElement, final String tagName) {
    boolean _hasValue = namedElement.hasValue(this.value, tagName);
    if (_hasValue) {
      Object _value = namedElement.getValue(this.value, tagName);
      return this.getDynamicValue(_value);
    } else {
      String _plus = ("Missing " + tagName);
      String _plus_1 = (_plus + " for ");
      String _qualifiedName = namedElement.getQualifiedName();
      String _plus_2 = (_plus_1 + _qualifiedName);
      InputOutput.<String>println(_plus_2);
      return null;
    }
  }
  
  public Object getDynamicValue(final Object value) {
    if ((value instanceof EObject)) {
      final EObject dynObject = ((EObject) value);
      final EClass dynClass = dynObject.eClass();
      final EList<EStructuralFeature> eStructuralFeatures = dynClass.getEAllStructuralFeatures();
      for (final EStructuralFeature feature : eStructuralFeatures) {
        String _name = feature.getName();
        boolean _startsWith = _name.startsWith("base_");
        if (_startsWith) {
          return dynObject.eGet(feature, true);
        }
      }
      return value;
    }
    return null;
  }
  
  public String getDefaultValue(final String tagName) {
    EList<Property> _allAttributes = this.value.getAllAttributes();
    final Function1<Property,Boolean> _function = new Function1<Property,Boolean>() {
        public Boolean apply(final Property p) {
          String _name = p.getName();
          boolean _equals = Objects.equal(_name, tagName);
          return Boolean.valueOf(_equals);
        }
      };
    Property _findFirst = IterableExtensions.<Property>findFirst(_allAttributes, _function);
    String _default = _findFirst==null?(String)null:_findFirst.getDefault();
    return _default;
  }
}
