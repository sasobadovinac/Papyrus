/*
 * generated by Xtext
 */
package org.eclipse.papyrus.infra.gmfdiag.css3;

import org.eclipse.xtext.formatting.IFormatter;
import org.eclipse.xtext.formatting.impl.NullFormatter;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class CSSRuntimeModule extends org.eclipse.papyrus.infra.gmfdiag.css3.AbstractCSSRuntimeModule {

	// Formatter is not properly implemented yet. Disable all formatting to avoid errors
	@Override
	public Class<? extends IFormatter> bindIFormatter() {
		return NullFormatter.class;
	}
}