/*****************************************************************************
 * Copyright (c) 2012 CEA LIST.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.infra.gmfdiag.css.engine;

import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.e4.ui.css.core.dom.IElementProvider;
import org.eclipse.e4.ui.css.core.engine.CSSElementContext;
import org.eclipse.papyrus.infra.gmfdiag.css.Activator;
import org.w3c.dom.Element;

/**
 * A Singleton CSSEngine, handling the CSS stylesheets applied to the whole
 * workspace
 * 
 * @author Camille Letavernier
 * 
 */
@SuppressWarnings("restriction")
public class WorkspaceCSSEngine extends ExtendedCSSEngineImpl {

	private WorkspaceCSSEngine() {
		super(BaseCSSEngine.instance);
		try {
			//TODO: Use an extension point to register themes
			//TODO: Use a Preference page to select a theme
			addStyleSheet(new URL("platform:/plugin/" + Activator.PLUGIN_ID + "/resources/papyrus_theme.css"));
		} catch (MalformedURLException ex) {
			Activator.log.error(ex);
		}
	}

	public static ExtendedCSSEngine instance = new WorkspaceCSSEngine();

	//Unsupported operations. The WorkspaceCSSEngine should never be used directly.

	@Override
	public Element getElement(Object node) {
		throw new UnsupportedOperationException();
	}

	@Override
	public IElementProvider getElementProvider() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void setElementProvider(IElementProvider elementProvider) {
		throw new UnsupportedOperationException();
	}

	@Override
	public CSSElementContext getCSSElementContext(Object node) {
		throw new UnsupportedOperationException();
	}
}
