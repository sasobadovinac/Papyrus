/*****************************************************************************
 * Copyright (c) 2010 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *****************************************************************************/
package org.eclipse.papyrus.sysml.diagram.blockdefinition.preferences;

import org.eclipse.gmf.runtime.diagram.ui.preferences.DiagramsPreferencePage;
import org.eclipse.papyrus.sysml.diagram.blockdefinition.Activator;

public class DiagramGeneralPreferencePage extends DiagramsPreferencePage {

	public DiagramGeneralPreferencePage() {
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
	}
}
