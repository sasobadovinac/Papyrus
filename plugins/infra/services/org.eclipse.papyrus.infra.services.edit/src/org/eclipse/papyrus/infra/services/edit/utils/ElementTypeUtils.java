/*****************************************************************************
 * Copyright (c) 2013, 2014 CEA LIST, Christian W. Damus, and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *  Christian W. Damus - bug 451230
 *
 *****************************************************************************/
package org.eclipse.papyrus.infra.services.edit.utils;

import java.util.Arrays;
import java.util.Collection;
import java.util.TreeSet;

import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IClientContext;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.services.edit.Activator;
import org.eclipse.papyrus.infra.services.edit.internal.context.TypeContext;

/**
 * Utils class for elements types
 *
 * @author VL222926
 *
 */
public class ElementTypeUtils {


	private ElementTypeUtils() {
		// to prevent instanciation
	}

	/**
	 *
	 * @return
	 *         all existing elements types
	 */
	public static final Collection<IElementType> getAllExistingElementTypes() {
		IClientContext clientContext = getEditContext();
		final IElementType[] types = ElementTypeRegistry.getInstance().getElementTypes(clientContext);
		return Arrays.asList(types);
	}

	/**
	 * @return
	 *         all existing element type id, sorted by alphabetical order
	 */
	public static final Collection<String> getAllExistingElementTypesIds() {
		final Collection<String> ids = new TreeSet<String>();
		for (final IElementType iElementType : getAllExistingElementTypes()) {
			ids.add(iElementType.getId());
		}
		return ids;
	}

	/**
	 * Obtains the element type client context in which the edit service binds element types.
	 * 
	 * @return the edit service's client context, or {@code null} if it is not available in the current installation
	 */
	public static IClientContext getEditContext() {
		IClientContext result = null;

		try {
			result = TypeContext.getContext();
		} catch (ServiceException e) {
			Activator.log.error(e);
		}

		return result;

	}
	
	/**
	 * return a boolean about the usage of a GUI for edition of an Element
	 * @param request an edition request
	 * @return true if the request  do not contain information about usage of GUI
	 */
	public static boolean useGUI(IEditCommandRequest request){
		if(request.getParameter(RequestParameterConstants.USE_GUI)!=null){
			if ( request.getParameter(RequestParameterConstants.USE_GUI) instanceof String){
				Boolean booleanObject= Boolean.valueOf((String) request.getParameter(RequestParameterConstants.USE_GUI));
				return booleanObject.booleanValue();
			}
		}
		return true;
	}
}