package amd.caveofprogramming.section21.l226tol246.model;

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
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				System.out.printf("[%d][%d]=%5s", i, j , getCell(i, j));
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

}
