package amd.caveofprogramming.section16.l182;

public class App {

	public static void main(String[] args) {

		Fox fox = new Fox();
		System.out.println(fox);
		System.out.printf("%x\n", fox.hashCode());
		
		Fox fox2 = fox;
		System.out.println(fox2);
		
		System.out.println(fox.name);
		
	}

}
