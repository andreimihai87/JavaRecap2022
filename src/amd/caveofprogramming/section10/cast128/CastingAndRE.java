package amd.caveofprogramming.section10.cast128;

public class CastingAndRE {

	public static void main(String[] args) {

		Cat cat1 = new HouseCat();
		cat1.makeSound();
		cat1.hunt();

		// Can't do this:
		// cat1.purr();
		((HouseCat) cat1).purr();
		
		System.out.println();

		HouseCat cat2 = new HouseCat();
		cat2.makeSound();
		cat2.hunt();
		cat2.purr();

		System.out.println();
		
		Cat cat3 = new Tiger();
		// Runtime Error
		((HouseCat) cat3).purr();
		
	}

}
