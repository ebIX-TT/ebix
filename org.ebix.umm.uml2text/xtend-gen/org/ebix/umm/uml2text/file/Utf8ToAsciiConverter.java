package org.ebix.umm.uml2text.file;

import java.io.BufferedWriter;
import java.io.File;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class Utf8ToAsciiConverter {
  private Charset charset = Charset.forName("US-ASCII");
  
  public void escapeUtf8CharactersFromFile(final String inputFile, final Date backupDate) {
    try {
      final Path inputFilePath = Paths.get(inputFile);
      this.backupFile(inputFilePath, backupDate);
      byte[] _readAllBytes = Files.readAllBytes(inputFilePath);
      final String src = new String(_readAllBytes);
      final String result = this.escapeUtf8characters(src);
      this.overwriteFile(inputFilePath, result);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private Path backupFile(final Path file, final Date backupDate) {
    try {
      Path _xblockexpression = null;
      {
        String _string = file.toString();
        Path _fileName = file.getFileName();
        String _string_1 = _fileName.toString();
        String _replace = _string.replace(_string_1, "");
        final String savePath = (_replace + "/../backup-uml/");
        final SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd_hh-mm-ss");
        final String date = sim.format(backupDate);
        File _file = new File(((savePath + date) + "/"));
        final boolean dir = _file.mkdirs();
        Path _fileName_1 = file.getFileName();
        String _string_2 = _fileName_1.toString();
        String _plus = (((savePath + date) + "/") + _string_2);
        Path _get = Paths.get(_plus);
        _xblockexpression = Files.copy(file, _get);
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public String escapeUtf8characters(final String src) {
    final CharsetEncoder encoder = this.charset.newEncoder();
    final StringBuilder result = new StringBuilder();
    char[] _charArray = src.toCharArray();
    for (final char character : _charArray) {
      boolean _canEncode = encoder.canEncode(character);
      if (_canEncode) {
        result.append(character);
      } else {
        result.append("\\u");
        String _hexString = Integer.toHexString((0x10000 | character));
        String _substring = _hexString.substring(1);
        String _upperCase = _substring.toUpperCase();
        result.append(_upperCase);
      }
    }
    return result.toString();
  }
  
  private void overwriteFile(final Path file, final String result) {
    try {
      final BufferedWriter writer = Files.newBufferedWriter(file, this.charset);
      writer.write(result);
      writer.flush();
      writer.close();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
