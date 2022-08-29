package amd.caveofprogramming.section10.sp127;

public class SubtypePolymorphism {

	public static void main(String[] args) {

//		Cat cat1 = new HouseCat();
//		cat1.makeSound();
//		cat1.hunt();
//		
//		Cat cat2 = new Tiger();
//		cat2.makeSound();
//		cat2.hunt();
//		
//		Cat cat3 = new Lion();
//		cat3.makeSound();
//		cat3.hunt();

		Cat[] cats = { new HouseCat(), new Tiger(), new Lion() };

		for (Cat cat : cats) {
			cat.makeSound();
			cat.hunt();
		}

	}

}
