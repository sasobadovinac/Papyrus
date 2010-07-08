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
 *  Saadia Dhouib (CEA LIST) saadia.dhouib@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.message.editor.xtext.parseTreeConstruction;

import org.eclipse.emf.ecore.*;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parsetree.reconstr.IEObjectConsumer;
import org.eclipse.xtext.parsetree.reconstr.impl.AbstractParseTreeConstructor;

import org.eclipse.papyrus.message.editor.xtext.services.UmlMessageGrammarAccess;

import com.google.inject.Inject;

@SuppressWarnings("all")
public class UmlMessageParsetreeConstructor extends AbstractParseTreeConstructor {
		
	@Inject
	private UmlMessageGrammarAccess grammarAccess;
	
	@Override
	protected AbstractToken getRootToken(IEObjectConsumer inst) {
		return new ThisRootNode(inst);	
	}
	
protected class ThisRootNode extends RootToken {
	public ThisRootNode(IEObjectConsumer inst) {
		super(inst);
	}
	
	@Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MessageRule_Group(this, this, 0, inst);
			case 1: return new SequenceTermRule_Group(this, this, 1, inst);
			default: return null;
		}	
	}	
}
	

/************ begin Rule MessageRule ****************
 *
 * MessageRule:
 * 	sequenceTerm+=SequenceTermRule ("." sequenceTerm+=SequenceTermRule)* ":" name=nameRule;
 *
 **/

// sequenceTerm+=SequenceTermRule ("." sequenceTerm+=SequenceTermRule)* ":" name=nameRule
protected class MessageRule_Group extends GroupToken {
	
	public MessageRule_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMessageRuleAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MessageRule_NameAssignment_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMessageRuleRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// sequenceTerm+=SequenceTermRule
protected class MessageRule_SequenceTermAssignment_0 extends AssignmentToken  {
	
	public MessageRule_SequenceTermAssignment_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMessageRuleAccess().getSequenceTermAssignment_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new SequenceTermRule_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("sequenceTerm",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("sequenceTerm");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getSequenceTermRuleRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMessageRuleAccess().getSequenceTermSequenceTermRuleParserRuleCall_0_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		if(value == inst.getEObject() && !inst.isConsumed()) return null;
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, consumed);
		}	
	}	
}

// ("." sequenceTerm+=SequenceTermRule)*
protected class MessageRule_Group_1 extends GroupToken {
	
	public MessageRule_Group_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMessageRuleAccess().getGroup_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MessageRule_SequenceTermAssignment_1_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "."
protected class MessageRule_FullStopKeyword_1_0 extends KeywordToken  {
	
	public MessageRule_FullStopKeyword_1_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMessageRuleAccess().getFullStopKeyword_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MessageRule_Group_1(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MessageRule_SequenceTermAssignment_0(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// sequenceTerm+=SequenceTermRule
protected class MessageRule_SequenceTermAssignment_1_1 extends AssignmentToken  {
	
	public MessageRule_SequenceTermAssignment_1_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMessageRuleAccess().getSequenceTermAssignment_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new SequenceTermRule_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("sequenceTerm",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("sequenceTerm");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getSequenceTermRuleRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMessageRuleAccess().getSequenceTermSequenceTermRuleParserRuleCall_1_1_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		if(value == inst.getEObject() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new MessageRule_FullStopKeyword_1_0(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}


// ":"
protected class MessageRule_ColonKeyword_2 extends KeywordToken  {
	
	public MessageRule_ColonKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMessageRuleAccess().getColonKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MessageRule_Group_1(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MessageRule_SequenceTermAssignment_0(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// name=nameRule
protected class MessageRule_NameAssignment_3 extends AssignmentToken  {
	
	public MessageRule_NameAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMessageRuleAccess().getNameAssignment_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MessageRule_ColonKeyword_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMessageRuleAccess().getNameNameRuleTerminalRuleCall_3_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMessageRuleAccess().getNameNameRuleTerminalRuleCall_3_0();
			return obj;
		}
		return null;
	}

}


/************ end Rule MessageRule ****************/


/************ begin Rule SequenceTermRule ****************
 *
 * //('.' leftTerms += LeftSequenceTermRule)*
 * SequenceTermRule:
 * 	sequencialOrder= //represents the sequential order of the Message within the next higher level of procedural calling
 * 	INT sequenceName=ID? // represents a concurrent thread of control. Messages that differ in the final name are concurrent at that level of nesting
 * 	recurrence=RecurrenceRule? // The recurrence represents conditional or iterative execution.
 * ;
 *
 **/

// sequencialOrder= //represents the sequential order of the Message within the next higher level of procedural calling
// INT sequenceName=ID? // represents a concurrent thread of control. Messages that differ in the final name are concurrent at that level of nesting
// recurrence=RecurrenceRule? // The recurrence represents conditional or iterative execution.
protected class SequenceTermRule_Group extends GroupToken {
	
	public SequenceTermRule_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getSequenceTermRuleAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new SequenceTermRule_RecurrenceAssignment_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new SequenceTermRule_SequenceNameAssignment_1(lastRuleCallOrigin, this, 1, inst);
			case 2: return new SequenceTermRule_SequencialOrderAssignment_0(lastRuleCallOrigin, this, 2, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getSequenceTermRuleRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// sequencialOrder= //represents the sequential order of the Message within the next higher level of procedural calling
// INT
protected class SequenceTermRule_SequencialOrderAssignment_0 extends AssignmentToken  {
	
	public SequenceTermRule_SequencialOrderAssignment_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getSequenceTermRuleAccess().getSequencialOrderAssignment_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("sequencialOrder",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("sequencialOrder");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getSequenceTermRuleAccess().getSequencialOrderINTTerminalRuleCall_0_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getSequenceTermRuleAccess().getSequencialOrderINTTerminalRuleCall_0_0();
			return obj;
		}
		return null;
	}

}

// sequenceName=ID?
protected class SequenceTermRule_SequenceNameAssignment_1 extends AssignmentToken  {
	
	public SequenceTermRule_SequenceNameAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getSequenceTermRuleAccess().getSequenceNameAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new SequenceTermRule_SequencialOrderAssignment_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("sequenceName",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("sequenceName");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getSequenceTermRuleAccess().getSequenceNameIDTerminalRuleCall_1_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getSequenceTermRuleAccess().getSequenceNameIDTerminalRuleCall_1_0();
			return obj;
		}
		return null;
	}

}

// recurrence=RecurrenceRule?
protected class SequenceTermRule_RecurrenceAssignment_2 extends AssignmentToken  {
	
	public SequenceTermRule_RecurrenceAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getSequenceTermRuleAccess().getRecurrenceAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new SequenceTermRule_SequenceNameAssignment_1(lastRuleCallOrigin, this, 0, inst);
			case 1: return new SequenceTermRule_SequencialOrderAssignment_0(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("recurrence",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("recurrence");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getSequenceTermRuleAccess().getRecurrenceRecurrenceRuleParserRuleCall_2_0(), value, null)) {
			type = AssignmentType.DATATYPE_RULE_CALL;
			element = grammarAccess.getSequenceTermRuleAccess().getRecurrenceRecurrenceRuleParserRuleCall_2_0();
			return obj;
		}
		return null;
	}

}


/************ end Rule SequenceTermRule ****************/


}
