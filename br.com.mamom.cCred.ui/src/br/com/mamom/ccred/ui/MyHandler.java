 
package br.com.mamom.ccred.ui;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;

public class MyHandler {
	@Execute
	public void execute(Shell parent) {
		MessageDialog.openInformation(parent, "", "Hello Eclipse4!");
	}
		
}