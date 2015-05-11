/*****************************************************************************
 * Copyright (c) 2015 Christian W. Damus and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus - Initial API and implementation
 *   
 *****************************************************************************/

package org.eclipse.papyrus.umlrt.internal.sync.statemachine;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.umlrt.custom.utils.CapsuleUtils;
import org.eclipse.papyrus.umlrt.internal.sync.UMLSyncRegistry;
import org.eclipse.uml2.uml.Transition;

/**
 * Capsule statemachine transition synchronization registry.
 */
public class TransitionSyncRegistry extends UMLSyncRegistry<Transition> {

	public TransitionSyncRegistry() {
		super();
	}

	@Override
	public Transition getModelOf(EObject backend) {
		return getRedefinedTransition(backend);
	}

	public static Transition getRedefinedTransition(EObject transition) {
		return (transition instanceof Transition) ? CapsuleUtils.getSuperTransition((Transition) transition) : null;
	}
}