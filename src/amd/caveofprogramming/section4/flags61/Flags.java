package amd.caveofprogramming.section4.flags61;

import java.util.Scanner;

public class Flags {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		boolean isVolcanoTyped = false;

		for (;;) {

			System.out.print(" > ");
			String input = scanner.nextLine();

			if (input.equals("quit")) {
				break;
			} else if (input.equals("volcano")) {
				isVolcanoTyped = true;
			}
		}

		if (isVolcanoTyped) {
			System.out.println("Volcano word entered");
		} else {
			System.out.println("Volcano word not entered");
		}

		scanner.close();

	}

}
