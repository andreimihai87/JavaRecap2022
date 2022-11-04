package amd.caveofprogramming.section25.l284;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(7);
		list.add(9);
		list.add(123);

		System.out.println("v1:");
		
		for (Integer number : list) {
			System.out.println(number);
		}
		
		System.out.println();
		System.out.println("v2:");
		
		for (int i = 0; i < list.size(); i++) {
			Integer number = list.get(i);
			System.out.println(i + ": " + number);
		}
		
		System.out.println();
		System.out.println("v3:");
		
		list.forEach(System.out::println);
		
		System.out.println();
		System.out.println("v4:");
		
		list.forEach(e -> {
			System.out.println(e);
		});
	}

}
