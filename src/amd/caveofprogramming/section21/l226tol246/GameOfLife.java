package amd.caveofprogramming.section21.l226tol246;

import javax.swing.SwingUtilities;

import amd.caveofprogramming.section21.l226tol246.gui.MainFrame;

public class GameOfLife {

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new MainFrame();
			}
		});

	}

}
