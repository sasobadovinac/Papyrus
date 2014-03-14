/*****************************************************************************
 * Copyright (c) 2012 CEA LIST.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.dnd.strategy.constraint;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.papyrus.infra.gmfdiag.dnd.strategy.TransactionalDropStrategy;
import org.eclipse.papyrus.uml.diagram.common.service.AspectUnspecifiedTypeConnectionTool.CreateAspectUnspecifiedTypeConnectionRequest;
import org.eclipse.papyrus.uml.diagram.dnd.Activator;
import org.eclipse.swt.graphics.Image;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * A strategy to drop a Classifier on an InstanceSpecification. The instance
 * specification will be typed by the dropped classifiers, and a dialog will
 * be opened for the user to select the slots to create in the
 * InstanceSpecification.
 * 
 * The slots will correspond to the classifier's property.
 * 
 * @author Camille Letavernier
 * 
 */
public class ClassifierToConstraintDropStrategy extends TransactionalDropStrategy {

	protected static final EStructuralFeature constraintContext_feature = UMLPackage.eINSTANCE.getConstraint_Context();

	public String getLabel() {
		return "Set constraint context";
	}

	public String getID() {
		return Activator.PLUGIN_ID + ".constraintContext";
	}

	public String getCategoryID() {
		return getID();
	}

	public String getCategoryLabel() {
		return "Sets the dropped classifier as context of the target constraint.";
	}
	
	public String getDescription() {
		return getCategoryLabel();
	}

	public Image getImage() {
		return null;
	}

	public int getPriority() {
		return 0;
	}

	public void setOptions(Map<String, Object> options) {
		//Nothing
	}

	@Override
	public Command doGetCommand(Request request, EditPart targetEditPart) {

		if( request instanceof CreateAspectUnspecifiedTypeConnectionRequest){
			return null;
		}
		CompositeCommand cc = new CompositeCommand(getLabel());

		EObject semanticElement = getTargetSemanticElement(targetEditPart);

		List<EObject> sourceElements = getSourceEObjects(request);
		if (sourceElements.size() != 1) {
			return null;
		}
		if(!(semanticElement instanceof Constraint)) {
			return null;
		}

		Object sourceElement = sourceElements.get(0);

		SetRequest setClassifiersRequest = new SetRequest(semanticElement, constraintContext_feature, sourceElement);
		SetValueCommand setClassifiersCommand = new SetValueCommand(setClassifiersRequest);

		cc.add(setClassifiersCommand);

		return cc.canExecute() ? new ICommandProxy(cc.reduce()) : null;
	}
}
