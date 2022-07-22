package amd.caveofprogramming.section4.incrdecrem35;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		
		int count = 0;
		System.out.println(count);
		
		count = count + 1;
		System.out.println(count);

		count += 1;
		System.out.println(count);
		
		//post fix
		count++;
		System.out.println(count);
		
		//prefix
		++count;
		System.out.println(count);
		
		// Decrementing
		
		count = count - 1;
		System.out.println(count);
		
		count -= 1;
		System.out.println(count);
		
		count--;
		System.out.println(count);
		
		--count;
		System.out.println(count);
		
	}
	
}
