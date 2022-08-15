package amd.caveofprogramming.section5.pr71;

public class PrimitiveArraysCloserLook {

	public static void main(String[] args) {

		int[] numbers = new int[3];
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		numbers[0] = 5;
		numbers[2] = 3;
		
		System.out.println("length: " + numbers.length);
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
	}

}
