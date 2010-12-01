/*
 * generated by Xtext
 */
package org.eclipse.papyrus.collaborationuse.editor.xtext.parser.antlr;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.TokenSource;
import org.eclipse.papyrus.collaborationuse.editor.xtext.services.UmlCollaborationUseGrammarAccess;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parser.ParseException;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

import com.google.inject.Inject;

public class UmlCollaborationUseParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {

	@Inject
	private UmlCollaborationUseGrammarAccess grammarAccess;

	@Override
	protected IParseResult parse(String ruleName, CharStream in) {
		TokenSource tokenSource = createLexer(in);
		XtextTokenStream tokenStream = createTokenStream(tokenSource);
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
		org.eclipse.papyrus.collaborationuse.editor.xtext.parser.antlr.internal.InternalUmlCollaborationUseParser parser = createParser(tokenStream);
		parser.setTokenTypeMap(getTokenDefProvider().getTokenDefMap());
		parser.setSyntaxErrorProvider(getSyntaxErrorProvider());
		parser.setUnorderedGroupHelper(getUnorderedGroupHelper().get());
		try {
			if(ruleName != null)
				return parser.parse(ruleName);
			return parser.parse();
		} catch (Exception re) {
			throw new ParseException(re.getMessage(), re);
		}
	}

	protected org.eclipse.papyrus.collaborationuse.editor.xtext.parser.antlr.internal.InternalUmlCollaborationUseParser createParser(XtextTokenStream stream) {
		return new org.eclipse.papyrus.collaborationuse.editor.xtext.parser.antlr.internal.InternalUmlCollaborationUseParser(stream, getElementFactory(), getGrammarAccess());
	}

	@Override
	protected String getDefaultRuleName() {
		return "CollaborationUseRule";
	}

	public UmlCollaborationUseGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(UmlCollaborationUseGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

}
