package amd.caveofprogramming.section11.game;

import java.util.Random;
import java.util.Scanner;

public class Game {

	private GameItem[] gameItems = { new Rock(), new Paper(), new Scissors() };

	public void run() {
		String[] results = { "Won", "Draw", "Lose" }; 

		System.out.println("Options: 1. Rock , 2. Paper, 3. Scissors");
		System.out.print("Please choose an option: ");
		
		// user choice
		Scanner myScanner = new Scanner(System.in);
		int index1 = myScanner.nextInt();

		// computer choice
		Random randomNr = new Random();
		int index2 = randomNr.nextInt(gameItems.length);
		
		GameItem game1 = gameItems[index1 - 1];
		GameItem game2 = gameItems[index2];
		
		System.out.println("Your choice:\t " + game1.getName());
		System.out.println("Computer choice: " + game2.getName());
		System.out.println("You " + results[1 - game1.compareTo(game2)]);

		myScanner.close();

	}

}
