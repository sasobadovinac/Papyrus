/**
 * Copyright (c) 2014 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 	Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 */
package org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping Parameters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.MappingParameters#getUriMappings <em>Uri Mappings</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.RSAToPapyrusParametersPackage#getMappingParameters()
 * @model
 * @generated
 */
public interface MappingParameters extends EObject {
	/**
	 * Returns the value of the '<em><b>Uri Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.URIMapping}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When models/libraries have been migrated separately, maps the libraries imported from RSA to their Papyrus equivalent
	 * <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Uri Mappings</em>' containment reference list.
	 * @see org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.RSAToPapyrusParametersPackage#getMappingParameters_UriMappings()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<URIMapping> getUriMappings();

} // MappingParameters
