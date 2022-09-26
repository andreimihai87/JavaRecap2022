package amd.caveofprogramming.section15.l175;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JToolBar;

class RedButtonListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		Toolbar.getMainPanel().changeColor(Color.red);
	}
	
}

class BlueButtonListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		Toolbar.getMainPanel().changeColor(Color.blue);
	}
	
}

public class Toolbar extends JToolBar {
	
	private static final long serialVersionUID = 1L;
	private static MainPanel mainPanel;

	public Toolbar(MainPanel mainPanel) {
		Toolbar.mainPanel = mainPanel;
		final JButton redButton = new JButton("Red");
		final JButton blueButton = new JButton("Blue");
		
		redButton.addActionListener(new RedButtonListener());
		blueButton.addActionListener(new BlueButtonListener());
		
		add(redButton);
		add(blueButton);
	}
	
	public static MainPanel getMainPanel() {
		return mainPanel;
	}
}

