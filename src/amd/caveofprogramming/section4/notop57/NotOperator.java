package amd.caveofprogramming.section4.notop57;

public class NotOperator {

	public static void main(String[] args) {

		// !  "not operator" is unary operator
		// == "equality test operator" is binary operator
		
		// false
		System.out.println(4 == 5);

		// true
		System.out.println(!(4 == 5));

		int value1 = 3;
		int value2 = 4;

		if (!(value1 == value2)) {
			System.out.println("They are not equal!");
		}

	}

}
