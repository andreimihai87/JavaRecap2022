package amd.caveofprogramming.section24.l275andl280.application;

import amd.caveofprogramming.section24.l275andl280.collections.Array;
import amd.caveofprogramming.section24.l275andl280.hierarchy.Cat;
import amd.caveofprogramming.section24.l275andl280.hierarchy.Creature;
import amd.caveofprogramming.section24.l275andl280.hierarchy.Mammal;

public class App {

	public static void main(String[] args) {

		Cat cat1 = new Cat("Tomisor");
		
		Array<Creature> myArray = new Array<>(2);
		
		myArray.add(new Mammal("Alex"));
		myArray.add(cat1);
		
		System.out.println(myArray.get(1));
		System.out.println(myArray.get(0));
		
		System.out.println(myArray);

	}

}
