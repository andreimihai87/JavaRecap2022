package amd.caveofprogramming.section16.l187;

public class App {

	public static void main(String[] args) {

		Person person1 = new Person("Alex");
		person1.display();
		
		Person.Printer printer = person1.new Printer();
		printer.print();
		
	}

}
