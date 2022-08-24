package amd.caveofprogramming.section7.hangman;

import java.util.Scanner;

public class Hangman {

	private boolean isRunning = true;
	private RandomWord word = new RandomWord();
	private int guesses = 0;
	private final int MAX_GUESSES = 5;
	private char lastGuess;
	Scanner myScanner = new Scanner(System.in);

	public void run() {
		do {
			displayWord();
			getUserInput();
			checkUserInput();
		} while (isRunning);
	}

	private void displayWord() {
		System.out.println("You have " + (MAX_GUESSES - guesses) + " guesses left.");
		System.out.println(word);
	}

	private void getUserInput() {
		// ask the user to enter a character; get the character as a string
		System.out.print("Enter your guess:");
		String guess = myScanner.nextLine();
		lastGuess = guess.charAt(0);
	}

	private void checkUserInput() {
		word.addGuess(lastGuess);
		if (!word.isCorrectGuess()) {
			guesses++;
		}
		if (guesses >= MAX_GUESSES) {
			System.out.println("You have Lost!");
			System.out.println("The word was: " + word.getChosenWord());
			isRunning = false;
		}
		if (word.isComplete()) {
			System.out.println("You have Won!");
			System.out.println("The word was: " + word.getChosenWord());
			isRunning = false;
		}
	}

	public void close() {
		myScanner.close();
	}

}
