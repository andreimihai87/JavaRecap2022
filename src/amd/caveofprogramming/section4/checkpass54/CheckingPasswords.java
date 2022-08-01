package amd.caveofprogramming.section4.checkpass54;

import java.util.Scanner;

public class CheckingPasswords {
	public static void main(String[] args) {

		final String CURRENT_PASSWORD = "Pass1.";

		Scanner scanner = new Scanner(System.in);
		String enteredPassword;

		while (true) {
			System.out.print("Please enter the password: ");
			enteredPassword = scanner.nextLine();
			if (enteredPassword.equals(CURRENT_PASSWORD)) {
				System.out.println("Access granted!");
				break;
			}
			System.out.print("Access denied, try again.\n");
		}
		scanner.close();

	}
}
