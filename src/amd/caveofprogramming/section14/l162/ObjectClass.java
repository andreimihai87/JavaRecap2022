package amd.caveofprogramming.section14.l162;

public class ObjectClass {

	public static void main(String[] args) {

		Object o1 = getAnimal();
		// only object methods can be accessed
		System.out.println(o1);

		// we can access the Cat methods too
		if (o1 instanceof Cat) {
			Cat cat1 = (Cat) o1;
			cat1.jump();
			cat1.makeSound();
		}

	}

	private static Object getAnimal() {
		return new Cat();
	}

}
