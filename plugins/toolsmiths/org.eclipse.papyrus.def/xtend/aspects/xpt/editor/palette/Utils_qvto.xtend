/*****************************************************************************
 * Copyright (c) 2006, 2017 Borland Software Corporation and others
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 * Artem Tikhomirov (Borland) - initial API and implementation
 * Michael Golubev (Montages) - #386838 - migrate to Xtend2
 * Mickael ADAM (ALL4TEC) - mickael.adam@all4tec.net - Bug 510587
 * 
 *****************************************************************************/
package aspects.xpt.editor.palette

import com.google.inject.Singleton
import org.eclipse.core.runtime.IPath
import org.eclipse.core.runtime.Path
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.xmi.XMLResource
import org.eclipse.emf.ecore.xmi.impl.XMLHelperImpl
import org.eclipse.gmf.codegen.gmfgen.AbstractToolEntry
import org.eclipse.gmf.codegen.gmfgen.Palette
import org.eclipse.gmf.codegen.gmfgen.ToolEntry
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry
import org.eclipse.papyrus.infra.types.ExternallyRegisteredType
import org.eclipse.papyrus.infra.types.MetamodelTypeConfiguration
import org.eclipse.papyrus.infra.types.SpecializationTypeConfiguration
import org.eclipse.papyrus.infra.types.core.IConfiguredHintedElementType
import java.util.HashMap
import org.eclipse.emf.ecore.xmi.impl.URIHandlerImpl

@Singleton class Utils_qvto extends xpt.editor.palette.Utils_qvto {

	/**
	 * collect all tools availables and valid to generate the palette. A tool is not valid when it does not create either a link or a node 
	 */
	override Iterable<AbstractToolEntry> collectTools(Palette palette) {
		return collectGroups(palette).map[g|g.entries.filter(typeof(AbstractToolEntry))].flatten.filter [ tool |
			isValidTool(tool)
		]
	}

	def boolean isValidTool(AbstractToolEntry entry) {

		if (entry instanceof ToolEntry) {
			if (null != entry.qualifiedToolName && !entry.qualifiedToolName.empty) {
				return true;
			}

			val links = (entry as ToolEntry).genLinks.size;
			val nodes = (entry as ToolEntry).genNodes.size;
			return nodes + links != 0;
		} else {
			return true;
		}
	}

	def String getToolPath(String it) {
		var String result = null

		/** returns the '/' separator and then the id of the parent group path */
		if (isQuoted(it, '"')) {
			result = it.substring(1, it.length - 1)
		} else {
			result = it
		}

		return "/" + result;
	}

	def boolean isQuoted(String source, String quoteStr) {

		if (quoteStr == null) {
			return false;
		}

		return source.length() >= (quoteStr.length() * 2) && source.startsWith(quoteStr) && source.endsWith(quoteStr);

	}

	def getConstantIDName(String it) {
		if (isQuoted(it, '"')) {
			return getUpperAndUnderscoreString(it.substring(1, it.length() - 1))
		} else {
			return getUpperAndUnderscoreString(it)
		}
	}

	def String getUpperAndUnderscoreString(String value) {
		return value.toUpperCase.replace(".", "_")
	}

	/**
	 * The plateform protocol prefix.
	 */
	var static String PLUGIN_PROTOCOL = "platform:/plugin/"

	/**
	 * Retrieve the bundle id of a platform/plug-in path.
	 * 
	 * @param initialValue 
	 * 				The initial value from which the bundle has to be retrieved
	 * @param defaultValue
	 * 				The default bundle id value if bundle id not found
	 * @return the bundle id
	 */
	def String retrieveBundleId(String initialValue, String defaultValue) {
		var String result = null
		if (initialValue.startsWith(PLUGIN_PROTOCOL)) {
			var String tmp = initialValue.substring(PLUGIN_PROTOCOL.length())
			var int bundleIdEndIndex = tmp.indexOf("/")
			result = tmp.substring(0, bundleIdEndIndex)
		} else {
			result = defaultValue
		}
		return result
	}

	/**
	 * Retrieve the local path of a platform/plug-in path.
	 * 
	 * @param initialValue
	 *            the initial value from which the local path has to be retrieved
	 * @return the local path
	 */
	def String retrieveLocalPath(String initialValue) {
		var String result = ""
		if (initialValue.startsWith(PLUGIN_PROTOCOL)) {
			var String tmp = initialValue.substring(PLUGIN_PROTOCOL.length())
			var int bundleIdEndIndex = tmp.indexOf("/")
			result = tmp.substring(bundleIdEndIndex)
		} else {
			result = initialValue
		}
		return result
	}

	/**
	 * @return The relative path of the model's resource
	 * 
	 * @param it
	 *            the EObject to get the relative path
	 
	 */
	def String getRelativePath(EObject it) {
		var String path = null;
		var URI resourceURI = eResource().getURI()
		if (resourceURI.isPlatformResource()) {
			var String platformString = resourceURI.toPlatformString(true)
			var IPath workspacePath = new Path(platformString)
			workspacePath = workspacePath.removeFirstSegments(1)
			workspacePath = workspacePath.removeLastSegments(1)
			path = workspacePath.toString()
		} else {
			path = "model"
		}
		return path;
	}

	/**
	 * Get the href string for the elementTypeConfiguration model of the unique identifier.
	 */
	def String getElementTypeConfHRef(String uniqueIdentifier, XMLResource resource) {
		
		//Load element type registry
		org.eclipse.papyrus.infra.types.core.registries.ElementTypeSetConfigurationRegistry.getInstance().getClass()
		
		var String href = null
		val type = ElementTypeRegistry.getInstance().getType(uniqueIdentifier)

		if (type instanceof IConfiguredHintedElementType) {
			val xmlHelper = new XMLHelperImpl(resource)
			val options = new HashMap<Object, Object>()
			//Set option to have platform:/ sheme instead of ../../..
			options.put(XMLResource.OPTION_URI_HANDLER, new URIHandlerImpl.PlatformSchemeAware())
			xmlHelper.options = options;
			href = xmlHelper.getHREF(type.configuration as EObject)
		}
		return href;

	}

	/**
	 * Get the href string for the elementTypeConfiguration model of the unique identifier.
	 */
	def String getConfigurationXsiType(String uniqueIdentifier, XMLResource resource) {
		var String type = null
		val eltype = ElementTypeRegistry.getInstance().getType(uniqueIdentifier)
		if (eltype instanceof IConfiguredHintedElementType) {
			var configuration = eltype.configuration
			if (configuration instanceof SpecializationTypeConfiguration) {
				type = "elementtypesconfigurations:SpecializationTypeConfiguration"
			} else if (configuration instanceof MetamodelTypeConfiguration) {
				type = "elementtypesconfigurations:MetamodelTypeConfiguration"
			} else if (configuration instanceof ExternallyRegisteredType) {
				type = "elementtypesconfigurations:ExternallyRegisteredType"
			}
		}
		return type;

	}

}
