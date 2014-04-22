package org.ebix.umm.templates

class Constant {
	public String name
	public String defaultValue
	public String value
	
	new(String name, String value) {
		this.name = name
		this.defaultValue = value
		this.value = value
	}
	
}