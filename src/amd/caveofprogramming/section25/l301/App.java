package amd.caveofprogramming.section25.l301;

class Person {

	private String name;

	public Person(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj instanceof Person) {
			Person person1 = (Person) obj;
			if (name == null) {
				return false;
			}
			return name.equals(person1.name);
		}
		return false;
	}

}

public class App {

	public static void main(String[] args) {

		Person person1 = new Person("Joe");
		Person person2 = new Person("Joe");

		Person person3 = person1;

		// text inside the persons are identical
		System.out.println(person1.equals(person2));
		System.out.println(person1.equals(person3));

		// not reference to the same object
		System.out.println(person1 == person2);
		// reference to the same object
		System.out.println(person1 == person3);

	}

}
