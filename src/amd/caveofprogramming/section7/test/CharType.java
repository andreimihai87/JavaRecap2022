package amd.caveofprogramming.section7.test;

public class CharType {

	public static void main(String[] args) {

		char c1 = 'A';
		char c2 = 'B';
		char c3 = 65;
		
		System.out.println(c1 == c2);
		System.out.println(c3);
		System.out.println(c1 == c3);
		
		char c4 = '\u0000';
		System.out.println("'" + c4 + "'");
		
		char c5 = '\u0169';
		System.out.println(c5);
		
		String fruit = "orange";
		char c6 = fruit.charAt(4);
		System.out.println(c6);
		
	}

}
