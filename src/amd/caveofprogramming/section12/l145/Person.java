package amd.caveofprogramming.section12.l145;

public class Person {
	
	public void greet() {
		System.out.println("Hello!");
	}
	
	public void greet(String name) {
		System.out.println("Hello " + name + "!");
	}
	
	public void greet(int age) {
		System.out.println("Hello! Happy " + age + " years!");
	}
	
	public void greet(String name, int age) {
		System.out.println("Hello " + name + "! Happy " + age + " years!");
	}

}
