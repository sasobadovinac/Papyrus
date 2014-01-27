/*****************************************************************************
 * Copyright (c) 2013 CEA LIST.
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
package org.eclipse.papyrus.facade.extensiondefinition.validation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.papyrus.facade.extensiondefinition.BaseMetaclass;

/**
 * A sample validator interface for {@link org.eclipse.papyrus.facade.extensiondefinition.Combination}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface CombinationValidator {
	boolean validate();

	boolean validateMembers(EList<BaseMetaclass> value);
}
