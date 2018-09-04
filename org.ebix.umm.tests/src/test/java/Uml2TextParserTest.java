package test.java;


import org.ebix.umm.uml2text.Uml2Text;
import org.ebix.umm.uml2text.file.FileWriterStandaloneImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.uml2.uml.resources.util.UMLResourcesUtil;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;


public class Uml2TextParserTest extends BaseTestCase {
	

	@Test
	public void shouldGenerateOdsFile(){
	    final URI fileURI = URI.createFileURI("src/test/resources/test.uml");
	    final FileWriterStandaloneImpl fw = new FileWriterStandaloneImpl();
	    final ResourceSetImpl resourceSet = new ResourceSetImpl();
	    UMLResourcesUtil.init(resourceSet);
	    Uml2Text _uml2Text = new Uml2Text();
	    _uml2Text.processFile(fileURI, resourceSet, fw);
	    File generatedFile = new File("model-text/test.ods");
	    assertTrue(generatedFile.exists());
	}
	


}
