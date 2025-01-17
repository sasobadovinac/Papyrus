/*****************************************************************************
 * Copyright (c) 2007, 2010, 2014 Borland Software Corporation, CEA, and others
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 * Alexander Shatalin (Borland) - initial API and implementation
 * Michael Golubev (Borland) - [243151] explicit source/target for links
 * Michael Golubev (Montages) - API extracted to gmf.tooling.runtime, template migrated to Xtend2
 * Christian W. Damus (CEA) - bug 426732: override the cross-reference searches for views to use the CrossReferenceAdapter        
 * 
 *****************************************************************************/
package aspects.xpt.diagram.updater

import com.google.inject.Inject
import com.google.inject.Singleton
import org.eclipse.gmf.codegen.gmfgen.GenDiagramUpdater
import xpt.Common

@Singleton class NodeDescriptor extends xpt.diagram.updater.NodeDescriptor {
	@Inject extension Common;

	override def extendsList(GenDiagramUpdater it) '''extends org.eclipse.papyrus.infra.gmfdiag.common.updater.UpdaterNodeDescriptor'''
	
	override def constructor(GenDiagramUpdater it) '''
		«generatedMemberComment»
		public «className(it)»(org.eclipse.emf.ecore.EObject modelElement, String visualID) {
			super(modelElement, visualID);
		}
	'''

}
