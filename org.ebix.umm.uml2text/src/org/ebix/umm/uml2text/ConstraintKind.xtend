package org.ebix.umm.uml2text

class ConstraintKind {
	private String name
	private String listIdentifier
	private String responsibleAgency
	
	public new (String name, String listIdentifier, String responsibleAgency) {
		this.name = name
		this.listIdentifier = listIdentifier
		this.responsibleAgency = responsibleAgency
	}
	
	def getName() {
		return name
	}
	
	def getListIdentifier() {
		return listIdentifier
	}
	
	def getResponsibleAgency() {
		return responsibleAgency
	}

}