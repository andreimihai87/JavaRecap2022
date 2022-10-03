package amd.caveofprogramming.section17.l191;

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
		final JButton greenButton = new JButton("Green");

		blueButton.addActionListener(e -> colorChanger.changeColor(Color.blue));

		redButton.addActionListener((e) -> {
			colorChanger.changeColor(Color.red);
		});

		greenButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				colorChanger.changeColor(Color.green);
			}
		});

		add(redButton);
		add(blueButton);
		add(greenButton);
	}

	public void setColorChanger(IColorChangeListener colorChanger) {
		this.colorChanger = colorChanger;
	}

}
