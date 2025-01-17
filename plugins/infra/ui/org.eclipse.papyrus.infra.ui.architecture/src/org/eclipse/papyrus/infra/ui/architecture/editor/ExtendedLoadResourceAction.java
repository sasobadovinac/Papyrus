/*****************************************************************************
 * Copyright (c) 2018 CEA LIST and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   CEA LIST - Initial API and implementation
 *   
 *****************************************************************************/

package org.eclipse.papyrus.infra.ui.architecture.editor;

import java.util.Arrays;

import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.action.LoadResourceAction;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.papyrus.infra.architecture.ArchitectureDomainManager;
import org.eclipse.papyrus.infra.core.architecture.provider.ArchitectureEditPlugin;
import org.eclipse.papyrus.infra.ui.architecture.ArchitectureUIPlugin;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

/**
 * @author melaasar
 *
 */
public class ExtendedLoadResourceAction extends LoadResourceAction {
	@Override
	public void run() {
		Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		new ExtendedLoadResourceDialog(shell, domain).open();
	}

	public static class ExtendedLoadResourceDialog extends LoadResourceDialog {
		public ExtendedLoadResourceDialog(Shell parent, EditingDomain domain) {
			super(parent, domain);
		}

		@Override
		protected Control createDialogArea(Composite parent) {
			Composite composite = (Composite) super.createDialogArea(parent);
			Composite buttonComposite = (Composite) composite.getChildren()[0];

			Button browseRegisteredArchitectureButton = new Button(buttonComposite, SWT.PUSH);
			browseRegisteredArchitectureButton.setText(ArchitectureUIPlugin.INSTANCE.getString("_UI_BrowseRegisteredArchitectures_label"));
			prepareBrowseRegisteredArchitecturesButton(browseRegisteredArchitectureButton);
			{
				FormData data = new FormData();
				Control[] children = buttonComposite.getChildren();
				data.right = new FormAttachment(children[0], -CONTROL_OFFSET);
				browseRegisteredArchitectureButton.setLayoutData(data);
			}

			return composite;
		}

		protected void prepareBrowseRegisteredArchitecturesButton(Button browseRegisteredArchitecturesButton) {
			browseRegisteredArchitecturesButton.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent event) {
					RegisteredArchitectureDialog registeredArchitectureDialog = new RegisteredArchitectureDialog(getShell());
					registeredArchitectureDialog.open();
					Object[] results = registeredArchitectureDialog.getResult();
					if (results != null) {
						StringBuffer uris = new StringBuffer();
						for (Object result : results) {
							uris.append(result.toString());
							uris.append("  ");
							break;
						}
						uriField.setText((uriField.getText() + "  " + uris.toString()).trim());
					}
				}
			});
		}
	}

	public static class RegisteredArchitectureDialog extends ElementListSelectionDialog {
		public RegisteredArchitectureDialog(Shell parent) {
			super(parent,
					new LabelProvider() {
						@Override
						public Image getImage(Object element) {
							return ExtendedImageRegistry.getInstance().getImage(ArchitectureEditPlugin.INSTANCE.getImage("full/obj16/ArchitectureDomain"));
						}
					});

			setMultipleSelection(true);
			setMessage(ArchitectureUIPlugin.INSTANCE.getString("_UI_SelectRegisteredArchitecture"));
			setFilter("*");
			setTitle(ArchitectureUIPlugin.INSTANCE.getString("_UI_ArchitectureSelection_label"));
		}

		@Override
		protected Control createDialogArea(Composite parent) {
			Composite result = (Composite) super.createDialogArea(parent);

			Object[] architectures = ArchitectureDomainManager.getInstance().getRegisteredArchitectureModels().toArray(new Object[0]);
			Arrays.sort(architectures);
			setListElements(architectures);

			return result;
		}
	}
}
