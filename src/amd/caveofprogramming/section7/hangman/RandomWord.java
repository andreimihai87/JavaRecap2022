package amd.caveofprogramming.section7.hangman;

import java.util.Random;

public class RandomWord {

	private String[] words = { "tale", "time", "future", "sister", "sweet", "family", "blacksmith", "gentleman" };
	private String chosenWord;
	private Random random = new Random();
	private char[] caracters;
	private boolean isCorrectGuess;

	public RandomWord() {
		int wordIndex = random.nextInt(words.length);
		chosenWord = words[wordIndex];
		caracters = new char[chosenWord.length()];
	}

	public String toString() {
		StringBuilder sb1 = new StringBuilder();
		for (char c : caracters) {
			sb1.append(c == '\u0000' ? "_" : c);
			sb1.append(" ");
		}
		return sb1.toString();
	}

	public void addGuess(char c) {
		isCorrectGuess = false;
		// fill in c wherever is found in the character array of chosenWord
		for (int i = 0; i < chosenWord.length(); i++) {
			if (chosenWord.charAt(i) == c) {
				if (caracters[i] == '\u0000') {
					isCorrectGuess = true;
				}
				caracters[i] = c;
			}
		}
	}
	
	public boolean isCorrectGuess() {
		return isCorrectGuess;
	}

	public boolean isComplete() {
		for (char c : caracters) {
			if (c == '\u0000') {
				return false;
			}
		}
		return true;
	}
	
	public String getChosenWord() {
		return chosenWord;
	}

}
