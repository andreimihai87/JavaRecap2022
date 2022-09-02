package amd.caveofprogramming.section14.l160;

import amd.caveofprogramming.section14.l160.animals.Cat;

public class Upcasting {

	public static void main(String[] args) {

		Cat a1 = new Cat();
		Animal a2 = (Animal) a1;
		
		Animal a3 = new Cat();
		Animal a4 = new Animal();

		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		
		System.out.println();
		
		// can't do this:
		// System.out.println(a1.getName());
		System.out.println(a2.getName());
		System.out.println(a3.getName());
		System.out.println(a4.getName());
		
	}

}
