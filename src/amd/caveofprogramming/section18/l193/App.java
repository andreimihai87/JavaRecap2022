package amd.caveofprogramming.section18.l193;

public class App {

	public static void main(String[] args) {

		for(Fruit fruit : Fruit.values()) {
			System.out.println(fruit);
		}
		
		System.out.println(Fruit.ORANGE.ordinal());
		
		Fruit fruit2 = Fruit.valueOf("APPLE");
		System.out.println(fruit2);
		
		System.out.println(Fruit.APPLE == fruit2);
	}

}
