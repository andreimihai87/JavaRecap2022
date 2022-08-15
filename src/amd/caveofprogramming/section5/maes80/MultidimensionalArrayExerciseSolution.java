package amd.caveofprogramming.section5.maes80;

public class MultidimensionalArrayExerciseSolution {

	/*
	 * Exercise:
	 * 
	 * Create a multidimensional array of int. Make it 3 x 3 Loop through it and
	 * output all the values on the diagonal, from top left to bottom right. Add up
	 * these values and print the total.
	 *
	 */

	public static void main(String[] args) {

		int[][] matrix = { 
				{ 1, 2, 3 }, 
				{ 4, 5, 6 }, 
				{ 7, 8, 9 } 
		};

		for (int[] matrixLine : matrix) {
			for (int number : matrixLine) {
				System.out.printf("%d\t", number);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Numbers on the diagonal from top left to bottom right are: ");
		int sumOfNumbers = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (i == j) {
					if (i == 1) {
						System.out.print("\t");
					} else if (i == 2) {
						System.out.print("\t\t");
					}
					System.out.println(matrix[i][j]);
					sumOfNumbers += matrix[i][j];
				}
			}
		}
		System.out.println("Sum of the numbers on the diagonal, from top left to bottom right, is: " + sumOfNumbers);

	}
}
