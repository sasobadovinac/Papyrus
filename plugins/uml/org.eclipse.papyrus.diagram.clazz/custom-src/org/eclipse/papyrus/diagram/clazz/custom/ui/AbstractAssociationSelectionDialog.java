package org.eclipse.papyrus.diagram.clazz.custom.ui;

import org.eclipse.papyrus.diagram.common.Activator;
import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.ExpandBar;
import org.eclipse.swt.widgets.ExpandItem;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Button;


public class AbstractAssociationSelectionDialog extends Dialog {

	protected Object result;

	protected Shell shlAssociationselection;
	protected Table table;

	protected Button btnOk;

	protected Button btnCancel;

	/**
	 * Create the dialog.
	 * @param parent
	 * @param style
	 */
	public AbstractAssociationSelectionDialog(Shell parent, int style) {
		super(parent, style);
		setText("SWT Dialog");
	}

	/**
	 * Open the dialog.
	 * @return the result
	 */
	public Object open() {
		createContents();
		shlAssociationselection.open();
		shlAssociationselection.layout();
		Display display = getParent().getDisplay();
		while(!shlAssociationselection.isDisposed()) {
			if(!display.readAndDispatch()) {
				display.sleep();
			}
		}
		return result;
	}

	/**
	 * Create contents of the dialog.
	 */
	protected void createContents() {
		shlAssociationselection = new Shell(getParent(), getStyle());
		shlAssociationselection.setSize(501, 227);
		shlAssociationselection.setText("AssociationSelection");
		shlAssociationselection.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		Composite composite = new Composite(shlAssociationselection, SWT.NONE);
		composite.setLayout(null);
		composite.setBackground(Display.getCurrent().getSystemColor(SWT.COLOR_WHITE));
		
		Label lblSelectTheAssociation = new Label(composite, SWT.NONE);
		lblSelectTheAssociation.setLocation(24, 10);
		lblSelectTheAssociation.setSize(441, 30);
		lblSelectTheAssociation.setText("Select the association for this instanceSpecification:");
		lblSelectTheAssociation.setBackground(Display.getCurrent().getSystemColor(SWT.COLOR_WIDGET_LIGHT_SHADOW));
		FontData[] fontdatas= {new FontData("Tahoma", 12, SWT.BOLD)};
		lblSelectTheAssociation.setFont(Activator.getFontManager().get(fontdatas));
		table = new Table(composite, SWT.BORDER | SWT.FULL_SELECTION);
		table.setBounds(25, 48, 440, 85);
		
		btnOk = new Button(composite, SWT.NONE);
		btnOk.setBounds(396, 159, 68, 23);
		btnOk.setText("Ok");
		
		btnCancel = new Button(composite, SWT.NONE);
		btnCancel.setBounds(291, 159, 68, 23);
		btnCancel.setText("Cancel");

	}
}
