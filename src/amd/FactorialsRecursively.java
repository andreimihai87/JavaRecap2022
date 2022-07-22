package amd;

import java.util.Scanner;

public class FactorialsRecursively {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number for which you want to calculate the factorial: ");
		int number = scanner.nextInt();
		
		System.out.println(number + "! = " + fact(number));
		
		scanner.close();
	}
	
	private static int fact(int number) {
		if (number == 0 || number == 1) {
			return 1;
		}
		return number * fact(number - 1);
	}

}
