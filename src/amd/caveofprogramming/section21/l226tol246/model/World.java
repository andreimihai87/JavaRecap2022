package amd.caveofprogramming.section21.l226tol246.model;

import java.util.Arrays;
import java.util.Random;

public class World {

	private int rows;
	private int columns;

	private boolean[][] grid;

	public World(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;

		grid = new boolean[rows][columns];
	}

	public boolean getCell(int row, int col) {
		return grid[row][col];
	}

	public void setCell(int row, int col, boolean status) {
		grid[row][col] = status;
	}
	
	public void displayGrid() {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.printf("[%d][%d]=%5s", i, j, getCell(i, j));
			}
			System.out.println();
		}
		System.out.println();
	}

	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}

	public void randomize() {
		Random random = new Random();
		for (int i = 0; i < rows * columns / 10; i++) {
			int row = random.nextInt(rows);
			int col = random.nextInt(columns);
			setCell(row, col, true);
		}
	}

	public void clear() {
		for (int row = 0; row < rows; row++) {
			Arrays.fill(grid[row], false);
		}
	}

	public void next() {
		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < columns; col++) {
				System.out.printf("(%d,%d)=%d ", row, col, countingNeighbours(row, col));
			}
			System.out.println();
		}
	}

	private int countingNeighbours(int row, int col) {
		int neighbours = 0;
		int startA = -1;
		int stopA = 2;
		int startB = -1;
		int stopB = 2;
		if (row == 0) {
			startA = 0;
		}
		if (col == 0) {
			startB = 0;
		}
		if (row == rows - 1) {
			stopA = 1;
		}
		if (col == columns - 1) {
			stopB = 1;
		}
		for (int a = startA; a < stopA; a++) {
			for (int b = startB; b < stopB; b++) {
				if (a == 0 && b == 0) {
					continue;
				}
				if (getCell(row + a, col + b)) {
					neighbours++;
				}
			}
		}
		return neighbours;
	}

}
