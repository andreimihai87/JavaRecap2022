package amd.caveofprogramming.section4.cpdowhile60;

import java.util.Scanner;

public class CheckPassDoWhile {

	public static void main(String[] args) {

		final String CORRECT_PASSWORD = "mime";

		Scanner scanner = new Scanner(System.in);
		String enteredPassword = null;

		do {
			System.out.print("Enter password:");
			enteredPassword = scanner.nextLine();
		} while (!enteredPassword.equals(CORRECT_PASSWORD));

		System.out.println("Access granted!");
		scanner.close();

	}

}
