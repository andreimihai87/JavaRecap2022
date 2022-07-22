package amd.caveofprogramming.section4.convelseiftoswitch49;

import java.util.Scanner;

public class ConvertingIfElseToSwitch {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Menu");
		System.out.println("====");
		System.out.println("1. Print 'Hello!'");
		System.out.println("2. How are you?");
		System.out.println("3. Exit program");
		System.out.println();
		System.out.print("Enter an option: ");
		int input = scanner.nextInt();

		if (input > 100) {
			System.out.println("You have found the hidden Easter Egg!");
		} else {
			switch (input) {
			case 1:
				System.out.println("Hello!");
				break;
			case 2:
				System.out.println("How are you?");
				break;
			case 3:
				System.out.println("Exiting ...");
				System.exit(0);
				System.out.println("Doesn't reach this code!");
				break;
			default:
				System.out.println("Wrong Option!");
				break;
			}
		}
		scanner.close();

	}

}
