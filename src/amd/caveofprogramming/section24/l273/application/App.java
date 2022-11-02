package amd.caveofprogramming.section24.l273.application;

import amd.caveofprogramming.section24.l273.collections.Wrapper;
import amd.caveofprogramming.section24.l273.hierarchy.Cat;

public class App {

	public static void main(String[] args) {

		Cat cat1 = new Cat("Tom");
		
//		Wrapper<Creature> wrapp1 = new Wrapper<>();
		Wrapper<Cat> wrapp1 = new Wrapper<Cat>();
		wrapp1.setWrapper(cat1);
		
		Cat cat2 = wrapp1.getWrapper();
		System.out.println(cat2);
		
//		wrapp1.setWrapper(new Mammal("Juliet"));
//		System.out.println(wrapp1.getWrapper());

	}

}
