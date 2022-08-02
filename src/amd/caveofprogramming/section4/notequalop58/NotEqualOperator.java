package amd.caveofprogramming.section4.notequalop58;

public class NotEqualOperator {

	public static void main(String[] args) {

		// != "not equal operator" is binary operator

		int value1 = 3;
		int value2 = 4;

		if (value1 != value2) {
			System.out.println("They are not equal!");
		}

		System.out.println(value1 != value2);

		String fruit1 = "orange";
		String fruit2 = "apple";

		if (!fruit1.equals(fruit2)) {
			System.out.println("Fruits are not the same.");
		}

		// Unnecessarily confusing but instructive
		if (fruit1.equals(fruit2) != true) {
			System.out.println("Fruits are not the same.");
		}

	}

}
