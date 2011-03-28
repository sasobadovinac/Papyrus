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
package org.eclipse.papyrus.constraintwithvsl.editor.xtext.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.eclipse.papyrus.constraintwithvsl.editor.xtext.services.ConstraintWithVSLlGrammarAccess;

public class ConstraintWithVSLlParser extends AbstractContentAssistParser {
	
	@Inject
	private ConstraintWithVSLlGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.eclipse.papyrus.constraintwithvsl.editor.xtext.ui.contentassist.antlr.internal.InternalConstraintWithVSLlParser createParser() {
		org.eclipse.papyrus.constraintwithvsl.editor.xtext.ui.contentassist.antlr.internal.InternalConstraintWithVSLlParser result = new org.eclipse.papyrus.constraintwithvsl.editor.xtext.ui.contentassist.antlr.internal.InternalConstraintWithVSLlParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getAndOrXorExpressionAccess().getOpAlternatives_1_0_0(), "rule__AndOrXorExpression__OpAlternatives_1_0_0");
					put(grammarAccess.getEqualityExpressionAccess().getOpAlternatives_1_0_0(), "rule__EqualityExpression__OpAlternatives_1_0_0");
					put(grammarAccess.getRelationalExpressionAccess().getOpAlternatives_1_0_0(), "rule__RelationalExpression__OpAlternatives_1_0_0");
					put(grammarAccess.getAdditiveExpressionAccess().getOpAlternatives_1_0_0(), "rule__AdditiveExpression__OpAlternatives_1_0_0");
					put(grammarAccess.getMultiplicativeExpressionAccess().getOpAlternatives_1_0_0(), "rule__MultiplicativeExpression__OpAlternatives_1_0_0");
					put(grammarAccess.getUnaryExpressionAccess().getAlternatives(), "rule__UnaryExpression__Alternatives");
					put(grammarAccess.getUnaryExpressionAccess().getOpAlternatives_0_0_0(), "rule__UnaryExpression__OpAlternatives_0_0_0");
					put(grammarAccess.getValueSpecificationAccess().getAlternatives(), "rule__ValueSpecification__Alternatives");
					put(grammarAccess.getSuffixExpressionAccess().getAlternatives(), "rule__SuffixExpression__Alternatives");
					put(grammarAccess.getLiteralAccess().getAlternatives(), "rule__Literal__Alternatives");
					put(grammarAccess.getIntervalAccess().getAlternatives_0(), "rule__Interval__Alternatives_0");
					put(grammarAccess.getIntervalAccess().getAlternatives_4(), "rule__Interval__Alternatives_4");
					put(grammarAccess.getTimeExpressionAccess().getAlternatives(), "rule__TimeExpression__Alternatives");
					put(grammarAccess.getVariableDeclarationAccess().getAlternatives_3(), "rule__VariableDeclaration__Alternatives_3");
					put(grammarAccess.getVariableDirectionKindAccess().getAlternatives(), "rule__VariableDirectionKind__Alternatives");
					put(grammarAccess.getNumberLiteralRuleAccess().getAlternatives(), "rule__NumberLiteralRule__Alternatives");
					put(grammarAccess.getAndOrXorExpressionAccess().getGroup(), "rule__AndOrXorExpression__Group__0");
					put(grammarAccess.getAndOrXorExpressionAccess().getGroup_1(), "rule__AndOrXorExpression__Group_1__0");
					put(grammarAccess.getEqualityExpressionAccess().getGroup(), "rule__EqualityExpression__Group__0");
					put(grammarAccess.getEqualityExpressionAccess().getGroup_1(), "rule__EqualityExpression__Group_1__0");
					put(grammarAccess.getRelationalExpressionAccess().getGroup(), "rule__RelationalExpression__Group__0");
					put(grammarAccess.getRelationalExpressionAccess().getGroup_1(), "rule__RelationalExpression__Group_1__0");
					put(grammarAccess.getConditionalExpressionAccess().getGroup(), "rule__ConditionalExpression__Group__0");
					put(grammarAccess.getConditionalExpressionAccess().getGroup_1(), "rule__ConditionalExpression__Group_1__0");
					put(grammarAccess.getAdditiveExpressionAccess().getGroup(), "rule__AdditiveExpression__Group__0");
					put(grammarAccess.getAdditiveExpressionAccess().getGroup_1(), "rule__AdditiveExpression__Group_1__0");
					put(grammarAccess.getMultiplicativeExpressionAccess().getGroup(), "rule__MultiplicativeExpression__Group__0");
					put(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1(), "rule__MultiplicativeExpression__Group_1__0");
					put(grammarAccess.getUnaryExpressionAccess().getGroup_0(), "rule__UnaryExpression__Group_0__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup(), "rule__PrimaryExpression__Group__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup_1(), "rule__PrimaryExpression__Group_1__0");
					put(grammarAccess.getValueSpecificationAccess().getGroup_7(), "rule__ValueSpecification__Group_7__0");
					put(grammarAccess.getPropertyCallExpressionAccess().getGroup(), "rule__PropertyCallExpression__Group__0");
					put(grammarAccess.getPropertyCallExpressionAccess().getGroup_1(), "rule__PropertyCallExpression__Group_1__0");
					put(grammarAccess.getOperationCallExpressionAccess().getGroup(), "rule__OperationCallExpression__Group__0");
					put(grammarAccess.getOperationCallExpressionAccess().getGroup_4(), "rule__OperationCallExpression__Group_4__0");
					put(grammarAccess.getNameOrChoiceOrBehaviorCallAccess().getGroup(), "rule__NameOrChoiceOrBehaviorCall__Group__0");
					put(grammarAccess.getNameOrChoiceOrBehaviorCallAccess().getGroup_2(), "rule__NameOrChoiceOrBehaviorCall__Group_2__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getIntervalAccess().getGroup(), "rule__Interval__Group__0");
					put(grammarAccess.getCollectionOrTupleAccess().getGroup(), "rule__CollectionOrTuple__Group__0");
					put(grammarAccess.getTupleAccess().getGroup(), "rule__Tuple__Group__0");
					put(grammarAccess.getListOfValuesAccess().getGroup(), "rule__ListOfValues__Group__0");
					put(grammarAccess.getListOfValuesAccess().getGroup_1(), "rule__ListOfValues__Group_1__0");
					put(grammarAccess.getListOfValueNamePairsAccess().getGroup(), "rule__ListOfValueNamePairs__Group__0");
					put(grammarAccess.getListOfValueNamePairsAccess().getGroup_1(), "rule__ListOfValueNamePairs__Group_1__0");
					put(grammarAccess.getValueNamePairAccess().getGroup(), "rule__ValueNamePair__Group__0");
					put(grammarAccess.getInstantObsExpressionAccess().getGroup(), "rule__InstantObsExpression__Group__0");
					put(grammarAccess.getInstantObsExpressionAccess().getGroup_2(), "rule__InstantObsExpression__Group_2__0");
					put(grammarAccess.getInstantObsExpressionAccess().getGroup_3(), "rule__InstantObsExpression__Group_3__0");
					put(grammarAccess.getInstantObsNameAccess().getGroup(), "rule__InstantObsName__Group__0");
					put(grammarAccess.getDurationObsExpressionAccess().getGroup(), "rule__DurationObsExpression__Group__0");
					put(grammarAccess.getDurationObsExpressionAccess().getGroup_2(), "rule__DurationObsExpression__Group_2__0");
					put(grammarAccess.getDurationObsExpressionAccess().getGroup_3(), "rule__DurationObsExpression__Group_3__0");
					put(grammarAccess.getDurationObsNameAccess().getGroup(), "rule__DurationObsName__Group__0");
					put(grammarAccess.getJitterExpAccess().getGroup(), "rule__JitterExp__Group__0");
					put(grammarAccess.getJitterExpAccess().getGroup_2(), "rule__JitterExp__Group_2__0");
					put(grammarAccess.getVariableDeclarationAccess().getGroup(), "rule__VariableDeclaration__Group__0");
					put(grammarAccess.getVariableDeclarationAccess().getGroup_3_0(), "rule__VariableDeclaration__Group_3_0__0");
					put(grammarAccess.getVariableDeclarationAccess().getGroup_3_0_2(), "rule__VariableDeclaration__Group_3_0_2__0");
					put(grammarAccess.getVariableDeclarationAccess().getGroup_3_1(), "rule__VariableDeclaration__Group_3_1__0");
					put(grammarAccess.getDataTypeNameAccess().getGroup(), "rule__DataTypeName__Group__0");
					put(grammarAccess.getConstraintRuleAccess().getSpecificationAssignment(), "rule__ConstraintRule__SpecificationAssignment");
					put(grammarAccess.getConstraintSpecificationAccess().getExpressionAssignment(), "rule__ConstraintSpecification__ExpressionAssignment");
					put(grammarAccess.getExpressionAccess().getExpAssignment(), "rule__Expression__ExpAssignment");
					put(grammarAccess.getAndOrXorExpressionAccess().getExpAssignment_0(), "rule__AndOrXorExpression__ExpAssignment_0");
					put(grammarAccess.getAndOrXorExpressionAccess().getOpAssignment_1_0(), "rule__AndOrXorExpression__OpAssignment_1_0");
					put(grammarAccess.getAndOrXorExpressionAccess().getExpAssignment_1_1(), "rule__AndOrXorExpression__ExpAssignment_1_1");
					put(grammarAccess.getEqualityExpressionAccess().getExpAssignment_0(), "rule__EqualityExpression__ExpAssignment_0");
					put(grammarAccess.getEqualityExpressionAccess().getOpAssignment_1_0(), "rule__EqualityExpression__OpAssignment_1_0");
					put(grammarAccess.getEqualityExpressionAccess().getExpAssignment_1_1(), "rule__EqualityExpression__ExpAssignment_1_1");
					put(grammarAccess.getRelationalExpressionAccess().getExpAssignment_0(), "rule__RelationalExpression__ExpAssignment_0");
					put(grammarAccess.getRelationalExpressionAccess().getOpAssignment_1_0(), "rule__RelationalExpression__OpAssignment_1_0");
					put(grammarAccess.getRelationalExpressionAccess().getExpAssignment_1_1(), "rule__RelationalExpression__ExpAssignment_1_1");
					put(grammarAccess.getConditionalExpressionAccess().getExpAssignment_0(), "rule__ConditionalExpression__ExpAssignment_0");
					put(grammarAccess.getConditionalExpressionAccess().getOpAssignment_1_0(), "rule__ConditionalExpression__OpAssignment_1_0");
					put(grammarAccess.getConditionalExpressionAccess().getExpAssignment_1_1(), "rule__ConditionalExpression__ExpAssignment_1_1");
					put(grammarAccess.getConditionalExpressionAccess().getExpAssignment_1_3(), "rule__ConditionalExpression__ExpAssignment_1_3");
					put(grammarAccess.getAdditiveExpressionAccess().getExpAssignment_0(), "rule__AdditiveExpression__ExpAssignment_0");
					put(grammarAccess.getAdditiveExpressionAccess().getOpAssignment_1_0(), "rule__AdditiveExpression__OpAssignment_1_0");
					put(grammarAccess.getAdditiveExpressionAccess().getExpAssignment_1_1(), "rule__AdditiveExpression__ExpAssignment_1_1");
					put(grammarAccess.getMultiplicativeExpressionAccess().getExpAssignment_0(), "rule__MultiplicativeExpression__ExpAssignment_0");
					put(grammarAccess.getMultiplicativeExpressionAccess().getOpAssignment_1_0(), "rule__MultiplicativeExpression__OpAssignment_1_0");
					put(grammarAccess.getMultiplicativeExpressionAccess().getExpAssignment_1_1(), "rule__MultiplicativeExpression__ExpAssignment_1_1");
					put(grammarAccess.getUnaryExpressionAccess().getOpAssignment_0_0(), "rule__UnaryExpression__OpAssignment_0_0");
					put(grammarAccess.getUnaryExpressionAccess().getUnaryAssignment_0_1(), "rule__UnaryExpression__UnaryAssignment_0_1");
					put(grammarAccess.getUnaryExpressionAccess().getExpAssignment_1(), "rule__UnaryExpression__ExpAssignment_1");
					put(grammarAccess.getPrimaryExpressionAccess().getPrefixAssignment_0(), "rule__PrimaryExpression__PrefixAssignment_0");
					put(grammarAccess.getPrimaryExpressionAccess().getSuffixAssignment_1_1(), "rule__PrimaryExpression__SuffixAssignment_1_1");
					put(grammarAccess.getPropertyCallExpressionAccess().getPropertyAssignment_0(), "rule__PropertyCallExpression__PropertyAssignment_0");
					put(grammarAccess.getPropertyCallExpressionAccess().getSuffixAssignment_1_1(), "rule__PropertyCallExpression__SuffixAssignment_1_1");
					put(grammarAccess.getOperationCallExpressionAccess().getOperationAssignment_0(), "rule__OperationCallExpression__OperationAssignment_0");
					put(grammarAccess.getOperationCallExpressionAccess().getArgumentsAssignment_2(), "rule__OperationCallExpression__ArgumentsAssignment_2");
					put(grammarAccess.getOperationCallExpressionAccess().getSuffixAssignment_4_1(), "rule__OperationCallExpression__SuffixAssignment_4_1");
					put(grammarAccess.getNameOrChoiceOrBehaviorCallAccess().getPathAssignment_0(), "rule__NameOrChoiceOrBehaviorCall__PathAssignment_0");
					put(grammarAccess.getNameOrChoiceOrBehaviorCallAccess().getIdAssignment_1(), "rule__NameOrChoiceOrBehaviorCall__IdAssignment_1");
					put(grammarAccess.getNameOrChoiceOrBehaviorCallAccess().getArgumentsAssignment_2_1(), "rule__NameOrChoiceOrBehaviorCall__ArgumentsAssignment_2_1");
					put(grammarAccess.getQualifiedNameAccess().getPathAssignment_0(), "rule__QualifiedName__PathAssignment_0");
					put(grammarAccess.getQualifiedNameAccess().getRemainingAssignment_2(), "rule__QualifiedName__RemainingAssignment_2");
					put(grammarAccess.getIntervalAccess().getIsLowerIncludedAssignment_0_1(), "rule__Interval__IsLowerIncludedAssignment_0_1");
					put(grammarAccess.getIntervalAccess().getLowerAssignment_1(), "rule__Interval__LowerAssignment_1");
					put(grammarAccess.getIntervalAccess().getUpperAssignment_3(), "rule__Interval__UpperAssignment_3");
					put(grammarAccess.getIntervalAccess().getIsUpperIncludedAssignment_4_0(), "rule__Interval__IsUpperIncludedAssignment_4_0");
					put(grammarAccess.getCollectionOrTupleAccess().getListOfValuesAssignment_1(), "rule__CollectionOrTuple__ListOfValuesAssignment_1");
					put(grammarAccess.getTupleAccess().getListOfValueNamePairsAssignment_1(), "rule__Tuple__ListOfValueNamePairsAssignment_1");
					put(grammarAccess.getListOfValuesAccess().getValuesAssignment_0(), "rule__ListOfValues__ValuesAssignment_0");
					put(grammarAccess.getListOfValuesAccess().getValuesAssignment_1_1(), "rule__ListOfValues__ValuesAssignment_1_1");
					put(grammarAccess.getListOfValueNamePairsAccess().getValueNamePairsAssignment_0(), "rule__ListOfValueNamePairs__ValueNamePairsAssignment_0");
					put(grammarAccess.getListOfValueNamePairsAccess().getValueNamePairsAssignment_1_1(), "rule__ListOfValueNamePairs__ValueNamePairsAssignment_1_1");
					put(grammarAccess.getValueNamePairAccess().getPropertyAssignment_0(), "rule__ValueNamePair__PropertyAssignment_0");
					put(grammarAccess.getValueNamePairAccess().getValueAssignment_2(), "rule__ValueNamePair__ValueAssignment_2");
					put(grammarAccess.getInstantObsExpressionAccess().getIdAssignment_1(), "rule__InstantObsExpression__IdAssignment_1");
					put(grammarAccess.getInstantObsExpressionAccess().getIndexAssignment_2_1(), "rule__InstantObsExpression__IndexAssignment_2_1");
					put(grammarAccess.getInstantObsExpressionAccess().getConditionAssignment_3_2(), "rule__InstantObsExpression__ConditionAssignment_3_2");
					put(grammarAccess.getInstantObsNameAccess().getPathAssignment_0(), "rule__InstantObsName__PathAssignment_0");
					put(grammarAccess.getInstantObsNameAccess().getInstantIdAssignment_1(), "rule__InstantObsName__InstantIdAssignment_1");
					put(grammarAccess.getDurationObsExpressionAccess().getIdAssignment_1(), "rule__DurationObsExpression__IdAssignment_1");
					put(grammarAccess.getDurationObsExpressionAccess().getIndexAssignment_2_1(), "rule__DurationObsExpression__IndexAssignment_2_1");
					put(grammarAccess.getDurationObsExpressionAccess().getConditionAssignment_3_2(), "rule__DurationObsExpression__ConditionAssignment_3_2");
					put(grammarAccess.getDurationObsNameAccess().getPathAssignment_0(), "rule__DurationObsName__PathAssignment_0");
					put(grammarAccess.getDurationObsNameAccess().getDurationIdAssignment_1(), "rule__DurationObsName__DurationIdAssignment_1");
					put(grammarAccess.getJitterExpAccess().getFirstInstantAssignment_1(), "rule__JitterExp__FirstInstantAssignment_1");
					put(grammarAccess.getJitterExpAccess().getSecondInstantAssignment_2_1(), "rule__JitterExp__SecondInstantAssignment_2_1");
					put(grammarAccess.getVariableDeclarationAccess().getVariableDeclarationAssignment_0(), "rule__VariableDeclaration__VariableDeclarationAssignment_0");
					put(grammarAccess.getVariableDeclarationAccess().getNameAssignment_2(), "rule__VariableDeclaration__NameAssignment_2");
					put(grammarAccess.getVariableDeclarationAccess().getTypeAssignment_3_0_1(), "rule__VariableDeclaration__TypeAssignment_3_0_1");
					put(grammarAccess.getVariableDeclarationAccess().getInitValueAssignment_3_0_2_2(), "rule__VariableDeclaration__InitValueAssignment_3_0_2_2");
					put(grammarAccess.getVariableDeclarationAccess().getInitValueAssignment_3_1_2(), "rule__VariableDeclaration__InitValueAssignment_3_1_2");
					put(grammarAccess.getDataTypeNameAccess().getPathAssignment_0(), "rule__DataTypeName__PathAssignment_0");
					put(grammarAccess.getDataTypeNameAccess().getTypeAssignment_1(), "rule__DataTypeName__TypeAssignment_1");
					put(grammarAccess.getIntegerLiteralRuleAccess().getValueAssignment(), "rule__IntegerLiteralRule__ValueAssignment");
					put(grammarAccess.getUnlimitedLiteralRuleAccess().getValueAssignment(), "rule__UnlimitedLiteralRule__ValueAssignment");
					put(grammarAccess.getRealLiteralRuleAccess().getValueAssignment(), "rule__RealLiteralRule__ValueAssignment");
					put(grammarAccess.getDateTimeLiteralRuleAccess().getValueAssignment(), "rule__DateTimeLiteralRule__ValueAssignment");
					put(grammarAccess.getBooleanLiteralRuleAccess().getValueAssignment(), "rule__BooleanLiteralRule__ValueAssignment");
					put(grammarAccess.getNullLiteralRuleAccess().getValueAssignment(), "rule__NullLiteralRule__ValueAssignment");
					put(grammarAccess.getDefaultLiteralRuleAccess().getValueAssignment(), "rule__DefaultLiteralRule__ValueAssignment");
					put(grammarAccess.getStringLiteralRuleAccess().getValueAssignment(), "rule__StringLiteralRule__ValueAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.eclipse.papyrus.constraintwithvsl.editor.xtext.ui.contentassist.antlr.internal.InternalConstraintWithVSLlParser typedParser = (org.eclipse.papyrus.constraintwithvsl.editor.xtext.ui.contentassist.antlr.internal.InternalConstraintWithVSLlParser) parser;
			typedParser.entryRuleConstraintRule();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public ConstraintWithVSLlGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ConstraintWithVSLlGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
