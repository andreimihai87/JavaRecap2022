package amd.caveofprogramming.section18.l200l201;

import java.util.Random;
import java.util.Scanner;

public class Game {

	private Move[] gameItems = Move.values();

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

			Move game1 = gameItems[index1 - 1];
			Move game2 = gameItems[index2];
			
			String result = results[1];
			String roundResultStr = " = ";
			
			if (game1.beats(game2)) {
				score[0]++;
				result = results[0];
				roundResultStr = " beats ";
			}
			if (game2.beats(game1)) {
				score[1]++;
				result = results[2];
				roundResultStr = " doesn't beats ";
			}
			System.out.println(game1 + roundResultStr + game2);
			System.out.printf("You %s round %d \n\n", result, i + 1);
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
