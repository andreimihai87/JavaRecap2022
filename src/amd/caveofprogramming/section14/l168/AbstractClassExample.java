package amd.caveofprogramming.section14.l168;

import java.util.Timer;
import java.util.TimerTask;

class Task extends TimerTask {

	private int counter;
	
	@Override
	public void run() {
		System.out.println("Hello! " + counter++);
	}
	
}


public class AbstractClassExample {

	public static void main(String[] args) {

		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new Task(), 0L, 2000L);
	}

}
