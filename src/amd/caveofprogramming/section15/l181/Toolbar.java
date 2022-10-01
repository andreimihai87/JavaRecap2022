package amd.caveofprogramming.section15.l181;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JToolBar;

class ColorButtonListener implements ActionListener {
	
	private IColorChangeListener colorChanger;
	private Color color;
	
	public ColorButtonListener(IColorChangeListener colorChanger, Color color) {
		this.colorChanger = colorChanger;
		this.color = color;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		colorChanger.changeColor(color);
	}

}

public class Toolbar extends JToolBar {

	private static final long serialVersionUID = 1L;

	public Toolbar(IColorChangeListener colorChanger) {
		final JButton redButton = new JButton("Red");
		final JButton blueButton = new JButton("Blue");

		redButton.addActionListener(new ColorButtonListener(colorChanger, Color.red));
		blueButton.addActionListener(new ColorButtonListener(colorChanger, Color.blue));

		add(redButton);
		add(blueButton);
	}
}
