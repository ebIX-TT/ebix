package org.ebix.umm.templates.xsd


import org.ebix.umm.umm.MultiplicityKind

class MultiplicityKindExtension {
    
    def String use(MultiplicityKind m) {
        switch (m) {
            case MultiplicityKind::ONE          : "required"
            case MultiplicityKind::OPTIONAL     : "optional"
            case MultiplicityKind::ZERO_OR_MORE : "???"
            case MultiplicityKind::ONE_OR_MORE  : "???"
            default         : "ERROR: unknown multiplicity kind"
        }
    }

    def String minOccurs(MultiplicityKind m) {
        switch (m) {
            case MultiplicityKind::ONE          : "1"
            case MultiplicityKind::OPTIONAL     : "0"
            case MultiplicityKind::ZERO_OR_MORE : "0"
            case MultiplicityKind::ONE_OR_MORE  : "1"
            default         : "ERROR: unknown multiplicity kind"
        }
    }

    def String maxOccurs(MultiplicityKind m) {
        switch (m) {
            case MultiplicityKind::ONE          : "1"
            case MultiplicityKind::OPTIONAL     : "1"
            case MultiplicityKind::ZERO_OR_MORE : "unbounded"
            case MultiplicityKind::ONE_OR_MORE  : "unbounded"
            default         : "ERROR: unknown multiplicity kind"
        }
    }
    
    def boolean lowerBoundZero(MultiplicityKind m) {
        switch (m) {
            case MultiplicityKind::ONE          : false
            case MultiplicityKind::OPTIONAL     : true
            case MultiplicityKind::ZERO_OR_MORE : true
            case MultiplicityKind::ONE_OR_MORE  : false
        }
    }
}