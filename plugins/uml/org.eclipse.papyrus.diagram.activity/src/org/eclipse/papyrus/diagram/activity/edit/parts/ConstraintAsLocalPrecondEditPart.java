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
package org.eclipse.papyrus.diagram.activity.edit.parts;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.papyrus.diagram.activity.edit.policies.ConstraintAsLocalPrecondItemSemanticEditPolicy;
import org.eclipse.papyrus.diagram.activity.edit.policies.OpenDiagramEditPolicy;
import org.eclipse.papyrus.diagram.activity.figures.WrappedLabel;
import org.eclipse.papyrus.diagram.activity.part.UMLVisualIDRegistry;
import org.eclipse.papyrus.diagram.activity.providers.UMLElementTypes;
import org.eclipse.papyrus.diagram.common.figure.node.CornerBentFigure;
import org.eclipse.papyrus.preferences.utils.GradientPreferenceConverter;
import org.eclipse.papyrus.preferences.utils.PreferenceConstantHelper;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class ConstraintAsLocalPrecondEditPart extends

ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3011;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public ConstraintAsLocalPrecondEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new ConstraintAsLocalPrecondItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(EditPolicyRoles.OPEN_ROLE, new OpenDiagramEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if(result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		CornerBentWithTextFigure figure = new CornerBentWithTextFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public CornerBentWithTextFigure getPrimaryShape() {
		return (CornerBentWithTextFigure)primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if(childEditPart instanceof ConstraintAsLocalPrecondNameEditPart) {
			((ConstraintAsLocalPrecondNameEditPart)childEditPart).setLabel(getPrimaryShape().getCornerBentContent());
			return true;
		}


		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if(childEditPart instanceof ConstraintAsLocalPrecondNameEditPart) {
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if(addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if(removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * 
	 * @param nodeShape
	 *        instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if(nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if(contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if(primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if(primaryShape instanceof Shape) {
			((Shape)primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if(primaryShape instanceof Shape) {
			((Shape)primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(UMLVisualIDRegistry.getType(ConstraintAsLocalPrecondNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List/* <org.eclipse.gmf.runtime.emf.type.core.IElementType> */getMARelTypesOnTarget() {
		List/* <org.eclipse.gmf.runtime.emf.type.core.IElementType> */types = new ArrayList/* <org.eclipse.gmf.runtime.emf.type.core.IElementType> */();
		types.add(UMLElementTypes.ActionLocalPrecondition_4001);
		types.add(UMLElementTypes.ActionLocalPostcondition_4002);
		return types;
	}

	/**
	 * @generated
	 */
	public List/* <org.eclipse.gmf.runtime.emf.type.core.IElementType> */getMATypesForSource(IElementType relationshipType) {
		List/* <org.eclipse.gmf.runtime.emf.type.core.IElementType> */types = new ArrayList/* <org.eclipse.gmf.runtime.emf.type.core.IElementType> */();
		if(relationshipType == UMLElementTypes.ActionLocalPrecondition_4001) {
			types.add(UMLElementTypes.OpaqueAction_3007);
		}
		if(relationshipType == UMLElementTypes.ActionLocalPrecondition_4001) {
			types.add(UMLElementTypes.CallBehaviorAction_3008);
		}
		if(relationshipType == UMLElementTypes.ActionLocalPrecondition_4001) {
			types.add(UMLElementTypes.CallOperationAction_3010);
		}
		if(relationshipType == UMLElementTypes.ActionLocalPrecondition_4001) {
			types.add(UMLElementTypes.SendObjectAction_3042);
		}
		if(relationshipType == UMLElementTypes.ActionLocalPrecondition_4001) {
			types.add(UMLElementTypes.SendSignalAction_3052);
		}
		if(relationshipType == UMLElementTypes.ActionLocalPrecondition_4001) {
			types.add(UMLElementTypes.AcceptEventAction_3063);
		}
		if(relationshipType == UMLElementTypes.ActionLocalPrecondition_4001) {
			types.add(UMLElementTypes.ConditionalNode_3069);
		}
		if(relationshipType == UMLElementTypes.ActionLocalPrecondition_4001) {
			types.add(UMLElementTypes.ExpansionRegion_3070);
		}
		if(relationshipType == UMLElementTypes.ActionLocalPrecondition_4001) {
			types.add(UMLElementTypes.LoopNode_3071);
		}
		if(relationshipType == UMLElementTypes.ActionLocalPrecondition_4001) {
			types.add(UMLElementTypes.SequenceNode_3073);
		}
		if(relationshipType == UMLElementTypes.ActionLocalPrecondition_4001) {
			types.add(UMLElementTypes.StructuredActivityNode_3065);
		}
		if(relationshipType == UMLElementTypes.ActionLocalPrecondition_4001) {
			types.add(UMLElementTypes.ValueSpecificationAction_3076);
		}
		if(relationshipType == UMLElementTypes.ActionLocalPostcondition_4002) {
			types.add(UMLElementTypes.OpaqueAction_3007);
		}
		if(relationshipType == UMLElementTypes.ActionLocalPostcondition_4002) {
			types.add(UMLElementTypes.CallBehaviorAction_3008);
		}
		if(relationshipType == UMLElementTypes.ActionLocalPostcondition_4002) {
			types.add(UMLElementTypes.CallOperationAction_3010);
		}
		if(relationshipType == UMLElementTypes.ActionLocalPostcondition_4002) {
			types.add(UMLElementTypes.SendObjectAction_3042);
		}
		if(relationshipType == UMLElementTypes.ActionLocalPostcondition_4002) {
			types.add(UMLElementTypes.SendSignalAction_3052);
		}
		if(relationshipType == UMLElementTypes.ActionLocalPostcondition_4002) {
			types.add(UMLElementTypes.AcceptEventAction_3063);
		}
		if(relationshipType == UMLElementTypes.ActionLocalPostcondition_4002) {
			types.add(UMLElementTypes.ConditionalNode_3069);
		}
		if(relationshipType == UMLElementTypes.ActionLocalPostcondition_4002) {
			types.add(UMLElementTypes.ExpansionRegion_3070);
		}
		if(relationshipType == UMLElementTypes.ActionLocalPostcondition_4002) {
			types.add(UMLElementTypes.LoopNode_3071);
		}
		if(relationshipType == UMLElementTypes.ActionLocalPostcondition_4002) {
			types.add(UMLElementTypes.SequenceNode_3073);
		}
		if(relationshipType == UMLElementTypes.ActionLocalPostcondition_4002) {
			types.add(UMLElementTypes.StructuredActivityNode_3065);
		}
		if(relationshipType == UMLElementTypes.ActionLocalPostcondition_4002) {
			types.add(UMLElementTypes.ValueSpecificationAction_3076);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class CornerBentWithTextFigure extends CornerBentFigure {

		/**
		 * @generated
		 */
		private WrappedLabel fCornerBentContent;

		/**
		 * @generated
		 */
		public CornerBentWithTextFigure() {


			this.setBackgroundColor(THIS_BACK);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {


			fCornerBentContent = new WrappedLabel();



			this.add(fCornerBentContent);


		}

		/**
		 * @generated
		 */
		private boolean myUseLocalCoordinates = false;

		/**
		 * @generated
		 */
		protected boolean useLocalCoordinates() {
			return myUseLocalCoordinates;
		}

		/**
		 * @generated
		 */
		protected void setUseLocalCoordinates(boolean useLocalCoordinates) {
			myUseLocalCoordinates = useLocalCoordinates;
		}

		/**
		 * @generated
		 */
		public WrappedLabel getCornerBentContent() {
			return fCornerBentContent;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_BACK = new Color(null, 248, 249, 214);

	/**
	 * @generated
	 */
	@Override
	public Object getPreferredValue(EStructuralFeature feature) {
		IPreferenceStore preferenceStore = (IPreferenceStore)getDiagramPreferencesHint().getPreferenceStore();
		Object result = null;

		if(feature == NotationPackage.eINSTANCE.getLineStyle_LineColor() || feature == NotationPackage.eINSTANCE.getFontStyle_FontColor() || feature == NotationPackage.eINSTANCE.getFillStyle_FillColor()) {
			String prefColor = null;
			if(feature == NotationPackage.eINSTANCE.getLineStyle_LineColor()) {
				prefColor = PreferenceConstantHelper.getElementConstant("Constraint", PreferenceConstantHelper.COLOR_LINE);
			} else if(feature == NotationPackage.eINSTANCE.getFontStyle_FontColor()) {
				prefColor = PreferenceConstantHelper.getElementConstant("Constraint", PreferenceConstantHelper.COLOR_FONT);
			} else if(feature == NotationPackage.eINSTANCE.getFillStyle_FillColor()) {
				prefColor = PreferenceConstantHelper.getElementConstant("Constraint", PreferenceConstantHelper.COLOR_FILL);
			}
			result = FigureUtilities.RGBToInteger(PreferenceConverter.getColor((IPreferenceStore)preferenceStore, prefColor));
		} else if(feature == NotationPackage.eINSTANCE.getFillStyle_Transparency() || feature == NotationPackage.eINSTANCE.getFillStyle_Gradient()) {
			String prefGradient = PreferenceConstantHelper.getElementConstant("Constraint", PreferenceConstantHelper.COLOR_GRADIENT);
			GradientPreferenceConverter gradientPreferenceConverter = new GradientPreferenceConverter(preferenceStore.getString(prefGradient));
			if(feature == NotationPackage.eINSTANCE.getFillStyle_Transparency()) {
				result = new Integer(gradientPreferenceConverter.getTransparency());
			} else if(feature == NotationPackage.eINSTANCE.getFillStyle_Gradient()) {
				result = gradientPreferenceConverter.getGradientData();
			}
		}

		if(result == null) {
			result = getStructuralFeatureValue(feature);
		}
		return result;
	}
}
