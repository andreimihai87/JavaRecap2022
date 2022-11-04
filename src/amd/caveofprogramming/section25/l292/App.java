package amd.caveofprogramming.section25.l292;

import java.util.Collections;
import java.util.LinkedList;

public class App {

	public static void main(String[] args) {

		LinkedList<String> animals = new LinkedList<>();
		
		animals.add("dog");
		animals.add("cat");
		animals.add("rat");
		
		Collections.sort(animals);
		animals.forEach(System.out::println);
		
	}

}
