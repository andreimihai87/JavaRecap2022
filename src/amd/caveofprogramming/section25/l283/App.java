package amd.caveofprogramming.section25.l283;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {

	
//		ArrayList<Integer> list = new ArrayList<>();
//		or
//		var list = new ArrayList<Integer>();
//		or
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(7);
		list.add(9);
		list.add(123);
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
	}

}
