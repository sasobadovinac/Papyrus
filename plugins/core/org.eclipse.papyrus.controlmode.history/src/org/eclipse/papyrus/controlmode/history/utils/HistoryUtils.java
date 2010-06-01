/**
 * 
 */
package org.eclipse.papyrus.controlmode.history.utils;

import org.eclipse.papyrus.controlmode.history.HistoryModel;
import org.eclipse.papyrus.core.services.ServiceException;
import org.eclipse.papyrus.core.services.ServicesRegistry;
import org.eclipse.papyrus.resource.ModelUtils;
import org.eclipse.papyrus.resource.ModelSet;
import org.eclipse.papyrus.resource.sasheditor.SashModel;


/**
 * Set of utility methods linked to Trace for ControlMode
 * @author cedric dumoulin
 *
 */
public class HistoryUtils {

	
	/**
	 * Gets the HistoryModel for the currently selected editor.
	 * <br>
	 * Warning: this method can return null if called during the MultiEditor initialization.
	 *
	 * 
	 * @return The {@link HistoryModel} of the current editor, or null if not found.
	 */
	public static HistoryModel getHistoryModel() {

		try {
			return (HistoryModel)ModelUtils.getModelSetChecked().getModel(HistoryModel.MODEL_ID);
		} catch (ServiceException e) {
			return null;
		}
	}
	
	/**
	 * Gets the HistoryModel for the currently selected editor.
	 * <br>
	 * Warning: this method can return null if called during the MultiEditor initialization.
	 *
	 * 
	 * @return The {@link HistoryModel} of the current editor, or null if not found.
	 * @throws ServiceException If an error occurs while getting or starting the service.
	 */
	public static HistoryModel getHistoryModelChecked() throws ServiceException {

		return (HistoryModel)ModelUtils.getModelSetChecked().getModel(HistoryModel.MODEL_ID);
	}
	
	/**
	 * Gets the HistoryModel from the {@link ModelSet}. 
	 * <br>
	 * 
	 * @param modelsManager The modelManager containing the requested model.
	 * 
	 * @return The {@link HistoryModel} registered in modelManager, or null if not found.
	 */
	public static HistoryModel getHistoryModel(ModelSet modelsManager) {

		return (HistoryModel)modelsManager.getModel(HistoryModel.MODEL_ID);
	}

	/**
	 * Gets the HistoryModel from the {@link ServicesRegistry}. 
	 * <br>
	 * 
	 * @param ServicesRegistry The servie registry under which the ModelSet is registered.
	 * 
	 * @return The {@link SashModel} registered in modelManager, or null if not found.
	 */
	public static HistoryModel getHistoryModel(ServicesRegistry servicesRegistry) {

		try {
			return (HistoryModel)ModelUtils.getModelSetChecked(servicesRegistry).getModel(HistoryModel.MODEL_ID);
		} catch (ServiceException e) {
			return null;
		}
	}

	/**
	 * Gets the HistoryModel from the {@link ServicesRegistry}. 
	 * <br>
	 * 
	 * @param ServicesRegistry The servie registry under which the ModelSet is registered.
	 * 
	 * @return The {@link SashModel} registered in modelManager, or null if not found.
	 * @throws ServiceException If the service can't be returned.
	 */
	public static HistoryModel getHistoryModelChecked(ServicesRegistry servicesRegistry) throws ServiceException {

			return (HistoryModel)ModelUtils.getModelSetChecked(servicesRegistry).getModel(HistoryModel.MODEL_ID);
	}


}
