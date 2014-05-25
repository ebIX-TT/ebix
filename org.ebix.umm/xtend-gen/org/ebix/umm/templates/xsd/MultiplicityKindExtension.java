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

import org.ebix.umm.umm.MultiplicityKind;

@SuppressWarnings("all")
public class MultiplicityKindExtension {
  public String use(final MultiplicityKind m) {
    String _switchResult = null;
    if (m != null) {
      switch (m) {
        case ONE:
          _switchResult = "required";
          break;
        case OPTIONAL:
          _switchResult = "optional";
          break;
        case ZERO_OR_MORE:
          _switchResult = "???";
          break;
        case ONE_OR_MORE:
          _switchResult = "???";
          break;
        default:
          _switchResult = "ERROR: unknown multiplicity kind";
          break;
      }
    } else {
      _switchResult = "ERROR: unknown multiplicity kind";
    }
    return _switchResult;
  }
  
  public String minOccurs(final MultiplicityKind m) {
    String _switchResult = null;
    if (m != null) {
      switch (m) {
        case ONE:
          _switchResult = "1";
          break;
        case OPTIONAL:
          _switchResult = "0";
          break;
        case ZERO_OR_MORE:
          _switchResult = "0";
          break;
        case ONE_OR_MORE:
          _switchResult = "1";
          break;
        default:
          _switchResult = "ERROR: unknown multiplicity kind";
          break;
      }
    } else {
      _switchResult = "ERROR: unknown multiplicity kind";
    }
    return _switchResult;
  }
  
  public String maxOccurs(final MultiplicityKind m) {
    String _switchResult = null;
    if (m != null) {
      switch (m) {
        case ONE:
          _switchResult = "1";
          break;
        case OPTIONAL:
          _switchResult = "1";
          break;
        case ZERO_OR_MORE:
          _switchResult = "unbounded";
          break;
        case ONE_OR_MORE:
          _switchResult = "unbounded";
          break;
        default:
          _switchResult = "ERROR: unknown multiplicity kind";
          break;
      }
    } else {
      _switchResult = "ERROR: unknown multiplicity kind";
    }
    return _switchResult;
  }
  
  public boolean lowerBoundZero(final MultiplicityKind m) {
    boolean _switchResult = false;
    if (m != null) {
      switch (m) {
        case ONE:
          _switchResult = false;
          break;
        case OPTIONAL:
          _switchResult = true;
          break;
        case ZERO_OR_MORE:
          _switchResult = true;
          break;
        case ONE_OR_MORE:
          _switchResult = false;
          break;
        default:
          _switchResult = false;
          break;
      }
    } else {
      _switchResult = false;
    }
    return _switchResult;
  }
}
