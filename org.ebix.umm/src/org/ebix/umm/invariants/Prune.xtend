package org.ebix.umm.invariants

import com.google.inject.Inject

import java.util.ArrayList
import java.util.HashSet
import java.util.List
import java.util.Set

import org.ebix.umm.templates.xsd.MaExtension 
import org.ebix.umm.umm.ABIE
import org.ebix.umm.umm.ASBIE
import org.ebix.umm.umm.BBIE
import org.ebix.umm.umm.BDT
import org.ebix.umm.umm.DocLibrary
import org.ebix.umm.umm.Library
import org.ebix.umm.umm.MA

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import static extension org.eclipse.xtext.xbase.lib.IteratorExtensions.* 

class Prune {

    @Inject extension MaExtension maExtension

    def MA clone(MA ma) {
        var clonedDocLibrary = ma.library.clone
        // find cloned MA
        var allClonedMa = clonedDocLibrary.eAllContents.toIterable.filter(typeof(MA)).toSet
        var clonedMa = allClonedMa.findFirst(m| m.name == ma.name)
        
        // purge other MA's
        allClonedMa.remove(clonedMa)
        for (m: allClonedMa)
            m.delete
            
        return clonedMa 
    }
    
    def DocLibrary clone(DocLibrary docLibrary) {
        var List<Library> model = new ArrayList<Library>()
        model.add(docLibrary)
        model.add(docLibrary.bieLibrary)
        model.add(docLibrary.bdtLibrary)
        
        var clonedModel = copyAll(model)
        return clonedModel.filter(typeof(DocLibrary)).head 
    }

    def void purge(MA ma) {
        ma.purgeABIE
        ma.purgeBDT        
    }

    def void purgeABIE(MA ma) {
        var abies = ma.library.bieLibrary.abies.toSet
        abies.removeAll(ma.allReferedABIE)
        for (abie: abies)
            abie.delete
    }

    def void purgeBDT(MA ma) {
        var bdts = ma.library.bdtLibrary.bdts.toSet
        bdts.removeAll(ma.allReferedBDT)
        for (bdt: bdts)
            bdt.delete
    }

                
    def List<ABIE> allReferedABIE(MA ma) {
        var List<ABIE> collected = new ArrayList<ABIE>()
        for (abie: ma.abies)
            allReferedABIE(collected, abie)
        return collected
    }
                
    def void allReferedABIE(List<ABIE> collected, ABIE abie) {
        if (!collected.contains(abie)) {
            collected.add(abie)
            for (abie2: abie.abies)
                allReferedABIE(collected, abie2)
        }
    }

    def Set<ABIE> abies(MA ma) {
        var Set<ABIE> abies = new HashSet<ABIE>()
        for (p: ma.properties)
            abies.add(p.type)
        return abies
    }

    def Set<ABIE> abies(ABIE abie) {
        var Set<ABIE> abies = new HashSet<ABIE>()
        for (asbie: abie.properties.filter(typeof(ASBIE)))
            abies.add(asbie.type)
        return abies
    }

    def Set<BDT> allReferedBDT(MA ma) {
        var Set<BDT> bdts = new HashSet<BDT>()
        for (abie: ma.library.bieLibrary.abies)
            for (bbie: abie.properties.filter(typeof(BBIE)))
                bdts.add(bbie.type)
        return bdts
    }
    	
}