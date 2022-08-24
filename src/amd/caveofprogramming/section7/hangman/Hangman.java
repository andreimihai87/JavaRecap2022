package amd.caveofprogramming.section7.hangman;

import java.util.Scanner;

public class Hangman {

	private boolean isRunning = true;
	private RandomWord word = new RandomWord();
	Scanner myScanner = new Scanner(System.in);

	public void run() {
		do {
			displayWord();
			getUserInput();
//			checkUserInput();
		} while (isRunning);
		myScanner.close();
	}
	
	private void displayWord() {
		System.out.println(word);
	}
	
	private void getUserInput() {
		// ask the user to enter a character; get the character as a string
		System.out.print("Enter your guess:");
		String guess = myScanner.nextLine();
		word.addGuess(guess.charAt(0));
	}
	
	private void checkUserInput() {
	}

}
