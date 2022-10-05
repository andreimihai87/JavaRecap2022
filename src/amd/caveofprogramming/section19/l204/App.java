package amd.caveofprogramming.section19.l204;

import java.util.Scanner;

public class App {

	private static Scanner scanner1 = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("You entered: " + getNumber());
		scanner1.close();

	}

	private static int getNumber() {
		int number = 0;
		boolean isNumber = false;
		do {
			System.out.print("Please enter a number: ");
			String line = scanner1.nextLine();

			try {
				number = Integer.parseInt(line);
				isNumber = true;
			} catch (NumberFormatException e) {
				System.out.println("Invalid number!");
			}
			
		} while (!isNumber);
		
		return number;
	}

}
