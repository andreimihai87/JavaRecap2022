package amd.caveofprogramming.section4.dowhile56;

public class DoWhileLoops {

	public static void main(String[] args) {

		System.out.println("First loop: ");
		boolean loopCondition = false;
		do {
			System.out.println("Hello!");
		} while (loopCondition);
		
		System.out.println("Second loop: ");
		int count = 0;
		do {
			System.out.println("Count: " + count);
			count++;
		} while (count < 3);
		
		System.out.println("Same as second loop: ");
		count = 0;
		do {
			System.out.println("Count: " + count);
		} while (++count < 3);
		
		System.out.println("Third loop: ");
		count = 0;
		do {
			System.out.println("Count: " + count);
		} while (count++ < 3);

	}

}
