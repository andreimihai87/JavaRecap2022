package amd.caveofprogramming.section9;

public class StaticVariables {

	public static void main(String[] args) {

		Cat cat1 = new Cat("Tom");
		Cat cat2 = new Cat("Boby");
		
		System.out.println(cat1);
		System.out.println(cat2);
		
		System.out.println(Cat.FOOD);
		System.out.println(Math.PI);
		
		System.out.println(Cat.getCount());
		System.out.println(Cat.getCount());
		
		Cat cat3 = new Cat("Minty");
		System.out.println(cat3);
		
		System.out.println(Cat.getCount());
		
		System.out.println(cat1.getId() + ", "+ cat2.getId());
		
	}

}
