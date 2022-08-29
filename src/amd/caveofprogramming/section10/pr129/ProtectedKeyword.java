package amd.caveofprogramming.section10.pr129;

import amd.caveofprogramming.section10.pr129.entities.Apple;
import amd.caveofprogramming.section10.pr129.entities.Banana;
import amd.caveofprogramming.section10.pr129.entities.Fruit;

public class ProtectedKeyword {

	public static void main(String[] args) {

		Fruit fruit1 = new Apple();
		System.out.println(fruit1);
		
		Fruit fruit2 = new Banana();
		System.out.println(fruit2);
		
	}

}
