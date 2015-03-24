/*
 * generated by Xtext
 */
package org.eclipse.papyrus.infra.gmfdiag.css3.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import org.eclipse.papyrus.infra.gmfdiag.css3.ui.internal.CSSActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class CSSExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return CSSActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return CSSActivator.getInstance().getInjector(CSSActivator.ORG_ECLIPSE_PAPYRUS_INFRA_GMFDIAG_CSS3_CSS);
	}
	
}
