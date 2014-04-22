package org.ebix.umm.templates.xsd;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import org.ebix.umm.templates.xsd.EnumExtension;
import org.ebix.umm.umm.Assembled;
import org.ebix.umm.umm.ENUM;
import org.ebix.umm.umm.Original;
import org.ebix.umm.umm.Subset;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class AssembledExtension {
  @Inject
  @Extension
  private EnumExtension enumExtension;
  
  public List<ENUM> enums(final Assembled assembled) {
    ArrayList<ENUM> _arrayList = new ArrayList<ENUM>();
    ArrayList<ENUM> enums = _arrayList;
    EList<Original> _originals = assembled.getOriginals();
    enums.addAll(_originals);
    EList<Subset> _subsets = assembled.getSubsets();
    enums.addAll(_subsets);
    return enums;
  }
  
  public List<ENUM> includes(final Assembled assembled) {
    ArrayList<ENUM> _arrayList = new ArrayList<ENUM>();
    ArrayList<ENUM> enums = _arrayList;
    EList<Original> _originals = assembled.getOriginals();
    final Function1<Original,Boolean> _function = new Function1<Original,Boolean>() {
        public Boolean apply(final Original o) {
          String _namespace = AssembledExtension.this.enumExtension.namespace(o);
          String _namespace_1 = AssembledExtension.this.enumExtension.namespace(assembled);
          boolean _equals = Objects.equal(_namespace, _namespace_1);
          return Boolean.valueOf(_equals);
        }
      };
    Iterable<Original> _filter = IterableExtensions.<Original>filter(_originals, _function);
    for (final Original o : _filter) {
      enums.add(o);
    }
    EList<Subset> _subsets = assembled.getSubsets();
    final Function1<Subset,Boolean> _function_1 = new Function1<Subset,Boolean>() {
        public Boolean apply(final Subset s) {
          String _namespace = AssembledExtension.this.enumExtension.namespace(s);
          String _namespace_1 = AssembledExtension.this.enumExtension.namespace(assembled);
          boolean _equals = Objects.equal(_namespace, _namespace_1);
          return Boolean.valueOf(_equals);
        }
      };
    Iterable<Subset> _filter_1 = IterableExtensions.<Subset>filter(_subsets, _function_1);
    for (final Subset s : _filter_1) {
      enums.add(s);
    }
    return enums;
  }
  
  public List<ENUM> imports(final Assembled assembled) {
    List<ENUM> imports = this.enums(assembled);
    List<ENUM> _includes = this.includes(assembled);
    imports.removeAll(_includes);
    return imports;
  }
}
