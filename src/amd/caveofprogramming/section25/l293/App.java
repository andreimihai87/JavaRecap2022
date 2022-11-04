package amd.caveofprogramming.section25.l293;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {

	public static void main(String[] args) {

//		List<Integer> intList = new LinkedList<Integer>();
		List<Integer> intList = new ArrayList<Integer>();
		
		intList.add(7);
		intList.add(8);
		intList.add(9);

		displayList(intList);
	}
	
	private static void displayList(List<Integer> list) {
		list.forEach(System.out::println);
	}

}
