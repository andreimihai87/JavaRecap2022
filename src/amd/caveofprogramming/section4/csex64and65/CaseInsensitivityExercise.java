package amd.caveofprogramming.section4.csex64and65;

import java.util.Scanner;

public class CaseInsensitivityExercise {

	/**
	 * 
	 * Create a program that asks the user to enter a command.
	 * 
	 * If they hit the return key without entering anything, ask them again to enter
	 * a command.
	 * 
	 * If they enter 'start' or 'START', regardless of capitalization, print
	 * 'Machine starting ....'
	 * 
	 * If they enter 'stop', regardless of capitalization, print 'Machine stopping
	 * ....'.
	 * 
	 * If they enter 'quit', print 'Exiting ....' and quit the program.
	 * 
	 * Otherwise print 'Unrecognized command'.
	 * 
	 * Ask them to enter a command repeatedly until they stop the program by
	 * entering 'quit'.
	 * 
	 * Hints:
	 * 
	 * Use the string length to determine if they have entered nothing.
	 * 
	 * To check user input, use "if".
	 * 
	 */

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("Enter a command: ");
			String command = scanner.nextLine();

			if (command.length() == 0) {
				continue;
			}

			if (command.equalsIgnoreCase("start")) {
				System.out.println("Machine starting ....");
			} else if (command.equalsIgnoreCase("stop")) {
				System.out.println("Machine stopping ....");
			} else if (command.equalsIgnoreCase("quit")) {
				System.out.println("Exiting ....");
				break;
			} else {
				System.out.println("Unrecognized command");
			}
		}

		scanner.close();

	}

}
