package amd.caveofprogramming.section13.l153;

import javax.swing.SwingUtilities;

public class PanelsAndLayouts {

	public static void main(String[] args) {

		SwingUtilities.invokeLater(() -> {
			new MainFrame("The App");
		});

	}

}
