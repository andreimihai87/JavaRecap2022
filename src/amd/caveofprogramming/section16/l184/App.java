package amd.caveofprogramming.section16.l184;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class App {

	private String name;

	public App() {
		name = "Stella";
	}

	public static void main(String[] args) {
		new App().run();
	}

	public void run() {

		class Printer implements Runnable {
			private void print() {
				System.out.println(App.this.name);
			}

			@Override
			public void run() {
				print();
			}
		}

		ScheduledExecutorService service = Executors.newScheduledThreadPool(1);
		service.scheduleAtFixedRate(new Printer(), 0, 2, TimeUnit.SECONDS);

	}

}
