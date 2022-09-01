package amd.caveofprogramming.section12.l145;

public class MethodOverloading {

	public static void main(String[] args) {
		
		Person person1 = new Person();
		
		person1.greet();
		person1.greet("Alex");
		person1.greet(30);
		person1.greet("Alex", 30);

	}

}
