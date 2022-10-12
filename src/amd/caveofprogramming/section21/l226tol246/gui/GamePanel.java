package amd.caveofprogramming.section21.l226tol246.gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

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

		g2.setColor(backgroundColor);
		g2.fillRect(0, 0, width, height);

//		g2.setColor(foregroundColor);
//		g2.fillRect(leftRightMargin, topBottomMargin, width - 2 * leftRightMargin, height - 2 * topBottomMargin);

		drawGrid(g2, width, height);

	}

	private void drawGrid(Graphics2D g2, int width, int height) {

		g2.setColor(gridColor);

		// My implementation
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

		// COV implementation
//		for(int x = leftRightMargin; x <= width - leftRightMargin; x += CELL_SIZE) {
//			g2.drawLine(x, topBottomMargin, x, height - topBottomMargin);
//		}
//		
//		for(int y = topBottomMargin; y <= height - topBottomMargin; y += CELL_SIZE) {
//			g2.drawLine(leftRightMargin, y, width - leftRightMargin, y);
//		}

	}

}
