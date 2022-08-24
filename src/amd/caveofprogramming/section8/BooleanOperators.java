package amd.caveofprogramming.section8;

public class BooleanOperators {

	public static void main(String[] args) {

		// ==, !=, !, &&, || - boolean operators

		boolean isRaining = true;
		boolean iHaveUmbrella = true;
		boolean takeUmbrella = false;

		// && - and
		// 1
		if (isRaining) {
			if (iHaveUmbrella) {
				takeUmbrella = true;
			}
		}
		System.out.println(takeUmbrella);

		// 2
		takeUmbrella = false;
		takeUmbrella = isRaining && iHaveUmbrella ? true : false;
		System.out.println(takeUmbrella);

		// 3
		takeUmbrella = false;
		takeUmbrella = isRaining && iHaveUmbrella;
		System.out.println(takeUmbrella);

		// || - or
		boolean mightRain = false;
		takeUmbrella = false;
		if (isRaining || mightRain) {
			takeUmbrella = true;
		}
		System.out.println(takeUmbrella);

		
		// complex operations with boolean operators
		isRaining = true;
		mightRain = false;
		iHaveUmbrella = true;
		
		// 1
		if (iHaveUmbrella && (isRaining || mightRain)) {
			System.out.println("Take umbrella.");
		} else {
			System.out.println("Don't take umbrella.");
		}
		
		// 2
		boolean rainCheck = isRaining || mightRain;
		if (iHaveUmbrella && rainCheck) {
			System.out.println("Take umbrella.");
		} else {
			System.out.println("Don't take umbrella.");
		}

	}

}
