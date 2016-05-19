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

package org.eclipse.papyrus.infra.types.core.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.IEditHelperAdvice;
import org.eclipse.papyrus.infra.types.core.registries.ElementTypeSetConfigurationRegistry;


public class AdviceComparator implements Comparator<IEditHelperAdvice> {

	protected Collection<OrientedGraph<String>> dependencies;


	public AdviceComparator(IElementType[] types, String contextId) {
		this.dependencies = new ArrayList<OrientedGraph<String>>();
		for (IElementType iElementType : types) {
			this.dependencies.add(ElementTypeSetConfigurationRegistry.getInstance().getAdvicesDeps(iElementType.getId(), contextId));
		}
	}

	public AdviceComparator(IElementType elementType, String contextId) {
		this.dependencies = new ArrayList<OrientedGraph<String>>();
		this.dependencies.add(ElementTypeSetConfigurationRegistry.getInstance().getAdvicesDeps(elementType.getId(), contextId));
	}

	@Override
	public int compare(IEditHelperAdvice arg0, IEditHelperAdvice arg1) {

		String arg0Name = arg0.getClass().getName();
		String arg1Name = arg1.getClass().getName();

		for (OrientedGraph<String> orientedGraph : dependencies) {
			if (orientedGraph.getEdges().containsKey(arg0Name)) {
				if (orientedGraph.getAllConnex(arg0Name).contains(arg1Name)) {
					return -1;
				}
			}
		}

		for (OrientedGraph<String> orientedGraph : dependencies) {
			if (orientedGraph.getEdges().containsKey(arg1Name)) {
				if (orientedGraph.getAllConnex(arg1Name).contains(arg0Name)) {
					return 1;
				}
			}
		}

		return 0;
	}

}
