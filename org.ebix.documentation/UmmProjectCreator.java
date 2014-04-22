package org.ebix.umm.ui.wizard;

import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.xtend.type.impl.java.JavaBeansMetaModel;
import org.eclipse.xtext.ui.XtextProjectHelper;
import org.eclipse.xpand2.XpandExecutionContextImpl;
import org.eclipse.xpand2.XpandFacade;
import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xpand2.output.OutputImpl;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

public class UmmProjectCreator extends org.eclipse.xtext.ui.wizard.AbstractPluginProjectCreator {

	protected static final String DSL_GENERATOR_PROJECT_NAME = "org.ebix.umm";

	protected static final String UML_ROOT = "uml";
	protected static final String SRC_ROOT = "model-text";
	protected static final String SRC_GEN_ROOT = "schemas";
	protected final List<String> SRC_FOLDER_LIST = ImmutableList.of(UML_ROOT, SRC_ROOT, SRC_GEN_ROOT);

	@Override
	protected UmmProjectInfo getProjectInfo() {
		return (UmmProjectInfo) super.getProjectInfo();
	}
	
	protected String getModelFolderName() {
		return SRC_ROOT;
	}
	
	@Override
	protected List<String> getAllFolders() {
        return SRC_FOLDER_LIST;
    }

    @Override
	protected List<String> getRequiredBundles() {
		List<String> result = Lists.newArrayList(super.getRequiredBundles());
		result.add(DSL_GENERATOR_PROJECT_NAME);
		return result;
	}

	protected void enhanceProject(final IProject project, final IProgressMonitor monitor) throws CoreException {
	}

	/* (non-Javadoc)
	 * @see org.eclipse.xtext.ui.wizard.AbstractProjectCreator#getBuilders()
	 * Add the builder from UML to UMM as first builder.
	 */
	@Override
	protected String[] getBuilders() {
    	return new String[]{
    			"org.ebix.umm.uml2text.ummbuilder",
    			XtextProjectHelper.BUILDER_ID
    		};
	}

	/* (non-Javadoc)
	 * @see org.eclipse.xtext.ui.wizard.AbstractProjectCreator#getProjectNatures()
	 * Only Xtext nature
	 */
	@Override
	protected String[] getProjectNatures() {
        return new String[] {
    			XtextProjectHelper.NATURE_ID
    		};
	}
	
}