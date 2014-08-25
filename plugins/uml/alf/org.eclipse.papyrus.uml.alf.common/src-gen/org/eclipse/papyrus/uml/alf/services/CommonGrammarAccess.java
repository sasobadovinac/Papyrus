/*
* generated by Xtext
*/
package org.eclipse.papyrus.uml.alf.services;

import java.util.List;

import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class CommonGrammarAccess extends AbstractGrammarElementFinder {



	private TerminalRule tID;
	private TerminalRule tSTRING;
	private TerminalRule tML_COMMENT;
	private TerminalRule tSL_COMMENT;
	private TerminalRule tINT;
	private TerminalRule tINTEGER_VALUE;

	private final Grammar grammar;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public CommonGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
	}

	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.papyrus.uml.alf.Common".equals(grammar.getName())) {
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


	@Override
	public Grammar getGrammar() {
		return grammar;
	}


	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}


	//terminal ID:
	//
	//	("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")* | "\'"->"\'";
	public TerminalRule getIDRule() {
		return (tID != null) ? tID : (tID = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "ID"));
	}

	//terminal STRING:
	//
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"";
	public TerminalRule getSTRINGRule() {
		return (tSTRING != null) ? tSTRING : (tSTRING = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "STRING"));
	}

	//terminal ML_COMMENT:
	//
	//	"/ *" !"@"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return (tML_COMMENT != null) ? tML_COMMENT : (tML_COMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "ML_COMMENT"));
	}

	//terminal SL_COMMENT:
	//
	//	"//" !("\n" | "\r" | "@")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return (tSL_COMMENT != null) ? tSL_COMMENT : (tSL_COMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "SL_COMMENT"));
	}

	//terminal INT returns ecore::EInt:
	//
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return (tINT != null) ? tINT : (tINT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "INT"));
	}

	////terminal DOUBLE_COLON : '::' ;
	//
	////terminal IDENTIFIER : ID  ;
	//
	////terminal IDENTIFIER : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*  | ('\'' -> '\'')  ;
	//
	////terminal DOCUMENTATION_COMMENT : '/ *' -> '* /' ;
	//
	////terminal ML_COMMENT	: '/�' -> '�/';
	//
	////terminal SL_COMMENT 	: '��' !('\n'|'\r')* ('\r'? '\n')?;
	//
	////terminal WS			: (' '|'\t'|'\r'|'\n')+; terminal INTEGER_VALUE:
	//
	//	("0" | "1".."9" ("_"? "0".."9")*) //DECIMAL
	//
	//	// BINARY
	//
	//	// HEX
	//
	//	// OCT
	//
	//	| ("0b" | "0B") "0".."1" ("_"? "0".."1")* | ("0x" | "0X") ("0".."9" | "a".."f" | "A".."F") ("_"? ("0".."9" | "a".."f" |
	//
	//	"A".."F"))* | "0" "_"? "0".."7" ("_"? "0".."7")*;
	public TerminalRule getINTEGER_VALUERule() {
		return (tINTEGER_VALUE != null) ? tINTEGER_VALUE : (tINTEGER_VALUE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "INTEGER_VALUE"));
	}

	//terminal WS:
	//
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}

	//terminal ANY_OTHER:
	//
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
