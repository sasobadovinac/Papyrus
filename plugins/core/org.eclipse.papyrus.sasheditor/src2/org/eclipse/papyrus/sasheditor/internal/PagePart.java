/*****************************************************************************
 * Copyright (c) 2009 CEA LIST & LIFL 
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Cedric Dumoulin  Cedric.dumoulin@lifl.fr - Initial API and implementation
 *
  *****************************************************************************/
package org.eclipse.papyrus.sasheditor.internal;

import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;


/**
 * This class represent a leaf part that is a part containing an editor or a component.
 * 
 * @author dumoulin
 */
public abstract class PagePart extends AbstractPart {

	/** Raw model associated to this part. We store it because the PartModel do not provide it */
	protected Object rawModel;

	/** Parent part of this Part */
	protected TabFolderPart parent;
	
	
	/**
	 * Constructor.
	 * @param sashWindowsContainer
	 */
	public PagePart(TabFolderPart parent, Object rawModel) {
		super(parent.getSashWindowContainer());
		this.parent = parent;
		this.rawModel = rawModel;
	}

	
	/**
	 * @return the parent
	 */
	protected TabFolderPart getParent() {
		return parent;
	}

	/**
	 * Orphan this part.
	 */
	abstract public void orphan() ;

	/**
	 * Visit this part.
	 * 
	 * @param visitor
	 */
	abstract public void visit(IPartVisitor visitor);

	/**
	 * Locates the part that intersects the given point and that have the expected type.
	 * For a leaf, return the leaf if it is of the expected type.
	 * 
	 * @param position
	 * @param expectedTileType
	 * @return
	 */
	public AbstractPart findPartAt(Point position, Class<?> expectedTileType) {
		
	if(expectedTileType == this.getClass())
		return this;
	
	return null;	
	}

	/**
	 * Create the control of this Part, and children's controls.
	 * @param parent
	 */
	abstract public void createPartControl(Composite parent);

	/**
	 * Get the control associated to this Part.
	 * @return
	 */
	abstract public Control getControl() ;

	/**
	 * reparent this Part with the specified new parent.
	 * The part is marked as reparented.
	 * @param parent
	 */
	abstract public void reparent(TabFolderPart parent);

	/**
	 * Add the tree of parts starting from this part.
	 * As we are a leaf, add itself only.
	 * @param partMap
	 */
	public void fillPartMap(PartLists partMap) {
		partMap.addLeaf(this);
		garbageState = GarbageState.UNCHANGED;
	}

	/**
	 * Get the raw model associated to this Part.
	 * @return
	 */
	protected Object getRawModel() {
		return rawModel;
	}

	/**
	 * Return a title for this part. This title can be used by parent to be shown
	 * in tabs ...
	 * To be implemented by subclasses.
	 * @return The title or null.
	 */
	public String getPartTitle() {
		return null;
	}

	/**
	 * Return a icon for this part. This title can be used by parent to be shown
	 * in tabs ...
	 * To be implemented by subclasses.
	 * 
	 * @return The icon or null.
	 */
	public Image getPartIcon() {
		return null;
	}

	/**
	 * Set focus on the SWT control associated to this PagePart.
	 * Used by the ActivePageTracker.
	 */
	abstract public void setFocus();

	/**
	 * Garbage the part.
	 */
	abstract public void garbage();

	/**
	 * Return true if the part is associated to the specified rawModel.
	 * Return false otherwise.
	 * @param realModel
	 * @return
	 */
	public boolean isPartFor(Object realModel) {
		return this.rawModel == realModel;
	}

}
