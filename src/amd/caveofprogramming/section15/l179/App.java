package amd.caveofprogramming.section15.l179;

import javax.swing.SwingUtilities;

public class App {

	public static void main(String[] args) {

		SwingUtilities.invokeLater(() -> {
			new MainFrame("The App");
		});

	}

}
