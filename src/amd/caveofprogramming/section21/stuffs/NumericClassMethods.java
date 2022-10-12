package amd.caveofprogramming.section21.stuffs;

public class NumericClassMethods {

	public static void main(String[] args) {

		// setting null
		
		Double doubleValue = null;
		System.out.println(doubleValue);

		
		// parse methods
		
		String intString = "12a";
		try {
			int intValue = Integer.parseInt(intString);
			System.out.println(intValue);
		} catch (NumberFormatException e) {
			System.out.println("Cannot convert to int: " + intString);
		}
		
		
		// Integer toBinaryString
		
		String binaryRep = String.format("%8s", Integer.toBinaryString(23)).replace(' ', '0');
		System.out.println(binaryRep);
		
	}

}
