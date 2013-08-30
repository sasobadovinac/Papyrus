/*****************************************************************************
 * Copyright (c) 2013 CEA LIST.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   CEA LIST - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.cdo.internal.core;

import java.util.Collection;

import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.common.util.URI;
import org.eclipse.net4j.util.container.IManagedContainer;
import org.eclipse.papyrus.cdo.core.IPapyrusRepository;
import org.eclipse.papyrus.cdo.core.IPapyrusRepositoryManager;

/**
 * This is the IInternalPapyrusRepositoryManager type. Enjoy.
 */
public interface IInternalPapyrusRepositoryManager extends IPapyrusRepositoryManager {

	IManagedContainer getSessionsContainer();

	void setURL(IPapyrusRepository repository, String url);

	ICredentialsProviderFactory getCredentialsProviderFactory();

	void setCredentialsProviderFactory(ICredentialsProviderFactory credentialsProviderFactory);

	IInternalPapyrusRepository getRepository(CDOView view);

	//
	// Specializations of inherited API
	//

	Collection<? extends IInternalPapyrusRepository> getRepositories();

	IInternalPapyrusRepository createRepository(String url);

	IInternalPapyrusRepository getRepository(String url);

	IInternalPapyrusRepository getRepositoryForURI(URI uri);

}
