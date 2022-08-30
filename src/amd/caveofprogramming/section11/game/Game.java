package amd.caveofprogramming.section11.game;

import java.util.Random;
import java.util.Scanner;

public class Game {

	private GameItem[] gameItems = { new Rock(), new Paper(), new Scissors() };

	public void run() {
		int[] score = { 0, 0 };
		String[] results = { "won", "draw", "lose" };

		Scanner myScanner = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.println("Options: 1. Rock , 2. Paper, 3. Scissors");
			System.out.print("Please choose an option: ");

			// user choice
			int index1 = myScanner.nextInt();

			// computer choice
			Random randomNr = new Random();
			int index2 = randomNr.nextInt(gameItems.length);

			GameItem game1 = gameItems[index1 - 1];
			GameItem game2 = gameItems[index2];

			int resultIndex = 1 - game1.compareTo(game2);
			if (resultIndex == 0) {
				score[0]++;
			} else if (resultIndex == 2) {
				score[1]++;
			}
			System.out.println("Your choice:\t " + game1.getName());
			System.out.println("Computer choice: " + game2.getName());
			System.out.printf("You %s round %d \n\n", results[resultIndex], i + 1);
		}
		myScanner.close();
		
		System.out.printf("The final score is: You: %d - Computer: %d\n", score[0], score[1]);
		if (score[0] > score[1]) {
			System.out.println("You won the game!");
		} else if (score[0] == score[1]) {
			System.out.println("You draw the game!");
		} else {
			System.out.println("You lost the game!");
		}

	}

}
