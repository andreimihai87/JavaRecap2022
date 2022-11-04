package amd.caveofprogramming.section25.l297and298;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * Create a method that accepts a List of Integer
 * 
 * Make the method add a large number of numbers to the list; e.g. 100,000 integers.
 * 
 * Add code in the method that times how long it takes to add the numbers.
 * Use System.currentTimeMillis() to get the time in milliseconds before and after adding the 
 * numbers to the list, to work out how long it took to add them.
 * 
 * Instead of adding items to the end of the list, try adding them to the start of the list.
 * You can do this with add(0, element).
 * 
 * 
 */

public class App {

	public static void main(String[] args) {

		List<Integer> intList1 = new ArrayList<Integer>();
		List<Integer> intList2 = new LinkedList<Integer>();

		addNumbersTime(intList1);
		addNumbersTime(intList2);

	}

	public static void addNumbersTime(List<Integer> list) {

		long time = System.currentTimeMillis();
		int numberOfInts = 100000;
		
		for (int i = 1; i <= numberOfInts; i++) {
			list.add(0, i);
		}

		String listName = "";
		if (list instanceof ArrayList) {
			listName = "ArrayList";
		} else if (list instanceof LinkedList) {
			listName = "LinkedList";
		}
		System.out.printf("To add %d int numbers, for %s, it takes %d ms. \n", numberOfInts, listName, System.currentTimeMillis() - time);

	}

}
