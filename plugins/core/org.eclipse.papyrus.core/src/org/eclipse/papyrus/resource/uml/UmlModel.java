/**
 * 
 */
package org.eclipse.papyrus.resource.uml;

import org.eclipse.core.runtime.IPath;
import org.eclipse.papyrus.resource.AbstractBaseModel;
import org.eclipse.papyrus.resource.IModel;


/**
 * A UML  model.
 * @author cedric dumoulin
 *
 */
public class UmlModel extends AbstractBaseModel implements IModel {

	/**
	 * File extension used for DI.
	 */
	public static final String UML_FILE_EXTENSION = "uml"; //$NON-NLS-1$

	/**
	 * Model ID.
	 */
	public static final String MODEL_ID = "org.eclipse.papyrus.resource.uml.UmlModel"; //$NON-NLS-1$

	/**
	 * @see org.eclipse.papyrus.resource.IModel#createModel(org.eclipse.core.runtime.IPath)
	 *
	 * @param fullPath
	 */
	public void createModel(IPath fullPath) {
		
		// Compute model URI
		resourceURI = getPlatformURI(fullPath.addFileExtension(UML_FILE_EXTENSION));

		// Create Resource of appropriate type
		resource = getResourceSet().createResource(resourceURI, getContentType());
	}

	/**
	 * 
	 * @return
	 */
	protected String getContentType() {
		// TODO: use the uml identifier
		// return UMLPackage.eCONTENT_TYPE;
		return "org.eclipse.uml2.uml";
	}
	
	/**
	 * Get the file extension used for this model.
	 * @see org.eclipse.papyrus.resource.AbstractBaseModel#getModelFileExtension()
	 *
	 * @return
	 */
	@Override
	protected String getModelFileExtension() {
		return UML_FILE_EXTENSION;
	}

	/**
	 * Get the identifier used to register this model.
	 * @see org.eclipse.papyrus.resource.AbstractBaseModel#getIdentifier()
	 *
	 * @return
	 */
	@Override
	public String getIdentifier() {
		return MODEL_ID;
	}

}
