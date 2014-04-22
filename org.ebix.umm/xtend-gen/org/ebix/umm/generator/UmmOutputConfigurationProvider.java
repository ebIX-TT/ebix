package org.ebix.umm.generator;

import java.util.Set;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IOutputConfigurationProvider;
import org.eclipse.xtext.generator.OutputConfiguration;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@SuppressWarnings("all")
public class UmmOutputConfigurationProvider implements IOutputConfigurationProvider {
  public Set<OutputConfiguration> getOutputConfigurations() {
    OutputConfiguration _outputConfiguration = new OutputConfiguration(IFileSystemAccess.DEFAULT_OUTPUT);
    final OutputConfiguration defaultOutput = _outputConfiguration;
    defaultOutput.setDescription("Output Folder");
    defaultOutput.setOutputDirectory("./schemas");
    defaultOutput.setOverrideExistingResources(true);
    defaultOutput.setCreateOutputDirectory(true);
    defaultOutput.setCleanUpDerivedResources(true);
    defaultOutput.setSetDerivedProperty(true);
    return CollectionLiterals.<OutputConfiguration>newHashSet(defaultOutput);
  }
}
