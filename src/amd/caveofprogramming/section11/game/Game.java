package amd.caveofprogramming.section11.game;

import java.util.Random;

public class Game {

	private GameItem[] gameItems = { new Rock(), new Paper(), new Scissors() };

	public void run() {
		
		System.out.println("Game is running...");
		
		Random randomNr = new Random();
		int index1 = randomNr.nextInt(gameItems.length);
		int index2 = randomNr.nextInt(gameItems.length);
		
		GameItem game1 = gameItems[index1];
		GameItem game2 = gameItems[index2];
		
		System.out.println(game1);
		System.out.println(game2);
		
		System.out.println(game1.compareTo(game2));
		
	}

}
