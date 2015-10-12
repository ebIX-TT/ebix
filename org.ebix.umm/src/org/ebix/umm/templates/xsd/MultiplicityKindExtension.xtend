/*
 *  UMM Schema Generator
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
package org.ebix.umm.templates.xsd


import org.ebix.umm.umm.MultiplicityKind
import java.util.HashMap

class MultiplicityKindExtension {
	
	public static HashMap<String, Integer> fieldSizeMap = new HashMap<String,Integer>(); 
    
    def String use(MultiplicityKind m) {
        switch (m) {
            case MultiplicityKind::ONE          : "required"
            case MultiplicityKind::OPTIONAL     : "optional"
            case MultiplicityKind::ZERO_OR_MORE : "???"
            case MultiplicityKind::ONE_OR_MORE  : "???"
            default         : "ERROR: unknown multiplicity kind"
        }
    }

	def static boolean hasSize(String fieldName){
//		if(fieldSizeMap != null && fieldSizeMap.containsKey(fieldName)) true;
//TODO: Verify business reason if this should be checked in xsd gen. 
return true;
	}

    def String minOccurs(MultiplicityKind m, String fieldName) {
    	if(hasSize(fieldName) && fieldSizeMap.containsKey(fieldName)){
    		val size = fieldSizeMap.get(fieldName);
    		if(size == 0){
	    		switch (m) {
		            case MultiplicityKind::ONE          : "-1"
		            case MultiplicityKind::OPTIONAL     : "-1"
		            case MultiplicityKind::ZERO_OR_MORE : "-1"
		            case MultiplicityKind::ONE_OR_MORE  : "-1"
		            default         : "ERROR: unknown multiplicity kind"
		        }   	
    		} else if (size == 1){
	    		switch (m) {
		            case MultiplicityKind::ONE          : "1"
		            case MultiplicityKind::OPTIONAL     : "0"
		            case MultiplicityKind::ZERO_OR_MORE : "0"
		            case MultiplicityKind::ONE_OR_MORE  : "1"
		            default         : "ERROR: unknown multiplicity kind"
		        }   	
    		} else{
    			//size != 0 && size != 1 Not specifed in specs
	    		switch (m) {
		            case MultiplicityKind::ONE          : "1"
		            case MultiplicityKind::OPTIONAL     : "0"
		            case MultiplicityKind::ZERO_OR_MORE : "0"
		            case MultiplicityKind::ONE_OR_MORE  : "1"
		            default         : "ERROR: unknown multiplicity kind"
		        }   	
    		}
	
    	} else{
	        switch (m) {
	            case MultiplicityKind::ONE          : "1"
	            case MultiplicityKind::OPTIONAL     : "0"
	            case MultiplicityKind::ZERO_OR_MORE : "0"
	            case MultiplicityKind::ONE_OR_MORE  : "1"
	            default         : "ERROR: unknown multiplicity kind"
	        }
        }
    }

    def String maxOccurs(MultiplicityKind m, String fieldName) {
    	if(hasSize(fieldName) && fieldSizeMap.containsKey(fieldName)){
    		val size = fieldSizeMap.get(fieldName);
    		if(size == 0){
	    		switch (m) {
		            case MultiplicityKind::ONE          : "-1"
		            case MultiplicityKind::OPTIONAL     : "-1"
		            case MultiplicityKind::ZERO_OR_MORE : "-1"
		            case MultiplicityKind::ONE_OR_MORE  : "-1"
		            default         : "ERROR: unknown multiplicity kind"
		        }   	
    		} else if (size == 1){
	    		switch (m) {
		            case MultiplicityKind::ONE          : "1"
		            case MultiplicityKind::OPTIONAL     : "1"
		            case MultiplicityKind::ZERO_OR_MORE : "1"
		            case MultiplicityKind::ONE_OR_MORE  : "1"
		            default         : "ERROR: unknown multiplicity kind"
		        }   	
    		} else{
    			//size != 0 && size != 1 Not specifed in specs
		        switch (m) {
		            case MultiplicityKind::ONE          : "1"
		            case MultiplicityKind::OPTIONAL     : "1"
		            case MultiplicityKind::ZERO_OR_MORE : "unbounded"
		            case MultiplicityKind::ONE_OR_MORE  : "unbounded"
		            default         : "ERROR: unknown multiplicity kind"
		        }	
    		}
	
    	} else{
	        switch (m) {
	            case MultiplicityKind::ONE          : "1"
	            case MultiplicityKind::OPTIONAL     : "1"
	            case MultiplicityKind::ZERO_OR_MORE : "unbounded"
	            case MultiplicityKind::ONE_OR_MORE  : "unbounded"
	            default         : "ERROR: unknown multiplicity kind"
	        }
        }
    }
    
    def boolean lowerBoundZero(MultiplicityKind m) {
        switch (m) {
            case MultiplicityKind::ONE          : false
            case MultiplicityKind::OPTIONAL     : true
            case MultiplicityKind::ZERO_OR_MORE : true
            case MultiplicityKind::ONE_OR_MORE  : false
            default         : false
        }
    }
}