package amd.caveofprogramming.section4.ifstatement42;

public class If {

	public static void main(String[] args) {

		int apples = 6;
		int bananas = 5;
		
		if (apples > bananas) {
			System.out.println("More apples number of bananas");
		}
		
		bananas = 10;
		if (apples < bananas) {
			System.out.println("More bananas number of apples");
		}

		System.out.println("End of program");

	}

}
