package amd.caveofprogramming.section21.l226tol246.gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import amd.caveofprogramming.section21.l226tol246.model.World;

public class GamePanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private static final int CELL_SIZE = 50;

	private static final Color backgroundColor = Color.BLACK;
	private static final Color foregroundColor = Color.GREEN;
	private static final Color gridColor = Color.GRAY;

	private int leftRightMargin;
	private int topBottomMargin;

	public GamePanel() {
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

		World world = new World(rows, columns);

		g2.setColor(backgroundColor);
		g2.fillRect(0, 0, width, height);

		drawGrid(g2, width, height);

		world.setCell(0, 0, true);
		world.setCell(2, 4, true);
		world.setCell(3, 5, true);
		world.setCell(rows - 1, columns - 1, true);

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

}
