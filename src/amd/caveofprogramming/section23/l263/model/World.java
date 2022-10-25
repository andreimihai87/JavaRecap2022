package amd.caveofprogramming.section23.l263.model;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class World {

	private int rows;
	private int columns;

	private boolean[][] grid;
	private boolean[][] gridBuffer;

	public World(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;

		grid = new boolean[rows][columns];
		gridBuffer = new boolean[rows][columns];
	}

	public boolean getCell(int row, int col) {
		return grid[row][col];
	}

	public void setCell(int row, int col, boolean status) {
		grid[row][col] = status;
	}

	public void displayGrid(boolean[][] grid) {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.printf("[%d][%d]=%5s", i, j, grid[i][j]);
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
				// @formatter:off
				/*
				 * if neighbors < 2 - deactivate cell;
				 * if neighbors > 3 deactivate cell;
				 * if neighbors == 3 activate cell;
				 * if neighbors == 2 let the cell like it is
				 */
				// @formatter:on
				boolean status = false;
				if (countingNeighbours(row, col) < 2 || countingNeighbours(row, col) > 3) {
					status = false;
				} else if (countingNeighbours(row, col) == 3) {
					status = true;
				} else if (countingNeighbours(row, col) == 2) {
					status = getCell(row, col);
				}
				gridBuffer[row][col] = status;
			}
		}
		copyTheGrid(gridBuffer, grid);
	}

	private void copyTheGrid(boolean[][] grid1, boolean[][] grid2) {
		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < columns; col++) {
				grid2[row][col] = grid1[row][col];
			}
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

	public void saveGrid(File selectedFile) {
		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(selectedFile))) {
			dos.writeInt(getRows());
			dos.writeInt(getColumns());
			for (boolean[] row : grid) {
				for (boolean col : row) {
					dos.writeBoolean(col);
				}
			}
		} catch (FileNotFoundException e1) {
			System.out.println("Cannot open file " + selectedFile);
		} catch (IOException e1) {
			System.out.println("Cannot write file " + selectedFile);
		}
	}

	public void loadGrid(File selectedFile) {
		try (DataInputStream dis = new DataInputStream(new FileInputStream(selectedFile))) {

			int loadedRows = dis.readInt();
			int loadedCols = dis.readInt();

			for (int row = 0; row < loadedRows; row++) {
				for (int col = 0; col < loadedCols; col++) {
					boolean status = dis.readBoolean();
					if (row >= rows || col >= columns) {
						continue;
					}
					grid[row][col] = status;
				}
			}

		} catch (FileNotFoundException e1) {
			System.out.println("Cannot open file " + selectedFile);
		} catch (IOException e1) {
			System.out.println("Cannot write file " + selectedFile);
		}
	}

}
