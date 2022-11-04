package amd.caveofprogramming.section25.l287tol289;

import java.util.ArrayList;
import java.util.Collections;

class Person implements Comparable<Person> {

	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name + ": " + age;
	}

	@Override
	public int compareTo(Person o) {
		String thisStr = this.name;
		String otherStr = o.name;

		Integer thisAge = age;
		Integer otherAge = o.age;

		if (thisStr.equals(otherStr)) {
			return thisAge.compareTo(otherAge);
		}

		return thisStr.compareTo(otherStr);
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

		personsList.set(1, new Person("Estelle", 65));

		personsList.add(new Person("Estelle", 23));
		personsList.add(new Person("Estelle", 19));
		personsList.add(new Person("Estelle", 36));
		personsList.add(new Person("Estelle", 18));

		Collections.sort(personsList);

		personsList.forEach(System.out::println);

		System.out.println();

		String name1 = "abc";
		String name2 = "efg";
		String name3 = "efg";

		int comparison = name1.compareTo(name2);
		System.out.println(comparison);

		comparison = name2.compareTo(name1);
		System.out.println(comparison);

		System.out.println(name2.equals(name3));
		comparison = name2.compareTo(name3);
		System.out.println(comparison);

	}

}
