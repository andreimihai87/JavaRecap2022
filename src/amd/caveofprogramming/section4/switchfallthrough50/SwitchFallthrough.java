package amd.caveofprogramming.section4.switchfallthrough50;

import java.util.Scanner;

public class SwitchFallthrough {

	public static void main(String[] args) {

		System.out.println("Do you want to proceed? (y/n)");
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		scanner.close();
		
		switch (input) {
		case "y":
			System.out.println("Proceeding...");
			break;
		case "n":
			System.out.println("Not Proceeding.");
			break;
		default:
			System.out.println("Unrecognised option!");
			break;
		}
		
	}

}
