package test.java;

import org.junit.AfterClass;

import java.io.File;

public class BaseTestCase {
	
	@AfterClass
	public static void setUp(){
		deleteFolder(new File("model-text"));
		deleteFolder(new File("schemas"));
	}
	
	public static void deleteFilesFromFolder(File folder){
		File[] files = folder.listFiles();
		if(files != null){
			for(File f : files){
				if(!f.isDirectory()){
					f.delete();
				}
			}
		}
	}
	
	public static void deleteFolder(File folder){
		if(folder.exists()){
			File[] files = folder.listFiles();
			if(files != null){
				for(File f : files){
					if(f.isDirectory()){
						deleteFolder(f);
					} else{
						f.delete();
					}
				}
			}
			folder.delete();
		}
	}

}
