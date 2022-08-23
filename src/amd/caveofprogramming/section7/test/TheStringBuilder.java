package amd.caveofprogramming.section7.test;

public class TheStringBuilder {

	public static void main(String[] args) {

		String text = "I ";
		text += "am ";
		text += "a ";
		text += "giraffe";
		System.out.println(text);
		
		StringBuilder sb1 = new StringBuilder();
		sb1.append("I ");
		sb1.append("am ");
		sb1.append("a ");
		sb1.append("crab");
		String string1 = sb1.toString();
		System.out.println(string1);
		
		String animal = "otter";
		StringBuilder sb2 = new StringBuilder();
		sb2.append("I ").append("am ").append("a ").append(animal);
		System.out.println(sb2);
		
	}

}
