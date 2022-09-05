package amd.caveofprogramming.section14.l169;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Task implements Runnable {

	private int count;
	
	@Override
	public void run() {
		System.out.println("Hi! " + count++);
	}
	
}


public class InterfaceExample {

	public static void main(String[] args) {

		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
		executor.scheduleAtFixedRate(new Task(), 0, 2L, TimeUnit.SECONDS);
		
	}

}
