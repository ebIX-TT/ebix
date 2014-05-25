/*
 *  UMM Schema Generator
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
package org.ebix.umm.templates.xsd


import com.google.inject.Inject

import java.util.List
import java.util.ArrayList


import org.ebix.umm.umm.ENUM
import org.ebix.umm.umm.Assembled

class AssembledExtension {

    @Inject extension EnumExtension enumExtension

    def List<ENUM> enums(Assembled assembled) {
        var enums = new ArrayList<ENUM>()
        enums.addAll(assembled.originals)
        enums.addAll(assembled.subsets)
        return enums
    }

    def List<ENUM> includes(Assembled assembled) {
        var enums = new ArrayList<ENUM>()
        for (o:assembled.originals.filter(o| o.namespace == assembled.namespace)) {
            enums.add(o)
        }
        for (s:assembled.subsets.filter(s| s.namespace == assembled.namespace)) {
            enums.add(s)
        }
        return enums
    }

    def List<ENUM> imports(Assembled assembled) {
        var List<ENUM> imports = enums(assembled)
        imports.removeAll( includes(assembled) )
        return imports
    }

}