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

package org.eclipse.papyrus.marte.vsl.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class VSLGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class ExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Expression");
		private final Assignment cExpAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cExpAndOrXorExpressionParserRuleCall_0 = (RuleCall)cExpAssignment.eContents().get(0);
		
		//Expression:
		//	exp=AndOrXorExpression;
		public ParserRule getRule() { return rule; }

		//exp=AndOrXorExpression
		public Assignment getExpAssignment() { return cExpAssignment; }

		//AndOrXorExpression
		public RuleCall getExpAndOrXorExpressionParserRuleCall_0() { return cExpAndOrXorExpressionParserRuleCall_0; }
	}

	public class AndOrXorExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "AndOrXorExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cExpAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cExpEqualityExpressionParserRuleCall_0_0 = (RuleCall)cExpAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Assignment cOpAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final Alternatives cOpAlternatives_1_0_0 = (Alternatives)cOpAssignment_1_0.eContents().get(0);
		private final Keyword cOpAndKeyword_1_0_0_0 = (Keyword)cOpAlternatives_1_0_0.eContents().get(0);
		private final Keyword cOpOrKeyword_1_0_0_1 = (Keyword)cOpAlternatives_1_0_0.eContents().get(1);
		private final Keyword cOpXorKeyword_1_0_0_2 = (Keyword)cOpAlternatives_1_0_0.eContents().get(2);
		private final Assignment cExpAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cExpEqualityExpressionParserRuleCall_1_1_0 = (RuleCall)cExpAssignment_1_1.eContents().get(0);
		
		//AndOrXorExpression:
		//	exp+=EqualityExpression (op+=("and" | "or" | "xor") exp+=EqualityExpression)*;
		public ParserRule getRule() { return rule; }

		//exp+=EqualityExpression (op+=("and" | "or" | "xor") exp+=EqualityExpression)*
		public Group getGroup() { return cGroup; }

		//exp+=EqualityExpression
		public Assignment getExpAssignment_0() { return cExpAssignment_0; }

		//EqualityExpression
		public RuleCall getExpEqualityExpressionParserRuleCall_0_0() { return cExpEqualityExpressionParserRuleCall_0_0; }

		//(op+=("and" | "or" | "xor") exp+=EqualityExpression)*
		public Group getGroup_1() { return cGroup_1; }

		//op+=("and" | "or" | "xor")
		public Assignment getOpAssignment_1_0() { return cOpAssignment_1_0; }

		//"and" | "or" | "xor"
		public Alternatives getOpAlternatives_1_0_0() { return cOpAlternatives_1_0_0; }

		//"and"
		public Keyword getOpAndKeyword_1_0_0_0() { return cOpAndKeyword_1_0_0_0; }

		//"or"
		public Keyword getOpOrKeyword_1_0_0_1() { return cOpOrKeyword_1_0_0_1; }

		//"xor"
		public Keyword getOpXorKeyword_1_0_0_2() { return cOpXorKeyword_1_0_0_2; }

		//exp+=EqualityExpression
		public Assignment getExpAssignment_1_1() { return cExpAssignment_1_1; }

		//EqualityExpression
		public RuleCall getExpEqualityExpressionParserRuleCall_1_1_0() { return cExpEqualityExpressionParserRuleCall_1_1_0; }
	}

	public class EqualityExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EqualityExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cExpAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cExpRelationalExpressionParserRuleCall_0_0 = (RuleCall)cExpAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Assignment cOpAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final Alternatives cOpAlternatives_1_0_0 = (Alternatives)cOpAssignment_1_0.eContents().get(0);
		private final Keyword cOpEqualsSignEqualsSignKeyword_1_0_0_0 = (Keyword)cOpAlternatives_1_0_0.eContents().get(0);
		private final Keyword cOpLessThanSignGreaterThanSignKeyword_1_0_0_1 = (Keyword)cOpAlternatives_1_0_0.eContents().get(1);
		private final Assignment cExpAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cExpRelationalExpressionParserRuleCall_1_1_0 = (RuleCall)cExpAssignment_1_1.eContents().get(0);
		
		//EqualityExpression:
		//	exp+=RelationalExpression (op+=("==" | "<>") exp+=RelationalExpression)*;
		public ParserRule getRule() { return rule; }

		//exp+=RelationalExpression (op+=("==" | "<>") exp+=RelationalExpression)*
		public Group getGroup() { return cGroup; }

		//exp+=RelationalExpression
		public Assignment getExpAssignment_0() { return cExpAssignment_0; }

		//RelationalExpression
		public RuleCall getExpRelationalExpressionParserRuleCall_0_0() { return cExpRelationalExpressionParserRuleCall_0_0; }

		//(op+=("==" | "<>") exp+=RelationalExpression)*
		public Group getGroup_1() { return cGroup_1; }

		//op+=("==" | "<>")
		public Assignment getOpAssignment_1_0() { return cOpAssignment_1_0; }

		//"==" | "<>"
		public Alternatives getOpAlternatives_1_0_0() { return cOpAlternatives_1_0_0; }

		//"=="
		public Keyword getOpEqualsSignEqualsSignKeyword_1_0_0_0() { return cOpEqualsSignEqualsSignKeyword_1_0_0_0; }

		//"<>"
		public Keyword getOpLessThanSignGreaterThanSignKeyword_1_0_0_1() { return cOpLessThanSignGreaterThanSignKeyword_1_0_0_1; }

		//exp+=RelationalExpression
		public Assignment getExpAssignment_1_1() { return cExpAssignment_1_1; }

		//RelationalExpression
		public RuleCall getExpRelationalExpressionParserRuleCall_1_1_0() { return cExpRelationalExpressionParserRuleCall_1_1_0; }
	}

	public class RelationalExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "RelationalExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cExpAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cExpConditionalExpressionParserRuleCall_0_0 = (RuleCall)cExpAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Assignment cOpAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final Alternatives cOpAlternatives_1_0_0 = (Alternatives)cOpAssignment_1_0.eContents().get(0);
		private final Keyword cOpLessThanSignKeyword_1_0_0_0 = (Keyword)cOpAlternatives_1_0_0.eContents().get(0);
		private final Keyword cOpGreaterThanSignKeyword_1_0_0_1 = (Keyword)cOpAlternatives_1_0_0.eContents().get(1);
		private final Keyword cOpLessThanSignEqualsSignKeyword_1_0_0_2 = (Keyword)cOpAlternatives_1_0_0.eContents().get(2);
		private final Keyword cOpGreaterThanSignEqualsSignKeyword_1_0_0_3 = (Keyword)cOpAlternatives_1_0_0.eContents().get(3);
		private final Assignment cExpAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cExpConditionalExpressionParserRuleCall_1_1_0 = (RuleCall)cExpAssignment_1_1.eContents().get(0);
		
		//RelationalExpression:
		//	exp+=ConditionalExpression (op+=("<" | ">" | "<=" | ">=") exp+=ConditionalExpression)*;
		public ParserRule getRule() { return rule; }

		//exp+=ConditionalExpression (op+=("<" | ">" | "<=" | ">=") exp+=ConditionalExpression)*
		public Group getGroup() { return cGroup; }

		//exp+=ConditionalExpression
		public Assignment getExpAssignment_0() { return cExpAssignment_0; }

		//ConditionalExpression
		public RuleCall getExpConditionalExpressionParserRuleCall_0_0() { return cExpConditionalExpressionParserRuleCall_0_0; }

		//(op+=("<" | ">" | "<=" | ">=") exp+=ConditionalExpression)*
		public Group getGroup_1() { return cGroup_1; }

		//op+=("<" | ">" | "<=" | ">=")
		public Assignment getOpAssignment_1_0() { return cOpAssignment_1_0; }

		//"<" | ">" | "<=" | ">="
		public Alternatives getOpAlternatives_1_0_0() { return cOpAlternatives_1_0_0; }

		//"<"
		public Keyword getOpLessThanSignKeyword_1_0_0_0() { return cOpLessThanSignKeyword_1_0_0_0; }

		//">"
		public Keyword getOpGreaterThanSignKeyword_1_0_0_1() { return cOpGreaterThanSignKeyword_1_0_0_1; }

		//"<="
		public Keyword getOpLessThanSignEqualsSignKeyword_1_0_0_2() { return cOpLessThanSignEqualsSignKeyword_1_0_0_2; }

		//">="
		public Keyword getOpGreaterThanSignEqualsSignKeyword_1_0_0_3() { return cOpGreaterThanSignEqualsSignKeyword_1_0_0_3; }

		//exp+=ConditionalExpression
		public Assignment getExpAssignment_1_1() { return cExpAssignment_1_1; }

		//ConditionalExpression
		public RuleCall getExpConditionalExpressionParserRuleCall_1_1_0() { return cExpConditionalExpressionParserRuleCall_1_1_0; }
	}

	public class ConditionalExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ConditionalExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cExpAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cExpAdditiveExpressionParserRuleCall_0_0 = (RuleCall)cExpAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Assignment cOpAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final Keyword cOpQuestionMarkKeyword_1_0_0 = (Keyword)cOpAssignment_1_0.eContents().get(0);
		private final Assignment cExpAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cExpAdditiveExpressionParserRuleCall_1_1_0 = (RuleCall)cExpAssignment_1_1.eContents().get(0);
		private final Keyword cColonKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		private final Assignment cExpAssignment_1_3 = (Assignment)cGroup_1.eContents().get(3);
		private final RuleCall cExpAdditiveExpressionParserRuleCall_1_3_0 = (RuleCall)cExpAssignment_1_3.eContents().get(0);
		
		//ConditionalExpression:
		//	exp+=AdditiveExpression (op+="?" exp+=AdditiveExpression ":" exp+=AdditiveExpression)?;
		public ParserRule getRule() { return rule; }

		//exp+=AdditiveExpression (op+="?" exp+=AdditiveExpression ":" exp+=AdditiveExpression)?
		public Group getGroup() { return cGroup; }

		//exp+=AdditiveExpression
		public Assignment getExpAssignment_0() { return cExpAssignment_0; }

		//AdditiveExpression
		public RuleCall getExpAdditiveExpressionParserRuleCall_0_0() { return cExpAdditiveExpressionParserRuleCall_0_0; }

		//(op+="?" exp+=AdditiveExpression ":" exp+=AdditiveExpression)?
		public Group getGroup_1() { return cGroup_1; }

		//op+="?"
		public Assignment getOpAssignment_1_0() { return cOpAssignment_1_0; }

		//"?"
		public Keyword getOpQuestionMarkKeyword_1_0_0() { return cOpQuestionMarkKeyword_1_0_0; }

		//exp+=AdditiveExpression
		public Assignment getExpAssignment_1_1() { return cExpAssignment_1_1; }

		//AdditiveExpression
		public RuleCall getExpAdditiveExpressionParserRuleCall_1_1_0() { return cExpAdditiveExpressionParserRuleCall_1_1_0; }

		//":"
		public Keyword getColonKeyword_1_2() { return cColonKeyword_1_2; }

		//exp+=AdditiveExpression
		public Assignment getExpAssignment_1_3() { return cExpAssignment_1_3; }

		//AdditiveExpression
		public RuleCall getExpAdditiveExpressionParserRuleCall_1_3_0() { return cExpAdditiveExpressionParserRuleCall_1_3_0; }
	}

	public class AdditiveExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "AdditiveExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cExpAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cExpMultiplicativeExpressionParserRuleCall_0_0 = (RuleCall)cExpAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Assignment cOpAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final Alternatives cOpAlternatives_1_0_0 = (Alternatives)cOpAssignment_1_0.eContents().get(0);
		private final Keyword cOpPlusSignKeyword_1_0_0_0 = (Keyword)cOpAlternatives_1_0_0.eContents().get(0);
		private final Keyword cOpHyphenMinusKeyword_1_0_0_1 = (Keyword)cOpAlternatives_1_0_0.eContents().get(1);
		private final Assignment cExpAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cExpMultiplicativeExpressionParserRuleCall_1_1_0 = (RuleCall)cExpAssignment_1_1.eContents().get(0);
		
		//AdditiveExpression:
		//	exp+=MultiplicativeExpression (op+=("+" | "-") exp+=MultiplicativeExpression)*;
		public ParserRule getRule() { return rule; }

		//exp+=MultiplicativeExpression (op+=("+" | "-") exp+=MultiplicativeExpression)*
		public Group getGroup() { return cGroup; }

		//exp+=MultiplicativeExpression
		public Assignment getExpAssignment_0() { return cExpAssignment_0; }

		//MultiplicativeExpression
		public RuleCall getExpMultiplicativeExpressionParserRuleCall_0_0() { return cExpMultiplicativeExpressionParserRuleCall_0_0; }

		//(op+=("+" | "-") exp+=MultiplicativeExpression)*
		public Group getGroup_1() { return cGroup_1; }

		//op+=("+" | "-")
		public Assignment getOpAssignment_1_0() { return cOpAssignment_1_0; }

		//"+" | "-"
		public Alternatives getOpAlternatives_1_0_0() { return cOpAlternatives_1_0_0; }

		//"+"
		public Keyword getOpPlusSignKeyword_1_0_0_0() { return cOpPlusSignKeyword_1_0_0_0; }

		//"-"
		public Keyword getOpHyphenMinusKeyword_1_0_0_1() { return cOpHyphenMinusKeyword_1_0_0_1; }

		//exp+=MultiplicativeExpression
		public Assignment getExpAssignment_1_1() { return cExpAssignment_1_1; }

		//MultiplicativeExpression
		public RuleCall getExpMultiplicativeExpressionParserRuleCall_1_1_0() { return cExpMultiplicativeExpressionParserRuleCall_1_1_0; }
	}

	public class MultiplicativeExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MultiplicativeExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cExpAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cExpUnaryExpressionParserRuleCall_0_0 = (RuleCall)cExpAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Assignment cOpAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final Alternatives cOpAlternatives_1_0_0 = (Alternatives)cOpAssignment_1_0.eContents().get(0);
		private final Keyword cOpAsteriskKeyword_1_0_0_0 = (Keyword)cOpAlternatives_1_0_0.eContents().get(0);
		private final Keyword cOpSolidusKeyword_1_0_0_1 = (Keyword)cOpAlternatives_1_0_0.eContents().get(1);
		private final Keyword cOpModKeyword_1_0_0_2 = (Keyword)cOpAlternatives_1_0_0.eContents().get(2);
		private final Assignment cExpAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cExpUnaryExpressionParserRuleCall_1_1_0 = (RuleCall)cExpAssignment_1_1.eContents().get(0);
		
		//MultiplicativeExpression:
		//	exp+=UnaryExpression (op+=("*" | "/" | "mod") exp+=UnaryExpression)*;
		public ParserRule getRule() { return rule; }

		//exp+=UnaryExpression (op+=("*" | "/" | "mod") exp+=UnaryExpression)*
		public Group getGroup() { return cGroup; }

		//exp+=UnaryExpression
		public Assignment getExpAssignment_0() { return cExpAssignment_0; }

		//UnaryExpression
		public RuleCall getExpUnaryExpressionParserRuleCall_0_0() { return cExpUnaryExpressionParserRuleCall_0_0; }

		//(op+=("*" | "/" | "mod") exp+=UnaryExpression)*
		public Group getGroup_1() { return cGroup_1; }

		//op+=("*" | "/" | "mod")
		public Assignment getOpAssignment_1_0() { return cOpAssignment_1_0; }

		//"*" | "/" | "mod"
		public Alternatives getOpAlternatives_1_0_0() { return cOpAlternatives_1_0_0; }

		//"*"
		public Keyword getOpAsteriskKeyword_1_0_0_0() { return cOpAsteriskKeyword_1_0_0_0; }

		//"/"
		public Keyword getOpSolidusKeyword_1_0_0_1() { return cOpSolidusKeyword_1_0_0_1; }

		//"mod"
		public Keyword getOpModKeyword_1_0_0_2() { return cOpModKeyword_1_0_0_2; }

		//exp+=UnaryExpression
		public Assignment getExpAssignment_1_1() { return cExpAssignment_1_1; }

		//UnaryExpression
		public RuleCall getExpUnaryExpressionParserRuleCall_1_1_0() { return cExpUnaryExpressionParserRuleCall_1_1_0; }
	}

	public class UnaryExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "UnaryExpression");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Assignment cOpAssignment_0_0 = (Assignment)cGroup_0.eContents().get(0);
		private final Alternatives cOpAlternatives_0_0_0 = (Alternatives)cOpAssignment_0_0.eContents().get(0);
		private final Keyword cOpNotKeyword_0_0_0_0 = (Keyword)cOpAlternatives_0_0_0.eContents().get(0);
		private final Keyword cOpHyphenMinusKeyword_0_0_0_1 = (Keyword)cOpAlternatives_0_0_0.eContents().get(1);
		private final Keyword cOpPlusSignKeyword_0_0_0_2 = (Keyword)cOpAlternatives_0_0_0.eContents().get(2);
		private final Assignment cUnaryAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cUnaryUnaryExpressionParserRuleCall_0_1_0 = (RuleCall)cUnaryAssignment_0_1.eContents().get(0);
		private final Assignment cExpAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cExpPrimaryExpressionParserRuleCall_1_0 = (RuleCall)cExpAssignment_1.eContents().get(0);
		
		//UnaryExpression:
		//	op=("not" | "-" | "+") unary=UnaryExpression | exp=PrimaryExpression;
		public ParserRule getRule() { return rule; }

		//op=("not" | "-" | "+") unary=UnaryExpression | exp=PrimaryExpression
		public Alternatives getAlternatives() { return cAlternatives; }

		//op=("not" | "-" | "+") unary=UnaryExpression
		public Group getGroup_0() { return cGroup_0; }

		//op=("not" | "-" | "+")
		public Assignment getOpAssignment_0_0() { return cOpAssignment_0_0; }

		//"not" | "-" | "+"
		public Alternatives getOpAlternatives_0_0_0() { return cOpAlternatives_0_0_0; }

		//"not"
		public Keyword getOpNotKeyword_0_0_0_0() { return cOpNotKeyword_0_0_0_0; }

		//"-"
		public Keyword getOpHyphenMinusKeyword_0_0_0_1() { return cOpHyphenMinusKeyword_0_0_0_1; }

		//"+"
		public Keyword getOpPlusSignKeyword_0_0_0_2() { return cOpPlusSignKeyword_0_0_0_2; }

		//unary=UnaryExpression
		public Assignment getUnaryAssignment_0_1() { return cUnaryAssignment_0_1; }

		//UnaryExpression
		public RuleCall getUnaryUnaryExpressionParserRuleCall_0_1_0() { return cUnaryUnaryExpressionParserRuleCall_0_1_0; }

		//exp=PrimaryExpression
		public Assignment getExpAssignment_1() { return cExpAssignment_1; }

		//PrimaryExpression
		public RuleCall getExpPrimaryExpressionParserRuleCall_1_0() { return cExpPrimaryExpressionParserRuleCall_1_0; }
	}

	public class PrimaryExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "PrimaryExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cPrefixAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cPrefixValueSpecificationParserRuleCall_0_0 = (RuleCall)cPrefixAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cSuffixAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cSuffixSuffixExpressionParserRuleCall_1_1_0 = (RuleCall)cSuffixAssignment_1_1.eContents().get(0);
		
		//PrimaryExpression:
		//	prefix=ValueSpecification ("." suffix=SuffixExpression)?;
		public ParserRule getRule() { return rule; }

		//prefix=ValueSpecification ("." suffix=SuffixExpression)?
		public Group getGroup() { return cGroup; }

		//prefix=ValueSpecification
		public Assignment getPrefixAssignment_0() { return cPrefixAssignment_0; }

		//ValueSpecification
		public RuleCall getPrefixValueSpecificationParserRuleCall_0_0() { return cPrefixValueSpecificationParserRuleCall_0_0; }

		//("." suffix=SuffixExpression)?
		public Group getGroup_1() { return cGroup_1; }

		//"."
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }

		//suffix=SuffixExpression
		public Assignment getSuffixAssignment_1_1() { return cSuffixAssignment_1_1; }

		//SuffixExpression
		public RuleCall getSuffixSuffixExpressionParserRuleCall_1_1_0() { return cSuffixSuffixExpressionParserRuleCall_1_1_0; }
	}

	public class ValueSpecificationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ValueSpecification");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cLiteralParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cNameOrChoiceOrBehaviorCallParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cIntervalParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cCollectionOrTupleParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cTupleParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cTimeExpressionParserRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		private final RuleCall cVariableDeclarationParserRuleCall_6 = (RuleCall)cAlternatives.eContents().get(6);
		private final Group cGroup_7 = (Group)cAlternatives.eContents().get(7);
		private final Keyword cLeftParenthesisKeyword_7_0 = (Keyword)cGroup_7.eContents().get(0);
		private final RuleCall cExpressionParserRuleCall_7_1 = (RuleCall)cGroup_7.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_7_2 = (Keyword)cGroup_7.eContents().get(2);
		
		//ValueSpecification:
		//	Literal | NameOrChoiceOrBehaviorCall | Interval | CollectionOrTuple | Tuple | TimeExpression | VariableDeclaration |
		//	"(" Expression ")";
		public ParserRule getRule() { return rule; }

		//Literal | NameOrChoiceOrBehaviorCall | Interval | CollectionOrTuple | Tuple | TimeExpression | VariableDeclaration | "("
		//Expression ")"
		public Alternatives getAlternatives() { return cAlternatives; }

		//Literal
		public RuleCall getLiteralParserRuleCall_0() { return cLiteralParserRuleCall_0; }

		//NameOrChoiceOrBehaviorCall
		public RuleCall getNameOrChoiceOrBehaviorCallParserRuleCall_1() { return cNameOrChoiceOrBehaviorCallParserRuleCall_1; }

		//Interval
		public RuleCall getIntervalParserRuleCall_2() { return cIntervalParserRuleCall_2; }

		//CollectionOrTuple
		public RuleCall getCollectionOrTupleParserRuleCall_3() { return cCollectionOrTupleParserRuleCall_3; }

		//Tuple
		public RuleCall getTupleParserRuleCall_4() { return cTupleParserRuleCall_4; }

		//TimeExpression
		public RuleCall getTimeExpressionParserRuleCall_5() { return cTimeExpressionParserRuleCall_5; }

		//VariableDeclaration
		public RuleCall getVariableDeclarationParserRuleCall_6() { return cVariableDeclarationParserRuleCall_6; }

		//"(" Expression ")"
		public Group getGroup_7() { return cGroup_7; }

		//"("
		public Keyword getLeftParenthesisKeyword_7_0() { return cLeftParenthesisKeyword_7_0; }

		//Expression
		public RuleCall getExpressionParserRuleCall_7_1() { return cExpressionParserRuleCall_7_1; }

		//")"
		public Keyword getRightParenthesisKeyword_7_2() { return cRightParenthesisKeyword_7_2; }
	}

	public class SuffixExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "SuffixExpression");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cPropertyCallExpressionParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cOperationCallExpressionParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//SuffixExpression:
		//	PropertyCallExpression | OperationCallExpression;
		public ParserRule getRule() { return rule; }

		//PropertyCallExpression | OperationCallExpression
		public Alternatives getAlternatives() { return cAlternatives; }

		//PropertyCallExpression
		public RuleCall getPropertyCallExpressionParserRuleCall_0() { return cPropertyCallExpressionParserRuleCall_0; }

		//OperationCallExpression
		public RuleCall getOperationCallExpressionParserRuleCall_1() { return cOperationCallExpressionParserRuleCall_1; }
	}

	public class PropertyCallExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "PropertyCallExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cPropertyAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cPropertyPropertyCrossReference_0_0 = (CrossReference)cPropertyAssignment_0.eContents().get(0);
		private final RuleCall cPropertyPropertyIDTerminalRuleCall_0_0_1 = (RuleCall)cPropertyPropertyCrossReference_0_0.eContents().get(1);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cSuffixAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cSuffixSuffixExpressionParserRuleCall_1_1_0 = (RuleCall)cSuffixAssignment_1_1.eContents().get(0);
		
		//PropertyCallExpression:
		//	property=[uml::Property] ("." suffix=SuffixExpression)?;
		public ParserRule getRule() { return rule; }

		//property=[uml::Property] ("." suffix=SuffixExpression)?
		public Group getGroup() { return cGroup; }

		//property=[uml::Property]
		public Assignment getPropertyAssignment_0() { return cPropertyAssignment_0; }

		//[uml::Property]
		public CrossReference getPropertyPropertyCrossReference_0_0() { return cPropertyPropertyCrossReference_0_0; }

		//ID
		public RuleCall getPropertyPropertyIDTerminalRuleCall_0_0_1() { return cPropertyPropertyIDTerminalRuleCall_0_0_1; }

		//("." suffix=SuffixExpression)?
		public Group getGroup_1() { return cGroup_1; }

		//"."
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }

		//suffix=SuffixExpression
		public Assignment getSuffixAssignment_1_1() { return cSuffixAssignment_1_1; }

		//SuffixExpression
		public RuleCall getSuffixSuffixExpressionParserRuleCall_1_1_0() { return cSuffixSuffixExpressionParserRuleCall_1_1_0; }
	}

	public class OperationCallExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "OperationCallExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cOperationAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cOperationOperationCrossReference_0_0 = (CrossReference)cOperationAssignment_0.eContents().get(0);
		private final RuleCall cOperationOperationIDTerminalRuleCall_0_0_1 = (RuleCall)cOperationOperationCrossReference_0_0.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cArgumentsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cArgumentsListOfValuesParserRuleCall_2_0 = (RuleCall)cArgumentsAssignment_2.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cFullStopKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cSuffixAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cSuffixSuffixExpressionParserRuleCall_4_1_0 = (RuleCall)cSuffixAssignment_4_1.eContents().get(0);
		
		//OperationCallExpression:
		//	operation=[uml::Operation] "(" arguments=ListOfValues? ")" ("." suffix=SuffixExpression)?;
		public ParserRule getRule() { return rule; }

		//operation=[uml::Operation] "(" arguments=ListOfValues? ")" ("." suffix=SuffixExpression)?
		public Group getGroup() { return cGroup; }

		//operation=[uml::Operation]
		public Assignment getOperationAssignment_0() { return cOperationAssignment_0; }

		//[uml::Operation]
		public CrossReference getOperationOperationCrossReference_0_0() { return cOperationOperationCrossReference_0_0; }

		//ID
		public RuleCall getOperationOperationIDTerminalRuleCall_0_0_1() { return cOperationOperationIDTerminalRuleCall_0_0_1; }

		//"("
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }

		//arguments=ListOfValues?
		public Assignment getArgumentsAssignment_2() { return cArgumentsAssignment_2; }

		//ListOfValues
		public RuleCall getArgumentsListOfValuesParserRuleCall_2_0() { return cArgumentsListOfValuesParserRuleCall_2_0; }

		//")"
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }

		//("." suffix=SuffixExpression)?
		public Group getGroup_4() { return cGroup_4; }

		//"."
		public Keyword getFullStopKeyword_4_0() { return cFullStopKeyword_4_0; }

		//suffix=SuffixExpression
		public Assignment getSuffixAssignment_4_1() { return cSuffixAssignment_4_1; }

		//SuffixExpression
		public RuleCall getSuffixSuffixExpressionParserRuleCall_4_1_0() { return cSuffixSuffixExpressionParserRuleCall_4_1_0; }
	}

	public class LiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Literal");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cNumberLiteralRuleParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cDateTimeLiteralRuleParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cBooleanLiteralRuleParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cNullLiteralRuleParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cDefaultLiteralRuleParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cStringLiteralRuleParserRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		
		//Literal:
		//	NumberLiteralRule | DateTimeLiteralRule | BooleanLiteralRule | NullLiteralRule | DefaultLiteralRule |
		//	StringLiteralRule;
		public ParserRule getRule() { return rule; }

		//NumberLiteralRule | DateTimeLiteralRule | BooleanLiteralRule | NullLiteralRule | DefaultLiteralRule | StringLiteralRule
		public Alternatives getAlternatives() { return cAlternatives; }

		//NumberLiteralRule
		public RuleCall getNumberLiteralRuleParserRuleCall_0() { return cNumberLiteralRuleParserRuleCall_0; }

		//DateTimeLiteralRule
		public RuleCall getDateTimeLiteralRuleParserRuleCall_1() { return cDateTimeLiteralRuleParserRuleCall_1; }

		//BooleanLiteralRule
		public RuleCall getBooleanLiteralRuleParserRuleCall_2() { return cBooleanLiteralRuleParserRuleCall_2; }

		//NullLiteralRule
		public RuleCall getNullLiteralRuleParserRuleCall_3() { return cNullLiteralRuleParserRuleCall_3; }

		//DefaultLiteralRule
		public RuleCall getDefaultLiteralRuleParserRuleCall_4() { return cDefaultLiteralRuleParserRuleCall_4; }

		//StringLiteralRule
		public RuleCall getStringLiteralRuleParserRuleCall_5() { return cStringLiteralRuleParserRuleCall_5; }
	}

	public class NameOrChoiceOrBehaviorCallElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "NameOrChoiceOrBehaviorCall");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cPathAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cPathQualifiedNameParserRuleCall_0_0 = (RuleCall)cPathAssignment_0.eContents().get(0);
		private final Assignment cIdAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cIdNamedElementCrossReference_1_0 = (CrossReference)cIdAssignment_1.eContents().get(0);
		private final RuleCall cIdNamedElementIDTerminalRuleCall_1_0_1 = (RuleCall)cIdNamedElementCrossReference_1_0.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cLeftParenthesisKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cArgumentsAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cArgumentsListOfValuesParserRuleCall_2_1_0 = (RuleCall)cArgumentsAssignment_2_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_2_2 = (Keyword)cGroup_2.eContents().get(2);
		
		//NameOrChoiceOrBehaviorCall:
		//	path=QualifiedName? // can resolve to :
		//	// - EnumSpecification,
		//	// - VariableCallExpression
		//	// - PropertyCallExpression
		//	// - ChoiceExpression
		//	id=[uml::NamedElement] ("(" arguments=ListOfValues? ")")?;
		public ParserRule getRule() { return rule; }

		//path=QualifiedName? // can resolve to :
		//// - EnumSpecification,
		//// - VariableCallExpression
		//// - PropertyCallExpression
		//// - ChoiceExpression
		//id=[uml::NamedElement] ("(" arguments=ListOfValues? ")")?
		public Group getGroup() { return cGroup; }

		//path=QualifiedName?
		public Assignment getPathAssignment_0() { return cPathAssignment_0; }

		//QualifiedName
		public RuleCall getPathQualifiedNameParserRuleCall_0_0() { return cPathQualifiedNameParserRuleCall_0_0; }

		//id=[uml::NamedElement]
		public Assignment getIdAssignment_1() { return cIdAssignment_1; }

		//[uml::NamedElement]
		public CrossReference getIdNamedElementCrossReference_1_0() { return cIdNamedElementCrossReference_1_0; }

		//ID
		public RuleCall getIdNamedElementIDTerminalRuleCall_1_0_1() { return cIdNamedElementIDTerminalRuleCall_1_0_1; }

		//("(" arguments=ListOfValues? ")")?
		public Group getGroup_2() { return cGroup_2; }

		//"("
		public Keyword getLeftParenthesisKeyword_2_0() { return cLeftParenthesisKeyword_2_0; }

		//arguments=ListOfValues?
		public Assignment getArgumentsAssignment_2_1() { return cArgumentsAssignment_2_1; }

		//ListOfValues
		public RuleCall getArgumentsListOfValuesParserRuleCall_2_1_0() { return cArgumentsListOfValuesParserRuleCall_2_1_0; }

		//")"
		public Keyword getRightParenthesisKeyword_2_2() { return cRightParenthesisKeyword_2_2; }
	}

	public class QualifiedNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "QualifiedName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cPathAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cPathNamespaceCrossReference_0_0 = (CrossReference)cPathAssignment_0.eContents().get(0);
		private final RuleCall cPathNamespaceIDTerminalRuleCall_0_0_1 = (RuleCall)cPathNamespaceCrossReference_0_0.eContents().get(1);
		private final Keyword cColonColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cRemainingAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cRemainingQualifiedNameParserRuleCall_2_0 = (RuleCall)cRemainingAssignment_2.eContents().get(0);
		
		//QualifiedName:
		//	path=[uml::Namespace] "::" remaining=QualifiedName?;
		public ParserRule getRule() { return rule; }

		//path=[uml::Namespace] "::" remaining=QualifiedName?
		public Group getGroup() { return cGroup; }

		//path=[uml::Namespace]
		public Assignment getPathAssignment_0() { return cPathAssignment_0; }

		//[uml::Namespace]
		public CrossReference getPathNamespaceCrossReference_0_0() { return cPathNamespaceCrossReference_0_0; }

		//ID
		public RuleCall getPathNamespaceIDTerminalRuleCall_0_0_1() { return cPathNamespaceIDTerminalRuleCall_0_0_1; }

		//"::"
		public Keyword getColonColonKeyword_1() { return cColonColonKeyword_1; }

		//remaining=QualifiedName?
		public Assignment getRemainingAssignment_2() { return cRemainingAssignment_2; }

		//QualifiedName
		public RuleCall getRemainingQualifiedNameParserRuleCall_2_0() { return cRemainingQualifiedNameParserRuleCall_2_0; }
	}

	public class IntervalElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Interval");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Alternatives cAlternatives_0 = (Alternatives)cGroup.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_0_0 = (Keyword)cAlternatives_0.eContents().get(0);
		private final Assignment cIsLowerIncludedAssignment_0_1 = (Assignment)cAlternatives_0.eContents().get(1);
		private final Keyword cIsLowerIncludedLeftSquareBracketKeyword_0_1_0 = (Keyword)cIsLowerIncludedAssignment_0_1.eContents().get(0);
		private final Assignment cLowerAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cLowerExpressionParserRuleCall_1_0 = (RuleCall)cLowerAssignment_1.eContents().get(0);
		private final Keyword cFullStopFullStopKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cUpperAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cUpperExpressionParserRuleCall_3_0 = (RuleCall)cUpperAssignment_3.eContents().get(0);
		private final Alternatives cAlternatives_4 = (Alternatives)cGroup.eContents().get(4);
		private final Assignment cIsUpperIncludedAssignment_4_0 = (Assignment)cAlternatives_4.eContents().get(0);
		private final Keyword cIsUpperIncludedRightSquareBracketKeyword_4_0_0 = (Keyword)cIsUpperIncludedAssignment_4_0.eContents().get(0);
		private final Keyword cLeftSquareBracketKeyword_4_1 = (Keyword)cAlternatives_4.eContents().get(1);
		
		//Interval:
		//	("]" | isLowerIncluded="[") lower=Expression ".." upper=Expression (isUpperIncluded="]" | "[");
		public ParserRule getRule() { return rule; }

		//("]" | isLowerIncluded="[") lower=Expression ".." upper=Expression (isUpperIncluded="]" | "[")
		public Group getGroup() { return cGroup; }

		//"]" | isLowerIncluded="["
		public Alternatives getAlternatives_0() { return cAlternatives_0; }

		//"]"
		public Keyword getRightSquareBracketKeyword_0_0() { return cRightSquareBracketKeyword_0_0; }

		//isLowerIncluded="["
		public Assignment getIsLowerIncludedAssignment_0_1() { return cIsLowerIncludedAssignment_0_1; }

		//"["
		public Keyword getIsLowerIncludedLeftSquareBracketKeyword_0_1_0() { return cIsLowerIncludedLeftSquareBracketKeyword_0_1_0; }

		//lower=Expression
		public Assignment getLowerAssignment_1() { return cLowerAssignment_1; }

		//Expression
		public RuleCall getLowerExpressionParserRuleCall_1_0() { return cLowerExpressionParserRuleCall_1_0; }

		//".."
		public Keyword getFullStopFullStopKeyword_2() { return cFullStopFullStopKeyword_2; }

		//upper=Expression
		public Assignment getUpperAssignment_3() { return cUpperAssignment_3; }

		//Expression
		public RuleCall getUpperExpressionParserRuleCall_3_0() { return cUpperExpressionParserRuleCall_3_0; }

		//isUpperIncluded="]" | "["
		public Alternatives getAlternatives_4() { return cAlternatives_4; }

		//isUpperIncluded="]"
		public Assignment getIsUpperIncludedAssignment_4_0() { return cIsUpperIncludedAssignment_4_0; }

		//"]"
		public Keyword getIsUpperIncludedRightSquareBracketKeyword_4_0_0() { return cIsUpperIncludedRightSquareBracketKeyword_4_0_0; }

		//"["
		public Keyword getLeftSquareBracketKeyword_4_1() { return cLeftSquareBracketKeyword_4_1; }
	}

	public class CollectionOrTupleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "CollectionOrTuple");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cListOfValuesAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cListOfValuesListOfValuesParserRuleCall_1_0 = (RuleCall)cListOfValuesAssignment_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//CollectionOrTuple:
		//	"{" listOfValues=ListOfValues "}";
		public ParserRule getRule() { return rule; }

		//"{" listOfValues=ListOfValues "}"
		public Group getGroup() { return cGroup; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_0() { return cLeftCurlyBracketKeyword_0; }

		//listOfValues=ListOfValues
		public Assignment getListOfValuesAssignment_1() { return cListOfValuesAssignment_1; }

		//ListOfValues
		public RuleCall getListOfValuesListOfValuesParserRuleCall_1_0() { return cListOfValuesListOfValuesParserRuleCall_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_2() { return cRightCurlyBracketKeyword_2; }
	}

	public class TupleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Tuple");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cListOfValueNamePairsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cListOfValueNamePairsListOfValueNamePairsParserRuleCall_1_0 = (RuleCall)cListOfValueNamePairsAssignment_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//Tuple:
		//	"{" listOfValueNamePairs=ListOfValueNamePairs "}";
		public ParserRule getRule() { return rule; }

		//"{" listOfValueNamePairs=ListOfValueNamePairs "}"
		public Group getGroup() { return cGroup; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_0() { return cLeftCurlyBracketKeyword_0; }

		//listOfValueNamePairs=ListOfValueNamePairs
		public Assignment getListOfValueNamePairsAssignment_1() { return cListOfValueNamePairsAssignment_1; }

		//ListOfValueNamePairs
		public RuleCall getListOfValueNamePairsListOfValueNamePairsParserRuleCall_1_0() { return cListOfValueNamePairsListOfValueNamePairsParserRuleCall_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_2() { return cRightCurlyBracketKeyword_2; }
	}

	public class ListOfValuesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ListOfValues");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cValuesAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cValuesExpressionParserRuleCall_0_0 = (RuleCall)cValuesAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cCommaKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cValuesAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cValuesExpressionParserRuleCall_1_1_0 = (RuleCall)cValuesAssignment_1_1.eContents().get(0);
		
		//ListOfValues:
		//	values+=Expression ("," values+=Expression)*;
		public ParserRule getRule() { return rule; }

		//values+=Expression ("," values+=Expression)*
		public Group getGroup() { return cGroup; }

		//values+=Expression
		public Assignment getValuesAssignment_0() { return cValuesAssignment_0; }

		//Expression
		public RuleCall getValuesExpressionParserRuleCall_0_0() { return cValuesExpressionParserRuleCall_0_0; }

		//("," values+=Expression)*
		public Group getGroup_1() { return cGroup_1; }

		//","
		public Keyword getCommaKeyword_1_0() { return cCommaKeyword_1_0; }

		//values+=Expression
		public Assignment getValuesAssignment_1_1() { return cValuesAssignment_1_1; }

		//Expression
		public RuleCall getValuesExpressionParserRuleCall_1_1_0() { return cValuesExpressionParserRuleCall_1_1_0; }
	}

	public class ListOfValueNamePairsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ListOfValueNamePairs");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cValueNamePairsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cValueNamePairsValueNamePairParserRuleCall_0_0 = (RuleCall)cValueNamePairsAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cCommaKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cValueNamePairsAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cValueNamePairsValueNamePairParserRuleCall_1_1_0 = (RuleCall)cValueNamePairsAssignment_1_1.eContents().get(0);
		
		//ListOfValueNamePairs:
		//	valueNamePairs+=ValueNamePair ("," valueNamePairs+=ValueNamePair)*;
		public ParserRule getRule() { return rule; }

		//valueNamePairs+=ValueNamePair ("," valueNamePairs+=ValueNamePair)*
		public Group getGroup() { return cGroup; }

		//valueNamePairs+=ValueNamePair
		public Assignment getValueNamePairsAssignment_0() { return cValueNamePairsAssignment_0; }

		//ValueNamePair
		public RuleCall getValueNamePairsValueNamePairParserRuleCall_0_0() { return cValueNamePairsValueNamePairParserRuleCall_0_0; }

		//("," valueNamePairs+=ValueNamePair)*
		public Group getGroup_1() { return cGroup_1; }

		//","
		public Keyword getCommaKeyword_1_0() { return cCommaKeyword_1_0; }

		//valueNamePairs+=ValueNamePair
		public Assignment getValueNamePairsAssignment_1_1() { return cValueNamePairsAssignment_1_1; }

		//ValueNamePair
		public RuleCall getValueNamePairsValueNamePairParserRuleCall_1_1_0() { return cValueNamePairsValueNamePairParserRuleCall_1_1_0; }
	}

	public class ValueNamePairElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ValueNamePair");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cPropertyAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cPropertyPropertyCrossReference_0_0 = (CrossReference)cPropertyAssignment_0.eContents().get(0);
		private final RuleCall cPropertyPropertyIDTerminalRuleCall_0_0_1 = (RuleCall)cPropertyPropertyCrossReference_0_0.eContents().get(1);
		private final Keyword cEqualsSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cValueExpressionParserRuleCall_2_0 = (RuleCall)cValueAssignment_2.eContents().get(0);
		
		//ValueNamePair:
		//	property=[uml::Property] "=" value=Expression;
		public ParserRule getRule() { return rule; }

		//property=[uml::Property] "=" value=Expression
		public Group getGroup() { return cGroup; }

		//property=[uml::Property]
		public Assignment getPropertyAssignment_0() { return cPropertyAssignment_0; }

		//[uml::Property]
		public CrossReference getPropertyPropertyCrossReference_0_0() { return cPropertyPropertyCrossReference_0_0; }

		//ID
		public RuleCall getPropertyPropertyIDTerminalRuleCall_0_0_1() { return cPropertyPropertyIDTerminalRuleCall_0_0_1; }

		//"="
		public Keyword getEqualsSignKeyword_1() { return cEqualsSignKeyword_1; }

		//value=Expression
		public Assignment getValueAssignment_2() { return cValueAssignment_2; }

		//Expression
		public RuleCall getValueExpressionParserRuleCall_2_0() { return cValueExpressionParserRuleCall_2_0; }
	}

	public class TimeExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "TimeExpression");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cInstantObsExpressionParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cDurationObsExpressionParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cJitterExpParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//TimeExpression:
		//	InstantObsExpression | DurationObsExpression | JitterExp;
		public ParserRule getRule() { return rule; }

		//InstantObsExpression | DurationObsExpression | JitterExp
		public Alternatives getAlternatives() { return cAlternatives; }

		//InstantObsExpression
		public RuleCall getInstantObsExpressionParserRuleCall_0() { return cInstantObsExpressionParserRuleCall_0; }

		//DurationObsExpression
		public RuleCall getDurationObsExpressionParserRuleCall_1() { return cDurationObsExpressionParserRuleCall_1; }

		//JitterExp
		public RuleCall getJitterExpParserRuleCall_2() { return cJitterExpParserRuleCall_2; }
	}

	public class InstantObsExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "InstantObsExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCommercialAtKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cIdAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cIdInstantObsNameParserRuleCall_1_0 = (RuleCall)cIdAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cLeftParenthesisKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cIndexAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cIndexExpressionParserRuleCall_2_1_0 = (RuleCall)cIndexAssignment_2_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_2_2 = (Keyword)cGroup_2.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cWhenKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_3_1 = (Keyword)cGroup_3.eContents().get(1);
		private final Assignment cConditionAssignment_3_2 = (Assignment)cGroup_3.eContents().get(2);
		private final RuleCall cConditionExpressionParserRuleCall_3_2_0 = (RuleCall)cConditionAssignment_3_2.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3_3 = (Keyword)cGroup_3.eContents().get(3);
		
		//InstantObsExpression:
		//	"@" id=InstantObsName ("(" index=Expression ")")? ("when" "(" condition=Expression ")")?;
		public ParserRule getRule() { return rule; }

		//"@" id=InstantObsName ("(" index=Expression ")")? ("when" "(" condition=Expression ")")?
		public Group getGroup() { return cGroup; }

		//"@"
		public Keyword getCommercialAtKeyword_0() { return cCommercialAtKeyword_0; }

		//id=InstantObsName
		public Assignment getIdAssignment_1() { return cIdAssignment_1; }

		//InstantObsName
		public RuleCall getIdInstantObsNameParserRuleCall_1_0() { return cIdInstantObsNameParserRuleCall_1_0; }

		//("(" index=Expression ")")?
		public Group getGroup_2() { return cGroup_2; }

		//"("
		public Keyword getLeftParenthesisKeyword_2_0() { return cLeftParenthesisKeyword_2_0; }

		//index=Expression
		public Assignment getIndexAssignment_2_1() { return cIndexAssignment_2_1; }

		//Expression
		public RuleCall getIndexExpressionParserRuleCall_2_1_0() { return cIndexExpressionParserRuleCall_2_1_0; }

		//")"
		public Keyword getRightParenthesisKeyword_2_2() { return cRightParenthesisKeyword_2_2; }

		//("when" "(" condition=Expression ")")?
		public Group getGroup_3() { return cGroup_3; }

		//"when"
		public Keyword getWhenKeyword_3_0() { return cWhenKeyword_3_0; }

		//"("
		public Keyword getLeftParenthesisKeyword_3_1() { return cLeftParenthesisKeyword_3_1; }

		//condition=Expression
		public Assignment getConditionAssignment_3_2() { return cConditionAssignment_3_2; }

		//Expression
		public RuleCall getConditionExpressionParserRuleCall_3_2_0() { return cConditionExpressionParserRuleCall_3_2_0; }

		//")"
		public Keyword getRightParenthesisKeyword_3_3() { return cRightParenthesisKeyword_3_3; }
	}

	public class InstantObsNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "InstantObsName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cPathAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cPathQualifiedNameParserRuleCall_0_0 = (RuleCall)cPathAssignment_0.eContents().get(0);
		private final Assignment cInstantIdAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cInstantIdTimeObservationCrossReference_1_0 = (CrossReference)cInstantIdAssignment_1.eContents().get(0);
		private final RuleCall cInstantIdTimeObservationIDTerminalRuleCall_1_0_1 = (RuleCall)cInstantIdTimeObservationCrossReference_1_0.eContents().get(1);
		
		//InstantObsName:
		//	path=QualifiedName? instantId=[uml::TimeObservation];
		public ParserRule getRule() { return rule; }

		//path=QualifiedName? instantId=[uml::TimeObservation]
		public Group getGroup() { return cGroup; }

		//path=QualifiedName?
		public Assignment getPathAssignment_0() { return cPathAssignment_0; }

		//QualifiedName
		public RuleCall getPathQualifiedNameParserRuleCall_0_0() { return cPathQualifiedNameParserRuleCall_0_0; }

		//instantId=[uml::TimeObservation]
		public Assignment getInstantIdAssignment_1() { return cInstantIdAssignment_1; }

		//[uml::TimeObservation]
		public CrossReference getInstantIdTimeObservationCrossReference_1_0() { return cInstantIdTimeObservationCrossReference_1_0; }

		//ID
		public RuleCall getInstantIdTimeObservationIDTerminalRuleCall_1_0_1() { return cInstantIdTimeObservationIDTerminalRuleCall_1_0_1; }
	}

	public class DurationObsExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "DurationObsExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAmpersandKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cIdAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cIdDurationObsNameParserRuleCall_1_0 = (RuleCall)cIdAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cLeftParenthesisKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cIndexAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cIndexExpressionParserRuleCall_2_1_0 = (RuleCall)cIndexAssignment_2_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_2_2 = (Keyword)cGroup_2.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cWhenKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_3_1 = (Keyword)cGroup_3.eContents().get(1);
		private final Assignment cConditionAssignment_3_2 = (Assignment)cGroup_3.eContents().get(2);
		private final RuleCall cConditionExpressionParserRuleCall_3_2_0 = (RuleCall)cConditionAssignment_3_2.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3_3 = (Keyword)cGroup_3.eContents().get(3);
		
		//DurationObsExpression:
		//	"&" id=DurationObsName ("(" index=Expression ")")? ("when" "(" condition=Expression ")")?;
		public ParserRule getRule() { return rule; }

		//"&" id=DurationObsName ("(" index=Expression ")")? ("when" "(" condition=Expression ")")?
		public Group getGroup() { return cGroup; }

		//"&"
		public Keyword getAmpersandKeyword_0() { return cAmpersandKeyword_0; }

		//id=DurationObsName
		public Assignment getIdAssignment_1() { return cIdAssignment_1; }

		//DurationObsName
		public RuleCall getIdDurationObsNameParserRuleCall_1_0() { return cIdDurationObsNameParserRuleCall_1_0; }

		//("(" index=Expression ")")?
		public Group getGroup_2() { return cGroup_2; }

		//"("
		public Keyword getLeftParenthesisKeyword_2_0() { return cLeftParenthesisKeyword_2_0; }

		//index=Expression
		public Assignment getIndexAssignment_2_1() { return cIndexAssignment_2_1; }

		//Expression
		public RuleCall getIndexExpressionParserRuleCall_2_1_0() { return cIndexExpressionParserRuleCall_2_1_0; }

		//")"
		public Keyword getRightParenthesisKeyword_2_2() { return cRightParenthesisKeyword_2_2; }

		//("when" "(" condition=Expression ")")?
		public Group getGroup_3() { return cGroup_3; }

		//"when"
		public Keyword getWhenKeyword_3_0() { return cWhenKeyword_3_0; }

		//"("
		public Keyword getLeftParenthesisKeyword_3_1() { return cLeftParenthesisKeyword_3_1; }

		//condition=Expression
		public Assignment getConditionAssignment_3_2() { return cConditionAssignment_3_2; }

		//Expression
		public RuleCall getConditionExpressionParserRuleCall_3_2_0() { return cConditionExpressionParserRuleCall_3_2_0; }

		//")"
		public Keyword getRightParenthesisKeyword_3_3() { return cRightParenthesisKeyword_3_3; }
	}

	public class DurationObsNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "DurationObsName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cPathAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cPathQualifiedNameParserRuleCall_0_0 = (RuleCall)cPathAssignment_0.eContents().get(0);
		private final Assignment cDurationIdAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cDurationIdDurationObservationCrossReference_1_0 = (CrossReference)cDurationIdAssignment_1.eContents().get(0);
		private final RuleCall cDurationIdDurationObservationIDTerminalRuleCall_1_0_1 = (RuleCall)cDurationIdDurationObservationCrossReference_1_0.eContents().get(1);
		
		//DurationObsName:
		//	path=QualifiedName? durationId=[uml::DurationObservation];
		public ParserRule getRule() { return rule; }

		//path=QualifiedName? durationId=[uml::DurationObservation]
		public Group getGroup() { return cGroup; }

		//path=QualifiedName?
		public Assignment getPathAssignment_0() { return cPathAssignment_0; }

		//QualifiedName
		public RuleCall getPathQualifiedNameParserRuleCall_0_0() { return cPathQualifiedNameParserRuleCall_0_0; }

		//durationId=[uml::DurationObservation]
		public Assignment getDurationIdAssignment_1() { return cDurationIdAssignment_1; }

		//[uml::DurationObservation]
		public CrossReference getDurationIdDurationObservationCrossReference_1_0() { return cDurationIdDurationObservationCrossReference_1_0; }

		//ID
		public RuleCall getDurationIdDurationObservationIDTerminalRuleCall_1_0_1() { return cDurationIdDurationObservationIDTerminalRuleCall_1_0_1; }
	}

	public class JitterExpElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "JitterExp");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cJitterKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cFirstInstantAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cFirstInstantInstantObsExpressionParserRuleCall_1_0 = (RuleCall)cFirstInstantAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cHyphenMinusKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cSecondInstantAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cSecondInstantInstantObsExpressionParserRuleCall_2_1_0 = (RuleCall)cSecondInstantAssignment_2_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//JitterExp:
		//	"jitter(" firstInstant=InstantObsExpression ("-" secondInstant=InstantObsExpression)? ")";
		public ParserRule getRule() { return rule; }

		//"jitter(" firstInstant=InstantObsExpression ("-" secondInstant=InstantObsExpression)? ")"
		public Group getGroup() { return cGroup; }

		//"jitter("
		public Keyword getJitterKeyword_0() { return cJitterKeyword_0; }

		//firstInstant=InstantObsExpression
		public Assignment getFirstInstantAssignment_1() { return cFirstInstantAssignment_1; }

		//InstantObsExpression
		public RuleCall getFirstInstantInstantObsExpressionParserRuleCall_1_0() { return cFirstInstantInstantObsExpressionParserRuleCall_1_0; }

		//("-" secondInstant=InstantObsExpression)?
		public Group getGroup_2() { return cGroup_2; }

		//"-"
		public Keyword getHyphenMinusKeyword_2_0() { return cHyphenMinusKeyword_2_0; }

		//secondInstant=InstantObsExpression
		public Assignment getSecondInstantAssignment_2_1() { return cSecondInstantAssignment_2_1; }

		//InstantObsExpression
		public RuleCall getSecondInstantInstantObsExpressionParserRuleCall_2_1_0() { return cSecondInstantInstantObsExpressionParserRuleCall_2_1_0; }

		//")"
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
	}

	public class VariableDeclarationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "VariableDeclaration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cVariableDeclarationAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cVariableDeclarationVariableDirectionKindParserRuleCall_0_0 = (RuleCall)cVariableDeclarationAssignment_0.eContents().get(0);
		private final Keyword cDollarSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Alternatives cAlternatives_3 = (Alternatives)cGroup.eContents().get(3);
		private final Group cGroup_3_0 = (Group)cAlternatives_3.eContents().get(0);
		private final Keyword cColonKeyword_3_0_0 = (Keyword)cGroup_3_0.eContents().get(0);
		private final Assignment cTypeAssignment_3_0_1 = (Assignment)cGroup_3_0.eContents().get(1);
		private final RuleCall cTypeDataTypeNameParserRuleCall_3_0_1_0 = (RuleCall)cTypeAssignment_3_0_1.eContents().get(0);
		private final Group cGroup_3_0_2 = (Group)cGroup_3_0.eContents().get(2);
		private final Keyword cEqualsSignKeyword_3_0_2_0 = (Keyword)cGroup_3_0_2.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_3_0_2_1 = (Keyword)cGroup_3_0_2.eContents().get(1);
		private final Assignment cInitValueAssignment_3_0_2_2 = (Assignment)cGroup_3_0_2.eContents().get(2);
		private final RuleCall cInitValueExpressionParserRuleCall_3_0_2_2_0 = (RuleCall)cInitValueAssignment_3_0_2_2.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3_0_2_3 = (Keyword)cGroup_3_0_2.eContents().get(3);
		private final Group cGroup_3_1 = (Group)cAlternatives_3.eContents().get(1);
		private final Keyword cEqualsSignKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_3_1_1 = (Keyword)cGroup_3_1.eContents().get(1);
		private final Assignment cInitValueAssignment_3_1_2 = (Assignment)cGroup_3_1.eContents().get(2);
		private final RuleCall cInitValueExpressionParserRuleCall_3_1_2_0 = (RuleCall)cInitValueAssignment_3_1_2.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3_1_3 = (Keyword)cGroup_3_1.eContents().get(3);
		
		//VariableDeclaration:
		//	variableDeclaration=VariableDirectionKind? "$" name=ID (":" type=DataTypeName ("=" "(" initValue=Expression ")")? |
		//	"=" "(" initValue=Expression ")");
		public ParserRule getRule() { return rule; }

		//variableDeclaration=VariableDirectionKind? "$" name=ID (":" type=DataTypeName ("=" "(" initValue=Expression ")")? | "="
		//"(" initValue=Expression ")")
		public Group getGroup() { return cGroup; }

		//variableDeclaration=VariableDirectionKind?
		public Assignment getVariableDeclarationAssignment_0() { return cVariableDeclarationAssignment_0; }

		//VariableDirectionKind
		public RuleCall getVariableDeclarationVariableDirectionKindParserRuleCall_0_0() { return cVariableDeclarationVariableDirectionKindParserRuleCall_0_0; }

		//"$"
		public Keyword getDollarSignKeyword_1() { return cDollarSignKeyword_1; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//":" type=DataTypeName ("=" "(" initValue=Expression ")")? | "=" "(" initValue=Expression ")"
		public Alternatives getAlternatives_3() { return cAlternatives_3; }

		//":" type=DataTypeName ("=" "(" initValue=Expression ")")?
		public Group getGroup_3_0() { return cGroup_3_0; }

		//":"
		public Keyword getColonKeyword_3_0_0() { return cColonKeyword_3_0_0; }

		//type=DataTypeName
		public Assignment getTypeAssignment_3_0_1() { return cTypeAssignment_3_0_1; }

		//DataTypeName
		public RuleCall getTypeDataTypeNameParserRuleCall_3_0_1_0() { return cTypeDataTypeNameParserRuleCall_3_0_1_0; }

		//("=" "(" initValue=Expression ")")?
		public Group getGroup_3_0_2() { return cGroup_3_0_2; }

		//"="
		public Keyword getEqualsSignKeyword_3_0_2_0() { return cEqualsSignKeyword_3_0_2_0; }

		//"("
		public Keyword getLeftParenthesisKeyword_3_0_2_1() { return cLeftParenthesisKeyword_3_0_2_1; }

		//initValue=Expression
		public Assignment getInitValueAssignment_3_0_2_2() { return cInitValueAssignment_3_0_2_2; }

		//Expression
		public RuleCall getInitValueExpressionParserRuleCall_3_0_2_2_0() { return cInitValueExpressionParserRuleCall_3_0_2_2_0; }

		//")"
		public Keyword getRightParenthesisKeyword_3_0_2_3() { return cRightParenthesisKeyword_3_0_2_3; }

		//"=" "(" initValue=Expression ")"
		public Group getGroup_3_1() { return cGroup_3_1; }

		//"="
		public Keyword getEqualsSignKeyword_3_1_0() { return cEqualsSignKeyword_3_1_0; }

		//"("
		public Keyword getLeftParenthesisKeyword_3_1_1() { return cLeftParenthesisKeyword_3_1_1; }

		//initValue=Expression
		public Assignment getInitValueAssignment_3_1_2() { return cInitValueAssignment_3_1_2; }

		//Expression
		public RuleCall getInitValueExpressionParserRuleCall_3_1_2_0() { return cInitValueExpressionParserRuleCall_3_1_2_0; }

		//")"
		public Keyword getRightParenthesisKeyword_3_1_3() { return cRightParenthesisKeyword_3_1_3; }
	}

	public class VariableDirectionKindElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "VariableDirectionKind");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cInKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cOutKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		private final Keyword cInoutKeyword_2 = (Keyword)cAlternatives.eContents().get(2);
		
		//VariableDirectionKind returns ecore::EString:
		//	"in" | "out" | "inout";
		public ParserRule getRule() { return rule; }

		//"in" | "out" | "inout"
		public Alternatives getAlternatives() { return cAlternatives; }

		//"in"
		public Keyword getInKeyword_0() { return cInKeyword_0; }

		//"out"
		public Keyword getOutKeyword_1() { return cOutKeyword_1; }

		//"inout"
		public Keyword getInoutKeyword_2() { return cInoutKeyword_2; }
	}

	public class DataTypeNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "DataTypeName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cPathAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cPathQualifiedNameParserRuleCall_0_0 = (RuleCall)cPathAssignment_0.eContents().get(0);
		private final Assignment cTypeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cTypeDataTypeCrossReference_1_0 = (CrossReference)cTypeAssignment_1.eContents().get(0);
		private final RuleCall cTypeDataTypeIDTerminalRuleCall_1_0_1 = (RuleCall)cTypeDataTypeCrossReference_1_0.eContents().get(1);
		
		//DataTypeName:
		//	path=QualifiedName? type=[uml::DataType];
		public ParserRule getRule() { return rule; }

		//path=QualifiedName? type=[uml::DataType]
		public Group getGroup() { return cGroup; }

		//path=QualifiedName?
		public Assignment getPathAssignment_0() { return cPathAssignment_0; }

		//QualifiedName
		public RuleCall getPathQualifiedNameParserRuleCall_0_0() { return cPathQualifiedNameParserRuleCall_0_0; }

		//type=[uml::DataType]
		public Assignment getTypeAssignment_1() { return cTypeAssignment_1; }

		//[uml::DataType]
		public CrossReference getTypeDataTypeCrossReference_1_0() { return cTypeDataTypeCrossReference_1_0; }

		//ID
		public RuleCall getTypeDataTypeIDTerminalRuleCall_1_0_1() { return cTypeDataTypeIDTerminalRuleCall_1_0_1; }
	}

	public class NumberLiteralRuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "NumberLiteralRule");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cIntegerLiteralRuleParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cUnlimitedLiteralRuleParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cRealLiteralRuleParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		////LITERAL
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		//NumberLiteralRule:
		//	IntegerLiteralRule | UnlimitedLiteralRule | RealLiteralRule;
		public ParserRule getRule() { return rule; }

		//IntegerLiteralRule | UnlimitedLiteralRule | RealLiteralRule
		public Alternatives getAlternatives() { return cAlternatives; }

		//IntegerLiteralRule
		public RuleCall getIntegerLiteralRuleParserRuleCall_0() { return cIntegerLiteralRuleParserRuleCall_0; }

		//UnlimitedLiteralRule
		public RuleCall getUnlimitedLiteralRuleParserRuleCall_1() { return cUnlimitedLiteralRuleParserRuleCall_1; }

		//RealLiteralRule
		public RuleCall getRealLiteralRuleParserRuleCall_2() { return cRealLiteralRuleParserRuleCall_2; }
	}

	public class IntegerLiteralRuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "IntegerLiteralRule");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueIntegerLiteralTerminalRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		//IntegerLiteralRule:
		//	value=IntegerLiteral;
		public ParserRule getRule() { return rule; }

		//value=IntegerLiteral
		public Assignment getValueAssignment() { return cValueAssignment; }

		//IntegerLiteral
		public RuleCall getValueIntegerLiteralTerminalRuleCall_0() { return cValueIntegerLiteralTerminalRuleCall_0; }
	}

	public class UnlimitedLiteralRuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "UnlimitedLiteralRule");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final Keyword cValueAsteriskKeyword_0 = (Keyword)cValueAssignment.eContents().get(0);
		
		////UnlimitedLiteralRule :
		////	value = UnlimitedLiteral ;
		////terminal UnlimitedLiteral :
		////	'*' ;
		//UnlimitedLiteralRule:
		//	value="*";
		public ParserRule getRule() { return rule; }

		//value="*"
		public Assignment getValueAssignment() { return cValueAssignment; }

		//"*"
		public Keyword getValueAsteriskKeyword_0() { return cValueAsteriskKeyword_0; }
	}

	public class RealLiteralRuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "RealLiteralRule");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueRealLiteralTerminalRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		//RealLiteralRule:
		//	value=RealLiteral;
		public ParserRule getRule() { return rule; }

		//value=RealLiteral
		public Assignment getValueAssignment() { return cValueAssignment; }

		//RealLiteral
		public RuleCall getValueRealLiteralTerminalRuleCall_0() { return cValueRealLiteralTerminalRuleCall_0; }
	}

	public class DateTimeLiteralRuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "DateTimeLiteralRule");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueDateTimeLiteralTerminalRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		////DateTimeLiteral:
		////	TimeString (DateString)? (DayString)? |
		////	DateString (DayString)? |
		////	DayString ;
		////terminal DateString :
		////	('0'..'9')('0'..'9')('0'..'9')('0'..'9')'/'('0'('0'..'9')|'1'('0'..'2'))'/'(('0'..'2')('0'..'9')|'3' ('0'|'1')) ;
		////terminal TimeString :
		////	(('0'..'1')('0'..'9')|'2'('0'..'3'))':'('0'..'5')('0'..'9')(':'('0'..'5')('0'..'9')(':'('0'..'9')('0'..'9'))?)? ;	
		////terminal DayString :
		////	"Mon" | "Tue" | "Wed" | "Thr" | "Fri" | "Sat" | "Sun" ;
		//DateTimeLiteralRule:
		//	value=DateTimeLiteral;
		public ParserRule getRule() { return rule; }

		//value=DateTimeLiteral
		public Assignment getValueAssignment() { return cValueAssignment; }

		//DateTimeLiteral
		public RuleCall getValueDateTimeLiteralTerminalRuleCall_0() { return cValueDateTimeLiteralTerminalRuleCall_0; }
	}

	public class BooleanLiteralRuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "BooleanLiteralRule");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueBooleanLiteralTerminalRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		//BooleanLiteralRule:
		//	value=BooleanLiteral;
		public ParserRule getRule() { return rule; }

		//value=BooleanLiteral
		public Assignment getValueAssignment() { return cValueAssignment; }

		//BooleanLiteral
		public RuleCall getValueBooleanLiteralTerminalRuleCall_0() { return cValueBooleanLiteralTerminalRuleCall_0; }
	}

	public class NullLiteralRuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "NullLiteralRule");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueNullLiteralTerminalRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		//NullLiteralRule:
		//	value=NullLiteral;
		public ParserRule getRule() { return rule; }

		//value=NullLiteral
		public Assignment getValueAssignment() { return cValueAssignment; }

		//NullLiteral
		public RuleCall getValueNullLiteralTerminalRuleCall_0() { return cValueNullLiteralTerminalRuleCall_0; }
	}

	public class DefaultLiteralRuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "DefaultLiteralRule");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final Keyword cValueSolidusKeyword_0 = (Keyword)cValueAssignment.eContents().get(0);
		
		////DefaultLiteralRule :
		////	value = DefaultLiteral ;
		////terminal DefaultLiteral : 
		////	'/' ;
		//DefaultLiteralRule:
		//	value="/";
		public ParserRule getRule() { return rule; }

		//value="/"
		public Assignment getValueAssignment() { return cValueAssignment; }

		//"/"
		public Keyword getValueSolidusKeyword_0() { return cValueSolidusKeyword_0; }
	}

	public class StringLiteralRuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "StringLiteralRule");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueSTRINGTerminalRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		//StringLiteralRule:
		//	value=STRING;
		public ParserRule getRule() { return rule; }

		//value=STRING
		public Assignment getValueAssignment() { return cValueAssignment; }

		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_0() { return cValueSTRINGTerminalRuleCall_0; }
	}
	
	
	private ExpressionElements pExpression;
	private AndOrXorExpressionElements pAndOrXorExpression;
	private EqualityExpressionElements pEqualityExpression;
	private RelationalExpressionElements pRelationalExpression;
	private ConditionalExpressionElements pConditionalExpression;
	private AdditiveExpressionElements pAdditiveExpression;
	private MultiplicativeExpressionElements pMultiplicativeExpression;
	private UnaryExpressionElements pUnaryExpression;
	private PrimaryExpressionElements pPrimaryExpression;
	private ValueSpecificationElements pValueSpecification;
	private SuffixExpressionElements pSuffixExpression;
	private PropertyCallExpressionElements pPropertyCallExpression;
	private OperationCallExpressionElements pOperationCallExpression;
	private LiteralElements pLiteral;
	private NameOrChoiceOrBehaviorCallElements pNameOrChoiceOrBehaviorCall;
	private QualifiedNameElements pQualifiedName;
	private IntervalElements pInterval;
	private CollectionOrTupleElements pCollectionOrTuple;
	private TupleElements pTuple;
	private ListOfValuesElements pListOfValues;
	private ListOfValueNamePairsElements pListOfValueNamePairs;
	private ValueNamePairElements pValueNamePair;
	private TimeExpressionElements pTimeExpression;
	private InstantObsExpressionElements pInstantObsExpression;
	private InstantObsNameElements pInstantObsName;
	private DurationObsExpressionElements pDurationObsExpression;
	private DurationObsNameElements pDurationObsName;
	private JitterExpElements pJitterExp;
	private VariableDeclarationElements pVariableDeclaration;
	private VariableDirectionKindElements pVariableDirectionKind;
	private DataTypeNameElements pDataTypeName;
	private NumberLiteralRuleElements pNumberLiteralRule;
	private IntegerLiteralRuleElements pIntegerLiteralRule;
	private TerminalRule tIntegerLiteral;
	private UnlimitedLiteralRuleElements pUnlimitedLiteralRule;
	private RealLiteralRuleElements pRealLiteralRule;
	private TerminalRule tRealLiteral;
	private DateTimeLiteralRuleElements pDateTimeLiteralRule;
	private TerminalRule tDateTimeLiteral;
	private BooleanLiteralRuleElements pBooleanLiteralRule;
	private TerminalRule tBooleanLiteral;
	private NullLiteralRuleElements pNullLiteralRule;
	private TerminalRule tNullLiteral;
	private DefaultLiteralRuleElements pDefaultLiteralRule;
	private StringLiteralRuleElements pStringLiteralRule;
	
	private final GrammarProvider grammarProvider;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public VSLGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammarProvider = grammarProvider;
		this.gaTerminals = gaTerminals;
	}
	
	public Grammar getGrammar() {	
		return grammarProvider.getGrammar(this);
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Expression:
	//	exp=AndOrXorExpression;
	public ExpressionElements getExpressionAccess() {
		return (pExpression != null) ? pExpression : (pExpression = new ExpressionElements());
	}
	
	public ParserRule getExpressionRule() {
		return getExpressionAccess().getRule();
	}

	//AndOrXorExpression:
	//	exp+=EqualityExpression (op+=("and" | "or" | "xor") exp+=EqualityExpression)*;
	public AndOrXorExpressionElements getAndOrXorExpressionAccess() {
		return (pAndOrXorExpression != null) ? pAndOrXorExpression : (pAndOrXorExpression = new AndOrXorExpressionElements());
	}
	
	public ParserRule getAndOrXorExpressionRule() {
		return getAndOrXorExpressionAccess().getRule();
	}

	//EqualityExpression:
	//	exp+=RelationalExpression (op+=("==" | "<>") exp+=RelationalExpression)*;
	public EqualityExpressionElements getEqualityExpressionAccess() {
		return (pEqualityExpression != null) ? pEqualityExpression : (pEqualityExpression = new EqualityExpressionElements());
	}
	
	public ParserRule getEqualityExpressionRule() {
		return getEqualityExpressionAccess().getRule();
	}

	//RelationalExpression:
	//	exp+=ConditionalExpression (op+=("<" | ">" | "<=" | ">=") exp+=ConditionalExpression)*;
	public RelationalExpressionElements getRelationalExpressionAccess() {
		return (pRelationalExpression != null) ? pRelationalExpression : (pRelationalExpression = new RelationalExpressionElements());
	}
	
	public ParserRule getRelationalExpressionRule() {
		return getRelationalExpressionAccess().getRule();
	}

	//ConditionalExpression:
	//	exp+=AdditiveExpression (op+="?" exp+=AdditiveExpression ":" exp+=AdditiveExpression)?;
	public ConditionalExpressionElements getConditionalExpressionAccess() {
		return (pConditionalExpression != null) ? pConditionalExpression : (pConditionalExpression = new ConditionalExpressionElements());
	}
	
	public ParserRule getConditionalExpressionRule() {
		return getConditionalExpressionAccess().getRule();
	}

	//AdditiveExpression:
	//	exp+=MultiplicativeExpression (op+=("+" | "-") exp+=MultiplicativeExpression)*;
	public AdditiveExpressionElements getAdditiveExpressionAccess() {
		return (pAdditiveExpression != null) ? pAdditiveExpression : (pAdditiveExpression = new AdditiveExpressionElements());
	}
	
	public ParserRule getAdditiveExpressionRule() {
		return getAdditiveExpressionAccess().getRule();
	}

	//MultiplicativeExpression:
	//	exp+=UnaryExpression (op+=("*" | "/" | "mod") exp+=UnaryExpression)*;
	public MultiplicativeExpressionElements getMultiplicativeExpressionAccess() {
		return (pMultiplicativeExpression != null) ? pMultiplicativeExpression : (pMultiplicativeExpression = new MultiplicativeExpressionElements());
	}
	
	public ParserRule getMultiplicativeExpressionRule() {
		return getMultiplicativeExpressionAccess().getRule();
	}

	//UnaryExpression:
	//	op=("not" | "-" | "+") unary=UnaryExpression | exp=PrimaryExpression;
	public UnaryExpressionElements getUnaryExpressionAccess() {
		return (pUnaryExpression != null) ? pUnaryExpression : (pUnaryExpression = new UnaryExpressionElements());
	}
	
	public ParserRule getUnaryExpressionRule() {
		return getUnaryExpressionAccess().getRule();
	}

	//PrimaryExpression:
	//	prefix=ValueSpecification ("." suffix=SuffixExpression)?;
	public PrimaryExpressionElements getPrimaryExpressionAccess() {
		return (pPrimaryExpression != null) ? pPrimaryExpression : (pPrimaryExpression = new PrimaryExpressionElements());
	}
	
	public ParserRule getPrimaryExpressionRule() {
		return getPrimaryExpressionAccess().getRule();
	}

	//ValueSpecification:
	//	Literal | NameOrChoiceOrBehaviorCall | Interval | CollectionOrTuple | Tuple | TimeExpression | VariableDeclaration |
	//	"(" Expression ")";
	public ValueSpecificationElements getValueSpecificationAccess() {
		return (pValueSpecification != null) ? pValueSpecification : (pValueSpecification = new ValueSpecificationElements());
	}
	
	public ParserRule getValueSpecificationRule() {
		return getValueSpecificationAccess().getRule();
	}

	//SuffixExpression:
	//	PropertyCallExpression | OperationCallExpression;
	public SuffixExpressionElements getSuffixExpressionAccess() {
		return (pSuffixExpression != null) ? pSuffixExpression : (pSuffixExpression = new SuffixExpressionElements());
	}
	
	public ParserRule getSuffixExpressionRule() {
		return getSuffixExpressionAccess().getRule();
	}

	//PropertyCallExpression:
	//	property=[uml::Property] ("." suffix=SuffixExpression)?;
	public PropertyCallExpressionElements getPropertyCallExpressionAccess() {
		return (pPropertyCallExpression != null) ? pPropertyCallExpression : (pPropertyCallExpression = new PropertyCallExpressionElements());
	}
	
	public ParserRule getPropertyCallExpressionRule() {
		return getPropertyCallExpressionAccess().getRule();
	}

	//OperationCallExpression:
	//	operation=[uml::Operation] "(" arguments=ListOfValues? ")" ("." suffix=SuffixExpression)?;
	public OperationCallExpressionElements getOperationCallExpressionAccess() {
		return (pOperationCallExpression != null) ? pOperationCallExpression : (pOperationCallExpression = new OperationCallExpressionElements());
	}
	
	public ParserRule getOperationCallExpressionRule() {
		return getOperationCallExpressionAccess().getRule();
	}

	//Literal:
	//	NumberLiteralRule | DateTimeLiteralRule | BooleanLiteralRule | NullLiteralRule | DefaultLiteralRule |
	//	StringLiteralRule;
	public LiteralElements getLiteralAccess() {
		return (pLiteral != null) ? pLiteral : (pLiteral = new LiteralElements());
	}
	
	public ParserRule getLiteralRule() {
		return getLiteralAccess().getRule();
	}

	//NameOrChoiceOrBehaviorCall:
	//	path=QualifiedName? // can resolve to :
	//	// - EnumSpecification,
	//	// - VariableCallExpression
	//	// - PropertyCallExpression
	//	// - ChoiceExpression
	//	id=[uml::NamedElement] ("(" arguments=ListOfValues? ")")?;
	public NameOrChoiceOrBehaviorCallElements getNameOrChoiceOrBehaviorCallAccess() {
		return (pNameOrChoiceOrBehaviorCall != null) ? pNameOrChoiceOrBehaviorCall : (pNameOrChoiceOrBehaviorCall = new NameOrChoiceOrBehaviorCallElements());
	}
	
	public ParserRule getNameOrChoiceOrBehaviorCallRule() {
		return getNameOrChoiceOrBehaviorCallAccess().getRule();
	}

	//QualifiedName:
	//	path=[uml::Namespace] "::" remaining=QualifiedName?;
	public QualifiedNameElements getQualifiedNameAccess() {
		return (pQualifiedName != null) ? pQualifiedName : (pQualifiedName = new QualifiedNameElements());
	}
	
	public ParserRule getQualifiedNameRule() {
		return getQualifiedNameAccess().getRule();
	}

	//Interval:
	//	("]" | isLowerIncluded="[") lower=Expression ".." upper=Expression (isUpperIncluded="]" | "[");
	public IntervalElements getIntervalAccess() {
		return (pInterval != null) ? pInterval : (pInterval = new IntervalElements());
	}
	
	public ParserRule getIntervalRule() {
		return getIntervalAccess().getRule();
	}

	//CollectionOrTuple:
	//	"{" listOfValues=ListOfValues "}";
	public CollectionOrTupleElements getCollectionOrTupleAccess() {
		return (pCollectionOrTuple != null) ? pCollectionOrTuple : (pCollectionOrTuple = new CollectionOrTupleElements());
	}
	
	public ParserRule getCollectionOrTupleRule() {
		return getCollectionOrTupleAccess().getRule();
	}

	//Tuple:
	//	"{" listOfValueNamePairs=ListOfValueNamePairs "}";
	public TupleElements getTupleAccess() {
		return (pTuple != null) ? pTuple : (pTuple = new TupleElements());
	}
	
	public ParserRule getTupleRule() {
		return getTupleAccess().getRule();
	}

	//ListOfValues:
	//	values+=Expression ("," values+=Expression)*;
	public ListOfValuesElements getListOfValuesAccess() {
		return (pListOfValues != null) ? pListOfValues : (pListOfValues = new ListOfValuesElements());
	}
	
	public ParserRule getListOfValuesRule() {
		return getListOfValuesAccess().getRule();
	}

	//ListOfValueNamePairs:
	//	valueNamePairs+=ValueNamePair ("," valueNamePairs+=ValueNamePair)*;
	public ListOfValueNamePairsElements getListOfValueNamePairsAccess() {
		return (pListOfValueNamePairs != null) ? pListOfValueNamePairs : (pListOfValueNamePairs = new ListOfValueNamePairsElements());
	}
	
	public ParserRule getListOfValueNamePairsRule() {
		return getListOfValueNamePairsAccess().getRule();
	}

	//ValueNamePair:
	//	property=[uml::Property] "=" value=Expression;
	public ValueNamePairElements getValueNamePairAccess() {
		return (pValueNamePair != null) ? pValueNamePair : (pValueNamePair = new ValueNamePairElements());
	}
	
	public ParserRule getValueNamePairRule() {
		return getValueNamePairAccess().getRule();
	}

	//TimeExpression:
	//	InstantObsExpression | DurationObsExpression | JitterExp;
	public TimeExpressionElements getTimeExpressionAccess() {
		return (pTimeExpression != null) ? pTimeExpression : (pTimeExpression = new TimeExpressionElements());
	}
	
	public ParserRule getTimeExpressionRule() {
		return getTimeExpressionAccess().getRule();
	}

	//InstantObsExpression:
	//	"@" id=InstantObsName ("(" index=Expression ")")? ("when" "(" condition=Expression ")")?;
	public InstantObsExpressionElements getInstantObsExpressionAccess() {
		return (pInstantObsExpression != null) ? pInstantObsExpression : (pInstantObsExpression = new InstantObsExpressionElements());
	}
	
	public ParserRule getInstantObsExpressionRule() {
		return getInstantObsExpressionAccess().getRule();
	}

	//InstantObsName:
	//	path=QualifiedName? instantId=[uml::TimeObservation];
	public InstantObsNameElements getInstantObsNameAccess() {
		return (pInstantObsName != null) ? pInstantObsName : (pInstantObsName = new InstantObsNameElements());
	}
	
	public ParserRule getInstantObsNameRule() {
		return getInstantObsNameAccess().getRule();
	}

	//DurationObsExpression:
	//	"&" id=DurationObsName ("(" index=Expression ")")? ("when" "(" condition=Expression ")")?;
	public DurationObsExpressionElements getDurationObsExpressionAccess() {
		return (pDurationObsExpression != null) ? pDurationObsExpression : (pDurationObsExpression = new DurationObsExpressionElements());
	}
	
	public ParserRule getDurationObsExpressionRule() {
		return getDurationObsExpressionAccess().getRule();
	}

	//DurationObsName:
	//	path=QualifiedName? durationId=[uml::DurationObservation];
	public DurationObsNameElements getDurationObsNameAccess() {
		return (pDurationObsName != null) ? pDurationObsName : (pDurationObsName = new DurationObsNameElements());
	}
	
	public ParserRule getDurationObsNameRule() {
		return getDurationObsNameAccess().getRule();
	}

	//JitterExp:
	//	"jitter(" firstInstant=InstantObsExpression ("-" secondInstant=InstantObsExpression)? ")";
	public JitterExpElements getJitterExpAccess() {
		return (pJitterExp != null) ? pJitterExp : (pJitterExp = new JitterExpElements());
	}
	
	public ParserRule getJitterExpRule() {
		return getJitterExpAccess().getRule();
	}

	//VariableDeclaration:
	//	variableDeclaration=VariableDirectionKind? "$" name=ID (":" type=DataTypeName ("=" "(" initValue=Expression ")")? |
	//	"=" "(" initValue=Expression ")");
	public VariableDeclarationElements getVariableDeclarationAccess() {
		return (pVariableDeclaration != null) ? pVariableDeclaration : (pVariableDeclaration = new VariableDeclarationElements());
	}
	
	public ParserRule getVariableDeclarationRule() {
		return getVariableDeclarationAccess().getRule();
	}

	//VariableDirectionKind returns ecore::EString:
	//	"in" | "out" | "inout";
	public VariableDirectionKindElements getVariableDirectionKindAccess() {
		return (pVariableDirectionKind != null) ? pVariableDirectionKind : (pVariableDirectionKind = new VariableDirectionKindElements());
	}
	
	public ParserRule getVariableDirectionKindRule() {
		return getVariableDirectionKindAccess().getRule();
	}

	//DataTypeName:
	//	path=QualifiedName? type=[uml::DataType];
	public DataTypeNameElements getDataTypeNameAccess() {
		return (pDataTypeName != null) ? pDataTypeName : (pDataTypeName = new DataTypeNameElements());
	}
	
	public ParserRule getDataTypeNameRule() {
		return getDataTypeNameAccess().getRule();
	}

	////////////////////////////////////////////////////////////////////////////////////////////////////////
	////LITERAL
	////////////////////////////////////////////////////////////////////////////////////////////////////////
	//NumberLiteralRule:
	//	IntegerLiteralRule | UnlimitedLiteralRule | RealLiteralRule;
	public NumberLiteralRuleElements getNumberLiteralRuleAccess() {
		return (pNumberLiteralRule != null) ? pNumberLiteralRule : (pNumberLiteralRule = new NumberLiteralRuleElements());
	}
	
	public ParserRule getNumberLiteralRuleRule() {
		return getNumberLiteralRuleAccess().getRule();
	}

	//IntegerLiteralRule:
	//	value=IntegerLiteral;
	public IntegerLiteralRuleElements getIntegerLiteralRuleAccess() {
		return (pIntegerLiteralRule != null) ? pIntegerLiteralRule : (pIntegerLiteralRule = new IntegerLiteralRuleElements());
	}
	
	public ParserRule getIntegerLiteralRuleRule() {
		return getIntegerLiteralRuleAccess().getRule();
	}

	//terminal IntegerLiteral:
	//	("+" | "-")? ("0".."9"+ | "0x" ("0".."9" | "A".."F" | "a".."f")+ | "0b" "0".."1"+);
	public TerminalRule getIntegerLiteralRule() {
		return (tIntegerLiteral != null) ? tIntegerLiteral : (tIntegerLiteral = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "IntegerLiteral"));
	} 

	////UnlimitedLiteralRule :
	////	value = UnlimitedLiteral ;
	////terminal UnlimitedLiteral :
	////	'*' ;
	//UnlimitedLiteralRule:
	//	value="*";
	public UnlimitedLiteralRuleElements getUnlimitedLiteralRuleAccess() {
		return (pUnlimitedLiteralRule != null) ? pUnlimitedLiteralRule : (pUnlimitedLiteralRule = new UnlimitedLiteralRuleElements());
	}
	
	public ParserRule getUnlimitedLiteralRuleRule() {
		return getUnlimitedLiteralRuleAccess().getRule();
	}

	//RealLiteralRule:
	//	value=RealLiteral;
	public RealLiteralRuleElements getRealLiteralRuleAccess() {
		return (pRealLiteralRule != null) ? pRealLiteralRule : (pRealLiteralRule = new RealLiteralRuleElements());
	}
	
	public ParserRule getRealLiteralRuleRule() {
		return getRealLiteralRuleAccess().getRule();
	}

	//terminal RealLiteral:
	//	("+" | "-")? "0".."9"+ "." "0".."9"+ ("E" ("+" | "-")? "0".."9"+)?;
	public TerminalRule getRealLiteralRule() {
		return (tRealLiteral != null) ? tRealLiteral : (tRealLiteral = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "RealLiteral"));
	} 

	////DateTimeLiteral:
	////	TimeString (DateString)? (DayString)? |
	////	DateString (DayString)? |
	////	DayString ;
	////terminal DateString :
	////	('0'..'9')('0'..'9')('0'..'9')('0'..'9')'/'('0'('0'..'9')|'1'('0'..'2'))'/'(('0'..'2')('0'..'9')|'3' ('0'|'1')) ;
	////terminal TimeString :
	////	(('0'..'1')('0'..'9')|'2'('0'..'3'))':'('0'..'5')('0'..'9')(':'('0'..'5')('0'..'9')(':'('0'..'9')('0'..'9'))?)? ;	
	////terminal DayString :
	////	"Mon" | "Tue" | "Wed" | "Thr" | "Fri" | "Sat" | "Sun" ;
	//DateTimeLiteralRule:
	//	value=DateTimeLiteral;
	public DateTimeLiteralRuleElements getDateTimeLiteralRuleAccess() {
		return (pDateTimeLiteralRule != null) ? pDateTimeLiteralRule : (pDateTimeLiteralRule = new DateTimeLiteralRuleElements());
	}
	
	public ParserRule getDateTimeLiteralRuleRule() {
		return getDateTimeLiteralRuleAccess().getRule();
	}

	//terminal DateTimeLiteral:
	//	(("0".."1" "0".."9" | "2" "0".."3") ":" "0".."5" "0".."9" (":" "0".."5" "0".."9" (":" "0".."9" "0".."9")?)?) (" "
	//	"0".."9" "0".."9" "0".."9" "0".."9" "/" ("0" "0".."9" | "1" "0".."2") "/" ("0".."2" "0".."9" | "3" ("0" | "1")))? (" "
	//	("Mon" | "Tue" | "Wed" | "Thr" | "Fri" | "Sat" | "Sun"))? | ("0".."9" "0".."9" "0".."9" "0".."9" "/" ("0" "0".."9" |
	//	"1" "0".."2") "/" ("0".."2" "0".."9" | "3" ("0" | "1"))) (" " ("Mon" | "Tue" | "Wed" | "Thr" | "Fri" | "Sat" |
	//	"Sun"))? | ("Mon" | "Tue" | "Wed" | "Thr" | "Fri" | "Sat" | "Sun");
	public TerminalRule getDateTimeLiteralRule() {
		return (tDateTimeLiteral != null) ? tDateTimeLiteral : (tDateTimeLiteral = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "DateTimeLiteral"));
	} 

	//BooleanLiteralRule:
	//	value=BooleanLiteral;
	public BooleanLiteralRuleElements getBooleanLiteralRuleAccess() {
		return (pBooleanLiteralRule != null) ? pBooleanLiteralRule : (pBooleanLiteralRule = new BooleanLiteralRuleElements());
	}
	
	public ParserRule getBooleanLiteralRuleRule() {
		return getBooleanLiteralRuleAccess().getRule();
	}

	//terminal BooleanLiteral:
	//	"true" | "false";
	public TerminalRule getBooleanLiteralRule() {
		return (tBooleanLiteral != null) ? tBooleanLiteral : (tBooleanLiteral = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "BooleanLiteral"));
	} 

	//NullLiteralRule:
	//	value=NullLiteral;
	public NullLiteralRuleElements getNullLiteralRuleAccess() {
		return (pNullLiteralRule != null) ? pNullLiteralRule : (pNullLiteralRule = new NullLiteralRuleElements());
	}
	
	public ParserRule getNullLiteralRuleRule() {
		return getNullLiteralRuleAccess().getRule();
	}

	//terminal NullLiteral:
	//	"null";
	public TerminalRule getNullLiteralRule() {
		return (tNullLiteral != null) ? tNullLiteral : (tNullLiteral = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "NullLiteral"));
	} 

	////DefaultLiteralRule :
	////	value = DefaultLiteral ;
	////terminal DefaultLiteral : 
	////	'/' ;
	//DefaultLiteralRule:
	//	value="/";
	public DefaultLiteralRuleElements getDefaultLiteralRuleAccess() {
		return (pDefaultLiteralRule != null) ? pDefaultLiteralRule : (pDefaultLiteralRule = new DefaultLiteralRuleElements());
	}
	
	public ParserRule getDefaultLiteralRuleRule() {
		return getDefaultLiteralRuleAccess().getRule();
	}

	//StringLiteralRule:
	//	value=STRING;
	public StringLiteralRuleElements getStringLiteralRuleAccess() {
		return (pStringLiteralRule != null) ? pStringLiteralRule : (pStringLiteralRule = new StringLiteralRuleElements());
	}
	
	public ParserRule getStringLiteralRuleRule() {
		return getStringLiteralRuleAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" | "n" |
	//	"f" | "r" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
