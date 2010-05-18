/*****************************************************************************
 * Copyright (c) 2010 CEA LIST.
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Remi Schnekenburger (CEA LIST) remi.schnekenburger@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.properties.tabbed.customization.state;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.papyrus.properties.runtime.view.DialogDescriptor;
import org.eclipse.papyrus.properties.runtime.view.FragmentDescriptor;
import org.eclipse.papyrus.properties.runtime.view.XMLParseException;
import org.eclipse.papyrus.properties.tabbed.core.view.PropertyTabViewProviderParser;
import org.eclipse.papyrus.properties.tabbed.core.view.SectionSetDescriptor;
import org.eclipse.ui.views.properties.tabbed.ITabDescriptor;
import org.w3c.dom.NodeList;


/**
 * Parser that stores a list of state on configuration elements instead of contributing to property view
 */
public class StatePropertyTabViewProviderParser extends PropertyTabViewProviderParser {

	/** states of section set descriptors in the xml file */
	protected List<SectionSetDescriptorState> sectionSetDescriptorStates = new ArrayList<SectionSetDescriptorState>();

	/**
	 * Creates a new StatePropertyTabViewProviderParser.
	 * 
	 * @param tabDescriptors
	 *        list of already available tab descriptors
	 */
	public StatePropertyTabViewProviderParser(List<ITabDescriptor> tabDescriptors) {
		super(tabDescriptors);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void parseXMLfile(NodeList views, Map<String, FragmentDescriptor> predefinedFragments, Map<String, DialogDescriptor> predefinedDialogs) throws XMLParseException {
		super.parseXMLfile(views, predefinedFragments, predefinedDialogs);

		// from the list of created tab descriptors and section sets descriptors, creates the state
		for(SectionSetDescriptor sectionSetDescriptor : getProvidedSectionSets()) {
			SectionSetDescriptorState descriptorState = new SectionSetDescriptorState(sectionSetDescriptor);
			sectionSetDescriptorStates.add(descriptorState);
		}
	}

	/**
	 * Returns the sectionSetDescriptorStates
	 * 
	 * @return the sectionSetDescriptorStates
	 */
	public List<SectionSetDescriptorState> getSectionSetDescriptorStates() {
		return sectionSetDescriptorStates;
	}
}
