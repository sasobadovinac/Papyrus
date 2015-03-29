/*****************************************************************************
 * Copyright (c) 2013 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Laurent Wouters laurent.wouters@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.infra.viewpoints.configuration.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ChildCreationExtenderManager;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.papyrus.infra.viewpoints.configuration.ConfigurationFactory;
import org.eclipse.papyrus.infra.viewpoints.configuration.ConfigurationPackage;
import org.eclipse.papyrus.infra.viewpoints.configuration.util.ConfigurationAdapterFactory;
import org.eclipse.papyrus.infra.viewpoints.iso42010.ArchitectureDescription;
import org.eclipse.papyrus.infra.viewpoints.iso42010.ArchitectureFramework;
import org.eclipse.papyrus.infra.viewpoints.iso42010.ArchitectureViewpoint;
import org.eclipse.papyrus.infra.viewpoints.iso42010.Iso42010Package;
import org.eclipse.papyrus.infra.viewpoints.iso42010.util.Iso42010Switch;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfigurationItemProviderAdapterFactory extends ConfigurationAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable, IChildCreationExtender {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This helps manage the child creation extenders.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChildCreationExtenderManager childCreationExtenderManager = new ChildCreationExtenderManager(ConfigurationEditPlugin.INSTANCE, ConfigurationPackage.eNS_URI);

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.papyrus.infra.viewpoints.configuration.PapyrusConfiguration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PapyrusConfigurationItemProvider papyrusConfigurationItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.papyrus.infra.viewpoints.configuration.PapyrusConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPapyrusConfigurationAdapter() {
		if (papyrusConfigurationItemProvider == null) {
			papyrusConfigurationItemProvider = new PapyrusConfigurationItemProvider(this);
		}

		return papyrusConfigurationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.papyrus.infra.viewpoints.configuration.PapyrusViewpoint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PapyrusViewpointItemProvider papyrusViewpointItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.papyrus.infra.viewpoints.configuration.PapyrusViewpoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPapyrusViewpointAdapter() {
		if (papyrusViewpointItemProvider == null) {
			papyrusViewpointItemProvider = new PapyrusViewpointItemProvider(this);
		}

		return papyrusViewpointItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.papyrus.infra.viewpoints.configuration.PapyrusView} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PapyrusViewItemProvider papyrusViewItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.papyrus.infra.viewpoints.configuration.PapyrusView}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPapyrusViewAdapter() {
		if (papyrusViewItemProvider == null) {
			papyrusViewItemProvider = new PapyrusViewItemProvider(this);
		}

		return papyrusViewItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.papyrus.infra.viewpoints.configuration.PapyrusDiagram} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PapyrusDiagramItemProvider papyrusDiagramItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.papyrus.infra.viewpoints.configuration.PapyrusDiagram}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPapyrusDiagramAdapter() {
		if (papyrusDiagramItemProvider == null) {
			papyrusDiagramItemProvider = new PapyrusDiagramItemProvider(this);
		}

		return papyrusDiagramItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.papyrus.infra.viewpoints.configuration.PapyrusSyncTable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PapyrusSyncTableItemProvider papyrusSyncTableItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.papyrus.infra.viewpoints.configuration.PapyrusSyncTable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPapyrusSyncTableAdapter() {
		if (papyrusSyncTableItemProvider == null) {
			papyrusSyncTableItemProvider = new PapyrusSyncTableItemProvider(this);
		}

		return papyrusSyncTableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.papyrus.infra.viewpoints.configuration.PapyrusTable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PapyrusTableItemProvider papyrusTableItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.papyrus.infra.viewpoints.configuration.PapyrusTable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPapyrusTableAdapter() {
		if (papyrusTableItemProvider == null) {
			papyrusTableItemProvider = new PapyrusTableItemProvider(this);
		}

		return papyrusTableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.papyrus.infra.viewpoints.configuration.ModelRule} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelRuleItemProvider modelRuleItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.papyrus.infra.viewpoints.configuration.ModelRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModelRuleAdapter() {
		if (modelRuleItemProvider == null) {
			modelRuleItemProvider = new ModelRuleItemProvider(this);
		}

		return modelRuleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.papyrus.infra.viewpoints.configuration.OwningRule} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OwningRuleItemProvider owningRuleItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.papyrus.infra.viewpoints.configuration.OwningRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOwningRuleAdapter() {
		if (owningRuleItemProvider == null) {
			owningRuleItemProvider = new OwningRuleItemProvider(this);
		}

		return owningRuleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.papyrus.infra.viewpoints.configuration.ChildRule} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChildRuleItemProvider childRuleItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.papyrus.infra.viewpoints.configuration.ChildRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createChildRuleAdapter() {
		if (childRuleItemProvider == null) {
			childRuleItemProvider = new ChildRuleItemProvider(this);
		}

		return childRuleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.papyrus.infra.viewpoints.configuration.PaletteRule} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaletteRuleItemProvider paletteRuleItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.papyrus.infra.viewpoints.configuration.PaletteRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPaletteRuleAdapter() {
		if (paletteRuleItemProvider == null) {
			paletteRuleItemProvider = new PaletteRuleItemProvider(this);
		}

		return paletteRuleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.papyrus.infra.viewpoints.configuration.PathElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PathElementItemProvider pathElementItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.papyrus.infra.viewpoints.configuration.PathElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPathElementAdapter() {
		if (pathElementItemProvider == null) {
			pathElementItemProvider = new PathElementItemProvider(this);
		}

		return pathElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.papyrus.infra.viewpoints.configuration.Category} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CategoryItemProvider categoryItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.papyrus.infra.viewpoints.configuration.Category}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCategoryAdapter() {
		if (categoryItemProvider == null) {
			categoryItemProvider = new CategoryItemProvider(this);
		}

		return categoryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.papyrus.infra.viewpoints.configuration.ModelAutoCreate} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelAutoCreateItemProvider modelAutoCreateItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.papyrus.infra.viewpoints.configuration.ModelAutoCreate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModelAutoCreateAdapter() {
		if (modelAutoCreateItemProvider == null) {
			modelAutoCreateItemProvider = new ModelAutoCreateItemProvider(this);
		}

		return modelAutoCreateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.papyrus.infra.viewpoints.configuration.RootAutoSelect} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RootAutoSelectItemProvider rootAutoSelectItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.papyrus.infra.viewpoints.configuration.RootAutoSelect}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRootAutoSelectAdapter() {
		if (rootAutoSelectItemProvider == null) {
			rootAutoSelectItemProvider = new RootAutoSelectItemProvider(this);
		}

		return rootAutoSelectItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<IChildCreationExtender> getChildCreationExtenders() {
		return childCreationExtenderManager.getChildCreationExtenders();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection<?> getNewChildDescriptors(Object object, EditingDomain editingDomain) {
		return childCreationExtenderManager.getNewChildDescriptors(object, editingDomain);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLocator getResourceLocator() {
		return childCreationExtenderManager;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (papyrusConfigurationItemProvider != null) papyrusConfigurationItemProvider.dispose();
		if (papyrusViewpointItemProvider != null) papyrusViewpointItemProvider.dispose();
		if (papyrusViewItemProvider != null) papyrusViewItemProvider.dispose();
		if (papyrusDiagramItemProvider != null) papyrusDiagramItemProvider.dispose();
		if (papyrusSyncTableItemProvider != null) papyrusSyncTableItemProvider.dispose();
		if (papyrusTableItemProvider != null) papyrusTableItemProvider.dispose();
		if (modelRuleItemProvider != null) modelRuleItemProvider.dispose();
		if (owningRuleItemProvider != null) owningRuleItemProvider.dispose();
		if (childRuleItemProvider != null) childRuleItemProvider.dispose();
		if (paletteRuleItemProvider != null) paletteRuleItemProvider.dispose();
		if (pathElementItemProvider != null) pathElementItemProvider.dispose();
		if (categoryItemProvider != null) categoryItemProvider.dispose();
		if (modelAutoCreateItemProvider != null) modelAutoCreateItemProvider.dispose();
		if (rootAutoSelectItemProvider != null) rootAutoSelectItemProvider.dispose();
	}

	/**
	 * A child creation extender for the {@link Iso42010Package}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class Iso42010ChildCreationExtender implements IChildCreationExtender {
		/**
		 * The switch for creating child descriptors specific to each extended class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected static class CreationSwitch extends Iso42010Switch<Object> {
			/**
			 * The child descriptors being populated.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected List<Object> newChildDescriptors;

			/**
			 * The domain in which to create the children.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected EditingDomain editingDomain;

			/**
			 * Creates the a switch for populating child descriptors in the given domain.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			CreationSwitch(List<Object> newChildDescriptors, EditingDomain editingDomain) {
				this.newChildDescriptors = newChildDescriptors;
				this.editingDomain = editingDomain;
			}

			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			@Override
			public Object caseArchitectureDescription(ArchitectureDescription object) {
				newChildDescriptors.add
					(createChildParameter
						(Iso42010Package.Literals.ARCHITECTURE_DESCRIPTION__VIEWPOINTS,
						 ConfigurationFactory.eINSTANCE.createPapyrusViewpoint()));

				return null;
			}

			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			@Override
			public Object caseArchitectureViewpoint(ArchitectureViewpoint object) {
				newChildDescriptors.add
					(createChildParameter
						(Iso42010Package.Literals.ARCHITECTURE_VIEWPOINT__MODEL_KINDS,
						 ConfigurationFactory.eINSTANCE.createPapyrusView()));

				newChildDescriptors.add
					(createChildParameter
						(Iso42010Package.Literals.ARCHITECTURE_VIEWPOINT__MODEL_KINDS,
						 ConfigurationFactory.eINSTANCE.createPapyrusDiagram()));

				newChildDescriptors.add
					(createChildParameter
						(Iso42010Package.Literals.ARCHITECTURE_VIEWPOINT__MODEL_KINDS,
						 ConfigurationFactory.eINSTANCE.createPapyrusSyncTable()));

				newChildDescriptors.add
					(createChildParameter
						(Iso42010Package.Literals.ARCHITECTURE_VIEWPOINT__MODEL_KINDS,
						 ConfigurationFactory.eINSTANCE.createPapyrusTable()));

				return null;
			}

			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			@Override
			public Object caseArchitectureFramework(ArchitectureFramework object) {
				newChildDescriptors.add
					(createChildParameter
						(Iso42010Package.Literals.ARCHITECTURE_FRAMEWORK__VIEWPOINTS,
						 ConfigurationFactory.eINSTANCE.createPapyrusViewpoint()));

				return null;
			}

			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected CommandParameter createChildParameter(Object feature, Object child) {
				return new CommandParameter(null, feature, child);
			}

		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public Collection<Object> getNewChildDescriptors(Object object, EditingDomain editingDomain) {
			ArrayList<Object> result = new ArrayList<Object>();
			new CreationSwitch(result, editingDomain).doSwitch((EObject)object);
			return result;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public ResourceLocator getResourceLocator() {
			return ConfigurationEditPlugin.INSTANCE;
		}
	}

}