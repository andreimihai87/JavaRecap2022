package amd.caveofprogramming.section24.l272.application;

import amd.caveofprogramming.section24.l272.collections.Wrapper;
import amd.caveofprogramming.section24.l272.hierarchy.Cat;

public class App {

	public static void main(String[] args) {

		Cat cat1 = new Cat("Tom");
		System.out.println(cat1);
		
		Wrapper wrapp1 = new Wrapper();
		wrapp1.setWrapper(cat1);
		
		Cat cat2 = (Cat) wrapp1.getWrapper();
		System.out.println(cat2);
	}

}
