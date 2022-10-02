package amd.caveofprogramming.section16.l183;

public class App {

	private String name;
	
	public App() {
		name = "Stella";
	}
	
	public static void main(String[] args) {
		
		new App().run();
		
	}
	
	public void run() {
		
		class Printer {
			
			private void print() {
				System.out.println(App.this.name);
			}
			
		}
		
		new Printer().print();
		
	}

}
