package org.ebix.umm.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.ebix.umm.services.UmmGrammarAccess;
import org.ebix.umm.umm.ABIE;
import org.ebix.umm.umm.ACC;
import org.ebix.umm.umm.ASBIE;
import org.ebix.umm.umm.ASCC;
import org.ebix.umm.umm.ASMA;
import org.ebix.umm.umm.ASNONE;
import org.ebix.umm.umm.Assembled;
import org.ebix.umm.umm.BBIE;
import org.ebix.umm.umm.BCC;
import org.ebix.umm.umm.BDT;
import org.ebix.umm.umm.BDTLibrary;
import org.ebix.umm.umm.BIELibrary;
import org.ebix.umm.umm.CCLibrary;
import org.ebix.umm.umm.CDT;
import org.ebix.umm.umm.CDTLibrary;
import org.ebix.umm.umm.CDT_Content;
import org.ebix.umm.umm.CDT_Supplement;
import org.ebix.umm.umm.CodelistEntry;
import org.ebix.umm.umm.Constraint;
import org.ebix.umm.umm.Content;
import org.ebix.umm.umm.DocLibrary;
import org.ebix.umm.umm.ENUMLibrary;
import org.ebix.umm.umm.InfEnvelope;
import org.ebix.umm.umm.MA;
import org.ebix.umm.umm.OclAnd;
import org.ebix.umm.umm.OclArrow;
import org.ebix.umm.umm.OclBooleanFalse;
import org.ebix.umm.umm.OclBooleanTrue;
import org.ebix.umm.umm.OclEnumerationLiteral;
import org.ebix.umm.umm.OclEqual;
import org.ebix.umm.umm.OclForAll;
import org.ebix.umm.umm.OclImplies;
import org.ebix.umm.umm.OclIntegerLiteral;
import org.ebix.umm.umm.OclInvariant;
import org.ebix.umm.umm.OclIsEmpty;
import org.ebix.umm.umm.OclLess;
import org.ebix.umm.umm.OclLessOrEqual;
import org.ebix.umm.umm.OclMore;
import org.ebix.umm.umm.OclMoreOrEqual;
import org.ebix.umm.umm.OclNotEmpty;
import org.ebix.umm.umm.OclOr;
import org.ebix.umm.umm.OclPathFeatureHead;
import org.ebix.umm.umm.OclPathSelfHead;
import org.ebix.umm.umm.OclPathTail;
import org.ebix.umm.umm.OclSize;
import org.ebix.umm.umm.OclStringLiteral;
import org.ebix.umm.umm.OclXor;
import org.ebix.umm.umm.Original;
import org.ebix.umm.umm.Primitive;
import org.ebix.umm.umm.PrimitiveLibrary;
import org.ebix.umm.umm.Subset;
import org.ebix.umm.umm.Supplement;
import org.ebix.umm.umm.TC_Constraint;
import org.ebix.umm.umm.UmmPackage;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class UmmSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private UmmGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == UmmPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case UmmPackage.ABIE:
				if(context == grammarAccess.getABIERule() ||
				   context == grammarAccess.getContextRefRule()) {
					sequence_ABIE(context, (ABIE) semanticObject); 
					return; 
				}
				else break;
			case UmmPackage.ACC:
				if(context == grammarAccess.getACCRule()) {
					sequence_ACC(context, (ACC) semanticObject); 
					return; 
				}
				else break;
			case UmmPackage.ASBIE:
				if(context == grammarAccess.getABIEPropertyRule() ||
				   context == grammarAccess.getASBIERule() ||
				   context == grammarAccess.getOclRefRule()) {
					sequence_ASBIE(context, (ASBIE) semanticObject); 
					return; 
				}
				else break;
			case UmmPackage.ASCC:
				if(context == grammarAccess.getACCPropertyRule() ||
				   context == grammarAccess.getASCCRule()) {
					sequence_ASCC(context, (ASCC) semanticObject); 
					return; 
				}
				else break;
			case UmmPackage.ASMA:
				if(context == grammarAccess.getASMARule() ||
				   context == grammarAccess.getMAPropertyRule() ||
				   context == grammarAccess.getOclRefRule()) {
					sequence_ASMA(context, (ASMA) semanticObject); 
					return; 
				}
				else break;
			case UmmPackage.ASNONE:
				if(context == grammarAccess.getASNONERule() ||
				   context == grammarAccess.getMAPropertyRule() ||
				   context == grammarAccess.getOclRefRule()) {
					sequence_ASNONE(context, (ASNONE) semanticObject); 
					return; 
				}
				else break;
			case UmmPackage.ASSEMBLED:
				if(context == grammarAccess.getAssembledRule() ||
				   context == grammarAccess.getAssembledBaseRule() ||
				   context == grammarAccess.getENUMRule()) {
					sequence_Assembled(context, (Assembled) semanticObject); 
					return; 
				}
				else break;
			case UmmPackage.BBIE:
				if(context == grammarAccess.getABIEPropertyRule() ||
				   context == grammarAccess.getBBIERule() ||
				   context == grammarAccess.getOclRefRule()) {
					sequence_BBIE(context, (BBIE) semanticObject); 
					return; 
				}
				else break;
			case UmmPackage.BCC:
				if(context == grammarAccess.getACCPropertyRule() ||
				   context == grammarAccess.getBCCRule()) {
					sequence_BCC(context, (BCC) semanticObject); 
					return; 
				}
				else break;
			case UmmPackage.BDT:
				if(context == grammarAccess.getBDTRule() ||
				   context == grammarAccess.getContextRefRule()) {
					sequence_BDT(context, (BDT) semanticObject); 
					return; 
				}
				else break;
			case UmmPackage.BDT_LIBRARY:
				if(context == grammarAccess.getBDTLibraryRule() ||
				   context == grammarAccess.getLibraryRule()) {
					sequence_BDTLibrary(context, (BDTLibrary) semanticObject); 
					return; 
				}
				else break;
			case UmmPackage.BIE_LIBRARY:
				if(context == grammarAccess.getBIELibraryRule() ||
				   context == grammarAccess.getLibraryRule()) {
					sequence_BIELibrary(context, (BIELibrary) semanticObject); 
					return; 
				}
				else break;
			case UmmPackage.CC_LIBRARY:
				if(context == grammarAccess.getCCLibraryRule() ||
				   context == grammarAccess.getLibraryRule()) {
					sequence_CCLibrary(context, (CCLibrary) semanticObject); 
					return; 
				}
				else break;
			case UmmPackage.CDT:
				if(context == grammarAccess.getCDTRule()) {
					sequence_CDT(context, (CDT) semanticObject); 
					return; 
				}
				else break;
			case UmmPackage.CDT_LIBRARY:
				if(context == grammarAccess.getCDTLibraryRule() ||
				   context == grammarAccess.getLibraryRule()) {
					sequence_CDTLibrary(context, (CDTLibrary) semanticObject); 
					return; 
				}
				else break;
			case UmmPackage.CDT_CONTENT:
				if(context == grammarAccess.getCDTPropertyRule() ||
				   context == grammarAccess.getCDT_ContentRule()) {
					sequence_CDT_Content(context, (CDT_Content) semanticObject); 
					return; 
				}
				else break;
			case UmmPackage.CDT_SUPPLEMENT:
				if(context == grammarAccess.getCDTPropertyRule() ||
				   context == grammarAccess.getCDT_SupplementRule()) {
					sequence_CDT_Supplement(context, (CDT_Supplement) semanticObject); 
					return; 
				}
				else break;
			case UmmPackage.CODELIST_ENTRY:
				if(context == grammarAccess.getCodelistEntryRule()) {
					sequence_CodelistEntry(context, (CodelistEntry) semanticObject); 
					return; 
				}
				else break;
			case UmmPackage.CONSTRAINT:
				if(context == grammarAccess.getConstraintRule()) {
					sequence_Constraint(context, (Constraint) semanticObject); 
					return; 
				}
				else break;
			case UmmPackage.CONTENT:
				if(context == grammarAccess.getBDTPropertyRule() ||
				   context == grammarAccess.getContentRule() ||
				   context == grammarAccess.getOclRefRule()) {
					sequence_Content(context, (Content) semanticObject); 
					return; 
				}
				else break;
			case UmmPackage.DOC_LIBRARY:
				if(context == grammarAccess.getDocLibraryRule() ||
				   context == grammarAccess.getLibraryRule()) {
					sequence_DocLibrary(context, (DocLibrary) semanticObject); 
					return; 
				}
				else break;
			case UmmPackage.ENUM_LIBRARY:
				if(context == grammarAccess.getENUMLibraryRule() ||
				   context == grammarAccess.getLibraryRule()) {
					sequence_ENUMLibrary(context, (ENUMLibrary) semanticObject); 
					return; 
				}
				else break;
			case UmmPackage.INF_ENVELOPE:
				if(context == grammarAccess.getInfEnvelopeRule()) {
					sequence_InfEnvelope(context, (InfEnvelope) semanticObject); 
					return; 
				}
				else break;
			case UmmPackage.MA:
				if(context == grammarAccess.getContextRefRule() ||
				   context == grammarAccess.getMARule()) {
					sequence_MA(context, (MA) semanticObject); 
					return; 
				}
				else break;
			case UmmPackage.OCL_AND:
				if(context == grammarAccess.getOclExpressionRule() ||
				   context == grammarAccess.getOclOperationImpliesRule() ||
				   context == grammarAccess.getOclOperationImpliesAccess().getOclImpliesLeftAction_1_0() ||
				   context == grammarAccess.getOclOperationLogicAndRule() ||
				   context == grammarAccess.getOclOperationLogicAndAccess().getOclAndLeftAction_1_0()) {
					sequence_OclOperationLogicAnd(context, (OclAnd) semanticObject); 
					return; 
				}
				else break;
			case UmmPackage.OCL_ARROW:
				if(context == grammarAccess.getOclExpressionRule() ||
				   context == grammarAccess.getOclOperationArrowRule() ||
				   context == grammarAccess.getOclOperationImpliesRule() ||
				   context == grammarAccess.getOclOperationImpliesAccess().getOclImpliesLeftAction_1_0() ||
				   context == grammarAccess.getOclOperationLogicAndRule() ||
				   context == grammarAccess.getOclOperationLogicAndAccess().getOclAndLeftAction_1_0() ||
				   context == grammarAccess.getOclOperationLogicCompareRule() ||
				   context == grammarAccess.getOclOperationLogicCompareAccess().getOclLessOrEqualLeftAction_1_0_1_0() ||
				   context == grammarAccess.getOclOperationLogicCompareAccess().getOclLessLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOclOperationLogicCompareAccess().getOclMoreOrEqualLeftAction_1_0_3_0() ||
				   context == grammarAccess.getOclOperationLogicCompareAccess().getOclMoreLeftAction_1_0_2_0() ||
				   context == grammarAccess.getOclOperationLogicEqualRule() ||
				   context == grammarAccess.getOclOperationLogicEqualAccess().getOclEqualLeftAction_1_0() ||
				   context == grammarAccess.getOclOperationLogicOrRule() ||
				   context == grammarAccess.getOclOperationLogicOrAccess().getOclOrLeftAction_1_0() ||
				   context == grammarAccess.getOclOperationLogicXorRule() ||
				   context == grammarAccess.getOclOperationLogicXorAccess().getOclXorLeftAction_1_0()) {
					sequence_OclOperationArrow(context, (OclArrow) semanticObject); 
					return; 
				}
				else break;
			case UmmPackage.OCL_BOOLEAN_FALSE:
				if(context == grammarAccess.getOclBooleanFalseRule() ||
				   context == grammarAccess.getOclBooleanLiteralRule() ||
				   context == grammarAccess.getOclExpressionRule() ||
				   context == grammarAccess.getOclLiteralRule() ||
				   context == grammarAccess.getOclOperationArrowRule() ||
				   context == grammarAccess.getOclOperationArrowAccess().getOclArrowLeftAction_1_0() ||
				   context == grammarAccess.getOclOperationImpliesRule() ||
				   context == grammarAccess.getOclOperationImpliesAccess().getOclImpliesLeftAction_1_0() ||
				   context == grammarAccess.getOclOperationLogicAndRule() ||
				   context == grammarAccess.getOclOperationLogicAndAccess().getOclAndLeftAction_1_0() ||
				   context == grammarAccess.getOclOperationLogicCompareRule() ||
				   context == grammarAccess.getOclOperationLogicCompareAccess().getOclLessOrEqualLeftAction_1_0_1_0() ||
				   context == grammarAccess.getOclOperationLogicCompareAccess().getOclLessLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOclOperationLogicCompareAccess().getOclMoreOrEqualLeftAction_1_0_3_0() ||
				   context == grammarAccess.getOclOperationLogicCompareAccess().getOclMoreLeftAction_1_0_2_0() ||
				   context == grammarAccess.getOclOperationLogicEqualRule() ||
				   context == grammarAccess.getOclOperationLogicEqualAccess().getOclEqualLeftAction_1_0() ||
				   context == grammarAccess.getOclOperationLogicOrRule() ||
				   context == grammarAccess.getOclOperationLogicOrAccess().getOclOrLeftAction_1_0() ||
				   context == grammarAccess.getOclOperationLogicXorRule() ||
				   context == grammarAccess.getOclOperationLogicXorAccess().getOclXorLeftAction_1_0() ||
				   context == grammarAccess.getOclValueRule()) {
					sequence_OclBooleanFalse(context, (OclBooleanFalse) semanticObject); 
					return; 
				}
				else break;
			case UmmPackage.OCL_BOOLEAN_TRUE:
				if(context == grammarAccess.getOclBooleanLiteralRule() ||
				   context == grammarAccess.getOclBooleanTrueRule() ||
				   context == grammarAccess.getOclExpressionRule() ||
				   context == grammarAccess.getOclLiteralRule() ||
				   context == grammarAccess.getOclOperationArrowRule() ||
				   context == grammarAccess.getOclOperationArrowAccess().getOclArrowLeftAction_1_0() ||
				   context == grammarAccess.getOclOperationImpliesRule() ||
				   context == grammarAccess.getOclOperationImpliesAccess().getOclImpliesLeftAction_1_0() ||
				   context == grammarAccess.getOclOperationLogicAndRule() ||
				   context == grammarAccess.getOclOperationLogicAndAccess().getOclAndLeftAction_1_0() ||
				   context == grammarAccess.getOclOperationLogicCompareRule() ||
				   context == grammarAccess.getOclOperationLogicCompareAccess().getOclLessOrEqualLeftAction_1_0_1_0() ||
				   context == grammarAccess.getOclOperationLogicCompareAccess().getOclLessLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOclOperationLogicCompareAccess().getOclMoreOrEqualLeftAction_1_0_3_0() ||
				   context == grammarAccess.getOclOperationLogicCompareAccess().getOclMoreLeftAction_1_0_2_0() ||
				   context == grammarAccess.getOclOperationLogicEqualRule() ||
				   context == grammarAccess.getOclOperationLogicEqualAccess().getOclEqualLeftAction_1_0() ||
				   context == grammarAccess.getOclOperationLogicOrRule() ||
				   context == grammarAccess.getOclOperationLogicOrAccess().getOclOrLeftAction_1_0() ||
				   context == grammarAccess.getOclOperationLogicXorRule() ||
				   context == grammarAccess.getOclOperationLogicXorAccess().getOclXorLeftAction_1_0() ||
				   context == grammarAccess.getOclValueRule()) {
					sequence_OclBooleanTrue(context, (OclBooleanTrue) semanticObject); 
					return; 
				}
				else break;
			case UmmPackage.OCL_ENUMERATION_LITERAL:
				if(context == grammarAccess.getOclEnumerationLiteralRule() ||
				   context == grammarAccess.getOclExpressionRule() ||
				   context == grammarAccess.getOclLiteralRule() ||
				   context == grammarAccess.getOclOperationArrowRule() ||
				   context == grammarAccess.getOclOperationArrowAccess().getOclArrowLeftAction_1_0() ||
				   context == grammarAccess.getOclOperationImpliesRule() ||
				   context == grammarAccess.getOclOperationImpliesAccess().getOclImpliesLeftAction_1_0() ||
				   context == grammarAccess.getOclOperationLogicAndRule() ||
				   context == grammarAccess.getOclOperationLogicAndAccess().getOclAndLeftAction_1_0() ||
				   context == grammarAccess.getOclOperationLogicCompareRule() ||
				   context == grammarAccess.getOclOperationLogicCompareAccess().getOclLessOrEqualLeftAction_1_0_1_0() ||
				   context == grammarAccess.getOclOperationLogicCompareAccess().getOclLessLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOclOperationLogicCompareAccess().getOclMoreOrEqualLeftAction_1_0_3_0() ||
				   context == grammarAccess.getOclOperationLogicCompareAccess().getOclMoreLeftAction_1_0_2_0() ||
				   context == grammarAccess.getOclOperationLogicEqualRule() ||
				   context == grammarAccess.getOclOperationLogicEqualAccess().getOclEqualLeftAction_1_0() ||
				   context == grammarAccess.getOclOperationLogicOrRule() ||
				   context == grammarAccess.getOclOperationLogicOrAccess().getOclOrLeftAction_1_0() ||
				   context == grammarAccess.getOclOperationLogicXorRule() ||
				   context == grammarAccess.getOclOperationLogicXorAccess().getOclXorLeftAction_1_0() ||
				   context == grammarAccess.getOclValueRule()) {
					sequence_OclEnumerationLiteral(context, (OclEnumerationLiteral) semanticObject); 
					return; 
				}
				else break;
			case UmmPackage.OCL_EQUAL:
				if(context == grammarAccess.getOclExpressionRule() ||
				   context == grammarAccess.getOclOperationImpliesRule() ||
				   context == grammarAccess.getOclOperationImpliesAccess().getOclImpliesLeftAction_1_0() ||
				   context == grammarAccess.getOclOperationLogicAndRule() ||
				   context == grammarAccess.getOclOperationLogicAndAccess().getOclAndLeftAction_1_0() ||
				   context == grammarAccess.getOclOperationLogicEqualRule() ||
				   context == grammarAccess.getOclOperationLogicEqualAccess().getOclEqualLeftAction_1_0() ||
				   context == grammarAccess.getOclOperationLogicOrRule() ||
				   context == grammarAccess.getOclOperationLogicOrAccess().getOclOrLeftAction_1_0() ||
				   context == grammarAccess.getOclOperationLogicXorRule() ||
				   context == grammarAccess.getOclOperationLogicXorAccess().getOclXorLeftAction_1_0()) {
					sequence_OclOperationLogicEqual(context, (OclEqual) semanticObject); 
					return; 
				}
				else break;
			case UmmPackage.OCL_FOR_ALL:
				if(context == grammarAccess.getOclForAllRule() ||
				   context == grammarAccess.getOclFunctionCallRule()) {
					sequence_OclForAll(context, (OclForAll) semanticObject); 
					return; 
				}
				else break;
			case UmmPackage.OCL_IMPLIES:
				if(context == grammarAccess.getOclExpressionRule() ||
				   context == grammarAccess.getOclOperationImpliesRule() ||
				   context == grammarAccess.getOclOperationImpliesAccess().getOclImpliesLeftAction_1_0()) {
					sequence_OclOperationImplies(context, (OclImplies) semanticObject); 
					return; 
				}
				else break;
			case UmmPackage.OCL_INTEGER_LITERAL:
				if(context == grammarAccess.getOclExpressionRule() ||
				   context == grammarAccess.getOclIntegerLiteralRule() ||
				   context == grammarAccess.getOclLiteralRule() ||
				   context == grammarAccess.getOclOperationArrowRule() ||
				   context == grammarAccess.getOclOperationArrowAccess().getOclArrowLeftAction_1_0() ||
				   context == grammarAccess.getOclOperationImpliesRule() ||
				   context == grammarAccess.getOclOperationImpliesAccess().getOclImpliesLeftAction_1_0() ||
				   context == grammarAccess.getOclOperationLogicAndRule() ||
				   context == grammarAccess.getOclOperationLogicAndAccess().getOclAndLeftAction_1_0() ||
				   context == grammarAccess.getOclOperationLogicCompareRule() ||
				   context == grammarAccess.getOclOperationLogicCompareAccess().getOclLessOrEqualLeftAction_1_0_1_0() ||
				   context == grammarAccess.getOclOperationLogicCompareAccess().getOclLessLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOclOperationLogicCompareAccess().getOclMoreOrEqualLeftAction_1_0_3_0() ||
				   context == grammarAccess.getOclOperationLogicCompareAccess().getOclMoreLeftAction_1_0_2_0() ||
				   context == grammarAccess.getOclOperationLogicEqualRule() ||
				   context == grammarAccess.getOclOperationLogicEqualAccess().getOclEqualLeftAction_1_0() ||
				   context == grammarAccess.getOclOperationLogicOrRule() ||
				   context == grammarAccess.getOclOperationLogicOrAccess().getOclOrLeftAction_1_0() ||
				   context == grammarAccess.getOclOperationLogicXorRule() ||
				   context == grammarAccess.getOclOperationLogicXorAccess().getOclXorLeftAction_1_0() ||
				   context == grammarAccess.getOclValueRule()) {
					sequence_OclIntegerLiteral(context, (OclIntegerLiteral) semanticObject); 
					return; 
				}
				else break;
			case UmmPackage.OCL_INVARIANT:
				if(context == grammarAccess.getOclInvariantRule()) {
					sequence_OclInvariant(context, (OclInvariant) semanticObject); 
					return; 
				}
				else break;
			case UmmPackage.OCL_IS_EMPTY:
				if(context == grammarAccess.getOclFunctionCallRule() ||
				   context == grammarAccess.getOclIsEmptyRule()) {
					sequence_OclIsEmpty(context, (OclIsEmpty) semanticObject); 
					return; 
				}
				else break;
			case UmmPackage.OCL_LESS:
				if(context == grammarAccess.getOclExpressionRule() ||
				   context == grammarAccess.getOclOperationImpliesRule() ||
				   context == grammarAccess.getOclOperationImpliesAccess().getOclImpliesLeftAction_1_0() ||
				   context == grammarAccess.getOclOperationLogicAndRule() ||
				   context == grammarAccess.getOclOperationLogicAndAccess().getOclAndLeftAction_1_0() ||
				   context == grammarAccess.getOclOperationLogicCompareRule() ||
				   context == grammarAccess.getOclOperationLogicCompareAccess().getOclLessOrEqualLeftAction_1_0_1_0() ||
				   context == grammarAccess.getOclOperationLogicCompareAccess().getOclLessLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOclOperationLogicCompareAccess().getOclMoreOrEqualLeftAction_1_0_3_0() ||
				   context == grammarAccess.getOclOperationLogicCompareAccess().getOclMoreLeftAction_1_0_2_0() ||
				   context == grammarAccess.getOclOperationLogicEqualRule() ||
				   context == grammarAccess.getOclOperationLogicEqualAccess().getOclEqualLeftAction_1_0() ||
				   context == grammarAccess.getOclOperationLogicOrRule() ||
				   context == grammarAccess.getOclOperationLogicOrAccess().getOclOrLeftAction_1_0() ||
				   context == grammarAccess.getOclOperationLogicXorRule() ||
				   context == grammarAccess.getOclOperationLogicXorAccess().getOclXorLeftAction_1_0()) {
					sequence_OclOperationLogicCompare(context, (OclLess) semanticObject); 
					return; 
				}
				else break;
			case UmmPackage.OCL_LESS_OR_EQUAL:
				if(context == grammarAccess.getOclExpressionRule() ||
				   context == grammarAccess.getOclOperationImpliesRule() ||
				   context == grammarAccess.getOclOperationImpliesAccess().getOclImpliesLeftAction_1_0() ||
				   context == grammarAccess.getOclOperationLogicAndRule() ||
				   context == grammarAccess.getOclOperationLogicAndAccess().getOclAndLeftAction_1_0() ||
				   context == grammarAccess.getOclOperationLogicCompareRule() ||
				   context == grammarAccess.getOclOperationLogicCompareAccess().getOclLessOrEqualLeftAction_1_0_1_0() ||
				   context == grammarAccess.getOclOperationLogicCompareAccess().getOclLessLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOclOperationLogicCompareAccess().getOclMoreOrEqualLeftAction_1_0_3_0() ||
				   context == grammarAccess.getOclOperationLogicCompareAccess().getOclMoreLeftAction_1_0_2_0() ||
				   context == grammarAccess.getOclOperationLogicEqualRule() ||
				   context == grammarAccess.getOclOperationLogicEqualAccess().getOclEqualLeftAction_1_0() ||
				   context == grammarAccess.getOclOperationLogicOrRule() ||
				   context == grammarAccess.getOclOperationLogicOrAccess().getOclOrLeftAction_1_0() ||
				   context == grammarAccess.getOclOperationLogicXorRule() ||
				   context == grammarAccess.getOclOperationLogicXorAccess().getOclXorLeftAction_1_0()) {
					sequence_OclOperationLogicCompare(context, (OclLessOrEqual) semanticObject); 
					return; 
				}
				else break;
			case UmmPackage.OCL_MORE:
				if(context == grammarAccess.getOclExpressionRule() ||
				   context == grammarAccess.getOclOperationImpliesRule() ||
				   context == grammarAccess.getOclOperationImpliesAccess().getOclImpliesLeftAction_1_0() ||
				   context == grammarAccess.getOclOperationLogicAndRule() ||
				   context == grammarAccess.getOclOperationLogicAndAccess().getOclAndLeftAction_1_0() ||
				   context == grammarAccess.getOclOperationLogicCompareRule() ||
				   context == grammarAccess.getOclOperationLogicCompareAccess().getOclLessOrEqualLeftAction_1_0_1_0() ||
				   context == grammarAccess.getOclOperationLogicCompareAccess().getOclLessLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOclOperationLogicCompareAccess().getOclMoreOrEqualLeftAction_1_0_3_0() ||
				   context == grammarAccess.getOclOperationLogicCompareAccess().getOclMoreLeftAction_1_0_2_0() ||
				   context == grammarAccess.getOclOperationLogicEqualRule() ||
				   context == grammarAccess.getOclOperationLogicEqualAccess().getOclEqualLeftAction_1_0() ||
				   context == grammarAccess.getOclOperationLogicOrRule() ||
				   context == grammarAccess.getOclOperationLogicOrAccess().getOclOrLeftAction_1_0() ||
				   context == grammarAccess.getOclOperationLogicXorRule() ||
				   context == grammarAccess.getOclOperationLogicXorAccess().getOclXorLeftAction_1_0()) {
					sequence_OclOperationLogicCompare(context, (OclMore) semanticObject); 
					return; 
				}
				else break;
			case UmmPackage.OCL_MORE_OR_EQUAL:
				if(context == grammarAccess.getOclExpressionRule() ||
				   context == grammarAccess.getOclOperationImpliesRule() ||
				   context == grammarAccess.getOclOperationImpliesAccess().getOclImpliesLeftAction_1_0() ||
				   context == grammarAccess.getOclOperationLogicAndRule() ||
				   context == grammarAccess.getOclOperationLogicAndAccess().getOclAndLeftAction_1_0() ||
				   context == grammarAccess.getOclOperationLogicCompareRule() ||
				   context == grammarAccess.getOclOperationLogicCompareAccess().getOclLessOrEqualLeftAction_1_0_1_0() ||
				   context == grammarAccess.getOclOperationLogicCompareAccess().getOclLessLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOclOperationLogicCompareAccess().getOclMoreOrEqualLeftAction_1_0_3_0() ||
				   context == grammarAccess.getOclOperationLogicCompareAccess().getOclMoreLeftAction_1_0_2_0() ||
				   context == grammarAccess.getOclOperationLogicEqualRule() ||
				   context == grammarAccess.getOclOperationLogicEqualAccess().getOclEqualLeftAction_1_0() ||
				   context == grammarAccess.getOclOperationLogicOrRule() ||
				   context == grammarAccess.getOclOperationLogicOrAccess().getOclOrLeftAction_1_0() ||
				   context == grammarAccess.getOclOperationLogicXorRule() ||
				   context == grammarAccess.getOclOperationLogicXorAccess().getOclXorLeftAction_1_0()) {
					sequence_OclOperationLogicCompare(context, (OclMoreOrEqual) semanticObject); 
					return; 
				}
				else break;
			case UmmPackage.OCL_NOT_EMPTY:
				if(context == grammarAccess.getOclFunctionCallRule() ||
				   context == grammarAccess.getOclNotEmptyRule()) {
					sequence_OclNotEmpty(context, (OclNotEmpty) semanticObject); 
					return; 
				}
				else break;
			case UmmPackage.OCL_OR:
				if(context == grammarAccess.getOclExpressionRule() ||
				   context == grammarAccess.getOclOperationImpliesRule() ||
				   context == grammarAccess.getOclOperationImpliesAccess().getOclImpliesLeftAction_1_0() ||
				   context == grammarAccess.getOclOperationLogicAndRule() ||
				   context == grammarAccess.getOclOperationLogicAndAccess().getOclAndLeftAction_1_0() ||
				   context == grammarAccess.getOclOperationLogicOrRule() ||
				   context == grammarAccess.getOclOperationLogicOrAccess().getOclOrLeftAction_1_0()) {
					sequence_OclOperationLogicOr(context, (OclOr) semanticObject); 
					return; 
				}
				else break;
			case UmmPackage.OCL_PATH_FEATURE_HEAD:
				if(context == grammarAccess.getOclExpressionRule() ||
				   context == grammarAccess.getOclOperationArrowRule() ||
				   context == grammarAccess.getOclOperationArrowAccess().getOclArrowLeftAction_1_0() ||
				   context == grammarAccess.getOclOperationImpliesRule() ||
				   context == grammarAccess.getOclOperationImpliesAccess().getOclImpliesLeftAction_1_0() ||
				   context == grammarAccess.getOclOperationLogicAndRule() ||
				   context == grammarAccess.getOclOperationLogicAndAccess().getOclAndLeftAction_1_0() ||
				   context == grammarAccess.getOclOperationLogicCompareRule() ||
				   context == grammarAccess.getOclOperationLogicCompareAccess().getOclLessOrEqualLeftAction_1_0_1_0() ||
				   context == grammarAccess.getOclOperationLogicCompareAccess().getOclLessLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOclOperationLogicCompareAccess().getOclMoreOrEqualLeftAction_1_0_3_0() ||
				   context == grammarAccess.getOclOperationLogicCompareAccess().getOclMoreLeftAction_1_0_2_0() ||
				   context == grammarAccess.getOclOperationLogicEqualRule() ||
				   context == grammarAccess.getOclOperationLogicEqualAccess().getOclEqualLeftAction_1_0() ||
				   context == grammarAccess.getOclOperationLogicOrRule() ||
				   context == grammarAccess.getOclOperationLogicOrAccess().getOclOrLeftAction_1_0() ||
				   context == grammarAccess.getOclOperationLogicXorRule() ||
				   context == grammarAccess.getOclOperationLogicXorAccess().getOclXorLeftAction_1_0() ||
				   context == grammarAccess.getOclPathFeatureHeadRule() ||
				   context == grammarAccess.getOclReferenceRule() ||
				   context == grammarAccess.getOclValueRule()) {
					sequence_OclPathFeatureHead(context, (OclPathFeatureHead) semanticObject); 
					return; 
				}
				else break;
			case UmmPackage.OCL_PATH_SELF_HEAD:
				if(context == grammarAccess.getOclExpressionRule() ||
				   context == grammarAccess.getOclOperationArrowRule() ||
				   context == grammarAccess.getOclOperationArrowAccess().getOclArrowLeftAction_1_0() ||
				   context == grammarAccess.getOclOperationImpliesRule() ||
				   context == grammarAccess.getOclOperationImpliesAccess().getOclImpliesLeftAction_1_0() ||
				   context == grammarAccess.getOclOperationLogicAndRule() ||
				   context == grammarAccess.getOclOperationLogicAndAccess().getOclAndLeftAction_1_0() ||
				   context == grammarAccess.getOclOperationLogicCompareRule() ||
				   context == grammarAccess.getOclOperationLogicCompareAccess().getOclLessOrEqualLeftAction_1_0_1_0() ||
				   context == grammarAccess.getOclOperationLogicCompareAccess().getOclLessLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOclOperationLogicCompareAccess().getOclMoreOrEqualLeftAction_1_0_3_0() ||
				   context == grammarAccess.getOclOperationLogicCompareAccess().getOclMoreLeftAction_1_0_2_0() ||
				   context == grammarAccess.getOclOperationLogicEqualRule() ||
				   context == grammarAccess.getOclOperationLogicEqualAccess().getOclEqualLeftAction_1_0() ||
				   context == grammarAccess.getOclOperationLogicOrRule() ||
				   context == grammarAccess.getOclOperationLogicOrAccess().getOclOrLeftAction_1_0() ||
				   context == grammarAccess.getOclOperationLogicXorRule() ||
				   context == grammarAccess.getOclOperationLogicXorAccess().getOclXorLeftAction_1_0() ||
				   context == grammarAccess.getOclPathSelfHeadRule() ||
				   context == grammarAccess.getOclReferenceRule() ||
				   context == grammarAccess.getOclValueRule()) {
					sequence_OclPathSelfHead(context, (OclPathSelfHead) semanticObject); 
					return; 
				}
				else break;
			case UmmPackage.OCL_PATH_TAIL:
				if(context == grammarAccess.getOclPathTailRule()) {
					sequence_OclPathTail(context, (OclPathTail) semanticObject); 
					return; 
				}
				else break;
			case UmmPackage.OCL_SIZE:
				if(context == grammarAccess.getOclFunctionCallRule() ||
				   context == grammarAccess.getOclSizeRule()) {
					sequence_OclSize(context, (OclSize) semanticObject); 
					return; 
				}
				else break;
			case UmmPackage.OCL_STRING_LITERAL:
				if(context == grammarAccess.getOclExpressionRule() ||
				   context == grammarAccess.getOclLiteralRule() ||
				   context == grammarAccess.getOclOperationArrowRule() ||
				   context == grammarAccess.getOclOperationArrowAccess().getOclArrowLeftAction_1_0() ||
				   context == grammarAccess.getOclOperationImpliesRule() ||
				   context == grammarAccess.getOclOperationImpliesAccess().getOclImpliesLeftAction_1_0() ||
				   context == grammarAccess.getOclOperationLogicAndRule() ||
				   context == grammarAccess.getOclOperationLogicAndAccess().getOclAndLeftAction_1_0() ||
				   context == grammarAccess.getOclOperationLogicCompareRule() ||
				   context == grammarAccess.getOclOperationLogicCompareAccess().getOclLessOrEqualLeftAction_1_0_1_0() ||
				   context == grammarAccess.getOclOperationLogicCompareAccess().getOclLessLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOclOperationLogicCompareAccess().getOclMoreOrEqualLeftAction_1_0_3_0() ||
				   context == grammarAccess.getOclOperationLogicCompareAccess().getOclMoreLeftAction_1_0_2_0() ||
				   context == grammarAccess.getOclOperationLogicEqualRule() ||
				   context == grammarAccess.getOclOperationLogicEqualAccess().getOclEqualLeftAction_1_0() ||
				   context == grammarAccess.getOclOperationLogicOrRule() ||
				   context == grammarAccess.getOclOperationLogicOrAccess().getOclOrLeftAction_1_0() ||
				   context == grammarAccess.getOclOperationLogicXorRule() ||
				   context == grammarAccess.getOclOperationLogicXorAccess().getOclXorLeftAction_1_0() ||
				   context == grammarAccess.getOclStringLiteralRule() ||
				   context == grammarAccess.getOclValueRule()) {
					sequence_OclStringLiteral(context, (OclStringLiteral) semanticObject); 
					return; 
				}
				else break;
			case UmmPackage.OCL_XOR:
				if(context == grammarAccess.getOclExpressionRule() ||
				   context == grammarAccess.getOclOperationImpliesRule() ||
				   context == grammarAccess.getOclOperationImpliesAccess().getOclImpliesLeftAction_1_0() ||
				   context == grammarAccess.getOclOperationLogicAndRule() ||
				   context == grammarAccess.getOclOperationLogicAndAccess().getOclAndLeftAction_1_0() ||
				   context == grammarAccess.getOclOperationLogicOrRule() ||
				   context == grammarAccess.getOclOperationLogicOrAccess().getOclOrLeftAction_1_0() ||
				   context == grammarAccess.getOclOperationLogicXorRule() ||
				   context == grammarAccess.getOclOperationLogicXorAccess().getOclXorLeftAction_1_0()) {
					sequence_OclOperationLogicXor(context, (OclXor) semanticObject); 
					return; 
				}
				else break;
			case UmmPackage.ORIGINAL:
				if(context == grammarAccess.getENUMRule() ||
				   context == grammarAccess.getOriginalRule()) {
					sequence_Original(context, (Original) semanticObject); 
					return; 
				}
				else break;
			case UmmPackage.PRIMITIVE:
				if(context == grammarAccess.getAssembledBaseRule() ||
				   context == grammarAccess.getENUMRule() ||
				   context == grammarAccess.getPrimitiveRule()) {
					sequence_Primitive(context, (Primitive) semanticObject); 
					return; 
				}
				else break;
			case UmmPackage.PRIMITIVE_LIBRARY:
				if(context == grammarAccess.getLibraryRule() ||
				   context == grammarAccess.getPrimitiveLibraryRule()) {
					sequence_PrimitiveLibrary(context, (PrimitiveLibrary) semanticObject); 
					return; 
				}
				else break;
			case UmmPackage.SUBSET:
				if(context == grammarAccess.getENUMRule() ||
				   context == grammarAccess.getSubsetRule()) {
					sequence_Subset(context, (Subset) semanticObject); 
					return; 
				}
				else break;
			case UmmPackage.SUPPLEMENT:
				if(context == grammarAccess.getBDTPropertyRule() ||
				   context == grammarAccess.getOclRefRule() ||
				   context == grammarAccess.getSupplementRule()) {
					sequence_Supplement(context, (Supplement) semanticObject); 
					return; 
				}
				else break;
			case UmmPackage.TC_CONSTRAINT:
				if(context == grammarAccess.getTC_ConstraintRule()) {
					sequence_TC_Constraint(context, (TC_Constraint) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (businessTerm+=STRING businessTerm+=STRING*)? 
	 *         definition=STRING 
	 *         dictionary=STRING 
	 *         uniqueIdentifier=STRING 
	 *         versionIdentifier=STRING 
	 *         properties+=ABIEProperty* 
	 *         constraints+=Constraint*
	 *     )
	 */
	protected void sequence_ABIE(EObject context, ABIE semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (businessTerm+=STRING businessTerm+=STRING*)? 
	 *         definition=STRING 
	 *         dictionary=STRING 
	 *         uniqueIdentifier=STRING 
	 *         versionIdentifier=STRING 
	 *         properties+=ACCProperty* 
	 *         constraints+=Constraint*
	 *     )
	 */
	protected void sequence_ACC(EObject context, ACC semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         multiplicity=MultiplicityKind 
	 *         name=ID 
	 *         type=[ABIE|ID] 
	 *         (or+=[ABIEProperty|ID] or+=[ABIEProperty|ID]*)? 
	 *         (businessTerm+=STRING businessTerm+=STRING*)? 
	 *         definition=STRING 
	 *         dictionary=STRING 
	 *         uniqueIdentifier=STRING 
	 *         versionIdentifier=STRING 
	 *         sequencingKey=STRING
	 *     )
	 */
	protected void sequence_ASBIE(EObject context, ASBIE semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         multiplicity=MultiplicityKind 
	 *         name=ID 
	 *         type=[ACC|ID] 
	 *         (businessTerm+=STRING businessTerm+=STRING*)? 
	 *         definition=STRING 
	 *         dictionary=STRING 
	 *         uniqueIdentifier=STRING 
	 *         versionIdentifier=STRING 
	 *         sequencingKey=STRING
	 *     )
	 */
	protected void sequence_ASCC(EObject context, ASCC semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID multiplicity=MultiplicityKind type=[ABIE|ID])
	 */
	protected void sequence_ASMA(EObject context, ASMA semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, UmmPackage.Literals.OCL_REF__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UmmPackage.Literals.OCL_REF__NAME));
			if(transientValues.isValueTransient(semanticObject, UmmPackage.Literals.OCL_REF__MULTIPLICITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UmmPackage.Literals.OCL_REF__MULTIPLICITY));
			if(transientValues.isValueTransient(semanticObject, UmmPackage.Literals.MA_PROPERTY__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UmmPackage.Literals.MA_PROPERTY__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getASMAAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getASMAAccess().getMultiplicityMultiplicityKindEnumRuleCall_2_0(), semanticObject.getMultiplicity());
		feeder.accept(grammarAccess.getASMAAccess().getTypeABIEIDTerminalRuleCall_3_0_1(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID multiplicity=MultiplicityKind type=[ABIE|ID])
	 */
	protected void sequence_ASNONE(EObject context, ASNONE semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, UmmPackage.Literals.OCL_REF__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UmmPackage.Literals.OCL_REF__NAME));
			if(transientValues.isValueTransient(semanticObject, UmmPackage.Literals.OCL_REF__MULTIPLICITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UmmPackage.Literals.OCL_REF__MULTIPLICITY));
			if(transientValues.isValueTransient(semanticObject, UmmPackage.Literals.MA_PROPERTY__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UmmPackage.Literals.MA_PROPERTY__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getASNONEAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getASNONEAccess().getMultiplicityMultiplicityKindEnumRuleCall_1_0(), semanticObject.getMultiplicity());
		feeder.accept(grammarAccess.getASNONEAccess().getTypeABIEIDTerminalRuleCall_2_0_1(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (businessTerm+=STRING businessTerm+=STRING*)? 
	 *         definition=STRING 
	 *         codeListAgencyIdentifier=STRING 
	 *         codeListName=STRING 
	 *         codeListIdentifier=STRING 
	 *         dictionary=STRING 
	 *         uniqueIdentifier=STRING 
	 *         versionIdentifier=STRING 
	 *         (originals+=[Original|ID] originals+=[Original|ID]*)? 
	 *         (subsets+=[Subset|ID] subsets+=[Subset|ID]*)?
	 *     )
	 */
	protected void sequence_Assembled(EObject context, Assembled semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         multiplicity=MultiplicityKind 
	 *         name=ID 
	 *         type=[BDT|ID] 
	 *         (restriction+=STRING restriction+=STRING*)? 
	 *         fixedValue=STRING? 
	 *         (or+=[ABIEProperty|ID] or+=[ABIEProperty|ID]*)? 
	 *         (businessTerm+=STRING businessTerm+=STRING*)? 
	 *         definition=STRING 
	 *         dictionary=STRING 
	 *         uniqueIdentifier=STRING 
	 *         versionIdentifier=STRING 
	 *         sequencingKey=STRING
	 *     )
	 */
	protected void sequence_BBIE(EObject context, BBIE semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         multiplicity=MultiplicityKind 
	 *         name=ID 
	 *         type=[CDT|ID] 
	 *         (restriction+=STRING restriction+=STRING*)? 
	 *         fixedValue=STRING? 
	 *         (businessTerm+=STRING businessTerm+=STRING*)? 
	 *         definition=STRING 
	 *         dictionary=STRING 
	 *         uniqueIdentifier=STRING 
	 *         versionIdentifier=STRING 
	 *         sequencingKey=STRING
	 *     )
	 */
	protected void sequence_BCC(EObject context, BCC semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (businessTerm+=STRING businessTerm+=STRING*)? 
	 *         (copyright+=STRING copyright+=STRING*)? 
	 *         (owner+=STRING owner+=STRING*)? 
	 *         (reference+=STRING reference+=STRING*)? 
	 *         uniqueIdentifier=STRING 
	 *         versionIdentifier=STRING 
	 *         baseURN=STRING 
	 *         namespacePrefix=STRING 
	 *         bdts+=BDT*
	 *     )
	 */
	protected void sequence_BDTLibrary(EObject context, BDTLibrary semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (businessTerm+=STRING businessTerm+=STRING*)? 
	 *         definition=STRING 
	 *         dictionary=STRING 
	 *         uniqueIdentifier=STRING 
	 *         versionIdentifier=STRING 
	 *         properties+=BDTProperty*
	 *     )
	 */
	protected void sequence_BDT(EObject context, BDT semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (businessTerm+=STRING businessTerm+=STRING*)? 
	 *         (copyright+=STRING copyright+=STRING*)? 
	 *         (owner+=STRING owner+=STRING*)? 
	 *         (reference+=STRING reference+=STRING*)? 
	 *         uniqueIdentifier=STRING 
	 *         versionIdentifier=STRING 
	 *         baseURN=STRING 
	 *         namespacePrefix=STRING 
	 *         bdtLibrary=[BDTLibrary|ID] 
	 *         abies+=ABIE*
	 *     )
	 */
	protected void sequence_BIELibrary(EObject context, BIELibrary semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=STRING 
	 *         (businessTerm+=STRING businessTerm+=STRING*)? 
	 *         (copyright+=STRING copyright+=STRING*)? 
	 *         (owner+=STRING owner+=STRING*)? 
	 *         (reference+=STRING reference+=STRING*)? 
	 *         uniqueIdentifier=STRING 
	 *         versionIdentifier=STRING 
	 *         baseURN=STRING 
	 *         namespacePrefix=STRING 
	 *         accs+=ACC*
	 *     )
	 */
	protected void sequence_CCLibrary(EObject context, CCLibrary semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=STRING 
	 *         (businessTerm+=STRING businessTerm+=STRING*)? 
	 *         (copyright+=STRING copyright+=STRING*)? 
	 *         (owner+=STRING owner+=STRING*)? 
	 *         (reference+=STRING reference+=STRING*)? 
	 *         uniqueIdentifier=STRING 
	 *         versionIdentifier=STRING 
	 *         baseURN=STRING 
	 *         namespacePrefix=STRING 
	 *         cdts+=CDT*
	 *     )
	 */
	protected void sequence_CDTLibrary(EObject context, CDTLibrary semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (businessTerm+=STRING businessTerm+=STRING*)? 
	 *         definition=STRING 
	 *         dictionary=STRING 
	 *         uniqueIdentifier=STRING 
	 *         versionIdentifier=STRING 
	 *         properties+=CDTProperty*
	 *     )
	 */
	protected void sequence_CDT(EObject context, CDT semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         multiplicity=MultiplicityKind 
	 *         name=ID 
	 *         type=[Primitive|ID] 
	 *         (businessTerm+=STRING businessTerm+=STRING*)? 
	 *         definition=STRING 
	 *         dictionary=STRING 
	 *         uniqueIdentifier=STRING 
	 *         versionIdentifier=STRING
	 *     )
	 */
	protected void sequence_CDT_Content(EObject context, CDT_Content semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         multiplicity=MultiplicityKind 
	 *         name=ID 
	 *         type=[Primitive|ID] 
	 *         defaultValue=STRING? 
	 *         (restriction+=STRING restriction+=STRING*)? 
	 *         fixedValue=STRING? 
	 *         (businessTerm+=STRING businessTerm+=STRING*)? 
	 *         definition=STRING 
	 *         dictionary=STRING 
	 *         uniqueIdentifier=STRING 
	 *         versionIdentifier=STRING
	 *     )
	 */
	protected void sequence_CDT_Supplement(EObject context, CDT_Supplement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRING description=STRING)
	 */
	protected void sequence_CodelistEntry(EObject context, CodelistEntry semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, UmmPackage.Literals.CODELIST_ENTRY__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UmmPackage.Literals.CODELIST_ENTRY__NAME));
			if(transientValues.isValueTransient(semanticObject, UmmPackage.Literals.CODELIST_ENTRY__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UmmPackage.Literals.CODELIST_ENTRY__DESCRIPTION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCodelistEntryAccess().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getCodelistEntryAccess().getDescriptionSTRINGTerminalRuleCall_2_0(), semanticObject.getDescription());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (context=[ContextRef|ID] (type+=TC_Constraint type+=TC_Constraint*)? invariants+=OclInvariant*)
	 */
	protected void sequence_Constraint(EObject context, Constraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         multiplicity=MultiplicityKind 
	 *         name=ID 
	 *         type=[AssembledBase|ID] 
	 *         pattern=STRING? 
	 *         minLength=INT? 
	 *         maxLength=INT? 
	 *         length=INT? 
	 *         (businessTerm+=STRING businessTerm+=STRING*)? 
	 *         definition=STRING 
	 *         dictionary=STRING 
	 *         uniqueIdentifier=STRING 
	 *         versionIdentifier=STRING
	 *     )
	 */
	protected void sequence_Content(EObject context, Content semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=STRING 
	 *         (businessTerm+=STRING businessTerm+=STRING*)? 
	 *         (copyright+=STRING copyright+=STRING*)? 
	 *         (owner+=STRING owner+=STRING*)? 
	 *         (reference+=STRING reference+=STRING*)? 
	 *         uniqueIdentifier=STRING 
	 *         versionIdentifier=STRING 
	 *         baseURN=STRING 
	 *         namespacePrefix=STRING 
	 *         bieLibrary=[BIELibrary|ID] 
	 *         bdtLibrary=[BDTLibrary|ID] 
	 *         envelopes+=InfEnvelope*
	 *     )
	 */
	protected void sequence_DocLibrary(EObject context, DocLibrary semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=STRING 
	 *         (businessTerm+=STRING businessTerm+=STRING*)? 
	 *         (copyright+=STRING copyright+=STRING*)? 
	 *         (owner+=STRING owner+=STRING*)? 
	 *         (reference+=STRING reference+=STRING*)? 
	 *         uniqueIdentifier=STRING 
	 *         versionIdentifier=STRING 
	 *         baseURN=STRING 
	 *         namespacePrefix=STRING 
	 *         enums+=ENUM*
	 *     )
	 */
	protected void sequence_ENUMLibrary(EObject context, ENUMLibrary semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRING assemblies+=MA*)
	 */
	protected void sequence_InfEnvelope(EObject context, InfEnvelope semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID properties+=MAProperty* constraints+=Constraint*)
	 */
	protected void sequence_MA(EObject context, MA semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {OclBooleanFalse}
	 */
	protected void sequence_OclBooleanFalse(EObject context, OclBooleanFalse semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {OclBooleanTrue}
	 */
	protected void sequence_OclBooleanTrue(EObject context, OclBooleanTrue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=ENUMLIT
	 */
	protected void sequence_OclEnumerationLiteral(EObject context, OclEnumerationLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, UmmPackage.Literals.OCL_ENUMERATION_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UmmPackage.Literals.OCL_ENUMERATION_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOclEnumerationLiteralAccess().getValueENUMLITTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     body=OclExpression
	 */
	protected void sequence_OclForAll(EObject context, OclForAll semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, UmmPackage.Literals.OCL_FOR_ALL__BODY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UmmPackage.Literals.OCL_FOR_ALL__BODY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOclForAllAccess().getBodyOclExpressionParserRuleCall_2_0(), semanticObject.getBody());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_OclIntegerLiteral(EObject context, OclIntegerLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, UmmPackage.Literals.OCL_INTEGER_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UmmPackage.Literals.OCL_INTEGER_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOclIntegerLiteralAccess().getValueINTTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     expression=OclExpression
	 */
	protected void sequence_OclInvariant(EObject context, OclInvariant semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, UmmPackage.Literals.OCL_INVARIANT__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UmmPackage.Literals.OCL_INVARIANT__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOclInvariantAccess().getExpressionOclExpressionParserRuleCall_1_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {OclIsEmpty}
	 */
	protected void sequence_OclIsEmpty(EObject context, OclIsEmpty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {OclNotEmpty}
	 */
	protected void sequence_OclNotEmpty(EObject context, OclNotEmpty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=OclOperationArrow_OclArrow_1_0 right=OclFunctionCall)
	 */
	protected void sequence_OclOperationArrow(EObject context, OclArrow semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, UmmPackage.Literals.OCL_ARROW__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UmmPackage.Literals.OCL_ARROW__LEFT));
			if(transientValues.isValueTransient(semanticObject, UmmPackage.Literals.OCL_ARROW__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UmmPackage.Literals.OCL_ARROW__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOclOperationArrowAccess().getOclArrowLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getOclOperationArrowAccess().getRightOclFunctionCallParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=OclOperationImplies_OclImplies_1_0 right=OclOperationLogicAnd)
	 */
	protected void sequence_OclOperationImplies(EObject context, OclImplies semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, UmmPackage.Literals.OCL_IMPLIES__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UmmPackage.Literals.OCL_IMPLIES__LEFT));
			if(transientValues.isValueTransient(semanticObject, UmmPackage.Literals.OCL_IMPLIES__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UmmPackage.Literals.OCL_IMPLIES__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOclOperationImpliesAccess().getOclImpliesLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getOclOperationImpliesAccess().getRightOclOperationLogicAndParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=OclOperationLogicAnd_OclAnd_1_0 right=OclOperationLogicOr)
	 */
	protected void sequence_OclOperationLogicAnd(EObject context, OclAnd semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, UmmPackage.Literals.OCL_AND__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UmmPackage.Literals.OCL_AND__LEFT));
			if(transientValues.isValueTransient(semanticObject, UmmPackage.Literals.OCL_AND__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UmmPackage.Literals.OCL_AND__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOclOperationLogicAndAccess().getOclAndLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getOclOperationLogicAndAccess().getRightOclOperationLogicOrParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=OclOperationLogicCompare_OclLess_1_0_0_0 right=OclOperationArrow)
	 */
	protected void sequence_OclOperationLogicCompare(EObject context, OclLess semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, UmmPackage.Literals.OCL_LESS__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UmmPackage.Literals.OCL_LESS__LEFT));
			if(transientValues.isValueTransient(semanticObject, UmmPackage.Literals.OCL_LESS__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UmmPackage.Literals.OCL_LESS__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOclOperationLogicCompareAccess().getOclLessLeftAction_1_0_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getOclOperationLogicCompareAccess().getRightOclOperationArrowParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=OclOperationLogicCompare_OclLessOrEqual_1_0_1_0 right=OclOperationArrow)
	 */
	protected void sequence_OclOperationLogicCompare(EObject context, OclLessOrEqual semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, UmmPackage.Literals.OCL_LESS_OR_EQUAL__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UmmPackage.Literals.OCL_LESS_OR_EQUAL__LEFT));
			if(transientValues.isValueTransient(semanticObject, UmmPackage.Literals.OCL_LESS_OR_EQUAL__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UmmPackage.Literals.OCL_LESS_OR_EQUAL__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOclOperationLogicCompareAccess().getOclLessOrEqualLeftAction_1_0_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getOclOperationLogicCompareAccess().getRightOclOperationArrowParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=OclOperationLogicCompare_OclMore_1_0_2_0 right=OclOperationArrow)
	 */
	protected void sequence_OclOperationLogicCompare(EObject context, OclMore semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, UmmPackage.Literals.OCL_MORE__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UmmPackage.Literals.OCL_MORE__LEFT));
			if(transientValues.isValueTransient(semanticObject, UmmPackage.Literals.OCL_MORE__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UmmPackage.Literals.OCL_MORE__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOclOperationLogicCompareAccess().getOclMoreLeftAction_1_0_2_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getOclOperationLogicCompareAccess().getRightOclOperationArrowParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=OclOperationLogicCompare_OclMoreOrEqual_1_0_3_0 right=OclOperationArrow)
	 */
	protected void sequence_OclOperationLogicCompare(EObject context, OclMoreOrEqual semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, UmmPackage.Literals.OCL_MORE_OR_EQUAL__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UmmPackage.Literals.OCL_MORE_OR_EQUAL__LEFT));
			if(transientValues.isValueTransient(semanticObject, UmmPackage.Literals.OCL_MORE_OR_EQUAL__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UmmPackage.Literals.OCL_MORE_OR_EQUAL__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOclOperationLogicCompareAccess().getOclMoreOrEqualLeftAction_1_0_3_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getOclOperationLogicCompareAccess().getRightOclOperationArrowParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=OclOperationLogicEqual_OclEqual_1_0 right=OclOperationLogicCompare)
	 */
	protected void sequence_OclOperationLogicEqual(EObject context, OclEqual semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, UmmPackage.Literals.OCL_EQUAL__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UmmPackage.Literals.OCL_EQUAL__LEFT));
			if(transientValues.isValueTransient(semanticObject, UmmPackage.Literals.OCL_EQUAL__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UmmPackage.Literals.OCL_EQUAL__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOclOperationLogicEqualAccess().getOclEqualLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getOclOperationLogicEqualAccess().getRightOclOperationLogicCompareParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=OclOperationLogicOr_OclOr_1_0 right=OclOperationLogicXor)
	 */
	protected void sequence_OclOperationLogicOr(EObject context, OclOr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, UmmPackage.Literals.OCL_OR__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UmmPackage.Literals.OCL_OR__LEFT));
			if(transientValues.isValueTransient(semanticObject, UmmPackage.Literals.OCL_OR__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UmmPackage.Literals.OCL_OR__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOclOperationLogicOrAccess().getOclOrLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getOclOperationLogicOrAccess().getRightOclOperationLogicXorParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=OclOperationLogicXor_OclXor_1_0 right=OclOperationLogicEqual)
	 */
	protected void sequence_OclOperationLogicXor(EObject context, OclXor semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, UmmPackage.Literals.OCL_XOR__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UmmPackage.Literals.OCL_XOR__LEFT));
			if(transientValues.isValueTransient(semanticObject, UmmPackage.Literals.OCL_XOR__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UmmPackage.Literals.OCL_XOR__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOclOperationLogicXorAccess().getOclXorLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getOclOperationLogicXorAccess().getRightOclOperationLogicEqualParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (feature=[OclRef|ID] tail=OclPathTail?)
	 */
	protected void sequence_OclPathFeatureHead(EObject context, OclPathFeatureHead semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     path=OclPathTail
	 */
	protected void sequence_OclPathSelfHead(EObject context, OclPathSelfHead semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, UmmPackage.Literals.OCL_PATH_SELF_HEAD__PATH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UmmPackage.Literals.OCL_PATH_SELF_HEAD__PATH));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOclPathSelfHeadAccess().getPathOclPathTailParserRuleCall_1_0(), semanticObject.getPath());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (feature=[OclRef|ID] tail=OclPathTail?)
	 */
	protected void sequence_OclPathTail(EObject context, OclPathTail semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {OclSize}
	 */
	protected void sequence_OclSize(EObject context, OclSize semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_OclStringLiteral(EObject context, OclStringLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, UmmPackage.Literals.OCL_STRING_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UmmPackage.Literals.OCL_STRING_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOclStringLiteralAccess().getValueSTRINGTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (businessTerm+=STRING businessTerm+=STRING*)? 
	 *         definition=STRING 
	 *         codeListAgencyIdentifier=STRING 
	 *         codeListName=STRING 
	 *         codeListIdentifier=STRING 
	 *         dictionary=STRING 
	 *         uniqueIdentifier=STRING 
	 *         versionIdentifier=STRING 
	 *         codes+=CodelistEntry*
	 *     )
	 */
	protected void sequence_Original(EObject context, Original semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRING types+=Primitive*)
	 */
	protected void sequence_PrimitiveLibrary(EObject context, PrimitiveLibrary semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (
	 *             (businessTerm+=STRING businessTerm+=STRING*)? 
	 *             definition=STRING 
	 *             codeListAgencyIdentifier=STRING 
	 *             codeListName=STRING 
	 *             codeListIdentifier=STRING 
	 *             dictionary=STRING 
	 *             uniqueIdentifier=STRING 
	 *             versionIdentifier=STRING
	 *         )?
	 *     )
	 */
	protected void sequence_Primitive(EObject context, Primitive semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (businessTerm+=STRING businessTerm+=STRING*)? 
	 *         definition=STRING 
	 *         codeListAgencyIdentifier=STRING 
	 *         codeListName=STRING 
	 *         codeListIdentifier=STRING 
	 *         dictionary=STRING 
	 *         uniqueIdentifier=STRING 
	 *         versionIdentifier=STRING 
	 *         codes+=CodelistEntry*
	 *     )
	 */
	protected void sequence_Subset(EObject context, Subset semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         multiplicity=MultiplicityKind 
	 *         name=ID 
	 *         type=[AssembledBase|ID] 
	 *         pattern=STRING? 
	 *         minLength=INT? 
	 *         maxLength=INT? 
	 *         length=INT? 
	 *         defaultValue=STRING? 
	 *         (restriction+=STRING restriction+=STRING*)? 
	 *         fixedValue=STRING? 
	 *         (businessTerm+=STRING businessTerm+=STRING*)? 
	 *         definition=STRING 
	 *         dictionary=STRING 
	 *         uniqueIdentifier=STRING 
	 *         versionIdentifier=STRING
	 *     )
	 */
	protected void sequence_Supplement(EObject context, Supplement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (kind=ConstraintKind listIdentifier=STRING responsibleAgency=STRING)
	 */
	protected void sequence_TC_Constraint(EObject context, TC_Constraint semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, UmmPackage.Literals.TC_CONSTRAINT__KIND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UmmPackage.Literals.TC_CONSTRAINT__KIND));
			if(transientValues.isValueTransient(semanticObject, UmmPackage.Literals.TC_CONSTRAINT__LIST_IDENTIFIER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UmmPackage.Literals.TC_CONSTRAINT__LIST_IDENTIFIER));
			if(transientValues.isValueTransient(semanticObject, UmmPackage.Literals.TC_CONSTRAINT__RESPONSIBLE_AGENCY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UmmPackage.Literals.TC_CONSTRAINT__RESPONSIBLE_AGENCY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTC_ConstraintAccess().getKindConstraintKindEnumRuleCall_0_0(), semanticObject.getKind());
		feeder.accept(grammarAccess.getTC_ConstraintAccess().getListIdentifierSTRINGTerminalRuleCall_4_0(), semanticObject.getListIdentifier());
		feeder.accept(grammarAccess.getTC_ConstraintAccess().getResponsibleAgencySTRINGTerminalRuleCall_8_0(), semanticObject.getResponsibleAgency());
		feeder.finish();
	}
}
