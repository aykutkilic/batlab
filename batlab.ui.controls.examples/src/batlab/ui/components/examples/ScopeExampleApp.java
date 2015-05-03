package batlab.ui.components.examples;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import batlab.ui.controls.scope.ArrowLabel;
import org.eclipse.swt.SWT;
import batlab.ui.controls.scope.ScopeControl;
import org.eclipse.swt.widgets.Combo;

public class ScopeExampleApp {

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		Display display = Display.getDefault();
		Shell shell = new Shell();
		shell.setSize(1024, 768);
		shell.setText("BATLAB Scope Control Test");
		
		ScopeControl scopeControl = new ScopeControl(shell, SWT.NONE);
		scopeControl.setBounds(10, 10, 988, 556);

		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
}
