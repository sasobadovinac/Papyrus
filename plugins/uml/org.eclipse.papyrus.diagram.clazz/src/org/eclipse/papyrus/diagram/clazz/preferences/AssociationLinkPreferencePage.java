package org.eclipse.papyrus.diagram.clazz.preferences;

import java.util.Map;
import java.util.TreeMap;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.papyrus.diagram.clazz.edit.parts.ModelEditPart;
import org.eclipse.papyrus.diagram.clazz.part.UMLDiagramEditorPlugin;
import org.eclipse.papyrus.diagram.common.util.StringComparator;
import org.eclipse.papyrus.preferences.pages.AbstractPapyrusLinkPreferencePage;
import org.eclipse.papyrus.preferences.utils.PreferenceConstantHelper;

/**
 * @generated
 */
public class AssociationLinkPreferencePage extends AbstractPapyrusLinkPreferencePage {

	/**
	 * @generated
	 */
	public AssociationLinkPreferencePage() {
		super();
		setPreferenceKey(ModelEditPart.MODEL_ID + "_AssociationLink");
	}

	/**
	 * @generated
	 */
	@Override
	protected String getBundleId() {
		return UMLDiagramEditorPlugin.ID;
	}

	/**
	 * @generated
	 */
	public static void initDefaults(IPreferenceStore store) {

		String key = ModelEditPart.MODEL_ID + "_AssociationLink";
		Map<String, Boolean> map = getStaticLabelVisibilityPreferences();
		for(String role : map.keySet()) {
			String preferenceName = PreferenceConstantHelper.getLabelElementConstant(key, role, PreferenceConstantHelper.LABEL_VISIBILITY);
			store.setDefault(preferenceName, map.get(role));
		}

	}


	/**
	 * @generated
	 */
	private static TreeMap<String, String> getStaticLabelRole() {
		TreeMap<String, String> map = new TreeMap<String, String>(new StringComparator());
		map.put("Stereotype", "platform:/plugin/org.eclipse.uml2.uml.edit/icons/full/obj16/Stereotype.gif");//$NON-NLS-1$ //$NON-NLS-2$
		map.put("Name", "platform:/plugin/org.eclipse.papyrus.diagram.common/icons/label_role/name.png");//$NON-NLS-1$ //$NON-NLS-2$
		map.put("TargetRole", "platform:/plugin/org.eclipse.papyrus.diagram.common/icons/label_role/role.gif");//$NON-NLS-1$ //$NON-NLS-2$
		map.put("SourceRole", "platform:/plugin/org.eclipse.papyrus.diagram.common/icons/label_role/role.gif");//$NON-NLS-1$ //$NON-NLS-2$
		map.put("SourceMultiplicity", "platform:/plugin/org.eclipse.papyrus.diagram.common/icons/label_role/MultiplicityHandler.gif");//$NON-NLS-1$ //$NON-NLS-2$
		map.put("TargetMultiplicity", "platform:/plugin/org.eclipse.papyrus.diagram.common/icons/label_role/MultiplicityHandler.gif");//$NON-NLS-1$ //$NON-NLS-2$
		return map;
	}

	/**
	 * @generated
	 */
	private static TreeMap<String, Boolean> getStaticLabelVisibilityPreferences() {
		TreeMap<String, Boolean> map = new TreeMap<String, Boolean>();
		map.put("Stereotype", Boolean.TRUE);

		map.put("Name", Boolean.TRUE);

		map.put("TargetRole", Boolean.TRUE);

		map.put("SourceRole", Boolean.TRUE);

		map.put("SourceMultiplicity", Boolean.TRUE);

		map.put("TargetMultiplicity", Boolean.TRUE);

		return map;
	}

	/**
	 * @generated
	 */
	protected TreeMap<String, String> getLabelRole() {
		return getStaticLabelRole();
	}


}
