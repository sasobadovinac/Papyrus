/*******************************************************************************
 * Copyright (c) 2008 CEA.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     CEA - initial API and implementation
 *     Obeo
 *******************************************************************************/
package org.eclipse.papyrus.tabbedproperties.uml.figures;

//Start of user code for user imports
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.forms.events.ExpansionAdapter;
import org.eclipse.ui.forms.events.ExpansionEvent;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;

import org.eclipse.papyrus.tabbedproperties.core.forms.PropertyEditor;
import org.eclipse.papyrus.tabbedproperties.core.forms.AbstractControlsGroup;

import org.eclipse.papyrus.tabbedproperties.core.forms.AdvancedReferencedTable;

//End of user code for user imports

/**
 * The BehavioredClassifierForm form
 *
 *
 * @generated
 */ 
public class BehavioredClassifierFormForm extends AbstractControlsGroup {

	/**
	 * The label used as a title of the composite section
	 */
	private String label;
	
	/**
	 * The description used as a tool tip text of the composite
	 */
	private String description;
	
	public BehavioredClassifierFormForm(String label, String description){
		this.label=label;
		this.description=description;
	}

	protected AdvancedReferencedTable interfaceRealization;

    
    /**
     * Creates direct children
     * @generated
     */
    public void createDirectChildren() {
		//
		interfaceRealization = new AdvancedReferencedTable("InterfaceRealizations",new org.eclipse.papyrus.tabbedproperties.core.filters.InterfaceRealizationFilter(),backContext);
		this.add(interfaceRealization);
     

    }

    /**
     * Create the composite used to lay children.
     * @generated
     */
     public Composite createLocalControls(Composite parent) {
        final Section composite = getWidgetFactory().createSection(parent, Section.TITLE_BAR|Section.TWISTIE);
     	composite.setText(label);
     	composite.setToolTipText(description);
     	composite.addExpansionListener(new ExpansionAdapter() {
			public void expansionStateChanged(ExpansionEvent e) {
				//FIXME use resizeScrolledComposite added in eclipse 3.5
				//getTabbedPropertySheetPage().resizeScrolledComposite();
				Control control = getTabbedPropertySheetPage().getControl();
				if(control instanceof org.eclipse.ui.internal.views.properties.tabbed.view.TabbedPropertyComposite){
					ScrolledComposite sc = ((org.eclipse.ui.internal.views.properties.tabbed.view.TabbedPropertyComposite)control).getScrolledComposite();
					if(e.getState()){
						sc.setExpandHorizontal(true);
						Point sectionSize = composite.computeSize(SWT.DEFAULT, SWT.DEFAULT);
						Point newPoint = new Point(sectionSize.x, sc.getSize().y + sectionSize.y);
						sc.setMinSize(newPoint);
						sc.redraw();
					}else{
						sc.setMinSize(composite.computeSize(SWT.DEFAULT, SWT.DEFAULT));
						sc.redraw();
					}
    			}
    		}
    	});
        
        //Start of user code for create local controls    	
       //RowLayout rowLayout = new RowLayout();
		FillLayout layout = new FillLayout(SWT.VERTICAL);
		
		//composite.setLayout(rowLayout);
        //layout.spacing = ITabbedPropertyConstants.HSPACE;
        composite.setLayout(layout);

    	//End of user code for create local controls
        return composite;
    }

 	
/**
     * @return the interfaceRealization
     */
    public AdvancedReferencedTable getInterfaceRealization() {
        return interfaceRealization;
    }
 	
}