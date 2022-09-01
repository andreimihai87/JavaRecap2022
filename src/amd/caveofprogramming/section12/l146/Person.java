package amd.caveofprogramming.section12.l146;

public class Person {

	String name;
	int age;

	public Person() {

	}

	public Person(String name) {
		this.name = name;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Name: " + name + " and age: " + age;
	}

}
