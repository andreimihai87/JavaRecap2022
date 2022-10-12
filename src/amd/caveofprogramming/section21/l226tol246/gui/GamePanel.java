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
	private static final Color cellColor = Color.GRAY;
	
	private int leftRightMargin;
	private int topBottomMargin;
	
	public GamePanel() {
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		
		int width = getWidth();
		int height = getHeight();
		
		leftRightMargin = ((width & CELL_SIZE) + CELL_SIZE) / 2;
		topBottomMargin = ((height & CELL_SIZE) + CELL_SIZE) / 2;
		
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(backgroundColor);
		g2.drawRect(0, 0, width, height);
		
		g2.setColor(foregroundColor);
		g2.drawRect(leftRightMargin, topBottomMargin, width - 2 * leftRightMargin , height - 2 * topBottomMargin);
		
	}

}
