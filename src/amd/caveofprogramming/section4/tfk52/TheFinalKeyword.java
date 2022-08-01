package amd.caveofprogramming.section4.tfk52;

public class TheFinalKeyword {

	public static void main(String[] args) {

		final int VALUE = 9;
		
		System.out.println("Value: " + VALUE);
		
		int value2 = 11;
		
		System.out.println("Value2: " + value2);
		
		value2 = 12;
		
		System.out.println("Value2: " + value2);
		
		final String USER_PASSWORD = "abc";
		
		System.out.println(USER_PASSWORD);
		
	}

}
