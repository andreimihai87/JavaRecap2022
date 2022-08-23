package amd.caveofprogramming.section7.test;

public class TheTernaryOperator {

	public static void main(String[] args) {

		boolean test = 77 < 50;
		System.out.println(test ? "yes" : "no");

		int value = 77;
		value = value > 60 ? 60 : value;
		System.out.println(value);

		int[] values = { 25, 4, 120, 2, 24, 65 };

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for (int val : values) {
			min = val < min ? val : min;
			max = val > max ? val : max;
		}
		
		System.out.println(min);
		System.out.println(max);
		
	}

}
