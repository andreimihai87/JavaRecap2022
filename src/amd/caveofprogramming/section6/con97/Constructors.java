package amd.caveofprogramming.section6.con97;

public class Constructors {

	public static void main(String[] args) {

		Person person1 = new Person();
		person1.setName("Marry");
		person1.setHeight(170);
		
		Person person2 = new Person();
		person2.setName("John");
		person2.setHeight(180);
		
		Person person3 = new Person();
		
		System.out.println("Person 1: " + person1.getName() + " age " + person1.getHeight());
		System.out.println("Person 2: " + person2.getName() + " age " + person2.getHeight());
		System.out.println("Person 3: " + person3.getName() + " age " + person3.getHeight());
	}

}
