package amd.caveofprogramming.section5.ma77;

public class MultidimensionalArrays {

	public static void main(String[] args) {

		String[][] texts = { 
				{ "one", "two", "three" }, 
				{ "four", "five", "six" }, 
				{ "seven", "eight", "nine" } 
		};
		
		for (int i = 0; i < texts.length; i++) {
			String[] arrayOne = texts[i];
			for (int j = 0; j < arrayOne.length; j++) {
				System.out.print(arrayOne[j] + "\t");
			}
			System.out.println();
		}

	}

}
