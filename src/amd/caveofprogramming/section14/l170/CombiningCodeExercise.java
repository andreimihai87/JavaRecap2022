package amd.caveofprogramming.section14.l170;

import java.util.Timer;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class CombiningCodeExercise {

	public static void main(String[] args) {

		ScheduledExecutorService executor = Executors.newScheduledThreadPool(0);
		executor.scheduleWithFixedDelay(new Status(), 0, 1, TimeUnit.SECONDS);
		
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new Alert(), 0, 1000);
		
	}

}
