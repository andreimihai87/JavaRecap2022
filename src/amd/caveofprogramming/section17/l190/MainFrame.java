package amd.caveofprogramming.section17.l190;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

public class MainFrame extends JFrame{
	
	private static final long serialVersionUID = 1L;

	public MainFrame(String title) {
		super(title);

		MainPanel mainPanel = new MainPanel(Color.green);
		Toolbar toolbar = new Toolbar();
		
		toolbar.setColorChanger(mainPanel);
		
		setLayout(new BorderLayout());
		add(toolbar, BorderLayout.NORTH);
		add(mainPanel, BorderLayout.CENTER);
		
		setSize(600, 400);
		setLocation(500, 200);
		setDefaultCloseOperation(MainFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

}
