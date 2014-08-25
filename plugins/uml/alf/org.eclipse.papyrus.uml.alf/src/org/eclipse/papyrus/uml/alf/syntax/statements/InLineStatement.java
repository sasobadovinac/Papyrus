/*****************************************************************************
 * Copyright (c) 2011 CEA LIST.
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
package org.eclipse.papyrus.uml.alf.syntax.statements;

public class InLineStatement extends Statement {

	// Synthesized Properties
	public String code ;
	public String language ;

	// Constraints

	/*
	 * The assignments after an in-line statement are the same as the assignments before the statement.
	 */
	public void checkInLineStatementAssignmentsAfter() {

	}


}
