package amd.caveofprogramming.section13.l152;

import javax.swing.SwingUtilities;

public class SwingCustomComponents {

	public static void main(String[] args) {

		SwingUtilities.invokeLater(() -> {
			new MainFrame("The App");
		});
		
	}

}
