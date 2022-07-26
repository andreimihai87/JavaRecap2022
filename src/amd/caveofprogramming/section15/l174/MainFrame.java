package amd.caveofprogramming.section15.l174;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

public class MainFrame extends JFrame{
	
	private static final long serialVersionUID = 1L;

	public MainFrame(String title) {
		super(title);
		
		setLayout(new BorderLayout());
		add(new Toolbar(), BorderLayout.NORTH);
		add(new MainPanel(Color.green), BorderLayout.CENTER);
		add(new MainPanel(Color.yellow), BorderLayout.SOUTH);
		
		setSize(600, 400);
		setLocation(500, 200);
		setDefaultCloseOperation(MainFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

}
