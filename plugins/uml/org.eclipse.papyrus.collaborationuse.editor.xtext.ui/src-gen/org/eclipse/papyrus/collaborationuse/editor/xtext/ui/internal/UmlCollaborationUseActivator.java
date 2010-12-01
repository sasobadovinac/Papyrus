/*
 * generated by Xtext
 */
package org.eclipse.papyrus.collaborationuse.editor.xtext.ui.internal;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.google.inject.util.Modules;

/**
 * Generated
 */
public class UmlCollaborationUseActivator extends AbstractUIPlugin {

	private Map<String, Injector> injectors = new HashMap<String, Injector>();

	private static UmlCollaborationUseActivator INSTANCE;

	public Injector getInjector(String languageName) {
		return injectors.get(languageName);
	}

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		INSTANCE = this;
		try {

			injectors.put("org.eclipse.papyrus.collaborationuse.editor.xtext.UmlCollaborationUse", Guice.createInjector(Modules.override(Modules.override(getRuntimeModule("org.eclipse.papyrus.collaborationuse.editor.xtext.UmlCollaborationUse")).with(getUiModule("org.eclipse.papyrus.collaborationuse.editor.xtext.UmlCollaborationUse"))).with(getSharedStateModule())));

		} catch (Exception e) {
			Logger.getLogger(getClass()).error(e.getMessage(), e);
			throw e;
		}
	}

	public static UmlCollaborationUseActivator getInstance() {
		return INSTANCE;
	}

	protected Module getRuntimeModule(String grammar) {

		if("org.eclipse.papyrus.collaborationuse.editor.xtext.UmlCollaborationUse".equals(grammar)) {
			return new org.eclipse.papyrus.collaborationuse.editor.xtext.UmlCollaborationUseRuntimeModule();
		}

		throw new IllegalArgumentException(grammar);
	}

	protected Module getUiModule(String grammar) {

		if("org.eclipse.papyrus.collaborationuse.editor.xtext.UmlCollaborationUse".equals(grammar)) {
			return new org.eclipse.papyrus.collaborationuse.editor.xtext.ui.UmlCollaborationUseUiModule(this);
		}

		throw new IllegalArgumentException(grammar);
	}

	protected Module getSharedStateModule() {
		return new org.eclipse.xtext.ui.shared.SharedStateModule();
	}

}
