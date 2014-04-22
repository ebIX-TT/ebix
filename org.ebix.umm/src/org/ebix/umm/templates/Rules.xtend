package org.ebix.umm.templates

class Rules {
	def String typeNameRule(String name) {
	    return name.replaceAll("_", "")
	}
}