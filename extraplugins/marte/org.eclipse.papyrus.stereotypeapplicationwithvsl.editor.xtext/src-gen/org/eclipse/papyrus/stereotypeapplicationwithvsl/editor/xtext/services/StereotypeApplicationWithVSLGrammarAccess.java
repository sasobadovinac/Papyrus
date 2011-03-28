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

package org.eclipse.papyrus.stereotypeapplicationwithvsl.editor.xtext.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.papyrus.marte.vsl.services.VSLGrammarAccess;

@Singleton
public class StereotypeApplicationWithVSLGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class StereotypeApplicationsRuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "StereotypeApplicationsRule");
		private final Assignment cStereotypeApplicationsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cStereotypeApplicationsStereotypeApplicationRuleParserRuleCall_0 = (RuleCall)cStereotypeApplicationsAssignment.eContents().get(0);
		
		//StereotypeApplicationsRule:
		//	stereotypeApplications+=StereotypeApplicationRule*;
		public ParserRule getRule() { return rule; }

		//stereotypeApplications+=StereotypeApplicationRule*
		public Assignment getStereotypeApplicationsAssignment() { return cStereotypeApplicationsAssignment; }

		//StereotypeApplicationRule
		public RuleCall getStereotypeApplicationsStereotypeApplicationRuleParserRuleCall_0() { return cStereotypeApplicationsStereotypeApplicationRuleParserRuleCall_0; }
	}

	public class StereotypeApplicationRuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "StereotypeApplicationRule");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLessThanSignLessThanSignKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cStereotypeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cStereotypeStereotypeCrossReference_1_0 = (CrossReference)cStereotypeAssignment_1.eContents().get(0);
		private final RuleCall cStereotypeStereotypeIDTerminalRuleCall_1_0_1 = (RuleCall)cStereotypeStereotypeCrossReference_1_0.eContents().get(1);
		private final Keyword cGreaterThanSignGreaterThanSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Assignment cTagSpecificationAssignment_3_0 = (Assignment)cGroup_3.eContents().get(0);
		private final RuleCall cTagSpecificationTagSpecificationRuleParserRuleCall_3_0_0 = (RuleCall)cTagSpecificationAssignment_3_0.eContents().get(0);
		private final Group cGroup_3_1 = (Group)cGroup_3.eContents().get(1);
		private final Keyword cCommaKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Assignment cTagSpecificationAssignment_3_1_1 = (Assignment)cGroup_3_1.eContents().get(1);
		private final RuleCall cTagSpecificationTagSpecificationRuleParserRuleCall_3_1_1_0 = (RuleCall)cTagSpecificationAssignment_3_1_1.eContents().get(0);
		
		//StereotypeApplicationRule:
		//	"<<" stereotype=[uml::Stereotype] ">>" (tagSpecification+=TagSpecificationRule (","
		//	tagSpecification+=TagSpecificationRule)*)?;
		public ParserRule getRule() { return rule; }

		//"<<" stereotype=[uml::Stereotype] ">>" (tagSpecification+=TagSpecificationRule (","
		//tagSpecification+=TagSpecificationRule)*)?
		public Group getGroup() { return cGroup; }

		//"<<"
		public Keyword getLessThanSignLessThanSignKeyword_0() { return cLessThanSignLessThanSignKeyword_0; }

		//stereotype=[uml::Stereotype]
		public Assignment getStereotypeAssignment_1() { return cStereotypeAssignment_1; }

		//[uml::Stereotype]
		public CrossReference getStereotypeStereotypeCrossReference_1_0() { return cStereotypeStereotypeCrossReference_1_0; }

		//ID
		public RuleCall getStereotypeStereotypeIDTerminalRuleCall_1_0_1() { return cStereotypeStereotypeIDTerminalRuleCall_1_0_1; }

		//">>"
		public Keyword getGreaterThanSignGreaterThanSignKeyword_2() { return cGreaterThanSignGreaterThanSignKeyword_2; }

		//(tagSpecification+=TagSpecificationRule ("," tagSpecification+=TagSpecificationRule)*)?
		public Group getGroup_3() { return cGroup_3; }

		//tagSpecification+=TagSpecificationRule
		public Assignment getTagSpecificationAssignment_3_0() { return cTagSpecificationAssignment_3_0; }

		//TagSpecificationRule
		public RuleCall getTagSpecificationTagSpecificationRuleParserRuleCall_3_0_0() { return cTagSpecificationTagSpecificationRuleParserRuleCall_3_0_0; }

		//("," tagSpecification+=TagSpecificationRule)*
		public Group getGroup_3_1() { return cGroup_3_1; }

		//","
		public Keyword getCommaKeyword_3_1_0() { return cCommaKeyword_3_1_0; }

		//tagSpecification+=TagSpecificationRule
		public Assignment getTagSpecificationAssignment_3_1_1() { return cTagSpecificationAssignment_3_1_1; }

		//TagSpecificationRule
		public RuleCall getTagSpecificationTagSpecificationRuleParserRuleCall_3_1_1_0() { return cTagSpecificationTagSpecificationRuleParserRuleCall_3_1_1_0; }
	}

	public class TagSpecificationRuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "TagSpecificationRule");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cPropertyAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cPropertyPropertyCrossReference_0_0 = (CrossReference)cPropertyAssignment_0.eContents().get(0);
		private final RuleCall cPropertyPropertyIDTerminalRuleCall_0_0_1 = (RuleCall)cPropertyPropertyCrossReference_0_0.eContents().get(1);
		private final Assignment cValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValueExpressionValueRuleParserRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		
		//TagSpecificationRule:
		//	property=[uml::Property] value=ExpressionValueRule;
		public ParserRule getRule() { return rule; }

		//property=[uml::Property] value=ExpressionValueRule
		public Group getGroup() { return cGroup; }

		//property=[uml::Property]
		public Assignment getPropertyAssignment_0() { return cPropertyAssignment_0; }

		//[uml::Property]
		public CrossReference getPropertyPropertyCrossReference_0_0() { return cPropertyPropertyCrossReference_0_0; }

		//ID
		public RuleCall getPropertyPropertyIDTerminalRuleCall_0_0_1() { return cPropertyPropertyIDTerminalRuleCall_0_0_1; }

		//value=ExpressionValueRule
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }

		//ExpressionValueRule
		public RuleCall getValueExpressionValueRuleParserRuleCall_1_0() { return cValueExpressionValueRuleParserRuleCall_1_0; }
	}

	public class ExpressionValueRuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ExpressionValueRule");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEqualsSignKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cExpressionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cExpressionExpressionParserRuleCall_1_0 = (RuleCall)cExpressionAssignment_1.eContents().get(0);
		
		//ExpressionValueRule:
		//	"=" expression=Expression;
		public ParserRule getRule() { return rule; }

		//"=" expression=Expression
		public Group getGroup() { return cGroup; }

		//"="
		public Keyword getEqualsSignKeyword_0() { return cEqualsSignKeyword_0; }

		//expression=Expression
		public Assignment getExpressionAssignment_1() { return cExpressionAssignment_1; }

		//Expression
		public RuleCall getExpressionExpressionParserRuleCall_1_0() { return cExpressionExpressionParserRuleCall_1_0; }
	}
	
	
	private StereotypeApplicationsRuleElements pStereotypeApplicationsRule;
	private StereotypeApplicationRuleElements pStereotypeApplicationRule;
	private TagSpecificationRuleElements pTagSpecificationRule;
	private ExpressionValueRuleElements pExpressionValueRule;
	
	private final GrammarProvider grammarProvider;

	private VSLGrammarAccess gaVSL;

	@Inject
	public StereotypeApplicationWithVSLGrammarAccess(GrammarProvider grammarProvider,
		VSLGrammarAccess gaVSL) {
		this.grammarProvider = grammarProvider;
		this.gaVSL = gaVSL;
	}
	
	public Grammar getGrammar() {	
		return grammarProvider.getGrammar(this);
	}
	

	public VSLGrammarAccess getVSLGrammarAccess() {
		return gaVSL;
	}

	
	//StereotypeApplicationsRule:
	//	stereotypeApplications+=StereotypeApplicationRule*;
	public StereotypeApplicationsRuleElements getStereotypeApplicationsRuleAccess() {
		return (pStereotypeApplicationsRule != null) ? pStereotypeApplicationsRule : (pStereotypeApplicationsRule = new StereotypeApplicationsRuleElements());
	}
	
	public ParserRule getStereotypeApplicationsRuleRule() {
		return getStereotypeApplicationsRuleAccess().getRule();
	}

	//StereotypeApplicationRule:
	//	"<<" stereotype=[uml::Stereotype] ">>" (tagSpecification+=TagSpecificationRule (","
	//	tagSpecification+=TagSpecificationRule)*)?;
	public StereotypeApplicationRuleElements getStereotypeApplicationRuleAccess() {
		return (pStereotypeApplicationRule != null) ? pStereotypeApplicationRule : (pStereotypeApplicationRule = new StereotypeApplicationRuleElements());
	}
	
	public ParserRule getStereotypeApplicationRuleRule() {
		return getStereotypeApplicationRuleAccess().getRule();
	}

	//TagSpecificationRule:
	//	property=[uml::Property] value=ExpressionValueRule;
	public TagSpecificationRuleElements getTagSpecificationRuleAccess() {
		return (pTagSpecificationRule != null) ? pTagSpecificationRule : (pTagSpecificationRule = new TagSpecificationRuleElements());
	}
	
	public ParserRule getTagSpecificationRuleRule() {
		return getTagSpecificationRuleAccess().getRule();
	}

	//ExpressionValueRule:
	//	"=" expression=Expression;
	public ExpressionValueRuleElements getExpressionValueRuleAccess() {
		return (pExpressionValueRule != null) ? pExpressionValueRule : (pExpressionValueRule = new ExpressionValueRuleElements());
	}
	
	public ParserRule getExpressionValueRuleRule() {
		return getExpressionValueRuleAccess().getRule();
	}

	//Expression:
	//	exp=AndOrXorExpression;
	public VSLGrammarAccess.ExpressionElements getExpressionAccess() {
		return gaVSL.getExpressionAccess();
	}
	
	public ParserRule getExpressionRule() {
		return getExpressionAccess().getRule();
	}

	//AndOrXorExpression:
	//	exp+=EqualityExpression (op+=("and" | "or" | "xor") exp+=EqualityExpression)*;
	public VSLGrammarAccess.AndOrXorExpressionElements getAndOrXorExpressionAccess() {
		return gaVSL.getAndOrXorExpressionAccess();
	}
	
	public ParserRule getAndOrXorExpressionRule() {
		return getAndOrXorExpressionAccess().getRule();
	}

	//EqualityExpression:
	//	exp+=RelationalExpression (op+=("==" | "<>") exp+=RelationalExpression)*;
	public VSLGrammarAccess.EqualityExpressionElements getEqualityExpressionAccess() {
		return gaVSL.getEqualityExpressionAccess();
	}
	
	public ParserRule getEqualityExpressionRule() {
		return getEqualityExpressionAccess().getRule();
	}

	//RelationalExpression:
	//	exp+=ConditionalExpression (op+=("<" | ">" | "<=" | ">=") exp+=ConditionalExpression)*;
	public VSLGrammarAccess.RelationalExpressionElements getRelationalExpressionAccess() {
		return gaVSL.getRelationalExpressionAccess();
	}
	
	public ParserRule getRelationalExpressionRule() {
		return getRelationalExpressionAccess().getRule();
	}

	//ConditionalExpression:
	//	exp+=AdditiveExpression (op+="?" exp+=AdditiveExpression ":" exp+=AdditiveExpression)?;
	public VSLGrammarAccess.ConditionalExpressionElements getConditionalExpressionAccess() {
		return gaVSL.getConditionalExpressionAccess();
	}
	
	public ParserRule getConditionalExpressionRule() {
		return getConditionalExpressionAccess().getRule();
	}

	//AdditiveExpression:
	//	exp+=MultiplicativeExpression (op+=("+" | "-") exp+=MultiplicativeExpression)*;
	public VSLGrammarAccess.AdditiveExpressionElements getAdditiveExpressionAccess() {
		return gaVSL.getAdditiveExpressionAccess();
	}
	
	public ParserRule getAdditiveExpressionRule() {
		return getAdditiveExpressionAccess().getRule();
	}

	//MultiplicativeExpression:
	//	exp+=UnaryExpression (op+=("*" | "/" | "mod") exp+=UnaryExpression)*;
	public VSLGrammarAccess.MultiplicativeExpressionElements getMultiplicativeExpressionAccess() {
		return gaVSL.getMultiplicativeExpressionAccess();
	}
	
	public ParserRule getMultiplicativeExpressionRule() {
		return getMultiplicativeExpressionAccess().getRule();
	}

	//UnaryExpression:
	//	op=("not" | "-" | "+") unary=UnaryExpression | exp=PrimaryExpression;
	public VSLGrammarAccess.UnaryExpressionElements getUnaryExpressionAccess() {
		return gaVSL.getUnaryExpressionAccess();
	}
	
	public ParserRule getUnaryExpressionRule() {
		return getUnaryExpressionAccess().getRule();
	}

	//PrimaryExpression:
	//	prefix=ValueSpecification ("." suffix=SuffixExpression)?;
	public VSLGrammarAccess.PrimaryExpressionElements getPrimaryExpressionAccess() {
		return gaVSL.getPrimaryExpressionAccess();
	}
	
	public ParserRule getPrimaryExpressionRule() {
		return getPrimaryExpressionAccess().getRule();
	}

	//ValueSpecification:
	//	Literal | NameOrChoiceOrBehaviorCall | Interval | CollectionOrTuple | Tuple | TimeExpression | VariableDeclaration |
	//	"(" Expression ")";
	public VSLGrammarAccess.ValueSpecificationElements getValueSpecificationAccess() {
		return gaVSL.getValueSpecificationAccess();
	}
	
	public ParserRule getValueSpecificationRule() {
		return getValueSpecificationAccess().getRule();
	}

	//SuffixExpression:
	//	PropertyCallExpression | OperationCallExpression;
	public VSLGrammarAccess.SuffixExpressionElements getSuffixExpressionAccess() {
		return gaVSL.getSuffixExpressionAccess();
	}
	
	public ParserRule getSuffixExpressionRule() {
		return getSuffixExpressionAccess().getRule();
	}

	//PropertyCallExpression:
	//	property=[uml::Property] ("." suffix=SuffixExpression)?;
	public VSLGrammarAccess.PropertyCallExpressionElements getPropertyCallExpressionAccess() {
		return gaVSL.getPropertyCallExpressionAccess();
	}
	
	public ParserRule getPropertyCallExpressionRule() {
		return getPropertyCallExpressionAccess().getRule();
	}

	//OperationCallExpression:
	//	operation=[uml::Operation] "(" arguments=ListOfValues? ")" ("." suffix=SuffixExpression)?;
	public VSLGrammarAccess.OperationCallExpressionElements getOperationCallExpressionAccess() {
		return gaVSL.getOperationCallExpressionAccess();
	}
	
	public ParserRule getOperationCallExpressionRule() {
		return getOperationCallExpressionAccess().getRule();
	}

	//Literal:
	//	NumberLiteralRule | DateTimeLiteralRule | BooleanLiteralRule | NullLiteralRule | DefaultLiteralRule |
	//	StringLiteralRule;
	public VSLGrammarAccess.LiteralElements getLiteralAccess() {
		return gaVSL.getLiteralAccess();
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
	public VSLGrammarAccess.NameOrChoiceOrBehaviorCallElements getNameOrChoiceOrBehaviorCallAccess() {
		return gaVSL.getNameOrChoiceOrBehaviorCallAccess();
	}
	
	public ParserRule getNameOrChoiceOrBehaviorCallRule() {
		return getNameOrChoiceOrBehaviorCallAccess().getRule();
	}

	//QualifiedName:
	//	path=[uml::Namespace] "::" remaining=QualifiedName?;
	public VSLGrammarAccess.QualifiedNameElements getQualifiedNameAccess() {
		return gaVSL.getQualifiedNameAccess();
	}
	
	public ParserRule getQualifiedNameRule() {
		return getQualifiedNameAccess().getRule();
	}

	//Interval:
	//	("]" | isLowerIncluded="[") lower=Expression ".." upper=Expression (isUpperIncluded="]" | "[");
	public VSLGrammarAccess.IntervalElements getIntervalAccess() {
		return gaVSL.getIntervalAccess();
	}
	
	public ParserRule getIntervalRule() {
		return getIntervalAccess().getRule();
	}

	//CollectionOrTuple:
	//	"{" listOfValues=ListOfValues "}";
	public VSLGrammarAccess.CollectionOrTupleElements getCollectionOrTupleAccess() {
		return gaVSL.getCollectionOrTupleAccess();
	}
	
	public ParserRule getCollectionOrTupleRule() {
		return getCollectionOrTupleAccess().getRule();
	}

	//Tuple:
	//	"{" listOfValueNamePairs=ListOfValueNamePairs "}";
	public VSLGrammarAccess.TupleElements getTupleAccess() {
		return gaVSL.getTupleAccess();
	}
	
	public ParserRule getTupleRule() {
		return getTupleAccess().getRule();
	}

	//ListOfValues:
	//	values+=Expression ("," values+=Expression)*;
	public VSLGrammarAccess.ListOfValuesElements getListOfValuesAccess() {
		return gaVSL.getListOfValuesAccess();
	}
	
	public ParserRule getListOfValuesRule() {
		return getListOfValuesAccess().getRule();
	}

	//ListOfValueNamePairs:
	//	valueNamePairs+=ValueNamePair ("," valueNamePairs+=ValueNamePair)*;
	public VSLGrammarAccess.ListOfValueNamePairsElements getListOfValueNamePairsAccess() {
		return gaVSL.getListOfValueNamePairsAccess();
	}
	
	public ParserRule getListOfValueNamePairsRule() {
		return getListOfValueNamePairsAccess().getRule();
	}

	//ValueNamePair:
	//	property=[uml::Property] "=" value=Expression;
	public VSLGrammarAccess.ValueNamePairElements getValueNamePairAccess() {
		return gaVSL.getValueNamePairAccess();
	}
	
	public ParserRule getValueNamePairRule() {
		return getValueNamePairAccess().getRule();
	}

	//TimeExpression:
	//	InstantObsExpression | DurationObsExpression | JitterExp;
	public VSLGrammarAccess.TimeExpressionElements getTimeExpressionAccess() {
		return gaVSL.getTimeExpressionAccess();
	}
	
	public ParserRule getTimeExpressionRule() {
		return getTimeExpressionAccess().getRule();
	}

	//InstantObsExpression:
	//	"@" id=InstantObsName ("(" index=Expression ")")? ("when" "(" condition=Expression ")")?;
	public VSLGrammarAccess.InstantObsExpressionElements getInstantObsExpressionAccess() {
		return gaVSL.getInstantObsExpressionAccess();
	}
	
	public ParserRule getInstantObsExpressionRule() {
		return getInstantObsExpressionAccess().getRule();
	}

	//InstantObsName:
	//	path=QualifiedName? instantId=[uml::TimeObservation];
	public VSLGrammarAccess.InstantObsNameElements getInstantObsNameAccess() {
		return gaVSL.getInstantObsNameAccess();
	}
	
	public ParserRule getInstantObsNameRule() {
		return getInstantObsNameAccess().getRule();
	}

	//DurationObsExpression:
	//	"&" id=DurationObsName ("(" index=Expression ")")? ("when" "(" condition=Expression ")")?;
	public VSLGrammarAccess.DurationObsExpressionElements getDurationObsExpressionAccess() {
		return gaVSL.getDurationObsExpressionAccess();
	}
	
	public ParserRule getDurationObsExpressionRule() {
		return getDurationObsExpressionAccess().getRule();
	}

	//DurationObsName:
	//	path=QualifiedName? durationId=[uml::DurationObservation];
	public VSLGrammarAccess.DurationObsNameElements getDurationObsNameAccess() {
		return gaVSL.getDurationObsNameAccess();
	}
	
	public ParserRule getDurationObsNameRule() {
		return getDurationObsNameAccess().getRule();
	}

	//JitterExp:
	//	"jitter(" firstInstant=InstantObsExpression ("-" secondInstant=InstantObsExpression)? ")";
	public VSLGrammarAccess.JitterExpElements getJitterExpAccess() {
		return gaVSL.getJitterExpAccess();
	}
	
	public ParserRule getJitterExpRule() {
		return getJitterExpAccess().getRule();
	}

	//VariableDeclaration:
	//	variableDeclaration=VariableDirectionKind? "$" name=ID (":" type=DataTypeName ("=" "(" initValue=Expression ")")? |
	//	"=" "(" initValue=Expression ")");
	public VSLGrammarAccess.VariableDeclarationElements getVariableDeclarationAccess() {
		return gaVSL.getVariableDeclarationAccess();
	}
	
	public ParserRule getVariableDeclarationRule() {
		return getVariableDeclarationAccess().getRule();
	}

	//VariableDirectionKind returns ecore::EString:
	//	"in" | "out" | "inout";
	public VSLGrammarAccess.VariableDirectionKindElements getVariableDirectionKindAccess() {
		return gaVSL.getVariableDirectionKindAccess();
	}
	
	public ParserRule getVariableDirectionKindRule() {
		return getVariableDirectionKindAccess().getRule();
	}

	//DataTypeName:
	//	path=QualifiedName? type=[uml::DataType];
	public VSLGrammarAccess.DataTypeNameElements getDataTypeNameAccess() {
		return gaVSL.getDataTypeNameAccess();
	}
	
	public ParserRule getDataTypeNameRule() {
		return getDataTypeNameAccess().getRule();
	}

	////////////////////////////////////////////////////////////////////////////////////////////////////////
	////LITERAL
	////////////////////////////////////////////////////////////////////////////////////////////////////////
	//NumberLiteralRule:
	//	IntegerLiteralRule | UnlimitedLiteralRule | RealLiteralRule;
	public VSLGrammarAccess.NumberLiteralRuleElements getNumberLiteralRuleAccess() {
		return gaVSL.getNumberLiteralRuleAccess();
	}
	
	public ParserRule getNumberLiteralRuleRule() {
		return getNumberLiteralRuleAccess().getRule();
	}

	//IntegerLiteralRule:
	//	value=IntegerLiteral;
	public VSLGrammarAccess.IntegerLiteralRuleElements getIntegerLiteralRuleAccess() {
		return gaVSL.getIntegerLiteralRuleAccess();
	}
	
	public ParserRule getIntegerLiteralRuleRule() {
		return getIntegerLiteralRuleAccess().getRule();
	}

	//terminal IntegerLiteral:
	//	("+" | "-")? ("0".."9"+ | "0x" ("0".."9" | "A".."F" | "a".."f")+ | "0b" "0".."1"+);
	public TerminalRule getIntegerLiteralRule() {
		return gaVSL.getIntegerLiteralRule();
	} 

	////UnlimitedLiteralRule :
	////	value = UnlimitedLiteral ;
	////terminal UnlimitedLiteral :
	////	'*' ;
	//UnlimitedLiteralRule:
	//	value="*";
	public VSLGrammarAccess.UnlimitedLiteralRuleElements getUnlimitedLiteralRuleAccess() {
		return gaVSL.getUnlimitedLiteralRuleAccess();
	}
	
	public ParserRule getUnlimitedLiteralRuleRule() {
		return getUnlimitedLiteralRuleAccess().getRule();
	}

	//RealLiteralRule:
	//	value=RealLiteral;
	public VSLGrammarAccess.RealLiteralRuleElements getRealLiteralRuleAccess() {
		return gaVSL.getRealLiteralRuleAccess();
	}
	
	public ParserRule getRealLiteralRuleRule() {
		return getRealLiteralRuleAccess().getRule();
	}

	//terminal RealLiteral:
	//	("+" | "-")? "0".."9"+ "." "0".."9"+ ("E" ("+" | "-")? "0".."9"+)?;
	public TerminalRule getRealLiteralRule() {
		return gaVSL.getRealLiteralRule();
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
	public VSLGrammarAccess.DateTimeLiteralRuleElements getDateTimeLiteralRuleAccess() {
		return gaVSL.getDateTimeLiteralRuleAccess();
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
		return gaVSL.getDateTimeLiteralRule();
	} 

	//BooleanLiteralRule:
	//	value=BooleanLiteral;
	public VSLGrammarAccess.BooleanLiteralRuleElements getBooleanLiteralRuleAccess() {
		return gaVSL.getBooleanLiteralRuleAccess();
	}
	
	public ParserRule getBooleanLiteralRuleRule() {
		return getBooleanLiteralRuleAccess().getRule();
	}

	//terminal BooleanLiteral:
	//	"true" | "false";
	public TerminalRule getBooleanLiteralRule() {
		return gaVSL.getBooleanLiteralRule();
	} 

	//NullLiteralRule:
	//	value=NullLiteral;
	public VSLGrammarAccess.NullLiteralRuleElements getNullLiteralRuleAccess() {
		return gaVSL.getNullLiteralRuleAccess();
	}
	
	public ParserRule getNullLiteralRuleRule() {
		return getNullLiteralRuleAccess().getRule();
	}

	//terminal NullLiteral:
	//	"null";
	public TerminalRule getNullLiteralRule() {
		return gaVSL.getNullLiteralRule();
	} 

	////DefaultLiteralRule :
	////	value = DefaultLiteral ;
	////terminal DefaultLiteral : 
	////	'/' ;
	//DefaultLiteralRule:
	//	value="/";
	public VSLGrammarAccess.DefaultLiteralRuleElements getDefaultLiteralRuleAccess() {
		return gaVSL.getDefaultLiteralRuleAccess();
	}
	
	public ParserRule getDefaultLiteralRuleRule() {
		return getDefaultLiteralRuleAccess().getRule();
	}

	//StringLiteralRule:
	//	value=STRING;
	public VSLGrammarAccess.StringLiteralRuleElements getStringLiteralRuleAccess() {
		return gaVSL.getStringLiteralRuleAccess();
	}
	
	public ParserRule getStringLiteralRuleRule() {
		return getStringLiteralRuleAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaVSL.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaVSL.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" | "n" |
	//	"f" | "r" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaVSL.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaVSL.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaVSL.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaVSL.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaVSL.getANY_OTHERRule();
	} 
}
