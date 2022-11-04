package amd.caveofprogramming.section25.l294;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {

		List<Integer> intList1 = new ArrayList<Integer>(List.of(7, 5, 8));

//		List<Integer> intList2 = new ArrayList<Integer>(intList1);
		List<Integer> intList2 = new ArrayList<Integer>();

		intList2.add(11);
		intList2.addAll(intList1);
		intList2.add(22);
		
		for (int number : intList2) {
			System.out.println(number);
		}

	}

}
