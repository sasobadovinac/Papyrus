/*****************************************************************************
 * Copyright (c) 2011, 2014 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *  Christian W. Damus (CEA) - bug 417409
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.tools.databinding;

import org.eclipse.core.databinding.observable.IObservable;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.papyrus.infra.tools.databinding.AggregatedObservable;
import org.eclipse.papyrus.infra.tools.databinding.CommandBasedObservableValue;
import org.eclipse.papyrus.infra.tools.databinding.ReferenceCountedObservable;

/**
 * An Abstract Class for Papyrus Command-based observable values
 *
 * @author Camille Letavernier
 *
 */
public abstract class AbstractUMLAggregatedObservableValue extends ReferenceCountedObservable.Value implements AggregatedObservable, CommandBasedObservableValue {

	protected EditingDomain domain;

	protected AbstractUMLAggregatedObservableValue(EditingDomain domain) {
		this.domain = domain;
	}

	/**
	 * {@inheritDoc}
	 */
	public AggregatedObservable aggregate(IObservable observable) {
		try {
			return new AggregatedPapyrusObservableValue(domain, this, observable);
		} catch (IllegalArgumentException ex) {
			return null; // The observable cannot be aggregated
		}
	}

	/**
	 * {@inheritDoc}
	 */
	public boolean hasDifferentValues() {
		return false;
	}
}
