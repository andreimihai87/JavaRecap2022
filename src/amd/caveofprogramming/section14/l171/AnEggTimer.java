package amd.caveofprogramming.section14.l171;

import java.util.Timer;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class AnEggTimer {

	// 600000 milliseconds = 10min - time to cook the egg
	private static int TIME_TO_COOK = 600000;
	// 30s - time interval for status
	private static int TIME_STATUS = 30;
	
	public static void main(String[] args) {
		
		System.out.println("Egg started to cook!");
		
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
		executor.scheduleWithFixedDelay(new Status(), 0, TIME_STATUS, TimeUnit.SECONDS);
		
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new Alert(), TIME_TO_COOK, TIME_TO_COOK);
		
	}

}
