package amd.caveofprogramming.section4.ifelseif45;

import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Menu");
		System.out.println("====");
		System.out.println("1. Print 'Hello!'");
		System.out.println("2. Exit program");
		System.out.println();
		System.out.print("Enter an option: ");
		double input = scanner.nextInt();

		if (input == 1) {
			System.out.println("Hello!");
		} else if (input == 2) {
			System.out.println("Exiting ...");
		} else {
			System.out.println("Wrong Option!");
		}

		scanner.close();

	}

}
