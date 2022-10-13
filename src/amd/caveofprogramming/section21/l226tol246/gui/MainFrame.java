package amd.caveofprogramming.section21.l226tol246.gui;

import java.awt.BorderLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
	
	private static final long serialVersionUID = 1L;

	public MainFrame() {
		super("Game Of Life");
		
		GamePanel gamePanel = new GamePanel();
		
		setLayout(new BorderLayout());
		add(gamePanel, BorderLayout.CENTER);
		
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
				switch (keyCode) {
				case 8:
					System.out.println("back space");
					break;
				case 10:
					gamePanel.randomize();
					break;
				case 32:
					System.out.println("space");
					break;
				default:
					break;
				}
			}
		});

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);
		setVisible(true);
		
	}

}
