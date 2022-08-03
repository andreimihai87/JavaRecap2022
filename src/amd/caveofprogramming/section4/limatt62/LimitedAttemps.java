package amd.caveofprogramming.section4.limatt62;

import java.util.Scanner;

public class LimitedAttemps {

	/*
	 * Create a program that asks for the user's password.
	 * 
	 * If they type the correct password, print 'Access granted' and end the
	 * program.
	 * 
	 * If they type the wrong password, print 'Incorrect password.', and ask for the
	 * password again.
	 * 
	 * If they type the wrong password three times, print 'Access denied' and end
	 * the program.
	 * 
	 * Hints: use a 'for' loop and the 'break' keyword. You can use a boolean flag.
	 * Do not use System.exit().
	 */

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		final String CORRECT_PASSWORD = "pass1";

		String passwordEntered = null;
		int countAttempts = 0;

		for (int i = 0; i < 3; i++) {
			System.out.print("Enter the password: ");
			passwordEntered = scanner.nextLine();

			if (passwordEntered.equals(CORRECT_PASSWORD)) {
				System.out.println("Access granted!");
				break;
			}
			System.out.println("Incorrect password!");
			countAttempts++;
		}
		if (countAttempts == 3) {
			System.out.println("Access denied!");
		}

		scanner.close();
	}

}
