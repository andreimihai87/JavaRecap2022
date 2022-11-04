package amd.caveofprogramming.section25.l287;

import java.util.ArrayList;
import java.util.Collections;

class Person implements Comparable<Person> {
	
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}

	@Override
	public int compareTo(Person o) {
		String thisStr = this.name;
		String otherStr = o.name;
		return thisStr.compareTo(otherStr);
	}
}

public class App {

	public static void main(String[] args) {

		ArrayList<Person> personsList = new ArrayList<Person>();
		
		personsList.add(new Person("Alex"));
		personsList.add(new Person("Geo"));
		personsList.add(new Person("Vio"));
		personsList.add(new Person("Costel"));
		
		personsList.set(1, new Person("Estelle"));
		
		Collections.sort(personsList);
		
		personsList.forEach(System.out::println);
		
	}

}
