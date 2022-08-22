package amd.caveofprogramming.section7.hangman;

import java.util.Random;

public class RandomWord {

	private String[] words = { "tale", "time", "future", "sister", "sweet", "family", "blacksmith", "gentleman" };
	private String chosenWord;
	private Random random = new Random();
	private char[] caracters;

	public RandomWord() {
		int wordIndex = random.nextInt(words.length);
		chosenWord = words[wordIndex];
		caracters = new char[chosenWord.length()];
	}

	public String toString() {

		String text = "";
		
		for (int i = 0; i < caracters.length; i++) {
			if (caracters[i] == '\u0000') {
				text += "_";
			} else {
				text += caracters[i];
			}
			text += " ";
		}

		return text;
	}

}
