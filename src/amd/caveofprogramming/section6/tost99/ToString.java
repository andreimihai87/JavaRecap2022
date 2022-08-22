package amd.caveofprogramming.section6.tost99;

public class ToString {

	public static void main(String[] args) {

		Person person1 = new Person("Marry", 170);
		Person person2 = new Person("John", 180);
		Person person3 = new Person();

		System.out.println("Person 1: " + person1.toString());
		System.out.println("Person 2: " + person2);
		System.out.println("Person 3: " + person3);
		
	}

}
