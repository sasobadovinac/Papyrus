/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
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
package org.eclipse.papyrus.infra.elementtypesconfigurations.emf.setvaluesadviceconfiguration;

import org.eclipse.gmf.runtime.emf.type.core.edithelper.IEditHelperAdvice;
import org.eclipse.papyrus.infra.elementtypesconfigurations.AbstractAdviceBindingConfiguration;
import org.eclipse.papyrus.infra.elementtypesconfigurations.factories.impl.AbstractAdviceBindingFactory;
import org.eclipse.papyrus.infra.elementtypesconfigurations.impl.NullEditHelperAdvice;

public class SetValuesAdviceEditHelperAdviceFactory extends AbstractAdviceBindingFactory<AbstractAdviceBindingConfiguration> {

	@Override
	protected IEditHelperAdvice getEditHelperAdvice(AbstractAdviceBindingConfiguration adviceConfiguration) {
		if (adviceConfiguration instanceof SetValuesAdviceConfiguration) {
			IEditHelperAdvice editHelperAdvice = new SetValuesAdviceEditHelperAdvice((SetValuesAdviceConfiguration) adviceConfiguration);
			return editHelperAdvice;
		}
		return NullEditHelperAdvice.getInstance();
	}

}
