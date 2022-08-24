package amd.caveofprogramming.section9;

public class StaticVariables {

	public static void main(String[] args) {

		Cat cat1 = new Cat("Tom");
		Cat cat2 = new Cat("Boby");
		
		System.out.println(cat1);
		System.out.println(cat2);
		
		System.out.println(Cat.FOOD);
		System.out.println(Math.PI);
		
	}

}
