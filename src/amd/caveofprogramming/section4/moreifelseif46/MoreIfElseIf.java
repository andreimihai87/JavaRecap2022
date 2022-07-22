package amd.caveofprogramming.section4.moreifelseif46;

import java.util.Scanner;

public class MoreIfElseIf {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Menu");
		System.out.println("====");
		System.out.println("1. Print 'Hello!'");
		System.out.println("2. How are you?");
		System.out.println("3. Exit program");
		System.out.println();
		System.out.print("Enter an option: ");
		double input = scanner.nextInt();

		if (input == 1) {
			System.out.println("Hello!");
		} else if (input == 2) {
			System.out.println("How are you?");
		} else if (input == 3) {
			System.out.println("Exiting ...");
			System.exit(0);
			System.out.println("Doesn't reach this code!");
		} else if (input > 100) {
			System.out.println("You've found the hidden Easter Egg!");
		} else {
			System.out.println("Wrong Option!");
		}

		scanner.close();

	}
}
