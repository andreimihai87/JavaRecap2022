package amd.caveofprogramming.section4.strmet63;

public class StringMethods {

	public static void main(String[] args) {

		String name = "Joe";

		if (name.equals("Joe")) {
			System.out.println("1. The name is Joe!");
		}
		
		if (name.equalsIgnoreCase("JOE")) {
			System.out.println("2. The name is Joe!");
		}
		
		System.out.printf("The length of '%s' is %d ", name, name.length());

	}

}
