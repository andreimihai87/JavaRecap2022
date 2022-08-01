package amd.caveofprogramming.section4.compstrings51;

public class ComparingStrings {

	public static void main(String[] args) {

		String text1 = "oranges";
		String text2 = "ora" + "nges";
		
		System.out.println(text1 == text2);
		
		// correct way to compare the text
		System.out.println("String are identical: " + text1.equals(text2));
		
	}

}
