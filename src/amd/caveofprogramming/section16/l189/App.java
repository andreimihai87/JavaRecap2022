package amd.caveofprogramming.section16.l189;

class Runny3 implements Runnable {
	
	private String name;
	
	public Runny3(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		System.out.println(name);
	}
}

public class App implements Runnable {

	private String name = "Mickey Mouse";
	
	private class Runny implements Runnable {
		@Override
		public void run() {
			System.out.println(name);
		}
	}
	
	private static class Runny2 implements Runnable {
		
		private String name;
		
		public Runny2(String name) {
			this.name = name;
		}
		
		@Override
		public void run() {
			System.out.println(name);
		}
	}
	
	public static void main(String[] args) {

		new App().start();
		
	}
	
	public void start() {
		
		// 1 - Anonymous class
		activate(new Runnable() {
			@Override
			public void run() {
				System.out.println(name);
			}
		});
		
		// 2 - Non-Static Inner Class
		activate(new Runny());
		
		// 3 - Static Inner Class
		activate(new Runny2(name));
		
		// 4
		activate(new Runny3(name));
		
		// 5 - App implements Runnable
		activate(this);
		
		// 6 - Method local inner class
		class Runny4 implements Runnable {
			@Override
			public void run() {
				System.out.println(name);
			}
		}
		activate(new Runny4());
		
	}
	
	public void activate(Runnable runnable) {
		runnable.run();
	}

	@Override
	public void run() {
		System.out.println(name);
	}

}
