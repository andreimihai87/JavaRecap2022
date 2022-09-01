package amd.caveofprogramming.section13.l154;

import javax.swing.SwingUtilities;

public class ToolbarComponent {

	public static void main(String[] args) {

		SwingUtilities.invokeLater(() -> {
			new MainFrame("The App");
		});

	}

}
