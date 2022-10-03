package amd.caveofprogramming.section17.l190;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JToolBar;

public class Toolbar extends JToolBar {

	private static final long serialVersionUID = 1L;
	private IColorChangeListener colorChanger;

	public Toolbar() {
		final JButton redButton = new JButton("Red");
		final JButton blueButton = new JButton("Blue");

		redButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				colorChanger.changeColor(Color.red);
			}
		});
		blueButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				colorChanger.changeColor(Color.blue);
			}
		});

		add(redButton);
		add(blueButton);
	}

	public void setColorChanger(IColorChangeListener colorChanger) {
		this.colorChanger = colorChanger;
	}
	
}
