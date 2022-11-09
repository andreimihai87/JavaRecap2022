package amd.caveofprogramming.section25.l304;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App {

	public static void main(String[] args) {

		ArrayList<Integer> intList = new ArrayList<Integer>(List.of(3, 1, 4));

		for (Iterator<Integer> iterator = intList.iterator(); iterator.hasNext();) {
			int number = iterator.next();
			System.out.println(number);
		}

	}

}
