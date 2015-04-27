/*****************************************************************************
 * Copyright (c) 2015 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Nicolas FAUVERGUE (ALL4TEC) nicolas.fauvergue@all4tec.net - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.infra.widgets.editors;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.papyrus.infra.widgets.creation.ReferenceValueFactory;
import org.eclipse.papyrus.infra.widgets.providers.IStaticContentProvider;

/**
 * This interface allow to define the reference value editor methods to implements.
 */
public interface IReferenceValueEditor {

	/**
	 * Sets the Content provider for this editor
	 *
	 * @param provider
	 *            The content provider used to retrieve the possible values for this Reference.
	 */
	void setContentProvider(final IStaticContentProvider provider);

	/**
	 * Sets the Label provider for this editor If the label provider is null, a
	 * default one will be used. The same label provider is used for both the
	 * editor's label and the selection dialog.
	 *
	 * @param provider
	 *            The label provider.
	 */
	void setLabelProvider(final ILabelProvider provider);

	/**
	 * Sets the factory.
	 *
	 * @param factory
	 *            The reference value factory.
	 */
	void setValueFactory(final ReferenceValueFactory factory);

	/**
	 * Sets the direct creation value.
	 *
	 * @param directCreation
	 *            Boolean to determinate the direct creation value.
	 */
	void setDirectCreation(final boolean directCreation);

	/**
	 * Sets the mandatory.
	 *
	 * @param mandatory
	 *            The mandatory boolean value.
	 */
	void setMandatory(final boolean mandatory);

	/**
	 * Sets the read only value.
	 *
	 * @param readOnly
	 *            The read only value.
	 */
	void setReadOnly(final boolean readOnly);
}
