/**
 * Copyright (c) 2014 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *  CEA LIST - Initial API and implementation
 */
package org.eclipse.papyrus.uml.diagram.usecase.part;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.infra.gmfdiag.common.structure.DiagramStructure;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.AbstractionEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.AbstractionNameEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.ActorAppliedStereotypeEditPartTN;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.ActorAsRectangleEditPartTN;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.ActorAsRectangleNameEditPartTN;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.ActorEditPartTN;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.ActorFloatingLabelEditPartTN;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.ActorInComponentAppliedStereotypeEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.ActorInComponentEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.ActorInComponentFloatingLabelEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.ActorInComponentNameEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.ActorInPackageAppliedStereotypeEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.ActorInPackageEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.ActorInPackageFloatingLabelEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.ActorInPackageNameEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.ActorNameEditPartTN;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.ActorQualifiedNameEditPartTN;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.ActorQualifiedNameInCEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.ActorQualifiedNameInPEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.AppliedStereotypeAbstractionEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.AppliedStereotypePackageMergeEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.AppliedStereotypeUsageEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.AssociationAppliedStereotypeEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.AssociationEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.AssociationNameEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.CommentBodyEditPartCN;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.CommentBodyEditPartTN;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.CommentEditPartCN;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.CommentEditPartTN;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.ComponentInComponentEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.ComponentInComponentNameEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.ComponentInPackageEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.ComponentInPackageFloatingLabelEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.ComponentInPackageNameEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.ComponentUsecases2EditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.ComponentUsecases3EditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.ConstraintBodyEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.ConstraintBodyInCEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.ConstraintBodyInPEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.ConstraintEditPartTN;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.ConstraintInComponentEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.ConstraintInComponentNameEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.ConstraintInPackageEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.ConstraintInPackageNameEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.ConstraintNameEditPartTN;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.DefaultNamedElementEditPartTN;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.DefaultNamedElementNameEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.DependencyAppliedStereotypeEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.DependencyEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.DependencyNameEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.DiagramNameEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.ExtendAppliedStereotypeEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.ExtendEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.ExtendsLink_fixedEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.ExtensionPointEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.ExtensionPointInRectangleEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.GeneralizationAppliedStereotypeEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.GeneralizationEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.IncludeAppliedStereotypeEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.IncludeEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.IncludeLink_fixedEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.PackageEditPartCN;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.PackageEditPartTN;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.PackageImportAppliedStereotypeEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.PackageImportEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.PackageMergeEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.PackageNameEditPartCN;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.PackageNameEditPartTN;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.PackagePackageableElementCompartment2EditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.PackagePackageableElementCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.RealizationAppliedStereotypeEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.RealizationEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.RealizationNameEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.ShortCutDiagramEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.SubjectClassifierEditPartTN;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.SubjectClassifierFloatingLabelEditPartTN;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.SubjectClassifierNameEditPartTN;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.SubjectComponentUsecasesEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.UsageEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.UsageNameEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.UseCaseAsRectangleEditPartTN;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.UseCaseAsRectangleNameEditPartTN;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.UseCaseDiagramEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.UseCaseEditPartTN;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.UseCaseFloatingLabelEditPartTN;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.UseCaseInComponentEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.UseCaseInComponentFloatingLabelEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.UseCaseInComponentNameEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.UseCaseInPackageEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.UseCaseInPackageFloatingLabelEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.UseCaseInPackageNameEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.UseCaseNameEditPartTN;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.UseCasePointsEditPartTN;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.UseCasePointsInComponentEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.UseCasePointsInPackageEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.UseCasePointsInRectangleEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.expressions.UMLOCLFactory;
import org.eclipse.uml2.uml.Abstraction;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Realization;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.Usage;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 *
 * @generated
 */
public class UMLVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "org.eclipse.papyrus.uml.diagram.usecase/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static String getVisualID(View view) {
		if (view instanceof Diagram) {
			if (UseCaseDiagramEditPart.MODEL_ID.equals(view.getType())) {
				return UseCaseDiagramEditPart.VISUAL_ID;
			} else {
				return "";
			}
		}
		return org.eclipse.papyrus.uml.diagram.usecase.part.UMLVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static String getVisualID(String type) {
		return type;
	}

	/**
	 * @generated
	 */
	public static String getType(String visualID) {
		return visualID;
	}

	/**
	 * @generated
	 */
	public static String getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return "";
		}
		return UseCaseDiagramEditPart.VISUAL_ID;
	}

	/**
	 * @generated
	 */
	public static String getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return "";
		}
		String containerModelID = org.eclipse.papyrus.uml.diagram.usecase.part.UMLVisualIDRegistry.getModelID(containerView);
		if (!UseCaseDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			return "";
		}
		String containerVisualID;
		if (UseCaseDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.eclipse.papyrus.uml.diagram.usecase.part.UMLVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = UseCaseDiagramEditPart.VISUAL_ID;
			} else {
				return "";
			}
		}
		if (containerVisualID != null) {
			switch (containerVisualID) {
			case UseCaseDiagramEditPart.VISUAL_ID:
				if (UMLPackage.eINSTANCE.getActor().isSuperTypeOf(domainElement.eClass())) {
					return ActorEditPartTN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getActor().isSuperTypeOf(domainElement.eClass())) {
					return ActorAsRectangleEditPartTN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getUseCase().isSuperTypeOf(domainElement.eClass())) {
					return UseCaseEditPartTN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getUseCase().isSuperTypeOf(domainElement.eClass())) {
					return UseCaseAsRectangleEditPartTN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getClassifier().isSuperTypeOf(domainElement.eClass())) {
					return SubjectClassifierEditPartTN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getPackage().isSuperTypeOf(domainElement.eClass())) {
					return PackageEditPartTN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getConstraint().isSuperTypeOf(domainElement.eClass())) {
					return ConstraintEditPartTN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getComment().isSuperTypeOf(domainElement.eClass())) {
					return CommentEditPartTN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getNamedElement().isSuperTypeOf(domainElement.eClass())) {
					return DefaultNamedElementEditPartTN.VISUAL_ID;
				}
				if (NotationPackage.eINSTANCE.getDiagram().isSuperTypeOf(domainElement.eClass())) {
					return ShortCutDiagramEditPart.VISUAL_ID;
				}
				break;
			case UseCasePointsEditPartTN.VISUAL_ID:
				if (UMLPackage.eINSTANCE.getExtensionPoint().isSuperTypeOf(domainElement.eClass())) {
					return ExtensionPointEditPart.VISUAL_ID;
				}
				break;
			case UseCasePointsInRectangleEditPart.VISUAL_ID:
				if (UMLPackage.eINSTANCE.getExtensionPoint().isSuperTypeOf(domainElement.eClass())) {
					return ExtensionPointInRectangleEditPart.VISUAL_ID;
				}
				break;
			case SubjectComponentUsecasesEditPart.VISUAL_ID:
				if (UMLPackage.eINSTANCE.getUseCase().isSuperTypeOf(domainElement.eClass())) {
					return UseCaseInComponentEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getComment().isSuperTypeOf(domainElement.eClass())) {
					return CommentEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getConstraint().isSuperTypeOf(domainElement.eClass())) {
					return ConstraintInComponentEditPart.VISUAL_ID;
				}
				break;
			case UseCasePointsInComponentEditPart.VISUAL_ID:
				if (UMLPackage.eINSTANCE.getExtensionPoint().isSuperTypeOf(domainElement.eClass())) {
					return ExtensionPointEditPart.VISUAL_ID;
				}
				break;
			case ComponentUsecases2EditPart.VISUAL_ID:
				if (UMLPackage.eINSTANCE.getUseCase().isSuperTypeOf(domainElement.eClass())) {
					return UseCaseInComponentEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getComponent().isSuperTypeOf(domainElement.eClass())) {
					return ComponentInComponentEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getComment().isSuperTypeOf(domainElement.eClass())) {
					return CommentEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getConstraint().isSuperTypeOf(domainElement.eClass())) {
					return ConstraintInComponentEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getActor().isSuperTypeOf(domainElement.eClass())) {
					return ActorInComponentEditPart.VISUAL_ID;
				}
				break;
			case UseCasePointsInPackageEditPart.VISUAL_ID:
				if (UMLPackage.eINSTANCE.getExtensionPoint().isSuperTypeOf(domainElement.eClass())) {
					return ExtensionPointEditPart.VISUAL_ID;
				}
				break;
			case ComponentUsecases3EditPart.VISUAL_ID:
				if (UMLPackage.eINSTANCE.getUseCase().isSuperTypeOf(domainElement.eClass())) {
					return UseCaseInComponentEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getComponent().isSuperTypeOf(domainElement.eClass())) {
					return ComponentInComponentEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getComment().isSuperTypeOf(domainElement.eClass())) {
					return CommentEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getConstraint().isSuperTypeOf(domainElement.eClass())) {
					return ConstraintInComponentEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getActor().isSuperTypeOf(domainElement.eClass())) {
					return ActorInComponentEditPart.VISUAL_ID;
				}
				break;
			case PackagePackageableElementCompartment2EditPart.VISUAL_ID:
				if (UMLPackage.eINSTANCE.getConstraint().isSuperTypeOf(domainElement.eClass())) {
					return ConstraintInPackageEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getActor().isSuperTypeOf(domainElement.eClass())) {
					return ActorInPackageEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getUseCase().isSuperTypeOf(domainElement.eClass())) {
					return UseCaseInPackageEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getComponent().isSuperTypeOf(domainElement.eClass())) {
					return ComponentInPackageEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getPackage().isSuperTypeOf(domainElement.eClass())) {
					return PackageEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getComment().isSuperTypeOf(domainElement.eClass())) {
					return CommentEditPartCN.VISUAL_ID;
				}
				break;
			case PackagePackageableElementCompartmentEditPart.VISUAL_ID:
				if (UMLPackage.eINSTANCE.getConstraint().isSuperTypeOf(domainElement.eClass())) {
					return ConstraintInPackageEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getActor().isSuperTypeOf(domainElement.eClass())) {
					return ActorInPackageEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getUseCase().isSuperTypeOf(domainElement.eClass())) {
					return UseCaseInPackageEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getComponent().isSuperTypeOf(domainElement.eClass())) {
					return ComponentInPackageEditPart.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getPackage().isSuperTypeOf(domainElement.eClass())) {
					return PackageEditPartCN.VISUAL_ID;
				}
				if (UMLPackage.eINSTANCE.getComment().isSuperTypeOf(domainElement.eClass())) {
					return CommentEditPartCN.VISUAL_ID;
				}
				break;
			}
		}
		return "";
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, String nodeVisualID) {
		String containerModelID = org.eclipse.papyrus.uml.diagram.usecase.part.UMLVisualIDRegistry.getModelID(containerView);
		if (!UseCaseDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		String containerVisualID;
		if (UseCaseDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.eclipse.papyrus.uml.diagram.usecase.part.UMLVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = UseCaseDiagramEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		if (containerVisualID != null) {
			switch (containerVisualID) {
			case UseCaseDiagramEditPart.VISUAL_ID:
				if (ActorEditPartTN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ActorAsRectangleEditPartTN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (UseCaseEditPartTN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (UseCaseAsRectangleEditPartTN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (SubjectClassifierEditPartTN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (PackageEditPartTN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ConstraintEditPartTN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CommentEditPartTN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DefaultNamedElementEditPartTN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ShortCutDiagramEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case ActorEditPartTN.VISUAL_ID:
				if (ActorNameEditPartTN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ActorAppliedStereotypeEditPartTN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ActorQualifiedNameEditPartTN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ActorFloatingLabelEditPartTN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case ActorAsRectangleEditPartTN.VISUAL_ID:
				if (ActorAsRectangleNameEditPartTN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case UseCaseEditPartTN.VISUAL_ID:
				if (UseCaseNameEditPartTN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (UseCaseFloatingLabelEditPartTN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (UseCasePointsEditPartTN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case UseCaseAsRectangleEditPartTN.VISUAL_ID:
				if (UseCaseAsRectangleNameEditPartTN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (UseCasePointsInRectangleEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case SubjectClassifierEditPartTN.VISUAL_ID:
				if (SubjectClassifierNameEditPartTN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (SubjectClassifierFloatingLabelEditPartTN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (SubjectComponentUsecasesEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case PackageEditPartTN.VISUAL_ID:
				if (PackageNameEditPartTN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (PackagePackageableElementCompartmentEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case ConstraintEditPartTN.VISUAL_ID:
				if (ConstraintNameEditPartTN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ConstraintBodyEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case CommentEditPartTN.VISUAL_ID:
				if (CommentBodyEditPartTN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case DefaultNamedElementEditPartTN.VISUAL_ID:
				if (DefaultNamedElementNameEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case ShortCutDiagramEditPart.VISUAL_ID:
				if (DiagramNameEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case UseCaseInComponentEditPart.VISUAL_ID:
				if (UseCaseInComponentNameEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (UseCaseInComponentFloatingLabelEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (UseCasePointsInComponentEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case ComponentInComponentEditPart.VISUAL_ID:
				if (ComponentInComponentNameEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ComponentUsecases2EditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case CommentEditPartCN.VISUAL_ID:
				if (CommentBodyEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case ConstraintInComponentEditPart.VISUAL_ID:
				if (ConstraintInComponentNameEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ConstraintBodyInCEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case ActorInComponentEditPart.VISUAL_ID:
				if (ActorInComponentNameEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ActorInComponentAppliedStereotypeEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ActorQualifiedNameInCEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ActorInComponentFloatingLabelEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case ConstraintInPackageEditPart.VISUAL_ID:
				if (ConstraintInPackageNameEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ConstraintBodyInPEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case ActorInPackageEditPart.VISUAL_ID:
				if (ActorInPackageNameEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ActorInPackageAppliedStereotypeEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ActorQualifiedNameInPEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ActorInPackageFloatingLabelEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case UseCaseInPackageEditPart.VISUAL_ID:
				if (UseCaseInPackageNameEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (UseCaseInPackageFloatingLabelEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (UseCasePointsInPackageEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case ComponentInPackageEditPart.VISUAL_ID:
				if (ComponentInPackageNameEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ComponentInPackageFloatingLabelEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ComponentUsecases3EditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case PackageEditPartCN.VISUAL_ID:
				if (PackageNameEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (PackagePackageableElementCompartment2EditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case UseCasePointsEditPartTN.VISUAL_ID:
				if (ExtensionPointEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case UseCasePointsInRectangleEditPart.VISUAL_ID:
				if (ExtensionPointInRectangleEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case SubjectComponentUsecasesEditPart.VISUAL_ID:
				if (UseCaseInComponentEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CommentEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ConstraintInComponentEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case UseCasePointsInComponentEditPart.VISUAL_ID:
				if (ExtensionPointEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case ComponentUsecases2EditPart.VISUAL_ID:
				if (UseCaseInComponentEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ComponentInComponentEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CommentEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ConstraintInComponentEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ActorInComponentEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case UseCasePointsInPackageEditPart.VISUAL_ID:
				if (ExtensionPointEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case ComponentUsecases3EditPart.VISUAL_ID:
				if (UseCaseInComponentEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ComponentInComponentEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CommentEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ConstraintInComponentEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ActorInComponentEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case PackagePackageableElementCompartment2EditPart.VISUAL_ID:
				if (ConstraintInPackageEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ActorInPackageEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (UseCaseInPackageEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ComponentInPackageEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (PackageEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CommentEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case PackagePackageableElementCompartmentEditPart.VISUAL_ID:
				if (ConstraintInPackageEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ActorInPackageEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (UseCaseInPackageEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ComponentInPackageEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (PackageEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (CommentEditPartCN.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case IncludeEditPart.VISUAL_ID:
				if (IncludeLink_fixedEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (IncludeAppliedStereotypeEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case ExtendEditPart.VISUAL_ID:
				if (ExtendsLink_fixedEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (ExtendAppliedStereotypeEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case GeneralizationEditPart.VISUAL_ID:
				if (GeneralizationAppliedStereotypeEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case AssociationEditPart.VISUAL_ID:
				if (AssociationNameEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (AssociationAppliedStereotypeEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case DependencyEditPart.VISUAL_ID:
				if (DependencyNameEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (DependencyAppliedStereotypeEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case AbstractionEditPart.VISUAL_ID:
				if (AbstractionNameEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (AppliedStereotypeAbstractionEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case UsageEditPart.VISUAL_ID:
				if (UsageNameEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (AppliedStereotypeUsageEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case RealizationEditPart.VISUAL_ID:
				if (RealizationNameEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				if (RealizationAppliedStereotypeEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case PackageMergeEditPart.VISUAL_ID:
				if (AppliedStereotypePackageMergeEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			case PackageImportEditPart.VISUAL_ID:
				if (PackageImportAppliedStereotypeEditPart.VISUAL_ID.equals(nodeVisualID)) {
					return true;
				}
				break;
			}
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static String getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return "";
		}
		if (UMLPackage.eINSTANCE.getInclude().isSuperTypeOf(domainElement.eClass())) {
			return IncludeEditPart.VISUAL_ID;
		}
		if (UMLPackage.eINSTANCE.getExtend().isSuperTypeOf(domainElement.eClass())) {
			return ExtendEditPart.VISUAL_ID;
		}
		if (UMLPackage.eINSTANCE.getGeneralization().isSuperTypeOf(domainElement.eClass())) {
			return GeneralizationEditPart.VISUAL_ID;
		}
		if (UMLPackage.eINSTANCE.getAssociation().isSuperTypeOf(domainElement.eClass()) && isAssociation_Edge((Association) domainElement)) {
			return AssociationEditPart.VISUAL_ID;
		}
		if (UMLPackage.eINSTANCE.getDependency().isSuperTypeOf(domainElement.eClass()) && isDependency_Edge((Dependency) domainElement)) {
			return DependencyEditPart.VISUAL_ID;
		}
		if (UMLPackage.eINSTANCE.getAbstraction().isSuperTypeOf(domainElement.eClass()) && isAbstraction_Edge((Abstraction) domainElement)) {
			return AbstractionEditPart.VISUAL_ID;
		}
		if (UMLPackage.eINSTANCE.getUsage().isSuperTypeOf(domainElement.eClass()) && isUsage_Edge((Usage) domainElement)) {
			return UsageEditPart.VISUAL_ID;
		}
		if (UMLPackage.eINSTANCE.getRealization().isSuperTypeOf(domainElement.eClass()) && isRealization_Edge((Realization) domainElement)) {
			return RealizationEditPart.VISUAL_ID;
		}
		if (UMLPackage.eINSTANCE.getPackageMerge().isSuperTypeOf(domainElement.eClass())) {
			return PackageMergeEditPart.VISUAL_ID;
		}
		if (UMLPackage.eINSTANCE.getPackageImport().isSuperTypeOf(domainElement.eClass())) {
			return PackageImportEditPart.VISUAL_ID;
		}
		return "";
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static boolean isDiagram(Package element) {
		return true;
	}

	/**
	 * @generated
	 */
	private static boolean isAssociation_Edge(Association domainElement) {
		Object result = UMLOCLFactory.getExpression(2, UMLPackage.eINSTANCE.getAssociation(), null).evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isDependency_Edge(Dependency domainElement) {
		Object result = UMLOCLFactory.getExpression(6, UMLPackage.eINSTANCE.getDependency(), null).evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isAbstraction_Edge(Abstraction domainElement) {
		Object result = UMLOCLFactory.getExpression(8, UMLPackage.eINSTANCE.getAbstraction(), null).evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isUsage_Edge(Usage domainElement) {
		Object result = UMLOCLFactory.getExpression(9, UMLPackage.eINSTANCE.getUsage(), null).evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isRealization_Edge(Realization domainElement) {
		Object result = UMLOCLFactory.getExpression(10, UMLPackage.eINSTANCE.getRealization(), null).evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, String candidate) {
		if (candidate == null) {
			//unrecognized id is always bad
			return false;
		}
		String basic = getNodeVisualID(containerView, domainElement);
		return candidate.equals(basic);
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(String visualID) {
		if (visualID != null) {
			switch (visualID) {
			case UseCasePointsEditPartTN.VISUAL_ID:
			case UseCasePointsInRectangleEditPart.VISUAL_ID:
			case SubjectComponentUsecasesEditPart.VISUAL_ID:
			case UseCasePointsInComponentEditPart.VISUAL_ID:
			case ComponentUsecases2EditPart.VISUAL_ID:
			case UseCasePointsInPackageEditPart.VISUAL_ID:
			case ComponentUsecases3EditPart.VISUAL_ID:
			case PackagePackageableElementCompartment2EditPart.VISUAL_ID:
			case PackagePackageableElementCompartmentEditPart.VISUAL_ID:
				return true;
			}
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(String visualID) {
		if (visualID != null) {
			switch (visualID) {
			case UseCaseDiagramEditPart.VISUAL_ID:
				return false;
			case ActorEditPartTN.VISUAL_ID:
			case ActorAsRectangleEditPartTN.VISUAL_ID:
			case ConstraintEditPartTN.VISUAL_ID:
			case CommentEditPartTN.VISUAL_ID:
			case ShortCutDiagramEditPart.VISUAL_ID:
			case DefaultNamedElementEditPartTN.VISUAL_ID:
			case ExtensionPointEditPart.VISUAL_ID:
			case ExtensionPointInRectangleEditPart.VISUAL_ID:
			case ConstraintInPackageEditPart.VISUAL_ID:
			case ActorInPackageEditPart.VISUAL_ID:
			case CommentEditPartCN.VISUAL_ID:
			case ConstraintInComponentEditPart.VISUAL_ID:
			case ActorInComponentEditPart.VISUAL_ID:
				return true;
			}
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public String getVisualID(View view) {
			return org.eclipse.papyrus.uml.diagram.usecase.part.UMLVisualIDRegistry.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return org.eclipse.papyrus.uml.diagram.usecase.part.UMLVisualIDRegistry.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getNodeVisualID(View containerView, EObject domainElement) {
			return org.eclipse.papyrus.uml.diagram.usecase.part.UMLVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView, EObject domainElement, String candidate) {
			return org.eclipse.papyrus.uml.diagram.usecase.part.UMLVisualIDRegistry.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(String visualID) {
			return org.eclipse.papyrus.uml.diagram.usecase.part.UMLVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(String visualID) {
			return org.eclipse.papyrus.uml.diagram.usecase.part.UMLVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};
}
