package amd.caveofprogramming.section25.l305;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App {

	public static void main(String[] args) {

		ArrayList<Integer> intList = new ArrayList<Integer>(List.of(1, 3, 5));

		Iterator<Integer> iterator = intList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println();
		
		Iterator<Integer> iterator2 = intList.iterator();
		for(int i = 0; i < intList.size(); i++) {
			System.out.println(iterator2.next());
		}

	}

}
