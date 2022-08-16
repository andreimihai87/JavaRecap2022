package amd.caveofprogramming.section6.mup91;


public class MultipleParameters {

	public static void main(String[] args) {
		
		final int toSquare = 11;

		Calculator calc = new Calculator();
		
		int sum = calc.sum(6, 8);
		System.out.println("6 + 8 is " + sum);
		
		int sub = calc.subtract(8, 6);
		System.out.println("8 - 6 is " + sub);
		
		int mult = calc.multiplication(8, 6);
		System.out.println("8 * 6 is " + mult);
		
		int squared = calc.square(toSquare);
		System.out.println(toSquare + " squared is " + squared);
		
		
	}

}
