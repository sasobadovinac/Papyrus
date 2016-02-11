/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
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
package org.eclipse.papyrus.infra.elementtypesconfigurations.factories.impl;

import org.eclipse.gmf.runtime.emf.type.core.AdviceBindingInheritance;
import org.eclipse.gmf.runtime.emf.type.core.IContainerDescriptor;
import org.eclipse.gmf.runtime.emf.type.core.IElementMatcher;
import org.eclipse.papyrus.infra.elementtypesconfigurations.AbstractEditHelperAdviceConfiguration;
import org.eclipse.papyrus.infra.elementtypesconfigurations.AbstractMatcherConfiguration;
import org.eclipse.papyrus.infra.elementtypesconfigurations.ContainerConfiguration;
import org.eclipse.papyrus.infra.elementtypesconfigurations.SpecializationTypeConfiguration;
import org.eclipse.papyrus.infra.elementtypesconfigurations.registries.ContainerConfigurationTypeRegistry;
import org.eclipse.papyrus.infra.elementtypesconfigurations.registries.MatcherConfigurationTypeRegistry;

public abstract class AbstractEditHelperAdviceFactory<T extends AbstractEditHelperAdviceConfiguration> extends AbstractAdviceFactory<T> {

	@Override
	protected String getTypeId(T adviceConfiguration) {
		return adviceConfiguration.getTarget().getIdentifier();
	}

	@Override
	protected AdviceBindingInheritance getInheritance(T adviceConfiguration) {
		return AdviceBindingInheritance.ALL;
	}

	@Override
	protected IContainerDescriptor getContainerDescriptor(T adviceConfiguration) {
		ContainerConfiguration containerConfiguration = ((SpecializationTypeConfiguration) adviceConfiguration.eContainer()).getContainerConfiguration();
		if (containerConfiguration == null) {
			return null;
		}
		IContainerDescriptor containerDescriptor = ContainerConfigurationTypeRegistry.getInstance().getContainerDescriptor(containerConfiguration);
		return containerDescriptor;
	}

	@Override
	protected IElementMatcher getMatcher(T adviceConfiguration) {
		AbstractMatcherConfiguration matcherConfiguration = ((SpecializationTypeConfiguration) adviceConfiguration.eContainer()).getMatcherConfiguration();
		if (matcherConfiguration == null) {
			return null;
		}
		IElementMatcher matcher = MatcherConfigurationTypeRegistry.getInstance().getMatcher(matcherConfiguration);
		return matcher;
	}

	@Override
	protected String getId(T adviceConfiguration) {
		return adviceConfiguration.getTarget().getIdentifier();
	}
}
