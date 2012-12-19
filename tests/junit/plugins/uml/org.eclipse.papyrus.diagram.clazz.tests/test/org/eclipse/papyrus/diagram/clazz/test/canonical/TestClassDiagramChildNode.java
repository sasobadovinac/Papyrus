/*****************************************************************************
 * Copyright (c) 2009 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Patrick Tessier (CEA LIST) Patrick.tessier@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.diagram.clazz.test.canonical;

import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequestFactory;
import org.eclipse.papyrus.commands.ICreationCommand;
import org.eclipse.papyrus.diagram.tests.canonical.TestChildNode;
import org.eclipse.papyrus.uml.diagram.clazz.CreateClassDiagramCommand;
import org.eclipse.papyrus.uml.diagram.clazz.providers.UMLElementTypes;
import org.junit.Test;


// TODO: Auto-generated Javadoc
/**
 * The Class TestClassDiagramChildNode.
 */
public class TestClassDiagramChildNode extends TestChildNode {


	@Override
	protected CreateViewRequest createViewRequestShapeContainer() {
		return CreateViewRequestFactory.getCreateShapeRequest(UMLElementTypes.Package_2007, getDiagramEditPart().getDiagramPreferencesHint());
	}

	/**
	 * Test to manage component.
	 */
	@Test
	public void testToManageComponent() {
		testToManageChildNode(UMLElementTypes.Component_3021, UMLElementTypes.Package_3009, true);
	}

	/**
	 * Test to manage instance specification.
	 */
	@Test
	public void testToManageInstanceSpecification() {
		testToManageChildNode(UMLElementTypes.InstanceSpecification_3020, UMLElementTypes.Package_3009, true);
	}

	/**
	 * Test to manage signal.
	 */
	@Test
	public void testToManageSignal() {
		testToManageChildNode(UMLElementTypes.Signal_3022, UMLElementTypes.Package_3009, true);
	}

	/**
	 * Test to manage model.
	 */
	@Test
	public void testToManageModel() {
		testToManageChildNode(UMLElementTypes.Model_3024, UMLElementTypes.Package_3009, true);
	}

	/**
	 * Test to manage enumeration.
	 */
	@Test
	public void testToManageEnumeration() {
		testToManageChildNode(UMLElementTypes.Enumeration_3025, UMLElementTypes.Package_3009, true);
	}

	/**
	 * Test to manage i package.
	 */
	@Test
	public void testToManageIPackage() {
		testToManageChildNode(UMLElementTypes.Package_3009, UMLElementTypes.Package_3009, true);
	}

	/**
	 * Test to manage class.
	 */
	@Test
	public void testToManageClass() {
		testToManageChildNode(UMLElementTypes.Class_3010, UMLElementTypes.Package_3009, true);
	}

	/**
	 * Test to manage InforamtionItem.
	 */
	@Test
	public void testToManageInformationItem() {
		testToManageChildNode(UMLElementTypes.InformationItem_3040, UMLElementTypes.Package_3009, true);
	}

	/**
	 * Test to manage primitive type.
	 */
	@Test
	public void testToManagePrimitiveType() {
		testToManageChildNode(UMLElementTypes.PrimitiveType_3026, UMLElementTypes.Package_3009, true);
	}

	/**
	 * Test to manage data type.
	 */
	@Test
	public void testToManageDataType() {
		testToManageChildNode(UMLElementTypes.DataType_3027, UMLElementTypes.Package_3009, true);
	}

	/**
	 * Test to manage constraint.
	 */
	@Test
	public void testToManageConstraint() {
		testToManageChildNode(UMLElementTypes.Constraint_3029, UMLElementTypes.Package_3009, true);
	}

	/**
	 * Test to manage comment.
	 */
	@Test
	public void testToManageComment() {
		testToManageChildNode(UMLElementTypes.Comment_3028, UMLElementTypes.Package_3009, true);
	}

	@Override
	protected ICreationCommand getDiagramCommandCreation() {
		return new CreateClassDiagramCommand();
	}

}
