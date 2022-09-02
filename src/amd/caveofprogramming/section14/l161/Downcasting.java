package amd.caveofprogramming.section14.l161;

public class Downcasting {

	public static void main(String[] args) {

		Animal a1 = new Cat();
		Cat a2 = (Cat) a1;

		System.out.println(a1);
		a1.makeSound();
		// can't do this:
		// a1.jump();
		
		System.out.println();
		
		System.out.println(a2);
		a2.makeSound();
		a2.jump();

	}

}
