package amd.caveofprogramming.section5.npa76;

public class NonPrimitiveArrays {

	public static void main(String[] args) {

		String text = null;
//		text = new String("Hello!");
		text = "Hello!";

		String[] texts = null;
		texts = new String[3];

		System.out.println(text);
		System.out.println();
		
		texts[0] = new String("Hi!, ");
		texts[1] = "Andrei! ";
		texts[2] = "How are you?";

		for (String txt : texts) {
			System.out.print(txt);
		}

	}

}
