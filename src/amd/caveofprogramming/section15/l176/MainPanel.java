package amd.caveofprogramming.section15.l176;

import java.awt.Color;

import javax.swing.JPanel;

public class MainPanel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	public MainPanel(Color color) {
		setBackground(color);
	}
	
	public void changeColor(Color color) {
		setBackground(color);
	}

}
