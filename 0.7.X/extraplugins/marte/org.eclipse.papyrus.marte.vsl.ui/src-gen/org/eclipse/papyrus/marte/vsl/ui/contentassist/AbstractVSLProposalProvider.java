/*****************************************************************************
 * Copyright (c) 2010 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  CEA LIST - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.marte.vsl.ui.contentassist;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.*;
import org.eclipse.xtext.common.ui.contentassist.TerminalsProposalProvider;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;

/**
 * Represents a generated, default implementation of interface {@link IProposalProvider}.
 * Methods are dynamically dispatched on the first parameter, i.e., you can override them 
 * with a more concrete subtype. 
 */
@SuppressWarnings("all")
public class AbstractVSLProposalProvider extends TerminalsProposalProvider {
		
	public void completeExpression_Exp(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeAndOrXorExpression_Exp(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeAndOrXorExpression_Op(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
		// subclasses may override
		// subclasses may override
	}
	public void completeEqualityExpression_Exp(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeEqualityExpression_Op(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
		// subclasses may override
	}
	public void completeRelationalExpression_Exp(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeRelationalExpression_Op(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
		// subclasses may override
		// subclasses may override
		// subclasses may override
	}
	public void completeConditionalExpression_Exp(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeConditionalExpression_Op(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void completeAdditiveExpression_Exp(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeAdditiveExpression_Op(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
		// subclasses may override
	}
	public void completeMultiplicativeExpression_Exp(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeMultiplicativeExpression_Op(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
		// subclasses may override
		// subclasses may override
	}
	public void completeUnaryExpression_Op(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
		// subclasses may override
		// subclasses may override
	}
	public void completeUnaryExpression_Unary(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeUnaryExpression_Exp(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completePrimaryExpression_Prefix(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completePrimaryExpression_Suffix(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completePropertyCallExpression_Property(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		lookupCrossReference(((CrossReference)assignment.getTerminal()), context, acceptor);
	}
	public void completePropertyCallExpression_Suffix(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeOperationCallExpression_Operation(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		lookupCrossReference(((CrossReference)assignment.getTerminal()), context, acceptor);
	}
	public void completeOperationCallExpression_Arguments(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeOperationCallExpression_Suffix(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeNameOrChoiceOrBehaviorCall_Path(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeNameOrChoiceOrBehaviorCall_Id(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		lookupCrossReference(((CrossReference)assignment.getTerminal()), context, acceptor);
	}
	public void completeNameOrChoiceOrBehaviorCall_Arguments(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeQualifiedName_Path(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		lookupCrossReference(((CrossReference)assignment.getTerminal()), context, acceptor);
	}
	public void completeQualifiedName_Remaining(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeInterval_IsLowerIncluded(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void completeInterval_Lower(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeInterval_Upper(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeInterval_IsUpperIncluded(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void completeCollectionOrTuple_ListOfValues(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeTuple_ListOfValueNamePairs(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeListOfValues_Values(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeListOfValueNamePairs_ValueNamePairs(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeValueNamePair_Property(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		lookupCrossReference(((CrossReference)assignment.getTerminal()), context, acceptor);
	}
	public void completeValueNamePair_Value(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeInstantObsExpression_Id(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeInstantObsExpression_Index(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeInstantObsExpression_Condition(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeInstantObsName_Path(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeInstantObsName_InstantId(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		lookupCrossReference(((CrossReference)assignment.getTerminal()), context, acceptor);
	}
	public void completeDurationObsExpression_Id(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeDurationObsExpression_Index(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeDurationObsExpression_Condition(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeDurationObsName_Path(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeDurationObsName_DurationId(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		lookupCrossReference(((CrossReference)assignment.getTerminal()), context, acceptor);
	}
	public void completeJitterExp_FirstInstant(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeJitterExp_SecondInstant(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeVariableDeclaration_VariableDeclaration(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeVariableDeclaration_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeVariableDeclaration_Type(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeVariableDeclaration_InitValue(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeDataTypeName_Path(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeDataTypeName_Type(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		lookupCrossReference(((CrossReference)assignment.getTerminal()), context, acceptor);
	}
	public void completeIntegerLiteralRule_Value(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeUnlimitedLiteralRule_Value(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void completeRealLiteralRule_Value(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeDateTimeLiteralRule_Value(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeBooleanLiteralRule_Value(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeNullLiteralRule_Value(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeDefaultLiteralRule_Value(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void completeStringLiteralRule_Value(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
    
	public void complete_Expression(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_AndOrXorExpression(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_EqualityExpression(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_RelationalExpression(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_ConditionalExpression(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_AdditiveExpression(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_MultiplicativeExpression(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_UnaryExpression(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_PrimaryExpression(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_ValueSpecification(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_SuffixExpression(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_PropertyCallExpression(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_OperationCallExpression(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_Literal(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_NameOrChoiceOrBehaviorCall(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_QualifiedName(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_Interval(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_CollectionOrTuple(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_Tuple(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_ListOfValues(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_ListOfValueNamePairs(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_ValueNamePair(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_TimeExpression(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_InstantObsExpression(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_InstantObsName(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_DurationObsExpression(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_DurationObsName(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_JitterExp(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_VariableDeclaration(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_VariableDirectionKind(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_DataTypeName(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_NumberLiteralRule(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_IntegerLiteralRule(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_IntegerLiteral(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_UnlimitedLiteralRule(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_RealLiteralRule(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_RealLiteral(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_DateTimeLiteralRule(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_DateTimeLiteral(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_BooleanLiteralRule(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_BooleanLiteral(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_NullLiteralRule(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_NullLiteral(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_DefaultLiteralRule(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_StringLiteralRule(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
}
