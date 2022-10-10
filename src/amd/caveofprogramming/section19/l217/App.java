package amd.caveofprogramming.section19.l217;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		try (Scanner scanner1 = new Scanner(System.in)) {
			System.out.print("Please enter a number: ");
			int number = scanner1.nextInt();
			System.out.println("The number is " + number);
		} catch (Exception e) {
			System.out.println("Invalid number!");
		}

	}

}
