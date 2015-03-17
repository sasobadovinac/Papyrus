/*
* generated by Xtext
*/
package org.eclipse.papyrus.uml.textedit.valuespecification.xtext.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class UmlValueSpecificationGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class AbstractRuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "AbstractRule");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Assignment cVisibilityAssignment_0_0 = (Assignment)cGroup_0.eContents().get(0);
		private final RuleCall cVisibilityVisibilityKindParserRuleCall_0_0_0 = (RuleCall)cVisibilityAssignment_0_0.eContents().get(0);
		private final Group cGroup_0_1 = (Group)cGroup_0.eContents().get(1);
		private final Assignment cNameAssignment_0_1_0 = (Assignment)cGroup_0_1.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_1_0_0 = (RuleCall)cNameAssignment_0_1_0.eContents().get(0);
		private final Keyword cEqualsSignKeyword_0_1_1 = (Keyword)cGroup_0_1.eContents().get(1);
		private final Alternatives cAlternatives_0_2 = (Alternatives)cGroup_0.eContents().get(2);
		private final Assignment cValueAssignment_0_2_0 = (Assignment)cAlternatives_0_2.eContents().get(0);
		private final Alternatives cValueAlternatives_0_2_0_0 = (Alternatives)cValueAssignment_0_2_0.eContents().get(0);
		private final RuleCall cValueLiteralBooleanRuleParserRuleCall_0_2_0_0_0 = (RuleCall)cValueAlternatives_0_2_0_0.eContents().get(0);
		private final RuleCall cValueLiteralIntegerOrUnlimitedNaturalRuleParserRuleCall_0_2_0_0_1 = (RuleCall)cValueAlternatives_0_2_0_0.eContents().get(1);
		private final RuleCall cValueLiteralRealRuleParserRuleCall_0_2_0_0_2 = (RuleCall)cValueAlternatives_0_2_0_0.eContents().get(2);
		private final RuleCall cValueLiteralNullRuleParserRuleCall_0_2_0_0_3 = (RuleCall)cValueAlternatives_0_2_0_0.eContents().get(3);
		private final RuleCall cValueLiteralStringRuleParserRuleCall_0_2_0_0_4 = (RuleCall)cValueAlternatives_0_2_0_0.eContents().get(4);
		private final Assignment cInstanceSpecificationAssignment_0_2_1 = (Assignment)cAlternatives_0_2.eContents().get(1);
		private final CrossReference cInstanceSpecificationInstanceSpecificationCrossReference_0_2_1_0 = (CrossReference)cInstanceSpecificationAssignment_0_2_1.eContents().get(0);
		private final RuleCall cInstanceSpecificationInstanceSpecificationIDTerminalRuleCall_0_2_1_0_1 = (RuleCall)cInstanceSpecificationInstanceSpecificationCrossReference_0_2_1_0.eContents().get(1);
		private final Assignment cUndefinedAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cUndefinedUndefinedRuleParserRuleCall_1_0 = (RuleCall)cUndefinedAssignment_1.eContents().get(0);
		
		//AbstractRule:
		//	visibility=VisibilityKind? (name=ID "=")? (value=(LiteralBooleanRule | LiteralIntegerOrUnlimitedNaturalRule |
		//	LiteralRealRule | LiteralNullRule | LiteralStringRule) | instanceSpecification=[uml::InstanceSpecification]) |
		//	undefined=UndefinedRule;
		public ParserRule getRule() { return rule; }

		//visibility=VisibilityKind? (name=ID "=")? (value=(LiteralBooleanRule | LiteralIntegerOrUnlimitedNaturalRule |
		//LiteralRealRule | LiteralNullRule | LiteralStringRule) | instanceSpecification=[uml::InstanceSpecification]) |
		//undefined=UndefinedRule
		public Alternatives getAlternatives() { return cAlternatives; }

		//visibility=VisibilityKind? (name=ID "=")? (value=(LiteralBooleanRule | LiteralIntegerOrUnlimitedNaturalRule |
		//LiteralRealRule | LiteralNullRule | LiteralStringRule) | instanceSpecification=[uml::InstanceSpecification])
		public Group getGroup_0() { return cGroup_0; }

		//visibility=VisibilityKind?
		public Assignment getVisibilityAssignment_0_0() { return cVisibilityAssignment_0_0; }

		//VisibilityKind
		public RuleCall getVisibilityVisibilityKindParserRuleCall_0_0_0() { return cVisibilityVisibilityKindParserRuleCall_0_0_0; }

		//(name=ID "=")?
		public Group getGroup_0_1() { return cGroup_0_1; }

		//name=ID
		public Assignment getNameAssignment_0_1_0() { return cNameAssignment_0_1_0; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_0_1_0_0() { return cNameIDTerminalRuleCall_0_1_0_0; }

		//"="
		public Keyword getEqualsSignKeyword_0_1_1() { return cEqualsSignKeyword_0_1_1; }

		//value=(LiteralBooleanRule | LiteralIntegerOrUnlimitedNaturalRule | LiteralRealRule | LiteralNullRule |
		//LiteralStringRule) | instanceSpecification=[uml::InstanceSpecification]
		public Alternatives getAlternatives_0_2() { return cAlternatives_0_2; }

		//value=(LiteralBooleanRule | LiteralIntegerOrUnlimitedNaturalRule | LiteralRealRule | LiteralNullRule |
		//LiteralStringRule)
		public Assignment getValueAssignment_0_2_0() { return cValueAssignment_0_2_0; }

		//LiteralBooleanRule | LiteralIntegerOrUnlimitedNaturalRule | LiteralRealRule | LiteralNullRule | LiteralStringRule
		public Alternatives getValueAlternatives_0_2_0_0() { return cValueAlternatives_0_2_0_0; }

		//LiteralBooleanRule
		public RuleCall getValueLiteralBooleanRuleParserRuleCall_0_2_0_0_0() { return cValueLiteralBooleanRuleParserRuleCall_0_2_0_0_0; }

		//LiteralIntegerOrUnlimitedNaturalRule
		public RuleCall getValueLiteralIntegerOrUnlimitedNaturalRuleParserRuleCall_0_2_0_0_1() { return cValueLiteralIntegerOrUnlimitedNaturalRuleParserRuleCall_0_2_0_0_1; }

		//LiteralRealRule
		public RuleCall getValueLiteralRealRuleParserRuleCall_0_2_0_0_2() { return cValueLiteralRealRuleParserRuleCall_0_2_0_0_2; }

		//LiteralNullRule
		public RuleCall getValueLiteralNullRuleParserRuleCall_0_2_0_0_3() { return cValueLiteralNullRuleParserRuleCall_0_2_0_0_3; }

		//LiteralStringRule
		public RuleCall getValueLiteralStringRuleParserRuleCall_0_2_0_0_4() { return cValueLiteralStringRuleParserRuleCall_0_2_0_0_4; }

		//instanceSpecification=[uml::InstanceSpecification]
		public Assignment getInstanceSpecificationAssignment_0_2_1() { return cInstanceSpecificationAssignment_0_2_1; }

		//[uml::InstanceSpecification]
		public CrossReference getInstanceSpecificationInstanceSpecificationCrossReference_0_2_1_0() { return cInstanceSpecificationInstanceSpecificationCrossReference_0_2_1_0; }

		//ID
		public RuleCall getInstanceSpecificationInstanceSpecificationIDTerminalRuleCall_0_2_1_0_1() { return cInstanceSpecificationInstanceSpecificationIDTerminalRuleCall_0_2_1_0_1; }

		//undefined=UndefinedRule
		public Assignment getUndefinedAssignment_1() { return cUndefinedAssignment_1; }

		//UndefinedRule
		public RuleCall getUndefinedUndefinedRuleParserRuleCall_1_0() { return cUndefinedUndefinedRuleParserRuleCall_1_0; }
	}

	public class LiteralBooleanRuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "LiteralBooleanRule");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final Alternatives cValueAlternatives_0 = (Alternatives)cValueAssignment.eContents().get(0);
		private final Keyword cValueTrueKeyword_0_0 = (Keyword)cValueAlternatives_0.eContents().get(0);
		private final Keyword cValueFalseKeyword_0_1 = (Keyword)cValueAlternatives_0.eContents().get(1);
		
		//LiteralBooleanRule:
		//	value=("true" | "false");
		public ParserRule getRule() { return rule; }

		//value=("true" | "false")
		public Assignment getValueAssignment() { return cValueAssignment; }

		//"true" | "false"
		public Alternatives getValueAlternatives_0() { return cValueAlternatives_0; }

		//"true"
		public Keyword getValueTrueKeyword_0_0() { return cValueTrueKeyword_0_0; }

		//"false"
		public Keyword getValueFalseKeyword_0_1() { return cValueFalseKeyword_0_1; }
	}

	public class LiteralIntegerOrUnlimitedNaturalRuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "LiteralIntegerOrUnlimitedNaturalRule");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueINTTerminalRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		//LiteralIntegerOrUnlimitedNaturalRule:
		//	value=INT;
		public ParserRule getRule() { return rule; }

		//value=INT
		public Assignment getValueAssignment() { return cValueAssignment; }

		//INT
		public RuleCall getValueINTTerminalRuleCall_0() { return cValueINTTerminalRuleCall_0; }
	}

	public class LiteralRealRuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "LiteralRealRule");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueDOUBLETerminalRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		//LiteralRealRule:
		//	value=DOUBLE;
		public ParserRule getRule() { return rule; }

		//value=DOUBLE
		public Assignment getValueAssignment() { return cValueAssignment; }

		//DOUBLE
		public RuleCall getValueDOUBLETerminalRuleCall_0() { return cValueDOUBLETerminalRuleCall_0; }
	}

	public class LiteralNullRuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "LiteralNullRule");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final Keyword cValueNullKeyword_0 = (Keyword)cValueAssignment.eContents().get(0);
		
		//LiteralNullRule:
		//	value="null";
		public ParserRule getRule() { return rule; }

		//value="null"
		public Assignment getValueAssignment() { return cValueAssignment; }

		//"null"
		public Keyword getValueNullKeyword_0() { return cValueNullKeyword_0; }
	}

	public class LiteralStringRuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "LiteralStringRule");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueSTRINGTerminalRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		//LiteralStringRule:
		//	value=STRING;
		public ParserRule getRule() { return rule; }

		//value=STRING
		public Assignment getValueAssignment() { return cValueAssignment; }

		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_0() { return cValueSTRINGTerminalRuleCall_0; }
	}

	public class UndefinedRuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "UndefinedRule");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final Keyword cValueUndefinedKeyword_0 = (Keyword)cValueAssignment.eContents().get(0);
		
		//UndefinedRule:
		//	value="<Undefined>";
		public ParserRule getRule() { return rule; }

		//value="<Undefined>"
		public Assignment getValueAssignment() { return cValueAssignment; }

		//"<Undefined>"
		public Keyword getValueUndefinedKeyword_0() { return cValueUndefinedKeyword_0; }
	}

	public class VisibilityKindElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "VisibilityKind");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cPublicAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final Keyword cPublicPlusSignKeyword_0_0 = (Keyword)cPublicAssignment_0.eContents().get(0);
		private final Assignment cPrivateAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final Keyword cPrivateHyphenMinusKeyword_1_0 = (Keyword)cPrivateAssignment_1.eContents().get(0);
		private final Assignment cProtectedAssignment_2 = (Assignment)cAlternatives.eContents().get(2);
		private final Keyword cProtectedNumberSignKeyword_2_0 = (Keyword)cProtectedAssignment_2.eContents().get(0);
		private final Assignment cPackageAssignment_3 = (Assignment)cAlternatives.eContents().get(3);
		private final Keyword cPackageTildeKeyword_3_0 = (Keyword)cPackageAssignment_3.eContents().get(0);
		
		//VisibilityKind:
		//	public="+" | private="-" | protected="#" | package="~";
		public ParserRule getRule() { return rule; }

		//public="+" | private="-" | protected="#" | package="~"
		public Alternatives getAlternatives() { return cAlternatives; }

		//public="+"
		public Assignment getPublicAssignment_0() { return cPublicAssignment_0; }

		//"+"
		public Keyword getPublicPlusSignKeyword_0_0() { return cPublicPlusSignKeyword_0_0; }

		//private="-"
		public Assignment getPrivateAssignment_1() { return cPrivateAssignment_1; }

		//"-"
		public Keyword getPrivateHyphenMinusKeyword_1_0() { return cPrivateHyphenMinusKeyword_1_0; }

		//protected="#"
		public Assignment getProtectedAssignment_2() { return cProtectedAssignment_2; }

		//"#"
		public Keyword getProtectedNumberSignKeyword_2_0() { return cProtectedNumberSignKeyword_2_0; }

		//package="~"
		public Assignment getPackageAssignment_3() { return cPackageAssignment_3; }

		//"~"
		public Keyword getPackageTildeKeyword_3_0() { return cPackageTildeKeyword_3_0; }
	}
	
	
	private final AbstractRuleElements pAbstractRule;
	private final LiteralBooleanRuleElements pLiteralBooleanRule;
	private final LiteralIntegerOrUnlimitedNaturalRuleElements pLiteralIntegerOrUnlimitedNaturalRule;
	private final LiteralRealRuleElements pLiteralRealRule;
	private final TerminalRule tDOUBLE;
	private final LiteralNullRuleElements pLiteralNullRule;
	private final LiteralStringRuleElements pLiteralStringRule;
	private final UndefinedRuleElements pUndefinedRule;
	private final VisibilityKindElements pVisibilityKind;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public UmlValueSpecificationGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pAbstractRule = new AbstractRuleElements();
		this.pLiteralBooleanRule = new LiteralBooleanRuleElements();
		this.pLiteralIntegerOrUnlimitedNaturalRule = new LiteralIntegerOrUnlimitedNaturalRuleElements();
		this.pLiteralRealRule = new LiteralRealRuleElements();
		this.tDOUBLE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "DOUBLE");
		this.pLiteralNullRule = new LiteralNullRuleElements();
		this.pLiteralStringRule = new LiteralStringRuleElements();
		this.pUndefinedRule = new UndefinedRuleElements();
		this.pVisibilityKind = new VisibilityKindElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.papyrus.uml.textedit.valuespecification.xtext.UmlValueSpecification".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//AbstractRule:
	//	visibility=VisibilityKind? (name=ID "=")? (value=(LiteralBooleanRule | LiteralIntegerOrUnlimitedNaturalRule |
	//	LiteralRealRule | LiteralNullRule | LiteralStringRule) | instanceSpecification=[uml::InstanceSpecification]) |
	//	undefined=UndefinedRule;
	public AbstractRuleElements getAbstractRuleAccess() {
		return pAbstractRule;
	}
	
	public ParserRule getAbstractRuleRule() {
		return getAbstractRuleAccess().getRule();
	}

	//LiteralBooleanRule:
	//	value=("true" | "false");
	public LiteralBooleanRuleElements getLiteralBooleanRuleAccess() {
		return pLiteralBooleanRule;
	}
	
	public ParserRule getLiteralBooleanRuleRule() {
		return getLiteralBooleanRuleAccess().getRule();
	}

	//LiteralIntegerOrUnlimitedNaturalRule:
	//	value=INT;
	public LiteralIntegerOrUnlimitedNaturalRuleElements getLiteralIntegerOrUnlimitedNaturalRuleAccess() {
		return pLiteralIntegerOrUnlimitedNaturalRule;
	}
	
	public ParserRule getLiteralIntegerOrUnlimitedNaturalRuleRule() {
		return getLiteralIntegerOrUnlimitedNaturalRuleAccess().getRule();
	}

	//LiteralRealRule:
	//	value=DOUBLE;
	public LiteralRealRuleElements getLiteralRealRuleAccess() {
		return pLiteralRealRule;
	}
	
	public ParserRule getLiteralRealRuleRule() {
		return getLiteralRealRuleAccess().getRule();
	}

	//terminal DOUBLE returns ecore::EDouble:
	//	"0".."9"+ ("." | ",") "0".."9"* | "0".."9"* ("." | ",") "0".."9"+;
	public TerminalRule getDOUBLERule() {
		return tDOUBLE;
	} 

	//LiteralNullRule:
	//	value="null";
	public LiteralNullRuleElements getLiteralNullRuleAccess() {
		return pLiteralNullRule;
	}
	
	public ParserRule getLiteralNullRuleRule() {
		return getLiteralNullRuleAccess().getRule();
	}

	//LiteralStringRule:
	//	value=STRING;
	public LiteralStringRuleElements getLiteralStringRuleAccess() {
		return pLiteralStringRule;
	}
	
	public ParserRule getLiteralStringRuleRule() {
		return getLiteralStringRuleAccess().getRule();
	}

	//UndefinedRule:
	//	value="<Undefined>";
	public UndefinedRuleElements getUndefinedRuleAccess() {
		return pUndefinedRule;
	}
	
	public ParserRule getUndefinedRuleRule() {
		return getUndefinedRuleAccess().getRule();
	}

	//VisibilityKind:
	//	public="+" | private="-" | protected="#" | package="~";
	public VisibilityKindElements getVisibilityKindAccess() {
		return pVisibilityKind;
	}
	
	public ParserRule getVisibilityKindRule() {
		return getVisibilityKindAccess().getRule();
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
	//	"\"" ("\\" . / * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\""))* "\"" | "\'" ("\\" .
	//	/ * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\'"))* "\'";
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
