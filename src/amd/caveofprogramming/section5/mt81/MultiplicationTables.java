package amd.caveofprogramming.section5.mt81;

public class MultiplicationTables {

	/*
	 * Create a multiplication table, like this:
	 * 
	 * 1 2 3 4 ..... 12
	 * 2 4 6 8 ......24
	 * ....
	 * ...
	 * 
	 * 12 24 36 .....144
	 * 
	 */
	
	public static void main(String[] args) {

		final int TABLE_DIMENSION = 12;
		int[][] multiplicationTable = new int[TABLE_DIMENSION][TABLE_DIMENSION];

		// create the table
		for (int i = 0; i < multiplicationTable.length; i++) {
			for (int j = 0; j < multiplicationTable[i].length; j++) {
				multiplicationTable[i][j] = (j + 1) * (i + 1);
			}
		}

		// output the table
		for (int[] multiplicationTableLine : multiplicationTable) {
			for (int number : multiplicationTableLine) {
				System.out.printf("%4d", number);
			}
			System.out.println();
		}

	}

}
