package amd.caveofprogramming.section7;

public class Hangman {

	private boolean isRunning = false;
	private RandomWord word = new RandomWord();

	public void run() {

		do {
			displayWord();
			getUserInput();
			checkUserInput();
		} while (isRunning);

	}
	
	private void displayWord() {
		System.out.println(word);
	}
	
	private void getUserInput() {
		System.out.println("getUserInput");
	}
	
	private void checkUserInput() {
		System.out.println("checkUserInput");
	}

}
