package amd.caveofprogramming.section5.wma78;

public class WorkingWithMultidimensionalArrays {

	public static void main(String[] args) {

		var texts = new String[][] { 
				{ "one", "two", "three" }, 
				{ "four", "five", "six" }, 
				{ "seven", "eight", "nine" } 
		};

		for (int i = 0; i < texts.length; i++) {
			for (int j = 0; j < texts[i].length; j++) {
				System.out.print(texts[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
