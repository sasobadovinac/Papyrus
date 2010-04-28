/*****************************************************************************
 * Copyright (c) 2009 Atos Origin.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Atos Origin - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.diagram.sequence.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.diagram.common.parser.CommentParser;
import org.eclipse.papyrus.diagram.sequence.edit.parts.CommentBodyEditPart;
import org.eclipse.papyrus.diagram.sequence.edit.parts.ConstraintNameEditPart;
import org.eclipse.papyrus.diagram.sequence.edit.parts.ContinuationNameEditPart;
import org.eclipse.papyrus.diagram.sequence.edit.parts.DurationConstraintInMessageEditPart;
import org.eclipse.papyrus.diagram.sequence.edit.parts.DurationConstraintLabelEditPart;
import org.eclipse.papyrus.diagram.sequence.edit.parts.DurationObservationEditPart;
import org.eclipse.papyrus.diagram.sequence.edit.parts.InteractionNameEditPart;
import org.eclipse.papyrus.diagram.sequence.edit.parts.InteractionUseName2EditPart;
import org.eclipse.papyrus.diagram.sequence.edit.parts.InteractionUseNameEditPart;
import org.eclipse.papyrus.diagram.sequence.edit.parts.LifelineNameEditPart;
import org.eclipse.papyrus.diagram.sequence.edit.parts.MessageName2EditPart;
import org.eclipse.papyrus.diagram.sequence.edit.parts.MessageName3EditPart;
import org.eclipse.papyrus.diagram.sequence.edit.parts.MessageName4EditPart;
import org.eclipse.papyrus.diagram.sequence.edit.parts.MessageName5EditPart;
import org.eclipse.papyrus.diagram.sequence.edit.parts.MessageName6EditPart;
import org.eclipse.papyrus.diagram.sequence.edit.parts.MessageName7EditPart;
import org.eclipse.papyrus.diagram.sequence.edit.parts.MessageNameEditPart;
import org.eclipse.papyrus.diagram.sequence.edit.parts.StateInvariantNameEditPart;
import org.eclipse.papyrus.diagram.sequence.edit.parts.TimeConstraintLabelEditPart;
import org.eclipse.papyrus.diagram.sequence.edit.parts.TimeObservationLabelEditPart;
import org.eclipse.papyrus.diagram.sequence.parser.custom.DurationObservationParser;
import org.eclipse.papyrus.diagram.sequence.parser.custom.InteractionUseCustomParsers;
import org.eclipse.papyrus.diagram.sequence.parser.custom.LifelineCustomParsers;
import org.eclipse.papyrus.diagram.sequence.parser.custom.MessageCustomParser;
import org.eclipse.papyrus.diagram.sequence.parser.custom.TimeConstraintParser;
import org.eclipse.papyrus.diagram.sequence.parser.custom.TimeObservationParser;
import org.eclipse.papyrus.diagram.sequence.parsers.MessageFormatParser;
import org.eclipse.papyrus.diagram.sequence.part.UMLVisualIDRegistry;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class UMLParserProvider extends AbstractProvider implements IParserProvider {

	/**
	 * @generated
	 */
	private IParser interactionName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getInteractionName_5001Parser() {
		if(interactionName_5001Parser == null) {
			EAttribute[] features = new EAttribute[]{ UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("sd: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			interactionName_5001Parser = parser;
		}
		return interactionName_5001Parser;
	}

	/**
	 * @generated
	 */
	private LifelineCustomParsers lifelineName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getLifelineName_5002Parser() {
		if(lifelineName_5002Parser == null) {
			lifelineName_5002Parser = new LifelineCustomParsers();
		}
		return lifelineName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser stateInvariantName_5008Parser;

	/**
	 * @generated
	 */
	private IParser getStateInvariantName_5008Parser() {
		if(stateInvariantName_5008Parser == null) {
			EAttribute[] features = new EAttribute[]{ UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			stateInvariantName_5008Parser = parser;
		}
		return stateInvariantName_5008Parser;
	}

	/**
	 * @generated
	 */
	private TimeConstraintParser timeConstraintLabel_5009Parser;

	/**
	 * @generated
	 */
	private IParser getTimeConstraintLabel_5009Parser() {
		if(timeConstraintLabel_5009Parser == null) {
			timeConstraintLabel_5009Parser = new TimeConstraintParser();
		}
		return timeConstraintLabel_5009Parser;
	}

	/**
	 * @generated
	 */
	private TimeObservationParser timeObservationLabel_5010Parser;

	/**
	 * @generated
	 */
	private IParser getTimeObservationLabel_5010Parser() {
		if(timeObservationLabel_5010Parser == null) {
			timeObservationLabel_5010Parser = new TimeObservationParser();
		}
		return timeObservationLabel_5010Parser;
	}

	/**
	 * @generated
	 */
	private TimeConstraintParser durationConstraintLabel_5011Parser;

	/**
	 * @generated
	 */
	private IParser getDurationConstraintLabel_5011Parser() {
		if(durationConstraintLabel_5011Parser == null) {
			durationConstraintLabel_5011Parser = new TimeConstraintParser();
		}
		return durationConstraintLabel_5011Parser;
	}

	/**
	 * @generated
	 */
	private IParser interactionUseName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getInteractionUseName_5003Parser() {
		if(interactionUseName_5003Parser == null) {
			EAttribute[] features = new EAttribute[]{ UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Ref"); //$NON-NLS-1$
			parser.setEditorPattern("Ref"); //$NON-NLS-1$
			parser.setEditPattern("Ref"); //$NON-NLS-1$
			interactionUseName_5003Parser = parser;
		}
		return interactionUseName_5003Parser;
	}

	/**
	 * @generated
	 */
	private InteractionUseCustomParsers interactionUseName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getInteractionUseName_5004Parser() {
		if(interactionUseName_5004Parser == null) {
			interactionUseName_5004Parser = new InteractionUseCustomParsers();
		}
		return interactionUseName_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser continuationName_5007Parser;

	/**
	 * @generated
	 */
	private IParser getContinuationName_5007Parser() {
		if(continuationName_5007Parser == null) {
			EAttribute[] features = new EAttribute[]{ UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			continuationName_5007Parser = parser;
		}
		return continuationName_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser constraintName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getConstraintName_5005Parser() {
		if(constraintName_5005Parser == null) {
			EAttribute[] features = new EAttribute[]{ UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			constraintName_5005Parser = parser;
		}
		return constraintName_5005Parser;
	}

	/**
	 * @generated
	 */
	private CommentParser commentBody_5006Parser;

	/**
	 * @generated
	 */
	private IParser getCommentBody_5006Parser() {
		if(commentBody_5006Parser == null) {
			commentBody_5006Parser = new CommentParser();
		}
		return commentBody_5006Parser;
	}

	/**
	 * @generated
	 */
	private TimeConstraintParser durationConstraint_3023Parser;

	/**
	 * @generated
	 */
	private IParser getDurationConstraint_3023Parser() {
		if(durationConstraint_3023Parser == null) {
			durationConstraint_3023Parser = new TimeConstraintParser();
		}
		return durationConstraint_3023Parser;
	}

	/**
	 * @generated
	 */
	private DurationObservationParser durationObservation_3024Parser;

	/**
	 * @generated
	 */
	private IParser getDurationObservation_3024Parser() {
		if(durationObservation_3024Parser == null) {
			durationObservation_3024Parser = new DurationObservationParser();
		}
		return durationObservation_3024Parser;
	}

	/**
	 * @generated
	 */
	private MessageCustomParser messageName_6001Parser;

	/**
	 * @generated
	 */
	private IParser getMessageName_6001Parser() {
		if(messageName_6001Parser == null) {
			messageName_6001Parser = new MessageCustomParser();
		}
		return messageName_6001Parser;
	}

	/**
	 * @generated
	 */
	private MessageCustomParser messageName_6002Parser;

	/**
	 * @generated
	 */
	private IParser getMessageName_6002Parser() {
		if(messageName_6002Parser == null) {
			messageName_6002Parser = new MessageCustomParser();
		}
		return messageName_6002Parser;
	}

	/**
	 * @generated
	 */
	private MessageCustomParser messageName_6003Parser;

	/**
	 * @generated
	 */
	private IParser getMessageName_6003Parser() {
		if(messageName_6003Parser == null) {
			messageName_6003Parser = new MessageCustomParser();
		}
		return messageName_6003Parser;
	}

	/**
	 * @generated
	 */
	private MessageCustomParser messageName_6004Parser;

	/**
	 * @generated
	 */
	private IParser getMessageName_6004Parser() {
		if(messageName_6004Parser == null) {
			messageName_6004Parser = new MessageCustomParser();
		}
		return messageName_6004Parser;
	}

	/**
	 * @generated
	 */
	private MessageCustomParser messageName_6005Parser;

	/**
	 * @generated
	 */
	private IParser getMessageName_6005Parser() {
		if(messageName_6005Parser == null) {
			messageName_6005Parser = new MessageCustomParser();
		}
		return messageName_6005Parser;
	}

	/**
	 * @generated
	 */
	private MessageCustomParser messageName_6006Parser;

	/**
	 * @generated
	 */
	private IParser getMessageName_6006Parser() {
		if(messageName_6006Parser == null) {
			messageName_6006Parser = new MessageCustomParser();
		}
		return messageName_6006Parser;
	}

	/**
	 * @generated
	 */
	private MessageCustomParser messageName_6007Parser;

	/**
	 * @generated
	 */
	private IParser getMessageName_6007Parser() {
		if(messageName_6007Parser == null) {
			messageName_6007Parser = new MessageCustomParser();
		}
		return messageName_6007Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch(visualID) {
		case InteractionNameEditPart.VISUAL_ID:
			return getInteractionName_5001Parser();
		case InteractionUseNameEditPart.VISUAL_ID:
			return getInteractionUseName_5003Parser();
		case InteractionUseName2EditPart.VISUAL_ID:
			return getInteractionUseName_5004Parser();
		case ContinuationNameEditPart.VISUAL_ID:
			return getContinuationName_5007Parser();
		case LifelineNameEditPart.VISUAL_ID:
			return getLifelineName_5002Parser();
		case StateInvariantNameEditPart.VISUAL_ID:
			return getStateInvariantName_5008Parser();
		case TimeConstraintLabelEditPart.VISUAL_ID:
			return getTimeConstraintLabel_5009Parser();
		case TimeObservationLabelEditPart.VISUAL_ID:
			return getTimeObservationLabel_5010Parser();
		case DurationConstraintLabelEditPart.VISUAL_ID:
			return getDurationConstraintLabel_5011Parser();
		case ConstraintNameEditPart.VISUAL_ID:
			return getConstraintName_5005Parser();
		case CommentBodyEditPart.VISUAL_ID:
			return getCommentBody_5006Parser();
		case DurationConstraintInMessageEditPart.VISUAL_ID:
			return getDurationConstraint_3023Parser();
		case DurationObservationEditPart.VISUAL_ID:
			return getDurationObservation_3024Parser();
		case MessageNameEditPart.VISUAL_ID:
			return getMessageName_6001Parser();
		case MessageName2EditPart.VISUAL_ID:
			return getMessageName_6002Parser();
		case MessageName3EditPart.VISUAL_ID:
			return getMessageName_6003Parser();
		case MessageName4EditPart.VISUAL_ID:
			return getMessageName_6004Parser();
		case MessageName5EditPart.VISUAL_ID:
			return getMessageName_6005Parser();
		case MessageName6EditPart.VISUAL_ID:
			return getMessageName_6006Parser();
		case MessageName7EditPart.VISUAL_ID:
			return getMessageName_6007Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * 
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String)hint.getAdapter(String.class);
		if(vid != null) {
			return getParser(UMLVisualIDRegistry.getVisualID(vid));
		}
		View view = (View)hint.getAdapter(View.class);
		if(view != null) {
			return getParser(UMLVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if(operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation)operation).getHint();
			if(UMLElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if(IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
