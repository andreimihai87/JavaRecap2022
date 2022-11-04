package amd.caveofprogramming.section25.l285;

import java.util.ArrayList;

class Person {
	
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
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
		
		personsList.forEach(System.out::println);
	}

}
