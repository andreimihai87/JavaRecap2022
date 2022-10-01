package amd.caveofprogramming.section15.l181;

import java.awt.Color;

import javax.swing.JPanel;

public class MainPanel extends JPanel implements IColorChangeListener {
	
	private static final long serialVersionUID = 1L;
	
	public MainPanel(Color color) {
		setBackground(color);
	}
	
	@Override
	public void changeColor(Color color) {
		setBackground(color);
	}

}
