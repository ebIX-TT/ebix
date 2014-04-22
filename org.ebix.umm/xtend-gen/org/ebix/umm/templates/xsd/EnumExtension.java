package org.ebix.umm.templates.xsd;

import com.google.common.base.Objects;
import java.util.Arrays;
import org.ebix.umm.umm.Assembled;
import org.ebix.umm.umm.ENUM;
import org.ebix.umm.umm.ENUMLibrary;
import org.ebix.umm.umm.MA;
import org.ebix.umm.umm.Original;
import org.ebix.umm.umm.Subset;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public class EnumExtension {
  protected String _xsdName(final ENUM e) {
    return e.getName();
  }
  
  protected String _xsdName(final Original original) {
    String _name = original.getName();
    return ("Original" + _name);
  }
  
  protected String _xsdName(final Subset subset) {
    String _name = subset.getName();
    return ("Subset" + _name);
  }
  
  protected String _xsdName(final Assembled assembled) {
    String _name = assembled.getName();
    return ("Assembled" + _name);
  }
  
  public ENUMLibrary library(final ENUM e) {
    EObject _eContainer = e.eContainer();
    return ((ENUMLibrary) _eContainer);
  }
  
  public String namespace(final ENUM e) {
    ENUMLibrary _library = this.library(e);
    String _baseURN = _library.getBaseURN();
    return _baseURN;
  }
  
  public String xsdType(final ENUM e) {
    String _xsdName = this.xsdName(e);
    return (_xsdName + "ContentType");
  }
  
  public String namespacePrefix(final ENUM e) {
    ENUMLibrary _library = this.library(e);
    String _namespacePrefix = _library.getNamespacePrefix();
    String _codeListAgencyIdentifier = e.getCodeListAgencyIdentifier();
    String _plus = (_namespacePrefix + _codeListAgencyIdentifier);
    String _plus_1 = (_plus + "_");
    String _uniqueIdentifier = e.getUniqueIdentifier();
    String _plus_2 = (_plus_1 + _uniqueIdentifier);
    String _plus_3 = (_plus_2 + "_");
    String _majorVersion = this.majorVersion(e);
    String _plus_4 = (_plus_3 + _majorVersion);
    String _minorVersion = this.minorVersion(e);
    String _plus_5 = (_plus_4 + _minorVersion);
    String _revisionVersion = this.revisionVersion(e);
    return (_plus_5 + _revisionVersion);
  }
  
  public String xsdQualifiedType(final ENUM e) {
    String _namespacePrefix = this.namespacePrefix(e);
    String _plus = (_namespacePrefix + ":");
    String _xsdType = this.xsdType(e);
    return (_plus + _xsdType);
  }
  
  public String fileName(final ENUM e) {
    String _codeListAgencyIdentifier = e.getCodeListAgencyIdentifier();
    String _plus = (_codeListAgencyIdentifier + "_");
    String _uniqueIdentifier = e.getUniqueIdentifier();
    String _plus_1 = (_plus + _uniqueIdentifier);
    String _plus_2 = (_plus_1 + "_");
    String _majorVersion = this.majorVersion(e);
    String _plus_3 = (_plus_2 + _majorVersion);
    String _plus_4 = (_plus_3 + "p");
    String _minorVersion = this.minorVersion(e);
    String _plus_5 = (_plus_4 + _minorVersion);
    String _plus_6 = (_plus_5 + "p");
    String _revisionVersion = this.revisionVersion(e);
    String _plus_7 = (_plus_6 + _revisionVersion);
    return (_plus_7 + ".xsd");
  }
  
  public String fileName(final ENUM e, final String directory) {
    String _plus = (directory + "/");
    String _fileName = this.fileName(e);
    return (_plus + _fileName);
  }
  
  public String fileName(final ENUM e, final String directory, final MA ma) {
    return this.fileName(e, directory);
  }
  
  public String majorVersion(final ENUM e) {
    String _xifexpression = null;
    String _versionIdentifier = e.getVersionIdentifier();
    int _length = _versionIdentifier.length();
    boolean _greaterThan = (_length > 0);
    if (_greaterThan) {
      String _versionIdentifier_1 = e.getVersionIdentifier();
      String _substring = _versionIdentifier_1.substring(0, 1);
      _xifexpression = _substring;
    } else {
      _xifexpression = "";
    }
    return _xifexpression;
  }
  
  public String minorVersion(final ENUM e) {
    String _xifexpression = null;
    String _versionIdentifier = e.getVersionIdentifier();
    int _length = _versionIdentifier.length();
    boolean _greaterThan = (_length > 2);
    if (_greaterThan) {
      String _versionIdentifier_1 = e.getVersionIdentifier();
      String _substring = _versionIdentifier_1.substring(2, 3);
      _xifexpression = _substring;
    } else {
      _xifexpression = "";
    }
    return _xifexpression;
  }
  
  public String revisionVersion(final ENUM e) {
    String _xifexpression = null;
    String _versionIdentifier = e.getVersionIdentifier();
    int _length = _versionIdentifier.length();
    boolean _greaterThan = (_length > 4);
    if (_greaterThan) {
      String _versionIdentifier_1 = e.getVersionIdentifier();
      String _substring = _versionIdentifier_1.substring(4, 5);
      _xifexpression = _substring;
    } else {
      _xifexpression = "";
    }
    return _xifexpression;
  }
  
  public String codeListAgency(final ENUM e) {
    String _switchResult = null;
    String _codeListAgencyIdentifier = e.getCodeListAgencyIdentifier();
    final String _switchValue = _codeListAgencyIdentifier;
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(_switchValue,"260")) {
        _matched=true;
        _switchResult = "ebix";
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"305")) {
        _matched=true;
        _switchResult = "etso";
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"6")) {
        _matched=true;
        _switchResult = "UNECE";
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"5")) {
        _matched=true;
        _switchResult = "ISO";
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"293")) {
        _matched=true;
        _switchResult = "BDEW";
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"9")) {
        _matched=true;
        _switchResult = "GS1";
      }
    }
    if (!_matched) {
      _switchResult = "unk";
    }
    return _switchResult;
  }
  
  public String xsdName(final ENUM assembled) {
    if (assembled instanceof Assembled) {
      return _xsdName((Assembled)assembled);
    } else if (assembled instanceof Original) {
      return _xsdName((Original)assembled);
    } else if (assembled instanceof Subset) {
      return _xsdName((Subset)assembled);
    } else if (assembled != null) {
      return _xsdName(assembled);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(assembled).toString());
    }
  }
}
