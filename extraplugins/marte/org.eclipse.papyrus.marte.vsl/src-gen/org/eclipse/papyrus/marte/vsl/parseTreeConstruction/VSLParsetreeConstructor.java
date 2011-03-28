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
package org.eclipse.papyrus.marte.vsl.parseTreeConstruction;

import org.eclipse.emf.ecore.*;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parsetree.reconstr.IEObjectConsumer;
import org.eclipse.xtext.parsetree.reconstr.impl.AbstractParseTreeConstructor;

import org.eclipse.papyrus.marte.vsl.services.VSLGrammarAccess;

import com.google.inject.Inject;

@SuppressWarnings("all")
public class VSLParsetreeConstructor extends AbstractParseTreeConstructor {
		
	@Inject
	private VSLGrammarAccess grammarAccess;
	
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
			case 0: return new Expression_ExpAssignment(this, this, 0, inst);
			case 1: return new AndOrXorExpression_Group(this, this, 1, inst);
			case 2: return new EqualityExpression_Group(this, this, 2, inst);
			case 3: return new RelationalExpression_Group(this, this, 3, inst);
			case 4: return new ConditionalExpression_Group(this, this, 4, inst);
			case 5: return new AdditiveExpression_Group(this, this, 5, inst);
			case 6: return new MultiplicativeExpression_Group(this, this, 6, inst);
			case 7: return new UnaryExpression_Alternatives(this, this, 7, inst);
			case 8: return new PrimaryExpression_Group(this, this, 8, inst);
			case 9: return new ValueSpecification_Alternatives(this, this, 9, inst);
			case 10: return new SuffixExpression_Alternatives(this, this, 10, inst);
			case 11: return new PropertyCallExpression_Group(this, this, 11, inst);
			case 12: return new OperationCallExpression_Group(this, this, 12, inst);
			case 13: return new Literal_Alternatives(this, this, 13, inst);
			case 14: return new NameOrChoiceOrBehaviorCall_Group(this, this, 14, inst);
			case 15: return new QualifiedName_Group(this, this, 15, inst);
			case 16: return new Interval_Group(this, this, 16, inst);
			case 17: return new CollectionOrTuple_Group(this, this, 17, inst);
			case 18: return new Tuple_Group(this, this, 18, inst);
			case 19: return new ListOfValues_Group(this, this, 19, inst);
			case 20: return new ListOfValueNamePairs_Group(this, this, 20, inst);
			case 21: return new ValueNamePair_Group(this, this, 21, inst);
			case 22: return new TimeExpression_Alternatives(this, this, 22, inst);
			case 23: return new InstantObsExpression_Group(this, this, 23, inst);
			case 24: return new InstantObsName_Group(this, this, 24, inst);
			case 25: return new DurationObsExpression_Group(this, this, 25, inst);
			case 26: return new DurationObsName_Group(this, this, 26, inst);
			case 27: return new JitterExp_Group(this, this, 27, inst);
			case 28: return new VariableDeclaration_Group(this, this, 28, inst);
			case 29: return new DataTypeName_Group(this, this, 29, inst);
			case 30: return new NumberLiteralRule_Alternatives(this, this, 30, inst);
			case 31: return new IntegerLiteralRule_ValueAssignment(this, this, 31, inst);
			case 32: return new UnlimitedLiteralRule_ValueAssignment(this, this, 32, inst);
			case 33: return new RealLiteralRule_ValueAssignment(this, this, 33, inst);
			case 34: return new DateTimeLiteralRule_ValueAssignment(this, this, 34, inst);
			case 35: return new BooleanLiteralRule_ValueAssignment(this, this, 35, inst);
			case 36: return new NullLiteralRule_ValueAssignment(this, this, 36, inst);
			case 37: return new DefaultLiteralRule_ValueAssignment(this, this, 37, inst);
			case 38: return new StringLiteralRule_ValueAssignment(this, this, 38, inst);
			default: return null;
		}	
	}	
}
	

/************ begin Rule Expression ****************
 *
 * Expression:
 * 	exp=AndOrXorExpression;
 *
 **/

// exp=AndOrXorExpression
protected class Expression_ExpAssignment extends AssignmentToken  {
	
	public Expression_ExpAssignment(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getExpressionAccess().getExpAssignment();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new AndOrXorExpression_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getExpressionRule().getType().getClassifier())
			return null;
		if((value = eObjectConsumer.getConsumable("exp",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("exp");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getAndOrXorExpressionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getExpressionAccess().getExpAndOrXorExpressionParserRuleCall_0(); 
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

/************ end Rule Expression ****************/


/************ begin Rule AndOrXorExpression ****************
 *
 * AndOrXorExpression:
 * 	exp+=EqualityExpression (op+=("and" | "or" | "xor") exp+=EqualityExpression)*;
 *
 **/

// exp+=EqualityExpression (op+=("and" | "or" | "xor") exp+=EqualityExpression)*
protected class AndOrXorExpression_Group extends GroupToken {
	
	public AndOrXorExpression_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getAndOrXorExpressionAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new AndOrXorExpression_Group_1(lastRuleCallOrigin, this, 0, inst);
			case 1: return new AndOrXorExpression_ExpAssignment_0(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getAndOrXorExpressionRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// exp+=EqualityExpression
protected class AndOrXorExpression_ExpAssignment_0 extends AssignmentToken  {
	
	public AndOrXorExpression_ExpAssignment_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getAndOrXorExpressionAccess().getExpAssignment_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EqualityExpression_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("exp",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("exp");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getEqualityExpressionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getAndOrXorExpressionAccess().getExpEqualityExpressionParserRuleCall_0_0(); 
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

// (op+=("and" | "or" | "xor") exp+=EqualityExpression)*
protected class AndOrXorExpression_Group_1 extends GroupToken {
	
	public AndOrXorExpression_Group_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getAndOrXorExpressionAccess().getGroup_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new AndOrXorExpression_ExpAssignment_1_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// op+=("and" | "or" | "xor")
protected class AndOrXorExpression_OpAssignment_1_0 extends AssignmentToken  {
	
	public AndOrXorExpression_OpAssignment_1_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getAndOrXorExpressionAccess().getOpAssignment_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new AndOrXorExpression_Group_1(lastRuleCallOrigin, this, 0, inst);
			case 1: return new AndOrXorExpression_ExpAssignment_0(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("op",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("op");
		if(keywordSerializer.isValid(obj.getEObject(), grammarAccess.getAndOrXorExpressionAccess().getOpAndKeyword_1_0_0_0(), value, null)) {
			type = AssignmentType.KEYWORD;
			element = grammarAccess.getAndOrXorExpressionAccess().getOpAndKeyword_1_0_0_0();
			return obj;
		}
		if(keywordSerializer.isValid(obj.getEObject(), grammarAccess.getAndOrXorExpressionAccess().getOpOrKeyword_1_0_0_1(), value, null)) {
			type = AssignmentType.KEYWORD;
			element = grammarAccess.getAndOrXorExpressionAccess().getOpOrKeyword_1_0_0_1();
			return obj;
		}
		if(keywordSerializer.isValid(obj.getEObject(), grammarAccess.getAndOrXorExpressionAccess().getOpXorKeyword_1_0_0_2(), value, null)) {
			type = AssignmentType.KEYWORD;
			element = grammarAccess.getAndOrXorExpressionAccess().getOpXorKeyword_1_0_0_2();
			return obj;
		}
		return null;
	}

}

// exp+=EqualityExpression
protected class AndOrXorExpression_ExpAssignment_1_1 extends AssignmentToken  {
	
	public AndOrXorExpression_ExpAssignment_1_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getAndOrXorExpressionAccess().getExpAssignment_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EqualityExpression_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("exp",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("exp");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getEqualityExpressionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getAndOrXorExpressionAccess().getExpEqualityExpressionParserRuleCall_1_1_0(); 
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
			case 0: return new AndOrXorExpression_OpAssignment_1_0(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}



/************ end Rule AndOrXorExpression ****************/


/************ begin Rule EqualityExpression ****************
 *
 * EqualityExpression:
 * 	exp+=RelationalExpression (op+=("==" | "<>") exp+=RelationalExpression)*;
 *
 **/

// exp+=RelationalExpression (op+=("==" | "<>") exp+=RelationalExpression)*
protected class EqualityExpression_Group extends GroupToken {
	
	public EqualityExpression_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getEqualityExpressionAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EqualityExpression_Group_1(lastRuleCallOrigin, this, 0, inst);
			case 1: return new EqualityExpression_ExpAssignment_0(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getEqualityExpressionRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// exp+=RelationalExpression
protected class EqualityExpression_ExpAssignment_0 extends AssignmentToken  {
	
	public EqualityExpression_ExpAssignment_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEqualityExpressionAccess().getExpAssignment_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new RelationalExpression_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("exp",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("exp");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getRelationalExpressionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getEqualityExpressionAccess().getExpRelationalExpressionParserRuleCall_0_0(); 
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

// (op+=("==" | "<>") exp+=RelationalExpression)*
protected class EqualityExpression_Group_1 extends GroupToken {
	
	public EqualityExpression_Group_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getEqualityExpressionAccess().getGroup_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EqualityExpression_ExpAssignment_1_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// op+=("==" | "<>")
protected class EqualityExpression_OpAssignment_1_0 extends AssignmentToken  {
	
	public EqualityExpression_OpAssignment_1_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEqualityExpressionAccess().getOpAssignment_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EqualityExpression_Group_1(lastRuleCallOrigin, this, 0, inst);
			case 1: return new EqualityExpression_ExpAssignment_0(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("op",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("op");
		if(keywordSerializer.isValid(obj.getEObject(), grammarAccess.getEqualityExpressionAccess().getOpEqualsSignEqualsSignKeyword_1_0_0_0(), value, null)) {
			type = AssignmentType.KEYWORD;
			element = grammarAccess.getEqualityExpressionAccess().getOpEqualsSignEqualsSignKeyword_1_0_0_0();
			return obj;
		}
		if(keywordSerializer.isValid(obj.getEObject(), grammarAccess.getEqualityExpressionAccess().getOpLessThanSignGreaterThanSignKeyword_1_0_0_1(), value, null)) {
			type = AssignmentType.KEYWORD;
			element = grammarAccess.getEqualityExpressionAccess().getOpLessThanSignGreaterThanSignKeyword_1_0_0_1();
			return obj;
		}
		return null;
	}

}

// exp+=RelationalExpression
protected class EqualityExpression_ExpAssignment_1_1 extends AssignmentToken  {
	
	public EqualityExpression_ExpAssignment_1_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEqualityExpressionAccess().getExpAssignment_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new RelationalExpression_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("exp",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("exp");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getRelationalExpressionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getEqualityExpressionAccess().getExpRelationalExpressionParserRuleCall_1_1_0(); 
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
			case 0: return new EqualityExpression_OpAssignment_1_0(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}



/************ end Rule EqualityExpression ****************/


/************ begin Rule RelationalExpression ****************
 *
 * RelationalExpression:
 * 	exp+=ConditionalExpression (op+=("<" | ">" | "<=" | ">=") exp+=ConditionalExpression)*;
 *
 **/

// exp+=ConditionalExpression (op+=("<" | ">" | "<=" | ">=") exp+=ConditionalExpression)*
protected class RelationalExpression_Group extends GroupToken {
	
	public RelationalExpression_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getRelationalExpressionAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new RelationalExpression_Group_1(lastRuleCallOrigin, this, 0, inst);
			case 1: return new RelationalExpression_ExpAssignment_0(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getRelationalExpressionRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// exp+=ConditionalExpression
protected class RelationalExpression_ExpAssignment_0 extends AssignmentToken  {
	
	public RelationalExpression_ExpAssignment_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getRelationalExpressionAccess().getExpAssignment_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ConditionalExpression_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("exp",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("exp");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getConditionalExpressionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getRelationalExpressionAccess().getExpConditionalExpressionParserRuleCall_0_0(); 
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

// (op+=("<" | ">" | "<=" | ">=") exp+=ConditionalExpression)*
protected class RelationalExpression_Group_1 extends GroupToken {
	
	public RelationalExpression_Group_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getRelationalExpressionAccess().getGroup_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new RelationalExpression_ExpAssignment_1_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// op+=("<" | ">" | "<=" | ">=")
protected class RelationalExpression_OpAssignment_1_0 extends AssignmentToken  {
	
	public RelationalExpression_OpAssignment_1_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getRelationalExpressionAccess().getOpAssignment_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new RelationalExpression_Group_1(lastRuleCallOrigin, this, 0, inst);
			case 1: return new RelationalExpression_ExpAssignment_0(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("op",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("op");
		if(keywordSerializer.isValid(obj.getEObject(), grammarAccess.getRelationalExpressionAccess().getOpLessThanSignKeyword_1_0_0_0(), value, null)) {
			type = AssignmentType.KEYWORD;
			element = grammarAccess.getRelationalExpressionAccess().getOpLessThanSignKeyword_1_0_0_0();
			return obj;
		}
		if(keywordSerializer.isValid(obj.getEObject(), grammarAccess.getRelationalExpressionAccess().getOpGreaterThanSignKeyword_1_0_0_1(), value, null)) {
			type = AssignmentType.KEYWORD;
			element = grammarAccess.getRelationalExpressionAccess().getOpGreaterThanSignKeyword_1_0_0_1();
			return obj;
		}
		if(keywordSerializer.isValid(obj.getEObject(), grammarAccess.getRelationalExpressionAccess().getOpLessThanSignEqualsSignKeyword_1_0_0_2(), value, null)) {
			type = AssignmentType.KEYWORD;
			element = grammarAccess.getRelationalExpressionAccess().getOpLessThanSignEqualsSignKeyword_1_0_0_2();
			return obj;
		}
		if(keywordSerializer.isValid(obj.getEObject(), grammarAccess.getRelationalExpressionAccess().getOpGreaterThanSignEqualsSignKeyword_1_0_0_3(), value, null)) {
			type = AssignmentType.KEYWORD;
			element = grammarAccess.getRelationalExpressionAccess().getOpGreaterThanSignEqualsSignKeyword_1_0_0_3();
			return obj;
		}
		return null;
	}

}

// exp+=ConditionalExpression
protected class RelationalExpression_ExpAssignment_1_1 extends AssignmentToken  {
	
	public RelationalExpression_ExpAssignment_1_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getRelationalExpressionAccess().getExpAssignment_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ConditionalExpression_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("exp",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("exp");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getConditionalExpressionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getRelationalExpressionAccess().getExpConditionalExpressionParserRuleCall_1_1_0(); 
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
			case 0: return new RelationalExpression_OpAssignment_1_0(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}



/************ end Rule RelationalExpression ****************/


/************ begin Rule ConditionalExpression ****************
 *
 * ConditionalExpression:
 * 	exp+=AdditiveExpression (op+="?" exp+=AdditiveExpression ":" exp+=AdditiveExpression)?;
 *
 **/

// exp+=AdditiveExpression (op+="?" exp+=AdditiveExpression ":" exp+=AdditiveExpression)?
protected class ConditionalExpression_Group extends GroupToken {
	
	public ConditionalExpression_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getConditionalExpressionAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ConditionalExpression_Group_1(lastRuleCallOrigin, this, 0, inst);
			case 1: return new ConditionalExpression_ExpAssignment_0(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getConditionalExpressionRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// exp+=AdditiveExpression
protected class ConditionalExpression_ExpAssignment_0 extends AssignmentToken  {
	
	public ConditionalExpression_ExpAssignment_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getConditionalExpressionAccess().getExpAssignment_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new AdditiveExpression_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("exp",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("exp");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getAdditiveExpressionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getConditionalExpressionAccess().getExpAdditiveExpressionParserRuleCall_0_0(); 
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

// (op+="?" exp+=AdditiveExpression ":" exp+=AdditiveExpression)?
protected class ConditionalExpression_Group_1 extends GroupToken {
	
	public ConditionalExpression_Group_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getConditionalExpressionAccess().getGroup_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ConditionalExpression_ExpAssignment_1_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// op+="?"
protected class ConditionalExpression_OpAssignment_1_0 extends AssignmentToken  {
	
	public ConditionalExpression_OpAssignment_1_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getConditionalExpressionAccess().getOpAssignment_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ConditionalExpression_ExpAssignment_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("op",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("op");
		if(keywordSerializer.isValid(obj.getEObject(), grammarAccess.getConditionalExpressionAccess().getOpQuestionMarkKeyword_1_0_0(), value, null)) {
			type = AssignmentType.KEYWORD;
			element = grammarAccess.getConditionalExpressionAccess().getOpQuestionMarkKeyword_1_0_0();
			return obj;
		}
		return null;
	}

}

// exp+=AdditiveExpression
protected class ConditionalExpression_ExpAssignment_1_1 extends AssignmentToken  {
	
	public ConditionalExpression_ExpAssignment_1_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getConditionalExpressionAccess().getExpAssignment_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new AdditiveExpression_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("exp",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("exp");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getAdditiveExpressionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getConditionalExpressionAccess().getExpAdditiveExpressionParserRuleCall_1_1_0(); 
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
			case 0: return new ConditionalExpression_OpAssignment_1_0(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ":"
protected class ConditionalExpression_ColonKeyword_1_2 extends KeywordToken  {
	
	public ConditionalExpression_ColonKeyword_1_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getConditionalExpressionAccess().getColonKeyword_1_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ConditionalExpression_ExpAssignment_1_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// exp+=AdditiveExpression
protected class ConditionalExpression_ExpAssignment_1_3 extends AssignmentToken  {
	
	public ConditionalExpression_ExpAssignment_1_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getConditionalExpressionAccess().getExpAssignment_1_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new AdditiveExpression_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("exp",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("exp");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getAdditiveExpressionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getConditionalExpressionAccess().getExpAdditiveExpressionParserRuleCall_1_3_0(); 
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
			case 0: return new ConditionalExpression_ColonKeyword_1_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}



/************ end Rule ConditionalExpression ****************/


/************ begin Rule AdditiveExpression ****************
 *
 * AdditiveExpression:
 * 	exp+=MultiplicativeExpression (op+=("+" | "-") exp+=MultiplicativeExpression)*;
 *
 **/

// exp+=MultiplicativeExpression (op+=("+" | "-") exp+=MultiplicativeExpression)*
protected class AdditiveExpression_Group extends GroupToken {
	
	public AdditiveExpression_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getAdditiveExpressionAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new AdditiveExpression_Group_1(lastRuleCallOrigin, this, 0, inst);
			case 1: return new AdditiveExpression_ExpAssignment_0(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getAdditiveExpressionRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// exp+=MultiplicativeExpression
protected class AdditiveExpression_ExpAssignment_0 extends AssignmentToken  {
	
	public AdditiveExpression_ExpAssignment_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getAdditiveExpressionAccess().getExpAssignment_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MultiplicativeExpression_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("exp",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("exp");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMultiplicativeExpressionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getAdditiveExpressionAccess().getExpMultiplicativeExpressionParserRuleCall_0_0(); 
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

// (op+=("+" | "-") exp+=MultiplicativeExpression)*
protected class AdditiveExpression_Group_1 extends GroupToken {
	
	public AdditiveExpression_Group_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getAdditiveExpressionAccess().getGroup_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new AdditiveExpression_ExpAssignment_1_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// op+=("+" | "-")
protected class AdditiveExpression_OpAssignment_1_0 extends AssignmentToken  {
	
	public AdditiveExpression_OpAssignment_1_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getAdditiveExpressionAccess().getOpAssignment_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new AdditiveExpression_Group_1(lastRuleCallOrigin, this, 0, inst);
			case 1: return new AdditiveExpression_ExpAssignment_0(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("op",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("op");
		if(keywordSerializer.isValid(obj.getEObject(), grammarAccess.getAdditiveExpressionAccess().getOpPlusSignKeyword_1_0_0_0(), value, null)) {
			type = AssignmentType.KEYWORD;
			element = grammarAccess.getAdditiveExpressionAccess().getOpPlusSignKeyword_1_0_0_0();
			return obj;
		}
		if(keywordSerializer.isValid(obj.getEObject(), grammarAccess.getAdditiveExpressionAccess().getOpHyphenMinusKeyword_1_0_0_1(), value, null)) {
			type = AssignmentType.KEYWORD;
			element = grammarAccess.getAdditiveExpressionAccess().getOpHyphenMinusKeyword_1_0_0_1();
			return obj;
		}
		return null;
	}

}

// exp+=MultiplicativeExpression
protected class AdditiveExpression_ExpAssignment_1_1 extends AssignmentToken  {
	
	public AdditiveExpression_ExpAssignment_1_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getAdditiveExpressionAccess().getExpAssignment_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MultiplicativeExpression_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("exp",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("exp");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMultiplicativeExpressionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getAdditiveExpressionAccess().getExpMultiplicativeExpressionParserRuleCall_1_1_0(); 
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
			case 0: return new AdditiveExpression_OpAssignment_1_0(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}



/************ end Rule AdditiveExpression ****************/


/************ begin Rule MultiplicativeExpression ****************
 *
 * MultiplicativeExpression:
 * 	exp+=UnaryExpression (op+=("*" | "/" | "mod") exp+=UnaryExpression)*;
 *
 **/

// exp+=UnaryExpression (op+=("*" | "/" | "mod") exp+=UnaryExpression)*
protected class MultiplicativeExpression_Group extends GroupToken {
	
	public MultiplicativeExpression_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMultiplicativeExpressionAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MultiplicativeExpression_Group_1(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MultiplicativeExpression_ExpAssignment_0(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMultiplicativeExpressionRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// exp+=UnaryExpression
protected class MultiplicativeExpression_ExpAssignment_0 extends AssignmentToken  {
	
	public MultiplicativeExpression_ExpAssignment_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMultiplicativeExpressionAccess().getExpAssignment_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new UnaryExpression_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("exp",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("exp");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getUnaryExpressionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMultiplicativeExpressionAccess().getExpUnaryExpressionParserRuleCall_0_0(); 
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

// (op+=("*" | "/" | "mod") exp+=UnaryExpression)*
protected class MultiplicativeExpression_Group_1 extends GroupToken {
	
	public MultiplicativeExpression_Group_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMultiplicativeExpressionAccess().getGroup_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MultiplicativeExpression_ExpAssignment_1_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// op+=("*" | "/" | "mod")
protected class MultiplicativeExpression_OpAssignment_1_0 extends AssignmentToken  {
	
	public MultiplicativeExpression_OpAssignment_1_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMultiplicativeExpressionAccess().getOpAssignment_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MultiplicativeExpression_Group_1(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MultiplicativeExpression_ExpAssignment_0(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("op",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("op");
		if(keywordSerializer.isValid(obj.getEObject(), grammarAccess.getMultiplicativeExpressionAccess().getOpAsteriskKeyword_1_0_0_0(), value, null)) {
			type = AssignmentType.KEYWORD;
			element = grammarAccess.getMultiplicativeExpressionAccess().getOpAsteriskKeyword_1_0_0_0();
			return obj;
		}
		if(keywordSerializer.isValid(obj.getEObject(), grammarAccess.getMultiplicativeExpressionAccess().getOpSolidusKeyword_1_0_0_1(), value, null)) {
			type = AssignmentType.KEYWORD;
			element = grammarAccess.getMultiplicativeExpressionAccess().getOpSolidusKeyword_1_0_0_1();
			return obj;
		}
		if(keywordSerializer.isValid(obj.getEObject(), grammarAccess.getMultiplicativeExpressionAccess().getOpModKeyword_1_0_0_2(), value, null)) {
			type = AssignmentType.KEYWORD;
			element = grammarAccess.getMultiplicativeExpressionAccess().getOpModKeyword_1_0_0_2();
			return obj;
		}
		return null;
	}

}

// exp+=UnaryExpression
protected class MultiplicativeExpression_ExpAssignment_1_1 extends AssignmentToken  {
	
	public MultiplicativeExpression_ExpAssignment_1_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMultiplicativeExpressionAccess().getExpAssignment_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new UnaryExpression_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("exp",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("exp");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getUnaryExpressionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMultiplicativeExpressionAccess().getExpUnaryExpressionParserRuleCall_1_1_0(); 
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
			case 0: return new MultiplicativeExpression_OpAssignment_1_0(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}



/************ end Rule MultiplicativeExpression ****************/


/************ begin Rule UnaryExpression ****************
 *
 * UnaryExpression:
 * 	op=("not" | "-" | "+") unary=UnaryExpression | exp=PrimaryExpression;
 *
 **/

// op=("not" | "-" | "+") unary=UnaryExpression | exp=PrimaryExpression
protected class UnaryExpression_Alternatives extends AlternativesToken {

	public UnaryExpression_Alternatives(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getUnaryExpressionAccess().getAlternatives();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new UnaryExpression_Group_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new UnaryExpression_ExpAssignment_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getUnaryExpressionRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// op=("not" | "-" | "+") unary=UnaryExpression
protected class UnaryExpression_Group_0 extends GroupToken {
	
	public UnaryExpression_Group_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getUnaryExpressionAccess().getGroup_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new UnaryExpression_UnaryAssignment_0_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// op=("not" | "-" | "+")
protected class UnaryExpression_OpAssignment_0_0 extends AssignmentToken  {
	
	public UnaryExpression_OpAssignment_0_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getUnaryExpressionAccess().getOpAssignment_0_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("op",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("op");
		if(keywordSerializer.isValid(obj.getEObject(), grammarAccess.getUnaryExpressionAccess().getOpNotKeyword_0_0_0_0(), value, null)) {
			type = AssignmentType.KEYWORD;
			element = grammarAccess.getUnaryExpressionAccess().getOpNotKeyword_0_0_0_0();
			return obj;
		}
		if(keywordSerializer.isValid(obj.getEObject(), grammarAccess.getUnaryExpressionAccess().getOpHyphenMinusKeyword_0_0_0_1(), value, null)) {
			type = AssignmentType.KEYWORD;
			element = grammarAccess.getUnaryExpressionAccess().getOpHyphenMinusKeyword_0_0_0_1();
			return obj;
		}
		if(keywordSerializer.isValid(obj.getEObject(), grammarAccess.getUnaryExpressionAccess().getOpPlusSignKeyword_0_0_0_2(), value, null)) {
			type = AssignmentType.KEYWORD;
			element = grammarAccess.getUnaryExpressionAccess().getOpPlusSignKeyword_0_0_0_2();
			return obj;
		}
		return null;
	}

}

// unary=UnaryExpression
protected class UnaryExpression_UnaryAssignment_0_1 extends AssignmentToken  {
	
	public UnaryExpression_UnaryAssignment_0_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getUnaryExpressionAccess().getUnaryAssignment_0_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new UnaryExpression_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("unary",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("unary");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getUnaryExpressionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getUnaryExpressionAccess().getUnaryUnaryExpressionParserRuleCall_0_1_0(); 
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
			case 0: return new UnaryExpression_OpAssignment_0_0(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}


// exp=PrimaryExpression
protected class UnaryExpression_ExpAssignment_1 extends AssignmentToken  {
	
	public UnaryExpression_ExpAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getUnaryExpressionAccess().getExpAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new PrimaryExpression_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("exp",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("exp");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getPrimaryExpressionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getUnaryExpressionAccess().getExpPrimaryExpressionParserRuleCall_1_0(); 
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


/************ end Rule UnaryExpression ****************/


/************ begin Rule PrimaryExpression ****************
 *
 * PrimaryExpression:
 * 	prefix=ValueSpecification ("." suffix=SuffixExpression)?;
 *
 **/

// prefix=ValueSpecification ("." suffix=SuffixExpression)?
protected class PrimaryExpression_Group extends GroupToken {
	
	public PrimaryExpression_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getPrimaryExpressionAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new PrimaryExpression_Group_1(lastRuleCallOrigin, this, 0, inst);
			case 1: return new PrimaryExpression_PrefixAssignment_0(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getPrimaryExpressionRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// prefix=ValueSpecification
protected class PrimaryExpression_PrefixAssignment_0 extends AssignmentToken  {
	
	public PrimaryExpression_PrefixAssignment_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getPrimaryExpressionAccess().getPrefixAssignment_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ValueSpecification_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("prefix",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("prefix");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getValueSpecificationRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getPrimaryExpressionAccess().getPrefixValueSpecificationParserRuleCall_0_0(); 
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

// ("." suffix=SuffixExpression)?
protected class PrimaryExpression_Group_1 extends GroupToken {
	
	public PrimaryExpression_Group_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getPrimaryExpressionAccess().getGroup_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new PrimaryExpression_SuffixAssignment_1_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "."
protected class PrimaryExpression_FullStopKeyword_1_0 extends KeywordToken  {
	
	public PrimaryExpression_FullStopKeyword_1_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getPrimaryExpressionAccess().getFullStopKeyword_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new PrimaryExpression_PrefixAssignment_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// suffix=SuffixExpression
protected class PrimaryExpression_SuffixAssignment_1_1 extends AssignmentToken  {
	
	public PrimaryExpression_SuffixAssignment_1_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getPrimaryExpressionAccess().getSuffixAssignment_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new SuffixExpression_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("suffix",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("suffix");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getSuffixExpressionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getPrimaryExpressionAccess().getSuffixSuffixExpressionParserRuleCall_1_1_0(); 
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
			case 0: return new PrimaryExpression_FullStopKeyword_1_0(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}



/************ end Rule PrimaryExpression ****************/


/************ begin Rule ValueSpecification ****************
 *
 * ValueSpecification:
 * 	Literal | NameOrChoiceOrBehaviorCall | Interval | CollectionOrTuple | Tuple | TimeExpression | VariableDeclaration |
 * 	"(" Expression ")";
 *
 **/

// Literal | NameOrChoiceOrBehaviorCall | Interval | CollectionOrTuple | Tuple | TimeExpression | VariableDeclaration | "("
// Expression ")"
protected class ValueSpecification_Alternatives extends AlternativesToken {

	public ValueSpecification_Alternatives(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getValueSpecificationAccess().getAlternatives();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ValueSpecification_LiteralParserRuleCall_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new ValueSpecification_NameOrChoiceOrBehaviorCallParserRuleCall_1(lastRuleCallOrigin, this, 1, inst);
			case 2: return new ValueSpecification_IntervalParserRuleCall_2(lastRuleCallOrigin, this, 2, inst);
			case 3: return new ValueSpecification_CollectionOrTupleParserRuleCall_3(lastRuleCallOrigin, this, 3, inst);
			case 4: return new ValueSpecification_TupleParserRuleCall_4(lastRuleCallOrigin, this, 4, inst);
			case 5: return new ValueSpecification_TimeExpressionParserRuleCall_5(lastRuleCallOrigin, this, 5, inst);
			case 6: return new ValueSpecification_VariableDeclarationParserRuleCall_6(lastRuleCallOrigin, this, 6, inst);
			case 7: return new ValueSpecification_Group_7(lastRuleCallOrigin, this, 7, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getBooleanLiteralRuleRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getCollectionOrTupleRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getDateTimeLiteralRuleRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getDefaultLiteralRuleRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getDurationObsExpressionRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getExpressionRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getInstantObsExpressionRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getIntegerLiteralRuleRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getIntervalRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getJitterExpRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getNameOrChoiceOrBehaviorCallRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getNullLiteralRuleRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getRealLiteralRuleRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getStringLiteralRuleRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getTupleRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getUnlimitedLiteralRuleRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getVariableDeclarationRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// Literal
protected class ValueSpecification_LiteralParserRuleCall_0 extends RuleCallToken {
	
	public ValueSpecification_LiteralParserRuleCall_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getValueSpecificationAccess().getLiteralParserRuleCall_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Literal_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getBooleanLiteralRuleRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getDateTimeLiteralRuleRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getDefaultLiteralRuleRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getIntegerLiteralRuleRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getNullLiteralRuleRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getRealLiteralRuleRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getStringLiteralRuleRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getUnlimitedLiteralRuleRule().getType().getClassifier())
			return null;
		if(checkForRecursion(Literal_Alternatives.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// NameOrChoiceOrBehaviorCall
protected class ValueSpecification_NameOrChoiceOrBehaviorCallParserRuleCall_1 extends RuleCallToken {
	
	public ValueSpecification_NameOrChoiceOrBehaviorCallParserRuleCall_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getValueSpecificationAccess().getNameOrChoiceOrBehaviorCallParserRuleCall_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new NameOrChoiceOrBehaviorCall_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getNameOrChoiceOrBehaviorCallRule().getType().getClassifier())
			return null;
		if(checkForRecursion(NameOrChoiceOrBehaviorCall_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// Interval
protected class ValueSpecification_IntervalParserRuleCall_2 extends RuleCallToken {
	
	public ValueSpecification_IntervalParserRuleCall_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getValueSpecificationAccess().getIntervalParserRuleCall_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Interval_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getIntervalRule().getType().getClassifier())
			return null;
		if(checkForRecursion(Interval_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// CollectionOrTuple
protected class ValueSpecification_CollectionOrTupleParserRuleCall_3 extends RuleCallToken {
	
	public ValueSpecification_CollectionOrTupleParserRuleCall_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getValueSpecificationAccess().getCollectionOrTupleParserRuleCall_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new CollectionOrTuple_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getCollectionOrTupleRule().getType().getClassifier())
			return null;
		if(checkForRecursion(CollectionOrTuple_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// Tuple
protected class ValueSpecification_TupleParserRuleCall_4 extends RuleCallToken {
	
	public ValueSpecification_TupleParserRuleCall_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getValueSpecificationAccess().getTupleParserRuleCall_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Tuple_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getTupleRule().getType().getClassifier())
			return null;
		if(checkForRecursion(Tuple_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// TimeExpression
protected class ValueSpecification_TimeExpressionParserRuleCall_5 extends RuleCallToken {
	
	public ValueSpecification_TimeExpressionParserRuleCall_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getValueSpecificationAccess().getTimeExpressionParserRuleCall_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new TimeExpression_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getDurationObsExpressionRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getInstantObsExpressionRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getJitterExpRule().getType().getClassifier())
			return null;
		if(checkForRecursion(TimeExpression_Alternatives.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// VariableDeclaration
protected class ValueSpecification_VariableDeclarationParserRuleCall_6 extends RuleCallToken {
	
	public ValueSpecification_VariableDeclarationParserRuleCall_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getValueSpecificationAccess().getVariableDeclarationParserRuleCall_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new VariableDeclaration_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getVariableDeclarationRule().getType().getClassifier())
			return null;
		if(checkForRecursion(VariableDeclaration_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// "(" Expression ")"
protected class ValueSpecification_Group_7 extends GroupToken {
	
	public ValueSpecification_Group_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getValueSpecificationAccess().getGroup_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ValueSpecification_RightParenthesisKeyword_7_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getExpressionRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "("
protected class ValueSpecification_LeftParenthesisKeyword_7_0 extends KeywordToken  {
	
	public ValueSpecification_LeftParenthesisKeyword_7_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getValueSpecificationAccess().getLeftParenthesisKeyword_7_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// Expression
protected class ValueSpecification_ExpressionParserRuleCall_7_1 extends RuleCallToken {
	
	public ValueSpecification_ExpressionParserRuleCall_7_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getValueSpecificationAccess().getExpressionParserRuleCall_7_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Expression_ExpAssignment(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(checkForRecursion(Expression_ExpAssignment.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ValueSpecification_LeftParenthesisKeyword_7_0(lastRuleCallOrigin, next, actIndex, inst);
			default: return null;
		}	
	}	
}

// ")"
protected class ValueSpecification_RightParenthesisKeyword_7_2 extends KeywordToken  {
	
	public ValueSpecification_RightParenthesisKeyword_7_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getValueSpecificationAccess().getRightParenthesisKeyword_7_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ValueSpecification_ExpressionParserRuleCall_7_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}



/************ end Rule ValueSpecification ****************/


/************ begin Rule SuffixExpression ****************
 *
 * SuffixExpression:
 * 	PropertyCallExpression | OperationCallExpression;
 *
 **/

// PropertyCallExpression | OperationCallExpression
protected class SuffixExpression_Alternatives extends AlternativesToken {

	public SuffixExpression_Alternatives(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getSuffixExpressionAccess().getAlternatives();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new SuffixExpression_PropertyCallExpressionParserRuleCall_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new SuffixExpression_OperationCallExpressionParserRuleCall_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getOperationCallExpressionRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getPropertyCallExpressionRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// PropertyCallExpression
protected class SuffixExpression_PropertyCallExpressionParserRuleCall_0 extends RuleCallToken {
	
	public SuffixExpression_PropertyCallExpressionParserRuleCall_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getSuffixExpressionAccess().getPropertyCallExpressionParserRuleCall_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new PropertyCallExpression_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getPropertyCallExpressionRule().getType().getClassifier())
			return null;
		if(checkForRecursion(PropertyCallExpression_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// OperationCallExpression
protected class SuffixExpression_OperationCallExpressionParserRuleCall_1 extends RuleCallToken {
	
	public SuffixExpression_OperationCallExpressionParserRuleCall_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getSuffixExpressionAccess().getOperationCallExpressionParserRuleCall_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new OperationCallExpression_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getOperationCallExpressionRule().getType().getClassifier())
			return null;
		if(checkForRecursion(OperationCallExpression_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}


/************ end Rule SuffixExpression ****************/


/************ begin Rule PropertyCallExpression ****************
 *
 * PropertyCallExpression:
 * 	property=[uml::Property] ("." suffix=SuffixExpression)?;
 *
 **/

// property=[uml::Property] ("." suffix=SuffixExpression)?
protected class PropertyCallExpression_Group extends GroupToken {
	
	public PropertyCallExpression_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getPropertyCallExpressionAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new PropertyCallExpression_Group_1(lastRuleCallOrigin, this, 0, inst);
			case 1: return new PropertyCallExpression_PropertyAssignment_0(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getPropertyCallExpressionRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// property=[uml::Property]
protected class PropertyCallExpression_PropertyAssignment_0 extends AssignmentToken  {
	
	public PropertyCallExpression_PropertyAssignment_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getPropertyCallExpressionAccess().getPropertyAssignment_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("property",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("property");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getPropertyCallExpressionAccess().getPropertyPropertyCrossReference_0_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getPropertyCallExpressionAccess().getPropertyPropertyCrossReference_0_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ("." suffix=SuffixExpression)?
protected class PropertyCallExpression_Group_1 extends GroupToken {
	
	public PropertyCallExpression_Group_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getPropertyCallExpressionAccess().getGroup_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new PropertyCallExpression_SuffixAssignment_1_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "."
protected class PropertyCallExpression_FullStopKeyword_1_0 extends KeywordToken  {
	
	public PropertyCallExpression_FullStopKeyword_1_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getPropertyCallExpressionAccess().getFullStopKeyword_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new PropertyCallExpression_PropertyAssignment_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// suffix=SuffixExpression
protected class PropertyCallExpression_SuffixAssignment_1_1 extends AssignmentToken  {
	
	public PropertyCallExpression_SuffixAssignment_1_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getPropertyCallExpressionAccess().getSuffixAssignment_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new SuffixExpression_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("suffix",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("suffix");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getSuffixExpressionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getPropertyCallExpressionAccess().getSuffixSuffixExpressionParserRuleCall_1_1_0(); 
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
			case 0: return new PropertyCallExpression_FullStopKeyword_1_0(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}



/************ end Rule PropertyCallExpression ****************/


/************ begin Rule OperationCallExpression ****************
 *
 * OperationCallExpression:
 * 	operation=[uml::Operation] "(" arguments=ListOfValues? ")" ("." suffix=SuffixExpression)?;
 *
 **/

// operation=[uml::Operation] "(" arguments=ListOfValues? ")" ("." suffix=SuffixExpression)?
protected class OperationCallExpression_Group extends GroupToken {
	
	public OperationCallExpression_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getOperationCallExpressionAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new OperationCallExpression_Group_4(lastRuleCallOrigin, this, 0, inst);
			case 1: return new OperationCallExpression_RightParenthesisKeyword_3(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getOperationCallExpressionRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// operation=[uml::Operation]
protected class OperationCallExpression_OperationAssignment_0 extends AssignmentToken  {
	
	public OperationCallExpression_OperationAssignment_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getOperationCallExpressionAccess().getOperationAssignment_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("operation",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("operation");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getOperationCallExpressionAccess().getOperationOperationCrossReference_0_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getOperationCallExpressionAccess().getOperationOperationCrossReference_0_0(); 
				return obj;
			}
		}
		return null;
	}

}

// "("
protected class OperationCallExpression_LeftParenthesisKeyword_1 extends KeywordToken  {
	
	public OperationCallExpression_LeftParenthesisKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getOperationCallExpressionAccess().getLeftParenthesisKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new OperationCallExpression_OperationAssignment_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// arguments=ListOfValues?
protected class OperationCallExpression_ArgumentsAssignment_2 extends AssignmentToken  {
	
	public OperationCallExpression_ArgumentsAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getOperationCallExpressionAccess().getArgumentsAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ListOfValues_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("arguments",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("arguments");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getListOfValuesRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getOperationCallExpressionAccess().getArgumentsListOfValuesParserRuleCall_2_0(); 
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
			case 0: return new OperationCallExpression_LeftParenthesisKeyword_1(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ")"
protected class OperationCallExpression_RightParenthesisKeyword_3 extends KeywordToken  {
	
	public OperationCallExpression_RightParenthesisKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getOperationCallExpressionAccess().getRightParenthesisKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new OperationCallExpression_ArgumentsAssignment_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new OperationCallExpression_LeftParenthesisKeyword_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// ("." suffix=SuffixExpression)?
protected class OperationCallExpression_Group_4 extends GroupToken {
	
	public OperationCallExpression_Group_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getOperationCallExpressionAccess().getGroup_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new OperationCallExpression_SuffixAssignment_4_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "."
protected class OperationCallExpression_FullStopKeyword_4_0 extends KeywordToken  {
	
	public OperationCallExpression_FullStopKeyword_4_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getOperationCallExpressionAccess().getFullStopKeyword_4_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new OperationCallExpression_RightParenthesisKeyword_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// suffix=SuffixExpression
protected class OperationCallExpression_SuffixAssignment_4_1 extends AssignmentToken  {
	
	public OperationCallExpression_SuffixAssignment_4_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getOperationCallExpressionAccess().getSuffixAssignment_4_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new SuffixExpression_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("suffix",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("suffix");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getSuffixExpressionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getOperationCallExpressionAccess().getSuffixSuffixExpressionParserRuleCall_4_1_0(); 
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
			case 0: return new OperationCallExpression_FullStopKeyword_4_0(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}



/************ end Rule OperationCallExpression ****************/


/************ begin Rule Literal ****************
 *
 * Literal:
 * 	NumberLiteralRule | DateTimeLiteralRule | BooleanLiteralRule | NullLiteralRule | DefaultLiteralRule |
 * 	StringLiteralRule;
 *
 **/

// NumberLiteralRule | DateTimeLiteralRule | BooleanLiteralRule | NullLiteralRule | DefaultLiteralRule | StringLiteralRule
protected class Literal_Alternatives extends AlternativesToken {

	public Literal_Alternatives(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getLiteralAccess().getAlternatives();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Literal_NumberLiteralRuleParserRuleCall_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new Literal_DateTimeLiteralRuleParserRuleCall_1(lastRuleCallOrigin, this, 1, inst);
			case 2: return new Literal_BooleanLiteralRuleParserRuleCall_2(lastRuleCallOrigin, this, 2, inst);
			case 3: return new Literal_NullLiteralRuleParserRuleCall_3(lastRuleCallOrigin, this, 3, inst);
			case 4: return new Literal_DefaultLiteralRuleParserRuleCall_4(lastRuleCallOrigin, this, 4, inst);
			case 5: return new Literal_StringLiteralRuleParserRuleCall_5(lastRuleCallOrigin, this, 5, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getBooleanLiteralRuleRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getDateTimeLiteralRuleRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getDefaultLiteralRuleRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getIntegerLiteralRuleRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getNullLiteralRuleRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getRealLiteralRuleRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getStringLiteralRuleRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getUnlimitedLiteralRuleRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// NumberLiteralRule
protected class Literal_NumberLiteralRuleParserRuleCall_0 extends RuleCallToken {
	
	public Literal_NumberLiteralRuleParserRuleCall_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getLiteralAccess().getNumberLiteralRuleParserRuleCall_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new NumberLiteralRule_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getIntegerLiteralRuleRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getRealLiteralRuleRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getUnlimitedLiteralRuleRule().getType().getClassifier())
			return null;
		if(checkForRecursion(NumberLiteralRule_Alternatives.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// DateTimeLiteralRule
protected class Literal_DateTimeLiteralRuleParserRuleCall_1 extends RuleCallToken {
	
	public Literal_DateTimeLiteralRuleParserRuleCall_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getLiteralAccess().getDateTimeLiteralRuleParserRuleCall_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new DateTimeLiteralRule_ValueAssignment(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getDateTimeLiteralRuleRule().getType().getClassifier())
			return null;
		if(checkForRecursion(DateTimeLiteralRule_ValueAssignment.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// BooleanLiteralRule
protected class Literal_BooleanLiteralRuleParserRuleCall_2 extends RuleCallToken {
	
	public Literal_BooleanLiteralRuleParserRuleCall_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getLiteralAccess().getBooleanLiteralRuleParserRuleCall_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new BooleanLiteralRule_ValueAssignment(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getBooleanLiteralRuleRule().getType().getClassifier())
			return null;
		if(checkForRecursion(BooleanLiteralRule_ValueAssignment.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// NullLiteralRule
protected class Literal_NullLiteralRuleParserRuleCall_3 extends RuleCallToken {
	
	public Literal_NullLiteralRuleParserRuleCall_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getLiteralAccess().getNullLiteralRuleParserRuleCall_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new NullLiteralRule_ValueAssignment(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getNullLiteralRuleRule().getType().getClassifier())
			return null;
		if(checkForRecursion(NullLiteralRule_ValueAssignment.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// DefaultLiteralRule
protected class Literal_DefaultLiteralRuleParserRuleCall_4 extends RuleCallToken {
	
	public Literal_DefaultLiteralRuleParserRuleCall_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getLiteralAccess().getDefaultLiteralRuleParserRuleCall_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new DefaultLiteralRule_ValueAssignment(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getDefaultLiteralRuleRule().getType().getClassifier())
			return null;
		if(checkForRecursion(DefaultLiteralRule_ValueAssignment.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// StringLiteralRule
protected class Literal_StringLiteralRuleParserRuleCall_5 extends RuleCallToken {
	
	public Literal_StringLiteralRuleParserRuleCall_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getLiteralAccess().getStringLiteralRuleParserRuleCall_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new StringLiteralRule_ValueAssignment(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getStringLiteralRuleRule().getType().getClassifier())
			return null;
		if(checkForRecursion(StringLiteralRule_ValueAssignment.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}


/************ end Rule Literal ****************/


/************ begin Rule NameOrChoiceOrBehaviorCall ****************
 *
 * NameOrChoiceOrBehaviorCall:
 * 	path=QualifiedName? // can resolve to :
 * 	// - EnumSpecification,
 * 	// - VariableCallExpression
 * 	// - PropertyCallExpression
 * 	// - ChoiceExpression
 * 	id=[uml::NamedElement] ("(" arguments=ListOfValues? ")")?;
 *
 **/

// path=QualifiedName? // can resolve to :
// // - EnumSpecification,
// // - VariableCallExpression
// // - PropertyCallExpression
// // - ChoiceExpression
// id=[uml::NamedElement] ("(" arguments=ListOfValues? ")")?
protected class NameOrChoiceOrBehaviorCall_Group extends GroupToken {
	
	public NameOrChoiceOrBehaviorCall_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getNameOrChoiceOrBehaviorCallAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new NameOrChoiceOrBehaviorCall_Group_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new NameOrChoiceOrBehaviorCall_IdAssignment_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getNameOrChoiceOrBehaviorCallRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// path=QualifiedName?
protected class NameOrChoiceOrBehaviorCall_PathAssignment_0 extends AssignmentToken  {
	
	public NameOrChoiceOrBehaviorCall_PathAssignment_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getNameOrChoiceOrBehaviorCallAccess().getPathAssignment_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new QualifiedName_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("path",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("path");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getQualifiedNameRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getNameOrChoiceOrBehaviorCallAccess().getPathQualifiedNameParserRuleCall_0_0(); 
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

// id=[uml::NamedElement]
protected class NameOrChoiceOrBehaviorCall_IdAssignment_1 extends AssignmentToken  {
	
	public NameOrChoiceOrBehaviorCall_IdAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getNameOrChoiceOrBehaviorCallAccess().getIdAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new NameOrChoiceOrBehaviorCall_PathAssignment_0(lastRuleCallOrigin, this, 0, inst);
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index - 1, inst);
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("id",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("id");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getNameOrChoiceOrBehaviorCallAccess().getIdNamedElementCrossReference_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getNameOrChoiceOrBehaviorCallAccess().getIdNamedElementCrossReference_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ("(" arguments=ListOfValues? ")")?
protected class NameOrChoiceOrBehaviorCall_Group_2 extends GroupToken {
	
	public NameOrChoiceOrBehaviorCall_Group_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getNameOrChoiceOrBehaviorCallAccess().getGroup_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new NameOrChoiceOrBehaviorCall_RightParenthesisKeyword_2_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "("
protected class NameOrChoiceOrBehaviorCall_LeftParenthesisKeyword_2_0 extends KeywordToken  {
	
	public NameOrChoiceOrBehaviorCall_LeftParenthesisKeyword_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getNameOrChoiceOrBehaviorCallAccess().getLeftParenthesisKeyword_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new NameOrChoiceOrBehaviorCall_IdAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// arguments=ListOfValues?
protected class NameOrChoiceOrBehaviorCall_ArgumentsAssignment_2_1 extends AssignmentToken  {
	
	public NameOrChoiceOrBehaviorCall_ArgumentsAssignment_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getNameOrChoiceOrBehaviorCallAccess().getArgumentsAssignment_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ListOfValues_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("arguments",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("arguments");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getListOfValuesRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getNameOrChoiceOrBehaviorCallAccess().getArgumentsListOfValuesParserRuleCall_2_1_0(); 
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
			case 0: return new NameOrChoiceOrBehaviorCall_LeftParenthesisKeyword_2_0(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ")"
protected class NameOrChoiceOrBehaviorCall_RightParenthesisKeyword_2_2 extends KeywordToken  {
	
	public NameOrChoiceOrBehaviorCall_RightParenthesisKeyword_2_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getNameOrChoiceOrBehaviorCallAccess().getRightParenthesisKeyword_2_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new NameOrChoiceOrBehaviorCall_ArgumentsAssignment_2_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}



/************ end Rule NameOrChoiceOrBehaviorCall ****************/


/************ begin Rule QualifiedName ****************
 *
 * QualifiedName:
 * 	path=[uml::Namespace] "::" remaining=QualifiedName?;
 *
 **/

// path=[uml::Namespace] "::" remaining=QualifiedName?
protected class QualifiedName_Group extends GroupToken {
	
	public QualifiedName_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getQualifiedNameAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new QualifiedName_RemainingAssignment_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new QualifiedName_ColonColonKeyword_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getQualifiedNameRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// path=[uml::Namespace]
protected class QualifiedName_PathAssignment_0 extends AssignmentToken  {
	
	public QualifiedName_PathAssignment_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getQualifiedNameAccess().getPathAssignment_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("path",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("path");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getQualifiedNameAccess().getPathNamespaceCrossReference_0_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getQualifiedNameAccess().getPathNamespaceCrossReference_0_0(); 
				return obj;
			}
		}
		return null;
	}

}

// "::"
protected class QualifiedName_ColonColonKeyword_1 extends KeywordToken  {
	
	public QualifiedName_ColonColonKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getQualifiedNameAccess().getColonColonKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new QualifiedName_PathAssignment_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// remaining=QualifiedName?
protected class QualifiedName_RemainingAssignment_2 extends AssignmentToken  {
	
	public QualifiedName_RemainingAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getQualifiedNameAccess().getRemainingAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new QualifiedName_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("remaining",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("remaining");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getQualifiedNameRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getQualifiedNameAccess().getRemainingQualifiedNameParserRuleCall_2_0(); 
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
			case 0: return new QualifiedName_ColonColonKeyword_1(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}


/************ end Rule QualifiedName ****************/


/************ begin Rule Interval ****************
 *
 * Interval:
 * 	("]" | isLowerIncluded="[") lower=Expression ".." upper=Expression (isUpperIncluded="]" | "[");
 *
 **/

// ("]" | isLowerIncluded="[") lower=Expression ".." upper=Expression (isUpperIncluded="]" | "[")
protected class Interval_Group extends GroupToken {
	
	public Interval_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getIntervalAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Interval_Alternatives_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getIntervalRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "]" | isLowerIncluded="["
protected class Interval_Alternatives_0 extends AlternativesToken {

	public Interval_Alternatives_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getIntervalAccess().getAlternatives_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Interval_RightSquareBracketKeyword_0_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new Interval_IsLowerIncludedAssignment_0_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "]"
protected class Interval_RightSquareBracketKeyword_0_0 extends KeywordToken  {
	
	public Interval_RightSquareBracketKeyword_0_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getIntervalAccess().getRightSquareBracketKeyword_0_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// isLowerIncluded="["
protected class Interval_IsLowerIncludedAssignment_0_1 extends AssignmentToken  {
	
	public Interval_IsLowerIncludedAssignment_0_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getIntervalAccess().getIsLowerIncludedAssignment_0_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("isLowerIncluded",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("isLowerIncluded");
		if(keywordSerializer.isValid(obj.getEObject(), grammarAccess.getIntervalAccess().getIsLowerIncludedLeftSquareBracketKeyword_0_1_0(), value, null)) {
			type = AssignmentType.KEYWORD;
			element = grammarAccess.getIntervalAccess().getIsLowerIncludedLeftSquareBracketKeyword_0_1_0();
			return obj;
		}
		return null;
	}

}


// lower=Expression
protected class Interval_LowerAssignment_1 extends AssignmentToken  {
	
	public Interval_LowerAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getIntervalAccess().getLowerAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Expression_ExpAssignment(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("lower",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("lower");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getExpressionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getIntervalAccess().getLowerExpressionParserRuleCall_1_0(); 
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
			case 0: return new Interval_Alternatives_0(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ".."
protected class Interval_FullStopFullStopKeyword_2 extends KeywordToken  {
	
	public Interval_FullStopFullStopKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getIntervalAccess().getFullStopFullStopKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Interval_LowerAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// upper=Expression
protected class Interval_UpperAssignment_3 extends AssignmentToken  {
	
	public Interval_UpperAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getIntervalAccess().getUpperAssignment_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Expression_ExpAssignment(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("upper",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("upper");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getExpressionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getIntervalAccess().getUpperExpressionParserRuleCall_3_0(); 
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
			case 0: return new Interval_FullStopFullStopKeyword_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// isUpperIncluded="]" | "["
protected class Interval_Alternatives_4 extends AlternativesToken {

	public Interval_Alternatives_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getIntervalAccess().getAlternatives_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Interval_IsUpperIncludedAssignment_4_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new Interval_LeftSquareBracketKeyword_4_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// isUpperIncluded="]"
protected class Interval_IsUpperIncludedAssignment_4_0 extends AssignmentToken  {
	
	public Interval_IsUpperIncludedAssignment_4_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getIntervalAccess().getIsUpperIncludedAssignment_4_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Interval_UpperAssignment_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("isUpperIncluded",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("isUpperIncluded");
		if(keywordSerializer.isValid(obj.getEObject(), grammarAccess.getIntervalAccess().getIsUpperIncludedRightSquareBracketKeyword_4_0_0(), value, null)) {
			type = AssignmentType.KEYWORD;
			element = grammarAccess.getIntervalAccess().getIsUpperIncludedRightSquareBracketKeyword_4_0_0();
			return obj;
		}
		return null;
	}

}

// "["
protected class Interval_LeftSquareBracketKeyword_4_1 extends KeywordToken  {
	
	public Interval_LeftSquareBracketKeyword_4_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getIntervalAccess().getLeftSquareBracketKeyword_4_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Interval_UpperAssignment_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}



/************ end Rule Interval ****************/


/************ begin Rule CollectionOrTuple ****************
 *
 * CollectionOrTuple:
 * 	"{" listOfValues=ListOfValues "}";
 *
 **/

// "{" listOfValues=ListOfValues "}"
protected class CollectionOrTuple_Group extends GroupToken {
	
	public CollectionOrTuple_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getCollectionOrTupleAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new CollectionOrTuple_RightCurlyBracketKeyword_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getCollectionOrTupleRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "{"
protected class CollectionOrTuple_LeftCurlyBracketKeyword_0 extends KeywordToken  {
	
	public CollectionOrTuple_LeftCurlyBracketKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getCollectionOrTupleAccess().getLeftCurlyBracketKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// listOfValues=ListOfValues
protected class CollectionOrTuple_ListOfValuesAssignment_1 extends AssignmentToken  {
	
	public CollectionOrTuple_ListOfValuesAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getCollectionOrTupleAccess().getListOfValuesAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ListOfValues_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("listOfValues",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("listOfValues");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getListOfValuesRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getCollectionOrTupleAccess().getListOfValuesListOfValuesParserRuleCall_1_0(); 
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
			case 0: return new CollectionOrTuple_LeftCurlyBracketKeyword_0(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class CollectionOrTuple_RightCurlyBracketKeyword_2 extends KeywordToken  {
	
	public CollectionOrTuple_RightCurlyBracketKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getCollectionOrTupleAccess().getRightCurlyBracketKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new CollectionOrTuple_ListOfValuesAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule CollectionOrTuple ****************/


/************ begin Rule Tuple ****************
 *
 * Tuple:
 * 	"{" listOfValueNamePairs=ListOfValueNamePairs "}";
 *
 **/

// "{" listOfValueNamePairs=ListOfValueNamePairs "}"
protected class Tuple_Group extends GroupToken {
	
	public Tuple_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getTupleAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Tuple_RightCurlyBracketKeyword_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getTupleRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "{"
protected class Tuple_LeftCurlyBracketKeyword_0 extends KeywordToken  {
	
	public Tuple_LeftCurlyBracketKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getTupleAccess().getLeftCurlyBracketKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// listOfValueNamePairs=ListOfValueNamePairs
protected class Tuple_ListOfValueNamePairsAssignment_1 extends AssignmentToken  {
	
	public Tuple_ListOfValueNamePairsAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getTupleAccess().getListOfValueNamePairsAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ListOfValueNamePairs_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("listOfValueNamePairs",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("listOfValueNamePairs");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getListOfValueNamePairsRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getTupleAccess().getListOfValueNamePairsListOfValueNamePairsParserRuleCall_1_0(); 
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
			case 0: return new Tuple_LeftCurlyBracketKeyword_0(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class Tuple_RightCurlyBracketKeyword_2 extends KeywordToken  {
	
	public Tuple_RightCurlyBracketKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getTupleAccess().getRightCurlyBracketKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Tuple_ListOfValueNamePairsAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule Tuple ****************/


/************ begin Rule ListOfValues ****************
 *
 * ListOfValues:
 * 	values+=Expression ("," values+=Expression)*;
 *
 **/

// values+=Expression ("," values+=Expression)*
protected class ListOfValues_Group extends GroupToken {
	
	public ListOfValues_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getListOfValuesAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ListOfValues_Group_1(lastRuleCallOrigin, this, 0, inst);
			case 1: return new ListOfValues_ValuesAssignment_0(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getListOfValuesRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// values+=Expression
protected class ListOfValues_ValuesAssignment_0 extends AssignmentToken  {
	
	public ListOfValues_ValuesAssignment_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getListOfValuesAccess().getValuesAssignment_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Expression_ExpAssignment(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("values",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("values");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getExpressionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getListOfValuesAccess().getValuesExpressionParserRuleCall_0_0(); 
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

// ("," values+=Expression)*
protected class ListOfValues_Group_1 extends GroupToken {
	
	public ListOfValues_Group_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getListOfValuesAccess().getGroup_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ListOfValues_ValuesAssignment_1_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ","
protected class ListOfValues_CommaKeyword_1_0 extends KeywordToken  {
	
	public ListOfValues_CommaKeyword_1_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getListOfValuesAccess().getCommaKeyword_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ListOfValues_Group_1(lastRuleCallOrigin, this, 0, inst);
			case 1: return new ListOfValues_ValuesAssignment_0(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// values+=Expression
protected class ListOfValues_ValuesAssignment_1_1 extends AssignmentToken  {
	
	public ListOfValues_ValuesAssignment_1_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getListOfValuesAccess().getValuesAssignment_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Expression_ExpAssignment(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("values",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("values");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getExpressionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getListOfValuesAccess().getValuesExpressionParserRuleCall_1_1_0(); 
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
			case 0: return new ListOfValues_CommaKeyword_1_0(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}



/************ end Rule ListOfValues ****************/


/************ begin Rule ListOfValueNamePairs ****************
 *
 * ListOfValueNamePairs:
 * 	valueNamePairs+=ValueNamePair ("," valueNamePairs+=ValueNamePair)*;
 *
 **/

// valueNamePairs+=ValueNamePair ("," valueNamePairs+=ValueNamePair)*
protected class ListOfValueNamePairs_Group extends GroupToken {
	
	public ListOfValueNamePairs_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getListOfValueNamePairsAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ListOfValueNamePairs_Group_1(lastRuleCallOrigin, this, 0, inst);
			case 1: return new ListOfValueNamePairs_ValueNamePairsAssignment_0(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getListOfValueNamePairsRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// valueNamePairs+=ValueNamePair
protected class ListOfValueNamePairs_ValueNamePairsAssignment_0 extends AssignmentToken  {
	
	public ListOfValueNamePairs_ValueNamePairsAssignment_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getListOfValueNamePairsAccess().getValueNamePairsAssignment_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ValueNamePair_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("valueNamePairs",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("valueNamePairs");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getValueNamePairRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getListOfValueNamePairsAccess().getValueNamePairsValueNamePairParserRuleCall_0_0(); 
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

// ("," valueNamePairs+=ValueNamePair)*
protected class ListOfValueNamePairs_Group_1 extends GroupToken {
	
	public ListOfValueNamePairs_Group_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getListOfValueNamePairsAccess().getGroup_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ListOfValueNamePairs_ValueNamePairsAssignment_1_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ","
protected class ListOfValueNamePairs_CommaKeyword_1_0 extends KeywordToken  {
	
	public ListOfValueNamePairs_CommaKeyword_1_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getListOfValueNamePairsAccess().getCommaKeyword_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ListOfValueNamePairs_Group_1(lastRuleCallOrigin, this, 0, inst);
			case 1: return new ListOfValueNamePairs_ValueNamePairsAssignment_0(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// valueNamePairs+=ValueNamePair
protected class ListOfValueNamePairs_ValueNamePairsAssignment_1_1 extends AssignmentToken  {
	
	public ListOfValueNamePairs_ValueNamePairsAssignment_1_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getListOfValueNamePairsAccess().getValueNamePairsAssignment_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ValueNamePair_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("valueNamePairs",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("valueNamePairs");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getValueNamePairRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getListOfValueNamePairsAccess().getValueNamePairsValueNamePairParserRuleCall_1_1_0(); 
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
			case 0: return new ListOfValueNamePairs_CommaKeyword_1_0(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}



/************ end Rule ListOfValueNamePairs ****************/


/************ begin Rule ValueNamePair ****************
 *
 * ValueNamePair:
 * 	property=[uml::Property] "=" value=Expression;
 *
 **/

// property=[uml::Property] "=" value=Expression
protected class ValueNamePair_Group extends GroupToken {
	
	public ValueNamePair_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getValueNamePairAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ValueNamePair_ValueAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getValueNamePairRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// property=[uml::Property]
protected class ValueNamePair_PropertyAssignment_0 extends AssignmentToken  {
	
	public ValueNamePair_PropertyAssignment_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getValueNamePairAccess().getPropertyAssignment_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("property",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("property");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getValueNamePairAccess().getPropertyPropertyCrossReference_0_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getValueNamePairAccess().getPropertyPropertyCrossReference_0_0(); 
				return obj;
			}
		}
		return null;
	}

}

// "="
protected class ValueNamePair_EqualsSignKeyword_1 extends KeywordToken  {
	
	public ValueNamePair_EqualsSignKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getValueNamePairAccess().getEqualsSignKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ValueNamePair_PropertyAssignment_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// value=Expression
protected class ValueNamePair_ValueAssignment_2 extends AssignmentToken  {
	
	public ValueNamePair_ValueAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getValueNamePairAccess().getValueAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Expression_ExpAssignment(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("value",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("value");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getExpressionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getValueNamePairAccess().getValueExpressionParserRuleCall_2_0(); 
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
			case 0: return new ValueNamePair_EqualsSignKeyword_1(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}


/************ end Rule ValueNamePair ****************/


/************ begin Rule TimeExpression ****************
 *
 * TimeExpression:
 * 	InstantObsExpression | DurationObsExpression | JitterExp;
 *
 **/

// InstantObsExpression | DurationObsExpression | JitterExp
protected class TimeExpression_Alternatives extends AlternativesToken {

	public TimeExpression_Alternatives(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getTimeExpressionAccess().getAlternatives();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new TimeExpression_InstantObsExpressionParserRuleCall_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new TimeExpression_DurationObsExpressionParserRuleCall_1(lastRuleCallOrigin, this, 1, inst);
			case 2: return new TimeExpression_JitterExpParserRuleCall_2(lastRuleCallOrigin, this, 2, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getDurationObsExpressionRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getInstantObsExpressionRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getJitterExpRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// InstantObsExpression
protected class TimeExpression_InstantObsExpressionParserRuleCall_0 extends RuleCallToken {
	
	public TimeExpression_InstantObsExpressionParserRuleCall_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getTimeExpressionAccess().getInstantObsExpressionParserRuleCall_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new InstantObsExpression_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getInstantObsExpressionRule().getType().getClassifier())
			return null;
		if(checkForRecursion(InstantObsExpression_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// DurationObsExpression
protected class TimeExpression_DurationObsExpressionParserRuleCall_1 extends RuleCallToken {
	
	public TimeExpression_DurationObsExpressionParserRuleCall_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getTimeExpressionAccess().getDurationObsExpressionParserRuleCall_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new DurationObsExpression_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getDurationObsExpressionRule().getType().getClassifier())
			return null;
		if(checkForRecursion(DurationObsExpression_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// JitterExp
protected class TimeExpression_JitterExpParserRuleCall_2 extends RuleCallToken {
	
	public TimeExpression_JitterExpParserRuleCall_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getTimeExpressionAccess().getJitterExpParserRuleCall_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new JitterExp_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getJitterExpRule().getType().getClassifier())
			return null;
		if(checkForRecursion(JitterExp_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}


/************ end Rule TimeExpression ****************/


/************ begin Rule InstantObsExpression ****************
 *
 * InstantObsExpression:
 * 	"@" id=InstantObsName ("(" index=Expression ")")? ("when" "(" condition=Expression ")")?;
 *
 **/

// "@" id=InstantObsName ("(" index=Expression ")")? ("when" "(" condition=Expression ")")?
protected class InstantObsExpression_Group extends GroupToken {
	
	public InstantObsExpression_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getInstantObsExpressionAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new InstantObsExpression_Group_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new InstantObsExpression_Group_2(lastRuleCallOrigin, this, 1, inst);
			case 2: return new InstantObsExpression_IdAssignment_1(lastRuleCallOrigin, this, 2, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getInstantObsExpressionRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "@"
protected class InstantObsExpression_CommercialAtKeyword_0 extends KeywordToken  {
	
	public InstantObsExpression_CommercialAtKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getInstantObsExpressionAccess().getCommercialAtKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// id=InstantObsName
protected class InstantObsExpression_IdAssignment_1 extends AssignmentToken  {
	
	public InstantObsExpression_IdAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getInstantObsExpressionAccess().getIdAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new InstantObsName_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("id",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("id");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getInstantObsNameRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getInstantObsExpressionAccess().getIdInstantObsNameParserRuleCall_1_0(); 
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
			case 0: return new InstantObsExpression_CommercialAtKeyword_0(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ("(" index=Expression ")")?
protected class InstantObsExpression_Group_2 extends GroupToken {
	
	public InstantObsExpression_Group_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getInstantObsExpressionAccess().getGroup_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new InstantObsExpression_RightParenthesisKeyword_2_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "("
protected class InstantObsExpression_LeftParenthesisKeyword_2_0 extends KeywordToken  {
	
	public InstantObsExpression_LeftParenthesisKeyword_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getInstantObsExpressionAccess().getLeftParenthesisKeyword_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new InstantObsExpression_IdAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// index=Expression
protected class InstantObsExpression_IndexAssignment_2_1 extends AssignmentToken  {
	
	public InstantObsExpression_IndexAssignment_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getInstantObsExpressionAccess().getIndexAssignment_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Expression_ExpAssignment(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("index",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("index");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getExpressionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getInstantObsExpressionAccess().getIndexExpressionParserRuleCall_2_1_0(); 
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
			case 0: return new InstantObsExpression_LeftParenthesisKeyword_2_0(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ")"
protected class InstantObsExpression_RightParenthesisKeyword_2_2 extends KeywordToken  {
	
	public InstantObsExpression_RightParenthesisKeyword_2_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getInstantObsExpressionAccess().getRightParenthesisKeyword_2_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new InstantObsExpression_IndexAssignment_2_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ("when" "(" condition=Expression ")")?
protected class InstantObsExpression_Group_3 extends GroupToken {
	
	public InstantObsExpression_Group_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getInstantObsExpressionAccess().getGroup_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new InstantObsExpression_RightParenthesisKeyword_3_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "when"
protected class InstantObsExpression_WhenKeyword_3_0 extends KeywordToken  {
	
	public InstantObsExpression_WhenKeyword_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getInstantObsExpressionAccess().getWhenKeyword_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new InstantObsExpression_Group_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new InstantObsExpression_IdAssignment_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "("
protected class InstantObsExpression_LeftParenthesisKeyword_3_1 extends KeywordToken  {
	
	public InstantObsExpression_LeftParenthesisKeyword_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getInstantObsExpressionAccess().getLeftParenthesisKeyword_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new InstantObsExpression_WhenKeyword_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// condition=Expression
protected class InstantObsExpression_ConditionAssignment_3_2 extends AssignmentToken  {
	
	public InstantObsExpression_ConditionAssignment_3_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getInstantObsExpressionAccess().getConditionAssignment_3_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Expression_ExpAssignment(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("condition",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("condition");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getExpressionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getInstantObsExpressionAccess().getConditionExpressionParserRuleCall_3_2_0(); 
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
			case 0: return new InstantObsExpression_LeftParenthesisKeyword_3_1(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ")"
protected class InstantObsExpression_RightParenthesisKeyword_3_3 extends KeywordToken  {
	
	public InstantObsExpression_RightParenthesisKeyword_3_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getInstantObsExpressionAccess().getRightParenthesisKeyword_3_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new InstantObsExpression_ConditionAssignment_3_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}



/************ end Rule InstantObsExpression ****************/


/************ begin Rule InstantObsName ****************
 *
 * InstantObsName:
 * 	path=QualifiedName? instantId=[uml::TimeObservation];
 *
 **/

// path=QualifiedName? instantId=[uml::TimeObservation]
protected class InstantObsName_Group extends GroupToken {
	
	public InstantObsName_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getInstantObsNameAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new InstantObsName_InstantIdAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getInstantObsNameRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// path=QualifiedName?
protected class InstantObsName_PathAssignment_0 extends AssignmentToken  {
	
	public InstantObsName_PathAssignment_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getInstantObsNameAccess().getPathAssignment_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new QualifiedName_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("path",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("path");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getQualifiedNameRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getInstantObsNameAccess().getPathQualifiedNameParserRuleCall_0_0(); 
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

// instantId=[uml::TimeObservation]
protected class InstantObsName_InstantIdAssignment_1 extends AssignmentToken  {
	
	public InstantObsName_InstantIdAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getInstantObsNameAccess().getInstantIdAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new InstantObsName_PathAssignment_0(lastRuleCallOrigin, this, 0, inst);
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index - 1, inst);
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("instantId",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("instantId");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getInstantObsNameAccess().getInstantIdTimeObservationCrossReference_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getInstantObsNameAccess().getInstantIdTimeObservationCrossReference_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


/************ end Rule InstantObsName ****************/


/************ begin Rule DurationObsExpression ****************
 *
 * DurationObsExpression:
 * 	"&" id=DurationObsName ("(" index=Expression ")")? ("when" "(" condition=Expression ")")?;
 *
 **/

// "&" id=DurationObsName ("(" index=Expression ")")? ("when" "(" condition=Expression ")")?
protected class DurationObsExpression_Group extends GroupToken {
	
	public DurationObsExpression_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getDurationObsExpressionAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new DurationObsExpression_Group_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new DurationObsExpression_Group_2(lastRuleCallOrigin, this, 1, inst);
			case 2: return new DurationObsExpression_IdAssignment_1(lastRuleCallOrigin, this, 2, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getDurationObsExpressionRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "&"
protected class DurationObsExpression_AmpersandKeyword_0 extends KeywordToken  {
	
	public DurationObsExpression_AmpersandKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getDurationObsExpressionAccess().getAmpersandKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// id=DurationObsName
protected class DurationObsExpression_IdAssignment_1 extends AssignmentToken  {
	
	public DurationObsExpression_IdAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getDurationObsExpressionAccess().getIdAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new DurationObsName_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("id",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("id");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getDurationObsNameRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getDurationObsExpressionAccess().getIdDurationObsNameParserRuleCall_1_0(); 
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
			case 0: return new DurationObsExpression_AmpersandKeyword_0(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ("(" index=Expression ")")?
protected class DurationObsExpression_Group_2 extends GroupToken {
	
	public DurationObsExpression_Group_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getDurationObsExpressionAccess().getGroup_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new DurationObsExpression_RightParenthesisKeyword_2_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "("
protected class DurationObsExpression_LeftParenthesisKeyword_2_0 extends KeywordToken  {
	
	public DurationObsExpression_LeftParenthesisKeyword_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getDurationObsExpressionAccess().getLeftParenthesisKeyword_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new DurationObsExpression_IdAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// index=Expression
protected class DurationObsExpression_IndexAssignment_2_1 extends AssignmentToken  {
	
	public DurationObsExpression_IndexAssignment_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getDurationObsExpressionAccess().getIndexAssignment_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Expression_ExpAssignment(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("index",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("index");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getExpressionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getDurationObsExpressionAccess().getIndexExpressionParserRuleCall_2_1_0(); 
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
			case 0: return new DurationObsExpression_LeftParenthesisKeyword_2_0(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ")"
protected class DurationObsExpression_RightParenthesisKeyword_2_2 extends KeywordToken  {
	
	public DurationObsExpression_RightParenthesisKeyword_2_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getDurationObsExpressionAccess().getRightParenthesisKeyword_2_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new DurationObsExpression_IndexAssignment_2_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ("when" "(" condition=Expression ")")?
protected class DurationObsExpression_Group_3 extends GroupToken {
	
	public DurationObsExpression_Group_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getDurationObsExpressionAccess().getGroup_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new DurationObsExpression_RightParenthesisKeyword_3_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "when"
protected class DurationObsExpression_WhenKeyword_3_0 extends KeywordToken  {
	
	public DurationObsExpression_WhenKeyword_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getDurationObsExpressionAccess().getWhenKeyword_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new DurationObsExpression_Group_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new DurationObsExpression_IdAssignment_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "("
protected class DurationObsExpression_LeftParenthesisKeyword_3_1 extends KeywordToken  {
	
	public DurationObsExpression_LeftParenthesisKeyword_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getDurationObsExpressionAccess().getLeftParenthesisKeyword_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new DurationObsExpression_WhenKeyword_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// condition=Expression
protected class DurationObsExpression_ConditionAssignment_3_2 extends AssignmentToken  {
	
	public DurationObsExpression_ConditionAssignment_3_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getDurationObsExpressionAccess().getConditionAssignment_3_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Expression_ExpAssignment(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("condition",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("condition");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getExpressionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getDurationObsExpressionAccess().getConditionExpressionParserRuleCall_3_2_0(); 
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
			case 0: return new DurationObsExpression_LeftParenthesisKeyword_3_1(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ")"
protected class DurationObsExpression_RightParenthesisKeyword_3_3 extends KeywordToken  {
	
	public DurationObsExpression_RightParenthesisKeyword_3_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getDurationObsExpressionAccess().getRightParenthesisKeyword_3_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new DurationObsExpression_ConditionAssignment_3_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}



/************ end Rule DurationObsExpression ****************/


/************ begin Rule DurationObsName ****************
 *
 * DurationObsName:
 * 	path=QualifiedName? durationId=[uml::DurationObservation];
 *
 **/

// path=QualifiedName? durationId=[uml::DurationObservation]
protected class DurationObsName_Group extends GroupToken {
	
	public DurationObsName_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getDurationObsNameAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new DurationObsName_DurationIdAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getDurationObsNameRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// path=QualifiedName?
protected class DurationObsName_PathAssignment_0 extends AssignmentToken  {
	
	public DurationObsName_PathAssignment_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getDurationObsNameAccess().getPathAssignment_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new QualifiedName_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("path",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("path");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getQualifiedNameRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getDurationObsNameAccess().getPathQualifiedNameParserRuleCall_0_0(); 
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

// durationId=[uml::DurationObservation]
protected class DurationObsName_DurationIdAssignment_1 extends AssignmentToken  {
	
	public DurationObsName_DurationIdAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getDurationObsNameAccess().getDurationIdAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new DurationObsName_PathAssignment_0(lastRuleCallOrigin, this, 0, inst);
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index - 1, inst);
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("durationId",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("durationId");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getDurationObsNameAccess().getDurationIdDurationObservationCrossReference_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getDurationObsNameAccess().getDurationIdDurationObservationCrossReference_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


/************ end Rule DurationObsName ****************/


/************ begin Rule JitterExp ****************
 *
 * JitterExp:
 * 	"jitter(" firstInstant=InstantObsExpression ("-" secondInstant=InstantObsExpression)? ")";
 *
 **/

// "jitter(" firstInstant=InstantObsExpression ("-" secondInstant=InstantObsExpression)? ")"
protected class JitterExp_Group extends GroupToken {
	
	public JitterExp_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getJitterExpAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new JitterExp_RightParenthesisKeyword_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getJitterExpRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "jitter("
protected class JitterExp_JitterKeyword_0 extends KeywordToken  {
	
	public JitterExp_JitterKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getJitterExpAccess().getJitterKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// firstInstant=InstantObsExpression
protected class JitterExp_FirstInstantAssignment_1 extends AssignmentToken  {
	
	public JitterExp_FirstInstantAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getJitterExpAccess().getFirstInstantAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new InstantObsExpression_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("firstInstant",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("firstInstant");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getInstantObsExpressionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getJitterExpAccess().getFirstInstantInstantObsExpressionParserRuleCall_1_0(); 
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
			case 0: return new JitterExp_JitterKeyword_0(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ("-" secondInstant=InstantObsExpression)?
protected class JitterExp_Group_2 extends GroupToken {
	
	public JitterExp_Group_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getJitterExpAccess().getGroup_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new JitterExp_SecondInstantAssignment_2_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "-"
protected class JitterExp_HyphenMinusKeyword_2_0 extends KeywordToken  {
	
	public JitterExp_HyphenMinusKeyword_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getJitterExpAccess().getHyphenMinusKeyword_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new JitterExp_FirstInstantAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// secondInstant=InstantObsExpression
protected class JitterExp_SecondInstantAssignment_2_1 extends AssignmentToken  {
	
	public JitterExp_SecondInstantAssignment_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getJitterExpAccess().getSecondInstantAssignment_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new InstantObsExpression_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("secondInstant",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("secondInstant");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getInstantObsExpressionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getJitterExpAccess().getSecondInstantInstantObsExpressionParserRuleCall_2_1_0(); 
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
			case 0: return new JitterExp_HyphenMinusKeyword_2_0(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}


// ")"
protected class JitterExp_RightParenthesisKeyword_3 extends KeywordToken  {
	
	public JitterExp_RightParenthesisKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getJitterExpAccess().getRightParenthesisKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new JitterExp_Group_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new JitterExp_FirstInstantAssignment_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}


/************ end Rule JitterExp ****************/


/************ begin Rule VariableDeclaration ****************
 *
 * VariableDeclaration:
 * 	variableDeclaration=VariableDirectionKind? "$" name=ID (":" type=DataTypeName ("=" "(" initValue=Expression ")")? |
 * 	"=" "(" initValue=Expression ")");
 *
 **/

// variableDeclaration=VariableDirectionKind? "$" name=ID (":" type=DataTypeName ("=" "(" initValue=Expression ")")? | "="
// "(" initValue=Expression ")")
protected class VariableDeclaration_Group extends GroupToken {
	
	public VariableDeclaration_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getVariableDeclarationAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new VariableDeclaration_Alternatives_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getVariableDeclarationRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// variableDeclaration=VariableDirectionKind?
protected class VariableDeclaration_VariableDeclarationAssignment_0 extends AssignmentToken  {
	
	public VariableDeclaration_VariableDeclarationAssignment_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getVariableDeclarationAccess().getVariableDeclarationAssignment_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("variableDeclaration",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("variableDeclaration");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getVariableDeclarationAccess().getVariableDeclarationVariableDirectionKindParserRuleCall_0_0(), value, null)) {
			type = AssignmentType.DATATYPE_RULE_CALL;
			element = grammarAccess.getVariableDeclarationAccess().getVariableDeclarationVariableDirectionKindParserRuleCall_0_0();
			return obj;
		}
		return null;
	}

}

// "$"
protected class VariableDeclaration_DollarSignKeyword_1 extends KeywordToken  {
	
	public VariableDeclaration_DollarSignKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getVariableDeclarationAccess().getDollarSignKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new VariableDeclaration_VariableDeclarationAssignment_0(lastRuleCallOrigin, this, 0, inst);
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index - 1, inst);
		}	
	}

}

// name=ID
protected class VariableDeclaration_NameAssignment_2 extends AssignmentToken  {
	
	public VariableDeclaration_NameAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getVariableDeclarationAccess().getNameAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new VariableDeclaration_DollarSignKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_2_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_2_0();
			return obj;
		}
		return null;
	}

}

// ":" type=DataTypeName ("=" "(" initValue=Expression ")")? | "=" "(" initValue=Expression ")"
protected class VariableDeclaration_Alternatives_3 extends AlternativesToken {

	public VariableDeclaration_Alternatives_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getVariableDeclarationAccess().getAlternatives_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new VariableDeclaration_Group_3_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new VariableDeclaration_Group_3_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// ":" type=DataTypeName ("=" "(" initValue=Expression ")")?
protected class VariableDeclaration_Group_3_0 extends GroupToken {
	
	public VariableDeclaration_Group_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getVariableDeclarationAccess().getGroup_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new VariableDeclaration_Group_3_0_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new VariableDeclaration_TypeAssignment_3_0_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// ":"
protected class VariableDeclaration_ColonKeyword_3_0_0 extends KeywordToken  {
	
	public VariableDeclaration_ColonKeyword_3_0_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getVariableDeclarationAccess().getColonKeyword_3_0_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new VariableDeclaration_NameAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// type=DataTypeName
protected class VariableDeclaration_TypeAssignment_3_0_1 extends AssignmentToken  {
	
	public VariableDeclaration_TypeAssignment_3_0_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getVariableDeclarationAccess().getTypeAssignment_3_0_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new DataTypeName_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("type",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("type");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getDataTypeNameRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getVariableDeclarationAccess().getTypeDataTypeNameParserRuleCall_3_0_1_0(); 
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
			case 0: return new VariableDeclaration_ColonKeyword_3_0_0(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ("=" "(" initValue=Expression ")")?
protected class VariableDeclaration_Group_3_0_2 extends GroupToken {
	
	public VariableDeclaration_Group_3_0_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getVariableDeclarationAccess().getGroup_3_0_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new VariableDeclaration_RightParenthesisKeyword_3_0_2_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "="
protected class VariableDeclaration_EqualsSignKeyword_3_0_2_0 extends KeywordToken  {
	
	public VariableDeclaration_EqualsSignKeyword_3_0_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_3_0_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new VariableDeclaration_TypeAssignment_3_0_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "("
protected class VariableDeclaration_LeftParenthesisKeyword_3_0_2_1 extends KeywordToken  {
	
	public VariableDeclaration_LeftParenthesisKeyword_3_0_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getVariableDeclarationAccess().getLeftParenthesisKeyword_3_0_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new VariableDeclaration_EqualsSignKeyword_3_0_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// initValue=Expression
protected class VariableDeclaration_InitValueAssignment_3_0_2_2 extends AssignmentToken  {
	
	public VariableDeclaration_InitValueAssignment_3_0_2_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getVariableDeclarationAccess().getInitValueAssignment_3_0_2_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Expression_ExpAssignment(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("initValue",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("initValue");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getExpressionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getVariableDeclarationAccess().getInitValueExpressionParserRuleCall_3_0_2_2_0(); 
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
			case 0: return new VariableDeclaration_LeftParenthesisKeyword_3_0_2_1(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ")"
protected class VariableDeclaration_RightParenthesisKeyword_3_0_2_3 extends KeywordToken  {
	
	public VariableDeclaration_RightParenthesisKeyword_3_0_2_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getVariableDeclarationAccess().getRightParenthesisKeyword_3_0_2_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new VariableDeclaration_InitValueAssignment_3_0_2_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}



// "=" "(" initValue=Expression ")"
protected class VariableDeclaration_Group_3_1 extends GroupToken {
	
	public VariableDeclaration_Group_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getVariableDeclarationAccess().getGroup_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new VariableDeclaration_RightParenthesisKeyword_3_1_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "="
protected class VariableDeclaration_EqualsSignKeyword_3_1_0 extends KeywordToken  {
	
	public VariableDeclaration_EqualsSignKeyword_3_1_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_3_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new VariableDeclaration_NameAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "("
protected class VariableDeclaration_LeftParenthesisKeyword_3_1_1 extends KeywordToken  {
	
	public VariableDeclaration_LeftParenthesisKeyword_3_1_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getVariableDeclarationAccess().getLeftParenthesisKeyword_3_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new VariableDeclaration_EqualsSignKeyword_3_1_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// initValue=Expression
protected class VariableDeclaration_InitValueAssignment_3_1_2 extends AssignmentToken  {
	
	public VariableDeclaration_InitValueAssignment_3_1_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getVariableDeclarationAccess().getInitValueAssignment_3_1_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Expression_ExpAssignment(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("initValue",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("initValue");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getExpressionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getVariableDeclarationAccess().getInitValueExpressionParserRuleCall_3_1_2_0(); 
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
			case 0: return new VariableDeclaration_LeftParenthesisKeyword_3_1_1(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ")"
protected class VariableDeclaration_RightParenthesisKeyword_3_1_3 extends KeywordToken  {
	
	public VariableDeclaration_RightParenthesisKeyword_3_1_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getVariableDeclarationAccess().getRightParenthesisKeyword_3_1_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new VariableDeclaration_InitValueAssignment_3_1_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}




/************ end Rule VariableDeclaration ****************/



/************ begin Rule DataTypeName ****************
 *
 * DataTypeName:
 * 	path=QualifiedName? type=[uml::DataType];
 *
 **/

// path=QualifiedName? type=[uml::DataType]
protected class DataTypeName_Group extends GroupToken {
	
	public DataTypeName_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getDataTypeNameAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new DataTypeName_TypeAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getDataTypeNameRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// path=QualifiedName?
protected class DataTypeName_PathAssignment_0 extends AssignmentToken  {
	
	public DataTypeName_PathAssignment_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getDataTypeNameAccess().getPathAssignment_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new QualifiedName_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("path",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("path");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getQualifiedNameRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getDataTypeNameAccess().getPathQualifiedNameParserRuleCall_0_0(); 
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

// type=[uml::DataType]
protected class DataTypeName_TypeAssignment_1 extends AssignmentToken  {
	
	public DataTypeName_TypeAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getDataTypeNameAccess().getTypeAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new DataTypeName_PathAssignment_0(lastRuleCallOrigin, this, 0, inst);
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index - 1, inst);
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("type",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("type");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getDataTypeNameAccess().getTypeDataTypeCrossReference_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getDataTypeNameAccess().getTypeDataTypeCrossReference_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


/************ end Rule DataTypeName ****************/


/************ begin Rule NumberLiteralRule ****************
 *
 * //////////////////////////////////////////////////////////////////////////////////////////////////////
 * //LITERAL
 * //////////////////////////////////////////////////////////////////////////////////////////////////////
 * NumberLiteralRule:
 * 	IntegerLiteralRule | UnlimitedLiteralRule | RealLiteralRule;
 *
 **/

// IntegerLiteralRule | UnlimitedLiteralRule | RealLiteralRule
protected class NumberLiteralRule_Alternatives extends AlternativesToken {

	public NumberLiteralRule_Alternatives(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getNumberLiteralRuleAccess().getAlternatives();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new NumberLiteralRule_IntegerLiteralRuleParserRuleCall_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new NumberLiteralRule_UnlimitedLiteralRuleParserRuleCall_1(lastRuleCallOrigin, this, 1, inst);
			case 2: return new NumberLiteralRule_RealLiteralRuleParserRuleCall_2(lastRuleCallOrigin, this, 2, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getIntegerLiteralRuleRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getRealLiteralRuleRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getUnlimitedLiteralRuleRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// IntegerLiteralRule
protected class NumberLiteralRule_IntegerLiteralRuleParserRuleCall_0 extends RuleCallToken {
	
	public NumberLiteralRule_IntegerLiteralRuleParserRuleCall_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getNumberLiteralRuleAccess().getIntegerLiteralRuleParserRuleCall_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new IntegerLiteralRule_ValueAssignment(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getIntegerLiteralRuleRule().getType().getClassifier())
			return null;
		if(checkForRecursion(IntegerLiteralRule_ValueAssignment.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// UnlimitedLiteralRule
protected class NumberLiteralRule_UnlimitedLiteralRuleParserRuleCall_1 extends RuleCallToken {
	
	public NumberLiteralRule_UnlimitedLiteralRuleParserRuleCall_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getNumberLiteralRuleAccess().getUnlimitedLiteralRuleParserRuleCall_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new UnlimitedLiteralRule_ValueAssignment(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getUnlimitedLiteralRuleRule().getType().getClassifier())
			return null;
		if(checkForRecursion(UnlimitedLiteralRule_ValueAssignment.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// RealLiteralRule
protected class NumberLiteralRule_RealLiteralRuleParserRuleCall_2 extends RuleCallToken {
	
	public NumberLiteralRule_RealLiteralRuleParserRuleCall_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getNumberLiteralRuleAccess().getRealLiteralRuleParserRuleCall_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new RealLiteralRule_ValueAssignment(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getRealLiteralRuleRule().getType().getClassifier())
			return null;
		if(checkForRecursion(RealLiteralRule_ValueAssignment.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}


/************ end Rule NumberLiteralRule ****************/


/************ begin Rule IntegerLiteralRule ****************
 *
 * IntegerLiteralRule:
 * 	value=IntegerLiteral;
 *
 **/

// value=IntegerLiteral
protected class IntegerLiteralRule_ValueAssignment extends AssignmentToken  {
	
	public IntegerLiteralRule_ValueAssignment(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getIntegerLiteralRuleAccess().getValueAssignment();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getIntegerLiteralRuleRule().getType().getClassifier())
			return null;
		if((value = eObjectConsumer.getConsumable("value",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("value");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getIntegerLiteralRuleAccess().getValueIntegerLiteralTerminalRuleCall_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getIntegerLiteralRuleAccess().getValueIntegerLiteralTerminalRuleCall_0();
			return obj;
		}
		return null;
	}

}

/************ end Rule IntegerLiteralRule ****************/


/************ begin Rule UnlimitedLiteralRule ****************
 *
 * //UnlimitedLiteralRule :
 * //	value = UnlimitedLiteral ;
 * //terminal UnlimitedLiteral :
 * //	'*' ;
 * UnlimitedLiteralRule:
 * 	value="*";
 *
 **/

// value="*"
protected class UnlimitedLiteralRule_ValueAssignment extends AssignmentToken  {
	
	public UnlimitedLiteralRule_ValueAssignment(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getUnlimitedLiteralRuleAccess().getValueAssignment();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getUnlimitedLiteralRuleRule().getType().getClassifier())
			return null;
		if((value = eObjectConsumer.getConsumable("value",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("value");
		if(keywordSerializer.isValid(obj.getEObject(), grammarAccess.getUnlimitedLiteralRuleAccess().getValueAsteriskKeyword_0(), value, null)) {
			type = AssignmentType.KEYWORD;
			element = grammarAccess.getUnlimitedLiteralRuleAccess().getValueAsteriskKeyword_0();
			return obj;
		}
		return null;
	}

}

/************ end Rule UnlimitedLiteralRule ****************/


/************ begin Rule RealLiteralRule ****************
 *
 * RealLiteralRule:
 * 	value=RealLiteral;
 *
 **/

// value=RealLiteral
protected class RealLiteralRule_ValueAssignment extends AssignmentToken  {
	
	public RealLiteralRule_ValueAssignment(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getRealLiteralRuleAccess().getValueAssignment();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getRealLiteralRuleRule().getType().getClassifier())
			return null;
		if((value = eObjectConsumer.getConsumable("value",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("value");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getRealLiteralRuleAccess().getValueRealLiteralTerminalRuleCall_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getRealLiteralRuleAccess().getValueRealLiteralTerminalRuleCall_0();
			return obj;
		}
		return null;
	}

}

/************ end Rule RealLiteralRule ****************/


/************ begin Rule DateTimeLiteralRule ****************
 *
 * //DateTimeLiteral:
 * //	TimeString (DateString)? (DayString)? |
 * //	DateString (DayString)? |
 * //	DayString ;
 * //terminal DateString :
 * //	('0'..'9')('0'..'9')('0'..'9')('0'..'9')'/'('0'('0'..'9')|'1'('0'..'2'))'/'(('0'..'2')('0'..'9')|'3' ('0'|'1')) ;
 * //terminal TimeString :
 * //	(('0'..'1')('0'..'9')|'2'('0'..'3'))':'('0'..'5')('0'..'9')(':'('0'..'5')('0'..'9')(':'('0'..'9')('0'..'9'))?)? ;	
 * //terminal DayString :
 * //	"Mon" | "Tue" | "Wed" | "Thr" | "Fri" | "Sat" | "Sun" ;
 * DateTimeLiteralRule:
 * 	value=DateTimeLiteral;
 *
 **/

// value=DateTimeLiteral
protected class DateTimeLiteralRule_ValueAssignment extends AssignmentToken  {
	
	public DateTimeLiteralRule_ValueAssignment(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getDateTimeLiteralRuleAccess().getValueAssignment();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getDateTimeLiteralRuleRule().getType().getClassifier())
			return null;
		if((value = eObjectConsumer.getConsumable("value",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("value");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getDateTimeLiteralRuleAccess().getValueDateTimeLiteralTerminalRuleCall_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getDateTimeLiteralRuleAccess().getValueDateTimeLiteralTerminalRuleCall_0();
			return obj;
		}
		return null;
	}

}

/************ end Rule DateTimeLiteralRule ****************/


/************ begin Rule BooleanLiteralRule ****************
 *
 * BooleanLiteralRule:
 * 	value=BooleanLiteral;
 *
 **/

// value=BooleanLiteral
protected class BooleanLiteralRule_ValueAssignment extends AssignmentToken  {
	
	public BooleanLiteralRule_ValueAssignment(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getBooleanLiteralRuleAccess().getValueAssignment();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getBooleanLiteralRuleRule().getType().getClassifier())
			return null;
		if((value = eObjectConsumer.getConsumable("value",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("value");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getBooleanLiteralRuleAccess().getValueBooleanLiteralTerminalRuleCall_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getBooleanLiteralRuleAccess().getValueBooleanLiteralTerminalRuleCall_0();
			return obj;
		}
		return null;
	}

}

/************ end Rule BooleanLiteralRule ****************/


/************ begin Rule NullLiteralRule ****************
 *
 * NullLiteralRule:
 * 	value=NullLiteral;
 *
 **/

// value=NullLiteral
protected class NullLiteralRule_ValueAssignment extends AssignmentToken  {
	
	public NullLiteralRule_ValueAssignment(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getNullLiteralRuleAccess().getValueAssignment();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getNullLiteralRuleRule().getType().getClassifier())
			return null;
		if((value = eObjectConsumer.getConsumable("value",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("value");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getNullLiteralRuleAccess().getValueNullLiteralTerminalRuleCall_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getNullLiteralRuleAccess().getValueNullLiteralTerminalRuleCall_0();
			return obj;
		}
		return null;
	}

}

/************ end Rule NullLiteralRule ****************/


/************ begin Rule DefaultLiteralRule ****************
 *
 * //DefaultLiteralRule :
 * //	value = DefaultLiteral ;
 * //terminal DefaultLiteral : 
 * //	'/' ;
 * DefaultLiteralRule:
 * 	value="/";
 *
 **/

// value="/"
protected class DefaultLiteralRule_ValueAssignment extends AssignmentToken  {
	
	public DefaultLiteralRule_ValueAssignment(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getDefaultLiteralRuleAccess().getValueAssignment();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getDefaultLiteralRuleRule().getType().getClassifier())
			return null;
		if((value = eObjectConsumer.getConsumable("value",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("value");
		if(keywordSerializer.isValid(obj.getEObject(), grammarAccess.getDefaultLiteralRuleAccess().getValueSolidusKeyword_0(), value, null)) {
			type = AssignmentType.KEYWORD;
			element = grammarAccess.getDefaultLiteralRuleAccess().getValueSolidusKeyword_0();
			return obj;
		}
		return null;
	}

}

/************ end Rule DefaultLiteralRule ****************/


/************ begin Rule StringLiteralRule ****************
 *
 * StringLiteralRule:
 * 	value=STRING;
 *
 **/

// value=STRING
protected class StringLiteralRule_ValueAssignment extends AssignmentToken  {
	
	public StringLiteralRule_ValueAssignment(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getStringLiteralRuleAccess().getValueAssignment();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getStringLiteralRuleRule().getType().getClassifier())
			return null;
		if((value = eObjectConsumer.getConsumable("value",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("value");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getStringLiteralRuleAccess().getValueSTRINGTerminalRuleCall_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getStringLiteralRuleAccess().getValueSTRINGTerminalRuleCall_0();
			return obj;
		}
		return null;
	}

}

/************ end Rule StringLiteralRule ****************/

}
