package org.ebix.umm.uml2text

import org.eclipse.emf.common.util.URI

class Name2Text {
	
	private final String GENERATED_CODE_DIR = "model-text/"
	
	def String fileName(String name) {
		return GENERATED_CODE_DIR + name.replaceAll("::", "/").replaceAll(":", "/") + ".umm"
	}

	def String fileName(URI file) {
		return GENERATED_CODE_DIR + file.lastSegment.replaceAll(file.fileExtension, "ods")
	}
}