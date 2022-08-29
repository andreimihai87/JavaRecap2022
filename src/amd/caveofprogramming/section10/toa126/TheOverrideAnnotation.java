package amd.caveofprogramming.section10.toa126;

public class TheOverrideAnnotation {

	public static void main(String[] args) {

		HouseCat cat1 = new HouseCat();
		cat1.makeSound();
		cat1.hunt();
		
		Tiger cat2 = new Tiger();
		cat2.makeSound();
		cat2.hunt();
		
		Lion cat3 = new Lion();
		cat3.makeSound();
		cat3.hunt();
		
	}

}
