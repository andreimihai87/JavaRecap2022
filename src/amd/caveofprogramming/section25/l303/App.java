package amd.caveofprogramming.section25.l303;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {

		ArrayList<Integer> intList = new ArrayList<Integer>(List.of(1, 2, 3, 4, 5));

		for (int number : intList) {
			if (number == 2) {
				intList.remove(number);
			}
			System.out.println(number);
		}

	}

}
