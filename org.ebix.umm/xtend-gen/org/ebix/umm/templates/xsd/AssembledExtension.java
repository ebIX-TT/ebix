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
    ArrayList<ENUM> enums = new ArrayList<ENUM>();
    EList<Original> _originals = assembled.getOriginals();
    enums.addAll(_originals);
    EList<Subset> _subsets = assembled.getSubsets();
    enums.addAll(_subsets);
    return enums;
  }
  
  public List<ENUM> includes(final Assembled assembled) {
    ArrayList<ENUM> enums = new ArrayList<ENUM>();
    EList<Original> _originals = assembled.getOriginals();
    final Function1<Original,Boolean> _function = new Function1<Original,Boolean>() {
      public Boolean apply(final Original o) {
        String _namespace = AssembledExtension.this.enumExtension.namespace(o);
        String _namespace_1 = AssembledExtension.this.enumExtension.namespace(assembled);
        return Boolean.valueOf(Objects.equal(_namespace, _namespace_1));
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
        return Boolean.valueOf(Objects.equal(_namespace, _namespace_1));
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
