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