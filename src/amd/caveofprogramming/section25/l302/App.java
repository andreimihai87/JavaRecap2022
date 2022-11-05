package amd.caveofprogramming.section25.l302;

import java.util.ArrayList;
//import java.util.Collections;
import java.util.List;

class Cat implements Comparable<Cat> {
	
	private String name;
	
	public Cat(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}

	@Override
	public int compareTo(Cat o) {
		return name.compareTo(o.name);
	}
	
}

public class App {

	public static void main(String[] args) {

		Cat tom = new Cat("Tom");
		List<Cat> catList = new ArrayList<Cat>(List.of(tom, new Cat("Pixy"), new Cat("Algo")));
		
//		Collections.sort(catList);
		
		catList.remove(1);
		catList.remove(tom);
		catList.forEach(System.out::println);
		
	}

}
