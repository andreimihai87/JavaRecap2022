package amd.caveofprogramming.section10.ovm125;

public class OverridingMethods {

	public static void main(String[] args) {

		HouseCat cat1 = new HouseCat();
		cat1.makeSound();
		cat1.hunt();
		
		Tiger cat2 = new Tiger();
		cat2.makeSound();
		cat2.hunt();
		
	}

}
