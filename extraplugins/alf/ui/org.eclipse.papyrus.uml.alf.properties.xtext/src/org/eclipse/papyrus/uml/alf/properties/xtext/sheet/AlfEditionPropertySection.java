/*****************************************************************************
 * Copyright (c) 2013, 2014 Itemis AG, CEA LIST, and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Itemis -  Initial API and implementation
 *  Ansgar Radermacher - added undo/redo support (inspired by code from Petr Bodnar)
 *  Christian W. Damus (CEA) - bug 323802
 *
 *****************************************************************************/

package org.eclipse.papyrus.uml.alf.properties.xtext.sheet;

import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.properties.sections.AbstractModelerPropertySection;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.uml.alf.properties.xtext.UndoRedoStack;
import org.eclipse.papyrus.uml.alf.properties.xtext.sheet.ui.listeners.CommitButtonSelectionListener;
import org.eclipse.papyrus.uml.alf.properties.xtext.sheet.ui.listeners.EditorFocusListener;
import org.eclipse.papyrus.uml.alf.text.generation.DefaultEditStringRetrievalStrategy;
import org.eclipse.papyrus.uml.alf.transaction.job.AlfJobObserver;
import org.eclipse.papyrus.uml.alf.ui.internal.AlfActivator;
import org.eclipse.papyrus.uml.alf.validation.ModelNamespaceFacade;
import org.eclipse.papyrus.uml.xtext.integration.StyledTextXtextAdapter;
import org.eclipse.papyrus.uml.xtext.integration.core.ContextElementAdapter;
import org.eclipse.papyrus.uml.xtext.integration.core.ContextElementAdapter.IContextElementProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ExtendedModifyEvent;
import org.eclipse.swt.custom.ExtendedModifyListener;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.xtext.resource.XtextResource;

import com.google.inject.Injector;

/**
 * Attention: class has been deactivated, since the additional tab is redundant with the
 * body editor in the standard UML property tab.
 */
public class AlfEditionPropertySection extends
		AbstractModelerPropertySection implements IContextElementProvider {

	private FormToolkit toolkit;

	private Form form;

	private StyledText textControl;

	private Button commitButton;

	private StyledTextXtextAdapter styledTextAdapter;

	final private ContextElementAdapter contextElementAdapter = new ContextElementAdapter(this);

	private UndoRedoStack<ExtendedModifyEvent> undoRedoStack;

	protected boolean isUndo;

	protected boolean isRedo;

	private DefaultEditStringRetrievalStrategy alfSerialization;

	private Injector alfToolingInjector;

	public AlfEditionPropertySection() {
		this.undoRedoStack = new UndoRedoStack<ExtendedModifyEvent>();
		this.alfSerialization = new DefaultEditStringRetrievalStrategy();
		this.alfToolingInjector = AlfActivator.getInstance().getInjector(AlfActivator.ORG_ECLIPSE_PAPYRUS_UML_ALF_ALF);
	}

	public StyledText getEditor() {
		return this.textControl;
	}

	@Override
	public void refresh() {
		/* 1. Update adapters placed over the xtext resource */
		this.updateXtextAdapters(this.textControl);
		/* 2. Compute edit string */
		String serialization = "/*Error: serialization could not be computed*/";
		if (this.eObject != null) {
			serialization = this.alfSerialization.getEditString(this.getEditableObject(this.eObject));
		}
		/* 3. Set up editor content (textControl) */
		this.textControl.setText(serialization);
		if (this.textControl != null) {
			this.textControl.setEnabled(!isReadOnly());
		}
	}
	
	/**
	 * Provide the object that will be edited through the editor. The particular case is for an edited
	 * that is an operation. In this situation we return the implementation (i.e. an activity) of this operation.
	 * This way it is transparent for the user that when editing an operation it can modify both the signature and
	 * its implementation.
	 * 
	 * @param edited
	 * 		  the object that is currently edited
	 * 
	 * @return the real object that will be edited
	 */
	private Element getEditableObject(EObject edited){
		if(edited instanceof Operation){
			return ((Operation)edited).getMethods().get(0);
		}
		return (Element)edited;
	}
	
	/**
	 * Provide the namespace of the element that is given as parameter
	 * 
	 * @param element
	 * 		  the element currently edited
	 * 
	 * @return a namespace
	 */
	private Namespace getNamespace(Element element){
		if(element!=null && element instanceof NamedElement){
			Element edited = this.getEditableObject(element);
			return ((NamedElement)edited).getNamespace();
		}
		return null;
	}

	/**
	 * Associate a context in which the xtext resource containing an ALF model will be validated
	 * 
	 * @param element
	 *        the element currently edited
	 */
	private void installValidationContextFor(Element element) {
		if (this.styledTextAdapter != null) {
			XtextResource resource = this.styledTextAdapter.getFakeResourceContext().getFakeResource();
			if (resource != null) {
				ModelNamespaceFacade.getInstance().createValidationContext(resource, this.getNamespace(element));
			}
		}
	}

	@Override
	public void aboutToBeHidden() {
		super.aboutToBeHidden();
		if (styledTextAdapter != null) {
			styledTextAdapter.getFakeResourceContext().getFakeResource().eAdapters()
					.remove(contextElementAdapter);
		}
	}

	@Override
	public void dispose() {
		super.dispose();
		if (toolkit != null) {
			toolkit.dispose();
		}
	}

	@Override
	public final void createControls(Composite parent,
			TabbedPropertySheetPage aTabbedPropertySheetPage) {
		toolkit = new FormToolkit(parent.getDisplay());
		toolkit.setBorderStyle(SWT.BORDER);
		super.createControls(parent, aTabbedPropertySheetPage);
		GridDataFactory.fillDefaults().grab(true, true).applyTo(parent);
		parent.setLayout(new GridLayout(1, true));
		form = toolkit.createForm(parent);
		toolkit.decorateFormHeading(form);
		GridDataFactory.fillDefaults().grab(true, true).applyTo(form);
		form.getBody().setLayout(new GridLayout(1, false));
		createTextControl(form.getBody());
		this.createPushButton(form.getBody());
	}


	protected void createPushButton(final Composite parent) {
		final AlfJobObserver observer = new AlfJobObserver(this.commitButton);
		this.commitButton = new Button(parent, SWT.PUSH);
		this.commitButton.setText("Commit");
		this.commitButton.setToolTipText("Commit the modifications in your model");
		this.commitButton.setImage(new Image(Display.getDefault(), getClass().getResourceAsStream("/resources/icons/incom_stat.gif")));
		this.commitButton.addSelectionListener(new CommitButtonSelectionListener(this));
		this.commitButton.addDisposeListener(new DisposeListener() {

			@Override
			public void widgetDisposed(DisposeEvent e) {
				Job.getJobManager().removeJobChangeListener(observer);
			}
		});
		Job.getJobManager().addJobChangeListener(new AlfJobObserver(this.commitButton));
	}

	protected void createTextControl(final Composite parent) {

		textControl = new StyledText(parent, SWT.MULTI | SWT.BORDER
				| SWT.V_SCROLL | SWT.WRAP);

		textControl.setAlwaysShowScrollBars(false);
		GridDataFactory.fillDefaults().grab(true, true).hint(parent.getSize())
				.applyTo(textControl);
		textControl.addExtendedModifyListener(new ExtendedModifyListener() {

			public void modifyText(ExtendedModifyEvent event) {
				if (isUndo) {
					undoRedoStack.pushRedo(event);
				} else { // is Redo or a normal user action
					undoRedoStack.pushUndo(event);
					if (!isRedo) {
						undoRedoStack.clearRedo();
						// TODO Switch to treat consecutive characters as one event?
					}
				}
			}
		});

		textControl.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				boolean isCtrl = (e.stateMask & SWT.CTRL) > 0;
				boolean isAlt = (e.stateMask & SWT.ALT) > 0;
				if (isCtrl && !isAlt) {
					boolean isShift = (e.stateMask & SWT.SHIFT) > 0;
					if (e.keyCode == 'z') {
						if (isShift) {
							redo();
						} else {
							undo();
						}
					}
				}
			}
		});

		textControl.addFocusListener(new EditorFocusListener(this));
	}

	protected void undo() {
		if (undoRedoStack.hasUndo()) {
			isUndo = true;
			revertEvent(undoRedoStack.popUndo());
			isUndo = false;
		}
	}

	protected void redo() {
		if (undoRedoStack.hasRedo()) {
			isRedo = true;
			revertEvent(undoRedoStack.popRedo());
			isRedo = false;
		}
	}

	/**
	 * Reverts the given modify event, in the way as the Eclipse text editor
	 * does it.
	 *
	 * @param event
	 */
	private void revertEvent(ExtendedModifyEvent event) {
		textControl.replaceTextRange(event.start, event.length, event.replacedText);
		// (causes the modifyText() listener method to be called)

		textControl.setSelectionRange(event.start, event.replacedText.length());
	}

	protected void updateXtextAdapters(Control styledText) {
		if (styledTextAdapter != null) {
			styledTextAdapter.getFakeResourceContext().getFakeResource().eAdapters().remove(contextElementAdapter);
		}
		styledTextAdapter = new StyledTextXtextAdapter(this.alfToolingInjector);
		styledTextAdapter.getFakeResourceContext().getFakeResource().eAdapters().add(contextElementAdapter);
		this.installValidationContextFor((Element)this.eObject);
		styledTextAdapter.adapt((StyledText) styledText);
	}

	public EObject getContextObject() {
		return this.getEditableObject(this.eObject);
	}

	@Override
	protected boolean isReadOnly() {
		EObject context = getContextObject();
		return (context == null) || EMFHelper.isReadOnly(context) || super.isReadOnly();
	}
}