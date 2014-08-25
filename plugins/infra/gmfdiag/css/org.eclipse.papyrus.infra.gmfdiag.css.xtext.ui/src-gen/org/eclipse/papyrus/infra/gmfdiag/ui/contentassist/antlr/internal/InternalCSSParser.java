/*****************************************************************************
 * Copyright (c) 2012-2013 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.infra.gmfdiag.ui.contentassist.antlr.internal;

import org.antlr.runtime.BaseRecognizer;
import org.antlr.runtime.BitSet;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.TokenStream;
import org.eclipse.papyrus.infra.gmfdiag.services.CSSGrammarAccess;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;

@SuppressWarnings("all")
public class InternalCSSParser extends AbstractInternalContentAssistParser {
	public static final String[] tokenNames = new String[] {
			"<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_WS", "RULE_CDO", "RULE_CDC", "RULE_ID", "RULE_STRING", "RULE_T_IMPORTANT", "RULE_T_NUM", "RULE_PC_UNIT", "RULE_LEN_UNIT", "RULE_EM_UNIT", "RULE_EX_UNIT", "RULE_ANGLE_UNIT", "RULE_TIME_UNIT",
			"RULE_FREQ_UNIT", "RULE_HASH", "RULE_T_CLASS", "RULE_ML_COMMENT", "RULE_ANY_OTHER", "'*'", "'-'", "'+'", "'>'", "'='", "'~='", "'!='", "'@charset '", "';'", "'@import'", "','", "'@media'", "'{'", "'}'", "'@page'", "':'", "'('", "')'", "'url('",
			"'/'", "'['", "']'"
	};
	public static final int RULE_ID = 7;
	public static final int T__29 = 29;
	public static final int T__28 = 28;
	public static final int T__27 = 27;
	public static final int T__26 = 26;
	public static final int T__25 = 25;
	public static final int T__24 = 24;
	public static final int T__23 = 23;
	public static final int RULE_PC_UNIT = 11;
	public static final int T__22 = 22;
	public static final int RULE_ANY_OTHER = 21;
	public static final int RULE_T_CLASS = 19;
	public static final int EOF = -1;
	public static final int RULE_CDC = 6;
	public static final int T__42 = 42;
	public static final int RULE_CDO = 5;
	public static final int T__43 = 43;
	public static final int T__40 = 40;
	public static final int T__41 = 41;
	public static final int RULE_FREQ_UNIT = 17;
	public static final int RULE_T_IMPORTANT = 9;
	public static final int RULE_HASH = 18;
	public static final int RULE_ML_COMMENT = 20;
	public static final int T__30 = 30;
	public static final int RULE_TIME_UNIT = 16;
	public static final int T__31 = 31;
	public static final int RULE_LEN_UNIT = 12;
	public static final int T__32 = 32;
	public static final int RULE_STRING = 8;
	public static final int T__33 = 33;
	public static final int T__34 = 34;
	public static final int T__35 = 35;
	public static final int T__36 = 36;
	public static final int T__37 = 37;
	public static final int T__38 = 38;
	public static final int T__39 = 39;
	public static final int RULE_T_NUM = 10;
	public static final int RULE_ANGLE_UNIT = 15;
	public static final int RULE_EX_UNIT = 14;
	public static final int RULE_WS = 4;
	public static final int RULE_EM_UNIT = 13;

	// delegates
	// delegators


	public InternalCSSParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}

	public InternalCSSParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);

	}


	@Override
	public String[] getTokenNames() {
		return InternalCSSParser.tokenNames;
	}

	@Override
	public String getGrammarFileName() {
		return "../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g";
	}



	private CSSGrammarAccess grammarAccess;

	public void setGrammarAccess(CSSGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}




	// $ANTLR start "entryRuleStylesheet"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:60:1: entryRuleStylesheet : ruleStylesheet EOF ;
	public final void entryRuleStylesheet() throws RecognitionException {
		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:61:1: ( ruleStylesheet EOF )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:62:1: ruleStylesheet EOF
			{
				before(grammarAccess.getStylesheetRule());
				pushFollow(FOLLOW_ruleStylesheet_in_entryRuleStylesheet61);
				ruleStylesheet();

				state._fsp--;

				after(grammarAccess.getStylesheetRule());
				match(input, EOF, FOLLOW_EOF_in_entryRuleStylesheet68);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}

	// $ANTLR end "entryRuleStylesheet"


	// $ANTLR start "ruleStylesheet"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:69:1: ruleStylesheet : ( ( rule__Stylesheet__Group__0 ) ) ;
	public final void ruleStylesheet() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:73:2: ( ( ( rule__Stylesheet__Group__0 ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:74:1: ( ( rule__Stylesheet__Group__0 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:74:1: ( ( rule__Stylesheet__Group__0 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:75:1: ( rule__Stylesheet__Group__0 )
				{
					before(grammarAccess.getStylesheetAccess().getGroup());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:76:1: ( rule__Stylesheet__Group__0 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:76:2: rule__Stylesheet__Group__0
					{
						pushFollow(FOLLOW_rule__Stylesheet__Group__0_in_ruleStylesheet94);
						rule__Stylesheet__Group__0();

						state._fsp--;


					}

					after(grammarAccess.getStylesheetAccess().getGroup());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "ruleStylesheet"


	// $ANTLR start "entryRuleContent"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:88:1: entryRuleContent : ruleContent EOF ;
	public final void entryRuleContent() throws RecognitionException {
		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:89:1: ( ruleContent EOF )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:90:1: ruleContent EOF
			{
				before(grammarAccess.getContentRule());
				pushFollow(FOLLOW_ruleContent_in_entryRuleContent121);
				ruleContent();

				state._fsp--;

				after(grammarAccess.getContentRule());
				match(input, EOF, FOLLOW_EOF_in_entryRuleContent128);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}

	// $ANTLR end "entryRuleContent"


	// $ANTLR start "ruleContent"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:97:1: ruleContent : ( ( rule__Content__Alternatives ) ) ;
	public final void ruleContent() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:101:2: ( ( ( rule__Content__Alternatives ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:102:1: ( ( rule__Content__Alternatives ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:102:1: ( ( rule__Content__Alternatives ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:103:1: ( rule__Content__Alternatives )
				{
					before(grammarAccess.getContentAccess().getAlternatives());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:104:1: ( rule__Content__Alternatives )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:104:2: rule__Content__Alternatives
					{
						pushFollow(FOLLOW_rule__Content__Alternatives_in_ruleContent154);
						rule__Content__Alternatives();

						state._fsp--;


					}

					after(grammarAccess.getContentAccess().getAlternatives());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "ruleContent"


	// $ANTLR start "entryRuleImport"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:116:1: entryRuleImport : ruleImport EOF ;
	public final void entryRuleImport() throws RecognitionException {
		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:117:1: ( ruleImport EOF )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:118:1: ruleImport EOF
			{
				before(grammarAccess.getImportRule());
				pushFollow(FOLLOW_ruleImport_in_entryRuleImport181);
				ruleImport();

				state._fsp--;

				after(grammarAccess.getImportRule());
				match(input, EOF, FOLLOW_EOF_in_entryRuleImport188);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}

	// $ANTLR end "entryRuleImport"


	// $ANTLR start "ruleImport"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:125:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
	public final void ruleImport() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:129:2: ( ( ( rule__Import__Group__0 ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:130:1: ( ( rule__Import__Group__0 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:130:1: ( ( rule__Import__Group__0 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:131:1: ( rule__Import__Group__0 )
				{
					before(grammarAccess.getImportAccess().getGroup());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:132:1: ( rule__Import__Group__0 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:132:2: rule__Import__Group__0
					{
						pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport214);
						rule__Import__Group__0();

						state._fsp--;


					}

					after(grammarAccess.getImportAccess().getGroup());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "ruleImport"


	// $ANTLR start "entryRuleMedia"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:144:1: entryRuleMedia : ruleMedia EOF ;
	public final void entryRuleMedia() throws RecognitionException {
		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:145:1: ( ruleMedia EOF )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:146:1: ruleMedia EOF
			{
				before(grammarAccess.getMediaRule());
				pushFollow(FOLLOW_ruleMedia_in_entryRuleMedia241);
				ruleMedia();

				state._fsp--;

				after(grammarAccess.getMediaRule());
				match(input, EOF, FOLLOW_EOF_in_entryRuleMedia248);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}

	// $ANTLR end "entryRuleMedia"


	// $ANTLR start "ruleMedia"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:153:1: ruleMedia : ( ( rule__Media__Group__0 ) ) ;
	public final void ruleMedia() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:157:2: ( ( ( rule__Media__Group__0 ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:158:1: ( ( rule__Media__Group__0 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:158:1: ( ( rule__Media__Group__0 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:159:1: ( rule__Media__Group__0 )
				{
					before(grammarAccess.getMediaAccess().getGroup());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:160:1: ( rule__Media__Group__0 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:160:2: rule__Media__Group__0
					{
						pushFollow(FOLLOW_rule__Media__Group__0_in_ruleMedia274);
						rule__Media__Group__0();

						state._fsp--;


					}

					after(grammarAccess.getMediaAccess().getGroup());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "ruleMedia"


	// $ANTLR start "entryRulePage"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:172:1: entryRulePage : rulePage EOF ;
	public final void entryRulePage() throws RecognitionException {
		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:173:1: ( rulePage EOF )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:174:1: rulePage EOF
			{
				before(grammarAccess.getPageRule());
				pushFollow(FOLLOW_rulePage_in_entryRulePage301);
				rulePage();

				state._fsp--;

				after(grammarAccess.getPageRule());
				match(input, EOF, FOLLOW_EOF_in_entryRulePage308);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}

	// $ANTLR end "entryRulePage"


	// $ANTLR start "rulePage"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:181:1: rulePage : ( ( rule__Page__Group__0 ) ) ;
	public final void rulePage() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:185:2: ( ( ( rule__Page__Group__0 ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:186:1: ( ( rule__Page__Group__0 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:186:1: ( ( rule__Page__Group__0 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:187:1: ( rule__Page__Group__0 )
				{
					before(grammarAccess.getPageAccess().getGroup());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:188:1: ( rule__Page__Group__0 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:188:2: rule__Page__Group__0
					{
						pushFollow(FOLLOW_rule__Page__Group__0_in_rulePage334);
						rule__Page__Group__0();

						state._fsp--;


					}

					after(grammarAccess.getPageAccess().getGroup());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rulePage"


	// $ANTLR start "entryRulePseudoPage"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:200:1: entryRulePseudoPage : rulePseudoPage EOF ;
	public final void entryRulePseudoPage() throws RecognitionException {
		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:201:1: ( rulePseudoPage EOF )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:202:1: rulePseudoPage EOF
			{
				before(grammarAccess.getPseudoPageRule());
				pushFollow(FOLLOW_rulePseudoPage_in_entryRulePseudoPage361);
				rulePseudoPage();

				state._fsp--;

				after(grammarAccess.getPseudoPageRule());
				match(input, EOF, FOLLOW_EOF_in_entryRulePseudoPage368);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}

	// $ANTLR end "entryRulePseudoPage"


	// $ANTLR start "rulePseudoPage"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:209:1: rulePseudoPage : ( ( rule__PseudoPage__Group__0 ) ) ;
	public final void rulePseudoPage() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:213:2: ( ( ( rule__PseudoPage__Group__0 ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:214:1: ( ( rule__PseudoPage__Group__0 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:214:1: ( ( rule__PseudoPage__Group__0 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:215:1: ( rule__PseudoPage__Group__0 )
				{
					before(grammarAccess.getPseudoPageAccess().getGroup());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:216:1: ( rule__PseudoPage__Group__0 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:216:2: rule__PseudoPage__Group__0
					{
						pushFollow(FOLLOW_rule__PseudoPage__Group__0_in_rulePseudoPage394);
						rule__PseudoPage__Group__0();

						state._fsp--;


					}

					after(grammarAccess.getPseudoPageAccess().getGroup());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rulePseudoPage"


	// $ANTLR start "entryRuleRuleset"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:228:1: entryRuleRuleset : ruleRuleset EOF ;
	public final void entryRuleRuleset() throws RecognitionException {
		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:229:1: ( ruleRuleset EOF )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:230:1: ruleRuleset EOF
			{
				before(grammarAccess.getRulesetRule());
				pushFollow(FOLLOW_ruleRuleset_in_entryRuleRuleset421);
				ruleRuleset();

				state._fsp--;

				after(grammarAccess.getRulesetRule());
				match(input, EOF, FOLLOW_EOF_in_entryRuleRuleset428);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}

	// $ANTLR end "entryRuleRuleset"


	// $ANTLR start "ruleRuleset"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:237:1: ruleRuleset : ( ( rule__Ruleset__Group__0 ) ) ;
	public final void ruleRuleset() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:241:2: ( ( ( rule__Ruleset__Group__0 ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:242:1: ( ( rule__Ruleset__Group__0 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:242:1: ( ( rule__Ruleset__Group__0 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:243:1: ( rule__Ruleset__Group__0 )
				{
					before(grammarAccess.getRulesetAccess().getGroup());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:244:1: ( rule__Ruleset__Group__0 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:244:2: rule__Ruleset__Group__0
					{
						pushFollow(FOLLOW_rule__Ruleset__Group__0_in_ruleRuleset454);
						rule__Ruleset__Group__0();

						state._fsp--;


					}

					after(grammarAccess.getRulesetAccess().getGroup());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "ruleRuleset"


	// $ANTLR start "entryRuleSelector"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:256:1: entryRuleSelector : ruleSelector EOF ;
	public final void entryRuleSelector() throws RecognitionException {
		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:257:1: ( ruleSelector EOF )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:258:1: ruleSelector EOF
			{
				before(grammarAccess.getSelectorRule());
				pushFollow(FOLLOW_ruleSelector_in_entryRuleSelector481);
				ruleSelector();

				state._fsp--;

				after(grammarAccess.getSelectorRule());
				match(input, EOF, FOLLOW_EOF_in_entryRuleSelector488);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}

	// $ANTLR end "entryRuleSelector"


	// $ANTLR start "ruleSelector"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:265:1: ruleSelector : ( ( rule__Selector__Alternatives ) ) ;
	public final void ruleSelector() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:269:2: ( ( ( rule__Selector__Alternatives ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:270:1: ( ( rule__Selector__Alternatives ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:270:1: ( ( rule__Selector__Alternatives ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:271:1: ( rule__Selector__Alternatives )
				{
					before(grammarAccess.getSelectorAccess().getAlternatives());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:272:1: ( rule__Selector__Alternatives )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:272:2: rule__Selector__Alternatives
					{
						pushFollow(FOLLOW_rule__Selector__Alternatives_in_ruleSelector514);
						rule__Selector__Alternatives();

						state._fsp--;


					}

					after(grammarAccess.getSelectorAccess().getAlternatives());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "ruleSelector"


	// $ANTLR start "entryRuleCompositeSelector"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:284:1: entryRuleCompositeSelector : ruleCompositeSelector EOF ;
	public final void entryRuleCompositeSelector() throws RecognitionException {
		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:285:1: ( ruleCompositeSelector EOF )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:286:1: ruleCompositeSelector EOF
			{
				before(grammarAccess.getCompositeSelectorRule());
				pushFollow(FOLLOW_ruleCompositeSelector_in_entryRuleCompositeSelector541);
				ruleCompositeSelector();

				state._fsp--;

				after(grammarAccess.getCompositeSelectorRule());
				match(input, EOF, FOLLOW_EOF_in_entryRuleCompositeSelector548);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}

	// $ANTLR end "entryRuleCompositeSelector"


	// $ANTLR start "ruleCompositeSelector"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:293:1: ruleCompositeSelector : ( ( rule__CompositeSelector__Group__0 ) ) ;
	public final void ruleCompositeSelector() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:297:2: ( ( ( rule__CompositeSelector__Group__0 ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:298:1: ( ( rule__CompositeSelector__Group__0 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:298:1: ( ( rule__CompositeSelector__Group__0 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:299:1: ( rule__CompositeSelector__Group__0 )
				{
					before(grammarAccess.getCompositeSelectorAccess().getGroup());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:300:1: ( rule__CompositeSelector__Group__0 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:300:2: rule__CompositeSelector__Group__0
					{
						pushFollow(FOLLOW_rule__CompositeSelector__Group__0_in_ruleCompositeSelector574);
						rule__CompositeSelector__Group__0();

						state._fsp--;


					}

					after(grammarAccess.getCompositeSelectorAccess().getGroup());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "ruleCompositeSelector"


	// $ANTLR start "entryRuleSimpleSelector"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:312:1: entryRuleSimpleSelector : ruleSimpleSelector EOF ;
	public final void entryRuleSimpleSelector() throws RecognitionException {
		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:313:1: ( ruleSimpleSelector EOF )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:314:1: ruleSimpleSelector EOF
			{
				before(grammarAccess.getSimpleSelectorRule());
				pushFollow(FOLLOW_ruleSimpleSelector_in_entryRuleSimpleSelector601);
				ruleSimpleSelector();

				state._fsp--;

				after(grammarAccess.getSimpleSelectorRule());
				match(input, EOF, FOLLOW_EOF_in_entryRuleSimpleSelector608);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}

	// $ANTLR end "entryRuleSimpleSelector"


	// $ANTLR start "ruleSimpleSelector"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:321:1: ruleSimpleSelector : ( ( rule__SimpleSelector__Alternatives ) ) ;
	public final void ruleSimpleSelector() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:325:2: ( ( ( rule__SimpleSelector__Alternatives ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:326:1: ( ( rule__SimpleSelector__Alternatives ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:326:1: ( ( rule__SimpleSelector__Alternatives ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:327:1: ( rule__SimpleSelector__Alternatives )
				{
					before(grammarAccess.getSimpleSelectorAccess().getAlternatives());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:328:1: ( rule__SimpleSelector__Alternatives )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:328:2: rule__SimpleSelector__Alternatives
					{
						pushFollow(FOLLOW_rule__SimpleSelector__Alternatives_in_ruleSimpleSelector634);
						rule__SimpleSelector__Alternatives();

						state._fsp--;


					}

					after(grammarAccess.getSimpleSelectorAccess().getAlternatives());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "ruleSimpleSelector"


	// $ANTLR start "entryRuleSelectorCondition"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:340:1: entryRuleSelectorCondition : ruleSelectorCondition EOF ;
	public final void entryRuleSelectorCondition() throws RecognitionException {
		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:341:1: ( ruleSelectorCondition EOF )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:342:1: ruleSelectorCondition EOF
			{
				before(grammarAccess.getSelectorConditionRule());
				pushFollow(FOLLOW_ruleSelectorCondition_in_entryRuleSelectorCondition661);
				ruleSelectorCondition();

				state._fsp--;

				after(grammarAccess.getSelectorConditionRule());
				match(input, EOF, FOLLOW_EOF_in_entryRuleSelectorCondition668);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}

	// $ANTLR end "entryRuleSelectorCondition"


	// $ANTLR start "ruleSelectorCondition"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:349:1: ruleSelectorCondition : ( ( rule__SelectorCondition__Alternatives ) ) ;
	public final void ruleSelectorCondition() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:353:2: ( ( ( rule__SelectorCondition__Alternatives ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:354:1: ( ( rule__SelectorCondition__Alternatives ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:354:1: ( ( rule__SelectorCondition__Alternatives ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:355:1: ( rule__SelectorCondition__Alternatives )
				{
					before(grammarAccess.getSelectorConditionAccess().getAlternatives());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:356:1: ( rule__SelectorCondition__Alternatives )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:356:2: rule__SelectorCondition__Alternatives
					{
						pushFollow(FOLLOW_rule__SelectorCondition__Alternatives_in_ruleSelectorCondition694);
						rule__SelectorCondition__Alternatives();

						state._fsp--;


					}

					after(grammarAccess.getSelectorConditionAccess().getAlternatives());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "ruleSelectorCondition"


	// $ANTLR start "entryRuleCombinator"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:368:1: entryRuleCombinator : ruleCombinator EOF ;
	public final void entryRuleCombinator() throws RecognitionException {
		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:369:1: ( ruleCombinator EOF )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:370:1: ruleCombinator EOF
			{
				before(grammarAccess.getCombinatorRule());
				pushFollow(FOLLOW_ruleCombinator_in_entryRuleCombinator721);
				ruleCombinator();

				state._fsp--;

				after(grammarAccess.getCombinatorRule());
				match(input, EOF, FOLLOW_EOF_in_entryRuleCombinator728);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}

	// $ANTLR end "entryRuleCombinator"


	// $ANTLR start "ruleCombinator"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:377:1: ruleCombinator : ( ( rule__Combinator__Group__0 ) ) ;
	public final void ruleCombinator() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:381:2: ( ( ( rule__Combinator__Group__0 ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:382:1: ( ( rule__Combinator__Group__0 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:382:1: ( ( rule__Combinator__Group__0 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:383:1: ( rule__Combinator__Group__0 )
				{
					before(grammarAccess.getCombinatorAccess().getGroup());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:384:1: ( rule__Combinator__Group__0 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:384:2: rule__Combinator__Group__0
					{
						pushFollow(FOLLOW_rule__Combinator__Group__0_in_ruleCombinator754);
						rule__Combinator__Group__0();

						state._fsp--;


					}

					after(grammarAccess.getCombinatorAccess().getGroup());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "ruleCombinator"


	// $ANTLR start "entryRuleDeclaration"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:396:1: entryRuleDeclaration : ruleDeclaration EOF ;
	public final void entryRuleDeclaration() throws RecognitionException {
		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:397:1: ( ruleDeclaration EOF )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:398:1: ruleDeclaration EOF
			{
				before(grammarAccess.getDeclarationRule());
				pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration781);
				ruleDeclaration();

				state._fsp--;

				after(grammarAccess.getDeclarationRule());
				match(input, EOF, FOLLOW_EOF_in_entryRuleDeclaration788);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}

	// $ANTLR end "entryRuleDeclaration"


	// $ANTLR start "ruleDeclaration"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:405:1: ruleDeclaration : ( ( rule__Declaration__Group__0 ) ) ;
	public final void ruleDeclaration() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:409:2: ( ( ( rule__Declaration__Group__0 ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:410:1: ( ( rule__Declaration__Group__0 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:410:1: ( ( rule__Declaration__Group__0 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:411:1: ( rule__Declaration__Group__0 )
				{
					before(grammarAccess.getDeclarationAccess().getGroup());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:412:1: ( rule__Declaration__Group__0 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:412:2: rule__Declaration__Group__0
					{
						pushFollow(FOLLOW_rule__Declaration__Group__0_in_ruleDeclaration814);
						rule__Declaration__Group__0();

						state._fsp--;


					}

					after(grammarAccess.getDeclarationAccess().getGroup());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "ruleDeclaration"


	// $ANTLR start "entryRuleExpression"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:424:1: entryRuleExpression : ruleExpression EOF ;
	public final void entryRuleExpression() throws RecognitionException {
		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:425:1: ( ruleExpression EOF )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:426:1: ruleExpression EOF
			{
				before(grammarAccess.getExpressionRule());
				pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression841);
				ruleExpression();

				state._fsp--;

				after(grammarAccess.getExpressionRule());
				match(input, EOF, FOLLOW_EOF_in_entryRuleExpression848);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}

	// $ANTLR end "entryRuleExpression"


	// $ANTLR start "ruleExpression"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:433:1: ruleExpression : ( ( rule__Expression__Group__0 ) ) ;
	public final void ruleExpression() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:437:2: ( ( ( rule__Expression__Group__0 ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:438:1: ( ( rule__Expression__Group__0 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:438:1: ( ( rule__Expression__Group__0 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:439:1: ( rule__Expression__Group__0 )
				{
					before(grammarAccess.getExpressionAccess().getGroup());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:440:1: ( rule__Expression__Group__0 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:440:2: rule__Expression__Group__0
					{
						pushFollow(FOLLOW_rule__Expression__Group__0_in_ruleExpression874);
						rule__Expression__Group__0();

						state._fsp--;


					}

					after(grammarAccess.getExpressionAccess().getGroup());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "ruleExpression"


	// $ANTLR start "entryRuleSubterm"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:452:1: entryRuleSubterm : ruleSubterm EOF ;
	public final void entryRuleSubterm() throws RecognitionException {
		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:453:1: ( ruleSubterm EOF )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:454:1: ruleSubterm EOF
			{
				before(grammarAccess.getSubtermRule());
				pushFollow(FOLLOW_ruleSubterm_in_entryRuleSubterm901);
				ruleSubterm();

				state._fsp--;

				after(grammarAccess.getSubtermRule());
				match(input, EOF, FOLLOW_EOF_in_entryRuleSubterm908);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}

	// $ANTLR end "entryRuleSubterm"


	// $ANTLR start "ruleSubterm"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:461:1: ruleSubterm : ( ( rule__Subterm__Group__0 ) ) ;
	public final void ruleSubterm() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:465:2: ( ( ( rule__Subterm__Group__0 ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:466:1: ( ( rule__Subterm__Group__0 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:466:1: ( ( rule__Subterm__Group__0 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:467:1: ( rule__Subterm__Group__0 )
				{
					before(grammarAccess.getSubtermAccess().getGroup());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:468:1: ( rule__Subterm__Group__0 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:468:2: rule__Subterm__Group__0
					{
						pushFollow(FOLLOW_rule__Subterm__Group__0_in_ruleSubterm934);
						rule__Subterm__Group__0();

						state._fsp--;


					}

					after(grammarAccess.getSubtermAccess().getGroup());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "ruleSubterm"


	// $ANTLR start "entryRuleTerm"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:480:1: entryRuleTerm : ruleTerm EOF ;
	public final void entryRuleTerm() throws RecognitionException {
		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:481:1: ( ruleTerm EOF )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:482:1: ruleTerm EOF
			{
				before(grammarAccess.getTermRule());
				pushFollow(FOLLOW_ruleTerm_in_entryRuleTerm961);
				ruleTerm();

				state._fsp--;

				after(grammarAccess.getTermRule());
				match(input, EOF, FOLLOW_EOF_in_entryRuleTerm968);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}

	// $ANTLR end "entryRuleTerm"


	// $ANTLR start "ruleTerm"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:489:1: ruleTerm : ( ( rule__Term__Group__0 ) ) ;
	public final void ruleTerm() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:493:2: ( ( ( rule__Term__Group__0 ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:494:1: ( ( rule__Term__Group__0 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:494:1: ( ( rule__Term__Group__0 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:495:1: ( rule__Term__Group__0 )
				{
					before(grammarAccess.getTermAccess().getGroup());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:496:1: ( rule__Term__Group__0 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:496:2: rule__Term__Group__0
					{
						pushFollow(FOLLOW_rule__Term__Group__0_in_ruleTerm994);
						rule__Term__Group__0();

						state._fsp--;


					}

					after(grammarAccess.getTermAccess().getGroup());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "ruleTerm"


	// $ANTLR start "entryRuleFunction"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:508:1: entryRuleFunction : ruleFunction EOF ;
	public final void entryRuleFunction() throws RecognitionException {
		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:509:1: ( ruleFunction EOF )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:510:1: ruleFunction EOF
			{
				before(grammarAccess.getFunctionRule());
				pushFollow(FOLLOW_ruleFunction_in_entryRuleFunction1021);
				ruleFunction();

				state._fsp--;

				after(grammarAccess.getFunctionRule());
				match(input, EOF, FOLLOW_EOF_in_entryRuleFunction1028);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}

	// $ANTLR end "entryRuleFunction"


	// $ANTLR start "ruleFunction"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:517:1: ruleFunction : ( ( rule__Function__Group__0 ) ) ;
	public final void ruleFunction() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:521:2: ( ( ( rule__Function__Group__0 ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:522:1: ( ( rule__Function__Group__0 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:522:1: ( ( rule__Function__Group__0 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:523:1: ( rule__Function__Group__0 )
				{
					before(grammarAccess.getFunctionAccess().getGroup());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:524:1: ( rule__Function__Group__0 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:524:2: rule__Function__Group__0
					{
						pushFollow(FOLLOW_rule__Function__Group__0_in_ruleFunction1054);
						rule__Function__Group__0();

						state._fsp--;


					}

					after(grammarAccess.getFunctionAccess().getGroup());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "ruleFunction"


	// $ANTLR start "entryRuleName"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:536:1: entryRuleName : ruleName EOF ;
	public final void entryRuleName() throws RecognitionException {
		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:537:1: ( ruleName EOF )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:538:1: ruleName EOF
			{
				before(grammarAccess.getNameRule());
				pushFollow(FOLLOW_ruleName_in_entryRuleName1081);
				ruleName();

				state._fsp--;

				after(grammarAccess.getNameRule());
				match(input, EOF, FOLLOW_EOF_in_entryRuleName1088);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}

	// $ANTLR end "entryRuleName"


	// $ANTLR start "ruleName"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:545:1: ruleName : ( ( rule__Name__ValueAssignment ) ) ;
	public final void ruleName() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:549:2: ( ( ( rule__Name__ValueAssignment ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:550:1: ( ( rule__Name__ValueAssignment ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:550:1: ( ( rule__Name__ValueAssignment ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:551:1: ( rule__Name__ValueAssignment )
				{
					before(grammarAccess.getNameAccess().getValueAssignment());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:552:1: ( rule__Name__ValueAssignment )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:552:2: rule__Name__ValueAssignment
					{
						pushFollow(FOLLOW_rule__Name__ValueAssignment_in_ruleName1114);
						rule__Name__ValueAssignment();

						state._fsp--;


					}

					after(grammarAccess.getNameAccess().getValueAssignment());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "ruleName"


	// $ANTLR start "entryRuleNumber"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:564:1: entryRuleNumber : ruleNumber EOF ;
	public final void entryRuleNumber() throws RecognitionException {
		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:565:1: ( ruleNumber EOF )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:566:1: ruleNumber EOF
			{
				before(grammarAccess.getNumberRule());
				pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber1141);
				ruleNumber();

				state._fsp--;

				after(grammarAccess.getNumberRule());
				match(input, EOF, FOLLOW_EOF_in_entryRuleNumber1148);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}

	// $ANTLR end "entryRuleNumber"


	// $ANTLR start "ruleNumber"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:573:1: ruleNumber : ( ( rule__Number__Group__0 ) ) ;
	public final void ruleNumber() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:577:2: ( ( ( rule__Number__Group__0 ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:578:1: ( ( rule__Number__Group__0 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:578:1: ( ( rule__Number__Group__0 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:579:1: ( rule__Number__Group__0 )
				{
					before(grammarAccess.getNumberAccess().getGroup());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:580:1: ( rule__Number__Group__0 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:580:2: rule__Number__Group__0
					{
						pushFollow(FOLLOW_rule__Number__Group__0_in_ruleNumber1174);
						rule__Number__Group__0();

						state._fsp--;


					}

					after(grammarAccess.getNumberAccess().getGroup());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "ruleNumber"


	// $ANTLR start "entryRulePercentage"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:592:1: entryRulePercentage : rulePercentage EOF ;
	public final void entryRulePercentage() throws RecognitionException {
		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:593:1: ( rulePercentage EOF )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:594:1: rulePercentage EOF
			{
				before(grammarAccess.getPercentageRule());
				pushFollow(FOLLOW_rulePercentage_in_entryRulePercentage1201);
				rulePercentage();

				state._fsp--;

				after(grammarAccess.getPercentageRule());
				match(input, EOF, FOLLOW_EOF_in_entryRulePercentage1208);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}

	// $ANTLR end "entryRulePercentage"


	// $ANTLR start "rulePercentage"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:601:1: rulePercentage : ( ( rule__Percentage__Group__0 ) ) ;
	public final void rulePercentage() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:605:2: ( ( ( rule__Percentage__Group__0 ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:606:1: ( ( rule__Percentage__Group__0 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:606:1: ( ( rule__Percentage__Group__0 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:607:1: ( rule__Percentage__Group__0 )
				{
					before(grammarAccess.getPercentageAccess().getGroup());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:608:1: ( rule__Percentage__Group__0 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:608:2: rule__Percentage__Group__0
					{
						pushFollow(FOLLOW_rule__Percentage__Group__0_in_rulePercentage1234);
						rule__Percentage__Group__0();

						state._fsp--;


					}

					after(grammarAccess.getPercentageAccess().getGroup());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rulePercentage"


	// $ANTLR start "entryRuleLength"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:620:1: entryRuleLength : ruleLength EOF ;
	public final void entryRuleLength() throws RecognitionException {
		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:621:1: ( ruleLength EOF )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:622:1: ruleLength EOF
			{
				before(grammarAccess.getLengthRule());
				pushFollow(FOLLOW_ruleLength_in_entryRuleLength1261);
				ruleLength();

				state._fsp--;

				after(grammarAccess.getLengthRule());
				match(input, EOF, FOLLOW_EOF_in_entryRuleLength1268);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}

	// $ANTLR end "entryRuleLength"


	// $ANTLR start "ruleLength"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:629:1: ruleLength : ( ( rule__Length__Group__0 ) ) ;
	public final void ruleLength() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:633:2: ( ( ( rule__Length__Group__0 ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:634:1: ( ( rule__Length__Group__0 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:634:1: ( ( rule__Length__Group__0 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:635:1: ( rule__Length__Group__0 )
				{
					before(grammarAccess.getLengthAccess().getGroup());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:636:1: ( rule__Length__Group__0 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:636:2: rule__Length__Group__0
					{
						pushFollow(FOLLOW_rule__Length__Group__0_in_ruleLength1294);
						rule__Length__Group__0();

						state._fsp--;


					}

					after(grammarAccess.getLengthAccess().getGroup());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "ruleLength"


	// $ANTLR start "entryRuleEms"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:648:1: entryRuleEms : ruleEms EOF ;
	public final void entryRuleEms() throws RecognitionException {
		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:649:1: ( ruleEms EOF )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:650:1: ruleEms EOF
			{
				before(grammarAccess.getEmsRule());
				pushFollow(FOLLOW_ruleEms_in_entryRuleEms1321);
				ruleEms();

				state._fsp--;

				after(grammarAccess.getEmsRule());
				match(input, EOF, FOLLOW_EOF_in_entryRuleEms1328);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}

	// $ANTLR end "entryRuleEms"


	// $ANTLR start "ruleEms"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:657:1: ruleEms : ( ( rule__Ems__Group__0 ) ) ;
	public final void ruleEms() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:661:2: ( ( ( rule__Ems__Group__0 ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:662:1: ( ( rule__Ems__Group__0 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:662:1: ( ( rule__Ems__Group__0 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:663:1: ( rule__Ems__Group__0 )
				{
					before(grammarAccess.getEmsAccess().getGroup());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:664:1: ( rule__Ems__Group__0 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:664:2: rule__Ems__Group__0
					{
						pushFollow(FOLLOW_rule__Ems__Group__0_in_ruleEms1354);
						rule__Ems__Group__0();

						state._fsp--;


					}

					after(grammarAccess.getEmsAccess().getGroup());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "ruleEms"


	// $ANTLR start "entryRuleExs"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:676:1: entryRuleExs : ruleExs EOF ;
	public final void entryRuleExs() throws RecognitionException {
		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:677:1: ( ruleExs EOF )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:678:1: ruleExs EOF
			{
				before(grammarAccess.getExsRule());
				pushFollow(FOLLOW_ruleExs_in_entryRuleExs1381);
				ruleExs();

				state._fsp--;

				after(grammarAccess.getExsRule());
				match(input, EOF, FOLLOW_EOF_in_entryRuleExs1388);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}

	// $ANTLR end "entryRuleExs"


	// $ANTLR start "ruleExs"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:685:1: ruleExs : ( ( rule__Exs__Group__0 ) ) ;
	public final void ruleExs() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:689:2: ( ( ( rule__Exs__Group__0 ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:690:1: ( ( rule__Exs__Group__0 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:690:1: ( ( rule__Exs__Group__0 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:691:1: ( rule__Exs__Group__0 )
				{
					before(grammarAccess.getExsAccess().getGroup());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:692:1: ( rule__Exs__Group__0 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:692:2: rule__Exs__Group__0
					{
						pushFollow(FOLLOW_rule__Exs__Group__0_in_ruleExs1414);
						rule__Exs__Group__0();

						state._fsp--;


					}

					after(grammarAccess.getExsAccess().getGroup());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "ruleExs"


	// $ANTLR start "entryRuleAngle"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:704:1: entryRuleAngle : ruleAngle EOF ;
	public final void entryRuleAngle() throws RecognitionException {
		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:705:1: ( ruleAngle EOF )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:706:1: ruleAngle EOF
			{
				before(grammarAccess.getAngleRule());
				pushFollow(FOLLOW_ruleAngle_in_entryRuleAngle1441);
				ruleAngle();

				state._fsp--;

				after(grammarAccess.getAngleRule());
				match(input, EOF, FOLLOW_EOF_in_entryRuleAngle1448);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}

	// $ANTLR end "entryRuleAngle"


	// $ANTLR start "ruleAngle"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:713:1: ruleAngle : ( ( rule__Angle__Group__0 ) ) ;
	public final void ruleAngle() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:717:2: ( ( ( rule__Angle__Group__0 ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:718:1: ( ( rule__Angle__Group__0 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:718:1: ( ( rule__Angle__Group__0 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:719:1: ( rule__Angle__Group__0 )
				{
					before(grammarAccess.getAngleAccess().getGroup());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:720:1: ( rule__Angle__Group__0 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:720:2: rule__Angle__Group__0
					{
						pushFollow(FOLLOW_rule__Angle__Group__0_in_ruleAngle1474);
						rule__Angle__Group__0();

						state._fsp--;


					}

					after(grammarAccess.getAngleAccess().getGroup());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "ruleAngle"


	// $ANTLR start "entryRuleTime"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:732:1: entryRuleTime : ruleTime EOF ;
	public final void entryRuleTime() throws RecognitionException {
		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:733:1: ( ruleTime EOF )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:734:1: ruleTime EOF
			{
				before(grammarAccess.getTimeRule());
				pushFollow(FOLLOW_ruleTime_in_entryRuleTime1501);
				ruleTime();

				state._fsp--;

				after(grammarAccess.getTimeRule());
				match(input, EOF, FOLLOW_EOF_in_entryRuleTime1508);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}

	// $ANTLR end "entryRuleTime"


	// $ANTLR start "ruleTime"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:741:1: ruleTime : ( ( rule__Time__Group__0 ) ) ;
	public final void ruleTime() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:745:2: ( ( ( rule__Time__Group__0 ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:746:1: ( ( rule__Time__Group__0 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:746:1: ( ( rule__Time__Group__0 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:747:1: ( rule__Time__Group__0 )
				{
					before(grammarAccess.getTimeAccess().getGroup());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:748:1: ( rule__Time__Group__0 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:748:2: rule__Time__Group__0
					{
						pushFollow(FOLLOW_rule__Time__Group__0_in_ruleTime1534);
						rule__Time__Group__0();

						state._fsp--;


					}

					after(grammarAccess.getTimeAccess().getGroup());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "ruleTime"


	// $ANTLR start "entryRuleFrequency"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:760:1: entryRuleFrequency : ruleFrequency EOF ;
	public final void entryRuleFrequency() throws RecognitionException {
		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:761:1: ( ruleFrequency EOF )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:762:1: ruleFrequency EOF
			{
				before(grammarAccess.getFrequencyRule());
				pushFollow(FOLLOW_ruleFrequency_in_entryRuleFrequency1561);
				ruleFrequency();

				state._fsp--;

				after(grammarAccess.getFrequencyRule());
				match(input, EOF, FOLLOW_EOF_in_entryRuleFrequency1568);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}

	// $ANTLR end "entryRuleFrequency"


	// $ANTLR start "ruleFrequency"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:769:1: ruleFrequency : ( ( rule__Frequency__Group__0 ) ) ;
	public final void ruleFrequency() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:773:2: ( ( ( rule__Frequency__Group__0 ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:774:1: ( ( rule__Frequency__Group__0 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:774:1: ( ( rule__Frequency__Group__0 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:775:1: ( rule__Frequency__Group__0 )
				{
					before(grammarAccess.getFrequencyAccess().getGroup());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:776:1: ( rule__Frequency__Group__0 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:776:2: rule__Frequency__Group__0
					{
						pushFollow(FOLLOW_rule__Frequency__Group__0_in_ruleFrequency1594);
						rule__Frequency__Group__0();

						state._fsp--;


					}

					after(grammarAccess.getFrequencyAccess().getGroup());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "ruleFrequency"


	// $ANTLR start "entryRuleUri"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:788:1: entryRuleUri : ruleUri EOF ;
	public final void entryRuleUri() throws RecognitionException {
		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:789:1: ( ruleUri EOF )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:790:1: ruleUri EOF
			{
				before(grammarAccess.getUriRule());
				pushFollow(FOLLOW_ruleUri_in_entryRuleUri1621);
				ruleUri();

				state._fsp--;

				after(grammarAccess.getUriRule());
				match(input, EOF, FOLLOW_EOF_in_entryRuleUri1628);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}

	// $ANTLR end "entryRuleUri"


	// $ANTLR start "ruleUri"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:797:1: ruleUri : ( ( rule__Uri__Group__0 ) ) ;
	public final void ruleUri() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:801:2: ( ( ( rule__Uri__Group__0 ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:802:1: ( ( rule__Uri__Group__0 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:802:1: ( ( rule__Uri__Group__0 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:803:1: ( rule__Uri__Group__0 )
				{
					before(grammarAccess.getUriAccess().getGroup());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:804:1: ( rule__Uri__Group__0 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:804:2: rule__Uri__Group__0
					{
						pushFollow(FOLLOW_rule__Uri__Group__0_in_ruleUri1654);
						rule__Uri__Group__0();

						state._fsp--;


					}

					after(grammarAccess.getUriAccess().getGroup());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "ruleUri"


	// $ANTLR start "entryRuleStringValue"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:816:1: entryRuleStringValue : ruleStringValue EOF ;
	public final void entryRuleStringValue() throws RecognitionException {
		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:817:1: ( ruleStringValue EOF )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:818:1: ruleStringValue EOF
			{
				before(grammarAccess.getStringValueRule());
				pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue1681);
				ruleStringValue();

				state._fsp--;

				after(grammarAccess.getStringValueRule());
				match(input, EOF, FOLLOW_EOF_in_entryRuleStringValue1688);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}

	// $ANTLR end "entryRuleStringValue"


	// $ANTLR start "ruleStringValue"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:825:1: ruleStringValue : ( ( rule__StringValue__ValueAssignment ) ) ;
	public final void ruleStringValue() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:829:2: ( ( ( rule__StringValue__ValueAssignment ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:830:1: ( ( rule__StringValue__ValueAssignment ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:830:1: ( ( rule__StringValue__ValueAssignment ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:831:1: ( rule__StringValue__ValueAssignment )
				{
					before(grammarAccess.getStringValueAccess().getValueAssignment());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:832:1: ( rule__StringValue__ValueAssignment )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:832:2: rule__StringValue__ValueAssignment
					{
						pushFollow(FOLLOW_rule__StringValue__ValueAssignment_in_ruleStringValue1714);
						rule__StringValue__ValueAssignment();

						state._fsp--;


					}

					after(grammarAccess.getStringValueAccess().getValueAssignment());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "ruleStringValue"


	// $ANTLR start "entryRuleHexColor"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:844:1: entryRuleHexColor : ruleHexColor EOF ;
	public final void entryRuleHexColor() throws RecognitionException {
		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:845:1: ( ruleHexColor EOF )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:846:1: ruleHexColor EOF
			{
				before(grammarAccess.getHexColorRule());
				pushFollow(FOLLOW_ruleHexColor_in_entryRuleHexColor1741);
				ruleHexColor();

				state._fsp--;

				after(grammarAccess.getHexColorRule());
				match(input, EOF, FOLLOW_EOF_in_entryRuleHexColor1748);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}

	// $ANTLR end "entryRuleHexColor"


	// $ANTLR start "ruleHexColor"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:853:1: ruleHexColor : ( ( rule__HexColor__ValueAssignment ) ) ;
	public final void ruleHexColor() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:857:2: ( ( ( rule__HexColor__ValueAssignment ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:858:1: ( ( rule__HexColor__ValueAssignment ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:858:1: ( ( rule__HexColor__ValueAssignment ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:859:1: ( rule__HexColor__ValueAssignment )
				{
					before(grammarAccess.getHexColorAccess().getValueAssignment());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:860:1: ( rule__HexColor__ValueAssignment )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:860:2: rule__HexColor__ValueAssignment
					{
						pushFollow(FOLLOW_rule__HexColor__ValueAssignment_in_ruleHexColor1774);
						rule__HexColor__ValueAssignment();

						state._fsp--;


					}

					after(grammarAccess.getHexColorAccess().getValueAssignment());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "ruleHexColor"


	// $ANTLR start "entryRuleOperator"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:872:1: entryRuleOperator : ruleOperator EOF ;
	public final void entryRuleOperator() throws RecognitionException {
		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:873:1: ( ruleOperator EOF )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:874:1: ruleOperator EOF
			{
				before(grammarAccess.getOperatorRule());
				pushFollow(FOLLOW_ruleOperator_in_entryRuleOperator1801);
				ruleOperator();

				state._fsp--;

				after(grammarAccess.getOperatorRule());
				match(input, EOF, FOLLOW_EOF_in_entryRuleOperator1808);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}

	// $ANTLR end "entryRuleOperator"


	// $ANTLR start "ruleOperator"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:881:1: ruleOperator : ( ( rule__Operator__Alternatives ) ) ;
	public final void ruleOperator() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:885:2: ( ( ( rule__Operator__Alternatives ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:886:1: ( ( rule__Operator__Alternatives ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:886:1: ( ( rule__Operator__Alternatives ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:887:1: ( rule__Operator__Alternatives )
				{
					before(grammarAccess.getOperatorAccess().getAlternatives());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:888:1: ( rule__Operator__Alternatives )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:888:2: rule__Operator__Alternatives
					{
						pushFollow(FOLLOW_rule__Operator__Alternatives_in_ruleOperator1834);
						rule__Operator__Alternatives();

						state._fsp--;


					}

					after(grammarAccess.getOperatorAccess().getAlternatives());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "ruleOperator"


	// $ANTLR start "entryRuleClass"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:900:1: entryRuleClass : ruleClass EOF ;
	public final void entryRuleClass() throws RecognitionException {
		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:901:1: ( ruleClass EOF )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:902:1: ruleClass EOF
			{
				before(grammarAccess.getClassRule());
				pushFollow(FOLLOW_ruleClass_in_entryRuleClass1861);
				ruleClass();

				state._fsp--;

				after(grammarAccess.getClassRule());
				match(input, EOF, FOLLOW_EOF_in_entryRuleClass1868);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}

	// $ANTLR end "entryRuleClass"


	// $ANTLR start "ruleClass"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:909:1: ruleClass : ( ( rule__Class__ClassAssignment ) ) ;
	public final void ruleClass() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:913:2: ( ( ( rule__Class__ClassAssignment ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:914:1: ( ( rule__Class__ClassAssignment ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:914:1: ( ( rule__Class__ClassAssignment ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:915:1: ( rule__Class__ClassAssignment )
				{
					before(grammarAccess.getClassAccess().getClassAssignment());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:916:1: ( rule__Class__ClassAssignment )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:916:2: rule__Class__ClassAssignment
					{
						pushFollow(FOLLOW_rule__Class__ClassAssignment_in_ruleClass1894);
						rule__Class__ClassAssignment();

						state._fsp--;


					}

					after(grammarAccess.getClassAccess().getClassAssignment());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "ruleClass"


	// $ANTLR start "entryRuleAttribute"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:928:1: entryRuleAttribute : ruleAttribute EOF ;
	public final void entryRuleAttribute() throws RecognitionException {
		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:929:1: ( ruleAttribute EOF )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:930:1: ruleAttribute EOF
			{
				before(grammarAccess.getAttributeRule());
				pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute1921);
				ruleAttribute();

				state._fsp--;

				after(grammarAccess.getAttributeRule());
				match(input, EOF, FOLLOW_EOF_in_entryRuleAttribute1928);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}

	// $ANTLR end "entryRuleAttribute"


	// $ANTLR start "ruleAttribute"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:937:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
	public final void ruleAttribute() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:941:2: ( ( ( rule__Attribute__Group__0 ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:942:1: ( ( rule__Attribute__Group__0 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:942:1: ( ( rule__Attribute__Group__0 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:943:1: ( rule__Attribute__Group__0 )
				{
					before(grammarAccess.getAttributeAccess().getGroup());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:944:1: ( rule__Attribute__Group__0 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:944:2: rule__Attribute__Group__0
					{
						pushFollow(FOLLOW_rule__Attribute__Group__0_in_ruleAttribute1954);
						rule__Attribute__Group__0();

						state._fsp--;


					}

					after(grammarAccess.getAttributeAccess().getGroup());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "ruleAttribute"


	// $ANTLR start "entryRuleAttributeValue"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:956:1: entryRuleAttributeValue : ruleAttributeValue EOF ;
	public final void entryRuleAttributeValue() throws RecognitionException {
		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:957:1: ( ruleAttributeValue EOF )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:958:1: ruleAttributeValue EOF
			{
				before(grammarAccess.getAttributeValueRule());
				pushFollow(FOLLOW_ruleAttributeValue_in_entryRuleAttributeValue1981);
				ruleAttributeValue();

				state._fsp--;

				after(grammarAccess.getAttributeValueRule());
				match(input, EOF, FOLLOW_EOF_in_entryRuleAttributeValue1988);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}

	// $ANTLR end "entryRuleAttributeValue"


	// $ANTLR start "ruleAttributeValue"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:965:1: ruleAttributeValue : ( ( rule__AttributeValue__Group__0 ) ) ;
	public final void ruleAttributeValue() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:969:2: ( ( ( rule__AttributeValue__Group__0 ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:970:1: ( ( rule__AttributeValue__Group__0 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:970:1: ( ( rule__AttributeValue__Group__0 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:971:1: ( rule__AttributeValue__Group__0 )
				{
					before(grammarAccess.getAttributeValueAccess().getGroup());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:972:1: ( rule__AttributeValue__Group__0 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:972:2: rule__AttributeValue__Group__0
					{
						pushFollow(FOLLOW_rule__AttributeValue__Group__0_in_ruleAttributeValue2014);
						rule__AttributeValue__Group__0();

						state._fsp--;


					}

					after(grammarAccess.getAttributeValueAccess().getGroup());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "ruleAttributeValue"


	// $ANTLR start "entryRulePseudo"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:984:1: entryRulePseudo : rulePseudo EOF ;
	public final void entryRulePseudo() throws RecognitionException {
		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:985:1: ( rulePseudo EOF )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:986:1: rulePseudo EOF
			{
				before(grammarAccess.getPseudoRule());
				pushFollow(FOLLOW_rulePseudo_in_entryRulePseudo2041);
				rulePseudo();

				state._fsp--;

				after(grammarAccess.getPseudoRule());
				match(input, EOF, FOLLOW_EOF_in_entryRulePseudo2048);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}

	// $ANTLR end "entryRulePseudo"


	// $ANTLR start "rulePseudo"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:993:1: rulePseudo : ( ( rule__Pseudo__Group__0 ) ) ;
	public final void rulePseudo() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:997:2: ( ( ( rule__Pseudo__Group__0 ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:998:1: ( ( rule__Pseudo__Group__0 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:998:1: ( ( rule__Pseudo__Group__0 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:999:1: ( rule__Pseudo__Group__0 )
				{
					before(grammarAccess.getPseudoAccess().getGroup());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1000:1: ( rule__Pseudo__Group__0 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1000:2: rule__Pseudo__Group__0
					{
						pushFollow(FOLLOW_rule__Pseudo__Group__0_in_rulePseudo2074);
						rule__Pseudo__Group__0();

						state._fsp--;


					}

					after(grammarAccess.getPseudoAccess().getGroup());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rulePseudo"


	// $ANTLR start "entryRuleCSSId"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1012:1: entryRuleCSSId : ruleCSSId EOF ;
	public final void entryRuleCSSId() throws RecognitionException {
		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1013:1: ( ruleCSSId EOF )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1014:1: ruleCSSId EOF
			{
				before(grammarAccess.getCSSIdRule());
				pushFollow(FOLLOW_ruleCSSId_in_entryRuleCSSId2101);
				ruleCSSId();

				state._fsp--;

				after(grammarAccess.getCSSIdRule());
				match(input, EOF, FOLLOW_EOF_in_entryRuleCSSId2108);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}

	// $ANTLR end "entryRuleCSSId"


	// $ANTLR start "ruleCSSId"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1021:1: ruleCSSId : ( ( rule__CSSId__ValueAssignment ) ) ;
	public final void ruleCSSId() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1025:2: ( ( ( rule__CSSId__ValueAssignment ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1026:1: ( ( rule__CSSId__ValueAssignment ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1026:1: ( ( rule__CSSId__ValueAssignment ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1027:1: ( rule__CSSId__ValueAssignment )
				{
					before(grammarAccess.getCSSIdAccess().getValueAssignment());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1028:1: ( rule__CSSId__ValueAssignment )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1028:2: rule__CSSId__ValueAssignment
					{
						pushFollow(FOLLOW_rule__CSSId__ValueAssignment_in_ruleCSSId2134);
						rule__CSSId__ValueAssignment();

						state._fsp--;


					}

					after(grammarAccess.getCSSIdAccess().getValueAssignment());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "ruleCSSId"


	// $ANTLR start "entryRuleUnaryOperator"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1040:1: entryRuleUnaryOperator : ruleUnaryOperator EOF ;
	public final void entryRuleUnaryOperator() throws RecognitionException {
		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1041:1: ( ruleUnaryOperator EOF )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1042:1: ruleUnaryOperator EOF
			{
				before(grammarAccess.getUnaryOperatorRule());
				pushFollow(FOLLOW_ruleUnaryOperator_in_entryRuleUnaryOperator2161);
				ruleUnaryOperator();

				state._fsp--;

				after(grammarAccess.getUnaryOperatorRule());
				match(input, EOF, FOLLOW_EOF_in_entryRuleUnaryOperator2168);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}

	// $ANTLR end "entryRuleUnaryOperator"


	// $ANTLR start "ruleUnaryOperator"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1049:1: ruleUnaryOperator : ( ( rule__UnaryOperator__OperatorAssignment ) ) ;
	public final void ruleUnaryOperator() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1053:2: ( ( ( rule__UnaryOperator__OperatorAssignment ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1054:1: ( ( rule__UnaryOperator__OperatorAssignment ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1054:1: ( ( rule__UnaryOperator__OperatorAssignment ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1055:1: ( rule__UnaryOperator__OperatorAssignment )
				{
					before(grammarAccess.getUnaryOperatorAccess().getOperatorAssignment());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1056:1: ( rule__UnaryOperator__OperatorAssignment )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1056:2: rule__UnaryOperator__OperatorAssignment
					{
						pushFollow(FOLLOW_rule__UnaryOperator__OperatorAssignment_in_ruleUnaryOperator2194);
						rule__UnaryOperator__OperatorAssignment();

						state._fsp--;


					}

					after(grammarAccess.getUnaryOperatorAccess().getOperatorAssignment());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "ruleUnaryOperator"


	// $ANTLR start "ruleUNARY"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1069:1: ruleUNARY : ( ( rule__UNARY__Alternatives ) ) ;
	public final void ruleUNARY() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1073:1: ( ( ( rule__UNARY__Alternatives ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1074:1: ( ( rule__UNARY__Alternatives ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1074:1: ( ( rule__UNARY__Alternatives ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1075:1: ( rule__UNARY__Alternatives )
				{
					before(grammarAccess.getUNARYAccess().getAlternatives());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1076:1: ( rule__UNARY__Alternatives )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1076:2: rule__UNARY__Alternatives
					{
						pushFollow(FOLLOW_rule__UNARY__Alternatives_in_ruleUNARY2231);
						rule__UNARY__Alternatives();

						state._fsp--;


					}

					after(grammarAccess.getUNARYAccess().getAlternatives());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "ruleUNARY"


	// $ANTLR start "ruleKIND"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1088:1: ruleKIND : ( ( rule__KIND__Alternatives ) ) ;
	public final void ruleKIND() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1092:1: ( ( ( rule__KIND__Alternatives ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1093:1: ( ( rule__KIND__Alternatives ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1093:1: ( ( rule__KIND__Alternatives ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1094:1: ( rule__KIND__Alternatives )
				{
					before(grammarAccess.getKINDAccess().getAlternatives());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1095:1: ( rule__KIND__Alternatives )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1095:2: rule__KIND__Alternatives
					{
						pushFollow(FOLLOW_rule__KIND__Alternatives_in_ruleKIND2267);
						rule__KIND__Alternatives();

						state._fsp--;


					}

					after(grammarAccess.getKINDAccess().getAlternatives());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "ruleKIND"


	// $ANTLR start "ruleATTRIBUTE_OP"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1107:1: ruleATTRIBUTE_OP : ( ( rule__ATTRIBUTE_OP__Alternatives ) ) ;
	public final void ruleATTRIBUTE_OP() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1111:1: ( ( ( rule__ATTRIBUTE_OP__Alternatives ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1112:1: ( ( rule__ATTRIBUTE_OP__Alternatives ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1112:1: ( ( rule__ATTRIBUTE_OP__Alternatives ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1113:1: ( rule__ATTRIBUTE_OP__Alternatives )
				{
					before(grammarAccess.getATTRIBUTE_OPAccess().getAlternatives());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1114:1: ( rule__ATTRIBUTE_OP__Alternatives )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1114:2: rule__ATTRIBUTE_OP__Alternatives
					{
						pushFollow(FOLLOW_rule__ATTRIBUTE_OP__Alternatives_in_ruleATTRIBUTE_OP2303);
						rule__ATTRIBUTE_OP__Alternatives();

						state._fsp--;


					}

					after(grammarAccess.getATTRIBUTE_OPAccess().getAlternatives());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "ruleATTRIBUTE_OP"


	// $ANTLR start "rule__Stylesheet__Alternatives_1"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1125:1: rule__Stylesheet__Alternatives_1 : ( ( RULE_WS ) | ( RULE_CDO ) | ( RULE_CDC ) );
	public final void rule__Stylesheet__Alternatives_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1129:1: ( ( RULE_WS ) | ( RULE_CDO ) | ( RULE_CDC ) )
			int alt1 = 3;
			switch (input.LA(1)) {
			case RULE_WS: {
				alt1 = 1;
			}
				break;
			case RULE_CDO: {
				alt1 = 2;
			}
				break;
			case RULE_CDC: {
				alt1 = 3;
			}
				break;
			default:
				NoViableAltException nvae =
						new NoViableAltException("", 1, 0, input);

				throw nvae;
			}

			switch (alt1) {
			case 1:
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1130:1: ( RULE_WS )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1130:1: ( RULE_WS )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1131:1: RULE_WS
				{
					before(grammarAccess.getStylesheetAccess().getWSTerminalRuleCall_1_0());
					match(input, RULE_WS, FOLLOW_RULE_WS_in_rule__Stylesheet__Alternatives_12338);
					after(grammarAccess.getStylesheetAccess().getWSTerminalRuleCall_1_0());

				}


			}
				break;
			case 2:
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1136:6: ( RULE_CDO )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1136:6: ( RULE_CDO )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1137:1: RULE_CDO
				{
					before(grammarAccess.getStylesheetAccess().getCDOTerminalRuleCall_1_1());
					match(input, RULE_CDO, FOLLOW_RULE_CDO_in_rule__Stylesheet__Alternatives_12355);
					after(grammarAccess.getStylesheetAccess().getCDOTerminalRuleCall_1_1());

				}


			}
				break;
			case 3:
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1142:6: ( RULE_CDC )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1142:6: ( RULE_CDC )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1143:1: RULE_CDC
				{
					before(grammarAccess.getStylesheetAccess().getCDCTerminalRuleCall_1_2());
					match(input, RULE_CDC, FOLLOW_RULE_CDC_in_rule__Stylesheet__Alternatives_12372);
					after(grammarAccess.getStylesheetAccess().getCDCTerminalRuleCall_1_2());

				}


			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Stylesheet__Alternatives_1"


	// $ANTLR start "rule__Stylesheet__Alternatives_2_1"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1153:1: rule__Stylesheet__Alternatives_2_1 : ( ( ( rule__Stylesheet__Group_2_1_0__0 ) ) | ( (
	// rule__Stylesheet__Group_2_1_1__0 ) ) );
	public final void rule__Stylesheet__Alternatives_2_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1157:1: ( ( ( rule__Stylesheet__Group_2_1_0__0 ) ) | ( ( rule__Stylesheet__Group_2_1_1__0 ) ) )
			int alt2 = 2;
			int LA2_0 = input.LA(1);

			if ((LA2_0 == RULE_CDO)) {
				alt2 = 1;
			}
			else if ((LA2_0 == RULE_CDC)) {
				alt2 = 2;
			}
			else {
				NoViableAltException nvae =
						new NoViableAltException("", 2, 0, input);

				throw nvae;
			}
			switch (alt2) {
			case 1:
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1158:1: ( ( rule__Stylesheet__Group_2_1_0__0 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1158:1: ( ( rule__Stylesheet__Group_2_1_0__0 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1159:1: ( rule__Stylesheet__Group_2_1_0__0 )
				{
					before(grammarAccess.getStylesheetAccess().getGroup_2_1_0());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1160:1: ( rule__Stylesheet__Group_2_1_0__0 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1160:2: rule__Stylesheet__Group_2_1_0__0
					{
						pushFollow(FOLLOW_rule__Stylesheet__Group_2_1_0__0_in_rule__Stylesheet__Alternatives_2_12404);
						rule__Stylesheet__Group_2_1_0__0();

						state._fsp--;


					}

					after(grammarAccess.getStylesheetAccess().getGroup_2_1_0());

				}


			}
				break;
			case 2:
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1164:6: ( ( rule__Stylesheet__Group_2_1_1__0 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1164:6: ( ( rule__Stylesheet__Group_2_1_1__0 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1165:1: ( rule__Stylesheet__Group_2_1_1__0 )
				{
					before(grammarAccess.getStylesheetAccess().getGroup_2_1_1());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1166:1: ( rule__Stylesheet__Group_2_1_1__0 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1166:2: rule__Stylesheet__Group_2_1_1__0
					{
						pushFollow(FOLLOW_rule__Stylesheet__Group_2_1_1__0_in_rule__Stylesheet__Alternatives_2_12422);
						rule__Stylesheet__Group_2_1_1__0();

						state._fsp--;


					}

					after(grammarAccess.getStylesheetAccess().getGroup_2_1_1());

				}


			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Stylesheet__Alternatives_2_1"


	// $ANTLR start "rule__Stylesheet__Alternatives_3_1"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1175:1: rule__Stylesheet__Alternatives_3_1 : ( ( ( rule__Stylesheet__Group_3_1_0__0 ) ) | ( (
	// rule__Stylesheet__Group_3_1_1__0 ) ) );
	public final void rule__Stylesheet__Alternatives_3_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1179:1: ( ( ( rule__Stylesheet__Group_3_1_0__0 ) ) | ( ( rule__Stylesheet__Group_3_1_1__0 ) ) )
			int alt3 = 2;
			int LA3_0 = input.LA(1);

			if ((LA3_0 == RULE_CDO)) {
				alt3 = 1;
			}
			else if ((LA3_0 == RULE_CDC)) {
				alt3 = 2;
			}
			else {
				NoViableAltException nvae =
						new NoViableAltException("", 3, 0, input);

				throw nvae;
			}
			switch (alt3) {
			case 1:
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1180:1: ( ( rule__Stylesheet__Group_3_1_0__0 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1180:1: ( ( rule__Stylesheet__Group_3_1_0__0 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1181:1: ( rule__Stylesheet__Group_3_1_0__0 )
				{
					before(grammarAccess.getStylesheetAccess().getGroup_3_1_0());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1182:1: ( rule__Stylesheet__Group_3_1_0__0 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1182:2: rule__Stylesheet__Group_3_1_0__0
					{
						pushFollow(FOLLOW_rule__Stylesheet__Group_3_1_0__0_in_rule__Stylesheet__Alternatives_3_12455);
						rule__Stylesheet__Group_3_1_0__0();

						state._fsp--;


					}

					after(grammarAccess.getStylesheetAccess().getGroup_3_1_0());

				}


			}
				break;
			case 2:
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1186:6: ( ( rule__Stylesheet__Group_3_1_1__0 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1186:6: ( ( rule__Stylesheet__Group_3_1_1__0 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1187:1: ( rule__Stylesheet__Group_3_1_1__0 )
				{
					before(grammarAccess.getStylesheetAccess().getGroup_3_1_1());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1188:1: ( rule__Stylesheet__Group_3_1_1__0 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1188:2: rule__Stylesheet__Group_3_1_1__0
					{
						pushFollow(FOLLOW_rule__Stylesheet__Group_3_1_1__0_in_rule__Stylesheet__Alternatives_3_12473);
						rule__Stylesheet__Group_3_1_1__0();

						state._fsp--;


					}

					after(grammarAccess.getStylesheetAccess().getGroup_3_1_1());

				}


			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Stylesheet__Alternatives_3_1"


	// $ANTLR start "rule__Content__Alternatives"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1197:1: rule__Content__Alternatives : ( ( ruleRuleset ) | ( ruleMedia ) | ( rulePage ) );
	public final void rule__Content__Alternatives() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1201:1: ( ( ruleRuleset ) | ( ruleMedia ) | ( rulePage ) )
			int alt4 = 3;
			switch (input.LA(1)) {
			case RULE_ID:
			case RULE_HASH:
			case RULE_T_CLASS:
			case 22:
			case 37:
			case 42: {
				alt4 = 1;
			}
				break;
			case 33: {
				alt4 = 2;
			}
				break;
			case 36: {
				alt4 = 3;
			}
				break;
			default:
				NoViableAltException nvae =
						new NoViableAltException("", 4, 0, input);

				throw nvae;
			}

			switch (alt4) {
			case 1:
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1202:1: ( ruleRuleset )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1202:1: ( ruleRuleset )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1203:1: ruleRuleset
				{
					before(grammarAccess.getContentAccess().getRulesetParserRuleCall_0());
					pushFollow(FOLLOW_ruleRuleset_in_rule__Content__Alternatives2506);
					ruleRuleset();

					state._fsp--;

					after(grammarAccess.getContentAccess().getRulesetParserRuleCall_0());

				}


			}
				break;
			case 2:
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1208:6: ( ruleMedia )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1208:6: ( ruleMedia )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1209:1: ruleMedia
				{
					before(grammarAccess.getContentAccess().getMediaParserRuleCall_1());
					pushFollow(FOLLOW_ruleMedia_in_rule__Content__Alternatives2523);
					ruleMedia();

					state._fsp--;

					after(grammarAccess.getContentAccess().getMediaParserRuleCall_1());

				}


			}
				break;
			case 3:
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1214:6: ( rulePage )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1214:6: ( rulePage )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1215:1: rulePage
				{
					before(grammarAccess.getContentAccess().getPageParserRuleCall_2());
					pushFollow(FOLLOW_rulePage_in_rule__Content__Alternatives2540);
					rulePage();

					state._fsp--;

					after(grammarAccess.getContentAccess().getPageParserRuleCall_2());

				}


			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Content__Alternatives"


	// $ANTLR start "rule__Import__Alternatives_1"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1225:1: rule__Import__Alternatives_1 : ( ( ( rule__Import__Group_1_0__0 ) ) | ( ( rule__Import__Group_1_1__0 ) ) );
	public final void rule__Import__Alternatives_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1229:1: ( ( ( rule__Import__Group_1_0__0 ) ) | ( ( rule__Import__Group_1_1__0 ) ) )
			int alt5 = 2;
			int LA5_0 = input.LA(1);

			if ((LA5_0 == RULE_WS)) {
				int LA5_1 = input.LA(2);

				if ((LA5_1 == 40)) {
					alt5 = 2;
				}
				else if ((LA5_1 == RULE_WS || LA5_1 == RULE_STRING)) {
					alt5 = 1;
				}
				else {
					NoViableAltException nvae =
							new NoViableAltException("", 5, 1, input);

					throw nvae;
				}
			}
			else if ((LA5_0 == RULE_STRING)) {
				alt5 = 1;
			}
			else {
				NoViableAltException nvae =
						new NoViableAltException("", 5, 0, input);

				throw nvae;
			}
			switch (alt5) {
			case 1:
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1230:1: ( ( rule__Import__Group_1_0__0 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1230:1: ( ( rule__Import__Group_1_0__0 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1231:1: ( rule__Import__Group_1_0__0 )
				{
					before(grammarAccess.getImportAccess().getGroup_1_0());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1232:1: ( rule__Import__Group_1_0__0 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1232:2: rule__Import__Group_1_0__0
					{
						pushFollow(FOLLOW_rule__Import__Group_1_0__0_in_rule__Import__Alternatives_12572);
						rule__Import__Group_1_0__0();

						state._fsp--;


					}

					after(grammarAccess.getImportAccess().getGroup_1_0());

				}


			}
				break;
			case 2:
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1236:6: ( ( rule__Import__Group_1_1__0 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1236:6: ( ( rule__Import__Group_1_1__0 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1237:1: ( rule__Import__Group_1_1__0 )
				{
					before(grammarAccess.getImportAccess().getGroup_1_1());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1238:1: ( rule__Import__Group_1_1__0 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1238:2: rule__Import__Group_1_1__0
					{
						pushFollow(FOLLOW_rule__Import__Group_1_1__0_in_rule__Import__Alternatives_12590);
						rule__Import__Group_1_1__0();

						state._fsp--;


					}

					after(grammarAccess.getImportAccess().getGroup_1_1());

				}


			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Import__Alternatives_1"


	// $ANTLR start "rule__Selector__Alternatives"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1247:1: rule__Selector__Alternatives : ( ( ( rule__Selector__Group_0__0 ) ) | ( ruleCompositeSelector ) );
	public final void rule__Selector__Alternatives() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1251:1: ( ( ( rule__Selector__Group_0__0 ) ) | ( ruleCompositeSelector ) )
			int alt6 = 2;
			alt6 = dfa6.predict(input);
			switch (alt6) {
			case 1:
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1252:1: ( ( rule__Selector__Group_0__0 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1252:1: ( ( rule__Selector__Group_0__0 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1253:1: ( rule__Selector__Group_0__0 )
				{
					before(grammarAccess.getSelectorAccess().getGroup_0());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1254:1: ( rule__Selector__Group_0__0 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1254:2: rule__Selector__Group_0__0
					{
						pushFollow(FOLLOW_rule__Selector__Group_0__0_in_rule__Selector__Alternatives2623);
						rule__Selector__Group_0__0();

						state._fsp--;


					}

					after(grammarAccess.getSelectorAccess().getGroup_0());

				}


			}
				break;
			case 2:
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1258:6: ( ruleCompositeSelector )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1258:6: ( ruleCompositeSelector )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1259:1: ruleCompositeSelector
				{
					before(grammarAccess.getSelectorAccess().getCompositeSelectorParserRuleCall_1());
					pushFollow(FOLLOW_ruleCompositeSelector_in_rule__Selector__Alternatives2641);
					ruleCompositeSelector();

					state._fsp--;

					after(grammarAccess.getSelectorAccess().getCompositeSelectorParserRuleCall_1());

				}


			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Selector__Alternatives"


	// $ANTLR start "rule__CompositeSelector__Alternatives_1"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1269:1: rule__CompositeSelector__Alternatives_1 : ( ( ( ( RULE_WS ) ) ( ( RULE_WS )* ) ) | ( (
	// rule__CompositeSelector__Group_1_1__0 ) ) );
	public final void rule__CompositeSelector__Alternatives_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1273:1: ( ( ( ( RULE_WS ) ) ( ( RULE_WS )* ) ) | ( ( rule__CompositeSelector__Group_1_1__0 ) ) )
			int alt8 = 2;
			alt8 = dfa8.predict(input);
			switch (alt8) {
			case 1:
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1274:1: ( ( ( RULE_WS ) ) ( ( RULE_WS )* ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1274:1: ( ( ( RULE_WS ) ) ( ( RULE_WS )* ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1275:1: ( ( RULE_WS ) ) ( ( RULE_WS )* )
				{
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1275:1: ( ( RULE_WS ) )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1276:1: ( RULE_WS )
					{
						before(grammarAccess.getCompositeSelectorAccess().getWSTerminalRuleCall_1_0());
						// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1277:1: ( RULE_WS )
						// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1277:3: RULE_WS
						{
							match(input, RULE_WS, FOLLOW_RULE_WS_in_rule__CompositeSelector__Alternatives_12676);

						}

						after(grammarAccess.getCompositeSelectorAccess().getWSTerminalRuleCall_1_0());

					}

					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1280:1: ( ( RULE_WS )* )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1281:1: ( RULE_WS )*
					{
						before(grammarAccess.getCompositeSelectorAccess().getWSTerminalRuleCall_1_0());
						// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1282:1: ( RULE_WS )*
						loop7: do {
							int alt7 = 2;
							int LA7_0 = input.LA(1);

							if ((LA7_0 == RULE_WS)) {
								alt7 = 1;
							}


							switch (alt7) {
							case 1:
							// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1282:3: RULE_WS
							{
								match(input, RULE_WS, FOLLOW_RULE_WS_in_rule__CompositeSelector__Alternatives_12689);

							}
								break;

							default:
								break loop7;
							}
						} while (true);

						after(grammarAccess.getCompositeSelectorAccess().getWSTerminalRuleCall_1_0());

					}


				}


			}
				break;
			case 2:
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1287:6: ( ( rule__CompositeSelector__Group_1_1__0 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1287:6: ( ( rule__CompositeSelector__Group_1_1__0 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1288:1: ( rule__CompositeSelector__Group_1_1__0 )
				{
					before(grammarAccess.getCompositeSelectorAccess().getGroup_1_1());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1289:1: ( rule__CompositeSelector__Group_1_1__0 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1289:2: rule__CompositeSelector__Group_1_1__0
					{
						pushFollow(FOLLOW_rule__CompositeSelector__Group_1_1__0_in_rule__CompositeSelector__Alternatives_12710);
						rule__CompositeSelector__Group_1_1__0();

						state._fsp--;


					}

					after(grammarAccess.getCompositeSelectorAccess().getGroup_1_1());

				}


			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__CompositeSelector__Alternatives_1"


	// $ANTLR start "rule__SimpleSelector__Alternatives"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1298:1: rule__SimpleSelector__Alternatives : ( ( ( rule__SimpleSelector__Group_0__0 ) ) | ( ( (
	// rule__SimpleSelector__ConditionAssignment_1 ) ) ( ( rule__SimpleSelector__ConditionAssignment_1 )* ) ) );
	public final void rule__SimpleSelector__Alternatives() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1302:1: ( ( ( rule__SimpleSelector__Group_0__0 ) ) | ( ( ( rule__SimpleSelector__ConditionAssignment_1 ) )
			// ( ( rule__SimpleSelector__ConditionAssignment_1 )* ) ) )
			int alt10 = 2;
			int LA10_0 = input.LA(1);

			if ((LA10_0 == RULE_ID || LA10_0 == 22)) {
				alt10 = 1;
			}
			else if (((LA10_0 >= RULE_HASH && LA10_0 <= RULE_T_CLASS) || LA10_0 == 37 || LA10_0 == 42)) {
				alt10 = 2;
			}
			else {
				NoViableAltException nvae =
						new NoViableAltException("", 10, 0, input);

				throw nvae;
			}
			switch (alt10) {
			case 1:
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1303:1: ( ( rule__SimpleSelector__Group_0__0 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1303:1: ( ( rule__SimpleSelector__Group_0__0 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1304:1: ( rule__SimpleSelector__Group_0__0 )
				{
					before(grammarAccess.getSimpleSelectorAccess().getGroup_0());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1305:1: ( rule__SimpleSelector__Group_0__0 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1305:2: rule__SimpleSelector__Group_0__0
					{
						pushFollow(FOLLOW_rule__SimpleSelector__Group_0__0_in_rule__SimpleSelector__Alternatives2743);
						rule__SimpleSelector__Group_0__0();

						state._fsp--;


					}

					after(grammarAccess.getSimpleSelectorAccess().getGroup_0());

				}


			}
				break;
			case 2:
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1309:6: ( ( ( rule__SimpleSelector__ConditionAssignment_1 ) ) ( (
			// rule__SimpleSelector__ConditionAssignment_1 )* ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1309:6: ( ( ( rule__SimpleSelector__ConditionAssignment_1 ) ) ( (
				// rule__SimpleSelector__ConditionAssignment_1 )* ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1310:1: ( ( rule__SimpleSelector__ConditionAssignment_1 ) ) ( (
				// rule__SimpleSelector__ConditionAssignment_1 )* )
				{
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1310:1: ( ( rule__SimpleSelector__ConditionAssignment_1 ) )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1311:1: ( rule__SimpleSelector__ConditionAssignment_1 )
					{
						before(grammarAccess.getSimpleSelectorAccess().getConditionAssignment_1());
						// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1312:1: ( rule__SimpleSelector__ConditionAssignment_1 )
						// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1312:2: rule__SimpleSelector__ConditionAssignment_1
						{
							pushFollow(FOLLOW_rule__SimpleSelector__ConditionAssignment_1_in_rule__SimpleSelector__Alternatives2763);
							rule__SimpleSelector__ConditionAssignment_1();

							state._fsp--;


						}

						after(grammarAccess.getSimpleSelectorAccess().getConditionAssignment_1());

					}

					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1315:1: ( ( rule__SimpleSelector__ConditionAssignment_1 )* )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1316:1: ( rule__SimpleSelector__ConditionAssignment_1 )*
					{
						before(grammarAccess.getSimpleSelectorAccess().getConditionAssignment_1());
						// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1317:1: ( rule__SimpleSelector__ConditionAssignment_1 )*
						loop9: do {
							int alt9 = 2;
							int LA9_0 = input.LA(1);

							if (((LA9_0 >= RULE_HASH && LA9_0 <= RULE_T_CLASS) || LA9_0 == 37 || LA9_0 == 42)) {
								alt9 = 1;
							}


							switch (alt9) {
							case 1:
							// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1317:2: rule__SimpleSelector__ConditionAssignment_1
							{
								pushFollow(FOLLOW_rule__SimpleSelector__ConditionAssignment_1_in_rule__SimpleSelector__Alternatives2775);
								rule__SimpleSelector__ConditionAssignment_1();

								state._fsp--;


							}
								break;

							default:
								break loop9;
							}
						} while (true);

						after(grammarAccess.getSimpleSelectorAccess().getConditionAssignment_1());

					}


				}


			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__SimpleSelector__Alternatives"


	// $ANTLR start "rule__SimpleSelector__ElementNameAlternatives_0_0_0"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1327:1: rule__SimpleSelector__ElementNameAlternatives_0_0_0 : ( ( RULE_ID ) | ( '*' ) );
	public final void rule__SimpleSelector__ElementNameAlternatives_0_0_0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1331:1: ( ( RULE_ID ) | ( '*' ) )
			int alt11 = 2;
			int LA11_0 = input.LA(1);

			if ((LA11_0 == RULE_ID)) {
				alt11 = 1;
			}
			else if ((LA11_0 == 22)) {
				alt11 = 2;
			}
			else {
				NoViableAltException nvae =
						new NoViableAltException("", 11, 0, input);

				throw nvae;
			}
			switch (alt11) {
			case 1:
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1332:1: ( RULE_ID )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1332:1: ( RULE_ID )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1333:1: RULE_ID
				{
					before(grammarAccess.getSimpleSelectorAccess().getElementNameIDTerminalRuleCall_0_0_0_0());
					match(input, RULE_ID, FOLLOW_RULE_ID_in_rule__SimpleSelector__ElementNameAlternatives_0_0_02811);
					after(grammarAccess.getSimpleSelectorAccess().getElementNameIDTerminalRuleCall_0_0_0_0());

				}


			}
				break;
			case 2:
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1338:6: ( '*' )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1338:6: ( '*' )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1339:1: '*'
				{
					before(grammarAccess.getSimpleSelectorAccess().getElementNameAsteriskKeyword_0_0_0_1());
					match(input, 22, FOLLOW_22_in_rule__SimpleSelector__ElementNameAlternatives_0_0_02829);
					after(grammarAccess.getSimpleSelectorAccess().getElementNameAsteriskKeyword_0_0_0_1());

				}


			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__SimpleSelector__ElementNameAlternatives_0_0_0"


	// $ANTLR start "rule__SelectorCondition__Alternatives"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1351:1: rule__SelectorCondition__Alternatives : ( ( ruleCSSId ) | ( ruleClass ) | ( ruleAttribute ) | ( rulePseudo
	// ) );
	public final void rule__SelectorCondition__Alternatives() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1355:1: ( ( ruleCSSId ) | ( ruleClass ) | ( ruleAttribute ) | ( rulePseudo ) )
			int alt12 = 4;
			switch (input.LA(1)) {
			case RULE_HASH: {
				alt12 = 1;
			}
				break;
			case RULE_T_CLASS: {
				alt12 = 2;
			}
				break;
			case 42: {
				alt12 = 3;
			}
				break;
			case 37: {
				alt12 = 4;
			}
				break;
			default:
				NoViableAltException nvae =
						new NoViableAltException("", 12, 0, input);

				throw nvae;
			}

			switch (alt12) {
			case 1:
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1356:1: ( ruleCSSId )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1356:1: ( ruleCSSId )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1357:1: ruleCSSId
				{
					before(grammarAccess.getSelectorConditionAccess().getCSSIdParserRuleCall_0());
					pushFollow(FOLLOW_ruleCSSId_in_rule__SelectorCondition__Alternatives2863);
					ruleCSSId();

					state._fsp--;

					after(grammarAccess.getSelectorConditionAccess().getCSSIdParserRuleCall_0());

				}


			}
				break;
			case 2:
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1362:6: ( ruleClass )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1362:6: ( ruleClass )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1363:1: ruleClass
				{
					before(grammarAccess.getSelectorConditionAccess().getClassParserRuleCall_1());
					pushFollow(FOLLOW_ruleClass_in_rule__SelectorCondition__Alternatives2880);
					ruleClass();

					state._fsp--;

					after(grammarAccess.getSelectorConditionAccess().getClassParserRuleCall_1());

				}


			}
				break;
			case 3:
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1368:6: ( ruleAttribute )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1368:6: ( ruleAttribute )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1369:1: ruleAttribute
				{
					before(grammarAccess.getSelectorConditionAccess().getAttributeParserRuleCall_2());
					pushFollow(FOLLOW_ruleAttribute_in_rule__SelectorCondition__Alternatives2897);
					ruleAttribute();

					state._fsp--;

					after(grammarAccess.getSelectorConditionAccess().getAttributeParserRuleCall_2());

				}


			}
				break;
			case 4:
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1374:6: ( rulePseudo )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1374:6: ( rulePseudo )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1375:1: rulePseudo
				{
					before(grammarAccess.getSelectorConditionAccess().getPseudoParserRuleCall_3());
					pushFollow(FOLLOW_rulePseudo_in_rule__SelectorCondition__Alternatives2914);
					rulePseudo();

					state._fsp--;

					after(grammarAccess.getSelectorConditionAccess().getPseudoParserRuleCall_3());

				}


			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__SelectorCondition__Alternatives"


	// $ANTLR start "rule__Term__Alternatives_0"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1385:1: rule__Term__Alternatives_0 : ( ( ruleNumber ) | ( rulePercentage ) | ( ruleLength ) | ( ruleEms ) | (
	// ruleExs ) | ( ruleAngle ) | ( ruleTime ) | ( ruleFrequency ) | ( ruleName ) | ( ruleStringValue ) | ( ruleUri ) | ( ruleHexColor ) | ( ruleFunction ) );
	public final void rule__Term__Alternatives_0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1389:1: ( ( ruleNumber ) | ( rulePercentage ) | ( ruleLength ) | ( ruleEms ) | ( ruleExs ) | ( ruleAngle )
			// | ( ruleTime ) | ( ruleFrequency ) | ( ruleName ) | ( ruleStringValue ) | ( ruleUri ) | ( ruleHexColor ) | ( ruleFunction ) )
			int alt13 = 13;
			alt13 = dfa13.predict(input);
			switch (alt13) {
			case 1:
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1390:1: ( ruleNumber )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1390:1: ( ruleNumber )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1391:1: ruleNumber
				{
					before(grammarAccess.getTermAccess().getNumberParserRuleCall_0_0());
					pushFollow(FOLLOW_ruleNumber_in_rule__Term__Alternatives_02946);
					ruleNumber();

					state._fsp--;

					after(grammarAccess.getTermAccess().getNumberParserRuleCall_0_0());

				}


			}
				break;
			case 2:
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1396:6: ( rulePercentage )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1396:6: ( rulePercentage )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1397:1: rulePercentage
				{
					before(grammarAccess.getTermAccess().getPercentageParserRuleCall_0_1());
					pushFollow(FOLLOW_rulePercentage_in_rule__Term__Alternatives_02963);
					rulePercentage();

					state._fsp--;

					after(grammarAccess.getTermAccess().getPercentageParserRuleCall_0_1());

				}


			}
				break;
			case 3:
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1402:6: ( ruleLength )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1402:6: ( ruleLength )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1403:1: ruleLength
				{
					before(grammarAccess.getTermAccess().getLengthParserRuleCall_0_2());
					pushFollow(FOLLOW_ruleLength_in_rule__Term__Alternatives_02980);
					ruleLength();

					state._fsp--;

					after(grammarAccess.getTermAccess().getLengthParserRuleCall_0_2());

				}


			}
				break;
			case 4:
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1408:6: ( ruleEms )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1408:6: ( ruleEms )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1409:1: ruleEms
				{
					before(grammarAccess.getTermAccess().getEmsParserRuleCall_0_3());
					pushFollow(FOLLOW_ruleEms_in_rule__Term__Alternatives_02997);
					ruleEms();

					state._fsp--;

					after(grammarAccess.getTermAccess().getEmsParserRuleCall_0_3());

				}


			}
				break;
			case 5:
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1414:6: ( ruleExs )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1414:6: ( ruleExs )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1415:1: ruleExs
				{
					before(grammarAccess.getTermAccess().getExsParserRuleCall_0_4());
					pushFollow(FOLLOW_ruleExs_in_rule__Term__Alternatives_03014);
					ruleExs();

					state._fsp--;

					after(grammarAccess.getTermAccess().getExsParserRuleCall_0_4());

				}


			}
				break;
			case 6:
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1420:6: ( ruleAngle )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1420:6: ( ruleAngle )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1421:1: ruleAngle
				{
					before(grammarAccess.getTermAccess().getAngleParserRuleCall_0_5());
					pushFollow(FOLLOW_ruleAngle_in_rule__Term__Alternatives_03031);
					ruleAngle();

					state._fsp--;

					after(grammarAccess.getTermAccess().getAngleParserRuleCall_0_5());

				}


			}
				break;
			case 7:
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1426:6: ( ruleTime )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1426:6: ( ruleTime )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1427:1: ruleTime
				{
					before(grammarAccess.getTermAccess().getTimeParserRuleCall_0_6());
					pushFollow(FOLLOW_ruleTime_in_rule__Term__Alternatives_03048);
					ruleTime();

					state._fsp--;

					after(grammarAccess.getTermAccess().getTimeParserRuleCall_0_6());

				}


			}
				break;
			case 8:
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1432:6: ( ruleFrequency )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1432:6: ( ruleFrequency )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1433:1: ruleFrequency
				{
					before(grammarAccess.getTermAccess().getFrequencyParserRuleCall_0_7());
					pushFollow(FOLLOW_ruleFrequency_in_rule__Term__Alternatives_03065);
					ruleFrequency();

					state._fsp--;

					after(grammarAccess.getTermAccess().getFrequencyParserRuleCall_0_7());

				}


			}
				break;
			case 9:
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1438:6: ( ruleName )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1438:6: ( ruleName )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1439:1: ruleName
				{
					before(grammarAccess.getTermAccess().getNameParserRuleCall_0_8());
					pushFollow(FOLLOW_ruleName_in_rule__Term__Alternatives_03082);
					ruleName();

					state._fsp--;

					after(grammarAccess.getTermAccess().getNameParserRuleCall_0_8());

				}


			}
				break;
			case 10:
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1444:6: ( ruleStringValue )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1444:6: ( ruleStringValue )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1445:1: ruleStringValue
				{
					before(grammarAccess.getTermAccess().getStringValueParserRuleCall_0_9());
					pushFollow(FOLLOW_ruleStringValue_in_rule__Term__Alternatives_03099);
					ruleStringValue();

					state._fsp--;

					after(grammarAccess.getTermAccess().getStringValueParserRuleCall_0_9());

				}


			}
				break;
			case 11:
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1450:6: ( ruleUri )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1450:6: ( ruleUri )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1451:1: ruleUri
				{
					before(grammarAccess.getTermAccess().getUriParserRuleCall_0_10());
					pushFollow(FOLLOW_ruleUri_in_rule__Term__Alternatives_03116);
					ruleUri();

					state._fsp--;

					after(grammarAccess.getTermAccess().getUriParserRuleCall_0_10());

				}


			}
				break;
			case 12:
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1456:6: ( ruleHexColor )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1456:6: ( ruleHexColor )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1457:1: ruleHexColor
				{
					before(grammarAccess.getTermAccess().getHexColorParserRuleCall_0_11());
					pushFollow(FOLLOW_ruleHexColor_in_rule__Term__Alternatives_03133);
					ruleHexColor();

					state._fsp--;

					after(grammarAccess.getTermAccess().getHexColorParserRuleCall_0_11());

				}


			}
				break;
			case 13:
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1462:6: ( ruleFunction )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1462:6: ( ruleFunction )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1463:1: ruleFunction
				{
					before(grammarAccess.getTermAccess().getFunctionParserRuleCall_0_12());
					pushFollow(FOLLOW_ruleFunction_in_rule__Term__Alternatives_03150);
					ruleFunction();

					state._fsp--;

					after(grammarAccess.getTermAccess().getFunctionParserRuleCall_0_12());

				}


			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Term__Alternatives_0"


	// $ANTLR start "rule__Operator__Alternatives"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1473:1: rule__Operator__Alternatives : ( ( ( rule__Operator__Group_0__0 ) ) | ( ( rule__Operator__Group_1__0 ) ) );
	public final void rule__Operator__Alternatives() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1477:1: ( ( ( rule__Operator__Group_0__0 ) ) | ( ( rule__Operator__Group_1__0 ) ) )
			int alt14 = 2;
			int LA14_0 = input.LA(1);

			if ((LA14_0 == 41)) {
				alt14 = 1;
			}
			else if ((LA14_0 == 32)) {
				alt14 = 2;
			}
			else {
				NoViableAltException nvae =
						new NoViableAltException("", 14, 0, input);

				throw nvae;
			}
			switch (alt14) {
			case 1:
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1478:1: ( ( rule__Operator__Group_0__0 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1478:1: ( ( rule__Operator__Group_0__0 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1479:1: ( rule__Operator__Group_0__0 )
				{
					before(grammarAccess.getOperatorAccess().getGroup_0());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1480:1: ( rule__Operator__Group_0__0 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1480:2: rule__Operator__Group_0__0
					{
						pushFollow(FOLLOW_rule__Operator__Group_0__0_in_rule__Operator__Alternatives3182);
						rule__Operator__Group_0__0();

						state._fsp--;


					}

					after(grammarAccess.getOperatorAccess().getGroup_0());

				}


			}
				break;
			case 2:
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1484:6: ( ( rule__Operator__Group_1__0 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1484:6: ( ( rule__Operator__Group_1__0 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1485:1: ( rule__Operator__Group_1__0 )
				{
					before(grammarAccess.getOperatorAccess().getGroup_1());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1486:1: ( rule__Operator__Group_1__0 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1486:2: rule__Operator__Group_1__0
					{
						pushFollow(FOLLOW_rule__Operator__Group_1__0_in_rule__Operator__Alternatives3200);
						rule__Operator__Group_1__0();

						state._fsp--;


					}

					after(grammarAccess.getOperatorAccess().getGroup_1());

				}


			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Operator__Alternatives"


	// $ANTLR start "rule__AttributeValue__ValueAlternatives_2_0"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1495:1: rule__AttributeValue__ValueAlternatives_2_0 : ( ( RULE_ID ) | ( RULE_STRING ) );
	public final void rule__AttributeValue__ValueAlternatives_2_0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1499:1: ( ( RULE_ID ) | ( RULE_STRING ) )
			int alt15 = 2;
			int LA15_0 = input.LA(1);

			if ((LA15_0 == RULE_ID)) {
				alt15 = 1;
			}
			else if ((LA15_0 == RULE_STRING)) {
				alt15 = 2;
			}
			else {
				NoViableAltException nvae =
						new NoViableAltException("", 15, 0, input);

				throw nvae;
			}
			switch (alt15) {
			case 1:
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1500:1: ( RULE_ID )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1500:1: ( RULE_ID )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1501:1: RULE_ID
				{
					before(grammarAccess.getAttributeValueAccess().getValueIDTerminalRuleCall_2_0_0());
					match(input, RULE_ID, FOLLOW_RULE_ID_in_rule__AttributeValue__ValueAlternatives_2_03233);
					after(grammarAccess.getAttributeValueAccess().getValueIDTerminalRuleCall_2_0_0());

				}


			}
				break;
			case 2:
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1506:6: ( RULE_STRING )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1506:6: ( RULE_STRING )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1507:1: RULE_STRING
				{
					before(grammarAccess.getAttributeValueAccess().getValueSTRINGTerminalRuleCall_2_0_1());
					match(input, RULE_STRING, FOLLOW_RULE_STRING_in_rule__AttributeValue__ValueAlternatives_2_03250);
					after(grammarAccess.getAttributeValueAccess().getValueSTRINGTerminalRuleCall_2_0_1());

				}


			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__AttributeValue__ValueAlternatives_2_0"


	// $ANTLR start "rule__Pseudo__Alternatives_1"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1517:1: rule__Pseudo__Alternatives_1 : ( ( ( rule__Pseudo__PseudoAssignment_1_0 ) ) | ( (
	// rule__Pseudo__Group_1_1__0 ) ) );
	public final void rule__Pseudo__Alternatives_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1521:1: ( ( ( rule__Pseudo__PseudoAssignment_1_0 ) ) | ( ( rule__Pseudo__Group_1_1__0 ) ) )
			int alt16 = 2;
			int LA16_0 = input.LA(1);

			if ((LA16_0 == RULE_ID)) {
				int LA16_1 = input.LA(2);

				if ((LA16_1 == 38)) {
					alt16 = 2;
				}
				else if ((LA16_1 == EOF || LA16_1 == RULE_WS || (LA16_1 >= RULE_HASH && LA16_1 <= RULE_T_CLASS) || (LA16_1 >= 24 && LA16_1 <= 25) || LA16_1 == 32 || LA16_1 == 34 || LA16_1 == 37 || LA16_1 == 42)) {
					alt16 = 1;
				}
				else {
					NoViableAltException nvae =
							new NoViableAltException("", 16, 1, input);

					throw nvae;
				}
			}
			else {
				NoViableAltException nvae =
						new NoViableAltException("", 16, 0, input);

				throw nvae;
			}
			switch (alt16) {
			case 1:
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1522:1: ( ( rule__Pseudo__PseudoAssignment_1_0 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1522:1: ( ( rule__Pseudo__PseudoAssignment_1_0 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1523:1: ( rule__Pseudo__PseudoAssignment_1_0 )
				{
					before(grammarAccess.getPseudoAccess().getPseudoAssignment_1_0());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1524:1: ( rule__Pseudo__PseudoAssignment_1_0 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1524:2: rule__Pseudo__PseudoAssignment_1_0
					{
						pushFollow(FOLLOW_rule__Pseudo__PseudoAssignment_1_0_in_rule__Pseudo__Alternatives_13282);
						rule__Pseudo__PseudoAssignment_1_0();

						state._fsp--;


					}

					after(grammarAccess.getPseudoAccess().getPseudoAssignment_1_0());

				}


			}
				break;
			case 2:
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1528:6: ( ( rule__Pseudo__Group_1_1__0 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1528:6: ( ( rule__Pseudo__Group_1_1__0 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1529:1: ( rule__Pseudo__Group_1_1__0 )
				{
					before(grammarAccess.getPseudoAccess().getGroup_1_1());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1530:1: ( rule__Pseudo__Group_1_1__0 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1530:2: rule__Pseudo__Group_1_1__0
					{
						pushFollow(FOLLOW_rule__Pseudo__Group_1_1__0_in_rule__Pseudo__Alternatives_13300);
						rule__Pseudo__Group_1_1__0();

						state._fsp--;


					}

					after(grammarAccess.getPseudoAccess().getGroup_1_1());

				}


			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Pseudo__Alternatives_1"


	// $ANTLR start "rule__UNARY__Alternatives"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1539:1: rule__UNARY__Alternatives : ( ( ( '-' ) ) | ( ( '+' ) ) );
	public final void rule__UNARY__Alternatives() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1543:1: ( ( ( '-' ) ) | ( ( '+' ) ) )
			int alt17 = 2;
			int LA17_0 = input.LA(1);

			if ((LA17_0 == 23)) {
				alt17 = 1;
			}
			else if ((LA17_0 == 24)) {
				alt17 = 2;
			}
			else {
				NoViableAltException nvae =
						new NoViableAltException("", 17, 0, input);

				throw nvae;
			}
			switch (alt17) {
			case 1:
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1544:1: ( ( '-' ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1544:1: ( ( '-' ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1545:1: ( '-' )
				{
					before(grammarAccess.getUNARYAccess().getNEGEnumLiteralDeclaration_0());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1546:1: ( '-' )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1546:3: '-'
					{
						match(input, 23, FOLLOW_23_in_rule__UNARY__Alternatives3334);

					}

					after(grammarAccess.getUNARYAccess().getNEGEnumLiteralDeclaration_0());

				}


			}
				break;
			case 2:
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1551:6: ( ( '+' ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1551:6: ( ( '+' ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1552:1: ( '+' )
				{
					before(grammarAccess.getUNARYAccess().getPLUSEnumLiteralDeclaration_1());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1553:1: ( '+' )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1553:3: '+'
					{
						match(input, 24, FOLLOW_24_in_rule__UNARY__Alternatives3355);

					}

					after(grammarAccess.getUNARYAccess().getPLUSEnumLiteralDeclaration_1());

				}


			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__UNARY__Alternatives"


	// $ANTLR start "rule__KIND__Alternatives"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1563:1: rule__KIND__Alternatives : ( ( ( '>' ) ) | ( ( '+' ) ) );
	public final void rule__KIND__Alternatives() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1567:1: ( ( ( '>' ) ) | ( ( '+' ) ) )
			int alt18 = 2;
			int LA18_0 = input.LA(1);

			if ((LA18_0 == 25)) {
				alt18 = 1;
			}
			else if ((LA18_0 == 24)) {
				alt18 = 2;
			}
			else {
				NoViableAltException nvae =
						new NoViableAltException("", 18, 0, input);

				throw nvae;
			}
			switch (alt18) {
			case 1:
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1568:1: ( ( '>' ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1568:1: ( ( '>' ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1569:1: ( '>' )
				{
					before(grammarAccess.getKINDAccess().getFIRST_CHILDEnumLiteralDeclaration_0());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1570:1: ( '>' )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1570:3: '>'
					{
						match(input, 25, FOLLOW_25_in_rule__KIND__Alternatives3391);

					}

					after(grammarAccess.getKINDAccess().getFIRST_CHILDEnumLiteralDeclaration_0());

				}


			}
				break;
			case 2:
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1575:6: ( ( '+' ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1575:6: ( ( '+' ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1576:1: ( '+' )
				{
					before(grammarAccess.getKINDAccess().getSIBLINGEnumLiteralDeclaration_1());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1577:1: ( '+' )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1577:3: '+'
					{
						match(input, 24, FOLLOW_24_in_rule__KIND__Alternatives3412);

					}

					after(grammarAccess.getKINDAccess().getSIBLINGEnumLiteralDeclaration_1());

				}


			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__KIND__Alternatives"


	// $ANTLR start "rule__ATTRIBUTE_OP__Alternatives"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1587:1: rule__ATTRIBUTE_OP__Alternatives : ( ( ( '=' ) ) | ( ( '~=' ) ) | ( ( '!=' ) ) );
	public final void rule__ATTRIBUTE_OP__Alternatives() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1591:1: ( ( ( '=' ) ) | ( ( '~=' ) ) | ( ( '!=' ) ) )
			int alt19 = 3;
			switch (input.LA(1)) {
			case 26: {
				alt19 = 1;
			}
				break;
			case 27: {
				alt19 = 2;
			}
				break;
			case 28: {
				alt19 = 3;
			}
				break;
			default:
				NoViableAltException nvae =
						new NoViableAltException("", 19, 0, input);

				throw nvae;
			}

			switch (alt19) {
			case 1:
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1592:1: ( ( '=' ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1592:1: ( ( '=' ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1593:1: ( '=' )
				{
					before(grammarAccess.getATTRIBUTE_OPAccess().getEQUALSEnumLiteralDeclaration_0());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1594:1: ( '=' )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1594:3: '='
					{
						match(input, 26, FOLLOW_26_in_rule__ATTRIBUTE_OP__Alternatives3448);

					}

					after(grammarAccess.getATTRIBUTE_OPAccess().getEQUALSEnumLiteralDeclaration_0());

				}


			}
				break;
			case 2:
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1599:6: ( ( '~=' ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1599:6: ( ( '~=' ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1600:1: ( '~=' )
				{
					before(grammarAccess.getATTRIBUTE_OPAccess().getCONTAINSEnumLiteralDeclaration_1());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1601:1: ( '~=' )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1601:3: '~='
					{
						match(input, 27, FOLLOW_27_in_rule__ATTRIBUTE_OP__Alternatives3469);

					}

					after(grammarAccess.getATTRIBUTE_OPAccess().getCONTAINSEnumLiteralDeclaration_1());

				}


			}
				break;
			case 3:
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1606:6: ( ( '!=' ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1606:6: ( ( '!=' ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1607:1: ( '!=' )
				{
					before(grammarAccess.getATTRIBUTE_OPAccess().getUNEQUALSEnumLiteralDeclaration_2());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1608:1: ( '!=' )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1608:3: '!='
					{
						match(input, 28, FOLLOW_28_in_rule__ATTRIBUTE_OP__Alternatives3490);

					}

					after(grammarAccess.getATTRIBUTE_OPAccess().getUNEQUALSEnumLiteralDeclaration_2());

				}


			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__ATTRIBUTE_OP__Alternatives"


	// $ANTLR start "rule__Stylesheet__Group__0"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1620:1: rule__Stylesheet__Group__0 : rule__Stylesheet__Group__0__Impl rule__Stylesheet__Group__1 ;
	public final void rule__Stylesheet__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1624:1: ( rule__Stylesheet__Group__0__Impl rule__Stylesheet__Group__1 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1625:2: rule__Stylesheet__Group__0__Impl rule__Stylesheet__Group__1
			{
				pushFollow(FOLLOW_rule__Stylesheet__Group__0__Impl_in_rule__Stylesheet__Group__03523);
				rule__Stylesheet__Group__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Stylesheet__Group__1_in_rule__Stylesheet__Group__03526);
				rule__Stylesheet__Group__1();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Stylesheet__Group__0"


	// $ANTLR start "rule__Stylesheet__Group__0__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1632:1: rule__Stylesheet__Group__0__Impl : ( ( rule__Stylesheet__Group_0__0 )? ) ;
	public final void rule__Stylesheet__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1636:1: ( ( ( rule__Stylesheet__Group_0__0 )? ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1637:1: ( ( rule__Stylesheet__Group_0__0 )? )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1637:1: ( ( rule__Stylesheet__Group_0__0 )? )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1638:1: ( rule__Stylesheet__Group_0__0 )?
				{
					before(grammarAccess.getStylesheetAccess().getGroup_0());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1639:1: ( rule__Stylesheet__Group_0__0 )?
					int alt20 = 2;
					int LA20_0 = input.LA(1);

					if ((LA20_0 == 29)) {
						alt20 = 1;
					}
					switch (alt20) {
					case 1:
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1639:2: rule__Stylesheet__Group_0__0
					{
						pushFollow(FOLLOW_rule__Stylesheet__Group_0__0_in_rule__Stylesheet__Group__0__Impl3553);
						rule__Stylesheet__Group_0__0();

						state._fsp--;


					}
						break;

					}

					after(grammarAccess.getStylesheetAccess().getGroup_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Stylesheet__Group__0__Impl"


	// $ANTLR start "rule__Stylesheet__Group__1"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1649:1: rule__Stylesheet__Group__1 : rule__Stylesheet__Group__1__Impl rule__Stylesheet__Group__2 ;
	public final void rule__Stylesheet__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1653:1: ( rule__Stylesheet__Group__1__Impl rule__Stylesheet__Group__2 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1654:2: rule__Stylesheet__Group__1__Impl rule__Stylesheet__Group__2
			{
				pushFollow(FOLLOW_rule__Stylesheet__Group__1__Impl_in_rule__Stylesheet__Group__13584);
				rule__Stylesheet__Group__1__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Stylesheet__Group__2_in_rule__Stylesheet__Group__13587);
				rule__Stylesheet__Group__2();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Stylesheet__Group__1"


	// $ANTLR start "rule__Stylesheet__Group__1__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1661:1: rule__Stylesheet__Group__1__Impl : ( ( rule__Stylesheet__Alternatives_1 )* ) ;
	public final void rule__Stylesheet__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1665:1: ( ( ( rule__Stylesheet__Alternatives_1 )* ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1666:1: ( ( rule__Stylesheet__Alternatives_1 )* )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1666:1: ( ( rule__Stylesheet__Alternatives_1 )* )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1667:1: ( rule__Stylesheet__Alternatives_1 )*
				{
					before(grammarAccess.getStylesheetAccess().getAlternatives_1());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1668:1: ( rule__Stylesheet__Alternatives_1 )*
					loop21: do {
						int alt21 = 2;
						int LA21_0 = input.LA(1);

						if (((LA21_0 >= RULE_WS && LA21_0 <= RULE_CDC))) {
							alt21 = 1;
						}


						switch (alt21) {
						case 1:
						// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1668:2: rule__Stylesheet__Alternatives_1
						{
							pushFollow(FOLLOW_rule__Stylesheet__Alternatives_1_in_rule__Stylesheet__Group__1__Impl3614);
							rule__Stylesheet__Alternatives_1();

							state._fsp--;


						}
							break;

						default:
							break loop21;
						}
					} while (true);

					after(grammarAccess.getStylesheetAccess().getAlternatives_1());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Stylesheet__Group__1__Impl"


	// $ANTLR start "rule__Stylesheet__Group__2"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1678:1: rule__Stylesheet__Group__2 : rule__Stylesheet__Group__2__Impl rule__Stylesheet__Group__3 ;
	public final void rule__Stylesheet__Group__2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1682:1: ( rule__Stylesheet__Group__2__Impl rule__Stylesheet__Group__3 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1683:2: rule__Stylesheet__Group__2__Impl rule__Stylesheet__Group__3
			{
				pushFollow(FOLLOW_rule__Stylesheet__Group__2__Impl_in_rule__Stylesheet__Group__23645);
				rule__Stylesheet__Group__2__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Stylesheet__Group__3_in_rule__Stylesheet__Group__23648);
				rule__Stylesheet__Group__3();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Stylesheet__Group__2"


	// $ANTLR start "rule__Stylesheet__Group__2__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1690:1: rule__Stylesheet__Group__2__Impl : ( ( rule__Stylesheet__Group_2__0 )* ) ;
	public final void rule__Stylesheet__Group__2__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1694:1: ( ( ( rule__Stylesheet__Group_2__0 )* ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1695:1: ( ( rule__Stylesheet__Group_2__0 )* )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1695:1: ( ( rule__Stylesheet__Group_2__0 )* )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1696:1: ( rule__Stylesheet__Group_2__0 )*
				{
					before(grammarAccess.getStylesheetAccess().getGroup_2());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1697:1: ( rule__Stylesheet__Group_2__0 )*
					loop22: do {
						int alt22 = 2;
						int LA22_0 = input.LA(1);

						if ((LA22_0 == 31)) {
							alt22 = 1;
						}


						switch (alt22) {
						case 1:
						// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1697:2: rule__Stylesheet__Group_2__0
						{
							pushFollow(FOLLOW_rule__Stylesheet__Group_2__0_in_rule__Stylesheet__Group__2__Impl3675);
							rule__Stylesheet__Group_2__0();

							state._fsp--;


						}
							break;

						default:
							break loop22;
						}
					} while (true);

					after(grammarAccess.getStylesheetAccess().getGroup_2());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Stylesheet__Group__2__Impl"


	// $ANTLR start "rule__Stylesheet__Group__3"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1707:1: rule__Stylesheet__Group__3 : rule__Stylesheet__Group__3__Impl ;
	public final void rule__Stylesheet__Group__3() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1711:1: ( rule__Stylesheet__Group__3__Impl )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1712:2: rule__Stylesheet__Group__3__Impl
			{
				pushFollow(FOLLOW_rule__Stylesheet__Group__3__Impl_in_rule__Stylesheet__Group__33706);
				rule__Stylesheet__Group__3__Impl();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Stylesheet__Group__3"


	// $ANTLR start "rule__Stylesheet__Group__3__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1718:1: rule__Stylesheet__Group__3__Impl : ( ( rule__Stylesheet__Group_3__0 )* ) ;
	public final void rule__Stylesheet__Group__3__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1722:1: ( ( ( rule__Stylesheet__Group_3__0 )* ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1723:1: ( ( rule__Stylesheet__Group_3__0 )* )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1723:1: ( ( rule__Stylesheet__Group_3__0 )* )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1724:1: ( rule__Stylesheet__Group_3__0 )*
				{
					before(grammarAccess.getStylesheetAccess().getGroup_3());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1725:1: ( rule__Stylesheet__Group_3__0 )*
					loop23: do {
						int alt23 = 2;
						int LA23_0 = input.LA(1);

						if ((LA23_0 == RULE_ID || (LA23_0 >= RULE_HASH && LA23_0 <= RULE_T_CLASS) || LA23_0 == 22 || LA23_0 == 33 || (LA23_0 >= 36 && LA23_0 <= 37) || LA23_0 == 42)) {
							alt23 = 1;
						}


						switch (alt23) {
						case 1:
						// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1725:2: rule__Stylesheet__Group_3__0
						{
							pushFollow(FOLLOW_rule__Stylesheet__Group_3__0_in_rule__Stylesheet__Group__3__Impl3733);
							rule__Stylesheet__Group_3__0();

							state._fsp--;


						}
							break;

						default:
							break loop23;
						}
					} while (true);

					after(grammarAccess.getStylesheetAccess().getGroup_3());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Stylesheet__Group__3__Impl"


	// $ANTLR start "rule__Stylesheet__Group_0__0"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1743:1: rule__Stylesheet__Group_0__0 : rule__Stylesheet__Group_0__0__Impl rule__Stylesheet__Group_0__1 ;
	public final void rule__Stylesheet__Group_0__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1747:1: ( rule__Stylesheet__Group_0__0__Impl rule__Stylesheet__Group_0__1 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1748:2: rule__Stylesheet__Group_0__0__Impl rule__Stylesheet__Group_0__1
			{
				pushFollow(FOLLOW_rule__Stylesheet__Group_0__0__Impl_in_rule__Stylesheet__Group_0__03772);
				rule__Stylesheet__Group_0__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Stylesheet__Group_0__1_in_rule__Stylesheet__Group_0__03775);
				rule__Stylesheet__Group_0__1();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Stylesheet__Group_0__0"


	// $ANTLR start "rule__Stylesheet__Group_0__0__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1755:1: rule__Stylesheet__Group_0__0__Impl : ( '@charset ' ) ;
	public final void rule__Stylesheet__Group_0__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1759:1: ( ( '@charset ' ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1760:1: ( '@charset ' )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1760:1: ( '@charset ' )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1761:1: '@charset '
				{
					before(grammarAccess.getStylesheetAccess().getCharsetKeyword_0_0());
					match(input, 29, FOLLOW_29_in_rule__Stylesheet__Group_0__0__Impl3803);
					after(grammarAccess.getStylesheetAccess().getCharsetKeyword_0_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Stylesheet__Group_0__0__Impl"


	// $ANTLR start "rule__Stylesheet__Group_0__1"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1774:1: rule__Stylesheet__Group_0__1 : rule__Stylesheet__Group_0__1__Impl rule__Stylesheet__Group_0__2 ;
	public final void rule__Stylesheet__Group_0__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1778:1: ( rule__Stylesheet__Group_0__1__Impl rule__Stylesheet__Group_0__2 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1779:2: rule__Stylesheet__Group_0__1__Impl rule__Stylesheet__Group_0__2
			{
				pushFollow(FOLLOW_rule__Stylesheet__Group_0__1__Impl_in_rule__Stylesheet__Group_0__13834);
				rule__Stylesheet__Group_0__1__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Stylesheet__Group_0__2_in_rule__Stylesheet__Group_0__13837);
				rule__Stylesheet__Group_0__2();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Stylesheet__Group_0__1"


	// $ANTLR start "rule__Stylesheet__Group_0__1__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1786:1: rule__Stylesheet__Group_0__1__Impl : ( ( rule__Stylesheet__CharsetAssignment_0_1 ) ) ;
	public final void rule__Stylesheet__Group_0__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1790:1: ( ( ( rule__Stylesheet__CharsetAssignment_0_1 ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1791:1: ( ( rule__Stylesheet__CharsetAssignment_0_1 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1791:1: ( ( rule__Stylesheet__CharsetAssignment_0_1 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1792:1: ( rule__Stylesheet__CharsetAssignment_0_1 )
				{
					before(grammarAccess.getStylesheetAccess().getCharsetAssignment_0_1());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1793:1: ( rule__Stylesheet__CharsetAssignment_0_1 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1793:2: rule__Stylesheet__CharsetAssignment_0_1
					{
						pushFollow(FOLLOW_rule__Stylesheet__CharsetAssignment_0_1_in_rule__Stylesheet__Group_0__1__Impl3864);
						rule__Stylesheet__CharsetAssignment_0_1();

						state._fsp--;


					}

					after(grammarAccess.getStylesheetAccess().getCharsetAssignment_0_1());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Stylesheet__Group_0__1__Impl"


	// $ANTLR start "rule__Stylesheet__Group_0__2"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1803:1: rule__Stylesheet__Group_0__2 : rule__Stylesheet__Group_0__2__Impl ;
	public final void rule__Stylesheet__Group_0__2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1807:1: ( rule__Stylesheet__Group_0__2__Impl )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1808:2: rule__Stylesheet__Group_0__2__Impl
			{
				pushFollow(FOLLOW_rule__Stylesheet__Group_0__2__Impl_in_rule__Stylesheet__Group_0__23894);
				rule__Stylesheet__Group_0__2__Impl();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Stylesheet__Group_0__2"


	// $ANTLR start "rule__Stylesheet__Group_0__2__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1814:1: rule__Stylesheet__Group_0__2__Impl : ( ';' ) ;
	public final void rule__Stylesheet__Group_0__2__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1818:1: ( ( ';' ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1819:1: ( ';' )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1819:1: ( ';' )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1820:1: ';'
				{
					before(grammarAccess.getStylesheetAccess().getSemicolonKeyword_0_2());
					match(input, 30, FOLLOW_30_in_rule__Stylesheet__Group_0__2__Impl3922);
					after(grammarAccess.getStylesheetAccess().getSemicolonKeyword_0_2());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Stylesheet__Group_0__2__Impl"


	// $ANTLR start "rule__Stylesheet__Group_2__0"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1839:1: rule__Stylesheet__Group_2__0 : rule__Stylesheet__Group_2__0__Impl rule__Stylesheet__Group_2__1 ;
	public final void rule__Stylesheet__Group_2__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1843:1: ( rule__Stylesheet__Group_2__0__Impl rule__Stylesheet__Group_2__1 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1844:2: rule__Stylesheet__Group_2__0__Impl rule__Stylesheet__Group_2__1
			{
				pushFollow(FOLLOW_rule__Stylesheet__Group_2__0__Impl_in_rule__Stylesheet__Group_2__03959);
				rule__Stylesheet__Group_2__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Stylesheet__Group_2__1_in_rule__Stylesheet__Group_2__03962);
				rule__Stylesheet__Group_2__1();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Stylesheet__Group_2__0"


	// $ANTLR start "rule__Stylesheet__Group_2__0__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1851:1: rule__Stylesheet__Group_2__0__Impl : ( ( rule__Stylesheet__ImportsAssignment_2_0 ) ) ;
	public final void rule__Stylesheet__Group_2__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1855:1: ( ( ( rule__Stylesheet__ImportsAssignment_2_0 ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1856:1: ( ( rule__Stylesheet__ImportsAssignment_2_0 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1856:1: ( ( rule__Stylesheet__ImportsAssignment_2_0 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1857:1: ( rule__Stylesheet__ImportsAssignment_2_0 )
				{
					before(grammarAccess.getStylesheetAccess().getImportsAssignment_2_0());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1858:1: ( rule__Stylesheet__ImportsAssignment_2_0 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1858:2: rule__Stylesheet__ImportsAssignment_2_0
					{
						pushFollow(FOLLOW_rule__Stylesheet__ImportsAssignment_2_0_in_rule__Stylesheet__Group_2__0__Impl3989);
						rule__Stylesheet__ImportsAssignment_2_0();

						state._fsp--;


					}

					after(grammarAccess.getStylesheetAccess().getImportsAssignment_2_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Stylesheet__Group_2__0__Impl"


	// $ANTLR start "rule__Stylesheet__Group_2__1"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1868:1: rule__Stylesheet__Group_2__1 : rule__Stylesheet__Group_2__1__Impl ;
	public final void rule__Stylesheet__Group_2__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1872:1: ( rule__Stylesheet__Group_2__1__Impl )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1873:2: rule__Stylesheet__Group_2__1__Impl
			{
				pushFollow(FOLLOW_rule__Stylesheet__Group_2__1__Impl_in_rule__Stylesheet__Group_2__14019);
				rule__Stylesheet__Group_2__1__Impl();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Stylesheet__Group_2__1"


	// $ANTLR start "rule__Stylesheet__Group_2__1__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1879:1: rule__Stylesheet__Group_2__1__Impl : ( ( rule__Stylesheet__Alternatives_2_1 )* ) ;
	public final void rule__Stylesheet__Group_2__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1883:1: ( ( ( rule__Stylesheet__Alternatives_2_1 )* ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1884:1: ( ( rule__Stylesheet__Alternatives_2_1 )* )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1884:1: ( ( rule__Stylesheet__Alternatives_2_1 )* )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1885:1: ( rule__Stylesheet__Alternatives_2_1 )*
				{
					before(grammarAccess.getStylesheetAccess().getAlternatives_2_1());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1886:1: ( rule__Stylesheet__Alternatives_2_1 )*
					loop24: do {
						int alt24 = 2;
						int LA24_0 = input.LA(1);

						if (((LA24_0 >= RULE_CDO && LA24_0 <= RULE_CDC))) {
							alt24 = 1;
						}


						switch (alt24) {
						case 1:
						// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1886:2: rule__Stylesheet__Alternatives_2_1
						{
							pushFollow(FOLLOW_rule__Stylesheet__Alternatives_2_1_in_rule__Stylesheet__Group_2__1__Impl4046);
							rule__Stylesheet__Alternatives_2_1();

							state._fsp--;


						}
							break;

						default:
							break loop24;
						}
					} while (true);

					after(grammarAccess.getStylesheetAccess().getAlternatives_2_1());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Stylesheet__Group_2__1__Impl"


	// $ANTLR start "rule__Stylesheet__Group_2_1_0__0"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1900:1: rule__Stylesheet__Group_2_1_0__0 : rule__Stylesheet__Group_2_1_0__0__Impl rule__Stylesheet__Group_2_1_0__1
	// ;
	public final void rule__Stylesheet__Group_2_1_0__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1904:1: ( rule__Stylesheet__Group_2_1_0__0__Impl rule__Stylesheet__Group_2_1_0__1 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1905:2: rule__Stylesheet__Group_2_1_0__0__Impl rule__Stylesheet__Group_2_1_0__1
			{
				pushFollow(FOLLOW_rule__Stylesheet__Group_2_1_0__0__Impl_in_rule__Stylesheet__Group_2_1_0__04081);
				rule__Stylesheet__Group_2_1_0__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Stylesheet__Group_2_1_0__1_in_rule__Stylesheet__Group_2_1_0__04084);
				rule__Stylesheet__Group_2_1_0__1();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Stylesheet__Group_2_1_0__0"


	// $ANTLR start "rule__Stylesheet__Group_2_1_0__0__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1912:1: rule__Stylesheet__Group_2_1_0__0__Impl : ( RULE_CDO ) ;
	public final void rule__Stylesheet__Group_2_1_0__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1916:1: ( ( RULE_CDO ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1917:1: ( RULE_CDO )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1917:1: ( RULE_CDO )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1918:1: RULE_CDO
				{
					before(grammarAccess.getStylesheetAccess().getCDOTerminalRuleCall_2_1_0_0());
					match(input, RULE_CDO, FOLLOW_RULE_CDO_in_rule__Stylesheet__Group_2_1_0__0__Impl4111);
					after(grammarAccess.getStylesheetAccess().getCDOTerminalRuleCall_2_1_0_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Stylesheet__Group_2_1_0__0__Impl"


	// $ANTLR start "rule__Stylesheet__Group_2_1_0__1"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1929:1: rule__Stylesheet__Group_2_1_0__1 : rule__Stylesheet__Group_2_1_0__1__Impl ;
	public final void rule__Stylesheet__Group_2_1_0__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1933:1: ( rule__Stylesheet__Group_2_1_0__1__Impl )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1934:2: rule__Stylesheet__Group_2_1_0__1__Impl
			{
				pushFollow(FOLLOW_rule__Stylesheet__Group_2_1_0__1__Impl_in_rule__Stylesheet__Group_2_1_0__14140);
				rule__Stylesheet__Group_2_1_0__1__Impl();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Stylesheet__Group_2_1_0__1"


	// $ANTLR start "rule__Stylesheet__Group_2_1_0__1__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1940:1: rule__Stylesheet__Group_2_1_0__1__Impl : ( ( RULE_WS )* ) ;
	public final void rule__Stylesheet__Group_2_1_0__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1944:1: ( ( ( RULE_WS )* ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1945:1: ( ( RULE_WS )* )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1945:1: ( ( RULE_WS )* )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1946:1: ( RULE_WS )*
				{
					before(grammarAccess.getStylesheetAccess().getWSTerminalRuleCall_2_1_0_1());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1947:1: ( RULE_WS )*
					loop25: do {
						int alt25 = 2;
						int LA25_0 = input.LA(1);

						if ((LA25_0 == RULE_WS)) {
							alt25 = 1;
						}


						switch (alt25) {
						case 1:
						// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1947:3: RULE_WS
						{
							match(input, RULE_WS, FOLLOW_RULE_WS_in_rule__Stylesheet__Group_2_1_0__1__Impl4168);

						}
							break;

						default:
							break loop25;
						}
					} while (true);

					after(grammarAccess.getStylesheetAccess().getWSTerminalRuleCall_2_1_0_1());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Stylesheet__Group_2_1_0__1__Impl"


	// $ANTLR start "rule__Stylesheet__Group_2_1_1__0"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1961:1: rule__Stylesheet__Group_2_1_1__0 : rule__Stylesheet__Group_2_1_1__0__Impl rule__Stylesheet__Group_2_1_1__1
	// ;
	public final void rule__Stylesheet__Group_2_1_1__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1965:1: ( rule__Stylesheet__Group_2_1_1__0__Impl rule__Stylesheet__Group_2_1_1__1 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1966:2: rule__Stylesheet__Group_2_1_1__0__Impl rule__Stylesheet__Group_2_1_1__1
			{
				pushFollow(FOLLOW_rule__Stylesheet__Group_2_1_1__0__Impl_in_rule__Stylesheet__Group_2_1_1__04203);
				rule__Stylesheet__Group_2_1_1__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Stylesheet__Group_2_1_1__1_in_rule__Stylesheet__Group_2_1_1__04206);
				rule__Stylesheet__Group_2_1_1__1();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Stylesheet__Group_2_1_1__0"


	// $ANTLR start "rule__Stylesheet__Group_2_1_1__0__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1973:1: rule__Stylesheet__Group_2_1_1__0__Impl : ( RULE_CDC ) ;
	public final void rule__Stylesheet__Group_2_1_1__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1977:1: ( ( RULE_CDC ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1978:1: ( RULE_CDC )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1978:1: ( RULE_CDC )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1979:1: RULE_CDC
				{
					before(grammarAccess.getStylesheetAccess().getCDCTerminalRuleCall_2_1_1_0());
					match(input, RULE_CDC, FOLLOW_RULE_CDC_in_rule__Stylesheet__Group_2_1_1__0__Impl4233);
					after(grammarAccess.getStylesheetAccess().getCDCTerminalRuleCall_2_1_1_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Stylesheet__Group_2_1_1__0__Impl"


	// $ANTLR start "rule__Stylesheet__Group_2_1_1__1"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1990:1: rule__Stylesheet__Group_2_1_1__1 : rule__Stylesheet__Group_2_1_1__1__Impl ;
	public final void rule__Stylesheet__Group_2_1_1__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1994:1: ( rule__Stylesheet__Group_2_1_1__1__Impl )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:1995:2: rule__Stylesheet__Group_2_1_1__1__Impl
			{
				pushFollow(FOLLOW_rule__Stylesheet__Group_2_1_1__1__Impl_in_rule__Stylesheet__Group_2_1_1__14262);
				rule__Stylesheet__Group_2_1_1__1__Impl();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Stylesheet__Group_2_1_1__1"


	// $ANTLR start "rule__Stylesheet__Group_2_1_1__1__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2001:1: rule__Stylesheet__Group_2_1_1__1__Impl : ( ( RULE_WS )* ) ;
	public final void rule__Stylesheet__Group_2_1_1__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2005:1: ( ( ( RULE_WS )* ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2006:1: ( ( RULE_WS )* )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2006:1: ( ( RULE_WS )* )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2007:1: ( RULE_WS )*
				{
					before(grammarAccess.getStylesheetAccess().getWSTerminalRuleCall_2_1_1_1());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2008:1: ( RULE_WS )*
					loop26: do {
						int alt26 = 2;
						int LA26_0 = input.LA(1);

						if ((LA26_0 == RULE_WS)) {
							alt26 = 1;
						}


						switch (alt26) {
						case 1:
						// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2008:3: RULE_WS
						{
							match(input, RULE_WS, FOLLOW_RULE_WS_in_rule__Stylesheet__Group_2_1_1__1__Impl4290);

						}
							break;

						default:
							break loop26;
						}
					} while (true);

					after(grammarAccess.getStylesheetAccess().getWSTerminalRuleCall_2_1_1_1());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Stylesheet__Group_2_1_1__1__Impl"


	// $ANTLR start "rule__Stylesheet__Group_3__0"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2022:1: rule__Stylesheet__Group_3__0 : rule__Stylesheet__Group_3__0__Impl rule__Stylesheet__Group_3__1 ;
	public final void rule__Stylesheet__Group_3__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2026:1: ( rule__Stylesheet__Group_3__0__Impl rule__Stylesheet__Group_3__1 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2027:2: rule__Stylesheet__Group_3__0__Impl rule__Stylesheet__Group_3__1
			{
				pushFollow(FOLLOW_rule__Stylesheet__Group_3__0__Impl_in_rule__Stylesheet__Group_3__04325);
				rule__Stylesheet__Group_3__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Stylesheet__Group_3__1_in_rule__Stylesheet__Group_3__04328);
				rule__Stylesheet__Group_3__1();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Stylesheet__Group_3__0"


	// $ANTLR start "rule__Stylesheet__Group_3__0__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2034:1: rule__Stylesheet__Group_3__0__Impl : ( ( rule__Stylesheet__ContentsAssignment_3_0 ) ) ;
	public final void rule__Stylesheet__Group_3__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2038:1: ( ( ( rule__Stylesheet__ContentsAssignment_3_0 ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2039:1: ( ( rule__Stylesheet__ContentsAssignment_3_0 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2039:1: ( ( rule__Stylesheet__ContentsAssignment_3_0 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2040:1: ( rule__Stylesheet__ContentsAssignment_3_0 )
				{
					before(grammarAccess.getStylesheetAccess().getContentsAssignment_3_0());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2041:1: ( rule__Stylesheet__ContentsAssignment_3_0 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2041:2: rule__Stylesheet__ContentsAssignment_3_0
					{
						pushFollow(FOLLOW_rule__Stylesheet__ContentsAssignment_3_0_in_rule__Stylesheet__Group_3__0__Impl4355);
						rule__Stylesheet__ContentsAssignment_3_0();

						state._fsp--;


					}

					after(grammarAccess.getStylesheetAccess().getContentsAssignment_3_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Stylesheet__Group_3__0__Impl"


	// $ANTLR start "rule__Stylesheet__Group_3__1"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2051:1: rule__Stylesheet__Group_3__1 : rule__Stylesheet__Group_3__1__Impl ;
	public final void rule__Stylesheet__Group_3__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2055:1: ( rule__Stylesheet__Group_3__1__Impl )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2056:2: rule__Stylesheet__Group_3__1__Impl
			{
				pushFollow(FOLLOW_rule__Stylesheet__Group_3__1__Impl_in_rule__Stylesheet__Group_3__14385);
				rule__Stylesheet__Group_3__1__Impl();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Stylesheet__Group_3__1"


	// $ANTLR start "rule__Stylesheet__Group_3__1__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2062:1: rule__Stylesheet__Group_3__1__Impl : ( ( rule__Stylesheet__Alternatives_3_1 )* ) ;
	public final void rule__Stylesheet__Group_3__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2066:1: ( ( ( rule__Stylesheet__Alternatives_3_1 )* ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2067:1: ( ( rule__Stylesheet__Alternatives_3_1 )* )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2067:1: ( ( rule__Stylesheet__Alternatives_3_1 )* )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2068:1: ( rule__Stylesheet__Alternatives_3_1 )*
				{
					before(grammarAccess.getStylesheetAccess().getAlternatives_3_1());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2069:1: ( rule__Stylesheet__Alternatives_3_1 )*
					loop27: do {
						int alt27 = 2;
						int LA27_0 = input.LA(1);

						if (((LA27_0 >= RULE_CDO && LA27_0 <= RULE_CDC))) {
							alt27 = 1;
						}


						switch (alt27) {
						case 1:
						// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2069:2: rule__Stylesheet__Alternatives_3_1
						{
							pushFollow(FOLLOW_rule__Stylesheet__Alternatives_3_1_in_rule__Stylesheet__Group_3__1__Impl4412);
							rule__Stylesheet__Alternatives_3_1();

							state._fsp--;


						}
							break;

						default:
							break loop27;
						}
					} while (true);

					after(grammarAccess.getStylesheetAccess().getAlternatives_3_1());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Stylesheet__Group_3__1__Impl"


	// $ANTLR start "rule__Stylesheet__Group_3_1_0__0"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2083:1: rule__Stylesheet__Group_3_1_0__0 : rule__Stylesheet__Group_3_1_0__0__Impl rule__Stylesheet__Group_3_1_0__1
	// ;
	public final void rule__Stylesheet__Group_3_1_0__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2087:1: ( rule__Stylesheet__Group_3_1_0__0__Impl rule__Stylesheet__Group_3_1_0__1 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2088:2: rule__Stylesheet__Group_3_1_0__0__Impl rule__Stylesheet__Group_3_1_0__1
			{
				pushFollow(FOLLOW_rule__Stylesheet__Group_3_1_0__0__Impl_in_rule__Stylesheet__Group_3_1_0__04447);
				rule__Stylesheet__Group_3_1_0__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Stylesheet__Group_3_1_0__1_in_rule__Stylesheet__Group_3_1_0__04450);
				rule__Stylesheet__Group_3_1_0__1();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Stylesheet__Group_3_1_0__0"


	// $ANTLR start "rule__Stylesheet__Group_3_1_0__0__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2095:1: rule__Stylesheet__Group_3_1_0__0__Impl : ( RULE_CDO ) ;
	public final void rule__Stylesheet__Group_3_1_0__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2099:1: ( ( RULE_CDO ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2100:1: ( RULE_CDO )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2100:1: ( RULE_CDO )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2101:1: RULE_CDO
				{
					before(grammarAccess.getStylesheetAccess().getCDOTerminalRuleCall_3_1_0_0());
					match(input, RULE_CDO, FOLLOW_RULE_CDO_in_rule__Stylesheet__Group_3_1_0__0__Impl4477);
					after(grammarAccess.getStylesheetAccess().getCDOTerminalRuleCall_3_1_0_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Stylesheet__Group_3_1_0__0__Impl"


	// $ANTLR start "rule__Stylesheet__Group_3_1_0__1"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2112:1: rule__Stylesheet__Group_3_1_0__1 : rule__Stylesheet__Group_3_1_0__1__Impl ;
	public final void rule__Stylesheet__Group_3_1_0__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2116:1: ( rule__Stylesheet__Group_3_1_0__1__Impl )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2117:2: rule__Stylesheet__Group_3_1_0__1__Impl
			{
				pushFollow(FOLLOW_rule__Stylesheet__Group_3_1_0__1__Impl_in_rule__Stylesheet__Group_3_1_0__14506);
				rule__Stylesheet__Group_3_1_0__1__Impl();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Stylesheet__Group_3_1_0__1"


	// $ANTLR start "rule__Stylesheet__Group_3_1_0__1__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2123:1: rule__Stylesheet__Group_3_1_0__1__Impl : ( ( RULE_WS )* ) ;
	public final void rule__Stylesheet__Group_3_1_0__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2127:1: ( ( ( RULE_WS )* ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2128:1: ( ( RULE_WS )* )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2128:1: ( ( RULE_WS )* )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2129:1: ( RULE_WS )*
				{
					before(grammarAccess.getStylesheetAccess().getWSTerminalRuleCall_3_1_0_1());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2130:1: ( RULE_WS )*
					loop28: do {
						int alt28 = 2;
						int LA28_0 = input.LA(1);

						if ((LA28_0 == RULE_WS)) {
							alt28 = 1;
						}


						switch (alt28) {
						case 1:
						// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2130:3: RULE_WS
						{
							match(input, RULE_WS, FOLLOW_RULE_WS_in_rule__Stylesheet__Group_3_1_0__1__Impl4534);

						}
							break;

						default:
							break loop28;
						}
					} while (true);

					after(grammarAccess.getStylesheetAccess().getWSTerminalRuleCall_3_1_0_1());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Stylesheet__Group_3_1_0__1__Impl"


	// $ANTLR start "rule__Stylesheet__Group_3_1_1__0"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2144:1: rule__Stylesheet__Group_3_1_1__0 : rule__Stylesheet__Group_3_1_1__0__Impl rule__Stylesheet__Group_3_1_1__1
	// ;
	public final void rule__Stylesheet__Group_3_1_1__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2148:1: ( rule__Stylesheet__Group_3_1_1__0__Impl rule__Stylesheet__Group_3_1_1__1 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2149:2: rule__Stylesheet__Group_3_1_1__0__Impl rule__Stylesheet__Group_3_1_1__1
			{
				pushFollow(FOLLOW_rule__Stylesheet__Group_3_1_1__0__Impl_in_rule__Stylesheet__Group_3_1_1__04569);
				rule__Stylesheet__Group_3_1_1__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Stylesheet__Group_3_1_1__1_in_rule__Stylesheet__Group_3_1_1__04572);
				rule__Stylesheet__Group_3_1_1__1();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Stylesheet__Group_3_1_1__0"


	// $ANTLR start "rule__Stylesheet__Group_3_1_1__0__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2156:1: rule__Stylesheet__Group_3_1_1__0__Impl : ( RULE_CDC ) ;
	public final void rule__Stylesheet__Group_3_1_1__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2160:1: ( ( RULE_CDC ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2161:1: ( RULE_CDC )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2161:1: ( RULE_CDC )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2162:1: RULE_CDC
				{
					before(grammarAccess.getStylesheetAccess().getCDCTerminalRuleCall_3_1_1_0());
					match(input, RULE_CDC, FOLLOW_RULE_CDC_in_rule__Stylesheet__Group_3_1_1__0__Impl4599);
					after(grammarAccess.getStylesheetAccess().getCDCTerminalRuleCall_3_1_1_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Stylesheet__Group_3_1_1__0__Impl"


	// $ANTLR start "rule__Stylesheet__Group_3_1_1__1"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2173:1: rule__Stylesheet__Group_3_1_1__1 : rule__Stylesheet__Group_3_1_1__1__Impl ;
	public final void rule__Stylesheet__Group_3_1_1__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2177:1: ( rule__Stylesheet__Group_3_1_1__1__Impl )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2178:2: rule__Stylesheet__Group_3_1_1__1__Impl
			{
				pushFollow(FOLLOW_rule__Stylesheet__Group_3_1_1__1__Impl_in_rule__Stylesheet__Group_3_1_1__14628);
				rule__Stylesheet__Group_3_1_1__1__Impl();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Stylesheet__Group_3_1_1__1"


	// $ANTLR start "rule__Stylesheet__Group_3_1_1__1__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2184:1: rule__Stylesheet__Group_3_1_1__1__Impl : ( ( RULE_WS )* ) ;
	public final void rule__Stylesheet__Group_3_1_1__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2188:1: ( ( ( RULE_WS )* ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2189:1: ( ( RULE_WS )* )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2189:1: ( ( RULE_WS )* )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2190:1: ( RULE_WS )*
				{
					before(grammarAccess.getStylesheetAccess().getWSTerminalRuleCall_3_1_1_1());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2191:1: ( RULE_WS )*
					loop29: do {
						int alt29 = 2;
						int LA29_0 = input.LA(1);

						if ((LA29_0 == RULE_WS)) {
							alt29 = 1;
						}


						switch (alt29) {
						case 1:
						// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2191:3: RULE_WS
						{
							match(input, RULE_WS, FOLLOW_RULE_WS_in_rule__Stylesheet__Group_3_1_1__1__Impl4656);

						}
							break;

						default:
							break loop29;
						}
					} while (true);

					after(grammarAccess.getStylesheetAccess().getWSTerminalRuleCall_3_1_1_1());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Stylesheet__Group_3_1_1__1__Impl"


	// $ANTLR start "rule__Import__Group__0"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2205:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
	public final void rule__Import__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2209:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2210:2: rule__Import__Group__0__Impl rule__Import__Group__1
			{
				pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__04691);
				rule__Import__Group__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__04694);
				rule__Import__Group__1();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Import__Group__0"


	// $ANTLR start "rule__Import__Group__0__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2217:1: rule__Import__Group__0__Impl : ( '@import' ) ;
	public final void rule__Import__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2221:1: ( ( '@import' ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2222:1: ( '@import' )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2222:1: ( '@import' )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2223:1: '@import'
				{
					before(grammarAccess.getImportAccess().getImportKeyword_0());
					match(input, 31, FOLLOW_31_in_rule__Import__Group__0__Impl4722);
					after(grammarAccess.getImportAccess().getImportKeyword_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Import__Group__0__Impl"


	// $ANTLR start "rule__Import__Group__1"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2236:1: rule__Import__Group__1 : rule__Import__Group__1__Impl rule__Import__Group__2 ;
	public final void rule__Import__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2240:1: ( rule__Import__Group__1__Impl rule__Import__Group__2 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2241:2: rule__Import__Group__1__Impl rule__Import__Group__2
			{
				pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__14753);
				rule__Import__Group__1__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Import__Group__2_in_rule__Import__Group__14756);
				rule__Import__Group__2();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Import__Group__1"


	// $ANTLR start "rule__Import__Group__1__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2248:1: rule__Import__Group__1__Impl : ( ( rule__Import__Alternatives_1 ) ) ;
	public final void rule__Import__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2252:1: ( ( ( rule__Import__Alternatives_1 ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2253:1: ( ( rule__Import__Alternatives_1 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2253:1: ( ( rule__Import__Alternatives_1 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2254:1: ( rule__Import__Alternatives_1 )
				{
					before(grammarAccess.getImportAccess().getAlternatives_1());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2255:1: ( rule__Import__Alternatives_1 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2255:2: rule__Import__Alternatives_1
					{
						pushFollow(FOLLOW_rule__Import__Alternatives_1_in_rule__Import__Group__1__Impl4783);
						rule__Import__Alternatives_1();

						state._fsp--;


					}

					after(grammarAccess.getImportAccess().getAlternatives_1());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Import__Group__1__Impl"


	// $ANTLR start "rule__Import__Group__2"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2265:1: rule__Import__Group__2 : rule__Import__Group__2__Impl rule__Import__Group__3 ;
	public final void rule__Import__Group__2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2269:1: ( rule__Import__Group__2__Impl rule__Import__Group__3 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2270:2: rule__Import__Group__2__Impl rule__Import__Group__3
			{
				pushFollow(FOLLOW_rule__Import__Group__2__Impl_in_rule__Import__Group__24813);
				rule__Import__Group__2__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Import__Group__3_in_rule__Import__Group__24816);
				rule__Import__Group__3();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Import__Group__2"


	// $ANTLR start "rule__Import__Group__2__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2277:1: rule__Import__Group__2__Impl : ( ( RULE_WS )* ) ;
	public final void rule__Import__Group__2__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2281:1: ( ( ( RULE_WS )* ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2282:1: ( ( RULE_WS )* )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2282:1: ( ( RULE_WS )* )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2283:1: ( RULE_WS )*
				{
					before(grammarAccess.getImportAccess().getWSTerminalRuleCall_2());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2284:1: ( RULE_WS )*
					loop30: do {
						int alt30 = 2;
						int LA30_0 = input.LA(1);

						if ((LA30_0 == RULE_WS)) {
							alt30 = 1;
						}


						switch (alt30) {
						case 1:
						// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2284:3: RULE_WS
						{
							match(input, RULE_WS, FOLLOW_RULE_WS_in_rule__Import__Group__2__Impl4844);

						}
							break;

						default:
							break loop30;
						}
					} while (true);

					after(grammarAccess.getImportAccess().getWSTerminalRuleCall_2());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Import__Group__2__Impl"


	// $ANTLR start "rule__Import__Group__3"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2294:1: rule__Import__Group__3 : rule__Import__Group__3__Impl rule__Import__Group__4 ;
	public final void rule__Import__Group__3() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2298:1: ( rule__Import__Group__3__Impl rule__Import__Group__4 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2299:2: rule__Import__Group__3__Impl rule__Import__Group__4
			{
				pushFollow(FOLLOW_rule__Import__Group__3__Impl_in_rule__Import__Group__34875);
				rule__Import__Group__3__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Import__Group__4_in_rule__Import__Group__34878);
				rule__Import__Group__4();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Import__Group__3"


	// $ANTLR start "rule__Import__Group__3__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2306:1: rule__Import__Group__3__Impl : ( ( rule__Import__Group_3__0 )? ) ;
	public final void rule__Import__Group__3__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2310:1: ( ( ( rule__Import__Group_3__0 )? ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2311:1: ( ( rule__Import__Group_3__0 )? )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2311:1: ( ( rule__Import__Group_3__0 )? )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2312:1: ( rule__Import__Group_3__0 )?
				{
					before(grammarAccess.getImportAccess().getGroup_3());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2313:1: ( rule__Import__Group_3__0 )?
					int alt31 = 2;
					int LA31_0 = input.LA(1);

					if ((LA31_0 == RULE_ID)) {
						alt31 = 1;
					}
					switch (alt31) {
					case 1:
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2313:2: rule__Import__Group_3__0
					{
						pushFollow(FOLLOW_rule__Import__Group_3__0_in_rule__Import__Group__3__Impl4905);
						rule__Import__Group_3__0();

						state._fsp--;


					}
						break;

					}

					after(grammarAccess.getImportAccess().getGroup_3());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Import__Group__3__Impl"


	// $ANTLR start "rule__Import__Group__4"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2323:1: rule__Import__Group__4 : rule__Import__Group__4__Impl rule__Import__Group__5 ;
	public final void rule__Import__Group__4() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2327:1: ( rule__Import__Group__4__Impl rule__Import__Group__5 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2328:2: rule__Import__Group__4__Impl rule__Import__Group__5
			{
				pushFollow(FOLLOW_rule__Import__Group__4__Impl_in_rule__Import__Group__44936);
				rule__Import__Group__4__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Import__Group__5_in_rule__Import__Group__44939);
				rule__Import__Group__5();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Import__Group__4"


	// $ANTLR start "rule__Import__Group__4__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2335:1: rule__Import__Group__4__Impl : ( ';' ) ;
	public final void rule__Import__Group__4__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2339:1: ( ( ';' ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2340:1: ( ';' )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2340:1: ( ';' )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2341:1: ';'
				{
					before(grammarAccess.getImportAccess().getSemicolonKeyword_4());
					match(input, 30, FOLLOW_30_in_rule__Import__Group__4__Impl4967);
					after(grammarAccess.getImportAccess().getSemicolonKeyword_4());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Import__Group__4__Impl"


	// $ANTLR start "rule__Import__Group__5"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2354:1: rule__Import__Group__5 : rule__Import__Group__5__Impl ;
	public final void rule__Import__Group__5() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2358:1: ( rule__Import__Group__5__Impl )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2359:2: rule__Import__Group__5__Impl
			{
				pushFollow(FOLLOW_rule__Import__Group__5__Impl_in_rule__Import__Group__54998);
				rule__Import__Group__5__Impl();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Import__Group__5"


	// $ANTLR start "rule__Import__Group__5__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2365:1: rule__Import__Group__5__Impl : ( ( RULE_WS )* ) ;
	public final void rule__Import__Group__5__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2369:1: ( ( ( RULE_WS )* ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2370:1: ( ( RULE_WS )* )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2370:1: ( ( RULE_WS )* )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2371:1: ( RULE_WS )*
				{
					before(grammarAccess.getImportAccess().getWSTerminalRuleCall_5());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2372:1: ( RULE_WS )*
					loop32: do {
						int alt32 = 2;
						int LA32_0 = input.LA(1);

						if ((LA32_0 == RULE_WS)) {
							alt32 = 1;
						}


						switch (alt32) {
						case 1:
						// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2372:3: RULE_WS
						{
							match(input, RULE_WS, FOLLOW_RULE_WS_in_rule__Import__Group__5__Impl5026);

						}
							break;

						default:
							break loop32;
						}
					} while (true);

					after(grammarAccess.getImportAccess().getWSTerminalRuleCall_5());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Import__Group__5__Impl"


	// $ANTLR start "rule__Import__Group_1_0__0"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2394:1: rule__Import__Group_1_0__0 : rule__Import__Group_1_0__0__Impl rule__Import__Group_1_0__1 ;
	public final void rule__Import__Group_1_0__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2398:1: ( rule__Import__Group_1_0__0__Impl rule__Import__Group_1_0__1 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2399:2: rule__Import__Group_1_0__0__Impl rule__Import__Group_1_0__1
			{
				pushFollow(FOLLOW_rule__Import__Group_1_0__0__Impl_in_rule__Import__Group_1_0__05069);
				rule__Import__Group_1_0__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Import__Group_1_0__1_in_rule__Import__Group_1_0__05072);
				rule__Import__Group_1_0__1();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Import__Group_1_0__0"


	// $ANTLR start "rule__Import__Group_1_0__0__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2406:1: rule__Import__Group_1_0__0__Impl : ( ( RULE_WS )* ) ;
	public final void rule__Import__Group_1_0__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2410:1: ( ( ( RULE_WS )* ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2411:1: ( ( RULE_WS )* )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2411:1: ( ( RULE_WS )* )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2412:1: ( RULE_WS )*
				{
					before(grammarAccess.getImportAccess().getWSTerminalRuleCall_1_0_0());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2413:1: ( RULE_WS )*
					loop33: do {
						int alt33 = 2;
						int LA33_0 = input.LA(1);

						if ((LA33_0 == RULE_WS)) {
							alt33 = 1;
						}


						switch (alt33) {
						case 1:
						// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2413:3: RULE_WS
						{
							match(input, RULE_WS, FOLLOW_RULE_WS_in_rule__Import__Group_1_0__0__Impl5100);

						}
							break;

						default:
							break loop33;
						}
					} while (true);

					after(grammarAccess.getImportAccess().getWSTerminalRuleCall_1_0_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Import__Group_1_0__0__Impl"


	// $ANTLR start "rule__Import__Group_1_0__1"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2423:1: rule__Import__Group_1_0__1 : rule__Import__Group_1_0__1__Impl ;
	public final void rule__Import__Group_1_0__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2427:1: ( rule__Import__Group_1_0__1__Impl )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2428:2: rule__Import__Group_1_0__1__Impl
			{
				pushFollow(FOLLOW_rule__Import__Group_1_0__1__Impl_in_rule__Import__Group_1_0__15131);
				rule__Import__Group_1_0__1__Impl();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Import__Group_1_0__1"


	// $ANTLR start "rule__Import__Group_1_0__1__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2434:1: rule__Import__Group_1_0__1__Impl : ( ( rule__Import__StringAssignment_1_0_1 ) ) ;
	public final void rule__Import__Group_1_0__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2438:1: ( ( ( rule__Import__StringAssignment_1_0_1 ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2439:1: ( ( rule__Import__StringAssignment_1_0_1 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2439:1: ( ( rule__Import__StringAssignment_1_0_1 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2440:1: ( rule__Import__StringAssignment_1_0_1 )
				{
					before(grammarAccess.getImportAccess().getStringAssignment_1_0_1());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2441:1: ( rule__Import__StringAssignment_1_0_1 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2441:2: rule__Import__StringAssignment_1_0_1
					{
						pushFollow(FOLLOW_rule__Import__StringAssignment_1_0_1_in_rule__Import__Group_1_0__1__Impl5158);
						rule__Import__StringAssignment_1_0_1();

						state._fsp--;


					}

					after(grammarAccess.getImportAccess().getStringAssignment_1_0_1());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Import__Group_1_0__1__Impl"


	// $ANTLR start "rule__Import__Group_1_1__0"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2455:1: rule__Import__Group_1_1__0 : rule__Import__Group_1_1__0__Impl rule__Import__Group_1_1__1 ;
	public final void rule__Import__Group_1_1__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2459:1: ( rule__Import__Group_1_1__0__Impl rule__Import__Group_1_1__1 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2460:2: rule__Import__Group_1_1__0__Impl rule__Import__Group_1_1__1
			{
				pushFollow(FOLLOW_rule__Import__Group_1_1__0__Impl_in_rule__Import__Group_1_1__05192);
				rule__Import__Group_1_1__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Import__Group_1_1__1_in_rule__Import__Group_1_1__05195);
				rule__Import__Group_1_1__1();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Import__Group_1_1__0"


	// $ANTLR start "rule__Import__Group_1_1__0__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2467:1: rule__Import__Group_1_1__0__Impl : ( RULE_WS ) ;
	public final void rule__Import__Group_1_1__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2471:1: ( ( RULE_WS ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2472:1: ( RULE_WS )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2472:1: ( RULE_WS )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2473:1: RULE_WS
				{
					before(grammarAccess.getImportAccess().getWSTerminalRuleCall_1_1_0());
					match(input, RULE_WS, FOLLOW_RULE_WS_in_rule__Import__Group_1_1__0__Impl5222);
					after(grammarAccess.getImportAccess().getWSTerminalRuleCall_1_1_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Import__Group_1_1__0__Impl"


	// $ANTLR start "rule__Import__Group_1_1__1"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2484:1: rule__Import__Group_1_1__1 : rule__Import__Group_1_1__1__Impl ;
	public final void rule__Import__Group_1_1__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2488:1: ( rule__Import__Group_1_1__1__Impl )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2489:2: rule__Import__Group_1_1__1__Impl
			{
				pushFollow(FOLLOW_rule__Import__Group_1_1__1__Impl_in_rule__Import__Group_1_1__15251);
				rule__Import__Group_1_1__1__Impl();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Import__Group_1_1__1"


	// $ANTLR start "rule__Import__Group_1_1__1__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2495:1: rule__Import__Group_1_1__1__Impl : ( ( rule__Import__UriAssignment_1_1_1 ) ) ;
	public final void rule__Import__Group_1_1__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2499:1: ( ( ( rule__Import__UriAssignment_1_1_1 ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2500:1: ( ( rule__Import__UriAssignment_1_1_1 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2500:1: ( ( rule__Import__UriAssignment_1_1_1 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2501:1: ( rule__Import__UriAssignment_1_1_1 )
				{
					before(grammarAccess.getImportAccess().getUriAssignment_1_1_1());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2502:1: ( rule__Import__UriAssignment_1_1_1 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2502:2: rule__Import__UriAssignment_1_1_1
					{
						pushFollow(FOLLOW_rule__Import__UriAssignment_1_1_1_in_rule__Import__Group_1_1__1__Impl5278);
						rule__Import__UriAssignment_1_1_1();

						state._fsp--;


					}

					after(grammarAccess.getImportAccess().getUriAssignment_1_1_1());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Import__Group_1_1__1__Impl"


	// $ANTLR start "rule__Import__Group_3__0"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2516:1: rule__Import__Group_3__0 : rule__Import__Group_3__0__Impl rule__Import__Group_3__1 ;
	public final void rule__Import__Group_3__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2520:1: ( rule__Import__Group_3__0__Impl rule__Import__Group_3__1 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2521:2: rule__Import__Group_3__0__Impl rule__Import__Group_3__1
			{
				pushFollow(FOLLOW_rule__Import__Group_3__0__Impl_in_rule__Import__Group_3__05312);
				rule__Import__Group_3__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Import__Group_3__1_in_rule__Import__Group_3__05315);
				rule__Import__Group_3__1();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Import__Group_3__0"


	// $ANTLR start "rule__Import__Group_3__0__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2528:1: rule__Import__Group_3__0__Impl : ( ( rule__Import__MediaAssignment_3_0 ) ) ;
	public final void rule__Import__Group_3__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2532:1: ( ( ( rule__Import__MediaAssignment_3_0 ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2533:1: ( ( rule__Import__MediaAssignment_3_0 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2533:1: ( ( rule__Import__MediaAssignment_3_0 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2534:1: ( rule__Import__MediaAssignment_3_0 )
				{
					before(grammarAccess.getImportAccess().getMediaAssignment_3_0());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2535:1: ( rule__Import__MediaAssignment_3_0 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2535:2: rule__Import__MediaAssignment_3_0
					{
						pushFollow(FOLLOW_rule__Import__MediaAssignment_3_0_in_rule__Import__Group_3__0__Impl5342);
						rule__Import__MediaAssignment_3_0();

						state._fsp--;


					}

					after(grammarAccess.getImportAccess().getMediaAssignment_3_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Import__Group_3__0__Impl"


	// $ANTLR start "rule__Import__Group_3__1"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2545:1: rule__Import__Group_3__1 : rule__Import__Group_3__1__Impl rule__Import__Group_3__2 ;
	public final void rule__Import__Group_3__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2549:1: ( rule__Import__Group_3__1__Impl rule__Import__Group_3__2 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2550:2: rule__Import__Group_3__1__Impl rule__Import__Group_3__2
			{
				pushFollow(FOLLOW_rule__Import__Group_3__1__Impl_in_rule__Import__Group_3__15372);
				rule__Import__Group_3__1__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Import__Group_3__2_in_rule__Import__Group_3__15375);
				rule__Import__Group_3__2();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Import__Group_3__1"


	// $ANTLR start "rule__Import__Group_3__1__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2557:1: rule__Import__Group_3__1__Impl : ( ( RULE_WS )* ) ;
	public final void rule__Import__Group_3__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2561:1: ( ( ( RULE_WS )* ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2562:1: ( ( RULE_WS )* )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2562:1: ( ( RULE_WS )* )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2563:1: ( RULE_WS )*
				{
					before(grammarAccess.getImportAccess().getWSTerminalRuleCall_3_1());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2564:1: ( RULE_WS )*
					loop34: do {
						int alt34 = 2;
						int LA34_0 = input.LA(1);

						if ((LA34_0 == RULE_WS)) {
							alt34 = 1;
						}


						switch (alt34) {
						case 1:
						// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2564:3: RULE_WS
						{
							match(input, RULE_WS, FOLLOW_RULE_WS_in_rule__Import__Group_3__1__Impl5403);

						}
							break;

						default:
							break loop34;
						}
					} while (true);

					after(grammarAccess.getImportAccess().getWSTerminalRuleCall_3_1());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Import__Group_3__1__Impl"


	// $ANTLR start "rule__Import__Group_3__2"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2574:1: rule__Import__Group_3__2 : rule__Import__Group_3__2__Impl ;
	public final void rule__Import__Group_3__2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2578:1: ( rule__Import__Group_3__2__Impl )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2579:2: rule__Import__Group_3__2__Impl
			{
				pushFollow(FOLLOW_rule__Import__Group_3__2__Impl_in_rule__Import__Group_3__25434);
				rule__Import__Group_3__2__Impl();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Import__Group_3__2"


	// $ANTLR start "rule__Import__Group_3__2__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2585:1: rule__Import__Group_3__2__Impl : ( ( rule__Import__Group_3_2__0 )* ) ;
	public final void rule__Import__Group_3__2__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2589:1: ( ( ( rule__Import__Group_3_2__0 )* ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2590:1: ( ( rule__Import__Group_3_2__0 )* )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2590:1: ( ( rule__Import__Group_3_2__0 )* )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2591:1: ( rule__Import__Group_3_2__0 )*
				{
					before(grammarAccess.getImportAccess().getGroup_3_2());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2592:1: ( rule__Import__Group_3_2__0 )*
					loop35: do {
						int alt35 = 2;
						int LA35_0 = input.LA(1);

						if ((LA35_0 == 32)) {
							alt35 = 1;
						}


						switch (alt35) {
						case 1:
						// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2592:2: rule__Import__Group_3_2__0
						{
							pushFollow(FOLLOW_rule__Import__Group_3_2__0_in_rule__Import__Group_3__2__Impl5461);
							rule__Import__Group_3_2__0();

							state._fsp--;


						}
							break;

						default:
							break loop35;
						}
					} while (true);

					after(grammarAccess.getImportAccess().getGroup_3_2());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Import__Group_3__2__Impl"


	// $ANTLR start "rule__Import__Group_3_2__0"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2608:1: rule__Import__Group_3_2__0 : rule__Import__Group_3_2__0__Impl rule__Import__Group_3_2__1 ;
	public final void rule__Import__Group_3_2__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2612:1: ( rule__Import__Group_3_2__0__Impl rule__Import__Group_3_2__1 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2613:2: rule__Import__Group_3_2__0__Impl rule__Import__Group_3_2__1
			{
				pushFollow(FOLLOW_rule__Import__Group_3_2__0__Impl_in_rule__Import__Group_3_2__05498);
				rule__Import__Group_3_2__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Import__Group_3_2__1_in_rule__Import__Group_3_2__05501);
				rule__Import__Group_3_2__1();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Import__Group_3_2__0"


	// $ANTLR start "rule__Import__Group_3_2__0__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2620:1: rule__Import__Group_3_2__0__Impl : ( ',' ) ;
	public final void rule__Import__Group_3_2__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2624:1: ( ( ',' ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2625:1: ( ',' )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2625:1: ( ',' )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2626:1: ','
				{
					before(grammarAccess.getImportAccess().getCommaKeyword_3_2_0());
					match(input, 32, FOLLOW_32_in_rule__Import__Group_3_2__0__Impl5529);
					after(grammarAccess.getImportAccess().getCommaKeyword_3_2_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Import__Group_3_2__0__Impl"


	// $ANTLR start "rule__Import__Group_3_2__1"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2639:1: rule__Import__Group_3_2__1 : rule__Import__Group_3_2__1__Impl rule__Import__Group_3_2__2 ;
	public final void rule__Import__Group_3_2__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2643:1: ( rule__Import__Group_3_2__1__Impl rule__Import__Group_3_2__2 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2644:2: rule__Import__Group_3_2__1__Impl rule__Import__Group_3_2__2
			{
				pushFollow(FOLLOW_rule__Import__Group_3_2__1__Impl_in_rule__Import__Group_3_2__15560);
				rule__Import__Group_3_2__1__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Import__Group_3_2__2_in_rule__Import__Group_3_2__15563);
				rule__Import__Group_3_2__2();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Import__Group_3_2__1"


	// $ANTLR start "rule__Import__Group_3_2__1__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2651:1: rule__Import__Group_3_2__1__Impl : ( ( RULE_WS )* ) ;
	public final void rule__Import__Group_3_2__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2655:1: ( ( ( RULE_WS )* ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2656:1: ( ( RULE_WS )* )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2656:1: ( ( RULE_WS )* )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2657:1: ( RULE_WS )*
				{
					before(grammarAccess.getImportAccess().getWSTerminalRuleCall_3_2_1());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2658:1: ( RULE_WS )*
					loop36: do {
						int alt36 = 2;
						int LA36_0 = input.LA(1);

						if ((LA36_0 == RULE_WS)) {
							alt36 = 1;
						}


						switch (alt36) {
						case 1:
						// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2658:3: RULE_WS
						{
							match(input, RULE_WS, FOLLOW_RULE_WS_in_rule__Import__Group_3_2__1__Impl5591);

						}
							break;

						default:
							break loop36;
						}
					} while (true);

					after(grammarAccess.getImportAccess().getWSTerminalRuleCall_3_2_1());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Import__Group_3_2__1__Impl"


	// $ANTLR start "rule__Import__Group_3_2__2"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2668:1: rule__Import__Group_3_2__2 : rule__Import__Group_3_2__2__Impl ;
	public final void rule__Import__Group_3_2__2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2672:1: ( rule__Import__Group_3_2__2__Impl )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2673:2: rule__Import__Group_3_2__2__Impl
			{
				pushFollow(FOLLOW_rule__Import__Group_3_2__2__Impl_in_rule__Import__Group_3_2__25622);
				rule__Import__Group_3_2__2__Impl();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Import__Group_3_2__2"


	// $ANTLR start "rule__Import__Group_3_2__2__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2679:1: rule__Import__Group_3_2__2__Impl : ( ( rule__Import__MediaAssignment_3_2_2 ) ) ;
	public final void rule__Import__Group_3_2__2__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2683:1: ( ( ( rule__Import__MediaAssignment_3_2_2 ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2684:1: ( ( rule__Import__MediaAssignment_3_2_2 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2684:1: ( ( rule__Import__MediaAssignment_3_2_2 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2685:1: ( rule__Import__MediaAssignment_3_2_2 )
				{
					before(grammarAccess.getImportAccess().getMediaAssignment_3_2_2());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2686:1: ( rule__Import__MediaAssignment_3_2_2 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2686:2: rule__Import__MediaAssignment_3_2_2
					{
						pushFollow(FOLLOW_rule__Import__MediaAssignment_3_2_2_in_rule__Import__Group_3_2__2__Impl5649);
						rule__Import__MediaAssignment_3_2_2();

						state._fsp--;


					}

					after(grammarAccess.getImportAccess().getMediaAssignment_3_2_2());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Import__Group_3_2__2__Impl"


	// $ANTLR start "rule__Media__Group__0"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2702:1: rule__Media__Group__0 : rule__Media__Group__0__Impl rule__Media__Group__1 ;
	public final void rule__Media__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2706:1: ( rule__Media__Group__0__Impl rule__Media__Group__1 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2707:2: rule__Media__Group__0__Impl rule__Media__Group__1
			{
				pushFollow(FOLLOW_rule__Media__Group__0__Impl_in_rule__Media__Group__05685);
				rule__Media__Group__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Media__Group__1_in_rule__Media__Group__05688);
				rule__Media__Group__1();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Media__Group__0"


	// $ANTLR start "rule__Media__Group__0__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2714:1: rule__Media__Group__0__Impl : ( '@media' ) ;
	public final void rule__Media__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2718:1: ( ( '@media' ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2719:1: ( '@media' )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2719:1: ( '@media' )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2720:1: '@media'
				{
					before(grammarAccess.getMediaAccess().getMediaKeyword_0());
					match(input, 33, FOLLOW_33_in_rule__Media__Group__0__Impl5716);
					after(grammarAccess.getMediaAccess().getMediaKeyword_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Media__Group__0__Impl"


	// $ANTLR start "rule__Media__Group__1"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2733:1: rule__Media__Group__1 : rule__Media__Group__1__Impl rule__Media__Group__2 ;
	public final void rule__Media__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2737:1: ( rule__Media__Group__1__Impl rule__Media__Group__2 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2738:2: rule__Media__Group__1__Impl rule__Media__Group__2
			{
				pushFollow(FOLLOW_rule__Media__Group__1__Impl_in_rule__Media__Group__15747);
				rule__Media__Group__1__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Media__Group__2_in_rule__Media__Group__15750);
				rule__Media__Group__2();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Media__Group__1"


	// $ANTLR start "rule__Media__Group__1__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2745:1: rule__Media__Group__1__Impl : ( RULE_WS ) ;
	public final void rule__Media__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2749:1: ( ( RULE_WS ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2750:1: ( RULE_WS )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2750:1: ( RULE_WS )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2751:1: RULE_WS
				{
					before(grammarAccess.getMediaAccess().getWSTerminalRuleCall_1());
					match(input, RULE_WS, FOLLOW_RULE_WS_in_rule__Media__Group__1__Impl5777);
					after(grammarAccess.getMediaAccess().getWSTerminalRuleCall_1());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Media__Group__1__Impl"


	// $ANTLR start "rule__Media__Group__2"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2762:1: rule__Media__Group__2 : rule__Media__Group__2__Impl rule__Media__Group__3 ;
	public final void rule__Media__Group__2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2766:1: ( rule__Media__Group__2__Impl rule__Media__Group__3 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2767:2: rule__Media__Group__2__Impl rule__Media__Group__3
			{
				pushFollow(FOLLOW_rule__Media__Group__2__Impl_in_rule__Media__Group__25806);
				rule__Media__Group__2__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Media__Group__3_in_rule__Media__Group__25809);
				rule__Media__Group__3();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Media__Group__2"


	// $ANTLR start "rule__Media__Group__2__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2774:1: rule__Media__Group__2__Impl : ( ( rule__Media__MediaAssignment_2 ) ) ;
	public final void rule__Media__Group__2__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2778:1: ( ( ( rule__Media__MediaAssignment_2 ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2779:1: ( ( rule__Media__MediaAssignment_2 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2779:1: ( ( rule__Media__MediaAssignment_2 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2780:1: ( rule__Media__MediaAssignment_2 )
				{
					before(grammarAccess.getMediaAccess().getMediaAssignment_2());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2781:1: ( rule__Media__MediaAssignment_2 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2781:2: rule__Media__MediaAssignment_2
					{
						pushFollow(FOLLOW_rule__Media__MediaAssignment_2_in_rule__Media__Group__2__Impl5836);
						rule__Media__MediaAssignment_2();

						state._fsp--;


					}

					after(grammarAccess.getMediaAccess().getMediaAssignment_2());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Media__Group__2__Impl"


	// $ANTLR start "rule__Media__Group__3"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2791:1: rule__Media__Group__3 : rule__Media__Group__3__Impl rule__Media__Group__4 ;
	public final void rule__Media__Group__3() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2795:1: ( rule__Media__Group__3__Impl rule__Media__Group__4 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2796:2: rule__Media__Group__3__Impl rule__Media__Group__4
			{
				pushFollow(FOLLOW_rule__Media__Group__3__Impl_in_rule__Media__Group__35866);
				rule__Media__Group__3__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Media__Group__4_in_rule__Media__Group__35869);
				rule__Media__Group__4();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Media__Group__3"


	// $ANTLR start "rule__Media__Group__3__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2803:1: rule__Media__Group__3__Impl : ( ( RULE_WS )* ) ;
	public final void rule__Media__Group__3__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2807:1: ( ( ( RULE_WS )* ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2808:1: ( ( RULE_WS )* )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2808:1: ( ( RULE_WS )* )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2809:1: ( RULE_WS )*
				{
					before(grammarAccess.getMediaAccess().getWSTerminalRuleCall_3());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2810:1: ( RULE_WS )*
					loop37: do {
						int alt37 = 2;
						int LA37_0 = input.LA(1);

						if ((LA37_0 == RULE_WS)) {
							alt37 = 1;
						}


						switch (alt37) {
						case 1:
						// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2810:3: RULE_WS
						{
							match(input, RULE_WS, FOLLOW_RULE_WS_in_rule__Media__Group__3__Impl5897);

						}
							break;

						default:
							break loop37;
						}
					} while (true);

					after(grammarAccess.getMediaAccess().getWSTerminalRuleCall_3());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Media__Group__3__Impl"


	// $ANTLR start "rule__Media__Group__4"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2820:1: rule__Media__Group__4 : rule__Media__Group__4__Impl rule__Media__Group__5 ;
	public final void rule__Media__Group__4() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2824:1: ( rule__Media__Group__4__Impl rule__Media__Group__5 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2825:2: rule__Media__Group__4__Impl rule__Media__Group__5
			{
				pushFollow(FOLLOW_rule__Media__Group__4__Impl_in_rule__Media__Group__45928);
				rule__Media__Group__4__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Media__Group__5_in_rule__Media__Group__45931);
				rule__Media__Group__5();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Media__Group__4"


	// $ANTLR start "rule__Media__Group__4__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2832:1: rule__Media__Group__4__Impl : ( ( rule__Media__Group_4__0 )* ) ;
	public final void rule__Media__Group__4__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2836:1: ( ( ( rule__Media__Group_4__0 )* ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2837:1: ( ( rule__Media__Group_4__0 )* )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2837:1: ( ( rule__Media__Group_4__0 )* )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2838:1: ( rule__Media__Group_4__0 )*
				{
					before(grammarAccess.getMediaAccess().getGroup_4());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2839:1: ( rule__Media__Group_4__0 )*
					loop38: do {
						int alt38 = 2;
						int LA38_0 = input.LA(1);

						if ((LA38_0 == 32)) {
							alt38 = 1;
						}


						switch (alt38) {
						case 1:
						// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2839:2: rule__Media__Group_4__0
						{
							pushFollow(FOLLOW_rule__Media__Group_4__0_in_rule__Media__Group__4__Impl5958);
							rule__Media__Group_4__0();

							state._fsp--;


						}
							break;

						default:
							break loop38;
						}
					} while (true);

					after(grammarAccess.getMediaAccess().getGroup_4());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Media__Group__4__Impl"


	// $ANTLR start "rule__Media__Group__5"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2849:1: rule__Media__Group__5 : rule__Media__Group__5__Impl rule__Media__Group__6 ;
	public final void rule__Media__Group__5() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2853:1: ( rule__Media__Group__5__Impl rule__Media__Group__6 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2854:2: rule__Media__Group__5__Impl rule__Media__Group__6
			{
				pushFollow(FOLLOW_rule__Media__Group__5__Impl_in_rule__Media__Group__55989);
				rule__Media__Group__5__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Media__Group__6_in_rule__Media__Group__55992);
				rule__Media__Group__6();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Media__Group__5"


	// $ANTLR start "rule__Media__Group__5__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2861:1: rule__Media__Group__5__Impl : ( '{' ) ;
	public final void rule__Media__Group__5__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2865:1: ( ( '{' ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2866:1: ( '{' )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2866:1: ( '{' )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2867:1: '{'
				{
					before(grammarAccess.getMediaAccess().getLeftCurlyBracketKeyword_5());
					match(input, 34, FOLLOW_34_in_rule__Media__Group__5__Impl6020);
					after(grammarAccess.getMediaAccess().getLeftCurlyBracketKeyword_5());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Media__Group__5__Impl"


	// $ANTLR start "rule__Media__Group__6"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2880:1: rule__Media__Group__6 : rule__Media__Group__6__Impl rule__Media__Group__7 ;
	public final void rule__Media__Group__6() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2884:1: ( rule__Media__Group__6__Impl rule__Media__Group__7 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2885:2: rule__Media__Group__6__Impl rule__Media__Group__7
			{
				pushFollow(FOLLOW_rule__Media__Group__6__Impl_in_rule__Media__Group__66051);
				rule__Media__Group__6__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Media__Group__7_in_rule__Media__Group__66054);
				rule__Media__Group__7();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Media__Group__6"


	// $ANTLR start "rule__Media__Group__6__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2892:1: rule__Media__Group__6__Impl : ( ( RULE_WS )* ) ;
	public final void rule__Media__Group__6__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2896:1: ( ( ( RULE_WS )* ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2897:1: ( ( RULE_WS )* )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2897:1: ( ( RULE_WS )* )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2898:1: ( RULE_WS )*
				{
					before(grammarAccess.getMediaAccess().getWSTerminalRuleCall_6());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2899:1: ( RULE_WS )*
					loop39: do {
						int alt39 = 2;
						int LA39_0 = input.LA(1);

						if ((LA39_0 == RULE_WS)) {
							alt39 = 1;
						}


						switch (alt39) {
						case 1:
						// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2899:3: RULE_WS
						{
							match(input, RULE_WS, FOLLOW_RULE_WS_in_rule__Media__Group__6__Impl6082);

						}
							break;

						default:
							break loop39;
						}
					} while (true);

					after(grammarAccess.getMediaAccess().getWSTerminalRuleCall_6());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Media__Group__6__Impl"


	// $ANTLR start "rule__Media__Group__7"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2909:1: rule__Media__Group__7 : rule__Media__Group__7__Impl rule__Media__Group__8 ;
	public final void rule__Media__Group__7() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2913:1: ( rule__Media__Group__7__Impl rule__Media__Group__8 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2914:2: rule__Media__Group__7__Impl rule__Media__Group__8
			{
				pushFollow(FOLLOW_rule__Media__Group__7__Impl_in_rule__Media__Group__76113);
				rule__Media__Group__7__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Media__Group__8_in_rule__Media__Group__76116);
				rule__Media__Group__8();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Media__Group__7"


	// $ANTLR start "rule__Media__Group__7__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2921:1: rule__Media__Group__7__Impl : ( ( rule__Media__RulesAssignment_7 )* ) ;
	public final void rule__Media__Group__7__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2925:1: ( ( ( rule__Media__RulesAssignment_7 )* ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2926:1: ( ( rule__Media__RulesAssignment_7 )* )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2926:1: ( ( rule__Media__RulesAssignment_7 )* )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2927:1: ( rule__Media__RulesAssignment_7 )*
				{
					before(grammarAccess.getMediaAccess().getRulesAssignment_7());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2928:1: ( rule__Media__RulesAssignment_7 )*
					loop40: do {
						int alt40 = 2;
						int LA40_0 = input.LA(1);

						if ((LA40_0 == RULE_ID || (LA40_0 >= RULE_HASH && LA40_0 <= RULE_T_CLASS) || LA40_0 == 22 || LA40_0 == 37 || LA40_0 == 42)) {
							alt40 = 1;
						}


						switch (alt40) {
						case 1:
						// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2928:2: rule__Media__RulesAssignment_7
						{
							pushFollow(FOLLOW_rule__Media__RulesAssignment_7_in_rule__Media__Group__7__Impl6143);
							rule__Media__RulesAssignment_7();

							state._fsp--;


						}
							break;

						default:
							break loop40;
						}
					} while (true);

					after(grammarAccess.getMediaAccess().getRulesAssignment_7());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Media__Group__7__Impl"


	// $ANTLR start "rule__Media__Group__8"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2938:1: rule__Media__Group__8 : rule__Media__Group__8__Impl rule__Media__Group__9 ;
	public final void rule__Media__Group__8() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2942:1: ( rule__Media__Group__8__Impl rule__Media__Group__9 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2943:2: rule__Media__Group__8__Impl rule__Media__Group__9
			{
				pushFollow(FOLLOW_rule__Media__Group__8__Impl_in_rule__Media__Group__86174);
				rule__Media__Group__8__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Media__Group__9_in_rule__Media__Group__86177);
				rule__Media__Group__9();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Media__Group__8"


	// $ANTLR start "rule__Media__Group__8__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2950:1: rule__Media__Group__8__Impl : ( '}' ) ;
	public final void rule__Media__Group__8__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2954:1: ( ( '}' ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2955:1: ( '}' )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2955:1: ( '}' )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2956:1: '}'
				{
					before(grammarAccess.getMediaAccess().getRightCurlyBracketKeyword_8());
					match(input, 35, FOLLOW_35_in_rule__Media__Group__8__Impl6205);
					after(grammarAccess.getMediaAccess().getRightCurlyBracketKeyword_8());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Media__Group__8__Impl"


	// $ANTLR start "rule__Media__Group__9"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2969:1: rule__Media__Group__9 : rule__Media__Group__9__Impl ;
	public final void rule__Media__Group__9() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2973:1: ( rule__Media__Group__9__Impl )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2974:2: rule__Media__Group__9__Impl
			{
				pushFollow(FOLLOW_rule__Media__Group__9__Impl_in_rule__Media__Group__96236);
				rule__Media__Group__9__Impl();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Media__Group__9"


	// $ANTLR start "rule__Media__Group__9__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2980:1: rule__Media__Group__9__Impl : ( ( RULE_WS )* ) ;
	public final void rule__Media__Group__9__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2984:1: ( ( ( RULE_WS )* ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2985:1: ( ( RULE_WS )* )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2985:1: ( ( RULE_WS )* )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2986:1: ( RULE_WS )*
				{
					before(grammarAccess.getMediaAccess().getWSTerminalRuleCall_9());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2987:1: ( RULE_WS )*
					loop41: do {
						int alt41 = 2;
						int LA41_0 = input.LA(1);

						if ((LA41_0 == RULE_WS)) {
							alt41 = 1;
						}


						switch (alt41) {
						case 1:
						// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:2987:3: RULE_WS
						{
							match(input, RULE_WS, FOLLOW_RULE_WS_in_rule__Media__Group__9__Impl6264);

						}
							break;

						default:
							break loop41;
						}
					} while (true);

					after(grammarAccess.getMediaAccess().getWSTerminalRuleCall_9());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Media__Group__9__Impl"


	// $ANTLR start "rule__Media__Group_4__0"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3017:1: rule__Media__Group_4__0 : rule__Media__Group_4__0__Impl rule__Media__Group_4__1 ;
	public final void rule__Media__Group_4__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3021:1: ( rule__Media__Group_4__0__Impl rule__Media__Group_4__1 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3022:2: rule__Media__Group_4__0__Impl rule__Media__Group_4__1
			{
				pushFollow(FOLLOW_rule__Media__Group_4__0__Impl_in_rule__Media__Group_4__06315);
				rule__Media__Group_4__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Media__Group_4__1_in_rule__Media__Group_4__06318);
				rule__Media__Group_4__1();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Media__Group_4__0"


	// $ANTLR start "rule__Media__Group_4__0__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3029:1: rule__Media__Group_4__0__Impl : ( ',' ) ;
	public final void rule__Media__Group_4__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3033:1: ( ( ',' ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3034:1: ( ',' )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3034:1: ( ',' )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3035:1: ','
				{
					before(grammarAccess.getMediaAccess().getCommaKeyword_4_0());
					match(input, 32, FOLLOW_32_in_rule__Media__Group_4__0__Impl6346);
					after(grammarAccess.getMediaAccess().getCommaKeyword_4_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Media__Group_4__0__Impl"


	// $ANTLR start "rule__Media__Group_4__1"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3048:1: rule__Media__Group_4__1 : rule__Media__Group_4__1__Impl rule__Media__Group_4__2 ;
	public final void rule__Media__Group_4__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3052:1: ( rule__Media__Group_4__1__Impl rule__Media__Group_4__2 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3053:2: rule__Media__Group_4__1__Impl rule__Media__Group_4__2
			{
				pushFollow(FOLLOW_rule__Media__Group_4__1__Impl_in_rule__Media__Group_4__16377);
				rule__Media__Group_4__1__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Media__Group_4__2_in_rule__Media__Group_4__16380);
				rule__Media__Group_4__2();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Media__Group_4__1"


	// $ANTLR start "rule__Media__Group_4__1__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3060:1: rule__Media__Group_4__1__Impl : ( ( RULE_WS )* ) ;
	public final void rule__Media__Group_4__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3064:1: ( ( ( RULE_WS )* ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3065:1: ( ( RULE_WS )* )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3065:1: ( ( RULE_WS )* )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3066:1: ( RULE_WS )*
				{
					before(grammarAccess.getMediaAccess().getWSTerminalRuleCall_4_1());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3067:1: ( RULE_WS )*
					loop42: do {
						int alt42 = 2;
						int LA42_0 = input.LA(1);

						if ((LA42_0 == RULE_WS)) {
							alt42 = 1;
						}


						switch (alt42) {
						case 1:
						// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3067:3: RULE_WS
						{
							match(input, RULE_WS, FOLLOW_RULE_WS_in_rule__Media__Group_4__1__Impl6408);

						}
							break;

						default:
							break loop42;
						}
					} while (true);

					after(grammarAccess.getMediaAccess().getWSTerminalRuleCall_4_1());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Media__Group_4__1__Impl"


	// $ANTLR start "rule__Media__Group_4__2"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3077:1: rule__Media__Group_4__2 : rule__Media__Group_4__2__Impl ;
	public final void rule__Media__Group_4__2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3081:1: ( rule__Media__Group_4__2__Impl )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3082:2: rule__Media__Group_4__2__Impl
			{
				pushFollow(FOLLOW_rule__Media__Group_4__2__Impl_in_rule__Media__Group_4__26439);
				rule__Media__Group_4__2__Impl();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Media__Group_4__2"


	// $ANTLR start "rule__Media__Group_4__2__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3088:1: rule__Media__Group_4__2__Impl : ( ( rule__Media__MediaAssignment_4_2 ) ) ;
	public final void rule__Media__Group_4__2__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3092:1: ( ( ( rule__Media__MediaAssignment_4_2 ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3093:1: ( ( rule__Media__MediaAssignment_4_2 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3093:1: ( ( rule__Media__MediaAssignment_4_2 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3094:1: ( rule__Media__MediaAssignment_4_2 )
				{
					before(grammarAccess.getMediaAccess().getMediaAssignment_4_2());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3095:1: ( rule__Media__MediaAssignment_4_2 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3095:2: rule__Media__MediaAssignment_4_2
					{
						pushFollow(FOLLOW_rule__Media__MediaAssignment_4_2_in_rule__Media__Group_4__2__Impl6466);
						rule__Media__MediaAssignment_4_2();

						state._fsp--;


					}

					after(grammarAccess.getMediaAccess().getMediaAssignment_4_2());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Media__Group_4__2__Impl"


	// $ANTLR start "rule__Page__Group__0"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3111:1: rule__Page__Group__0 : rule__Page__Group__0__Impl rule__Page__Group__1 ;
	public final void rule__Page__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3115:1: ( rule__Page__Group__0__Impl rule__Page__Group__1 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3116:2: rule__Page__Group__0__Impl rule__Page__Group__1
			{
				pushFollow(FOLLOW_rule__Page__Group__0__Impl_in_rule__Page__Group__06502);
				rule__Page__Group__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Page__Group__1_in_rule__Page__Group__06505);
				rule__Page__Group__1();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Page__Group__0"


	// $ANTLR start "rule__Page__Group__0__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3123:1: rule__Page__Group__0__Impl : ( () ) ;
	public final void rule__Page__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3127:1: ( ( () ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3128:1: ( () )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3128:1: ( () )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3129:1: ()
				{
					before(grammarAccess.getPageAccess().getPageAction_0());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3130:1: ()
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3132:1:
					{
					}

					after(grammarAccess.getPageAccess().getPageAction_0());

				}


			}

		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Page__Group__0__Impl"


	// $ANTLR start "rule__Page__Group__1"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3142:1: rule__Page__Group__1 : rule__Page__Group__1__Impl rule__Page__Group__2 ;
	public final void rule__Page__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3146:1: ( rule__Page__Group__1__Impl rule__Page__Group__2 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3147:2: rule__Page__Group__1__Impl rule__Page__Group__2
			{
				pushFollow(FOLLOW_rule__Page__Group__1__Impl_in_rule__Page__Group__16563);
				rule__Page__Group__1__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Page__Group__2_in_rule__Page__Group__16566);
				rule__Page__Group__2();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Page__Group__1"


	// $ANTLR start "rule__Page__Group__1__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3154:1: rule__Page__Group__1__Impl : ( '@page' ) ;
	public final void rule__Page__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3158:1: ( ( '@page' ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3159:1: ( '@page' )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3159:1: ( '@page' )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3160:1: '@page'
				{
					before(grammarAccess.getPageAccess().getPageKeyword_1());
					match(input, 36, FOLLOW_36_in_rule__Page__Group__1__Impl6594);
					after(grammarAccess.getPageAccess().getPageKeyword_1());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Page__Group__1__Impl"


	// $ANTLR start "rule__Page__Group__2"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3173:1: rule__Page__Group__2 : rule__Page__Group__2__Impl rule__Page__Group__3 ;
	public final void rule__Page__Group__2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3177:1: ( rule__Page__Group__2__Impl rule__Page__Group__3 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3178:2: rule__Page__Group__2__Impl rule__Page__Group__3
			{
				pushFollow(FOLLOW_rule__Page__Group__2__Impl_in_rule__Page__Group__26625);
				rule__Page__Group__2__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Page__Group__3_in_rule__Page__Group__26628);
				rule__Page__Group__3();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Page__Group__2"


	// $ANTLR start "rule__Page__Group__2__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3185:1: rule__Page__Group__2__Impl : ( ( RULE_WS )* ) ;
	public final void rule__Page__Group__2__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3189:1: ( ( ( RULE_WS )* ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3190:1: ( ( RULE_WS )* )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3190:1: ( ( RULE_WS )* )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3191:1: ( RULE_WS )*
				{
					before(grammarAccess.getPageAccess().getWSTerminalRuleCall_2());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3192:1: ( RULE_WS )*
					loop43: do {
						int alt43 = 2;
						int LA43_0 = input.LA(1);

						if ((LA43_0 == RULE_WS)) {
							alt43 = 1;
						}


						switch (alt43) {
						case 1:
						// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3192:3: RULE_WS
						{
							match(input, RULE_WS, FOLLOW_RULE_WS_in_rule__Page__Group__2__Impl6656);

						}
							break;

						default:
							break loop43;
						}
					} while (true);

					after(grammarAccess.getPageAccess().getWSTerminalRuleCall_2());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Page__Group__2__Impl"


	// $ANTLR start "rule__Page__Group__3"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3202:1: rule__Page__Group__3 : rule__Page__Group__3__Impl rule__Page__Group__4 ;
	public final void rule__Page__Group__3() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3206:1: ( rule__Page__Group__3__Impl rule__Page__Group__4 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3207:2: rule__Page__Group__3__Impl rule__Page__Group__4
			{
				pushFollow(FOLLOW_rule__Page__Group__3__Impl_in_rule__Page__Group__36687);
				rule__Page__Group__3__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Page__Group__4_in_rule__Page__Group__36690);
				rule__Page__Group__4();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Page__Group__3"


	// $ANTLR start "rule__Page__Group__3__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3214:1: rule__Page__Group__3__Impl : ( ( rule__Page__PseudoAssignment_3 )? ) ;
	public final void rule__Page__Group__3__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3218:1: ( ( ( rule__Page__PseudoAssignment_3 )? ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3219:1: ( ( rule__Page__PseudoAssignment_3 )? )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3219:1: ( ( rule__Page__PseudoAssignment_3 )? )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3220:1: ( rule__Page__PseudoAssignment_3 )?
				{
					before(grammarAccess.getPageAccess().getPseudoAssignment_3());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3221:1: ( rule__Page__PseudoAssignment_3 )?
					int alt44 = 2;
					int LA44_0 = input.LA(1);

					if ((LA44_0 == 37)) {
						alt44 = 1;
					}
					switch (alt44) {
					case 1:
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3221:2: rule__Page__PseudoAssignment_3
					{
						pushFollow(FOLLOW_rule__Page__PseudoAssignment_3_in_rule__Page__Group__3__Impl6717);
						rule__Page__PseudoAssignment_3();

						state._fsp--;


					}
						break;

					}

					after(grammarAccess.getPageAccess().getPseudoAssignment_3());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Page__Group__3__Impl"


	// $ANTLR start "rule__Page__Group__4"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3231:1: rule__Page__Group__4 : rule__Page__Group__4__Impl rule__Page__Group__5 ;
	public final void rule__Page__Group__4() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3235:1: ( rule__Page__Group__4__Impl rule__Page__Group__5 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3236:2: rule__Page__Group__4__Impl rule__Page__Group__5
			{
				pushFollow(FOLLOW_rule__Page__Group__4__Impl_in_rule__Page__Group__46748);
				rule__Page__Group__4__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Page__Group__5_in_rule__Page__Group__46751);
				rule__Page__Group__5();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Page__Group__4"


	// $ANTLR start "rule__Page__Group__4__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3243:1: rule__Page__Group__4__Impl : ( '{' ) ;
	public final void rule__Page__Group__4__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3247:1: ( ( '{' ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3248:1: ( '{' )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3248:1: ( '{' )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3249:1: '{'
				{
					before(grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_4());
					match(input, 34, FOLLOW_34_in_rule__Page__Group__4__Impl6779);
					after(grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_4());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Page__Group__4__Impl"


	// $ANTLR start "rule__Page__Group__5"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3262:1: rule__Page__Group__5 : rule__Page__Group__5__Impl rule__Page__Group__6 ;
	public final void rule__Page__Group__5() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3266:1: ( rule__Page__Group__5__Impl rule__Page__Group__6 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3267:2: rule__Page__Group__5__Impl rule__Page__Group__6
			{
				pushFollow(FOLLOW_rule__Page__Group__5__Impl_in_rule__Page__Group__56810);
				rule__Page__Group__5__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Page__Group__6_in_rule__Page__Group__56813);
				rule__Page__Group__6();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Page__Group__5"


	// $ANTLR start "rule__Page__Group__5__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3274:1: rule__Page__Group__5__Impl : ( ( RULE_WS )* ) ;
	public final void rule__Page__Group__5__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3278:1: ( ( ( RULE_WS )* ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3279:1: ( ( RULE_WS )* )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3279:1: ( ( RULE_WS )* )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3280:1: ( RULE_WS )*
				{
					before(grammarAccess.getPageAccess().getWSTerminalRuleCall_5());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3281:1: ( RULE_WS )*
					loop45: do {
						int alt45 = 2;
						int LA45_0 = input.LA(1);

						if ((LA45_0 == RULE_WS)) {
							alt45 = 1;
						}


						switch (alt45) {
						case 1:
						// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3281:3: RULE_WS
						{
							match(input, RULE_WS, FOLLOW_RULE_WS_in_rule__Page__Group__5__Impl6841);

						}
							break;

						default:
							break loop45;
						}
					} while (true);

					after(grammarAccess.getPageAccess().getWSTerminalRuleCall_5());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Page__Group__5__Impl"


	// $ANTLR start "rule__Page__Group__6"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3291:1: rule__Page__Group__6 : rule__Page__Group__6__Impl rule__Page__Group__7 ;
	public final void rule__Page__Group__6() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3295:1: ( rule__Page__Group__6__Impl rule__Page__Group__7 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3296:2: rule__Page__Group__6__Impl rule__Page__Group__7
			{
				pushFollow(FOLLOW_rule__Page__Group__6__Impl_in_rule__Page__Group__66872);
				rule__Page__Group__6__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Page__Group__7_in_rule__Page__Group__66875);
				rule__Page__Group__7();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Page__Group__6"


	// $ANTLR start "rule__Page__Group__6__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3303:1: rule__Page__Group__6__Impl : ( ( rule__Page__DeclarationsAssignment_6 )? ) ;
	public final void rule__Page__Group__6__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3307:1: ( ( ( rule__Page__DeclarationsAssignment_6 )? ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3308:1: ( ( rule__Page__DeclarationsAssignment_6 )? )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3308:1: ( ( rule__Page__DeclarationsAssignment_6 )? )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3309:1: ( rule__Page__DeclarationsAssignment_6 )?
				{
					before(grammarAccess.getPageAccess().getDeclarationsAssignment_6());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3310:1: ( rule__Page__DeclarationsAssignment_6 )?
					int alt46 = 2;
					int LA46_0 = input.LA(1);

					if ((LA46_0 == RULE_ID)) {
						alt46 = 1;
					}
					switch (alt46) {
					case 1:
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3310:2: rule__Page__DeclarationsAssignment_6
					{
						pushFollow(FOLLOW_rule__Page__DeclarationsAssignment_6_in_rule__Page__Group__6__Impl6902);
						rule__Page__DeclarationsAssignment_6();

						state._fsp--;


					}
						break;

					}

					after(grammarAccess.getPageAccess().getDeclarationsAssignment_6());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Page__Group__6__Impl"


	// $ANTLR start "rule__Page__Group__7"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3320:1: rule__Page__Group__7 : rule__Page__Group__7__Impl rule__Page__Group__8 ;
	public final void rule__Page__Group__7() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3324:1: ( rule__Page__Group__7__Impl rule__Page__Group__8 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3325:2: rule__Page__Group__7__Impl rule__Page__Group__8
			{
				pushFollow(FOLLOW_rule__Page__Group__7__Impl_in_rule__Page__Group__76933);
				rule__Page__Group__7__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Page__Group__8_in_rule__Page__Group__76936);
				rule__Page__Group__8();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Page__Group__7"


	// $ANTLR start "rule__Page__Group__7__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3332:1: rule__Page__Group__7__Impl : ( ( rule__Page__Group_7__0 )* ) ;
	public final void rule__Page__Group__7__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3336:1: ( ( ( rule__Page__Group_7__0 )* ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3337:1: ( ( rule__Page__Group_7__0 )* )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3337:1: ( ( rule__Page__Group_7__0 )* )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3338:1: ( rule__Page__Group_7__0 )*
				{
					before(grammarAccess.getPageAccess().getGroup_7());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3339:1: ( rule__Page__Group_7__0 )*
					loop47: do {
						int alt47 = 2;
						int LA47_0 = input.LA(1);

						if ((LA47_0 == 30)) {
							alt47 = 1;
						}


						switch (alt47) {
						case 1:
						// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3339:2: rule__Page__Group_7__0
						{
							pushFollow(FOLLOW_rule__Page__Group_7__0_in_rule__Page__Group__7__Impl6963);
							rule__Page__Group_7__0();

							state._fsp--;


						}
							break;

						default:
							break loop47;
						}
					} while (true);

					after(grammarAccess.getPageAccess().getGroup_7());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Page__Group__7__Impl"


	// $ANTLR start "rule__Page__Group__8"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3349:1: rule__Page__Group__8 : rule__Page__Group__8__Impl rule__Page__Group__9 ;
	public final void rule__Page__Group__8() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3353:1: ( rule__Page__Group__8__Impl rule__Page__Group__9 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3354:2: rule__Page__Group__8__Impl rule__Page__Group__9
			{
				pushFollow(FOLLOW_rule__Page__Group__8__Impl_in_rule__Page__Group__86994);
				rule__Page__Group__8__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Page__Group__9_in_rule__Page__Group__86997);
				rule__Page__Group__9();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Page__Group__8"


	// $ANTLR start "rule__Page__Group__8__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3361:1: rule__Page__Group__8__Impl : ( '}' ) ;
	public final void rule__Page__Group__8__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3365:1: ( ( '}' ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3366:1: ( '}' )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3366:1: ( '}' )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3367:1: '}'
				{
					before(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_8());
					match(input, 35, FOLLOW_35_in_rule__Page__Group__8__Impl7025);
					after(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_8());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Page__Group__8__Impl"


	// $ANTLR start "rule__Page__Group__9"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3380:1: rule__Page__Group__9 : rule__Page__Group__9__Impl ;
	public final void rule__Page__Group__9() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3384:1: ( rule__Page__Group__9__Impl )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3385:2: rule__Page__Group__9__Impl
			{
				pushFollow(FOLLOW_rule__Page__Group__9__Impl_in_rule__Page__Group__97056);
				rule__Page__Group__9__Impl();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Page__Group__9"


	// $ANTLR start "rule__Page__Group__9__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3391:1: rule__Page__Group__9__Impl : ( ( RULE_WS )* ) ;
	public final void rule__Page__Group__9__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3395:1: ( ( ( RULE_WS )* ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3396:1: ( ( RULE_WS )* )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3396:1: ( ( RULE_WS )* )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3397:1: ( RULE_WS )*
				{
					before(grammarAccess.getPageAccess().getWSTerminalRuleCall_9());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3398:1: ( RULE_WS )*
					loop48: do {
						int alt48 = 2;
						int LA48_0 = input.LA(1);

						if ((LA48_0 == RULE_WS)) {
							alt48 = 1;
						}


						switch (alt48) {
						case 1:
						// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3398:3: RULE_WS
						{
							match(input, RULE_WS, FOLLOW_RULE_WS_in_rule__Page__Group__9__Impl7084);

						}
							break;

						default:
							break loop48;
						}
					} while (true);

					after(grammarAccess.getPageAccess().getWSTerminalRuleCall_9());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Page__Group__9__Impl"


	// $ANTLR start "rule__Page__Group_7__0"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3428:1: rule__Page__Group_7__0 : rule__Page__Group_7__0__Impl rule__Page__Group_7__1 ;
	public final void rule__Page__Group_7__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3432:1: ( rule__Page__Group_7__0__Impl rule__Page__Group_7__1 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3433:2: rule__Page__Group_7__0__Impl rule__Page__Group_7__1
			{
				pushFollow(FOLLOW_rule__Page__Group_7__0__Impl_in_rule__Page__Group_7__07135);
				rule__Page__Group_7__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Page__Group_7__1_in_rule__Page__Group_7__07138);
				rule__Page__Group_7__1();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Page__Group_7__0"


	// $ANTLR start "rule__Page__Group_7__0__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3440:1: rule__Page__Group_7__0__Impl : ( ';' ) ;
	public final void rule__Page__Group_7__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3444:1: ( ( ';' ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3445:1: ( ';' )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3445:1: ( ';' )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3446:1: ';'
				{
					before(grammarAccess.getPageAccess().getSemicolonKeyword_7_0());
					match(input, 30, FOLLOW_30_in_rule__Page__Group_7__0__Impl7166);
					after(grammarAccess.getPageAccess().getSemicolonKeyword_7_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Page__Group_7__0__Impl"


	// $ANTLR start "rule__Page__Group_7__1"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3459:1: rule__Page__Group_7__1 : rule__Page__Group_7__1__Impl rule__Page__Group_7__2 ;
	public final void rule__Page__Group_7__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3463:1: ( rule__Page__Group_7__1__Impl rule__Page__Group_7__2 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3464:2: rule__Page__Group_7__1__Impl rule__Page__Group_7__2
			{
				pushFollow(FOLLOW_rule__Page__Group_7__1__Impl_in_rule__Page__Group_7__17197);
				rule__Page__Group_7__1__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Page__Group_7__2_in_rule__Page__Group_7__17200);
				rule__Page__Group_7__2();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Page__Group_7__1"


	// $ANTLR start "rule__Page__Group_7__1__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3471:1: rule__Page__Group_7__1__Impl : ( ( RULE_WS )* ) ;
	public final void rule__Page__Group_7__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3475:1: ( ( ( RULE_WS )* ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3476:1: ( ( RULE_WS )* )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3476:1: ( ( RULE_WS )* )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3477:1: ( RULE_WS )*
				{
					before(grammarAccess.getPageAccess().getWSTerminalRuleCall_7_1());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3478:1: ( RULE_WS )*
					loop49: do {
						int alt49 = 2;
						int LA49_0 = input.LA(1);

						if ((LA49_0 == RULE_WS)) {
							alt49 = 1;
						}


						switch (alt49) {
						case 1:
						// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3478:3: RULE_WS
						{
							match(input, RULE_WS, FOLLOW_RULE_WS_in_rule__Page__Group_7__1__Impl7228);

						}
							break;

						default:
							break loop49;
						}
					} while (true);

					after(grammarAccess.getPageAccess().getWSTerminalRuleCall_7_1());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Page__Group_7__1__Impl"


	// $ANTLR start "rule__Page__Group_7__2"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3488:1: rule__Page__Group_7__2 : rule__Page__Group_7__2__Impl ;
	public final void rule__Page__Group_7__2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3492:1: ( rule__Page__Group_7__2__Impl )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3493:2: rule__Page__Group_7__2__Impl
			{
				pushFollow(FOLLOW_rule__Page__Group_7__2__Impl_in_rule__Page__Group_7__27259);
				rule__Page__Group_7__2__Impl();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Page__Group_7__2"


	// $ANTLR start "rule__Page__Group_7__2__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3499:1: rule__Page__Group_7__2__Impl : ( ( rule__Page__DeclarationsAssignment_7_2 )? ) ;
	public final void rule__Page__Group_7__2__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3503:1: ( ( ( rule__Page__DeclarationsAssignment_7_2 )? ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3504:1: ( ( rule__Page__DeclarationsAssignment_7_2 )? )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3504:1: ( ( rule__Page__DeclarationsAssignment_7_2 )? )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3505:1: ( rule__Page__DeclarationsAssignment_7_2 )?
				{
					before(grammarAccess.getPageAccess().getDeclarationsAssignment_7_2());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3506:1: ( rule__Page__DeclarationsAssignment_7_2 )?
					int alt50 = 2;
					int LA50_0 = input.LA(1);

					if ((LA50_0 == RULE_ID)) {
						alt50 = 1;
					}
					switch (alt50) {
					case 1:
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3506:2: rule__Page__DeclarationsAssignment_7_2
					{
						pushFollow(FOLLOW_rule__Page__DeclarationsAssignment_7_2_in_rule__Page__Group_7__2__Impl7286);
						rule__Page__DeclarationsAssignment_7_2();

						state._fsp--;


					}
						break;

					}

					after(grammarAccess.getPageAccess().getDeclarationsAssignment_7_2());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Page__Group_7__2__Impl"


	// $ANTLR start "rule__PseudoPage__Group__0"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3522:1: rule__PseudoPage__Group__0 : rule__PseudoPage__Group__0__Impl rule__PseudoPage__Group__1 ;
	public final void rule__PseudoPage__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3526:1: ( rule__PseudoPage__Group__0__Impl rule__PseudoPage__Group__1 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3527:2: rule__PseudoPage__Group__0__Impl rule__PseudoPage__Group__1
			{
				pushFollow(FOLLOW_rule__PseudoPage__Group__0__Impl_in_rule__PseudoPage__Group__07323);
				rule__PseudoPage__Group__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__PseudoPage__Group__1_in_rule__PseudoPage__Group__07326);
				rule__PseudoPage__Group__1();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__PseudoPage__Group__0"


	// $ANTLR start "rule__PseudoPage__Group__0__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3534:1: rule__PseudoPage__Group__0__Impl : ( ':' ) ;
	public final void rule__PseudoPage__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3538:1: ( ( ':' ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3539:1: ( ':' )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3539:1: ( ':' )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3540:1: ':'
				{
					before(grammarAccess.getPseudoPageAccess().getColonKeyword_0());
					match(input, 37, FOLLOW_37_in_rule__PseudoPage__Group__0__Impl7354);
					after(grammarAccess.getPseudoPageAccess().getColonKeyword_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__PseudoPage__Group__0__Impl"


	// $ANTLR start "rule__PseudoPage__Group__1"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3553:1: rule__PseudoPage__Group__1 : rule__PseudoPage__Group__1__Impl rule__PseudoPage__Group__2 ;
	public final void rule__PseudoPage__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3557:1: ( rule__PseudoPage__Group__1__Impl rule__PseudoPage__Group__2 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3558:2: rule__PseudoPage__Group__1__Impl rule__PseudoPage__Group__2
			{
				pushFollow(FOLLOW_rule__PseudoPage__Group__1__Impl_in_rule__PseudoPage__Group__17385);
				rule__PseudoPage__Group__1__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__PseudoPage__Group__2_in_rule__PseudoPage__Group__17388);
				rule__PseudoPage__Group__2();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__PseudoPage__Group__1"


	// $ANTLR start "rule__PseudoPage__Group__1__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3565:1: rule__PseudoPage__Group__1__Impl : ( ( rule__PseudoPage__IdAssignment_1 ) ) ;
	public final void rule__PseudoPage__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3569:1: ( ( ( rule__PseudoPage__IdAssignment_1 ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3570:1: ( ( rule__PseudoPage__IdAssignment_1 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3570:1: ( ( rule__PseudoPage__IdAssignment_1 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3571:1: ( rule__PseudoPage__IdAssignment_1 )
				{
					before(grammarAccess.getPseudoPageAccess().getIdAssignment_1());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3572:1: ( rule__PseudoPage__IdAssignment_1 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3572:2: rule__PseudoPage__IdAssignment_1
					{
						pushFollow(FOLLOW_rule__PseudoPage__IdAssignment_1_in_rule__PseudoPage__Group__1__Impl7415);
						rule__PseudoPage__IdAssignment_1();

						state._fsp--;


					}

					after(grammarAccess.getPseudoPageAccess().getIdAssignment_1());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__PseudoPage__Group__1__Impl"


	// $ANTLR start "rule__PseudoPage__Group__2"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3582:1: rule__PseudoPage__Group__2 : rule__PseudoPage__Group__2__Impl ;
	public final void rule__PseudoPage__Group__2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3586:1: ( rule__PseudoPage__Group__2__Impl )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3587:2: rule__PseudoPage__Group__2__Impl
			{
				pushFollow(FOLLOW_rule__PseudoPage__Group__2__Impl_in_rule__PseudoPage__Group__27445);
				rule__PseudoPage__Group__2__Impl();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__PseudoPage__Group__2"


	// $ANTLR start "rule__PseudoPage__Group__2__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3593:1: rule__PseudoPage__Group__2__Impl : ( ( RULE_WS )* ) ;
	public final void rule__PseudoPage__Group__2__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3597:1: ( ( ( RULE_WS )* ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3598:1: ( ( RULE_WS )* )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3598:1: ( ( RULE_WS )* )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3599:1: ( RULE_WS )*
				{
					before(grammarAccess.getPseudoPageAccess().getWSTerminalRuleCall_2());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3600:1: ( RULE_WS )*
					loop51: do {
						int alt51 = 2;
						int LA51_0 = input.LA(1);

						if ((LA51_0 == RULE_WS)) {
							alt51 = 1;
						}


						switch (alt51) {
						case 1:
						// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3600:3: RULE_WS
						{
							match(input, RULE_WS, FOLLOW_RULE_WS_in_rule__PseudoPage__Group__2__Impl7473);

						}
							break;

						default:
							break loop51;
						}
					} while (true);

					after(grammarAccess.getPseudoPageAccess().getWSTerminalRuleCall_2());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__PseudoPage__Group__2__Impl"


	// $ANTLR start "rule__Ruleset__Group__0"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3616:1: rule__Ruleset__Group__0 : rule__Ruleset__Group__0__Impl rule__Ruleset__Group__1 ;
	public final void rule__Ruleset__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3620:1: ( rule__Ruleset__Group__0__Impl rule__Ruleset__Group__1 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3621:2: rule__Ruleset__Group__0__Impl rule__Ruleset__Group__1
			{
				pushFollow(FOLLOW_rule__Ruleset__Group__0__Impl_in_rule__Ruleset__Group__07510);
				rule__Ruleset__Group__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Ruleset__Group__1_in_rule__Ruleset__Group__07513);
				rule__Ruleset__Group__1();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Ruleset__Group__0"


	// $ANTLR start "rule__Ruleset__Group__0__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3628:1: rule__Ruleset__Group__0__Impl : ( ( rule__Ruleset__SelectorsAssignment_0 ) ) ;
	public final void rule__Ruleset__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3632:1: ( ( ( rule__Ruleset__SelectorsAssignment_0 ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3633:1: ( ( rule__Ruleset__SelectorsAssignment_0 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3633:1: ( ( rule__Ruleset__SelectorsAssignment_0 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3634:1: ( rule__Ruleset__SelectorsAssignment_0 )
				{
					before(grammarAccess.getRulesetAccess().getSelectorsAssignment_0());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3635:1: ( rule__Ruleset__SelectorsAssignment_0 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3635:2: rule__Ruleset__SelectorsAssignment_0
					{
						pushFollow(FOLLOW_rule__Ruleset__SelectorsAssignment_0_in_rule__Ruleset__Group__0__Impl7540);
						rule__Ruleset__SelectorsAssignment_0();

						state._fsp--;


					}

					after(grammarAccess.getRulesetAccess().getSelectorsAssignment_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Ruleset__Group__0__Impl"


	// $ANTLR start "rule__Ruleset__Group__1"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3645:1: rule__Ruleset__Group__1 : rule__Ruleset__Group__1__Impl rule__Ruleset__Group__2 ;
	public final void rule__Ruleset__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3649:1: ( rule__Ruleset__Group__1__Impl rule__Ruleset__Group__2 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3650:2: rule__Ruleset__Group__1__Impl rule__Ruleset__Group__2
			{
				pushFollow(FOLLOW_rule__Ruleset__Group__1__Impl_in_rule__Ruleset__Group__17570);
				rule__Ruleset__Group__1__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Ruleset__Group__2_in_rule__Ruleset__Group__17573);
				rule__Ruleset__Group__2();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Ruleset__Group__1"


	// $ANTLR start "rule__Ruleset__Group__1__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3657:1: rule__Ruleset__Group__1__Impl : ( ( rule__Ruleset__Group_1__0 )* ) ;
	public final void rule__Ruleset__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3661:1: ( ( ( rule__Ruleset__Group_1__0 )* ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3662:1: ( ( rule__Ruleset__Group_1__0 )* )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3662:1: ( ( rule__Ruleset__Group_1__0 )* )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3663:1: ( rule__Ruleset__Group_1__0 )*
				{
					before(grammarAccess.getRulesetAccess().getGroup_1());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3664:1: ( rule__Ruleset__Group_1__0 )*
					loop52: do {
						int alt52 = 2;
						int LA52_0 = input.LA(1);

						if ((LA52_0 == 32)) {
							alt52 = 1;
						}


						switch (alt52) {
						case 1:
						// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3664:2: rule__Ruleset__Group_1__0
						{
							pushFollow(FOLLOW_rule__Ruleset__Group_1__0_in_rule__Ruleset__Group__1__Impl7600);
							rule__Ruleset__Group_1__0();

							state._fsp--;


						}
							break;

						default:
							break loop52;
						}
					} while (true);

					after(grammarAccess.getRulesetAccess().getGroup_1());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Ruleset__Group__1__Impl"


	// $ANTLR start "rule__Ruleset__Group__2"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3674:1: rule__Ruleset__Group__2 : rule__Ruleset__Group__2__Impl rule__Ruleset__Group__3 ;
	public final void rule__Ruleset__Group__2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3678:1: ( rule__Ruleset__Group__2__Impl rule__Ruleset__Group__3 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3679:2: rule__Ruleset__Group__2__Impl rule__Ruleset__Group__3
			{
				pushFollow(FOLLOW_rule__Ruleset__Group__2__Impl_in_rule__Ruleset__Group__27631);
				rule__Ruleset__Group__2__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Ruleset__Group__3_in_rule__Ruleset__Group__27634);
				rule__Ruleset__Group__3();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Ruleset__Group__2"


	// $ANTLR start "rule__Ruleset__Group__2__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3686:1: rule__Ruleset__Group__2__Impl : ( '{' ) ;
	public final void rule__Ruleset__Group__2__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3690:1: ( ( '{' ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3691:1: ( '{' )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3691:1: ( '{' )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3692:1: '{'
				{
					before(grammarAccess.getRulesetAccess().getLeftCurlyBracketKeyword_2());
					match(input, 34, FOLLOW_34_in_rule__Ruleset__Group__2__Impl7662);
					after(grammarAccess.getRulesetAccess().getLeftCurlyBracketKeyword_2());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Ruleset__Group__2__Impl"


	// $ANTLR start "rule__Ruleset__Group__3"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3705:1: rule__Ruleset__Group__3 : rule__Ruleset__Group__3__Impl rule__Ruleset__Group__4 ;
	public final void rule__Ruleset__Group__3() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3709:1: ( rule__Ruleset__Group__3__Impl rule__Ruleset__Group__4 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3710:2: rule__Ruleset__Group__3__Impl rule__Ruleset__Group__4
			{
				pushFollow(FOLLOW_rule__Ruleset__Group__3__Impl_in_rule__Ruleset__Group__37693);
				rule__Ruleset__Group__3__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Ruleset__Group__4_in_rule__Ruleset__Group__37696);
				rule__Ruleset__Group__4();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Ruleset__Group__3"


	// $ANTLR start "rule__Ruleset__Group__3__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3717:1: rule__Ruleset__Group__3__Impl : ( ( RULE_WS )* ) ;
	public final void rule__Ruleset__Group__3__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3721:1: ( ( ( RULE_WS )* ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3722:1: ( ( RULE_WS )* )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3722:1: ( ( RULE_WS )* )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3723:1: ( RULE_WS )*
				{
					before(grammarAccess.getRulesetAccess().getWSTerminalRuleCall_3());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3724:1: ( RULE_WS )*
					loop53: do {
						int alt53 = 2;
						int LA53_0 = input.LA(1);

						if ((LA53_0 == RULE_WS)) {
							alt53 = 1;
						}


						switch (alt53) {
						case 1:
						// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3724:3: RULE_WS
						{
							match(input, RULE_WS, FOLLOW_RULE_WS_in_rule__Ruleset__Group__3__Impl7724);

						}
							break;

						default:
							break loop53;
						}
					} while (true);

					after(grammarAccess.getRulesetAccess().getWSTerminalRuleCall_3());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Ruleset__Group__3__Impl"


	// $ANTLR start "rule__Ruleset__Group__4"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3734:1: rule__Ruleset__Group__4 : rule__Ruleset__Group__4__Impl rule__Ruleset__Group__5 ;
	public final void rule__Ruleset__Group__4() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3738:1: ( rule__Ruleset__Group__4__Impl rule__Ruleset__Group__5 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3739:2: rule__Ruleset__Group__4__Impl rule__Ruleset__Group__5
			{
				pushFollow(FOLLOW_rule__Ruleset__Group__4__Impl_in_rule__Ruleset__Group__47755);
				rule__Ruleset__Group__4__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Ruleset__Group__5_in_rule__Ruleset__Group__47758);
				rule__Ruleset__Group__5();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Ruleset__Group__4"


	// $ANTLR start "rule__Ruleset__Group__4__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3746:1: rule__Ruleset__Group__4__Impl : ( ( rule__Ruleset__PropertiesAssignment_4 )? ) ;
	public final void rule__Ruleset__Group__4__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3750:1: ( ( ( rule__Ruleset__PropertiesAssignment_4 )? ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3751:1: ( ( rule__Ruleset__PropertiesAssignment_4 )? )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3751:1: ( ( rule__Ruleset__PropertiesAssignment_4 )? )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3752:1: ( rule__Ruleset__PropertiesAssignment_4 )?
				{
					before(grammarAccess.getRulesetAccess().getPropertiesAssignment_4());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3753:1: ( rule__Ruleset__PropertiesAssignment_4 )?
					int alt54 = 2;
					int LA54_0 = input.LA(1);

					if ((LA54_0 == RULE_ID)) {
						alt54 = 1;
					}
					switch (alt54) {
					case 1:
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3753:2: rule__Ruleset__PropertiesAssignment_4
					{
						pushFollow(FOLLOW_rule__Ruleset__PropertiesAssignment_4_in_rule__Ruleset__Group__4__Impl7785);
						rule__Ruleset__PropertiesAssignment_4();

						state._fsp--;


					}
						break;

					}

					after(grammarAccess.getRulesetAccess().getPropertiesAssignment_4());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Ruleset__Group__4__Impl"


	// $ANTLR start "rule__Ruleset__Group__5"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3763:1: rule__Ruleset__Group__5 : rule__Ruleset__Group__5__Impl rule__Ruleset__Group__6 ;
	public final void rule__Ruleset__Group__5() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3767:1: ( rule__Ruleset__Group__5__Impl rule__Ruleset__Group__6 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3768:2: rule__Ruleset__Group__5__Impl rule__Ruleset__Group__6
			{
				pushFollow(FOLLOW_rule__Ruleset__Group__5__Impl_in_rule__Ruleset__Group__57816);
				rule__Ruleset__Group__5__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Ruleset__Group__6_in_rule__Ruleset__Group__57819);
				rule__Ruleset__Group__6();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Ruleset__Group__5"


	// $ANTLR start "rule__Ruleset__Group__5__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3775:1: rule__Ruleset__Group__5__Impl : ( ( rule__Ruleset__Group_5__0 )* ) ;
	public final void rule__Ruleset__Group__5__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3779:1: ( ( ( rule__Ruleset__Group_5__0 )* ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3780:1: ( ( rule__Ruleset__Group_5__0 )* )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3780:1: ( ( rule__Ruleset__Group_5__0 )* )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3781:1: ( rule__Ruleset__Group_5__0 )*
				{
					before(grammarAccess.getRulesetAccess().getGroup_5());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3782:1: ( rule__Ruleset__Group_5__0 )*
					loop55: do {
						int alt55 = 2;
						int LA55_0 = input.LA(1);

						if ((LA55_0 == 30)) {
							alt55 = 1;
						}


						switch (alt55) {
						case 1:
						// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3782:2: rule__Ruleset__Group_5__0
						{
							pushFollow(FOLLOW_rule__Ruleset__Group_5__0_in_rule__Ruleset__Group__5__Impl7846);
							rule__Ruleset__Group_5__0();

							state._fsp--;


						}
							break;

						default:
							break loop55;
						}
					} while (true);

					after(grammarAccess.getRulesetAccess().getGroup_5());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Ruleset__Group__5__Impl"


	// $ANTLR start "rule__Ruleset__Group__6"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3792:1: rule__Ruleset__Group__6 : rule__Ruleset__Group__6__Impl rule__Ruleset__Group__7 ;
	public final void rule__Ruleset__Group__6() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3796:1: ( rule__Ruleset__Group__6__Impl rule__Ruleset__Group__7 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3797:2: rule__Ruleset__Group__6__Impl rule__Ruleset__Group__7
			{
				pushFollow(FOLLOW_rule__Ruleset__Group__6__Impl_in_rule__Ruleset__Group__67877);
				rule__Ruleset__Group__6__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Ruleset__Group__7_in_rule__Ruleset__Group__67880);
				rule__Ruleset__Group__7();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Ruleset__Group__6"


	// $ANTLR start "rule__Ruleset__Group__6__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3804:1: rule__Ruleset__Group__6__Impl : ( '}' ) ;
	public final void rule__Ruleset__Group__6__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3808:1: ( ( '}' ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3809:1: ( '}' )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3809:1: ( '}' )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3810:1: '}'
				{
					before(grammarAccess.getRulesetAccess().getRightCurlyBracketKeyword_6());
					match(input, 35, FOLLOW_35_in_rule__Ruleset__Group__6__Impl7908);
					after(grammarAccess.getRulesetAccess().getRightCurlyBracketKeyword_6());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Ruleset__Group__6__Impl"


	// $ANTLR start "rule__Ruleset__Group__7"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3823:1: rule__Ruleset__Group__7 : rule__Ruleset__Group__7__Impl ;
	public final void rule__Ruleset__Group__7() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3827:1: ( rule__Ruleset__Group__7__Impl )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3828:2: rule__Ruleset__Group__7__Impl
			{
				pushFollow(FOLLOW_rule__Ruleset__Group__7__Impl_in_rule__Ruleset__Group__77939);
				rule__Ruleset__Group__7__Impl();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Ruleset__Group__7"


	// $ANTLR start "rule__Ruleset__Group__7__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3834:1: rule__Ruleset__Group__7__Impl : ( ( RULE_WS )* ) ;
	public final void rule__Ruleset__Group__7__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3838:1: ( ( ( RULE_WS )* ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3839:1: ( ( RULE_WS )* )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3839:1: ( ( RULE_WS )* )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3840:1: ( RULE_WS )*
				{
					before(grammarAccess.getRulesetAccess().getWSTerminalRuleCall_7());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3841:1: ( RULE_WS )*
					loop56: do {
						int alt56 = 2;
						int LA56_0 = input.LA(1);

						if ((LA56_0 == RULE_WS)) {
							alt56 = 1;
						}


						switch (alt56) {
						case 1:
						// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3841:3: RULE_WS
						{
							match(input, RULE_WS, FOLLOW_RULE_WS_in_rule__Ruleset__Group__7__Impl7967);

						}
							break;

						default:
							break loop56;
						}
					} while (true);

					after(grammarAccess.getRulesetAccess().getWSTerminalRuleCall_7());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Ruleset__Group__7__Impl"


	// $ANTLR start "rule__Ruleset__Group_1__0"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3867:1: rule__Ruleset__Group_1__0 : rule__Ruleset__Group_1__0__Impl rule__Ruleset__Group_1__1 ;
	public final void rule__Ruleset__Group_1__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3871:1: ( rule__Ruleset__Group_1__0__Impl rule__Ruleset__Group_1__1 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3872:2: rule__Ruleset__Group_1__0__Impl rule__Ruleset__Group_1__1
			{
				pushFollow(FOLLOW_rule__Ruleset__Group_1__0__Impl_in_rule__Ruleset__Group_1__08014);
				rule__Ruleset__Group_1__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Ruleset__Group_1__1_in_rule__Ruleset__Group_1__08017);
				rule__Ruleset__Group_1__1();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Ruleset__Group_1__0"


	// $ANTLR start "rule__Ruleset__Group_1__0__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3879:1: rule__Ruleset__Group_1__0__Impl : ( ',' ) ;
	public final void rule__Ruleset__Group_1__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3883:1: ( ( ',' ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3884:1: ( ',' )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3884:1: ( ',' )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3885:1: ','
				{
					before(grammarAccess.getRulesetAccess().getCommaKeyword_1_0());
					match(input, 32, FOLLOW_32_in_rule__Ruleset__Group_1__0__Impl8045);
					after(grammarAccess.getRulesetAccess().getCommaKeyword_1_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Ruleset__Group_1__0__Impl"


	// $ANTLR start "rule__Ruleset__Group_1__1"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3898:1: rule__Ruleset__Group_1__1 : rule__Ruleset__Group_1__1__Impl rule__Ruleset__Group_1__2 ;
	public final void rule__Ruleset__Group_1__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3902:1: ( rule__Ruleset__Group_1__1__Impl rule__Ruleset__Group_1__2 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3903:2: rule__Ruleset__Group_1__1__Impl rule__Ruleset__Group_1__2
			{
				pushFollow(FOLLOW_rule__Ruleset__Group_1__1__Impl_in_rule__Ruleset__Group_1__18076);
				rule__Ruleset__Group_1__1__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Ruleset__Group_1__2_in_rule__Ruleset__Group_1__18079);
				rule__Ruleset__Group_1__2();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Ruleset__Group_1__1"


	// $ANTLR start "rule__Ruleset__Group_1__1__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3910:1: rule__Ruleset__Group_1__1__Impl : ( ( RULE_WS )* ) ;
	public final void rule__Ruleset__Group_1__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3914:1: ( ( ( RULE_WS )* ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3915:1: ( ( RULE_WS )* )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3915:1: ( ( RULE_WS )* )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3916:1: ( RULE_WS )*
				{
					before(grammarAccess.getRulesetAccess().getWSTerminalRuleCall_1_1());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3917:1: ( RULE_WS )*
					loop57: do {
						int alt57 = 2;
						int LA57_0 = input.LA(1);

						if ((LA57_0 == RULE_WS)) {
							alt57 = 1;
						}


						switch (alt57) {
						case 1:
						// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3917:3: RULE_WS
						{
							match(input, RULE_WS, FOLLOW_RULE_WS_in_rule__Ruleset__Group_1__1__Impl8107);

						}
							break;

						default:
							break loop57;
						}
					} while (true);

					after(grammarAccess.getRulesetAccess().getWSTerminalRuleCall_1_1());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Ruleset__Group_1__1__Impl"


	// $ANTLR start "rule__Ruleset__Group_1__2"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3927:1: rule__Ruleset__Group_1__2 : rule__Ruleset__Group_1__2__Impl ;
	public final void rule__Ruleset__Group_1__2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3931:1: ( rule__Ruleset__Group_1__2__Impl )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3932:2: rule__Ruleset__Group_1__2__Impl
			{
				pushFollow(FOLLOW_rule__Ruleset__Group_1__2__Impl_in_rule__Ruleset__Group_1__28138);
				rule__Ruleset__Group_1__2__Impl();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Ruleset__Group_1__2"


	// $ANTLR start "rule__Ruleset__Group_1__2__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3938:1: rule__Ruleset__Group_1__2__Impl : ( ( rule__Ruleset__SelectorsAssignment_1_2 ) ) ;
	public final void rule__Ruleset__Group_1__2__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3942:1: ( ( ( rule__Ruleset__SelectorsAssignment_1_2 ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3943:1: ( ( rule__Ruleset__SelectorsAssignment_1_2 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3943:1: ( ( rule__Ruleset__SelectorsAssignment_1_2 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3944:1: ( rule__Ruleset__SelectorsAssignment_1_2 )
				{
					before(grammarAccess.getRulesetAccess().getSelectorsAssignment_1_2());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3945:1: ( rule__Ruleset__SelectorsAssignment_1_2 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3945:2: rule__Ruleset__SelectorsAssignment_1_2
					{
						pushFollow(FOLLOW_rule__Ruleset__SelectorsAssignment_1_2_in_rule__Ruleset__Group_1__2__Impl8165);
						rule__Ruleset__SelectorsAssignment_1_2();

						state._fsp--;


					}

					after(grammarAccess.getRulesetAccess().getSelectorsAssignment_1_2());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Ruleset__Group_1__2__Impl"


	// $ANTLR start "rule__Ruleset__Group_5__0"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3961:1: rule__Ruleset__Group_5__0 : rule__Ruleset__Group_5__0__Impl rule__Ruleset__Group_5__1 ;
	public final void rule__Ruleset__Group_5__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3965:1: ( rule__Ruleset__Group_5__0__Impl rule__Ruleset__Group_5__1 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3966:2: rule__Ruleset__Group_5__0__Impl rule__Ruleset__Group_5__1
			{
				pushFollow(FOLLOW_rule__Ruleset__Group_5__0__Impl_in_rule__Ruleset__Group_5__08201);
				rule__Ruleset__Group_5__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Ruleset__Group_5__1_in_rule__Ruleset__Group_5__08204);
				rule__Ruleset__Group_5__1();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Ruleset__Group_5__0"


	// $ANTLR start "rule__Ruleset__Group_5__0__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3973:1: rule__Ruleset__Group_5__0__Impl : ( ';' ) ;
	public final void rule__Ruleset__Group_5__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3977:1: ( ( ';' ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3978:1: ( ';' )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3978:1: ( ';' )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3979:1: ';'
				{
					before(grammarAccess.getRulesetAccess().getSemicolonKeyword_5_0());
					match(input, 30, FOLLOW_30_in_rule__Ruleset__Group_5__0__Impl8232);
					after(grammarAccess.getRulesetAccess().getSemicolonKeyword_5_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Ruleset__Group_5__0__Impl"


	// $ANTLR start "rule__Ruleset__Group_5__1"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3992:1: rule__Ruleset__Group_5__1 : rule__Ruleset__Group_5__1__Impl rule__Ruleset__Group_5__2 ;
	public final void rule__Ruleset__Group_5__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3996:1: ( rule__Ruleset__Group_5__1__Impl rule__Ruleset__Group_5__2 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:3997:2: rule__Ruleset__Group_5__1__Impl rule__Ruleset__Group_5__2
			{
				pushFollow(FOLLOW_rule__Ruleset__Group_5__1__Impl_in_rule__Ruleset__Group_5__18263);
				rule__Ruleset__Group_5__1__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Ruleset__Group_5__2_in_rule__Ruleset__Group_5__18266);
				rule__Ruleset__Group_5__2();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Ruleset__Group_5__1"


	// $ANTLR start "rule__Ruleset__Group_5__1__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4004:1: rule__Ruleset__Group_5__1__Impl : ( ( RULE_WS )* ) ;
	public final void rule__Ruleset__Group_5__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4008:1: ( ( ( RULE_WS )* ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4009:1: ( ( RULE_WS )* )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4009:1: ( ( RULE_WS )* )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4010:1: ( RULE_WS )*
				{
					before(grammarAccess.getRulesetAccess().getWSTerminalRuleCall_5_1());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4011:1: ( RULE_WS )*
					loop58: do {
						int alt58 = 2;
						int LA58_0 = input.LA(1);

						if ((LA58_0 == RULE_WS)) {
							alt58 = 1;
						}


						switch (alt58) {
						case 1:
						// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4011:3: RULE_WS
						{
							match(input, RULE_WS, FOLLOW_RULE_WS_in_rule__Ruleset__Group_5__1__Impl8294);

						}
							break;

						default:
							break loop58;
						}
					} while (true);

					after(grammarAccess.getRulesetAccess().getWSTerminalRuleCall_5_1());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Ruleset__Group_5__1__Impl"


	// $ANTLR start "rule__Ruleset__Group_5__2"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4021:1: rule__Ruleset__Group_5__2 : rule__Ruleset__Group_5__2__Impl ;
	public final void rule__Ruleset__Group_5__2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4025:1: ( rule__Ruleset__Group_5__2__Impl )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4026:2: rule__Ruleset__Group_5__2__Impl
			{
				pushFollow(FOLLOW_rule__Ruleset__Group_5__2__Impl_in_rule__Ruleset__Group_5__28325);
				rule__Ruleset__Group_5__2__Impl();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Ruleset__Group_5__2"


	// $ANTLR start "rule__Ruleset__Group_5__2__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4032:1: rule__Ruleset__Group_5__2__Impl : ( ( rule__Ruleset__PropertiesAssignment_5_2 )? ) ;
	public final void rule__Ruleset__Group_5__2__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4036:1: ( ( ( rule__Ruleset__PropertiesAssignment_5_2 )? ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4037:1: ( ( rule__Ruleset__PropertiesAssignment_5_2 )? )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4037:1: ( ( rule__Ruleset__PropertiesAssignment_5_2 )? )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4038:1: ( rule__Ruleset__PropertiesAssignment_5_2 )?
				{
					before(grammarAccess.getRulesetAccess().getPropertiesAssignment_5_2());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4039:1: ( rule__Ruleset__PropertiesAssignment_5_2 )?
					int alt59 = 2;
					int LA59_0 = input.LA(1);

					if ((LA59_0 == RULE_ID)) {
						alt59 = 1;
					}
					switch (alt59) {
					case 1:
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4039:2: rule__Ruleset__PropertiesAssignment_5_2
					{
						pushFollow(FOLLOW_rule__Ruleset__PropertiesAssignment_5_2_in_rule__Ruleset__Group_5__2__Impl8352);
						rule__Ruleset__PropertiesAssignment_5_2();

						state._fsp--;


					}
						break;

					}

					after(grammarAccess.getRulesetAccess().getPropertiesAssignment_5_2());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Ruleset__Group_5__2__Impl"


	// $ANTLR start "rule__Selector__Group_0__0"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4055:1: rule__Selector__Group_0__0 : rule__Selector__Group_0__0__Impl rule__Selector__Group_0__1 ;
	public final void rule__Selector__Group_0__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4059:1: ( rule__Selector__Group_0__0__Impl rule__Selector__Group_0__1 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4060:2: rule__Selector__Group_0__0__Impl rule__Selector__Group_0__1
			{
				pushFollow(FOLLOW_rule__Selector__Group_0__0__Impl_in_rule__Selector__Group_0__08389);
				rule__Selector__Group_0__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Selector__Group_0__1_in_rule__Selector__Group_0__08392);
				rule__Selector__Group_0__1();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Selector__Group_0__0"


	// $ANTLR start "rule__Selector__Group_0__0__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4067:1: rule__Selector__Group_0__0__Impl : ( ruleSimpleSelector ) ;
	public final void rule__Selector__Group_0__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4071:1: ( ( ruleSimpleSelector ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4072:1: ( ruleSimpleSelector )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4072:1: ( ruleSimpleSelector )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4073:1: ruleSimpleSelector
				{
					before(grammarAccess.getSelectorAccess().getSimpleSelectorParserRuleCall_0_0());
					pushFollow(FOLLOW_ruleSimpleSelector_in_rule__Selector__Group_0__0__Impl8419);
					ruleSimpleSelector();

					state._fsp--;

					after(grammarAccess.getSelectorAccess().getSimpleSelectorParserRuleCall_0_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Selector__Group_0__0__Impl"


	// $ANTLR start "rule__Selector__Group_0__1"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4084:1: rule__Selector__Group_0__1 : rule__Selector__Group_0__1__Impl ;
	public final void rule__Selector__Group_0__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4088:1: ( rule__Selector__Group_0__1__Impl )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4089:2: rule__Selector__Group_0__1__Impl
			{
				pushFollow(FOLLOW_rule__Selector__Group_0__1__Impl_in_rule__Selector__Group_0__18448);
				rule__Selector__Group_0__1__Impl();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Selector__Group_0__1"


	// $ANTLR start "rule__Selector__Group_0__1__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4095:1: rule__Selector__Group_0__1__Impl : ( ( RULE_WS )* ) ;
	public final void rule__Selector__Group_0__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4099:1: ( ( ( RULE_WS )* ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4100:1: ( ( RULE_WS )* )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4100:1: ( ( RULE_WS )* )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4101:1: ( RULE_WS )*
				{
					before(grammarAccess.getSelectorAccess().getWSTerminalRuleCall_0_1());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4102:1: ( RULE_WS )*
					loop60: do {
						int alt60 = 2;
						int LA60_0 = input.LA(1);

						if ((LA60_0 == RULE_WS)) {
							alt60 = 1;
						}


						switch (alt60) {
						case 1:
						// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4102:3: RULE_WS
						{
							match(input, RULE_WS, FOLLOW_RULE_WS_in_rule__Selector__Group_0__1__Impl8476);

						}
							break;

						default:
							break loop60;
						}
					} while (true);

					after(grammarAccess.getSelectorAccess().getWSTerminalRuleCall_0_1());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Selector__Group_0__1__Impl"


	// $ANTLR start "rule__CompositeSelector__Group__0"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4116:1: rule__CompositeSelector__Group__0 : rule__CompositeSelector__Group__0__Impl
	// rule__CompositeSelector__Group__1 ;
	public final void rule__CompositeSelector__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4120:1: ( rule__CompositeSelector__Group__0__Impl rule__CompositeSelector__Group__1 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4121:2: rule__CompositeSelector__Group__0__Impl rule__CompositeSelector__Group__1
			{
				pushFollow(FOLLOW_rule__CompositeSelector__Group__0__Impl_in_rule__CompositeSelector__Group__08511);
				rule__CompositeSelector__Group__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__CompositeSelector__Group__1_in_rule__CompositeSelector__Group__08514);
				rule__CompositeSelector__Group__1();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__CompositeSelector__Group__0"


	// $ANTLR start "rule__CompositeSelector__Group__0__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4128:1: rule__CompositeSelector__Group__0__Impl : ( ( rule__CompositeSelector__LeftAssignment_0 ) ) ;
	public final void rule__CompositeSelector__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4132:1: ( ( ( rule__CompositeSelector__LeftAssignment_0 ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4133:1: ( ( rule__CompositeSelector__LeftAssignment_0 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4133:1: ( ( rule__CompositeSelector__LeftAssignment_0 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4134:1: ( rule__CompositeSelector__LeftAssignment_0 )
				{
					before(grammarAccess.getCompositeSelectorAccess().getLeftAssignment_0());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4135:1: ( rule__CompositeSelector__LeftAssignment_0 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4135:2: rule__CompositeSelector__LeftAssignment_0
					{
						pushFollow(FOLLOW_rule__CompositeSelector__LeftAssignment_0_in_rule__CompositeSelector__Group__0__Impl8541);
						rule__CompositeSelector__LeftAssignment_0();

						state._fsp--;


					}

					after(grammarAccess.getCompositeSelectorAccess().getLeftAssignment_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__CompositeSelector__Group__0__Impl"


	// $ANTLR start "rule__CompositeSelector__Group__1"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4145:1: rule__CompositeSelector__Group__1 : rule__CompositeSelector__Group__1__Impl
	// rule__CompositeSelector__Group__2 ;
	public final void rule__CompositeSelector__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4149:1: ( rule__CompositeSelector__Group__1__Impl rule__CompositeSelector__Group__2 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4150:2: rule__CompositeSelector__Group__1__Impl rule__CompositeSelector__Group__2
			{
				pushFollow(FOLLOW_rule__CompositeSelector__Group__1__Impl_in_rule__CompositeSelector__Group__18571);
				rule__CompositeSelector__Group__1__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__CompositeSelector__Group__2_in_rule__CompositeSelector__Group__18574);
				rule__CompositeSelector__Group__2();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__CompositeSelector__Group__1"


	// $ANTLR start "rule__CompositeSelector__Group__1__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4157:1: rule__CompositeSelector__Group__1__Impl : ( ( rule__CompositeSelector__Alternatives_1 ) ) ;
	public final void rule__CompositeSelector__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4161:1: ( ( ( rule__CompositeSelector__Alternatives_1 ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4162:1: ( ( rule__CompositeSelector__Alternatives_1 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4162:1: ( ( rule__CompositeSelector__Alternatives_1 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4163:1: ( rule__CompositeSelector__Alternatives_1 )
				{
					before(grammarAccess.getCompositeSelectorAccess().getAlternatives_1());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4164:1: ( rule__CompositeSelector__Alternatives_1 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4164:2: rule__CompositeSelector__Alternatives_1
					{
						pushFollow(FOLLOW_rule__CompositeSelector__Alternatives_1_in_rule__CompositeSelector__Group__1__Impl8601);
						rule__CompositeSelector__Alternatives_1();

						state._fsp--;


					}

					after(grammarAccess.getCompositeSelectorAccess().getAlternatives_1());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__CompositeSelector__Group__1__Impl"


	// $ANTLR start "rule__CompositeSelector__Group__2"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4174:1: rule__CompositeSelector__Group__2 : rule__CompositeSelector__Group__2__Impl ;
	public final void rule__CompositeSelector__Group__2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4178:1: ( rule__CompositeSelector__Group__2__Impl )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4179:2: rule__CompositeSelector__Group__2__Impl
			{
				pushFollow(FOLLOW_rule__CompositeSelector__Group__2__Impl_in_rule__CompositeSelector__Group__28631);
				rule__CompositeSelector__Group__2__Impl();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__CompositeSelector__Group__2"


	// $ANTLR start "rule__CompositeSelector__Group__2__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4185:1: rule__CompositeSelector__Group__2__Impl : ( ( rule__CompositeSelector__RightAssignment_2 ) ) ;
	public final void rule__CompositeSelector__Group__2__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4189:1: ( ( ( rule__CompositeSelector__RightAssignment_2 ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4190:1: ( ( rule__CompositeSelector__RightAssignment_2 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4190:1: ( ( rule__CompositeSelector__RightAssignment_2 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4191:1: ( rule__CompositeSelector__RightAssignment_2 )
				{
					before(grammarAccess.getCompositeSelectorAccess().getRightAssignment_2());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4192:1: ( rule__CompositeSelector__RightAssignment_2 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4192:2: rule__CompositeSelector__RightAssignment_2
					{
						pushFollow(FOLLOW_rule__CompositeSelector__RightAssignment_2_in_rule__CompositeSelector__Group__2__Impl8658);
						rule__CompositeSelector__RightAssignment_2();

						state._fsp--;


					}

					after(grammarAccess.getCompositeSelectorAccess().getRightAssignment_2());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__CompositeSelector__Group__2__Impl"


	// $ANTLR start "rule__CompositeSelector__Group_1_1__0"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4208:1: rule__CompositeSelector__Group_1_1__0 : rule__CompositeSelector__Group_1_1__0__Impl
	// rule__CompositeSelector__Group_1_1__1 ;
	public final void rule__CompositeSelector__Group_1_1__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4212:1: ( rule__CompositeSelector__Group_1_1__0__Impl rule__CompositeSelector__Group_1_1__1 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4213:2: rule__CompositeSelector__Group_1_1__0__Impl rule__CompositeSelector__Group_1_1__1
			{
				pushFollow(FOLLOW_rule__CompositeSelector__Group_1_1__0__Impl_in_rule__CompositeSelector__Group_1_1__08694);
				rule__CompositeSelector__Group_1_1__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__CompositeSelector__Group_1_1__1_in_rule__CompositeSelector__Group_1_1__08697);
				rule__CompositeSelector__Group_1_1__1();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__CompositeSelector__Group_1_1__0"


	// $ANTLR start "rule__CompositeSelector__Group_1_1__0__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4220:1: rule__CompositeSelector__Group_1_1__0__Impl : ( ( RULE_WS )* ) ;
	public final void rule__CompositeSelector__Group_1_1__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4224:1: ( ( ( RULE_WS )* ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4225:1: ( ( RULE_WS )* )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4225:1: ( ( RULE_WS )* )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4226:1: ( RULE_WS )*
				{
					before(grammarAccess.getCompositeSelectorAccess().getWSTerminalRuleCall_1_1_0());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4227:1: ( RULE_WS )*
					loop61: do {
						int alt61 = 2;
						int LA61_0 = input.LA(1);

						if ((LA61_0 == RULE_WS)) {
							alt61 = 1;
						}


						switch (alt61) {
						case 1:
						// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4227:3: RULE_WS
						{
							match(input, RULE_WS, FOLLOW_RULE_WS_in_rule__CompositeSelector__Group_1_1__0__Impl8725);

						}
							break;

						default:
							break loop61;
						}
					} while (true);

					after(grammarAccess.getCompositeSelectorAccess().getWSTerminalRuleCall_1_1_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__CompositeSelector__Group_1_1__0__Impl"


	// $ANTLR start "rule__CompositeSelector__Group_1_1__1"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4237:1: rule__CompositeSelector__Group_1_1__1 : rule__CompositeSelector__Group_1_1__1__Impl ;
	public final void rule__CompositeSelector__Group_1_1__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4241:1: ( rule__CompositeSelector__Group_1_1__1__Impl )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4242:2: rule__CompositeSelector__Group_1_1__1__Impl
			{
				pushFollow(FOLLOW_rule__CompositeSelector__Group_1_1__1__Impl_in_rule__CompositeSelector__Group_1_1__18756);
				rule__CompositeSelector__Group_1_1__1__Impl();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__CompositeSelector__Group_1_1__1"


	// $ANTLR start "rule__CompositeSelector__Group_1_1__1__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4248:1: rule__CompositeSelector__Group_1_1__1__Impl : ( ( rule__CompositeSelector__CombinatorAssignment_1_1_1 ) ) ;
	public final void rule__CompositeSelector__Group_1_1__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4252:1: ( ( ( rule__CompositeSelector__CombinatorAssignment_1_1_1 ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4253:1: ( ( rule__CompositeSelector__CombinatorAssignment_1_1_1 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4253:1: ( ( rule__CompositeSelector__CombinatorAssignment_1_1_1 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4254:1: ( rule__CompositeSelector__CombinatorAssignment_1_1_1 )
				{
					before(grammarAccess.getCompositeSelectorAccess().getCombinatorAssignment_1_1_1());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4255:1: ( rule__CompositeSelector__CombinatorAssignment_1_1_1 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4255:2: rule__CompositeSelector__CombinatorAssignment_1_1_1
					{
						pushFollow(FOLLOW_rule__CompositeSelector__CombinatorAssignment_1_1_1_in_rule__CompositeSelector__Group_1_1__1__Impl8783);
						rule__CompositeSelector__CombinatorAssignment_1_1_1();

						state._fsp--;


					}

					after(grammarAccess.getCompositeSelectorAccess().getCombinatorAssignment_1_1_1());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__CompositeSelector__Group_1_1__1__Impl"


	// $ANTLR start "rule__SimpleSelector__Group_0__0"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4269:1: rule__SimpleSelector__Group_0__0 : rule__SimpleSelector__Group_0__0__Impl rule__SimpleSelector__Group_0__1
	// ;
	public final void rule__SimpleSelector__Group_0__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4273:1: ( rule__SimpleSelector__Group_0__0__Impl rule__SimpleSelector__Group_0__1 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4274:2: rule__SimpleSelector__Group_0__0__Impl rule__SimpleSelector__Group_0__1
			{
				pushFollow(FOLLOW_rule__SimpleSelector__Group_0__0__Impl_in_rule__SimpleSelector__Group_0__08817);
				rule__SimpleSelector__Group_0__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__SimpleSelector__Group_0__1_in_rule__SimpleSelector__Group_0__08820);
				rule__SimpleSelector__Group_0__1();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__SimpleSelector__Group_0__0"


	// $ANTLR start "rule__SimpleSelector__Group_0__0__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4281:1: rule__SimpleSelector__Group_0__0__Impl : ( ( rule__SimpleSelector__ElementNameAssignment_0_0 ) ) ;
	public final void rule__SimpleSelector__Group_0__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4285:1: ( ( ( rule__SimpleSelector__ElementNameAssignment_0_0 ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4286:1: ( ( rule__SimpleSelector__ElementNameAssignment_0_0 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4286:1: ( ( rule__SimpleSelector__ElementNameAssignment_0_0 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4287:1: ( rule__SimpleSelector__ElementNameAssignment_0_0 )
				{
					before(grammarAccess.getSimpleSelectorAccess().getElementNameAssignment_0_0());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4288:1: ( rule__SimpleSelector__ElementNameAssignment_0_0 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4288:2: rule__SimpleSelector__ElementNameAssignment_0_0
					{
						pushFollow(FOLLOW_rule__SimpleSelector__ElementNameAssignment_0_0_in_rule__SimpleSelector__Group_0__0__Impl8847);
						rule__SimpleSelector__ElementNameAssignment_0_0();

						state._fsp--;


					}

					after(grammarAccess.getSimpleSelectorAccess().getElementNameAssignment_0_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__SimpleSelector__Group_0__0__Impl"


	// $ANTLR start "rule__SimpleSelector__Group_0__1"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4298:1: rule__SimpleSelector__Group_0__1 : rule__SimpleSelector__Group_0__1__Impl ;
	public final void rule__SimpleSelector__Group_0__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4302:1: ( rule__SimpleSelector__Group_0__1__Impl )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4303:2: rule__SimpleSelector__Group_0__1__Impl
			{
				pushFollow(FOLLOW_rule__SimpleSelector__Group_0__1__Impl_in_rule__SimpleSelector__Group_0__18877);
				rule__SimpleSelector__Group_0__1__Impl();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__SimpleSelector__Group_0__1"


	// $ANTLR start "rule__SimpleSelector__Group_0__1__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4309:1: rule__SimpleSelector__Group_0__1__Impl : ( ( rule__SimpleSelector__ConditionAssignment_0_1 )* ) ;
	public final void rule__SimpleSelector__Group_0__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4313:1: ( ( ( rule__SimpleSelector__ConditionAssignment_0_1 )* ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4314:1: ( ( rule__SimpleSelector__ConditionAssignment_0_1 )* )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4314:1: ( ( rule__SimpleSelector__ConditionAssignment_0_1 )* )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4315:1: ( rule__SimpleSelector__ConditionAssignment_0_1 )*
				{
					before(grammarAccess.getSimpleSelectorAccess().getConditionAssignment_0_1());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4316:1: ( rule__SimpleSelector__ConditionAssignment_0_1 )*
					loop62: do {
						int alt62 = 2;
						int LA62_0 = input.LA(1);

						if (((LA62_0 >= RULE_HASH && LA62_0 <= RULE_T_CLASS) || LA62_0 == 37 || LA62_0 == 42)) {
							alt62 = 1;
						}


						switch (alt62) {
						case 1:
						// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4316:2: rule__SimpleSelector__ConditionAssignment_0_1
						{
							pushFollow(FOLLOW_rule__SimpleSelector__ConditionAssignment_0_1_in_rule__SimpleSelector__Group_0__1__Impl8904);
							rule__SimpleSelector__ConditionAssignment_0_1();

							state._fsp--;


						}
							break;

						default:
							break loop62;
						}
					} while (true);

					after(grammarAccess.getSimpleSelectorAccess().getConditionAssignment_0_1());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__SimpleSelector__Group_0__1__Impl"


	// $ANTLR start "rule__Combinator__Group__0"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4330:1: rule__Combinator__Group__0 : rule__Combinator__Group__0__Impl rule__Combinator__Group__1 ;
	public final void rule__Combinator__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4334:1: ( rule__Combinator__Group__0__Impl rule__Combinator__Group__1 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4335:2: rule__Combinator__Group__0__Impl rule__Combinator__Group__1
			{
				pushFollow(FOLLOW_rule__Combinator__Group__0__Impl_in_rule__Combinator__Group__08939);
				rule__Combinator__Group__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Combinator__Group__1_in_rule__Combinator__Group__08942);
				rule__Combinator__Group__1();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Combinator__Group__0"


	// $ANTLR start "rule__Combinator__Group__0__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4342:1: rule__Combinator__Group__0__Impl : ( ( rule__Combinator__KindAssignment_0 ) ) ;
	public final void rule__Combinator__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4346:1: ( ( ( rule__Combinator__KindAssignment_0 ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4347:1: ( ( rule__Combinator__KindAssignment_0 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4347:1: ( ( rule__Combinator__KindAssignment_0 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4348:1: ( rule__Combinator__KindAssignment_0 )
				{
					before(grammarAccess.getCombinatorAccess().getKindAssignment_0());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4349:1: ( rule__Combinator__KindAssignment_0 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4349:2: rule__Combinator__KindAssignment_0
					{
						pushFollow(FOLLOW_rule__Combinator__KindAssignment_0_in_rule__Combinator__Group__0__Impl8969);
						rule__Combinator__KindAssignment_0();

						state._fsp--;


					}

					after(grammarAccess.getCombinatorAccess().getKindAssignment_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Combinator__Group__0__Impl"


	// $ANTLR start "rule__Combinator__Group__1"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4359:1: rule__Combinator__Group__1 : rule__Combinator__Group__1__Impl ;
	public final void rule__Combinator__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4363:1: ( rule__Combinator__Group__1__Impl )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4364:2: rule__Combinator__Group__1__Impl
			{
				pushFollow(FOLLOW_rule__Combinator__Group__1__Impl_in_rule__Combinator__Group__18999);
				rule__Combinator__Group__1__Impl();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Combinator__Group__1"


	// $ANTLR start "rule__Combinator__Group__1__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4370:1: rule__Combinator__Group__1__Impl : ( ( RULE_WS )* ) ;
	public final void rule__Combinator__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4374:1: ( ( ( RULE_WS )* ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4375:1: ( ( RULE_WS )* )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4375:1: ( ( RULE_WS )* )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4376:1: ( RULE_WS )*
				{
					before(grammarAccess.getCombinatorAccess().getWSTerminalRuleCall_1());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4377:1: ( RULE_WS )*
					loop63: do {
						int alt63 = 2;
						int LA63_0 = input.LA(1);

						if ((LA63_0 == RULE_WS)) {
							alt63 = 1;
						}


						switch (alt63) {
						case 1:
						// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4377:3: RULE_WS
						{
							match(input, RULE_WS, FOLLOW_RULE_WS_in_rule__Combinator__Group__1__Impl9027);

						}
							break;

						default:
							break loop63;
						}
					} while (true);

					after(grammarAccess.getCombinatorAccess().getWSTerminalRuleCall_1());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Combinator__Group__1__Impl"


	// $ANTLR start "rule__Declaration__Group__0"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4391:1: rule__Declaration__Group__0 : rule__Declaration__Group__0__Impl rule__Declaration__Group__1 ;
	public final void rule__Declaration__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4395:1: ( rule__Declaration__Group__0__Impl rule__Declaration__Group__1 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4396:2: rule__Declaration__Group__0__Impl rule__Declaration__Group__1
			{
				pushFollow(FOLLOW_rule__Declaration__Group__0__Impl_in_rule__Declaration__Group__09062);
				rule__Declaration__Group__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Declaration__Group__1_in_rule__Declaration__Group__09065);
				rule__Declaration__Group__1();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Declaration__Group__0"


	// $ANTLR start "rule__Declaration__Group__0__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4403:1: rule__Declaration__Group__0__Impl : ( ( rule__Declaration__PropertyAssignment_0 ) ) ;
	public final void rule__Declaration__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4407:1: ( ( ( rule__Declaration__PropertyAssignment_0 ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4408:1: ( ( rule__Declaration__PropertyAssignment_0 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4408:1: ( ( rule__Declaration__PropertyAssignment_0 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4409:1: ( rule__Declaration__PropertyAssignment_0 )
				{
					before(grammarAccess.getDeclarationAccess().getPropertyAssignment_0());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4410:1: ( rule__Declaration__PropertyAssignment_0 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4410:2: rule__Declaration__PropertyAssignment_0
					{
						pushFollow(FOLLOW_rule__Declaration__PropertyAssignment_0_in_rule__Declaration__Group__0__Impl9092);
						rule__Declaration__PropertyAssignment_0();

						state._fsp--;


					}

					after(grammarAccess.getDeclarationAccess().getPropertyAssignment_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Declaration__Group__0__Impl"


	// $ANTLR start "rule__Declaration__Group__1"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4420:1: rule__Declaration__Group__1 : rule__Declaration__Group__1__Impl rule__Declaration__Group__2 ;
	public final void rule__Declaration__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4424:1: ( rule__Declaration__Group__1__Impl rule__Declaration__Group__2 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4425:2: rule__Declaration__Group__1__Impl rule__Declaration__Group__2
			{
				pushFollow(FOLLOW_rule__Declaration__Group__1__Impl_in_rule__Declaration__Group__19122);
				rule__Declaration__Group__1__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Declaration__Group__2_in_rule__Declaration__Group__19125);
				rule__Declaration__Group__2();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Declaration__Group__1"


	// $ANTLR start "rule__Declaration__Group__1__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4432:1: rule__Declaration__Group__1__Impl : ( ( RULE_WS )* ) ;
	public final void rule__Declaration__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4436:1: ( ( ( RULE_WS )* ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4437:1: ( ( RULE_WS )* )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4437:1: ( ( RULE_WS )* )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4438:1: ( RULE_WS )*
				{
					before(grammarAccess.getDeclarationAccess().getWSTerminalRuleCall_1());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4439:1: ( RULE_WS )*
					loop64: do {
						int alt64 = 2;
						int LA64_0 = input.LA(1);

						if ((LA64_0 == RULE_WS)) {
							alt64 = 1;
						}


						switch (alt64) {
						case 1:
						// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4439:3: RULE_WS
						{
							match(input, RULE_WS, FOLLOW_RULE_WS_in_rule__Declaration__Group__1__Impl9153);

						}
							break;

						default:
							break loop64;
						}
					} while (true);

					after(grammarAccess.getDeclarationAccess().getWSTerminalRuleCall_1());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Declaration__Group__1__Impl"


	// $ANTLR start "rule__Declaration__Group__2"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4449:1: rule__Declaration__Group__2 : rule__Declaration__Group__2__Impl rule__Declaration__Group__3 ;
	public final void rule__Declaration__Group__2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4453:1: ( rule__Declaration__Group__2__Impl rule__Declaration__Group__3 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4454:2: rule__Declaration__Group__2__Impl rule__Declaration__Group__3
			{
				pushFollow(FOLLOW_rule__Declaration__Group__2__Impl_in_rule__Declaration__Group__29184);
				rule__Declaration__Group__2__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Declaration__Group__3_in_rule__Declaration__Group__29187);
				rule__Declaration__Group__3();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Declaration__Group__2"


	// $ANTLR start "rule__Declaration__Group__2__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4461:1: rule__Declaration__Group__2__Impl : ( ':' ) ;
	public final void rule__Declaration__Group__2__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4465:1: ( ( ':' ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4466:1: ( ':' )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4466:1: ( ':' )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4467:1: ':'
				{
					before(grammarAccess.getDeclarationAccess().getColonKeyword_2());
					match(input, 37, FOLLOW_37_in_rule__Declaration__Group__2__Impl9215);
					after(grammarAccess.getDeclarationAccess().getColonKeyword_2());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Declaration__Group__2__Impl"


	// $ANTLR start "rule__Declaration__Group__3"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4480:1: rule__Declaration__Group__3 : rule__Declaration__Group__3__Impl rule__Declaration__Group__4 ;
	public final void rule__Declaration__Group__3() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4484:1: ( rule__Declaration__Group__3__Impl rule__Declaration__Group__4 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4485:2: rule__Declaration__Group__3__Impl rule__Declaration__Group__4
			{
				pushFollow(FOLLOW_rule__Declaration__Group__3__Impl_in_rule__Declaration__Group__39246);
				rule__Declaration__Group__3__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Declaration__Group__4_in_rule__Declaration__Group__39249);
				rule__Declaration__Group__4();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Declaration__Group__3"


	// $ANTLR start "rule__Declaration__Group__3__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4492:1: rule__Declaration__Group__3__Impl : ( ( RULE_WS )* ) ;
	public final void rule__Declaration__Group__3__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4496:1: ( ( ( RULE_WS )* ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4497:1: ( ( RULE_WS )* )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4497:1: ( ( RULE_WS )* )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4498:1: ( RULE_WS )*
				{
					before(grammarAccess.getDeclarationAccess().getWSTerminalRuleCall_3());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4499:1: ( RULE_WS )*
					loop65: do {
						int alt65 = 2;
						int LA65_0 = input.LA(1);

						if ((LA65_0 == RULE_WS)) {
							alt65 = 1;
						}


						switch (alt65) {
						case 1:
						// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4499:3: RULE_WS
						{
							match(input, RULE_WS, FOLLOW_RULE_WS_in_rule__Declaration__Group__3__Impl9277);

						}
							break;

						default:
							break loop65;
						}
					} while (true);

					after(grammarAccess.getDeclarationAccess().getWSTerminalRuleCall_3());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Declaration__Group__3__Impl"


	// $ANTLR start "rule__Declaration__Group__4"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4509:1: rule__Declaration__Group__4 : rule__Declaration__Group__4__Impl rule__Declaration__Group__5 ;
	public final void rule__Declaration__Group__4() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4513:1: ( rule__Declaration__Group__4__Impl rule__Declaration__Group__5 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4514:2: rule__Declaration__Group__4__Impl rule__Declaration__Group__5
			{
				pushFollow(FOLLOW_rule__Declaration__Group__4__Impl_in_rule__Declaration__Group__49308);
				rule__Declaration__Group__4__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Declaration__Group__5_in_rule__Declaration__Group__49311);
				rule__Declaration__Group__5();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Declaration__Group__4"


	// $ANTLR start "rule__Declaration__Group__4__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4521:1: rule__Declaration__Group__4__Impl : ( ( rule__Declaration__ExpressionAssignment_4 ) ) ;
	public final void rule__Declaration__Group__4__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4525:1: ( ( ( rule__Declaration__ExpressionAssignment_4 ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4526:1: ( ( rule__Declaration__ExpressionAssignment_4 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4526:1: ( ( rule__Declaration__ExpressionAssignment_4 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4527:1: ( rule__Declaration__ExpressionAssignment_4 )
				{
					before(grammarAccess.getDeclarationAccess().getExpressionAssignment_4());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4528:1: ( rule__Declaration__ExpressionAssignment_4 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4528:2: rule__Declaration__ExpressionAssignment_4
					{
						pushFollow(FOLLOW_rule__Declaration__ExpressionAssignment_4_in_rule__Declaration__Group__4__Impl9338);
						rule__Declaration__ExpressionAssignment_4();

						state._fsp--;


					}

					after(grammarAccess.getDeclarationAccess().getExpressionAssignment_4());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Declaration__Group__4__Impl"


	// $ANTLR start "rule__Declaration__Group__5"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4538:1: rule__Declaration__Group__5 : rule__Declaration__Group__5__Impl ;
	public final void rule__Declaration__Group__5() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4542:1: ( rule__Declaration__Group__5__Impl )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4543:2: rule__Declaration__Group__5__Impl
			{
				pushFollow(FOLLOW_rule__Declaration__Group__5__Impl_in_rule__Declaration__Group__59368);
				rule__Declaration__Group__5__Impl();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Declaration__Group__5"


	// $ANTLR start "rule__Declaration__Group__5__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4549:1: rule__Declaration__Group__5__Impl : ( ( rule__Declaration__Group_5__0 )? ) ;
	public final void rule__Declaration__Group__5__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4553:1: ( ( ( rule__Declaration__Group_5__0 )? ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4554:1: ( ( rule__Declaration__Group_5__0 )? )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4554:1: ( ( rule__Declaration__Group_5__0 )? )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4555:1: ( rule__Declaration__Group_5__0 )?
				{
					before(grammarAccess.getDeclarationAccess().getGroup_5());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4556:1: ( rule__Declaration__Group_5__0 )?
					int alt66 = 2;
					int LA66_0 = input.LA(1);

					if ((LA66_0 == RULE_T_IMPORTANT)) {
						alt66 = 1;
					}
					switch (alt66) {
					case 1:
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4556:2: rule__Declaration__Group_5__0
					{
						pushFollow(FOLLOW_rule__Declaration__Group_5__0_in_rule__Declaration__Group__5__Impl9395);
						rule__Declaration__Group_5__0();

						state._fsp--;


					}
						break;

					}

					after(grammarAccess.getDeclarationAccess().getGroup_5());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Declaration__Group__5__Impl"


	// $ANTLR start "rule__Declaration__Group_5__0"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4578:1: rule__Declaration__Group_5__0 : rule__Declaration__Group_5__0__Impl rule__Declaration__Group_5__1 ;
	public final void rule__Declaration__Group_5__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4582:1: ( rule__Declaration__Group_5__0__Impl rule__Declaration__Group_5__1 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4583:2: rule__Declaration__Group_5__0__Impl rule__Declaration__Group_5__1
			{
				pushFollow(FOLLOW_rule__Declaration__Group_5__0__Impl_in_rule__Declaration__Group_5__09438);
				rule__Declaration__Group_5__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Declaration__Group_5__1_in_rule__Declaration__Group_5__09441);
				rule__Declaration__Group_5__1();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Declaration__Group_5__0"


	// $ANTLR start "rule__Declaration__Group_5__0__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4590:1: rule__Declaration__Group_5__0__Impl : ( ( rule__Declaration__ImportantAssignment_5_0 ) ) ;
	public final void rule__Declaration__Group_5__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4594:1: ( ( ( rule__Declaration__ImportantAssignment_5_0 ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4595:1: ( ( rule__Declaration__ImportantAssignment_5_0 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4595:1: ( ( rule__Declaration__ImportantAssignment_5_0 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4596:1: ( rule__Declaration__ImportantAssignment_5_0 )
				{
					before(grammarAccess.getDeclarationAccess().getImportantAssignment_5_0());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4597:1: ( rule__Declaration__ImportantAssignment_5_0 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4597:2: rule__Declaration__ImportantAssignment_5_0
					{
						pushFollow(FOLLOW_rule__Declaration__ImportantAssignment_5_0_in_rule__Declaration__Group_5__0__Impl9468);
						rule__Declaration__ImportantAssignment_5_0();

						state._fsp--;


					}

					after(grammarAccess.getDeclarationAccess().getImportantAssignment_5_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Declaration__Group_5__0__Impl"


	// $ANTLR start "rule__Declaration__Group_5__1"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4607:1: rule__Declaration__Group_5__1 : rule__Declaration__Group_5__1__Impl ;
	public final void rule__Declaration__Group_5__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4611:1: ( rule__Declaration__Group_5__1__Impl )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4612:2: rule__Declaration__Group_5__1__Impl
			{
				pushFollow(FOLLOW_rule__Declaration__Group_5__1__Impl_in_rule__Declaration__Group_5__19498);
				rule__Declaration__Group_5__1__Impl();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Declaration__Group_5__1"


	// $ANTLR start "rule__Declaration__Group_5__1__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4618:1: rule__Declaration__Group_5__1__Impl : ( ( RULE_WS )* ) ;
	public final void rule__Declaration__Group_5__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4622:1: ( ( ( RULE_WS )* ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4623:1: ( ( RULE_WS )* )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4623:1: ( ( RULE_WS )* )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4624:1: ( RULE_WS )*
				{
					before(grammarAccess.getDeclarationAccess().getWSTerminalRuleCall_5_1());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4625:1: ( RULE_WS )*
					loop67: do {
						int alt67 = 2;
						int LA67_0 = input.LA(1);

						if ((LA67_0 == RULE_WS)) {
							alt67 = 1;
						}


						switch (alt67) {
						case 1:
						// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4625:3: RULE_WS
						{
							match(input, RULE_WS, FOLLOW_RULE_WS_in_rule__Declaration__Group_5__1__Impl9526);

						}
							break;

						default:
							break loop67;
						}
					} while (true);

					after(grammarAccess.getDeclarationAccess().getWSTerminalRuleCall_5_1());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Declaration__Group_5__1__Impl"


	// $ANTLR start "rule__Expression__Group__0"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4639:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
	public final void rule__Expression__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4643:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4644:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
			{
				pushFollow(FOLLOW_rule__Expression__Group__0__Impl_in_rule__Expression__Group__09561);
				rule__Expression__Group__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Expression__Group__1_in_rule__Expression__Group__09564);
				rule__Expression__Group__1();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Expression__Group__0"


	// $ANTLR start "rule__Expression__Group__0__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4651:1: rule__Expression__Group__0__Impl : ( ( rule__Expression__TermsAssignment_0 ) ) ;
	public final void rule__Expression__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4655:1: ( ( ( rule__Expression__TermsAssignment_0 ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4656:1: ( ( rule__Expression__TermsAssignment_0 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4656:1: ( ( rule__Expression__TermsAssignment_0 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4657:1: ( rule__Expression__TermsAssignment_0 )
				{
					before(grammarAccess.getExpressionAccess().getTermsAssignment_0());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4658:1: ( rule__Expression__TermsAssignment_0 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4658:2: rule__Expression__TermsAssignment_0
					{
						pushFollow(FOLLOW_rule__Expression__TermsAssignment_0_in_rule__Expression__Group__0__Impl9591);
						rule__Expression__TermsAssignment_0();

						state._fsp--;


					}

					after(grammarAccess.getExpressionAccess().getTermsAssignment_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Expression__Group__0__Impl"


	// $ANTLR start "rule__Expression__Group__1"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4668:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
	public final void rule__Expression__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4672:1: ( rule__Expression__Group__1__Impl )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4673:2: rule__Expression__Group__1__Impl
			{
				pushFollow(FOLLOW_rule__Expression__Group__1__Impl_in_rule__Expression__Group__19621);
				rule__Expression__Group__1__Impl();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Expression__Group__1"


	// $ANTLR start "rule__Expression__Group__1__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4679:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__SubtermsAssignment_1 )* ) ;
	public final void rule__Expression__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4683:1: ( ( ( rule__Expression__SubtermsAssignment_1 )* ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4684:1: ( ( rule__Expression__SubtermsAssignment_1 )* )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4684:1: ( ( rule__Expression__SubtermsAssignment_1 )* )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4685:1: ( rule__Expression__SubtermsAssignment_1 )*
				{
					before(grammarAccess.getExpressionAccess().getSubtermsAssignment_1());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4686:1: ( rule__Expression__SubtermsAssignment_1 )*
					loop68: do {
						int alt68 = 2;
						int LA68_0 = input.LA(1);

						if (((LA68_0 >= RULE_ID && LA68_0 <= RULE_STRING) || LA68_0 == RULE_T_NUM || LA68_0 == RULE_HASH || (LA68_0 >= 23 && LA68_0 <= 24) || LA68_0 == 32 || (LA68_0 >= 40 && LA68_0 <= 41))) {
							alt68 = 1;
						}


						switch (alt68) {
						case 1:
						// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4686:2: rule__Expression__SubtermsAssignment_1
						{
							pushFollow(FOLLOW_rule__Expression__SubtermsAssignment_1_in_rule__Expression__Group__1__Impl9648);
							rule__Expression__SubtermsAssignment_1();

							state._fsp--;


						}
							break;

						default:
							break loop68;
						}
					} while (true);

					after(grammarAccess.getExpressionAccess().getSubtermsAssignment_1());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Expression__Group__1__Impl"


	// $ANTLR start "rule__Subterm__Group__0"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4700:1: rule__Subterm__Group__0 : rule__Subterm__Group__0__Impl rule__Subterm__Group__1 ;
	public final void rule__Subterm__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4704:1: ( rule__Subterm__Group__0__Impl rule__Subterm__Group__1 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4705:2: rule__Subterm__Group__0__Impl rule__Subterm__Group__1
			{
				pushFollow(FOLLOW_rule__Subterm__Group__0__Impl_in_rule__Subterm__Group__09683);
				rule__Subterm__Group__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Subterm__Group__1_in_rule__Subterm__Group__09686);
				rule__Subterm__Group__1();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Subterm__Group__0"


	// $ANTLR start "rule__Subterm__Group__0__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4712:1: rule__Subterm__Group__0__Impl : ( ( rule__Subterm__OperatorAssignment_0 )? ) ;
	public final void rule__Subterm__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4716:1: ( ( ( rule__Subterm__OperatorAssignment_0 )? ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4717:1: ( ( rule__Subterm__OperatorAssignment_0 )? )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4717:1: ( ( rule__Subterm__OperatorAssignment_0 )? )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4718:1: ( rule__Subterm__OperatorAssignment_0 )?
				{
					before(grammarAccess.getSubtermAccess().getOperatorAssignment_0());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4719:1: ( rule__Subterm__OperatorAssignment_0 )?
					int alt69 = 2;
					int LA69_0 = input.LA(1);

					if ((LA69_0 == 32 || LA69_0 == 41)) {
						alt69 = 1;
					}
					switch (alt69) {
					case 1:
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4719:2: rule__Subterm__OperatorAssignment_0
					{
						pushFollow(FOLLOW_rule__Subterm__OperatorAssignment_0_in_rule__Subterm__Group__0__Impl9713);
						rule__Subterm__OperatorAssignment_0();

						state._fsp--;


					}
						break;

					}

					after(grammarAccess.getSubtermAccess().getOperatorAssignment_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Subterm__Group__0__Impl"


	// $ANTLR start "rule__Subterm__Group__1"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4729:1: rule__Subterm__Group__1 : rule__Subterm__Group__1__Impl ;
	public final void rule__Subterm__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4733:1: ( rule__Subterm__Group__1__Impl )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4734:2: rule__Subterm__Group__1__Impl
			{
				pushFollow(FOLLOW_rule__Subterm__Group__1__Impl_in_rule__Subterm__Group__19744);
				rule__Subterm__Group__1__Impl();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Subterm__Group__1"


	// $ANTLR start "rule__Subterm__Group__1__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4740:1: rule__Subterm__Group__1__Impl : ( ( rule__Subterm__TermAssignment_1 ) ) ;
	public final void rule__Subterm__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4744:1: ( ( ( rule__Subterm__TermAssignment_1 ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4745:1: ( ( rule__Subterm__TermAssignment_1 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4745:1: ( ( rule__Subterm__TermAssignment_1 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4746:1: ( rule__Subterm__TermAssignment_1 )
				{
					before(grammarAccess.getSubtermAccess().getTermAssignment_1());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4747:1: ( rule__Subterm__TermAssignment_1 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4747:2: rule__Subterm__TermAssignment_1
					{
						pushFollow(FOLLOW_rule__Subterm__TermAssignment_1_in_rule__Subterm__Group__1__Impl9771);
						rule__Subterm__TermAssignment_1();

						state._fsp--;


					}

					after(grammarAccess.getSubtermAccess().getTermAssignment_1());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Subterm__Group__1__Impl"


	// $ANTLR start "rule__Term__Group__0"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4761:1: rule__Term__Group__0 : rule__Term__Group__0__Impl rule__Term__Group__1 ;
	public final void rule__Term__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4765:1: ( rule__Term__Group__0__Impl rule__Term__Group__1 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4766:2: rule__Term__Group__0__Impl rule__Term__Group__1
			{
				pushFollow(FOLLOW_rule__Term__Group__0__Impl_in_rule__Term__Group__09805);
				rule__Term__Group__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Term__Group__1_in_rule__Term__Group__09808);
				rule__Term__Group__1();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Term__Group__0"


	// $ANTLR start "rule__Term__Group__0__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4773:1: rule__Term__Group__0__Impl : ( ( rule__Term__Alternatives_0 ) ) ;
	public final void rule__Term__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4777:1: ( ( ( rule__Term__Alternatives_0 ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4778:1: ( ( rule__Term__Alternatives_0 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4778:1: ( ( rule__Term__Alternatives_0 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4779:1: ( rule__Term__Alternatives_0 )
				{
					before(grammarAccess.getTermAccess().getAlternatives_0());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4780:1: ( rule__Term__Alternatives_0 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4780:2: rule__Term__Alternatives_0
					{
						pushFollow(FOLLOW_rule__Term__Alternatives_0_in_rule__Term__Group__0__Impl9835);
						rule__Term__Alternatives_0();

						state._fsp--;


					}

					after(grammarAccess.getTermAccess().getAlternatives_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Term__Group__0__Impl"


	// $ANTLR start "rule__Term__Group__1"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4790:1: rule__Term__Group__1 : rule__Term__Group__1__Impl ;
	public final void rule__Term__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4794:1: ( rule__Term__Group__1__Impl )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4795:2: rule__Term__Group__1__Impl
			{
				pushFollow(FOLLOW_rule__Term__Group__1__Impl_in_rule__Term__Group__19865);
				rule__Term__Group__1__Impl();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Term__Group__1"


	// $ANTLR start "rule__Term__Group__1__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4801:1: rule__Term__Group__1__Impl : ( ( RULE_WS )* ) ;
	public final void rule__Term__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4805:1: ( ( ( RULE_WS )* ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4806:1: ( ( RULE_WS )* )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4806:1: ( ( RULE_WS )* )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4807:1: ( RULE_WS )*
				{
					before(grammarAccess.getTermAccess().getWSTerminalRuleCall_1());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4808:1: ( RULE_WS )*
					loop70: do {
						int alt70 = 2;
						int LA70_0 = input.LA(1);

						if ((LA70_0 == RULE_WS)) {
							alt70 = 1;
						}


						switch (alt70) {
						case 1:
						// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4808:3: RULE_WS
						{
							match(input, RULE_WS, FOLLOW_RULE_WS_in_rule__Term__Group__1__Impl9893);

						}
							break;

						default:
							break loop70;
						}
					} while (true);

					after(grammarAccess.getTermAccess().getWSTerminalRuleCall_1());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Term__Group__1__Impl"


	// $ANTLR start "rule__Function__Group__0"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4822:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
	public final void rule__Function__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4826:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4827:2: rule__Function__Group__0__Impl rule__Function__Group__1
			{
				pushFollow(FOLLOW_rule__Function__Group__0__Impl_in_rule__Function__Group__09928);
				rule__Function__Group__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Function__Group__1_in_rule__Function__Group__09931);
				rule__Function__Group__1();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Function__Group__0"


	// $ANTLR start "rule__Function__Group__0__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4834:1: rule__Function__Group__0__Impl : ( ( rule__Function__NameAssignment_0 ) ) ;
	public final void rule__Function__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4838:1: ( ( ( rule__Function__NameAssignment_0 ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4839:1: ( ( rule__Function__NameAssignment_0 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4839:1: ( ( rule__Function__NameAssignment_0 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4840:1: ( rule__Function__NameAssignment_0 )
				{
					before(grammarAccess.getFunctionAccess().getNameAssignment_0());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4841:1: ( rule__Function__NameAssignment_0 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4841:2: rule__Function__NameAssignment_0
					{
						pushFollow(FOLLOW_rule__Function__NameAssignment_0_in_rule__Function__Group__0__Impl9958);
						rule__Function__NameAssignment_0();

						state._fsp--;


					}

					after(grammarAccess.getFunctionAccess().getNameAssignment_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Function__Group__0__Impl"


	// $ANTLR start "rule__Function__Group__1"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4851:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
	public final void rule__Function__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4855:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4856:2: rule__Function__Group__1__Impl rule__Function__Group__2
			{
				pushFollow(FOLLOW_rule__Function__Group__1__Impl_in_rule__Function__Group__19988);
				rule__Function__Group__1__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Function__Group__2_in_rule__Function__Group__19991);
				rule__Function__Group__2();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Function__Group__1"


	// $ANTLR start "rule__Function__Group__1__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4863:1: rule__Function__Group__1__Impl : ( '(' ) ;
	public final void rule__Function__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4867:1: ( ( '(' ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4868:1: ( '(' )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4868:1: ( '(' )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4869:1: '('
				{
					before(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_1());
					match(input, 38, FOLLOW_38_in_rule__Function__Group__1__Impl10019);
					after(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_1());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Function__Group__1__Impl"


	// $ANTLR start "rule__Function__Group__2"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4882:1: rule__Function__Group__2 : rule__Function__Group__2__Impl rule__Function__Group__3 ;
	public final void rule__Function__Group__2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4886:1: ( rule__Function__Group__2__Impl rule__Function__Group__3 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4887:2: rule__Function__Group__2__Impl rule__Function__Group__3
			{
				pushFollow(FOLLOW_rule__Function__Group__2__Impl_in_rule__Function__Group__210050);
				rule__Function__Group__2__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Function__Group__3_in_rule__Function__Group__210053);
				rule__Function__Group__3();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Function__Group__2"


	// $ANTLR start "rule__Function__Group__2__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4894:1: rule__Function__Group__2__Impl : ( ( RULE_WS )* ) ;
	public final void rule__Function__Group__2__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4898:1: ( ( ( RULE_WS )* ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4899:1: ( ( RULE_WS )* )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4899:1: ( ( RULE_WS )* )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4900:1: ( RULE_WS )*
				{
					before(grammarAccess.getFunctionAccess().getWSTerminalRuleCall_2());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4901:1: ( RULE_WS )*
					loop71: do {
						int alt71 = 2;
						int LA71_0 = input.LA(1);

						if ((LA71_0 == RULE_WS)) {
							alt71 = 1;
						}


						switch (alt71) {
						case 1:
						// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4901:3: RULE_WS
						{
							match(input, RULE_WS, FOLLOW_RULE_WS_in_rule__Function__Group__2__Impl10081);

						}
							break;

						default:
							break loop71;
						}
					} while (true);

					after(grammarAccess.getFunctionAccess().getWSTerminalRuleCall_2());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Function__Group__2__Impl"


	// $ANTLR start "rule__Function__Group__3"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4911:1: rule__Function__Group__3 : rule__Function__Group__3__Impl rule__Function__Group__4 ;
	public final void rule__Function__Group__3() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4915:1: ( rule__Function__Group__3__Impl rule__Function__Group__4 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4916:2: rule__Function__Group__3__Impl rule__Function__Group__4
			{
				pushFollow(FOLLOW_rule__Function__Group__3__Impl_in_rule__Function__Group__310112);
				rule__Function__Group__3__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Function__Group__4_in_rule__Function__Group__310115);
				rule__Function__Group__4();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Function__Group__3"


	// $ANTLR start "rule__Function__Group__3__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4923:1: rule__Function__Group__3__Impl : ( ( rule__Function__ArgsAssignment_3 ) ) ;
	public final void rule__Function__Group__3__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4927:1: ( ( ( rule__Function__ArgsAssignment_3 ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4928:1: ( ( rule__Function__ArgsAssignment_3 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4928:1: ( ( rule__Function__ArgsAssignment_3 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4929:1: ( rule__Function__ArgsAssignment_3 )
				{
					before(grammarAccess.getFunctionAccess().getArgsAssignment_3());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4930:1: ( rule__Function__ArgsAssignment_3 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4930:2: rule__Function__ArgsAssignment_3
					{
						pushFollow(FOLLOW_rule__Function__ArgsAssignment_3_in_rule__Function__Group__3__Impl10142);
						rule__Function__ArgsAssignment_3();

						state._fsp--;


					}

					after(grammarAccess.getFunctionAccess().getArgsAssignment_3());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Function__Group__3__Impl"


	// $ANTLR start "rule__Function__Group__4"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4940:1: rule__Function__Group__4 : rule__Function__Group__4__Impl ;
	public final void rule__Function__Group__4() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4944:1: ( rule__Function__Group__4__Impl )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4945:2: rule__Function__Group__4__Impl
			{
				pushFollow(FOLLOW_rule__Function__Group__4__Impl_in_rule__Function__Group__410172);
				rule__Function__Group__4__Impl();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Function__Group__4"


	// $ANTLR start "rule__Function__Group__4__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4951:1: rule__Function__Group__4__Impl : ( ')' ) ;
	public final void rule__Function__Group__4__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4955:1: ( ( ')' ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4956:1: ( ')' )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4956:1: ( ')' )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4957:1: ')'
				{
					before(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_4());
					match(input, 39, FOLLOW_39_in_rule__Function__Group__4__Impl10200);
					after(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_4());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Function__Group__4__Impl"


	// $ANTLR start "rule__Number__Group__0"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4980:1: rule__Number__Group__0 : rule__Number__Group__0__Impl rule__Number__Group__1 ;
	public final void rule__Number__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4984:1: ( rule__Number__Group__0__Impl rule__Number__Group__1 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4985:2: rule__Number__Group__0__Impl rule__Number__Group__1
			{
				pushFollow(FOLLOW_rule__Number__Group__0__Impl_in_rule__Number__Group__010241);
				rule__Number__Group__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Number__Group__1_in_rule__Number__Group__010244);
				rule__Number__Group__1();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Number__Group__0"


	// $ANTLR start "rule__Number__Group__0__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4992:1: rule__Number__Group__0__Impl : ( ( rule__Number__OpAssignment_0 )? ) ;
	public final void rule__Number__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4996:1: ( ( ( rule__Number__OpAssignment_0 )? ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4997:1: ( ( rule__Number__OpAssignment_0 )? )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4997:1: ( ( rule__Number__OpAssignment_0 )? )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4998:1: ( rule__Number__OpAssignment_0 )?
				{
					before(grammarAccess.getNumberAccess().getOpAssignment_0());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4999:1: ( rule__Number__OpAssignment_0 )?
					int alt72 = 2;
					int LA72_0 = input.LA(1);

					if (((LA72_0 >= 23 && LA72_0 <= 24))) {
						alt72 = 1;
					}
					switch (alt72) {
					case 1:
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:4999:2: rule__Number__OpAssignment_0
					{
						pushFollow(FOLLOW_rule__Number__OpAssignment_0_in_rule__Number__Group__0__Impl10271);
						rule__Number__OpAssignment_0();

						state._fsp--;


					}
						break;

					}

					after(grammarAccess.getNumberAccess().getOpAssignment_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Number__Group__0__Impl"


	// $ANTLR start "rule__Number__Group__1"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5009:1: rule__Number__Group__1 : rule__Number__Group__1__Impl ;
	public final void rule__Number__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5013:1: ( rule__Number__Group__1__Impl )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5014:2: rule__Number__Group__1__Impl
			{
				pushFollow(FOLLOW_rule__Number__Group__1__Impl_in_rule__Number__Group__110302);
				rule__Number__Group__1__Impl();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Number__Group__1"


	// $ANTLR start "rule__Number__Group__1__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5020:1: rule__Number__Group__1__Impl : ( ( rule__Number__ValueAssignment_1 ) ) ;
	public final void rule__Number__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5024:1: ( ( ( rule__Number__ValueAssignment_1 ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5025:1: ( ( rule__Number__ValueAssignment_1 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5025:1: ( ( rule__Number__ValueAssignment_1 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5026:1: ( rule__Number__ValueAssignment_1 )
				{
					before(grammarAccess.getNumberAccess().getValueAssignment_1());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5027:1: ( rule__Number__ValueAssignment_1 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5027:2: rule__Number__ValueAssignment_1
					{
						pushFollow(FOLLOW_rule__Number__ValueAssignment_1_in_rule__Number__Group__1__Impl10329);
						rule__Number__ValueAssignment_1();

						state._fsp--;


					}

					after(grammarAccess.getNumberAccess().getValueAssignment_1());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Number__Group__1__Impl"


	// $ANTLR start "rule__Percentage__Group__0"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5041:1: rule__Percentage__Group__0 : rule__Percentage__Group__0__Impl rule__Percentage__Group__1 ;
	public final void rule__Percentage__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5045:1: ( rule__Percentage__Group__0__Impl rule__Percentage__Group__1 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5046:2: rule__Percentage__Group__0__Impl rule__Percentage__Group__1
			{
				pushFollow(FOLLOW_rule__Percentage__Group__0__Impl_in_rule__Percentage__Group__010363);
				rule__Percentage__Group__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Percentage__Group__1_in_rule__Percentage__Group__010366);
				rule__Percentage__Group__1();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Percentage__Group__0"


	// $ANTLR start "rule__Percentage__Group__0__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5053:1: rule__Percentage__Group__0__Impl : ( ( rule__Percentage__OpAssignment_0 )? ) ;
	public final void rule__Percentage__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5057:1: ( ( ( rule__Percentage__OpAssignment_0 )? ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5058:1: ( ( rule__Percentage__OpAssignment_0 )? )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5058:1: ( ( rule__Percentage__OpAssignment_0 )? )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5059:1: ( rule__Percentage__OpAssignment_0 )?
				{
					before(grammarAccess.getPercentageAccess().getOpAssignment_0());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5060:1: ( rule__Percentage__OpAssignment_0 )?
					int alt73 = 2;
					int LA73_0 = input.LA(1);

					if (((LA73_0 >= 23 && LA73_0 <= 24))) {
						alt73 = 1;
					}
					switch (alt73) {
					case 1:
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5060:2: rule__Percentage__OpAssignment_0
					{
						pushFollow(FOLLOW_rule__Percentage__OpAssignment_0_in_rule__Percentage__Group__0__Impl10393);
						rule__Percentage__OpAssignment_0();

						state._fsp--;


					}
						break;

					}

					after(grammarAccess.getPercentageAccess().getOpAssignment_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Percentage__Group__0__Impl"


	// $ANTLR start "rule__Percentage__Group__1"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5070:1: rule__Percentage__Group__1 : rule__Percentage__Group__1__Impl rule__Percentage__Group__2 ;
	public final void rule__Percentage__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5074:1: ( rule__Percentage__Group__1__Impl rule__Percentage__Group__2 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5075:2: rule__Percentage__Group__1__Impl rule__Percentage__Group__2
			{
				pushFollow(FOLLOW_rule__Percentage__Group__1__Impl_in_rule__Percentage__Group__110424);
				rule__Percentage__Group__1__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Percentage__Group__2_in_rule__Percentage__Group__110427);
				rule__Percentage__Group__2();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Percentage__Group__1"


	// $ANTLR start "rule__Percentage__Group__1__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5082:1: rule__Percentage__Group__1__Impl : ( ( rule__Percentage__ValueAssignment_1 ) ) ;
	public final void rule__Percentage__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5086:1: ( ( ( rule__Percentage__ValueAssignment_1 ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5087:1: ( ( rule__Percentage__ValueAssignment_1 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5087:1: ( ( rule__Percentage__ValueAssignment_1 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5088:1: ( rule__Percentage__ValueAssignment_1 )
				{
					before(grammarAccess.getPercentageAccess().getValueAssignment_1());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5089:1: ( rule__Percentage__ValueAssignment_1 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5089:2: rule__Percentage__ValueAssignment_1
					{
						pushFollow(FOLLOW_rule__Percentage__ValueAssignment_1_in_rule__Percentage__Group__1__Impl10454);
						rule__Percentage__ValueAssignment_1();

						state._fsp--;


					}

					after(grammarAccess.getPercentageAccess().getValueAssignment_1());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Percentage__Group__1__Impl"


	// $ANTLR start "rule__Percentage__Group__2"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5099:1: rule__Percentage__Group__2 : rule__Percentage__Group__2__Impl ;
	public final void rule__Percentage__Group__2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5103:1: ( rule__Percentage__Group__2__Impl )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5104:2: rule__Percentage__Group__2__Impl
			{
				pushFollow(FOLLOW_rule__Percentage__Group__2__Impl_in_rule__Percentage__Group__210484);
				rule__Percentage__Group__2__Impl();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Percentage__Group__2"


	// $ANTLR start "rule__Percentage__Group__2__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5110:1: rule__Percentage__Group__2__Impl : ( ( rule__Percentage__UnitAssignment_2 ) ) ;
	public final void rule__Percentage__Group__2__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5114:1: ( ( ( rule__Percentage__UnitAssignment_2 ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5115:1: ( ( rule__Percentage__UnitAssignment_2 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5115:1: ( ( rule__Percentage__UnitAssignment_2 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5116:1: ( rule__Percentage__UnitAssignment_2 )
				{
					before(grammarAccess.getPercentageAccess().getUnitAssignment_2());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5117:1: ( rule__Percentage__UnitAssignment_2 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5117:2: rule__Percentage__UnitAssignment_2
					{
						pushFollow(FOLLOW_rule__Percentage__UnitAssignment_2_in_rule__Percentage__Group__2__Impl10511);
						rule__Percentage__UnitAssignment_2();

						state._fsp--;


					}

					after(grammarAccess.getPercentageAccess().getUnitAssignment_2());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Percentage__Group__2__Impl"


	// $ANTLR start "rule__Length__Group__0"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5133:1: rule__Length__Group__0 : rule__Length__Group__0__Impl rule__Length__Group__1 ;
	public final void rule__Length__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5137:1: ( rule__Length__Group__0__Impl rule__Length__Group__1 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5138:2: rule__Length__Group__0__Impl rule__Length__Group__1
			{
				pushFollow(FOLLOW_rule__Length__Group__0__Impl_in_rule__Length__Group__010547);
				rule__Length__Group__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Length__Group__1_in_rule__Length__Group__010550);
				rule__Length__Group__1();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Length__Group__0"


	// $ANTLR start "rule__Length__Group__0__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5145:1: rule__Length__Group__0__Impl : ( ( rule__Length__OpAssignment_0 )? ) ;
	public final void rule__Length__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5149:1: ( ( ( rule__Length__OpAssignment_0 )? ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5150:1: ( ( rule__Length__OpAssignment_0 )? )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5150:1: ( ( rule__Length__OpAssignment_0 )? )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5151:1: ( rule__Length__OpAssignment_0 )?
				{
					before(grammarAccess.getLengthAccess().getOpAssignment_0());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5152:1: ( rule__Length__OpAssignment_0 )?
					int alt74 = 2;
					int LA74_0 = input.LA(1);

					if (((LA74_0 >= 23 && LA74_0 <= 24))) {
						alt74 = 1;
					}
					switch (alt74) {
					case 1:
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5152:2: rule__Length__OpAssignment_0
					{
						pushFollow(FOLLOW_rule__Length__OpAssignment_0_in_rule__Length__Group__0__Impl10577);
						rule__Length__OpAssignment_0();

						state._fsp--;


					}
						break;

					}

					after(grammarAccess.getLengthAccess().getOpAssignment_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Length__Group__0__Impl"


	// $ANTLR start "rule__Length__Group__1"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5162:1: rule__Length__Group__1 : rule__Length__Group__1__Impl rule__Length__Group__2 ;
	public final void rule__Length__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5166:1: ( rule__Length__Group__1__Impl rule__Length__Group__2 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5167:2: rule__Length__Group__1__Impl rule__Length__Group__2
			{
				pushFollow(FOLLOW_rule__Length__Group__1__Impl_in_rule__Length__Group__110608);
				rule__Length__Group__1__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Length__Group__2_in_rule__Length__Group__110611);
				rule__Length__Group__2();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Length__Group__1"


	// $ANTLR start "rule__Length__Group__1__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5174:1: rule__Length__Group__1__Impl : ( ( rule__Length__ValueAssignment_1 ) ) ;
	public final void rule__Length__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5178:1: ( ( ( rule__Length__ValueAssignment_1 ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5179:1: ( ( rule__Length__ValueAssignment_1 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5179:1: ( ( rule__Length__ValueAssignment_1 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5180:1: ( rule__Length__ValueAssignment_1 )
				{
					before(grammarAccess.getLengthAccess().getValueAssignment_1());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5181:1: ( rule__Length__ValueAssignment_1 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5181:2: rule__Length__ValueAssignment_1
					{
						pushFollow(FOLLOW_rule__Length__ValueAssignment_1_in_rule__Length__Group__1__Impl10638);
						rule__Length__ValueAssignment_1();

						state._fsp--;


					}

					after(grammarAccess.getLengthAccess().getValueAssignment_1());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Length__Group__1__Impl"


	// $ANTLR start "rule__Length__Group__2"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5191:1: rule__Length__Group__2 : rule__Length__Group__2__Impl ;
	public final void rule__Length__Group__2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5195:1: ( rule__Length__Group__2__Impl )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5196:2: rule__Length__Group__2__Impl
			{
				pushFollow(FOLLOW_rule__Length__Group__2__Impl_in_rule__Length__Group__210668);
				rule__Length__Group__2__Impl();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Length__Group__2"


	// $ANTLR start "rule__Length__Group__2__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5202:1: rule__Length__Group__2__Impl : ( ( rule__Length__UnitAssignment_2 ) ) ;
	public final void rule__Length__Group__2__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5206:1: ( ( ( rule__Length__UnitAssignment_2 ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5207:1: ( ( rule__Length__UnitAssignment_2 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5207:1: ( ( rule__Length__UnitAssignment_2 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5208:1: ( rule__Length__UnitAssignment_2 )
				{
					before(grammarAccess.getLengthAccess().getUnitAssignment_2());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5209:1: ( rule__Length__UnitAssignment_2 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5209:2: rule__Length__UnitAssignment_2
					{
						pushFollow(FOLLOW_rule__Length__UnitAssignment_2_in_rule__Length__Group__2__Impl10695);
						rule__Length__UnitAssignment_2();

						state._fsp--;


					}

					after(grammarAccess.getLengthAccess().getUnitAssignment_2());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Length__Group__2__Impl"


	// $ANTLR start "rule__Ems__Group__0"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5225:1: rule__Ems__Group__0 : rule__Ems__Group__0__Impl rule__Ems__Group__1 ;
	public final void rule__Ems__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5229:1: ( rule__Ems__Group__0__Impl rule__Ems__Group__1 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5230:2: rule__Ems__Group__0__Impl rule__Ems__Group__1
			{
				pushFollow(FOLLOW_rule__Ems__Group__0__Impl_in_rule__Ems__Group__010731);
				rule__Ems__Group__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Ems__Group__1_in_rule__Ems__Group__010734);
				rule__Ems__Group__1();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Ems__Group__0"


	// $ANTLR start "rule__Ems__Group__0__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5237:1: rule__Ems__Group__0__Impl : ( ( rule__Ems__OpAssignment_0 )? ) ;
	public final void rule__Ems__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5241:1: ( ( ( rule__Ems__OpAssignment_0 )? ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5242:1: ( ( rule__Ems__OpAssignment_0 )? )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5242:1: ( ( rule__Ems__OpAssignment_0 )? )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5243:1: ( rule__Ems__OpAssignment_0 )?
				{
					before(grammarAccess.getEmsAccess().getOpAssignment_0());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5244:1: ( rule__Ems__OpAssignment_0 )?
					int alt75 = 2;
					int LA75_0 = input.LA(1);

					if (((LA75_0 >= 23 && LA75_0 <= 24))) {
						alt75 = 1;
					}
					switch (alt75) {
					case 1:
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5244:2: rule__Ems__OpAssignment_0
					{
						pushFollow(FOLLOW_rule__Ems__OpAssignment_0_in_rule__Ems__Group__0__Impl10761);
						rule__Ems__OpAssignment_0();

						state._fsp--;


					}
						break;

					}

					after(grammarAccess.getEmsAccess().getOpAssignment_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Ems__Group__0__Impl"


	// $ANTLR start "rule__Ems__Group__1"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5254:1: rule__Ems__Group__1 : rule__Ems__Group__1__Impl rule__Ems__Group__2 ;
	public final void rule__Ems__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5258:1: ( rule__Ems__Group__1__Impl rule__Ems__Group__2 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5259:2: rule__Ems__Group__1__Impl rule__Ems__Group__2
			{
				pushFollow(FOLLOW_rule__Ems__Group__1__Impl_in_rule__Ems__Group__110792);
				rule__Ems__Group__1__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Ems__Group__2_in_rule__Ems__Group__110795);
				rule__Ems__Group__2();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Ems__Group__1"


	// $ANTLR start "rule__Ems__Group__1__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5266:1: rule__Ems__Group__1__Impl : ( ( rule__Ems__ValueAssignment_1 ) ) ;
	public final void rule__Ems__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5270:1: ( ( ( rule__Ems__ValueAssignment_1 ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5271:1: ( ( rule__Ems__ValueAssignment_1 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5271:1: ( ( rule__Ems__ValueAssignment_1 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5272:1: ( rule__Ems__ValueAssignment_1 )
				{
					before(grammarAccess.getEmsAccess().getValueAssignment_1());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5273:1: ( rule__Ems__ValueAssignment_1 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5273:2: rule__Ems__ValueAssignment_1
					{
						pushFollow(FOLLOW_rule__Ems__ValueAssignment_1_in_rule__Ems__Group__1__Impl10822);
						rule__Ems__ValueAssignment_1();

						state._fsp--;


					}

					after(grammarAccess.getEmsAccess().getValueAssignment_1());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Ems__Group__1__Impl"


	// $ANTLR start "rule__Ems__Group__2"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5283:1: rule__Ems__Group__2 : rule__Ems__Group__2__Impl ;
	public final void rule__Ems__Group__2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5287:1: ( rule__Ems__Group__2__Impl )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5288:2: rule__Ems__Group__2__Impl
			{
				pushFollow(FOLLOW_rule__Ems__Group__2__Impl_in_rule__Ems__Group__210852);
				rule__Ems__Group__2__Impl();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Ems__Group__2"


	// $ANTLR start "rule__Ems__Group__2__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5294:1: rule__Ems__Group__2__Impl : ( ( rule__Ems__UnitAssignment_2 ) ) ;
	public final void rule__Ems__Group__2__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5298:1: ( ( ( rule__Ems__UnitAssignment_2 ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5299:1: ( ( rule__Ems__UnitAssignment_2 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5299:1: ( ( rule__Ems__UnitAssignment_2 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5300:1: ( rule__Ems__UnitAssignment_2 )
				{
					before(grammarAccess.getEmsAccess().getUnitAssignment_2());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5301:1: ( rule__Ems__UnitAssignment_2 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5301:2: rule__Ems__UnitAssignment_2
					{
						pushFollow(FOLLOW_rule__Ems__UnitAssignment_2_in_rule__Ems__Group__2__Impl10879);
						rule__Ems__UnitAssignment_2();

						state._fsp--;


					}

					after(grammarAccess.getEmsAccess().getUnitAssignment_2());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Ems__Group__2__Impl"


	// $ANTLR start "rule__Exs__Group__0"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5317:1: rule__Exs__Group__0 : rule__Exs__Group__0__Impl rule__Exs__Group__1 ;
	public final void rule__Exs__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5321:1: ( rule__Exs__Group__0__Impl rule__Exs__Group__1 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5322:2: rule__Exs__Group__0__Impl rule__Exs__Group__1
			{
				pushFollow(FOLLOW_rule__Exs__Group__0__Impl_in_rule__Exs__Group__010915);
				rule__Exs__Group__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Exs__Group__1_in_rule__Exs__Group__010918);
				rule__Exs__Group__1();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Exs__Group__0"


	// $ANTLR start "rule__Exs__Group__0__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5329:1: rule__Exs__Group__0__Impl : ( ( rule__Exs__OpAssignment_0 )? ) ;
	public final void rule__Exs__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5333:1: ( ( ( rule__Exs__OpAssignment_0 )? ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5334:1: ( ( rule__Exs__OpAssignment_0 )? )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5334:1: ( ( rule__Exs__OpAssignment_0 )? )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5335:1: ( rule__Exs__OpAssignment_0 )?
				{
					before(grammarAccess.getExsAccess().getOpAssignment_0());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5336:1: ( rule__Exs__OpAssignment_0 )?
					int alt76 = 2;
					int LA76_0 = input.LA(1);

					if (((LA76_0 >= 23 && LA76_0 <= 24))) {
						alt76 = 1;
					}
					switch (alt76) {
					case 1:
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5336:2: rule__Exs__OpAssignment_0
					{
						pushFollow(FOLLOW_rule__Exs__OpAssignment_0_in_rule__Exs__Group__0__Impl10945);
						rule__Exs__OpAssignment_0();

						state._fsp--;


					}
						break;

					}

					after(grammarAccess.getExsAccess().getOpAssignment_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Exs__Group__0__Impl"


	// $ANTLR start "rule__Exs__Group__1"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5346:1: rule__Exs__Group__1 : rule__Exs__Group__1__Impl rule__Exs__Group__2 ;
	public final void rule__Exs__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5350:1: ( rule__Exs__Group__1__Impl rule__Exs__Group__2 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5351:2: rule__Exs__Group__1__Impl rule__Exs__Group__2
			{
				pushFollow(FOLLOW_rule__Exs__Group__1__Impl_in_rule__Exs__Group__110976);
				rule__Exs__Group__1__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Exs__Group__2_in_rule__Exs__Group__110979);
				rule__Exs__Group__2();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Exs__Group__1"


	// $ANTLR start "rule__Exs__Group__1__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5358:1: rule__Exs__Group__1__Impl : ( ( rule__Exs__ValueAssignment_1 ) ) ;
	public final void rule__Exs__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5362:1: ( ( ( rule__Exs__ValueAssignment_1 ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5363:1: ( ( rule__Exs__ValueAssignment_1 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5363:1: ( ( rule__Exs__ValueAssignment_1 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5364:1: ( rule__Exs__ValueAssignment_1 )
				{
					before(grammarAccess.getExsAccess().getValueAssignment_1());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5365:1: ( rule__Exs__ValueAssignment_1 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5365:2: rule__Exs__ValueAssignment_1
					{
						pushFollow(FOLLOW_rule__Exs__ValueAssignment_1_in_rule__Exs__Group__1__Impl11006);
						rule__Exs__ValueAssignment_1();

						state._fsp--;


					}

					after(grammarAccess.getExsAccess().getValueAssignment_1());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Exs__Group__1__Impl"


	// $ANTLR start "rule__Exs__Group__2"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5375:1: rule__Exs__Group__2 : rule__Exs__Group__2__Impl ;
	public final void rule__Exs__Group__2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5379:1: ( rule__Exs__Group__2__Impl )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5380:2: rule__Exs__Group__2__Impl
			{
				pushFollow(FOLLOW_rule__Exs__Group__2__Impl_in_rule__Exs__Group__211036);
				rule__Exs__Group__2__Impl();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Exs__Group__2"


	// $ANTLR start "rule__Exs__Group__2__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5386:1: rule__Exs__Group__2__Impl : ( ( rule__Exs__UnitAssignment_2 ) ) ;
	public final void rule__Exs__Group__2__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5390:1: ( ( ( rule__Exs__UnitAssignment_2 ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5391:1: ( ( rule__Exs__UnitAssignment_2 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5391:1: ( ( rule__Exs__UnitAssignment_2 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5392:1: ( rule__Exs__UnitAssignment_2 )
				{
					before(grammarAccess.getExsAccess().getUnitAssignment_2());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5393:1: ( rule__Exs__UnitAssignment_2 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5393:2: rule__Exs__UnitAssignment_2
					{
						pushFollow(FOLLOW_rule__Exs__UnitAssignment_2_in_rule__Exs__Group__2__Impl11063);
						rule__Exs__UnitAssignment_2();

						state._fsp--;


					}

					after(grammarAccess.getExsAccess().getUnitAssignment_2());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Exs__Group__2__Impl"


	// $ANTLR start "rule__Angle__Group__0"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5409:1: rule__Angle__Group__0 : rule__Angle__Group__0__Impl rule__Angle__Group__1 ;
	public final void rule__Angle__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5413:1: ( rule__Angle__Group__0__Impl rule__Angle__Group__1 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5414:2: rule__Angle__Group__0__Impl rule__Angle__Group__1
			{
				pushFollow(FOLLOW_rule__Angle__Group__0__Impl_in_rule__Angle__Group__011099);
				rule__Angle__Group__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Angle__Group__1_in_rule__Angle__Group__011102);
				rule__Angle__Group__1();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Angle__Group__0"


	// $ANTLR start "rule__Angle__Group__0__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5421:1: rule__Angle__Group__0__Impl : ( ( rule__Angle__OpAssignment_0 )? ) ;
	public final void rule__Angle__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5425:1: ( ( ( rule__Angle__OpAssignment_0 )? ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5426:1: ( ( rule__Angle__OpAssignment_0 )? )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5426:1: ( ( rule__Angle__OpAssignment_0 )? )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5427:1: ( rule__Angle__OpAssignment_0 )?
				{
					before(grammarAccess.getAngleAccess().getOpAssignment_0());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5428:1: ( rule__Angle__OpAssignment_0 )?
					int alt77 = 2;
					int LA77_0 = input.LA(1);

					if (((LA77_0 >= 23 && LA77_0 <= 24))) {
						alt77 = 1;
					}
					switch (alt77) {
					case 1:
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5428:2: rule__Angle__OpAssignment_0
					{
						pushFollow(FOLLOW_rule__Angle__OpAssignment_0_in_rule__Angle__Group__0__Impl11129);
						rule__Angle__OpAssignment_0();

						state._fsp--;


					}
						break;

					}

					after(grammarAccess.getAngleAccess().getOpAssignment_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Angle__Group__0__Impl"


	// $ANTLR start "rule__Angle__Group__1"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5438:1: rule__Angle__Group__1 : rule__Angle__Group__1__Impl rule__Angle__Group__2 ;
	public final void rule__Angle__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5442:1: ( rule__Angle__Group__1__Impl rule__Angle__Group__2 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5443:2: rule__Angle__Group__1__Impl rule__Angle__Group__2
			{
				pushFollow(FOLLOW_rule__Angle__Group__1__Impl_in_rule__Angle__Group__111160);
				rule__Angle__Group__1__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Angle__Group__2_in_rule__Angle__Group__111163);
				rule__Angle__Group__2();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Angle__Group__1"


	// $ANTLR start "rule__Angle__Group__1__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5450:1: rule__Angle__Group__1__Impl : ( ( rule__Angle__ValueAssignment_1 ) ) ;
	public final void rule__Angle__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5454:1: ( ( ( rule__Angle__ValueAssignment_1 ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5455:1: ( ( rule__Angle__ValueAssignment_1 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5455:1: ( ( rule__Angle__ValueAssignment_1 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5456:1: ( rule__Angle__ValueAssignment_1 )
				{
					before(grammarAccess.getAngleAccess().getValueAssignment_1());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5457:1: ( rule__Angle__ValueAssignment_1 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5457:2: rule__Angle__ValueAssignment_1
					{
						pushFollow(FOLLOW_rule__Angle__ValueAssignment_1_in_rule__Angle__Group__1__Impl11190);
						rule__Angle__ValueAssignment_1();

						state._fsp--;


					}

					after(grammarAccess.getAngleAccess().getValueAssignment_1());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Angle__Group__1__Impl"


	// $ANTLR start "rule__Angle__Group__2"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5467:1: rule__Angle__Group__2 : rule__Angle__Group__2__Impl ;
	public final void rule__Angle__Group__2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5471:1: ( rule__Angle__Group__2__Impl )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5472:2: rule__Angle__Group__2__Impl
			{
				pushFollow(FOLLOW_rule__Angle__Group__2__Impl_in_rule__Angle__Group__211220);
				rule__Angle__Group__2__Impl();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Angle__Group__2"


	// $ANTLR start "rule__Angle__Group__2__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5478:1: rule__Angle__Group__2__Impl : ( ( rule__Angle__UnitAssignment_2 ) ) ;
	public final void rule__Angle__Group__2__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5482:1: ( ( ( rule__Angle__UnitAssignment_2 ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5483:1: ( ( rule__Angle__UnitAssignment_2 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5483:1: ( ( rule__Angle__UnitAssignment_2 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5484:1: ( rule__Angle__UnitAssignment_2 )
				{
					before(grammarAccess.getAngleAccess().getUnitAssignment_2());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5485:1: ( rule__Angle__UnitAssignment_2 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5485:2: rule__Angle__UnitAssignment_2
					{
						pushFollow(FOLLOW_rule__Angle__UnitAssignment_2_in_rule__Angle__Group__2__Impl11247);
						rule__Angle__UnitAssignment_2();

						state._fsp--;


					}

					after(grammarAccess.getAngleAccess().getUnitAssignment_2());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Angle__Group__2__Impl"


	// $ANTLR start "rule__Time__Group__0"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5501:1: rule__Time__Group__0 : rule__Time__Group__0__Impl rule__Time__Group__1 ;
	public final void rule__Time__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5505:1: ( rule__Time__Group__0__Impl rule__Time__Group__1 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5506:2: rule__Time__Group__0__Impl rule__Time__Group__1
			{
				pushFollow(FOLLOW_rule__Time__Group__0__Impl_in_rule__Time__Group__011283);
				rule__Time__Group__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Time__Group__1_in_rule__Time__Group__011286);
				rule__Time__Group__1();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Time__Group__0"


	// $ANTLR start "rule__Time__Group__0__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5513:1: rule__Time__Group__0__Impl : ( ( rule__Time__OpAssignment_0 )? ) ;
	public final void rule__Time__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5517:1: ( ( ( rule__Time__OpAssignment_0 )? ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5518:1: ( ( rule__Time__OpAssignment_0 )? )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5518:1: ( ( rule__Time__OpAssignment_0 )? )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5519:1: ( rule__Time__OpAssignment_0 )?
				{
					before(grammarAccess.getTimeAccess().getOpAssignment_0());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5520:1: ( rule__Time__OpAssignment_0 )?
					int alt78 = 2;
					int LA78_0 = input.LA(1);

					if (((LA78_0 >= 23 && LA78_0 <= 24))) {
						alt78 = 1;
					}
					switch (alt78) {
					case 1:
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5520:2: rule__Time__OpAssignment_0
					{
						pushFollow(FOLLOW_rule__Time__OpAssignment_0_in_rule__Time__Group__0__Impl11313);
						rule__Time__OpAssignment_0();

						state._fsp--;


					}
						break;

					}

					after(grammarAccess.getTimeAccess().getOpAssignment_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Time__Group__0__Impl"


	// $ANTLR start "rule__Time__Group__1"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5530:1: rule__Time__Group__1 : rule__Time__Group__1__Impl rule__Time__Group__2 ;
	public final void rule__Time__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5534:1: ( rule__Time__Group__1__Impl rule__Time__Group__2 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5535:2: rule__Time__Group__1__Impl rule__Time__Group__2
			{
				pushFollow(FOLLOW_rule__Time__Group__1__Impl_in_rule__Time__Group__111344);
				rule__Time__Group__1__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Time__Group__2_in_rule__Time__Group__111347);
				rule__Time__Group__2();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Time__Group__1"


	// $ANTLR start "rule__Time__Group__1__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5542:1: rule__Time__Group__1__Impl : ( ( rule__Time__ValueAssignment_1 ) ) ;
	public final void rule__Time__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5546:1: ( ( ( rule__Time__ValueAssignment_1 ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5547:1: ( ( rule__Time__ValueAssignment_1 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5547:1: ( ( rule__Time__ValueAssignment_1 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5548:1: ( rule__Time__ValueAssignment_1 )
				{
					before(grammarAccess.getTimeAccess().getValueAssignment_1());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5549:1: ( rule__Time__ValueAssignment_1 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5549:2: rule__Time__ValueAssignment_1
					{
						pushFollow(FOLLOW_rule__Time__ValueAssignment_1_in_rule__Time__Group__1__Impl11374);
						rule__Time__ValueAssignment_1();

						state._fsp--;


					}

					after(grammarAccess.getTimeAccess().getValueAssignment_1());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Time__Group__1__Impl"


	// $ANTLR start "rule__Time__Group__2"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5559:1: rule__Time__Group__2 : rule__Time__Group__2__Impl ;
	public final void rule__Time__Group__2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5563:1: ( rule__Time__Group__2__Impl )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5564:2: rule__Time__Group__2__Impl
			{
				pushFollow(FOLLOW_rule__Time__Group__2__Impl_in_rule__Time__Group__211404);
				rule__Time__Group__2__Impl();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Time__Group__2"


	// $ANTLR start "rule__Time__Group__2__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5570:1: rule__Time__Group__2__Impl : ( ( rule__Time__UnitAssignment_2 ) ) ;
	public final void rule__Time__Group__2__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5574:1: ( ( ( rule__Time__UnitAssignment_2 ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5575:1: ( ( rule__Time__UnitAssignment_2 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5575:1: ( ( rule__Time__UnitAssignment_2 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5576:1: ( rule__Time__UnitAssignment_2 )
				{
					before(grammarAccess.getTimeAccess().getUnitAssignment_2());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5577:1: ( rule__Time__UnitAssignment_2 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5577:2: rule__Time__UnitAssignment_2
					{
						pushFollow(FOLLOW_rule__Time__UnitAssignment_2_in_rule__Time__Group__2__Impl11431);
						rule__Time__UnitAssignment_2();

						state._fsp--;


					}

					after(grammarAccess.getTimeAccess().getUnitAssignment_2());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Time__Group__2__Impl"


	// $ANTLR start "rule__Frequency__Group__0"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5593:1: rule__Frequency__Group__0 : rule__Frequency__Group__0__Impl rule__Frequency__Group__1 ;
	public final void rule__Frequency__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5597:1: ( rule__Frequency__Group__0__Impl rule__Frequency__Group__1 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5598:2: rule__Frequency__Group__0__Impl rule__Frequency__Group__1
			{
				pushFollow(FOLLOW_rule__Frequency__Group__0__Impl_in_rule__Frequency__Group__011467);
				rule__Frequency__Group__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Frequency__Group__1_in_rule__Frequency__Group__011470);
				rule__Frequency__Group__1();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Frequency__Group__0"


	// $ANTLR start "rule__Frequency__Group__0__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5605:1: rule__Frequency__Group__0__Impl : ( ( rule__Frequency__OpAssignment_0 )? ) ;
	public final void rule__Frequency__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5609:1: ( ( ( rule__Frequency__OpAssignment_0 )? ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5610:1: ( ( rule__Frequency__OpAssignment_0 )? )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5610:1: ( ( rule__Frequency__OpAssignment_0 )? )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5611:1: ( rule__Frequency__OpAssignment_0 )?
				{
					before(grammarAccess.getFrequencyAccess().getOpAssignment_0());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5612:1: ( rule__Frequency__OpAssignment_0 )?
					int alt79 = 2;
					int LA79_0 = input.LA(1);

					if (((LA79_0 >= 23 && LA79_0 <= 24))) {
						alt79 = 1;
					}
					switch (alt79) {
					case 1:
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5612:2: rule__Frequency__OpAssignment_0
					{
						pushFollow(FOLLOW_rule__Frequency__OpAssignment_0_in_rule__Frequency__Group__0__Impl11497);
						rule__Frequency__OpAssignment_0();

						state._fsp--;


					}
						break;

					}

					after(grammarAccess.getFrequencyAccess().getOpAssignment_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Frequency__Group__0__Impl"


	// $ANTLR start "rule__Frequency__Group__1"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5622:1: rule__Frequency__Group__1 : rule__Frequency__Group__1__Impl rule__Frequency__Group__2 ;
	public final void rule__Frequency__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5626:1: ( rule__Frequency__Group__1__Impl rule__Frequency__Group__2 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5627:2: rule__Frequency__Group__1__Impl rule__Frequency__Group__2
			{
				pushFollow(FOLLOW_rule__Frequency__Group__1__Impl_in_rule__Frequency__Group__111528);
				rule__Frequency__Group__1__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Frequency__Group__2_in_rule__Frequency__Group__111531);
				rule__Frequency__Group__2();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Frequency__Group__1"


	// $ANTLR start "rule__Frequency__Group__1__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5634:1: rule__Frequency__Group__1__Impl : ( ( rule__Frequency__ValueAssignment_1 ) ) ;
	public final void rule__Frequency__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5638:1: ( ( ( rule__Frequency__ValueAssignment_1 ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5639:1: ( ( rule__Frequency__ValueAssignment_1 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5639:1: ( ( rule__Frequency__ValueAssignment_1 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5640:1: ( rule__Frequency__ValueAssignment_1 )
				{
					before(grammarAccess.getFrequencyAccess().getValueAssignment_1());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5641:1: ( rule__Frequency__ValueAssignment_1 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5641:2: rule__Frequency__ValueAssignment_1
					{
						pushFollow(FOLLOW_rule__Frequency__ValueAssignment_1_in_rule__Frequency__Group__1__Impl11558);
						rule__Frequency__ValueAssignment_1();

						state._fsp--;


					}

					after(grammarAccess.getFrequencyAccess().getValueAssignment_1());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Frequency__Group__1__Impl"


	// $ANTLR start "rule__Frequency__Group__2"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5651:1: rule__Frequency__Group__2 : rule__Frequency__Group__2__Impl ;
	public final void rule__Frequency__Group__2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5655:1: ( rule__Frequency__Group__2__Impl )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5656:2: rule__Frequency__Group__2__Impl
			{
				pushFollow(FOLLOW_rule__Frequency__Group__2__Impl_in_rule__Frequency__Group__211588);
				rule__Frequency__Group__2__Impl();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Frequency__Group__2"


	// $ANTLR start "rule__Frequency__Group__2__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5662:1: rule__Frequency__Group__2__Impl : ( ( rule__Frequency__UnitAssignment_2 ) ) ;
	public final void rule__Frequency__Group__2__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5666:1: ( ( ( rule__Frequency__UnitAssignment_2 ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5667:1: ( ( rule__Frequency__UnitAssignment_2 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5667:1: ( ( rule__Frequency__UnitAssignment_2 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5668:1: ( rule__Frequency__UnitAssignment_2 )
				{
					before(grammarAccess.getFrequencyAccess().getUnitAssignment_2());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5669:1: ( rule__Frequency__UnitAssignment_2 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5669:2: rule__Frequency__UnitAssignment_2
					{
						pushFollow(FOLLOW_rule__Frequency__UnitAssignment_2_in_rule__Frequency__Group__2__Impl11615);
						rule__Frequency__UnitAssignment_2();

						state._fsp--;


					}

					after(grammarAccess.getFrequencyAccess().getUnitAssignment_2());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Frequency__Group__2__Impl"


	// $ANTLR start "rule__Uri__Group__0"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5685:1: rule__Uri__Group__0 : rule__Uri__Group__0__Impl rule__Uri__Group__1 ;
	public final void rule__Uri__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5689:1: ( rule__Uri__Group__0__Impl rule__Uri__Group__1 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5690:2: rule__Uri__Group__0__Impl rule__Uri__Group__1
			{
				pushFollow(FOLLOW_rule__Uri__Group__0__Impl_in_rule__Uri__Group__011651);
				rule__Uri__Group__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Uri__Group__1_in_rule__Uri__Group__011654);
				rule__Uri__Group__1();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Uri__Group__0"


	// $ANTLR start "rule__Uri__Group__0__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5697:1: rule__Uri__Group__0__Impl : ( 'url(' ) ;
	public final void rule__Uri__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5701:1: ( ( 'url(' ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5702:1: ( 'url(' )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5702:1: ( 'url(' )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5703:1: 'url('
				{
					before(grammarAccess.getUriAccess().getUrlKeyword_0());
					match(input, 40, FOLLOW_40_in_rule__Uri__Group__0__Impl11682);
					after(grammarAccess.getUriAccess().getUrlKeyword_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Uri__Group__0__Impl"


	// $ANTLR start "rule__Uri__Group__1"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5716:1: rule__Uri__Group__1 : rule__Uri__Group__1__Impl rule__Uri__Group__2 ;
	public final void rule__Uri__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5720:1: ( rule__Uri__Group__1__Impl rule__Uri__Group__2 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5721:2: rule__Uri__Group__1__Impl rule__Uri__Group__2
			{
				pushFollow(FOLLOW_rule__Uri__Group__1__Impl_in_rule__Uri__Group__111713);
				rule__Uri__Group__1__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Uri__Group__2_in_rule__Uri__Group__111716);
				rule__Uri__Group__2();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Uri__Group__1"


	// $ANTLR start "rule__Uri__Group__1__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5728:1: rule__Uri__Group__1__Impl : ( ( RULE_WS )? ) ;
	public final void rule__Uri__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5732:1: ( ( ( RULE_WS )? ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5733:1: ( ( RULE_WS )? )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5733:1: ( ( RULE_WS )? )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5734:1: ( RULE_WS )?
				{
					before(grammarAccess.getUriAccess().getWSTerminalRuleCall_1());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5735:1: ( RULE_WS )?
					int alt80 = 2;
					int LA80_0 = input.LA(1);

					if ((LA80_0 == RULE_WS)) {
						alt80 = 1;
					}
					switch (alt80) {
					case 1:
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5735:3: RULE_WS
					{
						match(input, RULE_WS, FOLLOW_RULE_WS_in_rule__Uri__Group__1__Impl11744);

					}
						break;

					}

					after(grammarAccess.getUriAccess().getWSTerminalRuleCall_1());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Uri__Group__1__Impl"


	// $ANTLR start "rule__Uri__Group__2"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5745:1: rule__Uri__Group__2 : rule__Uri__Group__2__Impl rule__Uri__Group__3 ;
	public final void rule__Uri__Group__2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5749:1: ( rule__Uri__Group__2__Impl rule__Uri__Group__3 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5750:2: rule__Uri__Group__2__Impl rule__Uri__Group__3
			{
				pushFollow(FOLLOW_rule__Uri__Group__2__Impl_in_rule__Uri__Group__211775);
				rule__Uri__Group__2__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Uri__Group__3_in_rule__Uri__Group__211778);
				rule__Uri__Group__3();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Uri__Group__2"


	// $ANTLR start "rule__Uri__Group__2__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5757:1: rule__Uri__Group__2__Impl : ( ( rule__Uri__ValueAssignment_2 ) ) ;
	public final void rule__Uri__Group__2__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5761:1: ( ( ( rule__Uri__ValueAssignment_2 ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5762:1: ( ( rule__Uri__ValueAssignment_2 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5762:1: ( ( rule__Uri__ValueAssignment_2 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5763:1: ( rule__Uri__ValueAssignment_2 )
				{
					before(grammarAccess.getUriAccess().getValueAssignment_2());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5764:1: ( rule__Uri__ValueAssignment_2 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5764:2: rule__Uri__ValueAssignment_2
					{
						pushFollow(FOLLOW_rule__Uri__ValueAssignment_2_in_rule__Uri__Group__2__Impl11805);
						rule__Uri__ValueAssignment_2();

						state._fsp--;


					}

					after(grammarAccess.getUriAccess().getValueAssignment_2());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Uri__Group__2__Impl"


	// $ANTLR start "rule__Uri__Group__3"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5774:1: rule__Uri__Group__3 : rule__Uri__Group__3__Impl rule__Uri__Group__4 ;
	public final void rule__Uri__Group__3() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5778:1: ( rule__Uri__Group__3__Impl rule__Uri__Group__4 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5779:2: rule__Uri__Group__3__Impl rule__Uri__Group__4
			{
				pushFollow(FOLLOW_rule__Uri__Group__3__Impl_in_rule__Uri__Group__311835);
				rule__Uri__Group__3__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Uri__Group__4_in_rule__Uri__Group__311838);
				rule__Uri__Group__4();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Uri__Group__3"


	// $ANTLR start "rule__Uri__Group__3__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5786:1: rule__Uri__Group__3__Impl : ( ( RULE_WS )? ) ;
	public final void rule__Uri__Group__3__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5790:1: ( ( ( RULE_WS )? ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5791:1: ( ( RULE_WS )? )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5791:1: ( ( RULE_WS )? )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5792:1: ( RULE_WS )?
				{
					before(grammarAccess.getUriAccess().getWSTerminalRuleCall_3());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5793:1: ( RULE_WS )?
					int alt81 = 2;
					int LA81_0 = input.LA(1);

					if ((LA81_0 == RULE_WS)) {
						alt81 = 1;
					}
					switch (alt81) {
					case 1:
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5793:3: RULE_WS
					{
						match(input, RULE_WS, FOLLOW_RULE_WS_in_rule__Uri__Group__3__Impl11866);

					}
						break;

					}

					after(grammarAccess.getUriAccess().getWSTerminalRuleCall_3());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Uri__Group__3__Impl"


	// $ANTLR start "rule__Uri__Group__4"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5803:1: rule__Uri__Group__4 : rule__Uri__Group__4__Impl ;
	public final void rule__Uri__Group__4() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5807:1: ( rule__Uri__Group__4__Impl )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5808:2: rule__Uri__Group__4__Impl
			{
				pushFollow(FOLLOW_rule__Uri__Group__4__Impl_in_rule__Uri__Group__411897);
				rule__Uri__Group__4__Impl();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Uri__Group__4"


	// $ANTLR start "rule__Uri__Group__4__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5814:1: rule__Uri__Group__4__Impl : ( ')' ) ;
	public final void rule__Uri__Group__4__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5818:1: ( ( ')' ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5819:1: ( ')' )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5819:1: ( ')' )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5820:1: ')'
				{
					before(grammarAccess.getUriAccess().getRightParenthesisKeyword_4());
					match(input, 39, FOLLOW_39_in_rule__Uri__Group__4__Impl11925);
					after(grammarAccess.getUriAccess().getRightParenthesisKeyword_4());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Uri__Group__4__Impl"


	// $ANTLR start "rule__Operator__Group_0__0"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5843:1: rule__Operator__Group_0__0 : rule__Operator__Group_0__0__Impl rule__Operator__Group_0__1 ;
	public final void rule__Operator__Group_0__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5847:1: ( rule__Operator__Group_0__0__Impl rule__Operator__Group_0__1 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5848:2: rule__Operator__Group_0__0__Impl rule__Operator__Group_0__1
			{
				pushFollow(FOLLOW_rule__Operator__Group_0__0__Impl_in_rule__Operator__Group_0__011966);
				rule__Operator__Group_0__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Operator__Group_0__1_in_rule__Operator__Group_0__011969);
				rule__Operator__Group_0__1();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Operator__Group_0__0"


	// $ANTLR start "rule__Operator__Group_0__0__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5855:1: rule__Operator__Group_0__0__Impl : ( '/' ) ;
	public final void rule__Operator__Group_0__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5859:1: ( ( '/' ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5860:1: ( '/' )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5860:1: ( '/' )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5861:1: '/'
				{
					before(grammarAccess.getOperatorAccess().getSolidusKeyword_0_0());
					match(input, 41, FOLLOW_41_in_rule__Operator__Group_0__0__Impl11997);
					after(grammarAccess.getOperatorAccess().getSolidusKeyword_0_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Operator__Group_0__0__Impl"


	// $ANTLR start "rule__Operator__Group_0__1"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5874:1: rule__Operator__Group_0__1 : rule__Operator__Group_0__1__Impl ;
	public final void rule__Operator__Group_0__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5878:1: ( rule__Operator__Group_0__1__Impl )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5879:2: rule__Operator__Group_0__1__Impl
			{
				pushFollow(FOLLOW_rule__Operator__Group_0__1__Impl_in_rule__Operator__Group_0__112028);
				rule__Operator__Group_0__1__Impl();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Operator__Group_0__1"


	// $ANTLR start "rule__Operator__Group_0__1__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5885:1: rule__Operator__Group_0__1__Impl : ( ( RULE_WS )* ) ;
	public final void rule__Operator__Group_0__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5889:1: ( ( ( RULE_WS )* ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5890:1: ( ( RULE_WS )* )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5890:1: ( ( RULE_WS )* )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5891:1: ( RULE_WS )*
				{
					before(grammarAccess.getOperatorAccess().getWSTerminalRuleCall_0_1());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5892:1: ( RULE_WS )*
					loop82: do {
						int alt82 = 2;
						int LA82_0 = input.LA(1);

						if ((LA82_0 == RULE_WS)) {
							alt82 = 1;
						}


						switch (alt82) {
						case 1:
						// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5892:3: RULE_WS
						{
							match(input, RULE_WS, FOLLOW_RULE_WS_in_rule__Operator__Group_0__1__Impl12056);

						}
							break;

						default:
							break loop82;
						}
					} while (true);

					after(grammarAccess.getOperatorAccess().getWSTerminalRuleCall_0_1());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Operator__Group_0__1__Impl"


	// $ANTLR start "rule__Operator__Group_1__0"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5906:1: rule__Operator__Group_1__0 : rule__Operator__Group_1__0__Impl rule__Operator__Group_1__1 ;
	public final void rule__Operator__Group_1__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5910:1: ( rule__Operator__Group_1__0__Impl rule__Operator__Group_1__1 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5911:2: rule__Operator__Group_1__0__Impl rule__Operator__Group_1__1
			{
				pushFollow(FOLLOW_rule__Operator__Group_1__0__Impl_in_rule__Operator__Group_1__012091);
				rule__Operator__Group_1__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Operator__Group_1__1_in_rule__Operator__Group_1__012094);
				rule__Operator__Group_1__1();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Operator__Group_1__0"


	// $ANTLR start "rule__Operator__Group_1__0__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5918:1: rule__Operator__Group_1__0__Impl : ( ',' ) ;
	public final void rule__Operator__Group_1__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5922:1: ( ( ',' ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5923:1: ( ',' )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5923:1: ( ',' )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5924:1: ','
				{
					before(grammarAccess.getOperatorAccess().getCommaKeyword_1_0());
					match(input, 32, FOLLOW_32_in_rule__Operator__Group_1__0__Impl12122);
					after(grammarAccess.getOperatorAccess().getCommaKeyword_1_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Operator__Group_1__0__Impl"


	// $ANTLR start "rule__Operator__Group_1__1"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5937:1: rule__Operator__Group_1__1 : rule__Operator__Group_1__1__Impl ;
	public final void rule__Operator__Group_1__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5941:1: ( rule__Operator__Group_1__1__Impl )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5942:2: rule__Operator__Group_1__1__Impl
			{
				pushFollow(FOLLOW_rule__Operator__Group_1__1__Impl_in_rule__Operator__Group_1__112153);
				rule__Operator__Group_1__1__Impl();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Operator__Group_1__1"


	// $ANTLR start "rule__Operator__Group_1__1__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5948:1: rule__Operator__Group_1__1__Impl : ( ( RULE_WS )* ) ;
	public final void rule__Operator__Group_1__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5952:1: ( ( ( RULE_WS )* ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5953:1: ( ( RULE_WS )* )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5953:1: ( ( RULE_WS )* )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5954:1: ( RULE_WS )*
				{
					before(grammarAccess.getOperatorAccess().getWSTerminalRuleCall_1_1());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5955:1: ( RULE_WS )*
					loop83: do {
						int alt83 = 2;
						int LA83_0 = input.LA(1);

						if ((LA83_0 == RULE_WS)) {
							alt83 = 1;
						}


						switch (alt83) {
						case 1:
						// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5955:3: RULE_WS
						{
							match(input, RULE_WS, FOLLOW_RULE_WS_in_rule__Operator__Group_1__1__Impl12181);

						}
							break;

						default:
							break loop83;
						}
					} while (true);

					after(grammarAccess.getOperatorAccess().getWSTerminalRuleCall_1_1());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Operator__Group_1__1__Impl"


	// $ANTLR start "rule__Attribute__Group__0"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5969:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
	public final void rule__Attribute__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5973:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5974:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
			{
				pushFollow(FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__012216);
				rule__Attribute__Group__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__012219);
				rule__Attribute__Group__1();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Attribute__Group__0"


	// $ANTLR start "rule__Attribute__Group__0__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5981:1: rule__Attribute__Group__0__Impl : ( '[' ) ;
	public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5985:1: ( ( '[' ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5986:1: ( '[' )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5986:1: ( '[' )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:5987:1: '['
				{
					before(grammarAccess.getAttributeAccess().getLeftSquareBracketKeyword_0());
					match(input, 42, FOLLOW_42_in_rule__Attribute__Group__0__Impl12247);
					after(grammarAccess.getAttributeAccess().getLeftSquareBracketKeyword_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Attribute__Group__0__Impl"


	// $ANTLR start "rule__Attribute__Group__1"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6000:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
	public final void rule__Attribute__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6004:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6005:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
			{
				pushFollow(FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__112278);
				rule__Attribute__Group__1__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__112281);
				rule__Attribute__Group__2();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Attribute__Group__1"


	// $ANTLR start "rule__Attribute__Group__1__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6012:1: rule__Attribute__Group__1__Impl : ( ( RULE_WS )* ) ;
	public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6016:1: ( ( ( RULE_WS )* ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6017:1: ( ( RULE_WS )* )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6017:1: ( ( RULE_WS )* )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6018:1: ( RULE_WS )*
				{
					before(grammarAccess.getAttributeAccess().getWSTerminalRuleCall_1());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6019:1: ( RULE_WS )*
					loop84: do {
						int alt84 = 2;
						int LA84_0 = input.LA(1);

						if ((LA84_0 == RULE_WS)) {
							alt84 = 1;
						}


						switch (alt84) {
						case 1:
						// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6019:3: RULE_WS
						{
							match(input, RULE_WS, FOLLOW_RULE_WS_in_rule__Attribute__Group__1__Impl12309);

						}
							break;

						default:
							break loop84;
						}
					} while (true);

					after(grammarAccess.getAttributeAccess().getWSTerminalRuleCall_1());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Attribute__Group__1__Impl"


	// $ANTLR start "rule__Attribute__Group__2"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6029:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
	public final void rule__Attribute__Group__2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6033:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6034:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
			{
				pushFollow(FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__212340);
				rule__Attribute__Group__2__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Attribute__Group__3_in_rule__Attribute__Group__212343);
				rule__Attribute__Group__3();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Attribute__Group__2"


	// $ANTLR start "rule__Attribute__Group__2__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6041:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__NameAssignment_2 ) ) ;
	public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6045:1: ( ( ( rule__Attribute__NameAssignment_2 ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6046:1: ( ( rule__Attribute__NameAssignment_2 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6046:1: ( ( rule__Attribute__NameAssignment_2 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6047:1: ( rule__Attribute__NameAssignment_2 )
				{
					before(grammarAccess.getAttributeAccess().getNameAssignment_2());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6048:1: ( rule__Attribute__NameAssignment_2 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6048:2: rule__Attribute__NameAssignment_2
					{
						pushFollow(FOLLOW_rule__Attribute__NameAssignment_2_in_rule__Attribute__Group__2__Impl12370);
						rule__Attribute__NameAssignment_2();

						state._fsp--;


					}

					after(grammarAccess.getAttributeAccess().getNameAssignment_2());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Attribute__Group__2__Impl"


	// $ANTLR start "rule__Attribute__Group__3"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6058:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
	public final void rule__Attribute__Group__3() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6062:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6063:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
			{
				pushFollow(FOLLOW_rule__Attribute__Group__3__Impl_in_rule__Attribute__Group__312400);
				rule__Attribute__Group__3__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Attribute__Group__4_in_rule__Attribute__Group__312403);
				rule__Attribute__Group__4();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Attribute__Group__3"


	// $ANTLR start "rule__Attribute__Group__3__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6070:1: rule__Attribute__Group__3__Impl : ( ( RULE_WS )* ) ;
	public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6074:1: ( ( ( RULE_WS )* ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6075:1: ( ( RULE_WS )* )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6075:1: ( ( RULE_WS )* )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6076:1: ( RULE_WS )*
				{
					before(grammarAccess.getAttributeAccess().getWSTerminalRuleCall_3());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6077:1: ( RULE_WS )*
					loop85: do {
						int alt85 = 2;
						int LA85_0 = input.LA(1);

						if ((LA85_0 == RULE_WS)) {
							alt85 = 1;
						}


						switch (alt85) {
						case 1:
						// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6077:3: RULE_WS
						{
							match(input, RULE_WS, FOLLOW_RULE_WS_in_rule__Attribute__Group__3__Impl12431);

						}
							break;

						default:
							break loop85;
						}
					} while (true);

					after(grammarAccess.getAttributeAccess().getWSTerminalRuleCall_3());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Attribute__Group__3__Impl"


	// $ANTLR start "rule__Attribute__Group__4"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6087:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl rule__Attribute__Group__5 ;
	public final void rule__Attribute__Group__4() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6091:1: ( rule__Attribute__Group__4__Impl rule__Attribute__Group__5 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6092:2: rule__Attribute__Group__4__Impl rule__Attribute__Group__5
			{
				pushFollow(FOLLOW_rule__Attribute__Group__4__Impl_in_rule__Attribute__Group__412462);
				rule__Attribute__Group__4__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Attribute__Group__5_in_rule__Attribute__Group__412465);
				rule__Attribute__Group__5();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Attribute__Group__4"


	// $ANTLR start "rule__Attribute__Group__4__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6099:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__ValueAssignment_4 )? ) ;
	public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6103:1: ( ( ( rule__Attribute__ValueAssignment_4 )? ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6104:1: ( ( rule__Attribute__ValueAssignment_4 )? )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6104:1: ( ( rule__Attribute__ValueAssignment_4 )? )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6105:1: ( rule__Attribute__ValueAssignment_4 )?
				{
					before(grammarAccess.getAttributeAccess().getValueAssignment_4());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6106:1: ( rule__Attribute__ValueAssignment_4 )?
					int alt86 = 2;
					int LA86_0 = input.LA(1);

					if (((LA86_0 >= 26 && LA86_0 <= 28))) {
						alt86 = 1;
					}
					switch (alt86) {
					case 1:
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6106:2: rule__Attribute__ValueAssignment_4
					{
						pushFollow(FOLLOW_rule__Attribute__ValueAssignment_4_in_rule__Attribute__Group__4__Impl12492);
						rule__Attribute__ValueAssignment_4();

						state._fsp--;


					}
						break;

					}

					after(grammarAccess.getAttributeAccess().getValueAssignment_4());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Attribute__Group__4__Impl"


	// $ANTLR start "rule__Attribute__Group__5"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6116:1: rule__Attribute__Group__5 : rule__Attribute__Group__5__Impl ;
	public final void rule__Attribute__Group__5() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6120:1: ( rule__Attribute__Group__5__Impl )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6121:2: rule__Attribute__Group__5__Impl
			{
				pushFollow(FOLLOW_rule__Attribute__Group__5__Impl_in_rule__Attribute__Group__512523);
				rule__Attribute__Group__5__Impl();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Attribute__Group__5"


	// $ANTLR start "rule__Attribute__Group__5__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6127:1: rule__Attribute__Group__5__Impl : ( ']' ) ;
	public final void rule__Attribute__Group__5__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6131:1: ( ( ']' ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6132:1: ( ']' )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6132:1: ( ']' )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6133:1: ']'
				{
					before(grammarAccess.getAttributeAccess().getRightSquareBracketKeyword_5());
					match(input, 43, FOLLOW_43_in_rule__Attribute__Group__5__Impl12551);
					after(grammarAccess.getAttributeAccess().getRightSquareBracketKeyword_5());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Attribute__Group__5__Impl"


	// $ANTLR start "rule__AttributeValue__Group__0"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6158:1: rule__AttributeValue__Group__0 : rule__AttributeValue__Group__0__Impl rule__AttributeValue__Group__1 ;
	public final void rule__AttributeValue__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6162:1: ( rule__AttributeValue__Group__0__Impl rule__AttributeValue__Group__1 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6163:2: rule__AttributeValue__Group__0__Impl rule__AttributeValue__Group__1
			{
				pushFollow(FOLLOW_rule__AttributeValue__Group__0__Impl_in_rule__AttributeValue__Group__012594);
				rule__AttributeValue__Group__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__AttributeValue__Group__1_in_rule__AttributeValue__Group__012597);
				rule__AttributeValue__Group__1();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__AttributeValue__Group__0"


	// $ANTLR start "rule__AttributeValue__Group__0__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6170:1: rule__AttributeValue__Group__0__Impl : ( ( rule__AttributeValue__OperatorAssignment_0 ) ) ;
	public final void rule__AttributeValue__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6174:1: ( ( ( rule__AttributeValue__OperatorAssignment_0 ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6175:1: ( ( rule__AttributeValue__OperatorAssignment_0 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6175:1: ( ( rule__AttributeValue__OperatorAssignment_0 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6176:1: ( rule__AttributeValue__OperatorAssignment_0 )
				{
					before(grammarAccess.getAttributeValueAccess().getOperatorAssignment_0());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6177:1: ( rule__AttributeValue__OperatorAssignment_0 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6177:2: rule__AttributeValue__OperatorAssignment_0
					{
						pushFollow(FOLLOW_rule__AttributeValue__OperatorAssignment_0_in_rule__AttributeValue__Group__0__Impl12624);
						rule__AttributeValue__OperatorAssignment_0();

						state._fsp--;


					}

					after(grammarAccess.getAttributeValueAccess().getOperatorAssignment_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__AttributeValue__Group__0__Impl"


	// $ANTLR start "rule__AttributeValue__Group__1"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6187:1: rule__AttributeValue__Group__1 : rule__AttributeValue__Group__1__Impl rule__AttributeValue__Group__2 ;
	public final void rule__AttributeValue__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6191:1: ( rule__AttributeValue__Group__1__Impl rule__AttributeValue__Group__2 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6192:2: rule__AttributeValue__Group__1__Impl rule__AttributeValue__Group__2
			{
				pushFollow(FOLLOW_rule__AttributeValue__Group__1__Impl_in_rule__AttributeValue__Group__112654);
				rule__AttributeValue__Group__1__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__AttributeValue__Group__2_in_rule__AttributeValue__Group__112657);
				rule__AttributeValue__Group__2();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__AttributeValue__Group__1"


	// $ANTLR start "rule__AttributeValue__Group__1__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6199:1: rule__AttributeValue__Group__1__Impl : ( ( RULE_WS )* ) ;
	public final void rule__AttributeValue__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6203:1: ( ( ( RULE_WS )* ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6204:1: ( ( RULE_WS )* )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6204:1: ( ( RULE_WS )* )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6205:1: ( RULE_WS )*
				{
					before(grammarAccess.getAttributeValueAccess().getWSTerminalRuleCall_1());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6206:1: ( RULE_WS )*
					loop87: do {
						int alt87 = 2;
						int LA87_0 = input.LA(1);

						if ((LA87_0 == RULE_WS)) {
							alt87 = 1;
						}


						switch (alt87) {
						case 1:
						// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6206:3: RULE_WS
						{
							match(input, RULE_WS, FOLLOW_RULE_WS_in_rule__AttributeValue__Group__1__Impl12685);

						}
							break;

						default:
							break loop87;
						}
					} while (true);

					after(grammarAccess.getAttributeValueAccess().getWSTerminalRuleCall_1());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__AttributeValue__Group__1__Impl"


	// $ANTLR start "rule__AttributeValue__Group__2"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6216:1: rule__AttributeValue__Group__2 : rule__AttributeValue__Group__2__Impl rule__AttributeValue__Group__3 ;
	public final void rule__AttributeValue__Group__2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6220:1: ( rule__AttributeValue__Group__2__Impl rule__AttributeValue__Group__3 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6221:2: rule__AttributeValue__Group__2__Impl rule__AttributeValue__Group__3
			{
				pushFollow(FOLLOW_rule__AttributeValue__Group__2__Impl_in_rule__AttributeValue__Group__212716);
				rule__AttributeValue__Group__2__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__AttributeValue__Group__3_in_rule__AttributeValue__Group__212719);
				rule__AttributeValue__Group__3();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__AttributeValue__Group__2"


	// $ANTLR start "rule__AttributeValue__Group__2__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6228:1: rule__AttributeValue__Group__2__Impl : ( ( rule__AttributeValue__ValueAssignment_2 ) ) ;
	public final void rule__AttributeValue__Group__2__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6232:1: ( ( ( rule__AttributeValue__ValueAssignment_2 ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6233:1: ( ( rule__AttributeValue__ValueAssignment_2 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6233:1: ( ( rule__AttributeValue__ValueAssignment_2 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6234:1: ( rule__AttributeValue__ValueAssignment_2 )
				{
					before(grammarAccess.getAttributeValueAccess().getValueAssignment_2());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6235:1: ( rule__AttributeValue__ValueAssignment_2 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6235:2: rule__AttributeValue__ValueAssignment_2
					{
						pushFollow(FOLLOW_rule__AttributeValue__ValueAssignment_2_in_rule__AttributeValue__Group__2__Impl12746);
						rule__AttributeValue__ValueAssignment_2();

						state._fsp--;


					}

					after(grammarAccess.getAttributeValueAccess().getValueAssignment_2());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__AttributeValue__Group__2__Impl"


	// $ANTLR start "rule__AttributeValue__Group__3"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6245:1: rule__AttributeValue__Group__3 : rule__AttributeValue__Group__3__Impl ;
	public final void rule__AttributeValue__Group__3() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6249:1: ( rule__AttributeValue__Group__3__Impl )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6250:2: rule__AttributeValue__Group__3__Impl
			{
				pushFollow(FOLLOW_rule__AttributeValue__Group__3__Impl_in_rule__AttributeValue__Group__312776);
				rule__AttributeValue__Group__3__Impl();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__AttributeValue__Group__3"


	// $ANTLR start "rule__AttributeValue__Group__3__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6256:1: rule__AttributeValue__Group__3__Impl : ( ( RULE_WS )* ) ;
	public final void rule__AttributeValue__Group__3__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6260:1: ( ( ( RULE_WS )* ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6261:1: ( ( RULE_WS )* )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6261:1: ( ( RULE_WS )* )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6262:1: ( RULE_WS )*
				{
					before(grammarAccess.getAttributeValueAccess().getWSTerminalRuleCall_3());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6263:1: ( RULE_WS )*
					loop88: do {
						int alt88 = 2;
						int LA88_0 = input.LA(1);

						if ((LA88_0 == RULE_WS)) {
							alt88 = 1;
						}


						switch (alt88) {
						case 1:
						// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6263:3: RULE_WS
						{
							match(input, RULE_WS, FOLLOW_RULE_WS_in_rule__AttributeValue__Group__3__Impl12804);

						}
							break;

						default:
							break loop88;
						}
					} while (true);

					after(grammarAccess.getAttributeValueAccess().getWSTerminalRuleCall_3());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__AttributeValue__Group__3__Impl"


	// $ANTLR start "rule__Pseudo__Group__0"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6281:1: rule__Pseudo__Group__0 : rule__Pseudo__Group__0__Impl rule__Pseudo__Group__1 ;
	public final void rule__Pseudo__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6285:1: ( rule__Pseudo__Group__0__Impl rule__Pseudo__Group__1 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6286:2: rule__Pseudo__Group__0__Impl rule__Pseudo__Group__1
			{
				pushFollow(FOLLOW_rule__Pseudo__Group__0__Impl_in_rule__Pseudo__Group__012843);
				rule__Pseudo__Group__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Pseudo__Group__1_in_rule__Pseudo__Group__012846);
				rule__Pseudo__Group__1();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Pseudo__Group__0"


	// $ANTLR start "rule__Pseudo__Group__0__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6293:1: rule__Pseudo__Group__0__Impl : ( ':' ) ;
	public final void rule__Pseudo__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6297:1: ( ( ':' ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6298:1: ( ':' )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6298:1: ( ':' )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6299:1: ':'
				{
					before(grammarAccess.getPseudoAccess().getColonKeyword_0());
					match(input, 37, FOLLOW_37_in_rule__Pseudo__Group__0__Impl12874);
					after(grammarAccess.getPseudoAccess().getColonKeyword_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Pseudo__Group__0__Impl"


	// $ANTLR start "rule__Pseudo__Group__1"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6312:1: rule__Pseudo__Group__1 : rule__Pseudo__Group__1__Impl ;
	public final void rule__Pseudo__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6316:1: ( rule__Pseudo__Group__1__Impl )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6317:2: rule__Pseudo__Group__1__Impl
			{
				pushFollow(FOLLOW_rule__Pseudo__Group__1__Impl_in_rule__Pseudo__Group__112905);
				rule__Pseudo__Group__1__Impl();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Pseudo__Group__1"


	// $ANTLR start "rule__Pseudo__Group__1__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6323:1: rule__Pseudo__Group__1__Impl : ( ( rule__Pseudo__Alternatives_1 ) ) ;
	public final void rule__Pseudo__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6327:1: ( ( ( rule__Pseudo__Alternatives_1 ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6328:1: ( ( rule__Pseudo__Alternatives_1 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6328:1: ( ( rule__Pseudo__Alternatives_1 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6329:1: ( rule__Pseudo__Alternatives_1 )
				{
					before(grammarAccess.getPseudoAccess().getAlternatives_1());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6330:1: ( rule__Pseudo__Alternatives_1 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6330:2: rule__Pseudo__Alternatives_1
					{
						pushFollow(FOLLOW_rule__Pseudo__Alternatives_1_in_rule__Pseudo__Group__1__Impl12932);
						rule__Pseudo__Alternatives_1();

						state._fsp--;


					}

					after(grammarAccess.getPseudoAccess().getAlternatives_1());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Pseudo__Group__1__Impl"


	// $ANTLR start "rule__Pseudo__Group_1_1__0"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6344:1: rule__Pseudo__Group_1_1__0 : rule__Pseudo__Group_1_1__0__Impl rule__Pseudo__Group_1_1__1 ;
	public final void rule__Pseudo__Group_1_1__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6348:1: ( rule__Pseudo__Group_1_1__0__Impl rule__Pseudo__Group_1_1__1 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6349:2: rule__Pseudo__Group_1_1__0__Impl rule__Pseudo__Group_1_1__1
			{
				pushFollow(FOLLOW_rule__Pseudo__Group_1_1__0__Impl_in_rule__Pseudo__Group_1_1__012966);
				rule__Pseudo__Group_1_1__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Pseudo__Group_1_1__1_in_rule__Pseudo__Group_1_1__012969);
				rule__Pseudo__Group_1_1__1();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Pseudo__Group_1_1__0"


	// $ANTLR start "rule__Pseudo__Group_1_1__0__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6356:1: rule__Pseudo__Group_1_1__0__Impl : ( ( rule__Pseudo__PseudoAssignment_1_1_0 ) ) ;
	public final void rule__Pseudo__Group_1_1__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6360:1: ( ( ( rule__Pseudo__PseudoAssignment_1_1_0 ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6361:1: ( ( rule__Pseudo__PseudoAssignment_1_1_0 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6361:1: ( ( rule__Pseudo__PseudoAssignment_1_1_0 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6362:1: ( rule__Pseudo__PseudoAssignment_1_1_0 )
				{
					before(grammarAccess.getPseudoAccess().getPseudoAssignment_1_1_0());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6363:1: ( rule__Pseudo__PseudoAssignment_1_1_0 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6363:2: rule__Pseudo__PseudoAssignment_1_1_0
					{
						pushFollow(FOLLOW_rule__Pseudo__PseudoAssignment_1_1_0_in_rule__Pseudo__Group_1_1__0__Impl12996);
						rule__Pseudo__PseudoAssignment_1_1_0();

						state._fsp--;


					}

					after(grammarAccess.getPseudoAccess().getPseudoAssignment_1_1_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Pseudo__Group_1_1__0__Impl"


	// $ANTLR start "rule__Pseudo__Group_1_1__1"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6373:1: rule__Pseudo__Group_1_1__1 : rule__Pseudo__Group_1_1__1__Impl rule__Pseudo__Group_1_1__2 ;
	public final void rule__Pseudo__Group_1_1__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6377:1: ( rule__Pseudo__Group_1_1__1__Impl rule__Pseudo__Group_1_1__2 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6378:2: rule__Pseudo__Group_1_1__1__Impl rule__Pseudo__Group_1_1__2
			{
				pushFollow(FOLLOW_rule__Pseudo__Group_1_1__1__Impl_in_rule__Pseudo__Group_1_1__113026);
				rule__Pseudo__Group_1_1__1__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Pseudo__Group_1_1__2_in_rule__Pseudo__Group_1_1__113029);
				rule__Pseudo__Group_1_1__2();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Pseudo__Group_1_1__1"


	// $ANTLR start "rule__Pseudo__Group_1_1__1__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6385:1: rule__Pseudo__Group_1_1__1__Impl : ( '(' ) ;
	public final void rule__Pseudo__Group_1_1__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6389:1: ( ( '(' ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6390:1: ( '(' )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6390:1: ( '(' )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6391:1: '('
				{
					before(grammarAccess.getPseudoAccess().getLeftParenthesisKeyword_1_1_1());
					match(input, 38, FOLLOW_38_in_rule__Pseudo__Group_1_1__1__Impl13057);
					after(grammarAccess.getPseudoAccess().getLeftParenthesisKeyword_1_1_1());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Pseudo__Group_1_1__1__Impl"


	// $ANTLR start "rule__Pseudo__Group_1_1__2"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6404:1: rule__Pseudo__Group_1_1__2 : rule__Pseudo__Group_1_1__2__Impl rule__Pseudo__Group_1_1__3 ;
	public final void rule__Pseudo__Group_1_1__2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6408:1: ( rule__Pseudo__Group_1_1__2__Impl rule__Pseudo__Group_1_1__3 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6409:2: rule__Pseudo__Group_1_1__2__Impl rule__Pseudo__Group_1_1__3
			{
				pushFollow(FOLLOW_rule__Pseudo__Group_1_1__2__Impl_in_rule__Pseudo__Group_1_1__213088);
				rule__Pseudo__Group_1_1__2__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Pseudo__Group_1_1__3_in_rule__Pseudo__Group_1_1__213091);
				rule__Pseudo__Group_1_1__3();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Pseudo__Group_1_1__2"


	// $ANTLR start "rule__Pseudo__Group_1_1__2__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6416:1: rule__Pseudo__Group_1_1__2__Impl : ( ( RULE_WS )* ) ;
	public final void rule__Pseudo__Group_1_1__2__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6420:1: ( ( ( RULE_WS )* ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6421:1: ( ( RULE_WS )* )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6421:1: ( ( RULE_WS )* )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6422:1: ( RULE_WS )*
				{
					before(grammarAccess.getPseudoAccess().getWSTerminalRuleCall_1_1_2());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6423:1: ( RULE_WS )*
					loop89: do {
						int alt89 = 2;
						int LA89_0 = input.LA(1);

						if ((LA89_0 == RULE_WS)) {
							alt89 = 1;
						}


						switch (alt89) {
						case 1:
						// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6423:3: RULE_WS
						{
							match(input, RULE_WS, FOLLOW_RULE_WS_in_rule__Pseudo__Group_1_1__2__Impl13119);

						}
							break;

						default:
							break loop89;
						}
					} while (true);

					after(grammarAccess.getPseudoAccess().getWSTerminalRuleCall_1_1_2());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Pseudo__Group_1_1__2__Impl"


	// $ANTLR start "rule__Pseudo__Group_1_1__3"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6433:1: rule__Pseudo__Group_1_1__3 : rule__Pseudo__Group_1_1__3__Impl rule__Pseudo__Group_1_1__4 ;
	public final void rule__Pseudo__Group_1_1__3() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6437:1: ( rule__Pseudo__Group_1_1__3__Impl rule__Pseudo__Group_1_1__4 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6438:2: rule__Pseudo__Group_1_1__3__Impl rule__Pseudo__Group_1_1__4
			{
				pushFollow(FOLLOW_rule__Pseudo__Group_1_1__3__Impl_in_rule__Pseudo__Group_1_1__313150);
				rule__Pseudo__Group_1_1__3__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Pseudo__Group_1_1__4_in_rule__Pseudo__Group_1_1__313153);
				rule__Pseudo__Group_1_1__4();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Pseudo__Group_1_1__3"


	// $ANTLR start "rule__Pseudo__Group_1_1__3__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6445:1: rule__Pseudo__Group_1_1__3__Impl : ( ( rule__Pseudo__Group_1_1_3__0 )? ) ;
	public final void rule__Pseudo__Group_1_1__3__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6449:1: ( ( ( rule__Pseudo__Group_1_1_3__0 )? ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6450:1: ( ( rule__Pseudo__Group_1_1_3__0 )? )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6450:1: ( ( rule__Pseudo__Group_1_1_3__0 )? )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6451:1: ( rule__Pseudo__Group_1_1_3__0 )?
				{
					before(grammarAccess.getPseudoAccess().getGroup_1_1_3());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6452:1: ( rule__Pseudo__Group_1_1_3__0 )?
					int alt90 = 2;
					int LA90_0 = input.LA(1);

					if ((LA90_0 == RULE_ID)) {
						alt90 = 1;
					}
					switch (alt90) {
					case 1:
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6452:2: rule__Pseudo__Group_1_1_3__0
					{
						pushFollow(FOLLOW_rule__Pseudo__Group_1_1_3__0_in_rule__Pseudo__Group_1_1__3__Impl13180);
						rule__Pseudo__Group_1_1_3__0();

						state._fsp--;


					}
						break;

					}

					after(grammarAccess.getPseudoAccess().getGroup_1_1_3());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Pseudo__Group_1_1__3__Impl"


	// $ANTLR start "rule__Pseudo__Group_1_1__4"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6462:1: rule__Pseudo__Group_1_1__4 : rule__Pseudo__Group_1_1__4__Impl ;
	public final void rule__Pseudo__Group_1_1__4() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6466:1: ( rule__Pseudo__Group_1_1__4__Impl )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6467:2: rule__Pseudo__Group_1_1__4__Impl
			{
				pushFollow(FOLLOW_rule__Pseudo__Group_1_1__4__Impl_in_rule__Pseudo__Group_1_1__413211);
				rule__Pseudo__Group_1_1__4__Impl();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Pseudo__Group_1_1__4"


	// $ANTLR start "rule__Pseudo__Group_1_1__4__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6473:1: rule__Pseudo__Group_1_1__4__Impl : ( ')' ) ;
	public final void rule__Pseudo__Group_1_1__4__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6477:1: ( ( ')' ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6478:1: ( ')' )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6478:1: ( ')' )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6479:1: ')'
				{
					before(grammarAccess.getPseudoAccess().getRightParenthesisKeyword_1_1_4());
					match(input, 39, FOLLOW_39_in_rule__Pseudo__Group_1_1__4__Impl13239);
					after(grammarAccess.getPseudoAccess().getRightParenthesisKeyword_1_1_4());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Pseudo__Group_1_1__4__Impl"


	// $ANTLR start "rule__Pseudo__Group_1_1_3__0"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6502:1: rule__Pseudo__Group_1_1_3__0 : rule__Pseudo__Group_1_1_3__0__Impl rule__Pseudo__Group_1_1_3__1 ;
	public final void rule__Pseudo__Group_1_1_3__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6506:1: ( rule__Pseudo__Group_1_1_3__0__Impl rule__Pseudo__Group_1_1_3__1 )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6507:2: rule__Pseudo__Group_1_1_3__0__Impl rule__Pseudo__Group_1_1_3__1
			{
				pushFollow(FOLLOW_rule__Pseudo__Group_1_1_3__0__Impl_in_rule__Pseudo__Group_1_1_3__013280);
				rule__Pseudo__Group_1_1_3__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_rule__Pseudo__Group_1_1_3__1_in_rule__Pseudo__Group_1_1_3__013283);
				rule__Pseudo__Group_1_1_3__1();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Pseudo__Group_1_1_3__0"


	// $ANTLR start "rule__Pseudo__Group_1_1_3__0__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6514:1: rule__Pseudo__Group_1_1_3__0__Impl : ( ( rule__Pseudo__ArgsAssignment_1_1_3_0 ) ) ;
	public final void rule__Pseudo__Group_1_1_3__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6518:1: ( ( ( rule__Pseudo__ArgsAssignment_1_1_3_0 ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6519:1: ( ( rule__Pseudo__ArgsAssignment_1_1_3_0 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6519:1: ( ( rule__Pseudo__ArgsAssignment_1_1_3_0 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6520:1: ( rule__Pseudo__ArgsAssignment_1_1_3_0 )
				{
					before(grammarAccess.getPseudoAccess().getArgsAssignment_1_1_3_0());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6521:1: ( rule__Pseudo__ArgsAssignment_1_1_3_0 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6521:2: rule__Pseudo__ArgsAssignment_1_1_3_0
					{
						pushFollow(FOLLOW_rule__Pseudo__ArgsAssignment_1_1_3_0_in_rule__Pseudo__Group_1_1_3__0__Impl13310);
						rule__Pseudo__ArgsAssignment_1_1_3_0();

						state._fsp--;


					}

					after(grammarAccess.getPseudoAccess().getArgsAssignment_1_1_3_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Pseudo__Group_1_1_3__0__Impl"


	// $ANTLR start "rule__Pseudo__Group_1_1_3__1"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6531:1: rule__Pseudo__Group_1_1_3__1 : rule__Pseudo__Group_1_1_3__1__Impl ;
	public final void rule__Pseudo__Group_1_1_3__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6535:1: ( rule__Pseudo__Group_1_1_3__1__Impl )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6536:2: rule__Pseudo__Group_1_1_3__1__Impl
			{
				pushFollow(FOLLOW_rule__Pseudo__Group_1_1_3__1__Impl_in_rule__Pseudo__Group_1_1_3__113340);
				rule__Pseudo__Group_1_1_3__1__Impl();

				state._fsp--;


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Pseudo__Group_1_1_3__1"


	// $ANTLR start "rule__Pseudo__Group_1_1_3__1__Impl"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6542:1: rule__Pseudo__Group_1_1_3__1__Impl : ( ( RULE_WS )* ) ;
	public final void rule__Pseudo__Group_1_1_3__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6546:1: ( ( ( RULE_WS )* ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6547:1: ( ( RULE_WS )* )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6547:1: ( ( RULE_WS )* )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6548:1: ( RULE_WS )*
				{
					before(grammarAccess.getPseudoAccess().getWSTerminalRuleCall_1_1_3_1());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6549:1: ( RULE_WS )*
					loop91: do {
						int alt91 = 2;
						int LA91_0 = input.LA(1);

						if ((LA91_0 == RULE_WS)) {
							alt91 = 1;
						}


						switch (alt91) {
						case 1:
						// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6549:3: RULE_WS
						{
							match(input, RULE_WS, FOLLOW_RULE_WS_in_rule__Pseudo__Group_1_1_3__1__Impl13368);

						}
							break;

						default:
							break loop91;
						}
					} while (true);

					after(grammarAccess.getPseudoAccess().getWSTerminalRuleCall_1_1_3_1());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Pseudo__Group_1_1_3__1__Impl"


	// $ANTLR start "rule__Stylesheet__CharsetAssignment_0_1"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6564:1: rule__Stylesheet__CharsetAssignment_0_1 : ( RULE_STRING ) ;
	public final void rule__Stylesheet__CharsetAssignment_0_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6568:1: ( ( RULE_STRING ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6569:1: ( RULE_STRING )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6569:1: ( RULE_STRING )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6570:1: RULE_STRING
				{
					before(grammarAccess.getStylesheetAccess().getCharsetSTRINGTerminalRuleCall_0_1_0());
					match(input, RULE_STRING, FOLLOW_RULE_STRING_in_rule__Stylesheet__CharsetAssignment_0_113408);
					after(grammarAccess.getStylesheetAccess().getCharsetSTRINGTerminalRuleCall_0_1_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Stylesheet__CharsetAssignment_0_1"


	// $ANTLR start "rule__Stylesheet__ImportsAssignment_2_0"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6579:1: rule__Stylesheet__ImportsAssignment_2_0 : ( ruleImport ) ;
	public final void rule__Stylesheet__ImportsAssignment_2_0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6583:1: ( ( ruleImport ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6584:1: ( ruleImport )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6584:1: ( ruleImport )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6585:1: ruleImport
				{
					before(grammarAccess.getStylesheetAccess().getImportsImportParserRuleCall_2_0_0());
					pushFollow(FOLLOW_ruleImport_in_rule__Stylesheet__ImportsAssignment_2_013439);
					ruleImport();

					state._fsp--;

					after(grammarAccess.getStylesheetAccess().getImportsImportParserRuleCall_2_0_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Stylesheet__ImportsAssignment_2_0"


	// $ANTLR start "rule__Stylesheet__ContentsAssignment_3_0"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6594:1: rule__Stylesheet__ContentsAssignment_3_0 : ( ruleContent ) ;
	public final void rule__Stylesheet__ContentsAssignment_3_0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6598:1: ( ( ruleContent ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6599:1: ( ruleContent )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6599:1: ( ruleContent )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6600:1: ruleContent
				{
					before(grammarAccess.getStylesheetAccess().getContentsContentParserRuleCall_3_0_0());
					pushFollow(FOLLOW_ruleContent_in_rule__Stylesheet__ContentsAssignment_3_013470);
					ruleContent();

					state._fsp--;

					after(grammarAccess.getStylesheetAccess().getContentsContentParserRuleCall_3_0_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Stylesheet__ContentsAssignment_3_0"


	// $ANTLR start "rule__Import__StringAssignment_1_0_1"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6609:1: rule__Import__StringAssignment_1_0_1 : ( RULE_STRING ) ;
	public final void rule__Import__StringAssignment_1_0_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6613:1: ( ( RULE_STRING ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6614:1: ( RULE_STRING )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6614:1: ( RULE_STRING )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6615:1: RULE_STRING
				{
					before(grammarAccess.getImportAccess().getStringSTRINGTerminalRuleCall_1_0_1_0());
					match(input, RULE_STRING, FOLLOW_RULE_STRING_in_rule__Import__StringAssignment_1_0_113501);
					after(grammarAccess.getImportAccess().getStringSTRINGTerminalRuleCall_1_0_1_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Import__StringAssignment_1_0_1"


	// $ANTLR start "rule__Import__UriAssignment_1_1_1"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6624:1: rule__Import__UriAssignment_1_1_1 : ( ruleUri ) ;
	public final void rule__Import__UriAssignment_1_1_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6628:1: ( ( ruleUri ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6629:1: ( ruleUri )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6629:1: ( ruleUri )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6630:1: ruleUri
				{
					before(grammarAccess.getImportAccess().getUriUriParserRuleCall_1_1_1_0());
					pushFollow(FOLLOW_ruleUri_in_rule__Import__UriAssignment_1_1_113532);
					ruleUri();

					state._fsp--;

					after(grammarAccess.getImportAccess().getUriUriParserRuleCall_1_1_1_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Import__UriAssignment_1_1_1"


	// $ANTLR start "rule__Import__MediaAssignment_3_0"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6639:1: rule__Import__MediaAssignment_3_0 : ( RULE_ID ) ;
	public final void rule__Import__MediaAssignment_3_0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6643:1: ( ( RULE_ID ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6644:1: ( RULE_ID )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6644:1: ( RULE_ID )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6645:1: RULE_ID
				{
					before(grammarAccess.getImportAccess().getMediaIDTerminalRuleCall_3_0_0());
					match(input, RULE_ID, FOLLOW_RULE_ID_in_rule__Import__MediaAssignment_3_013563);
					after(grammarAccess.getImportAccess().getMediaIDTerminalRuleCall_3_0_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Import__MediaAssignment_3_0"


	// $ANTLR start "rule__Import__MediaAssignment_3_2_2"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6654:1: rule__Import__MediaAssignment_3_2_2 : ( RULE_ID ) ;
	public final void rule__Import__MediaAssignment_3_2_2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6658:1: ( ( RULE_ID ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6659:1: ( RULE_ID )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6659:1: ( RULE_ID )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6660:1: RULE_ID
				{
					before(grammarAccess.getImportAccess().getMediaIDTerminalRuleCall_3_2_2_0());
					match(input, RULE_ID, FOLLOW_RULE_ID_in_rule__Import__MediaAssignment_3_2_213594);
					after(grammarAccess.getImportAccess().getMediaIDTerminalRuleCall_3_2_2_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Import__MediaAssignment_3_2_2"


	// $ANTLR start "rule__Media__MediaAssignment_2"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6669:1: rule__Media__MediaAssignment_2 : ( RULE_ID ) ;
	public final void rule__Media__MediaAssignment_2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6673:1: ( ( RULE_ID ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6674:1: ( RULE_ID )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6674:1: ( RULE_ID )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6675:1: RULE_ID
				{
					before(grammarAccess.getMediaAccess().getMediaIDTerminalRuleCall_2_0());
					match(input, RULE_ID, FOLLOW_RULE_ID_in_rule__Media__MediaAssignment_213625);
					after(grammarAccess.getMediaAccess().getMediaIDTerminalRuleCall_2_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Media__MediaAssignment_2"


	// $ANTLR start "rule__Media__MediaAssignment_4_2"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6684:1: rule__Media__MediaAssignment_4_2 : ( RULE_ID ) ;
	public final void rule__Media__MediaAssignment_4_2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6688:1: ( ( RULE_ID ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6689:1: ( RULE_ID )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6689:1: ( RULE_ID )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6690:1: RULE_ID
				{
					before(grammarAccess.getMediaAccess().getMediaIDTerminalRuleCall_4_2_0());
					match(input, RULE_ID, FOLLOW_RULE_ID_in_rule__Media__MediaAssignment_4_213656);
					after(grammarAccess.getMediaAccess().getMediaIDTerminalRuleCall_4_2_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Media__MediaAssignment_4_2"


	// $ANTLR start "rule__Media__RulesAssignment_7"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6699:1: rule__Media__RulesAssignment_7 : ( ruleRuleset ) ;
	public final void rule__Media__RulesAssignment_7() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6703:1: ( ( ruleRuleset ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6704:1: ( ruleRuleset )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6704:1: ( ruleRuleset )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6705:1: ruleRuleset
				{
					before(grammarAccess.getMediaAccess().getRulesRulesetParserRuleCall_7_0());
					pushFollow(FOLLOW_ruleRuleset_in_rule__Media__RulesAssignment_713687);
					ruleRuleset();

					state._fsp--;

					after(grammarAccess.getMediaAccess().getRulesRulesetParserRuleCall_7_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Media__RulesAssignment_7"


	// $ANTLR start "rule__Page__PseudoAssignment_3"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6714:1: rule__Page__PseudoAssignment_3 : ( rulePseudoPage ) ;
	public final void rule__Page__PseudoAssignment_3() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6718:1: ( ( rulePseudoPage ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6719:1: ( rulePseudoPage )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6719:1: ( rulePseudoPage )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6720:1: rulePseudoPage
				{
					before(grammarAccess.getPageAccess().getPseudoPseudoPageParserRuleCall_3_0());
					pushFollow(FOLLOW_rulePseudoPage_in_rule__Page__PseudoAssignment_313718);
					rulePseudoPage();

					state._fsp--;

					after(grammarAccess.getPageAccess().getPseudoPseudoPageParserRuleCall_3_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Page__PseudoAssignment_3"


	// $ANTLR start "rule__Page__DeclarationsAssignment_6"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6729:1: rule__Page__DeclarationsAssignment_6 : ( ruleDeclaration ) ;
	public final void rule__Page__DeclarationsAssignment_6() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6733:1: ( ( ruleDeclaration ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6734:1: ( ruleDeclaration )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6734:1: ( ruleDeclaration )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6735:1: ruleDeclaration
				{
					before(grammarAccess.getPageAccess().getDeclarationsDeclarationParserRuleCall_6_0());
					pushFollow(FOLLOW_ruleDeclaration_in_rule__Page__DeclarationsAssignment_613749);
					ruleDeclaration();

					state._fsp--;

					after(grammarAccess.getPageAccess().getDeclarationsDeclarationParserRuleCall_6_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Page__DeclarationsAssignment_6"


	// $ANTLR start "rule__Page__DeclarationsAssignment_7_2"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6744:1: rule__Page__DeclarationsAssignment_7_2 : ( ruleDeclaration ) ;
	public final void rule__Page__DeclarationsAssignment_7_2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6748:1: ( ( ruleDeclaration ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6749:1: ( ruleDeclaration )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6749:1: ( ruleDeclaration )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6750:1: ruleDeclaration
				{
					before(grammarAccess.getPageAccess().getDeclarationsDeclarationParserRuleCall_7_2_0());
					pushFollow(FOLLOW_ruleDeclaration_in_rule__Page__DeclarationsAssignment_7_213780);
					ruleDeclaration();

					state._fsp--;

					after(grammarAccess.getPageAccess().getDeclarationsDeclarationParserRuleCall_7_2_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Page__DeclarationsAssignment_7_2"


	// $ANTLR start "rule__PseudoPage__IdAssignment_1"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6759:1: rule__PseudoPage__IdAssignment_1 : ( RULE_ID ) ;
	public final void rule__PseudoPage__IdAssignment_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6763:1: ( ( RULE_ID ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6764:1: ( RULE_ID )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6764:1: ( RULE_ID )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6765:1: RULE_ID
				{
					before(grammarAccess.getPseudoPageAccess().getIdIDTerminalRuleCall_1_0());
					match(input, RULE_ID, FOLLOW_RULE_ID_in_rule__PseudoPage__IdAssignment_113811);
					after(grammarAccess.getPseudoPageAccess().getIdIDTerminalRuleCall_1_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__PseudoPage__IdAssignment_1"


	// $ANTLR start "rule__Ruleset__SelectorsAssignment_0"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6774:1: rule__Ruleset__SelectorsAssignment_0 : ( ruleSelector ) ;
	public final void rule__Ruleset__SelectorsAssignment_0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6778:1: ( ( ruleSelector ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6779:1: ( ruleSelector )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6779:1: ( ruleSelector )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6780:1: ruleSelector
				{
					before(grammarAccess.getRulesetAccess().getSelectorsSelectorParserRuleCall_0_0());
					pushFollow(FOLLOW_ruleSelector_in_rule__Ruleset__SelectorsAssignment_013842);
					ruleSelector();

					state._fsp--;

					after(grammarAccess.getRulesetAccess().getSelectorsSelectorParserRuleCall_0_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Ruleset__SelectorsAssignment_0"


	// $ANTLR start "rule__Ruleset__SelectorsAssignment_1_2"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6789:1: rule__Ruleset__SelectorsAssignment_1_2 : ( ruleSelector ) ;
	public final void rule__Ruleset__SelectorsAssignment_1_2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6793:1: ( ( ruleSelector ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6794:1: ( ruleSelector )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6794:1: ( ruleSelector )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6795:1: ruleSelector
				{
					before(grammarAccess.getRulesetAccess().getSelectorsSelectorParserRuleCall_1_2_0());
					pushFollow(FOLLOW_ruleSelector_in_rule__Ruleset__SelectorsAssignment_1_213873);
					ruleSelector();

					state._fsp--;

					after(grammarAccess.getRulesetAccess().getSelectorsSelectorParserRuleCall_1_2_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Ruleset__SelectorsAssignment_1_2"


	// $ANTLR start "rule__Ruleset__PropertiesAssignment_4"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6804:1: rule__Ruleset__PropertiesAssignment_4 : ( ruleDeclaration ) ;
	public final void rule__Ruleset__PropertiesAssignment_4() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6808:1: ( ( ruleDeclaration ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6809:1: ( ruleDeclaration )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6809:1: ( ruleDeclaration )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6810:1: ruleDeclaration
				{
					before(grammarAccess.getRulesetAccess().getPropertiesDeclarationParserRuleCall_4_0());
					pushFollow(FOLLOW_ruleDeclaration_in_rule__Ruleset__PropertiesAssignment_413904);
					ruleDeclaration();

					state._fsp--;

					after(grammarAccess.getRulesetAccess().getPropertiesDeclarationParserRuleCall_4_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Ruleset__PropertiesAssignment_4"


	// $ANTLR start "rule__Ruleset__PropertiesAssignment_5_2"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6819:1: rule__Ruleset__PropertiesAssignment_5_2 : ( ruleDeclaration ) ;
	public final void rule__Ruleset__PropertiesAssignment_5_2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6823:1: ( ( ruleDeclaration ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6824:1: ( ruleDeclaration )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6824:1: ( ruleDeclaration )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6825:1: ruleDeclaration
				{
					before(grammarAccess.getRulesetAccess().getPropertiesDeclarationParserRuleCall_5_2_0());
					pushFollow(FOLLOW_ruleDeclaration_in_rule__Ruleset__PropertiesAssignment_5_213935);
					ruleDeclaration();

					state._fsp--;

					after(grammarAccess.getRulesetAccess().getPropertiesDeclarationParserRuleCall_5_2_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Ruleset__PropertiesAssignment_5_2"


	// $ANTLR start "rule__CompositeSelector__LeftAssignment_0"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6834:1: rule__CompositeSelector__LeftAssignment_0 : ( ruleSimpleSelector ) ;
	public final void rule__CompositeSelector__LeftAssignment_0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6838:1: ( ( ruleSimpleSelector ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6839:1: ( ruleSimpleSelector )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6839:1: ( ruleSimpleSelector )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6840:1: ruleSimpleSelector
				{
					before(grammarAccess.getCompositeSelectorAccess().getLeftSimpleSelectorParserRuleCall_0_0());
					pushFollow(FOLLOW_ruleSimpleSelector_in_rule__CompositeSelector__LeftAssignment_013966);
					ruleSimpleSelector();

					state._fsp--;

					after(grammarAccess.getCompositeSelectorAccess().getLeftSimpleSelectorParserRuleCall_0_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__CompositeSelector__LeftAssignment_0"


	// $ANTLR start "rule__CompositeSelector__CombinatorAssignment_1_1_1"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6849:1: rule__CompositeSelector__CombinatorAssignment_1_1_1 : ( ruleCombinator ) ;
	public final void rule__CompositeSelector__CombinatorAssignment_1_1_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6853:1: ( ( ruleCombinator ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6854:1: ( ruleCombinator )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6854:1: ( ruleCombinator )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6855:1: ruleCombinator
				{
					before(grammarAccess.getCompositeSelectorAccess().getCombinatorCombinatorParserRuleCall_1_1_1_0());
					pushFollow(FOLLOW_ruleCombinator_in_rule__CompositeSelector__CombinatorAssignment_1_1_113997);
					ruleCombinator();

					state._fsp--;

					after(grammarAccess.getCompositeSelectorAccess().getCombinatorCombinatorParserRuleCall_1_1_1_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__CompositeSelector__CombinatorAssignment_1_1_1"


	// $ANTLR start "rule__CompositeSelector__RightAssignment_2"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6864:1: rule__CompositeSelector__RightAssignment_2 : ( ruleSelector ) ;
	public final void rule__CompositeSelector__RightAssignment_2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6868:1: ( ( ruleSelector ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6869:1: ( ruleSelector )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6869:1: ( ruleSelector )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6870:1: ruleSelector
				{
					before(grammarAccess.getCompositeSelectorAccess().getRightSelectorParserRuleCall_2_0());
					pushFollow(FOLLOW_ruleSelector_in_rule__CompositeSelector__RightAssignment_214028);
					ruleSelector();

					state._fsp--;

					after(grammarAccess.getCompositeSelectorAccess().getRightSelectorParserRuleCall_2_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__CompositeSelector__RightAssignment_2"


	// $ANTLR start "rule__SimpleSelector__ElementNameAssignment_0_0"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6879:1: rule__SimpleSelector__ElementNameAssignment_0_0 : ( ( rule__SimpleSelector__ElementNameAlternatives_0_0_0 )
	// ) ;
	public final void rule__SimpleSelector__ElementNameAssignment_0_0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6883:1: ( ( ( rule__SimpleSelector__ElementNameAlternatives_0_0_0 ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6884:1: ( ( rule__SimpleSelector__ElementNameAlternatives_0_0_0 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6884:1: ( ( rule__SimpleSelector__ElementNameAlternatives_0_0_0 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6885:1: ( rule__SimpleSelector__ElementNameAlternatives_0_0_0 )
				{
					before(grammarAccess.getSimpleSelectorAccess().getElementNameAlternatives_0_0_0());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6886:1: ( rule__SimpleSelector__ElementNameAlternatives_0_0_0 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6886:2: rule__SimpleSelector__ElementNameAlternatives_0_0_0
					{
						pushFollow(FOLLOW_rule__SimpleSelector__ElementNameAlternatives_0_0_0_in_rule__SimpleSelector__ElementNameAssignment_0_014059);
						rule__SimpleSelector__ElementNameAlternatives_0_0_0();

						state._fsp--;


					}

					after(grammarAccess.getSimpleSelectorAccess().getElementNameAlternatives_0_0_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__SimpleSelector__ElementNameAssignment_0_0"


	// $ANTLR start "rule__SimpleSelector__ConditionAssignment_0_1"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6895:1: rule__SimpleSelector__ConditionAssignment_0_1 : ( ruleSelectorCondition ) ;
	public final void rule__SimpleSelector__ConditionAssignment_0_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6899:1: ( ( ruleSelectorCondition ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6900:1: ( ruleSelectorCondition )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6900:1: ( ruleSelectorCondition )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6901:1: ruleSelectorCondition
				{
					before(grammarAccess.getSimpleSelectorAccess().getConditionSelectorConditionParserRuleCall_0_1_0());
					pushFollow(FOLLOW_ruleSelectorCondition_in_rule__SimpleSelector__ConditionAssignment_0_114092);
					ruleSelectorCondition();

					state._fsp--;

					after(grammarAccess.getSimpleSelectorAccess().getConditionSelectorConditionParserRuleCall_0_1_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__SimpleSelector__ConditionAssignment_0_1"


	// $ANTLR start "rule__SimpleSelector__ConditionAssignment_1"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6910:1: rule__SimpleSelector__ConditionAssignment_1 : ( ruleSelectorCondition ) ;
	public final void rule__SimpleSelector__ConditionAssignment_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6914:1: ( ( ruleSelectorCondition ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6915:1: ( ruleSelectorCondition )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6915:1: ( ruleSelectorCondition )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6916:1: ruleSelectorCondition
				{
					before(grammarAccess.getSimpleSelectorAccess().getConditionSelectorConditionParserRuleCall_1_0());
					pushFollow(FOLLOW_ruleSelectorCondition_in_rule__SimpleSelector__ConditionAssignment_114123);
					ruleSelectorCondition();

					state._fsp--;

					after(grammarAccess.getSimpleSelectorAccess().getConditionSelectorConditionParserRuleCall_1_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__SimpleSelector__ConditionAssignment_1"


	// $ANTLR start "rule__Combinator__KindAssignment_0"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6925:1: rule__Combinator__KindAssignment_0 : ( ruleKIND ) ;
	public final void rule__Combinator__KindAssignment_0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6929:1: ( ( ruleKIND ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6930:1: ( ruleKIND )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6930:1: ( ruleKIND )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6931:1: ruleKIND
				{
					before(grammarAccess.getCombinatorAccess().getKindKINDEnumRuleCall_0_0());
					pushFollow(FOLLOW_ruleKIND_in_rule__Combinator__KindAssignment_014154);
					ruleKIND();

					state._fsp--;

					after(grammarAccess.getCombinatorAccess().getKindKINDEnumRuleCall_0_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Combinator__KindAssignment_0"


	// $ANTLR start "rule__Declaration__PropertyAssignment_0"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6940:1: rule__Declaration__PropertyAssignment_0 : ( RULE_ID ) ;
	public final void rule__Declaration__PropertyAssignment_0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6944:1: ( ( RULE_ID ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6945:1: ( RULE_ID )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6945:1: ( RULE_ID )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6946:1: RULE_ID
				{
					before(grammarAccess.getDeclarationAccess().getPropertyIDTerminalRuleCall_0_0());
					match(input, RULE_ID, FOLLOW_RULE_ID_in_rule__Declaration__PropertyAssignment_014185);
					after(grammarAccess.getDeclarationAccess().getPropertyIDTerminalRuleCall_0_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Declaration__PropertyAssignment_0"


	// $ANTLR start "rule__Declaration__ExpressionAssignment_4"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6955:1: rule__Declaration__ExpressionAssignment_4 : ( ruleExpression ) ;
	public final void rule__Declaration__ExpressionAssignment_4() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6959:1: ( ( ruleExpression ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6960:1: ( ruleExpression )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6960:1: ( ruleExpression )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6961:1: ruleExpression
				{
					before(grammarAccess.getDeclarationAccess().getExpressionExpressionParserRuleCall_4_0());
					pushFollow(FOLLOW_ruleExpression_in_rule__Declaration__ExpressionAssignment_414216);
					ruleExpression();

					state._fsp--;

					after(grammarAccess.getDeclarationAccess().getExpressionExpressionParserRuleCall_4_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Declaration__ExpressionAssignment_4"


	// $ANTLR start "rule__Declaration__ImportantAssignment_5_0"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6970:1: rule__Declaration__ImportantAssignment_5_0 : ( RULE_T_IMPORTANT ) ;
	public final void rule__Declaration__ImportantAssignment_5_0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6974:1: ( ( RULE_T_IMPORTANT ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6975:1: ( RULE_T_IMPORTANT )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6975:1: ( RULE_T_IMPORTANT )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6976:1: RULE_T_IMPORTANT
				{
					before(grammarAccess.getDeclarationAccess().getImportantT_IMPORTANTTerminalRuleCall_5_0_0());
					match(input, RULE_T_IMPORTANT, FOLLOW_RULE_T_IMPORTANT_in_rule__Declaration__ImportantAssignment_5_014247);
					after(grammarAccess.getDeclarationAccess().getImportantT_IMPORTANTTerminalRuleCall_5_0_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Declaration__ImportantAssignment_5_0"


	// $ANTLR start "rule__Expression__TermsAssignment_0"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6985:1: rule__Expression__TermsAssignment_0 : ( ruleTerm ) ;
	public final void rule__Expression__TermsAssignment_0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6989:1: ( ( ruleTerm ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6990:1: ( ruleTerm )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6990:1: ( ruleTerm )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:6991:1: ruleTerm
				{
					before(grammarAccess.getExpressionAccess().getTermsTermParserRuleCall_0_0());
					pushFollow(FOLLOW_ruleTerm_in_rule__Expression__TermsAssignment_014278);
					ruleTerm();

					state._fsp--;

					after(grammarAccess.getExpressionAccess().getTermsTermParserRuleCall_0_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Expression__TermsAssignment_0"


	// $ANTLR start "rule__Expression__SubtermsAssignment_1"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7000:1: rule__Expression__SubtermsAssignment_1 : ( ruleSubterm ) ;
	public final void rule__Expression__SubtermsAssignment_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7004:1: ( ( ruleSubterm ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7005:1: ( ruleSubterm )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7005:1: ( ruleSubterm )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7006:1: ruleSubterm
				{
					before(grammarAccess.getExpressionAccess().getSubtermsSubtermParserRuleCall_1_0());
					pushFollow(FOLLOW_ruleSubterm_in_rule__Expression__SubtermsAssignment_114309);
					ruleSubterm();

					state._fsp--;

					after(grammarAccess.getExpressionAccess().getSubtermsSubtermParserRuleCall_1_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Expression__SubtermsAssignment_1"


	// $ANTLR start "rule__Subterm__OperatorAssignment_0"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7015:1: rule__Subterm__OperatorAssignment_0 : ( ruleOperator ) ;
	public final void rule__Subterm__OperatorAssignment_0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7019:1: ( ( ruleOperator ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7020:1: ( ruleOperator )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7020:1: ( ruleOperator )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7021:1: ruleOperator
				{
					before(grammarAccess.getSubtermAccess().getOperatorOperatorParserRuleCall_0_0());
					pushFollow(FOLLOW_ruleOperator_in_rule__Subterm__OperatorAssignment_014340);
					ruleOperator();

					state._fsp--;

					after(grammarAccess.getSubtermAccess().getOperatorOperatorParserRuleCall_0_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Subterm__OperatorAssignment_0"


	// $ANTLR start "rule__Subterm__TermAssignment_1"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7030:1: rule__Subterm__TermAssignment_1 : ( ruleTerm ) ;
	public final void rule__Subterm__TermAssignment_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7034:1: ( ( ruleTerm ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7035:1: ( ruleTerm )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7035:1: ( ruleTerm )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7036:1: ruleTerm
				{
					before(grammarAccess.getSubtermAccess().getTermTermParserRuleCall_1_0());
					pushFollow(FOLLOW_ruleTerm_in_rule__Subterm__TermAssignment_114371);
					ruleTerm();

					state._fsp--;

					after(grammarAccess.getSubtermAccess().getTermTermParserRuleCall_1_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Subterm__TermAssignment_1"


	// $ANTLR start "rule__Function__NameAssignment_0"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7045:1: rule__Function__NameAssignment_0 : ( RULE_ID ) ;
	public final void rule__Function__NameAssignment_0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7049:1: ( ( RULE_ID ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7050:1: ( RULE_ID )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7050:1: ( RULE_ID )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7051:1: RULE_ID
				{
					before(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_0_0());
					match(input, RULE_ID, FOLLOW_RULE_ID_in_rule__Function__NameAssignment_014402);
					after(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_0_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Function__NameAssignment_0"


	// $ANTLR start "rule__Function__ArgsAssignment_3"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7060:1: rule__Function__ArgsAssignment_3 : ( ruleExpression ) ;
	public final void rule__Function__ArgsAssignment_3() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7064:1: ( ( ruleExpression ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7065:1: ( ruleExpression )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7065:1: ( ruleExpression )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7066:1: ruleExpression
				{
					before(grammarAccess.getFunctionAccess().getArgsExpressionParserRuleCall_3_0());
					pushFollow(FOLLOW_ruleExpression_in_rule__Function__ArgsAssignment_314433);
					ruleExpression();

					state._fsp--;

					after(grammarAccess.getFunctionAccess().getArgsExpressionParserRuleCall_3_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Function__ArgsAssignment_3"


	// $ANTLR start "rule__Name__ValueAssignment"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7075:1: rule__Name__ValueAssignment : ( RULE_ID ) ;
	public final void rule__Name__ValueAssignment() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7079:1: ( ( RULE_ID ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7080:1: ( RULE_ID )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7080:1: ( RULE_ID )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7081:1: RULE_ID
				{
					before(grammarAccess.getNameAccess().getValueIDTerminalRuleCall_0());
					match(input, RULE_ID, FOLLOW_RULE_ID_in_rule__Name__ValueAssignment14464);
					after(grammarAccess.getNameAccess().getValueIDTerminalRuleCall_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Name__ValueAssignment"


	// $ANTLR start "rule__Number__OpAssignment_0"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7090:1: rule__Number__OpAssignment_0 : ( ruleUnaryOperator ) ;
	public final void rule__Number__OpAssignment_0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7094:1: ( ( ruleUnaryOperator ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7095:1: ( ruleUnaryOperator )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7095:1: ( ruleUnaryOperator )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7096:1: ruleUnaryOperator
				{
					before(grammarAccess.getNumberAccess().getOpUnaryOperatorParserRuleCall_0_0());
					pushFollow(FOLLOW_ruleUnaryOperator_in_rule__Number__OpAssignment_014495);
					ruleUnaryOperator();

					state._fsp--;

					after(grammarAccess.getNumberAccess().getOpUnaryOperatorParserRuleCall_0_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Number__OpAssignment_0"


	// $ANTLR start "rule__Number__ValueAssignment_1"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7105:1: rule__Number__ValueAssignment_1 : ( RULE_T_NUM ) ;
	public final void rule__Number__ValueAssignment_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7109:1: ( ( RULE_T_NUM ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7110:1: ( RULE_T_NUM )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7110:1: ( RULE_T_NUM )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7111:1: RULE_T_NUM
				{
					before(grammarAccess.getNumberAccess().getValueT_NUMTerminalRuleCall_1_0());
					match(input, RULE_T_NUM, FOLLOW_RULE_T_NUM_in_rule__Number__ValueAssignment_114526);
					after(grammarAccess.getNumberAccess().getValueT_NUMTerminalRuleCall_1_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Number__ValueAssignment_1"


	// $ANTLR start "rule__Percentage__OpAssignment_0"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7120:1: rule__Percentage__OpAssignment_0 : ( ruleUnaryOperator ) ;
	public final void rule__Percentage__OpAssignment_0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7124:1: ( ( ruleUnaryOperator ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7125:1: ( ruleUnaryOperator )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7125:1: ( ruleUnaryOperator )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7126:1: ruleUnaryOperator
				{
					before(grammarAccess.getPercentageAccess().getOpUnaryOperatorParserRuleCall_0_0());
					pushFollow(FOLLOW_ruleUnaryOperator_in_rule__Percentage__OpAssignment_014557);
					ruleUnaryOperator();

					state._fsp--;

					after(grammarAccess.getPercentageAccess().getOpUnaryOperatorParserRuleCall_0_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Percentage__OpAssignment_0"


	// $ANTLR start "rule__Percentage__ValueAssignment_1"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7135:1: rule__Percentage__ValueAssignment_1 : ( RULE_T_NUM ) ;
	public final void rule__Percentage__ValueAssignment_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7139:1: ( ( RULE_T_NUM ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7140:1: ( RULE_T_NUM )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7140:1: ( RULE_T_NUM )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7141:1: RULE_T_NUM
				{
					before(grammarAccess.getPercentageAccess().getValueT_NUMTerminalRuleCall_1_0());
					match(input, RULE_T_NUM, FOLLOW_RULE_T_NUM_in_rule__Percentage__ValueAssignment_114588);
					after(grammarAccess.getPercentageAccess().getValueT_NUMTerminalRuleCall_1_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Percentage__ValueAssignment_1"


	// $ANTLR start "rule__Percentage__UnitAssignment_2"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7150:1: rule__Percentage__UnitAssignment_2 : ( RULE_PC_UNIT ) ;
	public final void rule__Percentage__UnitAssignment_2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7154:1: ( ( RULE_PC_UNIT ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7155:1: ( RULE_PC_UNIT )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7155:1: ( RULE_PC_UNIT )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7156:1: RULE_PC_UNIT
				{
					before(grammarAccess.getPercentageAccess().getUnitPC_UNITTerminalRuleCall_2_0());
					match(input, RULE_PC_UNIT, FOLLOW_RULE_PC_UNIT_in_rule__Percentage__UnitAssignment_214619);
					after(grammarAccess.getPercentageAccess().getUnitPC_UNITTerminalRuleCall_2_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Percentage__UnitAssignment_2"


	// $ANTLR start "rule__Length__OpAssignment_0"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7165:1: rule__Length__OpAssignment_0 : ( ruleUnaryOperator ) ;
	public final void rule__Length__OpAssignment_0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7169:1: ( ( ruleUnaryOperator ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7170:1: ( ruleUnaryOperator )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7170:1: ( ruleUnaryOperator )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7171:1: ruleUnaryOperator
				{
					before(grammarAccess.getLengthAccess().getOpUnaryOperatorParserRuleCall_0_0());
					pushFollow(FOLLOW_ruleUnaryOperator_in_rule__Length__OpAssignment_014650);
					ruleUnaryOperator();

					state._fsp--;

					after(grammarAccess.getLengthAccess().getOpUnaryOperatorParserRuleCall_0_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Length__OpAssignment_0"


	// $ANTLR start "rule__Length__ValueAssignment_1"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7180:1: rule__Length__ValueAssignment_1 : ( RULE_T_NUM ) ;
	public final void rule__Length__ValueAssignment_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7184:1: ( ( RULE_T_NUM ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7185:1: ( RULE_T_NUM )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7185:1: ( RULE_T_NUM )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7186:1: RULE_T_NUM
				{
					before(grammarAccess.getLengthAccess().getValueT_NUMTerminalRuleCall_1_0());
					match(input, RULE_T_NUM, FOLLOW_RULE_T_NUM_in_rule__Length__ValueAssignment_114681);
					after(grammarAccess.getLengthAccess().getValueT_NUMTerminalRuleCall_1_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Length__ValueAssignment_1"


	// $ANTLR start "rule__Length__UnitAssignment_2"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7195:1: rule__Length__UnitAssignment_2 : ( RULE_LEN_UNIT ) ;
	public final void rule__Length__UnitAssignment_2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7199:1: ( ( RULE_LEN_UNIT ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7200:1: ( RULE_LEN_UNIT )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7200:1: ( RULE_LEN_UNIT )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7201:1: RULE_LEN_UNIT
				{
					before(grammarAccess.getLengthAccess().getUnitLEN_UNITTerminalRuleCall_2_0());
					match(input, RULE_LEN_UNIT, FOLLOW_RULE_LEN_UNIT_in_rule__Length__UnitAssignment_214712);
					after(grammarAccess.getLengthAccess().getUnitLEN_UNITTerminalRuleCall_2_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Length__UnitAssignment_2"


	// $ANTLR start "rule__Ems__OpAssignment_0"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7210:1: rule__Ems__OpAssignment_0 : ( ruleUnaryOperator ) ;
	public final void rule__Ems__OpAssignment_0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7214:1: ( ( ruleUnaryOperator ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7215:1: ( ruleUnaryOperator )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7215:1: ( ruleUnaryOperator )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7216:1: ruleUnaryOperator
				{
					before(grammarAccess.getEmsAccess().getOpUnaryOperatorParserRuleCall_0_0());
					pushFollow(FOLLOW_ruleUnaryOperator_in_rule__Ems__OpAssignment_014743);
					ruleUnaryOperator();

					state._fsp--;

					after(grammarAccess.getEmsAccess().getOpUnaryOperatorParserRuleCall_0_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Ems__OpAssignment_0"


	// $ANTLR start "rule__Ems__ValueAssignment_1"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7225:1: rule__Ems__ValueAssignment_1 : ( RULE_T_NUM ) ;
	public final void rule__Ems__ValueAssignment_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7229:1: ( ( RULE_T_NUM ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7230:1: ( RULE_T_NUM )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7230:1: ( RULE_T_NUM )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7231:1: RULE_T_NUM
				{
					before(grammarAccess.getEmsAccess().getValueT_NUMTerminalRuleCall_1_0());
					match(input, RULE_T_NUM, FOLLOW_RULE_T_NUM_in_rule__Ems__ValueAssignment_114774);
					after(grammarAccess.getEmsAccess().getValueT_NUMTerminalRuleCall_1_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Ems__ValueAssignment_1"


	// $ANTLR start "rule__Ems__UnitAssignment_2"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7240:1: rule__Ems__UnitAssignment_2 : ( RULE_EM_UNIT ) ;
	public final void rule__Ems__UnitAssignment_2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7244:1: ( ( RULE_EM_UNIT ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7245:1: ( RULE_EM_UNIT )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7245:1: ( RULE_EM_UNIT )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7246:1: RULE_EM_UNIT
				{
					before(grammarAccess.getEmsAccess().getUnitEM_UNITTerminalRuleCall_2_0());
					match(input, RULE_EM_UNIT, FOLLOW_RULE_EM_UNIT_in_rule__Ems__UnitAssignment_214805);
					after(grammarAccess.getEmsAccess().getUnitEM_UNITTerminalRuleCall_2_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Ems__UnitAssignment_2"


	// $ANTLR start "rule__Exs__OpAssignment_0"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7255:1: rule__Exs__OpAssignment_0 : ( ruleUnaryOperator ) ;
	public final void rule__Exs__OpAssignment_0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7259:1: ( ( ruleUnaryOperator ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7260:1: ( ruleUnaryOperator )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7260:1: ( ruleUnaryOperator )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7261:1: ruleUnaryOperator
				{
					before(grammarAccess.getExsAccess().getOpUnaryOperatorParserRuleCall_0_0());
					pushFollow(FOLLOW_ruleUnaryOperator_in_rule__Exs__OpAssignment_014836);
					ruleUnaryOperator();

					state._fsp--;

					after(grammarAccess.getExsAccess().getOpUnaryOperatorParserRuleCall_0_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Exs__OpAssignment_0"


	// $ANTLR start "rule__Exs__ValueAssignment_1"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7270:1: rule__Exs__ValueAssignment_1 : ( RULE_T_NUM ) ;
	public final void rule__Exs__ValueAssignment_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7274:1: ( ( RULE_T_NUM ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7275:1: ( RULE_T_NUM )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7275:1: ( RULE_T_NUM )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7276:1: RULE_T_NUM
				{
					before(grammarAccess.getExsAccess().getValueT_NUMTerminalRuleCall_1_0());
					match(input, RULE_T_NUM, FOLLOW_RULE_T_NUM_in_rule__Exs__ValueAssignment_114867);
					after(grammarAccess.getExsAccess().getValueT_NUMTerminalRuleCall_1_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Exs__ValueAssignment_1"


	// $ANTLR start "rule__Exs__UnitAssignment_2"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7285:1: rule__Exs__UnitAssignment_2 : ( RULE_EX_UNIT ) ;
	public final void rule__Exs__UnitAssignment_2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7289:1: ( ( RULE_EX_UNIT ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7290:1: ( RULE_EX_UNIT )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7290:1: ( RULE_EX_UNIT )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7291:1: RULE_EX_UNIT
				{
					before(grammarAccess.getExsAccess().getUnitEX_UNITTerminalRuleCall_2_0());
					match(input, RULE_EX_UNIT, FOLLOW_RULE_EX_UNIT_in_rule__Exs__UnitAssignment_214898);
					after(grammarAccess.getExsAccess().getUnitEX_UNITTerminalRuleCall_2_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Exs__UnitAssignment_2"


	// $ANTLR start "rule__Angle__OpAssignment_0"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7300:1: rule__Angle__OpAssignment_0 : ( ruleUnaryOperator ) ;
	public final void rule__Angle__OpAssignment_0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7304:1: ( ( ruleUnaryOperator ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7305:1: ( ruleUnaryOperator )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7305:1: ( ruleUnaryOperator )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7306:1: ruleUnaryOperator
				{
					before(grammarAccess.getAngleAccess().getOpUnaryOperatorParserRuleCall_0_0());
					pushFollow(FOLLOW_ruleUnaryOperator_in_rule__Angle__OpAssignment_014929);
					ruleUnaryOperator();

					state._fsp--;

					after(grammarAccess.getAngleAccess().getOpUnaryOperatorParserRuleCall_0_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Angle__OpAssignment_0"


	// $ANTLR start "rule__Angle__ValueAssignment_1"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7315:1: rule__Angle__ValueAssignment_1 : ( RULE_T_NUM ) ;
	public final void rule__Angle__ValueAssignment_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7319:1: ( ( RULE_T_NUM ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7320:1: ( RULE_T_NUM )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7320:1: ( RULE_T_NUM )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7321:1: RULE_T_NUM
				{
					before(grammarAccess.getAngleAccess().getValueT_NUMTerminalRuleCall_1_0());
					match(input, RULE_T_NUM, FOLLOW_RULE_T_NUM_in_rule__Angle__ValueAssignment_114960);
					after(grammarAccess.getAngleAccess().getValueT_NUMTerminalRuleCall_1_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Angle__ValueAssignment_1"


	// $ANTLR start "rule__Angle__UnitAssignment_2"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7330:1: rule__Angle__UnitAssignment_2 : ( RULE_ANGLE_UNIT ) ;
	public final void rule__Angle__UnitAssignment_2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7334:1: ( ( RULE_ANGLE_UNIT ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7335:1: ( RULE_ANGLE_UNIT )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7335:1: ( RULE_ANGLE_UNIT )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7336:1: RULE_ANGLE_UNIT
				{
					before(grammarAccess.getAngleAccess().getUnitANGLE_UNITTerminalRuleCall_2_0());
					match(input, RULE_ANGLE_UNIT, FOLLOW_RULE_ANGLE_UNIT_in_rule__Angle__UnitAssignment_214991);
					after(grammarAccess.getAngleAccess().getUnitANGLE_UNITTerminalRuleCall_2_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Angle__UnitAssignment_2"


	// $ANTLR start "rule__Time__OpAssignment_0"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7345:1: rule__Time__OpAssignment_0 : ( ruleUnaryOperator ) ;
	public final void rule__Time__OpAssignment_0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7349:1: ( ( ruleUnaryOperator ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7350:1: ( ruleUnaryOperator )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7350:1: ( ruleUnaryOperator )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7351:1: ruleUnaryOperator
				{
					before(grammarAccess.getTimeAccess().getOpUnaryOperatorParserRuleCall_0_0());
					pushFollow(FOLLOW_ruleUnaryOperator_in_rule__Time__OpAssignment_015022);
					ruleUnaryOperator();

					state._fsp--;

					after(grammarAccess.getTimeAccess().getOpUnaryOperatorParserRuleCall_0_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Time__OpAssignment_0"


	// $ANTLR start "rule__Time__ValueAssignment_1"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7360:1: rule__Time__ValueAssignment_1 : ( RULE_T_NUM ) ;
	public final void rule__Time__ValueAssignment_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7364:1: ( ( RULE_T_NUM ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7365:1: ( RULE_T_NUM )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7365:1: ( RULE_T_NUM )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7366:1: RULE_T_NUM
				{
					before(grammarAccess.getTimeAccess().getValueT_NUMTerminalRuleCall_1_0());
					match(input, RULE_T_NUM, FOLLOW_RULE_T_NUM_in_rule__Time__ValueAssignment_115053);
					after(grammarAccess.getTimeAccess().getValueT_NUMTerminalRuleCall_1_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Time__ValueAssignment_1"


	// $ANTLR start "rule__Time__UnitAssignment_2"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7375:1: rule__Time__UnitAssignment_2 : ( RULE_TIME_UNIT ) ;
	public final void rule__Time__UnitAssignment_2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7379:1: ( ( RULE_TIME_UNIT ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7380:1: ( RULE_TIME_UNIT )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7380:1: ( RULE_TIME_UNIT )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7381:1: RULE_TIME_UNIT
				{
					before(grammarAccess.getTimeAccess().getUnitTIME_UNITTerminalRuleCall_2_0());
					match(input, RULE_TIME_UNIT, FOLLOW_RULE_TIME_UNIT_in_rule__Time__UnitAssignment_215084);
					after(grammarAccess.getTimeAccess().getUnitTIME_UNITTerminalRuleCall_2_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Time__UnitAssignment_2"


	// $ANTLR start "rule__Frequency__OpAssignment_0"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7390:1: rule__Frequency__OpAssignment_0 : ( ruleUnaryOperator ) ;
	public final void rule__Frequency__OpAssignment_0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7394:1: ( ( ruleUnaryOperator ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7395:1: ( ruleUnaryOperator )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7395:1: ( ruleUnaryOperator )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7396:1: ruleUnaryOperator
				{
					before(grammarAccess.getFrequencyAccess().getOpUnaryOperatorParserRuleCall_0_0());
					pushFollow(FOLLOW_ruleUnaryOperator_in_rule__Frequency__OpAssignment_015115);
					ruleUnaryOperator();

					state._fsp--;

					after(grammarAccess.getFrequencyAccess().getOpUnaryOperatorParserRuleCall_0_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Frequency__OpAssignment_0"


	// $ANTLR start "rule__Frequency__ValueAssignment_1"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7405:1: rule__Frequency__ValueAssignment_1 : ( RULE_T_NUM ) ;
	public final void rule__Frequency__ValueAssignment_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7409:1: ( ( RULE_T_NUM ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7410:1: ( RULE_T_NUM )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7410:1: ( RULE_T_NUM )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7411:1: RULE_T_NUM
				{
					before(grammarAccess.getFrequencyAccess().getValueT_NUMTerminalRuleCall_1_0());
					match(input, RULE_T_NUM, FOLLOW_RULE_T_NUM_in_rule__Frequency__ValueAssignment_115146);
					after(grammarAccess.getFrequencyAccess().getValueT_NUMTerminalRuleCall_1_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Frequency__ValueAssignment_1"


	// $ANTLR start "rule__Frequency__UnitAssignment_2"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7420:1: rule__Frequency__UnitAssignment_2 : ( RULE_FREQ_UNIT ) ;
	public final void rule__Frequency__UnitAssignment_2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7424:1: ( ( RULE_FREQ_UNIT ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7425:1: ( RULE_FREQ_UNIT )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7425:1: ( RULE_FREQ_UNIT )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7426:1: RULE_FREQ_UNIT
				{
					before(grammarAccess.getFrequencyAccess().getUnitFREQ_UNITTerminalRuleCall_2_0());
					match(input, RULE_FREQ_UNIT, FOLLOW_RULE_FREQ_UNIT_in_rule__Frequency__UnitAssignment_215177);
					after(grammarAccess.getFrequencyAccess().getUnitFREQ_UNITTerminalRuleCall_2_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Frequency__UnitAssignment_2"


	// $ANTLR start "rule__Uri__ValueAssignment_2"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7435:1: rule__Uri__ValueAssignment_2 : ( RULE_STRING ) ;
	public final void rule__Uri__ValueAssignment_2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7439:1: ( ( RULE_STRING ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7440:1: ( RULE_STRING )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7440:1: ( RULE_STRING )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7441:1: RULE_STRING
				{
					before(grammarAccess.getUriAccess().getValueSTRINGTerminalRuleCall_2_0());
					match(input, RULE_STRING, FOLLOW_RULE_STRING_in_rule__Uri__ValueAssignment_215208);
					after(grammarAccess.getUriAccess().getValueSTRINGTerminalRuleCall_2_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Uri__ValueAssignment_2"


	// $ANTLR start "rule__StringValue__ValueAssignment"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7450:1: rule__StringValue__ValueAssignment : ( RULE_STRING ) ;
	public final void rule__StringValue__ValueAssignment() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7454:1: ( ( RULE_STRING ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7455:1: ( RULE_STRING )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7455:1: ( RULE_STRING )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7456:1: RULE_STRING
				{
					before(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0());
					match(input, RULE_STRING, FOLLOW_RULE_STRING_in_rule__StringValue__ValueAssignment15239);
					after(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__StringValue__ValueAssignment"


	// $ANTLR start "rule__HexColor__ValueAssignment"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7465:1: rule__HexColor__ValueAssignment : ( RULE_HASH ) ;
	public final void rule__HexColor__ValueAssignment() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7469:1: ( ( RULE_HASH ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7470:1: ( RULE_HASH )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7470:1: ( RULE_HASH )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7471:1: RULE_HASH
				{
					before(grammarAccess.getHexColorAccess().getValueHASHTerminalRuleCall_0());
					match(input, RULE_HASH, FOLLOW_RULE_HASH_in_rule__HexColor__ValueAssignment15270);
					after(grammarAccess.getHexColorAccess().getValueHASHTerminalRuleCall_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__HexColor__ValueAssignment"


	// $ANTLR start "rule__Class__ClassAssignment"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7480:1: rule__Class__ClassAssignment : ( RULE_T_CLASS ) ;
	public final void rule__Class__ClassAssignment() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7484:1: ( ( RULE_T_CLASS ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7485:1: ( RULE_T_CLASS )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7485:1: ( RULE_T_CLASS )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7486:1: RULE_T_CLASS
				{
					before(grammarAccess.getClassAccess().getClassT_CLASSTerminalRuleCall_0());
					match(input, RULE_T_CLASS, FOLLOW_RULE_T_CLASS_in_rule__Class__ClassAssignment15301);
					after(grammarAccess.getClassAccess().getClassT_CLASSTerminalRuleCall_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Class__ClassAssignment"


	// $ANTLR start "rule__Attribute__NameAssignment_2"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7495:1: rule__Attribute__NameAssignment_2 : ( RULE_ID ) ;
	public final void rule__Attribute__NameAssignment_2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7499:1: ( ( RULE_ID ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7500:1: ( RULE_ID )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7500:1: ( RULE_ID )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7501:1: RULE_ID
				{
					before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0());
					match(input, RULE_ID, FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_215332);
					after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Attribute__NameAssignment_2"


	// $ANTLR start "rule__Attribute__ValueAssignment_4"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7510:1: rule__Attribute__ValueAssignment_4 : ( ruleAttributeValue ) ;
	public final void rule__Attribute__ValueAssignment_4() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7514:1: ( ( ruleAttributeValue ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7515:1: ( ruleAttributeValue )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7515:1: ( ruleAttributeValue )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7516:1: ruleAttributeValue
				{
					before(grammarAccess.getAttributeAccess().getValueAttributeValueParserRuleCall_4_0());
					pushFollow(FOLLOW_ruleAttributeValue_in_rule__Attribute__ValueAssignment_415363);
					ruleAttributeValue();

					state._fsp--;

					after(grammarAccess.getAttributeAccess().getValueAttributeValueParserRuleCall_4_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Attribute__ValueAssignment_4"


	// $ANTLR start "rule__AttributeValue__OperatorAssignment_0"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7525:1: rule__AttributeValue__OperatorAssignment_0 : ( ruleATTRIBUTE_OP ) ;
	public final void rule__AttributeValue__OperatorAssignment_0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7529:1: ( ( ruleATTRIBUTE_OP ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7530:1: ( ruleATTRIBUTE_OP )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7530:1: ( ruleATTRIBUTE_OP )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7531:1: ruleATTRIBUTE_OP
				{
					before(grammarAccess.getAttributeValueAccess().getOperatorATTRIBUTE_OPEnumRuleCall_0_0());
					pushFollow(FOLLOW_ruleATTRIBUTE_OP_in_rule__AttributeValue__OperatorAssignment_015394);
					ruleATTRIBUTE_OP();

					state._fsp--;

					after(grammarAccess.getAttributeValueAccess().getOperatorATTRIBUTE_OPEnumRuleCall_0_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__AttributeValue__OperatorAssignment_0"


	// $ANTLR start "rule__AttributeValue__ValueAssignment_2"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7540:1: rule__AttributeValue__ValueAssignment_2 : ( ( rule__AttributeValue__ValueAlternatives_2_0 ) ) ;
	public final void rule__AttributeValue__ValueAssignment_2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7544:1: ( ( ( rule__AttributeValue__ValueAlternatives_2_0 ) ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7545:1: ( ( rule__AttributeValue__ValueAlternatives_2_0 ) )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7545:1: ( ( rule__AttributeValue__ValueAlternatives_2_0 ) )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7546:1: ( rule__AttributeValue__ValueAlternatives_2_0 )
				{
					before(grammarAccess.getAttributeValueAccess().getValueAlternatives_2_0());
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7547:1: ( rule__AttributeValue__ValueAlternatives_2_0 )
					// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7547:2: rule__AttributeValue__ValueAlternatives_2_0
					{
						pushFollow(FOLLOW_rule__AttributeValue__ValueAlternatives_2_0_in_rule__AttributeValue__ValueAssignment_215425);
						rule__AttributeValue__ValueAlternatives_2_0();

						state._fsp--;


					}

					after(grammarAccess.getAttributeValueAccess().getValueAlternatives_2_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__AttributeValue__ValueAssignment_2"


	// $ANTLR start "rule__Pseudo__PseudoAssignment_1_0"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7556:1: rule__Pseudo__PseudoAssignment_1_0 : ( RULE_ID ) ;
	public final void rule__Pseudo__PseudoAssignment_1_0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7560:1: ( ( RULE_ID ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7561:1: ( RULE_ID )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7561:1: ( RULE_ID )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7562:1: RULE_ID
				{
					before(grammarAccess.getPseudoAccess().getPseudoIDTerminalRuleCall_1_0_0());
					match(input, RULE_ID, FOLLOW_RULE_ID_in_rule__Pseudo__PseudoAssignment_1_015458);
					after(grammarAccess.getPseudoAccess().getPseudoIDTerminalRuleCall_1_0_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Pseudo__PseudoAssignment_1_0"


	// $ANTLR start "rule__Pseudo__PseudoAssignment_1_1_0"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7571:1: rule__Pseudo__PseudoAssignment_1_1_0 : ( RULE_ID ) ;
	public final void rule__Pseudo__PseudoAssignment_1_1_0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7575:1: ( ( RULE_ID ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7576:1: ( RULE_ID )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7576:1: ( RULE_ID )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7577:1: RULE_ID
				{
					before(grammarAccess.getPseudoAccess().getPseudoIDTerminalRuleCall_1_1_0_0());
					match(input, RULE_ID, FOLLOW_RULE_ID_in_rule__Pseudo__PseudoAssignment_1_1_015489);
					after(grammarAccess.getPseudoAccess().getPseudoIDTerminalRuleCall_1_1_0_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Pseudo__PseudoAssignment_1_1_0"


	// $ANTLR start "rule__Pseudo__ArgsAssignment_1_1_3_0"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7586:1: rule__Pseudo__ArgsAssignment_1_1_3_0 : ( RULE_ID ) ;
	public final void rule__Pseudo__ArgsAssignment_1_1_3_0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7590:1: ( ( RULE_ID ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7591:1: ( RULE_ID )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7591:1: ( RULE_ID )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7592:1: RULE_ID
				{
					before(grammarAccess.getPseudoAccess().getArgsIDTerminalRuleCall_1_1_3_0_0());
					match(input, RULE_ID, FOLLOW_RULE_ID_in_rule__Pseudo__ArgsAssignment_1_1_3_015520);
					after(grammarAccess.getPseudoAccess().getArgsIDTerminalRuleCall_1_1_3_0_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__Pseudo__ArgsAssignment_1_1_3_0"


	// $ANTLR start "rule__CSSId__ValueAssignment"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7601:1: rule__CSSId__ValueAssignment : ( RULE_HASH ) ;
	public final void rule__CSSId__ValueAssignment() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7605:1: ( ( RULE_HASH ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7606:1: ( RULE_HASH )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7606:1: ( RULE_HASH )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7607:1: RULE_HASH
				{
					before(grammarAccess.getCSSIdAccess().getValueHASHTerminalRuleCall_0());
					match(input, RULE_HASH, FOLLOW_RULE_HASH_in_rule__CSSId__ValueAssignment15551);
					after(grammarAccess.getCSSIdAccess().getValueHASHTerminalRuleCall_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__CSSId__ValueAssignment"


	// $ANTLR start "rule__UnaryOperator__OperatorAssignment"
	// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7616:1: rule__UnaryOperator__OperatorAssignment : ( ruleUNARY ) ;
	public final void rule__UnaryOperator__OperatorAssignment() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7620:1: ( ( ruleUNARY ) )
			// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7621:1: ( ruleUNARY )
			{
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7621:1: ( ruleUNARY )
				// ../org.eclipse.papyrus.infra.gmfdiag.css.xtext.ui/src-gen/org/eclipse/papyrus/infra/gmfdiag/ui/contentassist/antlr/internal/InternalCSS.g:7622:1: ruleUNARY
				{
					before(grammarAccess.getUnaryOperatorAccess().getOperatorUNARYEnumRuleCall_0());
					pushFollow(FOLLOW_ruleUNARY_in_rule__UnaryOperator__OperatorAssignment15582);
					ruleUNARY();

					state._fsp--;

					after(grammarAccess.getUnaryOperatorAccess().getOperatorUNARYEnumRuleCall_0());

				}


			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}

	// $ANTLR end "rule__UnaryOperator__OperatorAssignment"

	// Delegated rules


	protected DFA6 dfa6 = new DFA6(this);
	protected DFA8 dfa8 = new DFA8(this);
	protected DFA13 dfa13 = new DFA13(this);
	static final String DFA6_eotS =
			"\106\uffff";
	static final String DFA6_eofS =
			"\1\uffff\4\15\2\uffff\2\15\2\uffff\1\15\2\uffff\2\15\4\uffff\1" +
					"\15\2\uffff\2\15\2\uffff\1\15\4\uffff\1\15\5\uffff\1\15\5\uffff" +
					"\1\15\6\uffff\1\15\5\uffff\1\15\5\uffff\1\15\6\uffff";
	static final String DFA6_minS =
			"\1\7\5\4\1\7\3\4\1\7\1\4\2\uffff\3\4\1\7\64\4";
	static final String DFA6_maxS =
			"\5\52\2\7\2\52\2\7\1\52\2\uffff\2\52\3\7\1\53\1\52\1\7\1\53\2\52" +
					"\1\7\1\53\1\52\1\53\3\10\1\52\1\47\1\53\3\10\1\52\1\47\1\53\3\10" +
					"\1\52\1\47\1\10\2\53\2\47\1\52\1\10\2\53\2\47\1\52\1\10\2\53\2\47" +
					"\1\52\1\53\1\47\1\53\1\47\1\53\1\47";
	static final String DFA6_acceptS =
			"\14\uffff\1\2\1\1\70\uffff";
	static final String DFA6_specialS =
			"\106\uffff}>";
	static final String[] DFA6_transitionS = {
			"\1\1\12\uffff\1\3\1\4\2\uffff\1\2\16\uffff\1\6\4\uffff\1\5",
			"\1\13\15\uffff\1\7\1\10\4\uffff\2\14\6\uffff\1\15\1\uffff" +
					"\1\15\2\uffff\1\12\4\uffff\1\11",
			"\1\13\15\uffff\1\7\1\10\4\uffff\2\14\6\uffff\1\15\1\uffff" +
					"\1\15\2\uffff\1\12\4\uffff\1\11",
			"\1\13\15\uffff\1\16\1\17\4\uffff\2\14\6\uffff\1\15\1\uffff" +
					"\1\15\2\uffff\1\21\4\uffff\1\20",
			"\1\13\15\uffff\1\16\1\17\4\uffff\2\14\6\uffff\1\15\1\uffff" +
					"\1\15\2\uffff\1\21\4\uffff\1\20",
			"\1\22\2\uffff\1\23",
			"\1\24",
			"\1\13\15\uffff\1\7\1\10\4\uffff\2\14\6\uffff\1\15\1\uffff" +
					"\1\15\2\uffff\1\12\4\uffff\1\11",
			"\1\13\15\uffff\1\7\1\10\4\uffff\2\14\6\uffff\1\15\1\uffff" +
					"\1\15\2\uffff\1\12\4\uffff\1\11",
			"\1\25\2\uffff\1\26",
			"\1\27",
			"\1\30\2\uffff\1\14\12\uffff\2\14\2\uffff\1\14\1\uffff\2\14" +
					"\6\uffff\1\15\1\uffff\1\15\2\uffff\1\14\4\uffff\1\14",
			"",
			"",
			"\1\13\15\uffff\1\16\1\17\4\uffff\2\14\6\uffff\1\15\1\uffff" +
					"\1\15\2\uffff\1\21\4\uffff\1\20",
			"\1\13\15\uffff\1\16\1\17\4\uffff\2\14\6\uffff\1\15\1\uffff" +
					"\1\15\2\uffff\1\21\4\uffff\1\20",
			"\1\31\2\uffff\1\32",
			"\1\33",
			"\1\22\2\uffff\1\23",
			"\1\34\25\uffff\1\35\1\36\1\37\16\uffff\1\40",
			"\1\13\15\uffff\1\16\1\17\4\uffff\2\14\6\uffff\1\15\1\uffff" +
					"\1\15\2\uffff\1\21\1\41\3\uffff\1\20",
			"\1\25\2\uffff\1\26",
			"\1\42\25\uffff\1\43\1\44\1\45\16\uffff\1\46",
			"\1\13\15\uffff\1\7\1\10\4\uffff\2\14\6\uffff\1\15\1\uffff" +
					"\1\15\2\uffff\1\12\1\47\3\uffff\1\11",
			"\1\30\2\uffff\1\14\12\uffff\2\14\2\uffff\1\14\1\uffff\2\14" +
					"\6\uffff\1\15\1\uffff\1\15\2\uffff\1\14\4\uffff\1\14",
			"\1\31\2\uffff\1\32",
			"\1\50\25\uffff\1\51\1\52\1\53\16\uffff\1\54",
			"\1\13\15\uffff\1\16\1\17\4\uffff\2\14\6\uffff\1\15\1\uffff" +
					"\1\15\2\uffff\1\21\1\55\3\uffff\1\20",
			"\1\34\25\uffff\1\35\1\36\1\37\16\uffff\1\40",
			"\1\56\2\uffff\1\57\1\60",
			"\1\56\2\uffff\1\57\1\60",
			"\1\56\2\uffff\1\57\1\60",
			"\1\13\15\uffff\1\16\1\17\4\uffff\2\14\6\uffff\1\15\1\uffff" +
					"\1\15\2\uffff\1\21\4\uffff\1\20",
			"\1\61\2\uffff\1\62\37\uffff\1\63",
			"\1\42\25\uffff\1\43\1\44\1\45\16\uffff\1\46",
			"\1\64\2\uffff\1\65\1\66",
			"\1\64\2\uffff\1\65\1\66",
			"\1\64\2\uffff\1\65\1\66",
			"\1\13\15\uffff\1\7\1\10\4\uffff\2\14\6\uffff\1\15\1\uffff" +
					"\1\15\2\uffff\1\12\4\uffff\1\11",
			"\1\67\2\uffff\1\70\37\uffff\1\71",
			"\1\50\25\uffff\1\51\1\52\1\53\16\uffff\1\54",
			"\1\72\2\uffff\1\73\1\74",
			"\1\72\2\uffff\1\73\1\74",
			"\1\72\2\uffff\1\73\1\74",
			"\1\13\15\uffff\1\16\1\17\4\uffff\2\14\6\uffff\1\15\1\uffff" +
					"\1\15\2\uffff\1\21\4\uffff\1\20",
			"\1\75\2\uffff\1\76\37\uffff\1\77",
			"\1\56\2\uffff\1\57\1\60",
			"\1\100\46\uffff\1\40",
			"\1\100\46\uffff\1\40",
			"\1\61\2\uffff\1\62\37\uffff\1\63",
			"\1\101\42\uffff\1\63",
			"\1\13\15\uffff\1\16\1\17\4\uffff\2\14\6\uffff\1\15\1\uffff" +
					"\1\15\2\uffff\1\21\4\uffff\1\20",
			"\1\64\2\uffff\1\65\1\66",
			"\1\102\46\uffff\1\46",
			"\1\102\46\uffff\1\46",
			"\1\67\2\uffff\1\70\37\uffff\1\71",
			"\1\103\42\uffff\1\71",
			"\1\13\15\uffff\1\7\1\10\4\uffff\2\14\6\uffff\1\15\1\uffff" +
					"\1\15\2\uffff\1\12\4\uffff\1\11",
			"\1\72\2\uffff\1\73\1\74",
			"\1\104\46\uffff\1\54",
			"\1\104\46\uffff\1\54",
			"\1\75\2\uffff\1\76\37\uffff\1\77",
			"\1\105\42\uffff\1\77",
			"\1\13\15\uffff\1\16\1\17\4\uffff\2\14\6\uffff\1\15\1\uffff" +
					"\1\15\2\uffff\1\21\4\uffff\1\20",
			"\1\100\46\uffff\1\40",
			"\1\101\42\uffff\1\63",
			"\1\102\46\uffff\1\46",
			"\1\103\42\uffff\1\71",
			"\1\104\46\uffff\1\54",
			"\1\105\42\uffff\1\77"
	};

	static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
	static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
	static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
	static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
	static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
	static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
	static final short[][] DFA6_transition;

	static {
		int numStates = DFA6_transitionS.length;
		DFA6_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
			DFA6_transition[i] = org.antlr.runtime.DFA.unpackEncodedString(DFA6_transitionS[i]);
		}
	}

	class DFA6 extends DFA {

		public DFA6(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 6;
			this.eot = DFA6_eot;
			this.eof = DFA6_eof;
			this.min = DFA6_min;
			this.max = DFA6_max;
			this.accept = DFA6_accept;
			this.special = DFA6_special;
			this.transition = DFA6_transition;
		}

		@Override
		public String getDescription() {
			return "1247:1: rule__Selector__Alternatives : ( ( ( rule__Selector__Group_0__0 ) ) | ( ruleCompositeSelector ) );";
		}
	}

	static final String DFA8_eotS =
			"\5\uffff";
	static final String DFA8_eofS =
			"\5\uffff";
	static final String DFA8_minS =
			"\2\4\1\uffff\1\4\1\uffff";
	static final String DFA8_maxS =
			"\1\31\1\52\1\uffff\1\52\1\uffff";
	static final String DFA8_acceptS =
			"\2\uffff\1\2\1\uffff\1\1";
	static final String DFA8_specialS =
			"\5\uffff}>";
	static final String[] DFA8_transitionS = {
			"\1\1\23\uffff\2\2",
			"\1\3\2\uffff\1\4\12\uffff\2\4\2\uffff\1\4\1\uffff\2\2\13\uffff" +
					"\1\4\4\uffff\1\4",
			"",
			"\1\3\2\uffff\1\4\12\uffff\2\4\2\uffff\1\4\1\uffff\2\2\13\uffff" +
					"\1\4\4\uffff\1\4",
			""
	};

	static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
	static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
	static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
	static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
	static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
	static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
	static final short[][] DFA8_transition;

	static {
		int numStates = DFA8_transitionS.length;
		DFA8_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
			DFA8_transition[i] = org.antlr.runtime.DFA.unpackEncodedString(DFA8_transitionS[i]);
		}
	}

	class DFA8 extends DFA {

		public DFA8(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 8;
			this.eot = DFA8_eot;
			this.eof = DFA8_eof;
			this.min = DFA8_min;
			this.max = DFA8_max;
			this.accept = DFA8_accept;
			this.special = DFA8_special;
			this.transition = DFA8_transition;
		}

		@Override
		public String getDescription() {
			return "1269:1: rule__CompositeSelector__Alternatives_1 : ( ( ( ( RULE_WS ) ) ( ( RULE_WS )* ) ) | ( ( rule__CompositeSelector__Group_1_1__0 ) ) );";
		}
	}

	static final String DFA13_eotS =
			"\22\uffff";
	static final String DFA13_eofS =
			"\3\uffff\1\12\1\20\15\uffff";
	static final String DFA13_minS =
			"\1\7\2\12\2\4\15\uffff";
	static final String DFA13_maxS =
			"\1\50\2\12\2\51\15\uffff";
	static final String DFA13_acceptS =
			"\5\uffff\1\12\1\13\1\14\1\10\1\4\1\1\1\2\1\6\1\7\1\5\1\3\1\11\1" +
					"\15";
	static final String DFA13_specialS =
			"\22\uffff}>";
	static final String[] DFA13_transitionS = {
			"\1\4\1\5\1\uffff\1\3\7\uffff\1\7\4\uffff\1\1\1\2\17\uffff\1" +
					"\6",
			"\1\3",
			"\1\3",
			"\1\12\2\uffff\4\12\1\13\1\17\1\11\1\16\1\14\1\15\1\10\1\12" +
					"\4\uffff\2\12\5\uffff\1\12\1\uffff\1\12\2\uffff\1\12\3\uffff" +
					"\3\12",
			"\1\20\2\uffff\4\20\7\uffff\1\20\4\uffff\2\20\5\uffff\1\20" +
					"\1\uffff\1\20\2\uffff\1\20\2\uffff\1\21\3\20",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
	static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
	static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
	static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
	static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
	static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
	static final short[][] DFA13_transition;

	static {
		int numStates = DFA13_transitionS.length;
		DFA13_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
			DFA13_transition[i] = org.antlr.runtime.DFA.unpackEncodedString(DFA13_transitionS[i]);
		}
	}

	class DFA13 extends DFA {

		public DFA13(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 13;
			this.eot = DFA13_eot;
			this.eof = DFA13_eof;
			this.min = DFA13_min;
			this.max = DFA13_max;
			this.accept = DFA13_accept;
			this.special = DFA13_special;
			this.transition = DFA13_transition;
		}

		@Override
		public String getDescription() {
			return "1385:1: rule__Term__Alternatives_0 : ( ( ruleNumber ) | ( rulePercentage ) | ( ruleLength ) | ( ruleEms ) | ( ruleExs ) | ( ruleAngle ) | ( ruleTime ) | ( ruleFrequency ) | ( ruleName ) | ( ruleStringValue ) | ( ruleUri ) | ( ruleHexColor ) | ( ruleFunction ) );";
		}
	}


	public static final BitSet FOLLOW_ruleStylesheet_in_entryRuleStylesheet61 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleStylesheet68 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Stylesheet__Group__0_in_ruleStylesheet94 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleContent_in_entryRuleContent121 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleContent128 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Content__Alternatives_in_ruleContent154 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleImport_in_entryRuleImport181 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleImport188 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport214 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleMedia_in_entryRuleMedia241 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleMedia248 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Media__Group__0_in_ruleMedia274 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rulePage_in_entryRulePage301 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRulePage308 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Page__Group__0_in_rulePage334 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rulePseudoPage_in_entryRulePseudoPage361 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRulePseudoPage368 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__PseudoPage__Group__0_in_rulePseudoPage394 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleRuleset_in_entryRuleRuleset421 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleRuleset428 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Ruleset__Group__0_in_ruleRuleset454 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleSelector_in_entryRuleSelector481 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleSelector488 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Selector__Alternatives_in_ruleSelector514 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleCompositeSelector_in_entryRuleCompositeSelector541 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleCompositeSelector548 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__CompositeSelector__Group__0_in_ruleCompositeSelector574 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleSimpleSelector_in_entryRuleSimpleSelector601 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleSimpleSelector608 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__SimpleSelector__Alternatives_in_ruleSimpleSelector634 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleSelectorCondition_in_entryRuleSelectorCondition661 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleSelectorCondition668 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__SelectorCondition__Alternatives_in_ruleSelectorCondition694 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleCombinator_in_entryRuleCombinator721 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleCombinator728 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Combinator__Group__0_in_ruleCombinator754 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration781 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration788 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Declaration__Group__0_in_ruleDeclaration814 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression841 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleExpression848 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Expression__Group__0_in_ruleExpression874 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleSubterm_in_entryRuleSubterm901 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleSubterm908 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Subterm__Group__0_in_ruleSubterm934 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleTerm_in_entryRuleTerm961 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleTerm968 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Term__Group__0_in_ruleTerm994 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleFunction_in_entryRuleFunction1021 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleFunction1028 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Function__Group__0_in_ruleFunction1054 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleName_in_entryRuleName1081 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleName1088 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Name__ValueAssignment_in_ruleName1114 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber1141 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleNumber1148 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Number__Group__0_in_ruleNumber1174 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rulePercentage_in_entryRulePercentage1201 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRulePercentage1208 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Percentage__Group__0_in_rulePercentage1234 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleLength_in_entryRuleLength1261 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleLength1268 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Length__Group__0_in_ruleLength1294 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleEms_in_entryRuleEms1321 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleEms1328 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Ems__Group__0_in_ruleEms1354 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleExs_in_entryRuleExs1381 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleExs1388 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Exs__Group__0_in_ruleExs1414 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleAngle_in_entryRuleAngle1441 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleAngle1448 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Angle__Group__0_in_ruleAngle1474 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleTime_in_entryRuleTime1501 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleTime1508 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Time__Group__0_in_ruleTime1534 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleFrequency_in_entryRuleFrequency1561 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleFrequency1568 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Frequency__Group__0_in_ruleFrequency1594 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleUri_in_entryRuleUri1621 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleUri1628 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Uri__Group__0_in_ruleUri1654 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue1681 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleStringValue1688 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__StringValue__ValueAssignment_in_ruleStringValue1714 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleHexColor_in_entryRuleHexColor1741 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleHexColor1748 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__HexColor__ValueAssignment_in_ruleHexColor1774 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleOperator_in_entryRuleOperator1801 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleOperator1808 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Operator__Alternatives_in_ruleOperator1834 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleClass_in_entryRuleClass1861 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleClass1868 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Class__ClassAssignment_in_ruleClass1894 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute1921 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleAttribute1928 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Attribute__Group__0_in_ruleAttribute1954 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleAttributeValue_in_entryRuleAttributeValue1981 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleAttributeValue1988 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__AttributeValue__Group__0_in_ruleAttributeValue2014 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rulePseudo_in_entryRulePseudo2041 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRulePseudo2048 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Pseudo__Group__0_in_rulePseudo2074 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleCSSId_in_entryRuleCSSId2101 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleCSSId2108 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__CSSId__ValueAssignment_in_ruleCSSId2134 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleUnaryOperator_in_entryRuleUnaryOperator2161 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_EOF_in_entryRuleUnaryOperator2168 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__UnaryOperator__OperatorAssignment_in_ruleUnaryOperator2194 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__UNARY__Alternatives_in_ruleUNARY2231 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__KIND__Alternatives_in_ruleKIND2267 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__ATTRIBUTE_OP__Alternatives_in_ruleATTRIBUTE_OP2303 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_WS_in_rule__Stylesheet__Alternatives_12338 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_CDO_in_rule__Stylesheet__Alternatives_12355 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_CDC_in_rule__Stylesheet__Alternatives_12372 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Stylesheet__Group_2_1_0__0_in_rule__Stylesheet__Alternatives_2_12404 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Stylesheet__Group_2_1_1__0_in_rule__Stylesheet__Alternatives_2_12422 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Stylesheet__Group_3_1_0__0_in_rule__Stylesheet__Alternatives_3_12455 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Stylesheet__Group_3_1_1__0_in_rule__Stylesheet__Alternatives_3_12473 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleRuleset_in_rule__Content__Alternatives2506 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleMedia_in_rule__Content__Alternatives2523 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rulePage_in_rule__Content__Alternatives2540 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Import__Group_1_0__0_in_rule__Import__Alternatives_12572 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Import__Group_1_1__0_in_rule__Import__Alternatives_12590 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Selector__Group_0__0_in_rule__Selector__Alternatives2623 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleCompositeSelector_in_rule__Selector__Alternatives2641 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_WS_in_rule__CompositeSelector__Alternatives_12676 = new BitSet(new long[] { 0x0000000000000012L });
	public static final BitSet FOLLOW_RULE_WS_in_rule__CompositeSelector__Alternatives_12689 = new BitSet(new long[] { 0x0000000000000012L });
	public static final BitSet FOLLOW_rule__CompositeSelector__Group_1_1__0_in_rule__CompositeSelector__Alternatives_12710 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__SimpleSelector__Group_0__0_in_rule__SimpleSelector__Alternatives2743 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__SimpleSelector__ConditionAssignment_1_in_rule__SimpleSelector__Alternatives2763 = new BitSet(new long[] { 0x00000420000C0002L });
	public static final BitSet FOLLOW_rule__SimpleSelector__ConditionAssignment_1_in_rule__SimpleSelector__Alternatives2775 = new BitSet(new long[] { 0x00000420000C0002L });
	public static final BitSet FOLLOW_RULE_ID_in_rule__SimpleSelector__ElementNameAlternatives_0_0_02811 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_22_in_rule__SimpleSelector__ElementNameAlternatives_0_0_02829 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleCSSId_in_rule__SelectorCondition__Alternatives2863 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleClass_in_rule__SelectorCondition__Alternatives2880 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleAttribute_in_rule__SelectorCondition__Alternatives2897 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rulePseudo_in_rule__SelectorCondition__Alternatives2914 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleNumber_in_rule__Term__Alternatives_02946 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rulePercentage_in_rule__Term__Alternatives_02963 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleLength_in_rule__Term__Alternatives_02980 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleEms_in_rule__Term__Alternatives_02997 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleExs_in_rule__Term__Alternatives_03014 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleAngle_in_rule__Term__Alternatives_03031 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleTime_in_rule__Term__Alternatives_03048 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleFrequency_in_rule__Term__Alternatives_03065 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleName_in_rule__Term__Alternatives_03082 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleStringValue_in_rule__Term__Alternatives_03099 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleUri_in_rule__Term__Alternatives_03116 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleHexColor_in_rule__Term__Alternatives_03133 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleFunction_in_rule__Term__Alternatives_03150 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Operator__Group_0__0_in_rule__Operator__Alternatives3182 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Operator__Group_1__0_in_rule__Operator__Alternatives3200 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_ID_in_rule__AttributeValue__ValueAlternatives_2_03233 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_STRING_in_rule__AttributeValue__ValueAlternatives_2_03250 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Pseudo__PseudoAssignment_1_0_in_rule__Pseudo__Alternatives_13282 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Pseudo__Group_1_1__0_in_rule__Pseudo__Alternatives_13300 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_23_in_rule__UNARY__Alternatives3334 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_24_in_rule__UNARY__Alternatives3355 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_25_in_rule__KIND__Alternatives3391 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_24_in_rule__KIND__Alternatives3412 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_26_in_rule__ATTRIBUTE_OP__Alternatives3448 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_27_in_rule__ATTRIBUTE_OP__Alternatives3469 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_28_in_rule__ATTRIBUTE_OP__Alternatives3490 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Stylesheet__Group__0__Impl_in_rule__Stylesheet__Group__03523 = new BitSet(new long[] { 0x00000432804C00F0L });
	public static final BitSet FOLLOW_rule__Stylesheet__Group__1_in_rule__Stylesheet__Group__03526 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Stylesheet__Group_0__0_in_rule__Stylesheet__Group__0__Impl3553 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Stylesheet__Group__1__Impl_in_rule__Stylesheet__Group__13584 = new BitSet(new long[] { 0x00000432804C00F0L });
	public static final BitSet FOLLOW_rule__Stylesheet__Group__2_in_rule__Stylesheet__Group__13587 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Stylesheet__Alternatives_1_in_rule__Stylesheet__Group__1__Impl3614 = new BitSet(new long[] { 0x0000000000000072L });
	public static final BitSet FOLLOW_rule__Stylesheet__Group__2__Impl_in_rule__Stylesheet__Group__23645 = new BitSet(new long[] { 0x00000432804C00F0L });
	public static final BitSet FOLLOW_rule__Stylesheet__Group__3_in_rule__Stylesheet__Group__23648 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Stylesheet__Group_2__0_in_rule__Stylesheet__Group__2__Impl3675 = new BitSet(new long[] { 0x0000000080000002L });
	public static final BitSet FOLLOW_rule__Stylesheet__Group__3__Impl_in_rule__Stylesheet__Group__33706 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Stylesheet__Group_3__0_in_rule__Stylesheet__Group__3__Impl3733 = new BitSet(new long[] { 0x00000432004C0082L });
	public static final BitSet FOLLOW_rule__Stylesheet__Group_0__0__Impl_in_rule__Stylesheet__Group_0__03772 = new BitSet(new long[] { 0x0000000000000100L });
	public static final BitSet FOLLOW_rule__Stylesheet__Group_0__1_in_rule__Stylesheet__Group_0__03775 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_29_in_rule__Stylesheet__Group_0__0__Impl3803 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Stylesheet__Group_0__1__Impl_in_rule__Stylesheet__Group_0__13834 = new BitSet(new long[] { 0x0000000040000000L });
	public static final BitSet FOLLOW_rule__Stylesheet__Group_0__2_in_rule__Stylesheet__Group_0__13837 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Stylesheet__CharsetAssignment_0_1_in_rule__Stylesheet__Group_0__1__Impl3864 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Stylesheet__Group_0__2__Impl_in_rule__Stylesheet__Group_0__23894 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_30_in_rule__Stylesheet__Group_0__2__Impl3922 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Stylesheet__Group_2__0__Impl_in_rule__Stylesheet__Group_2__03959 = new BitSet(new long[] { 0x0000000000000060L });
	public static final BitSet FOLLOW_rule__Stylesheet__Group_2__1_in_rule__Stylesheet__Group_2__03962 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Stylesheet__ImportsAssignment_2_0_in_rule__Stylesheet__Group_2__0__Impl3989 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Stylesheet__Group_2__1__Impl_in_rule__Stylesheet__Group_2__14019 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Stylesheet__Alternatives_2_1_in_rule__Stylesheet__Group_2__1__Impl4046 = new BitSet(new long[] { 0x0000000000000062L });
	public static final BitSet FOLLOW_rule__Stylesheet__Group_2_1_0__0__Impl_in_rule__Stylesheet__Group_2_1_0__04081 = new BitSet(new long[] { 0x0000000000000010L });
	public static final BitSet FOLLOW_rule__Stylesheet__Group_2_1_0__1_in_rule__Stylesheet__Group_2_1_0__04084 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_CDO_in_rule__Stylesheet__Group_2_1_0__0__Impl4111 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Stylesheet__Group_2_1_0__1__Impl_in_rule__Stylesheet__Group_2_1_0__14140 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_WS_in_rule__Stylesheet__Group_2_1_0__1__Impl4168 = new BitSet(new long[] { 0x0000000000000012L });
	public static final BitSet FOLLOW_rule__Stylesheet__Group_2_1_1__0__Impl_in_rule__Stylesheet__Group_2_1_1__04203 = new BitSet(new long[] { 0x0000000000000010L });
	public static final BitSet FOLLOW_rule__Stylesheet__Group_2_1_1__1_in_rule__Stylesheet__Group_2_1_1__04206 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_CDC_in_rule__Stylesheet__Group_2_1_1__0__Impl4233 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Stylesheet__Group_2_1_1__1__Impl_in_rule__Stylesheet__Group_2_1_1__14262 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_WS_in_rule__Stylesheet__Group_2_1_1__1__Impl4290 = new BitSet(new long[] { 0x0000000000000012L });
	public static final BitSet FOLLOW_rule__Stylesheet__Group_3__0__Impl_in_rule__Stylesheet__Group_3__04325 = new BitSet(new long[] { 0x0000000000000060L });
	public static final BitSet FOLLOW_rule__Stylesheet__Group_3__1_in_rule__Stylesheet__Group_3__04328 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Stylesheet__ContentsAssignment_3_0_in_rule__Stylesheet__Group_3__0__Impl4355 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Stylesheet__Group_3__1__Impl_in_rule__Stylesheet__Group_3__14385 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Stylesheet__Alternatives_3_1_in_rule__Stylesheet__Group_3__1__Impl4412 = new BitSet(new long[] { 0x0000000000000062L });
	public static final BitSet FOLLOW_rule__Stylesheet__Group_3_1_0__0__Impl_in_rule__Stylesheet__Group_3_1_0__04447 = new BitSet(new long[] { 0x0000000000000010L });
	public static final BitSet FOLLOW_rule__Stylesheet__Group_3_1_0__1_in_rule__Stylesheet__Group_3_1_0__04450 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_CDO_in_rule__Stylesheet__Group_3_1_0__0__Impl4477 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Stylesheet__Group_3_1_0__1__Impl_in_rule__Stylesheet__Group_3_1_0__14506 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_WS_in_rule__Stylesheet__Group_3_1_0__1__Impl4534 = new BitSet(new long[] { 0x0000000000000012L });
	public static final BitSet FOLLOW_rule__Stylesheet__Group_3_1_1__0__Impl_in_rule__Stylesheet__Group_3_1_1__04569 = new BitSet(new long[] { 0x0000000000000010L });
	public static final BitSet FOLLOW_rule__Stylesheet__Group_3_1_1__1_in_rule__Stylesheet__Group_3_1_1__04572 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_CDC_in_rule__Stylesheet__Group_3_1_1__0__Impl4599 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Stylesheet__Group_3_1_1__1__Impl_in_rule__Stylesheet__Group_3_1_1__14628 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_WS_in_rule__Stylesheet__Group_3_1_1__1__Impl4656 = new BitSet(new long[] { 0x0000000000000012L });
	public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__04691 = new BitSet(new long[] { 0x0000000000000110L });
	public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__04694 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_31_in_rule__Import__Group__0__Impl4722 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__14753 = new BitSet(new long[] { 0x0000000040000090L });
	public static final BitSet FOLLOW_rule__Import__Group__2_in_rule__Import__Group__14756 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Import__Alternatives_1_in_rule__Import__Group__1__Impl4783 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Import__Group__2__Impl_in_rule__Import__Group__24813 = new BitSet(new long[] { 0x0000000040000090L });
	public static final BitSet FOLLOW_rule__Import__Group__3_in_rule__Import__Group__24816 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_WS_in_rule__Import__Group__2__Impl4844 = new BitSet(new long[] { 0x0000000000000012L });
	public static final BitSet FOLLOW_rule__Import__Group__3__Impl_in_rule__Import__Group__34875 = new BitSet(new long[] { 0x0000000040000090L });
	public static final BitSet FOLLOW_rule__Import__Group__4_in_rule__Import__Group__34878 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Import__Group_3__0_in_rule__Import__Group__3__Impl4905 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Import__Group__4__Impl_in_rule__Import__Group__44936 = new BitSet(new long[] { 0x0000000000000010L });
	public static final BitSet FOLLOW_rule__Import__Group__5_in_rule__Import__Group__44939 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_30_in_rule__Import__Group__4__Impl4967 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Import__Group__5__Impl_in_rule__Import__Group__54998 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_WS_in_rule__Import__Group__5__Impl5026 = new BitSet(new long[] { 0x0000000000000012L });
	public static final BitSet FOLLOW_rule__Import__Group_1_0__0__Impl_in_rule__Import__Group_1_0__05069 = new BitSet(new long[] { 0x0000000000000110L });
	public static final BitSet FOLLOW_rule__Import__Group_1_0__1_in_rule__Import__Group_1_0__05072 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_WS_in_rule__Import__Group_1_0__0__Impl5100 = new BitSet(new long[] { 0x0000000000000012L });
	public static final BitSet FOLLOW_rule__Import__Group_1_0__1__Impl_in_rule__Import__Group_1_0__15131 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Import__StringAssignment_1_0_1_in_rule__Import__Group_1_0__1__Impl5158 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Import__Group_1_1__0__Impl_in_rule__Import__Group_1_1__05192 = new BitSet(new long[] { 0x0000010000000000L });
	public static final BitSet FOLLOW_rule__Import__Group_1_1__1_in_rule__Import__Group_1_1__05195 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_WS_in_rule__Import__Group_1_1__0__Impl5222 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Import__Group_1_1__1__Impl_in_rule__Import__Group_1_1__15251 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Import__UriAssignment_1_1_1_in_rule__Import__Group_1_1__1__Impl5278 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Import__Group_3__0__Impl_in_rule__Import__Group_3__05312 = new BitSet(new long[] { 0x0000000100000010L });
	public static final BitSet FOLLOW_rule__Import__Group_3__1_in_rule__Import__Group_3__05315 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Import__MediaAssignment_3_0_in_rule__Import__Group_3__0__Impl5342 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Import__Group_3__1__Impl_in_rule__Import__Group_3__15372 = new BitSet(new long[] { 0x0000000100000010L });
	public static final BitSet FOLLOW_rule__Import__Group_3__2_in_rule__Import__Group_3__15375 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_WS_in_rule__Import__Group_3__1__Impl5403 = new BitSet(new long[] { 0x0000000000000012L });
	public static final BitSet FOLLOW_rule__Import__Group_3__2__Impl_in_rule__Import__Group_3__25434 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Import__Group_3_2__0_in_rule__Import__Group_3__2__Impl5461 = new BitSet(new long[] { 0x0000000100000002L });
	public static final BitSet FOLLOW_rule__Import__Group_3_2__0__Impl_in_rule__Import__Group_3_2__05498 = new BitSet(new long[] { 0x0000000000000090L });
	public static final BitSet FOLLOW_rule__Import__Group_3_2__1_in_rule__Import__Group_3_2__05501 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_32_in_rule__Import__Group_3_2__0__Impl5529 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Import__Group_3_2__1__Impl_in_rule__Import__Group_3_2__15560 = new BitSet(new long[] { 0x0000000000000090L });
	public static final BitSet FOLLOW_rule__Import__Group_3_2__2_in_rule__Import__Group_3_2__15563 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_WS_in_rule__Import__Group_3_2__1__Impl5591 = new BitSet(new long[] { 0x0000000000000012L });
	public static final BitSet FOLLOW_rule__Import__Group_3_2__2__Impl_in_rule__Import__Group_3_2__25622 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Import__MediaAssignment_3_2_2_in_rule__Import__Group_3_2__2__Impl5649 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Media__Group__0__Impl_in_rule__Media__Group__05685 = new BitSet(new long[] { 0x0000000000000010L });
	public static final BitSet FOLLOW_rule__Media__Group__1_in_rule__Media__Group__05688 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_33_in_rule__Media__Group__0__Impl5716 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Media__Group__1__Impl_in_rule__Media__Group__15747 = new BitSet(new long[] { 0x0000000000000080L });
	public static final BitSet FOLLOW_rule__Media__Group__2_in_rule__Media__Group__15750 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_WS_in_rule__Media__Group__1__Impl5777 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Media__Group__2__Impl_in_rule__Media__Group__25806 = new BitSet(new long[] { 0x0000000500000010L });
	public static final BitSet FOLLOW_rule__Media__Group__3_in_rule__Media__Group__25809 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Media__MediaAssignment_2_in_rule__Media__Group__2__Impl5836 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Media__Group__3__Impl_in_rule__Media__Group__35866 = new BitSet(new long[] { 0x0000000500000010L });
	public static final BitSet FOLLOW_rule__Media__Group__4_in_rule__Media__Group__35869 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_WS_in_rule__Media__Group__3__Impl5897 = new BitSet(new long[] { 0x0000000000000012L });
	public static final BitSet FOLLOW_rule__Media__Group__4__Impl_in_rule__Media__Group__45928 = new BitSet(new long[] { 0x0000000500000010L });
	public static final BitSet FOLLOW_rule__Media__Group__5_in_rule__Media__Group__45931 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Media__Group_4__0_in_rule__Media__Group__4__Impl5958 = new BitSet(new long[] { 0x0000000100000002L });
	public static final BitSet FOLLOW_rule__Media__Group__5__Impl_in_rule__Media__Group__55989 = new BitSet(new long[] { 0x00000428004C0090L });
	public static final BitSet FOLLOW_rule__Media__Group__6_in_rule__Media__Group__55992 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_34_in_rule__Media__Group__5__Impl6020 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Media__Group__6__Impl_in_rule__Media__Group__66051 = new BitSet(new long[] { 0x00000428004C0090L });
	public static final BitSet FOLLOW_rule__Media__Group__7_in_rule__Media__Group__66054 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_WS_in_rule__Media__Group__6__Impl6082 = new BitSet(new long[] { 0x0000000000000012L });
	public static final BitSet FOLLOW_rule__Media__Group__7__Impl_in_rule__Media__Group__76113 = new BitSet(new long[] { 0x00000428004C0090L });
	public static final BitSet FOLLOW_rule__Media__Group__8_in_rule__Media__Group__76116 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Media__RulesAssignment_7_in_rule__Media__Group__7__Impl6143 = new BitSet(new long[] { 0x00000420004C0082L });
	public static final BitSet FOLLOW_rule__Media__Group__8__Impl_in_rule__Media__Group__86174 = new BitSet(new long[] { 0x0000000000000010L });
	public static final BitSet FOLLOW_rule__Media__Group__9_in_rule__Media__Group__86177 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_35_in_rule__Media__Group__8__Impl6205 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Media__Group__9__Impl_in_rule__Media__Group__96236 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_WS_in_rule__Media__Group__9__Impl6264 = new BitSet(new long[] { 0x0000000000000012L });
	public static final BitSet FOLLOW_rule__Media__Group_4__0__Impl_in_rule__Media__Group_4__06315 = new BitSet(new long[] { 0x0000000000000090L });
	public static final BitSet FOLLOW_rule__Media__Group_4__1_in_rule__Media__Group_4__06318 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_32_in_rule__Media__Group_4__0__Impl6346 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Media__Group_4__1__Impl_in_rule__Media__Group_4__16377 = new BitSet(new long[] { 0x0000000000000090L });
	public static final BitSet FOLLOW_rule__Media__Group_4__2_in_rule__Media__Group_4__16380 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_WS_in_rule__Media__Group_4__1__Impl6408 = new BitSet(new long[] { 0x0000000000000012L });
	public static final BitSet FOLLOW_rule__Media__Group_4__2__Impl_in_rule__Media__Group_4__26439 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Media__MediaAssignment_4_2_in_rule__Media__Group_4__2__Impl6466 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Page__Group__0__Impl_in_rule__Page__Group__06502 = new BitSet(new long[] { 0x00000432004C0080L });
	public static final BitSet FOLLOW_rule__Page__Group__1_in_rule__Page__Group__06505 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Page__Group__1__Impl_in_rule__Page__Group__16563 = new BitSet(new long[] { 0x0000002400000010L });
	public static final BitSet FOLLOW_rule__Page__Group__2_in_rule__Page__Group__16566 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_36_in_rule__Page__Group__1__Impl6594 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Page__Group__2__Impl_in_rule__Page__Group__26625 = new BitSet(new long[] { 0x0000002400000010L });
	public static final BitSet FOLLOW_rule__Page__Group__3_in_rule__Page__Group__26628 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_WS_in_rule__Page__Group__2__Impl6656 = new BitSet(new long[] { 0x0000000000000012L });
	public static final BitSet FOLLOW_rule__Page__Group__3__Impl_in_rule__Page__Group__36687 = new BitSet(new long[] { 0x0000002400000010L });
	public static final BitSet FOLLOW_rule__Page__Group__4_in_rule__Page__Group__36690 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Page__PseudoAssignment_3_in_rule__Page__Group__3__Impl6717 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Page__Group__4__Impl_in_rule__Page__Group__46748 = new BitSet(new long[] { 0x0000000840000090L });
	public static final BitSet FOLLOW_rule__Page__Group__5_in_rule__Page__Group__46751 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_34_in_rule__Page__Group__4__Impl6779 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Page__Group__5__Impl_in_rule__Page__Group__56810 = new BitSet(new long[] { 0x0000000840000090L });
	public static final BitSet FOLLOW_rule__Page__Group__6_in_rule__Page__Group__56813 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_WS_in_rule__Page__Group__5__Impl6841 = new BitSet(new long[] { 0x0000000000000012L });
	public static final BitSet FOLLOW_rule__Page__Group__6__Impl_in_rule__Page__Group__66872 = new BitSet(new long[] { 0x0000000840000090L });
	public static final BitSet FOLLOW_rule__Page__Group__7_in_rule__Page__Group__66875 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Page__DeclarationsAssignment_6_in_rule__Page__Group__6__Impl6902 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Page__Group__7__Impl_in_rule__Page__Group__76933 = new BitSet(new long[] { 0x0000000840000090L });
	public static final BitSet FOLLOW_rule__Page__Group__8_in_rule__Page__Group__76936 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Page__Group_7__0_in_rule__Page__Group__7__Impl6963 = new BitSet(new long[] { 0x0000000040000002L });
	public static final BitSet FOLLOW_rule__Page__Group__8__Impl_in_rule__Page__Group__86994 = new BitSet(new long[] { 0x0000000000000010L });
	public static final BitSet FOLLOW_rule__Page__Group__9_in_rule__Page__Group__86997 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_35_in_rule__Page__Group__8__Impl7025 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Page__Group__9__Impl_in_rule__Page__Group__97056 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_WS_in_rule__Page__Group__9__Impl7084 = new BitSet(new long[] { 0x0000000000000012L });
	public static final BitSet FOLLOW_rule__Page__Group_7__0__Impl_in_rule__Page__Group_7__07135 = new BitSet(new long[] { 0x0000000000000090L });
	public static final BitSet FOLLOW_rule__Page__Group_7__1_in_rule__Page__Group_7__07138 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_30_in_rule__Page__Group_7__0__Impl7166 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Page__Group_7__1__Impl_in_rule__Page__Group_7__17197 = new BitSet(new long[] { 0x0000000000000090L });
	public static final BitSet FOLLOW_rule__Page__Group_7__2_in_rule__Page__Group_7__17200 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_WS_in_rule__Page__Group_7__1__Impl7228 = new BitSet(new long[] { 0x0000000000000012L });
	public static final BitSet FOLLOW_rule__Page__Group_7__2__Impl_in_rule__Page__Group_7__27259 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Page__DeclarationsAssignment_7_2_in_rule__Page__Group_7__2__Impl7286 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__PseudoPage__Group__0__Impl_in_rule__PseudoPage__Group__07323 = new BitSet(new long[] { 0x0000000000000080L });
	public static final BitSet FOLLOW_rule__PseudoPage__Group__1_in_rule__PseudoPage__Group__07326 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_37_in_rule__PseudoPage__Group__0__Impl7354 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__PseudoPage__Group__1__Impl_in_rule__PseudoPage__Group__17385 = new BitSet(new long[] { 0x0000000000000010L });
	public static final BitSet FOLLOW_rule__PseudoPage__Group__2_in_rule__PseudoPage__Group__17388 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__PseudoPage__IdAssignment_1_in_rule__PseudoPage__Group__1__Impl7415 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__PseudoPage__Group__2__Impl_in_rule__PseudoPage__Group__27445 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_WS_in_rule__PseudoPage__Group__2__Impl7473 = new BitSet(new long[] { 0x0000000000000012L });
	public static final BitSet FOLLOW_rule__Ruleset__Group__0__Impl_in_rule__Ruleset__Group__07510 = new BitSet(new long[] { 0x0000000500000000L });
	public static final BitSet FOLLOW_rule__Ruleset__Group__1_in_rule__Ruleset__Group__07513 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Ruleset__SelectorsAssignment_0_in_rule__Ruleset__Group__0__Impl7540 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Ruleset__Group__1__Impl_in_rule__Ruleset__Group__17570 = new BitSet(new long[] { 0x0000000500000000L });
	public static final BitSet FOLLOW_rule__Ruleset__Group__2_in_rule__Ruleset__Group__17573 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Ruleset__Group_1__0_in_rule__Ruleset__Group__1__Impl7600 = new BitSet(new long[] { 0x0000000100000002L });
	public static final BitSet FOLLOW_rule__Ruleset__Group__2__Impl_in_rule__Ruleset__Group__27631 = new BitSet(new long[] { 0x0000000840000090L });
	public static final BitSet FOLLOW_rule__Ruleset__Group__3_in_rule__Ruleset__Group__27634 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_34_in_rule__Ruleset__Group__2__Impl7662 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Ruleset__Group__3__Impl_in_rule__Ruleset__Group__37693 = new BitSet(new long[] { 0x0000000840000090L });
	public static final BitSet FOLLOW_rule__Ruleset__Group__4_in_rule__Ruleset__Group__37696 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_WS_in_rule__Ruleset__Group__3__Impl7724 = new BitSet(new long[] { 0x0000000000000012L });
	public static final BitSet FOLLOW_rule__Ruleset__Group__4__Impl_in_rule__Ruleset__Group__47755 = new BitSet(new long[] { 0x0000000840000090L });
	public static final BitSet FOLLOW_rule__Ruleset__Group__5_in_rule__Ruleset__Group__47758 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Ruleset__PropertiesAssignment_4_in_rule__Ruleset__Group__4__Impl7785 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Ruleset__Group__5__Impl_in_rule__Ruleset__Group__57816 = new BitSet(new long[] { 0x0000000840000090L });
	public static final BitSet FOLLOW_rule__Ruleset__Group__6_in_rule__Ruleset__Group__57819 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Ruleset__Group_5__0_in_rule__Ruleset__Group__5__Impl7846 = new BitSet(new long[] { 0x0000000040000002L });
	public static final BitSet FOLLOW_rule__Ruleset__Group__6__Impl_in_rule__Ruleset__Group__67877 = new BitSet(new long[] { 0x0000000000000010L });
	public static final BitSet FOLLOW_rule__Ruleset__Group__7_in_rule__Ruleset__Group__67880 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_35_in_rule__Ruleset__Group__6__Impl7908 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Ruleset__Group__7__Impl_in_rule__Ruleset__Group__77939 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_WS_in_rule__Ruleset__Group__7__Impl7967 = new BitSet(new long[] { 0x0000000000000012L });
	public static final BitSet FOLLOW_rule__Ruleset__Group_1__0__Impl_in_rule__Ruleset__Group_1__08014 = new BitSet(new long[] { 0x00000420004C0090L });
	public static final BitSet FOLLOW_rule__Ruleset__Group_1__1_in_rule__Ruleset__Group_1__08017 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_32_in_rule__Ruleset__Group_1__0__Impl8045 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Ruleset__Group_1__1__Impl_in_rule__Ruleset__Group_1__18076 = new BitSet(new long[] { 0x00000420004C0090L });
	public static final BitSet FOLLOW_rule__Ruleset__Group_1__2_in_rule__Ruleset__Group_1__18079 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_WS_in_rule__Ruleset__Group_1__1__Impl8107 = new BitSet(new long[] { 0x0000000000000012L });
	public static final BitSet FOLLOW_rule__Ruleset__Group_1__2__Impl_in_rule__Ruleset__Group_1__28138 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Ruleset__SelectorsAssignment_1_2_in_rule__Ruleset__Group_1__2__Impl8165 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Ruleset__Group_5__0__Impl_in_rule__Ruleset__Group_5__08201 = new BitSet(new long[] { 0x0000000000000090L });
	public static final BitSet FOLLOW_rule__Ruleset__Group_5__1_in_rule__Ruleset__Group_5__08204 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_30_in_rule__Ruleset__Group_5__0__Impl8232 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Ruleset__Group_5__1__Impl_in_rule__Ruleset__Group_5__18263 = new BitSet(new long[] { 0x0000000000000090L });
	public static final BitSet FOLLOW_rule__Ruleset__Group_5__2_in_rule__Ruleset__Group_5__18266 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_WS_in_rule__Ruleset__Group_5__1__Impl8294 = new BitSet(new long[] { 0x0000000000000012L });
	public static final BitSet FOLLOW_rule__Ruleset__Group_5__2__Impl_in_rule__Ruleset__Group_5__28325 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Ruleset__PropertiesAssignment_5_2_in_rule__Ruleset__Group_5__2__Impl8352 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Selector__Group_0__0__Impl_in_rule__Selector__Group_0__08389 = new BitSet(new long[] { 0x0000000000000010L });
	public static final BitSet FOLLOW_rule__Selector__Group_0__1_in_rule__Selector__Group_0__08392 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleSimpleSelector_in_rule__Selector__Group_0__0__Impl8419 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Selector__Group_0__1__Impl_in_rule__Selector__Group_0__18448 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_WS_in_rule__Selector__Group_0__1__Impl8476 = new BitSet(new long[] { 0x0000000000000012L });
	public static final BitSet FOLLOW_rule__CompositeSelector__Group__0__Impl_in_rule__CompositeSelector__Group__08511 = new BitSet(new long[] { 0x0000000003000010L });
	public static final BitSet FOLLOW_rule__CompositeSelector__Group__1_in_rule__CompositeSelector__Group__08514 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__CompositeSelector__LeftAssignment_0_in_rule__CompositeSelector__Group__0__Impl8541 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__CompositeSelector__Group__1__Impl_in_rule__CompositeSelector__Group__18571 = new BitSet(new long[] { 0x00000420004C0080L });
	public static final BitSet FOLLOW_rule__CompositeSelector__Group__2_in_rule__CompositeSelector__Group__18574 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__CompositeSelector__Alternatives_1_in_rule__CompositeSelector__Group__1__Impl8601 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__CompositeSelector__Group__2__Impl_in_rule__CompositeSelector__Group__28631 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__CompositeSelector__RightAssignment_2_in_rule__CompositeSelector__Group__2__Impl8658 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__CompositeSelector__Group_1_1__0__Impl_in_rule__CompositeSelector__Group_1_1__08694 = new BitSet(new long[] { 0x0000000003000010L });
	public static final BitSet FOLLOW_rule__CompositeSelector__Group_1_1__1_in_rule__CompositeSelector__Group_1_1__08697 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_WS_in_rule__CompositeSelector__Group_1_1__0__Impl8725 = new BitSet(new long[] { 0x0000000000000012L });
	public static final BitSet FOLLOW_rule__CompositeSelector__Group_1_1__1__Impl_in_rule__CompositeSelector__Group_1_1__18756 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__CompositeSelector__CombinatorAssignment_1_1_1_in_rule__CompositeSelector__Group_1_1__1__Impl8783 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__SimpleSelector__Group_0__0__Impl_in_rule__SimpleSelector__Group_0__08817 = new BitSet(new long[] { 0x00000420000C0000L });
	public static final BitSet FOLLOW_rule__SimpleSelector__Group_0__1_in_rule__SimpleSelector__Group_0__08820 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__SimpleSelector__ElementNameAssignment_0_0_in_rule__SimpleSelector__Group_0__0__Impl8847 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__SimpleSelector__Group_0__1__Impl_in_rule__SimpleSelector__Group_0__18877 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__SimpleSelector__ConditionAssignment_0_1_in_rule__SimpleSelector__Group_0__1__Impl8904 = new BitSet(new long[] { 0x00000420000C0002L });
	public static final BitSet FOLLOW_rule__Combinator__Group__0__Impl_in_rule__Combinator__Group__08939 = new BitSet(new long[] { 0x0000000000000010L });
	public static final BitSet FOLLOW_rule__Combinator__Group__1_in_rule__Combinator__Group__08942 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Combinator__KindAssignment_0_in_rule__Combinator__Group__0__Impl8969 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Combinator__Group__1__Impl_in_rule__Combinator__Group__18999 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_WS_in_rule__Combinator__Group__1__Impl9027 = new BitSet(new long[] { 0x0000000000000012L });
	public static final BitSet FOLLOW_rule__Declaration__Group__0__Impl_in_rule__Declaration__Group__09062 = new BitSet(new long[] { 0x0000002000000010L });
	public static final BitSet FOLLOW_rule__Declaration__Group__1_in_rule__Declaration__Group__09065 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Declaration__PropertyAssignment_0_in_rule__Declaration__Group__0__Impl9092 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Declaration__Group__1__Impl_in_rule__Declaration__Group__19122 = new BitSet(new long[] { 0x0000002000000010L });
	public static final BitSet FOLLOW_rule__Declaration__Group__2_in_rule__Declaration__Group__19125 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_WS_in_rule__Declaration__Group__1__Impl9153 = new BitSet(new long[] { 0x0000000000000012L });
	public static final BitSet FOLLOW_rule__Declaration__Group__2__Impl_in_rule__Declaration__Group__29184 = new BitSet(new long[] { 0x0000010001840590L });
	public static final BitSet FOLLOW_rule__Declaration__Group__3_in_rule__Declaration__Group__29187 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_37_in_rule__Declaration__Group__2__Impl9215 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Declaration__Group__3__Impl_in_rule__Declaration__Group__39246 = new BitSet(new long[] { 0x0000010001840590L });
	public static final BitSet FOLLOW_rule__Declaration__Group__4_in_rule__Declaration__Group__39249 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_WS_in_rule__Declaration__Group__3__Impl9277 = new BitSet(new long[] { 0x0000000000000012L });
	public static final BitSet FOLLOW_rule__Declaration__Group__4__Impl_in_rule__Declaration__Group__49308 = new BitSet(new long[] { 0x0000000000000200L });
	public static final BitSet FOLLOW_rule__Declaration__Group__5_in_rule__Declaration__Group__49311 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Declaration__ExpressionAssignment_4_in_rule__Declaration__Group__4__Impl9338 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Declaration__Group__5__Impl_in_rule__Declaration__Group__59368 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Declaration__Group_5__0_in_rule__Declaration__Group__5__Impl9395 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Declaration__Group_5__0__Impl_in_rule__Declaration__Group_5__09438 = new BitSet(new long[] { 0x0000000000000010L });
	public static final BitSet FOLLOW_rule__Declaration__Group_5__1_in_rule__Declaration__Group_5__09441 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Declaration__ImportantAssignment_5_0_in_rule__Declaration__Group_5__0__Impl9468 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Declaration__Group_5__1__Impl_in_rule__Declaration__Group_5__19498 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_WS_in_rule__Declaration__Group_5__1__Impl9526 = new BitSet(new long[] { 0x0000000000000012L });
	public static final BitSet FOLLOW_rule__Expression__Group__0__Impl_in_rule__Expression__Group__09561 = new BitSet(new long[] { 0x0000030101840590L });
	public static final BitSet FOLLOW_rule__Expression__Group__1_in_rule__Expression__Group__09564 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Expression__TermsAssignment_0_in_rule__Expression__Group__0__Impl9591 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Expression__Group__1__Impl_in_rule__Expression__Group__19621 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Expression__SubtermsAssignment_1_in_rule__Expression__Group__1__Impl9648 = new BitSet(new long[] { 0x0000030101840592L });
	public static final BitSet FOLLOW_rule__Subterm__Group__0__Impl_in_rule__Subterm__Group__09683 = new BitSet(new long[] { 0x0000030101840590L });
	public static final BitSet FOLLOW_rule__Subterm__Group__1_in_rule__Subterm__Group__09686 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Subterm__OperatorAssignment_0_in_rule__Subterm__Group__0__Impl9713 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Subterm__Group__1__Impl_in_rule__Subterm__Group__19744 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Subterm__TermAssignment_1_in_rule__Subterm__Group__1__Impl9771 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Term__Group__0__Impl_in_rule__Term__Group__09805 = new BitSet(new long[] { 0x0000000000000010L });
	public static final BitSet FOLLOW_rule__Term__Group__1_in_rule__Term__Group__09808 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Term__Alternatives_0_in_rule__Term__Group__0__Impl9835 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Term__Group__1__Impl_in_rule__Term__Group__19865 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_WS_in_rule__Term__Group__1__Impl9893 = new BitSet(new long[] { 0x0000000000000012L });
	public static final BitSet FOLLOW_rule__Function__Group__0__Impl_in_rule__Function__Group__09928 = new BitSet(new long[] { 0x0000004000000000L });
	public static final BitSet FOLLOW_rule__Function__Group__1_in_rule__Function__Group__09931 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Function__NameAssignment_0_in_rule__Function__Group__0__Impl9958 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Function__Group__1__Impl_in_rule__Function__Group__19988 = new BitSet(new long[] { 0x0000010001840590L });
	public static final BitSet FOLLOW_rule__Function__Group__2_in_rule__Function__Group__19991 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_38_in_rule__Function__Group__1__Impl10019 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Function__Group__2__Impl_in_rule__Function__Group__210050 = new BitSet(new long[] { 0x0000010001840590L });
	public static final BitSet FOLLOW_rule__Function__Group__3_in_rule__Function__Group__210053 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_WS_in_rule__Function__Group__2__Impl10081 = new BitSet(new long[] { 0x0000000000000012L });
	public static final BitSet FOLLOW_rule__Function__Group__3__Impl_in_rule__Function__Group__310112 = new BitSet(new long[] { 0x0000008000000000L });
	public static final BitSet FOLLOW_rule__Function__Group__4_in_rule__Function__Group__310115 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Function__ArgsAssignment_3_in_rule__Function__Group__3__Impl10142 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Function__Group__4__Impl_in_rule__Function__Group__410172 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_39_in_rule__Function__Group__4__Impl10200 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Number__Group__0__Impl_in_rule__Number__Group__010241 = new BitSet(new long[] { 0x0000000001800400L });
	public static final BitSet FOLLOW_rule__Number__Group__1_in_rule__Number__Group__010244 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Number__OpAssignment_0_in_rule__Number__Group__0__Impl10271 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Number__Group__1__Impl_in_rule__Number__Group__110302 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Number__ValueAssignment_1_in_rule__Number__Group__1__Impl10329 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Percentage__Group__0__Impl_in_rule__Percentage__Group__010363 = new BitSet(new long[] { 0x0000000001800400L });
	public static final BitSet FOLLOW_rule__Percentage__Group__1_in_rule__Percentage__Group__010366 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Percentage__OpAssignment_0_in_rule__Percentage__Group__0__Impl10393 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Percentage__Group__1__Impl_in_rule__Percentage__Group__110424 = new BitSet(new long[] { 0x0000000000000800L });
	public static final BitSet FOLLOW_rule__Percentage__Group__2_in_rule__Percentage__Group__110427 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Percentage__ValueAssignment_1_in_rule__Percentage__Group__1__Impl10454 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Percentage__Group__2__Impl_in_rule__Percentage__Group__210484 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Percentage__UnitAssignment_2_in_rule__Percentage__Group__2__Impl10511 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Length__Group__0__Impl_in_rule__Length__Group__010547 = new BitSet(new long[] { 0x0000000001800400L });
	public static final BitSet FOLLOW_rule__Length__Group__1_in_rule__Length__Group__010550 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Length__OpAssignment_0_in_rule__Length__Group__0__Impl10577 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Length__Group__1__Impl_in_rule__Length__Group__110608 = new BitSet(new long[] { 0x0000000000001000L });
	public static final BitSet FOLLOW_rule__Length__Group__2_in_rule__Length__Group__110611 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Length__ValueAssignment_1_in_rule__Length__Group__1__Impl10638 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Length__Group__2__Impl_in_rule__Length__Group__210668 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Length__UnitAssignment_2_in_rule__Length__Group__2__Impl10695 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Ems__Group__0__Impl_in_rule__Ems__Group__010731 = new BitSet(new long[] { 0x0000000001800400L });
	public static final BitSet FOLLOW_rule__Ems__Group__1_in_rule__Ems__Group__010734 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Ems__OpAssignment_0_in_rule__Ems__Group__0__Impl10761 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Ems__Group__1__Impl_in_rule__Ems__Group__110792 = new BitSet(new long[] { 0x0000000000002000L });
	public static final BitSet FOLLOW_rule__Ems__Group__2_in_rule__Ems__Group__110795 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Ems__ValueAssignment_1_in_rule__Ems__Group__1__Impl10822 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Ems__Group__2__Impl_in_rule__Ems__Group__210852 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Ems__UnitAssignment_2_in_rule__Ems__Group__2__Impl10879 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Exs__Group__0__Impl_in_rule__Exs__Group__010915 = new BitSet(new long[] { 0x0000000001800400L });
	public static final BitSet FOLLOW_rule__Exs__Group__1_in_rule__Exs__Group__010918 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Exs__OpAssignment_0_in_rule__Exs__Group__0__Impl10945 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Exs__Group__1__Impl_in_rule__Exs__Group__110976 = new BitSet(new long[] { 0x0000000000004000L });
	public static final BitSet FOLLOW_rule__Exs__Group__2_in_rule__Exs__Group__110979 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Exs__ValueAssignment_1_in_rule__Exs__Group__1__Impl11006 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Exs__Group__2__Impl_in_rule__Exs__Group__211036 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Exs__UnitAssignment_2_in_rule__Exs__Group__2__Impl11063 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Angle__Group__0__Impl_in_rule__Angle__Group__011099 = new BitSet(new long[] { 0x0000000001800400L });
	public static final BitSet FOLLOW_rule__Angle__Group__1_in_rule__Angle__Group__011102 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Angle__OpAssignment_0_in_rule__Angle__Group__0__Impl11129 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Angle__Group__1__Impl_in_rule__Angle__Group__111160 = new BitSet(new long[] { 0x0000000000008000L });
	public static final BitSet FOLLOW_rule__Angle__Group__2_in_rule__Angle__Group__111163 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Angle__ValueAssignment_1_in_rule__Angle__Group__1__Impl11190 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Angle__Group__2__Impl_in_rule__Angle__Group__211220 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Angle__UnitAssignment_2_in_rule__Angle__Group__2__Impl11247 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Time__Group__0__Impl_in_rule__Time__Group__011283 = new BitSet(new long[] { 0x0000000001800400L });
	public static final BitSet FOLLOW_rule__Time__Group__1_in_rule__Time__Group__011286 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Time__OpAssignment_0_in_rule__Time__Group__0__Impl11313 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Time__Group__1__Impl_in_rule__Time__Group__111344 = new BitSet(new long[] { 0x0000000000010000L });
	public static final BitSet FOLLOW_rule__Time__Group__2_in_rule__Time__Group__111347 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Time__ValueAssignment_1_in_rule__Time__Group__1__Impl11374 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Time__Group__2__Impl_in_rule__Time__Group__211404 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Time__UnitAssignment_2_in_rule__Time__Group__2__Impl11431 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Frequency__Group__0__Impl_in_rule__Frequency__Group__011467 = new BitSet(new long[] { 0x0000000001800400L });
	public static final BitSet FOLLOW_rule__Frequency__Group__1_in_rule__Frequency__Group__011470 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Frequency__OpAssignment_0_in_rule__Frequency__Group__0__Impl11497 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Frequency__Group__1__Impl_in_rule__Frequency__Group__111528 = new BitSet(new long[] { 0x0000000000020000L });
	public static final BitSet FOLLOW_rule__Frequency__Group__2_in_rule__Frequency__Group__111531 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Frequency__ValueAssignment_1_in_rule__Frequency__Group__1__Impl11558 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Frequency__Group__2__Impl_in_rule__Frequency__Group__211588 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Frequency__UnitAssignment_2_in_rule__Frequency__Group__2__Impl11615 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Uri__Group__0__Impl_in_rule__Uri__Group__011651 = new BitSet(new long[] { 0x0000000000000110L });
	public static final BitSet FOLLOW_rule__Uri__Group__1_in_rule__Uri__Group__011654 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_40_in_rule__Uri__Group__0__Impl11682 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Uri__Group__1__Impl_in_rule__Uri__Group__111713 = new BitSet(new long[] { 0x0000000000000110L });
	public static final BitSet FOLLOW_rule__Uri__Group__2_in_rule__Uri__Group__111716 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_WS_in_rule__Uri__Group__1__Impl11744 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Uri__Group__2__Impl_in_rule__Uri__Group__211775 = new BitSet(new long[] { 0x0000008000000010L });
	public static final BitSet FOLLOW_rule__Uri__Group__3_in_rule__Uri__Group__211778 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Uri__ValueAssignment_2_in_rule__Uri__Group__2__Impl11805 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Uri__Group__3__Impl_in_rule__Uri__Group__311835 = new BitSet(new long[] { 0x0000008000000010L });
	public static final BitSet FOLLOW_rule__Uri__Group__4_in_rule__Uri__Group__311838 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_WS_in_rule__Uri__Group__3__Impl11866 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Uri__Group__4__Impl_in_rule__Uri__Group__411897 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_39_in_rule__Uri__Group__4__Impl11925 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Operator__Group_0__0__Impl_in_rule__Operator__Group_0__011966 = new BitSet(new long[] { 0x0000000000000010L });
	public static final BitSet FOLLOW_rule__Operator__Group_0__1_in_rule__Operator__Group_0__011969 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_41_in_rule__Operator__Group_0__0__Impl11997 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Operator__Group_0__1__Impl_in_rule__Operator__Group_0__112028 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_WS_in_rule__Operator__Group_0__1__Impl12056 = new BitSet(new long[] { 0x0000000000000012L });
	public static final BitSet FOLLOW_rule__Operator__Group_1__0__Impl_in_rule__Operator__Group_1__012091 = new BitSet(new long[] { 0x0000000000000010L });
	public static final BitSet FOLLOW_rule__Operator__Group_1__1_in_rule__Operator__Group_1__012094 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_32_in_rule__Operator__Group_1__0__Impl12122 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Operator__Group_1__1__Impl_in_rule__Operator__Group_1__112153 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_WS_in_rule__Operator__Group_1__1__Impl12181 = new BitSet(new long[] { 0x0000000000000012L });
	public static final BitSet FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__012216 = new BitSet(new long[] { 0x0000000000000090L });
	public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__012219 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_42_in_rule__Attribute__Group__0__Impl12247 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__112278 = new BitSet(new long[] { 0x0000000000000090L });
	public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__112281 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_WS_in_rule__Attribute__Group__1__Impl12309 = new BitSet(new long[] { 0x0000000000000012L });
	public static final BitSet FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__212340 = new BitSet(new long[] { 0x000008001C000010L });
	public static final BitSet FOLLOW_rule__Attribute__Group__3_in_rule__Attribute__Group__212343 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Attribute__NameAssignment_2_in_rule__Attribute__Group__2__Impl12370 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Attribute__Group__3__Impl_in_rule__Attribute__Group__312400 = new BitSet(new long[] { 0x000008001C000010L });
	public static final BitSet FOLLOW_rule__Attribute__Group__4_in_rule__Attribute__Group__312403 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_WS_in_rule__Attribute__Group__3__Impl12431 = new BitSet(new long[] { 0x0000000000000012L });
	public static final BitSet FOLLOW_rule__Attribute__Group__4__Impl_in_rule__Attribute__Group__412462 = new BitSet(new long[] { 0x000008001C000010L });
	public static final BitSet FOLLOW_rule__Attribute__Group__5_in_rule__Attribute__Group__412465 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Attribute__ValueAssignment_4_in_rule__Attribute__Group__4__Impl12492 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Attribute__Group__5__Impl_in_rule__Attribute__Group__512523 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_43_in_rule__Attribute__Group__5__Impl12551 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__AttributeValue__Group__0__Impl_in_rule__AttributeValue__Group__012594 = new BitSet(new long[] { 0x0000000000000190L });
	public static final BitSet FOLLOW_rule__AttributeValue__Group__1_in_rule__AttributeValue__Group__012597 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__AttributeValue__OperatorAssignment_0_in_rule__AttributeValue__Group__0__Impl12624 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__AttributeValue__Group__1__Impl_in_rule__AttributeValue__Group__112654 = new BitSet(new long[] { 0x0000000000000190L });
	public static final BitSet FOLLOW_rule__AttributeValue__Group__2_in_rule__AttributeValue__Group__112657 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_WS_in_rule__AttributeValue__Group__1__Impl12685 = new BitSet(new long[] { 0x0000000000000012L });
	public static final BitSet FOLLOW_rule__AttributeValue__Group__2__Impl_in_rule__AttributeValue__Group__212716 = new BitSet(new long[] { 0x0000000000000010L });
	public static final BitSet FOLLOW_rule__AttributeValue__Group__3_in_rule__AttributeValue__Group__212719 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__AttributeValue__ValueAssignment_2_in_rule__AttributeValue__Group__2__Impl12746 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__AttributeValue__Group__3__Impl_in_rule__AttributeValue__Group__312776 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_WS_in_rule__AttributeValue__Group__3__Impl12804 = new BitSet(new long[] { 0x0000000000000012L });
	public static final BitSet FOLLOW_rule__Pseudo__Group__0__Impl_in_rule__Pseudo__Group__012843 = new BitSet(new long[] { 0x0000000000000080L });
	public static final BitSet FOLLOW_rule__Pseudo__Group__1_in_rule__Pseudo__Group__012846 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_37_in_rule__Pseudo__Group__0__Impl12874 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Pseudo__Group__1__Impl_in_rule__Pseudo__Group__112905 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Pseudo__Alternatives_1_in_rule__Pseudo__Group__1__Impl12932 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Pseudo__Group_1_1__0__Impl_in_rule__Pseudo__Group_1_1__012966 = new BitSet(new long[] { 0x0000004000000000L });
	public static final BitSet FOLLOW_rule__Pseudo__Group_1_1__1_in_rule__Pseudo__Group_1_1__012969 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Pseudo__PseudoAssignment_1_1_0_in_rule__Pseudo__Group_1_1__0__Impl12996 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Pseudo__Group_1_1__1__Impl_in_rule__Pseudo__Group_1_1__113026 = new BitSet(new long[] { 0x0000008000000090L });
	public static final BitSet FOLLOW_rule__Pseudo__Group_1_1__2_in_rule__Pseudo__Group_1_1__113029 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_38_in_rule__Pseudo__Group_1_1__1__Impl13057 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Pseudo__Group_1_1__2__Impl_in_rule__Pseudo__Group_1_1__213088 = new BitSet(new long[] { 0x0000008000000090L });
	public static final BitSet FOLLOW_rule__Pseudo__Group_1_1__3_in_rule__Pseudo__Group_1_1__213091 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_WS_in_rule__Pseudo__Group_1_1__2__Impl13119 = new BitSet(new long[] { 0x0000000000000012L });
	public static final BitSet FOLLOW_rule__Pseudo__Group_1_1__3__Impl_in_rule__Pseudo__Group_1_1__313150 = new BitSet(new long[] { 0x0000008000000090L });
	public static final BitSet FOLLOW_rule__Pseudo__Group_1_1__4_in_rule__Pseudo__Group_1_1__313153 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Pseudo__Group_1_1_3__0_in_rule__Pseudo__Group_1_1__3__Impl13180 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Pseudo__Group_1_1__4__Impl_in_rule__Pseudo__Group_1_1__413211 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_39_in_rule__Pseudo__Group_1_1__4__Impl13239 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Pseudo__Group_1_1_3__0__Impl_in_rule__Pseudo__Group_1_1_3__013280 = new BitSet(new long[] { 0x0000000000000010L });
	public static final BitSet FOLLOW_rule__Pseudo__Group_1_1_3__1_in_rule__Pseudo__Group_1_1_3__013283 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Pseudo__ArgsAssignment_1_1_3_0_in_rule__Pseudo__Group_1_1_3__0__Impl13310 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__Pseudo__Group_1_1_3__1__Impl_in_rule__Pseudo__Group_1_1_3__113340 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_WS_in_rule__Pseudo__Group_1_1_3__1__Impl13368 = new BitSet(new long[] { 0x0000000000000012L });
	public static final BitSet FOLLOW_RULE_STRING_in_rule__Stylesheet__CharsetAssignment_0_113408 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleImport_in_rule__Stylesheet__ImportsAssignment_2_013439 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleContent_in_rule__Stylesheet__ContentsAssignment_3_013470 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_STRING_in_rule__Import__StringAssignment_1_0_113501 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleUri_in_rule__Import__UriAssignment_1_1_113532 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_ID_in_rule__Import__MediaAssignment_3_013563 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_ID_in_rule__Import__MediaAssignment_3_2_213594 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_ID_in_rule__Media__MediaAssignment_213625 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_ID_in_rule__Media__MediaAssignment_4_213656 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleRuleset_in_rule__Media__RulesAssignment_713687 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rulePseudoPage_in_rule__Page__PseudoAssignment_313718 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleDeclaration_in_rule__Page__DeclarationsAssignment_613749 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleDeclaration_in_rule__Page__DeclarationsAssignment_7_213780 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_ID_in_rule__PseudoPage__IdAssignment_113811 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleSelector_in_rule__Ruleset__SelectorsAssignment_013842 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleSelector_in_rule__Ruleset__SelectorsAssignment_1_213873 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleDeclaration_in_rule__Ruleset__PropertiesAssignment_413904 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleDeclaration_in_rule__Ruleset__PropertiesAssignment_5_213935 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleSimpleSelector_in_rule__CompositeSelector__LeftAssignment_013966 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleCombinator_in_rule__CompositeSelector__CombinatorAssignment_1_1_113997 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleSelector_in_rule__CompositeSelector__RightAssignment_214028 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__SimpleSelector__ElementNameAlternatives_0_0_0_in_rule__SimpleSelector__ElementNameAssignment_0_014059 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleSelectorCondition_in_rule__SimpleSelector__ConditionAssignment_0_114092 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleSelectorCondition_in_rule__SimpleSelector__ConditionAssignment_114123 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleKIND_in_rule__Combinator__KindAssignment_014154 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_ID_in_rule__Declaration__PropertyAssignment_014185 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleExpression_in_rule__Declaration__ExpressionAssignment_414216 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_T_IMPORTANT_in_rule__Declaration__ImportantAssignment_5_014247 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleTerm_in_rule__Expression__TermsAssignment_014278 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleSubterm_in_rule__Expression__SubtermsAssignment_114309 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleOperator_in_rule__Subterm__OperatorAssignment_014340 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleTerm_in_rule__Subterm__TermAssignment_114371 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_ID_in_rule__Function__NameAssignment_014402 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleExpression_in_rule__Function__ArgsAssignment_314433 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_ID_in_rule__Name__ValueAssignment14464 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleUnaryOperator_in_rule__Number__OpAssignment_014495 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_T_NUM_in_rule__Number__ValueAssignment_114526 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleUnaryOperator_in_rule__Percentage__OpAssignment_014557 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_T_NUM_in_rule__Percentage__ValueAssignment_114588 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_PC_UNIT_in_rule__Percentage__UnitAssignment_214619 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleUnaryOperator_in_rule__Length__OpAssignment_014650 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_T_NUM_in_rule__Length__ValueAssignment_114681 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_LEN_UNIT_in_rule__Length__UnitAssignment_214712 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleUnaryOperator_in_rule__Ems__OpAssignment_014743 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_T_NUM_in_rule__Ems__ValueAssignment_114774 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_EM_UNIT_in_rule__Ems__UnitAssignment_214805 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleUnaryOperator_in_rule__Exs__OpAssignment_014836 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_T_NUM_in_rule__Exs__ValueAssignment_114867 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_EX_UNIT_in_rule__Exs__UnitAssignment_214898 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleUnaryOperator_in_rule__Angle__OpAssignment_014929 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_T_NUM_in_rule__Angle__ValueAssignment_114960 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_ANGLE_UNIT_in_rule__Angle__UnitAssignment_214991 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleUnaryOperator_in_rule__Time__OpAssignment_015022 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_T_NUM_in_rule__Time__ValueAssignment_115053 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_TIME_UNIT_in_rule__Time__UnitAssignment_215084 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleUnaryOperator_in_rule__Frequency__OpAssignment_015115 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_T_NUM_in_rule__Frequency__ValueAssignment_115146 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_FREQ_UNIT_in_rule__Frequency__UnitAssignment_215177 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_STRING_in_rule__Uri__ValueAssignment_215208 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_STRING_in_rule__StringValue__ValueAssignment15239 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_HASH_in_rule__HexColor__ValueAssignment15270 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_T_CLASS_in_rule__Class__ClassAssignment15301 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_215332 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleAttributeValue_in_rule__Attribute__ValueAssignment_415363 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleATTRIBUTE_OP_in_rule__AttributeValue__OperatorAssignment_015394 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_rule__AttributeValue__ValueAlternatives_2_0_in_rule__AttributeValue__ValueAssignment_215425 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_ID_in_rule__Pseudo__PseudoAssignment_1_015458 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_ID_in_rule__Pseudo__PseudoAssignment_1_1_015489 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_ID_in_rule__Pseudo__ArgsAssignment_1_1_3_015520 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RULE_HASH_in_rule__CSSId__ValueAssignment15551 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ruleUNARY_in_rule__UnaryOperator__OperatorAssignment15582 = new BitSet(new long[] { 0x0000000000000002L });

}