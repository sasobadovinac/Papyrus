package org.eclipse.papyrus.diagram.statemachine.custom.edit.part;

import java.util.Collections;
import java.util.Iterator;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.transaction.Transaction;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramUIMessages;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.diagram.common.commands.SemanticAdapter;
import org.eclipse.papyrus.diagram.common.figure.node.StereotypePropertiesCompartment;
import org.eclipse.papyrus.diagram.statemachine.custom.commands.CustomStateResizeCommand;
import org.eclipse.papyrus.diagram.statemachine.custom.figures.StateFigure;
import org.eclipse.papyrus.diagram.statemachine.custom.helpers.Zone;
import org.eclipse.papyrus.diagram.statemachine.edit.parts.StateEditPart;
import org.eclipse.papyrus.diagram.statemachine.edit.parts.StateNameEditPart;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.OpaqueBehavior;
import org.eclipse.uml2.uml.State;
import org.eclipse.uml2.uml.StateMachine;

public class CustomStateNameEditPart extends StateNameEditPart {

	public CustomStateNameEditPart(View view) {
		super(view);
		// TODO Auto-generated constructor stub
	}

	private String behaviorKindAsString(Behavior b) {
		if(b instanceof Activity)
			return "Activity";
		if(b instanceof StateMachine)
			return "StateMachine";
		if(b instanceof OpaqueBehavior)
			return "OpaqueBehavior";
		return "";
	}

	@Override
	protected void createDefaultEditPolicies() {
		// TODO Auto-generated method stub
		super.createDefaultEditPolicies();
		removeEditPolicy(EditPolicyRoles.CONNECTION_HANDLES_ROLE);
		removeEditPolicy(EditPolicyRoles.POPUPBAR_ROLE);

	}

	public String getInformationFromState(State state) {
		String textToEdit = "";

		// entryActivity
		if(state.getEntry() != null) {
			String kind = behaviorKindAsString(state.getEntry());
			textToEdit = "/entry " + kind + " " + state.getEntry().getName();
		}

		// doActivity
		if(state.getDoActivity() != null) {
			String kind = behaviorKindAsString(state.getDoActivity());
			textToEdit = textToEdit + "\n/do " + kind + " " + state.getDoActivity().getName();
		}

		// exitActivity
		if(state.getExit() != null) {
			String kind = behaviorKindAsString(state.getExit());
			textToEdit = textToEdit + "\n/exit " + kind + " " + state.getExit().getName();
		}

		textToEdit += "\n";
		return textToEdit;
	}

	@Override
	protected void handleNotificationEvent(Notification notification) {
		// TODO Auto-generated method stub
		super.handleNotificationEvent(notification);

		refreshVisuals();
	}

	@Override
	protected void refreshVisuals() {
		// TODO Auto-generated method stub
		super.refreshVisuals();

		StateFigure stateFigure = ((StateEditPart)getParent()).getPrimaryShape();
		State state = (State)((View)getModel()).getElement();

		View stateLabelView = (View)getModel();
		View stateView = (View)stateLabelView.eContainer();
		View stateCompartView = (View)stateView.getChildren().get(1);

		if(stateCompartView.getChildren().isEmpty())
			stateFigure.getStateCompartmentFigure().setVisible(false);
		else
			stateFigure.getStateCompartmentFigure().setVisible(true);

		stateFigure.fillInformation(getInformationFromState(state));

		if(state.isSubmachineState()) {
			stateFigure.setSubmachineStateName(state.getName() + " : " + state.getSubmachine().getQualifiedName());
			stateFigure.setIsSubmachineState(true);
		} else
			stateFigure.setIsSubmachineState(false);


		int height = 0;
		int width = 0;
		Iterator<IFigure> it = (Iterator<IFigure>)getFigure().getParent().getChildren().iterator();
		while(it.hasNext()) {
			IFigure current = it.next();
			if((current instanceof Label) || (current instanceof WrappingLabel) || (current instanceof StereotypePropertiesCompartment)) {
				Dimension d = current.getPreferredSize().getCopy();
				height += d.height;
				width = Math.max(width, d.width);
			}
		}

		width += 10;

		int stateHeight = Zone.getHeight(stateView);
		int stateWidth = Zone.getWidth(stateView);

		int stateCompartHeight = Zone.getHeight(stateCompartView);

		int dx = width - stateWidth;
		int dy = stateCompartHeight + height - stateHeight;
		int x = Zone.getX(stateView);
		int y = Zone.getY(stateView);


		if((stateHeight != -1) && (width != 0) && (dy != 0)) {
			dx = (dx > 0) ? dx : 0;
			// a resize request, which we route to the specific ResizeCommand
			IAdaptable adaptableForState = new SemanticAdapter(null, stateView);
			ChangeBoundsRequest internalResizeRequest = new ChangeBoundsRequest();
			internalResizeRequest.setResizeDirection(PositionConstants.EAST);
			internalResizeRequest.setSizeDelta(new Dimension(dx, dy));
			Rectangle rect = new Rectangle(x, y, stateWidth + dx, stateHeight + dy);

			CustomStateResizeCommand internalResizeCommand = new CustomStateResizeCommand(adaptableForState, getDiagramPreferencesHint(), getEditingDomain(), DiagramUIMessages.CreateCommand_Label, internalResizeRequest, rect, true);
			internalResizeCommand.setOptions(Collections.singletonMap(Transaction.OPTION_UNPROTECTED, Boolean.TRUE));

			try {
				internalResizeCommand.execute(null, null);
			} catch (ExecutionException e) {
			}

		}


	}
}
