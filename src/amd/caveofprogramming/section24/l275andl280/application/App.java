package amd.caveofprogramming.section24.l275andl280.application;

import amd.caveofprogramming.section24.l275andl280.collections.Pair;
import amd.caveofprogramming.section24.l275andl280.hierarchy.Cat;

public class App {

	public static void main(String[] args) {

		Cat cat1 = new Cat("Tomisor");
		
		Pair<Integer, Cat> pair1 = new Pair<>(1, cat1);
		System.out.println(pair1);
		
		System.out.println(pair1.getValue1());
		System.out.println(pair1.getValue2());

	}

}
