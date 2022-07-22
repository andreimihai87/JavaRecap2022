package amd.caveofprogramming.section4.loopcond33;

public class LoopConditions {
	
	public static void main(String[] args) {

		int counter = 1;
		while (counter <= 100) {
			System.out.printf("Counter %d\n", counter);
			counter += 1;
		}
		
		int fiveHello = 0;
		while (fiveHello < 5) {
			fiveHello++;
			System.out.printf("Hello %d\n", fiveHello);
		}
		
	}
}
