package amd.caveofprogramming.section5.mae79;

public class MultidimensionalArrayExercise {

	public static void main(String[] args) {

		String[][] words = new String[][] {
			{"one", "two", "three"},
			{"apple", "orange", "banana"},
			{"fox", "cat", "horse"}
		};
		
		System.out.println(words[1][1]);
		// change orange to pear
		words[1][1] = "pear";
		
		System.out.println(words[2][1]);
		
		for (String[] wordLine : words) {
			for (String word : wordLine) {
				System.out.printf("%s\t", word);
			}
			System.out.println();
		}
		
	}

}
