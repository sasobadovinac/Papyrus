/**
 * 
 */
package org.eclipse.papyrus.sasheditor.sash;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.window.Window;
import org.eclipse.papyrus.sasheditor.Activator;
import org.eclipse.papyrus.sasheditor.eclipsecopy.IMultiPageEditorPart;
import org.eclipse.papyrus.sasheditor.eclipsecopy.MultiPageEditorSite;
import org.eclipse.papyrus.sasheditor.gef.EditorNotFoundException;
import org.eclipse.papyrus.sasheditor.gef.InstantiationException;
import org.eclipse.papyrus.sasheditor.gef.MultiDiagramException;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IPropertyListener;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.internal.dnd.IDropTarget;
import org.eclipse.ui.part.IWorkbenchPartOrientation;


/**
 * A tile representing a leaf in the MultiTileContainer.
 * This Tile encapsulate an Eclipse Editor implementing {@link IEditorPart}.
 * 
 * @author dumoulin
 *
 */
@SuppressWarnings("restriction")
public class EditorTile<T> implements ITilePart<T> {

	/**
	 * The model representing the editor.
	 * TODO: use a generic type ?
	 */
	private Object editorModel;
	
	/**
	 * The created Eclipse editor.
	 */
	private IEditorPart editorPart;
	
	/**
	 * The SWT Control containning the editor's controls.
	 */
	private Composite editorControl;
	
	/**
	 * The MultiPageContainer system. This is the manager of all tiles.
	 */
	private TilePartContainer<T> tilesContainer;
	
	/**
	 * Parent owning this TabPart. 
	 * Can be null if the Part is orphaned. Even if it is orphaned, the Item still set.
	 */
	protected ITilePart<T> parent;

	/** Garbage state used during refresh */
	protected GarbageState garbageState = GarbageState.CREATED;
	
	/**
	 * Listen on mouse enter event.
	 * Try to get an event indicating that the mouse enter over the editor.
	 * This can be used to switch the active editor.
	 * TODO This doesn't work yet.
	 */
	private Listener mouseEnterListener = new Listener() {

		/**
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.swt.widgets.Listener#handleEvent(org.eclipse.swt.widgets.Event)
		 */
		public void handleEvent(Event event) {
			Point globalPos = new Point(event.x, event.y);
			System.out.println("EditorTile.mouseEnterListener(" + eventName(event.type) + ", " + globalPos + ")");
		}
	};

	private String eventName(int eventType)
	{
		switch(eventType)
		{
		case SWT.MouseEnter : return "MouseEnter";
		case SWT.MouseDown : return "MouseDown";
		case SWT.MouseExit : return "MouseExit";
		case SWT.MouseHover : return "MouseHover";
		case SWT.FocusIn : return "FocusIn";
		case SWT.FocusOut : return "FocusOut";
		case SWT.MouseMove : return "MouseMove";
		case SWT.MouseUp : return "MouseUp";
		default : return Integer.toString(eventType);
		}
	}

	/**
	 * Constructor.
	 * @param editorModel The model of the editor.
	 */
	public EditorTile(TilePartContainer<T> tilesContainer, ITilePart<T> parent, Object editorModel)
	{
		this.parent = parent;
		this.tilesContainer = tilesContainer;
		this.editorModel = editorModel;
	}


	/**
	 * Create the control of this part.
	 * For a this implementations, also create the children's controls.
	 * This method forward to {@link createPartControl(Composite)}.
	 * @param parent
	 */
	public void createControl(Composite parent) {
		createPartControl(parent);
	}


	/**
	 * Create the control of this Part, and children's controls.
	 * @param parent
	 */
	public void createPartControl(Composite parent) {
		
		try {
			// Create the editor.
			editorPart = createIEditorPart();
			// Initialize it and create its controls.
			editorControl = createEditorPartControl(parent, editorPart);
//			attachListeners(editorControl, true);
			
		} catch (PartInitException e) {
			Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getLocalizedMessage()));
		} catch (InstantiationException e) {
			e.printStackTrace();
			Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getLocalizedMessage() + " skip."));
		} catch (MultiDiagramException e) {
			Activator.getDefault().getLog().log(new Status(IStatus.WARNING, Activator.PLUGIN_ID, e.getLocalizedMessage() + " skip."));
		}
	}

	/**
	 * Create the editor associated to this TabPart.
	 * @return
	 * @throws MultiDiagramException 
	 * @throws InstantiationException 
	 * @throws EditorNotFoundException 
	 */
	private IEditorPart createIEditorPart() throws EditorNotFoundException, InstantiationException, MultiDiagramException {
		return getIMultiEditorNestedPartManager().createPageEditor(editorModel);
	}
	
	/**
	 * Create the controls required by the editor.
	 * Init the editor.
	 * @param viewer
	 * @param editorInput
	 * @param model
	 * @return
	 * @throws PartInitException 
	 */
	private Composite createEditorPartControl(Composite parentControl, IEditorPart editor) 
	   throws PartInitException
	{
				IEditorSite site = createSite(editor);
				// call init first so that if an exception is thrown, we have created no
				// new widgets
				editor.init(site, getIMultiEditorNestedPartManager().getEditorInput() );
				Composite editorParent = new Composite(parentControl, getOrientation(editor));
				editorParent.setLayout(new FillLayout());
				editor.createPartControl(editorParent);
				editor.addPropertyListener(new IPropertyListener() {

					public void propertyChanged(Object source, int propertyId) {
						EditorTile.this.handlePropertyChange(propertyId);
					}
				});
				
				return editorParent;
	}
	
	/**
	 * Attach SWT listeners.
	 */
	private void attachListeners(Control theControl, boolean recursive) {
		
		// Both following methods listen to the same event. 
		// So use only one of them
		theControl.addListener(SWT.MouseEnter, mouseEnterListener);
		
		theControl.addListener(SWT.FocusIn, mouseEnterListener);
		theControl.addListener(SWT.MouseMove, mouseEnterListener);
		theControl.addListener(SWT.MouseHover, mouseEnterListener);
		theControl.addListener(SWT.MouseUp, mouseEnterListener);
		theControl.addListener(SWT.MouseDown, mouseEnterListener);
		
		if (recursive && theControl instanceof Composite) {
			Composite composite = (Composite) theControl;
			Control[] children = composite.getChildren();

			for (int i = 0; i < children.length; i++) {
				Control control = children[i];

				attachListeners(control, true);
			}
		}
	}

	/**
	 * Detach SWT listeners
	 */
	private void detachListeners(Control theControl, boolean recursive) {
		theControl.removeListener(SWT.MouseEnter, mouseEnterListener);
		theControl.removeListener(SWT.FocusIn, mouseEnterListener);
		
		if (recursive && theControl instanceof Composite) {
			Composite composite = (Composite) theControl;
			Control[] children = composite.getChildren();

			for (int i = 0; i < children.length; i++) {
				Control control = children[i];

				detachListeners(control, false);
			}
		}
	}


	/**
	 * Handles a property change notification from a nested editor. The default implementation simply forwards 
	 * the change to listeners on this multi-page editor by calling
	 * <code>firePropertyChange</code> with the same property id. For example, if the dirty state of a nested 
	 * editor changes (property id <code>IEditorPart.PROP_DIRTY</code>), this method handles it
	 * by firing a property change event for <code>IEditorPart.PROP_DIRTY</code> to property listeners on this 
	 * multi-page editor.
	 * <p>
	 * Subclasses may extend or reimplement this method.
	 * </p>
	 * 
	 * @param propertyId
	 *            the id of the property that changed
	 */
	private void handlePropertyChange(int propertyId) {
		getIMultiEditorNestedPartManager().firePropertyChange(propertyId);
	}

	/**
	 * Creates the site for the given nested editor. The <code>MultiPageEditorPart</code> implementation 
	 * of this method creates an instance of <code>MultiPageEditorSite</code>. Subclasses may
	 * reimplement to create more specialized sites.
	 * 
	 * @param editor
	 *            the nested editor
	 * @return the editor site
	 */
	protected IEditorSite createSite(IEditorPart editor) {
		return new MultiPageEditorSite(getIMultiPageEditorPart(), editor);
	}

	/**
	 * Get the orientation of the editor.
	 * 
	 * @param editor
	 * @return int the orientation flag
	 * @see SWT#RIGHT_TO_LEFT
	 * @see SWT#LEFT_TO_RIGHT
	 * @see SWT#NONE
	 */
	private int getOrientation(IEditorPart editor) {
		if (editor instanceof IWorkbenchPartOrientation) {
			return ((IWorkbenchPartOrientation) editor).getOrientation();
		}
		return Window.getDefaultOrientation();
	}

	/**
	 * Get the associated main editor (implementing IMultiPageEditorPart).
	 * @return
	 */
	private IMultiPageEditorPart getIMultiPageEditorPart() {
		return tilesContainer.getNestedPartManager();
	}

	/**
	 * Get the nested part manager.
	 * @return
	 */
	private IMultiEditorNestedPartManager getIMultiEditorNestedPartManager() {
		return tilesContainer.getNestedPartManager();
	}


	/**
	 * @param isRecursive
	 */
	public void dispose(boolean isRecursive) {
		
//		detachListeners(editorControl, true);
		// dispose the SWT root control
		editorControl.dispose();
		// Dispose the editor.
		editorPart.dispose();
	}


	/**
	 * @param garbageMaps
	 */
	public void fillPartMap(GarbageMaps<T> garbageMaps) {
		garbageState = GarbageState.UNCHANGED;
		garbageMaps.addTile(editorModel, this);
		
	}


	/**
	 * As we are a final Tile, we should be the requested part.
	 * Return this TilePart.
	 * @param toFind
	 * @return
	 */
	public ITilePart<T> findPart(Point toFind) {
		return this;
	}

	/**
	 * Locates the part that intersects the given point and that have the expected type
	 * 
	 * @param toFind
	 * @return
	 */
	public <U extends ITilePart<T>> U findPartAt(Point toFind, Class<U> expectedTileType) {
		
		if(expectedTileType == this.getClass())
			return (U)this;
		// If we require the interface type, return this leaf
		if(expectedTileType == ITilePart.class)
			return (U)this;
		
		// Not found !!
		// The tile contains the position, but the type is not found.
		throw new UnsupportedOperationException("Tile match the expected position '" 
				+ toFind 
				+ "' but there is no Tile of requested type '"
				+ expectedTileType.getClass().getName() + "'" );
	}

	/**
	 * @param control
	 * @return
	 */
	public ITilePart<T> findPart(Object control) {
		if (getControl() == control)
			return this;
		
		// Not found
		return null;
	}


	/**
	 * Returns the active nested editor if there is one.
	 * <p>
	 * Subclasses should not override this method
	 * </p>
	 * 
	 * @return the active nested editor, or <code>null</code> if none
	 */
	public IEditorPart getActiveEditor() {
		return editorPart;
	}

	/**
	 * Returns the active nested editor if there is one.
	 * <p>
	 * Subclasses should not override this method
	 * </p>
	 * 
	 * @return the active nested editor, or <code>null</code> if none
	 */
	public IEditorPart getIEditorPart() {
		return editorPart;
	}


	/**
	 * Get associated SWT Control.
	 * 
	 * @return
	 */
	public Composite getControl() {
		return editorControl;
	}


	/**
	 * This is a container method. Not necessary in Leaf Tile.
	 * TODO: change the interface.
	 * @param draggedObject
	 * @param sourcePart
	 * @param position
	 * @return
	 */
	public IDropTarget getDropTarget(Object draggedObject, TabFolderPart<T> sourcePart, Point position) {
		return null;
	}


	/**
	 * @return
	 */
	public GarbageState getGarbageState() {
		return garbageState;
	}


	/**
	 * Is the associated editor dirty ?
	 * Delegate to {@link IEditorPart.isDirty()}
	 * @return true if the associated editor is dirty.
	 */
	public boolean isDirty() {
		return editorPart.isDirty();
	}


	/**
	 * @param realModel
	 * @return
	 */
	public boolean isTilePartFor(T realModel) {
		return editorModel.equals(realModel);
	}


	/**
	 * Return true if this node is orphaned (parent should also be null)
	 * @return
	 */
	public boolean isOrphaned() {
		return garbageState == ITilePart.GarbageState.ORPHANED;
	}

	/**
	 * Orphan this node. The parent is set to null, but control is left unchanged. 
	 * The node can be reattached with reparent(). Change garbage state to 
	 * {@link GarbageState.ORPHANED}.
	 * This method as no effect if the Tile has already been reparented.
	 * 
	 * @see
	 * @return the parent
	 */
	public void orphan() {
		// orphan only if we are in UNCHANGED state
		if (garbageState == ITilePart.GarbageState.UNCHANGED) {
			garbageState = ITilePart.GarbageState.ORPHANED;
			parent = null;
		}
	}


	/**
	 * Change the parent of the Tile. The parent is changed, and the control is 
	 * attached to the parent control. Change garbage state to {@link GarbageState.REPARENTED}.
	 * Do not detach the Tile from its old parent.
	 * 
	 * @param newParent
	 *            The tilePart that should be used as part parent.
	 * @param compositeParent
	 *            The composite that should be used as parent.
	 */
	public void reparent(ITilePart<T> newParent, Composite compositeParent) {
		
		// Change the tile parent
		this.parent = newParent;
		// Change the SWT parent.
		editorControl.setParent(compositeParent);
		garbageState = GarbageState.REPARENTED;
	}


	/**
	 * Asks this part to take focus within the workbench.
	 * Set the focus on the active nested part if the part is a container.
	 */
	public void setFocus() {
		editorPart.setFocus();
	}


	/**
	 * Synchronize the Part, and its children. PartMap contains a snapshot of the available part before 
	 * the synchronization. After synchronization, unreachable parts should be marked "orphaned" (= no
	 * parent).
	 * Do nothing in this implementation, as we are a final leaf, and there is nothing to synchronize 
	 * with the underlying model.
	 * @param partMap
	 */
	public void synchronize2(GarbageMaps<T> partMap) {
		
	}


	/**
	 * Garbage this part.
	 * The part is already marked as ORPHANED. It is not used anymore. It is already detached 
	 * from its parent.
	 * 
	 */
	public void garbage() {
		
		dispose(true);
	}


	/**
	 * Accept the provided visitor.
	 * Call the corresponding accept method in the visitor.
	 * @param visitor
	 * @return
	 */
	public void visit(ITileVisitor visitor) {
		visitor.accept(this);
	}
	
	/**
	 * Visit the children of this Tile.
	 * There is no child, so do nothing.
	 * @param visitor
	 */
	public void visitChildren(ITileVisitor visitor) {
	}

	
	/**
	 * Show item status.
	 */
	protected void showStatus()
	{
//		System.out.println( "EditorTile: " 
//				+ " disposed=" + editorControl.isDisposed()
//				+ ", visible=" + editorControl.isVisible()
//				+ ", garbState=" + garbageState
//				+ ", '" + editorPart.getTitle()
//				+ "', " + this);
		
		System.out.printf("EditorTile: disposed=%-5b, visible=%-5b, garbState=%-10s, %s, %s\n" 
				, editorControl.isDisposed(), (editorControl.isDisposed()?false:editorControl.isVisible()), garbageState, editorPart.getTitle(), this);

	}
}
