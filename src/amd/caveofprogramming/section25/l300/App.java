package amd.caveofprogramming.section25.l300;

import java.io.Serializable;

class Creature implements Serializable{

	private static final long serialVersionUID = 1L;
	
	public void display() {
		System.out.println("Creature");
	}
	
}

class Cat extends Creature {

	private static final long serialVersionUID = 1L;
	
	@Override
	public void display() {
		System.out.println("Cat");
	}
	
}

public class App {

	public static void main(String[] args) {

		Creature c1 = new Creature();
		Object c2 = c1;
		
		Cat c3 = new Cat();
		
		System.out.println(c1 instanceof Creature);
		System.out.println(c2 instanceof Integer);
		
		System.out.println(c3 instanceof Creature);
		
		Creature c4 = c3;
		
		System.out.println(c4 instanceof Cat);
		
		Serializable c5 = c3;
		
		System.out.println(c3 instanceof Serializable);
		System.out.println(c5 instanceof Cat);
		
		c3.display();
		
	}

}
