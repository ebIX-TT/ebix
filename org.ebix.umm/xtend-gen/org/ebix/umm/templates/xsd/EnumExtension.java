/**
 * UMM Schema Generator
 *  Copyright (C) 2014  ebIX, the European forum for energy Business Information eXchange.
 * 
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 * 
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 * 
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.ebix.umm.templates.xsd;

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
    return _library.getBaseURN();
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
    String _fileName = this.fileName(e);
    return ((directory + "/") + _fileName);
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
      _xifexpression = _versionIdentifier_1.substring(0, 1);
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
      _xifexpression = _versionIdentifier_1.substring(2, 3);
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
      _xifexpression = _versionIdentifier_1.substring(4, 5);
    } else {
      _xifexpression = "";
    }
    return _xifexpression;
  }
  
  public String codeListAgency(final ENUM e) {
    String _switchResult = null;
    String _codeListAgencyIdentifier = e.getCodeListAgencyIdentifier();
    switch (_codeListAgencyIdentifier) {
      case "260":
        _switchResult = "ebix";
        break;
      case "305":
        _switchResult = "etso";
        break;
      case "6":
        _switchResult = "UNECE";
        break;
      case "5":
        _switchResult = "ISO";
        break;
      case "293":
        _switchResult = "BDEW";
        break;
      case "9":
        _switchResult = "GS1";
        break;
      default:
        _switchResult = "unk";
        break;
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
