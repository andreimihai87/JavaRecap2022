package amd.caveofprogramming.section4.ifelse44;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the room temperature in F: ");

		double temperatureFahrenheit = scanner.nextFloat();

		double temperatureCelsius = (temperatureFahrenheit - 31) * (5.0 / 9.0);

		System.out.printf("Celsius temperature is: %.2f ", temperatureCelsius);

		scanner.close();

		if (temperatureCelsius < 21) {
			System.out.println("Too cold");
		} else {
			System.out.println("Warm enough");
		}

	}

}
