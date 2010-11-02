/*****************************************************************************
 * Copyright (c) 2009 CEA
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Atos Origin - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.diagram.sequence.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.draw2d.AbstractPointListShape;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.LayoutConstraint;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.papyrus.diagram.common.helper.DurationConstraintHelper;
import org.eclipse.papyrus.diagram.common.util.DiagramEditPartsUtil;
import org.eclipse.papyrus.diagram.sequence.edit.parts.ActionExecutionSpecificationEditPart;
import org.eclipse.papyrus.diagram.sequence.edit.parts.BehaviorExecutionSpecificationEditPart;
import org.eclipse.papyrus.diagram.sequence.edit.parts.CombinedFragment2EditPart;
import org.eclipse.papyrus.diagram.sequence.edit.parts.CombinedFragmentEditPart;
import org.eclipse.papyrus.diagram.sequence.edit.parts.ContinuationEditPart;
import org.eclipse.papyrus.diagram.sequence.edit.parts.DestructionEventEditPart;
import org.eclipse.papyrus.diagram.sequence.edit.parts.InteractionEditPart;
import org.eclipse.papyrus.diagram.sequence.edit.parts.InteractionOperandEditPart;
import org.eclipse.papyrus.diagram.sequence.edit.parts.InteractionUseEditPart;
import org.eclipse.papyrus.diagram.sequence.edit.parts.LifelineEditPart;
import org.eclipse.papyrus.diagram.sequence.edit.parts.StateInvariantEditPart;
import org.eclipse.swt.widgets.Display;
import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.uml.CombinedFragment;
import org.eclipse.uml2.uml.Continuation;
import org.eclipse.uml2.uml.DestructionEvent;
import org.eclipse.uml2.uml.DurationConstraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Event;
import org.eclipse.uml2.uml.ExecutionOccurrenceSpecification;
import org.eclipse.uml2.uml.ExecutionSpecification;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.InteractionFragment;
import org.eclipse.uml2.uml.InteractionOperand;
import org.eclipse.uml2.uml.InteractionUse;
import org.eclipse.uml2.uml.Lifeline;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.MessageEnd;
import org.eclipse.uml2.uml.MessageOccurrenceSpecification;
import org.eclipse.uml2.uml.MessageSort;
import org.eclipse.uml2.uml.OccurrenceSpecification;
import org.eclipse.uml2.uml.StateInvariant;
import org.eclipse.uml2.uml.TimeConstraint;
import org.eclipse.uml2.uml.TimeObservation;
import org.eclipse.uml2.uml.UMLPackage;


public class SequenceUtil {

	private static final double MAXIMAL_DISTANCE_FROM_EVENT = 10;

	/**
	 * Title for dialog of block message sort modification error
	 */
	private static final String BLOCK_SORT_MODIFICATION_TITLE = "Forbidden action"; //$NON-NLS-1$

	/**
	 * Message for dialog of block message sort modification error
	 */
	private static final String BLOCK_SORT_MODIFICATION_MSG = "It's impossible to change the message sort."; //$NON-NLS-1$

	/**
	 * Find the container interaction fragment at the given location.
	 * The elements are drawn under the lifeline, but their model container is an interaction.
	 * It can be of type Interaction or InteractionOperand.
	 * 
	 * @param location
	 *        the location
	 * @return the interaction or null
	 */
	public static InteractionFragment findInteractionFragmentContainerAt(Point location, EditPart hostEditPart) {
		Rectangle bounds = new Rectangle();
		bounds.setLocation(location);
		return findInteractionFragmentContainerAt(bounds, hostEditPart);
	}

	/**
	 * Find the container interaction fragment for the given bounds.
	 * The elements are drawn under the lifeline, but their model container is an interaction.
	 * It can be of type Interaction or InteractionOperand.
	 * 
	 * @param bounds
	 *        the bounds
	 * @return the interaction or null
	 */
	@SuppressWarnings("unchecked")
	public static InteractionFragment findInteractionFragmentContainerAt(Rectangle bounds, EditPart hostEditPart) {

		if(hostEditPart == null) {
			return null;
		}

		InteractionFragment container = null;
		HashSet<InteractionFragment> coveredInteractions = new HashSet<InteractionFragment>();

		Set<Entry<Object, EditPart>> allEditPartEntries = hostEditPart.getViewer().getEditPartRegistry().entrySet();
		for(Entry<Object, EditPart> epEntry : allEditPartEntries) {
			EditPart ep = epEntry.getValue();

			if(ep instanceof ShapeEditPart) {
				ShapeEditPart sep = (ShapeEditPart)ep;
				EObject eObject = sep.resolveSemanticElement();

				if(eObject instanceof Interaction || eObject instanceof InteractionOperand) {

					Rectangle figureBounds = getAbsoluteBounds(sep);

					if(figureBounds.contains(bounds)) {
						coveredInteractions.add((InteractionFragment)eObject);
					}
				}
			}
		}

		// for each interaction verify if its children list does not contain an other covered interaction
		// if it doesn't we have found the top-level interaction
		for(InteractionFragment ift : coveredInteractions) {
			boolean subiftFounded = false;
			if(ift instanceof Interaction) {
				for(InteractionFragment subift : ((Interaction)ift).getFragments()) {
					if(subift instanceof CombinedFragment) {
						for(InteractionOperand io : ((CombinedFragment)subift).getOperands()) {
							if(coveredInteractions.contains(io)) {
								subiftFounded = true;
							}
						}
					}
				}
			}
			if(!subiftFounded && ift instanceof InteractionOperand) {
				for(InteractionFragment subift : ((InteractionOperand)ift).getFragments()) {
					if(subift instanceof CombinedFragment) {
						for(InteractionOperand io : ((CombinedFragment)subift).getOperands()) {
							if(coveredInteractions.contains(io)) {
								subiftFounded = true;
							}
						}
					}
				}
			}
			if(!subiftFounded) {
				container = ift;
				break;
			}
		}

		return container;
	}

	/**
	 * Find the location on the lifeline of an interaction fragment
	 * 
	 * @param lifelineEditPart
	 *        the lifeline edit part
	 * @param fragment
	 *        the searched interaction fragment
	 * @return the absolute location or null if not found
	 */
	public static Point findLocationOfEvent(LifelineEditPart lifelineEditPart, InteractionFragment fragment) {
		if(lifelineEditPart == null) {
			return null;
		}
		// Search for corresponding node edit part out of the lifeline.
		if(fragment instanceof CombinedFragment || fragment instanceof Continuation || fragment instanceof InteractionOperand || fragment instanceof InteractionUse || fragment instanceof Interaction) {
			List<View> views = DiagramEditPartsUtil.findViews(fragment, lifelineEditPart.getViewer());
			for(View view : views) {
				EditPart part = DiagramEditPartsUtil.getEditPartFromView(view, lifelineEditPart);
				boolean isCombinedFragment = part instanceof CombinedFragmentEditPart || part instanceof CombinedFragment2EditPart;
				boolean isContinuation = part instanceof ContinuationEditPart;
				boolean isInteractionOperand = part instanceof InteractionOperandEditPart;
				boolean isInteractionUse = part instanceof InteractionUseEditPart;
				boolean isInteraction = part instanceof InteractionEditPart;
				if(isCombinedFragment || isContinuation || isInteractionOperand || isInteractionUse || isInteraction) {
					Rectangle bounds = getAbsoluteBounds((GraphicalEditPart)part);
					return bounds.getTop();
				}
			}
		} else {
			// search on graphical children of the lifeline
			List<?> children = lifelineEditPart.getChildren();
			for(Object child : children) {
				// check destruction event
				if(child instanceof DestructionEventEditPart) {
					EObject destructionEvent = ((GraphicalEditPart)child).resolveSemanticElement();
					EObject lifeline = lifelineEditPart.resolveSemanticElement();
					if(destructionEvent instanceof DestructionEvent && lifeline instanceof Lifeline && fragment instanceof OccurrenceSpecification) {
						Event destEvent = ((OccurrenceSpecification)fragment).getEvent();
						if(destEvent != null && destEvent.equals(destructionEvent)) {
							Rectangle bounds = getAbsoluteBounds((GraphicalEditPart)child);
							return bounds.getCenter();
						}
					}
				}
				// check in children executions
				if(child instanceof ActionExecutionSpecificationEditPart || child instanceof BehaviorExecutionSpecificationEditPart) {
					if(fragment instanceof ExecutionSpecification) {
						// check the execution
						EObject element = ((GraphicalEditPart)child).resolveSemanticElement();
						if(element instanceof ExecutionSpecification) {
							if(fragment.equals(element)) {
								Rectangle bounds = getAbsoluteBounds((GraphicalEditPart)child);
								return bounds.getTop();
							}
						}
					} else if(fragment instanceof ExecutionOccurrenceSpecification) {
						// check start and finish events of the execution
						EObject element = ((GraphicalEditPart)child).resolveSemanticElement();
						if(element instanceof ExecutionSpecification) {
							if(fragment.equals(((ExecutionSpecification)element).getStart())) {
								Rectangle bounds = getAbsoluteBounds((GraphicalEditPart)child);
								return bounds.getTop();
							} else if(fragment.equals(((ExecutionSpecification)element).getFinish())) {
								Rectangle bounds = getAbsoluteBounds((GraphicalEditPart)child);
								return bounds.getBottom();
							}
						}
					} else if(fragment instanceof MessageOccurrenceSpecification) {
						// check messages to and from the execution
						Point loc = findLocationOfMessageOccurrence((GraphicalEditPart)child, (MessageOccurrenceSpecification)fragment);
						if(loc != null) {
							return loc;
						}
					}
				}
				// check in children StateInvariant
				if(child instanceof StateInvariantEditPart) {
					if(fragment instanceof StateInvariant) {
						// check the StateInvariant
						EObject element = ((GraphicalEditPart)child).resolveSemanticElement();
						if(element instanceof StateInvariant) {
							if(fragment.equals(element)) {
								Rectangle bounds = getAbsoluteBounds((GraphicalEditPart)child);
								return bounds.getTop();
							}
						}
					} else if(fragment instanceof MessageOccurrenceSpecification) {
						// check messages to and from the execution
						Point loc = findLocationOfMessageOccurrence((GraphicalEditPart)child, (MessageOccurrenceSpecification)fragment);
						if(loc != null) {
							return loc;
						}
					}
				}
			}
			if(fragment instanceof MessageOccurrenceSpecification) {
				// check messages to and from the lifeline
				Point loc = findLocationOfMessageOccurrence(lifelineEditPart, (MessageOccurrenceSpecification)fragment);
				if(loc != null) {
					return loc;
				}
			}
		}
		return null;
	}

	/**
	 * Get the bounds of an edit part
	 * 
	 * @param part
	 *        edit part to find bounds
	 * @return part's bounds
	 */
	private static Rectangle getAbsoluteBounds(IGraphicalEditPart part) {
		// take bounds from figure
		Rectangle bounds = ((IGraphicalEditPart)part).getFigure().getBounds().getCopy();

		if(((IGraphicalEditPart)part).getNotationView() instanceof Node) {
			// rather take up to date model bounds
			Node node = (Node)((IGraphicalEditPart)part).getNotationView();
			LayoutConstraint cst = node.getLayoutConstraint();
			if(cst instanceof Bounds) {
				Bounds b = (Bounds)cst;
				bounds.x = b.getX();
				bounds.y = b.getY();

				if(b.getHeight() != -1) {
					bounds.height = b.getHeight();
				}
				if(b.getWidth() != -1) {
					bounds.width = b.getWidth();
				}

				Point parentLoc = part.getFigure().getParent().getBounds().getLocation();
				bounds.translate(parentLoc);
			}
		}

		part.getFigure().getParent().translateToAbsolute(bounds);

		return bounds;
	}

	/**
	 * Find the location on a node of a message occurrence specification
	 * 
	 * @param nodeEditPart
	 *        the node edit part which to check incoming and outgoing messages
	 * @param event
	 *        the message occurrence specification
	 * @return the absolute location or null
	 */
	private static Point findLocationOfMessageOccurrence(GraphicalEditPart nodeEditPart, MessageOccurrenceSpecification event) {
		// messages to the node
		List<?> targetConnections = nodeEditPart.getTargetConnections();
		for(Object conn : targetConnections) {
			if(conn instanceof ConnectionNodeEditPart) {
				EObject element = ((ConnectionNodeEditPart)conn).resolveSemanticElement();
				if(element instanceof Message && event.equals(((Message)element).getReceiveEvent())) {
					// finish event of the message
					IFigure figure = ((ConnectionNodeEditPart)conn).getFigure();
					if(figure instanceof AbstractPointListShape) {
						Point end = ((AbstractPointListShape)figure).getEnd().getCopy();
						((AbstractPointListShape)figure).getParent().translateToAbsolute(end);
						return end;
					}
				}
			}
		}
		// messages from the node
		List<?> sourceConnections = nodeEditPart.getSourceConnections();
		for(Object conn : sourceConnections) {
			if(conn instanceof ConnectionNodeEditPart) {
				EObject element = ((ConnectionNodeEditPart)conn).resolveSemanticElement();
				if(element instanceof Message && event.equals(((Message)element).getSendEvent())) {
					// start event of the message
					IFigure figure = ((ConnectionNodeEditPart)conn).getFigure();
					if(figure instanceof AbstractPointListShape) {
						Point start = ((AbstractPointListShape)figure).getStart().getCopy();
						((AbstractPointListShape)figure).getParent().translateToAbsolute(start);
						return start;
					}
				}
			}
		}
		return null;
	}

	/**
	 * Find the occurrence specification covering the lifeline near the given location.
	 * If none is close enough, null is returned.
	 * 
	 * @param location
	 *        the location
	 * @param lifelineEditPart
	 *        the Lifeline edit part
	 * @return an entry with the nearest OccurrenceSpecification(s) and its corresponding location or null if none is close enough
	 */
	public static Entry<Point, List<OccurrenceSpecification>> findNearestEvent(Point location, LifelineEditPart lifelineEditPart) {
		if(lifelineEditPart == null) {
			return null;
		}
		// Map referencing children occurrences by their location on the lifeline.
		Map<Point, List<OccurrenceSpecification>> occurrences = new HashMap<Point, List<OccurrenceSpecification>>();
		// graphical children of the lifeline
		List<?> children = lifelineEditPart.getChildren();
		for(Object child : children) {
			// children executions
			if(child instanceof ActionExecutionSpecificationEditPart || child instanceof BehaviorExecutionSpecificationEditPart) {
				EObject element = ((GraphicalEditPart)child).resolveSemanticElement();
				if(element instanceof ExecutionSpecification) {
					// find start and finish events of the execution
					Rectangle bounds = getAbsoluteBounds((GraphicalEditPart)child);
					if(!occurrences.containsKey(bounds.getTop())) {
						// there should be at most 2 occurrences (with starting message)
						occurrences.put(bounds.getTop(), new ArrayList<OccurrenceSpecification>(2));
					}
					occurrences.get(bounds.getTop()).add(((ExecutionSpecification)element).getStart());
					if(!occurrences.containsKey(bounds.getBottom())) {
						occurrences.put(bounds.getBottom(), new ArrayList<OccurrenceSpecification>(1));
					}
					occurrences.get(bounds.getBottom()).add(((ExecutionSpecification)element).getFinish());
					// messages to and from the execution
					completeOccurrencesMapWithMessages((GraphicalEditPart)child, occurrences);
				}
			}
			// destruction event
			if(child instanceof DestructionEventEditPart) {
				EObject destructionEvent = ((GraphicalEditPart)child).resolveSemanticElement();
				EObject lifeline = lifelineEditPart.resolveSemanticElement();
				if(destructionEvent instanceof DestructionEvent && lifeline instanceof Lifeline) {
					for(InteractionFragment occurence : ((Lifeline)lifeline).getCoveredBys()) {
						if(occurence instanceof OccurrenceSpecification) {
							Event event = ((OccurrenceSpecification)occurence).getEvent();
							if(destructionEvent.equals(event)) {
								Rectangle bounds = getAbsoluteBounds((GraphicalEditPart)child);
								if(!occurrences.containsKey(bounds.getCenter())) {
									occurrences.put(bounds.getCenter(), new ArrayList<OccurrenceSpecification>(2));
								}
								occurrences.get(bounds.getCenter()).add((OccurrenceSpecification)occurence);
								break;
							}
						}
					}
				}
			}
		}
		// messages to and from the lifeline
		completeOccurrencesMapWithMessages(lifelineEditPart, occurrences);

		// Find the nearest object within acceptable distance
		double smallerDistance = MAXIMAL_DISTANCE_FROM_EVENT;
		Entry<Point, List<OccurrenceSpecification>> nearestObject = null;
		for(Entry<Point, List<OccurrenceSpecification>> entry : occurrences.entrySet()) {
			double distance = location.getDistance(entry.getKey());
			if(distance < smallerDistance) {
				smallerDistance = distance;
				nearestObject = entry;
			} else if(distance == smallerDistance && nearestObject != null) {
				// two events at the exact same distance.
				// Keep both so the best one can be used
				if(entry.getValue() instanceof MessageOccurrenceSpecification) {
					nearestObject.getValue().addAll(entry.getValue());
				}
			}
		}

		return nearestObject;
	}

	/**
	 * Complete the map of occurrences and their location, by taking in account messages from and to the node edit part
	 * 
	 * @param nodeEditPart
	 *        part to consider message around
	 * @param occurrencesMap
	 *        the map to complete
	 */
	private static void completeOccurrencesMapWithMessages(GraphicalEditPart nodeEditPart, Map<Point, List<OccurrenceSpecification>> occurrencesMap) {
		// messages to the node
		List<?> targetConnections = nodeEditPart.getTargetConnections();
		for(Object conn : targetConnections) {
			if(conn instanceof ConnectionNodeEditPart) {
				EObject element = ((ConnectionNodeEditPart)conn).resolveSemanticElement();
				if(element instanceof Message && ((Message)element).getReceiveEvent() instanceof MessageOccurrenceSpecification) {
					// finish events of the message
					IFigure figure = ((ConnectionNodeEditPart)conn).getFigure();
					if(figure instanceof AbstractPointListShape) {
						Point end = ((AbstractPointListShape)figure).getEnd().getCopy();
						((AbstractPointListShape)figure).getParent().translateToAbsolute(end);
						if(!occurrencesMap.containsKey(end)) {
							occurrencesMap.put(end, new ArrayList<OccurrenceSpecification>(1));
						}
						occurrencesMap.get(end).add((MessageOccurrenceSpecification)((Message)element).getReceiveEvent());
					}
				}
			}
		}
		// messages from the node
		List<?> sourceConnections = nodeEditPart.getSourceConnections();
		for(Object conn : sourceConnections) {
			if(conn instanceof ConnectionNodeEditPart) {
				EObject element = ((ConnectionNodeEditPart)conn).resolveSemanticElement();
				if(element instanceof Message && ((Message)element).getSendEvent() instanceof MessageOccurrenceSpecification) {
					// start events of the message
					IFigure figure = ((ConnectionNodeEditPart)conn).getFigure();
					if(figure instanceof AbstractPointListShape) {
						Point start = ((AbstractPointListShape)figure).getStart().getCopy();
						((AbstractPointListShape)figure).getParent().translateToAbsolute(start);
						if(!occurrencesMap.containsKey(start)) {
							occurrencesMap.put(start, new ArrayList<OccurrenceSpecification>(1));
						}
						occurrencesMap.get(start).add((MessageOccurrenceSpecification)((Message)element).getSendEvent());
					}
				}
			}
		}
	}

	/**
	 * The position of the part where the event is linked
	 * 
	 * @param occSpec
	 *        the occurrence specification
	 * @param timeElementPart
	 *        the part representing time element (duration/time constraint/observation)
	 * @return one of {@link PositionConstants#TOP}, {@link PositionConstants#CENTER}, {@link PositionConstants#BOTTOM},
	 *         {@link PositionConstants#NONE}
	 */
	public static int positionWhereEventIsLinkedToPart(OccurrenceSpecification occSpec, IBorderItemEditPart timeElementPart) {
		EObject timeElement = timeElementPart.resolveSemanticElement();
		if(timeElement instanceof TimeObservation) {
			if(occSpec.equals(((TimeObservation)timeElement).getEvent())) {
				return PositionConstants.CENTER;
			} else {
				return PositionConstants.NONE;
			}
		} else if(timeElement instanceof TimeConstraint) {
			if(((TimeConstraint)timeElement).getConstrainedElements().contains(occSpec)) {
				return PositionConstants.CENTER;
			} else {
				return PositionConstants.NONE;
			}
		} else if(timeElement instanceof DurationConstraint) {
			if(((DurationConstraint)timeElement).getConstrainedElements().contains(occSpec)) {
				List<Element> events = ((DurationConstraint)timeElement).getConstrainedElements();
				LifelineEditPart lifelinePart = getParentLifelinePart(timeElementPart);
				if(lifelinePart != null && events.size() >= 2) {
					OccurrenceSpecification otherEvent = null;
					if(!occSpec.equals(events.get(0)) && events.get(0) instanceof OccurrenceSpecification) {
						otherEvent = (OccurrenceSpecification)events.get(0);
					} else if(!occSpec.equals(events.get(1)) && events.get(1) instanceof OccurrenceSpecification) {
						otherEvent = (OccurrenceSpecification)events.get(1);
					}
					if(otherEvent != null) {
						Point otherLoc = findLocationOfEvent(lifelinePart, otherEvent);
						Point thisLoc = findLocationOfEvent(lifelinePart, occSpec);
						if(otherLoc != null && thisLoc != null) {
							if(otherLoc.y > thisLoc.y) {
								return PositionConstants.TOP;
							} else {
								return PositionConstants.BOTTOM;
							}
						}
					}
				}
			} else {
				return PositionConstants.NONE;
			}
		}
		return PositionConstants.NONE;
	}

	/**
	 * Return the lifeline edit part containing this part (directly or indirectly)
	 * 
	 * @param nodeEditPart
	 *        the contained edit part or itself
	 * @return lifeline edit part or null
	 */
	public static LifelineEditPart getParentLifelinePart(EditPart nodeEditPart) {
		EditPart parent = nodeEditPart;
		while(parent != null) {
			if(parent instanceof LifelineEditPart) {
				return (LifelineEditPart)parent;
			} else {
				parent = parent.getParent();
			}
		}
		return null;
	}

	/**
	 * Get the edit part (message, execution, or destruction event) which starts or finishes with the event on the given lifeline part
	 * 
	 * @param lifelinePart
	 *        the lifeline edit part on which the event is located
	 * @param event
	 *        the event
	 * @return the edit part of which an end is defined by event on the lifelinePart edit part
	 */
	public static EditPart getLinkedEditPart(EditPart lifelinePart, OccurrenceSpecification event) {
		if(event instanceof MessageOccurrenceSpecification) {
			// get parts representing the message linked with the event
			Message message = ((MessageOccurrenceSpecification)event).getMessage();
			if(message == null) {
				return null;
			}
			Collection<Setting> settings = CacheAdapter.INSTANCE.getNonNavigableInverseReferences(message);
			for(Setting ref : settings) {
				if(NotationPackage.eINSTANCE.getView_Element().equals(ref.getEStructuralFeature())) {
					View view = (View)ref.getEObject();
					EditPart part = DiagramEditPartsUtil.getEditPartFromView(view, lifelinePart);
					// the message part must start or finish on the lifeline (with the event)
					if(part instanceof ConnectionEditPart) {
						EditPart lifelineChild = null;
						if(event.equals(message.getSendEvent())) {
							lifelineChild = ((ConnectionEditPart)part).getSource();
						} else if(event.equals(message.getReceiveEvent())) {
							lifelineChild = ((ConnectionEditPart)part).getTarget();
						}
						LifelineEditPart parentLifeline = getParentLifelinePart(lifelineChild);
						if(lifelinePart.equals(parentLifeline)) {
							return part;
						}
					}
				}
			}
		} else if(event instanceof ExecutionOccurrenceSpecification) {
			// get parts representing the execution linked with the event
			ExecutionSpecification execution = ((ExecutionOccurrenceSpecification)event).getExecution();
			if(execution == null) {
				return null;
			}
			Collection<Setting> settings = CacheAdapter.INSTANCE.getNonNavigableInverseReferences(execution);
			for(Setting ref : settings) {
				if(NotationPackage.eINSTANCE.getView_Element().equals(ref.getEStructuralFeature())) {
					View view = (View)ref.getEObject();
					EditPart part = DiagramEditPartsUtil.getEditPartFromView(view, lifelinePart);
					// the execution part must be on the lifeline
					EditPart lifelineChild = part;
					LifelineEditPart parentLifeline = getParentLifelinePart(lifelineChild);
					if(lifelinePart.equals(parentLifeline)) {
						return part;
					}
				}
			}
		} else {
			// get parts representing the destruction event linked with the event
			for(Object lifelineChild : lifelinePart.getChildren()) {
				if(lifelineChild instanceof DestructionEventEditPart) {
					EObject destr = ((DestructionEventEditPart)lifelineChild).resolveSemanticElement();
					if(destr instanceof DestructionEvent && destr.equals(event.getEvent())) {
						return (EditPart)lifelineChild;
					}
				}
			}
		}
		return null;
	}

	/**
	 * Get the object safely casted as a list of OccurrenceSpecification
	 * 
	 * @param occurrenceSpecificationList
	 *        the object which is supposed to be a list of OccurrenceSpecification
	 */
	public static List<OccurrenceSpecification> getAsOccSpecList(Object occurrenceSpecificationList) {
		if(occurrenceSpecificationList instanceof List<?>) {
			List<?> list = (List<?>)occurrenceSpecificationList;
			if(!list.isEmpty()) {
				List<OccurrenceSpecification> newList = new ArrayList<OccurrenceSpecification>(list.size());
				for(Object elt : list) {
					if(elt instanceof OccurrenceSpecification) {
						newList.add((OccurrenceSpecification)elt);
					}
				}
				return newList;
			}
		}
		return Collections.emptyList();
	}

	/**
	 * Get the pair of OccurrenceSpecification which a duration constraint or observation should be created between
	 * 
	 * @param occ1List
	 *        the list of occurrences at the same time, among which the first one must be chosen
	 * @param occ2List
	 *        the list of occurrences at the same time, among which the second one must be chosen
	 * @return size two array of OccurrenceSpecification which can be linked or null
	 */
	public static OccurrenceSpecification[] getPairOfCorrespondingOccSpec(List<OccurrenceSpecification> occ1List, List<OccurrenceSpecification> occ2List) {
		// check for occurrences linked by a message
		for(OccurrenceSpecification occ1 : occ1List) {
			for(OccurrenceSpecification occ2 : occ2List) {
				if(DurationConstraintHelper.endsOfSameMessage(occ1, occ2)) {
					// we must link occurrences of a message
					return new OccurrenceSpecification[]{ occ1, occ2 };
				}
			}
		}
		// check for occurrences on a same lifeline
		for(OccurrenceSpecification occ1 : occ1List) {
			if(occ1 instanceof MessageOccurrenceSpecification) {
				Message mess = ((MessageOccurrenceSpecification)occ1).getMessage();
				if(mess.getReceiveEvent().equals(occ1) && MessageSort.SYNCH_CALL_LITERAL.equals(mess.getMessageSort())) {
					// filter receive event, we prefer the corresponding start event at the same location
					continue;
				}
			}
			for(OccurrenceSpecification occ2 : occ2List) {
				if(occ2 instanceof MessageOccurrenceSpecification) {
					Message mess = ((MessageOccurrenceSpecification)occ2).getMessage();
					if(mess.getReceiveEvent().equals(occ2) && MessageSort.SYNCH_CALL_LITERAL.equals(mess.getMessageSort())) {
						// filter receive event, we prefer the corresponding start event at the same location
						continue;
					}
				}
				if(DurationConstraintHelper.coversSameLifeline(occ1, occ2)) {
					// we must link occurrences on a same lifeline
					return new OccurrenceSpecification[]{ occ1, occ2 };
				}
			}
		}
		return null;
	}

	public static List<Element> getCombinedFragmentAssociatedElement(CombinedFragment cf) {
		List<Element> elements = new LinkedList<Element>();

		for(InteractionOperand operand : cf.getOperands()) {
			// Add all elements related to this operand
			elements.addAll(getInteractionOperandAssociatedElement(operand));
			// Add this operand
			elements.add(operand);
		}
		return elements;

	}

	public static List<Element> getInteractionOperandAssociatedElement(InteractionOperand interactionOperand) {
		List<Element> elements = new LinkedList<Element>();
		for(InteractionFragment itf : interactionOperand.getFragments()) {
			if(itf instanceof CombinedFragment) {
				// add the combinedFragment
				elements.addAll(getCombinedFragmentAssociatedElement((CombinedFragment)itf));
			}
			elements.add(itf);
			if(itf instanceof MessageOccurrenceSpecification) {
				MessageOccurrenceSpecification mos = (MessageOccurrenceSpecification)itf;
				if(mos.getMessage() != null) {
					elements.add(mos.getMessage());
				}
			}
		}
		return elements;
	}

	public static void handleMessageSortChange(EditingDomain editingDomain, Notification notification, Message message, MessageSort expectedMessageSort) {
		Object feature = notification.getFeature();

		if(UMLPackage.eINSTANCE.getMessage_MessageSort().equals(feature) && !expectedMessageSort.equals(notification.getNewValue())) {
			Object oldValue = notification.getOldValue();
			if(oldValue instanceof MessageSort) {
				MessageDialog.openWarning(Display.getCurrent().getActiveShell(), BLOCK_SORT_MODIFICATION_TITLE, BLOCK_SORT_MODIFICATION_MSG);
				CommandHelper.executeCommandWithoutHistory(editingDomain, SetCommand.create(editingDomain, message, feature, notification.getOldValue()));
				return;
			}
		}
	}

	@SuppressWarnings("unchecked")
	public static Set<Lifeline> getCoveredLifelines(Rectangle selectionRect, EditPart hostEditPart) {
		Set<Lifeline> coveredLifelines = new HashSet<Lifeline>();

		// retrieve all the edit parts in the registry
		Set<Entry<Object, EditPart>> allEditPartEntries = hostEditPart.getViewer().getEditPartRegistry().entrySet();
		for(Entry<Object, EditPart> epEntry : allEditPartEntries) {
			EditPart ep = epEntry.getValue();

			if(ep instanceof ShapeEditPart) {
				ShapeEditPart sep = (ShapeEditPart)ep;
				EObject elem = sep.getNotationView().getElement();

				if(elem instanceof Lifeline) {
					Rectangle figureBounds = getAbsoluteBounds(sep);

					if(selectionRect.intersects(figureBounds)) {
						coveredLifelines.add((Lifeline)elem);
					}
				}
			}
		}
		return coveredLifelines;
	}

	/**
	 * retrieve all the interaction fragments and their related ift at least partially covered by the rectangle, including sub ift like
	 * interaction operands in combined fragment.
	 * 
	 * @param selectionRect
	 *        the rectangle where to look for ift.
	 * @param hostEditPart
	 *        the host edit part used to retrieve all the edit parts in the registry.
	 * @param coveredRatio
	 *        the minimum covering ratio of a figure to be included in the set.
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static Set<InteractionFragment> getCoveredInteractionFragments(Rectangle selectionRect, EditPart hostEditPart) {
		Set<InteractionFragment> coveredInteractionFragments = new HashSet<InteractionFragment>();

		// retrieve all the edit parts in the registry
		Set<Entry<Object, EditPart>> allEditPartEntries = hostEditPart.getViewer().getEditPartRegistry().entrySet();
		for(Entry<Object, EditPart> epEntry : allEditPartEntries) {
			EditPart ep = epEntry.getValue();

			if(ep instanceof ShapeEditPart) {
				ShapeEditPart sep = (ShapeEditPart)ep;
				EObject elem = sep.getNotationView().getElement();

				if(elem instanceof InteractionFragment) {
					Rectangle figureBounds = getAbsoluteBounds(sep);

					if(selectionRect.contains(figureBounds)) {
						coveredInteractionFragments.add((InteractionFragment)elem);
					}
					if(elem instanceof ExecutionSpecification) {
						ExecutionSpecification es = (ExecutionSpecification)elem;
						Point center = figureBounds.getCenter();
						Point top = center.getCopy();
						top.y = figureBounds.y;

						if(selectionRect.contains(top) && es.getStart() != null) {
							coveredInteractionFragments.add(es.getStart());
						}

						Point bottom = center.getCopy();
						bottom.y = figureBounds.bottom();
						if(selectionRect.contains(bottom) && es.getFinish() != null) {
							coveredInteractionFragments.add(es.getFinish());
						}
					}
				}

			} else if(ep instanceof ConnectionEditPart) {
				ConnectionEditPart cep = (ConnectionEditPart)ep;
				EObject elem = cep.getNotationView().getElement();

				// for connections, messages have ends that are ift but don't have theirs own edit parts
				// => use anchors to determine if they should be included in the set
				if(elem instanceof Message) {
					Message msg = (Message)elem;
					Connection msgFigure = cep.getConnectionFigure();

					Point sourcePoint = msgFigure.getSourceAnchor().getReferencePoint();
					Point targetPoint = msgFigure.getTargetAnchor().getReferencePoint();

					if(selectionRect.contains(sourcePoint)) {
						MessageEnd msgSendEnd = msg.getSendEvent();
						if(msgSendEnd instanceof InteractionFragment) {
							coveredInteractionFragments.add((InteractionFragment)msgSendEnd);
						}
					}
					if(selectionRect.contains(targetPoint)) {
						MessageEnd msgReceiveEnd = msg.getReceiveEvent();
						if(msgReceiveEnd instanceof InteractionFragment) {
							coveredInteractionFragments.add((InteractionFragment)msgReceiveEnd);
						}
					}
				}
			}
		}
		return coveredInteractionFragments;
	}

	/**
	 * return a command to set the enclosing interaction or interaction operand of an interaction fragment.
	 * 
	 * @param ed
	 *        The transactional editing domain.
	 * @param ift
	 *        The interaction fragment.
	 * @param io
	 *        the new enclosing interaction.
	 * @return The command.
	 */
	public static ICommand getSetEnclosingInteractionCommand(final TransactionalEditingDomain ed, final InteractionFragment ift, final EObject interaction) {
		return new AbstractTransactionalCommand(ed, "Set enclosing interaction command", null) {

			@Override
			protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
				if(ift != null) {
					if(interaction instanceof Interaction) {
						if(!interaction.equals(ift.getEnclosingInteraction())) {
							ift.setEnclosingOperand(null);
							ift.setEnclosingInteraction((Interaction)interaction);
						}
					} else if(interaction instanceof InteractionOperand) {
						if(!interaction.equals(ift.getEnclosingOperand())) {
							ift.setEnclosingInteraction(null);
							ift.setEnclosingOperand((InteractionOperand)interaction);
						}
					}
				}
				return CommandResult.newOKCommandResult();
			}
		};
	}

	/**
	 * return a command to add a covered lifeline to an interaction fragment.
	 * 
	 * @param ed
	 *        The transactional editing domain.
	 * @param ift
	 *        The interaction fragment.
	 * @param lifeline
	 *        the lifeline.
	 * @return The command.
	 */
	public static ICommand getAddCoveredLifelineCommand(final TransactionalEditingDomain ed, final InteractionFragment ift, final Lifeline lifeline) {
		return new AbstractTransactionalCommand(ed, "Add covered lifeline command", null) {

			@Override
			protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
				ift.getCovereds().add(lifeline);
				return CommandResult.newOKCommandResult();
			}
		};
	}

	/**
	 * return a command to remove a previously covered lifeline of an interaction fragment.
	 * 
	 * @param ed
	 *        The transactional editing domain.
	 * @param ift
	 *        The interaction fragment.
	 * @param lifeline
	 *        the lifeline.
	 * @return The command.
	 */
	public static ICommand getRemoveCoveredLifelineCommand(final TransactionalEditingDomain ed, final InteractionFragment ift, final Lifeline lifeline) {
		return new AbstractTransactionalCommand(ed, "Add covered lifeline command", null) {

			@Override
			protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
				ift.getCovereds().remove(lifeline);
				return CommandResult.newOKCommandResult();
			}
		};
	}

	/**
	 * Create a command to update the enclosing interaction of an execution specification according to its new bounds.
	 * 
	 * @param executionSpecificationEP
	 *        the edit part of the execution specification
	 * @param absoluteNewBounds
	 *        the new absolute bounds
	 * @return the command or null if nothing changes
	 */
	@SuppressWarnings("unchecked")
	public static Command createUpdateEnclosingInteractionCommand(ShapeNodeEditPart executionSpecificationEP, Point moveDelta, Dimension sizeDelta) {

		// calculate new bounds for the execution specification
		Rectangle absoluteNewBounds = executionSpecificationEP.getFigure().getBounds().getCopy();

		executionSpecificationEP.getFigure().getParent().translateToAbsolute(absoluteNewBounds);

		absoluteNewBounds.translate(moveDelta);
		absoluteNewBounds.resize(sizeDelta);

		int xCenter = absoluteNewBounds.getCenter().x;

		Rectangle top = new Rectangle(xCenter, absoluteNewBounds.y, 0, 0);
		Rectangle bottom = new Rectangle(xCenter, absoluteNewBounds.bottom(), 0, 0);

		// associate es with its bounds, and start and finish event with the top and bottom of the bounds
		HashMap<InteractionFragment, Rectangle> iftToCheckForUpdate = new HashMap<InteractionFragment, Rectangle>();

		ExecutionSpecification es = (ExecutionSpecification)executionSpecificationEP.resolveSemanticElement();

		iftToCheckForUpdate.put(es, absoluteNewBounds);

		iftToCheckForUpdate.put(es.getStart(), top);

		iftToCheckForUpdate.put(es.getFinish(), bottom);

		List<ConnectionEditPart> sourceConnectionEPs = executionSpecificationEP.getSourceConnections();

		// find possible ifts associated with messages connected to the moved es
		for(ConnectionEditPart sourceConnectionEP : sourceConnectionEPs) {
			EObject elem = sourceConnectionEP.getNotationView().getElement();

			// for connections, messages have ends that can be ift but don't have theirs own edit parts
			// => use anchors to determine position
			if(elem instanceof Message) {
				Message msg = (Message)elem;
				MessageEnd sendEvent = msg.getSendEvent();
				if(sendEvent instanceof InteractionFragment) {
					Connection msgFigure = sourceConnectionEP.getConnectionFigure();

					Point sourcePoint = msgFigure.getSourceAnchor().getLocation(msgFigure.getTargetAnchor().getReferencePoint());

					iftToCheckForUpdate.put((InteractionFragment)sendEvent, new Rectangle(sourcePoint.x + moveDelta.x, sourcePoint.y + moveDelta.y, 0, 0));
				}
			}
		}

		List<ConnectionEditPart> targetConnectionEPs = executionSpecificationEP.getTargetConnections();

		for(ConnectionEditPart targetConnectionEP : targetConnectionEPs) {
			EObject elem = targetConnectionEP.getNotationView().getElement();

			if(elem instanceof Message) {
				Message msg = (Message)elem;
				MessageEnd receiveEvent = msg.getReceiveEvent();
				if(receiveEvent instanceof InteractionFragment) {
					Connection msgFigure = targetConnectionEP.getConnectionFigure();

					Point targetPoint = msgFigure.getTargetAnchor().getLocation(msgFigure.getSourceAnchor().getReferencePoint());

					iftToCheckForUpdate.put((InteractionFragment)receiveEvent, new Rectangle(targetPoint.x + moveDelta.x, targetPoint.y + moveDelta.y, 0, 0));
				}
			}
		}

		CompoundCommand cmd = new CompoundCommand();

		for(Map.Entry<InteractionFragment, Rectangle> entry : iftToCheckForUpdate.entrySet()) {
			InteractionFragment newEnclosingInteraction = findInteractionFragmentContainerAt(entry.getValue(), executionSpecificationEP);
			if(newEnclosingInteraction != null) {
				cmd.add(new ICommandProxy(getSetEnclosingInteractionCommand(executionSpecificationEP.getEditingDomain(), entry.getKey(), newEnclosingInteraction)));
			}
		}

		if(!cmd.isEmpty()) {
			return cmd;
		} else {
			return null;
		}
	}

	/**
	 * Find the edit part a connection should be reconnected to at a given reference point on a lifeline
	 * 
	 * @param lifelinePart
	 *        lifeline part on which the reconnection must be performed
	 * @param referencePoint
	 *        the reference point
	 * @return lifeline or execution specification edit part to reconnect to (the most external in the lifeline)
	 */
	public static EditPart findPartToReconnectTo(LifelineEditPart lifelinePart, Point referencePoint) {
		Rectangle absoluteLifelineBounds = getAbsoluteBounds(lifelinePart);
		// inspect children nodes of lifeline
		List<?> children = lifelinePart.getChildren();
		GraphicalEditPart adequateExecutionPart = null;
		int maxDeltaWithMiddle = 0;
		for(Object child : children) {
			// children executions
			if(child instanceof ActionExecutionSpecificationEditPart || child instanceof BehaviorExecutionSpecificationEditPart) {
				GraphicalEditPart childPart = (GraphicalEditPart)child;
				Rectangle absoluteBounds = getAbsoluteBounds(childPart);
				// enlarge absolute bounds to contain also the right and bottom edges.
				absoluteBounds.expand(1, 1);
				if(absoluteBounds.contains(referencePoint)) {
					// this is an adequate execution part, take the most external one
					int deltaWithMiddle = Math.abs(absoluteBounds.getTop().x - absoluteLifelineBounds.getTop().x);
					if(deltaWithMiddle >= maxDeltaWithMiddle) {
						maxDeltaWithMiddle = deltaWithMiddle;
						adequateExecutionPart = childPart;
					}
				}
			}
		}
		if(adequateExecutionPart != null) {
			return adequateExecutionPart;
		}
		return lifelinePart;
	}

	/**
	 * Find the range of possible locations an occurrence specification should be drawn in.
	 * 
	 * @param lifelineEditPart
	 *        the lifeline on which the occurrence specification appears.
	 * @param occSpec
	 *        the occurrence specification to find locations for.
	 * @return rectangle within which the occurrence specification must be drawn (width is not significative)
	 */
	public static Rectangle findPossibleLocationsForEvent(LifelineEditPart lifelineEditPart, OccurrenceSpecification occSpec) {
		// at least, we know the event is in the drawn lifeline
		Rectangle result = lifelineEditPart.getContentPane().getBounds().getCopy();
		lifelineEditPart.getFigure().translateToAbsolute(result);


		// find the containing pane
		IGraphicalEditPart containerPart = findDrawnContainerEditPart(lifelineEditPart, occSpec);
		IFigure drawnContentPane = getContentPaneThatCanContainFragments(containerPart);
		if(drawnContentPane != null) {
			// content pane is the smallest drawn owning rectangle
			Rectangle bounds = drawnContentPane.getBounds().getCopy();
			drawnContentPane.getParent().translateToAbsolute(bounds);
			// intersect with the lifeline's content
			result.intersect(bounds);
		}

		// we must search surrounding interaction fragments within uppestContainerToSearchInto
		EObject uppestContainerToSearchInto = containerPart.resolveSemanticElement();

		InteractionFragment after = findNextFragment(occSpec, uppestContainerToSearchInto);
		boolean foundNextFragment = false;
		while(!foundNextFragment && after != null) {
			Point bottom = findLocationOfEvent(lifelineEditPart, after);
			if(bottom != null && result.contains(bottom)) {
				int diff = bottom.y - result.bottom();
				result.resize(0, diff);
				foundNextFragment = true;
			} else {
				// fragment not represented on lifeline, search next fragment
				after = findNextFragment(after, uppestContainerToSearchInto);
			}
		}
		InteractionFragment before = findPreviousFragment(occSpec, uppestContainerToSearchInto);
		boolean foundPreviousFragment = false;
		while(!foundPreviousFragment && before != null) {
			Point top = findLocationOfEvent(lifelineEditPart, before);
			if(top != null && result.contains(top)) {
				int diff = top.y - result.y;
				result.translate(0, diff);
				result.resize(0, -diff);
				foundPreviousFragment = true;
				/*
				 * In case before is contained in an interaction operand or
				 * combined fragment which does not contain the searched event,
				 * we must also take in account the bottom border of this node.
				 */
				reduceByNodeContainingBefore(result, before, occSpec, lifelineEditPart);
			} else {
				// fragment not represented on lifeline, search next fragment
				before = findPreviousFragment(before, uppestContainerToSearchInto);
			}
		}
		return result;
	}

	/**
	 * Reduce the possible bounds by removing the area of an eventual interaction operand or combined fragment which contains the fragment "before"
	 * and not the occurrence specification for which we search a location.
	 * 
	 * @param possibleBounds
	 *        bounds to reduce, in which the location will be possible
	 * @param before
	 *        the fragment which happens before
	 * @param occSpec
	 *        the occurrence specification for which we search a location
	 * @param lifelineEditPart
	 *        the lifeline on which the occurrence specification appears.
	 */
	private static void reduceByNodeContainingBefore(Rectangle possibleBounds, InteractionFragment before, OccurrenceSpecification occSpec, LifelineEditPart lifelineEditPart) {
		Element eventualNodeElement = before;
		// inspect each container of before, until it is common with occSpec
		while(!EcoreUtil.isAncestor(eventualNodeElement, occSpec)) {
			// test if eventualNodeElement has bounds excluding occSpec
			// search for the eventualNodeElement's edit part
			List<View> views = DiagramEditPartsUtil.findViews(eventualNodeElement, lifelineEditPart.getViewer());
			for(View view : views) {
				EditPart part = DiagramEditPartsUtil.getEditPartFromView(view, lifelineEditPart);
				// test if edit part is an adequate node
				if(part instanceof IGraphicalEditPart && getContentPaneThatCanContainFragments(part) != null) {
					Rectangle bounds = getAbsoluteBounds((IGraphicalEditPart)part);
					// reduce so that the bounds are excluded
					int newPossibleTop = bounds.bottom();
					if(possibleBounds.y < newPossibleTop) {
						int diff = newPossibleTop - possibleBounds.y;
						possibleBounds.translate(0, diff);
						possibleBounds.resize(0, -diff);
					}
				}
			}
			eventualNodeElement = eventualNodeElement.getOwner();
		}
	}

	/**
	 * Find the fragment happening just after this one.
	 * 
	 * @param interactionFragment
	 *        interaction fragment to search the one after
	 * @param uppestContainerToSearchInto
	 *        the container which we will not search further if encountered (may be null)
	 * @return the fragment found happening just after, or null
	 */
	private static InteractionFragment findNextFragment(InteractionFragment interactionFragment, EObject uppestContainerToSearchInto) {
		Element paramElement;
		if(uppestContainerToSearchInto instanceof Element) {
			paramElement = (Element)uppestContainerToSearchInto;
		} else {
			// search in the parent interaction.
			paramElement = interactionFragment;
			while(paramElement.getOwner() != null && !(paramElement instanceof Interaction)) {
				paramElement = paramElement.getOwner();
			}
		}
		return findInteractionFragment(paramElement, false, interactionFragment, false);
	}

	/**
	 * Find the fragment happening just before this one.
	 * 
	 * @param interactionFragment
	 *        interaction fragment to search the one before
	 * @param uppestContainerToSearchInto
	 *        the container which we will not search further if encountered (may be null)
	 * @return the fragment found happening just before, or null
	 */
	private static InteractionFragment findPreviousFragment(InteractionFragment interactionFragment, EObject uppestContainerToSearchInto) {
		Element paramElement;
		if(uppestContainerToSearchInto instanceof Element) {
			paramElement = (Element)uppestContainerToSearchInto;
		} else {
			// search in the parent interaction.
			paramElement = interactionFragment;
			while(paramElement.getOwner() != null && !(paramElement instanceof Interaction)) {
				paramElement = paramElement.getOwner();
			}
		}
		return findInteractionFragment(paramElement, true, interactionFragment, false);
	}

	/**
	 * Find the next or previous interaction fragment
	 * 
	 * @param uppestContainerToSearchInto
	 *        the container in which we restrain our search
	 * @param reverseOrder
	 *        true if we search the fragment before, false for the one after
	 * @param fragmentToStartFrom
	 *        the reference fragment
	 * @param startFragmentFound
	 *        use false for an external call, true for recursive internal call when the fragmentToStartFrom has already been found
	 * @return the found interaction fragment or null if it is not in uppestContainerToSearchInto
	 */
	private static InteractionFragment findInteractionFragment(Element uppestContainerToSearchInto, boolean reverseOrder, InteractionFragment fragmentToStartFrom, boolean startFragmentFound) {
		List<? extends Element> listToSearchInto;
		if(uppestContainerToSearchInto instanceof InteractionOperand) {
			listToSearchInto = ((InteractionOperand)uppestContainerToSearchInto).getFragments();
		} else if(uppestContainerToSearchInto instanceof Interaction) {
			listToSearchInto = ((Interaction)uppestContainerToSearchInto).getFragments();
		} else {
			listToSearchInto = uppestContainerToSearchInto.getOwnedElements();
		}
		// search recursively in all the child tree.
		for(int i = 0; i < listToSearchInto.size(); i++) {
			int searchIndex = i;
			if(reverseOrder) {
				searchIndex = listToSearchInto.size() - 1 - i;
			}
			Element searchElement = listToSearchInto.get(searchIndex);


			if(fragmentToStartFrom.equals(searchElement)) {
				startFragmentFound = true;
				if(reverseOrder) {
					// search in the previous child
					continue;
				} else {
					// search deeper for children (which we consider they come after)
				}
			} else if(!startFragmentFound) {
				// go quicker to skip every node until we find the appropriate starting fragment
				if(!EcoreUtil.isAncestor(searchElement, fragmentToStartFrom)) {
					continue;
				} else {
					// search deeper for starting fragment
					// startFragmentFound == false
				}
			} else if(searchElement instanceof InteractionFragment && !reverseOrder) {
				// next fragment found, do not search deeper
				return (InteractionFragment)searchElement;
			}
			// search deeper for a fragment
			InteractionFragment fragment = findInteractionFragment(searchElement, reverseOrder, fragmentToStartFrom, startFragmentFound);
			if(fragment != null) {
				return fragment;
			} else if(reverseOrder && searchElement instanceof InteractionFragment) {
				// we searched ineffectively in the children, stop here and return the element
				return (InteractionFragment)searchElement;
			}
			// else, continue
		}
		return null;
	}

	/**
	 * Get the content pane of an edit part that can directly or indirectly contain interaction fragments (this excludes lifeline, which references)
	 * 
	 * @param containerPart
	 *        container edit part
	 * @return its content pane if the container can contain fragments, null otherwise.
	 */
	private static IFigure getContentPaneThatCanContainFragments(EditPart containerPart) {
		// test all owner edit parts which can contain an interaction fragment
		if(containerPart instanceof InteractionOperandEditPart) {
			return ((InteractionOperandEditPart)containerPart).getContentPane();
		} else if(containerPart instanceof CombinedFragmentEditPart) {
			return ((CombinedFragmentEditPart)containerPart).getContentPane();
		} else if(containerPart instanceof CombinedFragment2EditPart) {
			return ((CombinedFragment2EditPart)containerPart).getContentPane();
		} else if(containerPart instanceof ContinuationEditPart) {
			return ((ContinuationEditPart)containerPart).getContentPane();
		} else if(containerPart instanceof InteractionUseEditPart) {
			return ((InteractionUseEditPart)containerPart).getContentPane();
		} else if(containerPart instanceof InteractionEditPart) {
			return ((InteractionEditPart)containerPart).getContentPane();
		}
		return null;
	}

	/**
	 * Find the smallest drawn edit part containing the occurrence specification.
	 * 
	 * @param lifelineEditPart
	 *        support lifeline edit part
	 * @param occSpec
	 *        occurrence specification to localize
	 * @return a drawn edit part which element contains the occurrence specification or null
	 */
	private static IGraphicalEditPart findDrawnContainerEditPart(LifelineEditPart lifelineEditPart, OccurrenceSpecification occSpec) {
		// find containing drawn edit parts
		Element owner = occSpec.getOwner();
		while(owner != null) {
			// search for the owner's edit part
			List<View> views = DiagramEditPartsUtil.findViews(owner, lifelineEditPart.getViewer());
			for(View view : views) {
				EditPart part = DiagramEditPartsUtil.getEditPartFromView(view, lifelineEditPart);
				// test if edit part can contain the occurrence specification
				if(part instanceof IGraphicalEditPart && getContentPaneThatCanContainFragments(part) != null) {
					return (IGraphicalEditPart)part;
				}
			}
			owner = owner.getOwner();
		}
		return null;
	}
}
