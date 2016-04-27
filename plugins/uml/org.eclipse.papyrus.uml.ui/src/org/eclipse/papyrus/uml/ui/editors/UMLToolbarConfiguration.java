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
 *   
 *****************************************************************************/

package org.eclipse.papyrus.uml.ui.editors;

import org.eclipse.papyrus.infra.widgets.editors.richtext.GenericToolbarConfiguration;
import org.eclipse.papyrus.infra.widgets.editors.richtext.SpellCheckToolbarButton;

/**
 * @author VL222926
 * 
 *         This configuration adds a button to insert UML references in the comment
 */
public class UMLToolbarConfiguration extends GenericToolbarConfiguration {

	/**
	 * 
	 * Constructor.
	 *
	 */
	public UMLToolbarConfiguration() {
		super();
	}

	/**
	 * @see org.eclipse.papyrus.infra.widgets.editors.richtext.GenericToolbarConfiguration#addSpellCheckToolbarButton()
	 *
	 */
	@Override
	protected void addSpellCheckToolbarButton() {
		SpellCheckToolbarButton action = new UMLSpellCheckToolbarButton();
		addToolbarButton(action);
	}

	/**
	 * @see org.eclipse.papyrus.infra.widgets.editors.richtext.GenericToolbarConfiguration#registerDefaultButton()
	 *
	 */
	@Override
	protected void registerDefaultButton() {
		super.registerDefaultButton();
		InsertReferenceToolbarButton insertAction = new InsertReferenceToolbarButton();
		addToolbarButton(insertAction);
	}



}
