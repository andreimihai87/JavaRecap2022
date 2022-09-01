package amd.caveofprogramming.section12.l146;

public class DefaultConstructors {

	public static void main(String[] args) {

		Person person = new Person();
		System.out.println(person);

		Person person1 = new Person("Andrei");
		person1.setAge(20);
		System.out.println(person1);

		Person person2 = new Person("Andrei", 35);
		System.out.println(person2);

	}

}
