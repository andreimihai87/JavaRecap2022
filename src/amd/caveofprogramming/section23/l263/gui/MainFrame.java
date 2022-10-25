package amd.caveofprogramming.section23.l263.gui;

import java.awt.BorderLayout;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private static final String FILE_NAME = "grid.txt";

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

		GamePanel gamePanel = new GamePanel();

		JFileChooser fileChooser = new JFileChooser();
		
		File file = new File(FILE_NAME);
		fileChooser.setCurrentDirectory(file);
		fileChooser.setSelectedFile(file);
		
		FileNameExtensionFilter fileFilter = new FileNameExtensionFilter("Game of Life Files", "txt");
		fileChooser.addChoosableFileFilter(fileFilter);
		fileChooser.setFileFilter(fileFilter);

		// with lambda expression
		openItem.addActionListener((e) -> {
			int optionChoosed = fileChooser.showOpenDialog(MainFrame.this);
			if (optionChoosed == JFileChooser.APPROVE_OPTION) {
				File selectedFile = fileChooser.getSelectedFile();
				
				gamePanel.loadGrid(selectedFile);
				
				System.out.println("Opened " + selectedFile);
			}
		});
		// with anonymous class
		saveItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int optionChoosed = fileChooser.showSaveDialog(MainFrame.this);
				if (optionChoosed == JFileChooser.APPROVE_OPTION) {
					File selectedFile = fileChooser.getSelectedFile();

					gamePanel.saveGrid(selectedFile);

					System.out.println("Saved " + selectedFile);
				}
			}
		});

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
