package amd.caveofprogramming.section5.pa75;

public class PrimitiveArraysCloserLook {

	public static void main(String[] args) {

		int value;
		value = 4;
		System.out.println(value);

		int[] values = null;
		System.out.println(values);
		values = new int[3];

		for (int number : values) {
			System.out.println(number);
		}

	}

}
