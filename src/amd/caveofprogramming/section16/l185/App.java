package amd.caveofprogramming.section16.l185;

public class App {
	
	private int count = 1;
	
	public static void main(String[] args) {
		
		new App().run();
		
	}
	
	private void run() {
		
		String NAME = "Tom";
		
		class Test {
			private void print() {
				// name is considered effectively final, else I could not access it
				System.out.println(NAME);
				System.out.println(count);
			}
		}
		
		new Test().print();
		
	}

}
