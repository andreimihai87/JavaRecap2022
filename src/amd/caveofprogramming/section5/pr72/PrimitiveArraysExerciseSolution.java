package amd.caveofprogramming.section5.pr72;

import java.util.Scanner;

public class PrimitiveArraysExerciseSolution {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		final int NR_OF_NUMBERS = 3;
		
		int sumOfNumbers = 0;
		int[] numbers = new int[NR_OF_NUMBERS];

		System.out.println("Enter three numbers to see their sum.");

		for (int i = 0; i < numbers.length; i++) {
			System.out.print("Number " + (i + 1) + ": ");
			numbers[i] = scanner.nextInt();
			sumOfNumbers += numbers[i];
		}

		System.out.print("Numbers are: ");
//		for (int i = 0; i < numbers.length; i++) {
//			System.out.print(numbers[i] + " ");
//		}
		for (int number : numbers) {
			System.out.print(number + " ");
		}
		System.out.println("\nThe sum of the numbers is: " + sumOfNumbers);

		scanner.close();

	}

}
