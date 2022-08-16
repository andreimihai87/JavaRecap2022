package amd.caveofprogramming.section6.co82;

class Person {
	String name;
}

public class ClassesAndObjects {

	public static void main(String[] args) {

		Person person1 = new Person();
		person1.name = "John";
		
		Person person2 = new Person();
		person2.name = "Joe";
		
		System.out.println(person1.name + " and " + person2.name);
		
	}

}
