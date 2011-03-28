
/*****************************************************************************
 * Copyright (c) 2010 CEA LIST.
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
 
package org.eclipse.papyrus.stereotypeapplicationwithvsl.editor.xtext.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

/**
 *@generated
 */
public class StereotypeApplicationWithVSLExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return org.eclipse.papyrus.stereotypeapplicationwithvsl.editor.xtext.ui.internal.StereotypeApplicationWithVSLActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return org.eclipse.papyrus.stereotypeapplicationwithvsl.editor.xtext.ui.internal.StereotypeApplicationWithVSLActivator.getInstance().getInjector("org.eclipse.papyrus.stereotypeapplicationwithvsl.editor.xtext.StereotypeApplicationWithVSL");
	}
	
}
