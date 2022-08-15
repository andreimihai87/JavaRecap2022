package amd.caveofprogramming.section5.it70;

import java.util.stream.IntStream;

public class IteratingWithIntStream {

	public static void main(String[] args) {

		String[] animals = { "Cat", "Dog", "Sloth", "Tiger", "Mouse" };

		IntStream.range(0, animals.length).forEach(i -> {
			System.out.printf("%d. %s\n", i, animals[i]);
		});

	}

}
