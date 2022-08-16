package amd.caveofprogramming.section6.iv83;

public class InstanceVariables {

	public static void main(String[] args) {

		Person person1 = new Person();
		Person person2 = new Person();
		
		person1.name = "John";
		person1.age = 35;
		
		person2.name = "Marry";
		person2.age = 25;
		
		System.out.println(person1.name + " " + person1.age);
		System.out.println(person2.name + " " + person2.age);
		
	}

}
