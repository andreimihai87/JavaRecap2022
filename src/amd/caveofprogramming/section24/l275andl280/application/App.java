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
		System.out.println();

		Cat cat2 = (Cat) find(myArray, "Tomisor");
		System.out.println(cat2);

		System.out.println();
		Array<Mammal> mammals = new Array<>(3);
		mammals.add(new Mammal("dolphin"));
		mammals.add(new Mammal("sheep"));
		feedAll(mammals);

		System.out.println();
		Array<Cat> cats = new Array<>(3);
		cats.add(new Cat("Tom"));
		cats.add(new Cat("Tid"));
		feedAll(cats);
		
		System.out.println();
		addMammal(mammals);
		feedAll(mammals);

		System.out.println();
		Array<Creature> creatures = new Array<>(3);
		creatures.add(new Creature("landCreature"));
		
	}

	private static <T> T find(Array<T> array, String text) {

		for (int i = 0; i < array.size(); i++) {
			T element = array.get(i);
			if (element.toString().equals(text)) {
				return element;
			}
		}

		return null;
	}

	private static void feedAll(Array<? extends Mammal> mammals) {

		for (int i = 0; i < mammals.size(); i++) {
			Mammal mammal = mammals.get(i);
			mammal.feed();
		}

	}
	
	private static void addMammal(Array<Mammal> mammals) {
		
		mammals.add(new Mammal("giraffe"));
		
	}

}
