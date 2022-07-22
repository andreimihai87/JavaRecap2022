package amd.caveofprogramming.section4.mwl38;

public class MoreWhileLoops {
	public static void main(String[] args) {

		int count = 0;
		// increment
		while (count < 10) {
			System.out.println("Count is " + count);
			count++;
		}
		
		// decrement
		while (count > -10) {
			System.out.println("Count is " + count);
			count--;
		}

		// specific output 7, 6, 5, 4, 3
		count = 7;
		while (count >= 3) {
			System.out.printf("Count is %d \n", count);
			count--;
		}

	}

}
