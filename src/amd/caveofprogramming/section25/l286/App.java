package amd.caveofprogramming.section25.l286;

import java.util.ArrayList;
import java.util.Collections;

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

		System.out.println();
		
		ArrayList<Double> numbers = new ArrayList<>();
		
		numbers.add(2.34);
		numbers.add(7.89);
		numbers.add(4.56);
		numbers.add(1.23);
		
		Collections.sort(numbers);
		numbers.forEach(System.out::println);
		
	}

}
