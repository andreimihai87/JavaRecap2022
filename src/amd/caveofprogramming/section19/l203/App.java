package amd.caveofprogramming.section19.l203;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner scanner1 = new Scanner(System.in);
		
		System.out.println("Please enter a number: ");
		String line = scanner1.nextLine();
		
		int number = 0;

		try {
			number = Integer.parseInt(line);
		} catch (NumberFormatException e) {
			System.out.println("Invalid number!");
		}
		
		System.out.println("You entered: " + number);
		
		scanner1.close();
		
	}

}
