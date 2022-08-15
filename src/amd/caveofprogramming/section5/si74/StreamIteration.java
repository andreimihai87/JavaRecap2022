package amd.caveofprogramming.section5.si74;

import java.util.Arrays;

public class StreamIteration {

	public static void main(String[] args) {

		String[] animals = { "Cat", "Dog", "Sloth", "Tiger", "Mouse" };
		
		Arrays.stream(animals).forEach(animal -> {
			System.out.println(animal);
		});
		
	}

}
