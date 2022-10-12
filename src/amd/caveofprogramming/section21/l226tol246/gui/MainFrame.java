package amd.caveofprogramming.section21.l226tol246.gui;

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class MainFrame extends JFrame {
	
	private static final long serialVersionUID = 1L;

	public MainFrame() {
		super("Game Of Life");
		
		GamePanel mainPanel = new GamePanel();
		
		setLayout(new BorderLayout());
		add(mainPanel, BorderLayout.CENTER);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);
		setVisible(true);
		
	}

}
