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
 *  Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.diagram.profile.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.papyrus.diagram.profile.part.UMLDiagramEditorPlugin;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	 * @generated
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();

		PackageCNPreferencePage.initDefaults(store);


		DataTypePreferencePage.initDefaults(store);


		ModelPreferencePage.initDefaults(store);


		AssociationPreferencePage.initDefaults(store);


		ShortCutDiagramPreferencePage.initDefaults(store);


		ConstraintPreferencePage.initDefaults(store);


		ConstraintCNPreferencePage.initDefaults(store);


		CommentCNPreferencePage.initDefaults(store);


		EnumerationLiteralPreferencePage.initDefaults(store);


		StereotypePreferencePage.initDefaults(store);


		DependencyPreferencePage.initDefaults(store);


		EnumerationCNPreferencePage.initDefaults(store);


		PrimitiveTypePreferencePage.initDefaults(store);


		PackagePreferencePage.initDefaults(store);


		DataTypePropertyPreferencePage.initDefaults(store);


		ProfileCNPreferencePage.initDefaults(store);


		ClassPropertyPreferencePage.initDefaults(store);


		CommentPreferencePage.initDefaults(store);


		ProfilePreferencePage.initDefaults(store);


		EnumerationPreferencePage.initDefaults(store);


		ClassOperationPreferencePage.initDefaults(store);


		DataTypeOperationPreferencePage.initDefaults(store);


		MetaclassPreferencePage.initDefaults(store);




		PackageImportPreferencePage.initDefaults(store);


		ExtensionPreferencePage.initDefaults(store);


		AssociationPreferencePage.initDefaults(store);


		GeneralizationPreferencePage.initDefaults(store);


		ElementImportPreferencePage.initDefaults(store);


		ProfileApplicationPreferencePage.initDefaults(store);



		DependencyPreferencePage.initDefaults(store);


	}

	/**
	 * @generated
	 */
	protected IPreferenceStore getPreferenceStore() {
		return UMLDiagramEditorPlugin.getInstance().getPreferenceStore();
	}
}
