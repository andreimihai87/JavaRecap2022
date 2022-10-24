package amd.caveofprogramming.section22.l262;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {

	public static void main(String[] args) {

		String fileName = "test.cvs";

		File file = new File(fileName);

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int total = 0;
		int lineNumber = 0;

		try (BufferedReader buffReader = new BufferedReader(new FileReader(file))) {

			String line = null;

			while ((line = buffReader.readLine()) != null) {
				String[] fields = line.split(", ");
				int reactionTime = Integer.parseInt(fields[2]);
				if (reactionTime < min) {
					min = reactionTime;
				}
				if (reactionTime > max) {
					max = reactionTime;
				}
				total += reactionTime;
				lineNumber++;
			}

		} catch (FileNotFoundException e) {
			System.out.println("Cannot open file: " + fileName);
		} catch (IOException e) {
			System.out.println("Cannot read file: " + fileName);
		}

		System.out.println("The fastest time was: " + min + " ms");
		System.out.println("The slowest time was: " + max + " ms");
		System.out.println("Average reaction was: " + (double) total / lineNumber + " ms");

	}

}
