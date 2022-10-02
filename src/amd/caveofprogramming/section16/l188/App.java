package amd.caveofprogramming.section16.l188;

public class App {

	private String name = "Jojo";
	
	public static void main(String[] args) {
		new App().start();
	}
	
	public void start() {
		// anonymous class
		Runnable runny = new Runnable() {
			@Override
			public void run() {
				System.out.println(name);
			}
		};
		activate(runny);
		
		activate(new Runnable() {
			@Override
			public void run() {
				System.out.println(name);
			}
		});
	}
	
	public void activate(Runnable runnable) {
		runnable.run();
	}

}
