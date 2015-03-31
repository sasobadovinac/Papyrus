/**
 * Copyright (c) 2015 CEA LIST.
 * 
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.papyrus.sysml14.blocks.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.eclipse.papyrus.sysml14.blocks.BlocksFactory;
import org.eclipse.papyrus.sysml14.blocks.ParticipantProperty;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Participant Property</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ParticipantPropertyTest extends TestCase {

	/**
	 * The fixture for this Participant Property test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParticipantProperty fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ParticipantPropertyTest.class);
	}

	/**
	 * Constructs a new Participant Property test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipantPropertyTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Participant Property test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ParticipantProperty fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Participant Property test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParticipantProperty getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BlocksFactory.eINSTANCE.createParticipantProperty());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ParticipantPropertyTest