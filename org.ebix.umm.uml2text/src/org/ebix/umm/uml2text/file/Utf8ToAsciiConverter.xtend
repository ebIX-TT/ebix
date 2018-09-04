package org.ebix.umm.uml2text.file

import java.nio.file.Paths
import java.nio.charset.Charset
import java.nio.file.Files
import java.nio.file.Path
import java.nio.charset.CharsetEncoder
import java.text.SimpleDateFormat
import java.util.Date
import java.io.File

class Utf8ToAsciiConverter {
	
	var private charset = Charset.forName("US-ASCII");
	
	
	def public escapeUtf8CharactersFromFile(String inputFile, Date backupDate){
		val inputFilePath = Paths.get(inputFile);
		backupFile(inputFilePath,backupDate);
		val src = new String(Files.readAllBytes(inputFilePath));
	    val result = src.escapeUtf8characters();
	    inputFilePath.overwriteFile(result);	
	}
	
	def private backupFile(Path file,Date backupDate){
		val savePath = file.toString.replace(file.fileName.toString,"") + "/../backup-uml/"
		val sim = new SimpleDateFormat("yyyy-MM-dd_hh-mm-ss");
		val date = sim.format(backupDate)
		val dir = new File(savePath + date + "/").mkdirs;
		Files.copy(file, Paths.get(savePath + date + "/" + file.fileName.toString));
	}
	
	def public escapeUtf8characters(String src){
		val encoder = charset.newEncoder();
		val result = new StringBuilder();
	    for (character : src.toCharArray()) {
	        if (encoder.canEncode(character)) {
	            result.append(character);
	        } else {
	            result.append("\\u");
	            result.append(Integer.toHexString(0x10000.bitwiseOr(character)).substring(1).toUpperCase());
	        }
	    }
	    return result.toString();
	}
	
	def private overwriteFile(Path file, String result){
		val writer = Files.newBufferedWriter(file, charset);
		writer.write(result);
		writer.flush();
		writer.close();		
	}
}