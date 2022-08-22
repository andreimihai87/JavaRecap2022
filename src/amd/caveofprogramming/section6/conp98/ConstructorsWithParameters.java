package amd.caveofprogramming.section6.conp98;

public class ConstructorsWithParameters {

	public static void main(String[] args) {

		Person person1 = new Person("Marry", 170);
		Person person2 = new Person("John", 180);
		Person person3 = new Person();

		System.out.println("Person 1: " + person1.getName() + " age " + person1.getHeight());
		System.out.println("Person 2: " + person2.getName() + " age " + person2.getHeight());
		System.out.println("Person 3: " + person3.getName() + " age " + person3.getHeight());
	}

}
