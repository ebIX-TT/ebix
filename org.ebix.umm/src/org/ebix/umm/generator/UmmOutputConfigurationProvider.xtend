package org.ebix.umm.generator

import org.eclipse.xtext.generator.IOutputConfigurationProvider
import org.eclipse.xtext.generator.OutputConfiguration
import org.eclipse.xtext.generator.IFileSystemAccess

class UmmOutputConfigurationProvider implements IOutputConfigurationProvider {
	
	override getOutputConfigurations() {
		val defaultOutput = new OutputConfiguration(IFileSystemAccess::DEFAULT_OUTPUT)
		defaultOutput.setDescription("Output Folder")
		defaultOutput.setOutputDirectory("./schemas")
		defaultOutput.setOverrideExistingResources(true)
		defaultOutput.setCreateOutputDirectory(true)
		defaultOutput.setCleanUpDerivedResources(true)
		defaultOutput.setSetDerivedProperty(true)
		return newHashSet(defaultOutput);
	}
	
}