package amd.caveofprogramming.section25.l287tol290;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Person implements Comparable<Person> {

	private String name;
	private Integer age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return name + ": " + age;
	}

	@Override
	public int compareTo(Person o) {
		String thisStr = this.name;
		String otherStr = o.name;

		if (thisStr.equals(otherStr)) {
			return age.compareTo(o.age);
		}

		return thisStr.compareTo(otherStr);
	}
}

class PersonReverseAlpha implements Comparator<Person> {

	@Override
	public int compare(Person person1, Person person2) {
		return person2.getName().compareTo(person1.getName());
	}

}

public class App {

	public static void main(String[] args) {

		ArrayList<Person> personsList = new ArrayList<Person>();

		personsList.add(new Person("Alex", 20));
		personsList.add(new Person("Geo", 34));
		personsList.add(new Person("Vio", 30));
		personsList.add(new Person("Vio", 27));
		personsList.add(new Person("Costel", 40));
		personsList.add(new Person("Estelle", 65));
		personsList.add(new Person("Estelle", 23));
		personsList.add(new Person("Estelle", 19));
		personsList.add(new Person("Estelle", 36));
		personsList.add(new Person("Estelle", 18));

		Collections.sort(personsList, new PersonReverseAlpha());

		personsList.forEach(System.out::println);

		System.out.println();

		personsList.sort(new Comparator<Person>() {
			@Override
			public int compare(Person person1, Person person2) {
				return Integer.valueOf(person1.getAge()).compareTo(person2.getAge());
			}
		});
		
		personsList.forEach(System.out::println);

	}

}
