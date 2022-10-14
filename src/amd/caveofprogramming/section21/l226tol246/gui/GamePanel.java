package amd.caveofprogramming.section21.l226tol246.gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import javax.swing.JPanel;

import amd.caveofprogramming.section21.l226tol246.model.World;

public class GamePanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private static final int CELL_SIZE = 20;

	private static final Color backgroundColor = Color.BLACK;
	private static final Color foregroundColor = Color.GREEN;
	private static final Color gridColor = Color.GRAY;

	private int leftRightMargin;
	private int topBottomMargin;

	private World world;

	public GamePanel() {

		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				int row = (e.getY() - topBottomMargin) / CELL_SIZE;
				int col = (e.getX() - leftRightMargin) / CELL_SIZE;

				if (row >= world.getRows() || col >= world.getColumns()) {
					return;
				}

				boolean status = world.getCell(row, col);
				world.setCell(row, col, !status);

				repaint();
			}
		});

		// run automatically
		Executors.newScheduledThreadPool(1).scheduleAtFixedRate(() -> next(), 1000, 500, TimeUnit.MILLISECONDS);
	}

	@Override
	protected void paintComponent(Graphics g) {

		Graphics2D g2 = (Graphics2D) g;

		int width = getWidth();
		int height = getHeight();

		leftRightMargin = ((width % CELL_SIZE) + CELL_SIZE) / 2;
		topBottomMargin = ((height % CELL_SIZE) + CELL_SIZE) / 2;

		int columns = (width - 2 * leftRightMargin) / CELL_SIZE;
		int rows = (height - 2 * topBottomMargin) / CELL_SIZE;

		if (world == null || world.getRows() != rows || world.getColumns() != columns) {
			world = new World(rows, columns);
		}

		g2.setColor(backgroundColor);
		g2.fillRect(0, 0, width, height);

		drawGrid(g2, width, height);

		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < columns; col++) {
				boolean status = world.getCell(row, col);
				fillCell(g2, row, col, status);
			}
		}

	}

	private void fillCell(Graphics2D g2, int row, int col, boolean status) {

		if (status) {
			g2.setColor(foregroundColor);
		} else {
			g2.setColor(backgroundColor);
		}
		int x = leftRightMargin + col * CELL_SIZE;
		int y = topBottomMargin + row * CELL_SIZE;
		
		g2.fillRect(x + 1, y + 1, CELL_SIZE - 1, CELL_SIZE - 1);

	}

	private void drawGrid(Graphics2D g2, int width, int height) {

		g2.setColor(gridColor);

		int maxWidth = leftRightMargin;
		while (maxWidth <= width - leftRightMargin) {
			g2.drawLine(maxWidth, topBottomMargin, maxWidth, height - topBottomMargin - 1);
			maxWidth += CELL_SIZE;
		}

		int maxHeight = topBottomMargin;
		while (maxHeight <= height - topBottomMargin) {
			g2.drawLine(leftRightMargin, maxHeight, width - leftRightMargin, maxHeight);
			maxHeight += CELL_SIZE;
		}

	}
	
	public void randomize() {
		world.randomize();
		repaint();
	}
	
	public void clear() {
		world.clear();
		repaint();
	}

	public void next() {
		world.next();
		repaint();
	}

}
