/*****************************************************************************
 * Copyright (c) 2016 CEA LIST and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   CEA LIST - Initial API and implementation
 *   Vincent Lorenzo - bug 492522
 *****************************************************************************/

package org.eclipse.papyrus.uml.service.types.helper.advice;

import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.papyrus.uml.service.types.element.UMLElementTypes;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * This helper provides the command to remove an annotated element from a comment
 *
 */
public class CommentDestroyAnnotatedElementsEditHelperAdvice extends AbstractReferenceDeleteRelationshipEditHelperAdvice {

	@Override
	protected ICommand getBeforeSetCommand(SetRequest request) {
		// TODO, here we must manage the case where a set request is sent instead of a destroy reference request, like done for Comment#annotatedElement by the property view.
		// Currently, this is the class org.eclipse.papyrus.uml.diagram.sequence.SequenceViewDependentsAdvice which intercept the set request

		// the test for set request is already written, but tagged as invalid test in org.eclipse.papyrus.uml.service.types.tests.deletion.DeleteCommentLinkTest
		return super.getBeforeSetCommand(request);
	}

	/**
	 * @see org.eclipse.papyrus.uml.service.types.helper.advice.AbstractReferenceDeleteRelationshipEditHelperAdvice#checkSourceEdgeToFindConnectorToDestroy()
	 *
	 * @return
	 */
	@Override
	protected boolean checkSourceEdgeToFindConnectorToDestroy() {
		return true;
	}


	/**
	 * @see org.eclipse.papyrus.uml.service.types.helper.advice.AbstractReferenceDeleteRelationshipEditHelperAdvice#checkTargetEdgeToFindConnectorToDestroy()
	 *
	 * @return
	 */
	@Override
	protected boolean checkTargetEdgeToFindConnectorToDestroy() {
		return false;
	}

	/**
	 * @see org.eclipse.papyrus.uml.service.types.helper.advice.AbstractReferenceDeleteRelationshipEditHelperAdvice#getFeatureElementTypeToEReferenceMap()
	 *
	 * @return
	 */
	@Override
	protected Map<String, EReference> getFeatureElementTypeToEReferenceMap() {
		return Collections.singletonMap(UMLElementTypes.COMMENT_ANNOTATEDELEMENTS.getId(), UMLPackage.eINSTANCE.getComment_AnnotatedElement());
	}
}
