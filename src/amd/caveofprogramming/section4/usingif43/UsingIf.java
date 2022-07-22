package amd.caveofprogramming.section4.usingif43;

import java.util.Scanner;

public class UsingIf {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the room temperature in F: ");

		double temperatureFahrenheit = scanner.nextFloat();

		double temperatureCelsius = (temperatureFahrenheit - 31) * (5.0 / 9.0);

		System.out.printf("Celsius temperature is: %.2f ", temperatureCelsius);

		scanner.close();

		if (temperatureCelsius < 21) {
			System.out.println("Too cold");
		}

		if (temperatureCelsius >= 21 && temperatureCelsius <= 31) {
			System.out.println("Warm enough");
		}

		if (temperatureCelsius > 31) {
			System.out.println("Too hot");
		}
		
	}

}
