package org.ebix.umm.templates.xsd

class Xml {

    def String escapeXML(String str) {
        str.replaceAll("&", "&amp;")
               .replaceAll("<", "&lt;")
               .replaceAll(">", "&gt;")
               .replaceAll("\"", "&quot;")
               .replaceAll("'", "&apos;")
    }


    def comment(String text) '''
        «div»
        <!-- ==== «text»«padding(text)» ==== -->
        «div»
    '''

    def int max(int a, int b) {
        if (a > b) {
            return a
        } else {
            return b
        }
    }

    def div(String arg) {
        return div()
    }

    def div() '''
        <!-- ================================================================================ -->
    '''

    def padding(String text) {
        var String blanks = "                                                                      "
        return blanks.substring(0, max(0, 70 - text.length))
    }

}