package amd.caveofprogramming.section4.postfixprefix36;

public class PostfixAndPrefix {
	
	public static void main(String[] args) {
		
		int cats = 5;
		
		// print 5
		System.out.println(cats++);
		// print 6
		System.out.println(cats);
		
		int dogs = 3;
		// print 4
		System.out.println(++dogs);
		
		int giraffes = 10;
		System.out.println(giraffes);
		
		int animals = cats + giraffes++;
		System.out.println(animals);
		
		int oranges = 4;
		int totalOranges = oranges++;
		System.out.println("Total oranges: " + totalOranges);
		
		int apples = 5;
		int bananas = 4;
		int fruits = ++apples + bananas++;
		System.out.println("fruits " + fruits);
		
	}
	
}
