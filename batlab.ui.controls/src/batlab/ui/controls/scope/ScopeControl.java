package batlab.ui.controls.scope;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tree;

public class ScopeControl extends Composite {
	private Text text;

	public ScopeControl(Composite parent, int style) {
		super(parent, style);
		setLayout(new GridLayout(2, false));
		
		ArrowLabel arrow1 = new ArrowLabel(this, SWT.NONE);
		arrow1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Combo combo_1 = new Combo(this, SWT.NONE);
		combo_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(this, SWT.NONE);
		Combo combo = new Combo(this, SWT.NONE);
		combo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		text = new Text(this, SWT.BORDER);
		text.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		
		Tree tree_2 = new Tree(this, SWT.BORDER);
		tree_2.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		new Label(this, SWT.NONE);
		
		Tree tree = new Tree(this, SWT.BORDER);
		GridData gd_tree = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
		gd_tree.heightHint = 67;
		tree.setLayoutData(gd_tree);
		new Label(this, SWT.NONE);
		
		Tree tree_4 = new Tree(this, SWT.BORDER);
		tree_4.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		new Label(this, SWT.NONE);
		
		Tree tree_3 = new Tree(this, SWT.BORDER);
		tree_3.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		new Label(this, SWT.NONE);
		
		Tree tree_5 = new Tree(this, SWT.BORDER);
		tree_5.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		new Label(this, SWT.NONE);
		// TODO Auto-generated constructor stub
	}
}
