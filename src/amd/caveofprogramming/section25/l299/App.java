package amd.caveofprogramming.section25.l299;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * Big O notation
 * 
 * O(1) - time doesn't change even if the numbers of the elements change
 * O(n) - linear - time is proportional with the numers of the elements
 * O(n^2) - polynomial
 * O(c^n) - exponential - NOT GOOD
 * 
 */

public class App {

	public static void main(String[] args) {

		List<Integer> arrayList = new ArrayList<Integer>();
		List<Integer> linkedList = new LinkedList<Integer>();

		List<Integer> list = linkedList;

		for (int numberItems = 0; numberItems < 1000000; numberItems += 50000) {

			for (int i = 0; i < numberItems; i++) {
				list.add(i);
			}

			long duration = addNumbersTime(list);

			System.out.printf("%d\t%d\n", numberItems, duration);

		}

	}

	public static long addNumbersTime(List<Integer> list) {

		long time = System.currentTimeMillis();

//		list.add(0, 10);
		
		for(int number : list) {
			
		}

		return System.currentTimeMillis() - time;

	}

}
