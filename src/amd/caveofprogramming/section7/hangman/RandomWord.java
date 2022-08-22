package amd.caveofprogramming.section7.hangman;

import java.util.Random;

public class RandomWord {

	private String[] words = { "tale", "time", "future", "sister", "sweet", "family", "blacksmith", "gentleman" };
	private String word;
	private Random random = new Random();

	public RandomWord() {
		int wordIndex = random.nextInt(words.length);
		word = words[wordIndex];
	}

	public String toString() {
		return word;
	}

}
