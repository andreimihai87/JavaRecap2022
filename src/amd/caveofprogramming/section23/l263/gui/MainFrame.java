package amd.caveofprogramming.section23.l263.gui;

import java.awt.BorderLayout;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	public MainFrame() {
		super("Game Of Life");

		MenuItem openItem = new MenuItem("Open");
		MenuItem saveItem = new MenuItem("Save");

		Menu fileMenu = new Menu("File");
		fileMenu.add(openItem);
		fileMenu.add(saveItem);

		MenuBar menuBar = new MenuBar();
		menuBar.add(fileMenu);

		setMenuBar(menuBar);

		JFileChooser fileChooser = new JFileChooser();

		// with lambda expression
		openItem.addActionListener((e) -> System.out.println("Open"));
		// with anonymous class
		saveItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int optionChoosed = fileChooser.showSaveDialog(MainFrame.this);
				if (optionChoosed == JFileChooser.APPROVE_OPTION) {
					System.out.println("Save");
				}
			}
		});

		GamePanel gamePanel = new GamePanel();

		setLayout(new BorderLayout());
		add(gamePanel, BorderLayout.CENTER);

		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
				switch (keyCode) {
				case 8:
					gamePanel.clear();
					break;
				case 10:
					gamePanel.randomize();
					break;
				case 32:
					gamePanel.next();
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
