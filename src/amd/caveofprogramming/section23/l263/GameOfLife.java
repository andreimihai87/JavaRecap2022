package amd.caveofprogramming.section23.l263;

import javax.swing.SwingUtilities;

import amd.caveofprogramming.section23.l263.gui.MainFrame;

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
