/*****************************************************************************
 * Copyright (c) 2006-2013 Borland Software Corporation and others
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 * Dmitry Stadnik (Borland) - initial API and implementation
 * Alexander Shatalin (Borland) - initial API and implementation
 * Michael Golubev (Montages) - #386838 - migrate to Xtend2
 * 
 *****************************************************************************/
package aspects.impl.diagram.editparts

import com.google.inject.Inject
import com.google.inject.Singleton
import org.eclipse.gmf.codegen.gmfgen.DesignLabelModelFacet
import org.eclipse.gmf.codegen.gmfgen.GenCommonBase
import org.eclipse.gmf.codegen.gmfgen.GenDiagram
import org.eclipse.gmf.codegen.gmfgen.GenExternalNodeLabel
import org.eclipse.gmf.codegen.gmfgen.GenLinkLabel
import org.eclipse.gmf.codegen.gmfgen.LabelModelFacet
import org.eclipse.gmf.codegen.gmfgen.ParentAssignedViewmap
import org.eclipse.gmf.codegen.gmfgen.Viewmap
import xpt.CodeStyle
import xpt.Common
import xpt.Common_qvto
import xpt.diagram.ViewmapAttributesUtils_qvto
import xpt.providers.ElementTypes

//DOCUMENTATION: PapyrusGencode
//This template has been modified to take in account the possibility to have extended direct editors

@Singleton class TextAware extends impl.diagram.editparts.TextAware {
	@Inject extension Common

	@Inject extension CodeStyle

	@Inject extension ViewmapAttributesUtils_qvto

	@Inject extension Common_qvto 
	
	@Inject ElementTypes xptElementTypes;
	
	override fields(GenCommonBase it)'''
	«generatedMemberComment»
	private org.eclipse.gef.tools.DirectEditManager manager;

	«generatedMemberComment»
	private org.eclipse.gmf.runtime.common.ui.services.parser.IParser parser;

	«generatedMemberComment»
	private java.util.List<?> parserElements;

	«generatedMemberComment»
	private String defaultText;
	
	«««	BEGIN: PapyrusGenCode
	«««	Add attributes to manage extended editors
	«generatedMemberComment('direct edition mode (default, undefined, registered editor, etc.)')»
	protected int directEditionMode = org.eclipse.papyrus.uml.diagram.common.editpolicies.IDirectEdition.UNDEFINED_DIRECT_EDITOR;

	«generatedMemberComment('configuration from a registered edit dialog')»
	protected org.eclipse.papyrus.infra.gmfdiag.extensionpoints.editors.configuration.IDirectEditorConfiguration configuration;
	«««	END: BEGIN: PapyrusGenCode
	
''' 
	override methods(GenCommonBase it, boolean needsRefreshBounds, boolean readOnly, boolean useElementIcon, Viewmap viewmap,
		LabelModelFacet modelFacet, GenCommonBase host, GenDiagram diagram) '''
		
	«getLabelTextHelper(it)»
	
	«setLabelTextHelper(it)»
	
	«getLabelIconHelper(it)»
	
	«setLabelIconHelper(it)»
	
	« labelSetter(it)»
	
	« getModelChildren(it)»
	
	« getChildBySemanticHint(it)»
«««	ITEMIS CHANGES
	« setParser (it)»
«««	ITEMIS CHANGES END
	« getParserElement(it,modelFacet)»
	
	« getLabelIcon(it,useElementIcon, diagram)»
	
	« getLabelText(it)»
	
	« setLabelText(it,diagram)»
	
	« getEditText(it)»
	
	« isEditable(it,readOnly)»
	
	« getEditTextValidator(it)»
	
	« getCompletionProcessor(it)»
	
	« getParserOptions(it)»
	
	« getParser(it,modelFacet, diagram, host)»
	
	« getManager(it,diagram)»
	
	« setManager(it)»
	
	« performDirectEdit(it)»
	
	« performDirectEditAtPoint(it)»
	
	« performDirectEditWithInitialChar(it)»
	
	« performDirectEditRequest(it,diagram)»
	
	« initializeDirectEditManager(it)»
	
	« refreshVisuals(it,needsRefreshBounds)»
	
	« refreshLabel(it,diagram)»
	
	« refreshUnderline(it)»
	
	« refreshStrikeThrough(it)»
	
	« refreshFont(it)»
	
	« setFontColor(it)»
	
	« addSemanticListeners(it)»
	
	« removeSemanticListeners(it)»
	
	« getAccessibleEditPart(it)»
	
	« getFontStyleOwnerView(it,viewmap)»
	
	«««	BEGIN: PapyrusGenCode
	«««	Add extended editors management for direct edit
	« getDirectEditionType(it,readOnly)»
	
	« checkExtendedEditor(it)»

	« checkDefaultEdition(it)»

	« initExtendedEditorConfiguration(it)»
	
	« updateExtendedEditorConfiguration(it)»
	
	« performDefaultDirectEditorEdit(it)»
	
	«««END: PapyrusGenCode
'''

def labelSetterName(ParentAssignedViewmap it) '''
«IF setterName != null»«setterName»«ELSE»setLabel«ENDIF»
'''

override labelSetterName(Viewmap it)'''setLabel'''

override getLabelTextHelper (GenCommonBase it)'''
	« generatedMemberComment»
	protected String getLabelTextHelper(org.eclipse.draw2d.IFigure figure) {
		if (figure instanceof org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel) {
			return ((org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel) figure).getText();
		} else if (figure instanceof org.eclipse.papyrus.uml.diagram.common.figure.node.ILabelFigure) {
			return ((org.eclipse.papyrus.uml.diagram.common.figure.node.ILabelFigure) figure).getText();
		} else {
			return ((org.eclipse.draw2d.Label) figure).getText();
		}
	}
'''

override setLabelTextHelper (GenCommonBase it)'''
	«generatedMemberComment»
	protected void setLabelTextHelper(org.eclipse.draw2d.IFigure figure, String text) {
		if (figure instanceof org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel) {
			((org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel) figure).setText(text);
		} else if (figure instanceof org.eclipse.papyrus.uml.diagram.common.figure.node.ILabelFigure) {
			((org.eclipse.papyrus.uml.diagram.common.figure.node.ILabelFigure) figure).setText(text);
		} else {
			((org.eclipse.draw2d.Label) figure).setText(text);
		}
	}
'''

override getLabelIconHelper (GenCommonBase it)'''
	«generatedMemberComment»
	protected org.eclipse.swt.graphics.Image getLabelIconHelper(org.eclipse.draw2d.IFigure figure) {
		if (figure instanceof org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel) {
			return ((org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel) figure).getIcon();
		} else if (figure instanceof org.eclipse.papyrus.uml.diagram.common.figure.node.ILabelFigure) {
			return ((org.eclipse.papyrus.uml.diagram.common.figure.node.ILabelFigure) figure).getIcon();
		} else {
			return ((org.eclipse.draw2d.Label) figure).getIcon();
		}
	}
'''

override setLabelIconHelper (GenCommonBase it)'''
	«generatedMemberComment»
	protected void setLabelIconHelper(org.eclipse.draw2d.IFigure figure, org.eclipse.swt.graphics.Image icon) {
		if (figure instanceof org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel) {
			((org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel) figure).setIcon(icon);
		} else if (figure instanceof org.eclipse.papyrus.uml.diagram.common.figure.node.ILabelFigure) {
			((org.eclipse.papyrus.uml.diagram.common.figure.node.ILabelFigure) figure).setIcon(icon);
		} else {
			((org.eclipse.draw2d.Label) figure).setIcon(icon);
		}
	}
'''

override labelSetter (GenCommonBase it)'''
	«generatedMemberComment»
	public void « labelSetterName (viewmap)»(« labelSetterFigureClassName(viewmap)» figure) {
		unregisterVisuals();
		setFigure(figure);
		defaultText = getLabelTextHelper(figure);
		registerVisuals();
		refreshVisuals();
	}
'''

def labelSetterFigureClassName (ParentAssignedViewmap it)'''
	«IF figureQualifiedClassName != null»
	«figureQualifiedClassName»
	«ELSE»
	org.eclipse.draw2d.IFigure
	«ENDIF»
'''

override labelSetterFigureClassName (Viewmap it)'''
	org.eclipse.draw2d.IFigure
'''

override getModelChildren (GenCommonBase it)'''
	«generatedMemberComment»
	protected java.util.List<?> getModelChildren() {
		return java.util.Collections.EMPTY_LIST;
	}
'''

override getChildBySemanticHint (GenCommonBase it)'''
	«generatedMemberComment»
	public org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart getChildBySemanticHint(String semanticHint) {
		return null;
	}
'''

def setParser (GenCommonBase it)'''
	«generatedMemberComment»
	public void setParser(org.eclipse.gmf.runtime.common.ui.services.parser.IParser parser) {
		this.parser = parser;
	}
'''

override getParserElement(GenCommonBase it, LabelModelFacet modelFacet) '''
	«generatedMemberComment»
	protected org.eclipse.emf.ecore.EObject getParserElement() {
	«IF modelFacet == null»
		org.eclipse.emf.ecore.EObject element = resolveSemanticElement();
		return element != null ? element : (org.eclipse.gmf.runtime.notation.View) getModel();
	«ELSE»« getParserElement(modelFacet)»«ENDIF»
	}
'''

def getParserElement (LabelModelFacet it)'''
		return resolveSemanticElement();
'''

def getParserElement (DesignLabelModelFacet it)'''
		return (org.eclipse.gmf.runtime.notation.View) getModel();
'''

override getLabelIcon(GenCommonBase it,boolean useElementIcon, GenDiagram diagram ) '''
	«generatedMemberComment»
	protected org.eclipse.swt.graphics.Image getLabelIcon() {
		«IF useElementIcon»
			«««	START: PapyrusGenCode
			return org.eclipse.papyrus.infra.gmfdiag.common.utils.DiagramEditPartsUtil.getIcon(getParserElement(), getViewer());
			«««	END: PapyrusGenCode
		«ELSE»
		return null;
		«ENDIF»
	}
'''

override getLabelText (GenCommonBase it)'''
	«generatedMemberComment»
	protected String getLabelText() {
		String text = null;
		org.eclipse.emf.ecore.EObject parserElement = getParserElement();
		if (parserElement != null && getParser() != null) {
			text = getParser().getPrintString(
				org.eclipse.papyrus.infra.gmfdiag.common.parsers.ParserUtil.getParserAdapter(getParserElement(), this),
				getParserOptions().intValue());
		}
		if (text == null || text.length() == 0) {
			text = defaultText;
		}
		return text;
	}
'''

override setLabelText(GenCommonBase it, GenDiagram diagram) '''
	«generatedMemberComment»
	public void setLabelText(String text) {
		setLabelTextHelper(getFigure(), text);
		Object pdEditPolicy = getEditPolicy(org.eclipse.gef.EditPolicy.PRIMARY_DRAG_ROLE);
		if (pdEditPolicy instanceof «diagram.getTextSelectionEditPolicyQualifiedClassName()») {
			((«diagram.getTextSelectionEditPolicyQualifiedClassName()») pdEditPolicy).refreshFeedback();
		}
		Object sfEditPolicy = getEditPolicy(org.eclipse.gef.EditPolicy.SELECTION_FEEDBACK_ROLE);
		if (sfEditPolicy instanceof «diagram.getTextSelectionEditPolicyQualifiedClassName()») {
			((«diagram.getTextSelectionEditPolicyQualifiedClassName()») sfEditPolicy).refreshFeedback();
		}
	}
'''

override getEditText (GenCommonBase it)'''
	«generatedMemberComment»
	public String getEditText() {
		if (getParserElement() == null || getParser() == null) {
			return ""; «nonNLS»
		}
		return getParser().getEditString(
			org.eclipse.papyrus.infra.gmfdiag.common.parsers.ParserUtil.getParserAdapter(getParserElement(), this),
			getParserOptions().intValue());
	}
'''

def isEditable(GenCommonBase it, boolean readOnly ) '''
	«generatedMemberComment»
	protected boolean isEditable() {
		«IF readOnly»
		return false;
		«ELSE»
			return getParser() != null;
		«ENDIF»
	}
'''

override getEditTextValidator (GenCommonBase it)'''
	«generatedMemberComment»
	public org.eclipse.jface.viewers.ICellEditorValidator getEditTextValidator() {
		return new org.eclipse.jface.viewers.ICellEditorValidator() {

			«overrideI»
			public String isValid(final Object value) {
				if (value instanceof String) {
					final org.eclipse.emf.ecore.EObject element = getParserElement();
					final org.eclipse.gmf.runtime.common.ui.services.parser.IParser parser = getParser();
					try {
						org.eclipse.gmf.runtime.common.ui.services.parser.IParserEditStatus valid =
							(org.eclipse.gmf.runtime.common.ui.services.parser.IParserEditStatus) getEditingDomain().runExclusive(
								new org.eclipse.emf.transaction.RunnableWithResult.Impl<java.lang.Object>() {

							«overrideI»
							public void run() {
								setResult(parser.isValidEditString(org.eclipse.papyrus.infra.gmfdiag.common.parsers.ParserUtil.getParserAdapter(getParserElement(), «editPartClassName».this), (String) value));
							}
						});
						return valid.getCode() == org.eclipse.gmf.runtime.common.ui.services.parser.IParserEditStatus.EDITABLE ? null : valid.getMessage();
					} catch (InterruptedException ie) {
						ie.printStackTrace();
					}
				}

				// shouldn't get here
				return null;
			}
		};
	}
'''

override getCompletionProcessor (GenCommonBase it)'''
	«generatedMemberComment»
	public org.eclipse.jface.text.contentassist.IContentAssistProcessor getCompletionProcessor() {
		if (getParserElement() == null || getParser() == null) {
			return null;
		}
		return getParser().getCompletionProcessor(org.eclipse.papyrus.infra.gmfdiag.common.parsers.ParserUtil.getParserAdapter(getParserElement(), this));
	}
'''

override getParserOptions (GenCommonBase it)'''
	«generatedMemberComment»
	public org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions getParserOptions() {
		return org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions.NONE;
	}
'''

override getParser(GenCommonBase it, LabelModelFacet modelFacet, GenDiagram diagram , GenCommonBase host ) '''
	«generatedMemberComment»
	public org.eclipse.gmf.runtime.common.ui.services.parser.IParser getParser() {
		if (parser == null) {
			parser = org.eclipse.papyrus.infra.gmfdiag.common.parsers.ParserUtil.getParser(«xptElementTypes.accessElementType(host)», getParserElement(), this, VISUAL_ID);
		}
		return parser;
	}
'''

def getManager(GenCommonBase it,GenDiagram diagram) '''
	«generatedMemberComment»
	protected org.eclipse.gef.tools.DirectEditManager getManager() {
		if (manager == null) {
			setManager(new org.eclipse.papyrus.uml.diagram.common.directedit.MultilineLabelDirectEditManager(this,
				org.eclipse.papyrus.uml.diagram.common.directedit.MultilineLabelDirectEditManager.getTextCellEditorClass(this),
				«diagram.getEditPartFactoryQualifiedClassName()».getTextCellEditorLocator(this)));
		}
		return manager;
	}
'''

override setManager (GenCommonBase it)'''
	«generatedMemberComment»
	protected void setManager(org.eclipse.gef.tools.DirectEditManager manager) {
		this.manager = manager;
	}
'''

override performDirectEdit (GenCommonBase it)'''
	«generatedMemberComment»
	protected void performDirectEdit() {
		org.eclipse.swt.custom.BusyIndicator.showWhile(org.eclipse.swt.widgets.Display.getDefault(), new java.lang.Runnable() {
					
			«overrideI»
			public void run() {
				getManager().show();
			}
		});
	}
'''
	
def performDirectEditAtPoint (GenCommonBase it)'''
	«generatedMemberComment»
	protected void performDirectEdit(org.eclipse.draw2d.geometry.Point eventLocation) {
		if (getManager() instanceof org.eclipse.gmf.runtime.diagram.ui.tools.TextDirectEditManager) {
			((org.eclipse.gmf.runtime.diagram.ui.tools.TextDirectEditManager) getManager()).show(eventLocation.getSWTPoint());
		}
	}
'''
	
override performDirectEditWithInitialChar (GenCommonBase it)'''
	«generatedMemberComment»
	protected void performDirectEdit(char initialCharacter) {
		if (getManager() instanceof org.eclipse.gmf.runtime.diagram.ui.tools.TextDirectEditManager) {
			((org.eclipse.gmf.runtime.diagram.ui.tools.TextDirectEditManager) getManager()).show(initialCharacter);
		} else {
			performDirectEdit();
		}
	}
'''
	
def performDirectEditRequest(GenCommonBase it, GenDiagram diagram ) '''
	«generatedMemberComment»
	protected void performDirectEditRequest(org.eclipse.gef.Request request) {
		
		final org.eclipse.gef.Request theRequest = request;

		if (org.eclipse.papyrus.uml.diagram.common.editpolicies.IDirectEdition.UNDEFINED_DIRECT_EDITOR == directEditionMode) {
			directEditionMode = getDirectEditionType();
		}
		switch (directEditionMode) {
		case org.eclipse.papyrus.uml.diagram.common.editpolicies.IDirectEdition.NO_DIRECT_EDITION:
			// no direct edition mode => does nothing
			return;
		case org.eclipse.papyrus.uml.diagram.common.editpolicies.IDirectEdition.EXTENDED_DIRECT_EDITOR:
			updateExtendedEditorConfiguration();
			if (configuration == null || configuration.getLanguage() == null) {
				// Create default edit manager
				setManager(new org.eclipse.papyrus.uml.diagram.common.directedit.MultilineLabelDirectEditManager(this,
				org.eclipse.papyrus.uml.diagram.common.directedit.MultilineLabelDirectEditManager.getTextCellEditorClass(this),
				«diagram.getEditPartFactoryQualifiedClassName()».getTextCellEditorLocator(this)));
				performDefaultDirectEditorEdit(theRequest);
			} else {
				configuration.preEditAction(resolveSemanticElement());
				org.eclipse.jface.dialogs.Dialog dialog = null;
				if (configuration instanceof org.eclipse.papyrus.infra.gmfdiag.extensionpoints.editors.configuration.ICustomDirectEditorConfiguration) {
					setManager(((org.eclipse.papyrus.infra.gmfdiag.extensionpoints.editors.configuration.ICustomDirectEditorConfiguration) configuration).createDirectEditManager(this));
					initializeDirectEditManager(theRequest);
					return;
				} else if (configuration instanceof org.eclipse.papyrus.infra.gmfdiag.extensionpoints.editors.configuration.IPopupEditorConfiguration) {
					org.eclipse.papyrus.infra.gmfdiag.extensionpoints.editors.ui.IPopupEditorHelper helper = ((org.eclipse.papyrus.infra.gmfdiag.extensionpoints.editors.configuration.IPopupEditorConfiguration)configuration).createPopupEditorHelper(this) ;
					helper.showEditor() ;
					return ;
				}
				else if(configuration instanceof org.eclipse.papyrus.infra.gmfdiag.extensionpoints.editors.configuration.IAdvancedEditorConfiguration) {
					dialog = ((org.eclipse.papyrus.infra.gmfdiag.extensionpoints.editors.configuration.IAdvancedEditorConfiguration)configuration).createDialog(org.eclipse.ui.PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), resolveSemanticElement(), configuration.getTextToEdit(resolveSemanticElement()));
				} else if(configuration instanceof org.eclipse.papyrus.infra.gmfdiag.extensionpoints.editors.configuration.IDirectEditorConfiguration) {
					dialog = new org.eclipse.papyrus.infra.gmfdiag.extensionpoints.editors.ui.ExtendedDirectEditionDialog(org.eclipse.ui.PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), resolveSemanticElement(), configuration.getTextToEdit(resolveSemanticElement()), configuration);
				} else {
					return;
				}
				final org.eclipse.jface.dialogs.Dialog finalDialog = dialog;
				
				if (org.eclipse.jface.window.Window.OK == dialog.open()) {
					org.eclipse.emf.transaction.TransactionalEditingDomain domain = getEditingDomain();
					org.eclipse.emf.transaction.RecordingCommand command = new org.eclipse.emf.transaction.RecordingCommand(domain, "Edit Label") {
		
						@Override
						protected void doExecute() {
							configuration.postEditAction(resolveSemanticElement(), ((org.eclipse.papyrus.infra.gmfdiag.extensionpoints.editors.ui.ILabelEditorDialog)finalDialog).getValue());
		
						}
					};
					domain.getCommandStack().execute(command);
				}
			}
			break;
		case org.eclipse.papyrus.uml.diagram.common.editpolicies.IDirectEdition.DEFAULT_DIRECT_EDITOR:
			initializeDirectEditManager(theRequest);
			break;
		default:
			break;
		}
	}
'''

def initializeDirectEditManager (GenCommonBase it)'''
	«generatedMemberComment»
	protected void initializeDirectEditManager(final org.eclipse.gef.Request request) {
		// initialize the direct edit manager
		try {
			getEditingDomain().runExclusive(new Runnable() {
				«overrideI»
				public void run() {
					if (isActive() && isEditable()) {
						if (request.getExtendedData().get(
							org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants.REQ_DIRECTEDIT_EXTENDEDDATA_INITIAL_CHAR) instanceof Character) {
							Character initialChar = (Character) request.getExtendedData().get(org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants.REQ_DIRECTEDIT_EXTENDEDDATA_INITIAL_CHAR);
							performDirectEdit(initialChar.charValue());
						}
						else {
							performDirectEdit();
						}
					}
				}
			});
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
'''
	
def refreshVisuals(GenCommonBase it, boolean needsRefreshBounds ) '''
	«generatedMemberComment»
	protected void refreshVisuals() {
		super.refreshVisuals();
		refreshLabel();
		refreshFont();
		refreshFontColor();
		refreshUnderline();
		refreshStrikeThrough();
		«IF needsRefreshBounds»
		refreshBounds();
		«ENDIF»
	}
'''
	
override refreshLabel(GenCommonBase it , GenDiagram diagram )'''
	«generatedMemberComment»
	protected void refreshLabel() {
		org.eclipse.gef.EditPolicy maskLabelPolicy = getEditPolicy(org.eclipse.papyrus.infra.gmfdiag.common.editpolicies.IMaskManagedLabelEditPolicy.MASK_MANAGED_LABEL_EDIT_POLICY);
		if(maskLabelPolicy==null){
			 maskLabelPolicy = getEditPolicy(org.eclipse.papyrus.infra.gmfdiag.common.editpolicies.IndirectMaskLabelEditPolicy.INDRIRECT_MASK_MANAGED_LABEL);
		}
		if (maskLabelPolicy == null) {
			org.eclipse.gmf.runtime.notation.View view = (org.eclipse.gmf.runtime.notation.View)getModel();
			if(view.isVisible()) {
				setLabelTextHelper(getFigure(), getLabelText());
				setLabelIconHelper(getFigure(), getLabelIcon());
			}
			else {
				setLabelTextHelper(getFigure(), ""); //$NON-NLS-1$
				setLabelIconHelper(getFigure(), null);
			}	
		}
		Object pdEditPolicy = getEditPolicy(org.eclipse.gef.EditPolicy.PRIMARY_DRAG_ROLE);
		if (pdEditPolicy instanceof «diagram.getTextSelectionEditPolicyQualifiedClassName()») {
			((«diagram.getTextSelectionEditPolicyQualifiedClassName()») pdEditPolicy).refreshFeedback();
		}
		Object sfEditPolicy = getEditPolicy(org.eclipse.gef.EditPolicy.SELECTION_FEEDBACK_ROLE);
		if (sfEditPolicy instanceof «diagram.getTextSelectionEditPolicyQualifiedClassName()») {
			((«diagram.getTextSelectionEditPolicyQualifiedClassName()») sfEditPolicy).refreshFeedback();
		}
	}
'''
	
override refreshUnderline (GenCommonBase it)'''
	«generatedMemberComment»
	protected void refreshUnderline() {
		org.eclipse.gmf.runtime.notation.FontStyle style =
			(org.eclipse.gmf.runtime.notation.FontStyle) getFontStyleOwnerView().getStyle(
				org.eclipse.gmf.runtime.notation.NotationPackage.eINSTANCE.getFontStyle());
		if (style != null && getFigure() instanceof org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel) {
			((org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel) getFigure()).setTextUnderline(style.isUnderline());
		}
		if(resolveSemanticElement() instanceof org.eclipse.uml2.uml.Feature){
			if(((org.eclipse.uml2.uml.Feature)resolveSemanticElement()).isStatic()){
				((org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel)getFigure()).setTextUnderline(true);
			}
			else{((org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel)getFigure()).setTextUnderline(false);}
		}
	}
'''
	
override refreshStrikeThrough (GenCommonBase it)'''
	«generatedMemberComment»
	protected void refreshStrikeThrough() {
		org.eclipse.gmf.runtime.notation.FontStyle style =
			(org.eclipse.gmf.runtime.notation.FontStyle) getFontStyleOwnerView().getStyle(
				org.eclipse.gmf.runtime.notation.NotationPackage.eINSTANCE.getFontStyle());
		if (style != null && getFigure() instanceof org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel) {
			((org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel) getFigure()).setTextStrikeThrough(style.isStrikeThrough());
		}
	}
'''
	
override refreshFont (GenCommonBase it)'''
	«generatedMemberComment»
	protected void refreshFont() {
		org.eclipse.gmf.runtime.notation.FontStyle style =
			(org.eclipse.gmf.runtime.notation.FontStyle) getFontStyleOwnerView().getStyle(
				org.eclipse.gmf.runtime.notation.NotationPackage.eINSTANCE.getFontStyle());
		if (style != null) {
			org.eclipse.swt.graphics.FontData fontData = new org.eclipse.swt.graphics.FontData(
				style.getFontName(), style.getFontHeight(),
				(style.isBold() ? org.eclipse.swt.SWT.BOLD : org.eclipse.swt.SWT.NORMAL) |
				(style.isItalic() ? org.eclipse.swt.SWT.ITALIC : org.eclipse.swt.SWT.NORMAL));
			setFont(fontData);
		}
	}
'''
	
override setFontColor (GenCommonBase it)'''
	«generatedMemberComment»
	protected void setFontColor(org.eclipse.swt.graphics.Color color) {
		getFigure().setForegroundColor(color);
	}
'''
	
override addSemanticListeners (GenCommonBase it)'''
	«generatedMemberComment»
	protected void addSemanticListeners() {
		if (getParser() instanceof org.eclipse.gmf.runtime.emf.ui.services.parser.ISemanticParser) {
			org.eclipse.emf.ecore.EObject element = resolveSemanticElement();
			parserElements = ((org.eclipse.gmf.runtime.emf.ui.services.parser.ISemanticParser) getParser()).getSemanticElementsBeingParsed(element);
			for (int i = 0; i < parserElements.size(); i++) {
				addListenerFilter("SemanticModel" + i, this, (org.eclipse.emf.ecore.EObject) parserElements.get(i)); «nonNLS»
			}
		} else {
			super.addSemanticListeners();
		}
	}
'''
	
override removeSemanticListeners (GenCommonBase it)'''
	«generatedMemberComment»
	protected void removeSemanticListeners() {
		if (parserElements != null) {
			for (int i = 0; i < parserElements.size(); i++) {
				removeListenerFilter("SemanticModel" + i); «nonNLS»
			}
		} else {
			super.removeSemanticListeners();
		}
	}
'''
	
override getAccessibleEditPart (GenCommonBase it)'''
	«generatedMemberComment»
	protected org.eclipse.gef.AccessibleEditPart getAccessibleEditPart() {
		if (accessibleEP == null) {
			accessibleEP = new AccessibleGraphicalEditPart() {

				«overrideC»
				public void getName(org.eclipse.swt.accessibility.AccessibleEvent e) {
					e.result = getLabelTextHelper(getFigure());
				}
			};
		}
		return accessibleEP;
	}
'''
	
override getFontStyleOwnerView(GenCommonBase it, Viewmap viewmap ) '''
	«generatedMemberComment»
	 private org.eclipse.gmf.runtime.notation.View getFontStyleOwnerView() {
		«IF isFixedFont(viewmap)»
		return (org.eclipse.gmf.runtime.notation.View) getModel();
		«ELSE»
		return getPrimaryView();
		«ENDIF»
	 }
'''


//BEGIN: PapyrusGenCode
//Methods for advanced direct edition

def getDirectEditionType(GenCommonBase it, Boolean readOnly) '''
	/**
	 * Returns the kind of associated editor for direct edition.
	 * 
	 * @return an <code>int</code> corresponding to the kind of direct editor, @see org.eclipse.papyrus.uml.diagram.common.editpolicies.IDirectEdition
	 * @generated
	 */
	public int getDirectEditionType() {
		«IF readOnly»
		// The label is read-only (defined in GMFGen model)
		return org.eclipse.papyrus.uml.diagram.common.editpolicies.IDirectEdition.NO_DIRECT_EDITION;
		«ELSE»
		if (checkExtendedEditor()) {
			initExtendedEditorConfiguration();
			return org.eclipse.papyrus.uml.diagram.common.editpolicies.IDirectEdition.EXTENDED_DIRECT_EDITOR;
		}
		if (checkDefaultEdition()) {
			return org.eclipse.papyrus.uml.diagram.common.editpolicies.IDirectEdition.DEFAULT_DIRECT_EDITOR;
		}

		// not a named element. no specific editor => do nothing
		return org.eclipse.papyrus.uml.diagram.common.editpolicies.IDirectEdition.NO_DIRECT_EDITION;
		«ENDIF»
	}
'''

def checkExtendedEditor (GenCommonBase it)'''
	/**
	 * Checks if an extended editor is present.
	 * 
	 * @return <code>true</code> if an extended editor is present.
	 * @generated
	 */
	protected boolean checkExtendedEditor() {
		if (resolveSemanticElement() != null) {
			return org.eclipse.papyrus.infra.gmfdiag.extensionpoints.editors.utils.DirectEditorsUtil.hasSpecificEditorConfiguration(resolveSemanticElement(),this);
		}
		return false;
	}
'''

def checkDefaultEdition (GenCommonBase it)'''
	/**
	 * Checks if a default direct edition is available
	 * 
	 * @return <code>true</code> if a default direct edition is available
	 * @generated
	 */
	protected boolean checkDefaultEdition() {
		return (getParser() != null);
	}
'''

def initExtendedEditorConfiguration (GenCommonBase it)'''
	/**
	 * Initializes the extended editor configuration
	 * @generated
	 */
	protected void initExtendedEditorConfiguration() {
		if (configuration == null) {
			final String languagePreferred = org.eclipse.papyrus.infra.gmfdiag.extensionpoints.editors.Activator.getDefault().getPreferenceStore().getString(org.eclipse.papyrus.infra.gmfdiag.extensionpoints.editors.utils.IDirectEditorsIds.EDITOR_FOR_ELEMENT + resolveSemanticElement().eClass().getInstanceClassName());
			if (languagePreferred != null && !languagePreferred.equals("")) {
				configuration = org.eclipse.papyrus.infra.gmfdiag.extensionpoints.editors.utils.DirectEditorsUtil.findEditorConfiguration(languagePreferred, resolveSemanticElement(), this);
			} else {
				configuration = org.eclipse.papyrus.infra.gmfdiag.extensionpoints.editors.utils.DirectEditorsUtil.findEditorConfiguration(org.eclipse.papyrus.infra.gmfdiag.extensionpoints.editors.utils.IDirectEditorsIds.UML_LANGUAGE, resolveSemanticElement(), this);
			}
		}
	}
'''

def updateExtendedEditorConfiguration (GenCommonBase it)'''
	/**
	 * Updates the preference configuration
	 * @generated
	 */
	protected void updateExtendedEditorConfiguration() {
		String languagePreferred = org.eclipse.papyrus.infra.gmfdiag.extensionpoints.editors.Activator.getDefault().getPreferenceStore().getString(
				org.eclipse.papyrus.infra.gmfdiag.extensionpoints.editors.utils.IDirectEditorsIds.EDITOR_FOR_ELEMENT + resolveSemanticElement().eClass().getInstanceClassName());
		if (languagePreferred != null && !languagePreferred.equals("") && !languagePreferred.equals(configuration.getLanguage())) {
			configuration = org.eclipse.papyrus.infra.gmfdiag.extensionpoints.editors.utils.DirectEditorsUtil.findEditorConfiguration(languagePreferred, resolveSemanticElement(),this);
		} else if (org.eclipse.papyrus.infra.gmfdiag.extensionpoints.editors.utils.IDirectEditorsIds.SIMPLE_DIRECT_EDITOR.equals(languagePreferred)) {
			configuration = null;
		}
	}
'''

def performDefaultDirectEditorEdit (GenCommonBase it)'''
	/**
	* Performs the direct edit usually used by GMF editors.
	* @param theRequest the direct edit request that starts the direct edit system
	* @generated
	*/
	protected void performDefaultDirectEditorEdit(final org.eclipse.gef.Request theRequest) {
		// initialize the direct edit manager
		try {
			getEditingDomain().runExclusive(new Runnable() {

				«overrideI»
				public void run() {
					if (isActive() && isEditable()) {
						if (theRequest.getExtendedData().get(org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants.REQ_DIRECTEDIT_EXTENDEDDATA_INITIAL_CHAR) instanceof Character) {
							Character initialChar = (Character) theRequest.getExtendedData().get(
									org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants.REQ_DIRECTEDIT_EXTENDEDDATA_INITIAL_CHAR);
							performDirectEdit(initialChar.charValue());
						} else if ((theRequest instanceof org.eclipse.gef.requests.DirectEditRequest) && (getEditText().equals(getLabelText()))) {
							org.eclipse.gef.requests.DirectEditRequest editRequest = (org.eclipse.gef.requests.DirectEditRequest) theRequest;
							performDirectEdit(editRequest.getLocation());
						} else {
							performDirectEdit();
						}
					}
				}
			});
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
'''
//END: PapyrusGenCode

}
