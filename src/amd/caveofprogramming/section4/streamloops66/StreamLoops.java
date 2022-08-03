package amd.caveofprogramming.section4.streamloops66;

import java.util.stream.IntStream;

public class StreamLoops {

	public static void main(String[] args) {

		IntStream.range(0, 5).forEach(i -> {
			System.out.println(i);
		});
		
	}

}
