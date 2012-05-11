/*****************************************************************************
 * Copyright (c) 2012 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Vincent Lorenzo (CEA LIST) Vincent.Lorenzo@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.bundles.tests;

import java.net.URL;

import org.eclipse.core.runtime.Assert;
import org.junit.Test;
import org.osgi.framework.Bundle;

public class BundlesTests {

	/**
	 * Tests that all Papyrus Bundle name are finished by {@link #INCUBATION}
	 */
	@Test
	public void incubationTest() {
		testManifestProperty(BundleTestsUtils.BUNDLE_NAME, ".*\\(Incubation\\)"); //$NON-NLS-1$
	}

	/**
	 * Tests the provider name (should be EL
	 */
	@Test
	public void vendorTest() {
		testManifestProperty(BundleTestsUtils.BUNDLE_VENDOR, BundleTestsUtils.VENDOR_NAME);
	}

	/**
	 * Tests that each papyrus plugins have the correct version
	 */
	@Test
	public void versionTest() {
		testManifestProperty(BundleTestsUtils.BUNDLE_VERSION, "0\\.9\\.0\\..*"); //$NON-NLS-1$
	}

	/**
	 * Tests if the file about.html is included to the plugin
	 */
	@Test
	public void aboutTest() {
		fileTest("/about.html"); //$NON-NLS-1$
	}

	/**
	 * Tests the java version
	 */
	@Test
	public void javaVersionTest() {
		testManifestProperty(BundleTestsUtils.BUNDLE_REQUIREDEXECUTIONENVIRONMENT, BundleTestsUtils.JAVA_VERSION_5); //$NON-NLS-1$
	}

	/**
	 * Tests if a the value of a property in the Manifest is correct
	 * 
	 * @param property
	 *        the property to test
	 * @param regex
	 *        the regular expression to test the property
	 */
	private void testManifestProperty(final String property, final String regex) {
		String message = null;
		int nb = 0;
		for(Bundle current : BundleTestsUtils.getPapyrusBundles()) {
			final String value = (String)current.getHeaders().get(property);
			boolean result = false;
			if(value != null) {
				result = value.matches(regex);
			}
			if(!result) {
				if(message == null) {
					message = "Wrong " + property + " for :"; //$NON-NLS-1$ //$NON-NLS-2$
				}
				message += "\n "; //$NON-NLS-1$
				message += current.getSymbolicName();
				nb++;
			}
		}
		Assert.isTrue(message == null, nb + " problems! " + message); //$NON-NLS-1$
	}

	/**
	 * Tests if the file is owned by the bundle
	 * 
	 * @param filepath
	 *        the file path
	 */
	private void fileTest(final String filepath) {
		String message = null;
		int nb = 0;
		for(Bundle current : BundleTestsUtils.getPapyrusBundles()) {
			final URL url = current.getResource(filepath);
			if(url == null) {
				if(message == null) {
					message = "The following bundles doesn't have the file about.html :"; //$NON-NLS-1$
				}
				message += "\n "; //$NON-NLS-1$
				message += current.getSymbolicName();
				nb++;
			}
		}
		Assert.isTrue(message == null, nb + " problems!" + message); //$NON-NLS-1$
	}

}
