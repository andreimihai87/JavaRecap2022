package amd.caveofprogramming.section4.varscope59;

import java.util.Scanner;

public class VariableScope {

	public static void main(String[] args) {

		{
			int value = 0;
			System.out.println(value);
		}

		// ERROR - out of scope!
		// System.out.println(value);

		Scanner scanner = new Scanner(System.in);
		String input = null;
		do {
			System.out.println("Type 'quit' to quit the program!");
			input = scanner.nextLine();
		} while (!input.equals("quit"));

		// do {
		// String input = scanner.nextLine();
		// } while (!input.equals("quit")); - ERROR - input out of scope!

		scanner.close();

		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}

		// ERROR - out of scope!
		// System.out.println(i);

	}

}
